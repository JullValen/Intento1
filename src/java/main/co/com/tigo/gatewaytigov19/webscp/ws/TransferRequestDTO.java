/**
 * TransferRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class TransferRequestDTO  implements java.io.Serializable {
    private java.util.Calendar activeTimeExpiryDateTime;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusTransfer;

    private java.lang.String destAddress;

    private java.util.Calendar eventTime;

    private java.lang.String information;

    private java.lang.String mobileNumber;

    private java.util.Calendar partitionExpiryDatetime;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionTransferColl;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realTransfer;

    private java.lang.String transactioType;

    private java.lang.String transactionId;

    private java.lang.String transferType;

    public TransferRequestDTO() {
    }

    public TransferRequestDTO(
           java.util.Calendar activeTimeExpiryDateTime,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusTransfer,
           java.lang.String destAddress,
           java.util.Calendar eventTime,
           java.lang.String information,
           java.lang.String mobileNumber,
           java.util.Calendar partitionExpiryDatetime,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionTransferColl,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realTransfer,
           java.lang.String transactioType,
           java.lang.String transactionId,
           java.lang.String transferType) {
           this.activeTimeExpiryDateTime = activeTimeExpiryDateTime;
           this.bonusTransfer = bonusTransfer;
           this.destAddress = destAddress;
           this.eventTime = eventTime;
           this.information = information;
           this.mobileNumber = mobileNumber;
           this.partitionExpiryDatetime = partitionExpiryDatetime;
           this.partitionTransferColl = partitionTransferColl;
           this.realTransfer = realTransfer;
           this.transactioType = transactioType;
           this.transactionId = transactionId;
           this.transferType = transferType;
    }


    /**
     * Gets the activeTimeExpiryDateTime value for this TransferRequestDTO.
     * 
     * @return activeTimeExpiryDateTime
     */
    public java.util.Calendar getActiveTimeExpiryDateTime() {
        return activeTimeExpiryDateTime;
    }


    /**
     * Sets the activeTimeExpiryDateTime value for this TransferRequestDTO.
     * 
     * @param activeTimeExpiryDateTime
     */
    public void setActiveTimeExpiryDateTime(java.util.Calendar activeTimeExpiryDateTime) {
        this.activeTimeExpiryDateTime = activeTimeExpiryDateTime;
    }


    /**
     * Gets the bonusTransfer value for this TransferRequestDTO.
     * 
     * @return bonusTransfer
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusTransfer() {
        return bonusTransfer;
    }


    /**
     * Sets the bonusTransfer value for this TransferRequestDTO.
     * 
     * @param bonusTransfer
     */
    public void setBonusTransfer(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusTransfer) {
        this.bonusTransfer = bonusTransfer;
    }


    /**
     * Gets the destAddress value for this TransferRequestDTO.
     * 
     * @return destAddress
     */
    public java.lang.String getDestAddress() {
        return destAddress;
    }


    /**
     * Sets the destAddress value for this TransferRequestDTO.
     * 
     * @param destAddress
     */
    public void setDestAddress(java.lang.String destAddress) {
        this.destAddress = destAddress;
    }


    /**
     * Gets the eventTime value for this TransferRequestDTO.
     * 
     * @return eventTime
     */
    public java.util.Calendar getEventTime() {
        return eventTime;
    }


    /**
     * Sets the eventTime value for this TransferRequestDTO.
     * 
     * @param eventTime
     */
    public void setEventTime(java.util.Calendar eventTime) {
        this.eventTime = eventTime;
    }


    /**
     * Gets the information value for this TransferRequestDTO.
     * 
     * @return information
     */
    public java.lang.String getInformation() {
        return information;
    }


    /**
     * Sets the information value for this TransferRequestDTO.
     * 
     * @param information
     */
    public void setInformation(java.lang.String information) {
        this.information = information;
    }


    /**
     * Gets the mobileNumber value for this TransferRequestDTO.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this TransferRequestDTO.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the partitionExpiryDatetime value for this TransferRequestDTO.
     * 
     * @return partitionExpiryDatetime
     */
    public java.util.Calendar getPartitionExpiryDatetime() {
        return partitionExpiryDatetime;
    }


    /**
     * Sets the partitionExpiryDatetime value for this TransferRequestDTO.
     * 
     * @param partitionExpiryDatetime
     */
    public void setPartitionExpiryDatetime(java.util.Calendar partitionExpiryDatetime) {
        this.partitionExpiryDatetime = partitionExpiryDatetime;
    }


    /**
     * Gets the partitionTransferColl value for this TransferRequestDTO.
     * 
     * @return partitionTransferColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionTransferColl() {
        return partitionTransferColl;
    }


    /**
     * Sets the partitionTransferColl value for this TransferRequestDTO.
     * 
     * @param partitionTransferColl
     */
    public void setPartitionTransferColl(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionTransferColl) {
        this.partitionTransferColl = partitionTransferColl;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionTransferColl(int i) {
        return this.partitionTransferColl[i];
    }

    public void setPartitionTransferColl(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionTransferColl[i] = _value;
    }


    /**
     * Gets the realTransfer value for this TransferRequestDTO.
     * 
     * @return realTransfer
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealTransfer() {
        return realTransfer;
    }


    /**
     * Sets the realTransfer value for this TransferRequestDTO.
     * 
     * @param realTransfer
     */
    public void setRealTransfer(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realTransfer) {
        this.realTransfer = realTransfer;
    }


    /**
     * Gets the transactioType value for this TransferRequestDTO.
     * 
     * @return transactioType
     */
    public java.lang.String getTransactioType() {
        return transactioType;
    }


    /**
     * Sets the transactioType value for this TransferRequestDTO.
     * 
     * @param transactioType
     */
    public void setTransactioType(java.lang.String transactioType) {
        this.transactioType = transactioType;
    }


    /**
     * Gets the transactionId value for this TransferRequestDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this TransferRequestDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transferType value for this TransferRequestDTO.
     * 
     * @return transferType
     */
    public java.lang.String getTransferType() {
        return transferType;
    }


    /**
     * Sets the transferType value for this TransferRequestDTO.
     * 
     * @param transferType
     */
    public void setTransferType(java.lang.String transferType) {
        this.transferType = transferType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferRequestDTO)) return false;
        TransferRequestDTO other = (TransferRequestDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activeTimeExpiryDateTime==null && other.getActiveTimeExpiryDateTime()==null) || 
             (this.activeTimeExpiryDateTime!=null &&
              this.activeTimeExpiryDateTime.equals(other.getActiveTimeExpiryDateTime()))) &&
            ((this.bonusTransfer==null && other.getBonusTransfer()==null) || 
             (this.bonusTransfer!=null &&
              this.bonusTransfer.equals(other.getBonusTransfer()))) &&
            ((this.destAddress==null && other.getDestAddress()==null) || 
             (this.destAddress!=null &&
              this.destAddress.equals(other.getDestAddress()))) &&
            ((this.eventTime==null && other.getEventTime()==null) || 
             (this.eventTime!=null &&
              this.eventTime.equals(other.getEventTime()))) &&
            ((this.information==null && other.getInformation()==null) || 
             (this.information!=null &&
              this.information.equals(other.getInformation()))) &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.partitionExpiryDatetime==null && other.getPartitionExpiryDatetime()==null) || 
             (this.partitionExpiryDatetime!=null &&
              this.partitionExpiryDatetime.equals(other.getPartitionExpiryDatetime()))) &&
            ((this.partitionTransferColl==null && other.getPartitionTransferColl()==null) || 
             (this.partitionTransferColl!=null &&
              java.util.Arrays.equals(this.partitionTransferColl, other.getPartitionTransferColl()))) &&
            ((this.realTransfer==null && other.getRealTransfer()==null) || 
             (this.realTransfer!=null &&
              this.realTransfer.equals(other.getRealTransfer()))) &&
            ((this.transactioType==null && other.getTransactioType()==null) || 
             (this.transactioType!=null &&
              this.transactioType.equals(other.getTransactioType()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.transferType==null && other.getTransferType()==null) || 
             (this.transferType!=null &&
              this.transferType.equals(other.getTransferType())));
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
        if (getActiveTimeExpiryDateTime() != null) {
            _hashCode += getActiveTimeExpiryDateTime().hashCode();
        }
        if (getBonusTransfer() != null) {
            _hashCode += getBonusTransfer().hashCode();
        }
        if (getDestAddress() != null) {
            _hashCode += getDestAddress().hashCode();
        }
        if (getEventTime() != null) {
            _hashCode += getEventTime().hashCode();
        }
        if (getInformation() != null) {
            _hashCode += getInformation().hashCode();
        }
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getPartitionExpiryDatetime() != null) {
            _hashCode += getPartitionExpiryDatetime().hashCode();
        }
        if (getPartitionTransferColl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionTransferColl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionTransferColl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRealTransfer() != null) {
            _hashCode += getRealTransfer().hashCode();
        }
        if (getTransactioType() != null) {
            _hashCode += getTransactioType().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTransferType() != null) {
            _hashCode += getTransferType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "transferRequestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeTimeExpiryDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeTimeExpiryDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusTransfer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusTransfer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
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
        elemField.setFieldName("partitionExpiryDatetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionExpiryDatetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionTransferColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionTransferColl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "partitionDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realTransfer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realTransfer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactioType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactioType"));
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
        elemField.setFieldName("transferType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferType"));
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
