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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VatInvoiceInfo extends AbstractModel {

    /**
    * Check code
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * Form type
    */
    @SerializedName("FormType")
    @Expose
    private String FormType;

    /**
    * Vehicle and vessel tax
    */
    @SerializedName("TravelTax")
    @Expose
    private String TravelTax;

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
    * Company seal content
    */
    @SerializedName("CompanySealContent")
    @Expose
    private String CompanySealContent;

    /**
    * Tax authority seal content
    */
    @SerializedName("TaxSealContent")
    @Expose
    private String TaxSealContent;

    /**
    * Service type
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * City
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * Whether there is a QR code (0: No, 1: Yes)
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

    /**
    * Whether there is an agent (0: No, 1: Yes)
    */
    @SerializedName("AgentMark")
    @Expose
    private Long AgentMark;

    /**
    * Whether there is a toll (0: No, 1: Yes)
    */
    @SerializedName("TransitMark")
    @Expose
    private Long TransitMark;

    /**
    * Whether there is refined oil (0: No, 1: Yes)
    */
    @SerializedName("OilMark")
    @Expose
    private Long OilMark;

    /**
    * Invoice title
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Invoice type
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

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
    * Machine-printed invoice number
    */
    @SerializedName("NumberConfirm")
    @Expose
    private String NumberConfirm;

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
    * Amount before tax
    */
    @SerializedName("PretaxAmount")
    @Expose
    private String PretaxAmount;

    /**
    * Tax
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * Machine No.
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
    * Ciphertext
    */
    @SerializedName("Ciphertext")
    @Expose
    private String Ciphertext;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

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
    * Whether there is a company seal (0: No, 1: Yes)
    */
    @SerializedName("CompanySealMark")
    @Expose
    private Long CompanySealMark;

    /**
    * Issuer
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * Reviewer
    */
    @SerializedName("Reviewer")
    @Expose
    private String Reviewer;

    /**
    * Province
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * Information about VAT invoice items
    */
    @SerializedName("VatInvoiceItemInfos")
    @Expose
    private VatInvoiceItemInfo [] VatInvoiceItemInfos;

    /**
    * Machine-printed invoice code
    */
    @SerializedName("CodeConfirm")
    @Expose
    private String CodeConfirm;

    /**
    * Payee
    */
    @SerializedName("Receiptor")
    @Expose
    private String Receiptor;

    /**
    * 
    */
    @SerializedName("ElectronicFullMark")
    @Expose
    private Long ElectronicFullMark;

    /**
    * 
    */
    @SerializedName("ElectronicFullNumber")
    @Expose
    private String ElectronicFullNumber;

    /**
    * 
    */
    @SerializedName("FormName")
    @Expose
    private String FormName;

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
     * Get Form type 
     * @return FormType Form type
     */
    public String getFormType() {
        return this.FormType;
    }

    /**
     * Set Form type
     * @param FormType Form type
     */
    public void setFormType(String FormType) {
        this.FormType = FormType;
    }

    /**
     * Get Vehicle and vessel tax 
     * @return TravelTax Vehicle and vessel tax
     */
    public String getTravelTax() {
        return this.TravelTax;
    }

    /**
     * Set Vehicle and vessel tax
     * @param TravelTax Vehicle and vessel tax
     */
    public void setTravelTax(String TravelTax) {
        this.TravelTax = TravelTax;
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
     * Get Company seal content 
     * @return CompanySealContent Company seal content
     */
    public String getCompanySealContent() {
        return this.CompanySealContent;
    }

    /**
     * Set Company seal content
     * @param CompanySealContent Company seal content
     */
    public void setCompanySealContent(String CompanySealContent) {
        this.CompanySealContent = CompanySealContent;
    }

    /**
     * Get Tax authority seal content 
     * @return TaxSealContent Tax authority seal content
     */
    public String getTaxSealContent() {
        return this.TaxSealContent;
    }

    /**
     * Set Tax authority seal content
     * @param TaxSealContent Tax authority seal content
     */
    public void setTaxSealContent(String TaxSealContent) {
        this.TaxSealContent = TaxSealContent;
    }

    /**
     * Get Service type 
     * @return ServiceName Service type
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service type
     * @param ServiceName Service type
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
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
     * Get Whether there is an agent (0: No, 1: Yes) 
     * @return AgentMark Whether there is an agent (0: No, 1: Yes)
     */
    public Long getAgentMark() {
        return this.AgentMark;
    }

    /**
     * Set Whether there is an agent (0: No, 1: Yes)
     * @param AgentMark Whether there is an agent (0: No, 1: Yes)
     */
    public void setAgentMark(Long AgentMark) {
        this.AgentMark = AgentMark;
    }

    /**
     * Get Whether there is a toll (0: No, 1: Yes) 
     * @return TransitMark Whether there is a toll (0: No, 1: Yes)
     */
    public Long getTransitMark() {
        return this.TransitMark;
    }

    /**
     * Set Whether there is a toll (0: No, 1: Yes)
     * @param TransitMark Whether there is a toll (0: No, 1: Yes)
     */
    public void setTransitMark(Long TransitMark) {
        this.TransitMark = TransitMark;
    }

    /**
     * Get Whether there is refined oil (0: No, 1: Yes) 
     * @return OilMark Whether there is refined oil (0: No, 1: Yes)
     */
    public Long getOilMark() {
        return this.OilMark;
    }

    /**
     * Set Whether there is refined oil (0: No, 1: Yes)
     * @param OilMark Whether there is refined oil (0: No, 1: Yes)
     */
    public void setOilMark(Long OilMark) {
        this.OilMark = OilMark;
    }

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
     * Get Machine-printed invoice number 
     * @return NumberConfirm Machine-printed invoice number
     */
    public String getNumberConfirm() {
        return this.NumberConfirm;
    }

    /**
     * Set Machine-printed invoice number
     * @param NumberConfirm Machine-printed invoice number
     */
    public void setNumberConfirm(String NumberConfirm) {
        this.NumberConfirm = NumberConfirm;
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
     * Get Machine No. 
     * @return MachineCode Machine No.
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set Machine No.
     * @param MachineCode Machine No.
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
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
     * Get Information about VAT invoice items 
     * @return VatInvoiceItemInfos Information about VAT invoice items
     */
    public VatInvoiceItemInfo [] getVatInvoiceItemInfos() {
        return this.VatInvoiceItemInfos;
    }

    /**
     * Set Information about VAT invoice items
     * @param VatInvoiceItemInfos Information about VAT invoice items
     */
    public void setVatInvoiceItemInfos(VatInvoiceItemInfo [] VatInvoiceItemInfos) {
        this.VatInvoiceItemInfos = VatInvoiceItemInfos;
    }

    /**
     * Get Machine-printed invoice code 
     * @return CodeConfirm Machine-printed invoice code
     */
    public String getCodeConfirm() {
        return this.CodeConfirm;
    }

    /**
     * Set Machine-printed invoice code
     * @param CodeConfirm Machine-printed invoice code
     */
    public void setCodeConfirm(String CodeConfirm) {
        this.CodeConfirm = CodeConfirm;
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
     * Get  
     * @return ElectronicFullMark 
     */
    public Long getElectronicFullMark() {
        return this.ElectronicFullMark;
    }

    /**
     * Set 
     * @param ElectronicFullMark 
     */
    public void setElectronicFullMark(Long ElectronicFullMark) {
        this.ElectronicFullMark = ElectronicFullMark;
    }

    /**
     * Get  
     * @return ElectronicFullNumber 
     */
    public String getElectronicFullNumber() {
        return this.ElectronicFullNumber;
    }

    /**
     * Set 
     * @param ElectronicFullNumber 
     */
    public void setElectronicFullNumber(String ElectronicFullNumber) {
        this.ElectronicFullNumber = ElectronicFullNumber;
    }

    /**
     * Get  
     * @return FormName 
     */
    public String getFormName() {
        return this.FormName;
    }

    /**
     * Set 
     * @param FormName 
     */
    public void setFormName(String FormName) {
        this.FormName = FormName;
    }

    public VatInvoiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatInvoiceInfo(VatInvoiceInfo source) {
        if (source.CheckCode != null) {
            this.CheckCode = new String(source.CheckCode);
        }
        if (source.FormType != null) {
            this.FormType = new String(source.FormType);
        }
        if (source.TravelTax != null) {
            this.TravelTax = new String(source.TravelTax);
        }
        if (source.BuyerAddrTel != null) {
            this.BuyerAddrTel = new String(source.BuyerAddrTel);
        }
        if (source.BuyerBankAccount != null) {
            this.BuyerBankAccount = new String(source.BuyerBankAccount);
        }
        if (source.CompanySealContent != null) {
            this.CompanySealContent = new String(source.CompanySealContent);
        }
        if (source.TaxSealContent != null) {
            this.TaxSealContent = new String(source.TaxSealContent);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
        if (source.AgentMark != null) {
            this.AgentMark = new Long(source.AgentMark);
        }
        if (source.TransitMark != null) {
            this.TransitMark = new Long(source.TransitMark);
        }
        if (source.OilMark != null) {
            this.OilMark = new Long(source.OilMark);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.NumberConfirm != null) {
            this.NumberConfirm = new String(source.NumberConfirm);
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
        if (source.PretaxAmount != null) {
            this.PretaxAmount = new String(source.PretaxAmount);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.MachineCode != null) {
            this.MachineCode = new String(source.MachineCode);
        }
        if (source.Ciphertext != null) {
            this.Ciphertext = new String(source.Ciphertext);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
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
        if (source.CompanySealMark != null) {
            this.CompanySealMark = new Long(source.CompanySealMark);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.Reviewer != null) {
            this.Reviewer = new String(source.Reviewer);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.VatInvoiceItemInfos != null) {
            this.VatInvoiceItemInfos = new VatInvoiceItemInfo[source.VatInvoiceItemInfos.length];
            for (int i = 0; i < source.VatInvoiceItemInfos.length; i++) {
                this.VatInvoiceItemInfos[i] = new VatInvoiceItemInfo(source.VatInvoiceItemInfos[i]);
            }
        }
        if (source.CodeConfirm != null) {
            this.CodeConfirm = new String(source.CodeConfirm);
        }
        if (source.Receiptor != null) {
            this.Receiptor = new String(source.Receiptor);
        }
        if (source.ElectronicFullMark != null) {
            this.ElectronicFullMark = new Long(source.ElectronicFullMark);
        }
        if (source.ElectronicFullNumber != null) {
            this.ElectronicFullNumber = new String(source.ElectronicFullNumber);
        }
        if (source.FormName != null) {
            this.FormName = new String(source.FormName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "FormType", this.FormType);
        this.setParamSimple(map, prefix + "TravelTax", this.TravelTax);
        this.setParamSimple(map, prefix + "BuyerAddrTel", this.BuyerAddrTel);
        this.setParamSimple(map, prefix + "BuyerBankAccount", this.BuyerBankAccount);
        this.setParamSimple(map, prefix + "CompanySealContent", this.CompanySealContent);
        this.setParamSimple(map, prefix + "TaxSealContent", this.TaxSealContent);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);
        this.setParamSimple(map, prefix + "AgentMark", this.AgentMark);
        this.setParamSimple(map, prefix + "TransitMark", this.TransitMark);
        this.setParamSimple(map, prefix + "OilMark", this.OilMark);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "NumberConfirm", this.NumberConfirm);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "PretaxAmount", this.PretaxAmount);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "MachineCode", this.MachineCode);
        this.setParamSimple(map, prefix + "Ciphertext", this.Ciphertext);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Seller", this.Seller);
        this.setParamSimple(map, prefix + "SellerTaxID", this.SellerTaxID);
        this.setParamSimple(map, prefix + "SellerAddrTel", this.SellerAddrTel);
        this.setParamSimple(map, prefix + "SellerBankAccount", this.SellerBankAccount);
        this.setParamSimple(map, prefix + "Buyer", this.Buyer);
        this.setParamSimple(map, prefix + "BuyerTaxID", this.BuyerTaxID);
        this.setParamSimple(map, prefix + "CompanySealMark", this.CompanySealMark);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "Reviewer", this.Reviewer);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamArrayObj(map, prefix + "VatInvoiceItemInfos.", this.VatInvoiceItemInfos);
        this.setParamSimple(map, prefix + "CodeConfirm", this.CodeConfirm);
        this.setParamSimple(map, prefix + "Receiptor", this.Receiptor);
        this.setParamSimple(map, prefix + "ElectronicFullMark", this.ElectronicFullMark);
        this.setParamSimple(map, prefix + "ElectronicFullNumber", this.ElectronicFullNumber);
        this.setParamSimple(map, prefix + "FormName", this.FormName);

    }
}

