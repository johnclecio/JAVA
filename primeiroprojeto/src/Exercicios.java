//Declare uma variável do tipo double precoProduto
// e uma variável do tipo int (quantidade).
// Calcule o valor total multiplicando o preço do produto pela quantidade
// e apresente o resultado em uma mensagem.

public class Exercicios {
    public static void main(String[] args) {
        double precoProduto = 95.2;
        int quantidade = 5;

        double valorTotal = (double) (precoProduto * quantidade);

        System.out.println("Valor do Produto \n" + precoProduto + "\n" + "Quantidade \n" + quantidade + "\n" + "Valor Total\n" + valorTotal);
    }
}
