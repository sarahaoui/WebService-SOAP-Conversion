package Serveur;

import javax.xml.ws.Endpoint;

import Service.Conversion;

public class ServeurJWS {

	public static void main(String[] args) {
		String url="http://localhost:9494/";
		Endpoint.publish(url,new Conversion());
		
		System.out.println(url);

	}

}
