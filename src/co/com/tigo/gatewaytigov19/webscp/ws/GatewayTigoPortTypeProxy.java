package co.com.tigo.gatewaytigov19.webscp.ws;

public class GatewayTigoPortTypeProxy implements co.com.tigo.gatewaytigov19.webscp.ws.GatewayTigoPortType {
  private String _endpoint = null;
  private co.com.tigo.gatewaytigov19.webscp.ws.GatewayTigoPortType gatewayTigoPortType = null;
  
  public GatewayTigoPortTypeProxy() {
    _initGatewayTigoPortTypeProxy();
  }
  
  public GatewayTigoPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initGatewayTigoPortTypeProxy();
  }
  
  private void _initGatewayTigoPortTypeProxy() {
    try {
      gatewayTigoPortType = (new co.com.tigo.gatewaytigov19.webscp.ws.GatewayTigoScpWSLocator()).getGatewayTigoPortTypePort();
      if (gatewayTigoPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)gatewayTigoPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)gatewayTigoPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (gatewayTigoPortType != null)
      ((javax.xml.rpc.Stub)gatewayTigoPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.GatewayTigoPortType getGatewayTigoPortType() {
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType;
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.CreditResponseDTO credit(co.com.tigo.gatewaytigov19.webscp.ws.CreditRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.credit(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.BalanceResponseDTO eBalance(java.lang.String arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.eBalance(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.BalanceResponseDTO balance(co.com.tigo.gatewaytigov19.webscp.ws.BalanceRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.balance(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.EventResponseDTO applicationEvent(co.com.tigo.gatewaytigov19.webscp.ws.EventRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.applicationEvent(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.EventResponseDTO eventAuthorization(co.com.tigo.gatewaytigov19.webscp.ws.EventRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.eventAuthorization(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.DebitResponseDTO debit(co.com.tigo.gatewaytigov19.webscp.ws.DebitRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.debit(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.RechargeResponseDTO recharge(co.com.tigo.gatewaytigov19.webscp.ws.RechargeRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.recharge(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.RechargeRevResponseDTO rechargeReversal(co.com.tigo.gatewaytigov19.webscp.ws.RechargeRevRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.rechargeReversal(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.ERechargeResponseDTO eRecharge(co.com.tigo.gatewaytigov19.webscp.ws.ERechargeRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.eRecharge(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.ERechargeRevResponseDTO eRechargeReversal(co.com.tigo.gatewaytigov19.webscp.ws.ERechargeRevRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.eRechargeReversal(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[] provideBonus(co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[] arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.provideBonus(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[] provideUsers(co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[] arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.provideUsers(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.PropertyDTO[] provideProperties(co.com.tigo.gatewaytigov19.webscp.ws.PropertyDTO[] arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.provideProperties(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[] consultBonus(co.com.tigo.gatewaytigov19.webscp.ws.PromotionDTO[] arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.consultBonus(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[] consultUsers() throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.consultUsers();
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.UserPromotionDTO[] consultEUsersPromotions() throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.consultEUsersPromotions();
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.PropertyDTO[] consultProperties() throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.consultProperties();
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.TransferResponseDTO transfer(co.com.tigo.gatewaytigov19.webscp.ws.TransferRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.transfer(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.BalanceToResourceResponseDTO balanceToResource(co.com.tigo.gatewaytigov19.webscp.ws.BalanceToResourceRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.balanceToResource(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.ETransferResponseDTO eTransfer(co.com.tigo.gatewaytigov19.webscp.ws.ETransferRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.eTransfer(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.SellerDTO[] provideResources(co.com.tigo.gatewaytigov19.webscp.ws.SellerDTO[] arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.provideResources(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.SellerDTO[] consultResources() throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.consultResources();
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.AdviceOfChargeResponseDTO adviceOfCharge(co.com.tigo.gatewaytigov19.webscp.ws.AdviceOfChargeRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.adviceOfCharge(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.VoucherRechargeResponseDTO voucherRecharge(co.com.tigo.gatewaytigov19.webscp.ws.VoucherRechargeRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.voucherRecharge(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.ReservationResponseDTO reservation(co.com.tigo.gatewaytigov19.webscp.ws.ReservationRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.reservation(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.ReservationCancelResponseDTO reservationCancel(co.com.tigo.gatewaytigov19.webscp.ws.ReservationCancelRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.reservationCancel(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.ReservationModifyResponseDTO reservationModify(co.com.tigo.gatewaytigov19.webscp.ws.ReservationModifyRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.reservationModify(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.ReservationQueryResponseDTO reservationQuery(co.com.tigo.gatewaytigov19.webscp.ws.ReservationQueryRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.reservationQuery(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.ReservationUseResponseDTO reservationUse(co.com.tigo.gatewaytigov19.webscp.ws.ReservationUseRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.reservationUse(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.ServiceStateQueryResponseDTO serviceStateQuery(co.com.tigo.gatewaytigov19.webscp.ws.ServiceStateQueryRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.serviceStateQuery(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.ServiceQueryResponseDTO serviceQuery(co.com.tigo.gatewaytigov19.webscp.ws.ServiceQueryRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.serviceQuery(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.ServiceChangeResponseDTO serviceChange(co.com.tigo.gatewaytigov19.webscp.ws.ServiceChangeRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.serviceChange(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.ERechargeDealerResponseDTO eRechargeDealer(co.com.tigo.gatewaytigov19.webscp.ws.ERechargeDealerRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.eRechargeDealer(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerResponseDTO eRechargeSeller(co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.eRechargeSeller(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerReversalResponseDTO eRechargeSellerReversal(co.com.tigo.gatewaytigov19.webscp.ws.ERechargeSellerReversalRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.eRechargeSellerReversal(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.ESellProductSellerResponseDTO eSellProductSeller(co.com.tigo.gatewaytigov19.webscp.ws.ESellProductSellerRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.eSellProductSeller(arg0);
  }
  
  public co.com.tigo.gatewaytigov19.webscp.ws.ERechargeAdviserResponseDTO eRechargeAdviser(co.com.tigo.gatewaytigov19.webscp.ws.ERechargeAdviserRequestDTO arg0) throws java.rmi.RemoteException, co.com.tigo.gatewaytigov19.webscp.ws.BusinessException, co.com.tigo.gatewaytigov19.webscp.ws.GatewayPrepayWSException{
    if (gatewayTigoPortType == null)
      _initGatewayTigoPortTypeProxy();
    return gatewayTigoPortType.eRechargeAdviser(arg0);
  }
  
  
}