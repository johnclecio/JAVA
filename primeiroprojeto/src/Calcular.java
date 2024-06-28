//Crie um menu que oferece duas opções ao usuário:
// "1. Calcular área do quadrado" e
// "2. Calcular área do círculo".
// Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double alt = 0, lag = 0, areaDoQaudrado;



        //calcular área de uma qadrado altura * lagura
        System.out.println("Escolha a sua opção:");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        int op = scanner.nextInt();





        switch (op) {
            case 1:
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                System.out.print("Digite a Altura: ");
                double altura = scanner.nextDouble();
                double areaDoQuadrado = lado * altura;
                System.out.println("A área do quadrado é: " + areaDoQuadrado);
                break;

            case 2:
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaDoCirculo = Math.PI * raio * raio;
                System.out.println("A área do círculo é: " + areaDoCirculo);
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}
