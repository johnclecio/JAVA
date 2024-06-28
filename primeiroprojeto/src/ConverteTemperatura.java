
//Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
// Utilize variáveis para representar os valores das temperaturas e imprima
// o console o valor convertido de Celsius para Fahrenheit.
//
//Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32.

public class ConverteTemperatura {
    public static void main(String[] args) {
         double celcis = 30;

        double fahrenheit = (celcis * 1.8) + 32;

        System.out.println(celcis + " graus  Celcius \n" + fahrenheit + " Fahrenheit !" );
    }
}
