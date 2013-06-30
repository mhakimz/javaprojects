package org.test;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Message(String name) {
		super();
		this.name = name;
	}

	@Id
	@GeneratedValue
	private Integer id;
	
	@Basic 
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
