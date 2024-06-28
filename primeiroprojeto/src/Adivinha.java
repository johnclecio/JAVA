

//Agora é com você! Pratique os conceitos que foram ensinados ao longo dessa aula com o seguinte desafio:
//
//Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100
// e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa,
// o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.
//
//Dicas:
//
//Para gerar um número aleatório em Java: new Random().nextInt(100);
//Utilize o Scanner para obter os dados do usuário;
//Utilize uma variável para contar as tentativas;
//Utilize um loop para controlar as tentativas;
//Utilize a instrução break; para interromper o loop.

import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(101); // Gera um número aleatório entre 0 e 100
        int tentativas = 5;
        boolean acertou = false;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número que estou pensando (entre 0 e 100). Você tem " + tentativas + " tentativas.");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            int palpite = scanner.nextInt();

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você adivinhou o número correto.");
                acertou = true;
                break;

            }  else if (palpite > numeroAleatorio) {
                    System.out.println("O número é menor que " + palpite + ".");
                } else {
                    System.out.println("O número é maior que " + palpite + ".");
                }




        }
        if (!acertou) {
            System.out.println("Que pena! Você não conseguiu adivinhar o número. O número era " + numeroAleatorio + ".");
        }

        scanner.close();

    }
}
