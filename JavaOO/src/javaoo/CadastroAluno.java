package javaoo;


public class CadastroAluno {
    public static void main(String args[]){
        Aluno aluno1 = new Aluno();
        aluno1.setMatricula("M0001");
        aluno1.setNome("Cláudia Pereira");
        aluno1.setEmail("Cláudia@gmail.com");
        aluno1.setCpf("111.222.333.444-55");
        aluno1.setDataNascimento("10/02/2000");
        aluno1.setSexo(1);
        
        System.out.println(aluno1.getMatricula());
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getEmail());
        System.out.println(aluno1.getCpf());
        System.out.println(aluno1.getDataNascimento());
        System.out.println(aluno1.getSexo());
    }
}
