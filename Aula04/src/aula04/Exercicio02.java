package aula04;

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
    int[] valores = new int[8];
    int media;
            try{
            for(int i = 0; i < 8; i++){
                valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
            }
    media = (valores[0]+valores[1]+valores[2]+valores[3]+valores[4]+valores[5]+valores[6]+valores[7])/8;  
    JOptionPane.showMessageDialog(null,"Média entre os valores informados: "+media);
    if(valores[0] > media){
        JOptionPane.showMessageDialog(null,"Primeiro valor é maior que a Média, Valor: "+valores[0]);
    } if(valores[1] > media){
        JOptionPane.showMessageDialog(null,"Segundo valor é maior que a Média, Valor: "+valores[1]);
    } if(valores[2] > media){
        JOptionPane.showMessageDialog(null,"Terceiro valor é maior que a Média, Valor: "+valores[2]);
    } if(valores[3] > media){
        JOptionPane.showMessageDialog(null,"Quarto valor é maior que a Média, Valor: "+valores[3]);
    } if(valores[4] > media){
        JOptionPane.showMessageDialog(null,"Quinto valor é maior que a Média, Valor: "+valores[4]);
    } if(valores[5] > media){
        JOptionPane.showMessageDialog(null,"Sexto valor é maior que a Média, Valor: "+valores[5]);
    } if(valores[6] > media){
        JOptionPane.showMessageDialog(null,"Setimo valor é maior que a Média, Valor: "+valores[6]);
    } if(valores[7] > media){
        JOptionPane.showMessageDialog(null,"Oitavo valor é maior que a Média, Valor: "+valores[7]);
    }
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }
}
