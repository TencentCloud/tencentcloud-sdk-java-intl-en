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

public class DescribeMqMsgTraceRequest extends AbstractModel {

    /**
    * pulsar,rocketmq,rabbitmq,cmq
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Message ID
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * Cluster id. cmq is empty.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Namespace. cmq is empty.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Topic. empty for cmq. group id when querying rocketmq dead letters.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * cmq is required. fill in the blank for other protocols.
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Consumer Group and Subscription
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * The value is true when querying dead letters, and only valid for RocketMQ.
    */
    @SerializedName("QueryDlqMsg")
    @Expose
    private Boolean QueryDlqMsg;

    /**
    * Message production time.
    */
    @SerializedName("ProduceTime")
    @Expose
    private String ProduceTime;

    /**
     * Get pulsar,rocketmq,rabbitmq,cmq 
     * @return Protocol pulsar,rocketmq,rabbitmq,cmq
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set pulsar,rocketmq,rabbitmq,cmq
     * @param Protocol pulsar,rocketmq,rabbitmq,cmq
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Message ID 
     * @return MsgId Message ID
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set Message ID
     * @param MsgId Message ID
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get Cluster id. cmq is empty. 
     * @return ClusterId Cluster id. cmq is empty.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster id. cmq is empty.
     * @param ClusterId Cluster id. cmq is empty.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Namespace. cmq is empty. 
     * @return EnvironmentId Namespace. cmq is empty.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Namespace. cmq is empty.
     * @param EnvironmentId Namespace. cmq is empty.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Topic. empty for cmq. group id when querying rocketmq dead letters. 
     * @return TopicName Topic. empty for cmq. group id when querying rocketmq dead letters.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic. empty for cmq. group id when querying rocketmq dead letters.
     * @param TopicName Topic. empty for cmq. group id when querying rocketmq dead letters.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get cmq is required. fill in the blank for other protocols. 
     * @return QueueName cmq is required. fill in the blank for other protocols.
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set cmq is required. fill in the blank for other protocols.
     * @param QueueName cmq is required. fill in the blank for other protocols.
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get Consumer Group and Subscription 
     * @return GroupName Consumer Group and Subscription
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Consumer Group and Subscription
     * @param GroupName Consumer Group and Subscription
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get The value is true when querying dead letters, and only valid for RocketMQ. 
     * @return QueryDlqMsg The value is true when querying dead letters, and only valid for RocketMQ.
     */
    public Boolean getQueryDlqMsg() {
        return this.QueryDlqMsg;
    }

    /**
     * Set The value is true when querying dead letters, and only valid for RocketMQ.
     * @param QueryDlqMsg The value is true when querying dead letters, and only valid for RocketMQ.
     */
    public void setQueryDlqMsg(Boolean QueryDlqMsg) {
        this.QueryDlqMsg = QueryDlqMsg;
    }

    /**
     * Get Message production time. 
     * @return ProduceTime Message production time.
     */
    public String getProduceTime() {
        return this.ProduceTime;
    }

    /**
     * Set Message production time.
     * @param ProduceTime Message production time.
     */
    public void setProduceTime(String ProduceTime) {
        this.ProduceTime = ProduceTime;
    }

    public DescribeMqMsgTraceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMqMsgTraceRequest(DescribeMqMsgTraceRequest source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.QueryDlqMsg != null) {
            this.QueryDlqMsg = new Boolean(source.QueryDlqMsg);
        }
        if (source.ProduceTime != null) {
            this.ProduceTime = new String(source.ProduceTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "QueryDlqMsg", this.QueryDlqMsg);
        this.setParamSimple(map, prefix + "ProduceTime", this.ProduceTime);

    }
}

