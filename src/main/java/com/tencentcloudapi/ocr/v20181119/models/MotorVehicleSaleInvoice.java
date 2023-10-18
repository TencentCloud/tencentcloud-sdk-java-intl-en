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

public class MotorVehicleSaleInvoice extends AbstractModel {

    /**
    * Invoice title
    */
    @SerializedName("Title")
    @Expose
    private String Title;

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
    * Seller's name
    */
    @SerializedName("Seller")
    @Expose
    private String Seller;

    /**
    * Seller's company code
    */
    @SerializedName("SellerTaxID")
    @Expose
    private String SellerTaxID;

    /**
    * Seller's phone number
    */
    @SerializedName("SellerTel")
    @Expose
    private String SellerTel;

    /**
    * Seller's address
    */
    @SerializedName("SellerAddress")
    @Expose
    private String SellerAddress;

    /**
    * Seller's account opening bank
    */
    @SerializedName("SellerBank")
    @Expose
    private String SellerBank;

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
    * Buyer's ID number/organization code
    */
    @SerializedName("BuyerID")
    @Expose
    private String BuyerID;

    /**
    * Tax authority
    */
    @SerializedName("TaxAuthorities")
    @Expose
    private String TaxAuthorities;

    /**
    * Code of the tax authority
    */
    @SerializedName("TaxAuthoritiesCode")
    @Expose
    private String TaxAuthoritiesCode;

    /**
    * VIN
    */
    @SerializedName("VIN")
    @Expose
    private String VIN;

    /**
    * Vehicle model
    */
    @SerializedName("VehicleModel")
    @Expose
    private String VehicleModel;

    /**
    * Engine No.
    */
    @SerializedName("VehicleEngineCode")
    @Expose
    private String VehicleEngineCode;

    /**
    * No. of the certificate of conformity
    */
    @SerializedName("CertificateNumber")
    @Expose
    private String CertificateNumber;

    /**
    * Inspection No.
    */
    @SerializedName("InspectionNumber")
    @Expose
    private String InspectionNumber;

    /**
    * Machine No.
    */
    @SerializedName("MachineID")
    @Expose
    private String MachineID;

    /**
    * Vehicle type
    */
    @SerializedName("VehicleType")
    @Expose
    private String VehicleType;

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
    * Tax
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * Tax rate
    */
    @SerializedName("TaxRate")
    @Expose
    private String TaxRate;

    /**
    * Whether there is a company seal (0: No, 1: Yes)
    */
    @SerializedName("CompanySealMark")
    @Expose
    private Long CompanySealMark;

    /**
    * Tonnage
    */
    @SerializedName("Tonnage")
    @Expose
    private String Tonnage;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Form type
    */
    @SerializedName("FormType")
    @Expose
    private String FormType;

    /**
    * Form name
    */
    @SerializedName("FormName")
    @Expose
    private String FormName;

    /**
    * Issuer
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * Tax payment voucher number
    */
    @SerializedName("TaxNum")
    @Expose
    private String TaxNum;

    /**
    * Passenger capacity
    */
    @SerializedName("MaxPeopleNum")
    @Expose
    private String MaxPeopleNum;

    /**
    * Origin
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * Machine-printed invoice code
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
    * Machine-printed invoice number
    */
    @SerializedName("MachineNumber")
    @Expose
    private String MachineNumber;

    /**
    * Whether there is a QR code (0: No, 1: Yes)
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

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
     * Get Seller's company code 
     * @return SellerTaxID Seller's company code
     */
    public String getSellerTaxID() {
        return this.SellerTaxID;
    }

    /**
     * Set Seller's company code
     * @param SellerTaxID Seller's company code
     */
    public void setSellerTaxID(String SellerTaxID) {
        this.SellerTaxID = SellerTaxID;
    }

    /**
     * Get Seller's phone number 
     * @return SellerTel Seller's phone number
     */
    public String getSellerTel() {
        return this.SellerTel;
    }

