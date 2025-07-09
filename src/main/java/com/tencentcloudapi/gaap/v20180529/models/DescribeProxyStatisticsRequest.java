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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxyStatisticsRequest extends AbstractModel {

    /**
    * Connection ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Start time (2019-03-25 12:00:00)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time (2019-03-25 12:00:00)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Statistical metric name list. Valid values: `InBandwidth` (inbound bandwidth); `OutBandwidth` (outbound bandwidth); Concurrent (concurrence); `InPackets` (inbound packets); `OutPackets` (outbound packets); `PacketLoss` (packet loss rate); `Latency` (latency); `HttpQPS` (the number of HTTP requests); `HttpsQPS` (the number of HTTPS requests).
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * Monitoring granularity. It currently supports: 60, 300, 3,600, and 86,400. Unit: seconds.
Time range: ≤ 3 day. Supported minimum granularity: 60 seconds;
Time range: ≤ 7 day. Supported minimum granularity: 300 seconds;
Time range: ≤ 30 days. Supported minimum granularity: 36,00 seconds;
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
    * Specifies the ISP. Valid values: `CMCC`, `CUCC`, and `CTCC`. If it is not specified, all ISP data will be returned. Note that this field is valid only when a non-BGP connection is used.
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
     * Get Connection ID 
     * @return ProxyId Connection ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Connection ID
     * @param ProxyId Connection ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Start time (2019-03-25 12:00:00) 
     * @return StartTime Start time (2019-03-25 12:00:00)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time (2019-03-25 12:00:00)
     * @param StartTime Start time (2019-03-25 12:00:00)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time (2019-03-25 12:00:00) 
     * @return EndTime End time (2019-03-25 12:00:00)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time (2019-03-25 12:00:00)
     * @param EndTime End time (2019-03-25 12:00:00)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Statistical metric name list. Valid values: `InBandwidth` (inbound bandwidth); `OutBandwidth` (outbound bandwidth); Concurrent (concurrence); `InPackets` (inbound packets); `OutPackets` (outbound packets); `PacketLoss` (packet loss rate); `Latency` (latency); `HttpQPS` (the number of HTTP requests); `HttpsQPS` (the number of HTTPS requests). 
     * @return MetricNames Statistical metric name list. Valid values: `InBandwidth` (inbound bandwidth); `OutBandwidth` (outbound bandwidth); Concurrent (concurrence); `InPackets` (inbound packets); `OutPackets` (outbound packets); `PacketLoss` (packet loss rate); `Latency` (latency); `HttpQPS` (the number of HTTP requests); `HttpsQPS` (the number of HTTPS requests).
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Statistical metric name list. Valid values: `InBandwidth` (inbound bandwidth); `OutBandwidth` (outbound bandwidth); Concurrent (concurrence); `InPackets` (inbound packets); `OutPackets` (outbound packets); `PacketLoss` (packet loss rate); `Latency` (latency); `HttpQPS` (the number of HTTP requests); `HttpsQPS` (the number of HTTPS requests).
     * @param MetricNames Statistical metric name list. Valid values: `InBandwidth` (inbound bandwidth); `OutBandwidth` (outbound bandwidth); Concurrent (concurrence); `InPackets` (inbound packets); `OutPackets` (outbound packets); `PacketLoss` (packet loss rate); `Latency` (latency); `HttpQPS` (the number of HTTP requests); `HttpsQPS` (the number of HTTPS requests).
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get Monitoring granularity. It currently supports: 60, 300, 3,600, and 86,400. Unit: seconds.
Time range: ≤ 3 day. Supported minimum granularity: 60 seconds;
Time range: ≤ 7 day. Supported minimum granularity: 300 seconds;
Time range: ≤ 30 days. Supported minimum granularity: 36,00 seconds; 
     * @return Granularity Monitoring granularity. It currently supports: 60, 300, 3,600, and 86,400. Unit: seconds.
Time range: ≤ 3 day. Supported minimum granularity: 60 seconds;
Time range: ≤ 7 day. Supported minimum granularity: 300 seconds;
Time range: ≤ 30 days. Supported minimum granularity: 36,00 seconds;
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set Monitoring granularity. It currently supports: 60, 300, 3,600, and 86,400. Unit: seconds.
Time range: ≤ 3 day. Supported minimum granularity: 60 seconds;
Time range: ≤ 7 day. Supported minimum granularity: 300 seconds;
Time range: ≤ 30 days. Supported minimum granularity: 36,00 seconds;
     * @param Granularity Monitoring granularity. It currently supports: 60, 300, 3,600, and 86,400. Unit: seconds.
Time range: ≤ 3 day. Supported minimum granularity: 60 seconds;
Time range: ≤ 7 day. Supported minimum granularity: 300 seconds;
Time range: ≤ 30 days. Supported minimum granularity: 36,00 seconds;
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Get Specifies the ISP. Valid values: `CMCC`, `CUCC`, and `CTCC`. If it is not specified, all ISP data will be returned. Note that this field is valid only when a non-BGP connection is used. 
     * @return Isp Specifies the ISP. Valid values: `CMCC`, `CUCC`, and `CTCC`. If it is not specified, all ISP data will be returned. Note that this field is valid only when a non-BGP connection is used.
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set Specifies the ISP. Valid values: `CMCC`, `CUCC`, and `CTCC`. If it is not specified, all ISP data will be returned. Note that this field is valid only when a non-BGP connection is used.
     * @param Isp Specifies the ISP. Valid values: `CMCC`, `CUCC`, and `CTCC`. If it is not specified, all ISP data will be returned. Note that this field is valid only when a non-BGP connection is used.
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    public DescribeProxyStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxyStatisticsRequest(DescribeProxyStatisticsRequest source) {
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
        }
        if (source.Granularity != null) {
            this.Granularity = new Long(source.Granularity);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamSimple(map, prefix + "Isp", this.Isp);

    }
}

