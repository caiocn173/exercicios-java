package cursodejava;

import java.util.Scanner;

public class Vetor02 {


    public static void main(String[] args) {
        Vetor02 vetor02 = new Vetor02();
        int pergunta;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o ano: ");
        pergunta = scan.nextInt();

        if(pergunta % 4 == 0){
           if(pergunta % 100 == 0){
               if(pergunta % 400 == 0){

                   vetor02.calcula2();

               }else{
                   vetor02.calcula1();
               }
           }else{
               vetor02.calcula2();
           }
        } else{

            vetor02.calcula1();
        }

    }



    public void calcula1() {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31};

        for (int c = 0; c < mes.length; c++) {
            System.out.println("O mês " + mes[c] + " tem " + tot[c] + " dias.");
        }
    }

    public void calcula2() {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 29, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31};

        for (int c = 0; c < mes.length; c++) {
            System.out.println("O mês " + mes[c] + " tem " + tot[c] + " dias.");
        }
    }

}
