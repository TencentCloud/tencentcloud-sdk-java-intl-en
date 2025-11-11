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

public class SubscribedInfo extends AbstractModel {

    /**
    * Subscribed topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Specifies the subscription partition.
    */
    @SerializedName("Partition")
    @Expose
    private Long [] Partition;

    /**
    * Specifies the partition offset information.
    */
    @SerializedName("PartitionOffset")
    @Expose
    private PartitionOffset [] PartitionOffset;

    /**
    * Subscribed topic ID.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
     * Get Subscribed topic name 
     * @return TopicName Subscribed topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Subscribed topic name
     * @param TopicName Subscribed topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Specifies the subscription partition. 
     * @return Partition Specifies the subscription partition.
     */
    public Long [] getPartition() {
        return this.Partition;
    }

    /**
     * Set Specifies the subscription partition.
     * @param Partition Specifies the subscription partition.
     */
    public void setPartition(Long [] Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Specifies the partition offset information. 
     * @return PartitionOffset Specifies the partition offset information.
     */
    public PartitionOffset [] getPartitionOffset() {
        return this.PartitionOffset;
    }

    /**
     * Set Specifies the partition offset information.
     * @param PartitionOffset Specifies the partition offset information.
     */
    public void setPartitionOffset(PartitionOffset [] PartitionOffset) {
        this.PartitionOffset = PartitionOffset;
    }

    /**
     * Get Subscribed topic ID. 
     * @return TopicId Subscribed topic ID.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Subscribed topic ID.
     * @param TopicId Subscribed topic ID.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    public SubscribedInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribedInfo(SubscribedInfo source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Partition != null) {
            this.Partition = new Long[source.Partition.length];
            for (int i = 0; i < source.Partition.length; i++) {
                this.Partition[i] = new Long(source.Partition[i]);
            }
        }
        if (source.PartitionOffset != null) {
            this.PartitionOffset = new PartitionOffset[source.PartitionOffset.length];
            for (int i = 0; i < source.PartitionOffset.length; i++) {
                this.PartitionOffset[i] = new PartitionOffset(source.PartitionOffset[i]);
            }
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamArraySimple(map, prefix + "Partition.", this.Partition);
        this.setParamArrayObj(map, prefix + "PartitionOffset.", this.PartitionOffset);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);

    }
}

