/**
 * VoucherRechargeResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class VoucherRechargeResponseDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusCredited;

    private co.com.tigo.gatewaytigov19.webscp.ws.DedicatedMoneyDTO[] dedicatedMoneyBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.DedicatedMoneyDTO[] dedicatedMoneyCredited;

    private java.lang.String msisdn;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realCredited;

    private co.com.tigo.gatewaytigov19.webscp.ws.ResourceDTO[] resourceBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.ResourceDTO[] resourceCredited;

    private co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO returnCode;

    private java.lang.String transactionId;

    public VoucherRechargeResponseDTO() {
    }

    public VoucherRechargeResponseDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusCredited,
           co.com.tigo.gatewaytigov19.webscp.ws.DedicatedMoneyDTO[] dedicatedMoneyBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.DedicatedMoneyDTO[] dedicatedMoneyCredited,
           java.lang.String msisdn,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realCredited,
           co.com.tigo.gatewaytigov19.webscp.ws.ResourceDTO[] resourceBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.ResourceDTO[] resourceCredited,
           co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO returnCode,
           java.lang.String transactionId) {
           this.bonusBalance = bonusBalance;
           this.bonusCredited = bonusCredited;
           this.dedicatedMoneyBalance = dedicatedMoneyBalance;
           this.dedicatedMoneyCredited = dedicatedMoneyCredited;
           this.msisdn = msisdn;
           this.realBalance = realBalance;
           this.realCredited = realCredited;
           this.resourceBalance = resourceBalance;
           this.resourceCredited = resourceCredited;
           this.returnCode = returnCode;
           this.transactionId = transactionId;
    }


    /**
     * Gets the bonusBalance value for this VoucherRechargeResponseDTO.
     * 
     * @return bonusBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusBalance() {
        return bonusBalance;
    }


    /**
     * Sets the bonusBalance value for this VoucherRechargeResponseDTO.
     * 
     * @param bonusBalance
     */
    public void setBonusBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance) {
        this.bonusBalance = bonusBalance;
    }


    /**
     * Gets the bonusCredited value for this VoucherRechargeResponseDTO.
     * 
     * @return bonusCredited
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusCredited() {
        return bonusCredited;
    }


    /**
     * Sets the bonusCredited value for this VoucherRechargeResponseDTO.
     * 
     * @param bonusCredited
     */
    public void setBonusCredited(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusCredited) {
        this.bonusCredited = bonusCredited;
    }


    /**
     * Gets the dedicatedMoneyBalance value for this VoucherRechargeResponseDTO.
     * 
     * @return dedicatedMoneyBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.DedicatedMoneyDTO[] getDedicatedMoneyBalance() {
        return dedicatedMoneyBalance;
    }


    /**
     * Sets the dedicatedMoneyBalance value for this VoucherRechargeResponseDTO.
     * 
     * @param dedicatedMoneyBalance
     */
    public void setDedicatedMoneyBalance(co.com.tigo.gatewaytigov19.webscp.ws.DedicatedMoneyDTO[] dedicatedMoneyBalance) {
        this.dedicatedMoneyBalance = dedicatedMoneyBalance;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.DedicatedMoneyDTO getDedicatedMoneyBalance(int i) {
        return this.dedicatedMoneyBalance[i];
    }

    public void setDedicatedMoneyBalance(int i, co.com.tigo.gatewaytigov19.webscp.ws.DedicatedMoneyDTO _value) {
        this.dedicatedMoneyBalance[i] = _value;
    }


    /**
     * Gets the dedicatedMoneyCredited value for this VoucherRechargeResponseDTO.
     * 
     * @return dedicatedMoneyCredited
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.DedicatedMoneyDTO[] getDedicatedMoneyCredited() {
        return dedicatedMoneyCredited;
    }


    /**
     * Sets the dedicatedMoneyCredited value for this VoucherRechargeResponseDTO.
     * 
     * @param dedicatedMoneyCredited
     */
    public void setDedicatedMoneyCredited(co.com.tigo.gatewaytigov19.webscp.ws.DedicatedMoneyDTO[] dedicatedMoneyCredited) {
        this.dedicatedMoneyCredited = dedicatedMoneyCredited;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.DedicatedMoneyDTO getDedicatedMoneyCredited(int i) {
        return this.dedicatedMoneyCredited[i];
    }

    public void setDedicatedMoneyCredited(int i, co.com.tigo.gatewaytigov19.webscp.ws.DedicatedMoneyDTO _value) {
        this.dedicatedMoneyCredited[i] = _value;
    }


    /**
     * Gets the msisdn value for this VoucherRechargeResponseDTO.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this VoucherRechargeResponseDTO.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the realBalance value for this VoucherRechargeResponseDTO.
     * 
     * @return realBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealBalance() {
        return realBalance;
    }


    /**
     * Sets the realBalance value for this VoucherRechargeResponseDTO.
     * 
     * @param realBalance
     */
    public void setRealBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance) {
        this.realBalance = realBalance;
    }


    /**
     * Gets the realCredited value for this VoucherRechargeResponseDTO.
     * 
     * @return realCredited
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealCredited() {
        return realCredited;
    }


    /**
     * Sets the realCredited value for this VoucherRechargeResponseDTO.
     * 
     * @param realCredited
     */
    public void setRealCredited(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realCredited) {
        this.realCredited = realCredited;
    }


    /**
     * Gets the resourceBalance value for this VoucherRechargeResponseDTO.
     * 
     * @return resourceBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ResourceDTO[] getResourceBalance() {
        return resourceBalance;
    }


    /**
     * Sets the resourceBalance value for this VoucherRechargeResponseDTO.
     * 
     * @param resourceBalance
     */
    public void setResourceBalance(co.com.tigo.gatewaytigov19.webscp.ws.ResourceDTO[] resourceBalance) {
        this.resourceBalance = resourceBalance;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ResourceDTO getResourceBalance(int i) {
        return this.resourceBalance[i];
    }

    public void setResourceBalance(int i, co.com.tigo.gatewaytigov19.webscp.ws.ResourceDTO _value) {
        this.resourceBalance[i] = _value;
    }


    /**
     * Gets the resourceCredited value for this VoucherRechargeResponseDTO.
     * 
     * @return resourceCredited
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ResourceDTO[] getResourceCredited() {
        return resourceCredited;
    }


    /**
     * Sets the resourceCredited value for this VoucherRechargeResponseDTO.
     * 
     * @param resourceCredited
     */
    public void setResourceCredited(co.com.tigo.gatewaytigov19.webscp.ws.ResourceDTO[] resourceCredited) {
        this.resourceCredited = resourceCredited;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ResourceDTO getResourceCredited(int i) {
        return this.resourceCredited[i];
    }

    public void setResourceCredited(int i, co.com.tigo.gatewaytigov19.webscp.ws.ResourceDTO _value) {
        this.resourceCredited[i] = _value;
    }


    /**
     * Gets the returnCode value for this VoucherRechargeResponseDTO.
     * 
     * @return returnCode
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this VoucherRechargeResponseDTO.
     * 
     * @param returnCode
     */
    public void setReturnCode(co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the transactionId value for this VoucherRechargeResponseDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this VoucherRechargeResponseDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoucherRechargeResponseDTO)) return false;
        VoucherRechargeResponseDTO other = (VoucherRechargeResponseDTO) obj;
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
            ((this.bonusCredited==null && other.getBonusCredited()==null) || 
             (this.bonusCredited!=null &&
              this.bonusCredited.equals(other.getBonusCredited()))) &&
            ((this.dedicatedMoneyBalance==null && other.getDedicatedMoneyBalance()==null) || 
             (this.dedicatedMoneyBalance!=null &&
              java.util.Arrays.equals(this.dedicatedMoneyBalance, other.getDedicatedMoneyBalance()))) &&
            ((this.dedicatedMoneyCredited==null && other.getDedicatedMoneyCredited()==null) || 
             (this.dedicatedMoneyCredited!=null &&
              java.util.Arrays.equals(this.dedicatedMoneyCredited, other.getDedicatedMoneyCredited()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.realBalance==null && other.getRealBalance()==null) || 
             (this.realBalance!=null &&
              this.realBalance.equals(other.getRealBalance()))) &&
            ((this.realCredited==null && other.getRealCredited()==null) || 
             (this.realCredited!=null &&
              this.realCredited.equals(other.getRealCredited()))) &&
            ((this.resourceBalance==null && other.getResourceBalance()==null) || 
             (this.resourceBalance!=null &&
              java.util.Arrays.equals(this.resourceBalance, other.getResourceBalance()))) &&
            ((this.resourceCredited==null && other.getResourceCredited()==null) || 
             (this.resourceCredited!=null &&
              java.util.Arrays.equals(this.resourceCredited, other.getResourceCredited()))) &&
            ((this.returnCode==null && other.getReturnCode()==null) || 
             (this.returnCode!=null &&
              this.returnCode.equals(other.getReturnCode()))) &&
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
        if (getBonusBalance() != null) {
            _hashCode += getBonusBalance().hashCode();
        }
        if (getBonusCredited() != null) {
            _hashCode += getBonusCredited().hashCode();
        }
        if (getDedicatedMoneyBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDedicatedMoneyBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDedicatedMoneyBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDedicatedMoneyCredited() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDedicatedMoneyCredited());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDedicatedMoneyCredited(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getRealBalance() != null) {
            _hashCode += getRealBalance().hashCode();
        }
        if (getRealCredited() != null) {
            _hashCode += getRealCredited().hashCode();
        }
        if (getResourceBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResourceBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResourceBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResourceCredited() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResourceCredited());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResourceCredited(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoucherRechargeResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "voucherRechargeResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusCredited");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusCredited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedicatedMoneyBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dedicatedMoneyBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "dedicatedMoneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedicatedMoneyCredited");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dedicatedMoneyCredited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "dedicatedMoneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realCredited");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realCredited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "resourceDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceCredited");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceCredited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "resourceDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "returnCodeDTO"));
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
