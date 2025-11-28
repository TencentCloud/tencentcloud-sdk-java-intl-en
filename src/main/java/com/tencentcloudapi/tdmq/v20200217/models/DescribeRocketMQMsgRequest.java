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

public class DescribeRocketMQMsgRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Namespace ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Topic name. Pass in the group ID when querying a dead letter queue.
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
    * ID of a TDMQ for Pulsar message
    */
    @SerializedName("PulsarMsgId")
    @Expose
    private String PulsarMsgId;

    /**
    * The value of this parameter is `true` when you query a dead letter queue. It only applies to TDMQ for RocketMQ.
    */
    @SerializedName("QueryDlqMsg")
    @Expose
    private Boolean QueryDlqMsg;

    /**
    * The value is true when querying dead letters, and only valid for RocketMQ.
    */
    @SerializedName("QueryDeadLetterMessage")
    @Expose
    private Boolean QueryDeadLetterMessage;

    /**
    * Pagination offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filters consumption details based on the consumer group name.
    */
    @SerializedName("FilterTrackGroup")
    @Expose
    private String FilterTrackGroup;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Namespace ID 
     * @return EnvironmentId Namespace ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Namespace ID
     * @param EnvironmentId Namespace ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Topic name. Pass in the group ID when querying a dead letter queue. 
     * @return TopicName Topic name. Pass in the group ID when querying a dead letter queue.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name. Pass in the group ID when querying a dead letter queue.
     * @param TopicName Topic name. Pass in the group ID when querying a dead letter queue.
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
     * Get ID of a TDMQ for Pulsar message 
     * @return PulsarMsgId ID of a TDMQ for Pulsar message
     */
    public String getPulsarMsgId() {
        return this.PulsarMsgId;
    }

    /**
     * Set ID of a TDMQ for Pulsar message
     * @param PulsarMsgId ID of a TDMQ for Pulsar message
     */
    public void setPulsarMsgId(String PulsarMsgId) {
        this.PulsarMsgId = PulsarMsgId;
    }

    /**
     * Get The value of this parameter is `true` when you query a dead letter queue. It only applies to TDMQ for RocketMQ. 
     * @return QueryDlqMsg The value of this parameter is `true` when you query a dead letter queue. It only applies to TDMQ for RocketMQ.
     * @deprecated
     */
    @Deprecated
    public Boolean getQueryDlqMsg() {
        return this.QueryDlqMsg;
    }

    /**
     * Set The value of this parameter is `true` when you query a dead letter queue. It only applies to TDMQ for RocketMQ.
     * @param QueryDlqMsg The value of this parameter is `true` when you query a dead letter queue. It only applies to TDMQ for RocketMQ.
     * @deprecated
     */
    @Deprecated
    public void setQueryDlqMsg(Boolean QueryDlqMsg) {
        this.QueryDlqMsg = QueryDlqMsg;
    }

    /**
     * Get The value is true when querying dead letters, and only valid for RocketMQ. 
     * @return QueryDeadLetterMessage The value is true when querying dead letters, and only valid for RocketMQ.
     */
    public Boolean getQueryDeadLetterMessage() {
        return this.QueryDeadLetterMessage;
    }

    /**
     * Set The value is true when querying dead letters, and only valid for RocketMQ.
     * @param QueryDeadLetterMessage The value is true when querying dead letters, and only valid for RocketMQ.
     */
    public void setQueryDeadLetterMessage(Boolean QueryDeadLetterMessage) {
        this.QueryDeadLetterMessage = QueryDeadLetterMessage;
    }

    /**
     * Get Pagination offset 
     * @return Offset Pagination offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset
     * @param Offset Pagination offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination limit 
     * @return Limit Pagination limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination limit
     * @param Limit Pagination limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filters consumption details based on the consumer group name. 
     * @return FilterTrackGroup Filters consumption details based on the consumer group name.
     */
    public String getFilterTrackGroup() {
        return this.FilterTrackGroup;
    }

    /**
     * Set Filters consumption details based on the consumer group name.
     * @param FilterTrackGroup Filters consumption details based on the consumer group name.
     */
    public void setFilterTrackGroup(String FilterTrackGroup) {
        this.FilterTrackGroup = FilterTrackGroup;
    }

    public DescribeRocketMQMsgRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQMsgRequest(DescribeRocketMQMsgRequest source) {
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
        if (source.PulsarMsgId != null) {
            this.PulsarMsgId = new String(source.PulsarMsgId);
        }
        if (source.QueryDlqMsg != null) {
            this.QueryDlqMsg = new Boolean(source.QueryDlqMsg);
        }
        if (source.QueryDeadLetterMessage != null) {
            this.QueryDeadLetterMessage = new Boolean(source.QueryDeadLetterMessage);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FilterTrackGroup != null) {
            this.FilterTrackGroup = new String(source.FilterTrackGroup);
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
        this.setParamSimple(map, prefix + "PulsarMsgId", this.PulsarMsgId);
        this.setParamSimple(map, prefix + "QueryDlqMsg", this.QueryDlqMsg);
        this.setParamSimple(map, prefix + "QueryDeadLetterMessage", this.QueryDeadLetterMessage);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FilterTrackGroup", this.FilterTrackGroup);

    }
}

