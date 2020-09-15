package cursodejava;

import java.util.Scanner;

public class EstruturasDeRepeticaoParte2 {
    public static void main(String[] args) {
        /*
        ///////////////////////////////////////////
        int cc = 0;

        do{

            System.out.println("Cambalhota");
            cc++;

        }while(cc<4);
       */ ///////////////////////////////////////////
        int n, s = 0;
        String resp;
        Scanner scan = new Scanner(System.in);

        do{

            System.out.println("Digite um número: ");
            n = scan.nextInt();
            s += n;
            System.out.println("Quer continuar? [S/N]");
            resp = scan.next();

        }while(resp.equals("S"));

        System.out.println("A soma de todos os valores é: " + s);

    }
}
