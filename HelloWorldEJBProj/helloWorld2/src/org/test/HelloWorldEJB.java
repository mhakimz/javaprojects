package org.test;

import java.util.List;

import javax.ejb.Stateless;

@Stateless (name="HelloWorld", mappedName="HelloWorld")
//@Local (HelloWorldService.class)
public class HelloWorldEJB implements HelloWorldService {
	
	/*@PersistenceContext
	protected EntityManager manager;*/

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
//		manager.persist(new Message(name));
		return "Hello " + name + "!";
	}

	@Override
	public List<Message> findWelcomeHistory() {
		// TODO Auto-generated method stub
		return null;
	}

}
