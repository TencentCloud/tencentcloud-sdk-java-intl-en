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
    * <p>Delivery Rule ID</p>
    */
    @SerializedName("ShipperId")
    @Expose
    private String ShipperId;

    /**
    * <p>Log topic ID.</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>bucket address for shipping</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>Delivery prefix directory</p>
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * <p>Shipping rule name</p>
    */
    @SerializedName("ShipperName")
    @Expose
    private String ShipperName;

    /**
    * <p>Shipping time interval. Unit: seconds</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>Maximum value of delivered files in MB</p>
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * <p>Whether effective</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>Filter rules for log shipping</p>
    */
    @SerializedName("FilterRules")
    @Expose
    private FilterRuleInfo [] FilterRules;

    /**
    * <p>Partition rules for log shipping support strftime time format representation</p>
    */
    @SerializedName("Partition")
    @Expose
    private String Partition;

    /**
    * <p>Compression configuration of shipped logs</p>
    */
    @SerializedName("Compress")
    @Expose
    private CompressInfo Compress;

    /**
    * <p>Content format configuration for shipped logs</p>
    */
    @SerializedName("Content")
    @Expose
    private ContentInfo Content;

    /**
    * <p>Creation time of shipped logs. Format: YYYY-MM-DD HH:MM:SS</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Delivery file naming configuration. 0: Random number naming, 1: Delivery time naming. Default: 0 (Random number naming).</p>
    */
    @SerializedName("FilenameMode")
    @Expose
    private Long FilenameMode;

    /**
    * <p>Start time of the data shipping range</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>End time of the data delivery range</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>Progress of historical data delivery (valid only when users select historical data within the dataset)</p>
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * <p>Remaining time for all historical data delivery completion (valid only when there is historical data in the selected data)</p><p>Unit: second</p>
    */
    @SerializedName("RemainTime")
    @Expose
    private Long RemainTime;

    /**
    * <p>Historical task status:<br>0: Real-time task<br>1: Task preparing<br>2: Task running<br>3: Task execution exception<br>4: Task execution complete</p>
    */
    @SerializedName("HistoryStatus")
    @Expose
    private Long HistoryStatus;

    /**
    * <p>Storage type. Default value is STANDARD. For enumeration values, see the <a href="https://www.tencentcloud.com/document/product/436/33417?from_cn_redirect=1">storage type overview</a> document.<br>Reference values:<br>STANDARD: standard storage<br>STANDARD_IA: infrequent storage<br>ARCHIVE: archive storage<br>DEEP_ARCHIVE: deep archive storage<br>MAZ_STANDARD: standard storage (multi-AZ)<br>MAZ_STANDARD_IA: infrequent storage (multi-AZ)<br>INTELLIGENT_TIERING: intelligent tiering storage<br>MAZ_INTELLIGENT_TIERING: intelligent tiering storage (multi-AZ)</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>ARN <a href="https://www.tencentcloud.com/document/product/598/19381?from_cn_redirect=1">Create role</a></p>
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * <p>External ID</p>
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
    * <p>Task running status. Supports <code>0</code>, <code>1</code>, <code>2</code></p><ul><li><code>0</code>: Stop</li><li><code>1</code>: Running</li><li><code>2</code>: Exception</li></ul>
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * <p>Time variable used to generate the file path shipped to COS</p>
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * <p>Pre-filtering process - filter out original data before writing to COS</p>
    */
    @SerializedName("DSLFilter")
    @Expose
    private String DSLFilter;

    /**
     * Get <p>Delivery Rule ID</p> 
     * @return ShipperId <p>Delivery Rule ID</p>
     */
    public String getShipperId() {
        return this.ShipperId;
    }

    /**
     * Set <p>Delivery Rule ID</p>
     * @param ShipperId <p>Delivery Rule ID</p>
     */
    public void setShipperId(String ShipperId) {
        this.ShipperId = ShipperId;
    }

    /**
     * Get <p>Log topic ID.</p> 
     * @return TopicId <p>Log topic ID.</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Log topic ID.</p>
     * @param TopicId <p>Log topic ID.</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>bucket address for shipping</p> 
     * @return Bucket <p>bucket address for shipping</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>bucket address for shipping</p>
     * @param Bucket <p>bucket address for shipping</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>Delivery prefix directory</p> 
     * @return Prefix <p>Delivery prefix directory</p>
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set <p>Delivery prefix directory</p>
     * @param Prefix <p>Delivery prefix directory</p>
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get <p>Shipping rule name</p> 
     * @return ShipperName <p>Shipping rule name</p>
     */
    public String getShipperName() {
        return this.ShipperName;
    }

    /**
     * Set <p>Shipping rule name</p>
     * @param ShipperName <p>Shipping rule name</p>
     */
    public void setShipperName(String ShipperName) {
        this.ShipperName = ShipperName;
    }

    /**
     * Get <p>Shipping time interval. Unit: seconds</p> 
     * @return Interval <p>Shipping time interval. Unit: seconds</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>Shipping time interval. Unit: seconds</p>
     * @param Interval <p>Shipping time interval. Unit: seconds</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>Maximum value of delivered files in MB</p> 
     * @return MaxSize <p>Maximum value of delivered files in MB</p>
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set <p>Maximum value of delivered files in MB</p>
     * @param MaxSize <p>Maximum value of delivered files in MB</p>
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get <p>Whether effective</p> 
     * @return Status <p>Whether effective</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Whether effective</p>
     * @param Status <p>Whether effective</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Filter rules for log shipping</p> 
     * @return FilterRules <p>Filter rules for log shipping</p>
     */
    public FilterRuleInfo [] getFilterRules() {
        return this.FilterRules;
    }

    /**
     * Set <p>Filter rules for log shipping</p>
     * @param FilterRules <p>Filter rules for log shipping</p>
     */
    public void setFilterRules(FilterRuleInfo [] FilterRules) {
        this.FilterRules = FilterRules;
    }

    /**
     * Get <p>Partition rules for log shipping support strftime time format representation</p> 
     * @return Partition <p>Partition rules for log shipping support strftime time format representation</p>
     */
    public String getPartition() {
        return this.Partition;
    }

    /**
     * Set <p>Partition rules for log shipping support strftime time format representation</p>
     * @param Partition <p>Partition rules for log shipping support strftime time format representation</p>
     */
    public void setPartition(String Partition) {
        this.Partition = Partition;
    }

    /**
     * Get <p>Compression configuration of shipped logs</p> 
     * @return Compress <p>Compression configuration of shipped logs</p>
     */
    public CompressInfo getCompress() {
        return this.Compress;
    }

    /**
     * Set <p>Compression configuration of shipped logs</p>
     * @param Compress <p>Compression configuration of shipped logs</p>
     */
    public void setCompress(CompressInfo Compress) {
        this.Compress = Compress;
    }

    /**
     * Get <p>Content format configuration for shipped logs</p> 
     * @return Content <p>Content format configuration for shipped logs</p>
     */
    public ContentInfo getContent() {
        return this.Content;
    }

    /**
     * Set <p>Content format configuration for shipped logs</p>
     * @param Content <p>Content format configuration for shipped logs</p>
     */
    public void setContent(ContentInfo Content) {
        this.Content = Content;
    }

    /**
     * Get <p>Creation time of shipped logs. Format: YYYY-MM-DD HH:MM:SS</p> 
     * @return CreateTime <p>Creation time of shipped logs. Format: YYYY-MM-DD HH:MM:SS</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time of shipped logs. Format: YYYY-MM-DD HH:MM:SS</p>
     * @param CreateTime <p>Creation time of shipped logs. Format: YYYY-MM-DD HH:MM:SS</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Delivery file naming configuration. 0: Random number naming, 1: Delivery time naming. Default: 0 (Random number naming).</p> 
     * @return FilenameMode <p>Delivery file naming configuration. 0: Random number naming, 1: Delivery time naming. Default: 0 (Random number naming).</p>
     */
    public Long getFilenameMode() {
        return this.FilenameMode;
    }

    /**
     * Set <p>Delivery file naming configuration. 0: Random number naming, 1: Delivery time naming. Default: 0 (Random number naming).</p>
     * @param FilenameMode <p>Delivery file naming configuration. 0: Random number naming, 1: Delivery time naming. Default: 0 (Random number naming).</p>
     */
    public void setFilenameMode(Long FilenameMode) {
        this.FilenameMode = FilenameMode;
    }

    /**
     * Get <p>Start time of the data shipping range</p> 
     * @return StartTime <p>Start time of the data shipping range</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time of the data shipping range</p>
     * @param StartTime <p>Start time of the data shipping range</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time of the data delivery range</p> 
     * @return EndTime <p>End time of the data delivery range</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time of the data delivery range</p>
     * @param EndTime <p>End time of the data delivery range</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Progress of historical data delivery (valid only when users select historical data within the dataset)</p> 
     * @return Progress <p>Progress of historical data delivery (valid only when users select historical data within the dataset)</p>
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>Progress of historical data delivery (valid only when users select historical data within the dataset)</p>
     * @param Progress <p>Progress of historical data delivery (valid only when users select historical data within the dataset)</p>
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>Remaining time for all historical data delivery completion (valid only when there is historical data in the selected data)</p><p>Unit: second</p> 
     * @return RemainTime <p>Remaining time for all historical data delivery completion (valid only when there is historical data in the selected data)</p><p>Unit: second</p>
     */
    public Long getRemainTime() {
        return this.RemainTime;
    }

    /**
     * Set <p>Remaining time for all historical data delivery completion (valid only when there is historical data in the selected data)</p><p>Unit: second</p>
     * @param RemainTime <p>Remaining time for all historical data delivery completion (valid only when there is historical data in the selected data)</p><p>Unit: second</p>
     */
    public void setRemainTime(Long RemainTime) {
        this.RemainTime = RemainTime;
    }

    /**
     * Get <p>Historical task status:<br>0: Real-time task<br>1: Task preparing<br>2: Task running<br>3: Task execution exception<br>4: Task execution complete</p> 
     * @return HistoryStatus <p>Historical task status:<br>0: Real-time task<br>1: Task preparing<br>2: Task running<br>3: Task execution exception<br>4: Task execution complete</p>
     */
    public Long getHistoryStatus() {
        return this.HistoryStatus;
    }

    /**
     * Set <p>Historical task status:<br>0: Real-time task<br>1: Task preparing<br>2: Task running<br>3: Task execution exception<br>4: Task execution complete</p>
     * @param HistoryStatus <p>Historical task status:<br>0: Real-time task<br>1: Task preparing<br>2: Task running<br>3: Task execution exception<br>4: Task execution complete</p>
     */
    public void setHistoryStatus(Long HistoryStatus) {
        this.HistoryStatus = HistoryStatus;
    }

    /**
     * Get <p>Storage type. Default value is STANDARD. For enumeration values, see the <a href="https://www.tencentcloud.com/document/product/436/33417?from_cn_redirect=1">storage type overview</a> document.<br>Reference values:<br>STANDARD: standard storage<br>STANDARD_IA: infrequent storage<br>ARCHIVE: archive storage<br>DEEP_ARCHIVE: deep archive storage<br>MAZ_STANDARD: standard storage (multi-AZ)<br>MAZ_STANDARD_IA: infrequent storage (multi-AZ)<br>INTELLIGENT_TIERING: intelligent tiering storage<br>MAZ_INTELLIGENT_TIERING: intelligent tiering storage (multi-AZ)</p> 
     * @return StorageType <p>Storage type. Default value is STANDARD. For enumeration values, see the <a href="https://www.tencentcloud.com/document/product/436/33417?from_cn_redirect=1">storage type overview</a> document.<br>Reference values:<br>STANDARD: standard storage<br>STANDARD_IA: infrequent storage<br>ARCHIVE: archive storage<br>DEEP_ARCHIVE: deep archive storage<br>MAZ_STANDARD: standard storage (multi-AZ)<br>MAZ_STANDARD_IA: infrequent storage (multi-AZ)<br>INTELLIGENT_TIERING: intelligent tiering storage<br>MAZ_INTELLIGENT_TIERING: intelligent tiering storage (multi-AZ)</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Storage type. Default value is STANDARD. For enumeration values, see the <a href="https://www.tencentcloud.com/document/product/436/33417?from_cn_redirect=1">storage type overview</a> document.<br>Reference values:<br>STANDARD: standard storage<br>STANDARD_IA: infrequent storage<br>ARCHIVE: archive storage<br>DEEP_ARCHIVE: deep archive storage<br>MAZ_STANDARD: standard storage (multi-AZ)<br>MAZ_STANDARD_IA: infrequent storage (multi-AZ)<br>INTELLIGENT_TIERING: intelligent tiering storage<br>MAZ_INTELLIGENT_TIERING: intelligent tiering storage (multi-AZ)</p>
     * @param StorageType <p>Storage type. Default value is STANDARD. For enumeration values, see the <a href="https://www.tencentcloud.com/document/product/436/33417?from_cn_redirect=1">storage type overview</a> document.<br>Reference values:<br>STANDARD: standard storage<br>STANDARD_IA: infrequent storage<br>ARCHIVE: archive storage<br>DEEP_ARCHIVE: deep archive storage<br>MAZ_STANDARD: standard storage (multi-AZ)<br>MAZ_STANDARD_IA: infrequent storage (multi-AZ)<br>INTELLIGENT_TIERING: intelligent tiering storage<br>MAZ_INTELLIGENT_TIERING: intelligent tiering storage (multi-AZ)</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>ARN <a href="https://www.tencentcloud.com/document/product/598/19381?from_cn_redirect=1">Create role</a></p> 
     * @return RoleArn <p>ARN <a href="https://www.tencentcloud.com/document/product/598/19381?from_cn_redirect=1">Create role</a></p>
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set <p>ARN <a href="https://www.tencentcloud.com/document/product/598/19381?from_cn_redirect=1">Create role</a></p>
     * @param RoleArn <p>ARN <a href="https://www.tencentcloud.com/document/product/598/19381?from_cn_redirect=1">Create role</a></p>
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get <p>External ID</p> 
     * @return ExternalId <p>External ID</p>
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set <p>External ID</p>
     * @param ExternalId <p>External ID</p>
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    /**
     * Get <p>Task running status. Supports <code>0</code>, <code>1</code>, <code>2</code></p><ul><li><code>0</code>: Stop</li><li><code>1</code>: Running</li><li><code>2</code>: Exception</li></ul> 
     * @return TaskStatus <p>Task running status. Supports <code>0</code>, <code>1</code>, <code>2</code></p><ul><li><code>0</code>: Stop</li><li><code>1</code>: Running</li><li><code>2</code>: Exception</li></ul>
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>Task running status. Supports <code>0</code>, <code>1</code>, <code>2</code></p><ul><li><code>0</code>: Stop</li><li><code>1</code>: Running</li><li><code>2</code>: Exception</li></ul>
     * @param TaskStatus <p>Task running status. Supports <code>0</code>, <code>1</code>, <code>2</code></p><ul><li><code>0</code>: Stop</li><li><code>1</code>: Running</li><li><code>2</code>: Exception</li></ul>
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>Time variable used to generate the file path shipped to COS</p> 
     * @return TimeZone <p>Time variable used to generate the file path shipped to COS</p>
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set <p>Time variable used to generate the file path shipped to COS</p>
     * @param TimeZone <p>Time variable used to generate the file path shipped to COS</p>
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get <p>Pre-filtering process - filter out original data before writing to COS</p> 
     * @return DSLFilter <p>Pre-filtering process - filter out original data before writing to COS</p>
     */
    public String getDSLFilter() {
        return this.DSLFilter;
    }

    /**
     * Set <p>Pre-filtering process - filter out original data before writing to COS</p>
     * @param DSLFilter <p>Pre-filtering process - filter out original data before writing to COS</p>
     */
    public void setDSLFilter(String DSLFilter) {
        this.DSLFilter = DSLFilter;
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
        if (source.RoleArn != null) {
            this.RoleArn = new String(source.RoleArn);
        }
        if (source.ExternalId != null) {
            this.ExternalId = new String(source.ExternalId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.DSLFilter != null) {
            this.DSLFilter = new String(source.DSLFilter);
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
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "DSLFilter", this.DSLFilter);

    }
}

