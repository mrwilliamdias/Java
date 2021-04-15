
package aula05;

import javax.swing.JOptionPane;


public class Aula05 {


    public static void main(String[] args) {
        int[][] matriz3por2 = new int[3][2];
        try{
            for(int i = 0; i < 3; i++){
                for(int y = 0; y < 2; y++){
                    matriz3por2[i][y] = (int)(Math.random()*100);
                }
            }
            for(int i = 0; i < 3; i++){
                for(int y = 0; y < 2; y++){
                    if)(){
                        System.out.print(" "+matriz3por2[i][y]);                    }
                }
            }
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, error);
        }
    }
    
}
