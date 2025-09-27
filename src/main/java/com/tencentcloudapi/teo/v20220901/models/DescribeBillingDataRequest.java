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
    * The start time. Data will be returned according to the timezone of the input timestamp.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days. The timezone of the end timestamp must be consistent with the start timestamp, and data will be returned according to the timezone of the input timestamps.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Site ID set. This parameter is required. A maximum of 100 site ids can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. Querying account-level data requires permissions for all site resources in this API.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Metric list. Values as follows:.
<b>L4/L7 acceleration traffic:</b><li>acc_flux: specifies content acceleration traffic in bytes.</li><li>smt_flux: specifies smart acceleration traffic in bytes.</li><li>l4_flux: specifies layer 4 acceleration traffic in bytes.</li><li>sec_flux: specifies independent protection traffic in bytes.</li><li>zxctg_flux: specifies network optimization traffic in the chinese mainland in bytes.</li><br><b>L4/L7 acceleration bandwidth:</b><li>acc_bandwidth: specifies content acceleration bandwidth in bps.</li><li>smt_bandwidth: specifies intelligent acceleration bandwidth in bps.</li><li>l4_bandwidth: specifies layer 4 acceleration bandwidth in bps.</li><li>sec_bandwidth: specifies exclusive protection bandwidth in bps.</li><li>zxctg_bandwidth: specifies network optimization bandwidth in the chinese mainland in bps.</li><br><b>HTTP/HTTPS security requests:</b><li>sec_request_clean: specifies HTTP/HTTPS requests by count.</li><br><b>Value-added service usage:</b><li>smt_request_clean: specifies intelligent acceleration requests by count.</li><li>quic_request: specifies quic requests by count.</li><li>bot_request_clean: specifies bot requests by count.</li><li>cls_count: specifies the number of real-time log pushes by count.</li><li>ddos_bandwidth: specifies elastic ddos protection bandwidth in bps.</li><br><b>Edge computing usage:</b><li>edgefunction_request: specifies the number of edge function requests by count.</li><li>edgefunction_cpu_time: specifies edge function cpu processing time in milliseconds.</li>
<b>Media processing usage:</b> <li>total_transcode: all specification audio, video jit transcoding, repackaging duration, in seconds;</li> <li>remux: repackaging duration, in seconds;</li> <li>transcode_audio: audio transcoding duration, in seconds;</li> <li>transcode_H264_SD: H.264 encoded standard-definition video (short side less than or equal to 480 px) duration, in seconds;</li> <li>transcode_H264_HD: H.264 encoded high-definition video (short side less than or equal to 720 px) duration, in seconds;</li> <li>transcode_H264_FHD: H.264 encoded full HD video (short side less than or equal to 1080 px) duration, in seconds;</li> <li>transcode_H264_2K: H.264 encoded 2K video (short side less than or equal to 1440 px) duration, in seconds.</li>
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
<li>host: Specifies the domain name to filter by. Example value: test.example.com<br></li>
<li>proxy-id: Specifies the L4 proxy instance ID for filtering. Example value: sid-2rugn89bkla9.</li>
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>

