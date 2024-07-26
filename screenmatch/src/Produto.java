//Desenvolva uma classe Produto com os atributos privados nome e preco.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

public class Produto implements Vendavel {
    private String nome;
    private double precoUnitario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    // Construtor e outros métodos

    @Override
    public double calcularPrecoTotal(int quantidade) {
        System.out.println(precoUnitario);
        double total = precoUnitario * quantidade;
        return total;

    }

    @Override
    public boolean aplicarDesconto(double percentualDesconto) {
        precoUnitario -= precoUnitario * (percentualDesconto / 100.0);
        System.out.println("Desconto "+ precoUnitario);
        return false;
    }
}