package components;

import javax.swing.*;

public class TouchIDToolbar extends JToolBar {

    private final TouchIDToolbarUI view;

    public TouchIDToolbar () {
        this.view = new TouchIDToolbarUI(this);

        setFloatable(false);
        setUpUI();
    }

    private void setUpUI() {
        this.view.initializeUI();
    }

}
