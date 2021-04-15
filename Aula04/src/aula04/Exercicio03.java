package aula04;

import javax.swing.JOptionPane;

public class Exercicio03 {

    public static void main(String[] args) {
    int[][] numeros = new int[3][2];
    String[][] nomes = new String[3][3];
            try{
            for(int i=0 ; i<3 ; i++){
                for(int y=0 ; y<2 ; y++){
                numeros[i][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite o Número: "));
                }
            }
            for(int a=0 ; a<3 ; a++){
                for(int b=0 ; b<3 ; b++){
                nomes[a][b] = JOptionPane.showInputDialog("Digite o Nome: ");
                }
            }
            for(int p=0; p<3; p++){
            for(int q=0; q<2; q++){
                System.out.println(" "+numeros[p][q]);
                if (q == 1) {
                    System.out.println();
                }
            }
            }
            for(int z=0; z<3; z++){
            for(int x=0; x<3; x++){
                System.out.println(" "+nomes[z][x]);
                if (x == 2) {
                    System.out.println();
                }
            }
            }
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }
}