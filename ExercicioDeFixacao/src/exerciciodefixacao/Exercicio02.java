package exerciciodefixacao;

import java.util.Random;
import javax.swing.JOptionPane;


public class Exercicio02 {

private static int a;
private static int b;

public static void main(String args[]){
    int resultado;
    String jogar;

    jogar = JOptionPane.showInputDialog(null,"Escreva 'jogar' para lançar o primeiro dado.");
    
    if(jogar.equals("jogar")){
    a = (int)(1 + Math.random() * 6);
    System.out.println("Primeiro Dado: "+a);
    } else{
    System.out.println("Ok, tudo bem.");
    }
    jogar = JOptionPane.showInputDialog(null,"Escreva 'jogar' para lançar o segundo dado.");
    
    if(jogar.equals("jogar")){
    b = (int)( 1 + Math.random() * 6);
    System.out.println("Segundo Dado: "+b);
    } else{
    System.out.println("Ok, tudo bem.");
    }
    
    resultado = a + b;
    System.out.println("Soma dos Dados:"+resultado);
}
}