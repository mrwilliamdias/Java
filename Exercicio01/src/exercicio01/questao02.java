package exercicio01;
import java.util.Scanner;

public class questao02 {
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
            
            if ((media >= 5) && (media < 7)){
                System.out.println("Aluno de RECUPERACAO");
            }else if(media >= 7){
                System.out.println("Aluno AROVADO");
            }else{
                System.out.println("Aluno REPROVADO");
            }
        } catch (Exception erro){
            System.out.println("Digite Apenas números\n." + erro);
        }
    }
        
}
