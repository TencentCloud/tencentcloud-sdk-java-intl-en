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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillingDataRequest extends AbstractModel {

    /**
    * Start time of the query.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the query.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Zone ID set. This parameter is required.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Indicator list. Valid values:<li>acc_flux: Content acceleration traffic, in bytes;</li>
<li>smt_flux: Smart acceleration traffic, in bytes;</li>
<li>l4_flux: Layer 4 acceleration traffic, in bytes;</li>
<li>sec_flux: Exclusive DDoS mitigation traffic, in bytes;</li>
<li>zxctg_flux: Cross-MLC-border acceleration traffic, in bytes;</li>
<li>acc_bandwidth: Content acceleration bandwidth, in bps;</li>
<li>smt_bandwidth: Smart acceleration bandwidth, in bps;</li>
<li>l4_bandwidth: Layer 4 acceleration bandwidth, in bps;</li>
<li>sec_bandwidth: Exclusive DDoS mitigation bandwidth, in bps;</li>
<li>zxctg_bandwidth: Cross-MLC-border acceleration bandwidth, in bps;</li><li>sec_request_clean: HTTP/HTTPS requests, in count;</li>
<li>smt_request_clean: Smart acceleration requests, in count;</li>
<li>quic_request: QUIC requests, in count;</li>
<li>bot_request_clean: Bot requests, in count;</li>
<li>cls_count: Real-time log delivery log counts, in count;</li>
<li>ddos_bandwidth: Exclusive DDoS mitigation elastic bandwidth, in bps.</li>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Query granularity. Valid values:<li>5min: 5-minute granularity;</li>
<li>hour: 1-hour granularity;</li>
<li>day: 1-day granularity.</li>
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Filter. The detailed filters are as follows:
<li>host: Filter by Domain Name. Example: test.example.com.<br></li>
<li>proxy-id: Filter by Layer 4 Proxy Instance ID. Example: sid-2rugn89bkla9.<br></li>
<li>region-id: Filter by Billing Region.Options are:<br>   CH: Chinese mainland<br>   AF: Africa<br>   AS1: Asia-Pacific Region 1<br>   AS2: Asia-Pacific Region 2<br>   AS3: Asia-Pacific Region 3<br>  EU: Europe<br>   MidEast: Middle East<br>   NA: North America<br>   SA: South America</li>
    */
    @SerializedName("Filters")
    @Expose
    private BillingDataFilter [] Filters;

    /**
     * Get Start time of the query. 
     * @return StartTime Start time of the query.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the query.
     * @param StartTime Start time of the query.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the query. 
     * @return EndTime End time of the query.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the query.
     * @param EndTime End time of the query.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Zone ID set. This parameter is required. 
     * @return ZoneIds Zone ID set. This parameter is required.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Zone ID set. This parameter is required.
     * @param ZoneIds Zone ID set. This parameter is required.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Indicator list. Valid values:<li>acc_flux: Content acceleration traffic, in bytes;</li>
<li>smt_flux: Smart acceleration traffic, in bytes;</li>
<li>l4_flux: Layer 4 acceleration traffic, in bytes;</li>
<li>sec_flux: Exclusive DDoS mitigation traffic, in bytes;</li>
<li>zxctg_flux: Cross-MLC-border acceleration traffic, in bytes;</li>
<li>acc_bandwidth: Content acceleration bandwidth, in bps;</li>
<li>smt_bandwidth: Smart acceleration bandwidth, in bps;</li>
<li>l4_bandwidth: Layer 4 acceleration bandwidth, in bps;</li>
<li>sec_bandwidth: Exclusive DDoS mitigation bandwidth, in bps;</li>
<li>zxctg_bandwidth: Cross-MLC-border acceleration bandwidth, in bps;</li><li>sec_request_clean: HTTP/HTTPS requests, in count;</li>
<li>smt_request_clean: Smart acceleration requests, in count;</li>
<li>quic_request: QUIC requests, in count;</li>
<li>bot_request_clean: Bot requests, in count;</li>
<li>cls_count: Real-time log delivery log counts, in count;</li>
<li>ddos_bandwidth: Exclusive DDoS mitigation elastic bandwidth, in bps.</li> 
     * @return MetricName Indicator list. Valid values:<li>acc_flux: Content acceleration traffic, in bytes;</li>
<li>smt_flux: Smart acceleration traffic, in bytes;</li>
<li>l4_flux: Layer 4 acceleration traffic, in bytes;</li>
<li>sec_flux: Exclusive DDoS mitigation traffic, in bytes;</li>
<li>zxctg_flux: Cross-MLC-border acceleration traffic, in bytes;</li>
<li>acc_bandwidth: Content acceleration bandwidth, in bps;</li>
<li>smt_bandwidth: Smart acceleration bandwidth, in bps;</li>
<li>l4_bandwidth: Layer 4 acceleration bandwidth, in bps;</li>
<li>sec_bandwidth: Exclusive DDoS mitigation bandwidth, in bps;</li>
<li>zxctg_bandwidth: Cross-MLC-border acceleration bandwidth, in bps;</li><li>sec_request_clean: HTTP/HTTPS requests, in count;</li>
<li>smt_request_clean: Smart acceleration requests, in count;</li>
<li>quic_request: QUIC requests, in count;</li>
<li>bot_request_clean: Bot requests, in count;</li>
<li>cls_count: Real-time log delivery log counts, in count;</li>
<li>ddos_bandwidth: Exclusive DDoS mitigation elastic bandwidth, in bps.</li>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Indicator list. Valid values:<li>acc_flux: Content acceleration traffic, in bytes;</li>
<li>smt_flux: Smart acceleration traffic, in bytes;</li>
<li>l4_flux: Layer 4 acceleration traffic, in bytes;</li>
<li>sec_flux: Exclusive DDoS mitigation traffic, in bytes;</li>
<li>zxctg_flux: Cross-MLC-border acceleration traffic, in bytes;</li>
<li>acc_bandwidth: Content acceleration bandwidth, in bps;</li>
<li>smt_bandwidth: Smart acceleration bandwidth, in bps;</li>
<li>l4_bandwidth: Layer 4 acceleration bandwidth, in bps;</li>
<li>sec_bandwidth: Exclusive DDoS mitigation bandwidth, in bps;</li>
<li>zxctg_bandwidth: Cross-MLC-border acceleration bandwidth, in bps;</li><li>sec_request_clean: HTTP/HTTPS requests, in count;</li>
<li>smt_request_clean: Smart acceleration requests, in count;</li>
<li>quic_request: QUIC requests, in count;</li>
<li>bot_request_clean: Bot requests, in count;</li>
<li>cls_count: Real-time log delivery log counts, in count;</li>
<li>ddos_bandwidth: Exclusive DDoS mitigation elastic bandwidth, in bps.</li>
     * @param MetricName Indicator list. Valid values:<li>acc_flux: Content acceleration traffic, in bytes;</li>
<li>smt_flux: Smart acceleration traffic, in bytes;</li>
<li>l4_flux: Layer 4 acceleration traffic, in bytes;</li>
<li>sec_flux: Exclusive DDoS mitigation traffic, in bytes;</li>
<li>zxctg_flux: Cross-MLC-border acceleration traffic, in bytes;</li>
<li>acc_bandwidth: Content acceleration bandwidth, in bps;</li>
<li>smt_bandwidth: Smart acceleration bandwidth, in bps;</li>
<li>l4_bandwidth: Layer 4 acceleration bandwidth, in bps;</li>
<li>sec_bandwidth: Exclusive DDoS mitigation bandwidth, in bps;</li>
<li>zxctg_bandwidth: Cross-MLC-border acceleration bandwidth, in bps;</li><li>sec_request_clean: HTTP/HTTPS requests, in count;</li>
<li>smt_request_clean: Smart acceleration requests, in count;</li>
<li>quic_request: QUIC requests, in count;</li>
<li>bot_request_clean: Bot requests, in count;</li>
<li>cls_count: Real-time log delivery log counts, in count;</li>
<li>ddos_bandwidth: Exclusive DDoS mitigation elastic bandwidth, in bps.</li>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Query granularity. Valid values:<li>5min: 5-minute granularity;</li>
<li>hour: 1-hour granularity;</li>
<li>day: 1-day granularity.</li> 
     * @return Interval Query granularity. Valid values:<li>5min: 5-minute granularity;</li>
<li>hour: 1-hour granularity;</li>
<li>day: 1-day granularity.</li>
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Query granularity. Valid values:<li>5min: 5-minute granularity;</li>
<li>hour: 1-hour granularity;</li>
<li>day: 1-day granularity.</li>
     * @param Interval Query granularity. Valid values:<li>5min: 5-minute granularity;</li>
<li>hour: 1-hour granularity;</li>
<li>day: 1-day granularity.</li>
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Filter. The detailed filters are as follows:
<li>host: Filter by Domain Name. Example: test.example.com.<br></li>
<li>proxy-id: Filter by Layer 4 Proxy Instance ID. Example: sid-2rugn89bkla9.<br></li>
<li>region-id: Filter by Billing Region.Options are:<br>   CH: Chinese mainland<br>   AF: Africa<br>   AS1: Asia-Pacific Region 1<br>   AS2: Asia-Pacific Region 2<br>   AS3: Asia-Pacific Region 3<br>  EU: Europe<br>   MidEast: Middle East<br>   NA: North America<br>   SA: South America</li> 
     * @return Filters Filter. The detailed filters are as follows:
<li>host: Filter by Domain Name. Example: test.example.com.<br></li>
<li>proxy-id: Filter by Layer 4 Proxy Instance ID. Example: sid-2rugn89bkla9.<br></li>
<li>region-id: Filter by Billing Region.Options are:<br>   CH: Chinese mainland<br>   AF: Africa<br>   AS1: Asia-Pacific Region 1<br>   AS2: Asia-Pacific Region 2<br>   AS3: Asia-Pacific Region 3<br>  EU: Europe<br>   MidEast: Middle East<br>   NA: North America<br>   SA: South America</li>
     */
    public BillingDataFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. The detailed filters are as follows:
<li>host: Filter by Domain Name. Example: test.example.com.<br></li>
<li>proxy-id: Filter by Layer 4 Proxy Instance ID. Example: sid-2rugn89bkla9.<br></li>
<li>region-id: Filter by Billing Region.Options are:<br>   CH: Chinese mainland<br>   AF: Africa<br>   AS1: Asia-Pacific Region 1<br>   AS2: Asia-Pacific Region 2<br>   AS3: Asia-Pacific Region 3<br>  EU: Europe<br>   MidEast: Middle East<br>   NA: North America<br>   SA: South America</li>
     * @param Filters Filter. The detailed filters are as follows:
<li>host: Filter by Domain Name. Example: test.example.com.<br></li>
<li>proxy-id: Filter by Layer 4 Proxy Instance ID. Example: sid-2rugn89bkla9.<br></li>
<li>region-id: Filter by Billing Region.Options are:<br>   CH: Chinese mainland<br>   AF: Africa<br>   AS1: Asia-Pacific Region 1<br>   AS2: Asia-Pacific Region 2<br>   AS3: Asia-Pacific Region 3<br>  EU: Europe<br>   MidEast: Middle East<br>   NA: North America<br>   SA: South America</li>
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

