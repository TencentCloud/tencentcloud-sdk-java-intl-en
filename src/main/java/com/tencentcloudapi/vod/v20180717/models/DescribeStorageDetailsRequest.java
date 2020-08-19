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

public class DescribeStorageDetailsRequest extends AbstractModel{

    /**
    * Start time in ISO 8601 format. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time in ISO 8601 format, which must be after the start time. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Query time interval. Valid values:
<li>Minute: once per minute.</li>
<li>Hour: once per hour.</li>
<li>Day: once per day.</li>
The default value is determined by the time span. `Minute` will be used if the time span is less than 1 hour, `Hour` if less than or equal to 7 days, and `Day` if more than 7 days.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Storage class to be queried. Valid values:
<li>TotalStorage: total storage capacity.</li>
<li>StandardStorage: Standard storage.</li>
<li>InfrequentStorage: Standard_IA storage.</li>
Default value: TotalStorage.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
When the value of this field is 1, the total usage of all subapplications (including primary application) are queried by an admin.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Start time in ISO 8601 format. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return StartTime Start time in ISO 8601 format. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time in ISO 8601 format. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param StartTime Start time in ISO 8601 format. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time in ISO 8601 format, which must be after the start time. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return EndTime End time in ISO 8601 format, which must be after the start time. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in ISO 8601 format, which must be after the start time. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param EndTime End time in ISO 8601 format, which must be after the start time. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Query time interval. Valid values:
<li>Minute: once per minute.</li>
<li>Hour: once per hour.</li>
<li>Day: once per day.</li>
The default value is determined by the time span. `Minute` will be used if the time span is less than 1 hour, `Hour` if less than or equal to 7 days, and `Day` if more than 7 days. 
     * @return Interval Query time interval. Valid values:
<li>Minute: once per minute.</li>
<li>Hour: once per hour.</li>
<li>Day: once per day.</li>
The default value is determined by the time span. `Minute` will be used if the time span is less than 1 hour, `Hour` if less than or equal to 7 days, and `Day` if more than 7 days.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Query time interval. Valid values:
<li>Minute: once per minute.</li>
<li>Hour: once per hour.</li>
<li>Day: once per day.</li>
The default value is determined by the time span. `Minute` will be used if the time span is less than 1 hour, `Hour` if less than or equal to 7 days, and `Day` if more than 7 days.
     * @param Interval Query time interval. Valid values:
<li>Minute: once per minute.</li>
<li>Hour: once per hour.</li>
<li>Day: once per day.</li>
The default value is determined by the time span. `Minute` will be used if the time span is less than 1 hour, `Hour` if less than or equal to 7 days, and `Day` if more than 7 days.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Storage class to be queried. Valid values:
<li>TotalStorage: total storage capacity.</li>
<li>StandardStorage: Standard storage.</li>
<li>InfrequentStorage: Standard_IA storage.</li>
Default value: TotalStorage. 
     * @return StorageType Storage class to be queried. Valid values:
<li>TotalStorage: total storage capacity.</li>
<li>StandardStorage: Standard storage.</li>
<li>InfrequentStorage: Standard_IA storage.</li>
Default value: TotalStorage.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Storage class to be queried. Valid values:
<li>TotalStorage: total storage capacity.</li>
<li>StandardStorage: Standard storage.</li>
<li>InfrequentStorage: Standard_IA storage.</li>
Default value: TotalStorage.
     * @param StorageType Storage class to be queried. Valid values:
<li>TotalStorage: total storage capacity.</li>
<li>StandardStorage: Standard storage.</li>
<li>InfrequentStorage: Standard_IA storage.</li>
Default value: TotalStorage.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
When the value of this field is 1, the total usage of all subapplications (including primary application) are queried by an admin. 
     * @return SubAppId [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
When the value of this field is 1, the total usage of all subapplications (including primary application) are queried by an admin.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
When the value of this field is 1, the total usage of all subapplications (including primary application) are queried by an admin.
     * @param SubAppId [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
When the value of this field is 1, the total usage of all subapplications (including primary application) are queried by an admin.
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
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

