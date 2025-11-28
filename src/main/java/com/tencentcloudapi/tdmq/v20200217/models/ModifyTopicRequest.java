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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTopicRequest extends AbstractModel {

    /**
    * Environment (namespace) name.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Topic name.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Specifies the number of partitions, which must be greater than or equal to the original partition count. if you want to maintain the original number of partitions, please enter the original number. changing the number of partitions is only effective for non-global sequential messages and cannot exceed 32 partitions.
    */
    @SerializedName("Partitions")
    @Expose
    private Long Partitions;

    /**
    * Pulsar cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Remarks (up to 128 characters).
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Unconsumed message expiration time. measurement unit: seconds. value range: 60 seconds to 15 days.

    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
    * Default if not passed is native policy. DefaultPolicy means when the subscription reaches the maximum unacknowledged messages of 5000, the server will stop pushing messages to all consumers under the current subscription. DynamicPolicy refers to dynamically adjusting the maximum unacknowledged messages under the subscription, with the specific quota being the maximum between 5000 and the number of consumers multiplied by 20. the default maximum unacknowledged message count per consumer is 20. exceeding this limit only affects that consumer and does not affect other consumers.
    */
    @SerializedName("UnackPolicy")
    @Expose
    private String UnackPolicy;

    /**
    * Whether exception consumer isolation is enabled.
    */
    @SerializedName("IsolateConsumerEnable")
    @Expose
    private Boolean IsolateConsumerEnable;

    /**
    * Consumer Ack timeout period in seconds. value range: 60-(3600*24).
    */
    @SerializedName("AckTimeOut")
    @Expose
    private Long AckTimeOut;

    /**
     * Get Environment (namespace) name. 
     * @return EnvironmentId Environment (namespace) name.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment (namespace) name.
     * @param EnvironmentId Environment (namespace) name.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
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
     * Get Specifies the number of partitions, which must be greater than or equal to the original partition count. if you want to maintain the original number of partitions, please enter the original number. changing the number of partitions is only effective for non-global sequential messages and cannot exceed 32 partitions. 
     * @return Partitions Specifies the number of partitions, which must be greater than or equal to the original partition count. if you want to maintain the original number of partitions, please enter the original number. changing the number of partitions is only effective for non-global sequential messages and cannot exceed 32 partitions.
     */
    public Long getPartitions() {
        return this.Partitions;
    }

    /**
     * Set Specifies the number of partitions, which must be greater than or equal to the original partition count. if you want to maintain the original number of partitions, please enter the original number. changing the number of partitions is only effective for non-global sequential messages and cannot exceed 32 partitions.
     * @param Partitions Specifies the number of partitions, which must be greater than or equal to the original partition count. if you want to maintain the original number of partitions, please enter the original number. changing the number of partitions is only effective for non-global sequential messages and cannot exceed 32 partitions.
     */
    public void setPartitions(Long Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get Pulsar cluster ID 
     * @return ClusterId Pulsar cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Pulsar cluster ID
     * @param ClusterId Pulsar cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Remarks (up to 128 characters). 
     * @return Remark Remarks (up to 128 characters).
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks (up to 128 characters).
     * @param Remark Remarks (up to 128 characters).
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Unconsumed message expiration time. measurement unit: seconds. value range: 60 seconds to 15 days.
 
     * @return MsgTTL Unconsumed message expiration time. measurement unit: seconds. value range: 60 seconds to 15 days.

     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set Unconsumed message expiration time. measurement unit: seconds. value range: 60 seconds to 15 days.

     * @param MsgTTL Unconsumed message expiration time. measurement unit: seconds. value range: 60 seconds to 15 days.

     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    /**
     * Get Default if not passed is native policy. DefaultPolicy means when the subscription reaches the maximum unacknowledged messages of 5000, the server will stop pushing messages to all consumers under the current subscription. DynamicPolicy refers to dynamically adjusting the maximum unacknowledged messages under the subscription, with the specific quota being the maximum between 5000 and the number of consumers multiplied by 20. the default maximum unacknowledged message count per consumer is 20. exceeding this limit only affects that consumer and does not affect other consumers. 
     * @return UnackPolicy Default if not passed is native policy. DefaultPolicy means when the subscription reaches the maximum unacknowledged messages of 5000, the server will stop pushing messages to all consumers under the current subscription. DynamicPolicy refers to dynamically adjusting the maximum unacknowledged messages under the subscription, with the specific quota being the maximum between 5000 and the number of consumers multiplied by 20. the default maximum unacknowledged message count per consumer is 20. exceeding this limit only affects that consumer and does not affect other consumers.
     */
    public String getUnackPolicy() {
        return this.UnackPolicy;
    }

    /**
     * Set Default if not passed is native policy. DefaultPolicy means when the subscription reaches the maximum unacknowledged messages of 5000, the server will stop pushing messages to all consumers under the current subscription. DynamicPolicy refers to dynamically adjusting the maximum unacknowledged messages under the subscription, with the specific quota being the maximum between 5000 and the number of consumers multiplied by 20. the default maximum unacknowledged message count per consumer is 20. exceeding this limit only affects that consumer and does not affect other consumers.
     * @param UnackPolicy Default if not passed is native policy. DefaultPolicy means when the subscription reaches the maximum unacknowledged messages of 5000, the server will stop pushing messages to all consumers under the current subscription. DynamicPolicy refers to dynamically adjusting the maximum unacknowledged messages under the subscription, with the specific quota being the maximum between 5000 and the number of consumers multiplied by 20. the default maximum unacknowledged message count per consumer is 20. exceeding this limit only affects that consumer and does not affect other consumers.
     */
    public void setUnackPolicy(String UnackPolicy) {
        this.UnackPolicy = UnackPolicy;
    }

    /**
     * Get Whether exception consumer isolation is enabled. 
     * @return IsolateConsumerEnable Whether exception consumer isolation is enabled.
     */
    public Boolean getIsolateConsumerEnable() {
        return this.IsolateConsumerEnable;
    }

    /**
     * Set Whether exception consumer isolation is enabled.
     * @param IsolateConsumerEnable Whether exception consumer isolation is enabled.
     */
    public void setIsolateConsumerEnable(Boolean IsolateConsumerEnable) {
        this.IsolateConsumerEnable = IsolateConsumerEnable;
    }

    /**
     * Get Consumer Ack timeout period in seconds. value range: 60-(3600*24). 
     * @return AckTimeOut Consumer Ack timeout period in seconds. value range: 60-(3600*24).
     */
    public Long getAckTimeOut() {
        return this.AckTimeOut;
    }

    /**
     * Set Consumer Ack timeout period in seconds. value range: 60-(3600*24).
     * @param AckTimeOut Consumer Ack timeout period in seconds. value range: 60-(3600*24).
     */
    public void setAckTimeOut(Long AckTimeOut) {
        this.AckTimeOut = AckTimeOut;
    }

    public ModifyTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTopicRequest(ModifyTopicRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Partitions != null) {
            this.Partitions = new Long(source.Partitions);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MsgTTL != null) {
            this.MsgTTL = new Long(source.MsgTTL);
        }
        if (source.UnackPolicy != null) {
            this.UnackPolicy = new String(source.UnackPolicy);
        }
        if (source.IsolateConsumerEnable != null) {
            this.IsolateConsumerEnable = new Boolean(source.IsolateConsumerEnable);
        }
        if (source.AckTimeOut != null) {
            this.AckTimeOut = new Long(source.AckTimeOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);
        this.setParamSimple(map, prefix + "UnackPolicy", this.UnackPolicy);
        this.setParamSimple(map, prefix + "IsolateConsumerEnable", this.IsolateConsumerEnable);
        this.setParamSimple(map, prefix + "AckTimeOut", this.AckTimeOut);

    }
}

