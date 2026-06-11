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

public class CommitConsumerOffsetsRequest extends AbstractModel {

    /**
    * Consumer group flag.
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * Consumption machine name.
    */
    @SerializedName("Consumer")
    @Expose
    private String Consumer;

    /**
    * Logset id
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Topic partition offset information.
    */
    @SerializedName("TopicPartitionOffsetsInfo")
    @Expose
    private TopicPartitionOffsetInfo [] TopicPartitionOffsetsInfo;

    /**
     * Get Consumer group flag. 
     * @return ConsumerGroup Consumer group flag.
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set Consumer group flag.
     * @param ConsumerGroup Consumer group flag.
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get Consumption machine name. 
     * @return Consumer Consumption machine name.
     */
    public String getConsumer() {
        return this.Consumer;
    }

    /**
     * Set Consumption machine name.
     * @param Consumer Consumption machine name.
     */
    public void setConsumer(String Consumer) {
        this.Consumer = Consumer;
    }

    /**
     * Get Logset id 
     * @return LogsetId Logset id
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset id
     * @param LogsetId Logset id
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Topic partition offset information. 
     * @return TopicPartitionOffsetsInfo Topic partition offset information.
     */
    public TopicPartitionOffsetInfo [] getTopicPartitionOffsetsInfo() {
        return this.TopicPartitionOffsetsInfo;
    }

    /**
     * Set Topic partition offset information.
     * @param TopicPartitionOffsetsInfo Topic partition offset information.
     */
    public void setTopicPartitionOffsetsInfo(TopicPartitionOffsetInfo [] TopicPartitionOffsetsInfo) {
        this.TopicPartitionOffsetsInfo = TopicPartitionOffsetsInfo;
    }

    public CommitConsumerOffsetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommitConsumerOffsetsRequest(CommitConsumerOffsetsRequest source) {
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.Consumer != null) {
            this.Consumer = new String(source.Consumer);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicPartitionOffsetsInfo != null) {
            this.TopicPartitionOffsetsInfo = new TopicPartitionOffsetInfo[source.TopicPartitionOffsetsInfo.length];
            for (int i = 0; i < source.TopicPartitionOffsetsInfo.length; i++) {
                this.TopicPartitionOffsetsInfo[i] = new TopicPartitionOffsetInfo(source.TopicPartitionOffsetsInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "Consumer", this.Consumer);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamArrayObj(map, prefix + "TopicPartitionOffsetsInfo.", this.TopicPartitionOffsetsInfo);

    }
}

