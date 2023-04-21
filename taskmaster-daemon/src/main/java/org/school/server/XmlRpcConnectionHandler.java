package org.school.server;

public class XmlRpcConnectionHandler {
	public String sayHello(String name) {
		System.out.println("Server got message");
		return "Hello, " + name + "!";
	}
}
