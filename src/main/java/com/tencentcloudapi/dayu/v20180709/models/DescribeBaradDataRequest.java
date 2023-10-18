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

public class DescribeBaradDataRequest extends AbstractModel {

    /**
    * Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate
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
connum: number of active TCP connections;
new_conn: number of new TCP connections;
inactive_conn: number of inactive connections;
intraffic: inbound traffic;
outtraffic: outbound traffic;
alltraffic: sum of inbound and outbound traffic;
inpkg: inbound packet rate;
outpkg: outbound packet rate;
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Statistical time granularity in seconds (300: 5-minute, 3600: hourly, 86400: daily)
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
    * Statistical method. Valid values:
max: maximum value;
min: minimum value;
avg: average;
    */
    @SerializedName("Statistics")
    @Expose
    private String Statistics;

    /**
    * Protocol port array
    */
    @SerializedName("ProtocolPort")
    @Expose
    private ProtocolPort [] ProtocolPort;

    /**
    * Resource instance IP, which is required only if `Business` is `net` (Anti-DDoS Ultimate), because an Anti-DDoS Ultimate instance has multiple IPs;
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
     * Get Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate 
     * @return Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate
     * @param Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate
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
connum: number of active TCP connections;
new_conn: number of new TCP connections;
inactive_conn: number of inactive connections;
intraffic: inbound traffic;
outtraffic: outbound traffic;
alltraffic: sum of inbound and outbound traffic;
inpkg: inbound packet rate;
outpkg: outbound packet rate; 
     * @return MetricName Metric name. Valid values:
connum: number of active TCP connections;
new_conn: number of new TCP connections;
inactive_conn: number of inactive connections;
intraffic: inbound traffic;
outtraffic: outbound traffic;
alltraffic: sum of inbound and outbound traffic;
inpkg: inbound packet rate;
outpkg: outbound packet rate;
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name. Valid values:
connum: number of active TCP connections;
new_conn: number of new TCP connections;
inactive_conn: number of inactive connections;
intraffic: inbound traffic;
outtraffic: outbound traffic;
alltraffic: sum of inbound and outbound traffic;
inpkg: inbound packet rate;
outpkg: outbound packet rate;
     * @param MetricName Metric name. Valid values:
connum: number of active TCP connections;
new_conn: number of new TCP connections;
inactive_conn: number of inactive connections;
intraffic: inbound traffic;
outtraffic: outbound traffic;
alltraffic: sum of inbound and outbound traffic;
inpkg: inbound packet rate;
outpkg: outbound packet rate;
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Statistical time granularity in seconds (300: 5-minute, 3600: hourly, 86400: daily) 
     * @return Period Statistical time granularity in seconds (300: 5-minute, 3600: hourly, 86400: daily)
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Statistical time granularity in seconds (300: 5-minute, 3600: hourly, 86400: daily)
     * @param Period Statistical time granularity in seconds (300: 5-minute, 3600: hourly, 86400: daily)
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
     * Get Statistical method. Valid values:
max: maximum value;
min: minimum value;
avg: average; 
     * @return Statistics Statistical method. Valid values:
max: maximum value;
min: minimum value;
avg: average;
     */
    public String getStatistics() {
        return this.Statistics;
    }

    /**
     * Set Statistical method. Valid values:
max: maximum value;
min: minimum value;
avg: average;
     * @param Statistics Statistical method. Valid values:
max: maximum value;
min: minimum value;
avg: average;
     */
    public void setStatistics(String Statistics) {
        this.Statistics = Statistics;
    }

    /**
     * Get Protocol port array 
     * @return ProtocolPort Protocol port array
     */
    public ProtocolPort [] getProtocolPort() {
        return this.ProtocolPort;
    }

    /**
     * Set Protocol port array
     * @param ProtocolPort Protocol port array
     */
    public void setProtocolPort(ProtocolPort [] ProtocolPort) {
        this.ProtocolPort = ProtocolPort;
    }

    /**
     * Get Resource instance IP, which is required only if `Business` is `net` (Anti-DDoS Ultimate), because an Anti-DDoS Ultimate instance has multiple IPs; 
     * @return Ip Resource instance IP, which is required only if `Business` is `net` (Anti-DDoS Ultimate), because an Anti-DDoS Ultimate instance has multiple IPs;
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Resource instance IP, which is required only if `Business` is `net` (Anti-DDoS Ultimate), because an Anti-DDoS Ultimate instance has multiple IPs;
     * @param Ip Resource instance IP, which is required only if `Business` is `net` (Anti-DDoS Ultimate), because an Anti-DDoS Ultimate instance has multiple IPs;
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    public DescribeBaradDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaradDataRequest(DescribeBaradDataRequest source) {
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
        if (source.Statistics != null) {
            this.Statistics = new String(source.Statistics);
        }
        if (source.ProtocolPort != null) {
            this.ProtocolPort = new ProtocolPort[source.ProtocolPort.length];
            for (int i = 0; i < source.ProtocolPort.length; i++) {
                this.ProtocolPort[i] = new ProtocolPort(source.ProtocolPort[i]);
            }
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
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
        this.setParamSimple(map, prefix + "Statistics", this.Statistics);
        this.setParamArrayObj(map, prefix + "ProtocolPort.", this.ProtocolPort);
        this.setParamSimple(map, prefix + "Ip", this.Ip);

    }
}

