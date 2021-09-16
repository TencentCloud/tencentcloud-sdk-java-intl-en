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

public class DescribeDDoSTrendRequest extends AbstractModel{

    /**
    * Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP); `net`: Anti-DDoS Ultimate; `basic`: Anti-DDoS Basic
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Instance IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Sampling period. Valid values: `300` (5 minutes), `3600` (one hour), `86400` (one day)
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Beginning of the time range for the query
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End of the time range for the query
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Metric. Valid values: `bps`: attack traffic bandwidth; `pps`: attack packet rate
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Instance ID. Leave this field empty when `Business` is `basic`, as basic protection does not require an instance.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP); `net`: Anti-DDoS Ultimate; `basic`: Anti-DDoS Basic 
     * @return Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP); `net`: Anti-DDoS Ultimate; `basic`: Anti-DDoS Basic
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP); `net`: Anti-DDoS Ultimate; `basic`: Anti-DDoS Basic
     * @param Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP); `net`: Anti-DDoS Ultimate; `basic`: Anti-DDoS Basic
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Instance IP 
     * @return Ip Instance IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Instance IP
     * @param Ip Instance IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Sampling period. Valid values: `300` (5 minutes), `3600` (one hour), `86400` (one day) 
     * @return Period Sampling period. Valid values: `300` (5 minutes), `3600` (one hour), `86400` (one day)
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Sampling period. Valid values: `300` (5 minutes), `3600` (one hour), `86400` (one day)
     * @param Period Sampling period. Valid values: `300` (5 minutes), `3600` (one hour), `86400` (one day)
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Beginning of the time range for the query 
     * @return StartTime Beginning of the time range for the query
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Beginning of the time range for the query
     * @param StartTime Beginning of the time range for the query
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End of the time range for the query 
     * @return EndTime End of the time range for the query
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End of the time range for the query
     * @param EndTime End of the time range for the query
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Metric. Valid values: `bps`: attack traffic bandwidth; `pps`: attack packet rate 
     * @return MetricName Metric. Valid values: `bps`: attack traffic bandwidth; `pps`: attack packet rate
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric. Valid values: `bps`: attack traffic bandwidth; `pps`: attack packet rate
     * @param MetricName Metric. Valid values: `bps`: attack traffic bandwidth; `pps`: attack packet rate
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Instance ID. Leave this field empty when `Business` is `basic`, as basic protection does not require an instance. 
     * @return Id Instance ID. Leave this field empty when `Business` is `basic`, as basic protection does not require an instance.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Instance ID. Leave this field empty when `Business` is `basic`, as basic protection does not require an instance.
     * @param Id Instance ID. Leave this field empty when `Business` is `basic`, as basic protection does not require an instance.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public DescribeDDoSTrendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDoSTrendRequest(DescribeDDoSTrendRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
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
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

