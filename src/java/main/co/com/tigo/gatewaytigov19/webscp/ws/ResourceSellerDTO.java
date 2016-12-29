/**
 * ResourceSellerDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ResourceSellerDTO  implements java.io.Serializable {
    private java.math.BigDecimal amountBuyer;

    private co.com.tigo.gatewaytigov19.webscp.ws.ExpirationDTO[] expirationColl;

    private java.lang.Long expirationDaysSeller;

    private java.lang.Boolean giveResource;

    private java.lang.String partitionBuyerType;

    private java.lang.Integer partitionId;

    private java.lang.Integer partitionIdBuyer;

    private java.lang.String partitionSellerType;

    private java.math.BigDecimal price;

    private co.com.tigo.gatewaytigov19.webscp.ws.IdDTO resourceId;

    private co.com.tigo.gatewaytigov19.webscp.ws.ServiceResourceDTO service;

    public ResourceSellerDTO() {
    }

    public ResourceSellerDTO(
           java.math.BigDecimal amountBuyer,
           co.com.tigo.gatewaytigov19.webscp.ws.ExpirationDTO[] expirationColl,
           java.lang.Long expirationDaysSeller,
           java.lang.Boolean giveResource,
           java.lang.String partitionBuyerType,
           java.lang.Integer partitionId,
           java.lang.Integer partitionIdBuyer,
           java.lang.String partitionSellerType,
           java.math.BigDecimal price,
           co.com.tigo.gatewaytigov19.webscp.ws.IdDTO resourceId,
           co.com.tigo.gatewaytigov19.webscp.ws.ServiceResourceDTO service) {
           this.amountBuyer = amountBuyer;
           this.expirationColl = expirationColl;
           this.expirationDaysSeller = expirationDaysSeller;
           this.giveResource = giveResource;
           this.partitionBuyerType = partitionBuyerType;
           this.partitionId = partitionId;
           this.partitionIdBuyer = partitionIdBuyer;
           this.partitionSellerType = partitionSellerType;
           this.price = price;
           this.resourceId = resourceId;
           this.service = service;
    }


    /**
     * Gets the amountBuyer value for this ResourceSellerDTO.
     * 
     * @return amountBuyer
     */
    public java.math.BigDecimal getAmountBuyer() {
        return amountBuyer;
    }


    /**
     * Sets the amountBuyer value for this ResourceSellerDTO.
     * 
     * @param amountBuyer
     */
    public void setAmountBuyer(java.math.BigDecimal amountBuyer) {
        this.amountBuyer = amountBuyer;
    }


    /**
     * Gets the expirationColl value for this ResourceSellerDTO.
     * 
     * @return expirationColl
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ExpirationDTO[] getExpirationColl() {
        return expirationColl;
    }


    /**
     * Sets the expirationColl value for this ResourceSellerDTO.
     * 
     * @param expirationColl
     */
    public void setExpirationColl(co.com.tigo.gatewaytigov19.webscp.ws.ExpirationDTO[] expirationColl) {
        this.expirationColl = expirationColl;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ExpirationDTO getExpirationColl(int i) {
        return this.expirationColl[i];
    }

    public void setExpirationColl(int i, co.com.tigo.gatewaytigov19.webscp.ws.ExpirationDTO _value) {
        this.expirationColl[i] = _value;
    }


    /**
     * Gets the expirationDaysSeller value for this ResourceSellerDTO.
     * 
     * @return expirationDaysSeller
     */
    public java.lang.Long getExpirationDaysSeller() {
        return expirationDaysSeller;
    }


    /**
     * Sets the expirationDaysSeller value for this ResourceSellerDTO.
     * 
     * @param expirationDaysSeller
     */
    public void setExpirationDaysSeller(java.lang.Long expirationDaysSeller) {
        this.expirationDaysSeller = expirationDaysSeller;
    }


    /**
     * Gets the giveResource value for this ResourceSellerDTO.
     * 
     * @return giveResource
     */
    public java.lang.Boolean getGiveResource() {
        return giveResource;
    }


    /**
     * Sets the giveResource value for this ResourceSellerDTO.
     * 
     * @param giveResource
     */
    public void setGiveResource(java.lang.Boolean giveResource) {
        this.giveResource = giveResource;
    }


    /**
     * Gets the partitionBuyerType value for this ResourceSellerDTO.
     * 
     * @return partitionBuyerType
     */
    public java.lang.String getPartitionBuyerType() {
        return partitionBuyerType;
    }


    /**
     * Sets the partitionBuyerType value for this ResourceSellerDTO.
     * 
     * @param partitionBuyerType
     */
    public void setPartitionBuyerType(java.lang.String partitionBuyerType) {
        this.partitionBuyerType = partitionBuyerType;
    }


    /**
     * Gets the partitionId value for this ResourceSellerDTO.
     * 
     * @return partitionId
     */
    public java.lang.Integer getPartitionId() {
        return partitionId;
    }


    /**
     * Sets the partitionId value for this ResourceSellerDTO.
     * 
     * @param partitionId
     */
    public void setPartitionId(java.lang.Integer partitionId) {
        this.partitionId = partitionId;
    }


    /**
     * Gets the partitionIdBuyer value for this ResourceSellerDTO.
     * 
     * @return partitionIdBuyer
     */
    public java.lang.Integer getPartitionIdBuyer() {
        return partitionIdBuyer;
    }


    /**
     * Sets the partitionIdBuyer value for this ResourceSellerDTO.
     * 
     * @param partitionIdBuyer
     */
    public void setPartitionIdBuyer(java.lang.Integer partitionIdBuyer) {
        this.partitionIdBuyer = partitionIdBuyer;
    }


    /**
     * Gets the partitionSellerType value for this ResourceSellerDTO.
     * 
     * @return partitionSellerType
     */
    public java.lang.String getPartitionSellerType() {
        return partitionSellerType;
    }


    /**
     * Sets the partitionSellerType value for this ResourceSellerDTO.
     * 
     * @param partitionSellerType
     */
    public void setPartitionSellerType(java.lang.String partitionSellerType) {
        this.partitionSellerType = partitionSellerType;
    }


    /**
     * Gets the price value for this ResourceSellerDTO.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ResourceSellerDTO.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }


    /**
     * Gets the resourceId value for this ResourceSellerDTO.
     * 
     * @return resourceId
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.IdDTO getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this ResourceSellerDTO.
     * 
     * @param resourceId
     */
    public void setResourceId(co.com.tigo.gatewaytigov19.webscp.ws.IdDTO resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the service value for this ResourceSellerDTO.
     * 
     * @return service
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ServiceResourceDTO getService() {
        return service;
    }


    /**
     * Sets the service value for this ResourceSellerDTO.
     * 
     * @param service
     */
    public void setService(co.com.tigo.gatewaytigov19.webscp.ws.ServiceResourceDTO service) {
        this.service = service;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceSellerDTO)) return false;
        ResourceSellerDTO other = (ResourceSellerDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amountBuyer==null && other.getAmountBuyer()==null) || 
             (this.amountBuyer!=null &&
              this.amountBuyer.equals(other.getAmountBuyer()))) &&
            ((this.expirationColl==null && other.getExpirationColl()==null) || 
             (this.expirationColl!=null &&
              java.util.Arrays.equals(this.expirationColl, other.getExpirationColl()))) &&
            ((this.expirationDaysSeller==null && other.getExpirationDaysSeller()==null) || 
             (this.expirationDaysSeller!=null &&
              this.expirationDaysSeller.equals(other.getExpirationDaysSeller()))) &&
            ((this.giveResource==null && other.getGiveResource()==null) || 
             (this.giveResource!=null &&
              this.giveResource.equals(other.getGiveResource()))) &&
            ((this.partitionBuyerType==null && other.getPartitionBuyerType()==null) || 
             (this.partitionBuyerType!=null &&
              this.partitionBuyerType.equals(other.getPartitionBuyerType()))) &&
            ((this.partitionId==null && other.getPartitionId()==null) || 
             (this.partitionId!=null &&
              this.partitionId.equals(other.getPartitionId()))) &&
            ((this.partitionIdBuyer==null && other.getPartitionIdBuyer()==null) || 
             (this.partitionIdBuyer!=null &&
              this.partitionIdBuyer.equals(other.getPartitionIdBuyer()))) &&
            ((this.partitionSellerType==null && other.getPartitionSellerType()==null) || 
             (this.partitionSellerType!=null &&
              this.partitionSellerType.equals(other.getPartitionSellerType()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService())));
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
        if (getAmountBuyer() != null) {
            _hashCode += getAmountBuyer().hashCode();
        }
        if (getExpirationColl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpirationColl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpirationColl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpirationDaysSeller() != null) {
            _hashCode += getExpirationDaysSeller().hashCode();
        }
        if (getGiveResource() != null) {
            _hashCode += getGiveResource().hashCode();
        }
        if (getPartitionBuyerType() != null) {
            _hashCode += getPartitionBuyerType().hashCode();
        }
        if (getPartitionId() != null) {
            _hashCode += getPartitionId().hashCode();
        }
        if (getPartitionIdBuyer() != null) {
            _hashCode += getPartitionIdBuyer().hashCode();
        }
        if (getPartitionSellerType() != null) {
            _hashCode += getPartitionSellerType().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceSellerDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "resourceSellerDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountBuyer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountBuyer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationColl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "expirationDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDaysSeller");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDaysSeller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giveResource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "giveResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionBuyerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionBuyerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionIdBuyer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionIdBuyer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionSellerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionSellerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "idDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceResourceDTO"));
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
