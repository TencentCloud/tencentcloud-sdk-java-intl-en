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

public class SendConsumerHeartbeatRequest extends AbstractModel {

    /**
    * Flag of the consumer group that reports the heartbeat.
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * Consumer name for reporting heartbeat
(alphanumeric underscore, no numbers or _ at the beginning, length less than 256)
    */
    @SerializedName("Consumer")
    @Expose
    private String Consumer;

    /**
    * Logset ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Topic partition information.
    */
    @SerializedName("TopicPartitionsInfo")
    @Expose
    private TopicPartitionInfo [] TopicPartitionsInfo;

    /**
     * Get Flag of the consumer group that reports the heartbeat. 
     * @return ConsumerGroup Flag of the consumer group that reports the heartbeat.
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set Flag of the consumer group that reports the heartbeat.
     * @param ConsumerGroup Flag of the consumer group that reports the heartbeat.
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get Consumer name for reporting heartbeat
(alphanumeric underscore, no numbers or _ at the beginning, length less than 256) 
     * @return Consumer Consumer name for reporting heartbeat
(alphanumeric underscore, no numbers or _ at the beginning, length less than 256)
     */
    public String getConsumer() {
        return this.Consumer;
    }

    /**
     * Set Consumer name for reporting heartbeat
(alphanumeric underscore, no numbers or _ at the beginning, length less than 256)
     * @param Consumer Consumer name for reporting heartbeat
(alphanumeric underscore, no numbers or _ at the beginning, length less than 256)
     */
    public void setConsumer(String Consumer) {
        this.Consumer = Consumer;
    }

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
     * Get Topic partition information. 
     * @return TopicPartitionsInfo Topic partition information.
     */
    public TopicPartitionInfo [] getTopicPartitionsInfo() {
        return this.TopicPartitionsInfo;
    }

    /**
     * Set Topic partition information.
     * @param TopicPartitionsInfo Topic partition information.
     */
    public void setTopicPartitionsInfo(TopicPartitionInfo [] TopicPartitionsInfo) {
        this.TopicPartitionsInfo = TopicPartitionsInfo;
    }

    public SendConsumerHeartbeatRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendConsumerHeartbeatRequest(SendConsumerHeartbeatRequest source) {
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.Consumer != null) {
            this.Consumer = new String(source.Consumer);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicPartitionsInfo != null) {
            this.TopicPartitionsInfo = new TopicPartitionInfo[source.TopicPartitionsInfo.length];
            for (int i = 0; i < source.TopicPartitionsInfo.length; i++) {
                this.TopicPartitionsInfo[i] = new TopicPartitionInfo(source.TopicPartitionsInfo[i]);
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
        this.setParamArrayObj(map, prefix + "TopicPartitionsInfo.", this.TopicPartitionsInfo);

    }
}

