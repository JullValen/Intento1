/**
 * EventResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class EventResponseDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusCost;

    private java.lang.Integer chargeUnits;

    private java.lang.String mobileNumber;

    private java.lang.Integer numberOfEvents;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionCost;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realCost;

    private java.lang.Integer totalChargeUnits;

    public EventResponseDTO() {
    }

    public EventResponseDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusCost,
           java.lang.Integer chargeUnits,
           java.lang.String mobileNumber,
           java.lang.Integer numberOfEvents,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionCost,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realCost,
           java.lang.Integer totalChargeUnits) {
           this.bonusBalance = bonusBalance;
           this.bonusCost = bonusCost;
           this.chargeUnits = chargeUnits;
           this.mobileNumber = mobileNumber;
           this.numberOfEvents = numberOfEvents;
           this.partitionBalance = partitionBalance;
           this.partitionCost = partitionCost;
           this.realBalance = realBalance;
           this.realCost = realCost;
           this.totalChargeUnits = totalChargeUnits;
    }


    /**
     * Gets the bonusBalance value for this EventResponseDTO.
     * 
     * @return bonusBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusBalance() {
        return bonusBalance;
    }


    /**
     * Sets the bonusBalance value for this EventResponseDTO.
     * 
     * @param bonusBalance
     */
    public void setBonusBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance) {
        this.bonusBalance = bonusBalance;
    }


    /**
     * Gets the bonusCost value for this EventResponseDTO.
     * 
     * @return bonusCost
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusCost() {
        return bonusCost;
    }


    /**
     * Sets the bonusCost value for this EventResponseDTO.
     * 
     * @param bonusCost
     */
    public void setBonusCost(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusCost) {
        this.bonusCost = bonusCost;
    }


    /**
     * Gets the chargeUnits value for this EventResponseDTO.
     * 
     * @return chargeUnits
     */
    public java.lang.Integer getChargeUnits() {
        return chargeUnits;
    }


    /**
     * Sets the chargeUnits value for this EventResponseDTO.
     * 
     * @param chargeUnits
     */
    public void setChargeUnits(java.lang.Integer chargeUnits) {
        this.chargeUnits = chargeUnits;
    }


    /**
     * Gets the mobileNumber value for this EventResponseDTO.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this EventResponseDTO.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the numberOfEvents value for this EventResponseDTO.
     * 
     * @return numberOfEvents
     */
    public java.lang.Integer getNumberOfEvents() {
        return numberOfEvents;
    }


    /**
     * Sets the numberOfEvents value for this EventResponseDTO.
     * 
     * @param numberOfEvents
     */
    public void setNumberOfEvents(java.lang.Integer numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }


    /**
     * Gets the partitionBalance value for this EventResponseDTO.
     * 
     * @return partitionBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionBalance() {
        return partitionBalance;
    }


    /**
     * Sets the partitionBalance value for this EventResponseDTO.
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
     * Gets the partitionCost value for this EventResponseDTO.
     * 
     * @return partitionCost
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionCost() {
        return partitionCost;
    }


    /**
     * Sets the partitionCost value for this EventResponseDTO.
     * 
     * @param partitionCost
     */
    public void setPartitionCost(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionCost) {
        this.partitionCost = partitionCost;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionCost(int i) {
        return this.partitionCost[i];
    }

    public void setPartitionCost(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionCost[i] = _value;
    }


    /**
     * Gets the realBalance value for this EventResponseDTO.
     * 
     * @return realBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealBalance() {
        return realBalance;
    }


    /**
     * Sets the realBalance value for this EventResponseDTO.
     * 
     * @param realBalance
     */
    public void setRealBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance) {
        this.realBalance = realBalance;
    }


    /**
     * Gets the realCost value for this EventResponseDTO.
     * 
     * @return realCost
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealCost() {
        return realCost;
    }


    /**
     * Sets the realCost value for this EventResponseDTO.
     * 
     * @param realCost
     */
    public void setRealCost(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realCost) {
        this.realCost = realCost;
    }


    /**
     * Gets the totalChargeUnits value for this EventResponseDTO.
     * 
     * @return totalChargeUnits
     */
    public java.lang.Integer getTotalChargeUnits() {
        return totalChargeUnits;
    }


    /**
     * Sets the totalChargeUnits value for this EventResponseDTO.
     * 
     * @param totalChargeUnits
     */
    public void setTotalChargeUnits(java.lang.Integer totalChargeUnits) {
        this.totalChargeUnits = totalChargeUnits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventResponseDTO)) return false;
        EventResponseDTO other = (EventResponseDTO) obj;
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
            ((this.chargeUnits==null && other.getChargeUnits()==null) || 
             (this.chargeUnits!=null &&
              this.chargeUnits.equals(other.getChargeUnits()))) &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.numberOfEvents==null && other.getNumberOfEvents()==null) || 
             (this.numberOfEvents!=null &&
              this.numberOfEvents.equals(other.getNumberOfEvents()))) &&
            ((this.partitionBalance==null && other.getPartitionBalance()==null) || 
             (this.partitionBalance!=null &&
              java.util.Arrays.equals(this.partitionBalance, other.getPartitionBalance()))) &&
            ((this.partitionCost==null && other.getPartitionCost()==null) || 
             (this.partitionCost!=null &&
              java.util.Arrays.equals(this.partitionCost, other.getPartitionCost()))) &&
            ((this.realBalance==null && other.getRealBalance()==null) || 
             (this.realBalance!=null &&
              this.realBalance.equals(other.getRealBalance()))) &&
            ((this.realCost==null && other.getRealCost()==null) || 
             (this.realCost!=null &&
              this.realCost.equals(other.getRealCost()))) &&
            ((this.totalChargeUnits==null && other.getTotalChargeUnits()==null) || 
             (this.totalChargeUnits!=null &&
              this.totalChargeUnits.equals(other.getTotalChargeUnits())));
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
        if (getChargeUnits() != null) {
            _hashCode += getChargeUnits().hashCode();
        }
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getNumberOfEvents() != null) {
            _hashCode += getNumberOfEvents().hashCode();
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
        if (getPartitionCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionCost(), i);
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
        if (getTotalChargeUnits() != null) {
            _hashCode += getTotalChargeUnits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eventResponseDTO"));
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
        elemField.setFieldName("chargeUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("numberOfEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("partitionCost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionCost"));
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
        elemField.setFieldName("totalChargeUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalChargeUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
