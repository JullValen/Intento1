/**
 * ReservationUseResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ReservationUseResponseDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusReserved;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusReturned;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusUsed;

    private int numberOfEvents;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionReservedColl;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionReturnedColl;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionUsedColl;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realReserved;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realReturned;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realUsed;

    private co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralResponseDTO reservationGeneralInfo;

    private int usageType;

    public ReservationUseResponseDTO() {
    }

    public ReservationUseResponseDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusReserved,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusReturned,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusUsed,
           int numberOfEvents,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionReservedColl,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionReturnedColl,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionUsedColl,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realReserved,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realReturned,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realUsed,
           co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralResponseDTO reservationGeneralInfo,
           int usageType) {
           this.bonusReserved = bonusReserved;
           this.bonusReturned = bonusReturned;
           this.bonusUsed = bonusUsed;
           this.numberOfEvents = numberOfEvents;
           this.partitionReservedColl = partitionReservedColl;
           this.partitionReturnedColl = partitionReturnedColl;
           this.partitionUsedColl = partitionUsedColl;
           this.realReserved = realReserved;
           this.realReturned = realReturned;
           this.realUsed = realUsed;
           this.reservationGeneralInfo = reservationGeneralInfo;
           this.usageType = usageType;
    }


    /**
     * Gets the bonusReserved value for this ReservationUseResponseDTO.
     * 
     * @return bonusReserved
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusReserved() {
        return bonusReserved;
    }


    /**
     * Sets the bonusReserved value for this ReservationUseResponseDTO.
     * 
     * @param bonusReserved
     */
    public void setBonusReserved(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusReserved) {
        this.bonusReserved = bonusReserved;
    }


    /**
     * Gets the bonusReturned value for this ReservationUseResponseDTO.
     * 
     * @return bonusReturned
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusReturned() {
        return bonusReturned;
    }


    /**
     * Sets the bonusReturned value for this ReservationUseResponseDTO.
     * 
     * @param bonusReturned
     */
    public void setBonusReturned(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusReturned) {
        this.bonusReturned = bonusReturned;
    }


    /**
     * Gets the bonusUsed value for this ReservationUseResponseDTO.
     * 
     * @return bonusUsed
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusUsed() {
        return bonusUsed;
    }


    /**
     * Sets the bonusUsed value for this ReservationUseResponseDTO.
     * 
     * @param bonusUsed
     */
    public void setBonusUsed(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusUsed) {
        this.bonusUsed = bonusUsed;
    }


    /**
     * Gets the numberOfEvents value for this ReservationUseResponseDTO.
     * 
     * @return numberOfEvents
     */
    public int getNumberOfEvents() {
        return numberOfEvents;
    }


    /**
     * Sets the numberOfEvents value for this ReservationUseResponseDTO.
     * 
     * @param numberOfEvents
     */
    public void setNumberOfEvents(int numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }


    /**
     * Gets the partitionReservedColl value for this ReservationUseResponseDTO.
     * 
     * @return partitionReservedColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionReservedColl() {
        return partitionReservedColl;
    }


    /**
     * Sets the partitionReservedColl value for this ReservationUseResponseDTO.
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
     * Gets the partitionReturnedColl value for this ReservationUseResponseDTO.
     * 
     * @return partitionReturnedColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionReturnedColl() {
        return partitionReturnedColl;
    }


    /**
     * Sets the partitionReturnedColl value for this ReservationUseResponseDTO.
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
     * Gets the partitionUsedColl value for this ReservationUseResponseDTO.
     * 
     * @return partitionUsedColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionUsedColl() {
        return partitionUsedColl;
    }


    /**
     * Sets the partitionUsedColl value for this ReservationUseResponseDTO.
     * 
     * @param partitionUsedColl
     */
    public void setPartitionUsedColl(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionUsedColl) {
        this.partitionUsedColl = partitionUsedColl;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionUsedColl(int i) {
        return this.partitionUsedColl[i];
    }

    public void setPartitionUsedColl(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionUsedColl[i] = _value;
    }


    /**
     * Gets the realReserved value for this ReservationUseResponseDTO.
     * 
     * @return realReserved
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealReserved() {
        return realReserved;
    }


    /**
     * Sets the realReserved value for this ReservationUseResponseDTO.
     * 
     * @param realReserved
     */
    public void setRealReserved(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realReserved) {
        this.realReserved = realReserved;
    }


    /**
     * Gets the realReturned value for this ReservationUseResponseDTO.
     * 
     * @return realReturned
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealReturned() {
        return realReturned;
    }


    /**
     * Sets the realReturned value for this ReservationUseResponseDTO.
     * 
     * @param realReturned
     */
    public void setRealReturned(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realReturned) {
        this.realReturned = realReturned;
    }


    /**
     * Gets the realUsed value for this ReservationUseResponseDTO.
     * 
     * @return realUsed
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealUsed() {
        return realUsed;
    }


    /**
     * Sets the realUsed value for this ReservationUseResponseDTO.
     * 
     * @param realUsed
     */
    public void setRealUsed(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realUsed) {
        this.realUsed = realUsed;
    }


    /**
     * Gets the reservationGeneralInfo value for this ReservationUseResponseDTO.
     * 
     * @return reservationGeneralInfo
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralResponseDTO getReservationGeneralInfo() {
        return reservationGeneralInfo;
    }


    /**
     * Sets the reservationGeneralInfo value for this ReservationUseResponseDTO.
     * 
     * @param reservationGeneralInfo
     */
    public void setReservationGeneralInfo(co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralResponseDTO reservationGeneralInfo) {
        this.reservationGeneralInfo = reservationGeneralInfo;
    }


    /**
     * Gets the usageType value for this ReservationUseResponseDTO.
     * 
     * @return usageType
     */
    public int getUsageType() {
        return usageType;
    }


    /**
     * Sets the usageType value for this ReservationUseResponseDTO.
     * 
     * @param usageType
     */
    public void setUsageType(int usageType) {
        this.usageType = usageType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationUseResponseDTO)) return false;
        ReservationUseResponseDTO other = (ReservationUseResponseDTO) obj;
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
            ((this.bonusReturned==null && other.getBonusReturned()==null) || 
             (this.bonusReturned!=null &&
              this.bonusReturned.equals(other.getBonusReturned()))) &&
            ((this.bonusUsed==null && other.getBonusUsed()==null) || 
             (this.bonusUsed!=null &&
              this.bonusUsed.equals(other.getBonusUsed()))) &&
            this.numberOfEvents == other.getNumberOfEvents() &&
            ((this.partitionReservedColl==null && other.getPartitionReservedColl()==null) || 
             (this.partitionReservedColl!=null &&
              java.util.Arrays.equals(this.partitionReservedColl, other.getPartitionReservedColl()))) &&
            ((this.partitionReturnedColl==null && other.getPartitionReturnedColl()==null) || 
             (this.partitionReturnedColl!=null &&
              java.util.Arrays.equals(this.partitionReturnedColl, other.getPartitionReturnedColl()))) &&
            ((this.partitionUsedColl==null && other.getPartitionUsedColl()==null) || 
             (this.partitionUsedColl!=null &&
              java.util.Arrays.equals(this.partitionUsedColl, other.getPartitionUsedColl()))) &&
            ((this.realReserved==null && other.getRealReserved()==null) || 
             (this.realReserved!=null &&
              this.realReserved.equals(other.getRealReserved()))) &&
            ((this.realReturned==null && other.getRealReturned()==null) || 
             (this.realReturned!=null &&
              this.realReturned.equals(other.getRealReturned()))) &&
            ((this.realUsed==null && other.getRealUsed()==null) || 
             (this.realUsed!=null &&
              this.realUsed.equals(other.getRealUsed()))) &&
            ((this.reservationGeneralInfo==null && other.getReservationGeneralInfo()==null) || 
             (this.reservationGeneralInfo!=null &&
              this.reservationGeneralInfo.equals(other.getReservationGeneralInfo()))) &&
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
        if (getBonusReserved() != null) {
            _hashCode += getBonusReserved().hashCode();
        }
        if (getBonusReturned() != null) {
            _hashCode += getBonusReturned().hashCode();
        }
        if (getBonusUsed() != null) {
            _hashCode += getBonusUsed().hashCode();
        }
        _hashCode += getNumberOfEvents();
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
        if (getPartitionUsedColl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionUsedColl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionUsedColl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRealReserved() != null) {
            _hashCode += getRealReserved().hashCode();
        }
        if (getRealReturned() != null) {
            _hashCode += getRealReturned().hashCode();
        }
        if (getRealUsed() != null) {
            _hashCode += getRealUsed().hashCode();
        }
        if (getReservationGeneralInfo() != null) {
            _hashCode += getReservationGeneralInfo().hashCode();
        }
        _hashCode += getUsageType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationUseResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationUseResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusReserved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusReserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusReturned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusReturned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusUsed"));
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
        elemField.setFieldName("partitionReservedColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionReservedColl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "partitionDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("partitionUsedColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionUsedColl"));
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
        elemField.setFieldName("realReturned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realReturned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realUsed"));
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
