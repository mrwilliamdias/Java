package aula03;

import javax.swing.JOptionPane;

public class NomeIdade {
    public static void main(String args[]){
    String nome[] = new String[5];
    int idade[] = new int[5];
    
    for(int i = 0 ; i < 5; i++){
        try {
            nome[i] = JOptionPane.showInputDialog("Digite seu nome:");
            idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
            if(idade[i] < 18){
                JOptionPane.showMessageDialog(null,"Nome:"+ nome[i]+"\nIdade:"+idade[i]+"\nMenor de Idade");
            } else {
                JOptionPane.showMessageDialog(null,"Nome:"+ nome[i]+"\nIdade:"+idade[i]+"\nMaior de Idade");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    }
}
