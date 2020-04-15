import javax.swing.*;

public class UserPanel extends JFrame {

  UserPanel (String title, String dbName, String dbUser, String dbPassword) {
    super(title);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(initFrame(dbName, dbUser, dbPassword));

    this.pack();
    this.setVisible(true);
    this.setResizable(false);
  }

  private JPanel initFrame(String dbName, String dbUser, String dbPassword) {
    JTabbedPane pane = new JTabbedPane();
    JPanel master = ViewLibrary.makePanel(ViewLibrary.layout);
    pane.addTab("Search", new SearchTab(dbName, dbUser, dbPassword));
    //pane.addTab("Track", new TrackTab());
    ViewLibrary.layout.addLayoutComponent(pane, ViewLibrary.setConstraints(0, 0));
    master.add(pane);
    return master;
  }

}