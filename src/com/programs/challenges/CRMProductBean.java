package com.programs.challenges;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CRMProductBean {

	@JsonProperty("WebOrderNumber")
	private String WebOrderNumber;
	@JsonProperty("ItemLineNumber")
	private int ItemLineNumber;
	@JsonProperty("QuantityShipped")
	private int QuantityShipped;
	@JsonProperty("QuantityInvoiced")
	private int QuantityInvoiced;
	@JsonProperty("QuantityCancelled")
	private int QuantityCancelled;
	@JsonProperty("ItemAdditionalDetails")
	private String ItemAdditionalDetails;	
	@JsonProperty("ProductImage1")
	private String ProductImage1;	
	@JsonProperty("SKUCode")
	private String SKUCode;
	@JsonProperty("ProductURL")
	private String ProductURL;
	@JsonProperty("OIDSKUID")
	private String OIDSKUID;
	@JsonProperty("ProductId")
	private String ProductId;
	@JsonProperty("ProductName")
	private String ProductName;
	@JsonProperty("ProductDescription")
	private String ProductDescription;
	@JsonProperty("Quantity")
	private int Quantity;
	@JsonProperty("QuantityRefunded")
	private int QuantityRefunded;
	@JsonProperty("SellingPricePricePerUnit")
	private double SellingPricePricePerUnit;
	@JsonProperty("SubTotal")
	private double SubTotal;
	@JsonProperty("DiscountValue")
	private double DiscountValue;
	@JsonProperty("GrandTotal")
	private double GrandTotal;
	@JsonProperty("Tax")
	private double Tax;
	@JsonProperty("ProductShippingCharges")
	private double ProductShippingCharges;
	@JsonProperty("PartPayCharges")
	private double PartPayCharges;
	@JsonProperty("CBCCommissionCharge")
	private double CBCCommissionCharge;
	@JsonProperty("OrderProductPaidValue")
	private double OrderProductPaidValue;
	@JsonProperty("TotalDue")
	private double TotalDue;
	@JsonProperty("TotalRefunded")
	private double TotalRefunded;
	@JsonProperty("OrderProductStatusERP")
	private String OrderProductStatusERP;
	@JsonProperty("TimeToShip")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MMM-yyyy")
	private Date TimeToShip;
	@JsonProperty("TimeToDeliver")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MMM-yyyy")
	private Date TimeToDeliver;
	@JsonProperty("SupplierID")
	private int SupplierID;
	@JsonProperty("UpstreamSellerID")
	private int UpstreamSellerID;
	@JsonProperty("AssemblyAttribute")
	private String AssemblyAttribute;
	@JsonProperty("AWB")
	private String AWB;
	@JsonProperty("LogisticsPartnerName")
	private String LogisticsPartnerName;
	@JsonProperty("ShippingDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MMM-yyyy")
	private Date ShippingDate;
	@JsonProperty("DeliveryDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MMM-yyyy")
	private Date DeliveryDate;
	@JsonProperty("ModeOfShipping")
	private String ModeOfShipping;
	@JsonProperty("WHName")
	private String WHName;
	@JsonProperty("CBCCommissionChargeRefunded")
	private int CBCCommissionChargeRefunded;
	@JsonProperty("ExchangePointsRefunded")
	private String ExchangePointsRefunded;
	@JsonProperty("ItemCategory")
	private String ItemCategory;
	@JsonProperty("SKUCategory")
	private String SKUCategory;
	@JsonProperty("CustomerName")
	private String CustomerName;
	@JsonProperty("PaymentGateway")
	private String PaymentGateway;
	@JsonProperty("PaymentMethod")
	private String PaymentMethod;
	@JsonProperty("PaymentType")
	private String PaymentType;
	
	public String getWebOrderNumber() {
		return WebOrderNumber;
	}

	public void setWebOrderNumber(String webOrderNumber) {
		WebOrderNumber = webOrderNumber;
	}

	public int getItemLineNumber() {
		return ItemLineNumber;
	}

	public void setItemLineNumber(int itemLineNumber) {
		ItemLineNumber = itemLineNumber;
	}

	public String getProductImage1() {
		return ProductImage1;
	}

	public void setProductImage1(String productImage1) {
		ProductImage1 = productImage1;
	}

	public String getSKUCode() {
		return SKUCode;
	}

	public void setSKUCode(String sKUCode) {
		SKUCode = sKUCode;
	}

	public String getOIDSKUID() {
		return OIDSKUID;
	}

	public void setOIDSKUID(String oIDSKUID) {
		OIDSKUID = oIDSKUID;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductDescription() {
		return ProductDescription;
	}

	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public int getQuantityRefunded() {
		return QuantityRefunded;
	}

	public void setQuantityRefunded(int quantityRefunded) {
		QuantityRefunded = quantityRefunded;
	}

	public double getSellingPricePricePerUnit() {
		return SellingPricePricePerUnit;
	}

	public void setSellingPricePricePerUnit(int sellingPricePricePerUnit) {
		SellingPricePricePerUnit = sellingPricePricePerUnit;
	}

	public double getSubTotal() {
		return SubTotal;
	}

	public void setSubTotal(double subTotal) {
		SubTotal = subTotal;
	}

	public double getDiscountValue() {
		return DiscountValue;
	}

	public void setDiscountValue(double discountValue) {
		DiscountValue = discountValue;
	}

	public double getGrandTotal() {
		return GrandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		GrandTotal = grandTotal;
	}

	public double getTax() {
		return Tax;
	}

	public void setTax(int tax) {
		Tax = tax;
	}

	public double getProductShippingCharges() {
		return ProductShippingCharges;
	}

	public void setProductShippingCharges(int productShippingCharges) {
		ProductShippingCharges = productShippingCharges;
	}

	public double getPartPayCharges() {
		return PartPayCharges;
	}

	public void setPartPayCharges(int partPayCharges) {
		PartPayCharges = partPayCharges;
	}

	public double getCBCCommissionCharge() {
		return CBCCommissionCharge;
	}

	public void setCBCCommissionCharge(int cBCCommissionCharge) {
		CBCCommissionCharge = cBCCommissionCharge;
	}

	public double getOrderProductPaidValue() {
		return OrderProductPaidValue;
	}

	public void setOrderProductPaidValue(int orderProductPaidValue) {
		OrderProductPaidValue = orderProductPaidValue;
	}

	public double getTotalDue() {
		return TotalDue;
	}

	public void setTotalDue(int totalDue) {
		TotalDue = totalDue;
	}

	public double getTotalRefunded() {
		return TotalRefunded;
	}

	public void setTotalRefunded(int totalRefunded) {
		TotalRefunded = totalRefunded;
	}

	public String getOrderProductStatusERP() {
		return OrderProductStatusERP;
	}

	public void setOrderProductStatusERP(String orderProductStatusERP) {
		OrderProductStatusERP = orderProductStatusERP;
	}

	public Date getTimeToShip() {
		return TimeToShip;
	}

	public void setTimeToShip(Date timeToShip) {
		TimeToShip = timeToShip;
	}
	

	public int getSupplierID() {
		return SupplierID;
	}

	public void setSupplierID(int supplierID) {
		SupplierID = supplierID;
	}

	public int getUpstreamSellerID() {
		return UpstreamSellerID;
	}

	public void setUpstreamSellerID(int upstreamSellerID) {
		UpstreamSellerID = upstreamSellerID;
	}

	public String getAssemblyAttribute() {
		return AssemblyAttribute;
	}

	public int getQuantityShipped() {
		return QuantityShipped;
	}

	public void setQuantityShipped(int quantityShipped) {
		QuantityShipped = quantityShipped;
	}

	public int getQuantityInvoiced() {
		return QuantityInvoiced;
	}

	public void setQuantityInvoiced(int quantityInvoiced) {
		QuantityInvoiced = quantityInvoiced;
	}

	public int getQuantityCancelled() {
		return QuantityCancelled;
	}

	public void setQuantityCancelled(int quantityCancelled) {
		QuantityCancelled = quantityCancelled;
	}

	public String getItemAdditionalDetails() {
		return ItemAdditionalDetails;
	}

	public void setItemAdditionalDetails(String itemAdditionalDetails) {
		ItemAdditionalDetails = itemAdditionalDetails;
	}

	public String getProductURL() {
		return ProductURL;
	}

	public void setProductURL(String productURL) {
		ProductURL = productURL;
	}

	public String getProductId() {
		return ProductId;
	}

	public void setProductId(String productId) {
		ProductId = productId;
	}

	public Date getTimeToDeliver() {
		return TimeToDeliver;
	}

	public void setTimeToDeliver(Date timeToDeliver) {
		TimeToDeliver = timeToDeliver;
	}

	public Date getDeliveryDate() {
		return DeliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		DeliveryDate = deliveryDate;
	}

	public String getModeOfShipping() {
		return ModeOfShipping;
	}

	public void setModeOfShipping(String modeOfShipping) {
		ModeOfShipping = modeOfShipping;
	}

	public String getExchangePointsRefunded() {
		return ExchangePointsRefunded;
	}

	public void setExchangePointsRefunded(String exchangePointsRefunded) {
		ExchangePointsRefunded = exchangePointsRefunded;
	}

	public void setSellingPricePricePerUnit(double sellingPricePricePerUnit) {
		SellingPricePricePerUnit = sellingPricePricePerUnit;
	}

	public void setTax(double tax) {
		Tax = tax;
	}

	public void setProductShippingCharges(double productShippingCharges) {
		ProductShippingCharges = productShippingCharges;
	}

	public void setPartPayCharges(double partPayCharges) {
		PartPayCharges = partPayCharges;
	}

	public void setCBCCommissionCharge(double cBCCommissionCharge) {
		CBCCommissionCharge = cBCCommissionCharge;
	}

	public void setOrderProductPaidValue(double orderProductPaidValue) {
		OrderProductPaidValue = orderProductPaidValue;
	}

	public void setTotalDue(double totalDue) {
		TotalDue = totalDue;
	}

	public void setTotalRefunded(double totalRefunded) {
		TotalRefunded = totalRefunded;
	}

	public void setAssemblyAttribute(String assemblyAttribute) {
		AssemblyAttribute = assemblyAttribute;
	}

	public String getAWB() {
		return AWB;
	}

	public void setAWB(String aWB) {
		AWB = aWB;
	}

	public String getLogisticsPartnerName() {
		return LogisticsPartnerName;
	}

	public void setLogisticsPartnerName(String logisticsPartnerName) {
		LogisticsPartnerName = logisticsPartnerName;
	}

	public Date getShippingDate() {
		return ShippingDate;
	}

	public void setShippingDate(Date shippingDate) {
		ShippingDate = shippingDate;
	}

	public String getWHName() {
		return WHName;
	}

	public void setWHName(String wHName) {
		WHName = wHName;
	}

	public int getCBCCommissionChargeRefunded() {
		return CBCCommissionChargeRefunded;
	}

	public void setCBCCommissionChargeRefunded(int cBCCommissionChargeRefunded) {
		CBCCommissionChargeRefunded = cBCCommissionChargeRefunded;
	}

	public String getItemCategory() {
		return ItemCategory;
	}

	public void setItemCategory(String itemCategory) {
		ItemCategory = itemCategory;
	}

	public String getSKUCategory() {
		return SKUCategory;
	}

	public void setSKUCategory(String sKUCategory) {
		SKUCategory = sKUCategory;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
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
}
