package model;

import bd.Conecta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CadastroDAO {
    public Conecta conecta;
    public PreparedStatement pstm;
    public Statement stm;
    public ResultSet resultset;
    public Fornecedor fornecedor;
    public String men;
    
    public CadastroDAO(){
        fornecedor = new Fornecedor();
    }
    
    public void pesquisaSQL(String sql){
        try {
            stm = conecta.conn.createStatement(resultset.TYPE_SCROLL_SENSITIVE,resultset.CONCUR_READ_ONLY);  
            resultset = stm.executeQuery(sql);
        } catch (SQLException erro) {}
    }
    public boolean pesquisaFornecedor(String cnpj){
        try{
            conecta = new Conecta();
            if(conecta.conectarBD()==true){
                String sql = "select * from fornecedor where cnpj = ?";
                pstm = conecta.conn.prepareStatement(sql);
                pstm.setString(1, cnpj);
                resultset = pstm.executeQuery();
                resultset.next();
                fornecedor.setCnpj(resultset.getString(1));
                fornecedor.setNome(resultset.getString(2));
                fornecedor.setDescricao(resultset.getString(3));
                return true;
            }else{
                JOptionPane.showMessageDialog(null,"Problemas na conexão com o BD.");
                return false;
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro de sintaxe: \n" + erro);
            return false;
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro: \n" + erro);
            return false;
        }
    }
    
    
    public String inserirFornecedor(){
        men = "Cadastrado com sucesso";
        try{
            conecta = new Conecta();
            if(conecta.conectarBD() == true) {
                String sql = "insert into fornecedor values (?, ?, ?)";
                pstm = conecta.conn.prepareStatement(sql);
                pstm.setString(1, fornecedor.getCnpj());
                pstm.setString(2, fornecedor.getNome());
                pstm.setString(3, fornecedor.getDescricao());
                pstm.executeUpdate();
                 
            }else{
                men = "Problemas na conexão com o BD.";
            }
            conecta.fecharBD();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro de sintaxe: \n" + erro);
            men = "Não foi possível cadastrar no BD.";
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro: \n" + erro);
            men = "Não foi possível cadastrar no BD.";
        }
        return men;
    }
    
    public void excluirFornecedor(){
        try{
            conecta = new Conecta();
            if(conecta.conectarBD()==true){
                String sql = "delete from fornecedor where cnpj = ?";
                pstm = conecta.conn.prepareStatement(sql);
                pstm.setString(1, fornecedor.getCnpj());
                pstm.executeUpdate();
            }else{
                JOptionPane.showMessageDialog(null,"Problemas na conexão com o BD.");
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro de sintaxe: \n" + erro);
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro: \n" + erro);
        }
        conecta.fecharBD();
    }
    
    public String editarFornecedor(){
        men = "Cadastro atualizado com sucesso.";
        try{
            conecta = new Conecta();
            if(conecta.conectarBD()==true){
                String sql = "update fornecedor set nome = ?, descricao = ? where cnpj = ?";
                pstm = conecta.conn.prepareStatement(sql);
                pstm.setString(1, fornecedor.getNome());
                pstm.setString(2, fornecedor.getDescricao());
                pstm.setString(3, fornecedor.getCnpj());
                pstm.executeUpdate();
            }else{
                men = "Problemas na conexão com o BD.";
                
            }
        }catch(SQLException erro){
            men = "Erro de sintaxe: \n" + erro;
        }catch(Exception erro){
            men = "Erro: \n" + erro;
        }
        conecta.fecharBD();
        return men;
    }
}
