//Vetor

import javax.swing.*;

class ProgVetor
{
    public static void soma (){
      int s=0, vetor[] = {1, 2, 3, 4, 5};

      for (int i = 0; i< vetor.length; i++){
          s = s + vetor[i];
      }
        JOptionPane.showMessageDialog(null, "A somatoria ah "+ s);
    }
    public static int produto ()
    {
        int p=1, vetor[] = {1, 2, 3, 4, 5};
        for (int i = 0; i<vetor.length; i++){
            p = p * vetor[i];
        }
        return p;
    }

    public static void main(String entrada[]){
        int r;
        soma();
        r = produto();
        JOptionPane.showMessageDialog(null, "A produtoria eh "+ r);
        System.exit(0);



    }

}
