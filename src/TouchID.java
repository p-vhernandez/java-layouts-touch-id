import utils.Utils;

import javax.swing.*;

public class TouchID extends JFrame {

    private final TouchIDUI view;

    public TouchID() {
        this.view = new TouchIDUI(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setAppIcon();
        setUpUI();

        pack();
    }

    private void setAppIcon() {
        setIconImage(Utils.generateImage(this,
                "resources/img/icon_fingerprint.png"));
    }

    private void setUpUI() {
        this.view.initializeUI();
    }
    
}
