
// cada uma retornando o preço final considerando descontos ou taxas adicionais.

public class ProdutoFisico implements Calculavel{

    private double valor = 100;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularPrecoFinal() {

        double desconto = valor - (valor / 100 ) * 10  ;



            System.out.println(" voce Ganho desconto  Desconto de 10% \n" + desconto);


        return 0;
    }
}
