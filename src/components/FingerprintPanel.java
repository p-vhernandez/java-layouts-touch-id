package components;

import javax.swing.*;

public class FingerprintPanel extends JPanel {

    private final FingerprintPanelUI view;

    public FingerprintPanel() {
        this.view = new FingerprintPanelUI(this);

        setUpUI();
    }

    private void setUpUI() {
        this.view.initializeUI();
    }

}
