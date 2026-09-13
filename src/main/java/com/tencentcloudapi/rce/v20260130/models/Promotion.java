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

public class Promotion extends AbstractModel {

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
    * <p>The coupon(s) associated with the promotion</p>
    */
    @SerializedName("Coupon")
    @Expose
    private Coupon Coupon;

    /**
    * <p>The point(s) associated with the promotion</p>
    */
    @SerializedName("CreditPoint")
    @Expose
    private CreditPoint CreditPoint;

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
     * Get <p>The coupon(s) associated with the promotion</p> 
     * @return Coupon <p>The coupon(s) associated with the promotion</p>
     */
    public Coupon getCoupon() {
        return this.Coupon;
    }

    /**
     * Set <p>The coupon(s) associated with the promotion</p>
     * @param Coupon <p>The coupon(s) associated with the promotion</p>
     */
    public void setCoupon(Coupon Coupon) {
        this.Coupon = Coupon;
    }

    /**
     * Get <p>The point(s) associated with the promotion</p> 
     * @return CreditPoint <p>The point(s) associated with the promotion</p>
     */
    public CreditPoint getCreditPoint() {
        return this.CreditPoint;
    }

    /**
     * Set <p>The point(s) associated with the promotion</p>
     * @param CreditPoint <p>The point(s) associated with the promotion</p>
     */
    public void setCreditPoint(CreditPoint CreditPoint) {
        this.CreditPoint = CreditPoint;
    }

    public Promotion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Promotion(Promotion source) {
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
        if (source.Coupon != null) {
            this.Coupon = new Coupon(source.Coupon);
        }
        if (source.CreditPoint != null) {
            this.CreditPoint = new CreditPoint(source.CreditPoint);
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
        this.setParamObj(map, prefix + "Coupon.", this.Coupon);
        this.setParamObj(map, prefix + "CreditPoint.", this.CreditPoint);

    }
}

