package exercicio01;
import java.util.Scanner;

public class questao01 {
    public static void main(String args[]){
        double a1, a2, a3, media; Scanner sc;
        
        try {
            System.out.println("Digite a Primeira Nota:");
            sc = new Scanner(System.in);
            a1 = sc.nextDouble();
            
            System.out.println("Digite a Segunda Nota:");
            sc = new Scanner(System.in);
            a2 = sc.nextDouble();
            
            System.out.println("Digite a Terceira Nota:");
            sc = new Scanner(System.in);
            a3 = sc.nextDouble();
            
            media = (a1+a2+a3)/3;
            System.out.println("Media das Notas:" + media);
        } catch (Exception erro){
            System.out.println("Digite Apenas números\n." + erro);
        }
    }
        
}
