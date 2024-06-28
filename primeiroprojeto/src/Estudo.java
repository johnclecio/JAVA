//Crie uma classe chamada Estudos para imprimir anotações de estudos no console.


public class Estudo {
    public static void main (String[] args){
        String[] estudos = {"JAVA", "Programação", "Python"};

        System.out.println("Lista de Estudo:");

        for (int i = 0; i < estudos.length; i++) {
            System.out.println(estudos[i]);
        }

    }
}
