package br.edu.infnet.orm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

import br.edu.infnet.orm.modelo.entidade.Cliente;
import br.edu.infnet.orm.modelo.entidade.Contato;
import br.edu.infnet.orm.modelo.entidade.TipoContato;
import br.edu.infnet.orm.modelo.persistencia.JpaUtil;
import jakarta.persistence.EntityManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManager em = JpaUtil.getEntityManager();
    	em.getTransaction().begin();
    	Cliente cliente = new Cliente("Mariza dos Santos");
    	cliente.setContatos(new ArrayList<Contato>());
    	cliente.getContatos().add(new Contato(TipoContato.TELEFONE, "1234566"));
    	cliente.getContatos().add(new Contato(TipoContato.EMAIL, "mariza@gmail.com"));
    	cliente.getContatos().add(new Contato(TipoContato.TELEFONE, "543535353543"));
    	cliente.setDataNascimento(LocalDate.parse("19730304", DateTimeFormatter.BASIC_ISO_DATE));
    	em.persist(cliente);
    	em.getTransaction().commit();
//    	
//    	List<Cliente> clientes  = em.createQuery("select c from Cliente c").getResultList();
//    	System.out.println(clientes.size());
//    	
//    	Cliente cliente = em.find(Cliente.class, 102L);
//    	cliente.setNome("Novidade");
//    	
//    	System.out.println(cliente.getNome());
//    	System.out.println("já chamou o select");
//    	System.out.println(cliente.getContatos());
    	
//    	em.getTransaction().commit();
    	
    	
    }
}
