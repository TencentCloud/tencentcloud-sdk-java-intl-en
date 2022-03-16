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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageRecords extends AbstractModel{

    /**
    * The amount used. The value of this parameter is the amount used (USD, rounded to 8 decimal places) multiplied by 100,000,000.
    */
    @SerializedName("UsedAmount")
    @Expose
    private Long UsedAmount;

    /**
    * The time when the voucher was used.
    */
    @SerializedName("UsedTime")
    @Expose
    private String UsedTime;

    /**
    * The details of the product purchased.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("UsageDetails")
    @Expose
    private UsageDetails [] UsageDetails;

    /**
     * Get The amount used. The value of this parameter is the amount used (USD, rounded to 8 decimal places) multiplied by 100,000,000. 
     * @return UsedAmount The amount used. The value of this parameter is the amount used (USD, rounded to 8 decimal places) multiplied by 100,000,000.
     */
    public Long getUsedAmount() {
        return this.UsedAmount;
    }

    /**
     * Set The amount used. The value of this parameter is the amount used (USD, rounded to 8 decimal places) multiplied by 100,000,000.
     * @param UsedAmount The amount used. The value of this parameter is the amount used (USD, rounded to 8 decimal places) multiplied by 100,000,000.
     */
    public void setUsedAmount(Long UsedAmount) {
        this.UsedAmount = UsedAmount;
    }

    /**
     * Get The time when the voucher was used. 
     * @return UsedTime The time when the voucher was used.
     */
    public String getUsedTime() {
        return this.UsedTime;
    }

    /**
     * Set The time when the voucher was used.
     * @param UsedTime The time when the voucher was used.
     */
    public void setUsedTime(String UsedTime) {
        this.UsedTime = UsedTime;
    }

    /**
     * Get The details of the product purchased.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return UsageDetails The details of the product purchased.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public UsageDetails [] getUsageDetails() {
        return this.UsageDetails;
    }

    /**
     * Set The details of the product purchased.
Note: This field may return `null`, indicating that no valid value was found.
     * @param UsageDetails The details of the product purchased.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setUsageDetails(UsageDetails [] UsageDetails) {
        this.UsageDetails = UsageDetails;
    }

    public UsageRecords() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageRecords(UsageRecords source) {
        if (source.UsedAmount != null) {
            this.UsedAmount = new Long(source.UsedAmount);
        }
        if (source.UsedTime != null) {
            this.UsedTime = new String(source.UsedTime);
        }
        if (source.UsageDetails != null) {
            this.UsageDetails = new UsageDetails[source.UsageDetails.length];
            for (int i = 0; i < source.UsageDetails.length; i++) {
                this.UsageDetails[i] = new UsageDetails(source.UsageDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsedAmount", this.UsedAmount);
        this.setParamSimple(map, prefix + "UsedTime", this.UsedTime);
        this.setParamArrayObj(map, prefix + "UsageDetails.", this.UsageDetails);

    }
}

