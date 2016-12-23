/**
 * BalanceToResourceResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class BalanceToResourceResponseDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.CreditResponseDTO creditResponseDTO;

    private co.com.tigo.gatewaytigov19.webscp.ws.DebitResponseDTO debitResponseDTO;

    public BalanceToResourceResponseDTO() {
    }

    public BalanceToResourceResponseDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.CreditResponseDTO creditResponseDTO,
           co.com.tigo.gatewaytigov19.webscp.ws.DebitResponseDTO debitResponseDTO) {
           this.creditResponseDTO = creditResponseDTO;
           this.debitResponseDTO = debitResponseDTO;
    }


    /**
     * Gets the creditResponseDTO value for this BalanceToResourceResponseDTO.
     * 
     * @return creditResponseDTO
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.CreditResponseDTO getCreditResponseDTO() {
        return creditResponseDTO;
    }


    /**
     * Sets the creditResponseDTO value for this BalanceToResourceResponseDTO.
     * 
     * @param creditResponseDTO
     */
    public void setCreditResponseDTO(co.com.tigo.gatewaytigov19.webscp.ws.CreditResponseDTO creditResponseDTO) {
        this.creditResponseDTO = creditResponseDTO;
    }


    /**
     * Gets the debitResponseDTO value for this BalanceToResourceResponseDTO.
     * 
     * @return debitResponseDTO
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.DebitResponseDTO getDebitResponseDTO() {
        return debitResponseDTO;
    }


    /**
     * Sets the debitResponseDTO value for this BalanceToResourceResponseDTO.
     * 
     * @param debitResponseDTO
     */
    public void setDebitResponseDTO(co.com.tigo.gatewaytigov19.webscp.ws.DebitResponseDTO debitResponseDTO) {
        this.debitResponseDTO = debitResponseDTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BalanceToResourceResponseDTO)) return false;
        BalanceToResourceResponseDTO other = (BalanceToResourceResponseDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creditResponseDTO==null && other.getCreditResponseDTO()==null) || 
             (this.creditResponseDTO!=null &&
              this.creditResponseDTO.equals(other.getCreditResponseDTO()))) &&
            ((this.debitResponseDTO==null && other.getDebitResponseDTO()==null) || 
             (this.debitResponseDTO!=null &&
              this.debitResponseDTO.equals(other.getDebitResponseDTO())));
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
        if (getCreditResponseDTO() != null) {
            _hashCode += getCreditResponseDTO().hashCode();
        }
        if (getDebitResponseDTO() != null) {
            _hashCode += getDebitResponseDTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalanceToResourceResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "balanceToResourceResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditResponseDTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditResponseDTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "creditResponseDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitResponseDTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "debitResponseDTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "debitResponseDTO"));
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
