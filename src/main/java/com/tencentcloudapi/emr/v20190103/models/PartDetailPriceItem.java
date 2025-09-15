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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PartDetailPriceItem extends AbstractModel {

    /**
    * Types, including node: node (denoting node), rootDisk (denoting system disk), dataDisk (denoting cloud data disk), and metaDB.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Unit price (original price).
    */
    @SerializedName("Price")
    @Expose
    private Float Price;

    /**
    * Unit price (discounted price).
    */
    @SerializedName("RealCost")
    @Expose
    private Float RealCost;

    /**
    * Total price (discounted price).
    */
    @SerializedName("RealTotalCost")
    @Expose
    private Float RealTotalCost;

    /**
    * Discount.
    */
    @SerializedName("Policy")
    @Expose
    private Float Policy;

    /**
    * Quantity.
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
     * Get Types, including node: node (denoting node), rootDisk (denoting system disk), dataDisk (denoting cloud data disk), and metaDB. 
     * @return InstanceType Types, including node: node (denoting node), rootDisk (denoting system disk), dataDisk (denoting cloud data disk), and metaDB.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Types, including node: node (denoting node), rootDisk (denoting system disk), dataDisk (denoting cloud data disk), and metaDB.
     * @param InstanceType Types, including node: node (denoting node), rootDisk (denoting system disk), dataDisk (denoting cloud data disk), and metaDB.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Unit price (original price). 
     * @return Price Unit price (original price).
     */
    public Float getPrice() {
        return this.Price;
    }

    /**
     * Set Unit price (original price).
     * @param Price Unit price (original price).
     */
    public void setPrice(Float Price) {
        this.Price = Price;
    }

    /**
     * Get Unit price (discounted price). 
     * @return RealCost Unit price (discounted price).
     */
    public Float getRealCost() {
        return this.RealCost;
    }

    /**
     * Set Unit price (discounted price).
     * @param RealCost Unit price (discounted price).
     */
    public void setRealCost(Float RealCost) {
        this.RealCost = RealCost;
    }

    /**
     * Get Total price (discounted price). 
     * @return RealTotalCost Total price (discounted price).
     */
    public Float getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set Total price (discounted price).
     * @param RealTotalCost Total price (discounted price).
     */
    public void setRealTotalCost(Float RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get Discount. 
     * @return Policy Discount.
     */
    public Float getPolicy() {
        return this.Policy;
    }

    /**
     * Set Discount.
     * @param Policy Discount.
     */
    public void setPolicy(Float Policy) {
        this.Policy = Policy;
    }

    /**
     * Get Quantity. 
     * @return GoodsNum Quantity.
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Quantity.
     * @param GoodsNum Quantity.
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

