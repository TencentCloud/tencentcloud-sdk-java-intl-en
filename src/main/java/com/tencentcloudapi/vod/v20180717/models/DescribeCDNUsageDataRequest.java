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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCDNUsageDataRequest extends AbstractModel{

    /**
    * Start date in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End date in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). The end date must be after the start date.
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
    * Time granularity of usage data in minutes. Valid values:
<li>5: 5-minute granularity, which returns the details at the 5-minute granularity within the specified time range.</li>
<li>60: 1-hour granularity, which returns the details at the 1-hour granularity within the specified time range.</li>
<li>1440: 1-day granularity, which returns the details at the 1-day granularity within the specified time range.</li>
Default value: 1440. Data at the 1-day granularity will be returned.
When the value of this field is 1, the total usage of all subapplications (including primary application) are queried by an admin.
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
    * ID of a [subapplication](/document/product/266/14574) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
When the value of this field is 1, the total usage of all subapplications (including primary application) are queried by an admin. In this case, only 1-day granularity is supported.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Start date in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return StartTime Start date in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start date in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param StartTime Start date in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End date in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). The end date must be after the start date. 
     * @return EndTime End date in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). The end date must be after the start date.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End date in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). The end date must be after the start date.
     * @param EndTime End date in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). The end date must be after the start date.
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
     * Get Time granularity of usage data in minutes. Valid values:
<li>5: 5-minute granularity, which returns the details at the 5-minute granularity within the specified time range.</li>
<li>60: 1-hour granularity, which returns the details at the 1-hour granularity within the specified time range.</li>
<li>1440: 1-day granularity, which returns the details at the 1-day granularity within the specified time range.</li>
Default value: 1440. Data at the 1-day granularity will be returned.
When the value of this field is 1, the total usage of all subapplications (including primary application) are queried by an admin. 
     * @return DataInterval Time granularity of usage data in minutes. Valid values:
<li>5: 5-minute granularity, which returns the details at the 5-minute granularity within the specified time range.</li>
<li>60: 1-hour granularity, which returns the details at the 1-hour granularity within the specified time range.</li>
<li>1440: 1-day granularity, which returns the details at the 1-day granularity within the specified time range.</li>
Default value: 1440. Data at the 1-day granularity will be returned.
When the value of this field is 1, the total usage of all subapplications (including primary application) are queried by an admin.
     */
    public Long getDataInterval() {
        return this.DataInterval;
    }

    /**
     * Set Time granularity of usage data in minutes. Valid values:
<li>5: 5-minute granularity, which returns the details at the 5-minute granularity within the specified time range.</li>
<li>60: 1-hour granularity, which returns the details at the 1-hour granularity within the specified time range.</li>
<li>1440: 1-day granularity, which returns the details at the 1-day granularity within the specified time range.</li>
Default value: 1440. Data at the 1-day granularity will be returned.
When the value of this field is 1, the total usage of all subapplications (including primary application) are queried by an admin.
     * @param DataInterval Time granularity of usage data in minutes. Valid values:
<li>5: 5-minute granularity, which returns the details at the 5-minute granularity within the specified time range.</li>
<li>60: 1-hour granularity, which returns the details at the 1-hour granularity within the specified time range.</li>
<li>1440: 1-day granularity, which returns the details at the 1-day granularity within the specified time range.</li>
Default value: 1440. Data at the 1-day granularity will be returned.
When the value of this field is 1, the total usage of all subapplications (including primary application) are queried by an admin.
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

    /**
     * Get ID of a [subapplication](/document/product/266/14574) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
When the value of this field is 1, the total usage of all subapplications (including primary application) are queried by an admin. In this case, only 1-day granularity is supported. 
     * @return SubAppId ID of a [subapplication](/document/product/266/14574) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
When the value of this field is 1, the total usage of all subapplications (including primary application) are queried by an admin. In this case, only 1-day granularity is supported.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set ID of a [subapplication](/document/product/266/14574) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
When the value of this field is 1, the total usage of all subapplications (including primary application) are queried by an admin. In this case, only 1-day granularity is supported.
     * @param SubAppId ID of a [subapplication](/document/product/266/14574) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
When the value of this field is 1, the total usage of all subapplications (including primary application) are queried by an admin. In this case, only 1-day granularity is supported.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "DataInterval", this.DataInterval);
        this.setParamArraySimple(map, prefix + "DomainNames.", this.DomainNames);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

