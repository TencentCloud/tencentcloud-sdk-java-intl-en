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
    * End time. the query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Site ID set. this parameter is required. a maximum of 100 site ids can be imported. use `*` to query data for all sites under the tencent cloud root account. querying account-level data requires permissions for all site resources in this api.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Metric list. values as follows:.
<b>l4/l7 acceleration traffic:</b><li>acc_flux: specifies content acceleration traffic in bytes.</li><li>smt_flux: specifies smart acceleration traffic in bytes.</li><li>l4_flux: specifies layer 4 acceleration traffic in bytes.</li><li>sec_flux: specifies independent protection traffic in bytes.</li><li>zxctg_flux: specifies network optimization traffic in the chinese mainland in bytes.</li><br><b>l4/l7 acceleration bandwidth:</b><li>acc_bandwidth: specifies content acceleration bandwidth in bps.</li><li>smt_bandwidth: specifies intelligent acceleration bandwidth in bps.</li><li>l4_bandwidth: specifies layer 4 acceleration bandwidth in bps.</li><li>sec_bandwidth: specifies exclusive protection bandwidth in bps.</li><li>zxctg_bandwidth: specifies network optimization bandwidth in the chinese mainland in bps.</li><br><b>HTTP/HTTPS security requests:</b><li>sec_request_clean: specifies HTTP/HTTPS requests by count.</li><br><b>vas usage:</b><li>smt_request_clean: specifies intelligent acceleration requests by count.</li><li>quic_request: specifies quic requests by count.</li><li>bot_request_clean: specifies bot requests by count.</li><li>cls_count: specifies the number of real-time log pushes by count.</li><li>ddos_bandwidth: specifies elastic ddos protection bandwidth in bps.</li><br><b>edge computing usage:</b><li>edgefunction_request: specifies the number of edge function requests by count.</li><li>edgefunction_cpu_time: specifies edge function cpu processing time in milliseconds.</li>.
<b>Media processing usage:</b> <li>total_transcode: all specification audio, video jit transcoding, repackaging duration, in seconds;</li> <li>remux: repackaging duration, in seconds;</li> <li>transcode_audio: audio transcoding duration, in seconds;</li> <li>transcode_H264_SD: H.264 encoded standard-definition video (short side ≤ 480 px) duration, in seconds;</li> <li>transcode_H264_HD: H.264 encoded high-definition video (short side ≤ 720 px) duration, in seconds;</li> <li>transcode_H264_FHD: H.264 encoded full HD video (short side ≤ 1080 px) duration, in seconds;</li> <li>transcode_H264_2K: H.264 encoded 2K video (short side ≤ 1440 px) duration, in seconds.</li>.
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
    * Filter criteria. the detailed values of filter criteria are as follows:.
<li>host: specifies the domain name to filter by. example value: test.example.com.<br></li>.
<li>proxy-id: specifies the l4 proxy instance id for filtering. example value: sid-2rugn89bkla9.</li>.
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>

