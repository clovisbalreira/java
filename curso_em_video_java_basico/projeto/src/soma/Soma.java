package soma;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Soma extends JDialog {
    private JPanel contentPane;
    private JButton btnSoma;
    private JTextField txtN1;
    private JTextField txtN2;
    private JLabel lblSoma;

    public Soma() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnSoma);
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                int soma = n1 + n2;
                lblSoma.setText(Integer.toString(soma));
            }
        });
    }

    public static void main(String[] args) {
        Soma dialog = new Soma();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
