/**
 * ReservationCancelResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ReservationCancelResponseDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusReturned;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionReturnedColl;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realReturned;

    private co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralResponseDTO reservationGeneralInfo;

    public ReservationCancelResponseDTO() {
    }

    public ReservationCancelResponseDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusReturned,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionReturnedColl,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realReturned,
           co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralResponseDTO reservationGeneralInfo) {
           this.bonusReturned = bonusReturned;
           this.partitionReturnedColl = partitionReturnedColl;
           this.realReturned = realReturned;
           this.reservationGeneralInfo = reservationGeneralInfo;
    }


    /**
     * Gets the bonusReturned value for this ReservationCancelResponseDTO.
     * 
     * @return bonusReturned
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusReturned() {
        return bonusReturned;
    }


    /**
     * Sets the bonusReturned value for this ReservationCancelResponseDTO.
     * 
     * @param bonusReturned
     */
    public void setBonusReturned(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusReturned) {
        this.bonusReturned = bonusReturned;
    }


    /**
     * Gets the partitionReturnedColl value for this ReservationCancelResponseDTO.
     * 
     * @return partitionReturnedColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionReturnedColl() {
        return partitionReturnedColl;
    }


    /**
     * Sets the partitionReturnedColl value for this ReservationCancelResponseDTO.
     * 
     * @param partitionReturnedColl
     */
    public void setPartitionReturnedColl(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionReturnedColl) {
        this.partitionReturnedColl = partitionReturnedColl;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionReturnedColl(int i) {
        return this.partitionReturnedColl[i];
    }

    public void setPartitionReturnedColl(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionReturnedColl[i] = _value;
    }


    /**
     * Gets the realReturned value for this ReservationCancelResponseDTO.
     * 
     * @return realReturned
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealReturned() {
        return realReturned;
    }


    /**
     * Sets the realReturned value for this ReservationCancelResponseDTO.
     * 
     * @param realReturned
     */
    public void setRealReturned(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realReturned) {
        this.realReturned = realReturned;
    }


    /**
     * Gets the reservationGeneralInfo value for this ReservationCancelResponseDTO.
     * 
     * @return reservationGeneralInfo
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralResponseDTO getReservationGeneralInfo() {
        return reservationGeneralInfo;
    }


    /**
     * Sets the reservationGeneralInfo value for this ReservationCancelResponseDTO.
     * 
     * @param reservationGeneralInfo
     */
    public void setReservationGeneralInfo(co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralResponseDTO reservationGeneralInfo) {
        this.reservationGeneralInfo = reservationGeneralInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationCancelResponseDTO)) return false;
        ReservationCancelResponseDTO other = (ReservationCancelResponseDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bonusReturned==null && other.getBonusReturned()==null) || 
             (this.bonusReturned!=null &&
              this.bonusReturned.equals(other.getBonusReturned()))) &&
            ((this.partitionReturnedColl==null && other.getPartitionReturnedColl()==null) || 
             (this.partitionReturnedColl!=null &&
              java.util.Arrays.equals(this.partitionReturnedColl, other.getPartitionReturnedColl()))) &&
            ((this.realReturned==null && other.getRealReturned()==null) || 
             (this.realReturned!=null &&
              this.realReturned.equals(other.getRealReturned()))) &&
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
        if (getBonusReturned() != null) {
            _hashCode += getBonusReturned().hashCode();
        }
        if (getPartitionReturnedColl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionReturnedColl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionReturnedColl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRealReturned() != null) {
            _hashCode += getRealReturned().hashCode();
        }
        if (getReservationGeneralInfo() != null) {
            _hashCode += getReservationGeneralInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationCancelResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationCancelResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusReturned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusReturned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionReturnedColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionReturnedColl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "partitionDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realReturned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realReturned"));
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
