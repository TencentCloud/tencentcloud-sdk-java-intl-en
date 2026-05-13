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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTopicRequest extends AbstractModel {

    /**
    * <p>Instance Id</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Can only contain letters, digits, underscore, "-", ".". </p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>Number of partitions, more than 0</p>
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * <p>Replica count cannot be over the number of brokers, with a maximum of 3</p>
    */
    @SerializedName("ReplicaNum")
    @Expose
    private Long ReplicaNum;

    /**
    * <p>ip allowlist switch, 1: on; 0: off, default off</p>
    */
    @SerializedName("EnableWhiteList")
    @Expose
    private Long EnableWhiteList;

    /**
    * <p>Ip whitelist, Quota limit, essential when enableWhileList=1</p>
    */
    @SerializedName("IpWhiteList")
    @Expose
    private String [] IpWhiteList;

    /**
    * <p>Log cleanup policy. Log cleanup mode, defaults to "delete". "delete": logs are deleted by retention time. "compact": logs are compressed by key. "compact, delete": logs are compressed by key and deleted by retention time.</p>
    */
    @SerializedName("CleanUpPolicy")
    @Expose
    private String CleanUpPolicy;

    /**
    * <p>Topic remark</p><p>Input parameter limit: No more than 64 characters</p>
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * <p>Minimum sync replica count</p><p>Default value: 1</p><p>Minimum value: 1</p>
    */
    @SerializedName("MinInsyncReplicas")
    @Expose
    private Long MinInsyncReplicas;

    /**
    * <p>Whether to allow unsynchronized replicas to be elected as leader, 0: not allowed, 1: allowed, default not allowed</p>
    */
    @SerializedName("UncleanLeaderElectionEnable")
    @Expose
    private Long UncleanLeaderElectionEnable;

    /**
    * <p>Optional parameter, message retention period</p><p>Value ranges from 60000 to 7776000000</p><p>Unit: ms</p><p>Default value: 7200000</p>
    */
    @SerializedName("RetentionMs")
    @Expose
    private Long RetentionMs;

    /**
    * <p>Duration of Segment shard scrolling</p><p>Unit: ms</p><p>Default value: 86400000</p><p>Minimum value: 86400000ms (1 day)</p>
    */
    @SerializedName("SegmentMs")
    @Expose
    private Long SegmentMs;

    /**
    * <p>Maximum topic messages in Bytes, minimum value 1024 Bytes (1 KB), maximum value 12582912 Bytes (12 MB)</p>
    */
    @SerializedName("MaxMessageBytes")
    @Expose
    private Long MaxMessageBytes;

    /**
    * <p>Preset ACL rule, 1: on 0: off, default is off</p>
    */
    @SerializedName("EnableAclRule")
    @Expose
    private Long EnableAclRule;

    /**
    * <p>Preset ACL rule name</p>
    */
    @SerializedName("AclRuleName")
    @Expose
    private String AclRuleName;

    /**
    * <p>Option, retain file size. Defaults to -1, unit Byte, current min value is 1073741824.</p><p>Value ranges from [1073741824, 1099511627776]</p><p>Unit: Byte</p><p>Special value: -1 indicates unlimited</p>
    */
    @SerializedName("RetentionBytes")
    @Expose
    private Long RetentionBytes;

    /**
    * <p>Tag list</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>Time type for message saving: CreateTime/LogAppendTime</p>
    */
    @SerializedName("LogMsgTimestampType")
    @Expose
    private String LogMsgTimestampType;

    /**
     * Get <p>Instance Id</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p> 
     * @return InstanceId <p>Instance Id</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance Id</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p>
     * @param InstanceId <p>Instance Id</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Can only contain letters, digits, underscore, "-", ".". </p> 
     * @return TopicName <p>Can only contain letters, digits, underscore, "-", ".". </p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>Can only contain letters, digits, underscore, "-", ".". </p>
     * @param TopicName <p>Can only contain letters, digits, underscore, "-", ".". </p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>Number of partitions, more than 0</p> 
     * @return PartitionNum <p>Number of partitions, more than 0</p>
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set <p>Number of partitions, more than 0</p>
     * @param PartitionNum <p>Number of partitions, more than 0</p>
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get <p>Replica count cannot be over the number of brokers, with a maximum of 3</p> 
     * @return ReplicaNum <p>Replica count cannot be over the number of brokers, with a maximum of 3</p>
     */
    public Long getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set <p>Replica count cannot be over the number of brokers, with a maximum of 3</p>
     * @param ReplicaNum <p>Replica count cannot be over the number of brokers, with a maximum of 3</p>
     */
    public void setReplicaNum(Long ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    /**
     * Get <p>ip allowlist switch, 1: on; 0: off, default off</p> 
     * @return EnableWhiteList <p>ip allowlist switch, 1: on; 0: off, default off</p>
     */
    public Long getEnableWhiteList() {
        return this.EnableWhiteList;
    }

    /**
     * Set <p>ip allowlist switch, 1: on; 0: off, default off</p>
     * @param EnableWhiteList <p>ip allowlist switch, 1: on; 0: off, default off</p>
     */
    public void setEnableWhiteList(Long EnableWhiteList) {
        this.EnableWhiteList = EnableWhiteList;
    }

    /**
     * Get <p>Ip whitelist, Quota limit, essential when enableWhileList=1</p> 
     * @return IpWhiteList <p>Ip whitelist, Quota limit, essential when enableWhileList=1</p>
     */
    public String [] getIpWhiteList() {
        return this.IpWhiteList;
    }

    /**
     * Set <p>Ip whitelist, Quota limit, essential when enableWhileList=1</p>
     * @param IpWhiteList <p>Ip whitelist, Quota limit, essential when enableWhileList=1</p>
     */
    public void setIpWhiteList(String [] IpWhiteList) {
        this.IpWhiteList = IpWhiteList;
    }

    /**
     * Get <p>Log cleanup policy. Log cleanup mode, defaults to "delete". "delete": logs are deleted by retention time. "compact": logs are compressed by key. "compact, delete": logs are compressed by key and deleted by retention time.</p> 
     * @return CleanUpPolicy <p>Log cleanup policy. Log cleanup mode, defaults to "delete". "delete": logs are deleted by retention time. "compact": logs are compressed by key. "compact, delete": logs are compressed by key and deleted by retention time.</p>
     */
    public String getCleanUpPolicy() {
        return this.CleanUpPolicy;
    }

    /**
     * Set <p>Log cleanup policy. Log cleanup mode, defaults to "delete". "delete": logs are deleted by retention time. "compact": logs are compressed by key. "compact, delete": logs are compressed by key and deleted by retention time.</p>
     * @param CleanUpPolicy <p>Log cleanup policy. Log cleanup mode, defaults to "delete". "delete": logs are deleted by retention time. "compact": logs are compressed by key. "compact, delete": logs are compressed by key and deleted by retention time.</p>
     */
    public void setCleanUpPolicy(String CleanUpPolicy) {
        this.CleanUpPolicy = CleanUpPolicy;
    }

    /**
     * Get <p>Topic remark</p><p>Input parameter limit: No more than 64 characters</p> 
     * @return Note <p>Topic remark</p><p>Input parameter limit: No more than 64 characters</p>
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set <p>Topic remark</p><p>Input parameter limit: No more than 64 characters</p>
     * @param Note <p>Topic remark</p><p>Input parameter limit: No more than 64 characters</p>
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get <p>Minimum sync replica count</p><p>Default value: 1</p><p>Minimum value: 1</p> 
     * @return MinInsyncReplicas <p>Minimum sync replica count</p><p>Default value: 1</p><p>Minimum value: 1</p>
     */
    public Long getMinInsyncReplicas() {
        return this.MinInsyncReplicas;
    }

    /**
     * Set <p>Minimum sync replica count</p><p>Default value: 1</p><p>Minimum value: 1</p>
     * @param MinInsyncReplicas <p>Minimum sync replica count</p><p>Default value: 1</p><p>Minimum value: 1</p>
     */
    public void setMinInsyncReplicas(Long MinInsyncReplicas) {
        this.MinInsyncReplicas = MinInsyncReplicas;
    }

    /**
     * Get <p>Whether to allow unsynchronized replicas to be elected as leader, 0: not allowed, 1: allowed, default not allowed</p> 
     * @return UncleanLeaderElectionEnable <p>Whether to allow unsynchronized replicas to be elected as leader, 0: not allowed, 1: allowed, default not allowed</p>
     */
    public Long getUncleanLeaderElectionEnable() {
        return this.UncleanLeaderElectionEnable;
    }

    /**
     * Set <p>Whether to allow unsynchronized replicas to be elected as leader, 0: not allowed, 1: allowed, default not allowed</p>
     * @param UncleanLeaderElectionEnable <p>Whether to allow unsynchronized replicas to be elected as leader, 0: not allowed, 1: allowed, default not allowed</p>
     */
    public void setUncleanLeaderElectionEnable(Long UncleanLeaderElectionEnable) {
        this.UncleanLeaderElectionEnable = UncleanLeaderElectionEnable;
    }

    /**
     * Get <p>Optional parameter, message retention period</p><p>Value ranges from 60000 to 7776000000</p><p>Unit: ms</p><p>Default value: 7200000</p> 
     * @return RetentionMs <p>Optional parameter, message retention period</p><p>Value ranges from 60000 to 7776000000</p><p>Unit: ms</p><p>Default value: 7200000</p>
     */
    public Long getRetentionMs() {
        return this.RetentionMs;
    }

    /**
     * Set <p>Optional parameter, message retention period</p><p>Value ranges from 60000 to 7776000000</p><p>Unit: ms</p><p>Default value: 7200000</p>
     * @param RetentionMs <p>Optional parameter, message retention period</p><p>Value ranges from 60000 to 7776000000</p><p>Unit: ms</p><p>Default value: 7200000</p>
     */
    public void setRetentionMs(Long RetentionMs) {
        this.RetentionMs = RetentionMs;
    }

    /**
     * Get <p>Duration of Segment shard scrolling</p><p>Unit: ms</p><p>Default value: 86400000</p><p>Minimum value: 86400000ms (1 day)</p> 
     * @return SegmentMs <p>Duration of Segment shard scrolling</p><p>Unit: ms</p><p>Default value: 86400000</p><p>Minimum value: 86400000ms (1 day)</p>
     */
    public Long getSegmentMs() {
        return this.SegmentMs;
    }

    /**
     * Set <p>Duration of Segment shard scrolling</p><p>Unit: ms</p><p>Default value: 86400000</p><p>Minimum value: 86400000ms (1 day)</p>
     * @param SegmentMs <p>Duration of Segment shard scrolling</p><p>Unit: ms</p><p>Default value: 86400000</p><p>Minimum value: 86400000ms (1 day)</p>
     */
    public void setSegmentMs(Long SegmentMs) {
        this.SegmentMs = SegmentMs;
    }

    /**
     * Get <p>Maximum topic messages in Bytes, minimum value 1024 Bytes (1 KB), maximum value 12582912 Bytes (12 MB)</p> 
     * @return MaxMessageBytes <p>Maximum topic messages in Bytes, minimum value 1024 Bytes (1 KB), maximum value 12582912 Bytes (12 MB)</p>
     */
    public Long getMaxMessageBytes() {
        return this.MaxMessageBytes;
    }

    /**
     * Set <p>Maximum topic messages in Bytes, minimum value 1024 Bytes (1 KB), maximum value 12582912 Bytes (12 MB)</p>
     * @param MaxMessageBytes <p>Maximum topic messages in Bytes, minimum value 1024 Bytes (1 KB), maximum value 12582912 Bytes (12 MB)</p>
     */
    public void setMaxMessageBytes(Long MaxMessageBytes) {
        this.MaxMessageBytes = MaxMessageBytes;
    }

    /**
     * Get <p>Preset ACL rule, 1: on 0: off, default is off</p> 
     * @return EnableAclRule <p>Preset ACL rule, 1: on 0: off, default is off</p>
     */
    public Long getEnableAclRule() {
        return this.EnableAclRule;
    }

    /**
     * Set <p>Preset ACL rule, 1: on 0: off, default is off</p>
     * @param EnableAclRule <p>Preset ACL rule, 1: on 0: off, default is off</p>
     */
    public void setEnableAclRule(Long EnableAclRule) {
        this.EnableAclRule = EnableAclRule;
    }

    /**
     * Get <p>Preset ACL rule name</p> 
     * @return AclRuleName <p>Preset ACL rule name</p>
     */
    public String getAclRuleName() {
        return this.AclRuleName;
    }

    /**
     * Set <p>Preset ACL rule name</p>
     * @param AclRuleName <p>Preset ACL rule name</p>
     */
    public void setAclRuleName(String AclRuleName) {
        this.AclRuleName = AclRuleName;
    }

    /**
     * Get <p>Option, retain file size. Defaults to -1, unit Byte, current min value is 1073741824.</p><p>Value ranges from [1073741824, 1099511627776]</p><p>Unit: Byte</p><p>Special value: -1 indicates unlimited</p> 
     * @return RetentionBytes <p>Option, retain file size. Defaults to -1, unit Byte, current min value is 1073741824.</p><p>Value ranges from [1073741824, 1099511627776]</p><p>Unit: Byte</p><p>Special value: -1 indicates unlimited</p>
     */
    public Long getRetentionBytes() {
        return this.RetentionBytes;
    }

    /**
     * Set <p>Option, retain file size. Defaults to -1, unit Byte, current min value is 1073741824.</p><p>Value ranges from [1073741824, 1099511627776]</p><p>Unit: Byte</p><p>Special value: -1 indicates unlimited</p>
     * @param RetentionBytes <p>Option, retain file size. Defaults to -1, unit Byte, current min value is 1073741824.</p><p>Value ranges from [1073741824, 1099511627776]</p><p>Unit: Byte</p><p>Special value: -1 indicates unlimited</p>
     */
    public void setRetentionBytes(Long RetentionBytes) {
        this.RetentionBytes = RetentionBytes;
    }

    /**
     * Get <p>Tag list</p> 
     * @return Tags <p>Tag list</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag list</p>
     * @param Tags <p>Tag list</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Time type for message saving: CreateTime/LogAppendTime</p> 
     * @return LogMsgTimestampType <p>Time type for message saving: CreateTime/LogAppendTime</p>
     */
    public String getLogMsgTimestampType() {
        return this.LogMsgTimestampType;
    }

    /**
     * Set <p>Time type for message saving: CreateTime/LogAppendTime</p>
     * @param LogMsgTimestampType <p>Time type for message saving: CreateTime/LogAppendTime</p>
     */
    public void setLogMsgTimestampType(String LogMsgTimestampType) {
        this.LogMsgTimestampType = LogMsgTimestampType;
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
        if (source.LogMsgTimestampType != null) {
            this.LogMsgTimestampType = new String(source.LogMsgTimestampType);
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
        this.setParamSimple(map, prefix + "LogMsgTimestampType", this.LogMsgTimestampType);

    }
}

