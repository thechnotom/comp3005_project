public class Main {

    public static void main(String [] args) {
      if (args.length != 3) {
        System.out.println("Usage: java Main <DB name> <username> <password>");
        System.out.println("Example: java Main postgres myUsername myPassword");
        System.out.println("Note that the \"DB name\" is appended on to \"jdbc:postgresql://localhost:5432/\"");
        System.exit(1);
      }
      System.out.println("DB: " + args[0] + ", user: " + args[1] + ", password: " + args[2]);
      new UserPanel("Bookstore (User)", args[0], args[1], args[2]);
    }
  }