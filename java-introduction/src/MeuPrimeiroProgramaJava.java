import java.util.Scanner;

class MeuSegundoProgramaJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o primeiro número
        System.out.print("Primeiro Número: ");
        float n1 = scanner.nextFloat();

        // Solicita o segundo número
        System.out.print("Segundo Número: ");
        float n2 = scanner.nextFloat();

        // Calcula a soma dos dois números
        float soma = n1 + n2;

        // Imprime o resultado no formato "n1 + n2 = soma"
        System.out.println(n1 + " + " + n2 + " = " + soma);

        // Encerra o programa
        System.exit(0);
    }
}
