package resolucaotela;

import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension d = resolucao.getScreenSize();
        System.out.println("Sua tela está na resolução " + d.width + " x " + d.height
        );
    }
}
