/**
 * PromotionDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class PromotionDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.BonusDTO[] bonusCollection;

    private java.lang.String description;

    private java.util.Calendar finalDate;

    private java.util.Calendar initialDate;

    private java.lang.String partition;

    private java.lang.Long promotionDayId;

    private java.lang.String typePartition;

    public PromotionDTO() {
    }

    public PromotionDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.BonusDTO[] bonusCollection,
           java.lang.String description,
           java.util.Calendar finalDate,
           java.util.Calendar initialDate,
           java.lang.String partition,
           java.lang.Long promotionDayId,
           java.lang.String typePartition) {
           this.bonusCollection = bonusCollection;
           this.description = description;
           this.finalDate = finalDate;
           this.initialDate = initialDate;
           this.partition = partition;
           this.promotionDayId = promotionDayId;
           this.typePartition = typePartition;
    }


    /**
     * Gets the bonusCollection value for this PromotionDTO.
     * 
     * @return bonusCollection
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.BonusDTO[] getBonusCollection() {
        return bonusCollection;
    }


    /**
     * Sets the bonusCollection value for this PromotionDTO.
     * 
     * @param bonusCollection
     */
    public void setBonusCollection(co.com.tigo.gatewaytigov19.webscp.ws.BonusDTO[] bonusCollection) {
        this.bonusCollection = bonusCollection;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.BonusDTO getBonusCollection(int i) {
        return this.bonusCollection[i];
    }

    public void setBonusCollection(int i, co.com.tigo.gatewaytigov19.webscp.ws.BonusDTO _value) {
        this.bonusCollection[i] = _value;
    }


    /**
     * Gets the description value for this PromotionDTO.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PromotionDTO.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the finalDate value for this PromotionDTO.
     * 
     * @return finalDate
     */
    public java.util.Calendar getFinalDate() {
        return finalDate;
    }


    /**
     * Sets the finalDate value for this PromotionDTO.
     * 
     * @param finalDate
     */
    public void setFinalDate(java.util.Calendar finalDate) {
        this.finalDate = finalDate;
    }


    /**
     * Gets the initialDate value for this PromotionDTO.
     * 
     * @return initialDate
     */
    public java.util.Calendar getInitialDate() {
        return initialDate;
    }


    /**
     * Sets the initialDate value for this PromotionDTO.
     * 
     * @param initialDate
     */
    public void setInitialDate(java.util.Calendar initialDate) {
        this.initialDate = initialDate;
    }


    /**
     * Gets the partition value for this PromotionDTO.
     * 
     * @return partition
     */
    public java.lang.String getPartition() {
        return partition;
    }


    /**
     * Sets the partition value for this PromotionDTO.
     * 
     * @param partition
     */
    public void setPartition(java.lang.String partition) {
        this.partition = partition;
    }


    /**
     * Gets the promotionDayId value for this PromotionDTO.
     * 
     * @return promotionDayId
     */
    public java.lang.Long getPromotionDayId() {
        return promotionDayId;
    }


    /**
     * Sets the promotionDayId value for this PromotionDTO.
     * 
     * @param promotionDayId
     */
    public void setPromotionDayId(java.lang.Long promotionDayId) {
        this.promotionDayId = promotionDayId;
    }


    /**
     * Gets the typePartition value for this PromotionDTO.
     * 
     * @return typePartition
     */
    public java.lang.String getTypePartition() {
        return typePartition;
    }


    /**
     * Sets the typePartition value for this PromotionDTO.
     * 
     * @param typePartition
     */
    public void setTypePartition(java.lang.String typePartition) {
        this.typePartition = typePartition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromotionDTO)) return false;
        PromotionDTO other = (PromotionDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bonusCollection==null && other.getBonusCollection()==null) || 
             (this.bonusCollection!=null &&
              java.util.Arrays.equals(this.bonusCollection, other.getBonusCollection()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.finalDate==null && other.getFinalDate()==null) || 
             (this.finalDate!=null &&
              this.finalDate.equals(other.getFinalDate()))) &&
            ((this.initialDate==null && other.getInitialDate()==null) || 
             (this.initialDate!=null &&
              this.initialDate.equals(other.getInitialDate()))) &&
            ((this.partition==null && other.getPartition()==null) || 
             (this.partition!=null &&
              this.partition.equals(other.getPartition()))) &&
            ((this.promotionDayId==null && other.getPromotionDayId()==null) || 
             (this.promotionDayId!=null &&
              this.promotionDayId.equals(other.getPromotionDayId()))) &&
            ((this.typePartition==null && other.getTypePartition()==null) || 
             (this.typePartition!=null &&
              this.typePartition.equals(other.getTypePartition())));
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
        if (getBonusCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBonusCollection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBonusCollection(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFinalDate() != null) {
            _hashCode += getFinalDate().hashCode();
        }
        if (getInitialDate() != null) {
            _hashCode += getInitialDate().hashCode();
        }
        if (getPartition() != null) {
            _hashCode += getPartition().hashCode();
        }
        if (getPromotionDayId() != null) {
            _hashCode += getPromotionDayId().hashCode();
        }
        if (getTypePartition() != null) {
            _hashCode += getTypePartition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PromotionDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "promotionDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "bonusDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "initialDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionDayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "promotionDayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typePartition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typePartition"));
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
