/**
 * ServiceQueryResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ServiceQueryResponseDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.ReturnCode returnCode;

    private co.com.tigo.gatewaytigov19.webscp.ws.IdDTO state;

    private co.com.tigo.gatewaytigov19.webscp.ws.SubscriptionServiceDTO[] subscriptionServicesColl;

    public ServiceQueryResponseDTO() {
    }

    public ServiceQueryResponseDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.ReturnCode returnCode,
           co.com.tigo.gatewaytigov19.webscp.ws.IdDTO state,
           co.com.tigo.gatewaytigov19.webscp.ws.SubscriptionServiceDTO[] subscriptionServicesColl) {
           this.returnCode = returnCode;
           this.state = state;
           this.subscriptionServicesColl = subscriptionServicesColl;
    }


    /**
     * Gets the returnCode value for this ServiceQueryResponseDTO.
     * 
     * @return returnCode
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ReturnCode getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this ServiceQueryResponseDTO.
     * 
     * @param returnCode
     */
    public void setReturnCode(co.com.tigo.gatewaytigov19.webscp.ws.ReturnCode returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the state value for this ServiceQueryResponseDTO.
     * 
     * @return state
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.IdDTO getState() {
        return state;
    }


    /**
     * Sets the state value for this ServiceQueryResponseDTO.
     * 
     * @param state
     */
    public void setState(co.com.tigo.gatewaytigov19.webscp.ws.IdDTO state) {
        this.state = state;
    }


    /**
     * Gets the subscriptionServicesColl value for this ServiceQueryResponseDTO.
     * 
     * @return subscriptionServicesColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.SubscriptionServiceDTO[] getSubscriptionServicesColl() {
        return subscriptionServicesColl;
    }


    /**
     * Sets the subscriptionServicesColl value for this ServiceQueryResponseDTO.
     * 
     * @param subscriptionServicesColl
     */
    public void setSubscriptionServicesColl(co.com.tigo.gatewaytigov19.webscp.ws.SubscriptionServiceDTO[] subscriptionServicesColl) {
        this.subscriptionServicesColl = subscriptionServicesColl;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.SubscriptionServiceDTO getSubscriptionServicesColl(int i) {
        return this.subscriptionServicesColl[i];
    }

    public void setSubscriptionServicesColl(int i, co.com.tigo.gatewaytigov19.webscp.ws.SubscriptionServiceDTO _value) {
        this.subscriptionServicesColl[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceQueryResponseDTO)) return false;
        ServiceQueryResponseDTO other = (ServiceQueryResponseDTO) obj;
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
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.subscriptionServicesColl==null && other.getSubscriptionServicesColl()==null) || 
             (this.subscriptionServicesColl!=null &&
              java.util.Arrays.equals(this.subscriptionServicesColl, other.getSubscriptionServicesColl())));
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSubscriptionServicesColl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriptionServicesColl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriptionServicesColl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceQueryResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceQueryResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "returnCode"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionServicesColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriptionServicesColl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "subscriptionServiceDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
