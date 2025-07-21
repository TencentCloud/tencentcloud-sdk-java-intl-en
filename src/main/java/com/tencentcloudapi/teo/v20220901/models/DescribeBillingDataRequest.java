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
    * The start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end time. The query time range (EndTime - StartTime) must be less than or equal to 31 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Zone ID set. This parameter is required. A maximum of 100 zone IDs can be passed in. If you need to query data for all zones under the Tencent Cloud main account, please use "*" instead. To query account-level data, you need to have full resource permissions for all zones of this interface.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Metric name. Valid values:
**Layer 4/7 Acceleration Traffic (Unit: Byte):**
<li>acc_flux: content acceleration traffic, in bytes;</li>
<li>smt_flux: smart acceleration traffic, in bytes;</li>
<li>l4_flux: layer 4 acceleration traffic, in bytes;</li>
<li>sec_flux: exclusive protection traffic, in bytes;</li>
<li>zxctg_flux: network optimization traffic in the chinese mainland, in bytes;</li>

**Layer 4/7 Acceleration Bandwidth (Unit: bps):**
<Li>acc_bandwidth: content acceleration bandwidth, in bps.</li>
<li>smt_bandwidth: smart acceleration bandwidth, in bps;</li>
<Li>l4_bandwidth: layer 4 acceleration bandwidth, in bps.</li>
<li>sec_bandwidth: exclusive protection bandwidth, in bps.</li>
<li>zxctg_bandwidth: network optimization bandwidth in the chinese mainland, in bps;</li>

**HTTP/HTTPS Security Requests (Unit: counts):**
<li>sec_request_clean: number of HTTP/HTTPS requests;</li>

**Value-added Service Usage:**
<li>smt_request_clean: number of smart acceleration requests, in counts;</li>
<li>quic_request: number of quic requests;</li>
<Li>bot_request_clean: number of bot requests;</li>
<li>cls_count: number of real-time log entries pushed;</li>
<li>ddos_bandwidth: elastic ddos protection bandwidth, in bps.</li>

**Edge Computing Usage:**
<li>edgefunction_request: number of edge function executions, in counts</li>
<li>edgefunction_cpu_time: edge function CPU processing time, in milliseconds</li>

**Media Processing Usage (Unit: seconds):**
<li>total_transcode: duration of jit transcoding and transmuxing for all specifications of audio and video, in seconds;</li>
<li>remux: transmuxing duration, in seconds;</li>
<li>transcode_audio: audio transcoding duration, in seconds;</li>
<li>transcode_H264_SD: specifies the duration of standard-definition videos encoded in H.264 (short side <= 480 px), in seconds;</li>
<li>transcode_H264_HD: specifies the duration of high-definition video (short side <= 720 px) encoded in H.264, in seconds;</li>
<li>transcode_H264_FHD: specifies the duration of a full hd video (short side <= 1080 px) encoded in H.264, in seconds;</li>
<li>transcode_H264_2K: specifies the duration of a 2K video (short side <= 1440 px) encoded in H.264, expressed in seconds.</li>


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
<ul>
  <li>host: Filter by domain name, such as test.example.com.</li>
  <li>proxy-id: Filter by L4 proxy instance ID, such as sid-2rugn89bkla9.</li>
  <li>region-id: Filter by billing region. Options:
    <ul>
      <li>CH: Chinese mainland</li>
      <li>AF: Africa</li>
      <li>AS1: Asia-Pacific Region 1</li>
      <li>AS2: Asia-Pacific Region 2</li>
      <li>AS3: Asia-Pacific Region 3</li>
      <li>EU: Europe</li>
      <li>MidEast: Middle East</li>
      <li>NA: North America</li>
      <li>SA: South America</li>
    </ul>
  </li>
