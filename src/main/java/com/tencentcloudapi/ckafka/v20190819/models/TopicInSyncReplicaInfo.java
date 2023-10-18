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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicInSyncReplicaInfo extends AbstractModel {

    /**
    * Partition name
    */
    @SerializedName("Partition")
    @Expose
    private String Partition;

    /**
    * Leader ID
    */
    @SerializedName("Leader")
    @Expose
    private Long Leader;

    /**
    * Replica set
    */
    @SerializedName("Replica")
    @Expose
    private String Replica;

    /**
    * ISR
    */
    @SerializedName("InSyncReplica")
    @Expose
    private String InSyncReplica;

    /**
    * Starting offset
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BeginOffset")
    @Expose
    private Long BeginOffset;

    /**
    * Ending offset
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndOffset")
    @Expose
    private Long EndOffset;

    /**
    * Number of messages
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MessageCount")
    @Expose
    private Long MessageCount;

    /**
    * Unsynced replica set
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutOfSyncReplica")
    @Expose
    private String OutOfSyncReplica;

    /**
     * Get Partition name 
     * @return Partition Partition name
     */
    public String getPartition() {
        return this.Partition;
    }

    /**
     * Set Partition name
     * @param Partition Partition name
     */
    public void setPartition(String Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Leader ID 
     * @return Leader Leader ID
     */
    public Long getLeader() {
        return this.Leader;
    }

    /**
     * Set Leader ID
     * @param Leader Leader ID
     */
    public void setLeader(Long Leader) {
        this.Leader = Leader;
    }

    /**
     * Get Replica set 
     * @return Replica Replica set
     */
    public String getReplica() {
        return this.Replica;
    }

    /**
     * Set Replica set
     * @param Replica Replica set
     */
    public void setReplica(String Replica) {
        this.Replica = Replica;
    }

    /**
     * Get ISR 
     * @return InSyncReplica ISR
     */
    public String getInSyncReplica() {
        return this.InSyncReplica;
    }

    /**
     * Set ISR
     * @param InSyncReplica ISR
     */
    public void setInSyncReplica(String InSyncReplica) {
        this.InSyncReplica = InSyncReplica;
    }

    /**
     * Get Starting offset
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BeginOffset Starting offset
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getBeginOffset() {
        return this.BeginOffset;
    }

    /**
     * Set Starting offset
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BeginOffset Starting offset
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBeginOffset(Long BeginOffset) {
        this.BeginOffset = BeginOffset;
    }

    /**
     * Get Ending offset
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EndOffset Ending offset
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getEndOffset() {
        return this.EndOffset;
    }

    /**
     * Set Ending offset
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EndOffset Ending offset
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEndOffset(Long EndOffset) {
        this.EndOffset = EndOffset;
    }

    /**
     * Get Number of messages
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MessageCount Number of messages
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMessageCount() {
        return this.MessageCount;
    }

    /**
     * Set Number of messages
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MessageCount Number of messages
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMessageCount(Long MessageCount) {
        this.MessageCount = MessageCount;
    }

    /**
     * Get Unsynced replica set
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OutOfSyncReplica Unsynced replica set
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOutOfSyncReplica() {
        return this.OutOfSyncReplica;
    }

    /**
     * Set Unsynced replica set
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OutOfSyncReplica Unsynced replica set
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOutOfSyncReplica(String OutOfSyncReplica) {
        this.OutOfSyncReplica = OutOfSyncReplica;
    }

    public TopicInSyncReplicaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicInSyncReplicaInfo(TopicInSyncReplicaInfo source) {
        if (source.Partition != null) {
            this.Partition = new String(source.Partition);
        }
        if (source.Leader != null) {
            this.Leader = new Long(source.Leader);
        }
        if (source.Replica != null) {
            this.Replica = new String(source.Replica);
        }
        if (source.InSyncReplica != null) {
            this.InSyncReplica = new String(source.InSyncReplica);
        }
        if (source.BeginOffset != null) {
            this.BeginOffset = new Long(source.BeginOffset);
        }
        if (source.EndOffset != null) {
            this.EndOffset = new Long(source.EndOffset);
        }
        if (source.MessageCount != null) {
            this.MessageCount = new Long(source.MessageCount);
        }
        if (source.OutOfSyncReplica != null) {
            this.OutOfSyncReplica = new String(source.OutOfSyncReplica);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Leader", this.Leader);
        this.setParamSimple(map, prefix + "Replica", this.Replica);
        this.setParamSimple(map, prefix + "InSyncReplica", this.InSyncReplica);
        this.setParamSimple(map, prefix + "BeginOffset", this.BeginOffset);
        this.setParamSimple(map, prefix + "EndOffset", this.EndOffset);
        this.setParamSimple(map, prefix + "MessageCount", this.MessageCount);
        this.setParamSimple(map, prefix + "OutOfSyncReplica", this.OutOfSyncReplica);

    }
}

