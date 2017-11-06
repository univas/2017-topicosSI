package br.edu.univas.si8.ta.hello.ejb.beans;

import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.edu.univas.si8.ta.hello.ejb.dao.ProductDAO;
import br.edu.univas.si8.ta.hello.ejb.entities.Product;
import br.edu.univas.si8.ta.hello.ejb.interfaces.InventoryLocal;
import br.edu.univas.si8.ta.hello.ejb.interfaces.InventoryRemote;

@Stateless
@Local(InventoryLocal.class)
@Remote(InventoryRemote.class)
public class InventoryBean implements InventoryLocal, InventoryRemote {

	@EJB
	private ProductDAO dao;

	@Override
	public void createNewProduct(String productName) {
		Product product = new Product();
		product.setName(productName);
		product.setQuantity(0);
		dao.insert(product);
	}

	@Override
	public String[] listProductNames() {
		return dao.listAll()
				.stream()
				.map(Product::getName)
				.collect(Collectors.toList())
				.toArray(new String[0]);
	}

}
