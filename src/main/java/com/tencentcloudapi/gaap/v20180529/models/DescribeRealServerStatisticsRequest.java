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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRealServerStatisticsRequest extends AbstractModel {

    /**
    * Origin server ID
    */
    @SerializedName("RealServerId")
    @Expose
    private String RealServerId;

    /**
    * Listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Layer-7 rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Statistics duration. Unit: hours. It only supports querying statistics for the past 1, 3, 6, 12, and 24 hours.
    */
    @SerializedName("WithinTime")
    @Expose
    private Long WithinTime;

    /**
    * Statistics start time, such as `2020-08-19 00:00:00`
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Statistics end time, such as `2020-08-19 23:59:59`
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Statistics granularity in seconds. Only 1-minute (60-second) and 5-minute (300-second) granularities are supported.
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
     * Get Origin server ID 
     * @return RealServerId Origin server ID
     */
    public String getRealServerId() {
        return this.RealServerId;
    }

    /**
     * Set Origin server ID
     * @param RealServerId Origin server ID
     */
    public void setRealServerId(String RealServerId) {
        this.RealServerId = RealServerId;
    }

    /**
     * Get Listener ID 
     * @return ListenerId Listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID
     * @param ListenerId Listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Layer-7 rule ID 
     * @return RuleId Layer-7 rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Layer-7 rule ID
     * @param RuleId Layer-7 rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Statistics duration. Unit: hours. It only supports querying statistics for the past 1, 3, 6, 12, and 24 hours. 
     * @return WithinTime Statistics duration. Unit: hours. It only supports querying statistics for the past 1, 3, 6, 12, and 24 hours.
     */
    public Long getWithinTime() {
        return this.WithinTime;
    }

    /**
     * Set Statistics duration. Unit: hours. It only supports querying statistics for the past 1, 3, 6, 12, and 24 hours.
     * @param WithinTime Statistics duration. Unit: hours. It only supports querying statistics for the past 1, 3, 6, 12, and 24 hours.
     */
    public void setWithinTime(Long WithinTime) {
        this.WithinTime = WithinTime;
    }

    /**
     * Get Statistics start time, such as `2020-08-19 00:00:00` 
     * @return StartTime Statistics start time, such as `2020-08-19 00:00:00`
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Statistics start time, such as `2020-08-19 00:00:00`
     * @param StartTime Statistics start time, such as `2020-08-19 00:00:00`
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Statistics end time, such as `2020-08-19 23:59:59` 
     * @return EndTime Statistics end time, such as `2020-08-19 23:59:59`
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Statistics end time, such as `2020-08-19 23:59:59`
     * @param EndTime Statistics end time, such as `2020-08-19 23:59:59`
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Statistics granularity in seconds. Only 1-minute (60-second) and 5-minute (300-second) granularities are supported. 
     * @return Granularity Statistics granularity in seconds. Only 1-minute (60-second) and 5-minute (300-second) granularities are supported.
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set Statistics granularity in seconds. Only 1-minute (60-second) and 5-minute (300-second) granularities are supported.
     * @param Granularity Statistics granularity in seconds. Only 1-minute (60-second) and 5-minute (300-second) granularities are supported.
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    public DescribeRealServerStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRealServerStatisticsRequest(DescribeRealServerStatisticsRequest source) {
        if (source.RealServerId != null) {
            this.RealServerId = new String(source.RealServerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.WithinTime != null) {
            this.WithinTime = new Long(source.WithinTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Granularity != null) {
            this.Granularity = new Long(source.Granularity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealServerId", this.RealServerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "WithinTime", this.WithinTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);

    }
}

