package com.programs.challenges;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CRMOrderBeanOld {

	@JsonProperty("EntityId")
	private String EntityId;
	@JsonProperty("OrderType")
	private String OrderType;
	@JsonProperty("WebOrderNumber")
	private String WebOrderNumber;
	@JsonProperty("ShipToName")
	private String ShipToName;
	@JsonProperty("ShipToStreet1")
	private String ShipToStreet1;
	@JsonProperty("ShipToCityName")
	private String ShipToCityName;
	@JsonProperty("ShipToStateName")
	private String ShipToStateName;
	@JsonProperty("ShipToCountryName")
	private String ShipToCountryName;
	@JsonProperty("ShipToZipCode")
	private int ShipToZipCode;
	@JsonProperty("ShipToPhone")
	private String ShipToPhone;
	@JsonProperty("BillToName")
	private String BillToName;

	@JsonProperty("BillToStreet1")
	private String BillToStreet1;
	@JsonProperty("BillToCityName")
	private String BillToCityName;
	@JsonProperty("BillToStateName")
	private String BillToStateName;
	@JsonProperty("BilToCountryName")
	private String BilToCountryName;
	@JsonProperty("BillToZipCode")
	private int BillToZipCode;
	@JsonProperty("BillToPhone")
	private String BillToPhone;
	@JsonProperty("OrderStatus")
	private String OrderStatus;
	@JsonProperty("Customer")
	private String Customer;
	@JsonProperty("SubTotal")
	private double SubTotal;
	@JsonProperty("TotalInvoiced")
	private double TotalInvoiced;
	@JsonProperty("OrderPlatform")
	private String OrderPlatform;
	@JsonProperty("DiscountAmount")
	private double DiscountAmount;
	@JsonProperty("ExchangePointsDonated")
	private int ExchangePointsDonated;
	@JsonProperty("TaxAmount")
	private double TaxAmount;
	@JsonProperty("OrderShippingCharges")
	private double OrderShippingCharges;
	@JsonProperty("PartPayCharges")
	private double PartPayCharges;
	@JsonProperty("CBCPickUpCharges")
	private double CBCPickUpCharges;
	@JsonProperty("CBCChargePercentage")
	private double CBCChargePercentage;
	@JsonProperty("GrandTotal")
	private double GrandTotal;
	@JsonProperty("OrderPaidValue")
	private double OrderPaidValue;
	@JsonProperty("TotalDue")
	private double TotalDue;
	@JsonProperty("IsVIPOrder")
	private boolean IsVIPOrder;
	@JsonProperty("IsFurnitureExchange")
	private String IsFurnitureExchange;
	@JsonProperty("IsFraudOrder")
	private boolean IsFraudOrder;
	@JsonProperty("GuestCustomer")
	private String GuestCustomer;
	@JsonProperty("Coupon")
	private String Coupon;
	@JsonProperty("CouponRuleName")
	private String CouponRuleName;
	@JsonProperty("OrderDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date OrderDate;
	@JsonProperty("TotalOrderItems")
	private int TotalOrderItems;
	@JsonProperty("TotalRefunded")
	private double TotalRefunded;
	@JsonProperty("CharityAmount")
	private double CharityAmount;
	@JsonProperty("PaymentGateway")
	private String PaymentGateway;
	@JsonProperty("PaymentMethod")
	private String PaymentMethod;
	@JsonProperty("PaymentType")
	private String PaymentType;
	@JsonProperty("OrderConfirmationDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MMM-yyyy HH:mm:ss")
	private Date OrderConfirmationDate;
	@JsonProperty("TransactionID")
	private long TransactionID;
	@JsonProperty("PaymentGatewayResponse")
	private String paymentGatewayResponse;
	@JsonProperty("OrderProduct")
	private List<CRMProductBean> OrderProduct;

	public String getEntityId() {
		return EntityId;
	}

	public void setEntityId(String entityId) {
		EntityId = entityId;
	}

	
	public String getOrderType() {
		return OrderType;
	}

	public void setOrderType(String orderType) {
		OrderType = orderType;
	}

	public String getWebOrderNumber() {
		return WebOrderNumber;
	}

	public void setWebOrderNumber(String webOrderNumber) {
		WebOrderNumber = webOrderNumber;
	}

	public String getShipToName() {
		return ShipToName;
	}

	public void setShipToName(String shipToName) {
		ShipToName = shipToName;
	}

	public String getShipToStreet1() {
		return ShipToStreet1;
	}

	public void setShipToStreet1(String shipToStreet1) {
		ShipToStreet1 = shipToStreet1;
	}

	public String getShipToCityName() {
		return ShipToCityName;
	}

	public void setShipToCityName(String shipToCityName) {
		ShipToCityName = shipToCityName;
	}

	public String getShipToStateName() {
		return ShipToStateName;
	}

	public void setShipToStateName(String shipToStateName) {
		ShipToStateName = shipToStateName;
	}

	public String getShipToCountryName() {
		return ShipToCountryName;
	}

	public void setShipToCountryName(String shipToCountryName) {
		ShipToCountryName = shipToCountryName;
	}

	public int getShipToZipCode() {
		return ShipToZipCode;
	}

	public void setShipToZipCode(int shipToZipCode) {
		ShipToZipCode = shipToZipCode;
	}

	public String getShipToPhone() {
		return ShipToPhone;
	}

	public void setShipToPhone(String shipToPhone) {
		ShipToPhone = shipToPhone;
	}

	public String getBillToName() {
		return BillToName;
	}

	public void setBillToName(String billToName) {
		BillToName = billToName;
	}

	public String getBillToStreet1() {
		return BillToStreet1;
	}

	public void setBillToStreet1(String billToStreet1) {
		BillToStreet1 = billToStreet1;
	}

	public String getBillToCityName() {
		return BillToCityName;
	}

	public void setBillToCityName(String billToCityName) {
		BillToCityName = billToCityName;
	}

	public String getBillToStateName() {
		return BillToStateName;
	}

	public void setBillToStateName(String billToStateName) {
		BillToStateName = billToStateName;
	}

	public String getBilToCountryName() {
		return BilToCountryName;
	}

	public void setBilToCountryName(String bilToCountryName) {
		BilToCountryName = bilToCountryName;
	}

	public int getBillToZipCode() {
		return BillToZipCode;
	}

	public void setBillToZipCode(int billToZipCode) {
		BillToZipCode = billToZipCode;
	}

	public String getBillToPhone() {
		return BillToPhone;
	}

	public void setBillToPhone(String billToPhone) {
		BillToPhone = billToPhone;
	}

	public String getOrderStatus() {
		return OrderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}

	public String getCustomer() {
		return Customer;
	}

	public void setCustomer(String customer) {
		Customer = customer;
	}

	public double getSubTotal() {
		return SubTotal;
	}

	public void setSubTotal(double subTotal) {
		SubTotal = subTotal;
	}

	public double getDiscountAmount() {
		return DiscountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		DiscountAmount = discountAmount;
	}

	public int getExchangePointsDonated() {
		return ExchangePointsDonated;
	}

	public void setExchangePointsDonated(int exchangePointsDonated) {
		ExchangePointsDonated = exchangePointsDonated;
	}

	public double getTaxAmount() {
		return TaxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		TaxAmount = taxAmount;
	}

	public double getOrderShippingCharges() {
		return OrderShippingCharges;
	}

	public void setOrderShippingCharges(double orderShippingCharges) {
		OrderShippingCharges = orderShippingCharges;
	}

	public double getPartPayCharges() {
		return PartPayCharges;
	}

	public void setPartPayCharges(double partPayCharges) {
		PartPayCharges = partPayCharges;
	}

	public double getCBCPickUpCharges() {
		return CBCPickUpCharges;
	}

	public void setCBCPickUpCharges(double cBCPickUpCharges) {
		CBCPickUpCharges = cBCPickUpCharges;
	}

	public double getCBCChargePercentage() {
		return CBCChargePercentage;
	}

	public void setCBCChargePercentage(int cBCChargePercentage) {
		CBCChargePercentage = cBCChargePercentage;
	}

	public double getGrandTotal() {
		return GrandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		GrandTotal = grandTotal;
	}

	public double getOrderPaidValue() {
		return OrderPaidValue;
	}

	public void setOrderPaidValue(double orderPaidValue) {
		OrderPaidValue = orderPaidValue;
	}

	public double getTotalDue() {
		return TotalDue;
	}

	public void setTotalDue(double totalDue) {
		TotalDue = totalDue;
	}

	public boolean isIsVIPOrder() {
		return IsVIPOrder;
	}

	public void setIsVIPOrder(boolean isVIPOrder) {
		IsVIPOrder = isVIPOrder;
	}

	public String getIsFurnitureExchange() {
		return IsFurnitureExchange;
	}

	public void setIsFurnitureExchange(String isFurnitureExchange) {
		IsFurnitureExchange = isFurnitureExchange;
	}

	public boolean isIsFraudOrder() {
		return IsFraudOrder;
	}

	public void setIsFraudOrder(boolean isFraudOrder) {
		IsFraudOrder = isFraudOrder;
	}

	public String getGuestCustomer() {
		return GuestCustomer;
	}

	public void setGuestCustomer(String guestCustomer) {
		GuestCustomer = guestCustomer;
	}

	public String getCoupon() {
		return Coupon;
	}

	public void setCoupon(String coupon) {
		Coupon = coupon;
	}

	public Date getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(Date orderDate) {
		OrderDate = orderDate;
	}

	public int getTotalOrderItems() {
		return TotalOrderItems;
	}

	public void setTotalOrderItems(int totalOrderItems) {
		TotalOrderItems = totalOrderItems;
	}

	public double getTotalInvoiced() {
		return TotalInvoiced;
	}

	public void setTotalInvoiced(double totalInvoiced) {
		TotalInvoiced = totalInvoiced;
	}

	public String getOrderPlatform() {
		return OrderPlatform;
	}

	public void setOrderPlatform(String orderPlatform) {
		OrderPlatform = orderPlatform;
	}

	public String getCouponRuleName() {
		return CouponRuleName;
	}

	public void setCouponRuleName(String couponRuleName) {
		CouponRuleName = couponRuleName;
	}

	public String getPaymentGatewayResponse() {
		return paymentGatewayResponse;
	}

	public void setPaymentGatewayResponse(String paymentGatewayResponse) {
		this.paymentGatewayResponse = paymentGatewayResponse;
	}

	public void setCBCChargePercentage(double cBCChargePercentage) {
		CBCChargePercentage = cBCChargePercentage;
	}

	public void setTotalRefunded(double totalRefunded) {
		TotalRefunded = totalRefunded;
	}

	public double getTotalRefunded() {
		return TotalRefunded;
	}

	public void setTotalRefunded(int totalRefunded) {
		TotalRefunded = totalRefunded;
	}

	public double getCharityAmount() {
		return CharityAmount;
	}

	public void setCharityAmount(double charityAmount) {
		CharityAmount = charityAmount;
	}

	public String getPaymentGateway() {
		return PaymentGateway;
	}

	public void setPaymentGateway(String paymentGateway) {
		PaymentGateway = paymentGateway;
	}

	public String getPaymentMethod() {
		return PaymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}

	public String getPaymentType() {
		return PaymentType;
	}

	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}

	public Date getOrderConfirmationDate() {
		return OrderConfirmationDate;
	}

	public void setOrderConfirmationDate(Date orderConfirmationDate) {
		OrderConfirmationDate = orderConfirmationDate;
	}

	public long getTransactionID() {
		return TransactionID;
	}

	public void setTransactionID(long transactionID) {
		TransactionID = transactionID;
	}

	public List<CRMProductBean> getOrderProduct() {
		return OrderProduct;
	}

	public void setOrderProduct(List<CRMProductBean> orderProduct) {
		OrderProduct = orderProduct;
	}

}
