package org.school;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws XmlRpcException, MalformedURLException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:8080"));

        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        String result = (String) client.execute("MyHandler.sayHello", new Object[] { "World" });
        System.out.println(result);
    }
}