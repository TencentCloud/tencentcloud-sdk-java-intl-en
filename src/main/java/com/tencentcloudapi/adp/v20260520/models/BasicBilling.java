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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BasicBilling extends AbstractModel {

    /**
    * <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>UNKNOW</td><td>0</td><td></td></tr><tr><td>TOKEN</td><td>1</td><td>By token</td></tr><tr><td>PAGE_COUNT</td><td>2</td><td>By page number</td></tr><tr><td>TIMES</td><td>3</td><td>By times</td></tr><tr><td>TIMES_THOUSAND</td><td>4</td><td>By thousand times</td></tr><tr><td>SECOND</td><td>5</td><td>By duration</td></tr><tr><td>CHARACTER</td><td>6</td><td>By number of characters</td></tr><tr><td>CHARACTER_THOUSAND</td><td>7</td><td>By thousand characters</td></tr><tr><td>SHEET</td><td>8</td><td>By sheet</td></tr><tr><td>NUMBER</td><td>9</td><td>By count</td></tr></tbody></table>
    */
    @SerializedName("BillingUnit")
    @Expose
    private Long BillingUnit;

    /**
    * <p>Cash price</p><p>Unit: CNY</p>
    */
    @SerializedName("CashPrice")
    @Expose
    private Float CashPrice;

    /**
    * <p>PU price</p><p>Unit: pu</p>
    */
    @SerializedName("PuPrice")
    @Expose
    private Float PuPrice;

    /**
     * Get <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>UNKNOW</td><td>0</td><td></td></tr><tr><td>TOKEN</td><td>1</td><td>By token</td></tr><tr><td>PAGE_COUNT</td><td>2</td><td>By page number</td></tr><tr><td>TIMES</td><td>3</td><td>By times</td></tr><tr><td>TIMES_THOUSAND</td><td>4</td><td>By thousand times</td></tr><tr><td>SECOND</td><td>5</td><td>By duration</td></tr><tr><td>CHARACTER</td><td>6</td><td>By number of characters</td></tr><tr><td>CHARACTER_THOUSAND</td><td>7</td><td>By thousand characters</td></tr><tr><td>SHEET</td><td>8</td><td>By sheet</td></tr><tr><td>NUMBER</td><td>9</td><td>By count</td></tr></tbody></table> 
     * @return BillingUnit <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>UNKNOW</td><td>0</td><td></td></tr><tr><td>TOKEN</td><td>1</td><td>By token</td></tr><tr><td>PAGE_COUNT</td><td>2</td><td>By page number</td></tr><tr><td>TIMES</td><td>3</td><td>By times</td></tr><tr><td>TIMES_THOUSAND</td><td>4</td><td>By thousand times</td></tr><tr><td>SECOND</td><td>5</td><td>By duration</td></tr><tr><td>CHARACTER</td><td>6</td><td>By number of characters</td></tr><tr><td>CHARACTER_THOUSAND</td><td>7</td><td>By thousand characters</td></tr><tr><td>SHEET</td><td>8</td><td>By sheet</td></tr><tr><td>NUMBER</td><td>9</td><td>By count</td></tr></tbody></table>
     */
    public Long getBillingUnit() {
        return this.BillingUnit;
    }

    /**
     * Set <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>UNKNOW</td><td>0</td><td></td></tr><tr><td>TOKEN</td><td>1</td><td>By token</td></tr><tr><td>PAGE_COUNT</td><td>2</td><td>By page number</td></tr><tr><td>TIMES</td><td>3</td><td>By times</td></tr><tr><td>TIMES_THOUSAND</td><td>4</td><td>By thousand times</td></tr><tr><td>SECOND</td><td>5</td><td>By duration</td></tr><tr><td>CHARACTER</td><td>6</td><td>By number of characters</td></tr><tr><td>CHARACTER_THOUSAND</td><td>7</td><td>By thousand characters</td></tr><tr><td>SHEET</td><td>8</td><td>By sheet</td></tr><tr><td>NUMBER</td><td>9</td><td>By count</td></tr></tbody></table>
     * @param BillingUnit <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>UNKNOW</td><td>0</td><td></td></tr><tr><td>TOKEN</td><td>1</td><td>By token</td></tr><tr><td>PAGE_COUNT</td><td>2</td><td>By page number</td></tr><tr><td>TIMES</td><td>3</td><td>By times</td></tr><tr><td>TIMES_THOUSAND</td><td>4</td><td>By thousand times</td></tr><tr><td>SECOND</td><td>5</td><td>By duration</td></tr><tr><td>CHARACTER</td><td>6</td><td>By number of characters</td></tr><tr><td>CHARACTER_THOUSAND</td><td>7</td><td>By thousand characters</td></tr><tr><td>SHEET</td><td>8</td><td>By sheet</td></tr><tr><td>NUMBER</td><td>9</td><td>By count</td></tr></tbody></table>
     */
    public void setBillingUnit(Long BillingUnit) {
        this.BillingUnit = BillingUnit;
    }

    /**
     * Get <p>Cash price</p><p>Unit: CNY</p> 
     * @return CashPrice <p>Cash price</p><p>Unit: CNY</p>
     */
    public Float getCashPrice() {
        return this.CashPrice;
    }

    /**
     * Set <p>Cash price</p><p>Unit: CNY</p>
     * @param CashPrice <p>Cash price</p><p>Unit: CNY</p>
     */
    public void setCashPrice(Float CashPrice) {
        this.CashPrice = CashPrice;
    }

    /**
     * Get <p>PU price</p><p>Unit: pu</p> 
     * @return PuPrice <p>PU price</p><p>Unit: pu</p>
     */
    public Float getPuPrice() {
        return this.PuPrice;
    }

    /**
     * Set <p>PU price</p><p>Unit: pu</p>
     * @param PuPrice <p>PU price</p><p>Unit: pu</p>
     */
    public void setPuPrice(Float PuPrice) {
        this.PuPrice = PuPrice;
    }

    public BasicBilling() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BasicBilling(BasicBilling source) {
        if (source.BillingUnit != null) {
            this.BillingUnit = new Long(source.BillingUnit);
        }
        if (source.CashPrice != null) {
            this.CashPrice = new Float(source.CashPrice);
        }
        if (source.PuPrice != null) {
            this.PuPrice = new Float(source.PuPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BillingUnit", this.BillingUnit);
        this.setParamSimple(map, prefix + "CashPrice", this.CashPrice);
        this.setParamSimple(map, prefix + "PuPrice", this.PuPrice);

    }
}

