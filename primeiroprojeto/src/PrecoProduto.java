//Declare uma variável do tipo double precoOriginal.
// Atribua um valor em reais a essa variável, representando o preço original de um produto.
// Em seguida, declare uma variável do tipo double
// percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
// Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

public class PrecoProduto {
    public static void main(String[] args) {
        double precoOriginal = 115;
        double precentualDesconto = 10;

        double valorDescontoProduto = (precoOriginal / 100) * precentualDesconto;

        System.out.println( "Valor do desconto 10% \n" + valorDescontoProduto + "\n" + "Valor a pagar sera de\n" + ( precoOriginal - valorDescontoProduto));

    }
}
