package br.edu.univas.si8.ta.hello.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.univas.si8.ta.hello.ejb.entities.Product;

@Stateless
public class ProductDAO {

	@PersistenceContext(unitName = "estoque")
	private EntityManager em;

	public void insert(Product product) {
		em.persist(product);
	}

	public List<Product> listAll() {
		return em.createQuery("from products p", Product.class).getResultList();
	}

}
