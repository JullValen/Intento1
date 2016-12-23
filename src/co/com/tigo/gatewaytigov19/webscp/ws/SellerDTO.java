/**
 * SellerDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class SellerDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.ResourceSellerDTO[] resourceSellerColl;

    private co.com.tigo.gatewaytigov19.webscp.ws.IdDTO sellerId;

    public SellerDTO() {
    }

    public SellerDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.ResourceSellerDTO[] resourceSellerColl,
           co.com.tigo.gatewaytigov19.webscp.ws.IdDTO sellerId) {
           this.resourceSellerColl = resourceSellerColl;
           this.sellerId = sellerId;
    }


    /**
     * Gets the resourceSellerColl value for this SellerDTO.
     * 
     * @return resourceSellerColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ResourceSellerDTO[] getResourceSellerColl() {
        return resourceSellerColl;
    }


    /**
     * Sets the resourceSellerColl value for this SellerDTO.
     * 
     * @param resourceSellerColl
     */
    public void setResourceSellerColl(co.com.tigo.gatewaytigov19.webscp.ws.ResourceSellerDTO[] resourceSellerColl) {
        this.resourceSellerColl = resourceSellerColl;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ResourceSellerDTO getResourceSellerColl(int i) {
        return this.resourceSellerColl[i];
    }

    public void setResourceSellerColl(int i, co.com.tigo.gatewaytigov19.webscp.ws.ResourceSellerDTO _value) {
        this.resourceSellerColl[i] = _value;
    }


    /**
     * Gets the sellerId value for this SellerDTO.
     * 
     * @return sellerId
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.IdDTO getSellerId() {
        return sellerId;
    }


    /**
     * Sets the sellerId value for this SellerDTO.
     * 
     * @param sellerId
     */
    public void setSellerId(co.com.tigo.gatewaytigov19.webscp.ws.IdDTO sellerId) {
        this.sellerId = sellerId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellerDTO)) return false;
        SellerDTO other = (SellerDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resourceSellerColl==null && other.getResourceSellerColl()==null) || 
             (this.resourceSellerColl!=null &&
              java.util.Arrays.equals(this.resourceSellerColl, other.getResourceSellerColl()))) &&
            ((this.sellerId==null && other.getSellerId()==null) || 
             (this.sellerId!=null &&
              this.sellerId.equals(other.getSellerId())));
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
        if (getResourceSellerColl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResourceSellerColl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResourceSellerColl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSellerId() != null) {
            _hashCode += getSellerId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellerDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "sellerDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceSellerColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceSellerColl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "resourceSellerDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sellerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "idDTO"));
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
