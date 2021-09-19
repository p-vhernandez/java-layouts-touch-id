package utils;

import javax.swing.*;
import java.awt.*;

public class Utils {

    private static final int SCREEN_WIDTH = 1000;
    private static final int SCREEN_HEIGHT = 500;
    private static final int TOOLBAR_HEIGHT = 60;
    private static final int SEARCHBAR_WIDTH = 250;
    private static final int SEARCHBAR_HEIGHT = 50;
    private static final int SEARCH_FIELD_HEIGHT = 35;
    private static final int FINGERPRINT_PANEL_WIDTH = 200;
    private static final int FINGERPRINT_PANEL_HEIGHT = 400;
    private static final int MAIN_LABEL_HEIGHT = 100;

    private static final int IMAGE_ICON_SCALE = 25;
    private static final int MENU_SCALE = 40;
    private static final int FINGERPRINT_IMAGE_SCALE = 100;
    private static final int FINGERPRINT_ICON_SCALE = 80;

    private static final String APP_NAME = "Touch ID";
    private static final String TXT_SEARCH = "Search...";

    public static int getScreenWidth() {
        return SCREEN_WIDTH;
    }

    public static int getScreenHeight() {
        return SCREEN_HEIGHT;
    }

    public static int getToolbarHeight() {
        return TOOLBAR_HEIGHT;
    }

    public static int getSearchbarWidth() {
        return SEARCHBAR_WIDTH;
    }

    public static int getSearchbarHeight() {
        return SEARCHBAR_HEIGHT;
    }

    public static int getSearchFieldHeight() {
        return SEARCH_FIELD_HEIGHT;
    }

    public static int getFingerprintPanelWidth() {
        return FINGERPRINT_PANEL_WIDTH;
    }

    public static int getFingerprintPanelHeight() {
        return FINGERPRINT_PANEL_HEIGHT;
    }

    public static int getMainPanelWidth() {
        return SCREEN_WIDTH - FINGERPRINT_PANEL_WIDTH;
    }

    public static int getMainLabelHeight() {
        return MAIN_LABEL_HEIGHT;
    }

    public static int getImageIconScale() {
        return IMAGE_ICON_SCALE;
    }

    public static int getMenuScale() {
        return MENU_SCALE;
    }

    public static int getFingerprintImageScale() {
        return FINGERPRINT_IMAGE_SCALE;
    }

    public static int getFingerprintIconScale() {
        return FINGERPRINT_ICON_SCALE;
    }

    public static String getAppName() {
        return APP_NAME;
    }

    public static String getTxtSearch() {
        return TXT_SEARCH;
    }

    public static Image generateImage(Object object, String directory) {
        return Toolkit.getDefaultToolkit()
                .getImage(object.getClass().getResource(directory));
    }

    public static JLabel generateLabelWithIcon(String name, ImageIcon icon) {
        JLabel label = new JLabel(name, icon, SwingConstants.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);

        return label;
    }

}
