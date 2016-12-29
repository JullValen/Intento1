package com.lds.controladores;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;



import org.apache.axis.AxisFault;

import com.lds.utils.LectorCodigosError;
import com.lds.utils.ManejoConexion;
import com.lds.utils.ManejoXML;

import co.com.tigo.gatewaytigov19.webscp.ws.BalanceRequestDTO;
import co.com.tigo.gatewaytigov19.webscp.ws.BalanceResponseDTO;
import co.com.tigo.gatewaytigov19.webscp.ws.BusinessException;
import co.com.tigo.gatewaytigov19.webscp.ws.ETransferRequestDTO;
import co.com.tigo.gatewaytigov19.webscp.ws.ETransferResponseDTO;
import co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException;
import co.com.tigo.gatewaytigov19.webscp.ws.GatewayTigoPortTypePortBindingStub;

import org.apache.log4j.Logger;

public class ConsumeTigoWS {
	private static Logger log = Logger.getLogger(ConsumeTigoWS.class);	
	
	public  GatewayTigoPortTypePortBindingStub stubTigo;
	
	Service servicio = null;
	LectorCodigosError codigosError;
	ManejoXML manejoXML;
	
	public ConsumeTigoWS() throws ServiceException {
		log.debug("ejecutando Comsume TigoWS...");
		try {		
			manejoXML = new ManejoXML();
			//ManejoXML messageFilter = new ManejoXML("/xml/confMensajes.xml");
			Service service = null;	
			
			ManejoConexion conexion = new ManejoConexion();
			codigosError = new LectorCodigosError();
			
			String urlWS = conexion.getUrl();
			URL endpoint = new URL(urlWS); 
			
			stubTigo = new GatewayTigoPortTypePortBindingStub(endpoint, service);
			stubTigo.setUsername(conexion.getUser());
			stubTigo.setPassword(conexion.getPassword());
			log.debug("Comsume TigoWS Terminado!");
			
		} catch (AxisFault e) {
			log.error("AxisFault", e);			
		}
		catch(MalformedURLException e){
			log.error("MalformedURLException", e);			
		}
		catch (Exception e) {
			log.error("error", e);
		}
		
	}

	
	

	
	public String recargarCelular(ETransferRequestDTO request){	
		String respuesta = "";
		ETransferResponseDTO recarga = null;
		String respuestaConsulta = "";
		String numeroAutorizacion = "";
		String mensaje = "";
		String codigoMensaje= "";
		String realbalance = "";
		String mensajeTigo = "";		
		log.debug("[TigoWS] metodo de recarga de celular");
		try {
			manejoXML = new ManejoXML();
			recarga = stubTigo.eTransfer(request);	
			numeroAutorizacion = recarga.getAuthorizationNumber().toString();			
			realbalance = recarga.getBalanceClient().getRealBalance().getAmount().toString();
			codigoMensaje = "999";
			mensaje = "OK";
			respuesta = codigoMensaje+"|"+mensaje+"|"+numeroAutorizacion+"|"+realbalance;
			log.debug("[TigoWS] metodo de recarga de celular terminado! con: " + respuesta);
			return respuesta;
		} catch (BusinessException e) {
		//	codigoMensaje = "300";
			mensaje = e.getMessage1();
			codigoMensaje = ExtraerCodigoError(mensaje);
			mensajeTigo = manejoXML.comprobarValores(codigoMensaje);		
			respuesta = "300|"+mensajeTigo+"|"+numeroAutorizacion+"|"+realbalance;
			log.error("BusinessException", e);
			return respuesta;
		} catch (GatewayPrepayWSException e) {
			// TODO Auto-generated catch block
		//	codigoMensaje = "300";
			mensaje = e.getMessage1();
			ExtraerCodigoError(mensaje);
			codigoMensaje = ExtraerCodigoError(mensaje);
			mensajeTigo = manejoXML.comprobarValores(codigoMensaje);
			respuesta = "300|"+mensajeTigo+"|"+numeroAutorizacion+"|"+realbalance;
			log.error("GatewayPrepayWSException", e);
			return respuesta;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			codigoMensaje = "300";
			mensaje = "NOTOK";
			respuesta = codigoMensaje+"|"+mensaje+"|"+numeroAutorizacion+"|"+realbalance;
			log.error("RemoteException", e);
			return respuesta;
		} catch (Exception e) {
			log.debug("error consultando ws o en operacion: " + e.getMessage());
			log.error("error consultando ws o en operacion: " + e.getMessage());
			log.error("error consultando ws o en operacion: ", e);
			respuesta = "300|error consultando ws o en operacion||";
			return respuesta;
		}
		
	}
	
	
	public String ExtraerCodigoError(String mensaje){
		log.debug("mensaje de error del servicio de tigo:"+ mensaje);
		
		String[] errores = codigosError.LeerCodigos();
		log.trace("errores cargados del xml!");
		String CodigoErr = "";
		for (int i = 0; i < errores.length; i++) {
			int index = mensaje.indexOf(errores[i]);
			if (index != -1) {
				CodigoErr = errores[i];
				break;
			}			
		}
		//si no se encuentra codigo, se coloca 0000 por defecto
		if(CodigoErr.equals("")){
			CodigoErr = "0000";
		}
		log.trace("error encontrado: "+ CodigoErr);
		
		return CodigoErr;
	}
	

}
