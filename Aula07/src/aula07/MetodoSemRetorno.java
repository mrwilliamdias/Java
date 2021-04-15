
package aula07;


public class MetodoSemRetorno {
    public static void main(String args[]){
        imprimir();
        somar(10,30);
        mostrarSexoPorExtenso('F');
    }
    public static void imprimir(){
        System.out.println("Aula de Java.");
    }
    public static void somar(int a, int b){
        System.out.println("10 + 30 ="+(a + b));
    }
    public static void mostrarSexoPorExtenso(char sexo){
        if(sexo=='F'){
            System.out.println("Feminino");
        } else if(sexo=='M'){
            System.out.println("Masculino");
        } else{
            System.out.println("Sexo Desconhecido");
        }
    }
    
}
