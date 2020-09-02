package cursodejava;

import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        // Condição Simples
        Scanner scan = new Scanner(System.in);
        float n1 = scan.nextFloat();
        System.out.println("Primeira Nota: " + n1);
        float n2 = scan.nextFloat();
        System.out.println("Segunda Nota: " + n2);
        float m = (n1 + n2) / 2;
        System.out.println("Sua média foi: " + m);
        if(m > 9){
            System.out.println("Parabéns!");
        }

        // Condição Composta
        System.out.println("Informe sua data de nascimento:");
        int nasc = scan.nextInt();
        int i = 2020 - nasc;
        System.out.println("Sua idade é: " + i);
        if(i >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
}
