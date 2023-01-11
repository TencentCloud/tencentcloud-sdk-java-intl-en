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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PartDetailPriceItem extends AbstractModel{

    /**
    * The type. Valid values: `node` (node); `rootDisk` (system disk); `dataDisk` and `metaDB` (cloud data disk)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Rate (original)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Price")
    @Expose
    private Float Price;

    /**
    * Rate (discounted)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealCost")
    @Expose
    private Float RealCost;

    /**
    * Total price (discounted)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealTotalCost")
    @Expose
    private Float RealTotalCost;

    /**
    * Discount
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Policy")
    @Expose
    private Float Policy;

    /**
    * Quantity
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
     * Get The type. Valid values: `node` (node); `rootDisk` (system disk); `dataDisk` and `metaDB` (cloud data disk)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceType The type. Valid values: `node` (node); `rootDisk` (system disk); `dataDisk` and `metaDB` (cloud data disk)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set The type. Valid values: `node` (node); `rootDisk` (system disk); `dataDisk` and `metaDB` (cloud data disk)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceType The type. Valid values: `node` (node); `rootDisk` (system disk); `dataDisk` and `metaDB` (cloud data disk)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Rate (original)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Price Rate (original)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getPrice() {
        return this.Price;
    }

    /**
     * Set Rate (original)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Price Rate (original)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrice(Float Price) {
        this.Price = Price;
    }

    /**
     * Get Rate (discounted)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealCost Rate (discounted)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getRealCost() {
        return this.RealCost;
    }

    /**
     * Set Rate (discounted)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealCost Rate (discounted)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealCost(Float RealCost) {
        this.RealCost = RealCost;
    }

    /**
     * Get Total price (discounted)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealTotalCost Total price (discounted)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set Total price (discounted)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealTotalCost Total price (discounted)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealTotalCost(Float RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get Discount
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Policy Discount
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getPolicy() {
        return this.Policy;
    }

    /**
     * Set Discount
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Policy Discount
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicy(Float Policy) {
        this.Policy = Policy;
    }

    /**
     * Get Quantity
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GoodsNum Quantity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Quantity
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GoodsNum Quantity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    public PartDetailPriceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PartDetailPriceItem(PartDetailPriceItem source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Price != null) {
            this.Price = new Float(source.Price);
        }
        if (source.RealCost != null) {
            this.RealCost = new Float(source.RealCost);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new Float(source.RealTotalCost);
        }
        if (source.Policy != null) {
            this.Policy = new Float(source.Policy);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "RealCost", this.RealCost);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);

    }
}

