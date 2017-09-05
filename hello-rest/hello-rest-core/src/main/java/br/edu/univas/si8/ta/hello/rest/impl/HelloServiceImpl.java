package br.edu.univas.si8.ta.hello.rest.impl;

import br.edu.univas.si8.ta.hello.rest.api.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return String.format("<h1>Hello %s!!!</h1>", name);
	}

}
