package br.com.tt.util;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Util {

	private static EntityManager em;

	public static EntityManager em() {
		if (em == null || !em.isOpen()) {
			em = Persistence
					.createEntityManagerFactory("pu_tt")
					.createEntityManager();

		}
		return em;
	}
	
	public static EntityManager iniciarConexao() {
		if (em == null || !em.isOpen()) {
			em = em();
		}
		em.getTransaction().begin();
		return em;
	}
	
	public static void fecharConexao() {
		if (em != null && em.isOpen()) {
			em.getTransaction().commit();
			em.clear();
			em.close();
		}
	}
}
