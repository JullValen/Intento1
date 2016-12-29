/**
 * ReservationGeneralRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ReservationGeneralRequestDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusMoney;

    private java.util.Calendar eventTime;

    private java.lang.String information;

    private java.lang.String msisdn;

    private int numberOfEvents;

    private java.lang.String originatingSource;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionColl;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realMoney;

    private java.lang.String retailerName;

    private java.lang.String transactionId;

    public ReservationGeneralRequestDTO() {
    }

    public ReservationGeneralRequestDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusMoney,
           java.util.Calendar eventTime,
           java.lang.String information,
           java.lang.String msisdn,
           int numberOfEvents,
           java.lang.String originatingSource,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionColl,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realMoney,
           java.lang.String retailerName,
           java.lang.String transactionId) {
           this.bonusMoney = bonusMoney;
           this.eventTime = eventTime;
           this.information = information;
           this.msisdn = msisdn;
           this.numberOfEvents = numberOfEvents;
           this.originatingSource = originatingSource;
           this.partitionColl = partitionColl;
           this.realMoney = realMoney;
           this.retailerName = retailerName;
           this.transactionId = transactionId;
    }


    /**
     * Gets the bonusMoney value for this ReservationGeneralRequestDTO.
     * 
     * @return bonusMoney
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusMoney() {
        return bonusMoney;
    }


    /**
     * Sets the bonusMoney value for this ReservationGeneralRequestDTO.
     * 
     * @param bonusMoney
     */
    public void setBonusMoney(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusMoney) {
        this.bonusMoney = bonusMoney;
    }


    /**
     * Gets the eventTime value for this ReservationGeneralRequestDTO.
     * 
     * @return eventTime
     */
    public java.util.Calendar getEventTime() {
        return eventTime;
    }


    /**
     * Sets the eventTime value for this ReservationGeneralRequestDTO.
     * 
     * @param eventTime
     */
    public void setEventTime(java.util.Calendar eventTime) {
        this.eventTime = eventTime;
    }


    /**
     * Gets the information value for this ReservationGeneralRequestDTO.
     * 
     * @return information
     */
    public java.lang.String getInformation() {
        return information;
    }


    /**
     * Sets the information value for this ReservationGeneralRequestDTO.
     * 
     * @param information
     */
    public void setInformation(java.lang.String information) {
        this.information = information;
    }


    /**
     * Gets the msisdn value for this ReservationGeneralRequestDTO.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this ReservationGeneralRequestDTO.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the numberOfEvents value for this ReservationGeneralRequestDTO.
     * 
     * @return numberOfEvents
     */
    public int getNumberOfEvents() {
        return numberOfEvents;
    }


    /**
     * Sets the numberOfEvents value for this ReservationGeneralRequestDTO.
     * 
     * @param numberOfEvents
     */
    public void setNumberOfEvents(int numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }


    /**
     * Gets the originatingSource value for this ReservationGeneralRequestDTO.
     * 
     * @return originatingSource
     */
    public java.lang.String getOriginatingSource() {
        return originatingSource;
    }


    /**
     * Sets the originatingSource value for this ReservationGeneralRequestDTO.
     * 
     * @param originatingSource
     */
    public void setOriginatingSource(java.lang.String originatingSource) {
        this.originatingSource = originatingSource;
    }


    /**
     * Gets the partitionColl value for this ReservationGeneralRequestDTO.
     * 
     * @return partitionColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionColl() {
        return partitionColl;
    }


    /**
     * Sets the partitionColl value for this ReservationGeneralRequestDTO.
     * 
     * @param partitionColl
     */
    public void setPartitionColl(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionColl) {
        this.partitionColl = partitionColl;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionColl(int i) {
        return this.partitionColl[i];
    }

    public void setPartitionColl(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionColl[i] = _value;
    }


    /**
     * Gets the realMoney value for this ReservationGeneralRequestDTO.
     * 
     * @return realMoney
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealMoney() {
        return realMoney;
    }


    /**
     * Sets the realMoney value for this ReservationGeneralRequestDTO.
     * 
     * @param realMoney
     */
    public void setRealMoney(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realMoney) {
        this.realMoney = realMoney;
    }


    /**
     * Gets the retailerName value for this ReservationGeneralRequestDTO.
     * 
     * @return retailerName
     */
    public java.lang.String getRetailerName() {
        return retailerName;
    }


    /**
     * Sets the retailerName value for this ReservationGeneralRequestDTO.
     * 
     * @param retailerName
     */
    public void setRetailerName(java.lang.String retailerName) {
        this.retailerName = retailerName;
    }


    /**
     * Gets the transactionId value for this ReservationGeneralRequestDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this ReservationGeneralRequestDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationGeneralRequestDTO)) return false;
        ReservationGeneralRequestDTO other = (ReservationGeneralRequestDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bonusMoney==null && other.getBonusMoney()==null) || 
             (this.bonusMoney!=null &&
              this.bonusMoney.equals(other.getBonusMoney()))) &&
            ((this.eventTime==null && other.getEventTime()==null) || 
             (this.eventTime!=null &&
              this.eventTime.equals(other.getEventTime()))) &&
            ((this.information==null && other.getInformation()==null) || 
             (this.information!=null &&
              this.information.equals(other.getInformation()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            this.numberOfEvents == other.getNumberOfEvents() &&
            ((this.originatingSource==null && other.getOriginatingSource()==null) || 
             (this.originatingSource!=null &&
              this.originatingSource.equals(other.getOriginatingSource()))) &&
            ((this.partitionColl==null && other.getPartitionColl()==null) || 
             (this.partitionColl!=null &&
              java.util.Arrays.equals(this.partitionColl, other.getPartitionColl()))) &&
            ((this.realMoney==null && other.getRealMoney()==null) || 
             (this.realMoney!=null &&
              this.realMoney.equals(other.getRealMoney()))) &&
            ((this.retailerName==null && other.getRetailerName()==null) || 
             (this.retailerName!=null &&
              this.retailerName.equals(other.getRetailerName()))) &&
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
        if (getBonusMoney() != null) {
            _hashCode += getBonusMoney().hashCode();
        }
        if (getEventTime() != null) {
            _hashCode += getEventTime().hashCode();
        }
        if (getInformation() != null) {
            _hashCode += getInformation().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        _hashCode += getNumberOfEvents();
        if (getOriginatingSource() != null) {
            _hashCode += getOriginatingSource().hashCode();
        }
        if (getPartitionColl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionColl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionColl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRealMoney() != null) {
            _hashCode += getRealMoney().hashCode();
        }
        if (getRetailerName() != null) {
            _hashCode += getRetailerName().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationGeneralRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationGeneralRequestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusMoney");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusMoney"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("information");
        elemField.setXmlName(new javax.xml.namespace.QName("", "information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("originatingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originatingSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionColl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "partitionDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realMoney");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realMoney"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retailerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retailerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
