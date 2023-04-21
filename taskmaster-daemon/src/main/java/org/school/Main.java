package org.school;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;
import org.school.server.XmlRpcConnectionHandler;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException, XmlRpcException {
		WebServer server = new WebServer(8080);

		XmlRpcServer xmlRpcServer = server.getXmlRpcServer();
		PropertyHandlerMapping handlerMapping = new PropertyHandlerMapping();
		handlerMapping.addHandler("MyHandler", XmlRpcConnectionHandler.class);
		xmlRpcServer.setHandlerMapping(handlerMapping);

		server.start();
	}
}