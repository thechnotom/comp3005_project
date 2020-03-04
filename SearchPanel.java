import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.ArrayList;

public class SearchPanel extends JPanel {

  SearchPanel () {
    this.setLayout(ViewLibrary.layout);
    JPanel resultsPanel = ViewLibrary.makePanel(ViewLibrary.layout); // List panel
    JPanel toolsPanel = ViewLibrary.makePanel(ViewLibrary.layout);  // Search criteria panel
    ViewLibrary.layout.addLayoutComponent(resultsPanel, ViewLibrary.setConstraints(0, 0));
    ViewLibrary.layout.addLayoutComponent(toolsPanel, ViewLibrary.setConstraints(0, 1, 2, 1));
    
    resultsPanel.setBorder(BorderFactory.createTitledBorder("Results"));
    toolsPanel.setBorder(BorderFactory.createTitledBorder("Tools"));

    // List for all/searched points
    DefaultListModel<Integer> listModel = new DefaultListModel<Integer>();
    JList<Integer> list = new JList<Integer>(listModel);
    list.setFixedCellWidth(200);
    for (int i = 0; i < 5; ++i) {
      listModel.addElement(i);
    }
    list.setVisibleRowCount(10);
    JScrollPane allScrollPane = new JScrollPane(list);
    ViewLibrary.layout.addLayoutComponent(allScrollPane, ViewLibrary.setConstraints(0, 0, 2, 1));
    resultsPanel.add(allScrollPane);

    // Result count
    JLabel resultCount = new JLabel("Results: " + listModel.getSize());
    resultCount.setFont(ViewLibrary.font);
    ViewLibrary.layout.addLayoutComponent(resultCount, ViewLibrary.setConstraints(1, 1, 2, 1));
    resultsPanel.add(resultCount);

    // Search bar
    JTextField searchBar = new JTextField(10);
    ViewLibrary.layout.addLayoutComponent(searchBar, ViewLibrary.setConstraints(0, 0, 2, 1));
    toolsPanel.add(searchBar);

    // Search
    JButton search = new JButton("Search");
    search.setFont(ViewLibrary.font);
    search.setMargin(new Insets(0, 0, 0, 0));
    ViewLibrary.layout.addLayoutComponent(search, ViewLibrary.setConstraints(0, 1, 1, 1, 1, 5));
    toolsPanel.add(search);

    // Clear search
    JButton clearSearch = new JButton("Clear Search");
    clearSearch.setFont(ViewLibrary.font);
    clearSearch.setMargin(new Insets(0, 0, 0, 0));
    ViewLibrary.layout.addLayoutComponent(clearSearch, ViewLibrary.setConstraints(1, 1, 1, 1, 1, 5));
    toolsPanel.add(clearSearch);


    search.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Searching: " + searchBar.getText());
        /*
        listModel.removeAllElements();  // Empty the list
        ArrayList<Point> searchResults = ViewLibrary.storage.searchPointsName(searchBar.getText());
        for (Point point : searchResults) {
          listModel.addElement(point);
        }
        resultCount.setText("Results (\"" + searchBar.getText() + "\"): " + listModel.getSize());
        */
      }
    });

    clearSearch.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        searchBar.setText("");  // Clears the search bar
        listModel.removeAllElements();  // Empty the point list
        for (int i = 0; i < 5; ++i) {
          listModel.addElement(i);
        }
        list.clearSelection();
        resultCount.setText("Results: " + listModel.getSize());
      }
    });

    this.add(resultsPanel);
    this.add(toolsPanel);
  }

}