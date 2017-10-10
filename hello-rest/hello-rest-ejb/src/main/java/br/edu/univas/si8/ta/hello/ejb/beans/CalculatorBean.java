package br.edu.univas.si8.ta.hello.ejb.beans;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.edu.univas.si8.ta.hello.ejb.interfaces.CalculatorLocal;
import br.edu.univas.si8.ta.hello.ejb.interfaces.CalculatorRemote;

@Stateless
@Remote(CalculatorRemote.class)
@Local(CalculatorLocal.class)
public class CalculatorBean implements CalculatorLocal, CalculatorRemote {

	@Override
	public int sum(int a, int b) {
		System.out.println("Inside EJB");
		return a + b;
	}

}
