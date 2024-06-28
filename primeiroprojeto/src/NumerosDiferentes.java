
//Peça ao usuário para inserir dois números inteiros.
// Compare os números e imprima uma mensagem indicando se são iguais,
// diferentes, o primeiro é maior ou o segundo é maior.

import java.util.Scanner;

public class NumerosDiferentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Número: \n");
        int numeroUm = scanner.nextInt();
        System.out.println("Digite o Segundo Número: \n");
        int numeroDois = scanner.nextInt();

        if (numeroUm == numeroDois) {
            System.out.println("Os números são iguais.");

        }else if (numeroUm > numeroDois) {
            System.out.println("O primeiro número (" + numeroUm + ") é maior que o segundo número (" + numeroDois + ").");
        } else {
            System.out.println("O segundo número (" + numeroDois + ") é maior que o primeiro número (" + numeroUm + ").");
        }
    }
}
