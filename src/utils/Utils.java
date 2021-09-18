package utils;

import javax.swing.*;
import java.awt.*;

public class Utils {

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
