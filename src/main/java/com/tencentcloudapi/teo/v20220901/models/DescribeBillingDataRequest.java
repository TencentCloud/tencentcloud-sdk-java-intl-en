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
    * End time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Site ID set. This parameter is required. You can import up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you must have permission for all site resources of this interface.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Metric list. Valid values:
<b>l4/l7 acceleration traffic:</b><li>acc_flux: content acceleration traffic, in bytes;</li><li>smt_flux: smart acceleration traffic, in bytes;</li><li>l4_flux: Layer 4 acceleration traffic, in bytes;</li><li>sec_flux: independent protection traffic, in bytes;</li><li>zxctg_flux: network optimization traffic in the Chinese mainland, in bytes.</li><br><b>l4/l7 acceleration bandwidth:</b><li>acc_bandwidth: content acceleration bandwidth, in bps;</li><li>smt_bandwidth: intelligent acceleration bandwidth, in bps;</li><li>l4_bandwidth: Layer 4 acceleration bandwidth, in bps;</li><li>sec_bandwidth: exclusive protection bandwidth, in bps;</li><li>zxctg_bandwidth: network optimization bandwidth in the Chinese mainland, in bps.</li><br><b>HTTP/HTTPS security requests:</b><li>sec_request_clean: HTTP/HTTPS requests, count.</li><b><br>VAS usage:</b><li>smt_request_clean: smart acceleration requests, count;</li><li>quic_request: quic requests, count;</li><li>bot_request_clean: bot requests, count;</li><li>cls_count: number of real-time log pushes, count;</li><li>ddos_bandwidth: elastic ddos protection bandwidth, in bps.</li><br><b>Edge computing usage:</b><li>edgefunction_request: number of edge function requests, count;</li><li>edgefunction_cpu_time: edge function cpu processing time, in milliseconds.</li>
<b>Media processing usage:</b><li>total_transcode: duration of audio, video JIT transcoding, and remuxing for all specifications, in seconds;</li><li>remux: remuxing duration, in seconds;</li><li>transcode_audio: audio transcoding duration, in seconds;</li><li>transcode_H264_SD: duration of standard definition video (short side <= 480 px) in H.264, in seconds;</li><li>transcode_H264_HD: duration of high-definition video (short side <= 720 px) in H.264, in seconds;</li><li>transcode_H264_FHD: duration of Full HD video (short side <= 1080 px) in H.264, in seconds;</li><li>transcode_H264_2K: duration of 2K video (short side <= 1440 px) in H.264, in seconds.</li>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Time granularity of the query. Valid values:
<li>5min: 5 minutes;</li>
<li>hour: 1-hour granularity;</li>
<li>day: 1 day.</li>
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Filter criteria. The detailed values of filter criteria are as follows:
<li>host: Filter by domain name, such as test.example.com.<br></li>
<li>proxy-id: filter by L4 proxy instance ID. Example value: sid-2rugn89bkla9.<br></li>
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>
Description: `BillingDataFilter` with the same `Type` has an "OR" relationship with each other, while those with different `Type` have an "AND" relationship with each other.
    */
    @SerializedName("Filters")
    @Expose
    private BillingDataFilter [] Filters;

    /**
    * Aggregate dimension for grouping. Allows up to two dimensions for grouping at the same time. Values are as follows: <li>zone-id: Group by site ID. If the content identifier feature is used, priority is given to grouping by content identifier.<br></li><li>host: Group by domain name.<br></li><li>proxy-id: Group by Layer 4 Proxy Instance ID.<br></li><li>region-id: Group by billing region.</li>
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

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
     * Get End time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days. 
     * @return EndTime End time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
     * @param EndTime End time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Site ID set. This parameter is required. You can import up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you must have permission for all site resources of this interface. 
     * @return ZoneIds Site ID set. This parameter is required. You can import up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you must have permission for all site resources of this interface.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site ID set. This parameter is required. You can import up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you must have permission for all site resources of this interface.
     * @param ZoneIds Site ID set. This parameter is required. You can import up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you must have permission for all site resources of this interface.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Metric list. Valid values:
<b>l4/l7 acceleration traffic:</b><li>acc_flux: content acceleration traffic, in bytes;</li><li>smt_flux: smart acceleration traffic, in bytes;</li><li>l4_flux: Layer 4 acceleration traffic, in bytes;</li><li>sec_flux: independent protection traffic, in bytes;</li><li>zxctg_flux: network optimization traffic in the Chinese mainland, in bytes.</li><br><b>l4/l7 acceleration bandwidth:</b><li>acc_bandwidth: content acceleration bandwidth, in bps;</li><li>smt_bandwidth: intelligent acceleration bandwidth, in bps;</li><li>l4_bandwidth: Layer 4 acceleration bandwidth, in bps;</li><li>sec_bandwidth: exclusive protection bandwidth, in bps;</li><li>zxctg_bandwidth: network optimization bandwidth in the Chinese mainland, in bps.</li><br><b>HTTP/HTTPS security requests:</b><li>sec_request_clean: HTTP/HTTPS requests, count.</li><b><br>VAS usage:</b><li>smt_request_clean: smart acceleration requests, count;</li><li>quic_request: quic requests, count;</li><li>bot_request_clean: bot requests, count;</li><li>cls_count: number of real-time log pushes, count;</li><li>ddos_bandwidth: elastic ddos protection bandwidth, in bps.</li><br><b>Edge computing usage:</b><li>edgefunction_request: number of edge function requests, count;</li><li>edgefunction_cpu_time: edge function cpu processing time, in milliseconds.</li>
<b>Media processing usage:</b><li>total_transcode: duration of audio, video JIT transcoding, and remuxing for all specifications, in seconds;</li><li>remux: remuxing duration, in seconds;</li><li>transcode_audio: audio transcoding duration, in seconds;</li><li>transcode_H264_SD: duration of standard definition video (short side <= 480 px) in H.264, in seconds;</li><li>transcode_H264_HD: duration of high-definition video (short side <= 720 px) in H.264, in seconds;</li><li>transcode_H264_FHD: duration of Full HD video (short side <= 1080 px) in H.264, in seconds;</li><li>transcode_H264_2K: duration of 2K video (short side <= 1440 px) in H.264, in seconds.</li> 
     * @return MetricName Metric list. Valid values:
<b>l4/l7 acceleration traffic:</b><li>acc_flux: content acceleration traffic, in bytes;</li><li>smt_flux: smart acceleration traffic, in bytes;</li><li>l4_flux: Layer 4 acceleration traffic, in bytes;</li><li>sec_flux: independent protection traffic, in bytes;</li><li>zxctg_flux: network optimization traffic in the Chinese mainland, in bytes.</li><br><b>l4/l7 acceleration bandwidth:</b><li>acc_bandwidth: content acceleration bandwidth, in bps;</li><li>smt_bandwidth: intelligent acceleration bandwidth, in bps;</li><li>l4_bandwidth: Layer 4 acceleration bandwidth, in bps;</li><li>sec_bandwidth: exclusive protection bandwidth, in bps;</li><li>zxctg_bandwidth: network optimization bandwidth in the Chinese mainland, in bps.</li><br><b>HTTP/HTTPS security requests:</b><li>sec_request_clean: HTTP/HTTPS requests, count.</li><b><br>VAS usage:</b><li>smt_request_clean: smart acceleration requests, count;</li><li>quic_request: quic requests, count;</li><li>bot_request_clean: bot requests, count;</li><li>cls_count: number of real-time log pushes, count;</li><li>ddos_bandwidth: elastic ddos protection bandwidth, in bps.</li><br><b>Edge computing usage:</b><li>edgefunction_request: number of edge function requests, count;</li><li>edgefunction_cpu_time: edge function cpu processing time, in milliseconds.</li>
<b>Media processing usage:</b><li>total_transcode: duration of audio, video JIT transcoding, and remuxing for all specifications, in seconds;</li><li>remux: remuxing duration, in seconds;</li><li>transcode_audio: audio transcoding duration, in seconds;</li><li>transcode_H264_SD: duration of standard definition video (short side <= 480 px) in H.264, in seconds;</li><li>transcode_H264_HD: duration of high-definition video (short side <= 720 px) in H.264, in seconds;</li><li>transcode_H264_FHD: duration of Full HD video (short side <= 1080 px) in H.264, in seconds;</li><li>transcode_H264_2K: duration of 2K video (short side <= 1440 px) in H.264, in seconds.</li>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric list. Valid values:
<b>l4/l7 acceleration traffic:</b><li>acc_flux: content acceleration traffic, in bytes;</li><li>smt_flux: smart acceleration traffic, in bytes;</li><li>l4_flux: Layer 4 acceleration traffic, in bytes;</li><li>sec_flux: independent protection traffic, in bytes;</li><li>zxctg_flux: network optimization traffic in the Chinese mainland, in bytes.</li><br><b>l4/l7 acceleration bandwidth:</b><li>acc_bandwidth: content acceleration bandwidth, in bps;</li><li>smt_bandwidth: intelligent acceleration bandwidth, in bps;</li><li>l4_bandwidth: Layer 4 acceleration bandwidth, in bps;</li><li>sec_bandwidth: exclusive protection bandwidth, in bps;</li><li>zxctg_bandwidth: network optimization bandwidth in the Chinese mainland, in bps.</li><br><b>HTTP/HTTPS security requests:</b><li>sec_request_clean: HTTP/HTTPS requests, count.</li><b><br>VAS usage:</b><li>smt_request_clean: smart acceleration requests, count;</li><li>quic_request: quic requests, count;</li><li>bot_request_clean: bot requests, count;</li><li>cls_count: number of real-time log pushes, count;</li><li>ddos_bandwidth: elastic ddos protection bandwidth, in bps.</li><br><b>Edge computing usage:</b><li>edgefunction_request: number of edge function requests, count;</li><li>edgefunction_cpu_time: edge function cpu processing time, in milliseconds.</li>
<b>Media processing usage:</b><li>total_transcode: duration of audio, video JIT transcoding, and remuxing for all specifications, in seconds;</li><li>remux: remuxing duration, in seconds;</li><li>transcode_audio: audio transcoding duration, in seconds;</li><li>transcode_H264_SD: duration of standard definition video (short side <= 480 px) in H.264, in seconds;</li><li>transcode_H264_HD: duration of high-definition video (short side <= 720 px) in H.264, in seconds;</li><li>transcode_H264_FHD: duration of Full HD video (short side <= 1080 px) in H.264, in seconds;</li><li>transcode_H264_2K: duration of 2K video (short side <= 1440 px) in H.264, in seconds.</li>
     * @param MetricName Metric list. Valid values:
<b>l4/l7 acceleration traffic:</b><li>acc_flux: content acceleration traffic, in bytes;</li><li>smt_flux: smart acceleration traffic, in bytes;</li><li>l4_flux: Layer 4 acceleration traffic, in bytes;</li><li>sec_flux: independent protection traffic, in bytes;</li><li>zxctg_flux: network optimization traffic in the Chinese mainland, in bytes.</li><br><b>l4/l7 acceleration bandwidth:</b><li>acc_bandwidth: content acceleration bandwidth, in bps;</li><li>smt_bandwidth: intelligent acceleration bandwidth, in bps;</li><li>l4_bandwidth: Layer 4 acceleration bandwidth, in bps;</li><li>sec_bandwidth: exclusive protection bandwidth, in bps;</li><li>zxctg_bandwidth: network optimization bandwidth in the Chinese mainland, in bps.</li><br><b>HTTP/HTTPS security requests:</b><li>sec_request_clean: HTTP/HTTPS requests, count.</li><b><br>VAS usage:</b><li>smt_request_clean: smart acceleration requests, count;</li><li>quic_request: quic requests, count;</li><li>bot_request_clean: bot requests, count;</li><li>cls_count: number of real-time log pushes, count;</li><li>ddos_bandwidth: elastic ddos protection bandwidth, in bps.</li><br><b>Edge computing usage:</b><li>edgefunction_request: number of edge function requests, count;</li><li>edgefunction_cpu_time: edge function cpu processing time, in milliseconds.</li>
<b>Media processing usage:</b><li>total_transcode: duration of audio, video JIT transcoding, and remuxing for all specifications, in seconds;</li><li>remux: remuxing duration, in seconds;</li><li>transcode_audio: audio transcoding duration, in seconds;</li><li>transcode_H264_SD: duration of standard definition video (short side <= 480 px) in H.264, in seconds;</li><li>transcode_H264_HD: duration of high-definition video (short side <= 720 px) in H.264, in seconds;</li><li>transcode_H264_FHD: duration of Full HD video (short side <= 1080 px) in H.264, in seconds;</li><li>transcode_H264_2K: duration of 2K video (short side <= 1440 px) in H.264, in seconds.</li>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Time granularity of the query. Valid values:
<li>5min: 5 minutes;</li>
<li>hour: 1-hour granularity;</li>
<li>day: 1 day.</li> 
     * @return Interval Time granularity of the query. Valid values:
<li>5min: 5 minutes;</li>
<li>hour: 1-hour granularity;</li>
<li>day: 1 day.</li>
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time granularity of the query. Valid values:
<li>5min: 5 minutes;</li>
<li>hour: 1-hour granularity;</li>
<li>day: 1 day.</li>
     * @param Interval Time granularity of the query. Valid values:
<li>5min: 5 minutes;</li>
<li>hour: 1-hour granularity;</li>
<li>day: 1 day.</li>
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Filter criteria. The detailed values of filter criteria are as follows:
<li>host: Filter by domain name, such as test.example.com.<br></li>
<li>proxy-id: filter by L4 proxy instance ID. Example value: sid-2rugn89bkla9.<br></li>
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>
Description: `BillingDataFilter` with the same `Type` has an "OR" relationship with each other, while those with different `Type` have an "AND" relationship with each other. 
     * @return Filters Filter criteria. The detailed values of filter criteria are as follows:
<li>host: Filter by domain name, such as test.example.com.<br></li>
<li>proxy-id: filter by L4 proxy instance ID. Example value: sid-2rugn89bkla9.<br></li>
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>
Description: `BillingDataFilter` with the same `Type` has an "OR" relationship with each other, while those with different `Type` have an "AND" relationship with each other.
     */
    public BillingDataFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The detailed values of filter criteria are as follows:
