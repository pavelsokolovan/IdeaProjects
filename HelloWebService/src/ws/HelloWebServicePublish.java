package ws;

import javax.xml.ws.Endpoint;

public class HelloWebServicePublish {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:2001/ws/hello", new HelloWebServiceImp());
    }
}
