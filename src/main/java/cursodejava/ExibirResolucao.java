package cursodejava;

import java.awt.*;

public class ExibirResolucao {
    public static void main(String[] args) {
        Toolkit res = Toolkit.getDefaultToolkit();
        Dimension d = res.getScreenSize();
        System.out.println("A resolução atual da máquina é: " + d.width + " X " + d.height);

    }
}
