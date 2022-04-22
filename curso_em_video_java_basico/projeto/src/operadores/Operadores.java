package operadores;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operadores extends JDialog {
    private JPanel contentPane;
    private JButton btnDividir;
    private JTextField txtNumerador;
    private JTextField txtDenominador;
    private JLabel lblDivisao;
    private JLabel lblResto;

    public Operadores() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnDividir);
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numerador = Integer.parseInt(txtNumerador.getText());
                int denomerador = Integer.parseInt(txtDenominador.getText());
                float divisao = numerador / denomerador;
                float resto = numerador % denomerador;
                lblDivisao.setText(Float.toString(divisao));
                lblResto.setText(Float.toString(resto));
            }
        });
    }

    public static void main(String[] args) {
        Operadores dialog = new Operadores();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
