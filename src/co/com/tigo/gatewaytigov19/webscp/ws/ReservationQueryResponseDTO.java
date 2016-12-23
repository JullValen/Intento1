/**
 * ReservationQueryResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ReservationQueryResponseDTO  implements java.io.Serializable {
    private java.lang.String nextReservationId;

    private co.com.tigo.gatewaytigov19.webscp.ws.ReservationQueryResponseItemDTO[] responseItem;

    private co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO returnCode;

    private java.lang.String transactionId;

    public ReservationQueryResponseDTO() {
    }

    public ReservationQueryResponseDTO(
           java.lang.String nextReservationId,
           co.com.tigo.gatewaytigov19.webscp.ws.ReservationQueryResponseItemDTO[] responseItem,
           co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO returnCode,
           java.lang.String transactionId) {
           this.nextReservationId = nextReservationId;
           this.responseItem = responseItem;
           this.returnCode = returnCode;
           this.transactionId = transactionId;
    }


    /**
     * Gets the nextReservationId value for this ReservationQueryResponseDTO.
     * 
     * @return nextReservationId
     */
    public java.lang.String getNextReservationId() {
        return nextReservationId;
    }


    /**
     * Sets the nextReservationId value for this ReservationQueryResponseDTO.
     * 
     * @param nextReservationId
     */
    public void setNextReservationId(java.lang.String nextReservationId) {
        this.nextReservationId = nextReservationId;
    }


    /**
     * Gets the responseItem value for this ReservationQueryResponseDTO.
     * 
     * @return responseItem
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ReservationQueryResponseItemDTO[] getResponseItem() {
        return responseItem;
    }


    /**
     * Sets the responseItem value for this ReservationQueryResponseDTO.
     * 
     * @param responseItem
     */
    public void setResponseItem(co.com.tigo.gatewaytigov19.webscp.ws.ReservationQueryResponseItemDTO[] responseItem) {
        this.responseItem = responseItem;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ReservationQueryResponseItemDTO getResponseItem(int i) {
        return this.responseItem[i];
    }

    public void setResponseItem(int i, co.com.tigo.gatewaytigov19.webscp.ws.ReservationQueryResponseItemDTO _value) {
        this.responseItem[i] = _value;
    }


    /**
     * Gets the returnCode value for this ReservationQueryResponseDTO.
     * 
     * @return returnCode
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this ReservationQueryResponseDTO.
     * 
     * @param returnCode
     */
    public void setReturnCode(co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the transactionId value for this ReservationQueryResponseDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this ReservationQueryResponseDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationQueryResponseDTO)) return false;
        ReservationQueryResponseDTO other = (ReservationQueryResponseDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nextReservationId==null && other.getNextReservationId()==null) || 
             (this.nextReservationId!=null &&
              this.nextReservationId.equals(other.getNextReservationId()))) &&
            ((this.responseItem==null && other.getResponseItem()==null) || 
             (this.responseItem!=null &&
              java.util.Arrays.equals(this.responseItem, other.getResponseItem()))) &&
            ((this.returnCode==null && other.getReturnCode()==null) || 
             (this.returnCode!=null &&
              this.returnCode.equals(other.getReturnCode()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId())));
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
        if (getNextReservationId() != null) {
            _hashCode += getNextReservationId().hashCode();
        }
        if (getResponseItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationQueryResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationQueryResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextReservationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextReservationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationQueryResponseItemDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "returnCodeDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
