//desenvolvendo e aprendendo

import javax.swing.*;

class mac
{
    public static void main (String entrada[]){

        //var
        int n1, n2 ;
        double soma;
        String msg ="";





        //entrada
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));

        //processamento
        soma = n1 + n2;
        double media = (n1 + n2) / 2;

        if (media <=6){
            msg = msg + media + " media voce esta Reprovado \n";
        } else if (media >=7 && media <9){
            msg = msg + media + " media voce esta Aprovado \n";
        }else{
            msg = msg + media + " media voce esta Aprovado com notas exelentes \n";
        }



        JOptionPane.showMessageDialog(null, msg);





        System.exit(0);

}

        }