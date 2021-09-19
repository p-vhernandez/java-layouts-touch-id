package components;

import utils.Utils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;

public class MainPanel extends JPanel {

    private final JTextArea lblInfo;

    private final JPanel fingerprintPanel;
    private final JPanel checkBoxPanel;
    private final ArrayList<String> checkBoxList;

    public MainPanel() {
        this.lblInfo = new JTextArea("Touch ID allows you to utilize your digital fingerprint to " +
                "unlock your Mac and make purchases with Apple Pay, the iTunes Store, the App Store and Apple Books");
        this.fingerprintPanel = new JPanel();
        this.checkBoxPanel = new JPanel();
        this.checkBoxList = new ArrayList<>();

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setUpUI();
    }

    private void setUpUI() {
        setInfoText();
        setFingerprints();
        setCheckboxList();
    }

    private void setInfoText() {
        lblInfo.setEditable(false);
        lblInfo.setLineWrap(true);
        lblInfo.setWrapStyleWord(true);
        lblInfo.setBorder(new EmptyBorder(20, 20, 20, 20));
        lblInfo.setMaximumSize(new Dimension(Utils.getMainPanelWidth(),
                Utils.getMainLabelHeight()));

        add(lblInfo);
    }

    private void setFingerprints() {
        fingerprintPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel fingerprintLabel = Utils.generateLabelWithIcon("Fingerprint 1",
                new ImageIcon(Utils.generateImage(this, "../resources/img/icon_fingerprint.png")));

        JLabel addFingerprintLabel = Utils.generateLabelWithIcon("Add fingerprint",
                new ImageIcon(Utils.generateImage(this, "../resources/img/add.png")));

        fingerprintLabel.setBorder(new EmptyBorder(0, 60, 0, 0));
        addFingerprintLabel.setBorder(new EmptyBorder(0, 40, 0, 0));
        fingerprintPanel.add(fingerprintLabel, BorderLayout.WEST);
        fingerprintPanel.add(addFingerprintLabel, BorderLayout.WEST);

        fingerprintPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        fingerprintPanel.setMaximumSize(new Dimension(Utils.getMainPanelWidth(),
                Utils.getFingerprintPanelHeight()));
        fingerprintPanel.setPreferredSize(fingerprintPanel.getMaximumSize());

        add(fingerprintPanel);
    }

    private void setCheckboxList() {
        checkBoxPanel.setLayout(new BoxLayout(checkBoxPanel, BoxLayout.Y_AXIS));
        checkBoxList.add("Unlock my Mac");
        checkBoxList.add("Apple Pay");
        checkBoxList.add("iTunes Store, App Store and Apple Books");
        checkBoxList.add("Automatically fill passwords");

        JPanel sectionLabelPanel = new JPanel();
        sectionLabelPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel checkBoxLabel = new JLabel("Use my fingerprint for:");
        sectionLabelPanel.add(checkBoxLabel);
        checkBoxPanel.add(sectionLabelPanel);

        for (String text : checkBoxList) {
            Checkbox checkbox = new Checkbox(text);
            checkbox.setState(true);
            checkBoxPanel.add(checkbox);
        }

        checkBoxPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        add(checkBoxPanel);
    }

}
