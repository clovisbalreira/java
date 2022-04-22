package programavotacao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Scanner;

public class ProgramaVotacao extends JDialog {
    private JPanel contentPane;
    private JButton btnVotar;
    private JTextField txtAno;
    private JLabel lblResultado;
    private JLabel lblIdade;

    public ProgramaVotacao() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnVotar);
        btnVotar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar ano = Calendar.getInstance();
                int nascimento = Integer.parseInt(txtAno.getText());
                int idade = ano.get(Calendar.YEAR) - nascimento;
                lblIdade.setText("Você tem " + idade + " anos.");
                if(idade < 16){
                    lblResultado.setText("Você ainda não precisa votar");
                }else if (idade >= 18 && idade < 70){
                    lblResultado.setText("Seu voto é obrigadorio.");
                }else{
                    lblResultado.setText("Seu voto é opcional.");
                }
            }
        });
    }

    public static void main(String[] args) {
        ProgramaVotacao dialog = new ProgramaVotacao();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
