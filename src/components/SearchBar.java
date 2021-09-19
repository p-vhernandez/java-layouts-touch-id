package components;

import utils.PlaceholderTextField;
import utils.Utils;

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
        Image img = Utils.generateImage(this, "../resources/img/search.png");
        icon.setIcon(new ImageIcon(img.getScaledInstance(Utils.getImageIconScale(),
                Utils.getImageIconScale(), Image.SCALE_SMOOTH)));
        icon.setPreferredSize(new Dimension(Utils.getMenuScale(), Utils.getMenuScale()));

        add(icon, BorderLayout.WEST);
    }

    private void setUpSearchBar() {
        setPreferredSize(new Dimension(Utils.getSearchbarWidth(),
                Utils.getSearchbarHeight()));
        setVisible(true);

        searchField.setPreferredSize(new Dimension(Utils.getSearchbarWidth(),
                Utils.getSearchFieldHeight()));
        searchField.setPlaceholder(Utils.getTxtSearch());
        add(searchField);
    }

}
