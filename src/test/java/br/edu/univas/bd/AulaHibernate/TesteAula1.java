package br.edu.univas.bd.AulaHibernate;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.edu.univas.bd.util.HibernateUtil;

public class TesteAula1 {

	@Test
	public void testPersistir() {
		
		State mg = new State();
		mg.setSigla("MG");
		mg.setNome("Minas Gerais");
		mg.setIbge(12345);
		mg.setArea(99999);
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(mg);
		em.getTransaction().commit();
		
	}
}
