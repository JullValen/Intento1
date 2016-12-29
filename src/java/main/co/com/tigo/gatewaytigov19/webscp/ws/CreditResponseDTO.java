/**
 * CreditResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class CreditResponseDTO  implements java.io.Serializable {
    private java.lang.String authorizationNumber;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusCredit;

    private java.lang.String mobileNumber;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionCredit;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realCredit;

    private java.lang.String transactionId;

    public CreditResponseDTO() {
    }

    public CreditResponseDTO(
           java.lang.String authorizationNumber,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusCredit,
           java.lang.String mobileNumber,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionCredit,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realCredit,
           java.lang.String transactionId) {
           this.authorizationNumber = authorizationNumber;
           this.bonusBalance = bonusBalance;
           this.bonusCredit = bonusCredit;
           this.mobileNumber = mobileNumber;
           this.partitionBalance = partitionBalance;
           this.partitionCredit = partitionCredit;
           this.realBalance = realBalance;
           this.realCredit = realCredit;
           this.transactionId = transactionId;
    }


    /**
     * Gets the authorizationNumber value for this CreditResponseDTO.
     * 
     * @return authorizationNumber
     */
    public java.lang.String getAuthorizationNumber() {
        return authorizationNumber;
    }


    /**
     * Sets the authorizationNumber value for this CreditResponseDTO.
     * 
     * @param authorizationNumber
     */
    public void setAuthorizationNumber(java.lang.String authorizationNumber) {
        this.authorizationNumber = authorizationNumber;
    }


    /**
     * Gets the bonusBalance value for this CreditResponseDTO.
     * 
     * @return bonusBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusBalance() {
        return bonusBalance;
    }


    /**
     * Sets the bonusBalance value for this CreditResponseDTO.
     * 
     * @param bonusBalance
     */
    public void setBonusBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance) {
        this.bonusBalance = bonusBalance;
    }


    /**
     * Gets the bonusCredit value for this CreditResponseDTO.
     * 
     * @return bonusCredit
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusCredit() {
        return bonusCredit;
    }


    /**
     * Sets the bonusCredit value for this CreditResponseDTO.
     * 
     * @param bonusCredit
     */
    public void setBonusCredit(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusCredit) {
        this.bonusCredit = bonusCredit;
    }


    /**
     * Gets the mobileNumber value for this CreditResponseDTO.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this CreditResponseDTO.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the partitionBalance value for this CreditResponseDTO.
     * 
     * @return partitionBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionBalance() {
        return partitionBalance;
    }


    /**
     * Sets the partitionBalance value for this CreditResponseDTO.
     * 
     * @param partitionBalance
     */
    public void setPartitionBalance(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalance) {
        this.partitionBalance = partitionBalance;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionBalance(int i) {
        return this.partitionBalance[i];
    }

    public void setPartitionBalance(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionBalance[i] = _value;
    }


    /**
     * Gets the partitionCredit value for this CreditResponseDTO.
     * 
     * @return partitionCredit
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionCredit() {
        return partitionCredit;
    }


    /**
     * Sets the partitionCredit value for this CreditResponseDTO.
     * 
     * @param partitionCredit
     */
    public void setPartitionCredit(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionCredit) {
        this.partitionCredit = partitionCredit;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionCredit(int i) {
        return this.partitionCredit[i];
    }

    public void setPartitionCredit(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionCredit[i] = _value;
    }


    /**
     * Gets the realBalance value for this CreditResponseDTO.
     * 
     * @return realBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealBalance() {
        return realBalance;
    }


    /**
     * Sets the realBalance value for this CreditResponseDTO.
     * 
     * @param realBalance
     */
    public void setRealBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance) {
        this.realBalance = realBalance;
    }


    /**
     * Gets the realCredit value for this CreditResponseDTO.
     * 
     * @return realCredit
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealCredit() {
        return realCredit;
    }


    /**
     * Sets the realCredit value for this CreditResponseDTO.
     * 
     * @param realCredit
     */
    public void setRealCredit(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realCredit) {
        this.realCredit = realCredit;
    }


    /**
     * Gets the transactionId value for this CreditResponseDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this CreditResponseDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditResponseDTO)) return false;
        CreditResponseDTO other = (CreditResponseDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authorizationNumber==null && other.getAuthorizationNumber()==null) || 
             (this.authorizationNumber!=null &&
              this.authorizationNumber.equals(other.getAuthorizationNumber()))) &&
            ((this.bonusBalance==null && other.getBonusBalance()==null) || 
             (this.bonusBalance!=null &&
              this.bonusBalance.equals(other.getBonusBalance()))) &&
            ((this.bonusCredit==null && other.getBonusCredit()==null) || 
             (this.bonusCredit!=null &&
              this.bonusCredit.equals(other.getBonusCredit()))) &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.partitionBalance==null && other.getPartitionBalance()==null) || 
             (this.partitionBalance!=null &&
              java.util.Arrays.equals(this.partitionBalance, other.getPartitionBalance()))) &&
            ((this.partitionCredit==null && other.getPartitionCredit()==null) || 
             (this.partitionCredit!=null &&
              java.util.Arrays.equals(this.partitionCredit, other.getPartitionCredit()))) &&
            ((this.realBalance==null && other.getRealBalance()==null) || 
             (this.realBalance!=null &&
              this.realBalance.equals(other.getRealBalance()))) &&
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
        if (getAuthorizationNumber() != null) {
            _hashCode += getAuthorizationNumber().hashCode();
        }
        if (getBonusBalance() != null) {
            _hashCode += getBonusBalance().hashCode();
        }
        if (getBonusCredit() != null) {
            _hashCode += getBonusCredit().hashCode();
        }
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getPartitionBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartitionCredit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionCredit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionCredit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRealBalance() != null) {
            _hashCode += getRealBalance().hashCode();
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
        new org.apache.axis.description.TypeDesc(CreditResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "creditResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorizationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
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
        elemField.setFieldName("partitionBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "partitionDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "partitionDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
