/**
 * ReservationUseRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ReservationUseRequestDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralRequestDTO reservationGeneralInfo;

    private java.lang.String reservationId;

    private int usageType;

    public ReservationUseRequestDTO() {
    }

    public ReservationUseRequestDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralRequestDTO reservationGeneralInfo,
           java.lang.String reservationId,
           int usageType) {
           this.reservationGeneralInfo = reservationGeneralInfo;
           this.reservationId = reservationId;
           this.usageType = usageType;
    }


    /**
     * Gets the reservationGeneralInfo value for this ReservationUseRequestDTO.
     * 
     * @return reservationGeneralInfo
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralRequestDTO getReservationGeneralInfo() {
        return reservationGeneralInfo;
    }


    /**
     * Sets the reservationGeneralInfo value for this ReservationUseRequestDTO.
     * 
     * @param reservationGeneralInfo
     */
    public void setReservationGeneralInfo(co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralRequestDTO reservationGeneralInfo) {
        this.reservationGeneralInfo = reservationGeneralInfo;
    }


    /**
     * Gets the reservationId value for this ReservationUseRequestDTO.
     * 
     * @return reservationId
     */
    public java.lang.String getReservationId() {
        return reservationId;
    }


    /**
     * Sets the reservationId value for this ReservationUseRequestDTO.
     * 
     * @param reservationId
     */
    public void setReservationId(java.lang.String reservationId) {
        this.reservationId = reservationId;
    }


    /**
     * Gets the usageType value for this ReservationUseRequestDTO.
     * 
     * @return usageType
     */
    public int getUsageType() {
        return usageType;
    }


    /**
     * Sets the usageType value for this ReservationUseRequestDTO.
     * 
     * @param usageType
     */
    public void setUsageType(int usageType) {
        this.usageType = usageType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationUseRequestDTO)) return false;
        ReservationUseRequestDTO other = (ReservationUseRequestDTO) obj;
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
            this.usageType == other.getUsageType();
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
        _hashCode += getUsageType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationUseRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationUseRequestDTO"));
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
        elemField.setFieldName("usageType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
