package cursodejava;

import java.util.Locale;

public class Idioma {
    public static void main(String[] args) {
        exibirIdiomaDoSistema();
    }

    public static void exibirIdiomaDoSistema(){
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma atual do seu sistema é: ");
        System.out.println(idioma.getDisplayLanguage());
    }
}
