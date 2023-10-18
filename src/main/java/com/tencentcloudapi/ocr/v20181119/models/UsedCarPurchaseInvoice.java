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

public class UsedCarPurchaseInvoice extends AbstractModel {

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
    * Seller's phone number
    */
    @SerializedName("SellerTel")
    @Expose
    private String SellerTel;

    /**
    * Seller's company code/personal ID card number
    */
    @SerializedName("SellerTaxID")
    @Expose
    private String SellerTaxID;

    /**
    * Seller's address
    */
    @SerializedName("SellerAddress")
    @Expose
    private String SellerAddress;

    /**
    * Buyer's name
    */
    @SerializedName("Buyer")
    @Expose
    private String Buyer;

    /**
    * Buyer's company code/personal ID card number
    */
    @SerializedName("BuyerID")
    @Expose
    private String BuyerID;

    /**
    * Buyer's address
    */
    @SerializedName("BuyerAddress")
    @Expose
    private String BuyerAddress;

    /**
    * Buyer's phone number
    */
    @SerializedName("BuyerTel")
    @Expose
    private String BuyerTel;

    /**
    * Company (used car market) name
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * Company's taxpayer identification number
    */
    @SerializedName("CompanyTaxID")
    @Expose
    private String CompanyTaxID;

    /**
    * Company's account opening bank and account number
    */
    @SerializedName("CompanyBankAccount")
    @Expose
    private String CompanyBankAccount;

    /**
    * Company's phone number
    */
    @SerializedName("CompanyTel")
    @Expose
    private String CompanyTel;

    /**
    * Company's address
    */
    @SerializedName("CompanyAddress")
    @Expose
    private String CompanyAddress;

    /**
    * Name of the transfer-to department of motor vehicles
    */
    @SerializedName("TransferAdministrationName")
    @Expose
    private String TransferAdministrationName;

    /**
    * License plate number
    */
    @SerializedName("LicensePlate")
    @Expose
    private String LicensePlate;

    /**
    * Registration certificate No.
    */
    @SerializedName("RegistrationNumber")
    @Expose
    private String RegistrationNumber;

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
    * Vehicle type
    */
    @SerializedName("VehicleType")
    @Expose
    private String VehicleType;

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
    * Whether there is a company seal (0: No, 1: Yes)
    */
    @SerializedName("CompanySealMark")
    @Expose
    private Long CompanySealMark;

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
     * Get Seller's company code/personal ID card number 
     * @return SellerTaxID Seller's company code/personal ID card number
     */
    public String getSellerTaxID() {
        return this.SellerTaxID;
    }

