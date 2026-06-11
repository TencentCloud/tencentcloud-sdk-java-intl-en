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

public class CosRechargeInfo extends AbstractModel {

    /**
    * COS import configuration ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Log topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Logset ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * COS import task name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * COS bucket
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * COS bucket location.

-Obtain region information via [regions and access endpoints](https://www.tencentcloud.com/document/product/436/6224?from_cn_redirect=1).
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * Prefix of the COS file folder location
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * Types of logs collected: json_log represents JSON logs, delimiter_log represents delimiter-separated format logs, minimalist_log represents single-line full-text representation.
default is minimalist_log
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * status 0: Created, 1: Running, 2: Stopped, 3: Completed, 4: Execution failed.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Whether this feature is enabled. 0: Disabled; 1: Enabled.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Creation time. Time format: YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time. Time format: YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Progress Bar Percentage
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Compression methods supported: "", "gzip", "lzop", and "snappy". Default empty with no compression.
    */
    @SerializedName("Compress")
    @Expose
    private String Compress;

    /**
    * See the description of the ExtractRuleInfo structure.
    */
    @SerializedName("ExtractRuleInfo")
    @Expose
    private ExtractRuleInfo ExtractRuleInfo;

    /**
    * COS import task type. Valid values: 1: one-time import task; 2: continuous import task.
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Metadata. Buckets and objects are supported.
    */
    @SerializedName("Metadata")
    @Expose
    private String [] Metadata;

    /**
     * Get COS import configuration ID. 
     * @return Id COS import configuration ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set COS import configuration ID.
     * @param Id COS import configuration ID.
     */
    public void setId(String Id) {
        this.Id = Id;
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
     * Get Logset ID 
     * @return LogsetId Logset ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset ID
     * @param LogsetId Logset ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get COS import task name 
     * @return Name COS import task name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set COS import task name
     * @param Name COS import task name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get COS bucket 
     * @return Bucket COS bucket
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS bucket
     * @param Bucket COS bucket
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get COS bucket location.

-Obtain region information via [regions and access endpoints](https://www.tencentcloud.com/document/product/436/6224?from_cn_redirect=1). 
     * @return BucketRegion COS bucket location.

-Obtain region information via [regions and access endpoints](https://www.tencentcloud.com/document/product/436/6224?from_cn_redirect=1).
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set COS bucket location.

-Obtain region information via [regions and access endpoints](https://www.tencentcloud.com/document/product/436/6224?from_cn_redirect=1).
     * @param BucketRegion COS bucket location.

-Obtain region information via [regions and access endpoints](https://www.tencentcloud.com/document/product/436/6224?from_cn_redirect=1).
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get Prefix of the COS file folder location 
     * @return Prefix Prefix of the COS file folder location
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set Prefix of the COS file folder location
     * @param Prefix Prefix of the COS file folder location
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get Types of logs collected: json_log represents JSON logs, delimiter_log represents delimiter-separated format logs, minimalist_log represents single-line full-text representation.
default is minimalist_log 
     * @return LogType Types of logs collected: json_log represents JSON logs, delimiter_log represents delimiter-separated format logs, minimalist_log represents single-line full-text representation.
default is minimalist_log
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Types of logs collected: json_log represents JSON logs, delimiter_log represents delimiter-separated format logs, minimalist_log represents single-line full-text representation.
default is minimalist_log
     * @param LogType Types of logs collected: json_log represents JSON logs, delimiter_log represents delimiter-separated format logs, minimalist_log represents single-line full-text representation.
default is minimalist_log
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get status 0: Created, 1: Running, 2: Stopped, 3: Completed, 4: Execution failed. 
     * @return Status status 0: Created, 1: Running, 2: Stopped, 3: Completed, 4: Execution failed.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set status 0: Created, 1: Running, 2: Stopped, 3: Completed, 4: Execution failed.
     * @param Status status 0: Created, 1: Running, 2: Stopped, 3: Completed, 4: Execution failed.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Whether this feature is enabled. 0: Disabled; 1: Enabled. 
     * @return Enable Whether this feature is enabled. 0: Disabled; 1: Enabled.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether this feature is enabled. 0: Disabled; 1: Enabled.
     * @param Enable Whether this feature is enabled. 0: Disabled; 1: Enabled.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Creation time. Time format: YYYY-MM-DD HH:mm:ss 
     * @return CreateTime Creation time. Time format: YYYY-MM-DD HH:mm:ss
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time. Time format: YYYY-MM-DD HH:mm:ss
     * @param CreateTime Creation time. Time format: YYYY-MM-DD HH:mm:ss
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time. Time format: YYYY-MM-DD HH:mm:ss 
     * @return UpdateTime Update time. Time format: YYYY-MM-DD HH:mm:ss
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time. Time format: YYYY-MM-DD HH:mm:ss
     * @param UpdateTime Update time. Time format: YYYY-MM-DD HH:mm:ss
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Progress Bar Percentage 
     * @return Progress Progress Bar Percentage
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Progress Bar Percentage
     * @param Progress Progress Bar Percentage
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Compression methods supported: "", "gzip", "lzop", and "snappy". Default empty with no compression. 
     * @return Compress Compression methods supported: "", "gzip", "lzop", and "snappy". Default empty with no compression.
     */
    public String getCompress() {
        return this.Compress;
    }

    /**
     * Set Compression methods supported: "", "gzip", "lzop", and "snappy". Default empty with no compression.
     * @param Compress Compression methods supported: "", "gzip", "lzop", and "snappy". Default empty with no compression.
     */
    public void setCompress(String Compress) {
        this.Compress = Compress;
    }

    /**
     * Get See the description of the ExtractRuleInfo structure. 
     * @return ExtractRuleInfo See the description of the ExtractRuleInfo structure.
     */
    public ExtractRuleInfo getExtractRuleInfo() {
        return this.ExtractRuleInfo;
    }

    /**
     * Set See the description of the ExtractRuleInfo structure.
     * @param ExtractRuleInfo See the description of the ExtractRuleInfo structure.
     */
    public void setExtractRuleInfo(ExtractRuleInfo ExtractRuleInfo) {
        this.ExtractRuleInfo = ExtractRuleInfo;
    }

    /**
     * Get COS import task type. Valid values: 1: one-time import task; 2: continuous import task. 
     * @return TaskType COS import task type. Valid values: 1: one-time import task; 2: continuous import task.
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set COS import task type. Valid values: 1: one-time import task; 2: continuous import task.
     * @param TaskType COS import task type. Valid values: 1: one-time import task; 2: continuous import task.
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Metadata. Buckets and objects are supported. 
     * @return Metadata Metadata. Buckets and objects are supported.
     */
    public String [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set Metadata. Buckets and objects are supported.
     * @param Metadata Metadata. Buckets and objects are supported.
     */
    public void setMetadata(String [] Metadata) {
        this.Metadata = Metadata;
    }

    public CosRechargeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosRechargeInfo(CosRechargeInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.Compress != null) {
            this.Compress = new String(source.Compress);
        }
        if (source.ExtractRuleInfo != null) {
            this.ExtractRuleInfo = new ExtractRuleInfo(source.ExtractRuleInfo);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.Metadata != null) {
            this.Metadata = new String[source.Metadata.length];
            for (int i = 0; i < source.Metadata.length; i++) {
                this.Metadata[i] = new String(source.Metadata[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamObj(map, prefix + "ExtractRuleInfo.", this.ExtractRuleInfo);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "Metadata.", this.Metadata);

    }
}

