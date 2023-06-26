/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NonTaxIncomeBill extends AbstractModel{

    /**
    * Invoice title
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Invoice number
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * Invoice code
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * Check code
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * Date of issue
    */
    @SerializedName("Date")
    @Expose
    private String Date;

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
    * Payer's name
    */
    @SerializedName("Buyer")
    @Expose
    private String Buyer;

    /**
    * Payer's taxpayer identification number
    */
    @SerializedName("BuyerTaxID")
    @Expose
    private String BuyerTaxID;

    /**
    * Payee's name
    */
    @SerializedName("Seller")
    @Expose
    private String Seller;

    /**
    * Payee's company name
    */
    @SerializedName("SellerCompany")
    @Expose
    private String SellerCompany;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Currency
    */
    @SerializedName("CurrencyCode")
    @Expose
    private String CurrencyCode;

    /**
    * Reviewer
    */
    @SerializedName("Reviewer")
    @Expose
    private String Reviewer;

    /**
    * Whether there is a QR code (0: No, 1: Yes)
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

    /**
    * Other information
    */
    @SerializedName("OtherInfo")
    @Expose
    private String OtherInfo;

    /**
    * Payment code
    */
    @SerializedName("PaymentCode")
    @Expose
    private String PaymentCode;

    /**
    * Collecting organization's code
    */
    @SerializedName("ReceiveUnitCode")
    @Expose
    private String ReceiveUnitCode;

    /**
    * Collecting organization's name
    */
    @SerializedName("Receiver")
    @Expose
    private String Receiver;

    /**
    * Operator
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Payer's account
    */
    @SerializedName("PayerAccount")
    @Expose
    private String PayerAccount;

    /**
    * Payer's account opening bank
    */
    @SerializedName("PayerBank")
    @Expose
    private String PayerBank;

    /**
    * Payee's account
    */
    @SerializedName("ReceiverAccount")
    @Expose
    private String ReceiverAccount;

    /**
    * Payee's account opening bank
    */
    @SerializedName("ReceiverBank")
    @Expose
    private String ReceiverBank;

    /**
    * Items
    */
    @SerializedName("NonTaxItems")
    @Expose
    private NonTaxItem [] NonTaxItems;

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
     * Get Payer's name 
     * @return Buyer Payer's name
     */
    public String getBuyer() {
        return this.Buyer;
    }

    /**
     * Set Payer's name
     * @param Buyer Payer's name
     */
    public void setBuyer(String Buyer) {
        this.Buyer = Buyer;
    }

    /**
     * Get Payer's taxpayer identification number 
     * @return BuyerTaxID Payer's taxpayer identification number
     */
    public String getBuyerTaxID() {
        return this.BuyerTaxID;
    }

    /**
     * Set Payer's taxpayer identification number
     * @param BuyerTaxID Payer's taxpayer identification number
     */
    public void setBuyerTaxID(String BuyerTaxID) {
        this.BuyerTaxID = BuyerTaxID;
    }

    /**
     * Get Payee's name 
     * @return Seller Payee's name
     */
    public String getSeller() {
        return this.Seller;
    }

    /**
     * Set Payee's name
     * @param Seller Payee's name
     */
    public void setSeller(String Seller) {
        this.Seller = Seller;
    }

    /**
     * Get Payee's company name 
     * @return SellerCompany Payee's company name
     */
    public String getSellerCompany() {
        return this.SellerCompany;
    }

    /**
     * Set Payee's company name
     * @param SellerCompany Payee's company name
     */
    public void setSellerCompany(String SellerCompany) {
        this.SellerCompany = SellerCompany;
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
     * Get Currency 
     * @return CurrencyCode Currency
     */
    public String getCurrencyCode() {
        return this.CurrencyCode;
    }

    /**
     * Set Currency
     * @param CurrencyCode Currency
     */
    public void setCurrencyCode(String CurrencyCode) {
        this.CurrencyCode = CurrencyCode;
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
     * Get Other information 
     * @return OtherInfo Other information
     */
    public String getOtherInfo() {
        return this.OtherInfo;
    }

    /**
     * Set Other information
     * @param OtherInfo Other information
     */
    public void setOtherInfo(String OtherInfo) {
        this.OtherInfo = OtherInfo;
    }

    /**
     * Get Payment code 
     * @return PaymentCode Payment code
     */
    public String getPaymentCode() {
        return this.PaymentCode;
    }

    /**
     * Set Payment code
     * @param PaymentCode Payment code
     */
    public void setPaymentCode(String PaymentCode) {
        this.PaymentCode = PaymentCode;
    }

    /**
     * Get Collecting organization's code 
     * @return ReceiveUnitCode Collecting organization's code
     */
    public String getReceiveUnitCode() {
        return this.ReceiveUnitCode;
    }

    /**
     * Set Collecting organization's code
     * @param ReceiveUnitCode Collecting organization's code
     */
    public void setReceiveUnitCode(String ReceiveUnitCode) {
        this.ReceiveUnitCode = ReceiveUnitCode;
    }

    /**
     * Get Collecting organization's name 
     * @return Receiver Collecting organization's name
     */
    public String getReceiver() {
        return this.Receiver;
    }

    /**
     * Set Collecting organization's name
     * @param Receiver Collecting organization's name
     */
    public void setReceiver(String Receiver) {
        this.Receiver = Receiver;
    }

    /**
     * Get Operator 
     * @return Operator Operator
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator
     * @param Operator Operator
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Payer's account 
     * @return PayerAccount Payer's account
     */
    public String getPayerAccount() {
        return this.PayerAccount;
    }

    /**
     * Set Payer's account
     * @param PayerAccount Payer's account
     */
    public void setPayerAccount(String PayerAccount) {
        this.PayerAccount = PayerAccount;
    }

    /**
     * Get Payer's account opening bank 
     * @return PayerBank Payer's account opening bank
     */
    public String getPayerBank() {
        return this.PayerBank;
    }

    /**
     * Set Payer's account opening bank
     * @param PayerBank Payer's account opening bank
     */
    public void setPayerBank(String PayerBank) {
        this.PayerBank = PayerBank;
    }

    /**
     * Get Payee's account 
     * @return ReceiverAccount Payee's account
     */
    public String getReceiverAccount() {
        return this.ReceiverAccount;
    }

    /**
     * Set Payee's account
     * @param ReceiverAccount Payee's account
     */
    public void setReceiverAccount(String ReceiverAccount) {
        this.ReceiverAccount = ReceiverAccount;
    }

    /**
     * Get Payee's account opening bank 
     * @return ReceiverBank Payee's account opening bank
     */
    public String getReceiverBank() {
        return this.ReceiverBank;
    }

    /**
     * Set Payee's account opening bank
     * @param ReceiverBank Payee's account opening bank
     */
    public void setReceiverBank(String ReceiverBank) {
        this.ReceiverBank = ReceiverBank;
    }

    /**
     * Get Items 
     * @return NonTaxItems Items
     */
    public NonTaxItem [] getNonTaxItems() {
        return this.NonTaxItems;
    }

    /**
     * Set Items
     * @param NonTaxItems Items
     */
    public void setNonTaxItems(NonTaxItem [] NonTaxItems) {
        this.NonTaxItems = NonTaxItems;
    }

    public NonTaxIncomeBill() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NonTaxIncomeBill(NonTaxIncomeBill source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.CheckCode != null) {
            this.CheckCode = new String(source.CheckCode);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TotalCn != null) {
            this.TotalCn = new String(source.TotalCn);
        }
        if (source.Buyer != null) {
            this.Buyer = new String(source.Buyer);
        }
        if (source.BuyerTaxID != null) {
            this.BuyerTaxID = new String(source.BuyerTaxID);
        }
        if (source.Seller != null) {
            this.Seller = new String(source.Seller);
        }
        if (source.SellerCompany != null) {
            this.SellerCompany = new String(source.SellerCompany);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CurrencyCode != null) {
            this.CurrencyCode = new String(source.CurrencyCode);
        }
        if (source.Reviewer != null) {
            this.Reviewer = new String(source.Reviewer);
        }
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
        if (source.OtherInfo != null) {
            this.OtherInfo = new String(source.OtherInfo);
        }
        if (source.PaymentCode != null) {
            this.PaymentCode = new String(source.PaymentCode);
        }
        if (source.ReceiveUnitCode != null) {
            this.ReceiveUnitCode = new String(source.ReceiveUnitCode);
        }
        if (source.Receiver != null) {
            this.Receiver = new String(source.Receiver);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.PayerAccount != null) {
            this.PayerAccount = new String(source.PayerAccount);
        }
        if (source.PayerBank != null) {
            this.PayerBank = new String(source.PayerBank);
        }
        if (source.ReceiverAccount != null) {
            this.ReceiverAccount = new String(source.ReceiverAccount);
        }
        if (source.ReceiverBank != null) {
            this.ReceiverBank = new String(source.ReceiverBank);
        }
        if (source.NonTaxItems != null) {
            this.NonTaxItems = new NonTaxItem[source.NonTaxItems.length];
            for (int i = 0; i < source.NonTaxItems.length; i++) {
                this.NonTaxItems[i] = new NonTaxItem(source.NonTaxItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "Buyer", this.Buyer);
        this.setParamSimple(map, prefix + "BuyerTaxID", this.BuyerTaxID);
        this.setParamSimple(map, prefix + "Seller", this.Seller);
        this.setParamSimple(map, prefix + "SellerCompany", this.SellerCompany);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CurrencyCode", this.CurrencyCode);
        this.setParamSimple(map, prefix + "Reviewer", this.Reviewer);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);
        this.setParamSimple(map, prefix + "OtherInfo", this.OtherInfo);
        this.setParamSimple(map, prefix + "PaymentCode", this.PaymentCode);
        this.setParamSimple(map, prefix + "ReceiveUnitCode", this.ReceiveUnitCode);
        this.setParamSimple(map, prefix + "Receiver", this.Receiver);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "PayerAccount", this.PayerAccount);
        this.setParamSimple(map, prefix + "PayerBank", this.PayerBank);
        this.setParamSimple(map, prefix + "ReceiverAccount", this.ReceiverAccount);
        this.setParamSimple(map, prefix + "ReceiverBank", this.ReceiverBank);
        this.setParamArrayObj(map, prefix + "NonTaxItems.", this.NonTaxItems);

    }
}

