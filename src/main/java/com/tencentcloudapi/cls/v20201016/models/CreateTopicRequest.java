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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTopicRequest extends AbstractModel {

    /**
    * Logset ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Log topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Number of log topic partitions. Default value: 1. Maximum value: 10
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * Tag description list. This parameter is used to bind a tag to a log topic. Up to 10 tag key-value pairs are supported, and a resource can be bound to only one tag key.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Whether to enable automatic split. Default value: true
    */
    @SerializedName("AutoSplit")
    @Expose
    private Boolean AutoSplit;

    /**
    * Maximum number of partitions to split into for this topic if automatic split is enabled. Default value: 50
    */
    @SerializedName("MaxSplitPartitions")
    @Expose
    private Long MaxSplitPartitions;

    /**
    * Log topic storage type. Valid values: `hot` (STANDARD storage); `cold` (IA storage). Default value: `hot`.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * lifetime. Unit: days. Standard storage value range: 1~3600. Infrequent storage value range: 7~3600 days. A value of 3640 indicates permanent retention.If this value is not input, it defaults to the Period value of the log set corresponding to the accessed log topic (defaults to 30 days in case of access failure).
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Log topic description
    */
    @SerializedName("Describes")
    @Expose
    private String Describes;

    /**
    * 0: Disable log settlement.Non-zero: The number of Standard Storage days after enabling log settlement. HotPeriod needs to be greater than or equal to 7, and less than Period.Effective only when StorageType is hot.
    */
    @SerializedName("HotPeriod")
    @Expose
    private Long HotPeriod;

    /**
    * Authentication switch. false: off; true: on. Default is false.Once enabled, it will support specified operations for anonymous access to this log topic. For details, please see [log Topic](https://intl.cloud.tencent.com/document/product/614/41035?from_cn_redirect=1).
    */
    @SerializedName("IsWebTracking")
    @Expose
    private Boolean IsWebTracking;

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
     * Get Number of log topic partitions. Default value: 1. Maximum value: 10 
     * @return PartitionCount Number of log topic partitions. Default value: 1. Maximum value: 10
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set Number of log topic partitions. Default value: 1. Maximum value: 10
     * @param PartitionCount Number of log topic partitions. Default value: 1. Maximum value: 10
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get Tag description list. This parameter is used to bind a tag to a log topic. Up to 10 tag key-value pairs are supported, and a resource can be bound to only one tag key. 
     * @return Tags Tag description list. This parameter is used to bind a tag to a log topic. Up to 10 tag key-value pairs are supported, and a resource can be bound to only one tag key.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag description list. This parameter is used to bind a tag to a log topic. Up to 10 tag key-value pairs are supported, and a resource can be bound to only one tag key.
     * @param Tags Tag description list. This parameter is used to bind a tag to a log topic. Up to 10 tag key-value pairs are supported, and a resource can be bound to only one tag key.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether to enable automatic split. Default value: true 
     * @return AutoSplit Whether to enable automatic split. Default value: true
     */
    public Boolean getAutoSplit() {
        return this.AutoSplit;
    }

    /**
     * Set Whether to enable automatic split. Default value: true
     * @param AutoSplit Whether to enable automatic split. Default value: true
     */
    public void setAutoSplit(Boolean AutoSplit) {
        this.AutoSplit = AutoSplit;
    }

    /**
     * Get Maximum number of partitions to split into for this topic if automatic split is enabled. Default value: 50 
     * @return MaxSplitPartitions Maximum number of partitions to split into for this topic if automatic split is enabled. Default value: 50
     */
    public Long getMaxSplitPartitions() {
        return this.MaxSplitPartitions;
    }

    /**
     * Set Maximum number of partitions to split into for this topic if automatic split is enabled. Default value: 50
     * @param MaxSplitPartitions Maximum number of partitions to split into for this topic if automatic split is enabled. Default value: 50
     */
    public void setMaxSplitPartitions(Long MaxSplitPartitions) {
        this.MaxSplitPartitions = MaxSplitPartitions;
    }

    /**
     * Get Log topic storage type. Valid values: `hot` (STANDARD storage); `cold` (IA storage). Default value: `hot`. 
     * @return StorageType Log topic storage type. Valid values: `hot` (STANDARD storage); `cold` (IA storage). Default value: `hot`.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Log topic storage type. Valid values: `hot` (STANDARD storage); `cold` (IA storage). Default value: `hot`.
     * @param StorageType Log topic storage type. Valid values: `hot` (STANDARD storage); `cold` (IA storage). Default value: `hot`.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get lifetime. Unit: days. Standard storage value range: 1~3600. Infrequent storage value range: 7~3600 days. A value of 3640 indicates permanent retention.If this value is not input, it defaults to the Period value of the log set corresponding to the accessed log topic (defaults to 30 days in case of access failure). 
     * @return Period lifetime. Unit: days. Standard storage value range: 1~3600. Infrequent storage value range: 7~3600 days. A value of 3640 indicates permanent retention.If this value is not input, it defaults to the Period value of the log set corresponding to the accessed log topic (defaults to 30 days in case of access failure).
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set lifetime. Unit: days. Standard storage value range: 1~3600. Infrequent storage value range: 7~3600 days. A value of 3640 indicates permanent retention.If this value is not input, it defaults to the Period value of the log set corresponding to the accessed log topic (defaults to 30 days in case of access failure).
     * @param Period lifetime. Unit: days. Standard storage value range: 1~3600. Infrequent storage value range: 7~3600 days. A value of 3640 indicates permanent retention.If this value is not input, it defaults to the Period value of the log set corresponding to the accessed log topic (defaults to 30 days in case of access failure).
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Log topic description 
     * @return Describes Log topic description
     */
    public String getDescribes() {
        return this.Describes;
    }

    /**
     * Set Log topic description
     * @param Describes Log topic description
     */
    public void setDescribes(String Describes) {
        this.Describes = Describes;
    }

    /**
     * Get 0: Disable log settlement.Non-zero: The number of Standard Storage days after enabling log settlement. HotPeriod needs to be greater than or equal to 7, and less than Period.Effective only when StorageType is hot. 
     * @return HotPeriod 0: Disable log settlement.Non-zero: The number of Standard Storage days after enabling log settlement. HotPeriod needs to be greater than or equal to 7, and less than Period.Effective only when StorageType is hot.
     */
    public Long getHotPeriod() {
        return this.HotPeriod;
    }

    /**
     * Set 0: Disable log settlement.Non-zero: The number of Standard Storage days after enabling log settlement. HotPeriod needs to be greater than or equal to 7, and less than Period.Effective only when StorageType is hot.
     * @param HotPeriod 0: Disable log settlement.Non-zero: The number of Standard Storage days after enabling log settlement. HotPeriod needs to be greater than or equal to 7, and less than Period.Effective only when StorageType is hot.
     */
    public void setHotPeriod(Long HotPeriod) {
        this.HotPeriod = HotPeriod;
    }

    /**
     * Get Authentication switch. false: off; true: on. Default is false.Once enabled, it will support specified operations for anonymous access to this log topic. For details, please see [log Topic](https://intl.cloud.tencent.com/document/product/614/41035?from_cn_redirect=1). 
     * @return IsWebTracking Authentication switch. false: off; true: on. Default is false.Once enabled, it will support specified operations for anonymous access to this log topic. For details, please see [log Topic](https://intl.cloud.tencent.com/document/product/614/41035?from_cn_redirect=1).
     */
    public Boolean getIsWebTracking() {
        return this.IsWebTracking;
    }

    /**
     * Set Authentication switch. false: off; true: on. Default is false.Once enabled, it will support specified operations for anonymous access to this log topic. For details, please see [log Topic](https://intl.cloud.tencent.com/document/product/614/41035?from_cn_redirect=1).
     * @param IsWebTracking Authentication switch. false: off; true: on. Default is false.Once enabled, it will support specified operations for anonymous access to this log topic. For details, please see [log Topic](https://intl.cloud.tencent.com/document/product/614/41035?from_cn_redirect=1).
     */
    public void setIsWebTracking(Boolean IsWebTracking) {
        this.IsWebTracking = IsWebTracking;
    }

    public CreateTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTopicRequest(CreateTopicRequest source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
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
        if (source.Describes != null) {
            this.Describes = new String(source.Describes);
        }
        if (source.HotPeriod != null) {
            this.HotPeriod = new Long(source.HotPeriod);
        }
        if (source.IsWebTracking != null) {
            this.IsWebTracking = new Boolean(source.IsWebTracking);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoSplit", this.AutoSplit);
        this.setParamSimple(map, prefix + "MaxSplitPartitions", this.MaxSplitPartitions);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Describes", this.Describes);
        this.setParamSimple(map, prefix + "HotPeriod", this.HotPeriod);
        this.setParamSimple(map, prefix + "IsWebTracking", this.IsWebTracking);

    }
}

