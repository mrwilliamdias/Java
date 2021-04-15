package aula04;

import javax.swing.JOptionPane;

public class Aula04 {

    public static void main(String[] args) {
        String[] meses = new String[13];
        int escolha;
        meses[1] = "Janeiro";
        meses[2] = "Fevereiro";
        meses[3] = "Marça";
        meses[4] = "Abril";
        meses[5] = "Maio";
        meses[6] = "Junho";
        meses[7] = "Julho";
        meses[8] = "Agosto";
        meses[9] = "Setembro";
        meses[10] = "Outubro";
        meses[11] = "Novembro";
        meses[12] = "Dezembro";
        try{
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Selecione:"
                    + "\n(1)-Para Janeiro"
                    + "\n(2)-Para Fevereiro"
                    + "\n(3)-Para Março"
                    + "\n(4)-Para Abril"
                    + "\n(5)-Para Maio"
                    + "\n(6)-Para Junho"
                    + "\n(7)-Para Julho"
                    + "\n(8)-Para Agosto"
                    + "\n(9)-Para Setembro"
                    + "\n(10)-Para Outubro"
                    + "\n(11)-Para Novembro"
                    + "\n(12)-Para Dezembro"));
            switch(escolha){
                case 1:
                    JOptionPane.showMessageDialog(null, meses[1]);
                break;
                case 2:
                    JOptionPane.showMessageDialog(null, meses[2]);
                break;
                case 3:
                    JOptionPane.showMessageDialog(null, meses[3]);
                break;
                case 4:
                    JOptionPane.showMessageDialog(null, meses[4]);
                break;
                case 5:
                    JOptionPane.showMessageDialog(null, meses[5]);
                break;  
                case 6:
                    JOptionPane.showMessageDialog(null, meses[6]);
                break;  
                case 7:
                    JOptionPane.showMessageDialog(null, meses[7]);
                break;  
                case 8:
                    JOptionPane.showMessageDialog(null, meses[8]);
                break;  
                case 9:
                    JOptionPane.showMessageDialog(null, meses[9]);
                break; 
                case 10:
                    JOptionPane.showMessageDialog(null, meses[10]);
                break; 
                case 11:
                    JOptionPane.showMessageDialog(null, meses[11]);
                break; 
                case 12:
                    JOptionPane.showMessageDialog(null, meses[12]);
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Mês não encontrado.");
            }
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }
    
}
