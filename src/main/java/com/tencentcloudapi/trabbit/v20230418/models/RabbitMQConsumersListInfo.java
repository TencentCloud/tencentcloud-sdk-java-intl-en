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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQConsumersListInfo extends AbstractModel {

    /**
    * Client Ip.
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * Consumer Tag.
    */
    @SerializedName("ConsumerTag")
    @Expose
    private String ConsumerTag;

    /**
    * Consume target queue
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Whether required for the consumer to manually ack
    */
    @SerializedName("AckRequired")
    @Expose
    private Boolean AckRequired;

    /**
    * Consumer qos value
    */
    @SerializedName("PrefetchCount")
    @Expose
    private Long PrefetchCount;

    /**
    * Consumer status
    */
    @SerializedName("Active")
    @Expose
    private String Active;

    /**
    * Time of the last message submission
    */
    @SerializedName("LastDeliveredTime")
    @Expose
    private String LastDeliveredTime;

    /**
    * Number of unconfirmed messages of the consumer
    */
    @SerializedName("UnAckMsgCount")
    @Expose
    private Long UnAckMsgCount;

    /**
    * channel belonging to the consumer
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
     * Get Client Ip. 
     * @return ClientIp Client Ip.
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set Client Ip.
     * @param ClientIp Client Ip.
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get Consumer Tag. 
     * @return ConsumerTag Consumer Tag.
     */
    public String getConsumerTag() {
        return this.ConsumerTag;
    }

    /**
     * Set Consumer Tag.
     * @param ConsumerTag Consumer Tag.
     */
    public void setConsumerTag(String ConsumerTag) {
        this.ConsumerTag = ConsumerTag;
    }

    /**
     * Get Consume target queue 
     * @return QueueName Consume target queue
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set Consume target queue
     * @param QueueName Consume target queue
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get Whether required for the consumer to manually ack 
     * @return AckRequired Whether required for the consumer to manually ack
     */
    public Boolean getAckRequired() {
        return this.AckRequired;
    }

    /**
     * Set Whether required for the consumer to manually ack
     * @param AckRequired Whether required for the consumer to manually ack
     */
    public void setAckRequired(Boolean AckRequired) {
        this.AckRequired = AckRequired;
    }

    /**
     * Get Consumer qos value 
     * @return PrefetchCount Consumer qos value
     */
    public Long getPrefetchCount() {
        return this.PrefetchCount;
    }

    /**
     * Set Consumer qos value
     * @param PrefetchCount Consumer qos value
     */
    public void setPrefetchCount(Long PrefetchCount) {
        this.PrefetchCount = PrefetchCount;
    }

    /**
     * Get Consumer status 
     * @return Active Consumer status
     */
    public String getActive() {
        return this.Active;
    }

    /**
     * Set Consumer status
     * @param Active Consumer status
     */
    public void setActive(String Active) {
        this.Active = Active;
    }

    /**
     * Get Time of the last message submission 
     * @return LastDeliveredTime Time of the last message submission
     */
    public String getLastDeliveredTime() {
        return this.LastDeliveredTime;
    }

    /**
     * Set Time of the last message submission
     * @param LastDeliveredTime Time of the last message submission
     */
    public void setLastDeliveredTime(String LastDeliveredTime) {
        this.LastDeliveredTime = LastDeliveredTime;
    }

    /**
     * Get Number of unconfirmed messages of the consumer 
     * @return UnAckMsgCount Number of unconfirmed messages of the consumer
     */
    public Long getUnAckMsgCount() {
        return this.UnAckMsgCount;
    }

    /**
     * Set Number of unconfirmed messages of the consumer
     * @param UnAckMsgCount Number of unconfirmed messages of the consumer
     */
    public void setUnAckMsgCount(Long UnAckMsgCount) {
        this.UnAckMsgCount = UnAckMsgCount;
    }

    /**
     * Get channel belonging to the consumer 
     * @return ChannelName channel belonging to the consumer
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set channel belonging to the consumer
     * @param ChannelName channel belonging to the consumer
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    public RabbitMQConsumersListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQConsumersListInfo(RabbitMQConsumersListInfo source) {
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.ConsumerTag != null) {
            this.ConsumerTag = new String(source.ConsumerTag);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.AckRequired != null) {
            this.AckRequired = new Boolean(source.AckRequired);
        }
        if (source.PrefetchCount != null) {
            this.PrefetchCount = new Long(source.PrefetchCount);
        }
        if (source.Active != null) {
            this.Active = new String(source.Active);
        }
        if (source.LastDeliveredTime != null) {
            this.LastDeliveredTime = new String(source.LastDeliveredTime);
        }
        if (source.UnAckMsgCount != null) {
            this.UnAckMsgCount = new Long(source.UnAckMsgCount);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "ConsumerTag", this.ConsumerTag);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "AckRequired", this.AckRequired);
        this.setParamSimple(map, prefix + "PrefetchCount", this.PrefetchCount);
        this.setParamSimple(map, prefix + "Active", this.Active);
        this.setParamSimple(map, prefix + "LastDeliveredTime", this.LastDeliveredTime);
        this.setParamSimple(map, prefix + "UnAckMsgCount", this.UnAckMsgCount);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);

    }
}

