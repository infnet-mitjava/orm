package br.edu.infnet.orm.modelo.persistencia;

import java.util.List;

import br.edu.infnet.orm.modelo.entidade.Produto;

public class ProdutoDAO extends JpaDAO<Produto> {

	public List<?> obterComida(){
		return em.createQuery("select p from Comida p ").getResultList();
	}


	public List<?> obterSobremesa(){
		return em.createQuery("select p from Sobremesa p ").getResultList();
	}

	

	public List<Produto> obterProduto(){
		return em.createQuery("select p from Produto p ").getResultList();
	}

	
}
