public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        tarifaMensal = (saldo/100)*1;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldo);
    }
}

