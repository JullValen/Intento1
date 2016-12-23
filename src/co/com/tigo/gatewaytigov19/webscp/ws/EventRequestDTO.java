/**
 * EventRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class EventRequestDTO  implements java.io.Serializable {
    private java.lang.String addressType;

    private java.lang.String authorizationNumber;

    private java.lang.String cellId;

    private java.lang.String destination;

    private java.lang.String direction;

    private java.lang.Integer duration;

    private java.util.Calendar eventTime;

    private java.lang.String eventType;

    private java.lang.String information;

    private co.com.tigo.gatewaytigov19.webscp.ws.LocationDTO location;

    private java.lang.String mobileNumber;

    private co.com.tigo.gatewaytigov19.webscp.ws.NetworkBearerIDDTO networkBearerId;

    private java.lang.Integer numberOfEvents;

    private java.lang.String originatingSource;

    private java.lang.String origination;

    private java.lang.String transactionId;

    private java.lang.String transactionType;

    private java.util.Calendar validUntil;

    private java.lang.Integer volume;

    public EventRequestDTO() {
    }

    public EventRequestDTO(
           java.lang.String addressType,
           java.lang.String authorizationNumber,
           java.lang.String cellId,
           java.lang.String destination,
           java.lang.String direction,
           java.lang.Integer duration,
           java.util.Calendar eventTime,
           java.lang.String eventType,
           java.lang.String information,
           co.com.tigo.gatewaytigov19.webscp.ws.LocationDTO location,
           java.lang.String mobileNumber,
           co.com.tigo.gatewaytigov19.webscp.ws.NetworkBearerIDDTO networkBearerId,
           java.lang.Integer numberOfEvents,
           java.lang.String originatingSource,
           java.lang.String origination,
           java.lang.String transactionId,
           java.lang.String transactionType,
           java.util.Calendar validUntil,
           java.lang.Integer volume) {
           this.addressType = addressType;
           this.authorizationNumber = authorizationNumber;
           this.cellId = cellId;
           this.destination = destination;
           this.direction = direction;
           this.duration = duration;
           this.eventTime = eventTime;
           this.eventType = eventType;
           this.information = information;
           this.location = location;
           this.mobileNumber = mobileNumber;
           this.networkBearerId = networkBearerId;
           this.numberOfEvents = numberOfEvents;
           this.originatingSource = originatingSource;
           this.origination = origination;
           this.transactionId = transactionId;
           this.transactionType = transactionType;
           this.validUntil = validUntil;
           this.volume = volume;
    }


    /**
     * Gets the addressType value for this EventRequestDTO.
     * 
     * @return addressType
     */
    public java.lang.String getAddressType() {
        return addressType;
    }


    /**
     * Sets the addressType value for this EventRequestDTO.
     * 
     * @param addressType
     */
    public void setAddressType(java.lang.String addressType) {
        this.addressType = addressType;
    }


    /**
     * Gets the authorizationNumber value for this EventRequestDTO.
     * 
     * @return authorizationNumber
     */
    public java.lang.String getAuthorizationNumber() {
        return authorizationNumber;
    }


    /**
     * Sets the authorizationNumber value for this EventRequestDTO.
     * 
     * @param authorizationNumber
     */
    public void setAuthorizationNumber(java.lang.String authorizationNumber) {
        this.authorizationNumber = authorizationNumber;
    }


    /**
     * Gets the cellId value for this EventRequestDTO.
     * 
     * @return cellId
     */
    public java.lang.String getCellId() {
        return cellId;
    }


    /**
     * Sets the cellId value for this EventRequestDTO.
     * 
     * @param cellId
     */
    public void setCellId(java.lang.String cellId) {
        this.cellId = cellId;
    }


    /**
     * Gets the destination value for this EventRequestDTO.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this EventRequestDTO.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the direction value for this EventRequestDTO.
     * 
     * @return direction
     */
    public java.lang.String getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this EventRequestDTO.
     * 
     * @param direction
     */
    public void setDirection(java.lang.String direction) {
        this.direction = direction;
    }


    /**
     * Gets the duration value for this EventRequestDTO.
     * 
     * @return duration
     */
    public java.lang.Integer getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this EventRequestDTO.
     * 
     * @param duration
     */
    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }


    /**
     * Gets the eventTime value for this EventRequestDTO.
     * 
     * @return eventTime
     */
    public java.util.Calendar getEventTime() {
        return eventTime;
    }


    /**
     * Sets the eventTime value for this EventRequestDTO.
     * 
     * @param eventTime
     */
    public void setEventTime(java.util.Calendar eventTime) {
        this.eventTime = eventTime;
    }


    /**
     * Gets the eventType value for this EventRequestDTO.
     * 
     * @return eventType
     */
    public java.lang.String getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this EventRequestDTO.
     * 
     * @param eventType
     */
    public void setEventType(java.lang.String eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the information value for this EventRequestDTO.
     * 
     * @return information
     */
    public java.lang.String getInformation() {
        return information;
    }


    /**
     * Sets the information value for this EventRequestDTO.
     * 
     * @param information
     */
    public void setInformation(java.lang.String information) {
        this.information = information;
    }


    /**
     * Gets the location value for this EventRequestDTO.
     * 
     * @return location
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.LocationDTO getLocation() {
        return location;
    }


    /**
     * Sets the location value for this EventRequestDTO.
     * 
     * @param location
     */
    public void setLocation(co.com.tigo.gatewaytigov19.webscp.ws.LocationDTO location) {
        this.location = location;
    }


    /**
     * Gets the mobileNumber value for this EventRequestDTO.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this EventRequestDTO.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the networkBearerId value for this EventRequestDTO.
     * 
     * @return networkBearerId
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.NetworkBearerIDDTO getNetworkBearerId() {
        return networkBearerId;
    }


    /**
     * Sets the networkBearerId value for this EventRequestDTO.
     * 
     * @param networkBearerId
     */
    public void setNetworkBearerId(co.com.tigo.gatewaytigov19.webscp.ws.NetworkBearerIDDTO networkBearerId) {
        this.networkBearerId = networkBearerId;
    }


    /**
     * Gets the numberOfEvents value for this EventRequestDTO.
     * 
     * @return numberOfEvents
     */
    public java.lang.Integer getNumberOfEvents() {
        return numberOfEvents;
    }


    /**
     * Sets the numberOfEvents value for this EventRequestDTO.
     * 
     * @param numberOfEvents
     */
    public void setNumberOfEvents(java.lang.Integer numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }


    /**
     * Gets the originatingSource value for this EventRequestDTO.
     * 
     * @return originatingSource
     */
    public java.lang.String getOriginatingSource() {
        return originatingSource;
    }


    /**
     * Sets the originatingSource value for this EventRequestDTO.
     * 
     * @param originatingSource
     */
    public void setOriginatingSource(java.lang.String originatingSource) {
        this.originatingSource = originatingSource;
    }


    /**
     * Gets the origination value for this EventRequestDTO.
     * 
     * @return origination
     */
    public java.lang.String getOrigination() {
        return origination;
    }


    /**
     * Sets the origination value for this EventRequestDTO.
     * 
     * @param origination
     */
    public void setOrigination(java.lang.String origination) {
        this.origination = origination;
    }


    /**
     * Gets the transactionId value for this EventRequestDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this EventRequestDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transactionType value for this EventRequestDTO.
     * 
     * @return transactionType
     */
    public java.lang.String getTransactionType() {
        return transactionType;
    }


    /**
     * Sets the transactionType value for this EventRequestDTO.
     * 
     * @param transactionType
     */
    public void setTransactionType(java.lang.String transactionType) {
        this.transactionType = transactionType;
    }


    /**
     * Gets the validUntil value for this EventRequestDTO.
     * 
     * @return validUntil
     */
    public java.util.Calendar getValidUntil() {
        return validUntil;
    }


    /**
     * Sets the validUntil value for this EventRequestDTO.
     * 
     * @param validUntil
     */
    public void setValidUntil(java.util.Calendar validUntil) {
        this.validUntil = validUntil;
    }


    /**
     * Gets the volume value for this EventRequestDTO.
     * 
     * @return volume
     */
    public java.lang.Integer getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this EventRequestDTO.
     * 
     * @param volume
     */
    public void setVolume(java.lang.Integer volume) {
        this.volume = volume;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventRequestDTO)) return false;
        EventRequestDTO other = (EventRequestDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressType==null && other.getAddressType()==null) || 
             (this.addressType!=null &&
              this.addressType.equals(other.getAddressType()))) &&
            ((this.authorizationNumber==null && other.getAuthorizationNumber()==null) || 
             (this.authorizationNumber!=null &&
              this.authorizationNumber.equals(other.getAuthorizationNumber()))) &&
            ((this.cellId==null && other.getCellId()==null) || 
             (this.cellId!=null &&
              this.cellId.equals(other.getCellId()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.eventTime==null && other.getEventTime()==null) || 
             (this.eventTime!=null &&
              this.eventTime.equals(other.getEventTime()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            ((this.information==null && other.getInformation()==null) || 
             (this.information!=null &&
              this.information.equals(other.getInformation()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.networkBearerId==null && other.getNetworkBearerId()==null) || 
             (this.networkBearerId!=null &&
              this.networkBearerId.equals(other.getNetworkBearerId()))) &&
            ((this.numberOfEvents==null && other.getNumberOfEvents()==null) || 
             (this.numberOfEvents!=null &&
              this.numberOfEvents.equals(other.getNumberOfEvents()))) &&
            ((this.originatingSource==null && other.getOriginatingSource()==null) || 
             (this.originatingSource!=null &&
              this.originatingSource.equals(other.getOriginatingSource()))) &&
            ((this.origination==null && other.getOrigination()==null) || 
             (this.origination!=null &&
              this.origination.equals(other.getOrigination()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.transactionType==null && other.getTransactionType()==null) || 
             (this.transactionType!=null &&
              this.transactionType.equals(other.getTransactionType()))) &&
            ((this.validUntil==null && other.getValidUntil()==null) || 
             (this.validUntil!=null &&
              this.validUntil.equals(other.getValidUntil()))) &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              this.volume.equals(other.getVolume())));
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
        if (getAddressType() != null) {
            _hashCode += getAddressType().hashCode();
        }
        if (getAuthorizationNumber() != null) {
            _hashCode += getAuthorizationNumber().hashCode();
        }
        if (getCellId() != null) {
            _hashCode += getCellId().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getEventTime() != null) {
            _hashCode += getEventTime().hashCode();
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        if (getInformation() != null) {
            _hashCode += getInformation().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getNetworkBearerId() != null) {
            _hashCode += getNetworkBearerId().hashCode();
        }
        if (getNumberOfEvents() != null) {
            _hashCode += getNumberOfEvents().hashCode();
        }
        if (getOriginatingSource() != null) {
            _hashCode += getOriginatingSource().hashCode();
        }
        if (getOrigination() != null) {
            _hashCode += getOrigination().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTransactionType() != null) {
            _hashCode += getTransactionType().hashCode();
        }
        if (getValidUntil() != null) {
            _hashCode += getValidUntil().hashCode();
        }
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eventRequestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorizationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cellId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "locationDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkBearerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkBearerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "networkBearerIDDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("origination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origination"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionType"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("", "volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