<li>host: Filter by domain name, such as test.example.com.<br></li>
<li>proxy-id: filter by L4 proxy instance ID. Example value: sid-2rugn89bkla9.<br></li>
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>
Description: `BillingDataFilter` with the same `Type` has an "OR" relationship with each other, while those with different `Type` have an "AND" relationship with each other.
     * @param Filters Filter criteria. The detailed values of filter criteria are as follows:
<li>host: Filter by domain name, such as test.example.com.<br></li>
<li>proxy-id: filter by L4 proxy instance ID. Example value: sid-2rugn89bkla9.<br></li>
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>
Description: `BillingDataFilter` with the same `Type` has an "OR" relationship with each other, while those with different `Type` have an "AND" relationship with each other.
     */
    public void setFilters(BillingDataFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Aggregate dimension for grouping. Allows up to two dimensions for grouping at the same time. Values are as follows: <li>zone-id: Group by site ID. If the content identifier feature is used, priority is given to grouping by content identifier.<br></li><li>host: Group by domain name.<br></li><li>proxy-id: Group by Layer 4 Proxy Instance ID.<br></li><li>region-id: Group by billing region.</li> 
     * @return GroupBy Aggregate dimension for grouping. Allows up to two dimensions for grouping at the same time. Values are as follows: <li>zone-id: Group by site ID. If the content identifier feature is used, priority is given to grouping by content identifier.<br></li><li>host: Group by domain name.<br></li><li>proxy-id: Group by Layer 4 Proxy Instance ID.<br></li><li>region-id: Group by billing region.</li>
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set Aggregate dimension for grouping. Allows up to two dimensions for grouping at the same time. Values are as follows: <li>zone-id: Group by site ID. If the content identifier feature is used, priority is given to grouping by content identifier.<br></li><li>host: Group by domain name.<br></li><li>proxy-id: Group by Layer 4 Proxy Instance ID.<br></li><li>region-id: Group by billing region.</li>
     * @param GroupBy Aggregate dimension for grouping. Allows up to two dimensions for grouping at the same time. Values are as follows: <li>zone-id: Group by site ID. If the content identifier feature is used, priority is given to grouping by content identifier.<br></li><li>host: Group by domain name.<br></li><li>proxy-id: Group by Layer 4 Proxy Instance ID.<br></li><li>region-id: Group by billing region.</li>
     */
    public void setGroupBy(String [] GroupBy) {
        this.GroupBy = GroupBy;
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
        if (source.GroupBy != null) {
            this.GroupBy = new String[source.GroupBy.length];
            for (int i = 0; i < source.GroupBy.length; i++) {
                this.GroupBy[i] = new String(source.GroupBy[i]);
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
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);

    }
}

