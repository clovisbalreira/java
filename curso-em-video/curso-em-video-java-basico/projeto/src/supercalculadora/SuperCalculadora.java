package supercalculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuperCalculadora extends JDialog {
    private JPanel contentPane;
    private JButton btnBotao;
    private JSpinner txtValor;
    private JLabel lblResto;
    private JLabel lblCubo;
    private JLabel lblQuadrado;
    private JLabel lblCubica;
    private JLabel lblValor;
    private JPanel painel;

    public SuperCalculadora() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnBotao);
        painel.setVisible(false);
        btnBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var valor = Integer.parseInt(txtValor.getValue().toString());
                var divisao = valor % 2;
                var cubo = Math.pow(valor,3);
                var quadrado = Math.sqrt(valor);
                var cubica =  Math.cbrt(valor);;
                var absoluto = Math.round(valor);
                lblResto.setText(Integer.toString(divisao));
                lblCubo.setText(Double.toString(cubo));
                lblQuadrado.setText(Double.toString(quadrado));
                lblCubica.setText(Double.toString(cubica));
                lblValor.setText(Integer.toString(absoluto));
                painel.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SuperCalculadora dialog = new SuperCalculadora();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
