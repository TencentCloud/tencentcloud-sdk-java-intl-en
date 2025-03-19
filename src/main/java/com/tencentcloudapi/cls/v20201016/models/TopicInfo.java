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

public class TopicInfo extends AbstractModel {

    /**
    * Logset ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    *  Topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Topic Name
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
    * Whether the topic has indexing enabled (the topic type must be log topic)
    */
    @SerializedName("Index")
    @Expose
    private Boolean Index;

    /**
    * Cloud product identifier. When the topic is created by other cloud products, this field displays the name of the cloud product, such as CDN, TKE.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssumerName")
    @Expose
    private String AssumerName;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Whether the topic has log collection enabled. true: collection enabled; false: collection disabled.Log collection is enabled by default when creating a log topic, and this field can be modified by calling ModifyTopic through the SDK.The console currently does not support modifying this parameter.
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * Tag information bound to the topicNote: This field may return null, indicating that no valid values can be obtained.
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
    * Storage type of the topicNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * Lifecycle in days. Value range: 1-3600 (3640 indicates permanent retention)
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Cloud product sub-identifier. If the log topic is created by another cloud product, this field returns the name of the cloud product and its log type, such as `TKE-Audit` or `TKE-Event`. Some products only return the cloud product identifier (`AssumerName`), without this field.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubAssumerName")
    @Expose
    private String SubAssumerName;

    /**
    * Topic description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Describes")
    @Expose
    private String Describes;

    /**
    * Enable log sinking, with the lifecycle of standard storage, where hotPeriod < Period.For standard storage, hotPeriod is used, and for infrequent access storage, it is Period-hotPeriod. (The topic type must be a log topic)HotPeriod=0 indicates that log sinking is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HotPeriod")
    @Expose
    private Long HotPeriod;

    /**
    * Topic type.
- 0:  log  Topic  
- 1: Metric Topic
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
    * Free authentication switch. false: disabled; true: enabled.After enabling, anonymous access to the log topic will be supported for specified operations. For details, please refer to Log Topic (https://intl.cloud.tencent.com/document/product/614/41035?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsWebTracking")
    @Expose
    private Boolean IsWebTracking;

    /**
    * 
    */
    @SerializedName("Extends")
    @Expose
    private TopicExtendInfo Extends;

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
     * Get  Topic ID 
     * @return TopicId  Topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set  Topic ID
     * @param TopicId  Topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Topic Name 
     * @return TopicName Topic Name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic Name
     * @param TopicName Topic Name
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
     * Get Whether the topic has indexing enabled (the topic type must be log topic) 
     * @return Index Whether the topic has indexing enabled (the topic type must be log topic)
     */
    public Boolean getIndex() {
        return this.Index;
    }

    /**
     * Set Whether the topic has indexing enabled (the topic type must be log topic)
     * @param Index Whether the topic has indexing enabled (the topic type must be log topic)
     */
    public void setIndex(Boolean Index) {
        this.Index = Index;
    }

