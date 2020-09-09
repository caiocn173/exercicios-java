package cursodejava;
import java.util.Scanner;

public class CondicoesEncadeadas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a seu ano de nascimento: ");
        int nasc = scan.nextInt();
        int i = 2020 - nasc;
        if(i < 16){
            System.out.println("Não vota");
        }else if((i >= 16 && i < 18) || (i >= 70)){
            System.out.println("Voto opcional");
        }else{
            System.out.println("Voto Obrigatório");
        }
    }
}
