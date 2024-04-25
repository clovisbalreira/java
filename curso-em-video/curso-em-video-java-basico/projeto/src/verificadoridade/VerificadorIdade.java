package verificadoridade;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class VerificadorIdade extends JDialog {
    private JPanel contentPane;
    private JButton btncalc;
    private JTextField txtAno;
    private JLabel lblIdade;
    private JLabel lblSituacao;

    public VerificadorIdade() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btncalc);
        btncalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar anoAtual = Calendar.getInstance();

                int ano = Integer.parseInt(txtAno.getText());
                int idade = anoAtual.get(Calendar.YEAR) - ano;
                lblIdade.setText(Integer.toString(idade));
                String situacao = (idade >= 18)? "Maior de Idade" : "Menor de Idade";
                lblSituacao.setText(situacao);
            }
        });
    }

    public static void main(String[] args) {
        VerificadorIdade dialog = new VerificadorIdade();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
