package exercicio01;
import java.util.Scanner;

public class questao04 {
    public static void main(String args[]){
        int escolha; Scanner sc;
       for(int i=1; i==1;){ 
           System.out.println("Selecione:\n(1)-Para Chocolate\n(2)-Para Morango\n(3)-Para Açai\n(4)-Para Toranja");
            sc = new Scanner(System.in);
            escolha = sc.nextInt(); 
            switch(escolha){
                case 1:
                System.out.println("Você escolheu o sabor CHOCOLATE\nValor: R$ 2,50 (Cada Bola)");
                break;
                case 2:
                System.out.println("Você escolheu o sabor MORANGO\nValor: R$ 1,99 (Cada Bola)");
                break;
                case 3:
                System.out.println("Você escolheu o sabor AÇAI\nValor: R$ 3,00 (Cada Bola)");
                break;
                case 4:
                System.out.println("Você escolheu o sabor TORANJA\nValor: R$ 2,99 (Cada Bola)");
                break;
                default:
                System.out.println("Número não identificado");
            }
                System.out.println("Você deseja continuar?\n(1)-Para Sim\n(2)-Para Não");
                sc = new Scanner(System.in);
                i = sc.nextInt();
        }
    }
}
