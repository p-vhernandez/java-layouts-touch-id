package components;

import utils.PlaceholderTextField;

import javax.swing.*;
import java.awt.*;

public class SearchBar extends JPanel {

    private final JLabel icon;
    private final PlaceholderTextField searchField;

    public SearchBar() {
        this.searchField = new PlaceholderTextField(50);
        this.icon = new JLabel();

        setUpSearchIcon();
        setUpSearchBar();
    }

    private void setUpSearchIcon() {
        Image img = Toolkit.getDefaultToolkit()
                .getImage(getClass().getResource("../resources/img/search.png"));
        icon.setIcon(new ImageIcon(img.getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        icon.setPreferredSize(new Dimension(40, 40));

        add(icon, BorderLayout.WEST);
    }

    private void setUpSearchBar() {
        setBackground(Color.white);
        setPreferredSize(new Dimension(250, 50));
        setVisible(true);

        searchField.setPreferredSize(new Dimension(250, 35));
        searchField.setPlaceholder("Search...");
        add(searchField);
    }

}
