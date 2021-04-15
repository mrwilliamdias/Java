package metodoexternos;
import javax.swing.JOptionPane;


public class DadosDoIMC {
    public static void main(String args[]){
        double imc,altura, peso;
        String resposta;
        
        try{
            altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua Altura: "));
            peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Peso: "));
            CalculadoraIMC cimc = new CalculadoraIMC();
            imc = cimc.CalculadoraIMC(altura, peso);
            System.out.println(imc);
            Condicao cond =  new Condicao();
            resposta = cond.Condicao(imc);
            System.out.println(resposta);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }    
}
