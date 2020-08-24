package cursodejava;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos primitivos e Saída de Dados

        float nota = (float) 8.5;
        System.out.println("A nota é: " + nota);
        System.out.printf("\nA nota é: %.2f\n", nota);
        System.out.printf("\nA nota é: %.4f\n", nota);

        String nome = "Caio";
        System.out.printf("\nA nota de %s é: %.4f\n", nome, nota);
        float nota2 = 2.5f;
        System.out.format("\nA nota de %s é: %.1f\n", nome, nota2);


        // Entrada de Dados

        Scanner scan = new Scanner(System.in);
        System.out.print("\nDigite o nome do Aluno: ");
        String nome2 = scan.nextLine();
        System.out.print("\nDigite a nota do Aluno: ");
        float nota3 = scan.nextFloat();
        System.out.format("\nA nota de %s é: %.2f\n", nome2, nota3);
    }
}
