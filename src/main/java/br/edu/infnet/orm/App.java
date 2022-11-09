package br.edu.infnet.orm;

import java.util.List;

import br.edu.infnet.orm.modelo.entidade.Comida;
import br.edu.infnet.orm.modelo.entidade.Produto;
import br.edu.infnet.orm.modelo.entidade.Sobremesa;
import br.edu.infnet.orm.modelo.persistencia.ProdutoDAO;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

//		IDAO dao = new ClienteDAO();
//		Cliente cliente = new Cliente("Mg" + "anuel Santos");
//		cliente.setContatos(new ArrayList<>());
//		cliente.getContatos().add(new Contato(TipoContato.EMAIL, "pjoa@gmail.com"));
//		cliente.getContatos().add(new Contato(TipoContato.TELEFONE, "3223235435"));
//		cliente.getContatos().add(new Contato(TipoContato.TELEFONE, "32324423423"));
//    	
//		dao.salvar(cliente);
//    	
//    	List<Cliente> clientes = dao.listaTodos();
//    	System.out.println(clientes);

//    	
//    	for (Cliente cliente : clientes) {
//			System.out.println(cliente.getContatos());
//		}
//    	
		
		ProdutoDAO dao = new ProdutoDAO();
//		Produto produto = new Produto();
//		produto.setCodigo(10);
//		produto.setNome("Suco de Laranja");
//		produto.setValor(12);
//		dao.salvar(produto);
//		Produto produto = dao.obter(1l);
//		System.out.println(produto);
//		List<Produto> listaTodos = dao.listaTodos();
//		System.out.println(listaTodos);
		
//		Sobremesa sobremesa = new Sobremesa();
//		sobremesa.setCodigo(54345);
//		sobremesa.setDoce(true);
//		sobremesa.setInformacao("Icecream");
//		sobremesa.setQuantidade(2);
//		sobremesa.setValor(15);
//		sobremesa.setNome("Sorvete");
		
		Comida comida = new Comida();
		comida.setCodigo(98);
		comida.setNome("Bife");
		comida.setVegano(true);
		
		dao.salvar(comida);
		
		
		Sobremesa sobremesa = new Sobremesa();
		sobremesa.setCodigo(2);
		sobremesa.setDoce(true);
		sobremesa.setInformacao("doce de geleia com goiabada");
		sobremesa.setQuantidade(2);
		sobremesa.setValor(25);
		dao.salvar(sobremesa);
		
		List<Produto> obterPorTipo = (List<Produto>) dao.obterProduto();
		System.out.println(obterPorTipo);
//		
		
	}
}
