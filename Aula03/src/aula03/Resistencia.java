package aula03;

import javax.swing.JOptionPane;


public class Resistencia {
    public static void main(String[] args){
    double re,r1,r2,r3,r4,max,min,maior=0,menor=99999;
    
    try{
    r1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor da 1ª Resistência"));
    r2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor da 2ª Resistência"));
    r3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor da 3ª Resistência"));
    r4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor da 4ª Resistência"));
    re=r1+r2+r3+r4;
    JOptionPane.showMessageDialog(null,"O Valor da Resistência Equivalente é: "+re);
    if((r1>r2)&&(r1>r3)&&(r1>r4)){
        maior=r1;
        JOptionPane.showMessageDialog(null,"Maior Número: "+maior);
    }else if((r2>r1)&&(r2>r3)&&(r2>r4)){
        maior=r2;
        JOptionPane.showMessageDialog(null,"Maior Número: "+maior);
    }else if((r3>r1)&&(r3>r2)&&(r3>r4)){
        maior=r3;
        JOptionPane.showMessageDialog(null,"Maior Número: "+maior);
    }else if((r4>r1)&&(r4>r2)&&(r4>r3)){
        maior=r4;
        JOptionPane.showMessageDialog(null,"Maior Número: "+maior);
    }
        if((r1<r2)&&(r1<r3)&&(r1<r4)){
        menor=r1;
        JOptionPane.showMessageDialog(null,"Menor Número: "+menor);
    }else if((r2<r1)&&(r2<r3)&&(r2<r4)){
        menor=r2;
        JOptionPane.showMessageDialog(null,"Menor Número: "+menor);
    }else if((r3<r1)&&(r3<r2)&&(r3<r4)){
        menor=r3;
        JOptionPane.showMessageDialog(null,"Menor Número: "+menor);
    }else if((r4<r1)&&(r4<r2)&&(r4<r3)){
        menor=r4;
        JOptionPane.showMessageDialog(null,"Menor Número: "+menor);
    }
    
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }
    

}
