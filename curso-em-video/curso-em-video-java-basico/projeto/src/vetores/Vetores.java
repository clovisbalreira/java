package vetores;

import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

public class Vetores extends JDialog {
    private JPanel contentPane;
    private JButton btnAdicionar;
    private JButton btnRemover;
    private JButton btnOrdenar;
    private JList listVetor;
    private JSpinner spnVetor;
    private JLabel lblVetor;
    int vetor[] = new int[10];
    DefaultListModel lista = new DefaultListModel();
    int selecionado = 0;
    public Vetores() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnAdicionar);
        Arrays.fill(vetor,0);

        for(var i = 0; i < vetor.length; i ++){
            lista.addElement("[" + i + "] -> " + vetor[i]);
        }
        listVetor.setModel(lista);

        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lista.removeAllElements();
                vetor[selecionado] = Integer.parseInt(spnVetor.getValue().toString());
                for(var i = 0; i < vetor.length; i ++){
                    lista.addElement("[" + i + "] -> " + vetor[i]);
                }
                listVetor.setModel(lista);
            }
        });
        listVetor.addMouseMotionListener(new MouseMotionAdapter() {
        });
        listVetor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selecionado = listVetor.getSelectedIndex();
                lblVetor.setText("[" + selecionado + "]");
            }
        });
        btnRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vetor[selecionado] = 0;
                lista.removeAllElements();
                for(var i = 0; i < vetor.length; i ++){
                    lista.addElement("[" + i + "] -> " + vetor[i]);
                }
                listVetor.setModel(lista);            }
        });
        btnOrdenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lista.removeAllElements();
                Arrays.sort(vetor);
                for(var i = 0; i < vetor.length; i ++){
                    lista.addElement("[" + i + "] -> " + vetor[i]);
                }
                listVetor.setModel(lista);
            }
        });
    }

    public static void main(String[] args) {
        Vetores dialog = new Vetores();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

}
