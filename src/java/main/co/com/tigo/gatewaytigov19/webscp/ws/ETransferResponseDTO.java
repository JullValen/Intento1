/**
 * ETransferResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ETransferResponseDTO  implements java.io.Serializable {
    private java.lang.String authorizationNumber;

    private co.com.tigo.gatewaytigov19.webscp.ws.BalanceResponseDTO balanceClient;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionColl;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance;

    private java.lang.String transactionId;

    public ETransferResponseDTO() {
    }

    public ETransferResponseDTO(
           java.lang.String authorizationNumber,
           co.com.tigo.gatewaytigov19.webscp.ws.BalanceResponseDTO balanceClient,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionColl,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance,
           java.lang.String transactionId) {
           this.authorizationNumber = authorizationNumber;
           this.balanceClient = balanceClient;
           this.bonusBalance = bonusBalance;
           this.partitionColl = partitionColl;
           this.realBalance = realBalance;
           this.transactionId = transactionId;
    }


    /**
     * Gets the authorizationNumber value for this ETransferResponseDTO.
     * 
     * @return authorizationNumber
     */
    public java.lang.String getAuthorizationNumber() {
        return authorizationNumber;
    }


    /**
     * Sets the authorizationNumber value for this ETransferResponseDTO.
     * 
     * @param authorizationNumber
     */
    public void setAuthorizationNumber(java.lang.String authorizationNumber) {
        this.authorizationNumber = authorizationNumber;
    }


    /**
     * Gets the balanceClient value for this ETransferResponseDTO.
     * 
     * @return balanceClient
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.BalanceResponseDTO getBalanceClient() {
        return balanceClient;
    }


    /**
     * Sets the balanceClient value for this ETransferResponseDTO.
     * 
     * @param balanceClient
     */
    public void setBalanceClient(co.com.tigo.gatewaytigov19.webscp.ws.BalanceResponseDTO balanceClient) {
        this.balanceClient = balanceClient;
    }


    /**
     * Gets the bonusBalance value for this ETransferResponseDTO.
     * 
     * @return bonusBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusBalance() {
        return bonusBalance;
    }


    /**
     * Sets the bonusBalance value for this ETransferResponseDTO.
     * 
     * @param bonusBalance
     */
    public void setBonusBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance) {
        this.bonusBalance = bonusBalance;
    }


    /**
     * Gets the partitionColl value for this ETransferResponseDTO.
     * 
     * @return partitionColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionColl() {
        return partitionColl;
    }


    /**
     * Sets the partitionColl value for this ETransferResponseDTO.
     * 
     * @param partitionColl
     */
    public void setPartitionColl(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionColl) {
        this.partitionColl = partitionColl;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionColl(int i) {
        return this.partitionColl[i];
    }

    public void setPartitionColl(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionColl[i] = _value;
    }


    /**
     * Gets the realBalance value for this ETransferResponseDTO.
     * 
     * @return realBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealBalance() {
        return realBalance;
    }


    /**
     * Sets the realBalance value for this ETransferResponseDTO.
     * 
     * @param realBalance
     */
    public void setRealBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance) {
        this.realBalance = realBalance;
    }


    /**
     * Gets the transactionId value for this ETransferResponseDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this ETransferResponseDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ETransferResponseDTO)) return false;
        ETransferResponseDTO other = (ETransferResponseDTO) obj;
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
            ((this.balanceClient==null && other.getBalanceClient()==null) || 
             (this.balanceClient!=null &&
              this.balanceClient.equals(other.getBalanceClient()))) &&
            ((this.bonusBalance==null && other.getBonusBalance()==null) || 
             (this.bonusBalance!=null &&
              this.bonusBalance.equals(other.getBonusBalance()))) &&
            ((this.partitionColl==null && other.getPartitionColl()==null) || 
             (this.partitionColl!=null &&
              java.util.Arrays.equals(this.partitionColl, other.getPartitionColl()))) &&
            ((this.realBalance==null && other.getRealBalance()==null) || 
             (this.realBalance!=null &&
              this.realBalance.equals(other.getRealBalance()))) &&
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
        if (getBalanceClient() != null) {
            _hashCode += getBalanceClient().hashCode();
        }
        if (getBonusBalance() != null) {
            _hashCode += getBonusBalance().hashCode();
        }
        if (getPartitionColl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionColl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionColl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRealBalance() != null) {
            _hashCode += getRealBalance().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ETransferResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eTransferResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorizationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceClient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balanceClient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "balanceResponseDTO"));
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
        elemField.setFieldName("partitionColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionColl"));
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
