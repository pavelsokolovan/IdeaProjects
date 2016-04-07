package ws;

import javax.jws.WebService;

/**
 * Created by psok on 4/1/2016.
 */
@WebService(endpointInterface = "ws.HelloWebService")
public class HelloWebServiceImp implements HelloWebService{
    @Override
    public String getHelloString(String name) {
        return "Hello " + name;
    }
}
