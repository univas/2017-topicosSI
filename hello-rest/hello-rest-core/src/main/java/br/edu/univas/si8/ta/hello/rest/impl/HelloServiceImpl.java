package br.edu.univas.si8.ta.hello.rest.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.edu.univas.si8.ta.hello.ejb.interfaces.Calculator;
import br.edu.univas.si8.ta.hello.rest.api.HelloService;
import br.edu.univas.si8.ta.hello.rest.api.Result;

@RequestScoped
public class HelloServiceImpl implements HelloService {

	@EJB(mappedName = "java:app/hello-rest-ejb-0.1-SNAPSHOT/CalculatorBean!br.edu.univas.si8.ta.hello.ejb.interfaces.CalculatorRemote")
	private Calculator calculator;

	@Override
	public String sayHello(String name) {
		return String.format("<h1>Hello %s!!!</h1>", name);
	}

	@Override
	public Result sum(int a, int b) {
		int result = calculator.sum(a, b);
		return new Result().withA(a).withB(b).withValue(result);
	}

}
