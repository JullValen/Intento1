package com.lds.utils;


import java.util.List;

import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class ManejoConexion {
	private static Logger log = Logger.getLogger(ManejoConexion.class);
	
	Document doc = null;
	String password = "";
	String user = "";
	String url = "";
	String espera = "";
	
	
	public static final String PROTOCOLO = "http://";
	
	public ManejoConexion() {
		String documento = "/xml/Conexion.xml";
		log.debug("[ManejoConexion] constructor clase conexion");
		IniciarDocumento(documento);		
		ExtraerDatosCon();
	}

	
	public void IniciarDocumento(String documento){
		SAXBuilder builder = new SAXBuilder();
	    try
	    {
	      doc = builder.build(this.getClass().getResourceAsStream(documento));
	      
	    }
	    catch (JDOMException e)
	    {
	      
	      e.printStackTrace();
	    }
	}
	
	public void ExtraerDatosCon(){
		Element root = doc.getRootElement();
		Element uri = root.getChild("a");
		String ip = uri.getAttributeValue("ip");
	    String puerto = uri.getAttributeValue("puerto");
	    String ruta = uri.getAttributeValue("ruta");
	    espera = uri.getAttributeValue("espera");
	    url = PROTOCOLO + ip + ":" + puerto + "/" + ruta;
	    user = root.getChildText("usuario").trim();
	    password = root.getChildText("password").trim();
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	public String getEspera() {
		return espera;
	}


	public void setEspera(String espera) {
		this.espera = espera;
	}


	public String ExtraerResourceType(String conversionRT){
		Element root = doc.getRootElement();
		Element resourceTypeList = root.getChild("ResourceTypeList");
		List lista;
		Element resourceType;
		String tipoRT = "";
		String conversion;
		lista = resourceTypeList.getChildren("ResourceType");
		for (int i = 0; i < lista.size(); i++) {
			resourceType = (Element) lista.get(i);
			conversion = resourceType.getChildText("conversion");
			tipoRT = resourceType.getChildText("tipo");
			log.debug("conversion en "+i+" es "+conversion);
			log.debug("typeId en "+i+" es "+tipoRT);
			if (conversion.equals(conversionRT) ) {
				tipoRT = resourceType.getChildText("tipo");
				log.debug("[ManejoConexion] id resourceType: "+tipoRT);
				return tipoRT;				
			}		
			
		}
		
		return tipoRT;
	}
	
	

}
