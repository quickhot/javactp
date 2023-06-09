/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcTraderApi {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTraderApi(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTraderApi obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcTraderApi obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  public static CThostFtdcTraderApi CreateFtdcTraderApi(String pszFlowPath) {
    long cPtr = thosttraderapiJNI.CThostFtdcTraderApi_CreateFtdcTraderApi__SWIG_0(pszFlowPath);
    return (cPtr == 0) ? null : new CThostFtdcTraderApi(cPtr, false);
  }

  public static CThostFtdcTraderApi CreateFtdcTraderApi() {
    long cPtr = thosttraderapiJNI.CThostFtdcTraderApi_CreateFtdcTraderApi__SWIG_1();
    return (cPtr == 0) ? null : new CThostFtdcTraderApi(cPtr, false);
  }

  public static String GetApiVersion() {
    return thosttraderapiJNI.CThostFtdcTraderApi_GetApiVersion();
  }

  public void Release() {
    thosttraderapiJNI.CThostFtdcTraderApi_Release(swigCPtr, this);
  }

  public void Init() {
    thosttraderapiJNI.CThostFtdcTraderApi_Init(swigCPtr, this);
  }

  public int Join() {
    return thosttraderapiJNI.CThostFtdcTraderApi_Join(swigCPtr, this);
  }

  public String GetTradingDay() {
    return thosttraderapiJNI.CThostFtdcTraderApi_GetTradingDay(swigCPtr, this);
  }

  public void RegisterFront(String pszFrontAddress) {
    thosttraderapiJNI.CThostFtdcTraderApi_RegisterFront(swigCPtr, this, pszFrontAddress);
  }

  public void RegisterNameServer(String pszNsAddress) {
    thosttraderapiJNI.CThostFtdcTraderApi_RegisterNameServer(swigCPtr, this, pszNsAddress);
  }

  public void RegisterFensUserInfo(CThostFtdcFensUserInfoField pFensUserInfo) {
    thosttraderapiJNI.CThostFtdcTraderApi_RegisterFensUserInfo(swigCPtr, this, CThostFtdcFensUserInfoField.getCPtr(pFensUserInfo), pFensUserInfo);
  }

  public void RegisterSpi(CThostFtdcTraderSpi pSpi) {
    thosttraderapiJNI.CThostFtdcTraderApi_RegisterSpi(swigCPtr, this, CThostFtdcTraderSpi.getCPtr(pSpi), pSpi);
  }

  public void SubscribePrivateTopic(THOST_TE_RESUME_TYPE nResumeType) {
    thosttraderapiJNI.CThostFtdcTraderApi_SubscribePrivateTopic(swigCPtr, this, nResumeType.swigValue());
  }

  public void SubscribePublicTopic(THOST_TE_RESUME_TYPE nResumeType) {
    thosttraderapiJNI.CThostFtdcTraderApi_SubscribePublicTopic(swigCPtr, this, nResumeType.swigValue());
  }

  public int ReqAuthenticate(CThostFtdcReqAuthenticateField pReqAuthenticateField, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqAuthenticate(swigCPtr, this, CThostFtdcReqAuthenticateField.getCPtr(pReqAuthenticateField), pReqAuthenticateField, nRequestID);
  }

  public int RegisterUserSystemInfo(CThostFtdcUserSystemInfoField pUserSystemInfo) {
    return thosttraderapiJNI.CThostFtdcTraderApi_RegisterUserSystemInfo(swigCPtr, this, CThostFtdcUserSystemInfoField.getCPtr(pUserSystemInfo), pUserSystemInfo);
  }

  public int SubmitUserSystemInfo(CThostFtdcUserSystemInfoField pUserSystemInfo) {
    return thosttraderapiJNI.CThostFtdcTraderApi_SubmitUserSystemInfo(swigCPtr, this, CThostFtdcUserSystemInfoField.getCPtr(pUserSystemInfo), pUserSystemInfo);
  }

  public int ReqUserLogin(CThostFtdcReqUserLoginField pReqUserLoginField, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqUserLogin(swigCPtr, this, CThostFtdcReqUserLoginField.getCPtr(pReqUserLoginField), pReqUserLoginField, nRequestID);
  }

  public int ReqUserLogout(CThostFtdcUserLogoutField pUserLogout, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqUserLogout(swigCPtr, this, CThostFtdcUserLogoutField.getCPtr(pUserLogout), pUserLogout, nRequestID);
  }

  public int ReqUserPasswordUpdate(CThostFtdcUserPasswordUpdateField pUserPasswordUpdate, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqUserPasswordUpdate(swigCPtr, this, CThostFtdcUserPasswordUpdateField.getCPtr(pUserPasswordUpdate), pUserPasswordUpdate, nRequestID);
  }

  public int ReqTradingAccountPasswordUpdate(CThostFtdcTradingAccountPasswordUpdateField pTradingAccountPasswordUpdate, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqTradingAccountPasswordUpdate(swigCPtr, this, CThostFtdcTradingAccountPasswordUpdateField.getCPtr(pTradingAccountPasswordUpdate), pTradingAccountPasswordUpdate, nRequestID);
  }

  public int ReqUserAuthMethod(CThostFtdcReqUserAuthMethodField pReqUserAuthMethod, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqUserAuthMethod(swigCPtr, this, CThostFtdcReqUserAuthMethodField.getCPtr(pReqUserAuthMethod), pReqUserAuthMethod, nRequestID);
  }

  public int ReqGenUserCaptcha(CThostFtdcReqGenUserCaptchaField pReqGenUserCaptcha, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqGenUserCaptcha(swigCPtr, this, CThostFtdcReqGenUserCaptchaField.getCPtr(pReqGenUserCaptcha), pReqGenUserCaptcha, nRequestID);
  }

  public int ReqGenUserText(CThostFtdcReqGenUserTextField pReqGenUserText, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqGenUserText(swigCPtr, this, CThostFtdcReqGenUserTextField.getCPtr(pReqGenUserText), pReqGenUserText, nRequestID);
  }

  public int ReqUserLoginWithCaptcha(CThostFtdcReqUserLoginWithCaptchaField pReqUserLoginWithCaptcha, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqUserLoginWithCaptcha(swigCPtr, this, CThostFtdcReqUserLoginWithCaptchaField.getCPtr(pReqUserLoginWithCaptcha), pReqUserLoginWithCaptcha, nRequestID);
  }

  public int ReqUserLoginWithText(CThostFtdcReqUserLoginWithTextField pReqUserLoginWithText, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqUserLoginWithText(swigCPtr, this, CThostFtdcReqUserLoginWithTextField.getCPtr(pReqUserLoginWithText), pReqUserLoginWithText, nRequestID);
  }

  public int ReqUserLoginWithOTP(CThostFtdcReqUserLoginWithOTPField pReqUserLoginWithOTP, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqUserLoginWithOTP(swigCPtr, this, CThostFtdcReqUserLoginWithOTPField.getCPtr(pReqUserLoginWithOTP), pReqUserLoginWithOTP, nRequestID);
  }

  public int ReqOrderInsert(CThostFtdcInputOrderField pInputOrder, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqOrderInsert(swigCPtr, this, CThostFtdcInputOrderField.getCPtr(pInputOrder), pInputOrder, nRequestID);
  }

  public int ReqParkedOrderInsert(CThostFtdcParkedOrderField pParkedOrder, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqParkedOrderInsert(swigCPtr, this, CThostFtdcParkedOrderField.getCPtr(pParkedOrder), pParkedOrder, nRequestID);
  }

  public int ReqParkedOrderAction(CThostFtdcParkedOrderActionField pParkedOrderAction, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqParkedOrderAction(swigCPtr, this, CThostFtdcParkedOrderActionField.getCPtr(pParkedOrderAction), pParkedOrderAction, nRequestID);
  }

  public int ReqOrderAction(CThostFtdcInputOrderActionField pInputOrderAction, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqOrderAction(swigCPtr, this, CThostFtdcInputOrderActionField.getCPtr(pInputOrderAction), pInputOrderAction, nRequestID);
  }

  public int ReqQryMaxOrderVolume(CThostFtdcQryMaxOrderVolumeField pQryMaxOrderVolume, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryMaxOrderVolume(swigCPtr, this, CThostFtdcQryMaxOrderVolumeField.getCPtr(pQryMaxOrderVolume), pQryMaxOrderVolume, nRequestID);
  }

  public int ReqSettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqSettlementInfoConfirm(swigCPtr, this, CThostFtdcSettlementInfoConfirmField.getCPtr(pSettlementInfoConfirm), pSettlementInfoConfirm, nRequestID);
  }

  public int ReqRemoveParkedOrder(CThostFtdcRemoveParkedOrderField pRemoveParkedOrder, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqRemoveParkedOrder(swigCPtr, this, CThostFtdcRemoveParkedOrderField.getCPtr(pRemoveParkedOrder), pRemoveParkedOrder, nRequestID);
  }

  public int ReqRemoveParkedOrderAction(CThostFtdcRemoveParkedOrderActionField pRemoveParkedOrderAction, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqRemoveParkedOrderAction(swigCPtr, this, CThostFtdcRemoveParkedOrderActionField.getCPtr(pRemoveParkedOrderAction), pRemoveParkedOrderAction, nRequestID);
  }

  public int ReqExecOrderInsert(CThostFtdcInputExecOrderField pInputExecOrder, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqExecOrderInsert(swigCPtr, this, CThostFtdcInputExecOrderField.getCPtr(pInputExecOrder), pInputExecOrder, nRequestID);
  }

  public int ReqExecOrderAction(CThostFtdcInputExecOrderActionField pInputExecOrderAction, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqExecOrderAction(swigCPtr, this, CThostFtdcInputExecOrderActionField.getCPtr(pInputExecOrderAction), pInputExecOrderAction, nRequestID);
  }

  public int ReqForQuoteInsert(CThostFtdcInputForQuoteField pInputForQuote, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqForQuoteInsert(swigCPtr, this, CThostFtdcInputForQuoteField.getCPtr(pInputForQuote), pInputForQuote, nRequestID);
  }

  public int ReqQuoteInsert(CThostFtdcInputQuoteField pInputQuote, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQuoteInsert(swigCPtr, this, CThostFtdcInputQuoteField.getCPtr(pInputQuote), pInputQuote, nRequestID);
  }

  public int ReqQuoteAction(CThostFtdcInputQuoteActionField pInputQuoteAction, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQuoteAction(swigCPtr, this, CThostFtdcInputQuoteActionField.getCPtr(pInputQuoteAction), pInputQuoteAction, nRequestID);
  }

  public int ReqBatchOrderAction(CThostFtdcInputBatchOrderActionField pInputBatchOrderAction, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqBatchOrderAction(swigCPtr, this, CThostFtdcInputBatchOrderActionField.getCPtr(pInputBatchOrderAction), pInputBatchOrderAction, nRequestID);
  }

  public int ReqOptionSelfCloseInsert(CThostFtdcInputOptionSelfCloseField pInputOptionSelfClose, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqOptionSelfCloseInsert(swigCPtr, this, CThostFtdcInputOptionSelfCloseField.getCPtr(pInputOptionSelfClose), pInputOptionSelfClose, nRequestID);
  }

  public int ReqOptionSelfCloseAction(CThostFtdcInputOptionSelfCloseActionField pInputOptionSelfCloseAction, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqOptionSelfCloseAction(swigCPtr, this, CThostFtdcInputOptionSelfCloseActionField.getCPtr(pInputOptionSelfCloseAction), pInputOptionSelfCloseAction, nRequestID);
  }

  public int ReqCombActionInsert(CThostFtdcInputCombActionField pInputCombAction, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqCombActionInsert(swigCPtr, this, CThostFtdcInputCombActionField.getCPtr(pInputCombAction), pInputCombAction, nRequestID);
  }

  public int ReqQryOrder(CThostFtdcQryOrderField pQryOrder, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryOrder(swigCPtr, this, CThostFtdcQryOrderField.getCPtr(pQryOrder), pQryOrder, nRequestID);
  }

  public int ReqQryTrade(CThostFtdcQryTradeField pQryTrade, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryTrade(swigCPtr, this, CThostFtdcQryTradeField.getCPtr(pQryTrade), pQryTrade, nRequestID);
  }

  public int ReqQryInvestorPosition(CThostFtdcQryInvestorPositionField pQryInvestorPosition, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryInvestorPosition(swigCPtr, this, CThostFtdcQryInvestorPositionField.getCPtr(pQryInvestorPosition), pQryInvestorPosition, nRequestID);
  }

  public int ReqQryTradingAccount(CThostFtdcQryTradingAccountField pQryTradingAccount, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryTradingAccount(swigCPtr, this, CThostFtdcQryTradingAccountField.getCPtr(pQryTradingAccount), pQryTradingAccount, nRequestID);
  }

  public int ReqQryInvestor(CThostFtdcQryInvestorField pQryInvestor, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryInvestor(swigCPtr, this, CThostFtdcQryInvestorField.getCPtr(pQryInvestor), pQryInvestor, nRequestID);
  }

  public int ReqQryTradingCode(CThostFtdcQryTradingCodeField pQryTradingCode, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryTradingCode(swigCPtr, this, CThostFtdcQryTradingCodeField.getCPtr(pQryTradingCode), pQryTradingCode, nRequestID);
  }

  public int ReqQryInstrumentMarginRate(CThostFtdcQryInstrumentMarginRateField pQryInstrumentMarginRate, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryInstrumentMarginRate(swigCPtr, this, CThostFtdcQryInstrumentMarginRateField.getCPtr(pQryInstrumentMarginRate), pQryInstrumentMarginRate, nRequestID);
  }

  public int ReqQryInstrumentCommissionRate(CThostFtdcQryInstrumentCommissionRateField pQryInstrumentCommissionRate, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryInstrumentCommissionRate(swigCPtr, this, CThostFtdcQryInstrumentCommissionRateField.getCPtr(pQryInstrumentCommissionRate), pQryInstrumentCommissionRate, nRequestID);
  }

  public int ReqQryExchange(CThostFtdcQryExchangeField pQryExchange, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryExchange(swigCPtr, this, CThostFtdcQryExchangeField.getCPtr(pQryExchange), pQryExchange, nRequestID);
  }

  public int ReqQryProduct(CThostFtdcQryProductField pQryProduct, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryProduct(swigCPtr, this, CThostFtdcQryProductField.getCPtr(pQryProduct), pQryProduct, nRequestID);
  }

  public int ReqQryInstrument(CThostFtdcQryInstrumentField pQryInstrument, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryInstrument(swigCPtr, this, CThostFtdcQryInstrumentField.getCPtr(pQryInstrument), pQryInstrument, nRequestID);
  }

  public int ReqQryDepthMarketData(CThostFtdcQryDepthMarketDataField pQryDepthMarketData, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryDepthMarketData(swigCPtr, this, CThostFtdcQryDepthMarketDataField.getCPtr(pQryDepthMarketData), pQryDepthMarketData, nRequestID);
  }

  public int ReqQryTraderOffer(CThostFtdcQryTraderOfferField pQryTraderOffer, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryTraderOffer(swigCPtr, this, CThostFtdcQryTraderOfferField.getCPtr(pQryTraderOffer), pQryTraderOffer, nRequestID);
  }

  public int ReqQrySettlementInfo(CThostFtdcQrySettlementInfoField pQrySettlementInfo, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQrySettlementInfo(swigCPtr, this, CThostFtdcQrySettlementInfoField.getCPtr(pQrySettlementInfo), pQrySettlementInfo, nRequestID);
  }

  public int ReqQryTransferBank(CThostFtdcQryTransferBankField pQryTransferBank, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryTransferBank(swigCPtr, this, CThostFtdcQryTransferBankField.getCPtr(pQryTransferBank), pQryTransferBank, nRequestID);
  }

  public int ReqQryInvestorPositionDetail(CThostFtdcQryInvestorPositionDetailField pQryInvestorPositionDetail, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryInvestorPositionDetail(swigCPtr, this, CThostFtdcQryInvestorPositionDetailField.getCPtr(pQryInvestorPositionDetail), pQryInvestorPositionDetail, nRequestID);
  }

  public int ReqQryNotice(CThostFtdcQryNoticeField pQryNotice, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryNotice(swigCPtr, this, CThostFtdcQryNoticeField.getCPtr(pQryNotice), pQryNotice, nRequestID);
  }

  public int ReqQrySettlementInfoConfirm(CThostFtdcQrySettlementInfoConfirmField pQrySettlementInfoConfirm, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQrySettlementInfoConfirm(swigCPtr, this, CThostFtdcQrySettlementInfoConfirmField.getCPtr(pQrySettlementInfoConfirm), pQrySettlementInfoConfirm, nRequestID);
  }

  public int ReqQryInvestorPositionCombineDetail(CThostFtdcQryInvestorPositionCombineDetailField pQryInvestorPositionCombineDetail, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryInvestorPositionCombineDetail(swigCPtr, this, CThostFtdcQryInvestorPositionCombineDetailField.getCPtr(pQryInvestorPositionCombineDetail), pQryInvestorPositionCombineDetail, nRequestID);
  }

  public int ReqQryCFMMCTradingAccountKey(CThostFtdcQryCFMMCTradingAccountKeyField pQryCFMMCTradingAccountKey, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryCFMMCTradingAccountKey(swigCPtr, this, CThostFtdcQryCFMMCTradingAccountKeyField.getCPtr(pQryCFMMCTradingAccountKey), pQryCFMMCTradingAccountKey, nRequestID);
  }

  public int ReqQryEWarrantOffset(CThostFtdcQryEWarrantOffsetField pQryEWarrantOffset, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryEWarrantOffset(swigCPtr, this, CThostFtdcQryEWarrantOffsetField.getCPtr(pQryEWarrantOffset), pQryEWarrantOffset, nRequestID);
  }

  public int ReqQryInvestorProductGroupMargin(CThostFtdcQryInvestorProductGroupMarginField pQryInvestorProductGroupMargin, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryInvestorProductGroupMargin(swigCPtr, this, CThostFtdcQryInvestorProductGroupMarginField.getCPtr(pQryInvestorProductGroupMargin), pQryInvestorProductGroupMargin, nRequestID);
  }

  public int ReqQryExchangeMarginRate(CThostFtdcQryExchangeMarginRateField pQryExchangeMarginRate, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryExchangeMarginRate(swigCPtr, this, CThostFtdcQryExchangeMarginRateField.getCPtr(pQryExchangeMarginRate), pQryExchangeMarginRate, nRequestID);
  }

  public int ReqQryExchangeMarginRateAdjust(CThostFtdcQryExchangeMarginRateAdjustField pQryExchangeMarginRateAdjust, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryExchangeMarginRateAdjust(swigCPtr, this, CThostFtdcQryExchangeMarginRateAdjustField.getCPtr(pQryExchangeMarginRateAdjust), pQryExchangeMarginRateAdjust, nRequestID);
  }

  public int ReqQryExchangeRate(CThostFtdcQryExchangeRateField pQryExchangeRate, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryExchangeRate(swigCPtr, this, CThostFtdcQryExchangeRateField.getCPtr(pQryExchangeRate), pQryExchangeRate, nRequestID);
  }

  public int ReqQrySecAgentACIDMap(CThostFtdcQrySecAgentACIDMapField pQrySecAgentACIDMap, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQrySecAgentACIDMap(swigCPtr, this, CThostFtdcQrySecAgentACIDMapField.getCPtr(pQrySecAgentACIDMap), pQrySecAgentACIDMap, nRequestID);
  }

  public int ReqQryProductExchRate(CThostFtdcQryProductExchRateField pQryProductExchRate, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryProductExchRate(swigCPtr, this, CThostFtdcQryProductExchRateField.getCPtr(pQryProductExchRate), pQryProductExchRate, nRequestID);
  }

  public int ReqQryProductGroup(CThostFtdcQryProductGroupField pQryProductGroup, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryProductGroup(swigCPtr, this, CThostFtdcQryProductGroupField.getCPtr(pQryProductGroup), pQryProductGroup, nRequestID);
  }

  public int ReqQryMMInstrumentCommissionRate(CThostFtdcQryMMInstrumentCommissionRateField pQryMMInstrumentCommissionRate, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryMMInstrumentCommissionRate(swigCPtr, this, CThostFtdcQryMMInstrumentCommissionRateField.getCPtr(pQryMMInstrumentCommissionRate), pQryMMInstrumentCommissionRate, nRequestID);
  }

  public int ReqQryMMOptionInstrCommRate(CThostFtdcQryMMOptionInstrCommRateField pQryMMOptionInstrCommRate, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryMMOptionInstrCommRate(swigCPtr, this, CThostFtdcQryMMOptionInstrCommRateField.getCPtr(pQryMMOptionInstrCommRate), pQryMMOptionInstrCommRate, nRequestID);
  }

  public int ReqQryInstrumentOrderCommRate(CThostFtdcQryInstrumentOrderCommRateField pQryInstrumentOrderCommRate, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryInstrumentOrderCommRate(swigCPtr, this, CThostFtdcQryInstrumentOrderCommRateField.getCPtr(pQryInstrumentOrderCommRate), pQryInstrumentOrderCommRate, nRequestID);
  }

  public int ReqQrySecAgentTradingAccount(CThostFtdcQryTradingAccountField pQryTradingAccount, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQrySecAgentTradingAccount(swigCPtr, this, CThostFtdcQryTradingAccountField.getCPtr(pQryTradingAccount), pQryTradingAccount, nRequestID);
  }

  public int ReqQrySecAgentCheckMode(CThostFtdcQrySecAgentCheckModeField pQrySecAgentCheckMode, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQrySecAgentCheckMode(swigCPtr, this, CThostFtdcQrySecAgentCheckModeField.getCPtr(pQrySecAgentCheckMode), pQrySecAgentCheckMode, nRequestID);
  }

  public int ReqQrySecAgentTradeInfo(CThostFtdcQrySecAgentTradeInfoField pQrySecAgentTradeInfo, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQrySecAgentTradeInfo(swigCPtr, this, CThostFtdcQrySecAgentTradeInfoField.getCPtr(pQrySecAgentTradeInfo), pQrySecAgentTradeInfo, nRequestID);
  }

  public int ReqQryOptionInstrTradeCost(CThostFtdcQryOptionInstrTradeCostField pQryOptionInstrTradeCost, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryOptionInstrTradeCost(swigCPtr, this, CThostFtdcQryOptionInstrTradeCostField.getCPtr(pQryOptionInstrTradeCost), pQryOptionInstrTradeCost, nRequestID);
  }

  public int ReqQryOptionInstrCommRate(CThostFtdcQryOptionInstrCommRateField pQryOptionInstrCommRate, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryOptionInstrCommRate(swigCPtr, this, CThostFtdcQryOptionInstrCommRateField.getCPtr(pQryOptionInstrCommRate), pQryOptionInstrCommRate, nRequestID);
  }

  public int ReqQryExecOrder(CThostFtdcQryExecOrderField pQryExecOrder, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryExecOrder(swigCPtr, this, CThostFtdcQryExecOrderField.getCPtr(pQryExecOrder), pQryExecOrder, nRequestID);
  }

  public int ReqQryForQuote(CThostFtdcQryForQuoteField pQryForQuote, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryForQuote(swigCPtr, this, CThostFtdcQryForQuoteField.getCPtr(pQryForQuote), pQryForQuote, nRequestID);
  }

  public int ReqQryQuote(CThostFtdcQryQuoteField pQryQuote, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryQuote(swigCPtr, this, CThostFtdcQryQuoteField.getCPtr(pQryQuote), pQryQuote, nRequestID);
  }

  public int ReqQryOptionSelfClose(CThostFtdcQryOptionSelfCloseField pQryOptionSelfClose, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryOptionSelfClose(swigCPtr, this, CThostFtdcQryOptionSelfCloseField.getCPtr(pQryOptionSelfClose), pQryOptionSelfClose, nRequestID);
  }

  public int ReqQryInvestUnit(CThostFtdcQryInvestUnitField pQryInvestUnit, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryInvestUnit(swigCPtr, this, CThostFtdcQryInvestUnitField.getCPtr(pQryInvestUnit), pQryInvestUnit, nRequestID);
  }

  public int ReqQryCombInstrumentGuard(CThostFtdcQryCombInstrumentGuardField pQryCombInstrumentGuard, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryCombInstrumentGuard(swigCPtr, this, CThostFtdcQryCombInstrumentGuardField.getCPtr(pQryCombInstrumentGuard), pQryCombInstrumentGuard, nRequestID);
  }

  public int ReqQryCombAction(CThostFtdcQryCombActionField pQryCombAction, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryCombAction(swigCPtr, this, CThostFtdcQryCombActionField.getCPtr(pQryCombAction), pQryCombAction, nRequestID);
  }

  public int ReqQryTransferSerial(CThostFtdcQryTransferSerialField pQryTransferSerial, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryTransferSerial(swigCPtr, this, CThostFtdcQryTransferSerialField.getCPtr(pQryTransferSerial), pQryTransferSerial, nRequestID);
  }

  public int ReqQryAccountregister(CThostFtdcQryAccountregisterField pQryAccountregister, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryAccountregister(swigCPtr, this, CThostFtdcQryAccountregisterField.getCPtr(pQryAccountregister), pQryAccountregister, nRequestID);
  }

  public int ReqQryContractBank(CThostFtdcQryContractBankField pQryContractBank, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryContractBank(swigCPtr, this, CThostFtdcQryContractBankField.getCPtr(pQryContractBank), pQryContractBank, nRequestID);
  }

  public int ReqQryParkedOrder(CThostFtdcQryParkedOrderField pQryParkedOrder, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryParkedOrder(swigCPtr, this, CThostFtdcQryParkedOrderField.getCPtr(pQryParkedOrder), pQryParkedOrder, nRequestID);
  }

  public int ReqQryParkedOrderAction(CThostFtdcQryParkedOrderActionField pQryParkedOrderAction, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryParkedOrderAction(swigCPtr, this, CThostFtdcQryParkedOrderActionField.getCPtr(pQryParkedOrderAction), pQryParkedOrderAction, nRequestID);
  }

  public int ReqQryTradingNotice(CThostFtdcQryTradingNoticeField pQryTradingNotice, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryTradingNotice(swigCPtr, this, CThostFtdcQryTradingNoticeField.getCPtr(pQryTradingNotice), pQryTradingNotice, nRequestID);
  }

  public int ReqQryBrokerTradingParams(CThostFtdcQryBrokerTradingParamsField pQryBrokerTradingParams, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryBrokerTradingParams(swigCPtr, this, CThostFtdcQryBrokerTradingParamsField.getCPtr(pQryBrokerTradingParams), pQryBrokerTradingParams, nRequestID);
  }

  public int ReqQryBrokerTradingAlgos(CThostFtdcQryBrokerTradingAlgosField pQryBrokerTradingAlgos, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryBrokerTradingAlgos(swigCPtr, this, CThostFtdcQryBrokerTradingAlgosField.getCPtr(pQryBrokerTradingAlgos), pQryBrokerTradingAlgos, nRequestID);
  }

  public int ReqQueryCFMMCTradingAccountToken(CThostFtdcQueryCFMMCTradingAccountTokenField pQueryCFMMCTradingAccountToken, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQueryCFMMCTradingAccountToken(swigCPtr, this, CThostFtdcQueryCFMMCTradingAccountTokenField.getCPtr(pQueryCFMMCTradingAccountToken), pQueryCFMMCTradingAccountToken, nRequestID);
  }

  public int ReqFromBankToFutureByFuture(CThostFtdcReqTransferField pReqTransfer, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqFromBankToFutureByFuture(swigCPtr, this, CThostFtdcReqTransferField.getCPtr(pReqTransfer), pReqTransfer, nRequestID);
  }

  public int ReqFromFutureToBankByFuture(CThostFtdcReqTransferField pReqTransfer, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqFromFutureToBankByFuture(swigCPtr, this, CThostFtdcReqTransferField.getCPtr(pReqTransfer), pReqTransfer, nRequestID);
  }

  public int ReqQueryBankAccountMoneyByFuture(CThostFtdcReqQueryAccountField pReqQueryAccount, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQueryBankAccountMoneyByFuture(swigCPtr, this, CThostFtdcReqQueryAccountField.getCPtr(pReqQueryAccount), pReqQueryAccount, nRequestID);
  }

  public int ReqQryClassifiedInstrument(CThostFtdcQryClassifiedInstrumentField pQryClassifiedInstrument, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryClassifiedInstrument(swigCPtr, this, CThostFtdcQryClassifiedInstrumentField.getCPtr(pQryClassifiedInstrument), pQryClassifiedInstrument, nRequestID);
  }

  public int ReqQryCombPromotionParam(CThostFtdcQryCombPromotionParamField pQryCombPromotionParam, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryCombPromotionParam(swigCPtr, this, CThostFtdcQryCombPromotionParamField.getCPtr(pQryCombPromotionParam), pQryCombPromotionParam, nRequestID);
  }

  public int ReqQryRiskSettleInvstPosition(CThostFtdcQryRiskSettleInvstPositionField pQryRiskSettleInvstPosition, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryRiskSettleInvstPosition(swigCPtr, this, CThostFtdcQryRiskSettleInvstPositionField.getCPtr(pQryRiskSettleInvstPosition), pQryRiskSettleInvstPosition, nRequestID);
  }

  public int ReqQryRiskSettleProductStatus(CThostFtdcQryRiskSettleProductStatusField pQryRiskSettleProductStatus, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryRiskSettleProductStatus(swigCPtr, this, CThostFtdcQryRiskSettleProductStatusField.getCPtr(pQryRiskSettleProductStatus), pQryRiskSettleProductStatus, nRequestID);
  }

  public int ReqQrySPBMFutureParameter(CThostFtdcQrySPBMFutureParameterField pQrySPBMFutureParameter, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQrySPBMFutureParameter(swigCPtr, this, CThostFtdcQrySPBMFutureParameterField.getCPtr(pQrySPBMFutureParameter), pQrySPBMFutureParameter, nRequestID);
  }

  public int ReqQrySPBMOptionParameter(CThostFtdcQrySPBMOptionParameterField pQrySPBMOptionParameter, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQrySPBMOptionParameter(swigCPtr, this, CThostFtdcQrySPBMOptionParameterField.getCPtr(pQrySPBMOptionParameter), pQrySPBMOptionParameter, nRequestID);
  }

  public int ReqQrySPBMIntraParameter(CThostFtdcQrySPBMIntraParameterField pQrySPBMIntraParameter, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQrySPBMIntraParameter(swigCPtr, this, CThostFtdcQrySPBMIntraParameterField.getCPtr(pQrySPBMIntraParameter), pQrySPBMIntraParameter, nRequestID);
  }

  public int ReqQrySPBMInterParameter(CThostFtdcQrySPBMInterParameterField pQrySPBMInterParameter, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQrySPBMInterParameter(swigCPtr, this, CThostFtdcQrySPBMInterParameterField.getCPtr(pQrySPBMInterParameter), pQrySPBMInterParameter, nRequestID);
  }

  public int ReqQrySPBMPortfDefinition(CThostFtdcQrySPBMPortfDefinitionField pQrySPBMPortfDefinition, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQrySPBMPortfDefinition(swigCPtr, this, CThostFtdcQrySPBMPortfDefinitionField.getCPtr(pQrySPBMPortfDefinition), pQrySPBMPortfDefinition, nRequestID);
  }

  public int ReqQrySPBMInvestorPortfDef(CThostFtdcQrySPBMInvestorPortfDefField pQrySPBMInvestorPortfDef, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQrySPBMInvestorPortfDef(swigCPtr, this, CThostFtdcQrySPBMInvestorPortfDefField.getCPtr(pQrySPBMInvestorPortfDef), pQrySPBMInvestorPortfDef, nRequestID);
  }

  public int ReqQryInvestorPortfMarginRatio(CThostFtdcQryInvestorPortfMarginRatioField pQryInvestorPortfMarginRatio, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryInvestorPortfMarginRatio(swigCPtr, this, CThostFtdcQryInvestorPortfMarginRatioField.getCPtr(pQryInvestorPortfMarginRatio), pQryInvestorPortfMarginRatio, nRequestID);
  }

  public int ReqQryInvestorProdSPBMDetail(CThostFtdcQryInvestorProdSPBMDetailField pQryInvestorProdSPBMDetail, int nRequestID) {
    return thosttraderapiJNI.CThostFtdcTraderApi_ReqQryInvestorProdSPBMDetail(swigCPtr, this, CThostFtdcQryInvestorProdSPBMDetailField.getCPtr(pQryInvestorProdSPBMDetail), pQryInvestorProdSPBMDetail, nRequestID);
  }

}