Specifies that `BillingDataFilter` with the same `Type` have an "or" relationship with each other, while those with different `Type` have an "and" relationship between them.
    */
    @SerializedName("Filters")
    @Expose
    private BillingDataFilter [] Filters;

    /**
    * Grouping aggregate dimension. a maximum of two dimensions can be grouped simultaneously. values are as follows: <li>zone-id: group by site id. if the content identifier functionality is used, priority is given to grouping by content identifier;<br></li> <li>host: group by domain name;<br></li> <li>proxy-id: group by layer 4 proxy instance id;<br></li> <li>region-id: group by billing region.</li>.
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
     * Get End time. the query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days. 
     * @return EndTime End time. the query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. the query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
     * @param EndTime End time. the query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Site ID set. this parameter is required. a maximum of 100 site ids can be imported. use `*` to query data for all sites under the tencent cloud root account. querying account-level data requires permissions for all site resources in this api. 
     * @return ZoneIds Site ID set. this parameter is required. a maximum of 100 site ids can be imported. use `*` to query data for all sites under the tencent cloud root account. querying account-level data requires permissions for all site resources in this api.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site ID set. this parameter is required. a maximum of 100 site ids can be imported. use `*` to query data for all sites under the tencent cloud root account. querying account-level data requires permissions for all site resources in this api.
     * @param ZoneIds Site ID set. this parameter is required. a maximum of 100 site ids can be imported. use `*` to query data for all sites under the tencent cloud root account. querying account-level data requires permissions for all site resources in this api.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Metric list. values as follows:.
<b>l4/l7 acceleration traffic:</b><li>acc_flux: specifies content acceleration traffic in bytes.</li><li>smt_flux: specifies smart acceleration traffic in bytes.</li><li>l4_flux: specifies layer 4 acceleration traffic in bytes.</li><li>sec_flux: specifies independent protection traffic in bytes.</li><li>zxctg_flux: specifies network optimization traffic in the chinese mainland in bytes.</li><br><b>l4/l7 acceleration bandwidth:</b><li>acc_bandwidth: specifies content acceleration bandwidth in bps.</li><li>smt_bandwidth: specifies intelligent acceleration bandwidth in bps.</li><li>l4_bandwidth: specifies layer 4 acceleration bandwidth in bps.</li><li>sec_bandwidth: specifies exclusive protection bandwidth in bps.</li><li>zxctg_bandwidth: specifies network optimization bandwidth in the chinese mainland in bps.</li><br><b>HTTP/HTTPS security requests:</b><li>sec_request_clean: specifies HTTP/HTTPS requests by count.</li><br><b>vas usage:</b><li>smt_request_clean: specifies intelligent acceleration requests by count.</li><li>quic_request: specifies quic requests by count.</li><li>bot_request_clean: specifies bot requests by count.</li><li>cls_count: specifies the number of real-time log pushes by count.</li><li>ddos_bandwidth: specifies elastic ddos protection bandwidth in bps.</li><br><b>edge computing usage:</b><li>edgefunction_request: specifies the number of edge function requests by count.</li><li>edgefunction_cpu_time: specifies edge function cpu processing time in milliseconds.</li>.
<b>Media processing usage:</b> <li>total_transcode: all specification audio, video jit transcoding, repackaging duration, in seconds;</li> <li>remux: repackaging duration, in seconds;</li> <li>transcode_audio: audio transcoding duration, in seconds;</li> <li>transcode_H264_SD: H.264 encoded standard-definition video (short side ≤ 480 px) duration, in seconds;</li> <li>transcode_H264_HD: H.264 encoded high-definition video (short side ≤ 720 px) duration, in seconds;</li> <li>transcode_H264_FHD: H.264 encoded full HD video (short side ≤ 1080 px) duration, in seconds;</li> <li>transcode_H264_2K: H.264 encoded 2K video (short side ≤ 1440 px) duration, in seconds.</li>. 
     * @return MetricName Metric list. values as follows:.
<b>l4/l7 acceleration traffic:</b><li>acc_flux: specifies content acceleration traffic in bytes.</li><li>smt_flux: specifies smart acceleration traffic in bytes.</li><li>l4_flux: specifies layer 4 acceleration traffic in bytes.</li><li>sec_flux: specifies independent protection traffic in bytes.</li><li>zxctg_flux: specifies network optimization traffic in the chinese mainland in bytes.</li><br><b>l4/l7 acceleration bandwidth:</b><li>acc_bandwidth: specifies content acceleration bandwidth in bps.</li><li>smt_bandwidth: specifies intelligent acceleration bandwidth in bps.</li><li>l4_bandwidth: specifies layer 4 acceleration bandwidth in bps.</li><li>sec_bandwidth: specifies exclusive protection bandwidth in bps.</li><li>zxctg_bandwidth: specifies network optimization bandwidth in the chinese mainland in bps.</li><br><b>HTTP/HTTPS security requests:</b><li>sec_request_clean: specifies HTTP/HTTPS requests by count.</li><br><b>vas usage:</b><li>smt_request_clean: specifies intelligent acceleration requests by count.</li><li>quic_request: specifies quic requests by count.</li><li>bot_request_clean: specifies bot requests by count.</li><li>cls_count: specifies the number of real-time log pushes by count.</li><li>ddos_bandwidth: specifies elastic ddos protection bandwidth in bps.</li><br><b>edge computing usage:</b><li>edgefunction_request: specifies the number of edge function requests by count.</li><li>edgefunction_cpu_time: specifies edge function cpu processing time in milliseconds.</li>.
<b>Media processing usage:</b> <li>total_transcode: all specification audio, video jit transcoding, repackaging duration, in seconds;</li> <li>remux: repackaging duration, in seconds;</li> <li>transcode_audio: audio transcoding duration, in seconds;</li> <li>transcode_H264_SD: H.264 encoded standard-definition video (short side ≤ 480 px) duration, in seconds;</li> <li>transcode_H264_HD: H.264 encoded high-definition video (short side ≤ 720 px) duration, in seconds;</li> <li>transcode_H264_FHD: H.264 encoded full HD video (short side ≤ 1080 px) duration, in seconds;</li> <li>transcode_H264_2K: H.264 encoded 2K video (short side ≤ 1440 px) duration, in seconds.</li>.
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric list. values as follows:.
<b>l4/l7 acceleration traffic:</b><li>acc_flux: specifies content acceleration traffic in bytes.</li><li>smt_flux: specifies smart acceleration traffic in bytes.</li><li>l4_flux: specifies layer 4 acceleration traffic in bytes.</li><li>sec_flux: specifies independent protection traffic in bytes.</li><li>zxctg_flux: specifies network optimization traffic in the chinese mainland in bytes.</li><br><b>l4/l7 acceleration bandwidth:</b><li>acc_bandwidth: specifies content acceleration bandwidth in bps.</li><li>smt_bandwidth: specifies intelligent acceleration bandwidth in bps.</li><li>l4_bandwidth: specifies layer 4 acceleration bandwidth in bps.</li><li>sec_bandwidth: specifies exclusive protection bandwidth in bps.</li><li>zxctg_bandwidth: specifies network optimization bandwidth in the chinese mainland in bps.</li><br><b>HTTP/HTTPS security requests:</b><li>sec_request_clean: specifies HTTP/HTTPS requests by count.</li><br><b>vas usage:</b><li>smt_request_clean: specifies intelligent acceleration requests by count.</li><li>quic_request: specifies quic requests by count.</li><li>bot_request_clean: specifies bot requests by count.</li><li>cls_count: specifies the number of real-time log pushes by count.</li><li>ddos_bandwidth: specifies elastic ddos protection bandwidth in bps.</li><br><b>edge computing usage:</b><li>edgefunction_request: specifies the number of edge function requests by count.</li><li>edgefunction_cpu_time: specifies edge function cpu processing time in milliseconds.</li>.
<b>Media processing usage:</b> <li>total_transcode: all specification audio, video jit transcoding, repackaging duration, in seconds;</li> <li>remux: repackaging duration, in seconds;</li> <li>transcode_audio: audio transcoding duration, in seconds;</li> <li>transcode_H264_SD: H.264 encoded standard-definition video (short side ≤ 480 px) duration, in seconds;</li> <li>transcode_H264_HD: H.264 encoded high-definition video (short side ≤ 720 px) duration, in seconds;</li> <li>transcode_H264_FHD: H.264 encoded full HD video (short side ≤ 1080 px) duration, in seconds;</li> <li>transcode_H264_2K: H.264 encoded 2K video (short side ≤ 1440 px) duration, in seconds.</li>.
     * @param MetricName Metric list. values as follows:.
<b>l4/l7 acceleration traffic:</b><li>acc_flux: specifies content acceleration traffic in bytes.</li><li>smt_flux: specifies smart acceleration traffic in bytes.</li><li>l4_flux: specifies layer 4 acceleration traffic in bytes.</li><li>sec_flux: specifies independent protection traffic in bytes.</li><li>zxctg_flux: specifies network optimization traffic in the chinese mainland in bytes.</li><br><b>l4/l7 acceleration bandwidth:</b><li>acc_bandwidth: specifies content acceleration bandwidth in bps.</li><li>smt_bandwidth: specifies intelligent acceleration bandwidth in bps.</li><li>l4_bandwidth: specifies layer 4 acceleration bandwidth in bps.</li><li>sec_bandwidth: specifies exclusive protection bandwidth in bps.</li><li>zxctg_bandwidth: specifies network optimization bandwidth in the chinese mainland in bps.</li><br><b>HTTP/HTTPS security requests:</b><li>sec_request_clean: specifies HTTP/HTTPS requests by count.</li><br><b>vas usage:</b><li>smt_request_clean: specifies intelligent acceleration requests by count.</li><li>quic_request: specifies quic requests by count.</li><li>bot_request_clean: specifies bot requests by count.</li><li>cls_count: specifies the number of real-time log pushes by count.</li><li>ddos_bandwidth: specifies elastic ddos protection bandwidth in bps.</li><br><b>edge computing usage:</b><li>edgefunction_request: specifies the number of edge function requests by count.</li><li>edgefunction_cpu_time: specifies edge function cpu processing time in milliseconds.</li>.
<b>Media processing usage:</b> <li>total_transcode: all specification audio, video jit transcoding, repackaging duration, in seconds;</li> <li>remux: repackaging duration, in seconds;</li> <li>transcode_audio: audio transcoding duration, in seconds;</li> <li>transcode_H264_SD: H.264 encoded standard-definition video (short side ≤ 480 px) duration, in seconds;</li> <li>transcode_H264_HD: H.264 encoded high-definition video (short side ≤ 720 px) duration, in seconds;</li> <li>transcode_H264_FHD: H.264 encoded full HD video (short side ≤ 1080 px) duration, in seconds;</li> <li>transcode_H264_2K: H.264 encoded 2K video (short side ≤ 1440 px) duration, in seconds.</li>.
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
     * Get Filter criteria. the detailed values of filter criteria are as follows:.
<li>host: specifies the domain name to filter by. example value: test.example.com.<br></li>.
<li>proxy-id: specifies the l4 proxy instance id for filtering. example value: sid-2rugn89bkla9.</li>.
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>

Specifies that `BillingDataFilter` with the same `Type` have an "or" relationship with each other, while those with different `Type` have an "and" relationship between them. 
     * @return Filters Filter criteria. the detailed values of filter criteria are as follows:.
<li>host: specifies the domain name to filter by. example value: test.example.com.<br></li>.
<li>proxy-id: specifies the l4 proxy instance id for filtering. example value: sid-2rugn89bkla9.</li>.
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>

Specifies that `BillingDataFilter` with the same `Type` have an "or" relationship with each other, while those with different `Type` have an "and" relationship between them.
     */
    public BillingDataFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. the detailed values of filter criteria are as follows:.