</ul>
<p>Note: Filters of the same `Type` use OR logic, while filters of different `Type` use AND logic.</p>

    */
    @SerializedName("Filters")
    @Expose
    private BillingDataFilter [] Filters;

    /**
    * <p>Grouping aggregation dimensions. A maximum of two dimensions can be used for grouping simultaneously. The values are as follows:</p>
  <ul>
    <li>zone-id: Group by zone ID. If content identifiers are used, grouping by content identifier takes priority.</li>
    <li>host: Group by domain name.</li>
    <li>proxy-id: Group by layer-4 proxy instance ID.</li>
    <li>region-id: Group by billing region.</li>
  </ul>
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

    /**
     * Get The start time. 
     * @return StartTime The start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time.
     * @param StartTime The start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time. The query time range (EndTime - StartTime) must be less than or equal to 31 days. 
     * @return EndTime The end time. The query time range (EndTime - StartTime) must be less than or equal to 31 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time. The query time range (EndTime - StartTime) must be less than or equal to 31 days.
     * @param EndTime The end time. The query time range (EndTime - StartTime) must be less than or equal to 31 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Zone ID set. This parameter is required. A maximum of 100 zone IDs can be passed in. If you need to query data for all zones under the Tencent Cloud main account, please use "*" instead. To query account-level data, you need to have full resource permissions for all zones of this interface. 
     * @return ZoneIds Zone ID set. This parameter is required. A maximum of 100 zone IDs can be passed in. If you need to query data for all zones under the Tencent Cloud main account, please use "*" instead. To query account-level data, you need to have full resource permissions for all zones of this interface.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Zone ID set. This parameter is required. A maximum of 100 zone IDs can be passed in. If you need to query data for all zones under the Tencent Cloud main account, please use "*" instead. To query account-level data, you need to have full resource permissions for all zones of this interface.
     * @param ZoneIds Zone ID set. This parameter is required. A maximum of 100 zone IDs can be passed in. If you need to query data for all zones under the Tencent Cloud main account, please use "*" instead. To query account-level data, you need to have full resource permissions for all zones of this interface.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Metric name. Valid values:
**Layer 4/7 Acceleration Traffic (Unit: Byte):**
<li>acc_flux: content acceleration traffic, in bytes;</li>
<li>smt_flux: smart acceleration traffic, in bytes;</li>
<li>l4_flux: layer 4 acceleration traffic, in bytes;</li>
<li>sec_flux: exclusive protection traffic, in bytes;</li>
<li>zxctg_flux: network optimization traffic in the chinese mainland, in bytes;</li>

**Layer 4/7 Acceleration Bandwidth (Unit: bps):**
<Li>acc_bandwidth: content acceleration bandwidth, in bps.</li>
<li>smt_bandwidth: smart acceleration bandwidth, in bps;</li>
<Li>l4_bandwidth: layer 4 acceleration bandwidth, in bps.</li>
<li>sec_bandwidth: exclusive protection bandwidth, in bps.</li>
<li>zxctg_bandwidth: network optimization bandwidth in the chinese mainland, in bps;</li>

**HTTP/HTTPS Security Requests (Unit: counts):**
<li>sec_request_clean: number of HTTP/HTTPS requests;</li>

**Value-added Service Usage:**
<li>smt_request_clean: number of smart acceleration requests, in counts;</li>
<li>quic_request: number of quic requests;</li>
<Li>bot_request_clean: number of bot requests;</li>
<li>cls_count: number of real-time log entries pushed;</li>
<li>ddos_bandwidth: elastic ddos protection bandwidth, in bps.</li>

**Edge Computing Usage:**
<li>edgefunction_request: number of edge function executions, in counts</li>
<li>edgefunction_cpu_time: edge function CPU processing time, in milliseconds</li>

**Media Processing Usage (Unit: seconds):**
<li>total_transcode: duration of jit transcoding and transmuxing for all specifications of audio and video, in seconds;</li>
<li>remux: transmuxing duration, in seconds;</li>
<li>transcode_audio: audio transcoding duration, in seconds;</li>
<li>transcode_H264_SD: specifies the duration of standard-definition videos encoded in H.264 (short side <= 480 px), in seconds;</li>
<li>transcode_H264_HD: specifies the duration of high-definition video (short side <= 720 px) encoded in H.264, in seconds;</li>
<li>transcode_H264_FHD: specifies the duration of a full hd video (short side <= 1080 px) encoded in H.264, in seconds;</li>
<li>transcode_H264_2K: specifies the duration of a 2K video (short side <= 1440 px) encoded in H.264, expressed in seconds.</li>

 
     * @return MetricName Metric name. Valid values:
**Layer 4/7 Acceleration Traffic (Unit: Byte):**
<li>acc_flux: content acceleration traffic, in bytes;</li>
<li>smt_flux: smart acceleration traffic, in bytes;</li>
<li>l4_flux: layer 4 acceleration traffic, in bytes;</li>
<li>sec_flux: exclusive protection traffic, in bytes;</li>
<li>zxctg_flux: network optimization traffic in the chinese mainland, in bytes;</li>

**Layer 4/7 Acceleration Bandwidth (Unit: bps):**
<Li>acc_bandwidth: content acceleration bandwidth, in bps.</li>
<li>smt_bandwidth: smart acceleration bandwidth, in bps;</li>
<Li>l4_bandwidth: layer 4 acceleration bandwidth, in bps.</li>
<li>sec_bandwidth: exclusive protection bandwidth, in bps.</li>
<li>zxctg_bandwidth: network optimization bandwidth in the chinese mainland, in bps;</li>

**HTTP/HTTPS Security Requests (Unit: counts):**
<li>sec_request_clean: number of HTTP/HTTPS requests;</li>

**Value-added Service Usage:**
<li>smt_request_clean: number of smart acceleration requests, in counts;</li>
<li>quic_request: number of quic requests;</li>
<Li>bot_request_clean: number of bot requests;</li>
<li>cls_count: number of real-time log entries pushed;</li>
<li>ddos_bandwidth: elastic ddos protection bandwidth, in bps.</li>

**Edge Computing Usage:**
<li>edgefunction_request: number of edge function executions, in counts</li>
<li>edgefunction_cpu_time: edge function CPU processing time, in milliseconds</li>

**Media Processing Usage (Unit: seconds):**
<li>total_transcode: duration of jit transcoding and transmuxing for all specifications of audio and video, in seconds;</li>
<li>remux: transmuxing duration, in seconds;</li>
<li>transcode_audio: audio transcoding duration, in seconds;</li>
<li>transcode_H264_SD: specifies the duration of standard-definition videos encoded in H.264 (short side <= 480 px), in seconds;</li>
<li>transcode_H264_HD: specifies the duration of high-definition video (short side <= 720 px) encoded in H.264, in seconds;</li>
<li>transcode_H264_FHD: specifies the duration of a full hd video (short side <= 1080 px) encoded in H.264, in seconds;</li>
<li>transcode_H264_2K: specifies the duration of a 2K video (short side <= 1440 px) encoded in H.264, expressed in seconds.</li>


     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name. Valid values:
**Layer 4/7 Acceleration Traffic (Unit: Byte):**
<li>acc_flux: content acceleration traffic, in bytes;</li>
<li>smt_flux: smart acceleration traffic, in bytes;</li>
<li>l4_flux: layer 4 acceleration traffic, in bytes;</li>
<li>sec_flux: exclusive protection traffic, in bytes;</li>
<li>zxctg_flux: network optimization traffic in the chinese mainland, in bytes;</li>

**Layer 4/7 Acceleration Bandwidth (Unit: bps):**
<Li>acc_bandwidth: content acceleration bandwidth, in bps.</li>
<li>smt_bandwidth: smart acceleration bandwidth, in bps;</li>
<Li>l4_bandwidth: layer 4 acceleration bandwidth, in bps.</li>
<li>sec_bandwidth: exclusive protection bandwidth, in bps.</li>
<li>zxctg_bandwidth: network optimization bandwidth in the chinese mainland, in bps;</li>

**HTTP/HTTPS Security Requests (Unit: counts):**
<li>sec_request_clean: number of HTTP/HTTPS requests;</li>

**Value-added Service Usage:**
<li>smt_request_clean: number of smart acceleration requests, in counts;</li>
<li>quic_request: number of quic requests;</li>
<Li>bot_request_clean: number of bot requests;</li>
<li>cls_count: number of real-time log entries pushed;</li>
<li>ddos_bandwidth: elastic ddos protection bandwidth, in bps.</li>

**Edge Computing Usage:**
<li>edgefunction_request: number of edge function executions, in counts</li>
<li>edgefunction_cpu_time: edge function CPU processing time, in milliseconds</li>

**Media Processing Usage (Unit: seconds):**
<li>total_transcode: duration of jit transcoding and transmuxing for all specifications of audio and video, in seconds;</li>
<li>remux: transmuxing duration, in seconds;</li>
<li>transcode_audio: audio transcoding duration, in seconds;</li>
<li>transcode_H264_SD: specifies the duration of standard-definition videos encoded in H.264 (short side <= 480 px), in seconds;</li>
<li>transcode_H264_HD: specifies the duration of high-definition video (short side <= 720 px) encoded in H.264, in seconds;</li>
<li>transcode_H264_FHD: specifies the duration of a full hd video (short side <= 1080 px) encoded in H.264, in seconds;</li>
<li>transcode_H264_2K: specifies the duration of a 2K video (short side <= 1440 px) encoded in H.264, expressed in seconds.</li>


     * @param MetricName Metric name. Valid values:
**Layer 4/7 Acceleration Traffic (Unit: Byte):**
<li>acc_flux: content acceleration traffic, in bytes;</li>
<li>smt_flux: smart acceleration traffic, in bytes;</li>
<li>l4_flux: layer 4 acceleration traffic, in bytes;</li>
<li>sec_flux: exclusive protection traffic, in bytes;</li>
<li>zxctg_flux: network optimization traffic in the chinese mainland, in bytes;</li>

**Layer 4/7 Acceleration Bandwidth (Unit: bps):**
<Li>acc_bandwidth: content acceleration bandwidth, in bps.</li>
<li>smt_bandwidth: smart acceleration bandwidth, in bps;</li>
<Li>l4_bandwidth: layer 4 acceleration bandwidth, in bps.</li>
<li>sec_bandwidth: exclusive protection bandwidth, in bps.</li>
<li>zxctg_bandwidth: network optimization bandwidth in the chinese mainland, in bps;</li>

**HTTP/HTTPS Security Requests (Unit: counts):**
<li>sec_request_clean: number of HTTP/HTTPS requests;</li>

**Value-added Service Usage:**
<li>smt_request_clean: number of smart acceleration requests, in counts;</li>
<li>quic_request: number of quic requests;</li>
<Li>bot_request_clean: number of bot requests;</li>
<li>cls_count: number of real-time log entries pushed;</li>
<li>ddos_bandwidth: elastic ddos protection bandwidth, in bps.</li>

**Edge Computing Usage:**
<li>edgefunction_request: number of edge function executions, in counts</li>
<li>edgefunction_cpu_time: edge function CPU processing time, in milliseconds</li>

**Media Processing Usage (Unit: seconds):**
<li>total_transcode: duration of jit transcoding and transmuxing for all specifications of audio and video, in seconds;</li>
<li>remux: transmuxing duration, in seconds;</li>
<li>transcode_audio: audio transcoding duration, in seconds;</li>
<li>transcode_H264_SD: specifies the duration of standard-definition videos encoded in H.264 (short side <= 480 px), in seconds;</li>
<li>transcode_H264_HD: specifies the duration of high-definition video (short side <= 720 px) encoded in H.264, in seconds;</li>
<li>transcode_H264_FHD: specifies the duration of a full hd video (short side <= 1080 px) encoded in H.264, in seconds;</li>
<li>transcode_H264_2K: specifies the duration of a 2K video (short side <= 1440 px) encoded in H.264, expressed in seconds.</li>


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
<ul>
  <li>host: Filter by domain name, such as test.example.com.</li>
  <li>proxy-id: Filter by L4 proxy instance ID, such as sid-2rugn89bkla9.</li>
  <li>region-id: Filter by billing region. Options:
    <ul>
      <li>CH: Chinese mainland</li>
      <li>AF: Africa</li>
      <li>AS1: Asia-Pacific Region 1</li>
      <li>AS2: Asia-Pacific Region 2</li>
      <li>AS3: Asia-Pacific Region 3</li>
      <li>EU: Europe</li>
      <li>MidEast: Middle East</li>
      <li>NA: North America</li>
      <li>SA: South America</li>
    </ul>
  </li>
</ul>
<p>Note: Filters of the same `Type` use OR logic, while filters of different `Type` use AND logic.</p>
 
     * @return Filters Filter criteria. The detailed values of filter criteria are as follows:
<ul>
  <li>host: Filter by domain name, such as test.example.com.</li>
  <li>proxy-id: Filter by L4 proxy instance ID, such as sid-2rugn89bkla9.</li>
  <li>region-id: Filter by billing region. Options:
    <ul>
      <li>CH: Chinese mainland</li>
      <li>AF: Africa</li>
      <li>AS1: Asia-Pacific Region 1</li>
      <li>AS2: Asia-Pacific Region 2</li>
      <li>AS3: Asia-Pacific Region 3</li>
      <li>EU: Europe</li>
      <li>MidEast: Middle East</li>
      <li>NA: North America</li>
      <li>SA: South America</li>
    </ul>
  </li>
</ul>
<p>Note: Filters of the same `Type` use OR logic, while filters of different `Type` use AND logic.</p>

     */
    public BillingDataFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The detailed values of filter criteria are as follows:
