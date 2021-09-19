package components;

import javax.swing.*;

public class MainPanel extends JPanel {

    private final MainPanelUI view;

    public MainPanel() {
        this.view = new MainPanelUI(this);

        setUpUI();
    }

    private void setUpUI() {
        this.view.initializeUI();
    }

}
