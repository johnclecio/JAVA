//Crie uma classe Musica com atributos titulo,
// artista, anoLancamento, avaliacao
// e numAvaliacoes, e métodos
// para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    double numAvaliacao;

    void fichatecnica(){
        String msg ;
        msg = """
                Titulo  \n""" + titulo +
                """
                \nArtista  \n""" + artista +
                """
                \nAno de Lancamento  \n""" + anoDeLancamento

                ;
        System.out.println(msg);
    }
    void avaliado(double nota){
        avaliacao += nota;
        numAvaliacao ++;
    }

    double pegaMedia(){
        double media = avaliacao / numAvaliacao;
        return media;
    }
}
