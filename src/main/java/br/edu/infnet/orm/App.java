package br.edu.infnet.orm;

import java.util.List;

import br.edu.infnet.orm.modelo.entidade.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
//    	em.getTransaction().begin();
//    	Cliente cliente = new Cliente("Mariza dos Santos");
//    	cliente.setContatos(new ArrayList<>());
//    	cliente.getContatos().add(new Contato("telefone", "1234566"));
//    	cliente.getContatos().add(new Contato("email", "mariza@gmail.com"));
//    	cliente.getContatos().add(new Contato("telefone", "543535353543"));
//    	em.persist(cliente);
//    	em.getTransaction().commit();
//    	
    	List<Cliente> clientes  = em.createQuery("select c from Cliente c").getResultList();
    	System.out.println(clientes.size());
//    	Cliente cliente = em.find(Cliente.class, 102L);
    	System.out.println(clientes);
//    	System.out.println("já chamou o select");
//    	System.out.println(cliente.getContatos());
    	
    	
    	
    	
    }
}
