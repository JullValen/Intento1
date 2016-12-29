/**
 * ReservationQueryRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ReservationQueryRequestDTO  implements java.io.Serializable {
    private java.util.Calendar maxEventTime;

    private java.util.Calendar maxValidUntil;

    private java.util.Calendar minEventTime;

    private java.util.Calendar minValidUntil;

    private java.lang.String nextReservationId;

    private java.lang.String originatingSource;

    private java.lang.String reservationId;

    private java.lang.String reservationMSISDN;

    private java.lang.String reservationTransactionId;

    private java.lang.String transactionId;

    public ReservationQueryRequestDTO() {
    }

    public ReservationQueryRequestDTO(
           java.util.Calendar maxEventTime,
           java.util.Calendar maxValidUntil,
           java.util.Calendar minEventTime,
           java.util.Calendar minValidUntil,
           java.lang.String nextReservationId,
           java.lang.String originatingSource,
           java.lang.String reservationId,
           java.lang.String reservationMSISDN,
           java.lang.String reservationTransactionId,
           java.lang.String transactionId) {
           this.maxEventTime = maxEventTime;
           this.maxValidUntil = maxValidUntil;
           this.minEventTime = minEventTime;
           this.minValidUntil = minValidUntil;
           this.nextReservationId = nextReservationId;
           this.originatingSource = originatingSource;
           this.reservationId = reservationId;
           this.reservationMSISDN = reservationMSISDN;
           this.reservationTransactionId = reservationTransactionId;
           this.transactionId = transactionId;
    }


    /**
     * Gets the maxEventTime value for this ReservationQueryRequestDTO.
     * 
     * @return maxEventTime
     */
    public java.util.Calendar getMaxEventTime() {
        return maxEventTime;
    }


    /**
     * Sets the maxEventTime value for this ReservationQueryRequestDTO.
     * 
     * @param maxEventTime
     */
    public void setMaxEventTime(java.util.Calendar maxEventTime) {
        this.maxEventTime = maxEventTime;
    }


    /**
     * Gets the maxValidUntil value for this ReservationQueryRequestDTO.
     * 
     * @return maxValidUntil
     */
    public java.util.Calendar getMaxValidUntil() {
        return maxValidUntil;
    }


    /**
     * Sets the maxValidUntil value for this ReservationQueryRequestDTO.
     * 
     * @param maxValidUntil
     */
    public void setMaxValidUntil(java.util.Calendar maxValidUntil) {
        this.maxValidUntil = maxValidUntil;
    }


    /**
     * Gets the minEventTime value for this ReservationQueryRequestDTO.
     * 
     * @return minEventTime
     */
    public java.util.Calendar getMinEventTime() {
        return minEventTime;
    }


    /**
     * Sets the minEventTime value for this ReservationQueryRequestDTO.
     * 
     * @param minEventTime
     */
    public void setMinEventTime(java.util.Calendar minEventTime) {
        this.minEventTime = minEventTime;
    }


    /**
     * Gets the minValidUntil value for this ReservationQueryRequestDTO.
     * 
     * @return minValidUntil
     */
    public java.util.Calendar getMinValidUntil() {
        return minValidUntil;
    }


    /**
     * Sets the minValidUntil value for this ReservationQueryRequestDTO.
     * 
     * @param minValidUntil
     */
    public void setMinValidUntil(java.util.Calendar minValidUntil) {
        this.minValidUntil = minValidUntil;
    }


    /**
     * Gets the nextReservationId value for this ReservationQueryRequestDTO.
     * 
     * @return nextReservationId
     */
    public java.lang.String getNextReservationId() {
        return nextReservationId;
    }


    /**
     * Sets the nextReservationId value for this ReservationQueryRequestDTO.
     * 
     * @param nextReservationId
     */
    public void setNextReservationId(java.lang.String nextReservationId) {
        this.nextReservationId = nextReservationId;
    }


    /**
     * Gets the originatingSource value for this ReservationQueryRequestDTO.
     * 
     * @return originatingSource
     */
    public java.lang.String getOriginatingSource() {
        return originatingSource;
    }


    /**
     * Sets the originatingSource value for this ReservationQueryRequestDTO.
     * 
     * @param originatingSource
     */
    public void setOriginatingSource(java.lang.String originatingSource) {
        this.originatingSource = originatingSource;
    }


    /**
     * Gets the reservationId value for this ReservationQueryRequestDTO.
     * 
     * @return reservationId
     */
    public java.lang.String getReservationId() {
        return reservationId;
    }


    /**
     * Sets the reservationId value for this ReservationQueryRequestDTO.
     * 
     * @param reservationId
     */
    public void setReservationId(java.lang.String reservationId) {
        this.reservationId = reservationId;
    }


    /**
     * Gets the reservationMSISDN value for this ReservationQueryRequestDTO.
     * 
     * @return reservationMSISDN
     */
    public java.lang.String getReservationMSISDN() {
        return reservationMSISDN;
    }


    /**
     * Sets the reservationMSISDN value for this ReservationQueryRequestDTO.
     * 
     * @param reservationMSISDN
     */
    public void setReservationMSISDN(java.lang.String reservationMSISDN) {
        this.reservationMSISDN = reservationMSISDN;
    }


    /**
     * Gets the reservationTransactionId value for this ReservationQueryRequestDTO.
     * 
     * @return reservationTransactionId
     */
    public java.lang.String getReservationTransactionId() {
        return reservationTransactionId;
    }


    /**
     * Sets the reservationTransactionId value for this ReservationQueryRequestDTO.
     * 
     * @param reservationTransactionId
     */
    public void setReservationTransactionId(java.lang.String reservationTransactionId) {
        this.reservationTransactionId = reservationTransactionId;
    }


    /**
     * Gets the transactionId value for this ReservationQueryRequestDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this ReservationQueryRequestDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationQueryRequestDTO)) return false;
        ReservationQueryRequestDTO other = (ReservationQueryRequestDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maxEventTime==null && other.getMaxEventTime()==null) || 
             (this.maxEventTime!=null &&
              this.maxEventTime.equals(other.getMaxEventTime()))) &&
            ((this.maxValidUntil==null && other.getMaxValidUntil()==null) || 
             (this.maxValidUntil!=null &&
              this.maxValidUntil.equals(other.getMaxValidUntil()))) &&
            ((this.minEventTime==null && other.getMinEventTime()==null) || 
             (this.minEventTime!=null &&
              this.minEventTime.equals(other.getMinEventTime()))) &&
            ((this.minValidUntil==null && other.getMinValidUntil()==null) || 
             (this.minValidUntil!=null &&
              this.minValidUntil.equals(other.getMinValidUntil()))) &&
            ((this.nextReservationId==null && other.getNextReservationId()==null) || 
             (this.nextReservationId!=null &&
              this.nextReservationId.equals(other.getNextReservationId()))) &&
            ((this.originatingSource==null && other.getOriginatingSource()==null) || 
             (this.originatingSource!=null &&
              this.originatingSource.equals(other.getOriginatingSource()))) &&
            ((this.reservationId==null && other.getReservationId()==null) || 
             (this.reservationId!=null &&
              this.reservationId.equals(other.getReservationId()))) &&
            ((this.reservationMSISDN==null && other.getReservationMSISDN()==null) || 
             (this.reservationMSISDN!=null &&
              this.reservationMSISDN.equals(other.getReservationMSISDN()))) &&
            ((this.reservationTransactionId==null && other.getReservationTransactionId()==null) || 
             (this.reservationTransactionId!=null &&
              this.reservationTransactionId.equals(other.getReservationTransactionId()))) &&
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
        if (getMaxEventTime() != null) {
            _hashCode += getMaxEventTime().hashCode();
        }
        if (getMaxValidUntil() != null) {
            _hashCode += getMaxValidUntil().hashCode();
        }
        if (getMinEventTime() != null) {
            _hashCode += getMinEventTime().hashCode();
        }
        if (getMinValidUntil() != null) {
            _hashCode += getMinValidUntil().hashCode();
        }
        if (getNextReservationId() != null) {
            _hashCode += getNextReservationId().hashCode();
        }
        if (getOriginatingSource() != null) {
            _hashCode += getOriginatingSource().hashCode();
        }
        if (getReservationId() != null) {
            _hashCode += getReservationId().hashCode();
        }
        if (getReservationMSISDN() != null) {
            _hashCode += getReservationMSISDN().hashCode();
        }
        if (getReservationTransactionId() != null) {
            _hashCode += getReservationTransactionId().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationQueryRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationQueryRequestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxEventTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxEventTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxValidUntil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxValidUntil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minEventTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minEventTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minValidUntil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minValidUntil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextReservationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextReservationId"));
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
        elemField.setFieldName("reservationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reservationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reservationMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reservationTransactionId"));
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
