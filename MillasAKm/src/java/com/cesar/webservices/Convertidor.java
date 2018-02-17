package com.cesar.webservices;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
@WebService(serviceName = "Convertidor")
public class Convertidor {

    @WebMethod(operationName = "millasakilometros")
    public double millasakilometros(@WebParam(name = "millas") double millas) {        
        return millas * 1.60934;
    }

    @WebMethod(operationName = "kilometrosamillas")
    public double kilometrosamillas(@WebParam(name = "kilometros") double kilometros) {        
        return kilometros / 1.60934;
    }

}
