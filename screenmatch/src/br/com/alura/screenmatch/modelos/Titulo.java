package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Titulo  implements Classificavel {
    private String nome;
    private int anoDelancamento;
    private boolean incluidoNoPlano ;
    private double somaAvaliacao;
    private int totalDaAvaliacao;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public int getAnoDelancamento() {
        return anoDelancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDaAvaliacao(){
        return totalDaAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDelancamento(int anoDelancamento) {
        this.anoDelancamento = anoDelancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibeFichaTecnica(){


        System.out.println( "Nome do filme: " + nome +  " \nAno de Lançamento: " + anoDelancamento  );

    }
    void avalia(double nota){
        somaAvaliacao += nota;
        totalDaAvaliacao ++;
    }

    public double pegaMedia(){
        double media = somaAvaliacao / totalDaAvaliacao;
        return media;
    }


    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
