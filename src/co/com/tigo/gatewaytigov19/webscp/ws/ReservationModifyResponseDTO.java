/**
 * ReservationModifyResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ReservationModifyResponseDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusChange;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusReserved;

    private int numberOfEvents;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionChangeColl;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionReservedColl;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realChange;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realReserved;

    private co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralResponseDTO reservationGeneralInfo;

    private java.util.Calendar validUntil;

    public ReservationModifyResponseDTO() {
    }

    public ReservationModifyResponseDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusChange,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusReserved,
           int numberOfEvents,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionChangeColl,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionReservedColl,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realChange,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realReserved,
           co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralResponseDTO reservationGeneralInfo,
           java.util.Calendar validUntil) {
           this.bonusChange = bonusChange;
           this.bonusReserved = bonusReserved;
           this.numberOfEvents = numberOfEvents;
           this.partitionChangeColl = partitionChangeColl;
           this.partitionReservedColl = partitionReservedColl;
           this.realChange = realChange;
           this.realReserved = realReserved;
           this.reservationGeneralInfo = reservationGeneralInfo;
           this.validUntil = validUntil;
    }


    /**
     * Gets the bonusChange value for this ReservationModifyResponseDTO.
     * 
     * @return bonusChange
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusChange() {
        return bonusChange;
    }


    /**
     * Sets the bonusChange value for this ReservationModifyResponseDTO.
     * 
     * @param bonusChange
     */
    public void setBonusChange(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusChange) {
        this.bonusChange = bonusChange;
    }


    /**
     * Gets the bonusReserved value for this ReservationModifyResponseDTO.
     * 
     * @return bonusReserved
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusReserved() {
        return bonusReserved;
    }


    /**
     * Sets the bonusReserved value for this ReservationModifyResponseDTO.
     * 
     * @param bonusReserved
     */
    public void setBonusReserved(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusReserved) {
        this.bonusReserved = bonusReserved;
    }


    /**
     * Gets the numberOfEvents value for this ReservationModifyResponseDTO.
     * 
     * @return numberOfEvents
     */
    public int getNumberOfEvents() {
        return numberOfEvents;
    }


    /**
     * Sets the numberOfEvents value for this ReservationModifyResponseDTO.
     * 
     * @param numberOfEvents
     */
    public void setNumberOfEvents(int numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }


    /**
     * Gets the partitionChangeColl value for this ReservationModifyResponseDTO.
     * 
     * @return partitionChangeColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionChangeColl() {
        return partitionChangeColl;
    }


    /**
     * Sets the partitionChangeColl value for this ReservationModifyResponseDTO.
     * 
     * @param partitionChangeColl
     */
    public void setPartitionChangeColl(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionChangeColl) {
        this.partitionChangeColl = partitionChangeColl;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionChangeColl(int i) {
        return this.partitionChangeColl[i];
    }

    public void setPartitionChangeColl(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionChangeColl[i] = _value;
    }


    /**
     * Gets the partitionReservedColl value for this ReservationModifyResponseDTO.
     * 
     * @return partitionReservedColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionReservedColl() {
        return partitionReservedColl;
    }


    /**
     * Sets the partitionReservedColl value for this ReservationModifyResponseDTO.
     * 
     * @param partitionReservedColl
     */
    public void setPartitionReservedColl(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionReservedColl) {
        this.partitionReservedColl = partitionReservedColl;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionReservedColl(int i) {
        return this.partitionReservedColl[i];
    }

    public void setPartitionReservedColl(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionReservedColl[i] = _value;
    }


    /**
     * Gets the realChange value for this ReservationModifyResponseDTO.
     * 
     * @return realChange
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealChange() {
        return realChange;
    }


    /**
     * Sets the realChange value for this ReservationModifyResponseDTO.
     * 
     * @param realChange
     */
    public void setRealChange(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realChange) {
        this.realChange = realChange;
    }


    /**
     * Gets the realReserved value for this ReservationModifyResponseDTO.
     * 
     * @return realReserved
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealReserved() {
        return realReserved;
    }


    /**
     * Sets the realReserved value for this ReservationModifyResponseDTO.
     * 
     * @param realReserved
     */
    public void setRealReserved(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realReserved) {
        this.realReserved = realReserved;
    }


    /**
     * Gets the reservationGeneralInfo value for this ReservationModifyResponseDTO.
     * 
     * @return reservationGeneralInfo
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralResponseDTO getReservationGeneralInfo() {
        return reservationGeneralInfo;
    }


    /**
     * Sets the reservationGeneralInfo value for this ReservationModifyResponseDTO.
     * 
     * @param reservationGeneralInfo
     */
    public void setReservationGeneralInfo(co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralResponseDTO reservationGeneralInfo) {
        this.reservationGeneralInfo = reservationGeneralInfo;
    }


    /**
     * Gets the validUntil value for this ReservationModifyResponseDTO.
     * 
     * @return validUntil
     */
    public java.util.Calendar getValidUntil() {
        return validUntil;
    }


    /**
     * Sets the validUntil value for this ReservationModifyResponseDTO.
     * 
     * @param validUntil
     */
    public void setValidUntil(java.util.Calendar validUntil) {
        this.validUntil = validUntil;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationModifyResponseDTO)) return false;
        ReservationModifyResponseDTO other = (ReservationModifyResponseDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bonusChange==null && other.getBonusChange()==null) || 
             (this.bonusChange!=null &&
              this.bonusChange.equals(other.getBonusChange()))) &&
            ((this.bonusReserved==null && other.getBonusReserved()==null) || 
             (this.bonusReserved!=null &&
              this.bonusReserved.equals(other.getBonusReserved()))) &&
            this.numberOfEvents == other.getNumberOfEvents() &&
            ((this.partitionChangeColl==null && other.getPartitionChangeColl()==null) || 
             (this.partitionChangeColl!=null &&
              java.util.Arrays.equals(this.partitionChangeColl, other.getPartitionChangeColl()))) &&
            ((this.partitionReservedColl==null && other.getPartitionReservedColl()==null) || 
             (this.partitionReservedColl!=null &&
              java.util.Arrays.equals(this.partitionReservedColl, other.getPartitionReservedColl()))) &&
            ((this.realChange==null && other.getRealChange()==null) || 
             (this.realChange!=null &&
              this.realChange.equals(other.getRealChange()))) &&
            ((this.realReserved==null && other.getRealReserved()==null) || 
             (this.realReserved!=null &&
              this.realReserved.equals(other.getRealReserved()))) &&
            ((this.reservationGeneralInfo==null && other.getReservationGeneralInfo()==null) || 
             (this.reservationGeneralInfo!=null &&
              this.reservationGeneralInfo.equals(other.getReservationGeneralInfo()))) &&
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
        if (getBonusChange() != null) {
            _hashCode += getBonusChange().hashCode();
        }
        if (getBonusReserved() != null) {
            _hashCode += getBonusReserved().hashCode();
        }
        _hashCode += getNumberOfEvents();
        if (getPartitionChangeColl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionChangeColl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionChangeColl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartitionReservedColl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionReservedColl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionReservedColl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRealChange() != null) {
            _hashCode += getRealChange().hashCode();
        }
        if (getRealReserved() != null) {
            _hashCode += getRealReserved().hashCode();
        }
        if (getReservationGeneralInfo() != null) {
            _hashCode += getReservationGeneralInfo().hashCode();
        }
        if (getValidUntil() != null) {
            _hashCode += getValidUntil().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationModifyResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationModifyResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusChange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusReserved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusReserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionChangeColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionChangeColl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "partitionDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionReservedColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionReservedColl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "partitionDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realChange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
