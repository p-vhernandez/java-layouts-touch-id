package components;

import utils.Utils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class FingerprintPanelUI {

    private final FingerprintPanel fingerprintPanel;
    private final JLabel fingerprint;

    public FingerprintPanelUI(FingerprintPanel fingerprintPanel) {
        this.fingerprintPanel = fingerprintPanel;
        this.fingerprint = new JLabel();
    }

    public void initializeUI() {
        fingerprintPanel.setPreferredSize(new Dimension(Utils.getFingerprintPanelWidth(),
                Utils.getScreenHeight()));
        fingerprintPanel.setBackground(Color.white);

        addFingerPrintIcon();
    }

    private void addFingerPrintIcon() {
        fingerprint.setIcon(getFingerprintIcon());
        fingerprint.setPreferredSize(new Dimension(Utils.getFingerprintImageScale(),
                Utils.getFingerprintImageScale()));
        fingerprint.setBorder(new EmptyBorder(10, 10, 10, 10));

        fingerprintPanel.add(fingerprint, BorderLayout.CENTER);
    }

    private ImageIcon getFingerprintIcon() {
        try {
            Image imgFingerprint = Utils.generateImage(this, "../resources/img/img_fingerprint.png");
            return new ImageIcon(imgFingerprint.getScaledInstance(Utils.getFingerprintIconScale(),
                    Utils.getFingerprintIconScale(), Image.SCALE_SMOOTH));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
