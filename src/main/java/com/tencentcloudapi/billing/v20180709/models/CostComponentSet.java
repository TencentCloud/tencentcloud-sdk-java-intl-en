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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CostComponentSet extends AbstractModel {

    /**
    * Component type name
    */
    @SerializedName("ComponentCodeName")
    @Expose
    private String ComponentCodeName;

    /**
    * Component name
    */
    @SerializedName("ItemCodeName")
    @Expose
    private String ItemCodeName;

    /**
    * List price
    */
    @SerializedName("SinglePrice")
    @Expose
    private String SinglePrice;

    /**
    * List price unit
    */
    @SerializedName("PriceUnit")
    @Expose
    private String PriceUnit;

    /**
    * Usage
    */
    @SerializedName("UsedAmount")
    @Expose
    private String UsedAmount;

    /**
    * Usage unit
    */
    @SerializedName("UsedAmountUnit")
    @Expose
    private String UsedAmountUnit;

    /**
    * Original price
    */
    @SerializedName("Cost")
    @Expose
    private String Cost;

    /**
    * Discount
    */
    @SerializedName("Discount")
    @Expose
    private String Discount;

    /**
    * Discounted price
    */
    @SerializedName("RealCost")
    @Expose
    private String RealCost;

    /**
    * Voucher payment amount
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * Cash payment amount
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * Bonus payment amount
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
     * Get Component type name 
     * @return ComponentCodeName Component type name
     */
    public String getComponentCodeName() {
        return this.ComponentCodeName;
    }

    /**
     * Set Component type name
     * @param ComponentCodeName Component type name
     */
    public void setComponentCodeName(String ComponentCodeName) {
        this.ComponentCodeName = ComponentCodeName;
    }

    /**
     * Get Component name 
     * @return ItemCodeName Component name
     */
    public String getItemCodeName() {
        return this.ItemCodeName;
    }

    /**
     * Set Component name
     * @param ItemCodeName Component name
     */
    public void setItemCodeName(String ItemCodeName) {
        this.ItemCodeName = ItemCodeName;
    }

    /**
     * Get List price 
     * @return SinglePrice List price
     */
    public String getSinglePrice() {
        return this.SinglePrice;
    }

    /**
     * Set List price
     * @param SinglePrice List price
     */
    public void setSinglePrice(String SinglePrice) {
        this.SinglePrice = SinglePrice;
    }

    /**
     * Get List price unit 
     * @return PriceUnit List price unit
     */
    public String getPriceUnit() {
        return this.PriceUnit;
    }

    /**
     * Set List price unit
     * @param PriceUnit List price unit
     */
    public void setPriceUnit(String PriceUnit) {
        this.PriceUnit = PriceUnit;
    }

    /**
     * Get Usage 
     * @return UsedAmount Usage
     */
    public String getUsedAmount() {
        return this.UsedAmount;
    }

    /**
     * Set Usage
     * @param UsedAmount Usage
     */
    public void setUsedAmount(String UsedAmount) {
        this.UsedAmount = UsedAmount;
    }

    /**
     * Get Usage unit 
     * @return UsedAmountUnit Usage unit
     */
    public String getUsedAmountUnit() {
        return this.UsedAmountUnit;
    }

    /**
     * Set Usage unit
     * @param UsedAmountUnit Usage unit
     */
    public void setUsedAmountUnit(String UsedAmountUnit) {
        this.UsedAmountUnit = UsedAmountUnit;
    }

    /**
     * Get Original price 
     * @return Cost Original price
     */
    public String getCost() {
        return this.Cost;
    }

    /**
     * Set Original price
     * @param Cost Original price
     */
    public void setCost(String Cost) {
        this.Cost = Cost;
    }

    /**
     * Get Discount 
     * @return Discount Discount
     */
    public String getDiscount() {
        return this.Discount;
    }

    /**
     * Set Discount
     * @param Discount Discount
     */
    public void setDiscount(String Discount) {
        this.Discount = Discount;
    }

    /**
     * Get Discounted price 
     * @return RealCost Discounted price
     */
    public String getRealCost() {
        return this.RealCost;
    }

    /**
     * Set Discounted price
     * @param RealCost Discounted price
     */
    public void setRealCost(String RealCost) {
        this.RealCost = RealCost;
    }

    /**
     * Get Voucher payment amount 
     * @return VoucherPayAmount Voucher payment amount
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set Voucher payment amount
     * @param VoucherPayAmount Voucher payment amount
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get Cash payment amount 
     * @return CashPayAmount Cash payment amount
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set Cash payment amount
     * @param CashPayAmount Cash payment amount
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get Bonus payment amount 
     * @return IncentivePayAmount Bonus payment amount
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set Bonus payment amount
     * @param IncentivePayAmount Bonus payment amount
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    public CostComponentSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CostComponentSet(CostComponentSet source) {
        if (source.ComponentCodeName != null) {
            this.ComponentCodeName = new String(source.ComponentCodeName);
        }
        if (source.ItemCodeName != null) {
            this.ItemCodeName = new String(source.ItemCodeName);
        }
        if (source.SinglePrice != null) {
            this.SinglePrice = new String(source.SinglePrice);
        }
        if (source.PriceUnit != null) {
            this.PriceUnit = new String(source.PriceUnit);
        }
        if (source.UsedAmount != null) {
            this.UsedAmount = new String(source.UsedAmount);
        }
        if (source.UsedAmountUnit != null) {
            this.UsedAmountUnit = new String(source.UsedAmountUnit);
        }
        if (source.Cost != null) {
            this.Cost = new String(source.Cost);
        }
        if (source.Discount != null) {
            this.Discount = new String(source.Discount);
        }
        if (source.RealCost != null) {
            this.RealCost = new String(source.RealCost);
        }
        if (source.VoucherPayAmount != null) {
            this.VoucherPayAmount = new String(source.VoucherPayAmount);
        }
        if (source.CashPayAmount != null) {
            this.CashPayAmount = new String(source.CashPayAmount);
        }
        if (source.IncentivePayAmount != null) {
            this.IncentivePayAmount = new String(source.IncentivePayAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentCodeName", this.ComponentCodeName);
        this.setParamSimple(map, prefix + "ItemCodeName", this.ItemCodeName);
        this.setParamSimple(map, prefix + "SinglePrice", this.SinglePrice);
        this.setParamSimple(map, prefix + "PriceUnit", this.PriceUnit);
        this.setParamSimple(map, prefix + "UsedAmount", this.UsedAmount);
        this.setParamSimple(map, prefix + "UsedAmountUnit", this.UsedAmountUnit);
        this.setParamSimple(map, prefix + "Cost", this.Cost);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "RealCost", this.RealCost);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);

    }
}

