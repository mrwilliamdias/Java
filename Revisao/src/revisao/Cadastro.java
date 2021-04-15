package revisao;

import javax.swing.JOptionPane;

public class Cadastro {
        public static void main(String args[]){
        Imprimir Imprimir = new Imprimir();;
        Imprimir.aluno1.setMatricula(JOptionPane.showInputDialog("Digite a Matricula do Aluno: "));
        Imprimir.aluno1.setNome(JOptionPane.showInputDialog("Digite o Nome do Aluno: "));
        Imprimir.aluno1.setCpf(JOptionPane.showInputDialog("Digite o CPF do Aluno: "));
        Imprimir.aluno1.setDataNascimento(JOptionPane.showInputDialog("Digite a Data de Nascimento do Aluno: "));
        Imprimir.aluno1.setSexo(Integer.parseInt(JOptionPane.showInputDialog("Digite - \n(1)Para Feminino \n(2)Para Masculino\n")));
       
        
        Imprimir.imprimir();
        
        }
}
