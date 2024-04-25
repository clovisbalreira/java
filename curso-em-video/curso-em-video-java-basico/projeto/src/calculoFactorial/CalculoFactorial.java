package calculoFactorial;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CalculoFactorial extends JDialog {
    private JPanel contentPane;
    private JSpinner spnTrocar;
    private JLabel lblResultado;
    private JLabel lblCalculo;
    private JTextArea txtCalculo;

    public CalculoFactorial() {
        setContentPane(contentPane);
        setModal(true);
        spnTrocar.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int valor = Integer.parseInt(spnTrocar.getValue().toString());
                int factorial = 1;
                int c = valor;
                String calculo = "";
                while (c >= 1){
                    factorial *= c;
                    int calc = c * valor;
                    calculo += Integer.toString(c) + " X " + Integer.toString(valor) + " = " + Integer.toString(calc) + "\n" ;
                    c--;
                }
                lblResultado.setText(Integer.toString(factorial));
                txtCalculo.setText(calculo);
            }
        });
    }

    public static void main(String[] args) {
        CalculoFactorial dialog = new CalculoFactorial();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
