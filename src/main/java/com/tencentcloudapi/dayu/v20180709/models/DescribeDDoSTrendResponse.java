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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSTrendResponse extends AbstractModel {

    /**
    * Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP); `net`: Anti-DDoS Ultimate; `basic`: Anti-DDoS Basic
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Anti-DDoS instance ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Resource IP
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
    * Value array. The unit for attack traffic bandwidth is Mbps, and that for the packet rate is pps.
    */
    @SerializedName("Data")
    @Expose
    private Long [] Data;

    /**
    * Number of values
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get Anti-DDoS instance ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Id Anti-DDoS instance ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Anti-DDoS instance ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Id Anti-DDoS instance ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Resource IP 
     * @return Ip Resource IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Resource IP
     * @param Ip Resource IP
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
     * Get Value array. The unit for attack traffic bandwidth is Mbps, and that for the packet rate is pps. 
     * @return Data Value array. The unit for attack traffic bandwidth is Mbps, and that for the packet rate is pps.
     */
    public Long [] getData() {
        return this.Data;
    }

    /**
     * Set Value array. The unit for attack traffic bandwidth is Mbps, and that for the packet rate is pps.
     * @param Data Value array. The unit for attack traffic bandwidth is Mbps, and that for the packet rate is pps.
     */
    public void setData(Long [] Data) {
        this.Data = Data;
    }

    /**
     * Get Number of values 
     * @return Count Number of values
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of values
     * @param Count Number of values
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDDoSTrendResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDoSTrendResponse(DescribeDDoSTrendResponse source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
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
        if (source.Data != null) {
            this.Data = new Long[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new Long(source.Data[i]);
            }
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

