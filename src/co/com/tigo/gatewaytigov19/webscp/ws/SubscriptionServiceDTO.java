/**
 * SubscriptionServiceDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class SubscriptionServiceDTO  implements java.io.Serializable {
    private java.lang.Integer priority;

    private java.lang.Boolean serviceAvailabilityIF;

    private java.lang.Boolean serviceAvailabilityRB;

    private java.lang.String serviceId;

    private co.com.tigo.gatewaytigov19.webscp.ws.IdDTO serviceState;

    private java.util.Calendar serviceValidityEnd;

    private java.util.Calendar serviceValidityStart;

    public SubscriptionServiceDTO() {
    }

    public SubscriptionServiceDTO(
           java.lang.Integer priority,
           java.lang.Boolean serviceAvailabilityIF,
           java.lang.Boolean serviceAvailabilityRB,
           java.lang.String serviceId,
           co.com.tigo.gatewaytigov19.webscp.ws.IdDTO serviceState,
           java.util.Calendar serviceValidityEnd,
           java.util.Calendar serviceValidityStart) {
           this.priority = priority;
           this.serviceAvailabilityIF = serviceAvailabilityIF;
           this.serviceAvailabilityRB = serviceAvailabilityRB;
           this.serviceId = serviceId;
           this.serviceState = serviceState;
           this.serviceValidityEnd = serviceValidityEnd;
           this.serviceValidityStart = serviceValidityStart;
    }


    /**
     * Gets the priority value for this SubscriptionServiceDTO.
     * 
     * @return priority
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this SubscriptionServiceDTO.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the serviceAvailabilityIF value for this SubscriptionServiceDTO.
     * 
     * @return serviceAvailabilityIF
     */
    public java.lang.Boolean getServiceAvailabilityIF() {
        return serviceAvailabilityIF;
    }


    /**
     * Sets the serviceAvailabilityIF value for this SubscriptionServiceDTO.
     * 
     * @param serviceAvailabilityIF
     */
    public void setServiceAvailabilityIF(java.lang.Boolean serviceAvailabilityIF) {
        this.serviceAvailabilityIF = serviceAvailabilityIF;
    }


    /**
     * Gets the serviceAvailabilityRB value for this SubscriptionServiceDTO.
     * 
     * @return serviceAvailabilityRB
     */
    public java.lang.Boolean getServiceAvailabilityRB() {
        return serviceAvailabilityRB;
    }


    /**
     * Sets the serviceAvailabilityRB value for this SubscriptionServiceDTO.
     * 
     * @param serviceAvailabilityRB
     */
    public void setServiceAvailabilityRB(java.lang.Boolean serviceAvailabilityRB) {
        this.serviceAvailabilityRB = serviceAvailabilityRB;
    }


    /**
     * Gets the serviceId value for this SubscriptionServiceDTO.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this SubscriptionServiceDTO.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceState value for this SubscriptionServiceDTO.
     * 
     * @return serviceState
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.IdDTO getServiceState() {
        return serviceState;
    }


    /**
     * Sets the serviceState value for this SubscriptionServiceDTO.
     * 
     * @param serviceState
     */
    public void setServiceState(co.com.tigo.gatewaytigov19.webscp.ws.IdDTO serviceState) {
        this.serviceState = serviceState;
    }


    /**
     * Gets the serviceValidityEnd value for this SubscriptionServiceDTO.
     * 
     * @return serviceValidityEnd
     */
    public java.util.Calendar getServiceValidityEnd() {
        return serviceValidityEnd;
    }


    /**
     * Sets the serviceValidityEnd value for this SubscriptionServiceDTO.
     * 
     * @param serviceValidityEnd
     */
    public void setServiceValidityEnd(java.util.Calendar serviceValidityEnd) {
        this.serviceValidityEnd = serviceValidityEnd;
    }


    /**
     * Gets the serviceValidityStart value for this SubscriptionServiceDTO.
     * 
     * @return serviceValidityStart
     */
    public java.util.Calendar getServiceValidityStart() {
        return serviceValidityStart;
    }


    /**
     * Sets the serviceValidityStart value for this SubscriptionServiceDTO.
     * 
     * @param serviceValidityStart
     */
    public void setServiceValidityStart(java.util.Calendar serviceValidityStart) {
        this.serviceValidityStart = serviceValidityStart;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriptionServiceDTO)) return false;
        SubscriptionServiceDTO other = (SubscriptionServiceDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.serviceAvailabilityIF==null && other.getServiceAvailabilityIF()==null) || 
             (this.serviceAvailabilityIF!=null &&
              this.serviceAvailabilityIF.equals(other.getServiceAvailabilityIF()))) &&
            ((this.serviceAvailabilityRB==null && other.getServiceAvailabilityRB()==null) || 
             (this.serviceAvailabilityRB!=null &&
              this.serviceAvailabilityRB.equals(other.getServiceAvailabilityRB()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.serviceState==null && other.getServiceState()==null) || 
             (this.serviceState!=null &&
              this.serviceState.equals(other.getServiceState()))) &&
            ((this.serviceValidityEnd==null && other.getServiceValidityEnd()==null) || 
             (this.serviceValidityEnd!=null &&
              this.serviceValidityEnd.equals(other.getServiceValidityEnd()))) &&
            ((this.serviceValidityStart==null && other.getServiceValidityStart()==null) || 
             (this.serviceValidityStart!=null &&
              this.serviceValidityStart.equals(other.getServiceValidityStart())));
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
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getServiceAvailabilityIF() != null) {
            _hashCode += getServiceAvailabilityIF().hashCode();
        }
        if (getServiceAvailabilityRB() != null) {
            _hashCode += getServiceAvailabilityRB().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getServiceState() != null) {
            _hashCode += getServiceState().hashCode();
        }
        if (getServiceValidityEnd() != null) {
            _hashCode += getServiceValidityEnd().hashCode();
        }
        if (getServiceValidityStart() != null) {
            _hashCode += getServiceValidityStart().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriptionServiceDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "subscriptionServiceDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("serviceValidityEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceValidityEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceValidityStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceValidityStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
