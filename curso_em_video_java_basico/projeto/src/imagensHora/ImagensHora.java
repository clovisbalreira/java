package imagensHora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class ImagensHora extends JDialog {
    private JPanel contentPane;
    private JButton btnBotao;
    private JLabel lblHora;

    public ImagensHora() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnBotao);
        btnBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date relogio = new Date();
                lblHora.setText(relogio.toString());
            }
        });
    }

    public static void main(String[] args) {
        ImagensHora dialog = new ImagensHora();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
