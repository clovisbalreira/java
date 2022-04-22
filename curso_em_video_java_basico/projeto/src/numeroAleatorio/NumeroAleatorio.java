package numeroAleatorio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumeroAleatorio extends JDialog {
    private JPanel contentPane;
    private JButton btnPalpite;
    private JSpinner txtValor;
    private JLabel lblResposta;

    public NumeroAleatorio() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnPalpite);
        btnPalpite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double adivinhar = 1 + Math.random() * ( 6 - 1 );
                int valor = Integer.parseInt(txtValor.getValue().toString());
                String resposta = (valor == adivinhar) ? "<strongAcertou !!" : "Errou pensei em 5";
                lblResposta.setFont(new Font("Ariel Black", Font.PLAIN, 22));
                lblResposta.setText(resposta);
            }
        });
    }

    public static void main(String[] args) {
        NumeroAleatorio dialog = new NumeroAleatorio();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
