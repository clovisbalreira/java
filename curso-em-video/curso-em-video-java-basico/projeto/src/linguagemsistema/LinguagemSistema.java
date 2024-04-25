package linguagemsistema;

import java.util.Locale;

public class LinguagemSistema {
    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        System.out.println("Seu sistema está em " + local.getDisplayLanguage());
    }
}
