package com.alucard.ws;

import javax.jws.WebService;


@WebService(endpointInterface = "com.alucard.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

  public String getHelloWorldAsString(String name) {
    return "Hello World JAX-WS " + name;
  }
}
