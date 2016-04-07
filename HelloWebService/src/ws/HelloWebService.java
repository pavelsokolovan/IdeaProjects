package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by psok on 4/1/2016.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWebService {
    @WebMethod
    String getHelloString(String name);
}