    /**
     * Set Seller's company code/personal ID card number
     * @param SellerTaxID Seller's company code/personal ID card number
     */
    public void setSellerTaxID(String SellerTaxID) {
        this.SellerTaxID = SellerTaxID;
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
     * Get Buyer's company code/personal ID card number 
     * @return BuyerID Buyer's company code/personal ID card number
     */
    public String getBuyerID() {
        return this.BuyerID;
    }

    /**
     * Set Buyer's company code/personal ID card number
     * @param BuyerID Buyer's company code/personal ID card number
     */
    public void setBuyerID(String BuyerID) {
        this.BuyerID = BuyerID;
    }

    /**
     * Get Buyer's address 
     * @return BuyerAddress Buyer's address
     */
    public String getBuyerAddress() {
        return this.BuyerAddress;
    }

    /**
     * Set Buyer's address
     * @param BuyerAddress Buyer's address
     */
    public void setBuyerAddress(String BuyerAddress) {
        this.BuyerAddress = BuyerAddress;
    }

    /**
     * Get Buyer's phone number 
     * @return BuyerTel Buyer's phone number
     */
    public String getBuyerTel() {
        return this.BuyerTel;
    }

    /**
     * Set Buyer's phone number
     * @param BuyerTel Buyer's phone number
     */
    public void setBuyerTel(String BuyerTel) {
        this.BuyerTel = BuyerTel;
    }

    /**
     * Get Company (used car market) name 
     * @return CompanyName Company (used car market) name
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set Company (used car market) name
     * @param CompanyName Company (used car market) name
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get Company's taxpayer identification number 
     * @return CompanyTaxID Company's taxpayer identification number
     */
    public String getCompanyTaxID() {
        return this.CompanyTaxID;
    }

    /**
     * Set Company's taxpayer identification number
     * @param CompanyTaxID Company's taxpayer identification number
     */
    public void setCompanyTaxID(String CompanyTaxID) {
        this.CompanyTaxID = CompanyTaxID;
    }

    /**
     * Get Company's account opening bank and account number 
     * @return CompanyBankAccount Company's account opening bank and account number
     */
    public String getCompanyBankAccount() {
        return this.CompanyBankAccount;
    }

    /**
     * Set Company's account opening bank and account number
     * @param CompanyBankAccount Company's account opening bank and account number
     */
    public void setCompanyBankAccount(String CompanyBankAccount) {
        this.CompanyBankAccount = CompanyBankAccount;
    }

    /**
     * Get Company's phone number 
     * @return CompanyTel Company's phone number
     */
    public String getCompanyTel() {
        return this.CompanyTel;
    }

    /**
     * Set Company's phone number
     * @param CompanyTel Company's phone number
     */
    public void setCompanyTel(String CompanyTel) {
        this.CompanyTel = CompanyTel;
    }

    /**
     * Get Company's address 
     * @return CompanyAddress Company's address
     */
    public String getCompanyAddress() {
        return this.CompanyAddress;
    }

    /**
     * Set Company's address
     * @param CompanyAddress Company's address
     */
    public void setCompanyAddress(String CompanyAddress) {
        this.CompanyAddress = CompanyAddress;
    }

    /**
     * Get Name of the transfer-to department of motor vehicles 
     * @return TransferAdministrationName Name of the transfer-to department of motor vehicles
     */
    public String getTransferAdministrationName() {
        return this.TransferAdministrationName;
    }

    /**
     * Set Name of the transfer-to department of motor vehicles
     * @param TransferAdministrationName Name of the transfer-to department of motor vehicles
     */
    public void setTransferAdministrationName(String TransferAdministrationName) {
        this.TransferAdministrationName = TransferAdministrationName;
    }

    /**
     * Get License plate number 
     * @return LicensePlate License plate number
     */
    public String getLicensePlate() {
        return this.LicensePlate;
    }

    /**
     * Set License plate number
     * @param LicensePlate License plate number
     */
    public void setLicensePlate(String LicensePlate) {
        this.LicensePlate = LicensePlate;
    }

    /**
     * Get Registration certificate No. 
     * @return RegistrationNumber Registration certificate No.
     */
    public String getRegistrationNumber() {
        return this.RegistrationNumber;
    }

    /**
     * Set Registration certificate No.
     * @param RegistrationNumber Registration certificate No.
     */
    public void setRegistrationNumber(String RegistrationNumber) {
        this.RegistrationNumber = RegistrationNumber;
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

    public UsedCarPurchaseInvoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsedCarPurchaseInvoice(UsedCarPurchaseInvoice source) {
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
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TotalCn != null) {
            this.TotalCn = new String(source.TotalCn);
        }
        if (source.Seller != null) {
            this.Seller = new String(source.Seller);
        }
        if (source.SellerTel != null) {
            this.SellerTel = new String(source.SellerTel);
        }
        if (source.SellerTaxID != null) {
            this.SellerTaxID = new String(source.SellerTaxID);
        }
        if (source.SellerAddress != null) {
            this.SellerAddress = new String(source.SellerAddress);
        }
        if (source.Buyer != null) {
            this.Buyer = new String(source.Buyer);
        }
        if (source.BuyerID != null) {
            this.BuyerID = new String(source.BuyerID);
        }
        if (source.BuyerAddress != null) {
            this.BuyerAddress = new String(source.BuyerAddress);
        }
        if (source.BuyerTel != null) {
            this.BuyerTel = new String(source.BuyerTel);
        }
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.CompanyTaxID != null) {
            this.CompanyTaxID = new String(source.CompanyTaxID);
        }
        if (source.CompanyBankAccount != null) {
            this.CompanyBankAccount = new String(source.CompanyBankAccount);
        }
        if (source.CompanyTel != null) {
            this.CompanyTel = new String(source.CompanyTel);
        }
        if (source.CompanyAddress != null) {
            this.CompanyAddress = new String(source.CompanyAddress);
        }
        if (source.TransferAdministrationName != null) {
            this.TransferAdministrationName = new String(source.TransferAdministrationName);
        }
        if (source.LicensePlate != null) {
            this.LicensePlate = new String(source.LicensePlate);
        }
        if (source.RegistrationNumber != null) {
            this.RegistrationNumber = new String(source.RegistrationNumber);
        }
        if (source.VIN != null) {
            this.VIN = new String(source.VIN);
        }
        if (source.VehicleModel != null) {
            this.VehicleModel = new String(source.VehicleModel);
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
        if (source.VehicleType != null) {
            this.VehicleType = new String(source.VehicleType);
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
        if (source.CompanySealMark != null) {
            this.CompanySealMark = new Long(source.CompanySealMark);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "Seller", this.Seller);
        this.setParamSimple(map, prefix + "SellerTel", this.SellerTel);
        this.setParamSimple(map, prefix + "SellerTaxID", this.SellerTaxID);
        this.setParamSimple(map, prefix + "SellerAddress", this.SellerAddress);
        this.setParamSimple(map, prefix + "Buyer", this.Buyer);
        this.setParamSimple(map, prefix + "BuyerID", this.BuyerID);
        this.setParamSimple(map, prefix + "BuyerAddress", this.BuyerAddress);
        this.setParamSimple(map, prefix + "BuyerTel", this.BuyerTel);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "CompanyTaxID", this.CompanyTaxID);
        this.setParamSimple(map, prefix + "CompanyBankAccount", this.CompanyBankAccount);
        this.setParamSimple(map, prefix + "CompanyTel", this.CompanyTel);
        this.setParamSimple(map, prefix + "CompanyAddress", this.CompanyAddress);
        this.setParamSimple(map, prefix + "TransferAdministrationName", this.TransferAdministrationName);
        this.setParamSimple(map, prefix + "LicensePlate", this.LicensePlate);
        this.setParamSimple(map, prefix + "RegistrationNumber", this.RegistrationNumber);
        this.setParamSimple(map, prefix + "VIN", this.VIN);
        this.setParamSimple(map, prefix + "VehicleModel", this.VehicleModel);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "VehicleType", this.VehicleType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "FormType", this.FormType);
        this.setParamSimple(map, prefix + "FormName", this.FormName);
        this.setParamSimple(map, prefix + "CompanySealMark", this.CompanySealMark);

    }
}

