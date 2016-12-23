/**
 * UserPromotionDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class UserPromotionDTO  implements java.io.Serializable {
    private java.lang.String idUser;

    private java.lang.String name;

    private co.com.tigo.gatewaytigov19.webscp.ws.PointOfSaleDTO[] posMap;

    private java.lang.Long promotionDayId;

    public UserPromotionDTO() {
    }

    public UserPromotionDTO(
           java.lang.String idUser,
           java.lang.String name,
           co.com.tigo.gatewaytigov19.webscp.ws.PointOfSaleDTO[] posMap,
           java.lang.Long promotionDayId) {
           this.idUser = idUser;
           this.name = name;
           this.posMap = posMap;
           this.promotionDayId = promotionDayId;
    }


    /**
     * Gets the idUser value for this UserPromotionDTO.
     * 
     * @return idUser
     */
    public java.lang.String getIdUser() {
        return idUser;
    }


    /**
     * Sets the idUser value for this UserPromotionDTO.
     * 
     * @param idUser
     */
    public void setIdUser(java.lang.String idUser) {
        this.idUser = idUser;
    }


    /**
     * Gets the name value for this UserPromotionDTO.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this UserPromotionDTO.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the posMap value for this UserPromotionDTO.
     * 
     * @return posMap
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PointOfSaleDTO[] getPosMap() {
        return posMap;
    }


    /**
     * Sets the posMap value for this UserPromotionDTO.
     * 
     * @param posMap
     */
    public void setPosMap(co.com.tigo.gatewaytigov19.webscp.ws.PointOfSaleDTO[] posMap) {
        this.posMap = posMap;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PointOfSaleDTO getPosMap(int i) {
        return this.posMap[i];
    }

    public void setPosMap(int i, co.com.tigo.gatewaytigov19.webscp.ws.PointOfSaleDTO _value) {
        this.posMap[i] = _value;
    }


    /**
     * Gets the promotionDayId value for this UserPromotionDTO.
     * 
     * @return promotionDayId
     */
    public java.lang.Long getPromotionDayId() {
        return promotionDayId;
    }


    /**
     * Sets the promotionDayId value for this UserPromotionDTO.
     * 
     * @param promotionDayId
     */
    public void setPromotionDayId(java.lang.Long promotionDayId) {
        this.promotionDayId = promotionDayId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserPromotionDTO)) return false;
        UserPromotionDTO other = (UserPromotionDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idUser==null && other.getIdUser()==null) || 
             (this.idUser!=null &&
              this.idUser.equals(other.getIdUser()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.posMap==null && other.getPosMap()==null) || 
             (this.posMap!=null &&
              java.util.Arrays.equals(this.posMap, other.getPosMap()))) &&
            ((this.promotionDayId==null && other.getPromotionDayId()==null) || 
             (this.promotionDayId!=null &&
              this.promotionDayId.equals(other.getPromotionDayId())));
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
        if (getIdUser() != null) {
            _hashCode += getIdUser().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPosMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPosMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPosMap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPromotionDayId() != null) {
            _hashCode += getPromotionDayId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserPromotionDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "userPromotionDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posMap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "pointOfSaleDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionDayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "promotionDayId"));
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
