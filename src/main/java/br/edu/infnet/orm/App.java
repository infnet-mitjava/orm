package br.edu.infnet.orm;

import br.edu.infnet.orm.modelo.entidade.Produto;
import br.edu.infnet.orm.modelo.entidade.Sobremesa;
import br.edu.infnet.orm.modelo.persistencia.IDAO;
import br.edu.infnet.orm.modelo.persistencia.imple.ProdutoDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	IDAO dao = new ProdutoDAO();
    	
    	Sobremesa sobremesa = new Sobremesa();
    	sobremesa.setCodigo(1);
    	sobremesa.setNome("pudim");
    	sobremesa.setValor(10);
    	sobremesa.setDoce(true);
		dao.salvar(sobremesa);
    	
//    	EntityManager entityManager = JpaUtil.createEntityManager();
//    	
//    	entityManager.getTransaction().begin();
//    	Cliente cliente = entityManager.find(Cliente.class, 1l);
//    	
//    	entityManager.detach(cliente);
//    	
//    	cliente.setNome(cliente.getNome()+ " Madeira");    	
//    	System.out.println(cliente.getNome());
//    	entityManager.getTransaction().commit();
//    	
    	
//    	Query query = entityManager.createQuery("select c from Cliente c");
//    	List<Cliente> clientes = query.getResultList();
//    	System.out.println(clientes.size());
//    	
    	
//    	Cliente cliente = entityManager.find(Cliente.class, 1l);
//    	System.out.println("foi");
    	
    	
    	
//    	Cliente cliente = new Cliente("Mg"
//    			+ "anuel Santos");
//    	cliente.setContatos(new ArrayList<>());
//    	cliente.getContatos().add(new Contato(TipoContato.EMAIL, "pjoa@gmail.com"));    	cliente.getContatos().add(new Contato(TipoContato.TELEFONE, "3223235435"));
//    	cliente.getContatos().add(new Contato(TipoContato.TELEFONE, "32324423423"));
//    	
//		dao.salvar(cliente);
    	
//    	
//    	List<Cliente> clientes = dao.listaTodos();
//    	System.out.println(clientes);
//    	System.out.println(clientes.size());
//    	
//    	
//    	for (Cliente cliente : clientes) {
//			System.out.println(cliente.getContatos());
//		}
    	
    	
    	
    	
    	
    	
    }
}
