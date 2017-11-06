package br.edu.univas.si8.ta.hello.ejb.interfaces;

public interface Inventory {

	void createNewProduct(String productName);

	String[] listProductNames();

}
