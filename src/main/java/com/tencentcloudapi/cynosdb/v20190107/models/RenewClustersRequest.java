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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewClustersRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Renewal duration
    */
    @SerializedName("TimeSpan")
    @Expose
    private Float TimeSpan;

    /**
    * Time unit. y: year. m: month. d: day. h: hour. i: minute. s: second.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Transaction mode 0-Place order and pay 1-Place order
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

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
     * Get Renewal duration 
     * @return TimeSpan Renewal duration
     */
    public Float getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Renewal duration
     * @param TimeSpan Renewal duration
     */
    public void setTimeSpan(Float TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Time unit. y: year. m: month. d: day. h: hour. i: minute. s: second. 
     * @return TimeUnit Time unit. y: year. m: month. d: day. h: hour. i: minute. s: second.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Time unit. y: year. m: month. d: day. h: hour. i: minute. s: second.
     * @param TimeUnit Time unit. y: year. m: month. d: day. h: hour. i: minute. s: second.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Transaction mode 0-Place order and pay 1-Place order 
     * @return DealMode Transaction mode 0-Place order and pay 1-Place order
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set Transaction mode 0-Place order and pay 1-Place order
     * @param DealMode Transaction mode 0-Place order and pay 1-Place order
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    public RenewClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewClustersRequest(RenewClustersRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Float(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.DealMode != null) {
            this.DealMode = new Long(source.DealMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "DealMode", this.DealMode);

    }
}

