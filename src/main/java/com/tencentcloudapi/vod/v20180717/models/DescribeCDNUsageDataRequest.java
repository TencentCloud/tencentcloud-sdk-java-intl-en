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
    * End date, which must be greater than the start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * CDN statistics data type. Valid value:
<li>Flux: Traffic volume, unit: byte.</li>
<li>Bandwidth: bandwidth, in bps.</li>
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
    * <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Time granularity of usage data, unit: minute. Valid values:
<li>5: 5 minutes, return detailed data at a minute granularity for the specified query time.</li>
<li>60: Hourly granularity. Returns the data of 1-hour granularity within the specified query time.</li>
<li>1440: Day granularity. Returns data with day granularity within the specified query time.</li>
The default value is 1440, which returns data with day granularity.
    */
    @SerializedName("DataInterval")
    @Expose
    private Long DataInterval;

    /**
    * Domain name list. Up to 20 domain names can be queried for usage data. Multiple values can be specified to query the superimposed usage data of these domains. Default returns the overlaid usage data of all domains.
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
     * Get End date, which must be greater than the start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return EndTime End date, which must be greater than the start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End date, which must be greater than the start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param EndTime End date, which must be greater than the start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get CDN statistics data type. Valid value:
<li>Flux: Traffic volume, unit: byte.</li>
<li>Bandwidth: bandwidth, in bps.</li> 
     * @return DataType CDN statistics data type. Valid value:
<li>Flux: Traffic volume, unit: byte.</li>
<li>Bandwidth: bandwidth, in bps.</li>
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set CDN statistics data type. Valid value:
<li>Flux: Traffic volume, unit: byte.</li>
<li>Bandwidth: bandwidth, in bps.</li>
     * @param DataType CDN statistics data type. Valid value:
<li>Flux: Traffic volume, unit: byte.</li>
<li>Bandwidth: bandwidth, in bps.</li>
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    /**
     * Get <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Time granularity of usage data, unit: minute. Valid values:
<li>5: 5 minutes, return detailed data at a minute granularity for the specified query time.</li>
<li>60: Hourly granularity. Returns the data of 1-hour granularity within the specified query time.</li>
<li>1440: Day granularity. Returns data with day granularity within the specified query time.</li>
The default value is 1440, which returns data with day granularity. 
     * @return DataInterval Time granularity of usage data, unit: minute. Valid values:
<li>5: 5 minutes, return detailed data at a minute granularity for the specified query time.</li>
<li>60: Hourly granularity. Returns the data of 1-hour granularity within the specified query time.</li>
<li>1440: Day granularity. Returns data with day granularity within the specified query time.</li>
The default value is 1440, which returns data with day granularity.
     */
    public Long getDataInterval() {
        return this.DataInterval;
    }

    /**
     * Set Time granularity of usage data, unit: minute. Valid values:
<li>5: 5 minutes, return detailed data at a minute granularity for the specified query time.</li>
<li>60: Hourly granularity. Returns the data of 1-hour granularity within the specified query time.</li>
<li>1440: Day granularity. Returns data with day granularity within the specified query time.</li>
The default value is 1440, which returns data with day granularity.
     * @param DataInterval Time granularity of usage data, unit: minute. Valid values:
<li>5: 5 minutes, return detailed data at a minute granularity for the specified query time.</li>
<li>60: Hourly granularity. Returns the data of 1-hour granularity within the specified query time.</li>
<li>1440: Day granularity. Returns data with day granularity within the specified query time.</li>
The default value is 1440, which returns data with day granularity.
     */
    public void setDataInterval(Long DataInterval) {
        this.DataInterval = DataInterval;
    }

    /**
     * Get Domain name list. Up to 20 domain names can be queried for usage data. Multiple values can be specified to query the superimposed usage data of these domains. Default returns the overlaid usage data of all domains. 
     * @return DomainNames Domain name list. Up to 20 domain names can be queried for usage data. Multiple values can be specified to query the superimposed usage data of these domains. Default returns the overlaid usage data of all domains.
     */
    public String [] getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set Domain name list. Up to 20 domain names can be queried for usage data. Multiple values can be specified to query the superimposed usage data of these domains. Default returns the overlaid usage data of all domains.
     * @param DomainNames Domain name list. Up to 20 domain names can be queried for usage data. Multiple values can be specified to query the superimposed usage data of these domains. Default returns the overlaid usage data of all domains.
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

