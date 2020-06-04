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
package com.tencentcloudapi.dayu.v20180709.models;

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
    * Anti-DDoS instance IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Metric. Valid values: [bps (attack traffic bandwidth), pps (attack packet rate)]
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Statistical granularity. Valid values: [300 (5-minute), 3600 (hourly), 86400 (daily)]
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Statistics start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Statistics end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Resource instance ID. If `Business` is `basic`, this field is not required (because Anti-DDoS Basic has no resource instance)
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
     * Get Anti-DDoS instance IP 
     * @return Ip Anti-DDoS instance IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Anti-DDoS instance IP
     * @param Ip Anti-DDoS instance IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Metric. Valid values: [bps (attack traffic bandwidth), pps (attack packet rate)] 
     * @return MetricName Metric. Valid values: [bps (attack traffic bandwidth), pps (attack packet rate)]
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric. Valid values: [bps (attack traffic bandwidth), pps (attack packet rate)]
     * @param MetricName Metric. Valid values: [bps (attack traffic bandwidth), pps (attack packet rate)]
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Statistical granularity. Valid values: [300 (5-minute), 3600 (hourly), 86400 (daily)] 
     * @return Period Statistical granularity. Valid values: [300 (5-minute), 3600 (hourly), 86400 (daily)]
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Statistical granularity. Valid values: [300 (5-minute), 3600 (hourly), 86400 (daily)]
     * @param Period Statistical granularity. Valid values: [300 (5-minute), 3600 (hourly), 86400 (daily)]
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Statistics start time 
     * @return StartTime Statistics start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Statistics start time
     * @param StartTime Statistics start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Statistics end time 
     * @return EndTime Statistics end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Statistics end time
     * @param EndTime Statistics end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Resource instance ID. If `Business` is `basic`, this field is not required (because Anti-DDoS Basic has no resource instance) 
     * @return Id Resource instance ID. If `Business` is `basic`, this field is not required (because Anti-DDoS Basic has no resource instance)
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Resource instance ID. If `Business` is `basic`, this field is not required (because Anti-DDoS Basic has no resource instance)
     * @param Id Resource instance ID. If `Business` is `basic`, this field is not required (because Anti-DDoS Basic has no resource instance)
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

