package Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;



@WebService(serviceName ="ConversionWS")
public class Conversion {
	
    @WebMethod(operationName = "ConversionEuroToDinar")
	public double conversionEuroDinar(@WebParam(name="Montant") double mt) {
		return mt*157.59;
	}
    @WebMethod(operationName = "ConversionDollarToDinar")
	public double conversionDollarDinar (@WebParam(name="Montant") double mt) {
    	return mt*138.97;
	}
   
}
