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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyDetail extends AbstractModel {

    /**
    * User discount.
    */
    @SerializedName("UserDiscount")
    @Expose
    private Long UserDiscount;

    /**
    * Public discount.
    */
    @SerializedName("CommonDiscount")
    @Expose
    private Long CommonDiscount;

    /**
    * Final discount.
    */
    @SerializedName("FinalDiscount")
    @Expose
    private Long FinalDiscount;

    /**
    * Activity discount. The value `null` indicates no discount.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ActivityDiscount")
    @Expose
    private Float ActivityDiscount;

    /**
    * Discount type.
Valid values: `user` (user discount), `common` (discount displayed on the official website), `activity` (activity discount), `null` (no discount).
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DiscountType")
    @Expose
    private String DiscountType;

    /**
     * Get User discount. 
     * @return UserDiscount User discount.
     */
    public Long getUserDiscount() {
        return this.UserDiscount;
    }

    /**
     * Set User discount.
     * @param UserDiscount User discount.
     */
    public void setUserDiscount(Long UserDiscount) {
        this.UserDiscount = UserDiscount;
    }

    /**
     * Get Public discount. 
     * @return CommonDiscount Public discount.
     */
    public Long getCommonDiscount() {
        return this.CommonDiscount;
    }

    /**
     * Set Public discount.
     * @param CommonDiscount Public discount.
     */
    public void setCommonDiscount(Long CommonDiscount) {
        this.CommonDiscount = CommonDiscount;
    }

    /**
     * Get Final discount. 
     * @return FinalDiscount Final discount.
     */
    public Long getFinalDiscount() {
        return this.FinalDiscount;
    }

    /**
     * Set Final discount.
     * @param FinalDiscount Final discount.
     */
    public void setFinalDiscount(Long FinalDiscount) {
        this.FinalDiscount = FinalDiscount;
    }

    /**
     * Get Activity discount. The value `null` indicates no discount.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ActivityDiscount Activity discount. The value `null` indicates no discount.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Float getActivityDiscount() {
        return this.ActivityDiscount;
    }

    /**
     * Set Activity discount. The value `null` indicates no discount.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ActivityDiscount Activity discount. The value `null` indicates no discount.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setActivityDiscount(Float ActivityDiscount) {
        this.ActivityDiscount = ActivityDiscount;
    }

    /**
     * Get Discount type.
Valid values: `user` (user discount), `common` (discount displayed on the official website), `activity` (activity discount), `null` (no discount).
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return DiscountType Discount type.
Valid values: `user` (user discount), `common` (discount displayed on the official website), `activity` (activity discount), `null` (no discount).
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDiscountType() {
        return this.DiscountType;
    }

    /**
     * Set Discount type.
Valid values: `user` (user discount), `common` (discount displayed on the official website), `activity` (activity discount), `null` (no discount).
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param DiscountType Discount type.
Valid values: `user` (user discount), `common` (discount displayed on the official website), `activity` (activity discount), `null` (no discount).
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDiscountType(String DiscountType) {
        this.DiscountType = DiscountType;
    }

    public PolicyDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyDetail(PolicyDetail source) {
        if (source.UserDiscount != null) {
            this.UserDiscount = new Long(source.UserDiscount);
        }
        if (source.CommonDiscount != null) {
            this.CommonDiscount = new Long(source.CommonDiscount);
        }
        if (source.FinalDiscount != null) {
            this.FinalDiscount = new Long(source.FinalDiscount);
        }
        if (source.ActivityDiscount != null) {
            this.ActivityDiscount = new Float(source.ActivityDiscount);
        }
        if (source.DiscountType != null) {
            this.DiscountType = new String(source.DiscountType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserDiscount", this.UserDiscount);
        this.setParamSimple(map, prefix + "CommonDiscount", this.CommonDiscount);
        this.setParamSimple(map, prefix + "FinalDiscount", this.FinalDiscount);
        this.setParamSimple(map, prefix + "ActivityDiscount", this.ActivityDiscount);
        this.setParamSimple(map, prefix + "DiscountType", this.DiscountType);

    }
}

