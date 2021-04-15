package aula07;

import javax.swing.JOptionPane;

public class Aula07 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Forneça uma frase");
        int tamanho = frase.length();
        System.out.println("Frase:"+frase+"\n Quantidade de Caracteres: "+tamanho);
        
        System.out.println("4º caractere da Frase: "+frase.charAt(3));
        
        System.out.println("Frase em Maiúscluo: "+ frase.toUpperCase());
        
        System.out.println("Frase em Minúsculo: "+frase.toLowerCase());
       
        System.out.println("Parte da Frase a partir do 10º Caractere: "+frase.substring(10));
        
        System.out.println("Parte da Frase a partir do 5º Caractere: "+frase.substring(5, 10));
        
        System.out.println("Frase sem trim: "+frase+"\nFrase com o trim: "+frase.trim()+"\nQuantidade de caracteres: "+frase.trim().length());
   
        System.out.println("Frase com replace: "+frase.replace(" ","-"));
        
        int a = 10;
        double b = 9.55;
        long c = 1999;
        float d = 30.45f;

        System.out.println("a: "+ String.valueOf(a));
        System.out.println("b: "+ String.valueOf(b));
        System.out.println("c: "+ String.valueOf(c));
        System.out.println("d: "+ String.valueOf(d));
        
        System.out.println("Posição da Palavra Perdeu"+ frase.indexOf("perdeu"));
        System.out.println("Posição da Palavra Ganhou"+ frase.indexOf("ganhou"));
    }
    
}
