/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachinePrintedInvoice extends AbstractModel {

    /**
    * Invoice title
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Whether there is a QR code (0: No, 1: Yes)
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

    /**
    * Invoice code
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * Invoice number
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * Date of issue
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Time
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Check code
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * Ciphertext
    */
    @SerializedName("Ciphertext")
    @Expose
    private String Ciphertext;

    /**
    * Category
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Amount before tax
    */
    @SerializedName("PretaxAmount")
    @Expose
    private String PretaxAmount;

    /**
    * Total amount (in figures)
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * Total amount (in words)
    */
    @SerializedName("TotalCn")
    @Expose
    private String TotalCn;

    /**
    * Tax
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * Industry
    */
    @SerializedName("IndustryClass")
    @Expose
    private String IndustryClass;

    /**
    * Seller's name
    */
    @SerializedName("Seller")
    @Expose
    private String Seller;

    /**
    * Seller's taxpayer identification number
    */
    @SerializedName("SellerTaxID")
    @Expose
    private String SellerTaxID;

    /**
    * Seller's address and phone number
    */
    @SerializedName("SellerAddrTel")
    @Expose
    private String SellerAddrTel;

    /**
    * Seller's bank account number
    */
    @SerializedName("SellerBankAccount")
    @Expose
    private String SellerBankAccount;

    /**
    * Buyer's name
    */
    @SerializedName("Buyer")
    @Expose
    private String Buyer;

    /**
    * Buyer's taxpayer identification number
    */
    @SerializedName("BuyerTaxID")
    @Expose
    private String BuyerTaxID;

    /**
    * Buyer's address and phone number
    */
    @SerializedName("BuyerAddrTel")
    @Expose
    private String BuyerAddrTel;

    /**
    * Buyer's bank account number
    */
    @SerializedName("BuyerBankAccount")
    @Expose
    private String BuyerBankAccount;

    /**
    * Invoice type
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * Province
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * City
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * Whether there is a company seal (0: No, 1: Yes)
    */
    @SerializedName("CompanySealMark")
    @Expose
    private Long CompanySealMark;

    /**
    * Whether it is a general machine-printed invoice issued by Zhejiang or Guangdong province (0: No, 1: Yes)
    */
    @SerializedName("ElectronicMark")
    @Expose
    private Long ElectronicMark;

    /**
    * Issuer
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * Payee
    */
    @SerializedName("Receiptor")
    @Expose
    private String Receiptor;

    /**
    * Reviewer
    */
    @SerializedName("Reviewer")
    @Expose
    private String Reviewer;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Operator's payment information
    */
    @SerializedName("PaymentInfo")
    @Expose
    private String PaymentInfo;

    /**
    * Operator-assigned invoice pickup user
    */
    @SerializedName("TicketPickupUser")
    @Expose
    private String TicketPickupUser;

    /**
    * Operator's merchant number
    */
    @SerializedName("MerchantNumber")
    @Expose
    private String MerchantNumber;

    /**
    * Operator's order number
    */
    @SerializedName("OrderNumber")
    @Expose
    private String OrderNumber;

    /**
    * Items
    */
    @SerializedName("GeneralMachineItems")
    @Expose
    private GeneralMachineItem [] GeneralMachineItems;

    /**
     * Get Invoice title 
     * @return Title Invoice title
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Invoice title
     * @param Title Invoice title
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Whether there is a QR code (0: No, 1: Yes) 
     * @return QRCodeMark Whether there is a QR code (0: No, 1: Yes)
     */
    public Long getQRCodeMark() {
        return this.QRCodeMark;
    }

    /**
     * Set Whether there is a QR code (0: No, 1: Yes)
     * @param QRCodeMark Whether there is a QR code (0: No, 1: Yes)
     */
    public void setQRCodeMark(Long QRCodeMark) {
        this.QRCodeMark = QRCodeMark;
    }

    /**
     * Get Invoice code 
     * @return Code Invoice code
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set Invoice code
     * @param Code Invoice code
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get Invoice number 
     * @return Number Invoice number
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set Invoice number
     * @param Number Invoice number
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get Date of issue 
     * @return Date Date of issue
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Date of issue
     * @param Date Date of issue
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get Time 
     * @return Time Time
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Time
     * @param Time Time
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Check code 
     * @return CheckCode Check code
     */
    public String getCheckCode() {
        return this.CheckCode;
    }

    /**
     * Set Check code
     * @param CheckCode Check code
     */
    public void setCheckCode(String CheckCode) {
        this.CheckCode = CheckCode;
    }

    /**
     * Get Ciphertext 
     * @return Ciphertext Ciphertext
     */
    public String getCiphertext() {
        return this.Ciphertext;
    }

    /**
     * Set Ciphertext
     * @param Ciphertext Ciphertext
     */
    public void setCiphertext(String Ciphertext) {
        this.Ciphertext = Ciphertext;
    }

    /**
     * Get Category 
     * @return Category Category
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Category
     * @param Category Category
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Amount before tax 
     * @return PretaxAmount Amount before tax
     */
    public String getPretaxAmount() {
        return this.PretaxAmount;
    }

    /**
     * Set Amount before tax
     * @param PretaxAmount Amount before tax
     */
    public void setPretaxAmount(String PretaxAmount) {
        this.PretaxAmount = PretaxAmount;
    }

    /**
     * Get Total amount (in figures) 
     * @return Total Total amount (in figures)
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set Total amount (in figures)
     * @param Total Total amount (in figures)
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get Total amount (in words) 
     * @return TotalCn Total amount (in words)
     */
    public String getTotalCn() {
        return this.TotalCn;
    }

    /**
     * Set Total amount (in words)
     * @param TotalCn Total amount (in words)
     */
    public void setTotalCn(String TotalCn) {
        this.TotalCn = TotalCn;
    }

    /**
     * Get Tax 
     * @return Tax Tax
     */
    public String getTax() {
        return this.Tax;
    }

    /**
     * Set Tax
     * @param Tax Tax
     */
    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    /**
     * Get Industry 
     * @return IndustryClass Industry
     */
    public String getIndustryClass() {
        return this.IndustryClass;
    }

    /**
     * Set Industry
     * @param IndustryClass Industry
     */
    public void setIndustryClass(String IndustryClass) {
        this.IndustryClass = IndustryClass;
    }

    /**
     * Get Seller's name 
     * @return Seller Seller's name
     */
    public String getSeller() {
        return this.Seller;
    }

    /**
     * Set Seller's name
     * @param Seller Seller's name
     */
    public void setSeller(String Seller) {
        this.Seller = Seller;
    }

    /**
     * Get Seller's taxpayer identification number 
     * @return SellerTaxID Seller's taxpayer identification number
     */
    public String getSellerTaxID() {
        return this.SellerTaxID;
    }

    /**
     * Set Seller's taxpayer identification number
     * @param SellerTaxID Seller's taxpayer identification number
     */
    public void setSellerTaxID(String SellerTaxID) {
        this.SellerTaxID = SellerTaxID;
    }

    /**
     * Get Seller's address and phone number 
     * @return SellerAddrTel Seller's address and phone number
     */
    public String getSellerAddrTel() {
        return this.SellerAddrTel;
    }

    /**
     * Set Seller's address and phone number
     * @param SellerAddrTel Seller's address and phone number
     */
    public void setSellerAddrTel(String SellerAddrTel) {
        this.SellerAddrTel = SellerAddrTel;
    }

    /**
     * Get Seller's bank account number 
     * @return SellerBankAccount Seller's bank account number
     */
    public String getSellerBankAccount() {
        return this.SellerBankAccount;
    }

    /**
     * Set Seller's bank account number
     * @param SellerBankAccount Seller's bank account number
     */
    public void setSellerBankAccount(String SellerBankAccount) {
        this.SellerBankAccount = SellerBankAccount;
    }

    /**
     * Get Buyer's name 
     * @return Buyer Buyer's name
     */
    public String getBuyer() {
        return this.Buyer;
    }

    /**
     * Set Buyer's name
     * @param Buyer Buyer's name
     */
    public void setBuyer(String Buyer) {
        this.Buyer = Buyer;
    }

    /**
     * Get Buyer's taxpayer identification number 
     * @return BuyerTaxID Buyer's taxpayer identification number
     */
    public String getBuyerTaxID() {
        return this.BuyerTaxID;
    }

    /**
     * Set Buyer's taxpayer identification number
     * @param BuyerTaxID Buyer's taxpayer identification number
     */
    public void setBuyerTaxID(String BuyerTaxID) {
        this.BuyerTaxID = BuyerTaxID;
    }

    /**
     * Get Buyer's address and phone number 
     * @return BuyerAddrTel Buyer's address and phone number
     */
    public String getBuyerAddrTel() {
        return this.BuyerAddrTel;
    }

    /**
     * Set Buyer's address and phone number
     * @param BuyerAddrTel Buyer's address and phone number
     */
    public void setBuyerAddrTel(String BuyerAddrTel) {
        this.BuyerAddrTel = BuyerAddrTel;
    }

    /**
     * Get Buyer's bank account number 
     * @return BuyerBankAccount Buyer's bank account number
     */
    public String getBuyerBankAccount() {
        return this.BuyerBankAccount;
    }

    /**
     * Set Buyer's bank account number
     * @param BuyerBankAccount Buyer's bank account number
     */
    public void setBuyerBankAccount(String BuyerBankAccount) {
        this.BuyerBankAccount = BuyerBankAccount;
    }

    /**
     * Get Invoice type 
     * @return Kind Invoice type
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set Invoice type
     * @param Kind Invoice type
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get Province 
     * @return Province Province
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set Province
     * @param Province Province
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get City 
     * @return City City
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set City
     * @param City City
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get Whether there is a company seal (0: No, 1: Yes) 
     * @return CompanySealMark Whether there is a company seal (0: No, 1: Yes)
     */
    public Long getCompanySealMark() {
        return this.CompanySealMark;
    }

    /**
     * Set Whether there is a company seal (0: No, 1: Yes)
     * @param CompanySealMark Whether there is a company seal (0: No, 1: Yes)
     */
    public void setCompanySealMark(Long CompanySealMark) {
        this.CompanySealMark = CompanySealMark;
    }

    /**
     * Get Whether it is a general machine-printed invoice issued by Zhejiang or Guangdong province (0: No, 1: Yes) 
     * @return ElectronicMark Whether it is a general machine-printed invoice issued by Zhejiang or Guangdong province (0: No, 1: Yes)
     */
    public Long getElectronicMark() {
        return this.ElectronicMark;
    }

    /**
     * Set Whether it is a general machine-printed invoice issued by Zhejiang or Guangdong province (0: No, 1: Yes)
     * @param ElectronicMark Whether it is a general machine-printed invoice issued by Zhejiang or Guangdong province (0: No, 1: Yes)
     */
    public void setElectronicMark(Long ElectronicMark) {
        this.ElectronicMark = ElectronicMark;
    }

    /**
     * Get Issuer 
     * @return Issuer Issuer
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set Issuer
     * @param Issuer Issuer
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * Get Payee 
     * @return Receiptor Payee
     */
    public String getReceiptor() {
        return this.Receiptor;
    }

    /**
     * Set Payee
     * @param Receiptor Payee
     */
    public void setReceiptor(String Receiptor) {
        this.Receiptor = Receiptor;
    }

    /**
     * Get Reviewer 
     * @return Reviewer Reviewer
     */
    public String getReviewer() {
        return this.Reviewer;
    }

    /**
     * Set Reviewer
     * @param Reviewer Reviewer
     */
    public void setReviewer(String Reviewer) {
        this.Reviewer = Reviewer;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Operator's payment information 
     * @return PaymentInfo Operator's payment information
     */
    public String getPaymentInfo() {
        return this.PaymentInfo;
    }

    /**
     * Set Operator's payment information
     * @param PaymentInfo Operator's payment information
     */
    public void setPaymentInfo(String PaymentInfo) {
        this.PaymentInfo = PaymentInfo;
    }

    /**
     * Get Operator-assigned invoice pickup user 
     * @return TicketPickupUser Operator-assigned invoice pickup user
     */
    public String getTicketPickupUser() {
        return this.TicketPickupUser;
    }

    /**
     * Set Operator-assigned invoice pickup user
     * @param TicketPickupUser Operator-assigned invoice pickup user
     */
    public void setTicketPickupUser(String TicketPickupUser) {
        this.TicketPickupUser = TicketPickupUser;
    }

    /**
     * Get Operator's merchant number 
     * @return MerchantNumber Operator's merchant number
     */
    public String getMerchantNumber() {
        return this.MerchantNumber;
    }

    /**
     * Set Operator's merchant number
     * @param MerchantNumber Operator's merchant number
     */
    public void setMerchantNumber(String MerchantNumber) {
        this.MerchantNumber = MerchantNumber;
    }

    /**
     * Get Operator's order number 
     * @return OrderNumber Operator's order number
     */
    public String getOrderNumber() {
        return this.OrderNumber;
    }

    /**
     * Set Operator's order number
     * @param OrderNumber Operator's order number
     */
    public void setOrderNumber(String OrderNumber) {
        this.OrderNumber = OrderNumber;
    }

    /**
     * Get Items 
     * @return GeneralMachineItems Items
     */
    public GeneralMachineItem [] getGeneralMachineItems() {
        return this.GeneralMachineItems;
    }

    /**
     * Set Items
     * @param GeneralMachineItems Items
     */
    public void setGeneralMachineItems(GeneralMachineItem [] GeneralMachineItems) {
        this.GeneralMachineItems = GeneralMachineItems;
    }

    public MachinePrintedInvoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachinePrintedInvoice(MachinePrintedInvoice source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.CheckCode != null) {
            this.CheckCode = new String(source.CheckCode);
        }
        if (source.Ciphertext != null) {
            this.Ciphertext = new String(source.Ciphertext);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.PretaxAmount != null) {
            this.PretaxAmount = new String(source.PretaxAmount);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TotalCn != null) {
            this.TotalCn = new String(source.TotalCn);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.IndustryClass != null) {
            this.IndustryClass = new String(source.IndustryClass);
        }
        if (source.Seller != null) {
            this.Seller = new String(source.Seller);
        }
        if (source.SellerTaxID != null) {
            this.SellerTaxID = new String(source.SellerTaxID);
        }
        if (source.SellerAddrTel != null) {
            this.SellerAddrTel = new String(source.SellerAddrTel);
        }
        if (source.SellerBankAccount != null) {
            this.SellerBankAccount = new String(source.SellerBankAccount);
        }
        if (source.Buyer != null) {
            this.Buyer = new String(source.Buyer);
        }
        if (source.BuyerTaxID != null) {
            this.BuyerTaxID = new String(source.BuyerTaxID);
        }
        if (source.BuyerAddrTel != null) {
            this.BuyerAddrTel = new String(source.BuyerAddrTel);
        }
        if (source.BuyerBankAccount != null) {
            this.BuyerBankAccount = new String(source.BuyerBankAccount);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.CompanySealMark != null) {
            this.CompanySealMark = new Long(source.CompanySealMark);
        }
        if (source.ElectronicMark != null) {
            this.ElectronicMark = new Long(source.ElectronicMark);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.Receiptor != null) {
            this.Receiptor = new String(source.Receiptor);
        }
        if (source.Reviewer != null) {
            this.Reviewer = new String(source.Reviewer);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PaymentInfo != null) {
            this.PaymentInfo = new String(source.PaymentInfo);
        }
        if (source.TicketPickupUser != null) {
            this.TicketPickupUser = new String(source.TicketPickupUser);
        }
        if (source.MerchantNumber != null) {
            this.MerchantNumber = new String(source.MerchantNumber);
        }
        if (source.OrderNumber != null) {
            this.OrderNumber = new String(source.OrderNumber);
        }
        if (source.GeneralMachineItems != null) {
            this.GeneralMachineItems = new GeneralMachineItem[source.GeneralMachineItems.length];
            for (int i = 0; i < source.GeneralMachineItems.length; i++) {
                this.GeneralMachineItems[i] = new GeneralMachineItem(source.GeneralMachineItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "Ciphertext", this.Ciphertext);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "PretaxAmount", this.PretaxAmount);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "IndustryClass", this.IndustryClass);
        this.setParamSimple(map, prefix + "Seller", this.Seller);
        this.setParamSimple(map, prefix + "SellerTaxID", this.SellerTaxID);
        this.setParamSimple(map, prefix + "SellerAddrTel", this.SellerAddrTel);
        this.setParamSimple(map, prefix + "SellerBankAccount", this.SellerBankAccount);
        this.setParamSimple(map, prefix + "Buyer", this.Buyer);
        this.setParamSimple(map, prefix + "BuyerTaxID", this.BuyerTaxID);
        this.setParamSimple(map, prefix + "BuyerAddrTel", this.BuyerAddrTel);
        this.setParamSimple(map, prefix + "BuyerBankAccount", this.BuyerBankAccount);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "CompanySealMark", this.CompanySealMark);
        this.setParamSimple(map, prefix + "ElectronicMark", this.ElectronicMark);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "Receiptor", this.Receiptor);
        this.setParamSimple(map, prefix + "Reviewer", this.Reviewer);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PaymentInfo", this.PaymentInfo);
        this.setParamSimple(map, prefix + "TicketPickupUser", this.TicketPickupUser);
        this.setParamSimple(map, prefix + "MerchantNumber", this.MerchantNumber);
        this.setParamSimple(map, prefix + "OrderNumber", this.OrderNumber);
        this.setParamArrayObj(map, prefix + "GeneralMachineItems.", this.GeneralMachineItems);

    }
}

