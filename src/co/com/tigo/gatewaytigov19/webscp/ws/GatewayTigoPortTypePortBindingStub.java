/**
 * GatewayTigoPortTypePortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.tigo.gatewaytigov19.webscp.ws;

public class GatewayTigoPortTypePortBindingStub extends org.apache.axis.client.Stub implements co.com.tigo.gatewaytigov19.webscp.ws.GatewayTigoPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[37];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("credit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "creditRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.CreditRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "creditResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.CreditResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "balanceResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.BalanceResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("balance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "balanceRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.BalanceRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "balanceResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.BalanceResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("applicationEvent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eventRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.EventRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eventResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.EventResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eventAuthorization");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eventRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.EventRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eventResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.EventResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("debit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "debitRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.DebitRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "debitResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.DebitResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "rechargeRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.RechargeRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "rechargeResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.RechargeResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rechargeReversal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "rechargeRevRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.RechargeRevRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "rechargeRevResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.RechargeRevResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eRecharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.ERechargeRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.ERechargeResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eRechargeReversal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeRevRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.ERechargeRevRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeRevResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.ERechargeRevResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("provideBonus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provisioningBonusRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "promotionCollection"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provisioningBonusResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "promotionCollection"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("provideUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provisioningUsersRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "usersPromotionCollection"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provisioningUsersResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "usersPromotionCollection"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("provideProperties");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "propertyDTO"), co.com.tigo.gatewaytigov19.webscp.ws.PropertyDTO[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "propertyDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.PropertyDTO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultBonus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provisioningBonusRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "promotionCollection"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provisioningBonusResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "promotionCollection"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultUsers");
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provisioningUsersResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "usersPromotionCollection"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultEUsersPromotions");
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provisioningUsersResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "usersPromotionCollection"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultProperties");
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "propertyDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.PropertyDTO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("transfer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "transferRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.TransferRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "transferResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.TransferResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("balanceToResource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "balanceToResourceRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.BalanceToResourceRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "balanceToResourceResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.BalanceToResourceResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eTransfer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eTransferRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.ETransferRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eTransferResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.ETransferResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("provideResources");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provisioningResourcesRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.SellerDTO[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "sellersColl"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provisioningResourcesResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.SellerDTO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "sellersColl"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultResources");
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provisioningResourcesResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.SellerDTO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "sellersColl"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("adviceOfCharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "adviceOfChargeRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.AdviceOfChargeRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "adviceOfChargeResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.AdviceOfChargeResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("voucherRecharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "voucherRechargeRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.VoucherRechargeRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "voucherRechargeResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.VoucherRechargeResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reservation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.ReservationRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.ReservationResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reservationCancel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationCancelRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.ReservationCancelRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationCancelResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.ReservationCancelResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reservationModify");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationModifyRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.ReservationModifyRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationModifyResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.ReservationModifyResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reservationQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationQueryRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.ReservationQueryRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationQueryResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.ReservationQueryResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reservationUse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationUseRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.ReservationUseRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationUseResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.ReservationUseResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("serviceStateQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceStateQueryRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.ServiceStateQueryRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceStateQueryResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.ServiceStateQueryResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("serviceQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceQueryRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.ServiceQueryRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceQueryResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.ServiceQueryResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("serviceChange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceChangeRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.ServiceChangeRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceChangeResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.ServiceChangeResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eRechargeDealer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeDealerRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.ERechargeDealerRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeDealerResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.ERechargeDealerResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eRechargeSeller");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeSellerRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeSellerResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eRechargeSellerReversal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeSellerReversalRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerReversalRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeSellerReversalResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerReversalResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eSellProductSeller");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eSellProductSellerRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.ESellProductSellerRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eSellProductSellerResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.ESellProductSellerResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eRechargeAdviser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeAdviserRequestDTO"), co.com.tigo.gatewaytigov19.webscp.ws.ERechargeAdviserRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeAdviserResponseDTO"));
        oper.setReturnClass(co.com.tigo.gatewaytigov19.webscp.ws.ERechargeAdviserResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.BusinessException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"),
                      "co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException",
                      new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException"), 
                      true
                     ));
        _operations[36] = oper;

    }

    public GatewayTigoPortTypePortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public GatewayTigoPortTypePortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public GatewayTigoPortTypePortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "adviceOfChargeRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.AdviceOfChargeRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "adviceOfChargeResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.AdviceOfChargeResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "balanceRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.BalanceRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "balanceResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.BalanceResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "balanceToResourceRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.BalanceToResourceRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "balanceToResourceResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.BalanceToResourceResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "bonusDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.BonusDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "BusinessException");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.BusinessException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "controlledAccountBalanceDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ControlledAccountBalanceDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "creditRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.CreditRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "creditResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.CreditResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "debitRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.DebitRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "debitResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.DebitResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "dedicatedMoneyDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.DedicatedMoneyDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeAdviserRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ERechargeAdviserRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeAdviserResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ERechargeAdviserResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeDealerRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ERechargeDealerRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeDealerResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ERechargeDealerResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ERechargeRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ERechargeResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeRevRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ERechargeRevRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeRevResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ERechargeRevResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeSellerRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeSellerResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeSellerReversalRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerReversalRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeSellerReversalResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerReversalResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eSellProductSellerRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ESellProductSellerRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eSellProductSellerResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ESellProductSellerResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eTransferRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ETransferRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eTransferResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ETransferResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eventRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.EventRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eventResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.EventResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "expirationDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ExpirationDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "GatewayPrepayWSException");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "idDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.IdDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "locationDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.LocationDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "moneyDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.MoneyDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "networkBearerIDDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.NetworkBearerIDDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "partitionDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.PartitionDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "pointOfSaleDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.PointOfSaleDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "promotionDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "propertyDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.PropertyDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provisioningBonusRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "promotionDTO");
            qName2 = new javax.xml.namespace.QName("", "promotionCollection");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provisioningBonusResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "promotionDTO");
            qName2 = new javax.xml.namespace.QName("", "promotionCollection");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provisioningResourcesRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.SellerDTO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "sellerDTO");
            qName2 = new javax.xml.namespace.QName("", "sellersColl");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provisioningResourcesResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.SellerDTO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "sellerDTO");
            qName2 = new javax.xml.namespace.QName("", "sellersColl");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provisioningUsersRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "userPromotionDTO");
            qName2 = new javax.xml.namespace.QName("", "usersPromotionCollection");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provisioningUsersResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "userPromotionDTO");
            qName2 = new javax.xml.namespace.QName("", "usersPromotionCollection");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "rechargeRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.RechargeRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "rechargeResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.RechargeResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "rechargeRevRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.RechargeRevRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "rechargeRevResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.RechargeRevResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationCancelRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ReservationCancelRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationCancelResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ReservationCancelResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationGeneralRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationGeneralResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ReservationGeneralResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationModifyRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ReservationModifyRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationModifyResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ReservationModifyResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationQueryRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ReservationQueryRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationQueryResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ReservationQueryResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationQueryResponseItemDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ReservationQueryResponseItemDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ReservationRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ReservationResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationUseRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ReservationUseRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationUseResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ReservationUseResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "resourceDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ResourceDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "resourceSellerDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ResourceSellerDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "returnCode");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ReturnCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "returnCodeDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ReturnCodeDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "sellerDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.SellerDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceChangeRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ServiceChangeRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceChangeResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ServiceChangeResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceQueryRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ServiceQueryRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceQueryResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ServiceQueryResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceResourceDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ServiceResourceDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceStateQueryRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ServiceStateQueryRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceStateQueryResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.ServiceStateQueryResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "subscriptionServiceDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.SubscriptionServiceDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "transferRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.TransferRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "transferResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.TransferResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "userPromotionDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "voucherRechargeRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.VoucherRechargeRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "voucherRechargeResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.tigo.gatewaytigov19.webscp.ws.VoucherRechargeResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.CreditResponseDTO credit(co.com.tigo.gatewaytigov19.webscp.ws.CreditRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "credit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.CreditResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.CreditResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.CreditResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.BalanceResponseDTO eBalance(java.lang.String arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.BalanceResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.BalanceResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.BalanceResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.BalanceResponseDTO balance(co.com.tigo.gatewaytigov19.webscp.ws.BalanceRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "balance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.BalanceResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.BalanceResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.BalanceResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.EventResponseDTO applicationEvent(co.com.tigo.gatewaytigov19.webscp.ws.EventRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "applicationEvent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.EventResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.EventResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.EventResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.EventResponseDTO eventAuthorization(co.com.tigo.gatewaytigov19.webscp.ws.EventRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eventAuthorization"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.EventResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.EventResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.EventResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.DebitResponseDTO debit(co.com.tigo.gatewaytigov19.webscp.ws.DebitRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "debit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.DebitResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.DebitResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.DebitResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.RechargeResponseDTO recharge(co.com.tigo.gatewaytigov19.webscp.ws.RechargeRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "recharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.RechargeResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.RechargeResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.RechargeResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.RechargeRevResponseDTO rechargeReversal(co.com.tigo.gatewaytigov19.webscp.ws.RechargeRevRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "rechargeReversal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.RechargeRevResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.RechargeRevResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.RechargeRevResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ERechargeResponseDTO eRecharge(co.com.tigo.gatewaytigov19.webscp.ws.ERechargeRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRecharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ERechargeResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ERechargeResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.ERechargeResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ERechargeRevResponseDTO eRechargeReversal(co.com.tigo.gatewaytigov19.webscp.ws.ERechargeRevRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeReversal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ERechargeRevResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ERechargeRevResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.ERechargeRevResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[] provideBonus(co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[] arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provideBonus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[] provideUsers(co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[] arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provideUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PropertyDTO[] provideProperties(co.com.tigo.gatewaytigov19.webscp.ws.PropertyDTO[] arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provideProperties"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.PropertyDTO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.PropertyDTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.PropertyDTO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[] consultBonus(co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[] arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "consultBonus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[] consultUsers() throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "consultUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[] consultEUsersPromotions() throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "consultEUsersPromotions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.PropertyDTO[] consultProperties() throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "consultProperties"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.PropertyDTO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.PropertyDTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.PropertyDTO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.TransferResponseDTO transfer(co.com.tigo.gatewaytigov19.webscp.ws.TransferRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "transfer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.TransferResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.TransferResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.TransferResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.BalanceToResourceResponseDTO balanceToResource(co.com.tigo.gatewaytigov19.webscp.ws.BalanceToResourceRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "balanceToResource"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.BalanceToResourceResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.BalanceToResourceResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.BalanceToResourceResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ETransferResponseDTO eTransfer(co.com.tigo.gatewaytigov19.webscp.ws.ETransferRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eTransfer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ETransferResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ETransferResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.ETransferResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.SellerDTO[] provideResources(co.com.tigo.gatewaytigov19.webscp.ws.SellerDTO[] arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "provideResources"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.SellerDTO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.SellerDTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.SellerDTO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.SellerDTO[] consultResources() throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "consultResources"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.SellerDTO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.SellerDTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.SellerDTO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.AdviceOfChargeResponseDTO adviceOfCharge(co.com.tigo.gatewaytigov19.webscp.ws.AdviceOfChargeRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "adviceOfCharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.AdviceOfChargeResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.AdviceOfChargeResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.AdviceOfChargeResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.VoucherRechargeResponseDTO voucherRecharge(co.com.tigo.gatewaytigov19.webscp.ws.VoucherRechargeRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "voucherRecharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.VoucherRechargeResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.VoucherRechargeResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.VoucherRechargeResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ReservationResponseDTO reservation(co.com.tigo.gatewaytigov19.webscp.ws.ReservationRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ReservationResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ReservationResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.ReservationResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ReservationCancelResponseDTO reservationCancel(co.com.tigo.gatewaytigov19.webscp.ws.ReservationCancelRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationCancel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ReservationCancelResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ReservationCancelResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.ReservationCancelResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ReservationModifyResponseDTO reservationModify(co.com.tigo.gatewaytigov19.webscp.ws.ReservationModifyRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationModify"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ReservationModifyResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ReservationModifyResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.ReservationModifyResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ReservationQueryResponseDTO reservationQuery(co.com.tigo.gatewaytigov19.webscp.ws.ReservationQueryRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ReservationQueryResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ReservationQueryResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.ReservationQueryResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ReservationUseResponseDTO reservationUse(co.com.tigo.gatewaytigov19.webscp.ws.ReservationUseRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "reservationUse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ReservationUseResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ReservationUseResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.ReservationUseResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ServiceStateQueryResponseDTO serviceStateQuery(co.com.tigo.gatewaytigov19.webscp.ws.ServiceStateQueryRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceStateQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ServiceStateQueryResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ServiceStateQueryResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.ServiceStateQueryResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ServiceQueryResponseDTO serviceQuery(co.com.tigo.gatewaytigov19.webscp.ws.ServiceQueryRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ServiceQueryResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ServiceQueryResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.ServiceQueryResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ServiceChangeResponseDTO serviceChange(co.com.tigo.gatewaytigov19.webscp.ws.ServiceChangeRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "serviceChange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ServiceChangeResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ServiceChangeResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.ServiceChangeResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ERechargeDealerResponseDTO eRechargeDealer(co.com.tigo.gatewaytigov19.webscp.ws.ERechargeDealerRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeDealer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ERechargeDealerResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ERechargeDealerResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.ERechargeDealerResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerResponseDTO eRechargeSeller(co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeSeller"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerReversalResponseDTO eRechargeSellerReversal(co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerReversalRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeSellerReversal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerReversalResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerReversalResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerReversalResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ESellProductSellerResponseDTO eSellProductSeller(co.com.tigo.gatewaytigov19.webscp.ws.ESellProductSellerRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eSellProductSeller"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ESellProductSellerResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ESellProductSellerResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.ESellProductSellerResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.tigo.gatewaytigov19.webscp.ws.ERechargeAdviserResponseDTO eRechargeAdviser(co.com.tigo.gatewaytigov19.webscp.ws.ERechargeAdviserRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.webscp.gatewaytigov19.tigo.com.co/", "eRechargeAdviser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ERechargeAdviserResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.tigo.gatewaytigov19.webscp.ws.ERechargeAdviserResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.tigo.gatewaytigov19.webscp.ws.ERechargeAdviserResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.BusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) {
              throw (co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