    /**
     * Get Cloud product identifier. When the topic is created by other cloud products, this field displays the name of the cloud product, such as CDN, TKE.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AssumerName Cloud product identifier. When the topic is created by other cloud products, this field displays the name of the cloud product, such as CDN, TKE.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAssumerName() {
        return this.AssumerName;
    }

    /**
     * Set Cloud product identifier. When the topic is created by other cloud products, this field displays the name of the cloud product, such as CDN, TKE.Note: This field may return null, indicating that no valid values can be obtained.
     * @param AssumerName Cloud product identifier. When the topic is created by other cloud products, this field displays the name of the cloud product, such as CDN, TKE.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAssumerName(String AssumerName) {
        this.AssumerName = AssumerName;
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
     * Get Whether the topic has log collection enabled. true: collection enabled; false: collection disabled.Log collection is enabled by default when creating a log topic, and this field can be modified by calling ModifyTopic through the SDK.The console currently does not support modifying this parameter. 
     * @return Status Whether the topic has log collection enabled. true: collection enabled; false: collection disabled.Log collection is enabled by default when creating a log topic, and this field can be modified by calling ModifyTopic through the SDK.The console currently does not support modifying this parameter.
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Whether the topic has log collection enabled. true: collection enabled; false: collection disabled.Log collection is enabled by default when creating a log topic, and this field can be modified by calling ModifyTopic through the SDK.The console currently does not support modifying this parameter.
     * @param Status Whether the topic has log collection enabled. true: collection enabled; false: collection disabled.Log collection is enabled by default when creating a log topic, and this field can be modified by calling ModifyTopic through the SDK.The console currently does not support modifying this parameter.
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get Tag information bound to the topicNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag information bound to the topicNote: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information bound to the topicNote: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag information bound to the topicNote: This field may return null, indicating that no valid values can be obtained.
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
     * Get Storage type of the topicNote: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageType Storage type of the topicNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Storage type of the topicNote: This field may return null, indicating that no valid values can be obtained.
     * @param StorageType Storage type of the topicNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Lifecycle in days. Value range: 1-3600 (3640 indicates permanent retention)
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Period Lifecycle in days. Value range: 1-3600 (3640 indicates permanent retention)
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Lifecycle in days. Value range: 1-3600 (3640 indicates permanent retention)
Note: This field may return `null`, indicating that no valid value was found.
     * @param Period Lifecycle in days. Value range: 1-3600 (3640 indicates permanent retention)
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Cloud product sub-identifier. If the log topic is created by another cloud product, this field returns the name of the cloud product and its log type, such as `TKE-Audit` or `TKE-Event`. Some products only return the cloud product identifier (`AssumerName`), without this field.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubAssumerName Cloud product sub-identifier. If the log topic is created by another cloud product, this field returns the name of the cloud product and its log type, such as `TKE-Audit` or `TKE-Event`. Some products only return the cloud product identifier (`AssumerName`), without this field.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubAssumerName() {
        return this.SubAssumerName;
    }

    /**
     * Set Cloud product sub-identifier. If the log topic is created by another cloud product, this field returns the name of the cloud product and its log type, such as `TKE-Audit` or `TKE-Event`. Some products only return the cloud product identifier (`AssumerName`), without this field.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubAssumerName Cloud product sub-identifier. If the log topic is created by another cloud product, this field returns the name of the cloud product and its log type, such as `TKE-Audit` or `TKE-Event`. Some products only return the cloud product identifier (`AssumerName`), without this field.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubAssumerName(String SubAssumerName) {
        this.SubAssumerName = SubAssumerName;
    }

    /**
     * Get Topic description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Describes Topic description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescribes() {
        return this.Describes;
    }

    /**
     * Set Topic description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Describes Topic description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescribes(String Describes) {
        this.Describes = Describes;
    }

    /**
     * Get Enable log sinking, with the lifecycle of standard storage, where hotPeriod < Period.For standard storage, hotPeriod is used, and for infrequent access storage, it is Period-hotPeriod. (The topic type must be a log topic)HotPeriod=0 indicates that log sinking is not enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HotPeriod Enable log sinking, with the lifecycle of standard storage, where hotPeriod < Period.For standard storage, hotPeriod is used, and for infrequent access storage, it is Period-hotPeriod. (The topic type must be a log topic)HotPeriod=0 indicates that log sinking is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHotPeriod() {
        return this.HotPeriod;
    }

    /**
     * Set Enable log sinking, with the lifecycle of standard storage, where hotPeriod < Period.For standard storage, hotPeriod is used, and for infrequent access storage, it is Period-hotPeriod. (The topic type must be a log topic)HotPeriod=0 indicates that log sinking is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HotPeriod Enable log sinking, with the lifecycle of standard storage, where hotPeriod < Period.For standard storage, hotPeriod is used, and for infrequent access storage, it is Period-hotPeriod. (The topic type must be a log topic)HotPeriod=0 indicates that log sinking is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHotPeriod(Long HotPeriod) {
        this.HotPeriod = HotPeriod;
    }

    /**
     * Get Topic type.
- 0:  log  Topic  
- 1: Metric Topic
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BizType Topic type.
- 0:  log  Topic  
- 1: Metric Topic
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set Topic type.
- 0:  log  Topic  
- 1: Metric Topic
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BizType Topic type.
- 0:  log  Topic  
- 1: Metric Topic
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    /**
     * Get Free authentication switch. false: disabled; true: enabled.After enabling, anonymous access to the log topic will be supported for specified operations. For details, please refer to Log Topic (https://intl.cloud.tencent.com/document/product/614/41035?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsWebTracking Free authentication switch. false: disabled; true: enabled.After enabling, anonymous access to the log topic will be supported for specified operations. For details, please refer to Log Topic (https://intl.cloud.tencent.com/document/product/614/41035?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsWebTracking() {
        return this.IsWebTracking;
    }

    /**
     * Set Free authentication switch. false: disabled; true: enabled.After enabling, anonymous access to the log topic will be supported for specified operations. For details, please refer to Log Topic (https://intl.cloud.tencent.com/document/product/614/41035?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsWebTracking Free authentication switch. false: disabled; true: enabled.After enabling, anonymous access to the log topic will be supported for specified operations. For details, please refer to Log Topic (https://intl.cloud.tencent.com/document/product/614/41035?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsWebTracking(Boolean IsWebTracking) {
        this.IsWebTracking = IsWebTracking;
    }

    /**
     * Get  
     * @return Extends 
     */
    public TopicExtendInfo getExtends() {
        return this.Extends;
    }

    /**
     * Set 
     * @param Extends 
     */
    public void setExtends(TopicExtendInfo Extends) {
        this.Extends = Extends;
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
        if (source.AssumerName != null) {
            this.AssumerName = new String(source.AssumerName);
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
        if (source.SubAssumerName != null) {
            this.SubAssumerName = new String(source.SubAssumerName);
        }
        if (source.Describes != null) {
            this.Describes = new String(source.Describes);
        }
        if (source.HotPeriod != null) {
            this.HotPeriod = new Long(source.HotPeriod);
        }
        if (source.BizType != null) {
            this.BizType = new Long(source.BizType);
        }
        if (source.IsWebTracking != null) {
            this.IsWebTracking = new Boolean(source.IsWebTracking);
        }
        if (source.Extends != null) {
            this.Extends = new TopicExtendInfo(source.Extends);
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
        this.setParamSimple(map, prefix + "AssumerName", this.AssumerName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoSplit", this.AutoSplit);
        this.setParamSimple(map, prefix + "MaxSplitPartitions", this.MaxSplitPartitions);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "SubAssumerName", this.SubAssumerName);
        this.setParamSimple(map, prefix + "Describes", this.Describes);
        this.setParamSimple(map, prefix + "HotPeriod", this.HotPeriod);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "IsWebTracking", this.IsWebTracking);
        this.setParamObj(map, prefix + "Extends.", this.Extends);

    }
}

