//Crie uma classe ConversorMoeda que implementa
// uma interface ConversaoFinanceira com o método
// converterDolarParaReal() para converter um valor em dólar para reais.
// A classe deve receber o valor em dólar como parâmetro.


public class ConversorMoeda  implements ConversaoFinanceiro {
    private double real;
    private double dolar;

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }



    @Override
    public double converterDolarParaReal() {
        double taxa = getDolar() * 5.59;
        return taxa;
    }

    @Override
    public double converterRealParaDolar() {
        double taxa = getReal() / 5.59;
        return taxa;
    }
}