<ul>
  <li>host: Filter by domain name, such as test.example.com.</li>
  <li>proxy-id: Filter by L4 proxy instance ID, such as sid-2rugn89bkla9.</li>
  <li>region-id: Filter by billing region. Options:
    <ul>
      <li>CH: Chinese mainland</li>
      <li>AF: Africa</li>
      <li>AS1: Asia-Pacific Region 1</li>
      <li>AS2: Asia-Pacific Region 2</li>
      <li>AS3: Asia-Pacific Region 3</li>
      <li>EU: Europe</li>
      <li>MidEast: Middle East</li>
      <li>NA: North America</li>
      <li>SA: South America</li>
    </ul>
  </li>
</ul>
<p>Note: Filters of the same `Type` use OR logic, while filters of different `Type` use AND logic.</p>

     * @param Filters Filter criteria. The detailed values of filter criteria are as follows:
<ul>
  <li>host: Filter by domain name, such as test.example.com.</li>
  <li>proxy-id: Filter by L4 proxy instance ID, such as sid-2rugn89bkla9.</li>
  <li>region-id: Filter by billing region. Options:
    <ul>
      <li>CH: Chinese mainland</li>
      <li>AF: Africa</li>
      <li>AS1: Asia-Pacific Region 1</li>
      <li>AS2: Asia-Pacific Region 2</li>
      <li>AS3: Asia-Pacific Region 3</li>
      <li>EU: Europe</li>
      <li>MidEast: Middle East</li>
      <li>NA: North America</li>
      <li>SA: South America</li>
    </ul>
  </li>
