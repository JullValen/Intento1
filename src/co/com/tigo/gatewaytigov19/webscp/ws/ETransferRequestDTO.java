/**
 * ETransferRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ETransferRequestDTO  implements java.io.Serializable {
    private java.lang.Long amountResource;

    private java.lang.String destinationMobile;

    private java.lang.String information;

    private co.com.tigo.gatewaytigov19.webscp.ws.IdDTO resourceType;

    private java.lang.String terminalId;

    private java.lang.String transactionId;

    public ETransferRequestDTO() {
    }

    public ETransferRequestDTO(
           java.lang.Long amountResource,
           java.lang.String destinationMobile,
           java.lang.String information,
           co.com.tigo.gatewaytigov19.webscp.ws.IdDTO resourceType,
           java.lang.String terminalId,
           java.lang.String transactionId) {
           this.amountResource = amountResource;
           this.destinationMobile = destinationMobile;
           this.information = information;
           this.resourceType = resourceType;
           this.terminalId = terminalId;
           this.transactionId = transactionId;
    }


    /**
     * Gets the amountResource value for this ETransferRequestDTO.
     * 
     * @return amountResource
     */
    public java.lang.Long getAmountResource() {
        return amountResource;
    }


    /**
     * Sets the amountResource value for this ETransferRequestDTO.
     * 
     * @param amountResource
     */
    public void setAmountResource(java.lang.Long amountResource) {
        this.amountResource = amountResource;
    }


    /**
     * Gets the destinationMobile value for this ETransferRequestDTO.
     * 
     * @return destinationMobile
     */
    public java.lang.String getDestinationMobile() {
        return destinationMobile;
    }


    /**
     * Sets the destinationMobile value for this ETransferRequestDTO.
     * 
     * @param destinationMobile
     */
    public void setDestinationMobile(java.lang.String destinationMobile) {
        this.destinationMobile = destinationMobile;
    }


    /**
     * Gets the information value for this ETransferRequestDTO.
     * 
     * @return information
     */
    public java.lang.String getInformation() {
        return information;
    }


    /**
     * Sets the information value for this ETransferRequestDTO.
     * 
     * @param information
     */
    public void setInformation(java.lang.String information) {
        this.information = information;
    }


    /**
     * Gets the resourceType value for this ETransferRequestDTO.
     * 
     * @return resourceType
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.IdDTO getResourceType() {
        return resourceType;
    }


    /**
     * Sets the resourceType value for this ETransferRequestDTO.
     * 
     * @param resourceType
     */
    public void setResourceType(co.com.tigo.gatewaytigov19.webscp.ws.IdDTO resourceType) {
        this.resourceType = resourceType;
    }


    /**
     * Gets the terminalId value for this ETransferRequestDTO.
     * 
     * @return terminalId
     */
    public java.lang.String getTerminalId() {
        return terminalId;
    }


    /**
     * Sets the terminalId value for this ETransferRequestDTO.
     * 
     * @param terminalId
     */
    public void setTerminalId(java.lang.String terminalId) {
        this.terminalId = terminalId;
    }


    /**
     * Gets the transactionId value for this ETransferRequestDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this ETransferRequestDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ETransferRequestDTO)) return false;
        ETransferRequestDTO other = (ETransferRequestDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amountResource==null && other.getAmountResource()==null) || 
             (this.amountResource!=null &&
              this.amountResource.equals(other.getAmountResource()))) &&
            ((this.destinationMobile==null && other.getDestinationMobile()==null) || 
             (this.destinationMobile!=null &&
              this.destinationMobile.equals(other.getDestinationMobile()))) &&
            ((this.information==null && other.getInformation()==null) || 
             (this.information!=null &&
              this.information.equals(other.getInformation()))) &&
            ((this.resourceType==null && other.getResourceType()==null) || 
             (this.resourceType!=null &&
              this.resourceType.equals(other.getResourceType()))) &&
            ((this.terminalId==null && other.getTerminalId()==null) || 
             (this.terminalId!=null &&
              this.terminalId.equals(other.getTerminalId()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId())));
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
        if (getAmountResource() != null) {
            _hashCode += getAmountResource().hashCode();
        }
        if (getDestinationMobile() != null) {
            _hashCode += getDestinationMobile().hashCode();
        }
        if (getInformation() != null) {
            _hashCode += getInformation().hashCode();
        }
        if (getResourceType() != null) {
            _hashCode += getResourceType().hashCode();
        }
        if (getTerminalId() != null) {
            _hashCode += getTerminalId().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ETransferRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eTransferRequestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountResource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("information");
        elemField.setXmlName(new javax.xml.namespace.QName("", "information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "idDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "terminalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
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
