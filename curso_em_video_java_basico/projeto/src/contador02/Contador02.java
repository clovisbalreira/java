package contador02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contador02 extends JDialog {
    private JPanel contentPane;
    private JButton btnContar;
    private JLabel lblContagem;

    public Contador02() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnContar);
        btnContar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cc = 0;
                String contagem = "";
                while (cc < 10){
                    cc++;
                    if(cc == 5 || cc == 7){
                        continue;
                    }
                    if (cc == 8){
                        break;
                    }
                    contagem += cc + " ";
                }
                lblContagem.setText(contagem);
            }
        });
    }

    public static void main(String[] args) {
        Contador02 dialog = new Contador02();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
