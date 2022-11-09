package ifpr.pgua.eic.vendinha2022.model.repositories;

import java.util.List;

import ifpr.pgua.eic.vendinha2022.model.FabricaConexao;
import ifpr.pgua.eic.vendinha2022.model.daos.ClienteDAO;
import ifpr.pgua.eic.vendinha2022.model.daos.ProdutoDAO;
import ifpr.pgua.eic.vendinha2022.model.entities.Cliente;
import ifpr.pgua.eic.vendinha2022.model.entities.Produto;
import ifpr.pgua.eic.vendinha2022.model.results.Result;

public class ProdutoRepositorio {
    

        private ProdutoDAO dao;
    
        public ProdutoRepositorio(FabricaConexao fabricaConexao) {
            this.dao = (ProdutoDAO) fabricaConexao;
        }
    
        public Result cadastar(String nome, String descricao, double valor, double quantidade){
    
            Produto produto = new Produto(nome,descricao,valor,quantidade);
            
            return dao.criar(produto);
    
        }
    
        public Result atualizar(int id, String nome, String descricao, double valor, double quantidade){
    
            Produto produto = new Produto(nome, descricao, valor, quantidade);
    
            return dao.atualizar(id, produto);
        }
    
        public List<Produto> listar(){
            return dao.buscarTodos();
        }

        public Result adicionarProduto(String nome, String descricao, double valor, double quantidade) {
            return null;
        }

        public Produto getProdutos() {
            return null;
        }
    
        
    }
    
    
