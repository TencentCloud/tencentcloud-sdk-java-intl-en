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

public class VatInvoiceItemInfo extends AbstractModel{

    /**
    * Item name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Specification
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * Unit
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Quantity
    */
    @SerializedName("Quantity")
    @Expose
    private String Quantity;

    /**
    * Unit price
    */
    @SerializedName("Price")
    @Expose
    private String Price;

    /**
    * Amount
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * Tax rate
    */
    @SerializedName("TaxRate")
    @Expose
    private String TaxRate;

    /**
    * Tax amount
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * Start date
    */
    @SerializedName("DateStart")
    @Expose
    private String DateStart;

    /**
    * End date
    */
    @SerializedName("DateEnd")
    @Expose
    private String DateEnd;

    /**
    * License plate number
    */
    @SerializedName("LicensePlate")
    @Expose
    private String LicensePlate;

    /**
    * Vehicle type
    */
    @SerializedName("VehicleType")
    @Expose
    private String VehicleType;

    /**
     * Get Item name 
     * @return Name Item name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Item name
     * @param Name Item name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Specification 
     * @return Specification Specification
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set Specification
     * @param Specification Specification
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get Unit 
     * @return Unit Unit
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Unit
     * @param Unit Unit
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get Quantity 
     * @return Quantity Quantity
     */
    public String getQuantity() {
        return this.Quantity;
    }

    /**
     * Set Quantity
     * @param Quantity Quantity
     */
    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get Unit price 
     * @return Price Unit price
     */
    public String getPrice() {
        return this.Price;
    }

    /**
     * Set Unit price
     * @param Price Unit price
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * Get Amount 
     * @return Total Amount
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set Amount
     * @param Total Amount
     */
    public void setTotal(String Total) {
        this.Total = Total;
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
     * Get Tax amount 
     * @return Tax Tax amount
     */
    public String getTax() {
        return this.Tax;
    }

    /**
     * Set Tax amount
     * @param Tax Tax amount
     */
    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    /**
     * Get Start date 
     * @return DateStart Start date
     */
    public String getDateStart() {
        return this.DateStart;
    }

    /**
     * Set Start date
     * @param DateStart Start date
     */
    public void setDateStart(String DateStart) {
        this.DateStart = DateStart;
    }

    /**
     * Get End date 
     * @return DateEnd End date
     */
    public String getDateEnd() {
        return this.DateEnd;
    }

    /**
     * Set End date
     * @param DateEnd End date
     */
    public void setDateEnd(String DateEnd) {
        this.DateEnd = DateEnd;
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

    public VatInvoiceItemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatInvoiceItemInfo(VatInvoiceItemInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Quantity != null) {
            this.Quantity = new String(source.Quantity);
        }
        if (source.Price != null) {
            this.Price = new String(source.Price);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TaxRate != null) {
            this.TaxRate = new String(source.TaxRate);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.DateStart != null) {
            this.DateStart = new String(source.DateStart);
        }
        if (source.DateEnd != null) {
            this.DateEnd = new String(source.DateEnd);
        }
        if (source.LicensePlate != null) {
            this.LicensePlate = new String(source.LicensePlate);
        }
        if (source.VehicleType != null) {
            this.VehicleType = new String(source.VehicleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TaxRate", this.TaxRate);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "DateStart", this.DateStart);
        this.setParamSimple(map, prefix + "DateEnd", this.DateEnd);
        this.setParamSimple(map, prefix + "LicensePlate", this.LicensePlate);
        this.setParamSimple(map, prefix + "VehicleType", this.VehicleType);

    }
}

