/**
 * ERechargeRevResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ERechargeRevResponseDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.IdDTO bonusStatus;

    private co.com.tigo.gatewaytigov19.webscp.ws.CreditResponseDTO creditResponse;

    private java.lang.String message;

    private co.com.tigo.gatewaytigov19.webscp.ws.RechargeRevResponseDTO rechargeRevResponse;

    public ERechargeRevResponseDTO() {
    }

    public ERechargeRevResponseDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.IdDTO bonusStatus,
           co.com.tigo.gatewaytigov19.webscp.ws.CreditResponseDTO creditResponse,
           java.lang.String message,
           co.com.tigo.gatewaytigov19.webscp.ws.RechargeRevResponseDTO rechargeRevResponse) {
           this.bonusStatus = bonusStatus;
           this.creditResponse = creditResponse;
           this.message = message;
           this.rechargeRevResponse = rechargeRevResponse;
    }


    /**
     * Gets the bonusStatus value for this ERechargeRevResponseDTO.
     * 
     * @return bonusStatus
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.IdDTO getBonusStatus() {
        return bonusStatus;
    }


    /**
     * Sets the bonusStatus value for this ERechargeRevResponseDTO.
     * 
     * @param bonusStatus
     */
    public void setBonusStatus(co.com.tigo.gatewaytigov19.webscp.ws.IdDTO bonusStatus) {
        this.bonusStatus = bonusStatus;
    }


    /**
     * Gets the creditResponse value for this ERechargeRevResponseDTO.
     * 
     * @return creditResponse
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.CreditResponseDTO getCreditResponse() {
        return creditResponse;
    }


    /**
     * Sets the creditResponse value for this ERechargeRevResponseDTO.
     * 
     * @param creditResponse
     */
    public void setCreditResponse(co.com.tigo.gatewaytigov19.webscp.ws.CreditResponseDTO creditResponse) {
        this.creditResponse = creditResponse;
    }


    /**
     * Gets the message value for this ERechargeRevResponseDTO.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ERechargeRevResponseDTO.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the rechargeRevResponse value for this ERechargeRevResponseDTO.
     * 
     * @return rechargeRevResponse
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.RechargeRevResponseDTO getRechargeRevResponse() {
        return rechargeRevResponse;
    }


    /**
     * Sets the rechargeRevResponse value for this ERechargeRevResponseDTO.
     * 
     * @param rechargeRevResponse
     */
    public void setRechargeRevResponse(co.com.tigo.gatewaytigov19.webscp.ws.RechargeRevResponseDTO rechargeRevResponse) {
        this.rechargeRevResponse = rechargeRevResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERechargeRevResponseDTO)) return false;
        ERechargeRevResponseDTO other = (ERechargeRevResponseDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bonusStatus==null && other.getBonusStatus()==null) || 
             (this.bonusStatus!=null &&
              this.bonusStatus.equals(other.getBonusStatus()))) &&
            ((this.creditResponse==null && other.getCreditResponse()==null) || 
             (this.creditResponse!=null &&
              this.creditResponse.equals(other.getCreditResponse()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.rechargeRevResponse==null && other.getRechargeRevResponse()==null) || 
             (this.rechargeRevResponse!=null &&
              this.rechargeRevResponse.equals(other.getRechargeRevResponse())));
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
        if (getBonusStatus() != null) {
            _hashCode += getBonusStatus().hashCode();
        }
        if (getCreditResponse() != null) {
            _hashCode += getCreditResponse().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getRechargeRevResponse() != null) {
            _hashCode += getRechargeRevResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERechargeRevResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeRevResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "idDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "creditResponseDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeRevResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechargeRevResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "rechargeRevResponseDTO"));
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
