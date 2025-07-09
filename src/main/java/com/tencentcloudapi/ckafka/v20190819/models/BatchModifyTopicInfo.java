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

public class BatchModifyTopicInfo extends AbstractModel {

    /**
    * Topic name.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * The number of partitions.
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * Remarks.
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * Number of replicas.
    */
    @SerializedName("ReplicaNum")
    @Expose
    private Long ReplicaNum;

    /**
    * Message deletion policy. Valid values: `delete`, `compact`.
    */
    @SerializedName("CleanUpPolicy")
    @Expose
    private String CleanUpPolicy;

    /**
    * The minimum number of replicas specified by `min.insync.replicas` when the producer sets `request.required.acks` to `-1`.
    */
    @SerializedName("MinInsyncReplicas")
    @Expose
    private Long MinInsyncReplicas;

    /**
    * Whether to allow a non-ISR replica to be the leader.
    */
    @SerializedName("UncleanLeaderElectionEnable")
    @Expose
    private Boolean UncleanLeaderElectionEnable;

    /**
    * Message retention period in topic dimension in milliseconds. Value range: 1 minute to 90 days.
    */
    @SerializedName("RetentionMs")
    @Expose
    private Long RetentionMs;

    /**
    * Message retention size in topic dimension. Value range: 1 MB - 1024 GB.
    */
    @SerializedName("RetentionBytes")
    @Expose
    private Long RetentionBytes;

    /**
    * Segment rolling duration in milliseconds. Value range: 1-90 days.
    */
    @SerializedName("SegmentMs")
    @Expose
    private Long SegmentMs;

