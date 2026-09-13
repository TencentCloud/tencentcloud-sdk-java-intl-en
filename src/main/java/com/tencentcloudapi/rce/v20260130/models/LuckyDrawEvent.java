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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LuckyDrawEvent extends AbstractModel {

    /**
    * <p>The ID of the promotion</p>
    */
    @SerializedName("PromotionId")
    @Expose
    private String PromotionId;

    /**
    * <p>The name of the promotion</p>
    */
    @SerializedName("PromotionName")
    @Expose
    private String PromotionName;

    /**
    * <p>The description of the promotion</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>The ID of the inviter</p>
    */
    @SerializedName("InviterUserId")
    @Expose
    private String InviterUserId;

    /**
    * <p>Number of lucky draw</p><p>Unit: count</p>
    */
    @SerializedName("LuckyDrawCount")
    @Expose
    private Long LuckyDrawCount;

    /**
    * <p>Type of lucky draw</p>
    */
    @SerializedName("LuckyDrawType")
    @Expose
    private String LuckyDrawType;

    /**
    * <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>The ID of the promotion</p> 
     * @return PromotionId <p>The ID of the promotion</p>
     */
    public String getPromotionId() {
        return this.PromotionId;
    }

    /**
     * Set <p>The ID of the promotion</p>
     * @param PromotionId <p>The ID of the promotion</p>
     */
    public void setPromotionId(String PromotionId) {
        this.PromotionId = PromotionId;
    }

    /**
     * Get <p>The name of the promotion</p> 
     * @return PromotionName <p>The name of the promotion</p>
     */
    public String getPromotionName() {
        return this.PromotionName;
    }

    /**
     * Set <p>The name of the promotion</p>
     * @param PromotionName <p>The name of the promotion</p>
     */
    public void setPromotionName(String PromotionName) {
        this.PromotionName = PromotionName;
    }

    /**
     * Get <p>The description of the promotion</p> 
     * @return Description <p>The description of the promotion</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>The description of the promotion</p>
     * @param Description <p>The description of the promotion</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>The ID of the inviter</p> 
     * @return InviterUserId <p>The ID of the inviter</p>
     */
    public String getInviterUserId() {
        return this.InviterUserId;
    }

    /**
     * Set <p>The ID of the inviter</p>
     * @param InviterUserId <p>The ID of the inviter</p>
     */
    public void setInviterUserId(String InviterUserId) {
        this.InviterUserId = InviterUserId;
    }

    /**
     * Get <p>Number of lucky draw</p><p>Unit: count</p> 
     * @return LuckyDrawCount <p>Number of lucky draw</p><p>Unit: count</p>
     */
    public Long getLuckyDrawCount() {
        return this.LuckyDrawCount;
    }

    /**
     * Set <p>Number of lucky draw</p><p>Unit: count</p>
     * @param LuckyDrawCount <p>Number of lucky draw</p><p>Unit: count</p>
     */
    public void setLuckyDrawCount(Long LuckyDrawCount) {
        this.LuckyDrawCount = LuckyDrawCount;
    }

    /**
     * Get <p>Type of lucky draw</p> 
     * @return LuckyDrawType <p>Type of lucky draw</p>
     */
    public String getLuckyDrawType() {
        return this.LuckyDrawType;
    }

    /**
     * Set <p>Type of lucky draw</p>
     * @param LuckyDrawType <p>Type of lucky draw</p>
     */
    public void setLuckyDrawType(String LuckyDrawType) {
        this.LuckyDrawType = LuckyDrawType;
    }

    /**
     * Get <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p> 
     * @return Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     * @param Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public LuckyDrawEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LuckyDrawEvent(LuckyDrawEvent source) {
        if (source.PromotionId != null) {
            this.PromotionId = new String(source.PromotionId);
        }
        if (source.PromotionName != null) {
            this.PromotionName = new String(source.PromotionName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InviterUserId != null) {
            this.InviterUserId = new String(source.InviterUserId);
        }
        if (source.LuckyDrawCount != null) {
            this.LuckyDrawCount = new Long(source.LuckyDrawCount);
        }
        if (source.LuckyDrawType != null) {
            this.LuckyDrawType = new String(source.LuckyDrawType);
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PromotionId", this.PromotionId);
        this.setParamSimple(map, prefix + "PromotionName", this.PromotionName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InviterUserId", this.InviterUserId);
        this.setParamSimple(map, prefix + "LuckyDrawCount", this.LuckyDrawCount);
        this.setParamSimple(map, prefix + "LuckyDrawType", this.LuckyDrawType);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

