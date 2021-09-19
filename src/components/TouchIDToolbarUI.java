package components;

import utils.Utils;

import javax.swing.*;
import java.awt.*;

public class TouchIDToolbarUI {

    private final TouchIDToolbar toolbar;

    public TouchIDToolbarUI(TouchIDToolbar toolbar) {
        this.toolbar = toolbar;
    }

    public void initializeUI() {
        toolbar.setPreferredSize(new Dimension(Utils.getScreenWidth(),
                Utils.getToolbarHeight()));

        setUpNavigationButtons();
        setUpMenuButton();
        setUpSearchBar();
    }

    private void setUpNavigationButtons() {
        JButton btnPrevious = createNavigationButton("back", String.valueOf(JToolBar.PREVIOUS),
                "Back to previous item", "Previous");
        JButton btnNext = createNavigationButton("next", String.valueOf(JToolBar.NEXT),
                "Up to next item", "Next");

        btnPrevious.setEnabled(true);
        btnNext.setEnabled(false);

        toolbar.add(btnPrevious);
        toolbar.add(btnNext);
    }

    private void setUpMenuButton() {
        JButton menu = new JButton();
        menu.setEnabled(true);

        Image image = Utils.generateImage(this, "../resources/img/menu.png");
        ImageIcon img = new ImageIcon(image.getScaledInstance(Utils.getImageIconScale(),
                Utils.getImageIconScale(), Image.SCALE_SMOOTH), "Menu");

        menu.setIcon(img);
        menu.setPreferredSize(new Dimension(Utils.getMenuScale(), Utils.getMenuScale()));

        toolbar.add(menu);
    }

    private JButton createNavigationButton(String imageName, String actionCommand,
                                           String toolTipText, String altText) {
        JButton button = new JButton();
        String imgLocation = "../resources/img/" + imageName + ".png";
        Image image = Utils.generateImage(this, imgLocation);

        button.setActionCommand(actionCommand);
        button.setToolTipText(toolTipText);

        if (image != null) {                      // image found
            ImageIcon img = new ImageIcon(image, altText);
            button.setIcon(img);
        } else {                                     // no image found
            button.setText(altText);
            System.err.println("Resource not found: " + imgLocation);
        }

        button.setPreferredSize(new Dimension(Utils.getMenuScale(), Utils.getMenuScale()));
        button.setMaximumSize(button.getPreferredSize());

        return button;
    }

    private void setUpSearchBar() {
        SearchBar searchBar = new SearchBar();
        toolbar.add(searchBar);
    }

}
