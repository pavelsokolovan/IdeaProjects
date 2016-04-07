package client;

import ws.HelloWebService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Provider;

/**
 * Created by psok on 4/1/2016.
 */
public class HelloWebServiceClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:2001/ws/hello?wsdl");
        QName qName = new QName("http://ws/", "HelloWebServiceImpService");
        Service service = Service.create(url, qName);
        HelloWebService hello = service.getPort(HelloWebService.class);
        System.out.println(hello.getHelloString("Pavel"));
    }
}
