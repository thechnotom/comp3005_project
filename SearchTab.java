import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.ArrayList;

public class SearchTab extends JPanel {

  SearchTab () {
    this.setLayout(ViewLibrary.layout);

    SearchPanel searchPanel = new SearchPanel();
    searchPanel.setBorder(BorderFactory.createTitledBorder("Search"));

    BookInfoPanel bookInfoPanel = new BookInfoPanel();
    bookInfoPanel.setBorder(BorderFactory.createTitledBorder("Book Information"));

    this.add(searchPanel);
    this.add(bookInfoPanel);
  }

}