</ul>
<p>Note: Filters of the same `Type` use OR logic, while filters of different `Type` use AND logic.</p>

     */
    public void setFilters(BillingDataFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Grouping aggregation dimensions. A maximum of two dimensions can be used for grouping simultaneously. The values are as follows:</p>
  <ul>
    <li>zone-id: Group by zone ID. If content identifiers are used, grouping by content identifier takes priority.</li>
    <li>host: Group by domain name.</li>
    <li>proxy-id: Group by layer-4 proxy instance ID.</li>
    <li>region-id: Group by billing region.</li>
  </ul> 
     * @return GroupBy <p>Grouping aggregation dimensions. A maximum of two dimensions can be used for grouping simultaneously. The values are as follows:</p>
  <ul>
    <li>zone-id: Group by zone ID. If content identifiers are used, grouping by content identifier takes priority.</li>
    <li>host: Group by domain name.</li>
    <li>proxy-id: Group by layer-4 proxy instance ID.</li>
    <li>region-id: Group by billing region.</li>
  </ul>
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set <p>Grouping aggregation dimensions. A maximum of two dimensions can be used for grouping simultaneously. The values are as follows:</p>
  <ul>
    <li>zone-id: Group by zone ID. If content identifiers are used, grouping by content identifier takes priority.</li>
    <li>host: Group by domain name.</li>
    <li>proxy-id: Group by layer-4 proxy instance ID.</li>
    <li>region-id: Group by billing region.</li>
  </ul>
     * @param GroupBy <p>Grouping aggregation dimensions. A maximum of two dimensions can be used for grouping simultaneously. The values are as follows:</p>
  <ul>
    <li>zone-id: Group by zone ID. If content identifiers are used, grouping by content identifier takes priority.</li>
    <li>host: Group by domain name.</li>
    <li>proxy-id: Group by layer-4 proxy instance ID.</li>
    <li>region-id: Group by billing region.</li>
  </ul>
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

