package exerciciodefixacao;

import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args){
        int[] valor = new int[4];
        int aux;
        try{
        for(int i=0; i<valor.length; i++){
            valor[i] = Integer.parseInt(JOptionPane.showInputDialog("Coloque o "+(i+1)+"º Valor"));
        }
        for(int i=0;i<valor.length;i++){
        for(int j=0;j<(valor.length-1);j++){
            if(valor[j]<valor[j+1]){
            aux=valor[j];
            valor[j]=valor[j+1];
            valor[j+1]=aux;
            }
                
        }
        }
        for(int i=0;i<valor.length;i++){
            System.out.print(valor[i]+" ");
        }    
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
