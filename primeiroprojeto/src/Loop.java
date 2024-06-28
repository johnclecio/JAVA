import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura =  new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i <3 ; i++) {
            System.out.println("Digite um  Nota");
            nota = leitura.nextInt();
            mediaAvaliacao += nota;
        }
        System.out.println(String.format("A media do filme \n%.2f "  , mediaAvaliacao/3));


    }
}
