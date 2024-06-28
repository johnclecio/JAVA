//Crie um programa que realize a média de duas notas decimais e exiba o resultado.
//Declare uma variável do tipo double e uma variável do tipo int.
// Faça o casting da variável double para int e imprima o resultado.


public class Notas {
    public static void main(String[] args) {
        //recebo duas variaveis do tipo inteiro
        int N1 = 8;
        int N2 = 7;
        // para calcula a media eu tranformo a entra dos valores da variaveis para tipo Double
        double media = (double) (N1 + N2)/2;

        System.out.println("Valor da primeira Nota:\n" + N1 + "\n" + "Valor da segunda Nota:\n" + N2 + "\n" + "Media\n" + media);
    }
}
