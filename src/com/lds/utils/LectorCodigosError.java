package com.lds.utils;

import java.util.List;

import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;


public class LectorCodigosError {
	
	private static Logger log = Logger.getLogger(LectorCodigosError.class);
	
	Document doc = null;
	public LectorCodigosError() {
		String conexion = "/xml/CodigosMensajes.xml";
		IniciarDocumento(conexion);		
	}

	private void IniciarDocumento(String documento) {
		
		SAXBuilder builder = new SAXBuilder();
	    try
	    {
	      doc = builder.build(this.getClass().getResourceAsStream(documento));	      
	    }
	    catch (Exception e)
	    {
	    	log.debug("error iniciando documento: " + e.getMessage());
	    	log.error("error iniciando documento: ",e);	      
	    }	    
		
	}
	
	
	public String[] LeerCodigos(){
		Element root = doc.getRootElement();
		List listaCodigos = root.getChildren();
		Element codigo;
		String[] codigos = new String[listaCodigos.size()];
		for (int i = 0; i < listaCodigos.size(); i++) {
			codigo = (Element) listaCodigos.get(i);
			codigos[i] = codigo.getText();
		}
		return codigos;
	}

}
