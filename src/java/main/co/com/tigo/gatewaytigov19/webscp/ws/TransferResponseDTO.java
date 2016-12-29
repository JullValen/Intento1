/**
 * TransferResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class TransferResponseDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusMoney;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusTransferred;

    private co.com.tigo.gatewaytigov19.webscp.ws.ControlledAccountBalanceDTO controlledAccountBalance;

    private java.lang.String destAddress;

    private java.util.Calendar expirationDate;

    private java.lang.String mobileNumber;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalanceColl;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionTransferredColl;

    private co.com.tigo.gatewaytigov19.webscp.ws.IdDTO product;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realMoney;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realTransferred;

    private java.lang.Integer sequenceNumber;

    private co.com.tigo.gatewaytigov19.webscp.ws.IdDTO serviceProvider;

    private co.com.tigo.gatewaytigov19.webscp.ws.IdDTO state;

    private java.lang.String transactionId;

    public TransferResponseDTO() {
    }

    public TransferResponseDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusMoney,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusTransferred,
           co.com.tigo.gatewaytigov19.webscp.ws.ControlledAccountBalanceDTO controlledAccountBalance,
           java.lang.String destAddress,
           java.util.Calendar expirationDate,
           java.lang.String mobileNumber,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalanceColl,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionTransferredColl,
           co.com.tigo.gatewaytigov19.webscp.ws.IdDTO product,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realMoney,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realTransferred,
           java.lang.Integer sequenceNumber,
           co.com.tigo.gatewaytigov19.webscp.ws.IdDTO serviceProvider,
           co.com.tigo.gatewaytigov19.webscp.ws.IdDTO state,
           java.lang.String transactionId) {
           this.bonusBalance = bonusBalance;
           this.bonusMoney = bonusMoney;
           this.bonusTransferred = bonusTransferred;
           this.controlledAccountBalance = controlledAccountBalance;
           this.destAddress = destAddress;
           this.expirationDate = expirationDate;
           this.mobileNumber = mobileNumber;
           this.partitionBalanceColl = partitionBalanceColl;
           this.partitionTransferredColl = partitionTransferredColl;
           this.product = product;
           this.realBalance = realBalance;
           this.realMoney = realMoney;
           this.realTransferred = realTransferred;
           this.sequenceNumber = sequenceNumber;
           this.serviceProvider = serviceProvider;
           this.state = state;
           this.transactionId = transactionId;
    }


    /**
     * Gets the bonusBalance value for this TransferResponseDTO.
     * 
     * @return bonusBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusBalance() {
        return bonusBalance;
    }


    /**
     * Sets the bonusBalance value for this TransferResponseDTO.
     * 
     * @param bonusBalance
     */
    public void setBonusBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance) {
        this.bonusBalance = bonusBalance;
    }


    /**
     * Gets the bonusMoney value for this TransferResponseDTO.
     * 
     * @return bonusMoney
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusMoney() {
        return bonusMoney;
    }


    /**
     * Sets the bonusMoney value for this TransferResponseDTO.
     * 
     * @param bonusMoney
     */
    public void setBonusMoney(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusMoney) {
        this.bonusMoney = bonusMoney;
    }


    /**
     * Gets the bonusTransferred value for this TransferResponseDTO.
     * 
     * @return bonusTransferred
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusTransferred() {
        return bonusTransferred;
    }


    /**
     * Sets the bonusTransferred value for this TransferResponseDTO.
     * 
     * @param bonusTransferred
     */
    public void setBonusTransferred(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusTransferred) {
        this.bonusTransferred = bonusTransferred;
    }


    /**
     * Gets the controlledAccountBalance value for this TransferResponseDTO.
     * 
     * @return controlledAccountBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ControlledAccountBalanceDTO getControlledAccountBalance() {
        return controlledAccountBalance;
    }


    /**
     * Sets the controlledAccountBalance value for this TransferResponseDTO.
     * 
     * @param controlledAccountBalance
     */
    public void setControlledAccountBalance(co.com.tigo.gatewaytigov19.webscp.ws.ControlledAccountBalanceDTO controlledAccountBalance) {
        this.controlledAccountBalance = controlledAccountBalance;
    }


    /**
     * Gets the destAddress value for this TransferResponseDTO.
     * 
     * @return destAddress
     */
    public java.lang.String getDestAddress() {
        return destAddress;
    }


    /**
     * Sets the destAddress value for this TransferResponseDTO.
     * 
     * @param destAddress
     */
    public void setDestAddress(java.lang.String destAddress) {
        this.destAddress = destAddress;
    }


    /**
     * Gets the expirationDate value for this TransferResponseDTO.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this TransferResponseDTO.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the mobileNumber value for this TransferResponseDTO.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this TransferResponseDTO.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the partitionBalanceColl value for this TransferResponseDTO.
     * 
     * @return partitionBalanceColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionBalanceColl() {
        return partitionBalanceColl;
    }


    /**
     * Sets the partitionBalanceColl value for this TransferResponseDTO.
     * 
     * @param partitionBalanceColl
     */
    public void setPartitionBalanceColl(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalanceColl) {
        this.partitionBalanceColl = partitionBalanceColl;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionBalanceColl(int i) {
        return this.partitionBalanceColl[i];
    }

    public void setPartitionBalanceColl(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionBalanceColl[i] = _value;
    }


    /**
     * Gets the partitionTransferredColl value for this TransferResponseDTO.
     * 
     * @return partitionTransferredColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionTransferredColl() {
        return partitionTransferredColl;
    }


    /**
     * Sets the partitionTransferredColl value for this TransferResponseDTO.
     * 
     * @param partitionTransferredColl
     */
    public void setPartitionTransferredColl(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionTransferredColl) {
        this.partitionTransferredColl = partitionTransferredColl;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionTransferredColl(int i) {
        return this.partitionTransferredColl[i];
    }

    public void setPartitionTransferredColl(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionTransferredColl[i] = _value;
    }


    /**
     * Gets the product value for this TransferResponseDTO.
     * 
     * @return product
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.IdDTO getProduct() {
        return product;
    }


    /**
     * Sets the product value for this TransferResponseDTO.
     * 
     * @param product
     */
    public void setProduct(co.com.tigo.gatewaytigov19.webscp.ws.IdDTO product) {
        this.product = product;
    }


    /**
     * Gets the realBalance value for this TransferResponseDTO.
     * 
     * @return realBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealBalance() {
        return realBalance;
    }


    /**
     * Sets the realBalance value for this TransferResponseDTO.
     * 
     * @param realBalance
     */
    public void setRealBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance) {
        this.realBalance = realBalance;
    }


    /**
     * Gets the realMoney value for this TransferResponseDTO.
     * 
     * @return realMoney
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealMoney() {
        return realMoney;
    }


    /**
     * Sets the realMoney value for this TransferResponseDTO.
     * 
     * @param realMoney
     */
    public void setRealMoney(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realMoney) {
        this.realMoney = realMoney;
    }


    /**
     * Gets the realTransferred value for this TransferResponseDTO.
     * 
     * @return realTransferred
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealTransferred() {
        return realTransferred;
    }


    /**
     * Sets the realTransferred value for this TransferResponseDTO.
     * 
     * @param realTransferred
     */
    public void setRealTransferred(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realTransferred) {
        this.realTransferred = realTransferred;
    }


    /**
     * Gets the sequenceNumber value for this TransferResponseDTO.
     * 
     * @return sequenceNumber
     */
    public java.lang.Integer getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this TransferResponseDTO.
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(java.lang.Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the serviceProvider value for this TransferResponseDTO.
     * 
     * @return serviceProvider
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.IdDTO getServiceProvider() {
        return serviceProvider;
    }


    /**
     * Sets the serviceProvider value for this TransferResponseDTO.
     * 
     * @param serviceProvider
     */
    public void setServiceProvider(co.com.tigo.gatewaytigov19.webscp.ws.IdDTO serviceProvider) {
        this.serviceProvider = serviceProvider;
    }


    /**
     * Gets the state value for this TransferResponseDTO.
     * 
     * @return state
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.IdDTO getState() {
        return state;
    }


    /**
     * Sets the state value for this TransferResponseDTO.
     * 
     * @param state
     */
    public void setState(co.com.tigo.gatewaytigov19.webscp.ws.IdDTO state) {
        this.state = state;
    }


    /**
     * Gets the transactionId value for this TransferResponseDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this TransferResponseDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferResponseDTO)) return false;
        TransferResponseDTO other = (TransferResponseDTO) obj;
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
            ((this.bonusMoney==null && other.getBonusMoney()==null) || 
             (this.bonusMoney!=null &&
              this.bonusMoney.equals(other.getBonusMoney()))) &&
            ((this.bonusTransferred==null && other.getBonusTransferred()==null) || 
             (this.bonusTransferred!=null &&
              this.bonusTransferred.equals(other.getBonusTransferred()))) &&
            ((this.controlledAccountBalance==null && other.getControlledAccountBalance()==null) || 
             (this.controlledAccountBalance!=null &&
              this.controlledAccountBalance.equals(other.getControlledAccountBalance()))) &&
            ((this.destAddress==null && other.getDestAddress()==null) || 
             (this.destAddress!=null &&
              this.destAddress.equals(other.getDestAddress()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.partitionBalanceColl==null && other.getPartitionBalanceColl()==null) || 
             (this.partitionBalanceColl!=null &&
              java.util.Arrays.equals(this.partitionBalanceColl, other.getPartitionBalanceColl()))) &&
            ((this.partitionTransferredColl==null && other.getPartitionTransferredColl()==null) || 
             (this.partitionTransferredColl!=null &&
              java.util.Arrays.equals(this.partitionTransferredColl, other.getPartitionTransferredColl()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.realBalance==null && other.getRealBalance()==null) || 
             (this.realBalance!=null &&
              this.realBalance.equals(other.getRealBalance()))) &&
            ((this.realMoney==null && other.getRealMoney()==null) || 
             (this.realMoney!=null &&
              this.realMoney.equals(other.getRealMoney()))) &&
            ((this.realTransferred==null && other.getRealTransferred()==null) || 
             (this.realTransferred!=null &&
              this.realTransferred.equals(other.getRealTransferred()))) &&
            ((this.sequenceNumber==null && other.getSequenceNumber()==null) || 
             (this.sequenceNumber!=null &&
              this.sequenceNumber.equals(other.getSequenceNumber()))) &&
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
        if (getBonusMoney() != null) {
            _hashCode += getBonusMoney().hashCode();
        }
        if (getBonusTransferred() != null) {
            _hashCode += getBonusTransferred().hashCode();
        }
        if (getControlledAccountBalance() != null) {
            _hashCode += getControlledAccountBalance().hashCode();
        }
        if (getDestAddress() != null) {
            _hashCode += getDestAddress().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getPartitionBalanceColl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionBalanceColl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionBalanceColl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartitionTransferredColl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionTransferredColl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionTransferredColl(), i);
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
        if (getRealMoney() != null) {
            _hashCode += getRealMoney().hashCode();
        }
        if (getRealTransferred() != null) {
            _hashCode += getRealTransferred().hashCode();
        }
        if (getSequenceNumber() != null) {
            _hashCode += getSequenceNumber().hashCode();
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
        new org.apache.axis.description.TypeDesc(TransferResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "transferResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusMoney");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusMoney"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusTransferred");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusTransferred"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlledAccountBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "controlledAccountBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "controlledAccountBalanceDTO"));
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
        elemField.setFieldName("partitionBalanceColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionBalanceColl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "partitionDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionTransferredColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionTransferredColl"));
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
        elemField.setFieldName("realMoney");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realMoney"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realTransferred");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realTransferred"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
