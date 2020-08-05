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

    }
}

