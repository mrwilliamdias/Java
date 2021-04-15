package aula03;

import javax.swing.JOptionPane;

public class Aula03 {


    public static void main(String[] args) {
        double imc, peso, altura;
        int i;
        
        do{
        try{
            peso = Double.parseDouble(JOptionPane.showInputDialog("Digite Seu Peso: "));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua Altura: "));
            imc = peso/(altura*altura);
        
            JOptionPane.showMessageDialog(null,"Indice de Massa Corporia: "+ imc);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        i = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n 1-Para Continuar\n 2-Para Parar"));
        
        }while(i==1);
    }
    
}
