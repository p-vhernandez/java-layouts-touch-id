import components.FingerprintPanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class TouchIDUI {

    private final TouchID touchID;
    private final BorderLayout touchIDLayout;

    private FingerprintPanel fingerprintPanel;

    public TouchIDUI(TouchID touchID) {
        this.touchID = touchID;
        this.touchIDLayout = new BorderLayout();
    }

    public void initializeUI() {
        touchID.setTitle("Touch ID");
        touchID.setPreferredSize(new Dimension(1000, 500));
        touchID.setLayout(touchIDLayout);

        setUpFingerprintPanel();
    }

    private void setUpFingerprintPanel() {
        fingerprintPanel = new FingerprintPanel();
        touchID.add(fingerprintPanel, BorderLayout.WEST);
    }

}
