//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("NOTA 1");
        float N1 = scanner.nextFloat();

        System.out.println("NOTA 2");
        float N2 = scanner.nextFloat();

        float media = (N1 + N2) / 2 ;
       System.out.println("sua média é = " + media);
       if (media >= 7){
           System.out.println("Aprovado");
       } else {
           System.out.println("Reprovado");

       }
        scanner.close();
        
    }
}