package imagemResolucaoTela;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImagensResolucaoTela extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JLabel lblResolucao;

    public ImagensResolucaoTela() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Toolkit resolucao = Toolkit.getDefaultToolkit();
                Dimension d = resolucao.getScreenSize();
                lblResolucao.setText(d.width + " x " + d.height);
            }
        });
    }

    public static void main(String[] args) {
        ImagensResolucaoTela dialog = new ImagensResolucaoTela();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
