package cursodejava;
import javax.swing.JOptionPane;

public class JOptionPaneComRepeticao {
    public static void main(String[] args) {

        int control, totalValues = 0, totalPares = 0, totalImpares = 0, acima100 = 0, mediaValues, s = 0;

        do{



         control = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor \n(0 interrompe)", "Entrada de dados", 1));

         if(control != 0) {
             totalValues++;
         }
         s += control;
         mediaValues = s / totalValues;

         if(control > 100){
             acima100++;
         }

         if(control % 2 == 0 && control > 0){
             totalPares++;
         }else if(control % 2 != 0 && control > 0){
             totalImpares++;
         }

        }while(control != 0);


        JOptionPane.showMessageDialog(null, "Resultado: \n----------------------------\nTotal de Valores: " + totalValues +
                "\nTotal de Pares: " + totalPares + "\nTotal de Impares: " + totalImpares + "\nAcima de 100: " +
                acima100 + "\nMedia dos Valores: " + mediaValues, "Resultado Final", 1);

    }
}
