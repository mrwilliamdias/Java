package aula03;
import javax.swing.JOptionPane;
 
 public class AulaArray {
     public static void main(String args[]){
     int[] idade = new int[3];
     for(int i = 0; i < 3; i++){
        try{
            idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        } catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
          }
     }
     for(int i = 0; i < 3; i++){
         JOptionPane.showMessageDialog(null, idade[i]);
    }
    }
 }