    /**
    * Message size per batch. Value range: 1 KB - 12 MB.
    */
    @SerializedName("MaxMessageBytes")
    @Expose
    private Long MaxMessageBytes;

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
     * Get The number of partitions. 
     * @return PartitionNum The number of partitions.
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set The number of partitions.
     * @param PartitionNum The number of partitions.
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get Remarks. 
     * @return Note Remarks.
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Remarks.
     * @param Note Remarks.
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get Number of replicas. 
     * @return ReplicaNum Number of replicas.
     */
    public Long getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set Number of replicas.
     * @param ReplicaNum Number of replicas.
     */
    public void setReplicaNum(Long ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    /**
     * Get Message deletion policy. Valid values: `delete`, `compact`. 
     * @return CleanUpPolicy Message deletion policy. Valid values: `delete`, `compact`.
     */
    public String getCleanUpPolicy() {
        return this.CleanUpPolicy;
    }

    /**
     * Set Message deletion policy. Valid values: `delete`, `compact`.
     * @param CleanUpPolicy Message deletion policy. Valid values: `delete`, `compact`.
     */
    public void setCleanUpPolicy(String CleanUpPolicy) {
        this.CleanUpPolicy = CleanUpPolicy;
    }

    /**
     * Get The minimum number of replicas specified by `min.insync.replicas` when the producer sets `request.required.acks` to `-1`. 
     * @return MinInsyncReplicas The minimum number of replicas specified by `min.insync.replicas` when the producer sets `request.required.acks` to `-1`.
     */
    public Long getMinInsyncReplicas() {
        return this.MinInsyncReplicas;
    }

    /**
     * Set The minimum number of replicas specified by `min.insync.replicas` when the producer sets `request.required.acks` to `-1`.
     * @param MinInsyncReplicas The minimum number of replicas specified by `min.insync.replicas` when the producer sets `request.required.acks` to `-1`.
     */
    public void setMinInsyncReplicas(Long MinInsyncReplicas) {
        this.MinInsyncReplicas = MinInsyncReplicas;
    }

    /**
     * Get Whether to allow a non-ISR replica to be the leader. 
     * @return UncleanLeaderElectionEnable Whether to allow a non-ISR replica to be the leader.
     */
    public Boolean getUncleanLeaderElectionEnable() {
        return this.UncleanLeaderElectionEnable;
    }

    /**
     * Set Whether to allow a non-ISR replica to be the leader.
     * @param UncleanLeaderElectionEnable Whether to allow a non-ISR replica to be the leader.
     */
    public void setUncleanLeaderElectionEnable(Boolean UncleanLeaderElectionEnable) {
        this.UncleanLeaderElectionEnable = UncleanLeaderElectionEnable;
    }

    /**
     * Get Message retention period in topic dimension in milliseconds. Value range: 1 minute to 90 days. 
     * @return RetentionMs Message retention period in topic dimension in milliseconds. Value range: 1 minute to 90 days.
     */
    public Long getRetentionMs() {
        return this.RetentionMs;
    }

    /**
     * Set Message retention period in topic dimension in milliseconds. Value range: 1 minute to 90 days.
     * @param RetentionMs Message retention period in topic dimension in milliseconds. Value range: 1 minute to 90 days.
     */
    public void setRetentionMs(Long RetentionMs) {
        this.RetentionMs = RetentionMs;
    }

    /**
     * Get Message retention size in topic dimension. Value range: 1 MB - 1024 GB. 
     * @return RetentionBytes Message retention size in topic dimension. Value range: 1 MB - 1024 GB.
     */
    public Long getRetentionBytes() {
        return this.RetentionBytes;
    }

    /**
     * Set Message retention size in topic dimension. Value range: 1 MB - 1024 GB.
     * @param RetentionBytes Message retention size in topic dimension. Value range: 1 MB - 1024 GB.
     */
    public void setRetentionBytes(Long RetentionBytes) {
        this.RetentionBytes = RetentionBytes;
    }

    /**
     * Get Segment rolling duration in milliseconds. Value range: 1-90 days. 
     * @return SegmentMs Segment rolling duration in milliseconds. Value range: 1-90 days.
     */
    public Long getSegmentMs() {
        return this.SegmentMs;
    }

    /**
     * Set Segment rolling duration in milliseconds. Value range: 1-90 days.
     * @param SegmentMs Segment rolling duration in milliseconds. Value range: 1-90 days.
     */
    public void setSegmentMs(Long SegmentMs) {
        this.SegmentMs = SegmentMs;
    }

    /**
     * Get Message size per batch. Value range: 1 KB - 12 MB. 
     * @return MaxMessageBytes Message size per batch. Value range: 1 KB - 12 MB.
     */
    public Long getMaxMessageBytes() {
        return this.MaxMessageBytes;
    }

    /**
     * Set Message size per batch. Value range: 1 KB - 12 MB.
     * @param MaxMessageBytes Message size per batch. Value range: 1 KB - 12 MB.
     */
    public void setMaxMessageBytes(Long MaxMessageBytes) {
        this.MaxMessageBytes = MaxMessageBytes;
    }

    public BatchModifyTopicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyTopicInfo(BatchModifyTopicInfo source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.ReplicaNum != null) {
            this.ReplicaNum = new Long(source.ReplicaNum);
        }
        if (source.CleanUpPolicy != null) {
            this.CleanUpPolicy = new String(source.CleanUpPolicy);
        }
        if (source.MinInsyncReplicas != null) {
            this.MinInsyncReplicas = new Long(source.MinInsyncReplicas);
        }
        if (source.UncleanLeaderElectionEnable != null) {
            this.UncleanLeaderElectionEnable = new Boolean(source.UncleanLeaderElectionEnable);
        }
        if (source.RetentionMs != null) {
            this.RetentionMs = new Long(source.RetentionMs);
        }
        if (source.RetentionBytes != null) {
            this.RetentionBytes = new Long(source.RetentionBytes);
        }
        if (source.SegmentMs != null) {
            this.SegmentMs = new Long(source.SegmentMs);
        }
        if (source.MaxMessageBytes != null) {
            this.MaxMessageBytes = new Long(source.MaxMessageBytes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "ReplicaNum", this.ReplicaNum);
        this.setParamSimple(map, prefix + "CleanUpPolicy", this.CleanUpPolicy);
        this.setParamSimple(map, prefix + "MinInsyncReplicas", this.MinInsyncReplicas);
        this.setParamSimple(map, prefix + "UncleanLeaderElectionEnable", this.UncleanLeaderElectionEnable);
        this.setParamSimple(map, prefix + "RetentionMs", this.RetentionMs);
        this.setParamSimple(map, prefix + "RetentionBytes", this.RetentionBytes);
        this.setParamSimple(map, prefix + "SegmentMs", this.SegmentMs);
        this.setParamSimple(map, prefix + "MaxMessageBytes", this.MaxMessageBytes);

    }
}

