package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {
        Titulo titulo = new Titulo();
        Filme meuFilme = new Filme();





        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDelancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);


        meuFilme.setNome("FROZY");
        meuFilme.setAnoDelancamento(2014);
        meuFilme.setDuracaoEmMinutos(180);


        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDelancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);


        FiltroRecomendacao filtro = new FiltroRecomendacao();


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


    }








    }

