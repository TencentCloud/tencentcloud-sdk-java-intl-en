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

public class DescribeRocketMQTopicMsgsRequest extends AbstractModel {

    /**
    * Cluster ID
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
    * Topic name, which is groupId when the system queries dead letters.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Message ID.
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * Message key
    */
    @SerializedName("MsgKey")
    @Expose
    private String MsgKey;

    /**
    * Query Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Query Quotas
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Mark a pagination transaction.
    */
    @SerializedName("TaskRequestId")
    @Expose
    private String TaskRequestId;

    /**
    * This value is true when the system queries dead letters, and is only valid for RocketMQ.
    */
    @SerializedName("QueryDlqMsg")
    @Expose
    private Boolean QueryDlqMsg;

    /**
    * Query the last N messages. The value of N cannot exceed 1024. By default, -1 indicates other query conditions.
    */
    @SerializedName("NumOfLatestMsg")
    @Expose
    private Long NumOfLatestMsg;

    /**
    * Tag expression.
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * This value is true when the system queries dead letters, and is only valid for RocketMQ.
    */
    @SerializedName("QueryDeadLetterMessage")
    @Expose
    private Boolean QueryDeadLetterMessage;

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
     * Get Topic name, which is groupId when the system queries dead letters. 
     * @return TopicName Topic name, which is groupId when the system queries dead letters.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name, which is groupId when the system queries dead letters.
     * @param TopicName Topic name, which is groupId when the system queries dead letters.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Message ID. 
     * @return MsgId Message ID.
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set Message ID.
     * @param MsgId Message ID.
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get Message key 
     * @return MsgKey Message key
     */
    public String getMsgKey() {
        return this.MsgKey;
    }

    /**
     * Set Message key
     * @param MsgKey Message key
     */
    public void setMsgKey(String MsgKey) {
        this.MsgKey = MsgKey;
    }

    /**
     * Get Query Offset 
     * @return Offset Query Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Query Offset
     * @param Offset Query Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Query Quotas 
     * @return Limit Query Quotas
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Query Quotas
     * @param Limit Query Quotas
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Mark a pagination transaction. 
     * @return TaskRequestId Mark a pagination transaction.
     */
    public String getTaskRequestId() {
        return this.TaskRequestId;
    }

    /**
     * Set Mark a pagination transaction.
     * @param TaskRequestId Mark a pagination transaction.
     */
    public void setTaskRequestId(String TaskRequestId) {
        this.TaskRequestId = TaskRequestId;
    }

    /**
     * Get This value is true when the system queries dead letters, and is only valid for RocketMQ. 
     * @return QueryDlqMsg This value is true when the system queries dead letters, and is only valid for RocketMQ.
     * @deprecated
     */
    @Deprecated
    public Boolean getQueryDlqMsg() {
        return this.QueryDlqMsg;
    }

    /**
     * Set This value is true when the system queries dead letters, and is only valid for RocketMQ.
     * @param QueryDlqMsg This value is true when the system queries dead letters, and is only valid for RocketMQ.
     * @deprecated
     */
    @Deprecated
    public void setQueryDlqMsg(Boolean QueryDlqMsg) {
        this.QueryDlqMsg = QueryDlqMsg;
    }

    /**
     * Get Query the last N messages. The value of N cannot exceed 1024. By default, -1 indicates other query conditions. 
     * @return NumOfLatestMsg Query the last N messages. The value of N cannot exceed 1024. By default, -1 indicates other query conditions.
     */
    public Long getNumOfLatestMsg() {
        return this.NumOfLatestMsg;
    }

    /**
     * Set Query the last N messages. The value of N cannot exceed 1024. By default, -1 indicates other query conditions.
     * @param NumOfLatestMsg Query the last N messages. The value of N cannot exceed 1024. By default, -1 indicates other query conditions.
     */
    public void setNumOfLatestMsg(Long NumOfLatestMsg) {
        this.NumOfLatestMsg = NumOfLatestMsg;
    }

    /**
     * Get Tag expression. 
     * @return Tag Tag expression.
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Tag expression.
     * @param Tag Tag expression.
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get This value is true when the system queries dead letters, and is only valid for RocketMQ. 
     * @return QueryDeadLetterMessage This value is true when the system queries dead letters, and is only valid for RocketMQ.
     */
    public Boolean getQueryDeadLetterMessage() {
        return this.QueryDeadLetterMessage;
    }

    /**
     * Set This value is true when the system queries dead letters, and is only valid for RocketMQ.
     * @param QueryDeadLetterMessage This value is true when the system queries dead letters, and is only valid for RocketMQ.
     */
    public void setQueryDeadLetterMessage(Boolean QueryDeadLetterMessage) {
        this.QueryDeadLetterMessage = QueryDeadLetterMessage;
    }

    public DescribeRocketMQTopicMsgsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQTopicMsgsRequest(DescribeRocketMQTopicMsgsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.MsgKey != null) {
            this.MsgKey = new String(source.MsgKey);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TaskRequestId != null) {
            this.TaskRequestId = new String(source.TaskRequestId);
        }
        if (source.QueryDlqMsg != null) {
            this.QueryDlqMsg = new Boolean(source.QueryDlqMsg);
        }
        if (source.NumOfLatestMsg != null) {
            this.NumOfLatestMsg = new Long(source.NumOfLatestMsg);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.QueryDeadLetterMessage != null) {
            this.QueryDeadLetterMessage = new Boolean(source.QueryDeadLetterMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "MsgKey", this.MsgKey);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TaskRequestId", this.TaskRequestId);
        this.setParamSimple(map, prefix + "QueryDlqMsg", this.QueryDlqMsg);
        this.setParamSimple(map, prefix + "NumOfLatestMsg", this.NumOfLatestMsg);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "QueryDeadLetterMessage", this.QueryDeadLetterMessage);

    }
}

