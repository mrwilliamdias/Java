package revisao;

  public class  Imprimir {
     Aluno aluno1 = new Aluno();
     public Imprimir(){
  }
      public void imprimir(){
        System.out.println("Matriula: "+aluno1.getMatricula());
        System.out.println("Nome: "+aluno1.getNome());
        System.out.println("CPF: "+aluno1.getCpf());
        System.out.println("Data de Nascimento: "+aluno1.getDataNascimento());
        if(aluno1.getSexo()==1){
            System.out.println("Sexo Feminino");
        } else{
            System.out.println("Sexo Masculino");
        }
  }
}   