<li>host: specifies the domain name to filter by. example value: test.example.com.<br></li>.
<li>proxy-id: specifies the l4 proxy instance id for filtering. example value: sid-2rugn89bkla9.</li>.
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>

Specifies that `BillingDataFilter` with the same `Type` have an "or" relationship with each other, while those with different `Type` have an "and" relationship between them.
     * @param Filters Filter criteria. the detailed values of filter criteria are as follows:.
<li>host: specifies the domain name to filter by. example value: test.example.com.<br></li>.
<li>proxy-id: specifies the l4 proxy instance id for filtering. example value: sid-2rugn89bkla9.</li>.
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>

Specifies that `BillingDataFilter` with the same `Type` have an "or" relationship with each other, while those with different `Type` have an "and" relationship between them.
     */
    public void setFilters(BillingDataFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Grouping aggregate dimension. a maximum of two dimensions can be grouped simultaneously. values are as follows: <li>zone-id: group by site id. if the content identifier functionality is used, priority is given to grouping by content identifier;<br></li> <li>host: group by domain name;<br></li> <li>proxy-id: group by layer 4 proxy instance id;<br></li> <li>region-id: group by billing region.</li>. 
     * @return GroupBy Grouping aggregate dimension. a maximum of two dimensions can be grouped simultaneously. values are as follows: <li>zone-id: group by site id. if the content identifier functionality is used, priority is given to grouping by content identifier;<br></li> <li>host: group by domain name;<br></li> <li>proxy-id: group by layer 4 proxy instance id;<br></li> <li>region-id: group by billing region.</li>.
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set Grouping aggregate dimension. a maximum of two dimensions can be grouped simultaneously. values are as follows: <li>zone-id: group by site id. if the content identifier functionality is used, priority is given to grouping by content identifier;<br></li> <li>host: group by domain name;<br></li> <li>proxy-id: group by layer 4 proxy instance id;<br></li> <li>region-id: group by billing region.</li>.
     * @param GroupBy Grouping aggregate dimension. a maximum of two dimensions can be grouped simultaneously. values are as follows: <li>zone-id: group by site id. if the content identifier functionality is used, priority is given to grouping by content identifier;<br></li> <li>host: group by domain name;<br></li> <li>proxy-id: group by layer 4 proxy instance id;<br></li> <li>region-id: group by billing region.</li>.
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

