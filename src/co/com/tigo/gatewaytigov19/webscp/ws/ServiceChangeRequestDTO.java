/**
 * ServiceChangeRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ServiceChangeRequestDTO  implements java.io.Serializable {
    private java.util.Calendar eventTime;

    private java.lang.String information;

    private java.lang.String mobileNumber;

    private java.lang.String originatingSource;

    private java.lang.String priceListId;

    private java.lang.String requestingEntity;

    private java.lang.String retailerName;

    private java.lang.Integer serviceAction;

    private java.util.Calendar serviceEndTime;

    private java.lang.String serviceId;

    private java.util.Calendar serviceStartTime;

    private java.lang.String transactionId;

    public ServiceChangeRequestDTO() {
    }

    public ServiceChangeRequestDTO(
           java.util.Calendar eventTime,
           java.lang.String information,
           java.lang.String mobileNumber,
           java.lang.String originatingSource,
           java.lang.String priceListId,
           java.lang.String requestingEntity,
           java.lang.String retailerName,
           java.lang.Integer serviceAction,
           java.util.Calendar serviceEndTime,
           java.lang.String serviceId,
           java.util.Calendar serviceStartTime,
           java.lang.String transactionId) {
           this.eventTime = eventTime;
           this.information = information;
           this.mobileNumber = mobileNumber;
           this.originatingSource = originatingSource;
           this.priceListId = priceListId;
           this.requestingEntity = requestingEntity;
           this.retailerName = retailerName;
           this.serviceAction = serviceAction;
           this.serviceEndTime = serviceEndTime;
           this.serviceId = serviceId;
           this.serviceStartTime = serviceStartTime;
           this.transactionId = transactionId;
    }


    /**
     * Gets the eventTime value for this ServiceChangeRequestDTO.
     * 
     * @return eventTime
     */
    public java.util.Calendar getEventTime() {
        return eventTime;
    }


    /**
     * Sets the eventTime value for this ServiceChangeRequestDTO.
     * 
     * @param eventTime
     */
    public void setEventTime(java.util.Calendar eventTime) {
        this.eventTime = eventTime;
    }


    /**
     * Gets the information value for this ServiceChangeRequestDTO.
     * 
     * @return information
     */
    public java.lang.String getInformation() {
        return information;
    }


    /**
     * Sets the information value for this ServiceChangeRequestDTO.
     * 
     * @param information
     */
    public void setInformation(java.lang.String information) {
        this.information = information;
    }


    /**
     * Gets the mobileNumber value for this ServiceChangeRequestDTO.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this ServiceChangeRequestDTO.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the originatingSource value for this ServiceChangeRequestDTO.
     * 
     * @return originatingSource
     */
    public java.lang.String getOriginatingSource() {
        return originatingSource;
    }


    /**
     * Sets the originatingSource value for this ServiceChangeRequestDTO.
     * 
     * @param originatingSource
     */
    public void setOriginatingSource(java.lang.String originatingSource) {
        this.originatingSource = originatingSource;
    }


    /**
     * Gets the priceListId value for this ServiceChangeRequestDTO.
     * 
     * @return priceListId
     */
    public java.lang.String getPriceListId() {
        return priceListId;
    }


    /**
     * Sets the priceListId value for this ServiceChangeRequestDTO.
     * 
     * @param priceListId
     */
    public void setPriceListId(java.lang.String priceListId) {
        this.priceListId = priceListId;
    }


    /**
     * Gets the requestingEntity value for this ServiceChangeRequestDTO.
     * 
     * @return requestingEntity
     */
    public java.lang.String getRequestingEntity() {
        return requestingEntity;
    }


    /**
     * Sets the requestingEntity value for this ServiceChangeRequestDTO.
     * 
     * @param requestingEntity
     */
    public void setRequestingEntity(java.lang.String requestingEntity) {
        this.requestingEntity = requestingEntity;
    }


    /**
     * Gets the retailerName value for this ServiceChangeRequestDTO.
     * 
     * @return retailerName
     */
    public java.lang.String getRetailerName() {
        return retailerName;
    }


    /**
     * Sets the retailerName value for this ServiceChangeRequestDTO.
     * 
     * @param retailerName
     */
    public void setRetailerName(java.lang.String retailerName) {
        this.retailerName = retailerName;
    }


    /**
     * Gets the serviceAction value for this ServiceChangeRequestDTO.
     * 
     * @return serviceAction
     */
    public java.lang.Integer getServiceAction() {
        return serviceAction;
    }


    /**
     * Sets the serviceAction value for this ServiceChangeRequestDTO.
     * 
     * @param serviceAction
     */
    public void setServiceAction(java.lang.Integer serviceAction) {
        this.serviceAction = serviceAction;
    }


    /**
     * Gets the serviceEndTime value for this ServiceChangeRequestDTO.
     * 
     * @return serviceEndTime
     */
    public java.util.Calendar getServiceEndTime() {
        return serviceEndTime;
    }


    /**
     * Sets the serviceEndTime value for this ServiceChangeRequestDTO.
     * 
     * @param serviceEndTime
     */
    public void setServiceEndTime(java.util.Calendar serviceEndTime) {
        this.serviceEndTime = serviceEndTime;
    }


    /**
     * Gets the serviceId value for this ServiceChangeRequestDTO.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this ServiceChangeRequestDTO.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceStartTime value for this ServiceChangeRequestDTO.
     * 
     * @return serviceStartTime
     */
    public java.util.Calendar getServiceStartTime() {
        return serviceStartTime;
    }


    /**
     * Sets the serviceStartTime value for this ServiceChangeRequestDTO.
     * 
     * @param serviceStartTime
     */
    public void setServiceStartTime(java.util.Calendar serviceStartTime) {
        this.serviceStartTime = serviceStartTime;
    }


    /**
     * Gets the transactionId value for this ServiceChangeRequestDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this ServiceChangeRequestDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceChangeRequestDTO)) return false;
        ServiceChangeRequestDTO other = (ServiceChangeRequestDTO) obj;
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
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.originatingSource==null && other.getOriginatingSource()==null) || 
             (this.originatingSource!=null &&
              this.originatingSource.equals(other.getOriginatingSource()))) &&
            ((this.priceListId==null && other.getPriceListId()==null) || 
             (this.priceListId!=null &&
              this.priceListId.equals(other.getPriceListId()))) &&
            ((this.requestingEntity==null && other.getRequestingEntity()==null) || 
             (this.requestingEntity!=null &&
              this.requestingEntity.equals(other.getRequestingEntity()))) &&
            ((this.retailerName==null && other.getRetailerName()==null) || 
             (this.retailerName!=null &&
              this.retailerName.equals(other.getRetailerName()))) &&
            ((this.serviceAction==null && other.getServiceAction()==null) || 
             (this.serviceAction!=null &&
              this.serviceAction.equals(other.getServiceAction()))) &&
            ((this.serviceEndTime==null && other.getServiceEndTime()==null) || 
             (this.serviceEndTime!=null &&
              this.serviceEndTime.equals(other.getServiceEndTime()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.serviceStartTime==null && other.getServiceStartTime()==null) || 
             (this.serviceStartTime!=null &&
              this.serviceStartTime.equals(other.getServiceStartTime()))) &&
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
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getOriginatingSource() != null) {
            _hashCode += getOriginatingSource().hashCode();
        }
        if (getPriceListId() != null) {
            _hashCode += getPriceListId().hashCode();
        }
        if (getRequestingEntity() != null) {
            _hashCode += getRequestingEntity().hashCode();
        }
        if (getRetailerName() != null) {
            _hashCode += getRetailerName().hashCode();
        }
        if (getServiceAction() != null) {
            _hashCode += getServiceAction().hashCode();
        }
        if (getServiceEndTime() != null) {
            _hashCode += getServiceEndTime().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getServiceStartTime() != null) {
            _hashCode += getServiceStartTime().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceChangeRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceChangeRequestDTO"));
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
        elemField.setFieldName("mobileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileNumber"));
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
        elemField.setFieldName("priceListId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceListId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestingEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestingEntity"));
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
        elemField.setFieldName("serviceAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
