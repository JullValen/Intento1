/**
 * ControlledAccountBalanceDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ControlledAccountBalanceDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance;

    private java.util.Calendar bonusBalanceExpiryDate;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionColl;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance;

    private java.util.Calendar realBalanceExpiryDate;

    public ControlledAccountBalanceDTO() {
    }

    public ControlledAccountBalanceDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance,
           java.util.Calendar bonusBalanceExpiryDate,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionColl,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance,
           java.util.Calendar realBalanceExpiryDate) {
           this.bonusBalance = bonusBalance;
           this.bonusBalanceExpiryDate = bonusBalanceExpiryDate;
           this.partitionColl = partitionColl;
           this.realBalance = realBalance;
           this.realBalanceExpiryDate = realBalanceExpiryDate;
    }


    /**
     * Gets the bonusBalance value for this ControlledAccountBalanceDTO.
     * 
     * @return bonusBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusBalance() {
        return bonusBalance;
    }


    /**
     * Sets the bonusBalance value for this ControlledAccountBalanceDTO.
     * 
     * @param bonusBalance
     */
    public void setBonusBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance) {
        this.bonusBalance = bonusBalance;
    }


    /**
     * Gets the bonusBalanceExpiryDate value for this ControlledAccountBalanceDTO.
     * 
     * @return bonusBalanceExpiryDate
     */
    public java.util.Calendar getBonusBalanceExpiryDate() {
        return bonusBalanceExpiryDate;
    }


    /**
     * Sets the bonusBalanceExpiryDate value for this ControlledAccountBalanceDTO.
     * 
     * @param bonusBalanceExpiryDate
     */
    public void setBonusBalanceExpiryDate(java.util.Calendar bonusBalanceExpiryDate) {
        this.bonusBalanceExpiryDate = bonusBalanceExpiryDate;
    }


    /**
     * Gets the partitionColl value for this ControlledAccountBalanceDTO.
     * 
     * @return partitionColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionColl() {
        return partitionColl;
    }


    /**
     * Sets the partitionColl value for this ControlledAccountBalanceDTO.
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
     * Gets the realBalance value for this ControlledAccountBalanceDTO.
     * 
     * @return realBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealBalance() {
        return realBalance;
    }


    /**
     * Sets the realBalance value for this ControlledAccountBalanceDTO.
     * 
     * @param realBalance
     */
    public void setRealBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance) {
        this.realBalance = realBalance;
    }


    /**
     * Gets the realBalanceExpiryDate value for this ControlledAccountBalanceDTO.
     * 
     * @return realBalanceExpiryDate
     */
    public java.util.Calendar getRealBalanceExpiryDate() {
        return realBalanceExpiryDate;
    }


    /**
     * Sets the realBalanceExpiryDate value for this ControlledAccountBalanceDTO.
     * 
     * @param realBalanceExpiryDate
     */
    public void setRealBalanceExpiryDate(java.util.Calendar realBalanceExpiryDate) {
        this.realBalanceExpiryDate = realBalanceExpiryDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ControlledAccountBalanceDTO)) return false;
        ControlledAccountBalanceDTO other = (ControlledAccountBalanceDTO) obj;
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
            ((this.bonusBalanceExpiryDate==null && other.getBonusBalanceExpiryDate()==null) || 
             (this.bonusBalanceExpiryDate!=null &&
              this.bonusBalanceExpiryDate.equals(other.getBonusBalanceExpiryDate()))) &&
            ((this.partitionColl==null && other.getPartitionColl()==null) || 
             (this.partitionColl!=null &&
              java.util.Arrays.equals(this.partitionColl, other.getPartitionColl()))) &&
            ((this.realBalance==null && other.getRealBalance()==null) || 
             (this.realBalance!=null &&
              this.realBalance.equals(other.getRealBalance()))) &&
            ((this.realBalanceExpiryDate==null && other.getRealBalanceExpiryDate()==null) || 
             (this.realBalanceExpiryDate!=null &&
              this.realBalanceExpiryDate.equals(other.getRealBalanceExpiryDate())));
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
        if (getBonusBalanceExpiryDate() != null) {
            _hashCode += getBonusBalanceExpiryDate().hashCode();
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
        if (getRealBalanceExpiryDate() != null) {
            _hashCode += getRealBalanceExpiryDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ControlledAccountBalanceDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "controlledAccountBalanceDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusBalanceExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusBalanceExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("realBalanceExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realBalanceExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
