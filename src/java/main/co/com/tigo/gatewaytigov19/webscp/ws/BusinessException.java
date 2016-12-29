/**
 * BusinessException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class BusinessException  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private java.lang.String message1;

    private java.lang.Integer subVal;

    private java.lang.String text;

    private java.lang.Integer val;

    public BusinessException() {
    }

    public BusinessException(
           java.lang.String message1,
           java.lang.Integer subVal,
           java.lang.String text,
           java.lang.Integer val) {
        this.message1 = message1;
        this.subVal = subVal;
        this.text = text;
        this.val = val;
    }


    /**
     * Gets the message1 value for this BusinessException.
     * 
     * @return message1
     */
    public java.lang.String getMessage1() {
        return message1;
    }


    /**
     * Sets the message1 value for this BusinessException.
     * 
     * @param message1
     */
    public void setMessage1(java.lang.String message1) {
        this.message1 = message1;
    }


    /**
     * Gets the subVal value for this BusinessException.
     * 
     * @return subVal
     */
    public java.lang.Integer getSubVal() {
        return subVal;
    }


    /**
     * Sets the subVal value for this BusinessException.
     * 
     * @param subVal
     */
    public void setSubVal(java.lang.Integer subVal) {
        this.subVal = subVal;
    }


    /**
     * Gets the text value for this BusinessException.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this BusinessException.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the val value for this BusinessException.
     * 
     * @return val
     */
    public java.lang.Integer getVal() {
        return val;
    }


    /**
     * Sets the val value for this BusinessException.
     * 
     * @param val
     */
    public void setVal(java.lang.Integer val) {
        this.val = val;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessException)) return false;
        BusinessException other = (BusinessException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message1==null && other.getMessage1()==null) || 
             (this.message1!=null &&
              this.message1.equals(other.getMessage1()))) &&
            ((this.subVal==null && other.getSubVal()==null) || 
             (this.subVal!=null &&
              this.subVal.equals(other.getSubVal()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.val==null && other.getVal()==null) || 
             (this.val!=null &&
              this.val.equals(other.getVal())));
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
        if (getMessage1() != null) {
            _hashCode += getMessage1().hashCode();
        }
        if (getSubVal() != null) {
            _hashCode += getSubVal().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getVal() != null) {
            _hashCode += getVal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subVal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subVal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("val");
        elemField.setXmlName(new javax.xml.namespace.QName("", "val"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
