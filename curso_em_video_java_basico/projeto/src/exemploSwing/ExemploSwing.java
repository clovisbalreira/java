package exemploSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploSwing extends JDialog {
    private JPanel contentPane;
    private JButton btlClick;
    private JLabel lblMensagem;

    public ExemploSwing() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btlClick);
        btlClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMensagem.setText("Olá Mundo!");
            }
        });
    }

    public static void main(String[] args) {
        ExemploSwing dialog = new ExemploSwing();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
