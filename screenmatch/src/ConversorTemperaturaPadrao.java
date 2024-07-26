//(0 °C × 9/5) + 32 = 32 °F
//(32 °F − 32) × 5/9
public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    private double valorCelsius;
    private double valorFahrenheit;

    public double getValorCelsius() {
        return valorCelsius;
    }

    public void setValorCelsius(double valorCelsius) {
        this.valorCelsius = valorCelsius;
    }

    public double getValorFahrenheit() {
        return valorFahrenheit;
    }

    public void setValorFahrenheit(double valorFahrenheit) {
        this.valorFahrenheit = valorFahrenheit;
    }

    @Override
    public double celsiusParaFahrenheit() {
        double convesor = (valorCelsius * 9/5) + 32;
        return convesor;
    }

    @Override
    public double fahrenheitParaCelsius() {

        double conversorF = (valorFahrenheit - 32) * 5/9;
        return conversorF;
    }
}
