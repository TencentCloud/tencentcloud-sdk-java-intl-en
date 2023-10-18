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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceRenewRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Validity period, which needs to be used together with `TimeUnit`.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Unit of validity period, which needs to be used together with `TimeSpan`. Valid values: `d` (day), `m` (month).
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Validity period, which needs to be used together with `TimeUnit`. 
     * @return TimeSpan Validity period, which needs to be used together with `TimeUnit`.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Validity period, which needs to be used together with `TimeUnit`.
     * @param TimeSpan Validity period, which needs to be used together with `TimeUnit`.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Unit of validity period, which needs to be used together with `TimeSpan`. Valid values: `d` (day), `m` (month). 
     * @return TimeUnit Unit of validity period, which needs to be used together with `TimeSpan`. Valid values: `d` (day), `m` (month).
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Unit of validity period, which needs to be used together with `TimeSpan`. Valid values: `d` (day), `m` (month).
     * @param TimeUnit Unit of validity period, which needs to be used together with `TimeSpan`. Valid values: `d` (day), `m` (month).
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    public InquirePriceRenewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceRenewRequest(InquirePriceRenewRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);

    }
}

