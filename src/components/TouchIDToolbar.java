package components;

import utils.PlaceholderTextField;

import javax.swing.*;
import java.awt.*;

public class TouchIDToolbar extends JToolBar {

    public TouchIDToolbar () {
        setFloatable(false);
        setUpUI();
    }

    private void setUpUI() {
        setPreferredSize(new Dimension(0, 40));
        setUpNavigationButtons();
        setUpSearchBar();
    }

    private void setUpNavigationButtons() {
        JButton btnPrevious = createNavigationButton("back", String.valueOf(PREVIOUS),
                "Back to previous item", "Previous");
        JButton btnNext = createNavigationButton("next", String.valueOf(NEXT),
                "Up to next item", "Next");

        btnPrevious.setEnabled(true);
        btnNext.setEnabled(false);

        add(btnPrevious);
        add(btnNext);
    }

    private JButton createNavigationButton(String imageName, String actionCommand,
                                        String toolTipText, String altText) {
        JButton button = new JButton();

        String imgLocation = "../resources/img/" + imageName + ".png";
        Image image = Toolkit.getDefaultToolkit()
                .getImage(getClass().getResource(imgLocation));

        button.setActionCommand(actionCommand);
        button.setToolTipText(toolTipText);

        if (image != null) {                      // image found
            ImageIcon img = new ImageIcon(image, altText);
            button.setIcon(img);
        } else {                                     // no image found
            button.setText(altText);
            System.err.println("Resource not found: " + imgLocation);
        }

        button.setPreferredSize(new Dimension(40, 40));

        return button;
    }

    private void setUpSearchBar() {
        /*PlaceholderTextField searchBar = new PlaceholderTextField();
        searchBar.setPlaceholder("Search...");
        searchBar.setPreferredSize(new Dimension(250, 40));
        searchBar.setMaximumSize(new Dimension(250, 40));*/

        SearchBar searchBar = new SearchBar();
        add(searchBar);
    }

}
