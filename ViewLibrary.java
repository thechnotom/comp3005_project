import javax.swing.*;
import java.awt.*;

public class ViewLibrary {

  public static GridBagLayout layout = new GridBagLayout();
  public static Font font = new Font("Arial", Font.PLAIN, 12);

  public static Point storedPoint = null;
  public static JLabel storedLabel = new JLabel("Storage: N/A");

  ViewLibrary () {
    // do nothing
  }

  public static JPanel makePanel (GridBagLayout layout) {
    JPanel panel = new JPanel ();
    panel.setLayout(layout);
    return panel;
  }

  public static GridBagConstraints setConstraints (int gridx, int gridy, int gridwidth, int gridheight, int horSpace, int vertSpace, double weightx, double weighty) {
    GridBagConstraints constraints = new GridBagConstraints();
    constraints.gridx = gridx;
    constraints.gridy = gridy;
    constraints.gridwidth = gridwidth;
    constraints.gridheight = gridheight;
    constraints.insets = new Insets(vertSpace, horSpace, vertSpace, horSpace);
    constraints.weightx = weightx;
    constraints.weighty = weighty;
    return constraints;
  }

  public static GridBagConstraints setConstraints (int gridx, int gridy, int gridwidth, int gridheight, int horSpace, int vertSpace) {
    return setConstraints (gridx, gridy, gridwidth, gridheight, horSpace, vertSpace, 0, 0);
  }

  public static GridBagConstraints setConstraints (int gridx, int gridy, int gridwidth, int gridheight) {
    return setConstraints(gridx, gridy, gridwidth, gridheight, 5, 5);
  }

  public static GridBagConstraints setConstraints (int gridx, int gridy) {
    return setConstraints(gridx, gridy, 1, 1, 5, 5);
  }

}