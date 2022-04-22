package imagensLinguagem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class ImagensLinguagem extends JDialog {
    private JPanel contentPane;
    private JButton btnBotao;
    private JLabel lblMensagem;

    public ImagensLinguagem() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnBotao);
        btnBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Locale local = Locale.getDefault();
                lblMensagem.setText(local.getDisplayLanguage());
            }
        });
    }

    public static void main(String[] args) {
        ImagensLinguagem dialog = new ImagensLinguagem();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
