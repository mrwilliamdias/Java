package revisao;


public class Aluno {
    private String matricula;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private int sexo;
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setNome(String nome){
        this.nome = nome;
    }    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public void setSexo(int sexo){
        this.sexo = sexo;
    }

    public String getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getDataNascimento(){
        return dataNascimento;
    }
    public int getSexo(){
        return sexo;
    }
}