package cursodejava;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        // Operadores Aritméticos

        System.out.println("=====================Operadores Aritméticos==========================");

        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.format("\nA média é igual a: %s\n", m);

        System.out.println("=====================================================================");


        // Operadores Unários

        System.out.println("======================Operadores Unitários===========================");

        int numero = 5;
        numero++;
        System.out.print("\n" + numero + "\n");

        int numero2 = 8;
        numero2--;
        System.out.print("\n" + numero2 + "\n");

        System.out.println("=====================================================================");

        // Pré incremento e Pós incremento

        System.out.println("===================Pré incremento e Pós incremento===================");

        int numero3 = 5;
        int valor = 5 + numero3++;
        System.out.print("\n" + valor + "\n");
        System.out.print(numero3 + "\n");

        int numero4 = 5;
        int valor2 = 5 + ++numero4;
        System.out.print("\n" + valor2 + "\n");

        int numero5 = 10;
        int valor3 = 4 + numero5--;
        System.out.print("\n" + valor3 + "\n");
        System.out.print(numero5 + "\n");

        System.out.println("=====================================================================");

        // Operadores de Atribuição

        System.out.println("=====================Operadores de Atribuição========================");

        int x = 4;
        x += 2;    //   x = x + 2
        System.out.print("\n" + x + "\n");

        System.out.println("=====================================================================");

        // Arredondamentos

        System.out.println("===========================Arredondamentos===========================");

        float v = 8.9f;
        int ar = (int) Math.floor(v);
        System.out.println("\n" + ar);

        float v2 = 8.9f;
        int ar2 = (int) Math.ceil(v2);
        System.out.println("\n" + ar2);

        float v3 = 8.5f;
        int ar3 = (int) Math.round(v3);
        System.out.println("\n" + ar3);

        float v4 = 8.4f;
        int ar4 = (int) Math.round(v4);
        System.out.println("\n" + ar4);

        System.out.println("=====================================================================");

        // Gerador de Números

        System.out.println("=======================Gerador de Números============================");

        double ale = Math.random();
        System.out.println("\n" + ale);

        double ale2 = Math.random();
        int n = (int) (5 + ale2 * (10 - 5));
        System.out.println("\n" + n);
        System.out.println("=====================================================================");

    }
}
