/**
 * ReservationGeneralResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class ReservationGeneralResponseDTO  implements java.io.Serializable {
    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.ControlledAccountBalanceDTO controlledAccountBalance;

    private java.lang.String msisdn;

    private co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalance;

    private co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance;

    private java.lang.String reservationId;

    private co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO returnCode;

    private java.lang.String transactionId;

    public ReservationGeneralResponseDTO() {
    }

    public ReservationGeneralResponseDTO(
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.ControlledAccountBalanceDTO controlledAccountBalance,
           java.lang.String msisdn,
           co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalance,
           co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance,
           java.lang.String reservationId,
           co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO returnCode,
           java.lang.String transactionId) {
           this.bonusBalance = bonusBalance;
           this.controlledAccountBalance = controlledAccountBalance;
           this.msisdn = msisdn;
           this.partitionBalance = partitionBalance;
           this.realBalance = realBalance;
           this.reservationId = reservationId;
           this.returnCode = returnCode;
           this.transactionId = transactionId;
    }


    /**
     * Gets the bonusBalance value for this ReservationGeneralResponseDTO.
     * 
     * @return bonusBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getBonusBalance() {
        return bonusBalance;
    }


    /**
     * Sets the bonusBalance value for this ReservationGeneralResponseDTO.
     * 
     * @param bonusBalance
     */
    public void setBonusBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO bonusBalance) {
        this.bonusBalance = bonusBalance;
    }


    /**
     * Gets the controlledAccountBalance value for this ReservationGeneralResponseDTO.
     * 
     * @return controlledAccountBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ControlledAccountBalanceDTO getControlledAccountBalance() {
        return controlledAccountBalance;
    }


    /**
     * Sets the controlledAccountBalance value for this ReservationGeneralResponseDTO.
     * 
     * @param controlledAccountBalance
     */
    public void setControlledAccountBalance(co.com.tigo.gatewaytigov19.webscp.ws.ControlledAccountBalanceDTO controlledAccountBalance) {
        this.controlledAccountBalance = controlledAccountBalance;
    }


    /**
     * Gets the msisdn value for this ReservationGeneralResponseDTO.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this ReservationGeneralResponseDTO.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the partitionBalance value for this ReservationGeneralResponseDTO.
     * 
     * @return partitionBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] getPartitionBalance() {
        return partitionBalance;
    }


    /**
     * Sets the partitionBalance value for this ReservationGeneralResponseDTO.
     * 
     * @param partitionBalance
     */
    public void setPartitionBalance(co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO[] partitionBalance) {
        this.partitionBalance = partitionBalance;
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO getPartitionBalance(int i) {
        return this.partitionBalance[i];
    }

    public void setPartitionBalance(int i, co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO _value) {
        this.partitionBalance[i] = _value;
    }


    /**
     * Gets the realBalance value for this ReservationGeneralResponseDTO.
     * 
     * @return realBalance
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO getRealBalance() {
        return realBalance;
    }


    /**
     * Sets the realBalance value for this ReservationGeneralResponseDTO.
     * 
     * @param realBalance
     */
    public void setRealBalance(co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO realBalance) {
        this.realBalance = realBalance;
    }


    /**
     * Gets the reservationId value for this ReservationGeneralResponseDTO.
     * 
     * @return reservationId
     */
    public java.lang.String getReservationId() {
        return reservationId;
    }


    /**
     * Sets the reservationId value for this ReservationGeneralResponseDTO.
     * 
     * @param reservationId
     */
    public void setReservationId(java.lang.String reservationId) {
        this.reservationId = reservationId;
    }


    /**
     * Gets the returnCode value for this ReservationGeneralResponseDTO.
     * 
     * @return returnCode
     */
    public co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this ReservationGeneralResponseDTO.
     * 
     * @param returnCode
     */
    public void setReturnCode(co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the transactionId value for this ReservationGeneralResponseDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this ReservationGeneralResponseDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationGeneralResponseDTO)) return false;
        ReservationGeneralResponseDTO other = (ReservationGeneralResponseDTO) obj;
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
            ((this.controlledAccountBalance==null && other.getControlledAccountBalance()==null) || 
             (this.controlledAccountBalance!=null &&
              this.controlledAccountBalance.equals(other.getControlledAccountBalance()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.partitionBalance==null && other.getPartitionBalance()==null) || 
             (this.partitionBalance!=null &&
              java.util.Arrays.equals(this.partitionBalance, other.getPartitionBalance()))) &&
            ((this.realBalance==null && other.getRealBalance()==null) || 
             (this.realBalance!=null &&
              this.realBalance.equals(other.getRealBalance()))) &&
            ((this.reservationId==null && other.getReservationId()==null) || 
             (this.reservationId!=null &&
              this.reservationId.equals(other.getReservationId()))) &&
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
        if (getControlledAccountBalance() != null) {
            _hashCode += getControlledAccountBalance().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getPartitionBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRealBalance() != null) {
            _hashCode += getRealBalance().hashCode();
        }
        if (getReservationId() != null) {
            _hashCode += getReservationId().hashCode();
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
        new org.apache.axis.description.TypeDesc(ReservationGeneralResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationGeneralResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonusBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlledAccountBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "controlledAccountBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "controlledAccountBalanceDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "partitionDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reservationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
