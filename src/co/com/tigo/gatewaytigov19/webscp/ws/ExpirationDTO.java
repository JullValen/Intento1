/**
 * ExpirationDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ExpirationDTO  implements java.io.Serializable {
    private java.lang.Long expirationDays;

    private java.lang.Long maxResources;

    private java.lang.Long minResources;

    public ExpirationDTO() {
    }

    public ExpirationDTO(
           java.lang.Long expirationDays,
           java.lang.Long maxResources,
           java.lang.Long minResources) {
           this.expirationDays = expirationDays;
           this.maxResources = maxResources;
           this.minResources = minResources;
    }


    /**
     * Gets the expirationDays value for this ExpirationDTO.
     * 
     * @return expirationDays
     */
    public java.lang.Long getExpirationDays() {
        return expirationDays;
    }


    /**
     * Sets the expirationDays value for this ExpirationDTO.
     * 
     * @param expirationDays
     */
    public void setExpirationDays(java.lang.Long expirationDays) {
        this.expirationDays = expirationDays;
    }


    /**
     * Gets the maxResources value for this ExpirationDTO.
     * 
     * @return maxResources
     */
    public java.lang.Long getMaxResources() {
        return maxResources;
    }


    /**
     * Sets the maxResources value for this ExpirationDTO.
     * 
     * @param maxResources
     */
    public void setMaxResources(java.lang.Long maxResources) {
        this.maxResources = maxResources;
    }


    /**
     * Gets the minResources value for this ExpirationDTO.
     * 
     * @return minResources
     */
    public java.lang.Long getMinResources() {
        return minResources;
    }


    /**
     * Sets the minResources value for this ExpirationDTO.
     * 
     * @param minResources
     */
    public void setMinResources(java.lang.Long minResources) {
        this.minResources = minResources;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpirationDTO)) return false;
        ExpirationDTO other = (ExpirationDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.expirationDays==null && other.getExpirationDays()==null) || 
             (this.expirationDays!=null &&
              this.expirationDays.equals(other.getExpirationDays()))) &&
            ((this.maxResources==null && other.getMaxResources()==null) || 
             (this.maxResources!=null &&
              this.maxResources.equals(other.getMaxResources()))) &&
            ((this.minResources==null && other.getMinResources()==null) || 
             (this.minResources!=null &&
              this.minResources.equals(other.getMinResources())));
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
        if (getExpirationDays() != null) {
            _hashCode += getExpirationDays().hashCode();
        }
        if (getMaxResources() != null) {
            _hashCode += getMaxResources().hashCode();
        }
        if (getMinResources() != null) {
            _hashCode += getMinResources().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpirationDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "expirationDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxResources");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minResources");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
