package cursodejava;

import java.util.Arrays;

public class vetor05 {
    public static void main(String[] args) {
        int v[] = new int[20];
        Arrays.fill(v, 1);

        for (int valor: v) {
            System.out.print(v + " ");
        }
    }
}
