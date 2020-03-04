import javax.swing.*;

public class UserPanel extends JFrame {

  UserPanel (String title) {
    super(title);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(initFrame());

    this.pack();
    this.setVisible(true);
    this.setResizable(false);
  }

  private JPanel initFrame() {
    JTabbedPane pane = new JTabbedPane();
    JPanel master = ViewLibrary.makePanel(ViewLibrary.layout);
    pane.addTab("Search", new SearchTab());
    //pane.addTab("Track", new TrackTab());
    ViewLibrary.layout.addLayoutComponent(pane, ViewLibrary.setConstraints(0, 0));
    master.add(pane);
    return master;
  }

}