Note: `BillingDataFilter` with the same `Type` have an "or" relationship with each other, while those with different `Type` have an "and" relationship between them.
    */
    @SerializedName("Filters")
    @Expose
    private BillingDataFilter [] Filters;

    /**
    * Aggregation dimensions for grouping. You are allowed to group by up to two dimensions at the same time. Valid values are as follows:<li>zone-id: Group by zone ID. If the content identifier feature is used, it will take precedence and group by content identifier first;<br></li> <li>host: Group by domain name;<br></li> <li>proxy-id: Group by L4 proxy instance ID;<br></li> <li>region-id: Group by billing region.</li>
Note: The output parameter's default maximum value for the number of groups is 200. If you encounter an error related to this limit, you should reduce the number of groups in the final output by narrowing down the query scope using `ZoneIds.N` or `Filters.N` parameters, or by decreasing the number of dimensions specified in the `GroupBy.N` parameter.
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

    /**
     * Get The start time. Data will be returned according to the timezone of the input timestamp. 
     * @return StartTime The start time. Data will be returned according to the timezone of the input timestamp.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time. Data will be returned according to the timezone of the input timestamp.
     * @param StartTime The start time. Data will be returned according to the timezone of the input timestamp.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days. The timezone of the end timestamp must be consistent with the start timestamp, and data will be returned according to the timezone of the input timestamps. 
     * @return EndTime The end time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days. The timezone of the end timestamp must be consistent with the start timestamp, and data will be returned according to the timezone of the input timestamps.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days. The timezone of the end timestamp must be consistent with the start timestamp, and data will be returned according to the timezone of the input timestamps.
     * @param EndTime The end time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days. The timezone of the end timestamp must be consistent with the start timestamp, and data will be returned according to the timezone of the input timestamps.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Site ID set. This parameter is required. A maximum of 100 site ids can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. Querying account-level data requires permissions for all site resources in this API. 
     * @return ZoneIds Site ID set. This parameter is required. A maximum of 100 site ids can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. Querying account-level data requires permissions for all site resources in this API.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site ID set. This parameter is required. A maximum of 100 site ids can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. Querying account-level data requires permissions for all site resources in this API.
     * @param ZoneIds Site ID set. This parameter is required. A maximum of 100 site ids can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. Querying account-level data requires permissions for all site resources in this API.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Metric list. Values as follows:.
<b>L4/L7 acceleration traffic:</b><li>acc_flux: specifies content acceleration traffic in bytes.</li><li>smt_flux: specifies smart acceleration traffic in bytes.</li><li>l4_flux: specifies layer 4 acceleration traffic in bytes.</li><li>sec_flux: specifies independent protection traffic in bytes.</li><li>zxctg_flux: specifies network optimization traffic in the chinese mainland in bytes.</li><br><b>L4/L7 acceleration bandwidth:</b><li>acc_bandwidth: specifies content acceleration bandwidth in bps.</li><li>smt_bandwidth: specifies intelligent acceleration bandwidth in bps.</li><li>l4_bandwidth: specifies layer 4 acceleration bandwidth in bps.</li><li>sec_bandwidth: specifies exclusive protection bandwidth in bps.</li><li>zxctg_bandwidth: specifies network optimization bandwidth in the chinese mainland in bps.</li><br><b>HTTP/HTTPS security requests:</b><li>sec_request_clean: specifies HTTP/HTTPS requests by count.</li><br><b>Value-added service usage:</b><li>smt_request_clean: specifies intelligent acceleration requests by count.</li><li>quic_request: specifies quic requests by count.</li><li>bot_request_clean: specifies bot requests by count.</li><li>cls_count: specifies the number of real-time log pushes by count.</li><li>ddos_bandwidth: specifies elastic ddos protection bandwidth in bps.</li><br><b>Edge computing usage:</b><li>edgefunction_request: specifies the number of edge function requests by count.</li><li>edgefunction_cpu_time: specifies edge function cpu processing time in milliseconds.</li>
<b>Media processing usage:</b> <li>total_transcode: all specification audio, video jit transcoding, repackaging duration, in seconds;</li> <li>remux: repackaging duration, in seconds;</li> <li>transcode_audio: audio transcoding duration, in seconds;</li> <li>transcode_H264_SD: H.264 encoded standard-definition video (short side less than or equal to 480 px) duration, in seconds;</li> <li>transcode_H264_HD: H.264 encoded high-definition video (short side less than or equal to 720 px) duration, in seconds;</li> <li>transcode_H264_FHD: H.264 encoded full HD video (short side less than or equal to 1080 px) duration, in seconds;</li> <li>transcode_H264_2K: H.264 encoded 2K video (short side less than or equal to 1440 px) duration, in seconds.</li> 
     * @return MetricName Metric list. Values as follows:.
<b>L4/L7 acceleration traffic:</b><li>acc_flux: specifies content acceleration traffic in bytes.</li><li>smt_flux: specifies smart acceleration traffic in bytes.</li><li>l4_flux: specifies layer 4 acceleration traffic in bytes.</li><li>sec_flux: specifies independent protection traffic in bytes.</li><li>zxctg_flux: specifies network optimization traffic in the chinese mainland in bytes.</li><br><b>L4/L7 acceleration bandwidth:</b><li>acc_bandwidth: specifies content acceleration bandwidth in bps.</li><li>smt_bandwidth: specifies intelligent acceleration bandwidth in bps.</li><li>l4_bandwidth: specifies layer 4 acceleration bandwidth in bps.</li><li>sec_bandwidth: specifies exclusive protection bandwidth in bps.</li><li>zxctg_bandwidth: specifies network optimization bandwidth in the chinese mainland in bps.</li><br><b>HTTP/HTTPS security requests:</b><li>sec_request_clean: specifies HTTP/HTTPS requests by count.</li><br><b>Value-added service usage:</b><li>smt_request_clean: specifies intelligent acceleration requests by count.</li><li>quic_request: specifies quic requests by count.</li><li>bot_request_clean: specifies bot requests by count.</li><li>cls_count: specifies the number of real-time log pushes by count.</li><li>ddos_bandwidth: specifies elastic ddos protection bandwidth in bps.</li><br><b>Edge computing usage:</b><li>edgefunction_request: specifies the number of edge function requests by count.</li><li>edgefunction_cpu_time: specifies edge function cpu processing time in milliseconds.</li>
<b>Media processing usage:</b> <li>total_transcode: all specification audio, video jit transcoding, repackaging duration, in seconds;</li> <li>remux: repackaging duration, in seconds;</li> <li>transcode_audio: audio transcoding duration, in seconds;</li> <li>transcode_H264_SD: H.264 encoded standard-definition video (short side less than or equal to 480 px) duration, in seconds;</li> <li>transcode_H264_HD: H.264 encoded high-definition video (short side less than or equal to 720 px) duration, in seconds;</li> <li>transcode_H264_FHD: H.264 encoded full HD video (short side less than or equal to 1080 px) duration, in seconds;</li> <li>transcode_H264_2K: H.264 encoded 2K video (short side less than or equal to 1440 px) duration, in seconds.</li>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric list. Values as follows:.
<b>L4/L7 acceleration traffic:</b><li>acc_flux: specifies content acceleration traffic in bytes.</li><li>smt_flux: specifies smart acceleration traffic in bytes.</li><li>l4_flux: specifies layer 4 acceleration traffic in bytes.</li><li>sec_flux: specifies independent protection traffic in bytes.</li><li>zxctg_flux: specifies network optimization traffic in the chinese mainland in bytes.</li><br><b>L4/L7 acceleration bandwidth:</b><li>acc_bandwidth: specifies content acceleration bandwidth in bps.</li><li>smt_bandwidth: specifies intelligent acceleration bandwidth in bps.</li><li>l4_bandwidth: specifies layer 4 acceleration bandwidth in bps.</li><li>sec_bandwidth: specifies exclusive protection bandwidth in bps.</li><li>zxctg_bandwidth: specifies network optimization bandwidth in the chinese mainland in bps.</li><br><b>HTTP/HTTPS security requests:</b><li>sec_request_clean: specifies HTTP/HTTPS requests by count.</li><br><b>Value-added service usage:</b><li>smt_request_clean: specifies intelligent acceleration requests by count.</li><li>quic_request: specifies quic requests by count.</li><li>bot_request_clean: specifies bot requests by count.</li><li>cls_count: specifies the number of real-time log pushes by count.</li><li>ddos_bandwidth: specifies elastic ddos protection bandwidth in bps.</li><br><b>Edge computing usage:</b><li>edgefunction_request: specifies the number of edge function requests by count.</li><li>edgefunction_cpu_time: specifies edge function cpu processing time in milliseconds.</li>
<b>Media processing usage:</b> <li>total_transcode: all specification audio, video jit transcoding, repackaging duration, in seconds;</li> <li>remux: repackaging duration, in seconds;</li> <li>transcode_audio: audio transcoding duration, in seconds;</li> <li>transcode_H264_SD: H.264 encoded standard-definition video (short side less than or equal to 480 px) duration, in seconds;</li> <li>transcode_H264_HD: H.264 encoded high-definition video (short side less than or equal to 720 px) duration, in seconds;</li> <li>transcode_H264_FHD: H.264 encoded full HD video (short side less than or equal to 1080 px) duration, in seconds;</li> <li>transcode_H264_2K: H.264 encoded 2K video (short side less than or equal to 1440 px) duration, in seconds.</li>
     * @param MetricName Metric list. Values as follows:.
<b>L4/L7 acceleration traffic:</b><li>acc_flux: specifies content acceleration traffic in bytes.</li><li>smt_flux: specifies smart acceleration traffic in bytes.</li><li>l4_flux: specifies layer 4 acceleration traffic in bytes.</li><li>sec_flux: specifies independent protection traffic in bytes.</li><li>zxctg_flux: specifies network optimization traffic in the chinese mainland in bytes.</li><br><b>L4/L7 acceleration bandwidth:</b><li>acc_bandwidth: specifies content acceleration bandwidth in bps.</li><li>smt_bandwidth: specifies intelligent acceleration bandwidth in bps.</li><li>l4_bandwidth: specifies layer 4 acceleration bandwidth in bps.</li><li>sec_bandwidth: specifies exclusive protection bandwidth in bps.</li><li>zxctg_bandwidth: specifies network optimization bandwidth in the chinese mainland in bps.</li><br><b>HTTP/HTTPS security requests:</b><li>sec_request_clean: specifies HTTP/HTTPS requests by count.</li><br><b>Value-added service usage:</b><li>smt_request_clean: specifies intelligent acceleration requests by count.</li><li>quic_request: specifies quic requests by count.</li><li>bot_request_clean: specifies bot requests by count.</li><li>cls_count: specifies the number of real-time log pushes by count.</li><li>ddos_bandwidth: specifies elastic ddos protection bandwidth in bps.</li><br><b>Edge computing usage:</b><li>edgefunction_request: specifies the number of edge function requests by count.</li><li>edgefunction_cpu_time: specifies edge function cpu processing time in milliseconds.</li>
<b>Media processing usage:</b> <li>total_transcode: all specification audio, video jit transcoding, repackaging duration, in seconds;</li> <li>remux: repackaging duration, in seconds;</li> <li>transcode_audio: audio transcoding duration, in seconds;</li> <li>transcode_H264_SD: H.264 encoded standard-definition video (short side less than or equal to 480 px) duration, in seconds;</li> <li>transcode_H264_HD: H.264 encoded high-definition video (short side less than or equal to 720 px) duration, in seconds;</li> <li>transcode_H264_FHD: H.264 encoded full HD video (short side less than or equal to 1080 px) duration, in seconds;</li> <li>transcode_H264_2K: H.264 encoded 2K video (short side less than or equal to 1440 px) duration, in seconds.</li>
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
<li>host: Specifies the domain name to filter by. Example value: test.example.com<br></li>
<li>proxy-id: Specifies the L4 proxy instance ID for filtering. Example value: sid-2rugn89bkla9.</li>
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>

Note: `BillingDataFilter` with the same `Type` have an "or" relationship with each other, while those with different `Type` have an "and" relationship between them. 
     * @return Filters Filter criteria. The detailed values of filter criteria are as follows:
<li>host: Specifies the domain name to filter by. Example value: test.example.com<br></li>
<li>proxy-id: Specifies the L4 proxy instance ID for filtering. Example value: sid-2rugn89bkla9.</li>
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>

Note: `BillingDataFilter` with the same `Type` have an "or" relationship with each other, while those with different `Type` have an "and" relationship between them.
     */
    public BillingDataFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The detailed values of filter criteria are as follows:
