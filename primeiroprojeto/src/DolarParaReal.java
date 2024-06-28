//Declare uma variável do tipo double valorEmDolares.
// Atribua um valor em dólares a essa variável.
// Considere que o valor de 1 dólar é equivalente a 4.94 reais.
// Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

public class DolarParaReal {
    public static void main(String[] args) {
        // Definir a taxa de câmbio. Por exemplo, 1 dólar = 5 reais.
        double taxaCambio = 4.94;

        double valorDolar = 25;

        double valorReal = valorDolar * taxaCambio;



        System.out.println(String.format("Valor em Dólar: %.2f\nValor em Real: %.2f", valorDolar, valorReal));

    }
}
