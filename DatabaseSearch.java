import java.sql.*;
import java.util.ArrayList;

public class DatabaseSearch {
    public static ArrayList<String> getBooksByTitle (String title, String dbName, String userID, String password) {
        ArrayList<String> books = new ArrayList<String>();

        System.out.println("Attempting to connect to the database...");

        // The following code is based heavily on the JDBC example on cuLearn
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbName, userID, password);
            Statement statement = connection.createStatement();
			)
		{
            ResultSet resultSet = statement.executeQuery("select book.name, book.price, author.name"
			+ "from book, author, written_by"
			+ "where book.name = '" + title + "' and written_by.ISBN = book.ISBN and written_by.author_ID = author.author_ID");
            
			while (resultSet.next()) {
                books.add(resultSet.getString("book.name") + " - $"
                + resultSet.getString("book.price") + " - "
                + resultSet.getString("author.name"));
            }

            return books;
 
        } catch (Exception sqle) {
            System.out.println("DB Connection/Search Exception: " + sqle);
        }

        return null;
    }
}