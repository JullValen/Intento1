/**
 * ERechargeResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ERechargeResponseDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.IdDTO bonusStatus;

    private co.com.tigo.gatewaytigov19.webscp.ws.DebitResponseDTO debitResponse;

    private java.lang.String message;

    private co.com.tigo.gatewaytigov19.webscp.ws.RechargeResponseDTO rechargeResponse;

    public ERechargeResponseDTO() {
    }

    public ERechargeResponseDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.IdDTO bonusStatus,
           co.com.tigo.gatewaytigov19.webscp.ws.DebitResponseDTO debitResponse,
           java.lang.String message,
           co.com.tigo.gatewaytigov19.webscp.ws.RechargeResponseDTO rechargeResponse) {
           this.bonusStatus = bonusStatus;
           this.debitResponse = debitResponse;
           this.message = message;
           this.rechargeResponse = rechargeResponse;
    }


    /**
     * Gets the bonusStatus value for this ERechargeResponseDTO.
     * 
     * @return bonusStatus
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.IdDTO getBonusStatus() {
        return bonusStatus;
    }


    /**
     * Sets the bonusStatus value for this ERechargeResponseDTO.
     * 
     * @param bonusStatus
     */
    public void setBonusStatus(co.com.tigo.gatewaytigov19.webscp.ws.IdDTO bonusStatus) {
        this.bonusStatus = bonusStatus;
    }


    /**
     * Gets the debitResponse value for this ERechargeResponseDTO.
     * 
     * @return debitResponse
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.DebitResponseDTO getDebitResponse() {
        return debitResponse;
    }


    /**
     * Sets the debitResponse value for this ERechargeResponseDTO.
     * 
     * @param debitResponse
     */
    public void setDebitResponse(co.com.tigo.gatewaytigov19.webscp.ws.DebitResponseDTO debitResponse) {
        this.debitResponse = debitResponse;
    }


    /**
     * Gets the message value for this ERechargeResponseDTO.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ERechargeResponseDTO.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the rechargeResponse value for this ERechargeResponseDTO.
     * 
     * @return rechargeResponse
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.RechargeResponseDTO getRechargeResponse() {
        return rechargeResponse;
    }


    /**
     * Sets the rechargeResponse value for this ERechargeResponseDTO.
     * 
     * @param rechargeResponse
     */
    public void setRechargeResponse(co.com.tigo.gatewaytigov19.webscp.ws.RechargeResponseDTO rechargeResponse) {
        this.rechargeResponse = rechargeResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERechargeResponseDTO)) return false;
        ERechargeResponseDTO other = (ERechargeResponseDTO) obj;
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
            ((this.debitResponse==null && other.getDebitResponse()==null) || 
             (this.debitResponse!=null &&
              this.debitResponse.equals(other.getDebitResponse()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.rechargeResponse==null && other.getRechargeResponse()==null) || 
             (this.rechargeResponse!=null &&
              this.rechargeResponse.equals(other.getRechargeResponse())));
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
        if (getDebitResponse() != null) {
            _hashCode += getDebitResponse().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getRechargeResponse() != null) {
            _hashCode += getRechargeResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERechargeResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "idDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "debitResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "debitResponseDTO"));
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
        elemField.setFieldName("rechargeResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechargeResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "rechargeResponseDTO"));
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
