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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTopicRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Topic name, which is a string of up to 128 characters. It can contain letters, digits, and hyphens (-) and must start with a letter.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Number of partitions, which should be greater than 0
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * Number of replicas, which cannot be higher than the number of brokers. Maximum value: 3
    */
    @SerializedName("ReplicaNum")
    @Expose
    private Long ReplicaNum;

    /**
    * IP allowlist switch. 1: enabled, 0: disabled. Default value: 0
    */
    @SerializedName("EnableWhiteList")
    @Expose
    private Long EnableWhiteList;

    /**
    * IP allowlist list for quota limit, which is required if `enableWhileList` is 1
    */
    @SerializedName("IpWhiteList")
    @Expose
    private String [] IpWhiteList;

    /**
    * Log cleanup policy, which is `delete` by default. `delete`: logs will be deleted by save time; `compact`: logs will be compressed by key; `compact, delete`: logs will be compressed by key and deleted by save time.
    */
    @SerializedName("CleanUpPolicy")
    @Expose
    private String CleanUpPolicy;

    /**
    * Topic remarks string of up to 64 characters, which must begin with a letter and can contain letters, digits, and dashes (`-`)
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * Default value: 1
    */
    @SerializedName("MinInsyncReplicas")
    @Expose
    private Long MinInsyncReplicas;

    /**
    * Whether to allow an unsynced replica to be elected as leader. false: no, true: yes. Default value: false
    */
    @SerializedName("UncleanLeaderElectionEnable")
    @Expose
    private Long UncleanLeaderElectionEnable;

    /**
    * Message retention period in milliseconds, which is optional. Min value: 60,000 ms.
    */
    @SerializedName("RetentionMs")
    @Expose
    private Long RetentionMs;

    /**
    * Segment rolling duration in ms. The current minimum value is 3,600,000 ms
    */
    @SerializedName("SegmentMs")
    @Expose
    private Long SegmentMs;

    /**
    * Max message size in bytes. Value range: 1,024 bytes (1 KB) to 8,388,608 bytes (8 MB).
    */
    @SerializedName("MaxMessageBytes")
    @Expose
    private Long MaxMessageBytes;

    /**
    * Preset ACL rule. `1`: enable, `0`: disable. Default value: `0`.
    */
    @SerializedName("EnableAclRule")
    @Expose
    private Long EnableAclRule;

    /**
    * Name of the preset ACL rule.
    */
    @SerializedName("AclRuleName")
    @Expose
    private String AclRuleName;

    /**
    * Message retention file size in bytes, which is an optional parameter. Default value: -1. Currently, the min value that can be entered is 1,048,576 B.
    */
    @SerializedName("RetentionBytes")
    @Expose
    private Long RetentionBytes;

    /**
    * Tag list.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Topic name, which is a string of up to 128 characters. It can contain letters, digits, and hyphens (-) and must start with a letter. 
     * @return TopicName Topic name, which is a string of up to 128 characters. It can contain letters, digits, and hyphens (-) and must start with a letter.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name, which is a string of up to 128 characters. It can contain letters, digits, and hyphens (-) and must start with a letter.
     * @param TopicName Topic name, which is a string of up to 128 characters. It can contain letters, digits, and hyphens (-) and must start with a letter.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Number of partitions, which should be greater than 0 
     * @return PartitionNum Number of partitions, which should be greater than 0
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set Number of partitions, which should be greater than 0
     * @param PartitionNum Number of partitions, which should be greater than 0
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get Number of replicas, which cannot be higher than the number of brokers. Maximum value: 3 
     * @return ReplicaNum Number of replicas, which cannot be higher than the number of brokers. Maximum value: 3
     */
    public Long getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set Number of replicas, which cannot be higher than the number of brokers. Maximum value: 3
     * @param ReplicaNum Number of replicas, which cannot be higher than the number of brokers. Maximum value: 3
     */
    public void setReplicaNum(Long ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    /**
     * Get IP allowlist switch. 1: enabled, 0: disabled. Default value: 0 
     * @return EnableWhiteList IP allowlist switch. 1: enabled, 0: disabled. Default value: 0
     */
    public Long getEnableWhiteList() {
        return this.EnableWhiteList;
    }

    /**
     * Set IP allowlist switch. 1: enabled, 0: disabled. Default value: 0
     * @param EnableWhiteList IP allowlist switch. 1: enabled, 0: disabled. Default value: 0
     */
    public void setEnableWhiteList(Long EnableWhiteList) {
        this.EnableWhiteList = EnableWhiteList;
    }

    /**
     * Get IP allowlist list for quota limit, which is required if `enableWhileList` is 1 
     * @return IpWhiteList IP allowlist list for quota limit, which is required if `enableWhileList` is 1
     */
    public String [] getIpWhiteList() {
        return this.IpWhiteList;
    }

    /**
     * Set IP allowlist list for quota limit, which is required if `enableWhileList` is 1
     * @param IpWhiteList IP allowlist list for quota limit, which is required if `enableWhileList` is 1
     */
    public void setIpWhiteList(String [] IpWhiteList) {
        this.IpWhiteList = IpWhiteList;
    }

    /**
     * Get Log cleanup policy, which is `delete` by default. `delete`: logs will be deleted by save time; `compact`: logs will be compressed by key; `compact, delete`: logs will be compressed by key and deleted by save time. 
     * @return CleanUpPolicy Log cleanup policy, which is `delete` by default. `delete`: logs will be deleted by save time; `compact`: logs will be compressed by key; `compact, delete`: logs will be compressed by key and deleted by save time.
     */
    public String getCleanUpPolicy() {
        return this.CleanUpPolicy;
    }

    /**
     * Set Log cleanup policy, which is `delete` by default. `delete`: logs will be deleted by save time; `compact`: logs will be compressed by key; `compact, delete`: logs will be compressed by key and deleted by save time.
     * @param CleanUpPolicy Log cleanup policy, which is `delete` by default. `delete`: logs will be deleted by save time; `compact`: logs will be compressed by key; `compact, delete`: logs will be compressed by key and deleted by save time.
     */
    public void setCleanUpPolicy(String CleanUpPolicy) {
        this.CleanUpPolicy = CleanUpPolicy;
    }

    /**
     * Get Topic remarks string of up to 64 characters, which must begin with a letter and can contain letters, digits, and dashes (`-`) 
     * @return Note Topic remarks string of up to 64 characters, which must begin with a letter and can contain letters, digits, and dashes (`-`)
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Topic remarks string of up to 64 characters, which must begin with a letter and can contain letters, digits, and dashes (`-`)
     * @param Note Topic remarks string of up to 64 characters, which must begin with a letter and can contain letters, digits, and dashes (`-`)
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get Default value: 1 
     * @return MinInsyncReplicas Default value: 1
     */
    public Long getMinInsyncReplicas() {
        return this.MinInsyncReplicas;
    }

    /**
     * Set Default value: 1
     * @param MinInsyncReplicas Default value: 1
     */
    public void setMinInsyncReplicas(Long MinInsyncReplicas) {
        this.MinInsyncReplicas = MinInsyncReplicas;
    }

    /**
     * Get Whether to allow an unsynced replica to be elected as leader. false: no, true: yes. Default value: false 
     * @return UncleanLeaderElectionEnable Whether to allow an unsynced replica to be elected as leader. false: no, true: yes. Default value: false
     */
    public Long getUncleanLeaderElectionEnable() {
        return this.UncleanLeaderElectionEnable;
    }

    /**
     * Set Whether to allow an unsynced replica to be elected as leader. false: no, true: yes. Default value: false
     * @param UncleanLeaderElectionEnable Whether to allow an unsynced replica to be elected as leader. false: no, true: yes. Default value: false
     */
    public void setUncleanLeaderElectionEnable(Long UncleanLeaderElectionEnable) {
        this.UncleanLeaderElectionEnable = UncleanLeaderElectionEnable;
    }

    /**
     * Get Message retention period in milliseconds, which is optional. Min value: 60,000 ms. 
     * @return RetentionMs Message retention period in milliseconds, which is optional. Min value: 60,000 ms.
     */
    public Long getRetentionMs() {
        return this.RetentionMs;
    }

    /**
     * Set Message retention period in milliseconds, which is optional. Min value: 60,000 ms.
     * @param RetentionMs Message retention period in milliseconds, which is optional. Min value: 60,000 ms.
     */
    public void setRetentionMs(Long RetentionMs) {
        this.RetentionMs = RetentionMs;
    }

    /**
     * Get Segment rolling duration in ms. The current minimum value is 3,600,000 ms 
     * @return SegmentMs Segment rolling duration in ms. The current minimum value is 3,600,000 ms
     */
    public Long getSegmentMs() {
        return this.SegmentMs;
    }

    /**
     * Set Segment rolling duration in ms. The current minimum value is 3,600,000 ms
     * @param SegmentMs Segment rolling duration in ms. The current minimum value is 3,600,000 ms
     */
    public void setSegmentMs(Long SegmentMs) {
        this.SegmentMs = SegmentMs;
    }

    /**
     * Get Max message size in bytes. Value range: 1,024 bytes (1 KB) to 8,388,608 bytes (8 MB). 
     * @return MaxMessageBytes Max message size in bytes. Value range: 1,024 bytes (1 KB) to 8,388,608 bytes (8 MB).
     */
    public Long getMaxMessageBytes() {
        return this.MaxMessageBytes;
    }

    /**
     * Set Max message size in bytes. Value range: 1,024 bytes (1 KB) to 8,388,608 bytes (8 MB).
     * @param MaxMessageBytes Max message size in bytes. Value range: 1,024 bytes (1 KB) to 8,388,608 bytes (8 MB).
     */
    public void setMaxMessageBytes(Long MaxMessageBytes) {
        this.MaxMessageBytes = MaxMessageBytes;
    }

    /**
     * Get Preset ACL rule. `1`: enable, `0`: disable. Default value: `0`. 
     * @return EnableAclRule Preset ACL rule. `1`: enable, `0`: disable. Default value: `0`.
     */
    public Long getEnableAclRule() {
        return this.EnableAclRule;
    }

    /**
     * Set Preset ACL rule. `1`: enable, `0`: disable. Default value: `0`.
     * @param EnableAclRule Preset ACL rule. `1`: enable, `0`: disable. Default value: `0`.
     */
    public void setEnableAclRule(Long EnableAclRule) {
        this.EnableAclRule = EnableAclRule;
    }

    /**
     * Get Name of the preset ACL rule. 
     * @return AclRuleName Name of the preset ACL rule.
     */
    public String getAclRuleName() {
        return this.AclRuleName;
    }

    /**
     * Set Name of the preset ACL rule.
     * @param AclRuleName Name of the preset ACL rule.
     */
    public void setAclRuleName(String AclRuleName) {
        this.AclRuleName = AclRuleName;
    }

    /**
     * Get Message retention file size in bytes, which is an optional parameter. Default value: -1. Currently, the min value that can be entered is 1,048,576 B. 
     * @return RetentionBytes Message retention file size in bytes, which is an optional parameter. Default value: -1. Currently, the min value that can be entered is 1,048,576 B.
     */
    public Long getRetentionBytes() {
        return this.RetentionBytes;
    }

    /**
     * Set Message retention file size in bytes, which is an optional parameter. Default value: -1. Currently, the min value that can be entered is 1,048,576 B.
     * @param RetentionBytes Message retention file size in bytes, which is an optional parameter. Default value: -1. Currently, the min value that can be entered is 1,048,576 B.
     */
    public void setRetentionBytes(Long RetentionBytes) {
        this.RetentionBytes = RetentionBytes;
    }

    /**
     * Get Tag list. 
     * @return Tags Tag list.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list.
     * @param Tags Tag list.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTopicRequest(CreateTopicRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
        }
        if (source.ReplicaNum != null) {
            this.ReplicaNum = new Long(source.ReplicaNum);
        }
        if (source.EnableWhiteList != null) {
            this.EnableWhiteList = new Long(source.EnableWhiteList);
        }
        if (source.IpWhiteList != null) {
            this.IpWhiteList = new String[source.IpWhiteList.length];
            for (int i = 0; i < source.IpWhiteList.length; i++) {
                this.IpWhiteList[i] = new String(source.IpWhiteList[i]);
            }
        }
        if (source.CleanUpPolicy != null) {
            this.CleanUpPolicy = new String(source.CleanUpPolicy);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.MinInsyncReplicas != null) {
            this.MinInsyncReplicas = new Long(source.MinInsyncReplicas);
        }
        if (source.UncleanLeaderElectionEnable != null) {
            this.UncleanLeaderElectionEnable = new Long(source.UncleanLeaderElectionEnable);
        }
        if (source.RetentionMs != null) {
            this.RetentionMs = new Long(source.RetentionMs);
        }
        if (source.SegmentMs != null) {
            this.SegmentMs = new Long(source.SegmentMs);
        }
        if (source.MaxMessageBytes != null) {
            this.MaxMessageBytes = new Long(source.MaxMessageBytes);
        }
        if (source.EnableAclRule != null) {
            this.EnableAclRule = new Long(source.EnableAclRule);
        }
        if (source.AclRuleName != null) {
            this.AclRuleName = new String(source.AclRuleName);
        }
        if (source.RetentionBytes != null) {
            this.RetentionBytes = new Long(source.RetentionBytes);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamSimple(map, prefix + "ReplicaNum", this.ReplicaNum);
        this.setParamSimple(map, prefix + "EnableWhiteList", this.EnableWhiteList);
        this.setParamArraySimple(map, prefix + "IpWhiteList.", this.IpWhiteList);
        this.setParamSimple(map, prefix + "CleanUpPolicy", this.CleanUpPolicy);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "MinInsyncReplicas", this.MinInsyncReplicas);
        this.setParamSimple(map, prefix + "UncleanLeaderElectionEnable", this.UncleanLeaderElectionEnable);
        this.setParamSimple(map, prefix + "RetentionMs", this.RetentionMs);
        this.setParamSimple(map, prefix + "SegmentMs", this.SegmentMs);
        this.setParamSimple(map, prefix + "MaxMessageBytes", this.MaxMessageBytes);
        this.setParamSimple(map, prefix + "EnableAclRule", this.EnableAclRule);
        this.setParamSimple(map, prefix + "AclRuleName", this.AclRuleName);
        this.setParamSimple(map, prefix + "RetentionBytes", this.RetentionBytes);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

