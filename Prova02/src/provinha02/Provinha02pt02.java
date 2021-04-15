package provinha02;

import javax.swing.JOptionPane;
import java.util.Random;

public class Provinha02pt02 {    
    public static void main(String[] args) {
        int[] aposta = new int[3];
        try{
            for(int i=0;i<3;i++){
                aposta[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 0 à 100 para a aposta "+(i+1)+" :"));
            }
        
        Random radom  = new Random();
        int numero = 0;
        numero=radom.nextInt(100);
        
        for(int i=0;i<3;i++){
            if(aposta[i]==numero){
                JOptionPane.showMessageDialog(null,"Para o Aposta Nº "+(i+1)+". Parabéns, você é o campeão, você ganhou 1 Milho Grande!");
            }else{
                JOptionPane.showMessageDialog(null,"Para o Aposta Nº 4"+(i+1)+". Que pena, não foi dessa vez, tente novamente!");
            }
        }
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, error);
        }
    }
    
}
