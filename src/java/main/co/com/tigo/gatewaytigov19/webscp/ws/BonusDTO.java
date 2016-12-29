/**
 * BonusDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class BonusDTO  implements java.io.Serializable {
    private java.math.BigDecimal bonusValue;

    private java.math.BigDecimal highValue;

    private java.math.BigDecimal lowValue;

    private int vigency;

    public BonusDTO() {
    }

    public BonusDTO(
           java.math.BigDecimal bonusValue,
           java.math.BigDecimal highValue,
           java.math.BigDecimal lowValue,
           int vigency) {
           this.bonusValue = bonusValue;
           this.highValue = highValue;
           this.lowValue = lowValue;
           this.vigency = vigency;
    }


    /**
     * Gets the bonusValue value for this BonusDTO.
     * 
     * @return bonusValue
     */
    public java.math.BigDecimal getBonusValue() {
        return bonusValue;
    }


    /**
     * Sets the bonusValue value for this BonusDTO.
     * 
     * @param bonusValue
     */
    public void setBonusValue(java.math.BigDecimal bonusValue) {
        this.bonusValue = bonusValue;
    }


    /**
     * Gets the highValue value for this BonusDTO.
     * 
     * @return highValue
     */
    public java.math.BigDecimal getHighValue() {
        return highValue;
    }


    /**
     * Sets the highValue value for this BonusDTO.
     * 
     * @param highValue
     */
    public void setHighValue(java.math.BigDecimal highValue) {
        this.highValue = highValue;
    }


    /**
     * Gets the lowValue value for this BonusDTO.
     * 
     * @return lowValue
     */
    public java.math.BigDecimal getLowValue() {
        return lowValue;
    }


    /**
     * Sets the lowValue value for this BonusDTO.
     * 
     * @param lowValue
     */
    public void setLowValue(java.math.BigDecimal lowValue) {
        this.lowValue = lowValue;
    }


    /**
     * Gets the vigency value for this BonusDTO.
     * 
     * @return vigency
     */
    public int getVigency() {
        return vigency;
    }


    /**
     * Sets the vigency value for this BonusDTO.
     * 
     * @param vigency
     */
    public void setVigency(int vigency) {
        this.vigency = vigency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BonusDTO)) return false;
        BonusDTO other = (BonusDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bonusValue==null && other.getBonusValue()==null) || 
             (this.bonusValue!=null &&
              this.bonusValue.equals(other.getBonusValue()))) &&
            ((this.highValue==null && other.getHighValue()==null) || 
             (this.highValue!=null &&
              this.highValue.equals(other.getHighValue()))) &&
            ((this.lowValue==null && other.getLowValue()==null) || 
             (this.lowValue!=null &&
              this.lowValue.equals(other.getLowValue()))) &&
            this.vigency == other.getVigency();
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
        if (getBonusValue() != null) {
            _hashCode += getBonusValue().hashCode();
        }
        if (getHighValue() != null) {
            _hashCode += getHighValue().hashCode();
        }
        if (getLowValue() != null) {
            _hashCode += getLowValue().hashCode();
        }
        _hashCode += getVigency();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BonusDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "bonusDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "highValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lowValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vigency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vigency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
