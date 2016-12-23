/**
 * CreditRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class CreditRequestDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusCredit;

    private java.lang.String creditType;

    private java.lang.String information;

    private java.lang.String mobileNumber;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionCreditColl;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realCredit;

    private java.lang.String transactionId;

    public CreditRequestDTO() {
    }

    public CreditRequestDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusCredit,
           java.lang.String creditType,
           java.lang.String information,
           java.lang.String mobileNumber,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionCreditColl,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realCredit,
           java.lang.String transactionId) {
           this.bonusCredit = bonusCredit;
           this.creditType = creditType;
           this.information = information;
           this.mobileNumber = mobileNumber;
           this.partitionCreditColl = partitionCreditColl;
           this.realCredit = realCredit;
           this.transactionId = transactionId;
    }


    /**
     * Gets the bonusCredit value for this CreditRequestDTO.
     * 
     * @return bonusCredit
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusCredit() {
        return bonusCredit;
    }


    /**
     * Sets the bonusCredit value for this CreditRequestDTO.
     * 
     * @param bonusCredit
     */
    public void setBonusCredit(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusCredit) {
        this.bonusCredit = bonusCredit;
    }


    /**
     * Gets the creditType value for this CreditRequestDTO.
     * 
     * @return creditType
     */
    public java.lang.String getCreditType() {
        return creditType;
    }


    /**
     * Sets the creditType value for this CreditRequestDTO.
     * 
     * @param creditType
     */
    public void setCreditType(java.lang.String creditType) {
        this.creditType = creditType;
    }


    /**
     * Gets the information value for this CreditRequestDTO.
     * 
     * @return information
     */
    public java.lang.String getInformation() {
        return information;
    }


    /**
     * Sets the information value for this CreditRequestDTO.
     * 
     * @param information
     */
    public void setInformation(java.lang.String information) {
        this.information = information;
    }


    /**
     * Gets the mobileNumber value for this CreditRequestDTO.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this CreditRequestDTO.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the partitionCreditColl value for this CreditRequestDTO.
     * 
     * @return partitionCreditColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionCreditColl() {
        return partitionCreditColl;
    }


    /**
     * Sets the partitionCreditColl value for this CreditRequestDTO.
     * 
     * @param partitionCreditColl
     */
    public void setPartitionCreditColl(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionCreditColl) {
        this.partitionCreditColl = partitionCreditColl;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionCreditColl(int i) {
        return this.partitionCreditColl[i];
    }

    public void setPartitionCreditColl(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionCreditColl[i] = _value;
    }


    /**
     * Gets the realCredit value for this CreditRequestDTO.
     * 
     * @return realCredit
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealCredit() {
        return realCredit;
    }


    /**
     * Sets the realCredit value for this CreditRequestDTO.
     * 
     * @param realCredit
     */
    public void setRealCredit(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realCredit) {
        this.realCredit = realCredit;
    }


    /**
     * Gets the transactionId value for this CreditRequestDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this CreditRequestDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditRequestDTO)) return false;
        CreditRequestDTO other = (CreditRequestDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bonusCredit==null && other.getBonusCredit()==null) || 
             (this.bonusCredit!=null &&
              this.bonusCredit.equals(other.getBonusCredit()))) &&
            ((this.creditType==null && other.getCreditType()==null) || 
             (this.creditType!=null &&
              this.creditType.equals(other.getCreditType()))) &&
            ((this.information==null && other.getInformation()==null) || 
             (this.information!=null &&
              this.information.equals(other.getInformation()))) &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.partitionCreditColl==null && other.getPartitionCreditColl()==null) || 
             (this.partitionCreditColl!=null &&
              java.util.Arrays.equals(this.partitionCreditColl, other.getPartitionCreditColl()))) &&
            ((this.realCredit==null && other.getRealCredit()==null) || 
             (this.realCredit!=null &&
              this.realCredit.equals(other.getRealCredit()))) &&
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
        if (getBonusCredit() != null) {
            _hashCode += getBonusCredit().hashCode();
        }
        if (getCreditType() != null) {
            _hashCode += getCreditType().hashCode();
        }
        if (getInformation() != null) {
            _hashCode += getInformation().hashCode();
        }
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getPartitionCreditColl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionCreditColl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionCreditColl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRealCredit() != null) {
            _hashCode += getRealCredit().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "creditRequestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditType"));
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
        elemField.setFieldName("mobileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionCreditColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionCreditColl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "partitionDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
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
