//Crie uma classe Aluno com atributos nome,
// idade, e um método para exibir informações.
// Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.

//Desenvolva uma classe Aluno com os atributos privados nome e notas.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método calcularMedia que retorna a média das notas do aluno.

public class Aluno {
    private String nome;
    //int idade;
   // String serie;
    private double nota1, nota2, nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    //void fichaAluno(){
       // System.out.println("Nome: \n" + nome +  "\nMedia: " );
    //}
    /*
    */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }




    }
