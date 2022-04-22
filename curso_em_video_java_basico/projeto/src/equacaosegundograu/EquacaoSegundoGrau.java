package equacaosegundograu;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EquacaoSegundoGrau extends JDialog {
    private JPanel contentPane;
    private JButton btlCalc;
    private JSpinner txtA;
    private JSpinner txtB;
    private JSpinner txtC;
    private JLabel lblB;
    private JLabel lblA;
    private JLabel lblC;
    private JPanel painel;
    private JLabel lblDelta;
    private JLabel lblRaiz;

    public EquacaoSegundoGrau() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btlCalc);
        painel.setVisible(false);
        txtA.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblA.setText(txtA.getValue().toString());
            }
        });
        txtB.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblB.setText(txtB.getValue().toString());
            }
        });
        txtC.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblC.setText(txtC.getValue().toString());
            }
        });
        btlCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtA.getValue().toString());
                int b = Integer.parseInt(txtB.getValue().toString());
                int c = Integer.parseInt(txtC.getValue().toString());
                double delta = Math.pow(b,2) - 4 * a * c;
                lblDelta.setText(String.format("%.1f",delta));
                if(delta < 0){
                    lblRaiz.setText("Não existe Valores reais");
                }else{
                    lblRaiz.setText("Existe Valores reais");
                }
                painel.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        EquacaoSegundoGrau dialog = new EquacaoSegundoGrau();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
