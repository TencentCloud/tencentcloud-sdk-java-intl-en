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

public class ModifyTopicAttributesRequest extends AbstractModel{

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Topic name.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Topic remarks string of up to 64 characters, which must begin with a letter and can contain letters, digits, and dashes (`-`).
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * IP allowlist switch. 1: enabled, 0: disabled.
    */
    @SerializedName("EnableWhiteList")
    @Expose
    private Long EnableWhiteList;

    /**
    * Default value: 1.
    */
    @SerializedName("MinInsyncReplicas")
    @Expose
    private Long MinInsyncReplicas;

    /**
    * 0: false, 1: true. Default value: 0.
    */
    @SerializedName("UncleanLeaderElectionEnable")
    @Expose
    private Long UncleanLeaderElectionEnable;

    /**
    * Message retention period in ms. The current minimum value is 60,000 ms.
    */
    @SerializedName("RetentionMs")
    @Expose
    private Long RetentionMs;

    /**
    * Segment rolling duration in ms. The current minimum value is 86,400,000 ms.
    */
    @SerializedName("SegmentMs")
    @Expose
    private Long SegmentMs;

    /**
    * Maximum topic message length in bytes. The maximum value is 8,388,608 bytes (i.e., 8 MB).
    */
    @SerializedName("MaxMessageBytes")
    @Expose
    private Long MaxMessageBytes;

    /**
    * Message deletion policy. Valid values: delete, compact
    */
    @SerializedName("CleanUpPolicy")
    @Expose
    private String CleanUpPolicy;

    /**
    * IP allowlist, which is required if the value of `enableWhileList` is 1.
    */
    @SerializedName("IpWhiteList")
    @Expose
    private String [] IpWhiteList;

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
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Topic name. 
     * @return TopicName Topic name.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name.
     * @param TopicName Topic name.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Topic remarks string of up to 64 characters, which must begin with a letter and can contain letters, digits, and dashes (`-`). 
     * @return Note Topic remarks string of up to 64 characters, which must begin with a letter and can contain letters, digits, and dashes (`-`).
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Topic remarks string of up to 64 characters, which must begin with a letter and can contain letters, digits, and dashes (`-`).
     * @param Note Topic remarks string of up to 64 characters, which must begin with a letter and can contain letters, digits, and dashes (`-`).
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get IP allowlist switch. 1: enabled, 0: disabled. 
     * @return EnableWhiteList IP allowlist switch. 1: enabled, 0: disabled.
     */
    public Long getEnableWhiteList() {
        return this.EnableWhiteList;
    }

    /**
     * Set IP allowlist switch. 1: enabled, 0: disabled.
     * @param EnableWhiteList IP allowlist switch. 1: enabled, 0: disabled.
     */
    public void setEnableWhiteList(Long EnableWhiteList) {
        this.EnableWhiteList = EnableWhiteList;
    }

    /**
     * Get Default value: 1. 
     * @return MinInsyncReplicas Default value: 1.
     */
    public Long getMinInsyncReplicas() {
        return this.MinInsyncReplicas;
    }

    /**
     * Set Default value: 1.
     * @param MinInsyncReplicas Default value: 1.
     */
    public void setMinInsyncReplicas(Long MinInsyncReplicas) {
        this.MinInsyncReplicas = MinInsyncReplicas;
    }

    /**
     * Get 0: false, 1: true. Default value: 0. 
     * @return UncleanLeaderElectionEnable 0: false, 1: true. Default value: 0.
     */
    public Long getUncleanLeaderElectionEnable() {
        return this.UncleanLeaderElectionEnable;
    }

    /**
     * Set 0: false, 1: true. Default value: 0.
     * @param UncleanLeaderElectionEnable 0: false, 1: true. Default value: 0.
     */
    public void setUncleanLeaderElectionEnable(Long UncleanLeaderElectionEnable) {
        this.UncleanLeaderElectionEnable = UncleanLeaderElectionEnable;
    }

    /**
     * Get Message retention period in ms. The current minimum value is 60,000 ms. 
     * @return RetentionMs Message retention period in ms. The current minimum value is 60,000 ms.
     */
    public Long getRetentionMs() {
        return this.RetentionMs;
    }

