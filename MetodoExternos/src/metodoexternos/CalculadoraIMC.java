package metodoexternos;

import javax.swing.JOptionPane;


public class CalculadoraIMC {
    public double CalculadoraIMC(double altura, double peso){
        double imc = 0;
        try{
            imc = peso/(altura*altura);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return imc;
    }
}
