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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicInfo extends AbstractModel{

    /**
    * Logset ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Log topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Log topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Number of topic partitions
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * Whether index is enabled
    */
    @SerializedName("Index")
    @Expose
    private Boolean Index;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Whether collection is enabled in the log topic
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * Information of tags bound to log topic
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Whether automatic split is enabled for this topic
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoSplit")
    @Expose
    private Boolean AutoSplit;

    /**
    * Maximum number of partitions to split into for this topic if automatic split is enabled
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxSplitPartitions")
    @Expose
    private Long MaxSplitPartitions;

    /**
    * Log topic storage class
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * Lifecycle in days
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

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
     * Get Log topic name 
     * @return TopicName Log topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Log topic name
     * @param TopicName Log topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Number of topic partitions 
     * @return PartitionCount Number of topic partitions
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set Number of topic partitions
     * @param PartitionCount Number of topic partitions
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get Whether index is enabled 
     * @return Index Whether index is enabled
     */
    public Boolean getIndex() {
        return this.Index;
    }

    /**
     * Set Whether index is enabled
     * @param Index Whether index is enabled
     */
    public void setIndex(Boolean Index) {
        this.Index = Index;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Whether collection is enabled in the log topic 
     * @return Status Whether collection is enabled in the log topic
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Whether collection is enabled in the log topic
     * @param Status Whether collection is enabled in the log topic
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get Information of tags bound to log topic
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Tags Information of tags bound to log topic
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Information of tags bound to log topic
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Tags Information of tags bound to log topic
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether automatic split is enabled for this topic
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AutoSplit Whether automatic split is enabled for this topic
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getAutoSplit() {
        return this.AutoSplit;
    }

    /**
     * Set Whether automatic split is enabled for this topic
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AutoSplit Whether automatic split is enabled for this topic
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAutoSplit(Boolean AutoSplit) {
        this.AutoSplit = AutoSplit;
    }

    /**
     * Get Maximum number of partitions to split into for this topic if automatic split is enabled
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MaxSplitPartitions Maximum number of partitions to split into for this topic if automatic split is enabled
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getMaxSplitPartitions() {
        return this.MaxSplitPartitions;
    }

    /**
     * Set Maximum number of partitions to split into for this topic if automatic split is enabled
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MaxSplitPartitions Maximum number of partitions to split into for this topic if automatic split is enabled
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMaxSplitPartitions(Long MaxSplitPartitions) {
        this.MaxSplitPartitions = MaxSplitPartitions;
    }

    /**
     * Get Log topic storage class
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return StorageType Log topic storage class
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Log topic storage class
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param StorageType Log topic storage class
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Lifecycle in days
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Period Lifecycle in days
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Lifecycle in days
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Period Lifecycle in days
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public TopicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicInfo(TopicInfo source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.Index != null) {
            this.Index = new Boolean(source.Index);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AutoSplit != null) {
            this.AutoSplit = new Boolean(source.AutoSplit);
        }
        if (source.MaxSplitPartitions != null) {
            this.MaxSplitPartitions = new Long(source.MaxSplitPartitions);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoSplit", this.AutoSplit);
        this.setParamSimple(map, prefix + "MaxSplitPartitions", this.MaxSplitPartitions);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

