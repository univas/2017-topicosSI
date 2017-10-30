package br.edu.univas.si8.ta.hello.ejb.beans;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.univas.si8.ta.hello.ejb.entities.Product;
import br.edu.univas.si8.ta.hello.ejb.interfaces.CalculatorLocal;
import br.edu.univas.si8.ta.hello.ejb.interfaces.CalculatorRemote;

@Stateless
@Remote(CalculatorRemote.class)
@Local(CalculatorLocal.class)
public class CalculatorBean implements CalculatorLocal, CalculatorRemote {

	@PersistenceContext(unitName = "estoque")
	private EntityManager em;

	@Override
	public int sum(int a, int b) {
		System.out.println("Inside EJB");
		return a + b;
	}

	@Override
	public void saveProduct(String name) {
		Product product = new Product();
		product.setName(name);
		product.setQuantity(0);
		em.persist(product);
	}

}
