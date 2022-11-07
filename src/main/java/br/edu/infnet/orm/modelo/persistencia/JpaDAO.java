package br.edu.infnet.orm.modelo.persistencia;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import br.edu.infnet.orm.modelo.persistencia.imple.JpaUtil;
import jakarta.persistence.EntityManager;

public abstract class JpaDAO<T> implements IDAO<T> {

	protected EntityManager em;
	private Class<T> entityClass;
	
	@SuppressWarnings("unchecked")
	public JpaDAO() {
		ParameterizedType generic = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<T>) generic.getActualTypeArguments()[0];
		em = JpaUtil.createEntityManager();
	}

	public void salvar(T t) {
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
	}

	public void atualizar(T t) {
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
	}

	public void deletar(T t) {
		em.getTransaction().begin();
		em.remove(t);
		em.getTransaction().commit();
	}

	@Override
	public T obter(Long id) {
		return em.find(entityClass, id);
	}

	@Override
	public List<T> listaTodos() {
		return em.createQuery("from "+ entityClass.getName()).getResultList();
	}

}