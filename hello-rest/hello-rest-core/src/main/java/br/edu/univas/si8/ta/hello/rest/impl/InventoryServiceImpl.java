package br.edu.univas.si8.ta.hello.rest.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.edu.univas.si8.ta.hello.ejb.interfaces.Inventory;
import br.edu.univas.si8.ta.hello.rest.api.InventoryService;

@RequestScoped
public class InventoryServiceImpl implements InventoryService {

	@EJB(mappedName = "java:app/hello-rest-ejb-0.1-SNAPSHOT/InventoryBean!br.edu.univas.si8.ta.hello.ejb.interfaces.InventoryRemote")
	private Inventory inventory;

	@Override
	public String[] listProductNames() {
		return inventory.listProductNames();
	}

	@Override
	public String saveNewProduct(String name) {
		inventory.createNewProduct(name);
		return "{\"message\": \"Success\"}";
	}

}
