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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillingDataRequest extends AbstractModel {

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Site ID set. This parameter is required.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Metric list. Valid values:
<li>acc_flux: content acceleration traffic, in bytes;</li>
<li>smt_flux: smart acceleration traffic, in bytes;</li>
<li>l4_flux: L4 acceleration traffic, in bytes;</li>
<li>sec_flux: exclusive protection traffic, in bytes;</li>
<li>zxctg_flux: network optimization traffic in the Chinese mainland, in bytes;</li>
<li>acc_bandwidth: content acceleration bandwidth, in bps;</li>
<li>smt_bandwidth: smart acceleration bandwidth, in bps;</li>
<li>l4_bandwidth: L4 acceleration bandwidth, in bps;</li>
<li>sec_bandwidth: exclusive protection bandwidth, in bps;</li>
<li>zxctg_bandwidth: network optimization bandwidth in the Chinese mainland, in bps;</li>
<li>sec_request_clean: number of HTTP/HTTPS requests;</li>
<li>smt_request_clean: number of smart acceleration requests;</li>
<li>quic_request: number of QUIC requests;</li>
<li>bot_request_clean: number of Bot requests;</li>
<li>cls_count: number of real-time log entries pushed;</li>
<li>ddos_bandwidth: elastic DDoS protection bandwidth, in bps.</li>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Time granularity of the query. Valid values:
<li>5min: 5 minutes;</li>
<li>hour: 1 hour;</li>
<li>day: 1 day.</li>
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Filter criteria. The detailed values of filter criteria are as follows:
<li>host: Filter by domain name, such as test.example.com.<br></li>
<li>proxy-id: Filter by L4 proxy instance ID, such as sid-2rugn89bkla9.<br></li>
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>
    */
    @SerializedName("Filters")
    @Expose
    private BillingDataFilter [] Filters;

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Site ID set. This parameter is required. 
     * @return ZoneIds Site ID set. This parameter is required.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site ID set. This parameter is required.
     * @param ZoneIds Site ID set. This parameter is required.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Metric list. Valid values:
<li>acc_flux: content acceleration traffic, in bytes;</li>
<li>smt_flux: smart acceleration traffic, in bytes;</li>
<li>l4_flux: L4 acceleration traffic, in bytes;</li>
<li>sec_flux: exclusive protection traffic, in bytes;</li>
<li>zxctg_flux: network optimization traffic in the Chinese mainland, in bytes;</li>
<li>acc_bandwidth: content acceleration bandwidth, in bps;</li>
<li>smt_bandwidth: smart acceleration bandwidth, in bps;</li>
<li>l4_bandwidth: L4 acceleration bandwidth, in bps;</li>
<li>sec_bandwidth: exclusive protection bandwidth, in bps;</li>
<li>zxctg_bandwidth: network optimization bandwidth in the Chinese mainland, in bps;</li>
<li>sec_request_clean: number of HTTP/HTTPS requests;</li>
<li>smt_request_clean: number of smart acceleration requests;</li>
<li>quic_request: number of QUIC requests;</li>
<li>bot_request_clean: number of Bot requests;</li>
<li>cls_count: number of real-time log entries pushed;</li>
<li>ddos_bandwidth: elastic DDoS protection bandwidth, in bps.</li> 
     * @return MetricName Metric list. Valid values:
<li>acc_flux: content acceleration traffic, in bytes;</li>
<li>smt_flux: smart acceleration traffic, in bytes;</li>
<li>l4_flux: L4 acceleration traffic, in bytes;</li>
<li>sec_flux: exclusive protection traffic, in bytes;</li>
<li>zxctg_flux: network optimization traffic in the Chinese mainland, in bytes;</li>
<li>acc_bandwidth: content acceleration bandwidth, in bps;</li>
<li>smt_bandwidth: smart acceleration bandwidth, in bps;</li>
<li>l4_bandwidth: L4 acceleration bandwidth, in bps;</li>
<li>sec_bandwidth: exclusive protection bandwidth, in bps;</li>
<li>zxctg_bandwidth: network optimization bandwidth in the Chinese mainland, in bps;</li>
<li>sec_request_clean: number of HTTP/HTTPS requests;</li>
<li>smt_request_clean: number of smart acceleration requests;</li>
<li>quic_request: number of QUIC requests;</li>
<li>bot_request_clean: number of Bot requests;</li>
<li>cls_count: number of real-time log entries pushed;</li>
<li>ddos_bandwidth: elastic DDoS protection bandwidth, in bps.</li>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric list. Valid values:
<li>acc_flux: content acceleration traffic, in bytes;</li>
<li>smt_flux: smart acceleration traffic, in bytes;</li>
<li>l4_flux: L4 acceleration traffic, in bytes;</li>
<li>sec_flux: exclusive protection traffic, in bytes;</li>
<li>zxctg_flux: network optimization traffic in the Chinese mainland, in bytes;</li>
<li>acc_bandwidth: content acceleration bandwidth, in bps;</li>
<li>smt_bandwidth: smart acceleration bandwidth, in bps;</li>
<li>l4_bandwidth: L4 acceleration bandwidth, in bps;</li>
<li>sec_bandwidth: exclusive protection bandwidth, in bps;</li>
<li>zxctg_bandwidth: network optimization bandwidth in the Chinese mainland, in bps;</li>
<li>sec_request_clean: number of HTTP/HTTPS requests;</li>
<li>smt_request_clean: number of smart acceleration requests;</li>
<li>quic_request: number of QUIC requests;</li>
<li>bot_request_clean: number of Bot requests;</li>
<li>cls_count: number of real-time log entries pushed;</li>
<li>ddos_bandwidth: elastic DDoS protection bandwidth, in bps.</li>
     * @param MetricName Metric list. Valid values:
<li>acc_flux: content acceleration traffic, in bytes;</li>
<li>smt_flux: smart acceleration traffic, in bytes;</li>
<li>l4_flux: L4 acceleration traffic, in bytes;</li>
<li>sec_flux: exclusive protection traffic, in bytes;</li>
<li>zxctg_flux: network optimization traffic in the Chinese mainland, in bytes;</li>
<li>acc_bandwidth: content acceleration bandwidth, in bps;</li>
<li>smt_bandwidth: smart acceleration bandwidth, in bps;</li>
<li>l4_bandwidth: L4 acceleration bandwidth, in bps;</li>
<li>sec_bandwidth: exclusive protection bandwidth, in bps;</li>
<li>zxctg_bandwidth: network optimization bandwidth in the Chinese mainland, in bps;</li>
<li>sec_request_clean: number of HTTP/HTTPS requests;</li>
<li>smt_request_clean: number of smart acceleration requests;</li>
<li>quic_request: number of QUIC requests;</li>
<li>bot_request_clean: number of Bot requests;</li>
<li>cls_count: number of real-time log entries pushed;</li>
<li>ddos_bandwidth: elastic DDoS protection bandwidth, in bps.</li>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Time granularity of the query. Valid values:
<li>5min: 5 minutes;</li>
<li>hour: 1 hour;</li>
<li>day: 1 day.</li> 
     * @return Interval Time granularity of the query. Valid values:
<li>5min: 5 minutes;</li>
<li>hour: 1 hour;</li>
<li>day: 1 day.</li>
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time granularity of the query. Valid values:
<li>5min: 5 minutes;</li>
<li>hour: 1 hour;</li>
<li>day: 1 day.</li>
     * @param Interval Time granularity of the query. Valid values:
<li>5min: 5 minutes;</li>
<li>hour: 1 hour;</li>
<li>day: 1 day.</li>
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Filter criteria. The detailed values of filter criteria are as follows:
<li>host: Filter by domain name, such as test.example.com.<br></li>
<li>proxy-id: Filter by L4 proxy instance ID, such as sid-2rugn89bkla9.<br></li>
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li> 
     * @return Filters Filter criteria. The detailed values of filter criteria are as follows:
<li>host: Filter by domain name, such as test.example.com.<br></li>
<li>proxy-id: Filter by L4 proxy instance ID, such as sid-2rugn89bkla9.<br></li>
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>
     */
    public BillingDataFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The detailed values of filter criteria are as follows:
<li>host: Filter by domain name, such as test.example.com.<br></li>
<li>proxy-id: Filter by L4 proxy instance ID, such as sid-2rugn89bkla9.<br></li>
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>
     * @param Filters Filter criteria. The detailed values of filter criteria are as follows:
<li>host: Filter by domain name, such as test.example.com.<br></li>
<li>proxy-id: Filter by L4 proxy instance ID, such as sid-2rugn89bkla9.<br></li>
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>
     */
    public void setFilters(BillingDataFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeBillingDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillingDataRequest(DescribeBillingDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.Filters != null) {
            this.Filters = new BillingDataFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new BillingDataFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

