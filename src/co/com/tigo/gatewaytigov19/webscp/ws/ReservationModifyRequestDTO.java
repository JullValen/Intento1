/**
 * ReservationModifyRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ReservationModifyRequestDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralRequestDTO reservationGeneralInfo;

    private java.lang.String reservationId;

    private java.util.Calendar validUntil;

    public ReservationModifyRequestDTO() {
    }

    public ReservationModifyRequestDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralRequestDTO reservationGeneralInfo,
           java.lang.String reservationId,
           java.util.Calendar validUntil) {
           this.reservationGeneralInfo = reservationGeneralInfo;
           this.reservationId = reservationId;
           this.validUntil = validUntil;
    }


    /**
     * Gets the reservationGeneralInfo value for this ReservationModifyRequestDTO.
     * 
     * @return reservationGeneralInfo
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralRequestDTO getReservationGeneralInfo() {
        return reservationGeneralInfo;
    }


    /**
     * Sets the reservationGeneralInfo value for this ReservationModifyRequestDTO.
     * 
     * @param reservationGeneralInfo
     */
    public void setReservationGeneralInfo(co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralRequestDTO reservationGeneralInfo) {
        this.reservationGeneralInfo = reservationGeneralInfo;
    }


    /**
     * Gets the reservationId value for this ReservationModifyRequestDTO.
     * 
     * @return reservationId
     */
    public java.lang.String getReservationId() {
        return reservationId;
    }


    /**
     * Sets the reservationId value for this ReservationModifyRequestDTO.
     * 
     * @param reservationId
     */
    public void setReservationId(java.lang.String reservationId) {
        this.reservationId = reservationId;
    }


    /**
     * Gets the validUntil value for this ReservationModifyRequestDTO.
     * 
     * @return validUntil
     */
    public java.util.Calendar getValidUntil() {
        return validUntil;
    }


    /**
     * Sets the validUntil value for this ReservationModifyRequestDTO.
     * 
     * @param validUntil
     */
    public void setValidUntil(java.util.Calendar validUntil) {
        this.validUntil = validUntil;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationModifyRequestDTO)) return false;
        ReservationModifyRequestDTO other = (ReservationModifyRequestDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reservationGeneralInfo==null && other.getReservationGeneralInfo()==null) || 
             (this.reservationGeneralInfo!=null &&
              this.reservationGeneralInfo.equals(other.getReservationGeneralInfo()))) &&
            ((this.reservationId==null && other.getReservationId()==null) || 
             (this.reservationId!=null &&
              this.reservationId.equals(other.getReservationId()))) &&
            ((this.validUntil==null && other.getValidUntil()==null) || 
             (this.validUntil!=null &&
              this.validUntil.equals(other.getValidUntil())));
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
        if (getReservationGeneralInfo() != null) {
            _hashCode += getReservationGeneralInfo().hashCode();
        }
        if (getReservationId() != null) {
            _hashCode += getReservationId().hashCode();
        }
        if (getValidUntil() != null) {
            _hashCode += getValidUntil().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationModifyRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationModifyRequestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationGeneralInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reservationGeneralInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationGeneralRequestDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reservationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validUntil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validUntil"));
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