    /**
     * Set Seller's phone number
     * @param SellerTel Seller's phone number
     */
    public void setSellerTel(String SellerTel) {
        this.SellerTel = SellerTel;
    }

    /**
     * Get Seller's address 
     * @return SellerAddress Seller's address
     */
    public String getSellerAddress() {
        return this.SellerAddress;
    }

    /**
     * Set Seller's address
     * @param SellerAddress Seller's address
     */
    public void setSellerAddress(String SellerAddress) {
        this.SellerAddress = SellerAddress;
    }

    /**
     * Get Seller's account opening bank 
     * @return SellerBank Seller's account opening bank
     */
    public String getSellerBank() {
        return this.SellerBank;
    }

    /**
     * Set Seller's account opening bank
     * @param SellerBank Seller's account opening bank
     */
    public void setSellerBank(String SellerBank) {
        this.SellerBank = SellerBank;
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
     * Get Buyer's ID number/organization code 
     * @return BuyerID Buyer's ID number/organization code
     */
    public String getBuyerID() {
        return this.BuyerID;
    }

    /**
     * Set Buyer's ID number/organization code
     * @param BuyerID Buyer's ID number/organization code
     */
    public void setBuyerID(String BuyerID) {
        this.BuyerID = BuyerID;
    }

    /**
     * Get Tax authority 
     * @return TaxAuthorities Tax authority
     */
    public String getTaxAuthorities() {
        return this.TaxAuthorities;
    }

    /**
     * Set Tax authority
     * @param TaxAuthorities Tax authority
     */
    public void setTaxAuthorities(String TaxAuthorities) {
        this.TaxAuthorities = TaxAuthorities;
    }

    /**
     * Get Code of the tax authority 
     * @return TaxAuthoritiesCode Code of the tax authority
     */
    public String getTaxAuthoritiesCode() {
        return this.TaxAuthoritiesCode;
    }

    /**
     * Set Code of the tax authority
     * @param TaxAuthoritiesCode Code of the tax authority
     */
    public void setTaxAuthoritiesCode(String TaxAuthoritiesCode) {
        this.TaxAuthoritiesCode = TaxAuthoritiesCode;
    }

    /**
     * Get VIN 
     * @return VIN VIN
     */
    public String getVIN() {
        return this.VIN;
    }

    /**
     * Set VIN
     * @param VIN VIN
     */
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    /**
     * Get Vehicle model 
     * @return VehicleModel Vehicle model
     */
    public String getVehicleModel() {
        return this.VehicleModel;
    }

    /**
     * Set Vehicle model
     * @param VehicleModel Vehicle model
     */
    public void setVehicleModel(String VehicleModel) {
        this.VehicleModel = VehicleModel;
    }

    /**
     * Get Engine No. 
     * @return VehicleEngineCode Engine No.
     */
    public String getVehicleEngineCode() {
        return this.VehicleEngineCode;
    }

    /**
     * Set Engine No.
     * @param VehicleEngineCode Engine No.
     */
    public void setVehicleEngineCode(String VehicleEngineCode) {
        this.VehicleEngineCode = VehicleEngineCode;
    }

    /**
     * Get No. of the certificate of conformity 
     * @return CertificateNumber No. of the certificate of conformity
     */
    public String getCertificateNumber() {
        return this.CertificateNumber;
    }

    /**
     * Set No. of the certificate of conformity
     * @param CertificateNumber No. of the certificate of conformity
     */
    public void setCertificateNumber(String CertificateNumber) {
        this.CertificateNumber = CertificateNumber;
    }

    /**
     * Get Inspection No. 
     * @return InspectionNumber Inspection No.
     */
    public String getInspectionNumber() {
        return this.InspectionNumber;
    }

    /**
     * Set Inspection No.
     * @param InspectionNumber Inspection No.
     */
    public void setInspectionNumber(String InspectionNumber) {
        this.InspectionNumber = InspectionNumber;
    }

    /**
     * Get Machine No. 
     * @return MachineID Machine No.
     */
    public String getMachineID() {
        return this.MachineID;
    }

    /**
     * Set Machine No.
     * @param MachineID Machine No.
     */
    public void setMachineID(String MachineID) {
        this.MachineID = MachineID;
    }

    /**
     * Get Vehicle type 
     * @return VehicleType Vehicle type
     */
    public String getVehicleType() {
        return this.VehicleType;
    }

    /**
     * Set Vehicle type
     * @param VehicleType Vehicle type
     */
    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
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
     * Get Tax rate 
     * @return TaxRate Tax rate
     */
    public String getTaxRate() {
        return this.TaxRate;
    }

    /**
     * Set Tax rate
     * @param TaxRate Tax rate
     */
    public void setTaxRate(String TaxRate) {
        this.TaxRate = TaxRate;
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
     * Get Tonnage 
     * @return Tonnage Tonnage
     */
    public String getTonnage() {
        return this.Tonnage;
    }

    /**
     * Set Tonnage
     * @param Tonnage Tonnage
     */
    public void setTonnage(String Tonnage) {
        this.Tonnage = Tonnage;
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
     * Get Form name 
     * @return FormName Form name
     */
    public String getFormName() {
        return this.FormName;
    }

    /**
     * Set Form name
     * @param FormName Form name
     */
    public void setFormName(String FormName) {
        this.FormName = FormName;
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
     * Get Tax payment voucher number 
     * @return TaxNum Tax payment voucher number
     */
    public String getTaxNum() {
        return this.TaxNum;
    }

    /**
     * Set Tax payment voucher number
     * @param TaxNum Tax payment voucher number
     */
    public void setTaxNum(String TaxNum) {
        this.TaxNum = TaxNum;
    }

    /**
     * Get Passenger capacity 
     * @return MaxPeopleNum Passenger capacity
     */
    public String getMaxPeopleNum() {
        return this.MaxPeopleNum;
    }

    /**
     * Set Passenger capacity
     * @param MaxPeopleNum Passenger capacity
     */
    public void setMaxPeopleNum(String MaxPeopleNum) {
        this.MaxPeopleNum = MaxPeopleNum;
    }

    /**
     * Get Origin 
     * @return Origin Origin
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin
     * @param Origin Origin
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Machine-printed invoice code 
     * @return MachineCode Machine-printed invoice code
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set Machine-printed invoice code
     * @param MachineCode Machine-printed invoice code
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
    }

    /**
     * Get Machine-printed invoice number 
     * @return MachineNumber Machine-printed invoice number
     */
    public String getMachineNumber() {
        return this.MachineNumber;
    }

    /**
     * Set Machine-printed invoice number
     * @param MachineNumber Machine-printed invoice number
     */
    public void setMachineNumber(String MachineNumber) {
        this.MachineNumber = MachineNumber;
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

    public MotorVehicleSaleInvoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MotorVehicleSaleInvoice(MotorVehicleSaleInvoice source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
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
        if (source.PretaxAmount != null) {
            this.PretaxAmount = new String(source.PretaxAmount);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TotalCn != null) {
            this.TotalCn = new String(source.TotalCn);
        }
        if (source.Seller != null) {
            this.Seller = new String(source.Seller);
        }
        if (source.SellerTaxID != null) {
            this.SellerTaxID = new String(source.SellerTaxID);
        }
        if (source.SellerTel != null) {
            this.SellerTel = new String(source.SellerTel);
        }
        if (source.SellerAddress != null) {
            this.SellerAddress = new String(source.SellerAddress);
        }
        if (source.SellerBank != null) {
            this.SellerBank = new String(source.SellerBank);
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
        if (source.BuyerID != null) {
            this.BuyerID = new String(source.BuyerID);
        }
        if (source.TaxAuthorities != null) {
            this.TaxAuthorities = new String(source.TaxAuthorities);
        }
        if (source.TaxAuthoritiesCode != null) {
            this.TaxAuthoritiesCode = new String(source.TaxAuthoritiesCode);
        }
        if (source.VIN != null) {
            this.VIN = new String(source.VIN);
        }
        if (source.VehicleModel != null) {
            this.VehicleModel = new String(source.VehicleModel);
        }
        if (source.VehicleEngineCode != null) {
            this.VehicleEngineCode = new String(source.VehicleEngineCode);
        }
        if (source.CertificateNumber != null) {
            this.CertificateNumber = new String(source.CertificateNumber);
        }
        if (source.InspectionNumber != null) {
            this.InspectionNumber = new String(source.InspectionNumber);
        }
        if (source.MachineID != null) {
            this.MachineID = new String(source.MachineID);
        }
        if (source.VehicleType != null) {
            this.VehicleType = new String(source.VehicleType);
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
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.TaxRate != null) {
            this.TaxRate = new String(source.TaxRate);
        }
        if (source.CompanySealMark != null) {
            this.CompanySealMark = new Long(source.CompanySealMark);
        }
        if (source.Tonnage != null) {
            this.Tonnage = new String(source.Tonnage);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.FormType != null) {
            this.FormType = new String(source.FormType);
        }
        if (source.FormName != null) {
            this.FormName = new String(source.FormName);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.TaxNum != null) {
            this.TaxNum = new String(source.TaxNum);
        }
        if (source.MaxPeopleNum != null) {
            this.MaxPeopleNum = new String(source.MaxPeopleNum);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.MachineCode != null) {
            this.MachineCode = new String(source.MachineCode);
        }
        if (source.MachineNumber != null) {
            this.MachineNumber = new String(source.MachineNumber);
        }
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "PretaxAmount", this.PretaxAmount);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "Seller", this.Seller);
        this.setParamSimple(map, prefix + "SellerTaxID", this.SellerTaxID);
        this.setParamSimple(map, prefix + "SellerTel", this.SellerTel);
        this.setParamSimple(map, prefix + "SellerAddress", this.SellerAddress);
        this.setParamSimple(map, prefix + "SellerBank", this.SellerBank);
        this.setParamSimple(map, prefix + "SellerBankAccount", this.SellerBankAccount);
        this.setParamSimple(map, prefix + "Buyer", this.Buyer);
        this.setParamSimple(map, prefix + "BuyerTaxID", this.BuyerTaxID);
        this.setParamSimple(map, prefix + "BuyerID", this.BuyerID);
        this.setParamSimple(map, prefix + "TaxAuthorities", this.TaxAuthorities);
        this.setParamSimple(map, prefix + "TaxAuthoritiesCode", this.TaxAuthoritiesCode);
        this.setParamSimple(map, prefix + "VIN", this.VIN);
        this.setParamSimple(map, prefix + "VehicleModel", this.VehicleModel);
        this.setParamSimple(map, prefix + "VehicleEngineCode", this.VehicleEngineCode);
        this.setParamSimple(map, prefix + "CertificateNumber", this.CertificateNumber);
        this.setParamSimple(map, prefix + "InspectionNumber", this.InspectionNumber);
        this.setParamSimple(map, prefix + "MachineID", this.MachineID);
        this.setParamSimple(map, prefix + "VehicleType", this.VehicleType);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "TaxRate", this.TaxRate);
        this.setParamSimple(map, prefix + "CompanySealMark", this.CompanySealMark);
        this.setParamSimple(map, prefix + "Tonnage", this.Tonnage);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "FormType", this.FormType);
        this.setParamSimple(map, prefix + "FormName", this.FormName);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "TaxNum", this.TaxNum);
        this.setParamSimple(map, prefix + "MaxPeopleNum", this.MaxPeopleNum);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "MachineCode", this.MachineCode);
        this.setParamSimple(map, prefix + "MachineNumber", this.MachineNumber);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);

    }
}

