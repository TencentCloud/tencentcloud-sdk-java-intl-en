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

public class DescribeRocketMQMsgTraceRequest extends AbstractModel {

    /**
    * Cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Namespace
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Topic. When the system queries RocketMQ dead letters, the value is groupId.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Message ID
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * Consumer Group and Subscription
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * The value is true when querying dead letters.
    */
    @SerializedName("QueryDLQMsg")
    @Expose
    private Boolean QueryDLQMsg;

    /**
    * The value is true when querying dead letters.
    */
    @SerializedName("QueryDeadLetterMessage")
    @Expose
    private String QueryDeadLetterMessage;

    /**
     * Get Cluster ID. 
     * @return ClusterId Cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
     * @param ClusterId Cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Namespace 
     * @return EnvironmentId Namespace
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Namespace
     * @param EnvironmentId Namespace
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Topic. When the system queries RocketMQ dead letters, the value is groupId. 
     * @return TopicName Topic. When the system queries RocketMQ dead letters, the value is groupId.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic. When the system queries RocketMQ dead letters, the value is groupId.
     * @param TopicName Topic. When the system queries RocketMQ dead letters, the value is groupId.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
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
     * Get The value is true when querying dead letters. 
     * @return QueryDLQMsg The value is true when querying dead letters.
     * @deprecated
     */
    @Deprecated
    public Boolean getQueryDLQMsg() {
        return this.QueryDLQMsg;
    }

    /**
     * Set The value is true when querying dead letters.
     * @param QueryDLQMsg The value is true when querying dead letters.
     * @deprecated
     */
    @Deprecated
    public void setQueryDLQMsg(Boolean QueryDLQMsg) {
        this.QueryDLQMsg = QueryDLQMsg;
    }

    /**
     * Get The value is true when querying dead letters. 
     * @return QueryDeadLetterMessage The value is true when querying dead letters.
     */
    public String getQueryDeadLetterMessage() {
        return this.QueryDeadLetterMessage;
    }

    /**
     * Set The value is true when querying dead letters.
     * @param QueryDeadLetterMessage The value is true when querying dead letters.
     */
    public void setQueryDeadLetterMessage(String QueryDeadLetterMessage) {
        this.QueryDeadLetterMessage = QueryDeadLetterMessage;
    }

    public DescribeRocketMQMsgTraceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQMsgTraceRequest(DescribeRocketMQMsgTraceRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.QueryDLQMsg != null) {
            this.QueryDLQMsg = new Boolean(source.QueryDLQMsg);
        }
        if (source.QueryDeadLetterMessage != null) {
            this.QueryDeadLetterMessage = new String(source.QueryDeadLetterMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "QueryDLQMsg", this.QueryDLQMsg);
        this.setParamSimple(map, prefix + "QueryDeadLetterMessage", this.QueryDeadLetterMessage);

    }
}

