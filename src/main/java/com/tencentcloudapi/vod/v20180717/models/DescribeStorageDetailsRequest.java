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

public class DescribeStorageDetailsRequest extends AbstractModel {

    /**
    * Start time. Format according to ISO 8601. For details, see the [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time, which must be greater than the start date. Format according to ISO 8601. For details, see the [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Statistical time granularity. Valid values:
<li>Minute: 5 minutes.</li>
<li>Day: day.</li>
By default, the granularity is determined by the time span. It is 5 minutes for a duration of up to 1 day and day for over 1 day.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Storage type for query. Valid values:
<li>TotalStorage: Total stored amount, sum of standard, infrequent, archive, and deep archive storage capacity, excluding early deletion amount.</li>
<li>StandardStorage: Standard storage.</li>
<li>InfrequentStorage: Infrequent storage.</li>
<li>ArchiveStorage: Archive storage.</li>
<li>DeepArchiveStorage: deep archive storage.</li>
<li>DeletedInfrequentStorage: Early deletion amount of infrequent storage.</li>
<li>DeletedArchiveStorage: Early deletion amount of archive.</li>
<li>DeletedDeepArchiveStorage: Early deletion amount of deep archive.</li>
<li>ArchiveStandardRetrieval: Standard retrieval volume of archive.</li>
<li>ArchiveExpeditedRetrieval: Quick retrieval volume of archive.</li>
<li>ArchiveBulkRetrieval: Archive batch retrieval amount.</li>
<li>DeepArchiveStandardRetrieval: Deep archive standard retrieval.</li>
<li>DeepArchiveBulkRetrieval: Deep archive batch retrieval amount.</li>
<li>InfrequentRetrieval: Retrieval volume of infrequent storage.</li>
Default value: TotalStorage.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * Storage region for query. Valid value:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China) and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li>
Default value is Chinese Mainland.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get Start time. Format according to ISO 8601. For details, see the [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52). 
     * @return StartTime Start time. Format according to ISO 8601. For details, see the [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time. Format according to ISO 8601. For details, see the [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     * @param StartTime Start time. Format according to ISO 8601. For details, see the [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, which must be greater than the start date. Format according to ISO 8601. For details, see the [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52). 
     * @return EndTime End time, which must be greater than the start date. Format according to ISO 8601. For details, see the [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, which must be greater than the start date. Format according to ISO 8601. For details, see the [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     * @param EndTime End time, which must be greater than the start date. Format according to ISO 8601. For details, see the [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Statistical time granularity. Valid values:
<li>Minute: 5 minutes.</li>
<li>Day: day.</li>
By default, the granularity is determined by the time span. It is 5 minutes for a duration of up to 1 day and day for over 1 day. 
     * @return Interval Statistical time granularity. Valid values:
<li>Minute: 5 minutes.</li>
<li>Day: day.</li>
By default, the granularity is determined by the time span. It is 5 minutes for a duration of up to 1 day and day for over 1 day.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Statistical time granularity. Valid values:
<li>Minute: 5 minutes.</li>
<li>Day: day.</li>
By default, the granularity is determined by the time span. It is 5 minutes for a duration of up to 1 day and day for over 1 day.
     * @param Interval Statistical time granularity. Valid values:
<li>Minute: 5 minutes.</li>
<li>Day: day.</li>
By default, the granularity is determined by the time span. It is 5 minutes for a duration of up to 1 day and day for over 1 day.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Storage type for query. Valid values:
<li>TotalStorage: Total stored amount, sum of standard, infrequent, archive, and deep archive storage capacity, excluding early deletion amount.</li>
<li>StandardStorage: Standard storage.</li>
<li>InfrequentStorage: Infrequent storage.</li>
<li>ArchiveStorage: Archive storage.</li>
<li>DeepArchiveStorage: deep archive storage.</li>
<li>DeletedInfrequentStorage: Early deletion amount of infrequent storage.</li>
<li>DeletedArchiveStorage: Early deletion amount of archive.</li>
<li>DeletedDeepArchiveStorage: Early deletion amount of deep archive.</li>
<li>ArchiveStandardRetrieval: Standard retrieval volume of archive.</li>
<li>ArchiveExpeditedRetrieval: Quick retrieval volume of archive.</li>
<li>ArchiveBulkRetrieval: Archive batch retrieval amount.</li>
<li>DeepArchiveStandardRetrieval: Deep archive standard retrieval.</li>
<li>DeepArchiveBulkRetrieval: Deep archive batch retrieval amount.</li>
<li>InfrequentRetrieval: Retrieval volume of infrequent storage.</li>
Default value: TotalStorage. 
     * @return StorageType Storage type for query. Valid values:
<li>TotalStorage: Total stored amount, sum of standard, infrequent, archive, and deep archive storage capacity, excluding early deletion amount.</li>
<li>StandardStorage: Standard storage.</li>
<li>InfrequentStorage: Infrequent storage.</li>
<li>ArchiveStorage: Archive storage.</li>
<li>DeepArchiveStorage: deep archive storage.</li>
<li>DeletedInfrequentStorage: Early deletion amount of infrequent storage.</li>
<li>DeletedArchiveStorage: Early deletion amount of archive.</li>
<li>DeletedDeepArchiveStorage: Early deletion amount of deep archive.</li>
<li>ArchiveStandardRetrieval: Standard retrieval volume of archive.</li>
<li>ArchiveExpeditedRetrieval: Quick retrieval volume of archive.</li>
<li>ArchiveBulkRetrieval: Archive batch retrieval amount.</li>
<li>DeepArchiveStandardRetrieval: Deep archive standard retrieval.</li>
<li>DeepArchiveBulkRetrieval: Deep archive batch retrieval amount.</li>
<li>InfrequentRetrieval: Retrieval volume of infrequent storage.</li>
Default value: TotalStorage.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Storage type for query. Valid values:
<li>TotalStorage: Total stored amount, sum of standard, infrequent, archive, and deep archive storage capacity, excluding early deletion amount.</li>
<li>StandardStorage: Standard storage.</li>
<li>InfrequentStorage: Infrequent storage.</li>
<li>ArchiveStorage: Archive storage.</li>
<li>DeepArchiveStorage: deep archive storage.</li>
<li>DeletedInfrequentStorage: Early deletion amount of infrequent storage.</li>
<li>DeletedArchiveStorage: Early deletion amount of archive.</li>
<li>DeletedDeepArchiveStorage: Early deletion amount of deep archive.</li>
<li>ArchiveStandardRetrieval: Standard retrieval volume of archive.</li>
<li>ArchiveExpeditedRetrieval: Quick retrieval volume of archive.</li>
<li>ArchiveBulkRetrieval: Archive batch retrieval amount.</li>
<li>DeepArchiveStandardRetrieval: Deep archive standard retrieval.</li>
<li>DeepArchiveBulkRetrieval: Deep archive batch retrieval amount.</li>
<li>InfrequentRetrieval: Retrieval volume of infrequent storage.</li>
Default value: TotalStorage.
     * @param StorageType Storage type for query. Valid values:
<li>TotalStorage: Total stored amount, sum of standard, infrequent, archive, and deep archive storage capacity, excluding early deletion amount.</li>
<li>StandardStorage: Standard storage.</li>
<li>InfrequentStorage: Infrequent storage.</li>
<li>ArchiveStorage: Archive storage.</li>
<li>DeepArchiveStorage: deep archive storage.</li>
<li>DeletedInfrequentStorage: Early deletion amount of infrequent storage.</li>
<li>DeletedArchiveStorage: Early deletion amount of archive.</li>
<li>DeletedDeepArchiveStorage: Early deletion amount of deep archive.</li>
<li>ArchiveStandardRetrieval: Standard retrieval volume of archive.</li>
<li>ArchiveExpeditedRetrieval: Quick retrieval volume of archive.</li>
<li>ArchiveBulkRetrieval: Archive batch retrieval amount.</li>
<li>DeepArchiveStandardRetrieval: Deep archive standard retrieval.</li>
<li>DeepArchiveBulkRetrieval: Deep archive batch retrieval amount.</li>
<li>InfrequentRetrieval: Retrieval volume of infrequent storage.</li>
Default value: TotalStorage.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Storage region for query. Valid value:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China) and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li>
Default value is Chinese Mainland. 
     * @return Area Storage region for query. Valid value:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China) and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li>
Default value is Chinese Mainland.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Storage region for query. Valid value:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China) and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li>
Default value is Chinese Mainland.
     * @param Area Storage region for query. Valid value:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China) and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li>
Default value is Chinese Mainland.
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

