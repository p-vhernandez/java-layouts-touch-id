import components.FingerprintPanel;
import components.MainPanel;
import components.TouchIDToolbar;

import java.awt.*;

public class TouchIDUI {

    private final TouchID touchID;
    private final BorderLayout touchIDLayout;

    public TouchIDUI(TouchID touchID) {
        this.touchID = touchID;
        this.touchIDLayout = new BorderLayout();
    }

    public void initializeUI() {
        touchID.setTitle("Touch ID");
        touchID.setPreferredSize(new Dimension(1000, 500));
        touchID.setLayout(touchIDLayout);

        setUpToolBar();
        setUpFingerprintPanel();
        setUpMainPanel();
    }

    private void setUpToolBar() {
        TouchIDToolbar toolbar = new TouchIDToolbar();
        touchID.add(toolbar, BorderLayout.NORTH);
    }

    private void setUpFingerprintPanel() {
        FingerprintPanel fingerprintPanel = new FingerprintPanel();
        touchID.add(fingerprintPanel, BorderLayout.WEST);
    }

    private void setUpMainPanel() {
        MainPanel mainPanel = new MainPanel();
        touchID.add(mainPanel, BorderLayout.CENTER);
    }

}
