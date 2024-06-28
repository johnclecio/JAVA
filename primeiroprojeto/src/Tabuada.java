//Crie um programa que solicite ao usuário um número
// e exiba a tabuada desse número de 1 a 10.

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos Calcular a Tabuada ");

        System.out.println("Digite um numero de 1 a 10");
        int tabuada = scanner.nextInt();

        if (tabuada > 10 || tabuada <= 0){
            System.out.println("Porfavor digite uma valor valido");

        }else {
            for (int i = 1; i <=10 ; i++) {
                System.out.println("resultado " + tabuada + " x " + i + " = " + tabuada*i );
        }



        }
    }
}
