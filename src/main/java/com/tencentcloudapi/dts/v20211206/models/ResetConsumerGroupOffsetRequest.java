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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetConsumerGroupOffsetRequest extends AbstractModel {

    /**
    * Subscription instance ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * Subscribed Kafka topic
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Consumer group name. The full name of the actual consumer group is in the form: consumer-grp-#{SubscribeId}-#{ConsumerGroupName}.
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * The partition number of offset needs to be modified.
    */
    @SerializedName("PartitionNos")
    @Expose
    private Long [] PartitionNos;

    /**
    * Reset mode. Valid values: earliest (start consumption from the earliest position); latest (start consumption from the latest position); datetime (start consumption from the most recent checkpoint before the specified time).
    */
    @SerializedName("ResetMode")
    @Expose
    private String ResetMode;

    /**
    * When ResetMode is datetime, this field needs to be filled in, the format is: Y-m-d h:m:s. If not filled in, the default time is 0, and the effect is the same as earliest.
    */
    @SerializedName("ResetDatetime")
    @Expose
    private String ResetDatetime;

    /**
     * Get Subscription instance ID 
     * @return SubscribeId Subscription instance ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set Subscription instance ID
     * @param SubscribeId Subscription instance ID
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get Subscribed Kafka topic 
     * @return TopicName Subscribed Kafka topic
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Subscribed Kafka topic
     * @param TopicName Subscribed Kafka topic
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Consumer group name. The full name of the actual consumer group is in the form: consumer-grp-#{SubscribeId}-#{ConsumerGroupName}. 
     * @return ConsumerGroupName Consumer group name. The full name of the actual consumer group is in the form: consumer-grp-#{SubscribeId}-#{ConsumerGroupName}.
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set Consumer group name. The full name of the actual consumer group is in the form: consumer-grp-#{SubscribeId}-#{ConsumerGroupName}.
     * @param ConsumerGroupName Consumer group name. The full name of the actual consumer group is in the form: consumer-grp-#{SubscribeId}-#{ConsumerGroupName}.
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get The partition number of offset needs to be modified. 
     * @return PartitionNos The partition number of offset needs to be modified.
     */
    public Long [] getPartitionNos() {
        return this.PartitionNos;
    }

    /**
     * Set The partition number of offset needs to be modified.
     * @param PartitionNos The partition number of offset needs to be modified.
     */
    public void setPartitionNos(Long [] PartitionNos) {
        this.PartitionNos = PartitionNos;
    }

    /**
     * Get Reset mode. Valid values: earliest (start consumption from the earliest position); latest (start consumption from the latest position); datetime (start consumption from the most recent checkpoint before the specified time). 
     * @return ResetMode Reset mode. Valid values: earliest (start consumption from the earliest position); latest (start consumption from the latest position); datetime (start consumption from the most recent checkpoint before the specified time).
     */
    public String getResetMode() {
        return this.ResetMode;
    }

    /**
     * Set Reset mode. Valid values: earliest (start consumption from the earliest position); latest (start consumption from the latest position); datetime (start consumption from the most recent checkpoint before the specified time).
     * @param ResetMode Reset mode. Valid values: earliest (start consumption from the earliest position); latest (start consumption from the latest position); datetime (start consumption from the most recent checkpoint before the specified time).
     */
    public void setResetMode(String ResetMode) {
        this.ResetMode = ResetMode;
    }

    /**
     * Get When ResetMode is datetime, this field needs to be filled in, the format is: Y-m-d h:m:s. If not filled in, the default time is 0, and the effect is the same as earliest. 
     * @return ResetDatetime When ResetMode is datetime, this field needs to be filled in, the format is: Y-m-d h:m:s. If not filled in, the default time is 0, and the effect is the same as earliest.
     */
    public String getResetDatetime() {
        return this.ResetDatetime;
    }

    /**
     * Set When ResetMode is datetime, this field needs to be filled in, the format is: Y-m-d h:m:s. If not filled in, the default time is 0, and the effect is the same as earliest.
     * @param ResetDatetime When ResetMode is datetime, this field needs to be filled in, the format is: Y-m-d h:m:s. If not filled in, the default time is 0, and the effect is the same as earliest.
     */
    public void setResetDatetime(String ResetDatetime) {
        this.ResetDatetime = ResetDatetime;
    }

    public ResetConsumerGroupOffsetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetConsumerGroupOffsetRequest(ResetConsumerGroupOffsetRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.ConsumerGroupName != null) {
            this.ConsumerGroupName = new String(source.ConsumerGroupName);
        }
        if (source.PartitionNos != null) {
            this.PartitionNos = new Long[source.PartitionNos.length];
            for (int i = 0; i < source.PartitionNos.length; i++) {
                this.PartitionNos[i] = new Long(source.PartitionNos[i]);
            }
        }
        if (source.ResetMode != null) {
            this.ResetMode = new String(source.ResetMode);
        }
        if (source.ResetDatetime != null) {
            this.ResetDatetime = new String(source.ResetDatetime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "ConsumerGroupName", this.ConsumerGroupName);
        this.setParamArraySimple(map, prefix + "PartitionNos.", this.PartitionNos);
        this.setParamSimple(map, prefix + "ResetMode", this.ResetMode);
        this.setParamSimple(map, prefix + "ResetDatetime", this.ResetDatetime);

    }
}

