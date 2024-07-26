//Crie uma classe CalculadoraSalaRetangular
// que implementa uma interface CalculoGeometrico
// com os métodos calcularArea() e calcularPerimetro()
// para calcular a área e o perímetro de uma sala retangular.
// A classe deve receber altura e largura como parâmetros.

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double base;
    private double altura;


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }



    @Override
    public double calcularArea( ) {

        return base * altura;
    }



    @Override
    public double calcularPerimetro() {

        return base + altura ;
    }
}
