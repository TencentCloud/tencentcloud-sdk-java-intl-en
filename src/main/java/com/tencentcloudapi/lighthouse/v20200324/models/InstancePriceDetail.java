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

public class InstancePriceDetail extends AbstractModel {

    /**
    * Instance ID.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Price query information.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("InstancePrice")
    @Expose
    private InstancePrice InstancePrice;

    /**
    * Tiered-pricing details. The information of each tier includes the billable period, discount percentage, total price, discounted price, and discount details (`UserDiscount`, `CommonDiscount` and `FinalDiscount`).
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DiscountDetail")
    @Expose
    private DiscountDetail [] DiscountDetail;

    /**
     * Get Instance ID.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return InstanceId Instance ID.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
Note: This field may return `null`, indicating that no valid value was found.
     * @param InstanceId Instance ID.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Price query information.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return InstancePrice Price query information.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public InstancePrice getInstancePrice() {
        return this.InstancePrice;
    }

    /**
     * Set Price query information.
Note: This field may return `null`, indicating that no valid value was found.
     * @param InstancePrice Price query information.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setInstancePrice(InstancePrice InstancePrice) {
        this.InstancePrice = InstancePrice;
    }

    /**
     * Get Tiered-pricing details. The information of each tier includes the billable period, discount percentage, total price, discounted price, and discount details (`UserDiscount`, `CommonDiscount` and `FinalDiscount`).
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return DiscountDetail Tiered-pricing details. The information of each tier includes the billable period, discount percentage, total price, discounted price, and discount details (`UserDiscount`, `CommonDiscount` and `FinalDiscount`).
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public DiscountDetail [] getDiscountDetail() {
        return this.DiscountDetail;
    }

    /**
     * Set Tiered-pricing details. The information of each tier includes the billable period, discount percentage, total price, discounted price, and discount details (`UserDiscount`, `CommonDiscount` and `FinalDiscount`).
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param DiscountDetail Tiered-pricing details. The information of each tier includes the billable period, discount percentage, total price, discounted price, and discount details (`UserDiscount`, `CommonDiscount` and `FinalDiscount`).
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDiscountDetail(DiscountDetail [] DiscountDetail) {
        this.DiscountDetail = DiscountDetail;
    }

    public InstancePriceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstancePriceDetail(InstancePriceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstancePrice != null) {
            this.InstancePrice = new InstancePrice(source.InstancePrice);
        }
        if (source.DiscountDetail != null) {
            this.DiscountDetail = new DiscountDetail[source.DiscountDetail.length];
            for (int i = 0; i < source.DiscountDetail.length; i++) {
                this.DiscountDetail[i] = new DiscountDetail(source.DiscountDetail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "InstancePrice.", this.InstancePrice);
        this.setParamArrayObj(map, prefix + "DiscountDetail.", this.DiscountDetail);

    }
}

