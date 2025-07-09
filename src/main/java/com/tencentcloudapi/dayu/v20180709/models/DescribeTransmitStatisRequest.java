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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTransmitStatisRequest extends AbstractModel {

    /**
    * Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced, `net`: Anti-DDoS Ultimate, `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP)
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Anti-DDoS instance ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Metric name. Valid values:
traffic: traffic bandwidth;
pkg: packet rate;
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Statistical time granularity (300: 5-minute, 3600: hourly, 86400: daily)
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Statistics start time. The second part is kept at 0, and the minute part is a multiple of 5
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Statistics end time. The second part is kept at 0, and the minute part is a multiple of 5
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Resource IP, which is required and only supports one IP if `Business` is `bgp-multip`. If this field is left empty, all IPs of a resource instance will be counted by default. If the resource instance has multiple IPs (such as Anti-DDoS Ultimate), the statistical method is summation;
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
     * Get Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced, `net`: Anti-DDoS Ultimate, `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP) 
     * @return Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced, `net`: Anti-DDoS Ultimate, `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP)
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced, `net`: Anti-DDoS Ultimate, `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP)
     * @param Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced, `net`: Anti-DDoS Ultimate, `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP)
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Anti-DDoS instance ID 
     * @return Id Anti-DDoS instance ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Anti-DDoS instance ID
     * @param Id Anti-DDoS instance ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Metric name. Valid values:
traffic: traffic bandwidth;
pkg: packet rate; 
     * @return MetricName Metric name. Valid values:
traffic: traffic bandwidth;
pkg: packet rate;
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name. Valid values:
traffic: traffic bandwidth;
pkg: packet rate;
     * @param MetricName Metric name. Valid values:
traffic: traffic bandwidth;
pkg: packet rate;
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Statistical time granularity (300: 5-minute, 3600: hourly, 86400: daily) 
     * @return Period Statistical time granularity (300: 5-minute, 3600: hourly, 86400: daily)
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Statistical time granularity (300: 5-minute, 3600: hourly, 86400: daily)
     * @param Period Statistical time granularity (300: 5-minute, 3600: hourly, 86400: daily)
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Statistics start time. The second part is kept at 0, and the minute part is a multiple of 5 
     * @return StartTime Statistics start time. The second part is kept at 0, and the minute part is a multiple of 5
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Statistics start time. The second part is kept at 0, and the minute part is a multiple of 5
     * @param StartTime Statistics start time. The second part is kept at 0, and the minute part is a multiple of 5
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Statistics end time. The second part is kept at 0, and the minute part is a multiple of 5 
     * @return EndTime Statistics end time. The second part is kept at 0, and the minute part is a multiple of 5
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Statistics end time. The second part is kept at 0, and the minute part is a multiple of 5
     * @param EndTime Statistics end time. The second part is kept at 0, and the minute part is a multiple of 5
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Resource IP, which is required and only supports one IP if `Business` is `bgp-multip`. If this field is left empty, all IPs of a resource instance will be counted by default. If the resource instance has multiple IPs (such as Anti-DDoS Ultimate), the statistical method is summation; 
     * @return IpList Resource IP, which is required and only supports one IP if `Business` is `bgp-multip`. If this field is left empty, all IPs of a resource instance will be counted by default. If the resource instance has multiple IPs (such as Anti-DDoS Ultimate), the statistical method is summation;
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set Resource IP, which is required and only supports one IP if `Business` is `bgp-multip`. If this field is left empty, all IPs of a resource instance will be counted by default. If the resource instance has multiple IPs (such as Anti-DDoS Ultimate), the statistical method is summation;
     * @param IpList Resource IP, which is required and only supports one IP if `Business` is `bgp-multip`. If this field is left empty, all IPs of a resource instance will be counted by default. If the resource instance has multiple IPs (such as Anti-DDoS Ultimate), the statistical method is summation;
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    public DescribeTransmitStatisRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTransmitStatisRequest(DescribeTransmitStatisRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
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
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);

    }
}

