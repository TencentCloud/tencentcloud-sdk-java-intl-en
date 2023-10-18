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

public class VatInvoiceRoll extends AbstractModel {

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
    * Check code
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

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
    * Category
    */
    @SerializedName("Category")
    @Expose
    private String Category;

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
    * Whether there is a QR code (0: No, 1: Yes)
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

    /**
    * Service type
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

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
    * Items
    */
    @SerializedName("VatRollItems")
    @Expose
    private VatRollItem [] VatRollItems;

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
     * Get Items 
     * @return VatRollItems Items
     */
    public VatRollItem [] getVatRollItems() {
        return this.VatRollItems;
    }

    /**
     * Set Items
     * @param VatRollItems Items
     */
    public void setVatRollItems(VatRollItem [] VatRollItems) {
        this.VatRollItems = VatRollItems;
    }

    public VatInvoiceRoll() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatInvoiceRoll(VatInvoiceRoll source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
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
        if (source.CheckCode != null) {
            this.CheckCode = new String(source.CheckCode);
        }
        if (source.Seller != null) {
            this.Seller = new String(source.Seller);
        }
        if (source.SellerTaxID != null) {
            this.SellerTaxID = new String(source.SellerTaxID);
        }
        if (source.Buyer != null) {
            this.Buyer = new String(source.Buyer);
        }
        if (source.BuyerTaxID != null) {
            this.BuyerTaxID = new String(source.BuyerTaxID);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TotalCn != null) {
            this.TotalCn = new String(source.TotalCn);
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
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.CompanySealContent != null) {
            this.CompanySealContent = new String(source.CompanySealContent);
        }
        if (source.TaxSealContent != null) {
            this.TaxSealContent = new String(source.TaxSealContent);
        }
        if (source.VatRollItems != null) {
            this.VatRollItems = new VatRollItem[source.VatRollItems.length];
            for (int i = 0; i < source.VatRollItems.length; i++) {
                this.VatRollItems[i] = new VatRollItem(source.VatRollItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "NumberConfirm", this.NumberConfirm);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "Seller", this.Seller);
        this.setParamSimple(map, prefix + "SellerTaxID", this.SellerTaxID);
        this.setParamSimple(map, prefix + "Buyer", this.Buyer);
        this.setParamSimple(map, prefix + "BuyerTaxID", this.BuyerTaxID);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "CompanySealMark", this.CompanySealMark);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "CompanySealContent", this.CompanySealContent);
        this.setParamSimple(map, prefix + "TaxSealContent", this.TaxSealContent);
        this.setParamArrayObj(map, prefix + "VatRollItems.", this.VatRollItems);

    }
}

