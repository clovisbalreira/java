package calcularFactorial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularFactorial extends JDialog {
    private JPanel contentPane;
    private JButton btnCalcular;
    private JSpinner splNumero;
    private JLabel lblResultado;

    public CalcularFactorial() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnCalcular);
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(splNumero.getValue().toString());
                Factorial f = new Factorial();
                f.setValor(n);
                lblResultado.setText(f.getFormula()+Integer.toString(f.getFatorial()));
            }
        });
    }

    public static void main(String[] args) {
        CalcularFactorial dialog = new CalcularFactorial();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
