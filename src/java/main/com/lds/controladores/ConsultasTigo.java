package com.lds.controladores;

import java.io.IOException;
import java.util.Properties;

import javax.xml.rpc.ServiceException;

import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;

import com.ibm.OS4690.TerminalApplicationServices;
import com.lds.utils.ManejoConexion;
import com.lds.utils.ManejoXML;
import com.linea.TimeOut.Control_TimeOut;

import co.com.tigo.gatewaytigov19.webscp.ws.ETransferRequestDTO;
import co.com.tigo.gatewaytigov19.webscp.ws.IdDTO;



public class ConsultasTigo {
	
	private static Logger log = Logger.getLogger(ConsultasTigoTest.class);
	
	private static final String VERSION = "1.0.3";
	
	
	
	public ConsultasTigo() {
	//	confLogger();
		System.out.println("[TigoWS] Iniciando constructor de la clase principal ConsultasTigo VERSION: "+VERSION);
		log = Logger.getLogger(ConsultasTigoTest.class);
		log.debug("[TigoWS] Iniciando constructor de la clase principal ConsultasTigo VERSION: "+VERSION);
	}
	
	
	public static void main(String[] args) {	
		
		
	}
	
	
	public String execute(String trama){
		log.debug("[TigoWS] Llamado al Metodo Execute");
		ConsumeTigoWS consume;
		ManejoXML messageFilter;
		String response = "";
		ManejoConexion conexion = new ManejoConexion();
		ETransferRequestDTO parametroRequest;
		parametroRequest = new ETransferRequestDTO();
		try {
			int tiempoEspera = 0;
			tiempoEspera = Integer.parseInt(conexion.getEspera());
			boolean success = false;
			Object obj1 = null;	
			
			
			consume = new ConsumeTigoWS();
			messageFilter = new ManejoXML();
			String[] datos = trama.split(",");			
			String celular = datos[0];
			String paquetes = datos[1];
			String terminal = datos[2];
			String nut = datos[3];
			String conversion = datos[4];
			String tipo = "";
			
			//llena el request
			IdDTO resourceType = new IdDTO();
			tipo = conexion.ExtraerResourceType(conversion);
			resourceType.setId(tipo);
			resourceType.setName("nombre");
			ETransferRequestDTO request = new ETransferRequestDTO();
			Long amount = new Long(paquetes);			
			request.setDestinationMobile(celular);			
			request.setAmountResource(amount);
						
			
			
			request.setResourceType(resourceType);	
			request.setTerminalId(terminal);
			request.setTransactionId(nut);
			// empieza el control timeout
			try {
				log.debug("Intento consulta de credito...");
				Class[] WSParamsType = { ETransferRequestDTO.class };
				Object[] WSParams = { request };
				

				log.debug("Creando Control_Timeout...");
				Control_TimeOut cto = new Control_TimeOut(tiempoEspera, "com.lds.controladores.ConsumeTigoWS",
						"recargarCelular", null, null, WSParamsType, WSParams);
				log.debug("Ejecutando llamado al Web Service con Timeout = " + tiempoEspera);
				obj1 = cto.execute_object();
				

				if (obj1 == null) {
					log.debug("no se obtuvo respuesta del servicio de tigo...");	
					response = "300|error en consulta de servicio||";
				} else {
					log.debug("se obtuvo respuesta del servicio de tigo!");
					response = obj1.toString();
					// no se para que es esto
					success = true;
				}				
			} catch (Throwable e) {				
				log.error("[TigoWS] error "+e.getMessage());
				log.error("Error ejecutando llamado al Web Service: ", e);
				response = "300|error en consulta de servicio||";
			}
			
			//termina el control timeout			
			// consume el metodo de recarga

			
			log.debug("Respuesta recarga "+response);
			
			return response;
		} catch (Exception e) {
			log.debug("error ejecutando excecute!");
			log.error("error ejecutando excecute:" + e.getMessage());
			log.error("error ejecutando excecute!", e);
			response = "300|error en consulta de servicio||";
		}catch (Throwable e) {
			log.debug("error ejecutando excecute!");
			log.error("error ejecutando excecute:" + e.getMessage());
			log.error("error ejecutando excecute!", e);
			response = "300|error en consulta de servicio||";
		}

		return response;
		
	}
	
	
	
	/*
	private void confLogger() {
		log.debug("\n [TigoWS] llego al Logger");
		String consulta = "R::CHIPLOG:chip";
		String consultalog = "R::CHIPLOG:chipe";
		
		String terminal = "";
		try {
			log.debug("[TigoWS] Antes de consultar la terminal");
			terminal = TerminalApplicationServices.getTerminalStatus().getTerminalNumber();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		consulta = consulta + terminal + ".log";
		consultalog = consultalog + terminal + ".log";
		//saffLog = saffLog + terminal + ".log";
		log.debug("\n [TigoWS] antes  de los system.setproperty");
		System.setProperty("chip.log", consulta);
		//System.setProperty("saff.log", saffLog);
		System.setProperty("chipe.log", consultalog);
		
		Properties pro = new Properties();
		try {
			
			pro.load(this.getClass().getResourceAsStream("/log4jChip.properties"));
	
			
		} catch (IOException e) {
			log.error("[TigoWS] Fallo al cargar el archivo de configuracion del Logger");
			e.printStackTrace();
		}
		
		PropertyConfigurator.configure(pro);		

	}
*/

}
