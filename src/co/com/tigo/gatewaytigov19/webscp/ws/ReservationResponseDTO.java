/**
 * ReservationResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ReservationResponseDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusReserved;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionReserved;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realReserved;

    private co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralResponseDTO reservationGeneralInfo;

    public ReservationResponseDTO() {
    }

    public ReservationResponseDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusReserved,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionReserved,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realReserved,
           co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralResponseDTO reservationGeneralInfo) {
           this.bonusReserved = bonusReserved;
           this.partitionReserved = partitionReserved;
           this.realReserved = realReserved;
           this.reservationGeneralInfo = reservationGeneralInfo;
    }


    /**
     * Gets the bonusReserved value for this ReservationResponseDTO.
     * 
     * @return bonusReserved
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusReserved() {
        return bonusReserved;
    }


    /**
     * Sets the bonusReserved value for this ReservationResponseDTO.
     * 
     * @param bonusReserved
     */
    public void setBonusReserved(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusReserved) {
        this.bonusReserved = bonusReserved;
    }


    /**
     * Gets the partitionReserved value for this ReservationResponseDTO.
     * 
     * @return partitionReserved
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionReserved() {
        return partitionReserved;
    }


    /**
     * Sets the partitionReserved value for this ReservationResponseDTO.
     * 
     * @param partitionReserved
     */
    public void setPartitionReserved(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionReserved) {
        this.partitionReserved = partitionReserved;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionReserved(int i) {
        return this.partitionReserved[i];
    }

    public void setPartitionReserved(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionReserved[i] = _value;
    }


    /**
     * Gets the realReserved value for this ReservationResponseDTO.
     * 
     * @return realReserved
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealReserved() {
        return realReserved;
    }


    /**
     * Sets the realReserved value for this ReservationResponseDTO.
     * 
     * @param realReserved
     */
    public void setRealReserved(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realReserved) {
        this.realReserved = realReserved;
    }


    /**
     * Gets the reservationGeneralInfo value for this ReservationResponseDTO.
     * 
     * @return reservationGeneralInfo
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralResponseDTO getReservationGeneralInfo() {
        return reservationGeneralInfo;
    }


    /**
     * Sets the reservationGeneralInfo value for this ReservationResponseDTO.
     * 
     * @param reservationGeneralInfo
     */
    public void setReservationGeneralInfo(co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralResponseDTO reservationGeneralInfo) {
        this.reservationGeneralInfo = reservationGeneralInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationResponseDTO)) return false;
        ReservationResponseDTO other = (ReservationResponseDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bonusReserved==null && other.getBonusReserved()==null) || 
             (this.bonusReserved!=null &&
              this.bonusReserved.equals(other.getBonusReserved()))) &&
            ((this.partitionReserved==null && other.getPartitionReserved()==null) || 
             (this.partitionReserved!=null &&
              java.util.Arrays.equals(this.partitionReserved, other.getPartitionReserved()))) &&
            ((this.realReserved==null && other.getRealReserved()==null) || 
             (this.realReserved!=null &&
              this.realReserved.equals(other.getRealReserved()))) &&
            ((this.reservationGeneralInfo==null && other.getReservationGeneralInfo()==null) || 
             (this.reservationGeneralInfo!=null &&
              this.reservationGeneralInfo.equals(other.getReservationGeneralInfo())));
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
        if (getBonusReserved() != null) {
            _hashCode += getBonusReserved().hashCode();
        }
        if (getPartitionReserved() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionReserved());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionReserved(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRealReserved() != null) {
            _hashCode += getRealReserved().hashCode();
        }
        if (getReservationGeneralInfo() != null) {
            _hashCode += getReservationGeneralInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusReserved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusReserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionReserved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionReserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "partitionDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realReserved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realReserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationGeneralInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reservationGeneralInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationGeneralResponseDTO"));
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
