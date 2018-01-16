package com.alucard;

import java.net.MalformedURLException;

import java.net.URL;


import javax.xml.namespace.QName;


import javax.xml.ws.Service;


import com.alucard.ws.HelloWorld;

/**
 * WS Client
 */
public class App {

  public static void main(String[] args) throws MalformedURLException {
    URL url = new URL("http://localhost:7779/ws/hello?wsdl");

    // According to WSDL XML, use 1st arg service URI and 2nd arg service name
    QName qname = new QName("http://ws.alucard.com/", "HelloWorldImplService");
    Service service = Service.create(url, qname);
    HelloWorld hello = service.getPort(HelloWorld.class);
    System.out.println(hello.getHelloWorldAsString("klk dice - RPC"));
  }
}
