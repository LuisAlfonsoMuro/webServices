package com.siscom.webservices.WebServices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.springframework.stereotype.Component;

@Component
@WebService(serviceName = "procesarService")
public class ProcesarServiceEndpoint {

    @WebMethod
    public String doObservacion(String observacion) {
        return "+ Recibido: " + observacion;
    }

    @WebMethod
    public String sumar(int x, int y) {
        return Integer.toString(x + y);
    }

}
