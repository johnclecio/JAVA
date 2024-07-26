//Crie uma classe TabuadaMultiplicacao
// que implementa uma interface Tabuada
// com o método mostrarTabuada()
// para exibir a tabuada de um número.
// A classe deve receber o número como parâmetro.

public class TabuadaMultiplicacao implements  Tabuada{
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int mostrarTabuada() {
        System.out.println("Tabuada: ");
        for (int i = 1; i <=10 ; i++) {


            System.out.println( numero + " X " + i + " = " + numero * i);


        }

        System.out.println("\n");

        return 0;
    }
}
