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

public class VatElectronicInfo extends AbstractModel {

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
    * Tax
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

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
    * Issuer
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Subtotal amount
    */
    @SerializedName("SubTotal")
    @Expose
    private String SubTotal;

    /**
    * Subtotal tax
    */
    @SerializedName("SubTax")
    @Expose
    private String SubTax;

    /**
    * Detailed items of an electronic invoice
    */
    @SerializedName("VatElectronicItems")
    @Expose
    private VatElectronicItemInfo [] VatElectronicItems;

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
     * Get Subtotal amount 
     * @return SubTotal Subtotal amount
     */
    public String getSubTotal() {
        return this.SubTotal;
    }

    /**
     * Set Subtotal amount
     * @param SubTotal Subtotal amount
     */
    public void setSubTotal(String SubTotal) {
        this.SubTotal = SubTotal;
    }

    /**
     * Get Subtotal tax 
     * @return SubTax Subtotal tax
     */
    public String getSubTax() {
        return this.SubTax;
    }

    /**
     * Set Subtotal tax
     * @param SubTax Subtotal tax
     */
    public void setSubTax(String SubTax) {
        this.SubTax = SubTax;
    }

    /**
     * Get Detailed items of an electronic invoice 
     * @return VatElectronicItems Detailed items of an electronic invoice
     */
    public VatElectronicItemInfo [] getVatElectronicItems() {
        return this.VatElectronicItems;
    }

    /**
     * Set Detailed items of an electronic invoice
     * @param VatElectronicItems Detailed items of an electronic invoice
     */
    public void setVatElectronicItems(VatElectronicItemInfo [] VatElectronicItems) {
        this.VatElectronicItems = VatElectronicItems;
    }

    public VatElectronicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatElectronicInfo(VatElectronicInfo source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
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
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
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
        if (source.Buyer != null) {
            this.Buyer = new String(source.Buyer);
        }
        if (source.BuyerTaxID != null) {
            this.BuyerTaxID = new String(source.BuyerTaxID);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SubTotal != null) {
            this.SubTotal = new String(source.SubTotal);
        }
        if (source.SubTax != null) {
            this.SubTax = new String(source.SubTax);
        }
        if (source.VatElectronicItems != null) {
            this.VatElectronicItems = new VatElectronicItemInfo[source.VatElectronicItems.length];
            for (int i = 0; i < source.VatElectronicItems.length; i++) {
                this.VatElectronicItems[i] = new VatElectronicItemInfo(source.VatElectronicItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "PretaxAmount", this.PretaxAmount);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "Seller", this.Seller);
        this.setParamSimple(map, prefix + "SellerTaxID", this.SellerTaxID);
        this.setParamSimple(map, prefix + "Buyer", this.Buyer);
        this.setParamSimple(map, prefix + "BuyerTaxID", this.BuyerTaxID);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SubTotal", this.SubTotal);
        this.setParamSimple(map, prefix + "SubTax", this.SubTax);
        this.setParamArrayObj(map, prefix + "VatElectronicItems.", this.VatElectronicItems);

    }
}

