package aula07;

public class MetodoSobrecarga {
    public static void main(String args[]){
        System.out.println("Área de um Quadrado: "+calculadoraArea(5));
        System.out.println("Área de um Retângulo: "+calculadoraArea(3, 5));
        System.out.println("Área de um Cubo: "+calculadoraArea(3, 2 ,5));
    }
    public static double calculadoraArea(int x){
        return(x*x);
    }
    public static double calculadoraArea(int x, int y){
    return(x*y);
    }
    public static double calculadoraArea(int x, int y, int z){
    return(x*y*z);
    }
}