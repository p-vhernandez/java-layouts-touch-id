import javax.swing.*;
import java.awt.*;

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
        Image appIcon = Toolkit.getDefaultToolkit()
                .getImage(getClass().getResource("resources/img/icon_fingerprint.png"));
        setIconImage(appIcon);
    }

    private void setUpUI() {
        this.view.initializeUI();
    }

}