    /**
     * Set Message retention period in ms. The current minimum value is 60,000 ms.
     * @param RetentionMs Message retention period in ms. The current minimum value is 60,000 ms.
     */
    public void setRetentionMs(Long RetentionMs) {
        this.RetentionMs = RetentionMs;
    }

    /**
     * Get Segment rolling duration in ms. The current minimum value is 86,400,000 ms. 
     * @return SegmentMs Segment rolling duration in ms. The current minimum value is 86,400,000 ms.
     */
    public Long getSegmentMs() {
        return this.SegmentMs;
    }

    /**
     * Set Segment rolling duration in ms. The current minimum value is 86,400,000 ms.
     * @param SegmentMs Segment rolling duration in ms. The current minimum value is 86,400,000 ms.
     */
    public void setSegmentMs(Long SegmentMs) {
        this.SegmentMs = SegmentMs;
    }

    /**
     * Get Maximum topic message length in bytes. The maximum value is 8,388,608 bytes (i.e., 8 MB). 
     * @return MaxMessageBytes Maximum topic message length in bytes. The maximum value is 8,388,608 bytes (i.e., 8 MB).
     */
    public Long getMaxMessageBytes() {
        return this.MaxMessageBytes;
    }

    /**
     * Set Maximum topic message length in bytes. The maximum value is 8,388,608 bytes (i.e., 8 MB).
     * @param MaxMessageBytes Maximum topic message length in bytes. The maximum value is 8,388,608 bytes (i.e., 8 MB).
     */
    public void setMaxMessageBytes(Long MaxMessageBytes) {
        this.MaxMessageBytes = MaxMessageBytes;
    }

    /**
     * Get Message deletion policy. Valid values: delete, compact 
     * @return CleanUpPolicy Message deletion policy. Valid values: delete, compact
     */
    public String getCleanUpPolicy() {
        return this.CleanUpPolicy;
    }

    /**
     * Set Message deletion policy. Valid values: delete, compact
     * @param CleanUpPolicy Message deletion policy. Valid values: delete, compact
     */
    public void setCleanUpPolicy(String CleanUpPolicy) {
        this.CleanUpPolicy = CleanUpPolicy;
    }

    /**
     * Get IP allowlist, which is required if the value of `enableWhileList` is 1. 
     * @return IpWhiteList IP allowlist, which is required if the value of `enableWhileList` is 1.
     */
    public String [] getIpWhiteList() {
        return this.IpWhiteList;
    }

    /**
     * Set IP allowlist, which is required if the value of `enableWhileList` is 1.
     * @param IpWhiteList IP allowlist, which is required if the value of `enableWhileList` is 1.
     */
    public void setIpWhiteList(String [] IpWhiteList) {
        this.IpWhiteList = IpWhiteList;
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

    public ModifyTopicAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTopicAttributesRequest(ModifyTopicAttributesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.EnableWhiteList != null) {
            this.EnableWhiteList = new Long(source.EnableWhiteList);
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
        if (source.CleanUpPolicy != null) {
            this.CleanUpPolicy = new String(source.CleanUpPolicy);
        }
        if (source.IpWhiteList != null) {
            this.IpWhiteList = new String[source.IpWhiteList.length];
            for (int i = 0; i < source.IpWhiteList.length; i++) {
                this.IpWhiteList[i] = new String(source.IpWhiteList[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "EnableWhiteList", this.EnableWhiteList);
        this.setParamSimple(map, prefix + "MinInsyncReplicas", this.MinInsyncReplicas);
        this.setParamSimple(map, prefix + "UncleanLeaderElectionEnable", this.UncleanLeaderElectionEnable);
        this.setParamSimple(map, prefix + "RetentionMs", this.RetentionMs);
        this.setParamSimple(map, prefix + "SegmentMs", this.SegmentMs);
        this.setParamSimple(map, prefix + "MaxMessageBytes", this.MaxMessageBytes);
        this.setParamSimple(map, prefix + "CleanUpPolicy", this.CleanUpPolicy);
        this.setParamArraySimple(map, prefix + "IpWhiteList.", this.IpWhiteList);
        this.setParamSimple(map, prefix + "EnableAclRule", this.EnableAclRule);
        this.setParamSimple(map, prefix + "AclRuleName", this.AclRuleName);
        this.setParamSimple(map, prefix + "RetentionBytes", this.RetentionBytes);

    }
}

