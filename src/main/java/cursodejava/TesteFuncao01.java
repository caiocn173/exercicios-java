package cursodejava;

public class TesteFuncao01 {
    public static void main(String[] args) {

        int sm = soma(5, 2);
        System.out.println("A soma é " + sm);

    }

    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
}
