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

public class ComplexBillingItem extends AbstractModel {

    /**
    * <p>Composite billing dimensions</p>
    */
    @SerializedName("BillingAttributeList")
    @Expose
    private BillingAttribute [] BillingAttributeList;

    /**
    * <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>UNKNOW</td><td>0</td><td></td></tr><tr><td>TOKEN</td><td>1</td><td>TOKEN-based</td></tr><tr><td>PAGE_COUNT</td><td>2</td><td>By PAGE NUMBER</td></tr><tr><td>TIMES</td><td>3</td><td>TIMES-based</td></tr><tr><td>TIMES_THOUSAND</td><td>4</td><td>By THOUSAND TIMES</td></tr><tr><td>SECOND</td><td>5</td><td>Duration-based</td></tr><tr><td>CHARACTER</td><td>6</td><td>By NUMBER of characters</td></tr><tr><td>CHARACTER_THOUSAND</td><td>7</td><td>By THOUSAND characters</td></tr><tr><td>SHEET</td><td>8</td><td>By SHEET</td></tr><tr><td>NUMBER</td><td>9</td><td>By COUNT</td></tr></tbody></table>
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
    * <p>pu price</p><p>Unit: pu</p>
    */
    @SerializedName("PuPrice")
    @Expose
    private Float PuPrice;

    /**
     * Get <p>Composite billing dimensions</p> 
     * @return BillingAttributeList <p>Composite billing dimensions</p>
     */
    public BillingAttribute [] getBillingAttributeList() {
        return this.BillingAttributeList;
    }

    /**
     * Set <p>Composite billing dimensions</p>
     * @param BillingAttributeList <p>Composite billing dimensions</p>
     */
    public void setBillingAttributeList(BillingAttribute [] BillingAttributeList) {
        this.BillingAttributeList = BillingAttributeList;
    }

    /**
     * Get <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>UNKNOW</td><td>0</td><td></td></tr><tr><td>TOKEN</td><td>1</td><td>TOKEN-based</td></tr><tr><td>PAGE_COUNT</td><td>2</td><td>By PAGE NUMBER</td></tr><tr><td>TIMES</td><td>3</td><td>TIMES-based</td></tr><tr><td>TIMES_THOUSAND</td><td>4</td><td>By THOUSAND TIMES</td></tr><tr><td>SECOND</td><td>5</td><td>Duration-based</td></tr><tr><td>CHARACTER</td><td>6</td><td>By NUMBER of characters</td></tr><tr><td>CHARACTER_THOUSAND</td><td>7</td><td>By THOUSAND characters</td></tr><tr><td>SHEET</td><td>8</td><td>By SHEET</td></tr><tr><td>NUMBER</td><td>9</td><td>By COUNT</td></tr></tbody></table> 
     * @return BillingUnit <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>UNKNOW</td><td>0</td><td></td></tr><tr><td>TOKEN</td><td>1</td><td>TOKEN-based</td></tr><tr><td>PAGE_COUNT</td><td>2</td><td>By PAGE NUMBER</td></tr><tr><td>TIMES</td><td>3</td><td>TIMES-based</td></tr><tr><td>TIMES_THOUSAND</td><td>4</td><td>By THOUSAND TIMES</td></tr><tr><td>SECOND</td><td>5</td><td>Duration-based</td></tr><tr><td>CHARACTER</td><td>6</td><td>By NUMBER of characters</td></tr><tr><td>CHARACTER_THOUSAND</td><td>7</td><td>By THOUSAND characters</td></tr><tr><td>SHEET</td><td>8</td><td>By SHEET</td></tr><tr><td>NUMBER</td><td>9</td><td>By COUNT</td></tr></tbody></table>
     */
    public Long getBillingUnit() {
        return this.BillingUnit;
    }

    /**
     * Set <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>UNKNOW</td><td>0</td><td></td></tr><tr><td>TOKEN</td><td>1</td><td>TOKEN-based</td></tr><tr><td>PAGE_COUNT</td><td>2</td><td>By PAGE NUMBER</td></tr><tr><td>TIMES</td><td>3</td><td>TIMES-based</td></tr><tr><td>TIMES_THOUSAND</td><td>4</td><td>By THOUSAND TIMES</td></tr><tr><td>SECOND</td><td>5</td><td>Duration-based</td></tr><tr><td>CHARACTER</td><td>6</td><td>By NUMBER of characters</td></tr><tr><td>CHARACTER_THOUSAND</td><td>7</td><td>By THOUSAND characters</td></tr><tr><td>SHEET</td><td>8</td><td>By SHEET</td></tr><tr><td>NUMBER</td><td>9</td><td>By COUNT</td></tr></tbody></table>
     * @param BillingUnit <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>UNKNOW</td><td>0</td><td></td></tr><tr><td>TOKEN</td><td>1</td><td>TOKEN-based</td></tr><tr><td>PAGE_COUNT</td><td>2</td><td>By PAGE NUMBER</td></tr><tr><td>TIMES</td><td>3</td><td>TIMES-based</td></tr><tr><td>TIMES_THOUSAND</td><td>4</td><td>By THOUSAND TIMES</td></tr><tr><td>SECOND</td><td>5</td><td>Duration-based</td></tr><tr><td>CHARACTER</td><td>6</td><td>By NUMBER of characters</td></tr><tr><td>CHARACTER_THOUSAND</td><td>7</td><td>By THOUSAND characters</td></tr><tr><td>SHEET</td><td>8</td><td>By SHEET</td></tr><tr><td>NUMBER</td><td>9</td><td>By COUNT</td></tr></tbody></table>
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
     * Get <p>pu price</p><p>Unit: pu</p> 
     * @return PuPrice <p>pu price</p><p>Unit: pu</p>
     */
    public Float getPuPrice() {
        return this.PuPrice;
    }

    /**
     * Set <p>pu price</p><p>Unit: pu</p>
     * @param PuPrice <p>pu price</p><p>Unit: pu</p>
     */
    public void setPuPrice(Float PuPrice) {
        this.PuPrice = PuPrice;
    }

    public ComplexBillingItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplexBillingItem(ComplexBillingItem source) {
        if (source.BillingAttributeList != null) {
            this.BillingAttributeList = new BillingAttribute[source.BillingAttributeList.length];
            for (int i = 0; i < source.BillingAttributeList.length; i++) {
                this.BillingAttributeList[i] = new BillingAttribute(source.BillingAttributeList[i]);
            }
        }
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
        this.setParamArrayObj(map, prefix + "BillingAttributeList.", this.BillingAttributeList);
        this.setParamSimple(map, prefix + "BillingUnit", this.BillingUnit);
        this.setParamSimple(map, prefix + "CashPrice", this.CashPrice);
        this.setParamSimple(map, prefix + "PuPrice", this.PuPrice);

    }
}

