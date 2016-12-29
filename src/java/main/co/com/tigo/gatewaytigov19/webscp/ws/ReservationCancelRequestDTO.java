/**
 * ReservationCancelRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ReservationCancelRequestDTO  implements java.io.Serializable {
    private java.util.Calendar eventTime;

    private java.lang.String information;

    private java.lang.String msisdn;

    private java.lang.String originatingSource;

    private java.lang.String reason;

    private java.lang.String reservationId;

    private java.lang.String retailerName;

    private java.lang.String transactionId;

    public ReservationCancelRequestDTO() {
    }

    public ReservationCancelRequestDTO(
           java.util.Calendar eventTime,
           java.lang.String information,
           java.lang.String msisdn,
           java.lang.String originatingSource,
           java.lang.String reason,
           java.lang.String reservationId,
           java.lang.String retailerName,
           java.lang.String transactionId) {
           this.eventTime = eventTime;
           this.information = information;
           this.msisdn = msisdn;
           this.originatingSource = originatingSource;
           this.reason = reason;
           this.reservationId = reservationId;
           this.retailerName = retailerName;
           this.transactionId = transactionId;
    }


    /**
     * Gets the eventTime value for this ReservationCancelRequestDTO.
     * 
     * @return eventTime
     */
    public java.util.Calendar getEventTime() {
        return eventTime;
    }


    /**
     * Sets the eventTime value for this ReservationCancelRequestDTO.
     * 
     * @param eventTime
     */
    public void setEventTime(java.util.Calendar eventTime) {
        this.eventTime = eventTime;
    }


    /**
     * Gets the information value for this ReservationCancelRequestDTO.
     * 
     * @return information
     */
    public java.lang.String getInformation() {
        return information;
    }


    /**
     * Sets the information value for this ReservationCancelRequestDTO.
     * 
     * @param information
     */
    public void setInformation(java.lang.String information) {
        this.information = information;
    }


    /**
     * Gets the msisdn value for this ReservationCancelRequestDTO.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this ReservationCancelRequestDTO.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the originatingSource value for this ReservationCancelRequestDTO.
     * 
     * @return originatingSource
     */
    public java.lang.String getOriginatingSource() {
        return originatingSource;
    }


    /**
     * Sets the originatingSource value for this ReservationCancelRequestDTO.
     * 
     * @param originatingSource
     */
    public void setOriginatingSource(java.lang.String originatingSource) {
        this.originatingSource = originatingSource;
    }


    /**
     * Gets the reason value for this ReservationCancelRequestDTO.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ReservationCancelRequestDTO.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the reservationId value for this ReservationCancelRequestDTO.
     * 
     * @return reservationId
     */
    public java.lang.String getReservationId() {
        return reservationId;
    }


    /**
     * Sets the reservationId value for this ReservationCancelRequestDTO.
     * 
     * @param reservationId
     */
    public void setReservationId(java.lang.String reservationId) {
        this.reservationId = reservationId;
    }


    /**
     * Gets the retailerName value for this ReservationCancelRequestDTO.
     * 
     * @return retailerName
     */
    public java.lang.String getRetailerName() {
        return retailerName;
    }


    /**
     * Sets the retailerName value for this ReservationCancelRequestDTO.
     * 
     * @param retailerName
     */
    public void setRetailerName(java.lang.String retailerName) {
        this.retailerName = retailerName;
    }


    /**
     * Gets the transactionId value for this ReservationCancelRequestDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this ReservationCancelRequestDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationCancelRequestDTO)) return false;
        ReservationCancelRequestDTO other = (ReservationCancelRequestDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventTime==null && other.getEventTime()==null) || 
             (this.eventTime!=null &&
              this.eventTime.equals(other.getEventTime()))) &&
            ((this.information==null && other.getInformation()==null) || 
             (this.information!=null &&
              this.information.equals(other.getInformation()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.originatingSource==null && other.getOriginatingSource()==null) || 
             (this.originatingSource!=null &&
              this.originatingSource.equals(other.getOriginatingSource()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.reservationId==null && other.getReservationId()==null) || 
             (this.reservationId!=null &&
              this.reservationId.equals(other.getReservationId()))) &&
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
        if (getEventTime() != null) {
            _hashCode += getEventTime().hashCode();
        }
        if (getInformation() != null) {
            _hashCode += getInformation().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getOriginatingSource() != null) {
            _hashCode += getOriginatingSource().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getReservationId() != null) {
            _hashCode += getReservationId().hashCode();
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
        new org.apache.axis.description.TypeDesc(ReservationCancelRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationCancelRequestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("originatingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originatingSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
