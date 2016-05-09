package br.edu.univas.bd.AulaHibernate;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.edu.univas.bd.util.HibernateUtil;

public class Teste2 {

	@Test
	public void testePersistir() {
		
		Departament dp = new Departament();
		
		dp.setName("Departamento 1");
		
		EntityManager em = new HibernateUtil().getEntityManager();
		
		em.getTransaction().begin();
		em.persist(dp);
		em.getTransaction().commit();
		
		System.out.println(dp.getCode());
	}

}
