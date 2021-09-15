package components;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class FingerprintPanel extends JPanel {

    private final JLabel fingerprint;

    public FingerprintPanel() {
        this.fingerprint = new JLabel();

        setUpUI();
    }

    private void setUpUI() {
        setPreferredSize(new Dimension(200, 0));
        setBackground(Color.white);

        addFingerPrintIcon();
    }

    private void addFingerPrintIcon() {
        fingerprint.setIcon(getFingerprintIcon());
        fingerprint.setPreferredSize(new Dimension(100, 100));
        fingerprint.setBorder(new EmptyBorder(10, 10, 10, 10));

        add(fingerprint, BorderLayout.CENTER);
    }

    private ImageIcon getFingerprintIcon() {
        try {
            Image imgFingerprint = Toolkit.getDefaultToolkit()
                    .getImage(getClass().getResource("../resources/img/img_fingerprint.png"));
            return new ImageIcon(imgFingerprint.getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
