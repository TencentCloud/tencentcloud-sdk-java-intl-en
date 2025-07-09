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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShipperInfo extends AbstractModel {

    /**
    * Shipping rule ID
    */
    @SerializedName("ShipperId")
    @Expose
    private String ShipperId;

    /**
    * Log topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Bucket address shipped to
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Shipping prefix directory
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * Shipping rule name
    */
    @SerializedName("ShipperName")
    @Expose
    private String ShipperName;

    /**
    * Shipping time interval in seconds
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Maximum size of shipped file in MB
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * Whether it takes effect
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * Filter rule for shipped log
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FilterRules")
    @Expose
    private FilterRuleInfo [] FilterRules;

    /**
    * Partition rule of shipped log, which can be represented in `strftime` time format
    */
    @SerializedName("Partition")
    @Expose
    private String Partition;

    /**
    * Compression configuration of shipped log
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Compress")
    @Expose
    private CompressInfo Compress;

    /**
    * Format configuration of shipped log content
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Content")
    @Expose
    private ContentInfo Content;

    /**
    * Creation time of shipped log
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Shipping file naming configuration. Valid values: `0` (by random number); `1` (by shipping time). Default value: `0`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FilenameMode")
    @Expose
    private Long FilenameMode;

    /**
    * Start time for data shipping
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time for data shipping
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Progress of historical data shipping (valid only when the selected data scope contains historical data)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * Remaining time required for shipping all historical data (valid only when the selected data scope contains historical data)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RemainTime")
    @Expose
    private Long RemainTime;

    /**
    * Status of historical data shipping. Valid values:
0: Real-time data is being shipped.
1: The system is preparing for historical data shipping.
2: Historical data is being shipped.
3: An error occurred while shipping historical data.
4: Historical data shipping ended.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HistoryStatus")
    @Expose
    private Long HistoryStatus;

    /**
    * COS bucket type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get Shipping rule ID 
     * @return ShipperId Shipping rule ID
     */
    public String getShipperId() {
        return this.ShipperId;
    }

    /**
     * Set Shipping rule ID
     * @param ShipperId Shipping rule ID
     */
    public void setShipperId(String ShipperId) {
        this.ShipperId = ShipperId;
    }

    /**
     * Get Log topic ID 
     * @return TopicId Log topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID
     * @param TopicId Log topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Bucket address shipped to 
     * @return Bucket Bucket address shipped to
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Bucket address shipped to
     * @param Bucket Bucket address shipped to
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Shipping prefix directory 
     * @return Prefix Shipping prefix directory
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set Shipping prefix directory
     * @param Prefix Shipping prefix directory
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get Shipping rule name 
     * @return ShipperName Shipping rule name
     */
    public String getShipperName() {
        return this.ShipperName;
    }

    /**
     * Set Shipping rule name
     * @param ShipperName Shipping rule name
     */
    public void setShipperName(String ShipperName) {
        this.ShipperName = ShipperName;
    }

    /**
     * Get Shipping time interval in seconds 
     * @return Interval Shipping time interval in seconds
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Shipping time interval in seconds
     * @param Interval Shipping time interval in seconds
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Maximum size of shipped file in MB 
     * @return MaxSize Maximum size of shipped file in MB
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set Maximum size of shipped file in MB
     * @param MaxSize Maximum size of shipped file in MB
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get Whether it takes effect 
     * @return Status Whether it takes effect
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Whether it takes effect
     * @param Status Whether it takes effect
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get Filter rule for shipped log
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return FilterRules Filter rule for shipped log
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public FilterRuleInfo [] getFilterRules() {
        return this.FilterRules;
    }

    /**
     * Set Filter rule for shipped log
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param FilterRules Filter rule for shipped log
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFilterRules(FilterRuleInfo [] FilterRules) {
        this.FilterRules = FilterRules;
    }

    /**
     * Get Partition rule of shipped log, which can be represented in `strftime` time format 
     * @return Partition Partition rule of shipped log, which can be represented in `strftime` time format
     */
    public String getPartition() {
        return this.Partition;
    }

    /**
     * Set Partition rule of shipped log, which can be represented in `strftime` time format
     * @param Partition Partition rule of shipped log, which can be represented in `strftime` time format
     */
    public void setPartition(String Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Compression configuration of shipped log
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Compress Compression configuration of shipped log
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public CompressInfo getCompress() {
        return this.Compress;
    }

    /**
     * Set Compression configuration of shipped log
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Compress Compression configuration of shipped log
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCompress(CompressInfo Compress) {
        this.Compress = Compress;
    }

    /**
     * Get Format configuration of shipped log content
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Content Format configuration of shipped log content
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ContentInfo getContent() {
        return this.Content;
    }

    /**
     * Set Format configuration of shipped log content
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Content Format configuration of shipped log content
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setContent(ContentInfo Content) {
        this.Content = Content;
    }

    /**
     * Get Creation time of shipped log 
     * @return CreateTime Creation time of shipped log
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of shipped log
     * @param CreateTime Creation time of shipped log
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Shipping file naming configuration. Valid values: `0` (by random number); `1` (by shipping time). Default value: `0`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FilenameMode Shipping file naming configuration. Valid values: `0` (by random number); `1` (by shipping time). Default value: `0`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFilenameMode() {
        return this.FilenameMode;
    }

    /**
     * Set Shipping file naming configuration. Valid values: `0` (by random number); `1` (by shipping time). Default value: `0`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FilenameMode Shipping file naming configuration. Valid values: `0` (by random number); `1` (by shipping time). Default value: `0`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFilenameMode(Long FilenameMode) {
        this.FilenameMode = FilenameMode;
    }

    /**
     * Get Start time for data shipping
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Start time for data shipping
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time for data shipping
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Start time for data shipping
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time for data shipping
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime End time for data shipping
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time for data shipping
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime End time for data shipping
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Progress of historical data shipping (valid only when the selected data scope contains historical data)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Progress Progress of historical data shipping (valid only when the selected data scope contains historical data)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set Progress of historical data shipping (valid only when the selected data scope contains historical data)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Progress Progress of historical data shipping (valid only when the selected data scope contains historical data)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Remaining time required for shipping all historical data (valid only when the selected data scope contains historical data)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RemainTime Remaining time required for shipping all historical data (valid only when the selected data scope contains historical data)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRemainTime() {
        return this.RemainTime;
    }

    /**
     * Set Remaining time required for shipping all historical data (valid only when the selected data scope contains historical data)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RemainTime Remaining time required for shipping all historical data (valid only when the selected data scope contains historical data)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemainTime(Long RemainTime) {
        this.RemainTime = RemainTime;
    }

    /**
     * Get Status of historical data shipping. Valid values:
0: Real-time data is being shipped.
1: The system is preparing for historical data shipping.
2: Historical data is being shipped.
3: An error occurred while shipping historical data.
4: Historical data shipping ended.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HistoryStatus Status of historical data shipping. Valid values:
0: Real-time data is being shipped.
1: The system is preparing for historical data shipping.
2: Historical data is being shipped.
3: An error occurred while shipping historical data.
4: Historical data shipping ended.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHistoryStatus() {
        return this.HistoryStatus;
    }

    /**
     * Set Status of historical data shipping. Valid values:
0: Real-time data is being shipped.
1: The system is preparing for historical data shipping.
2: Historical data is being shipped.
3: An error occurred while shipping historical data.
4: Historical data shipping ended.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HistoryStatus Status of historical data shipping. Valid values:
0: Real-time data is being shipped.
1: The system is preparing for historical data shipping.
2: Historical data is being shipped.
3: An error occurred while shipping historical data.
4: Historical data shipping ended.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHistoryStatus(Long HistoryStatus) {
        this.HistoryStatus = HistoryStatus;
    }

    /**
     * Get COS bucket type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageType COS bucket type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set COS bucket type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageType COS bucket type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    public ShipperInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShipperInfo(ShipperInfo source) {
        if (source.ShipperId != null) {
            this.ShipperId = new String(source.ShipperId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.ShipperName != null) {
            this.ShipperName = new String(source.ShipperName);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.FilterRules != null) {
            this.FilterRules = new FilterRuleInfo[source.FilterRules.length];
            for (int i = 0; i < source.FilterRules.length; i++) {
                this.FilterRules[i] = new FilterRuleInfo(source.FilterRules[i]);
            }
        }
        if (source.Partition != null) {
            this.Partition = new String(source.Partition);
        }
        if (source.Compress != null) {
            this.Compress = new CompressInfo(source.Compress);
        }
        if (source.Content != null) {
            this.Content = new ContentInfo(source.Content);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.FilenameMode != null) {
            this.FilenameMode = new Long(source.FilenameMode);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.RemainTime != null) {
            this.RemainTime = new Long(source.RemainTime);
        }
        if (source.HistoryStatus != null) {
            this.HistoryStatus = new Long(source.HistoryStatus);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShipperId", this.ShipperId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "ShipperName", this.ShipperName);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "FilterRules.", this.FilterRules);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamObj(map, prefix + "Compress.", this.Compress);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "FilenameMode", this.FilenameMode);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "RemainTime", this.RemainTime);
        this.setParamSimple(map, prefix + "HistoryStatus", this.HistoryStatus);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

