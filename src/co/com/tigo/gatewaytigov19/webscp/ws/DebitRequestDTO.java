/**
 * DebitRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class DebitRequestDTO  implements java.io.Serializable {
    private java.lang.String debitType;

    private java.lang.String information;

    private java.lang.String mobileNumber;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO moneyDebit;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionDebitColl;

    private java.lang.String transactionId;

    private java.lang.String transactionType;

    public DebitRequestDTO() {
    }

    public DebitRequestDTO(
           java.lang.String debitType,
           java.lang.String information,
           java.lang.String mobileNumber,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO moneyDebit,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionDebitColl,
           java.lang.String transactionId,
           java.lang.String transactionType) {
           this.debitType = debitType;
           this.information = information;
           this.mobileNumber = mobileNumber;
           this.moneyDebit = moneyDebit;
           this.partitionDebitColl = partitionDebitColl;
           this.transactionId = transactionId;
           this.transactionType = transactionType;
    }


    /**
     * Gets the debitType value for this DebitRequestDTO.
     * 
     * @return debitType
     */
    public java.lang.String getDebitType() {
        return debitType;
    }


    /**
     * Sets the debitType value for this DebitRequestDTO.
     * 
     * @param debitType
     */
    public void setDebitType(java.lang.String debitType) {
        this.debitType = debitType;
    }


    /**
     * Gets the information value for this DebitRequestDTO.
     * 
     * @return information
     */
    public java.lang.String getInformation() {
        return information;
    }


    /**
     * Sets the information value for this DebitRequestDTO.
     * 
     * @param information
     */
    public void setInformation(java.lang.String information) {
        this.information = information;
    }


    /**
     * Gets the mobileNumber value for this DebitRequestDTO.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this DebitRequestDTO.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the moneyDebit value for this DebitRequestDTO.
     * 
     * @return moneyDebit
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getMoneyDebit() {
        return moneyDebit;
    }


    /**
     * Sets the moneyDebit value for this DebitRequestDTO.
     * 
     * @param moneyDebit
     */
    public void setMoneyDebit(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO moneyDebit) {
        this.moneyDebit = moneyDebit;
    }


    /**
     * Gets the partitionDebitColl value for this DebitRequestDTO.
     * 
     * @return partitionDebitColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionDebitColl() {
        return partitionDebitColl;
    }


    /**
     * Sets the partitionDebitColl value for this DebitRequestDTO.
     * 
     * @param partitionDebitColl
     */
    public void setPartitionDebitColl(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionDebitColl) {
        this.partitionDebitColl = partitionDebitColl;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionDebitColl(int i) {
        return this.partitionDebitColl[i];
    }

    public void setPartitionDebitColl(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionDebitColl[i] = _value;
    }


    /**
     * Gets the transactionId value for this DebitRequestDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this DebitRequestDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transactionType value for this DebitRequestDTO.
     * 
     * @return transactionType
     */
    public java.lang.String getTransactionType() {
        return transactionType;
    }


    /**
     * Sets the transactionType value for this DebitRequestDTO.
     * 
     * @param transactionType
     */
    public void setTransactionType(java.lang.String transactionType) {
        this.transactionType = transactionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DebitRequestDTO)) return false;
        DebitRequestDTO other = (DebitRequestDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.debitType==null && other.getDebitType()==null) || 
             (this.debitType!=null &&
              this.debitType.equals(other.getDebitType()))) &&
            ((this.information==null && other.getInformation()==null) || 
             (this.information!=null &&
              this.information.equals(other.getInformation()))) &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.moneyDebit==null && other.getMoneyDebit()==null) || 
             (this.moneyDebit!=null &&
              this.moneyDebit.equals(other.getMoneyDebit()))) &&
            ((this.partitionDebitColl==null && other.getPartitionDebitColl()==null) || 
             (this.partitionDebitColl!=null &&
              java.util.Arrays.equals(this.partitionDebitColl, other.getPartitionDebitColl()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.transactionType==null && other.getTransactionType()==null) || 
             (this.transactionType!=null &&
              this.transactionType.equals(other.getTransactionType())));
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
        if (getDebitType() != null) {
            _hashCode += getDebitType().hashCode();
        }
        if (getInformation() != null) {
            _hashCode += getInformation().hashCode();
        }
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getMoneyDebit() != null) {
            _hashCode += getMoneyDebit().hashCode();
        }
        if (getPartitionDebitColl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionDebitColl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionDebitColl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTransactionType() != null) {
            _hashCode += getTransactionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DebitRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "debitRequestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "debitType"));
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
        elemField.setFieldName("moneyDebit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moneyDebit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionDebitColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionDebitColl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "partitionDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
