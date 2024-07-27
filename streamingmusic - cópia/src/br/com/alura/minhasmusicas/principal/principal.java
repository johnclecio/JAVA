package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class principal {
    public static void main(String[] args) {
        Musica minhMusica = new Musica();
        minhMusica.setCantor("Kiss");
        minhMusica.setTitulo("Forever");


        for (int i = 0; i < 1000; i++) {
            minhMusica.getTotalDeReproducoes();



        }
        for (int i = 0; i <50 ; i++) {
            minhMusica.getTotalDeCurtida();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Clecio Mac");
        podcast.setApresentador("John");

        for (int i = 0; i <5000 ; i++) {
            podcast.getTotalDeReproducoes();

        }
        for (int i = 0; i < 1000; i++) {
            podcast.getTotalDeCurtida();

        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhMusica);
        preferidas.inclui(podcast);


    }


}
