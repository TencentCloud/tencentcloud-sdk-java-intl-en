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

public class GroupPartitionInfo extends AbstractModel {

    /**
    * Partition ID
    */
    @SerializedName("PartitionId")
    @Expose
    private Long PartitionId;

    /**
    * Latest data timestamp of the partition, unit: s
    */
    @SerializedName("CommitTimestamp")
    @Expose
    private Long CommitTimestamp;

    /**
    * consumer
    */
    @SerializedName("Consumer")
    @Expose
    private String Consumer;

    /**
     * Get Partition ID 
     * @return PartitionId Partition ID
     */
    public Long getPartitionId() {
        return this.PartitionId;
    }

    /**
     * Set Partition ID
     * @param PartitionId Partition ID
     */
    public void setPartitionId(Long PartitionId) {
        this.PartitionId = PartitionId;
    }

    /**
     * Get Latest data timestamp of the partition, unit: s 
     * @return CommitTimestamp Latest data timestamp of the partition, unit: s
     */
    public Long getCommitTimestamp() {
        return this.CommitTimestamp;
    }

    /**
     * Set Latest data timestamp of the partition, unit: s
     * @param CommitTimestamp Latest data timestamp of the partition, unit: s
     */
    public void setCommitTimestamp(Long CommitTimestamp) {
        this.CommitTimestamp = CommitTimestamp;
    }

    /**
     * Get consumer 
     * @return Consumer consumer
     */
    public String getConsumer() {
        return this.Consumer;
    }

    /**
     * Set consumer
     * @param Consumer consumer
     */
    public void setConsumer(String Consumer) {
        this.Consumer = Consumer;
    }

    public GroupPartitionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupPartitionInfo(GroupPartitionInfo source) {
        if (source.PartitionId != null) {
            this.PartitionId = new Long(source.PartitionId);
        }
        if (source.CommitTimestamp != null) {
            this.CommitTimestamp = new Long(source.CommitTimestamp);
        }
        if (source.Consumer != null) {
            this.Consumer = new String(source.Consumer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionId", this.PartitionId);
        this.setParamSimple(map, prefix + "CommitTimestamp", this.CommitTimestamp);
        this.setParamSimple(map, prefix + "Consumer", this.Consumer);

    }
}

