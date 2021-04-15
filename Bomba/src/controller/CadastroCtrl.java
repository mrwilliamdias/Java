package controller;

import javax.swing.JOptionPane;
import model.CadastroDAO;

public class CadastroCtrl {
    public CadastroDAO cdao;
    public String cadastrarFornecedor(String cnpj, String nome, String descricao){
        cdao = new CadastroDAO();
        cdao.fornecedor.setCnpj(cnpj);
        cdao.fornecedor.setNome(nome);
        cdao.fornecedor.setDescricao(descricao);
        return  cdao.inserirFornecedor();
    }
    
    public void excluirFornecedorCtrl(String cnpj){
        cdao = new CadastroDAO();
        cdao.fornecedor.setCnpj(cnpj);
        cdao.excluirFornecedor();
    }
    
    public String editarFornecedorCtrl(String cnpj, String nome, String descricao){
        cdao = new CadastroDAO();
        cdao.fornecedor.setCnpj(cnpj);
        cdao.fornecedor.setNome(nome);
        cdao.fornecedor.setDescricao(descricao);
        return cdao.editarFornecedor();
    }
}
