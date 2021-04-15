package provinha02;
import java.util.Arrays;
import javax.swing.JOptionPane;


public class Provinha02 {


    public static void main(String[] args) {
        int[] valor = new int[8];
        try{
            for(int i=0;i<8;i++){
                valor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor "+(i+1)+" :"));
 
            }
            for(int i=0;i<8;i++){
                if(valor[i]%2==0){
                JOptionPane.showMessageDialog(null,"O Número "+(i+1)+" é Par");
                }
            }
            Arrays.sort(valor);
            int maior = valor[7];
            int menor = valor[0];
            
            JOptionPane.showMessageDialog(null,"O maior valor é: "+maior+"\nO menor valor é: "+menor);
            
            int media = (valor[0]+valor[1]+valor[2]+valor[3]+valor[4]+valor[5]+valor[6]+valor[7])/8;
            
            for(int i=0;i<8;i++){
                if(valor[i]>media){
                JOptionPane.showMessageDialog(null,"O "+(i+1)+"º númro é maior que a média, valor: "+valor[i]);
                }
            }
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, error);
        }
    }
    
}
