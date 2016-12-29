/**
 * GatewayTigoScpWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class GatewayTigoScpWSLocator extends org.apache.axis.client.Service implements co.com.tigo.gatewaytigov19.webscp.ws.GatewayTigoScpWS {

    public GatewayTigoScpWSLocator() {
    }


    public GatewayTigoScpWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GatewayTigoScpWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GatewayTigoPortTypePort
    private java.lang.String GatewayTigoPortTypePort_address = "http://10.25.65.17:7001/gatewaytigoscpintv19/GatewayTigoScpWSIntV19";

    public java.lang.String getGatewayTigoPortTypePortAddress() {
        return GatewayTigoPortTypePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GatewayTigoPortTypePortWSDDServiceName = "GatewayTigoPortTypePort";

    public java.lang.String getGatewayTigoPortTypePortWSDDServiceName() {
        return GatewayTigoPortTypePortWSDDServiceName;
    }

    public void setGatewayTigoPortTypePortWSDDServiceName(java.lang.String name) {
        GatewayTigoPortTypePortWSDDServiceName = name;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.GatewayTigoPortType getGatewayTigoPortTypePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GatewayTigoPortTypePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGatewayTigoPortTypePort(endpoint);
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.GatewayTigoPortType getGatewayTigoPortTypePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            co.com.tigo.gatewaytigov19.webscp.ws.GatewayTigoPortTypePortBindingStub _stub = new co.com.tigo.gatewaytigov19.webscp.ws.GatewayTigoPortTypePortBindingStub(portAddress, this);
            _stub.setPortName(getGatewayTigoPortTypePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGatewayTigoPortTypePortEndpointAddress(java.lang.String address) {
        GatewayTigoPortTypePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (co.com.tigo.gatewaytigov19.webscp.ws.GatewayTigoPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                co.com.tigo.gatewaytigov19.webscp.ws.GatewayTigoPortTypePortBindingStub _stub = new co.com.tigo.gatewaytigov19.webscp.ws.GatewayTigoPortTypePortBindingStub(new java.net.URL(GatewayTigoPortTypePort_address), this);
                _stub.setPortName(getGatewayTigoPortTypePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GatewayTigoPortTypePort".equals(inputPortName)) {
            return getGatewayTigoPortTypePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayTigoScpWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayTigoPortTypePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GatewayTigoPortTypePort".equals(portName)) {
            setGatewayTigoPortTypePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
