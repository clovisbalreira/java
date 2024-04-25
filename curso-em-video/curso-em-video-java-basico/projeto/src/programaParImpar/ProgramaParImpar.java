package programaParImpar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramaParImpar extends JDialog {
    private JPanel contentPane;
    private JButton btnVerificar;
    private JLabel lblResultado;
    private JSpinner txtValor;

    public ProgramaParImpar() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnVerificar);
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valor = Integer.parseInt(txtValor.getValue().toString());
                if(valor%2 == 0){
                    lblResultado.setText("Par");
                }else{
                    lblResultado.setText("Impar");
                }
            }
        });
    }

    public static void main(String[] args) {
        ProgramaParImpar dialog = new ProgramaParImpar();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
