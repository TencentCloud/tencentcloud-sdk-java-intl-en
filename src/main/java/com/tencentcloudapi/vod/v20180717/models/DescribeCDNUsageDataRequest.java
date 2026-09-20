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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCDNUsageDataRequest extends AbstractModel {

    /**
    * Start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End date, which should be greater than the start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * CDN statistics data types. Valid values:
<li>Flux: Traffic, unit: byte.</li>
<li>Bandwidth: bandwidth, in bps.</li>
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Time granularity of usage data. Unit: minute. Valid values:
<li>5: 5 minutes, returns detailed data at a 5-minute granularity within the specified query time.</li>
<li>60: 1-hour granularity, returns data at 1-hour granularity within the specified query time.</li>
<li>1440: Day granularity. Return the data of 1-day granularity within the specified query time.</li>
Default value: 1440. The data of day granularity is returned.
    */
    @SerializedName("DataInterval")
    @Expose
    private Long DataInterval;

    /**
    * Domain name list. Up to 20 domain names can be queried for usage data at a time. Multiple domain names can be specified to query the overlaid usage data of these domains. By default, the overlaid usage data of ALL domain names is returned.
    */
    @SerializedName("DomainNames")
    @Expose
    private String [] DomainNames;

    /**
     * Get Start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return StartTime Start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param StartTime Start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End date, which should be greater than the start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return EndTime End date, which should be greater than the start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End date, which should be greater than the start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param EndTime End date, which should be greater than the start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get CDN statistics data types. Valid values:
<li>Flux: Traffic, unit: byte.</li>
<li>Bandwidth: bandwidth, in bps.</li> 
     * @return DataType CDN statistics data types. Valid values:
<li>Flux: Traffic, unit: byte.</li>
<li>Bandwidth: bandwidth, in bps.</li>
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set CDN statistics data types. Valid values:
<li>Flux: Traffic, unit: byte.</li>
<li>Bandwidth: bandwidth, in bps.</li>
     * @param DataType CDN statistics data types. Valid values:
<li>Flux: Traffic, unit: byte.</li>
<li>Bandwidth: bandwidth, in bps.</li>
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Time granularity of usage data. Unit: minute. Valid values:
<li>5: 5 minutes, returns detailed data at a 5-minute granularity within the specified query time.</li>
<li>60: 1-hour granularity, returns data at 1-hour granularity within the specified query time.</li>
<li>1440: Day granularity. Return the data of 1-day granularity within the specified query time.</li>
Default value: 1440. The data of day granularity is returned. 
     * @return DataInterval Time granularity of usage data. Unit: minute. Valid values:
<li>5: 5 minutes, returns detailed data at a 5-minute granularity within the specified query time.</li>
<li>60: 1-hour granularity, returns data at 1-hour granularity within the specified query time.</li>
<li>1440: Day granularity. Return the data of 1-day granularity within the specified query time.</li>
Default value: 1440. The data of day granularity is returned.
     */
    public Long getDataInterval() {
        return this.DataInterval;
    }

    /**
     * Set Time granularity of usage data. Unit: minute. Valid values:
<li>5: 5 minutes, returns detailed data at a 5-minute granularity within the specified query time.</li>
<li>60: 1-hour granularity, returns data at 1-hour granularity within the specified query time.</li>
<li>1440: Day granularity. Return the data of 1-day granularity within the specified query time.</li>
Default value: 1440. The data of day granularity is returned.
     * @param DataInterval Time granularity of usage data. Unit: minute. Valid values:
<li>5: 5 minutes, returns detailed data at a 5-minute granularity within the specified query time.</li>
<li>60: 1-hour granularity, returns data at 1-hour granularity within the specified query time.</li>
<li>1440: Day granularity. Return the data of 1-day granularity within the specified query time.</li>
Default value: 1440. The data of day granularity is returned.
     */
    public void setDataInterval(Long DataInterval) {
        this.DataInterval = DataInterval;
    }

    /**
     * Get Domain name list. Up to 20 domain names can be queried for usage data at a time. Multiple domain names can be specified to query the overlaid usage data of these domains. By default, the overlaid usage data of ALL domain names is returned. 
     * @return DomainNames Domain name list. Up to 20 domain names can be queried for usage data at a time. Multiple domain names can be specified to query the overlaid usage data of these domains. By default, the overlaid usage data of ALL domain names is returned.
     */
    public String [] getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set Domain name list. Up to 20 domain names can be queried for usage data at a time. Multiple domain names can be specified to query the overlaid usage data of these domains. By default, the overlaid usage data of ALL domain names is returned.
     * @param DomainNames Domain name list. Up to 20 domain names can be queried for usage data at a time. Multiple domain names can be specified to query the overlaid usage data of these domains. By default, the overlaid usage data of ALL domain names is returned.
     */
    public void setDomainNames(String [] DomainNames) {
        this.DomainNames = DomainNames;
    }

    public DescribeCDNUsageDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCDNUsageDataRequest(DescribeCDNUsageDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DataType != null) {
            this.DataType = new String(source.DataType);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.DataInterval != null) {
            this.DataInterval = new Long(source.DataInterval);
        }
        if (source.DomainNames != null) {
            this.DomainNames = new String[source.DomainNames.length];
            for (int i = 0; i < source.DomainNames.length; i++) {
                this.DomainNames[i] = new String(source.DomainNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "DataInterval", this.DataInterval);
        this.setParamArraySimple(map, prefix + "DomainNames.", this.DomainNames);

    }
}

