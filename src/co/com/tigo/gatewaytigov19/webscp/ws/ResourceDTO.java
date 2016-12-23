/**
 * ResourceDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ResourceDTO  implements java.io.Serializable {
    private java.util.Calendar activationDate;

    private java.util.Calendar expirationDate;

    private java.lang.String offPeak;

    private java.lang.Integer partitionId;

    private java.lang.String partitionName;

    private java.lang.Integer partitionUnit;

    private java.lang.String peak;

    private java.lang.String promotional;

    private java.util.Calendar promotionalExpireDate;

    private java.lang.String serviceRate;

    public ResourceDTO() {
    }

    public ResourceDTO(
           java.util.Calendar activationDate,
           java.util.Calendar expirationDate,
           java.lang.String offPeak,
           java.lang.Integer partitionId,
           java.lang.String partitionName,
           java.lang.Integer partitionUnit,
           java.lang.String peak,
           java.lang.String promotional,
           java.util.Calendar promotionalExpireDate,
           java.lang.String serviceRate) {
           this.activationDate = activationDate;
           this.expirationDate = expirationDate;
           this.offPeak = offPeak;
           this.partitionId = partitionId;
           this.partitionName = partitionName;
           this.partitionUnit = partitionUnit;
           this.peak = peak;
           this.promotional = promotional;
           this.promotionalExpireDate = promotionalExpireDate;
           this.serviceRate = serviceRate;
    }


    /**
     * Gets the activationDate value for this ResourceDTO.
     * 
     * @return activationDate
     */
    public java.util.Calendar getActivationDate() {
        return activationDate;
    }


    /**
     * Sets the activationDate value for this ResourceDTO.
     * 
     * @param activationDate
     */
    public void setActivationDate(java.util.Calendar activationDate) {
        this.activationDate = activationDate;
    }


    /**
     * Gets the expirationDate value for this ResourceDTO.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this ResourceDTO.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the offPeak value for this ResourceDTO.
     * 
     * @return offPeak
     */
    public java.lang.String getOffPeak() {
        return offPeak;
    }


    /**
     * Sets the offPeak value for this ResourceDTO.
     * 
     * @param offPeak
     */
    public void setOffPeak(java.lang.String offPeak) {
        this.offPeak = offPeak;
    }


    /**
     * Gets the partitionId value for this ResourceDTO.
     * 
     * @return partitionId
     */
    public java.lang.Integer getPartitionId() {
        return partitionId;
    }


    /**
     * Sets the partitionId value for this ResourceDTO.
     * 
     * @param partitionId
     */
    public void setPartitionId(java.lang.Integer partitionId) {
        this.partitionId = partitionId;
    }


    /**
     * Gets the partitionName value for this ResourceDTO.
     * 
     * @return partitionName
     */
    public java.lang.String getPartitionName() {
        return partitionName;
    }


    /**
     * Sets the partitionName value for this ResourceDTO.
     * 
     * @param partitionName
     */
    public void setPartitionName(java.lang.String partitionName) {
        this.partitionName = partitionName;
    }


    /**
     * Gets the partitionUnit value for this ResourceDTO.
     * 
     * @return partitionUnit
     */
    public java.lang.Integer getPartitionUnit() {
        return partitionUnit;
    }


    /**
     * Sets the partitionUnit value for this ResourceDTO.
     * 
     * @param partitionUnit
     */
    public void setPartitionUnit(java.lang.Integer partitionUnit) {
        this.partitionUnit = partitionUnit;
    }


    /**
     * Gets the peak value for this ResourceDTO.
     * 
     * @return peak
     */
    public java.lang.String getPeak() {
        return peak;
    }


    /**
     * Sets the peak value for this ResourceDTO.
     * 
     * @param peak
     */
    public void setPeak(java.lang.String peak) {
        this.peak = peak;
    }


    /**
     * Gets the promotional value for this ResourceDTO.
     * 
     * @return promotional
     */
    public java.lang.String getPromotional() {
        return promotional;
    }


    /**
     * Sets the promotional value for this ResourceDTO.
     * 
     * @param promotional
     */
    public void setPromotional(java.lang.String promotional) {
        this.promotional = promotional;
    }


    /**
     * Gets the promotionalExpireDate value for this ResourceDTO.
     * 
     * @return promotionalExpireDate
     */
    public java.util.Calendar getPromotionalExpireDate() {
        return promotionalExpireDate;
    }


    /**
     * Sets the promotionalExpireDate value for this ResourceDTO.
     * 
     * @param promotionalExpireDate
     */
    public void setPromotionalExpireDate(java.util.Calendar promotionalExpireDate) {
        this.promotionalExpireDate = promotionalExpireDate;
    }


    /**
     * Gets the serviceRate value for this ResourceDTO.
     * 
     * @return serviceRate
     */
    public java.lang.String getServiceRate() {
        return serviceRate;
    }


    /**
     * Sets the serviceRate value for this ResourceDTO.
     * 
     * @param serviceRate
     */
    public void setServiceRate(java.lang.String serviceRate) {
        this.serviceRate = serviceRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceDTO)) return false;
        ResourceDTO other = (ResourceDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activationDate==null && other.getActivationDate()==null) || 
             (this.activationDate!=null &&
              this.activationDate.equals(other.getActivationDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.offPeak==null && other.getOffPeak()==null) || 
             (this.offPeak!=null &&
              this.offPeak.equals(other.getOffPeak()))) &&
            ((this.partitionId==null && other.getPartitionId()==null) || 
             (this.partitionId!=null &&
              this.partitionId.equals(other.getPartitionId()))) &&
            ((this.partitionName==null && other.getPartitionName()==null) || 
             (this.partitionName!=null &&
              this.partitionName.equals(other.getPartitionName()))) &&
            ((this.partitionUnit==null && other.getPartitionUnit()==null) || 
             (this.partitionUnit!=null &&
              this.partitionUnit.equals(other.getPartitionUnit()))) &&
            ((this.peak==null && other.getPeak()==null) || 
             (this.peak!=null &&
              this.peak.equals(other.getPeak()))) &&
            ((this.promotional==null && other.getPromotional()==null) || 
             (this.promotional!=null &&
              this.promotional.equals(other.getPromotional()))) &&
            ((this.promotionalExpireDate==null && other.getPromotionalExpireDate()==null) || 
             (this.promotionalExpireDate!=null &&
              this.promotionalExpireDate.equals(other.getPromotionalExpireDate()))) &&
            ((this.serviceRate==null && other.getServiceRate()==null) || 
             (this.serviceRate!=null &&
              this.serviceRate.equals(other.getServiceRate())));
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
        if (getActivationDate() != null) {
            _hashCode += getActivationDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getOffPeak() != null) {
            _hashCode += getOffPeak().hashCode();
        }
        if (getPartitionId() != null) {
            _hashCode += getPartitionId().hashCode();
        }
        if (getPartitionName() != null) {
            _hashCode += getPartitionName().hashCode();
        }
        if (getPartitionUnit() != null) {
            _hashCode += getPartitionUnit().hashCode();
        }
        if (getPeak() != null) {
            _hashCode += getPeak().hashCode();
        }
        if (getPromotional() != null) {
            _hashCode += getPromotional().hashCode();
        }
        if (getPromotionalExpireDate() != null) {
            _hashCode += getPromotionalExpireDate().hashCode();
        }
        if (getServiceRate() != null) {
            _hashCode += getServiceRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "resourceDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offPeak");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offPeak"));
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
        elemField.setFieldName("partitionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peak");
        elemField.setXmlName(new javax.xml.namespace.QName("", "peak"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "promotional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionalExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "promotionalExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceRate"));
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
