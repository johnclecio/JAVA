//Crie um programa que solicite ao usuário
// a entrada de um número inteiro.
// Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

import java.util.Scanner;

public class ParImpa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = scanner.nextInt();



        if ( numero % 2 == 0){
            System.out.println("Número é par \n " + numero);
        }else {
            System.out.println("Número é impar \n " + numero);
        }
    }
}
