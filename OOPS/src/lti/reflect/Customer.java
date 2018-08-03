package lti.reflect;

import java.security.BasicPermission;

public class Customer {
	private String name;

	public Customer() {

	}

	public Customer(String name) {
		super();
		this.name = name;
	}

	private void print() {
		
		//SecurityManager mgr=new SecurityManager();
		//mgr.checkPermission(new BasicPermission("Stay Away") {});
		System.out.println("Name:" + name);
	}

	public String toString() {
		return "name:" + name;
	}
}
