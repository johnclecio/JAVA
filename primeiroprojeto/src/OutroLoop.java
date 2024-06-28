
// Loop com while

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura =  new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while ( nota != -1) {
            System.out.println("Digite um  Nota");
            nota = leitura.nextInt();

            if ( nota != -1){
                mediaAvaliacao += nota;
                totalNotas++;
            }

        }
        System.out.println(String.format("A media do filme \n%.2f "  , mediaAvaliacao/totalNotas));
    }
}
