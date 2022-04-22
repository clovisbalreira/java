package contadorEspecial;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorEspecial extends JDialog {
    private JPanel contentPane;
    private JButton btnCalcular;
    private JSlider sldInicio;
    private JSlider sldFim;
    private JSlider sldPasso;
    private JLabel lblInicio;
    private JLabel lblFim;
    private JLabel lblPasso;
    private JList lisResposta;

    public ContadorEspecial() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnCalcular);
        sldInicio.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblInicio.setText(Integer.toString(sldInicio.getValue()));
            }
        });
        sldFim.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblFim.setText(Integer.toString(sldFim.getValue()));
            }
        });
        sldPasso.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblPasso.setText(Integer.toString(sldPasso.getValue()));
            }
        });
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int inicio = sldInicio.getValue();
                int fim = sldFim.getValue();
                int passo = sldPasso.getValue();
                DefaultListModel lista = new DefaultListModel();
                for(var i = inicio; i < fim; i += passo){
                    lista.addElement(i);
                }
                lisResposta.setModel(lista);
            }
        });
    }

    public static void main(String[] args) {
        ContadorEspecial dialog = new ContadorEspecial();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
