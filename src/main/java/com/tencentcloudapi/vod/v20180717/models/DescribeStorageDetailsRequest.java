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
    * <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
You can set this parameter to 1 to query the total usage of all applications (including the primary application) as an admin.</b>
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
    * Storage class to query. Valid values:
<li>`TotalStorage`: total storage usage in classes of STANDARD, STANDARD_IA, ARCHIVE, and DEEP ARCHIVE, excluding the storage usage for data deleted in advance.</li>
<li>`StandardStorage`: STANDARD</li>
<li>`InfrequentStorage`: STANDARD_IA</li>
<li>`ArchiveStorage`: ARCHIVE</li>
<li>`DeepArchiveStorage`: DEEP ARCHIVE</li>
<li>`DeletedInfrequentStorage`: STANDARD_IA data deleted in advance</li>
<li>`DeletedArchiveStorage`: ARCHIVE data deleted in advance</li>
<li>`DeletedDeepArchiveStorage`: DEEP ARCHIVE data deleted in advance</li>
<li>`ArchiveStandardRetrieval`: ARCHIVE data retrieved using standard retrievals</li>
<li>`ArchiveExpeditedRetrieval`: ARCHIVE data retrieved using expedited retrievals</li>
<li>`ArchiveBulkRetrieval`: ARCHIVE data retrieved using bulk retrievals</li>
<li>`DeepArchiveStandardRetrieval`: DEEP ARCHIVE data retrieved using standard retrievals</li>
<li>`DeepArchiveBulkRetrieval`: DEEP ARCHIVE data retrieved using bulk retrievals</li>
Default value: `TotalStorage`
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
     * Get <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
You can set this parameter to 1 to query the total usage of all applications (including the primary application) as an admin.</b> 
     * @return SubAppId <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
You can set this parameter to 1 to query the total usage of all applications (including the primary application) as an admin.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
You can set this parameter to 1 to query the total usage of all applications (including the primary application) as an admin.</b>
     * @param SubAppId <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
You can set this parameter to 1 to query the total usage of all applications (including the primary application) as an admin.</b>
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
     * Get Storage class to query. Valid values:
<li>`TotalStorage`: total storage usage in classes of STANDARD, STANDARD_IA, ARCHIVE, and DEEP ARCHIVE, excluding the storage usage for data deleted in advance.</li>
<li>`StandardStorage`: STANDARD</li>
<li>`InfrequentStorage`: STANDARD_IA</li>
<li>`ArchiveStorage`: ARCHIVE</li>
<li>`DeepArchiveStorage`: DEEP ARCHIVE</li>
<li>`DeletedInfrequentStorage`: STANDARD_IA data deleted in advance</li>
<li>`DeletedArchiveStorage`: ARCHIVE data deleted in advance</li>
<li>`DeletedDeepArchiveStorage`: DEEP ARCHIVE data deleted in advance</li>
<li>`ArchiveStandardRetrieval`: ARCHIVE data retrieved using standard retrievals</li>
<li>`ArchiveExpeditedRetrieval`: ARCHIVE data retrieved using expedited retrievals</li>
<li>`ArchiveBulkRetrieval`: ARCHIVE data retrieved using bulk retrievals</li>
<li>`DeepArchiveStandardRetrieval`: DEEP ARCHIVE data retrieved using standard retrievals</li>
<li>`DeepArchiveBulkRetrieval`: DEEP ARCHIVE data retrieved using bulk retrievals</li>
Default value: `TotalStorage` 
     * @return StorageType Storage class to query. Valid values:
<li>`TotalStorage`: total storage usage in classes of STANDARD, STANDARD_IA, ARCHIVE, and DEEP ARCHIVE, excluding the storage usage for data deleted in advance.</li>
<li>`StandardStorage`: STANDARD</li>
<li>`InfrequentStorage`: STANDARD_IA</li>
<li>`ArchiveStorage`: ARCHIVE</li>
<li>`DeepArchiveStorage`: DEEP ARCHIVE</li>
<li>`DeletedInfrequentStorage`: STANDARD_IA data deleted in advance</li>
<li>`DeletedArchiveStorage`: ARCHIVE data deleted in advance</li>
<li>`DeletedDeepArchiveStorage`: DEEP ARCHIVE data deleted in advance</li>
<li>`ArchiveStandardRetrieval`: ARCHIVE data retrieved using standard retrievals</li>
<li>`ArchiveExpeditedRetrieval`: ARCHIVE data retrieved using expedited retrievals</li>
<li>`ArchiveBulkRetrieval`: ARCHIVE data retrieved using bulk retrievals</li>
<li>`DeepArchiveStandardRetrieval`: DEEP ARCHIVE data retrieved using standard retrievals</li>
<li>`DeepArchiveBulkRetrieval`: DEEP ARCHIVE data retrieved using bulk retrievals</li>
Default value: `TotalStorage`
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Storage class to query. Valid values:
<li>`TotalStorage`: total storage usage in classes of STANDARD, STANDARD_IA, ARCHIVE, and DEEP ARCHIVE, excluding the storage usage for data deleted in advance.</li>
<li>`StandardStorage`: STANDARD</li>
<li>`InfrequentStorage`: STANDARD_IA</li>
<li>`ArchiveStorage`: ARCHIVE</li>
<li>`DeepArchiveStorage`: DEEP ARCHIVE</li>
<li>`DeletedInfrequentStorage`: STANDARD_IA data deleted in advance</li>
<li>`DeletedArchiveStorage`: ARCHIVE data deleted in advance</li>
<li>`DeletedDeepArchiveStorage`: DEEP ARCHIVE data deleted in advance</li>
<li>`ArchiveStandardRetrieval`: ARCHIVE data retrieved using standard retrievals</li>
<li>`ArchiveExpeditedRetrieval`: ARCHIVE data retrieved using expedited retrievals</li>
<li>`ArchiveBulkRetrieval`: ARCHIVE data retrieved using bulk retrievals</li>
<li>`DeepArchiveStandardRetrieval`: DEEP ARCHIVE data retrieved using standard retrievals</li>
<li>`DeepArchiveBulkRetrieval`: DEEP ARCHIVE data retrieved using bulk retrievals</li>
Default value: `TotalStorage`
     * @param StorageType Storage class to query. Valid values:
<li>`TotalStorage`: total storage usage in classes of STANDARD, STANDARD_IA, ARCHIVE, and DEEP ARCHIVE, excluding the storage usage for data deleted in advance.</li>
<li>`StandardStorage`: STANDARD</li>
<li>`InfrequentStorage`: STANDARD_IA</li>
<li>`ArchiveStorage`: ARCHIVE</li>
<li>`DeepArchiveStorage`: DEEP ARCHIVE</li>
<li>`DeletedInfrequentStorage`: STANDARD_IA data deleted in advance</li>
<li>`DeletedArchiveStorage`: ARCHIVE data deleted in advance</li>
<li>`DeletedDeepArchiveStorage`: DEEP ARCHIVE data deleted in advance</li>
<li>`ArchiveStandardRetrieval`: ARCHIVE data retrieved using standard retrievals</li>
<li>`ArchiveExpeditedRetrieval`: ARCHIVE data retrieved using expedited retrievals</li>
<li>`ArchiveBulkRetrieval`: ARCHIVE data retrieved using bulk retrievals</li>
<li>`DeepArchiveStandardRetrieval`: DEEP ARCHIVE data retrieved using standard retrievals</li>
<li>`DeepArchiveBulkRetrieval`: DEEP ARCHIVE data retrieved using bulk retrievals</li>
Default value: `TotalStorage`
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

