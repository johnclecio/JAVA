//Desenvolva uma classe Livro com os atributos privados titulo e autor.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método exibirDetalhes que imprime o título e o autor do livro.

public class Livro extends ProdutoFisico implements  Calculavel {
    private String nome;
    private String titulo;
    private double valor1;
    private double valor2;

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor) {
        this.valor1 = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public double calcularPrecoFinal() {

        double acrescimo =  valor1 + (valor1 / 100) * 10 ;
        double atacado = valor2 - (valor2 / 100)  * 10;


            System.out.println("A parcelado acrescimo de 10% " + acrescimo);

            System.out.println("Na compra de tres desconto de 35 % " + atacado);

        return 0;
    }
}

