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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBgpBizTrendRequest extends AbstractModel{

    /**
    * Anti-DDoS service code. `bgp-multip` indicates Anti-DDos Pro.
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Beginning of the time range for the query, such as `2020-09-22 00:00:00`.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End of the time range for the query, such as `2020-09-22 00:00:00`.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Statistical metric. Values: `intraffic`, `outtraffic`, `inpkg`, and `outpkg`.
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * `0`: Fixed time. `1`: Custom time.
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
     * Get Anti-DDoS service code. `bgp-multip` indicates Anti-DDos Pro. 
     * @return Business Anti-DDoS service code. `bgp-multip` indicates Anti-DDos Pro.
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service code. `bgp-multip` indicates Anti-DDos Pro.
     * @param Business Anti-DDoS service code. `bgp-multip` indicates Anti-DDos Pro.
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Beginning of the time range for the query, such as `2020-09-22 00:00:00`. 
     * @return StartTime Beginning of the time range for the query, such as `2020-09-22 00:00:00`.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Beginning of the time range for the query, such as `2020-09-22 00:00:00`.
     * @param StartTime Beginning of the time range for the query, such as `2020-09-22 00:00:00`.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End of the time range for the query, such as `2020-09-22 00:00:00`. 
     * @return EndTime End of the time range for the query, such as `2020-09-22 00:00:00`.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End of the time range for the query, such as `2020-09-22 00:00:00`.
     * @param EndTime End of the time range for the query, such as `2020-09-22 00:00:00`.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Statistical metric. Values: `intraffic`, `outtraffic`, `inpkg`, and `outpkg`. 
     * @return MetricName Statistical metric. Values: `intraffic`, `outtraffic`, `inpkg`, and `outpkg`.
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Statistical metric. Values: `intraffic`, `outtraffic`, `inpkg`, and `outpkg`.
     * @param MetricName Statistical metric. Values: `intraffic`, `outtraffic`, `inpkg`, and `outpkg`.
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get `0`: Fixed time. `1`: Custom time. 
     * @return Flag `0`: Fixed time. `1`: Custom time.
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set `0`: Fixed time. `1`: Custom time.
     * @param Flag `0`: Fixed time. `1`: Custom time.
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    public DescribeBgpBizTrendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBgpBizTrendRequest(DescribeBgpBizTrendRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Flag != null) {
            this.Flag = new Long(source.Flag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Flag", this.Flag);

    }
}

