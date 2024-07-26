// Classe Servico
public class Servico implements Vendavel {
    private String descricao;
    private double precoHora;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public int setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
        return 0;
    }
// Construtor e outros métodos

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public boolean aplicarDesconto(double percentualDesconto) {
        precoHora -= precoHora * (percentualDesconto / 100.0);
        System.out.println("10% de desconto \n"+ precoHora);
        return true;
    }
}
