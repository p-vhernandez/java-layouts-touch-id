import components.FingerprintPanel;
import components.MainPanel;
import components.TouchIDToolbar;
import utils.Utils;

import java.awt.*;

public class TouchIDUI {

    private final TouchID touchID;
    private final BorderLayout touchIDLayout;

    public TouchIDUI(TouchID touchID) {
        this.touchID = touchID;
        this.touchIDLayout = new BorderLayout();
    }

    public void initializeUI() {
        touchID.setTitle(Utils.getAppName());
        touchID.setPreferredSize(new Dimension(Utils.getScreenWidth(),
                Utils.getScreenHeight()));
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
