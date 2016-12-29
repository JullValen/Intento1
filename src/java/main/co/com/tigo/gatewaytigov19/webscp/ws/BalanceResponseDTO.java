/**
 * BalanceResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class BalanceResponseDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusReserved;

    private co.com.tigo.gatewaytigov19.webscp.ws.ControlledAccountBalanceDTO controlledAccount;

    private java.util.Calendar expirationDate;

    private java.lang.String msisdn;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionReserved;

    private co.com.tigo.gatewaytigov19.webscp.ws.IdDTO product;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realReserved;

    private co.com.tigo.gatewaytigov19.webscp.ws.IdDTO serviceProvider;

    private co.com.tigo.gatewaytigov19.webscp.ws.IdDTO state;

    private java.lang.String transactionId;

    public BalanceResponseDTO() {
    }

    public BalanceResponseDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusReserved,
           co.com.tigo.gatewaytigov19.webscp.ws.ControlledAccountBalanceDTO controlledAccount,
           java.util.Calendar expirationDate,
           java.lang.String msisdn,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionReserved,
           co.com.tigo.gatewaytigov19.webscp.ws.IdDTO product,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realReserved,
           co.com.tigo.gatewaytigov19.webscp.ws.IdDTO serviceProvider,
           co.com.tigo.gatewaytigov19.webscp.ws.IdDTO state,
           java.lang.String transactionId) {
           this.bonusBalance = bonusBalance;
           this.bonusReserved = bonusReserved;
           this.controlledAccount = controlledAccount;
           this.expirationDate = expirationDate;
           this.msisdn = msisdn;
           this.partitionBalance = partitionBalance;
           this.partitionReserved = partitionReserved;
           this.product = product;
           this.realBalance = realBalance;
           this.realReserved = realReserved;
           this.serviceProvider = serviceProvider;
           this.state = state;
           this.transactionId = transactionId;
    }


    /**
     * Gets the bonusBalance value for this BalanceResponseDTO.
     * 
     * @return bonusBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusBalance() {
        return bonusBalance;
    }


    /**
     * Sets the bonusBalance value for this BalanceResponseDTO.
     * 
     * @param bonusBalance
     */
    public void setBonusBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance) {
        this.bonusBalance = bonusBalance;
    }


    /**
     * Gets the bonusReserved value for this BalanceResponseDTO.
     * 
     * @return bonusReserved
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusReserved() {
        return bonusReserved;
    }


    /**
     * Sets the bonusReserved value for this BalanceResponseDTO.
     * 
     * @param bonusReserved
     */
    public void setBonusReserved(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusReserved) {
        this.bonusReserved = bonusReserved;
    }


    /**
     * Gets the controlledAccount value for this BalanceResponseDTO.
     * 
     * @return controlledAccount
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ControlledAccountBalanceDTO getControlledAccount() {
        return controlledAccount;
    }


    /**
     * Sets the controlledAccount value for this BalanceResponseDTO.
     * 
     * @param controlledAccount
     */
    public void setControlledAccount(co.com.tigo.gatewaytigov19.webscp.ws.ControlledAccountBalanceDTO controlledAccount) {
        this.controlledAccount = controlledAccount;
    }


    /**
     * Gets the expirationDate value for this BalanceResponseDTO.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this BalanceResponseDTO.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the msisdn value for this BalanceResponseDTO.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this BalanceResponseDTO.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the partitionBalance value for this BalanceResponseDTO.
     * 
     * @return partitionBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionBalance() {
        return partitionBalance;
    }


    /**
     * Sets the partitionBalance value for this BalanceResponseDTO.
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
     * Gets the partitionReserved value for this BalanceResponseDTO.
     * 
     * @return partitionReserved
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionReserved() {
        return partitionReserved;
    }


    /**
     * Sets the partitionReserved value for this BalanceResponseDTO.
     * 
     * @param partitionReserved
     */
    public void setPartitionReserved(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionReserved) {
        this.partitionReserved = partitionReserved;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionReserved(int i) {
        return this.partitionReserved[i];
    }

    public void setPartitionReserved(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionReserved[i] = _value;
    }


    /**
     * Gets the product value for this BalanceResponseDTO.
     * 
     * @return product
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.IdDTO getProduct() {
        return product;
    }


    /**
     * Sets the product value for this BalanceResponseDTO.
     * 
     * @param product
     */
    public void setProduct(co.com.tigo.gatewaytigov19.webscp.ws.IdDTO product) {
        this.product = product;
    }


    /**
     * Gets the realBalance value for this BalanceResponseDTO.
     * 
     * @return realBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealBalance() {
        return realBalance;
    }


    /**
     * Sets the realBalance value for this BalanceResponseDTO.
     * 
     * @param realBalance
     */
    public void setRealBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance) {
        this.realBalance = realBalance;
    }


    /**
     * Gets the realReserved value for this BalanceResponseDTO.
     * 
     * @return realReserved
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealReserved() {
        return realReserved;
    }


    /**
     * Sets the realReserved value for this BalanceResponseDTO.
     * 
     * @param realReserved
     */
    public void setRealReserved(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realReserved) {
        this.realReserved = realReserved;
    }


    /**
     * Gets the serviceProvider value for this BalanceResponseDTO.
     * 
     * @return serviceProvider
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.IdDTO getServiceProvider() {
        return serviceProvider;
    }


    /**
     * Sets the serviceProvider value for this BalanceResponseDTO.
     * 
     * @param serviceProvider
     */
    public void setServiceProvider(co.com.tigo.gatewaytigov19.webscp.ws.IdDTO serviceProvider) {
        this.serviceProvider = serviceProvider;
    }


    /**
     * Gets the state value for this BalanceResponseDTO.
     * 
     * @return state
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.IdDTO getState() {
        return state;
    }


    /**
     * Sets the state value for this BalanceResponseDTO.
     * 
     * @param state
     */
    public void setState(co.com.tigo.gatewaytigov19.webscp.ws.IdDTO state) {
        this.state = state;
    }


    /**
     * Gets the transactionId value for this BalanceResponseDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this BalanceResponseDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BalanceResponseDTO)) return false;
        BalanceResponseDTO other = (BalanceResponseDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bonusBalance==null && other.getBonusBalance()==null) || 
             (this.bonusBalance!=null &&
              this.bonusBalance.equals(other.getBonusBalance()))) &&
            ((this.bonusReserved==null && other.getBonusReserved()==null) || 
             (this.bonusReserved!=null &&
              this.bonusReserved.equals(other.getBonusReserved()))) &&
            ((this.controlledAccount==null && other.getControlledAccount()==null) || 
             (this.controlledAccount!=null &&
              this.controlledAccount.equals(other.getControlledAccount()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.partitionBalance==null && other.getPartitionBalance()==null) || 
             (this.partitionBalance!=null &&
              java.util.Arrays.equals(this.partitionBalance, other.getPartitionBalance()))) &&
            ((this.partitionReserved==null && other.getPartitionReserved()==null) || 
             (this.partitionReserved!=null &&
              java.util.Arrays.equals(this.partitionReserved, other.getPartitionReserved()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.realBalance==null && other.getRealBalance()==null) || 
             (this.realBalance!=null &&
              this.realBalance.equals(other.getRealBalance()))) &&
            ((this.realReserved==null && other.getRealReserved()==null) || 
             (this.realReserved!=null &&
              this.realReserved.equals(other.getRealReserved()))) &&
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
        if (getBonusBalance() != null) {
            _hashCode += getBonusBalance().hashCode();
        }
        if (getBonusReserved() != null) {
            _hashCode += getBonusReserved().hashCode();
        }
        if (getControlledAccount() != null) {
            _hashCode += getControlledAccount().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
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
        if (getPartitionReserved() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionReserved());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionReserved(), i);
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
        if (getRealReserved() != null) {
            _hashCode += getRealReserved().hashCode();
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
        new org.apache.axis.description.TypeDesc(BalanceResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "balanceResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusReserved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusReserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlledAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "controlledAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "controlledAccountBalanceDTO"));
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
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msisdn"));
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
        elemField.setFieldName("partitionReserved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionReserved"));
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
        elemField.setFieldName("realReserved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realReserved"));
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
