/**
 * ServiceChangeResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ServiceChangeResponseDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusCost;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalanceColl;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionCostsColl;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realCost;

    private co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO returnCode;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO servicePrice;

    public ServiceChangeResponseDTO() {
    }

    public ServiceChangeResponseDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusCost,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalanceColl,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionCostsColl,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realCost,
           co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO returnCode,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO servicePrice) {
           this.bonusBalance = bonusBalance;
           this.bonusCost = bonusCost;
           this.partitionBalanceColl = partitionBalanceColl;
           this.partitionCostsColl = partitionCostsColl;
           this.realBalance = realBalance;
           this.realCost = realCost;
           this.returnCode = returnCode;
           this.servicePrice = servicePrice;
    }


    /**
     * Gets the bonusBalance value for this ServiceChangeResponseDTO.
     * 
     * @return bonusBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusBalance() {
        return bonusBalance;
    }


    /**
     * Sets the bonusBalance value for this ServiceChangeResponseDTO.
     * 
     * @param bonusBalance
     */
    public void setBonusBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance) {
        this.bonusBalance = bonusBalance;
    }


    /**
     * Gets the bonusCost value for this ServiceChangeResponseDTO.
     * 
     * @return bonusCost
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusCost() {
        return bonusCost;
    }


    /**
     * Sets the bonusCost value for this ServiceChangeResponseDTO.
     * 
     * @param bonusCost
     */
    public void setBonusCost(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusCost) {
        this.bonusCost = bonusCost;
    }


    /**
     * Gets the partitionBalanceColl value for this ServiceChangeResponseDTO.
     * 
     * @return partitionBalanceColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionBalanceColl() {
        return partitionBalanceColl;
    }


    /**
     * Sets the partitionBalanceColl value for this ServiceChangeResponseDTO.
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
     * Gets the partitionCostsColl value for this ServiceChangeResponseDTO.
     * 
     * @return partitionCostsColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionCostsColl() {
        return partitionCostsColl;
    }


    /**
     * Sets the partitionCostsColl value for this ServiceChangeResponseDTO.
     * 
     * @param partitionCostsColl
     */
    public void setPartitionCostsColl(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionCostsColl) {
        this.partitionCostsColl = partitionCostsColl;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionCostsColl(int i) {
        return this.partitionCostsColl[i];
    }

    public void setPartitionCostsColl(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionCostsColl[i] = _value;
    }


    /**
     * Gets the realBalance value for this ServiceChangeResponseDTO.
     * 
     * @return realBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealBalance() {
        return realBalance;
    }


    /**
     * Sets the realBalance value for this ServiceChangeResponseDTO.
     * 
     * @param realBalance
     */
    public void setRealBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance) {
        this.realBalance = realBalance;
    }


    /**
     * Gets the realCost value for this ServiceChangeResponseDTO.
     * 
     * @return realCost
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealCost() {
        return realCost;
    }


    /**
     * Sets the realCost value for this ServiceChangeResponseDTO.
     * 
     * @param realCost
     */
    public void setRealCost(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realCost) {
        this.realCost = realCost;
    }


    /**
     * Gets the returnCode value for this ServiceChangeResponseDTO.
     * 
     * @return returnCode
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this ServiceChangeResponseDTO.
     * 
     * @param returnCode
     */
    public void setReturnCode(co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the servicePrice value for this ServiceChangeResponseDTO.
     * 
     * @return servicePrice
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getServicePrice() {
        return servicePrice;
    }


    /**
     * Sets the servicePrice value for this ServiceChangeResponseDTO.
     * 
     * @param servicePrice
     */
    public void setServicePrice(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO servicePrice) {
        this.servicePrice = servicePrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceChangeResponseDTO)) return false;
        ServiceChangeResponseDTO other = (ServiceChangeResponseDTO) obj;
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
            ((this.bonusCost==null && other.getBonusCost()==null) || 
             (this.bonusCost!=null &&
              this.bonusCost.equals(other.getBonusCost()))) &&
            ((this.partitionBalanceColl==null && other.getPartitionBalanceColl()==null) || 
             (this.partitionBalanceColl!=null &&
              java.util.Arrays.equals(this.partitionBalanceColl, other.getPartitionBalanceColl()))) &&
            ((this.partitionCostsColl==null && other.getPartitionCostsColl()==null) || 
             (this.partitionCostsColl!=null &&
              java.util.Arrays.equals(this.partitionCostsColl, other.getPartitionCostsColl()))) &&
            ((this.realBalance==null && other.getRealBalance()==null) || 
             (this.realBalance!=null &&
              this.realBalance.equals(other.getRealBalance()))) &&
            ((this.realCost==null && other.getRealCost()==null) || 
             (this.realCost!=null &&
              this.realCost.equals(other.getRealCost()))) &&
            ((this.returnCode==null && other.getReturnCode()==null) || 
             (this.returnCode!=null &&
              this.returnCode.equals(other.getReturnCode()))) &&
            ((this.servicePrice==null && other.getServicePrice()==null) || 
             (this.servicePrice!=null &&
              this.servicePrice.equals(other.getServicePrice())));
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
        if (getBonusCost() != null) {
            _hashCode += getBonusCost().hashCode();
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
        if (getPartitionCostsColl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionCostsColl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionCostsColl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRealBalance() != null) {
            _hashCode += getRealBalance().hashCode();
        }
        if (getRealCost() != null) {
            _hashCode += getRealCost().hashCode();
        }
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        if (getServicePrice() != null) {
            _hashCode += getServicePrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceChangeResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceChangeResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusCost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
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
        elemField.setFieldName("partitionCostsColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionCostsColl"));
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
        elemField.setFieldName("realCost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "returnCodeDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
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
