package org.test;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface HelloWorldService {
	
	public String sayHello(String name);
    public List<Message> findWelcomeHistory();

}
