package com.siscom.webservices.WebServices;

import java.util.Arrays;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.springframework.stereotype.Component;

@Component
@WebService(serviceName = "pruebaService")
public class PruebaServiceEndpoint {
    
    @WebMethod
    public String descripcion(){
        return "Web Service de prueba utilizando JAX-WS";
    }
    
    @WebMethod
    public List<String> listHeros(){
        return Arrays.asList("Batman", "Iron Man", "Spiderman", "Thor");
    }
    
}