<li>host: Specifies the domain name to filter by. Example value: test.example.com<br></li>
<li>proxy-id: Specifies the L4 proxy instance ID for filtering. Example value: sid-2rugn89bkla9.</li>
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>

Note: `BillingDataFilter` with the same `Type` have an "or" relationship with each other, while those with different `Type` have an "and" relationship between them.
     * @param Filters Filter criteria. The detailed values of filter criteria are as follows:
<li>host: Specifies the domain name to filter by. Example value: test.example.com<br></li>
<li>proxy-id: Specifies the L4 proxy instance ID for filtering. Example value: sid-2rugn89bkla9.</li>
<li>region-id: Filter by billing region. Options:<br>  CH: Chinese mainland<br>  AF: Africa<br>  AS1: Asia-Pacific Region 1<br>  AS2: Asia-Pacific Region 2<br>  AS3: Asia-Pacific Region 3<br>  EU: Europe<br>  MidEast: Middle East<br>  NA: North America<br>  SA: South America</li>

Note: `BillingDataFilter` with the same `Type` have an "or" relationship with each other, while those with different `Type` have an "and" relationship between them.
     */
    public void setFilters(BillingDataFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Aggregation dimensions for grouping. You are allowed to group by up to two dimensions at the same time. Valid values are as follows:<li>zone-id: Group by zone ID. If the content identifier feature is used, it will take precedence and group by content identifier first;<br></li> <li>host: Group by domain name;<br></li> <li>proxy-id: Group by L4 proxy instance ID;<br></li> <li>region-id: Group by billing region.</li>
Note: The output parameter's default maximum value for the number of groups is 200. If you encounter an error related to this limit, you should reduce the number of groups in the final output by narrowing down the query scope using `ZoneIds.N` or `Filters.N` parameters, or by decreasing the number of dimensions specified in the `GroupBy.N` parameter. 
     * @return GroupBy Aggregation dimensions for grouping. You are allowed to group by up to two dimensions at the same time. Valid values are as follows:<li>zone-id: Group by zone ID. If the content identifier feature is used, it will take precedence and group by content identifier first;<br></li> <li>host: Group by domain name;<br></li> <li>proxy-id: Group by L4 proxy instance ID;<br></li> <li>region-id: Group by billing region.</li>
Note: The output parameter's default maximum value for the number of groups is 200. If you encounter an error related to this limit, you should reduce the number of groups in the final output by narrowing down the query scope using `ZoneIds.N` or `Filters.N` parameters, or by decreasing the number of dimensions specified in the `GroupBy.N` parameter.
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set Aggregation dimensions for grouping. You are allowed to group by up to two dimensions at the same time. Valid values are as follows:<li>zone-id: Group by zone ID. If the content identifier feature is used, it will take precedence and group by content identifier first;<br></li> <li>host: Group by domain name;<br></li> <li>proxy-id: Group by L4 proxy instance ID;<br></li> <li>region-id: Group by billing region.</li>
Note: The output parameter's default maximum value for the number of groups is 200. If you encounter an error related to this limit, you should reduce the number of groups in the final output by narrowing down the query scope using `ZoneIds.N` or `Filters.N` parameters, or by decreasing the number of dimensions specified in the `GroupBy.N` parameter.
     * @param GroupBy Aggregation dimensions for grouping. You are allowed to group by up to two dimensions at the same time. Valid values are as follows:<li>zone-id: Group by zone ID. If the content identifier feature is used, it will take precedence and group by content identifier first;<br></li> <li>host: Group by domain name;<br></li> <li>proxy-id: Group by L4 proxy instance ID;<br></li> <li>region-id: Group by billing region.</li>
Note: The output parameter's default maximum value for the number of groups is 200. If you encounter an error related to this limit, you should reduce the number of groups in the final output by narrowing down the query scope using `ZoneIds.N` or `Filters.N` parameters, or by decreasing the number of dimensions specified in the `GroupBy.N` parameter.
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

