package metodoexternos;

import javax.swing.JOptionPane;

public class Condicao {
    public String Condicao(double imc){
    String resultado = "";
    try{
        if(imc < 18.5){
            resultado = "Abaixo do Peso";
        } else if(imc <= 24.9){
            resultado = "Peso Normal";
        } else if(imc <= 29.9){
            resultado = "Sobrepeso";
        } else if(imc <= 34.9){
            resultado = "Obesidade Grau 1";
        } else if(imc <= 39.9){
            resultado = "Obesidade Grau 2";
        }  else{
            resultado = "Obesidade Grau 3";
        }
    
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
        return resultado; 
    }
}
