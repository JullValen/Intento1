/**
 * AdviceOfChargeRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class AdviceOfChargeRequestDTO  implements java.io.Serializable {
    private java.lang.Integer addressType;

    private java.lang.Boolean allowAdditionalStates;

    private java.lang.String cellId;

    private java.lang.String destAddress;

    private java.lang.Integer direction;

    private java.lang.Integer duration;

    private java.lang.Integer eventSubType;

    private java.util.Calendar eventTime;

    private java.lang.Integer eventType;

    private co.com.tigo.gatewaytigov19.webscp.ws.LocationDTO location;

    private java.lang.String locationAreaId;

    private java.lang.String msisdn;

    private co.com.tigo.gatewaytigov19.webscp.ws.NetworkBearerIDDTO networkBearerId;

    private java.lang.Integer numberOfEvents;

    private java.lang.String origAddress;

    private java.lang.Integer preAnswerDuration;

    private java.lang.String predeterminedCommunity;

    private java.lang.Integer queryType;

    private java.lang.String transactionId;

    private java.lang.Integer volume;

    public AdviceOfChargeRequestDTO() {
    }

    public AdviceOfChargeRequestDTO(
           java.lang.Integer addressType,
           java.lang.Boolean allowAdditionalStates,
           java.lang.String cellId,
           java.lang.String destAddress,
           java.lang.Integer direction,
           java.lang.Integer duration,
           java.lang.Integer eventSubType,
           java.util.Calendar eventTime,
           java.lang.Integer eventType,
           co.com.tigo.gatewaytigov19.webscp.ws.LocationDTO location,
           java.lang.String locationAreaId,
           java.lang.String msisdn,
           co.com.tigo.gatewaytigov19.webscp.ws.NetworkBearerIDDTO networkBearerId,
           java.lang.Integer numberOfEvents,
           java.lang.String origAddress,
           java.lang.Integer preAnswerDuration,
           java.lang.String predeterminedCommunity,
           java.lang.Integer queryType,
           java.lang.String transactionId,
           java.lang.Integer volume) {
           this.addressType = addressType;
           this.allowAdditionalStates = allowAdditionalStates;
           this.cellId = cellId;
           this.destAddress = destAddress;
           this.direction = direction;
           this.duration = duration;
           this.eventSubType = eventSubType;
           this.eventTime = eventTime;
           this.eventType = eventType;
           this.location = location;
           this.locationAreaId = locationAreaId;
           this.msisdn = msisdn;
           this.networkBearerId = networkBearerId;
           this.numberOfEvents = numberOfEvents;
           this.origAddress = origAddress;
           this.preAnswerDuration = preAnswerDuration;
           this.predeterminedCommunity = predeterminedCommunity;
           this.queryType = queryType;
           this.transactionId = transactionId;
           this.volume = volume;
    }


    /**
     * Gets the addressType value for this AdviceOfChargeRequestDTO.
     * 
     * @return addressType
     */
    public java.lang.Integer getAddressType() {
        return addressType;
    }


    /**
     * Sets the addressType value for this AdviceOfChargeRequestDTO.
     * 
     * @param addressType
     */
    public void setAddressType(java.lang.Integer addressType) {
        this.addressType = addressType;
    }


    /**
     * Gets the allowAdditionalStates value for this AdviceOfChargeRequestDTO.
     * 
     * @return allowAdditionalStates
     */
    public java.lang.Boolean getAllowAdditionalStates() {
        return allowAdditionalStates;
    }


    /**
     * Sets the allowAdditionalStates value for this AdviceOfChargeRequestDTO.
     * 
     * @param allowAdditionalStates
     */
    public void setAllowAdditionalStates(java.lang.Boolean allowAdditionalStates) {
        this.allowAdditionalStates = allowAdditionalStates;
    }


    /**
     * Gets the cellId value for this AdviceOfChargeRequestDTO.
     * 
     * @return cellId
     */
    public java.lang.String getCellId() {
        return cellId;
    }


    /**
     * Sets the cellId value for this AdviceOfChargeRequestDTO.
     * 
     * @param cellId
     */
    public void setCellId(java.lang.String cellId) {
        this.cellId = cellId;
    }


    /**
     * Gets the destAddress value for this AdviceOfChargeRequestDTO.
     * 
     * @return destAddress
     */
    public java.lang.String getDestAddress() {
        return destAddress;
    }


    /**
     * Sets the destAddress value for this AdviceOfChargeRequestDTO.
     * 
     * @param destAddress
     */
    public void setDestAddress(java.lang.String destAddress) {
        this.destAddress = destAddress;
    }


    /**
     * Gets the direction value for this AdviceOfChargeRequestDTO.
     * 
     * @return direction
     */
    public java.lang.Integer getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this AdviceOfChargeRequestDTO.
     * 
     * @param direction
     */
    public void setDirection(java.lang.Integer direction) {
        this.direction = direction;
    }


    /**
     * Gets the duration value for this AdviceOfChargeRequestDTO.
     * 
     * @return duration
     */
    public java.lang.Integer getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this AdviceOfChargeRequestDTO.
     * 
     * @param duration
     */
    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }


    /**
     * Gets the eventSubType value for this AdviceOfChargeRequestDTO.
     * 
     * @return eventSubType
     */
    public java.lang.Integer getEventSubType() {
        return eventSubType;
    }


    /**
     * Sets the eventSubType value for this AdviceOfChargeRequestDTO.
     * 
     * @param eventSubType
     */
    public void setEventSubType(java.lang.Integer eventSubType) {
        this.eventSubType = eventSubType;
    }


    /**
     * Gets the eventTime value for this AdviceOfChargeRequestDTO.
     * 
     * @return eventTime
     */
    public java.util.Calendar getEventTime() {
        return eventTime;
    }


    /**
     * Sets the eventTime value for this AdviceOfChargeRequestDTO.
     * 
     * @param eventTime
     */
    public void setEventTime(java.util.Calendar eventTime) {
        this.eventTime = eventTime;
    }


    /**
     * Gets the eventType value for this AdviceOfChargeRequestDTO.
     * 
     * @return eventType
     */
    public java.lang.Integer getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this AdviceOfChargeRequestDTO.
     * 
     * @param eventType
     */
    public void setEventType(java.lang.Integer eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the location value for this AdviceOfChargeRequestDTO.
     * 
     * @return location
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.LocationDTO getLocation() {
        return location;
    }


    /**
     * Sets the location value for this AdviceOfChargeRequestDTO.
     * 
     * @param location
     */
    public void setLocation(co.com.tigo.gatewaytigov19.webscp.ws.LocationDTO location) {
        this.location = location;
    }


    /**
     * Gets the locationAreaId value for this AdviceOfChargeRequestDTO.
     * 
     * @return locationAreaId
     */
    public java.lang.String getLocationAreaId() {
        return locationAreaId;
    }


    /**
     * Sets the locationAreaId value for this AdviceOfChargeRequestDTO.
     * 
     * @param locationAreaId
     */
    public void setLocationAreaId(java.lang.String locationAreaId) {
        this.locationAreaId = locationAreaId;
    }


    /**
     * Gets the msisdn value for this AdviceOfChargeRequestDTO.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this AdviceOfChargeRequestDTO.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the networkBearerId value for this AdviceOfChargeRequestDTO.
     * 
     * @return networkBearerId
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.NetworkBearerIDDTO getNetworkBearerId() {
        return networkBearerId;
    }


    /**
     * Sets the networkBearerId value for this AdviceOfChargeRequestDTO.
     * 
     * @param networkBearerId
     */
    public void setNetworkBearerId(co.com.tigo.gatewaytigov19.webscp.ws.NetworkBearerIDDTO networkBearerId) {
        this.networkBearerId = networkBearerId;
    }


    /**
     * Gets the numberOfEvents value for this AdviceOfChargeRequestDTO.
     * 
     * @return numberOfEvents
     */
    public java.lang.Integer getNumberOfEvents() {
        return numberOfEvents;
    }


    /**
     * Sets the numberOfEvents value for this AdviceOfChargeRequestDTO.
     * 
     * @param numberOfEvents
     */
    public void setNumberOfEvents(java.lang.Integer numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }


    /**
     * Gets the origAddress value for this AdviceOfChargeRequestDTO.
     * 
     * @return origAddress
     */
    public java.lang.String getOrigAddress() {
        return origAddress;
    }


    /**
     * Sets the origAddress value for this AdviceOfChargeRequestDTO.
     * 
     * @param origAddress
     */
    public void setOrigAddress(java.lang.String origAddress) {
        this.origAddress = origAddress;
    }


    /**
     * Gets the preAnswerDuration value for this AdviceOfChargeRequestDTO.
     * 
     * @return preAnswerDuration
     */
    public java.lang.Integer getPreAnswerDuration() {
        return preAnswerDuration;
    }


    /**
     * Sets the preAnswerDuration value for this AdviceOfChargeRequestDTO.
     * 
     * @param preAnswerDuration
     */
    public void setPreAnswerDuration(java.lang.Integer preAnswerDuration) {
        this.preAnswerDuration = preAnswerDuration;
    }


    /**
     * Gets the predeterminedCommunity value for this AdviceOfChargeRequestDTO.
     * 
     * @return predeterminedCommunity
     */
    public java.lang.String getPredeterminedCommunity() {
        return predeterminedCommunity;
    }


    /**
     * Sets the predeterminedCommunity value for this AdviceOfChargeRequestDTO.
     * 
     * @param predeterminedCommunity
     */
    public void setPredeterminedCommunity(java.lang.String predeterminedCommunity) {
        this.predeterminedCommunity = predeterminedCommunity;
    }


    /**
     * Gets the queryType value for this AdviceOfChargeRequestDTO.
     * 
     * @return queryType
     */
    public java.lang.Integer getQueryType() {
        return queryType;
    }


    /**
     * Sets the queryType value for this AdviceOfChargeRequestDTO.
     * 
     * @param queryType
     */
    public void setQueryType(java.lang.Integer queryType) {
        this.queryType = queryType;
    }


    /**
     * Gets the transactionId value for this AdviceOfChargeRequestDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this AdviceOfChargeRequestDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the volume value for this AdviceOfChargeRequestDTO.
     * 
     * @return volume
     */
    public java.lang.Integer getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this AdviceOfChargeRequestDTO.
     * 
     * @param volume
     */
    public void setVolume(java.lang.Integer volume) {
        this.volume = volume;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdviceOfChargeRequestDTO)) return false;
        AdviceOfChargeRequestDTO other = (AdviceOfChargeRequestDTO) obj;
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
            ((this.allowAdditionalStates==null && other.getAllowAdditionalStates()==null) || 
             (this.allowAdditionalStates!=null &&
              this.allowAdditionalStates.equals(other.getAllowAdditionalStates()))) &&
            ((this.cellId==null && other.getCellId()==null) || 
             (this.cellId!=null &&
              this.cellId.equals(other.getCellId()))) &&
            ((this.destAddress==null && other.getDestAddress()==null) || 
             (this.destAddress!=null &&
              this.destAddress.equals(other.getDestAddress()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.eventSubType==null && other.getEventSubType()==null) || 
             (this.eventSubType!=null &&
              this.eventSubType.equals(other.getEventSubType()))) &&
            ((this.eventTime==null && other.getEventTime()==null) || 
             (this.eventTime!=null &&
              this.eventTime.equals(other.getEventTime()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.locationAreaId==null && other.getLocationAreaId()==null) || 
             (this.locationAreaId!=null &&
              this.locationAreaId.equals(other.getLocationAreaId()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.networkBearerId==null && other.getNetworkBearerId()==null) || 
             (this.networkBearerId!=null &&
              this.networkBearerId.equals(other.getNetworkBearerId()))) &&
            ((this.numberOfEvents==null && other.getNumberOfEvents()==null) || 
             (this.numberOfEvents!=null &&
              this.numberOfEvents.equals(other.getNumberOfEvents()))) &&
            ((this.origAddress==null && other.getOrigAddress()==null) || 
             (this.origAddress!=null &&
              this.origAddress.equals(other.getOrigAddress()))) &&
            ((this.preAnswerDuration==null && other.getPreAnswerDuration()==null) || 
             (this.preAnswerDuration!=null &&
              this.preAnswerDuration.equals(other.getPreAnswerDuration()))) &&
            ((this.predeterminedCommunity==null && other.getPredeterminedCommunity()==null) || 
             (this.predeterminedCommunity!=null &&
              this.predeterminedCommunity.equals(other.getPredeterminedCommunity()))) &&
            ((this.queryType==null && other.getQueryType()==null) || 
             (this.queryType!=null &&
              this.queryType.equals(other.getQueryType()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
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
        if (getAllowAdditionalStates() != null) {
            _hashCode += getAllowAdditionalStates().hashCode();
        }
        if (getCellId() != null) {
            _hashCode += getCellId().hashCode();
        }
        if (getDestAddress() != null) {
            _hashCode += getDestAddress().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getEventSubType() != null) {
            _hashCode += getEventSubType().hashCode();
        }
        if (getEventTime() != null) {
            _hashCode += getEventTime().hashCode();
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getLocationAreaId() != null) {
            _hashCode += getLocationAreaId().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getNetworkBearerId() != null) {
            _hashCode += getNetworkBearerId().hashCode();
        }
        if (getNumberOfEvents() != null) {
            _hashCode += getNumberOfEvents().hashCode();
        }
        if (getOrigAddress() != null) {
            _hashCode += getOrigAddress().hashCode();
        }
        if (getPreAnswerDuration() != null) {
            _hashCode += getPreAnswerDuration().hashCode();
        }
        if (getPredeterminedCommunity() != null) {
            _hashCode += getPredeterminedCommunity().hashCode();
        }
        if (getQueryType() != null) {
            _hashCode += getQueryType().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdviceOfChargeRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "adviceOfChargeRequestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAdditionalStates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowAdditionalStates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("destAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("eventSubType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventSubType"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("locationAreaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationAreaId"));
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
        elemField.setFieldName("origAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preAnswerDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preAnswerDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predeterminedCommunity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "predeterminedCommunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
