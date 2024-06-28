//Esse é o Screen Match
//
//Filme: Top Gun: Maverick
//
//2022
public class Main {
    public static void main (String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoLancamento = 2022;
        System.out.println("Ano Lancamento; " + anoLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        System.out.println("Nota do Filme: " + notaDoFilme + " incluido no Plano " + incluidoNoPlano);


        double media = (8.1 + 6.2 + 8.5) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme de aventura
                Piloto
                """ + anoLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);


    }
}