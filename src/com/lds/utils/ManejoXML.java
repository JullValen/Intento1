package com.lds.utils;

import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class ManejoXML {
	private static Logger log = Logger.getLogger(ManejoXML.class);
	
	Document doc = null;

	public String validateMessage(String message) {
		if (doc == null) {
			iniciarDoc();
		}
		String response = "";
		response = comprobarPatrones(message);
		if (response.equals("")) {
			response = comprobarValores(message);
			if (response.equals("")) {
				response = returnDefault();
			}
		}
		return response;
	}

	private void iniciarDoc() {
		SAXBuilder builder = new SAXBuilder();
		try {
			doc = builder.build(this.getClass().getResourceAsStream("/xml/confMensajes.xml"));
		} catch (Exception e) {
			log.error("error iniciando dom de confMensajes: " + e.getMessage());
			log.error("error iniciando dom de confMensajes: " , e);
		}

	}

	public String comprobarValores(String message) {
		//esto no debe estar aca ni se debe hacer por cada llamado!
		iniciarDoc();
		
		Element root = doc.getRootElement();
		List elementos = root.getChildren("mensaje");
		if (elementos == null || elementos.isEmpty()) {
			return "";
		}
		Iterator it = elementos.iterator();
		while (it.hasNext()) {
			Element mensaje = (Element) it.next();
			Element valores = mensaje.getChild("valores");
			if (valores == null)
				continue;
			List values = valores.getChildren();
			if (values == null || values.isEmpty())
				continue;
			Iterator itValores = values.iterator();
			while (itValores.hasNext()) {
				String toCompare = ((Element) itValores.next()).getText();
				if (toCompare.equalsIgnoreCase(message)) {
					return mensaje.getAttributeValue("value");
				}
			}
		}
		return "";
	}

	private String returnDefault() {
		Element root = doc.getRootElement();
		Element porDefecto = root.getChild("defecto");
		return porDefecto.getAttributeValue("value");
	}

	private String comprobarPatrones(String message) {
		Element root = doc.getRootElement();
		List elementos = root.getChildren("mensaje");
		if (elementos == null || elementos.isEmpty()) {
			return "";
		}
		Iterator it = elementos.iterator();
		while (it.hasNext()) {
			Element mensaje = (Element) it.next();
			Element patrones = mensaje.getChild("patrones");
			if (patrones == null)
				continue;
			List patterns = patrones.getChildren();
			if (patterns == null || patterns.isEmpty())
				continue;
			Iterator itPatrones = patterns.iterator();
			while (itPatrones.hasNext()) {
				Element patron = (Element) itPatrones.next();
				Pattern pattern = Pattern.compile(patron.getText());
				Matcher m = pattern.matcher(message);
				if (m.matches()) {
					return mensaje.getAttributeValue("value");
				}
			}
		}
		return "";
	}
}
