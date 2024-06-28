import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura =  new Scanner(System.in);


        System.out.println("Digite um  Filme");
        String filme = leitura.nextLine();

        System.out.println("Digite ano de lancamento");
        int anoLancamento = leitura.nextInt();

        System.out.println("Digite sua avaliação");
        double nota = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(nota);




    }

}
