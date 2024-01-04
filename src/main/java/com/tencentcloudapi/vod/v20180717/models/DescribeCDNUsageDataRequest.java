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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCDNUsageDataRequest extends AbstractModel {

    /**
    * Start date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). The end date must be after the start date.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * CDN statistics type. Valid values:
<li>Flux: traffic in bytes.</li>
<li>Bandwidth: bandwidth in bps.</li>
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Time granularity of usage data in minutes. Valid values:
<li>5: 5-minute granularity. The data at 5-minute granularity in the query period will be returned.</li>
<li>60: 1-hour granularity. The data at 1-hour granularity in the query period will be returned.</li>
<li>1440: 1-day granularity. The data at 1-day granularity in the query period will be returned.</li>
Default value: 1440. Data at 1-day granularity will be returned.
    */
    @SerializedName("DataInterval")
    @Expose
    private Long DataInterval;

    /**
    * List of domain names. The usage data of up to 20 domain names can be queried at a time. You can specify multiple domain names and query their combined usage data. The usage data of all domain names will be returned by default.
    */
    @SerializedName("DomainNames")
    @Expose
    private String [] DomainNames;

    /**
     * Get Start date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return StartTime Start date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param StartTime Start date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). The end date must be after the start date. 
     * @return EndTime End date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). The end date must be after the start date.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). The end date must be after the start date.
     * @param EndTime End date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). The end date must be after the start date.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get CDN statistics type. Valid values:
<li>Flux: traffic in bytes.</li>
<li>Bandwidth: bandwidth in bps.</li> 
     * @return DataType CDN statistics type. Valid values:
<li>Flux: traffic in bytes.</li>
<li>Bandwidth: bandwidth in bps.</li>
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set CDN statistics type. Valid values:
<li>Flux: traffic in bytes.</li>
<li>Bandwidth: bandwidth in bps.</li>
     * @param DataType CDN statistics type. Valid values:
<li>Flux: traffic in bytes.</li>
<li>Bandwidth: bandwidth in bps.</li>
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    /**
     * Get <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Time granularity of usage data in minutes. Valid values:
<li>5: 5-minute granularity. The data at 5-minute granularity in the query period will be returned.</li>
<li>60: 1-hour granularity. The data at 1-hour granularity in the query period will be returned.</li>
<li>1440: 1-day granularity. The data at 1-day granularity in the query period will be returned.</li>
Default value: 1440. Data at 1-day granularity will be returned. 
     * @return DataInterval Time granularity of usage data in minutes. Valid values:
<li>5: 5-minute granularity. The data at 5-minute granularity in the query period will be returned.</li>
<li>60: 1-hour granularity. The data at 1-hour granularity in the query period will be returned.</li>
<li>1440: 1-day granularity. The data at 1-day granularity in the query period will be returned.</li>
Default value: 1440. Data at 1-day granularity will be returned.
     */
    public Long getDataInterval() {
        return this.DataInterval;
    }

    /**
     * Set Time granularity of usage data in minutes. Valid values:
<li>5: 5-minute granularity. The data at 5-minute granularity in the query period will be returned.</li>
<li>60: 1-hour granularity. The data at 1-hour granularity in the query period will be returned.</li>
<li>1440: 1-day granularity. The data at 1-day granularity in the query period will be returned.</li>
Default value: 1440. Data at 1-day granularity will be returned.
     * @param DataInterval Time granularity of usage data in minutes. Valid values:
<li>5: 5-minute granularity. The data at 5-minute granularity in the query period will be returned.</li>
<li>60: 1-hour granularity. The data at 1-hour granularity in the query period will be returned.</li>
<li>1440: 1-day granularity. The data at 1-day granularity in the query period will be returned.</li>
Default value: 1440. Data at 1-day granularity will be returned.
     */
    public void setDataInterval(Long DataInterval) {
        this.DataInterval = DataInterval;
    }

    /**
     * Get List of domain names. The usage data of up to 20 domain names can be queried at a time. You can specify multiple domain names and query their combined usage data. The usage data of all domain names will be returned by default. 
     * @return DomainNames List of domain names. The usage data of up to 20 domain names can be queried at a time. You can specify multiple domain names and query their combined usage data. The usage data of all domain names will be returned by default.
     */
    public String [] getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set List of domain names. The usage data of up to 20 domain names can be queried at a time. You can specify multiple domain names and query their combined usage data. The usage data of all domain names will be returned by default.
     * @param DomainNames List of domain names. The usage data of up to 20 domain names can be queried at a time. You can specify multiple domain names and query their combined usage data. The usage data of all domain names will be returned by default.
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

