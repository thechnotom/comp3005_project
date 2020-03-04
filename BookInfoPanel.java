import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.ArrayList;

public class BookInfoPanel extends JPanel {

  BookInfoPanel () {
    this.setLayout(ViewLibrary.layout);

    // Result count
    JLabel title = new JLabel("Title: ");
    title.setFont(ViewLibrary.font);
    ViewLibrary.layout.addLayoutComponent(title, ViewLibrary.setConstraints(0, 0, 2, 1));

    JLabel author = new JLabel("Author: ");
    author.setFont(ViewLibrary.font);
    ViewLibrary.layout.addLayoutComponent(author, ViewLibrary.setConstraints(0, 1, 2, 1));

    JLabel isbn = new JLabel("ISBN: ");
    isbn.setFont(ViewLibrary.font);
    ViewLibrary.layout.addLayoutComponent(isbn, ViewLibrary.setConstraints(0, 2, 2, 1));

    JLabel genre = new JLabel("Genre: ");
    genre.setFont(ViewLibrary.font);
    ViewLibrary.layout.addLayoutComponent(genre, ViewLibrary.setConstraints(0, 3, 2, 1));

    this.add(title);
    this.add(author);
    this.add(isbn);
    this.add(genre);
  }

}