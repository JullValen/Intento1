/**
 * ServiceStateQueryResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ServiceStateQueryResponseDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.ReturnCode returnCode;

    private java.lang.Boolean serviceAvailabilityIF;

    private java.lang.Boolean serviceAvailabilityRB;

    private java.util.Calendar serviceEndTime;

    private java.util.Calendar serviceStartTime;

    private co.com.tigo.gatewaytigov19.webscp.ws.IdDTO serviceState;

    private co.com.tigo.gatewaytigov19.webscp.ws.IdDTO state;

    public ServiceStateQueryResponseDTO() {
    }

    public ServiceStateQueryResponseDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.ReturnCode returnCode,
           java.lang.Boolean serviceAvailabilityIF,
           java.lang.Boolean serviceAvailabilityRB,
           java.util.Calendar serviceEndTime,
           java.util.Calendar serviceStartTime,
           co.com.tigo.gatewaytigov19.webscp.ws.IdDTO serviceState,
           co.com.tigo.gatewaytigov19.webscp.ws.IdDTO state) {
           this.returnCode = returnCode;
           this.serviceAvailabilityIF = serviceAvailabilityIF;
           this.serviceAvailabilityRB = serviceAvailabilityRB;
           this.serviceEndTime = serviceEndTime;
           this.serviceStartTime = serviceStartTime;
           this.serviceState = serviceState;
           this.state = state;
    }


    /**
     * Gets the returnCode value for this ServiceStateQueryResponseDTO.
     * 
     * @return returnCode
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ReturnCode getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this ServiceStateQueryResponseDTO.
     * 
     * @param returnCode
     */
    public void setReturnCode(co.com.tigo.gatewaytigov19.webscp.ws.ReturnCode returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the serviceAvailabilityIF value for this ServiceStateQueryResponseDTO.
     * 
     * @return serviceAvailabilityIF
     */
    public java.lang.Boolean getServiceAvailabilityIF() {
        return serviceAvailabilityIF;
    }


    /**
     * Sets the serviceAvailabilityIF value for this ServiceStateQueryResponseDTO.
     * 
     * @param serviceAvailabilityIF
     */
    public void setServiceAvailabilityIF(java.lang.Boolean serviceAvailabilityIF) {
        this.serviceAvailabilityIF = serviceAvailabilityIF;
    }


    /**
     * Gets the serviceAvailabilityRB value for this ServiceStateQueryResponseDTO.
     * 
     * @return serviceAvailabilityRB
     */
    public java.lang.Boolean getServiceAvailabilityRB() {
        return serviceAvailabilityRB;
    }


    /**
     * Sets the serviceAvailabilityRB value for this ServiceStateQueryResponseDTO.
     * 
     * @param serviceAvailabilityRB
     */
    public void setServiceAvailabilityRB(java.lang.Boolean serviceAvailabilityRB) {
        this.serviceAvailabilityRB = serviceAvailabilityRB;
    }


    /**
     * Gets the serviceEndTime value for this ServiceStateQueryResponseDTO.
     * 
     * @return serviceEndTime
     */
    public java.util.Calendar getServiceEndTime() {
        return serviceEndTime;
    }


    /**
     * Sets the serviceEndTime value for this ServiceStateQueryResponseDTO.
     * 
     * @param serviceEndTime
     */
    public void setServiceEndTime(java.util.Calendar serviceEndTime) {
        this.serviceEndTime = serviceEndTime;
    }


    /**
     * Gets the serviceStartTime value for this ServiceStateQueryResponseDTO.
     * 
     * @return serviceStartTime
     */
    public java.util.Calendar getServiceStartTime() {
        return serviceStartTime;
    }


    /**
     * Sets the serviceStartTime value for this ServiceStateQueryResponseDTO.
     * 
     * @param serviceStartTime
     */
    public void setServiceStartTime(java.util.Calendar serviceStartTime) {
        this.serviceStartTime = serviceStartTime;
    }


    /**
     * Gets the serviceState value for this ServiceStateQueryResponseDTO.
     * 
     * @return serviceState
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.IdDTO getServiceState() {
        return serviceState;
    }


    /**
     * Sets the serviceState value for this ServiceStateQueryResponseDTO.
     * 
     * @param serviceState
     */
    public void setServiceState(co.com.tigo.gatewaytigov19.webscp.ws.IdDTO serviceState) {
        this.serviceState = serviceState;
    }


    /**
     * Gets the state value for this ServiceStateQueryResponseDTO.
     * 
     * @return state
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.IdDTO getState() {
        return state;
    }


    /**
     * Sets the state value for this ServiceStateQueryResponseDTO.
     * 
     * @param state
     */
    public void setState(co.com.tigo.gatewaytigov19.webscp.ws.IdDTO state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceStateQueryResponseDTO)) return false;
        ServiceStateQueryResponseDTO other = (ServiceStateQueryResponseDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnCode==null && other.getReturnCode()==null) || 
             (this.returnCode!=null &&
              this.returnCode.equals(other.getReturnCode()))) &&
            ((this.serviceAvailabilityIF==null && other.getServiceAvailabilityIF()==null) || 
             (this.serviceAvailabilityIF!=null &&
              this.serviceAvailabilityIF.equals(other.getServiceAvailabilityIF()))) &&
            ((this.serviceAvailabilityRB==null && other.getServiceAvailabilityRB()==null) || 
             (this.serviceAvailabilityRB!=null &&
              this.serviceAvailabilityRB.equals(other.getServiceAvailabilityRB()))) &&
            ((this.serviceEndTime==null && other.getServiceEndTime()==null) || 
             (this.serviceEndTime!=null &&
              this.serviceEndTime.equals(other.getServiceEndTime()))) &&
            ((this.serviceStartTime==null && other.getServiceStartTime()==null) || 
             (this.serviceStartTime!=null &&
              this.serviceStartTime.equals(other.getServiceStartTime()))) &&
            ((this.serviceState==null && other.getServiceState()==null) || 
             (this.serviceState!=null &&
              this.serviceState.equals(other.getServiceState()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        if (getServiceAvailabilityIF() != null) {
            _hashCode += getServiceAvailabilityIF().hashCode();
        }
        if (getServiceAvailabilityRB() != null) {
            _hashCode += getServiceAvailabilityRB().hashCode();
        }
        if (getServiceEndTime() != null) {
            _hashCode += getServiceEndTime().hashCode();
        }
        if (getServiceStartTime() != null) {
            _hashCode += getServiceStartTime().hashCode();
        }
        if (getServiceState() != null) {
            _hashCode += getServiceState().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceStateQueryResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceStateQueryResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "returnCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceAvailabilityIF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceAvailabilityIF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceAvailabilityRB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceAvailabilityRB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "idDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "idDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
