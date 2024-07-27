package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int totalDeCurtida;
    private  int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalDeCurtida() {
        return totalDeCurtida;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void reproducao(){
        this.totalDeReproducoes++;
    }
    public void curtidas(){
        this.totalDeCurtida++;
    }
}
