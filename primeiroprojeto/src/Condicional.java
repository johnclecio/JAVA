public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

// código omitido

        if (anoDeLancamento >= 2022){
            System.out.println("Filme lancamento");
        }else {
            System.out.println("Filme retro");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }

        System.out.println("John Mac");
    }
}