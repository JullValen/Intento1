/**
 * AdviceOfChargeResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class AdviceOfChargeResponseDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusCost;

    private co.com.tigo.gatewaytigov19.webscp.ws.ControlledAccountBalanceDTO controlledAccountBalance;

    private java.lang.String msisdn;

    private java.lang.Integer numberOfEvents;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalanceColl;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionCostColl;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realCost;

    private co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO returncode;

    private java.lang.String transactionId;

    public AdviceOfChargeResponseDTO() {
    }

    public AdviceOfChargeResponseDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusCost,
           co.com.tigo.gatewaytigov19.webscp.ws.ControlledAccountBalanceDTO controlledAccountBalance,
           java.lang.String msisdn,
           java.lang.Integer numberOfEvents,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalanceColl,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionCostColl,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realCost,
           co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO returncode,
           java.lang.String transactionId) {
           this.bonusBalance = bonusBalance;
           this.bonusCost = bonusCost;
           this.controlledAccountBalance = controlledAccountBalance;
           this.msisdn = msisdn;
           this.numberOfEvents = numberOfEvents;
           this.partitionBalanceColl = partitionBalanceColl;
           this.partitionCostColl = partitionCostColl;
           this.realBalance = realBalance;
           this.realCost = realCost;
           this.returncode = returncode;
           this.transactionId = transactionId;
    }


    /**
     * Gets the bonusBalance value for this AdviceOfChargeResponseDTO.
     * 
     * @return bonusBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusBalance() {
        return bonusBalance;
    }


    /**
     * Sets the bonusBalance value for this AdviceOfChargeResponseDTO.
     * 
     * @param bonusBalance
     */
    public void setBonusBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance) {
        this.bonusBalance = bonusBalance;
    }


    /**
     * Gets the bonusCost value for this AdviceOfChargeResponseDTO.
     * 
     * @return bonusCost
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusCost() {
        return bonusCost;
    }


    /**
     * Sets the bonusCost value for this AdviceOfChargeResponseDTO.
     * 
     * @param bonusCost
     */
    public void setBonusCost(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusCost) {
        this.bonusCost = bonusCost;
    }


    /**
     * Gets the controlledAccountBalance value for this AdviceOfChargeResponseDTO.
     * 
     * @return controlledAccountBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ControlledAccountBalanceDTO getControlledAccountBalance() {
        return controlledAccountBalance;
    }


    /**
     * Sets the controlledAccountBalance value for this AdviceOfChargeResponseDTO.
     * 
     * @param controlledAccountBalance
     */
    public void setControlledAccountBalance(co.com.tigo.gatewaytigov19.webscp.ws.ControlledAccountBalanceDTO controlledAccountBalance) {
        this.controlledAccountBalance = controlledAccountBalance;
    }


    /**
     * Gets the msisdn value for this AdviceOfChargeResponseDTO.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this AdviceOfChargeResponseDTO.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the numberOfEvents value for this AdviceOfChargeResponseDTO.
     * 
     * @return numberOfEvents
     */
    public java.lang.Integer getNumberOfEvents() {
        return numberOfEvents;
    }


    /**
     * Sets the numberOfEvents value for this AdviceOfChargeResponseDTO.
     * 
     * @param numberOfEvents
     */
    public void setNumberOfEvents(java.lang.Integer numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }


    /**
     * Gets the partitionBalanceColl value for this AdviceOfChargeResponseDTO.
     * 
     * @return partitionBalanceColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionBalanceColl() {
        return partitionBalanceColl;
    }


    /**
     * Sets the partitionBalanceColl value for this AdviceOfChargeResponseDTO.
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
     * Gets the partitionCostColl value for this AdviceOfChargeResponseDTO.
     * 
     * @return partitionCostColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionCostColl() {
        return partitionCostColl;
    }


    /**
     * Sets the partitionCostColl value for this AdviceOfChargeResponseDTO.
     * 
     * @param partitionCostColl
     */
    public void setPartitionCostColl(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionCostColl) {
        this.partitionCostColl = partitionCostColl;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionCostColl(int i) {
        return this.partitionCostColl[i];
    }

    public void setPartitionCostColl(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionCostColl[i] = _value;
    }


    /**
     * Gets the realBalance value for this AdviceOfChargeResponseDTO.
     * 
     * @return realBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealBalance() {
        return realBalance;
    }


    /**
     * Sets the realBalance value for this AdviceOfChargeResponseDTO.
     * 
     * @param realBalance
     */
    public void setRealBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance) {
        this.realBalance = realBalance;
    }


    /**
     * Gets the realCost value for this AdviceOfChargeResponseDTO.
     * 
     * @return realCost
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealCost() {
        return realCost;
    }


    /**
     * Sets the realCost value for this AdviceOfChargeResponseDTO.
     * 
     * @param realCost
     */
    public void setRealCost(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realCost) {
        this.realCost = realCost;
    }


    /**
     * Gets the returncode value for this AdviceOfChargeResponseDTO.
     * 
     * @return returncode
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO getReturncode() {
        return returncode;
    }


    /**
     * Sets the returncode value for this AdviceOfChargeResponseDTO.
     * 
     * @param returncode
     */
    public void setReturncode(co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO returncode) {
        this.returncode = returncode;
    }


    /**
     * Gets the transactionId value for this AdviceOfChargeResponseDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this AdviceOfChargeResponseDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdviceOfChargeResponseDTO)) return false;
        AdviceOfChargeResponseDTO other = (AdviceOfChargeResponseDTO) obj;
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
            ((this.controlledAccountBalance==null && other.getControlledAccountBalance()==null) || 
             (this.controlledAccountBalance!=null &&
              this.controlledAccountBalance.equals(other.getControlledAccountBalance()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.numberOfEvents==null && other.getNumberOfEvents()==null) || 
             (this.numberOfEvents!=null &&
              this.numberOfEvents.equals(other.getNumberOfEvents()))) &&
            ((this.partitionBalanceColl==null && other.getPartitionBalanceColl()==null) || 
             (this.partitionBalanceColl!=null &&
              java.util.Arrays.equals(this.partitionBalanceColl, other.getPartitionBalanceColl()))) &&
            ((this.partitionCostColl==null && other.getPartitionCostColl()==null) || 
             (this.partitionCostColl!=null &&
              java.util.Arrays.equals(this.partitionCostColl, other.getPartitionCostColl()))) &&
            ((this.realBalance==null && other.getRealBalance()==null) || 
             (this.realBalance!=null &&
              this.realBalance.equals(other.getRealBalance()))) &&
            ((this.realCost==null && other.getRealCost()==null) || 
             (this.realCost!=null &&
              this.realCost.equals(other.getRealCost()))) &&
            ((this.returncode==null && other.getReturncode()==null) || 
             (this.returncode!=null &&
              this.returncode.equals(other.getReturncode()))) &&
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
        if (getBonusCost() != null) {
            _hashCode += getBonusCost().hashCode();
        }
        if (getControlledAccountBalance() != null) {
            _hashCode += getControlledAccountBalance().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getNumberOfEvents() != null) {
            _hashCode += getNumberOfEvents().hashCode();
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
        if (getPartitionCostColl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionCostColl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionCostColl(), i);
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
        if (getReturncode() != null) {
            _hashCode += getReturncode().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdviceOfChargeResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "adviceOfChargeResponseDTO"));
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
        elemField.setFieldName("controlledAccountBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "controlledAccountBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "controlledAccountBalanceDTO"));
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
        elemField.setFieldName("numberOfEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("partitionCostColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionCostColl"));
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
        elemField.setFieldName("returncode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returncode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "returnCodeDTO"));
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
