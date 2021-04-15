package aula07;

import javax.swing.JOptionPane;

public class MetodoComRetorno {
    public static void main(String args[]){
        String frase = mostrarFrase(JOptionPane.showInputDialog("Frase: "));
        System.out.println(frase);
        int  = somar(10, 30);
        System.out.println(x);
        boolean resposta = responder();
        if(resposta==true){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }
    }
    
    public static String mostrarFrase(String fraseRecebida){
        return fraseRecebida.trim();
    }
    
    public static int somar(int a, int b){
        return (a+b);
    }

    public static boolean responder(){
        return true;
    }
}
