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

public class NodeRenewPriceDetail extends AbstractModel {

    /**
    * Billing type (1: monthly subscription, 3: committed use).
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * EMR resource ID.
    */
    @SerializedName("EmrResourceId")
    @Expose
    private String EmrResourceId;

    /**
    * Node type.
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Node private network IP.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Current expiration time.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Original price.
    */
    @SerializedName("OriginalCost")
    @Expose
    private Float OriginalCost;

    /**
    * Discount price.
    */
    @SerializedName("DiscountCost")
    @Expose
    private Float DiscountCost;

    /**
    * Node component renewal pricing list.
    */
    @SerializedName("RenewPriceDetails")
    @Expose
    private RenewPriceDetail [] RenewPriceDetails;

    /**
     * Get Billing type (1: monthly subscription, 3: committed use). 
     * @return ChargeType Billing type (1: monthly subscription, 3: committed use).
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Billing type (1: monthly subscription, 3: committed use).
     * @param ChargeType Billing type (1: monthly subscription, 3: committed use).
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get EMR resource ID. 
     * @return EmrResourceId EMR resource ID.
     */
    public String getEmrResourceId() {
        return this.EmrResourceId;
    }

    /**
     * Set EMR resource ID.
     * @param EmrResourceId EMR resource ID.
     */
    public void setEmrResourceId(String EmrResourceId) {
        this.EmrResourceId = EmrResourceId;
    }

    /**
     * Get Node type. 
     * @return NodeType Node type.
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type.
     * @param NodeType Node type.
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Node private network IP. 
     * @return Ip Node private network IP.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Node private network IP.
     * @param Ip Node private network IP.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Current expiration time. 
     * @return ExpireTime Current expiration time.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Current expiration time.
     * @param ExpireTime Current expiration time.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Original price. 
     * @return OriginalCost Original price.
     */
    public Float getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set Original price.
     * @param OriginalCost Original price.
     */
    public void setOriginalCost(Float OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get Discount price. 
     * @return DiscountCost Discount price.
     */
    public Float getDiscountCost() {
        return this.DiscountCost;
    }

    /**
     * Set Discount price.
     * @param DiscountCost Discount price.
     */
    public void setDiscountCost(Float DiscountCost) {
        this.DiscountCost = DiscountCost;
    }

    /**
     * Get Node component renewal pricing list. 
     * @return RenewPriceDetails Node component renewal pricing list.
     */
    public RenewPriceDetail [] getRenewPriceDetails() {
        return this.RenewPriceDetails;
    }

    /**
     * Set Node component renewal pricing list.
     * @param RenewPriceDetails Node component renewal pricing list.
     */
    public void setRenewPriceDetails(RenewPriceDetail [] RenewPriceDetails) {
        this.RenewPriceDetails = RenewPriceDetails;
    }

    public NodeRenewPriceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeRenewPriceDetail(NodeRenewPriceDetail source) {
        if (source.ChargeType != null) {
            this.ChargeType = new Long(source.ChargeType);
        }
        if (source.EmrResourceId != null) {
            this.EmrResourceId = new String(source.EmrResourceId);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.OriginalCost != null) {
            this.OriginalCost = new Float(source.OriginalCost);
        }
        if (source.DiscountCost != null) {
            this.DiscountCost = new Float(source.DiscountCost);
        }
        if (source.RenewPriceDetails != null) {
            this.RenewPriceDetails = new RenewPriceDetail[source.RenewPriceDetails.length];
            for (int i = 0; i < source.RenewPriceDetails.length; i++) {
                this.RenewPriceDetails[i] = new RenewPriceDetail(source.RenewPriceDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "EmrResourceId", this.EmrResourceId);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "OriginalCost", this.OriginalCost);
        this.setParamSimple(map, prefix + "DiscountCost", this.DiscountCost);
        this.setParamArrayObj(map, prefix + "RenewPriceDetails.", this.RenewPriceDetails);

    }
}

