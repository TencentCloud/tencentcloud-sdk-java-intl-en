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

public class DescribeStorageDetailsRequest extends AbstractModel {

    /**
    * Start time in ISO 8601 format. For more information, please see [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time in ISO 8601 format, which should be larger than the start time. For more information, please see [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Time granularity. Valid values:
<li>Minute: 5-minute granularity</li>
<li>Day: 1-day granularity</li>
The value is set according to query period length by default. 5-minute granularity is set for periods no longer than 1 day, and 1-day granularity is set for periods longer than 1 day.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Queryed storage type, valid values:
<li>TotalStorage: total storage amount, the sum of standard, low-frequency, archive and deep archive storage amounts, excluding early deletion amount. </li>
<li>StandardStorage: Standard storage. </li>
<li>InfrequentStorage: low-frequency storage. </li>
<li>ArchiveStorage: archive storage. </li>
<li>DeepArchiveStorage: deep archive storage. </li>
<li>DeletedInfrequentStorage: The amount of early deletion of low-frequency storage. </li>
<li>DeletedArchiveStorage: The amount of archives deleted in advance. </li>
<li>DeletedDeepArchiveStorage: The amount of deep archive deletion in advance. 
<li>ArchiveStandardRetrieval: Archive standard retrieval amount. </li>
<li>ArchiveExpeditedRetrieval: archive quick retrieval amount. </li>
<li>ArchiveBulkRetrieval: Archive batch retrieval amount. </li>
<li>DeepArchiveStandardRetrieval: Deep archive standard retrieval amount. </li>
<li>DeepArchiveBulkRetrieval: Deep archive batch retrieval amount. </li>
<li>InfrequentRetrieval: Low-frequency storage retrieval amount. </li>
The default value is TotalStorage.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * Storage region to query. Valid values:
<li>Chinese Mainland</li>
<li>Outside Chinese Mainland</li>
Default value: Chinese Mainland
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get Start time in ISO 8601 format. For more information, please see [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=). 
     * @return StartTime Start time in ISO 8601 format. For more information, please see [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time in ISO 8601 format. For more information, please see [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
     * @param StartTime Start time in ISO 8601 format. For more information, please see [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time in ISO 8601 format, which should be larger than the start time. For more information, please see [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=). 
     * @return EndTime End time in ISO 8601 format, which should be larger than the start time. For more information, please see [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in ISO 8601 format, which should be larger than the start time. For more information, please see [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
     * @param EndTime End time in ISO 8601 format, which should be larger than the start time. For more information, please see [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get Time granularity. Valid values:
<li>Minute: 5-minute granularity</li>
<li>Day: 1-day granularity</li>
The value is set according to query period length by default. 5-minute granularity is set for periods no longer than 1 day, and 1-day granularity is set for periods longer than 1 day. 
     * @return Interval Time granularity. Valid values:
<li>Minute: 5-minute granularity</li>
<li>Day: 1-day granularity</li>
The value is set according to query period length by default. 5-minute granularity is set for periods no longer than 1 day, and 1-day granularity is set for periods longer than 1 day.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time granularity. Valid values:
<li>Minute: 5-minute granularity</li>
<li>Day: 1-day granularity</li>
The value is set according to query period length by default. 5-minute granularity is set for periods no longer than 1 day, and 1-day granularity is set for periods longer than 1 day.
     * @param Interval Time granularity. Valid values:
<li>Minute: 5-minute granularity</li>
<li>Day: 1-day granularity</li>
The value is set according to query period length by default. 5-minute granularity is set for periods no longer than 1 day, and 1-day granularity is set for periods longer than 1 day.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Queryed storage type, valid values:
<li>TotalStorage: total storage amount, the sum of standard, low-frequency, archive and deep archive storage amounts, excluding early deletion amount. </li>
<li>StandardStorage: Standard storage. </li>
<li>InfrequentStorage: low-frequency storage. </li>
<li>ArchiveStorage: archive storage. </li>
<li>DeepArchiveStorage: deep archive storage. </li>
<li>DeletedInfrequentStorage: The amount of early deletion of low-frequency storage. </li>
<li>DeletedArchiveStorage: The amount of archives deleted in advance. </li>
<li>DeletedDeepArchiveStorage: The amount of deep archive deletion in advance. 
<li>ArchiveStandardRetrieval: Archive standard retrieval amount. </li>
<li>ArchiveExpeditedRetrieval: archive quick retrieval amount. </li>
<li>ArchiveBulkRetrieval: Archive batch retrieval amount. </li>
<li>DeepArchiveStandardRetrieval: Deep archive standard retrieval amount. </li>
<li>DeepArchiveBulkRetrieval: Deep archive batch retrieval amount. </li>
<li>InfrequentRetrieval: Low-frequency storage retrieval amount. </li>
The default value is TotalStorage. 
     * @return StorageType Queryed storage type, valid values:
<li>TotalStorage: total storage amount, the sum of standard, low-frequency, archive and deep archive storage amounts, excluding early deletion amount. </li>
<li>StandardStorage: Standard storage. </li>
<li>InfrequentStorage: low-frequency storage. </li>
<li>ArchiveStorage: archive storage. </li>
<li>DeepArchiveStorage: deep archive storage. </li>
<li>DeletedInfrequentStorage: The amount of early deletion of low-frequency storage. </li>
<li>DeletedArchiveStorage: The amount of archives deleted in advance. </li>
<li>DeletedDeepArchiveStorage: The amount of deep archive deletion in advance. 
<li>ArchiveStandardRetrieval: Archive standard retrieval amount. </li>
<li>ArchiveExpeditedRetrieval: archive quick retrieval amount. </li>
<li>ArchiveBulkRetrieval: Archive batch retrieval amount. </li>
<li>DeepArchiveStandardRetrieval: Deep archive standard retrieval amount. </li>
<li>DeepArchiveBulkRetrieval: Deep archive batch retrieval amount. </li>
<li>InfrequentRetrieval: Low-frequency storage retrieval amount. </li>
The default value is TotalStorage.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Queryed storage type, valid values:
<li>TotalStorage: total storage amount, the sum of standard, low-frequency, archive and deep archive storage amounts, excluding early deletion amount. </li>
<li>StandardStorage: Standard storage. </li>
<li>InfrequentStorage: low-frequency storage. </li>
<li>ArchiveStorage: archive storage. </li>
<li>DeepArchiveStorage: deep archive storage. </li>
<li>DeletedInfrequentStorage: The amount of early deletion of low-frequency storage. </li>
<li>DeletedArchiveStorage: The amount of archives deleted in advance. </li>
<li>DeletedDeepArchiveStorage: The amount of deep archive deletion in advance. 
<li>ArchiveStandardRetrieval: Archive standard retrieval amount. </li>
<li>ArchiveExpeditedRetrieval: archive quick retrieval amount. </li>
<li>ArchiveBulkRetrieval: Archive batch retrieval amount. </li>
<li>DeepArchiveStandardRetrieval: Deep archive standard retrieval amount. </li>
<li>DeepArchiveBulkRetrieval: Deep archive batch retrieval amount. </li>
<li>InfrequentRetrieval: Low-frequency storage retrieval amount. </li>
The default value is TotalStorage.
     * @param StorageType Queryed storage type, valid values:
<li>TotalStorage: total storage amount, the sum of standard, low-frequency, archive and deep archive storage amounts, excluding early deletion amount. </li>
<li>StandardStorage: Standard storage. </li>
<li>InfrequentStorage: low-frequency storage. </li>
<li>ArchiveStorage: archive storage. </li>
<li>DeepArchiveStorage: deep archive storage. </li>
<li>DeletedInfrequentStorage: The amount of early deletion of low-frequency storage. </li>
<li>DeletedArchiveStorage: The amount of archives deleted in advance. </li>
<li>DeletedDeepArchiveStorage: The amount of deep archive deletion in advance. 
<li>ArchiveStandardRetrieval: Archive standard retrieval amount. </li>
<li>ArchiveExpeditedRetrieval: archive quick retrieval amount. </li>
<li>ArchiveBulkRetrieval: Archive batch retrieval amount. </li>
<li>DeepArchiveStandardRetrieval: Deep archive standard retrieval amount. </li>
<li>DeepArchiveBulkRetrieval: Deep archive batch retrieval amount. </li>
<li>InfrequentRetrieval: Low-frequency storage retrieval amount. </li>
The default value is TotalStorage.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Storage region to query. Valid values:
<li>Chinese Mainland</li>
<li>Outside Chinese Mainland</li>
Default value: Chinese Mainland 
     * @return Area Storage region to query. Valid values:
<li>Chinese Mainland</li>
<li>Outside Chinese Mainland</li>
Default value: Chinese Mainland
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Storage region to query. Valid values:
<li>Chinese Mainland</li>
<li>Outside Chinese Mainland</li>
Default value: Chinese Mainland
     * @param Area Storage region to query. Valid values:
<li>Chinese Mainland</li>
<li>Outside Chinese Mainland</li>
Default value: Chinese Mainland
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeStorageDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStorageDetailsRequest(DescribeStorageDetailsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

