package calculadorIdade;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class CalculadoraIdade extends JDialog {
    private JPanel contentPane;
    private JButton btnSoma;
    private JLabel lblResultado;
    private JSpinner txtAno;
    private JLabel txtAtual;

    public CalculadoraIdade() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnSoma);
        Calendar ano = Calendar.getInstance();
        txtAtual.setText(String.valueOf(ano.get(Calendar.YEAR)));
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int nascimento = Integer.parseInt(txtAno.getValue().toString());
                int idade = ano.get(Calendar.YEAR) - nascimento;
                lblResultado.setText(Integer.toString(idade));
            }
        });
    }

    public static void main(String[] args) {
        CalculadoraIdade dialog = new CalculadoraIdade();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }


}
