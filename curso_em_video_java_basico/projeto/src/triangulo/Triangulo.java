package triangulo;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Triangulo extends JDialog {
    private JPanel contentPane;
    private JButton btnVerificar;
    private JSlider slda;
    private JSlider sldb;
    private JSlider sldc;
    private JPanel painel;
    private JLabel lblStatus;
    private JLabel lblResposta;
    private JLabel lblA;
    private JLabel lblB;
    private JLabel lblC;

    public Triangulo() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnVerificar);
        painel.setVisible(false);
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = slda.getValue();
                int b = sldb.getValue();
                int c = sldc.getValue();
                if(a<b+c && b<a+c && c<b+c){
                    lblStatus.setText("Formam um triângulo");
                    if(a == b && b == c){
                        lblResposta.setText("equilatero");
                    }else if(a!= b && b!=c && a!=c){
                        lblResposta.setText("escaleno");
                    }else{
                        lblResposta.setText("Isosceles");
                    }
                }else{
                    lblStatus.setText("Não forma um triângulo");
                    lblResposta.setText("-------");
                }
                painel.setVisible(true);
            }
        });
        slda.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblA.setText(Integer.toString(slda.getValue()));
            }
        });
        sldb.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblB.setText(Integer.toString(sldb.getValue()));
            }
        });
        sldc.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblC.setText(Integer.toString(sldc.getValue()));
            }
        });
    }

    public static void main(String[] args) {
        Triangulo dialog = new Triangulo();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
