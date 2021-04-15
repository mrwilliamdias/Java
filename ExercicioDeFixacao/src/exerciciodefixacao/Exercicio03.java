package exerciciodefixacao;

import javax.swing.JOptionPane;

public class Exercicio03 {
    private static int a;
    private static int b;
    public static void main(String args[]){
    a = (int)( Math.random() * 10);
    try{
    b = Integer.parseInt(JOptionPane.showInputDialog("Selecione um número de 0 à 10: "));
    if(a==b){
    JOptionPane.showMessageDialog(null,"Valor Gerado: "+a+"\nValor Selecionado: "+b+"\nParabéns! Você é o vencedor!");
    } else{
    JOptionPane.showMessageDialog(null,"Valor Gerado: "+a+"\nValor Selecionado: "+b+"\nQue pena, não é o mesmo número. Tente novamente!");
    }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }
}
