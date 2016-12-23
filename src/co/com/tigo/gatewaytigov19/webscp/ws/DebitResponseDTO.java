/**
 * DebitResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class DebitResponseDTO  implements java.io.Serializable {
    private java.lang.String authorizationNumber;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusDebited;

    private java.util.Calendar expirationDate;

    private java.lang.String mobileNumber;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionDebited;

    private co.com.tigo.gatewaytigov19.webscp.ws.IdDTO product;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realDebited;

    private co.com.tigo.gatewaytigov19.webscp.ws.IdDTO serviceProvider;

    private co.com.tigo.gatewaytigov19.webscp.ws.IdDTO state;

    private java.lang.String transactionId;

    public DebitResponseDTO() {
    }

    public DebitResponseDTO(
           java.lang.String authorizationNumber,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusDebited,
           java.util.Calendar expirationDate,
           java.lang.String mobileNumber,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionDebited,
           co.com.tigo.gatewaytigov19.webscp.ws.IdDTO product,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realDebited,
           co.com.tigo.gatewaytigov19.webscp.ws.IdDTO serviceProvider,
           co.com.tigo.gatewaytigov19.webscp.ws.IdDTO state,
           java.lang.String transactionId) {
           this.authorizationNumber = authorizationNumber;
           this.bonusBalance = bonusBalance;
           this.bonusDebited = bonusDebited;
           this.expirationDate = expirationDate;
           this.mobileNumber = mobileNumber;
           this.partitionBalance = partitionBalance;
           this.partitionDebited = partitionDebited;
           this.product = product;
           this.realBalance = realBalance;
           this.realDebited = realDebited;
           this.serviceProvider = serviceProvider;
           this.state = state;
           this.transactionId = transactionId;
    }


    /**
     * Gets the authorizationNumber value for this DebitResponseDTO.
     * 
     * @return authorizationNumber
     */
    public java.lang.String getAuthorizationNumber() {
        return authorizationNumber;
    }


    /**
     * Sets the authorizationNumber value for this DebitResponseDTO.
     * 
     * @param authorizationNumber
     */
    public void setAuthorizationNumber(java.lang.String authorizationNumber) {
        this.authorizationNumber = authorizationNumber;
    }


    /**
     * Gets the bonusBalance value for this DebitResponseDTO.
     * 
     * @return bonusBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusBalance() {
        return bonusBalance;
    }


    /**
     * Sets the bonusBalance value for this DebitResponseDTO.
     * 
     * @param bonusBalance
     */
    public void setBonusBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance) {
        this.bonusBalance = bonusBalance;
    }


    /**
     * Gets the bonusDebited value for this DebitResponseDTO.
     * 
     * @return bonusDebited
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusDebited() {
        return bonusDebited;
    }


    /**
     * Sets the bonusDebited value for this DebitResponseDTO.
     * 
     * @param bonusDebited
     */
    public void setBonusDebited(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusDebited) {
        this.bonusDebited = bonusDebited;
    }


    /**
     * Gets the expirationDate value for this DebitResponseDTO.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this DebitResponseDTO.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the mobileNumber value for this DebitResponseDTO.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this DebitResponseDTO.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the partitionBalance value for this DebitResponseDTO.
     * 
     * @return partitionBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionBalance() {
        return partitionBalance;
    }


    /**
     * Sets the partitionBalance value for this DebitResponseDTO.
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
     * Gets the partitionDebited value for this DebitResponseDTO.
     * 
     * @return partitionDebited
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionDebited() {
        return partitionDebited;
    }


    /**
     * Sets the partitionDebited value for this DebitResponseDTO.
     * 
     * @param partitionDebited
     */
    public void setPartitionDebited(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionDebited) {
        this.partitionDebited = partitionDebited;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionDebited(int i) {
        return this.partitionDebited[i];
    }

    public void setPartitionDebited(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionDebited[i] = _value;
    }


    /**
     * Gets the product value for this DebitResponseDTO.
     * 
     * @return product
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.IdDTO getProduct() {
        return product;
    }


    /**
     * Sets the product value for this DebitResponseDTO.
     * 
     * @param product
     */
    public void setProduct(co.com.tigo.gatewaytigov19.webscp.ws.IdDTO product) {
        this.product = product;
    }


    /**
     * Gets the realBalance value for this DebitResponseDTO.
     * 
     * @return realBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealBalance() {
        return realBalance;
    }


    /**
     * Sets the realBalance value for this DebitResponseDTO.
     * 
     * @param realBalance
     */
    public void setRealBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance) {
        this.realBalance = realBalance;
    }


    /**
     * Gets the realDebited value for this DebitResponseDTO.
     * 
     * @return realDebited
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealDebited() {
        return realDebited;
    }


    /**
     * Sets the realDebited value for this DebitResponseDTO.
     * 
     * @param realDebited
     */
    public void setRealDebited(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realDebited) {
        this.realDebited = realDebited;
    }


    /**
     * Gets the serviceProvider value for this DebitResponseDTO.
     * 
     * @return serviceProvider
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.IdDTO getServiceProvider() {
        return serviceProvider;
    }


    /**
     * Sets the serviceProvider value for this DebitResponseDTO.
     * 
     * @param serviceProvider
     */
    public void setServiceProvider(co.com.tigo.gatewaytigov19.webscp.ws.IdDTO serviceProvider) {
        this.serviceProvider = serviceProvider;
    }


    /**
     * Gets the state value for this DebitResponseDTO.
     * 
     * @return state
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.IdDTO getState() {
        return state;
    }


    /**
     * Sets the state value for this DebitResponseDTO.
     * 
     * @param state
     */
    public void setState(co.com.tigo.gatewaytigov19.webscp.ws.IdDTO state) {
        this.state = state;
    }


    /**
     * Gets the transactionId value for this DebitResponseDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this DebitResponseDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DebitResponseDTO)) return false;
        DebitResponseDTO other = (DebitResponseDTO) obj;
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
            ((this.bonusDebited==null && other.getBonusDebited()==null) || 
             (this.bonusDebited!=null &&
              this.bonusDebited.equals(other.getBonusDebited()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.partitionBalance==null && other.getPartitionBalance()==null) || 
             (this.partitionBalance!=null &&
              java.util.Arrays.equals(this.partitionBalance, other.getPartitionBalance()))) &&
            ((this.partitionDebited==null && other.getPartitionDebited()==null) || 
             (this.partitionDebited!=null &&
              java.util.Arrays.equals(this.partitionDebited, other.getPartitionDebited()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.realBalance==null && other.getRealBalance()==null) || 
             (this.realBalance!=null &&
              this.realBalance.equals(other.getRealBalance()))) &&
            ((this.realDebited==null && other.getRealDebited()==null) || 
             (this.realDebited!=null &&
              this.realDebited.equals(other.getRealDebited()))) &&
            ((this.serviceProvider==null && other.getServiceProvider()==null) || 
             (this.serviceProvider!=null &&
              this.serviceProvider.equals(other.getServiceProvider()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
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
        if (getBonusDebited() != null) {
            _hashCode += getBonusDebited().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
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
        if (getPartitionDebited() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionDebited());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionDebited(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getRealBalance() != null) {
            _hashCode += getRealBalance().hashCode();
        }
        if (getRealDebited() != null) {
            _hashCode += getRealDebited().hashCode();
        }
        if (getServiceProvider() != null) {
            _hashCode += getServiceProvider().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DebitResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "debitResponseDTO"));
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
        elemField.setFieldName("bonusDebited");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusDebited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("partitionDebited");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionDebited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "partitionDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "idDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realDebited");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realDebited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceProvider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "idDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "idDTO"));
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
