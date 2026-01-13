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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMessageListRequest extends AbstractModel {

    /**
    * TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Topic name. It can be obtained from [TopicItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#TopicItem) returned by the API [DescribeTopicList](https://www.tencentcloud.com/document/api/1493/96030?from_cn_redirect=1) or from the console.
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Start time for querying messages. **It is a Unix timestamp (ms).**
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time for querying messages. **It is a Unix timestamp (ms).**
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Query identifier. For the first query, input a null string. If the query results involve pagination, use the TaskRequestId value in the previous request response as the value of this input parameter for requesting data on the next page.
    */
    @SerializedName("TaskRequestId")
    @Expose
    private String TaskRequestId;

    /**
    * Starting position of the query. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of queried results. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Consumer group name. It can be obtained from [ConsumeGroupItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ConsumeGroupItem) returned by the API [DescribeConsumerGroupList](https://www.tencentcloud.com/document/api/1493/101535?from_cn_redirect=1) or from the console.
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * Message ID. It can be obtained from [MessageItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MessageItem) returned by the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or from the workload logs.
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * Message key. It can be obtained from [MessageItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MessageItem) returned by the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or from workload logs.
    */
    @SerializedName("MsgKey")
    @Expose
    private String MsgKey;

    /**
    * Query the last N messages. The value of N cannot exceed 1024. By default, -1 indicates other query conditions.
    */
    @SerializedName("RecentMessageNum")
    @Expose
    private Long RecentMessageNum;

    /**
    * Whether to query dead letter messages. Default value: false.
    */
    @SerializedName("QueryDeadLetterMessage")
    @Expose
    private Boolean QueryDeadLetterMessage;

    /**
    * Message tag. It can be obtained from [MessageItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MessageItem) returned by the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or from workload logs.
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console. 
     * @return InstanceId TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console.
     * @param InstanceId TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Topic name. It can be obtained from [TopicItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#TopicItem) returned by the API [DescribeTopicList](https://www.tencentcloud.com/document/api/1493/96030?from_cn_redirect=1) or from the console. 
     * @return Topic Topic name. It can be obtained from [TopicItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#TopicItem) returned by the API [DescribeTopicList](https://www.tencentcloud.com/document/api/1493/96030?from_cn_redirect=1) or from the console.
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Topic name. It can be obtained from [TopicItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#TopicItem) returned by the API [DescribeTopicList](https://www.tencentcloud.com/document/api/1493/96030?from_cn_redirect=1) or from the console.
     * @param Topic Topic name. It can be obtained from [TopicItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#TopicItem) returned by the API [DescribeTopicList](https://www.tencentcloud.com/document/api/1493/96030?from_cn_redirect=1) or from the console.
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Start time for querying messages. **It is a Unix timestamp (ms).** 
     * @return StartTime Start time for querying messages. **It is a Unix timestamp (ms).**
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time for querying messages. **It is a Unix timestamp (ms).**
     * @param StartTime Start time for querying messages. **It is a Unix timestamp (ms).**
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time for querying messages. **It is a Unix timestamp (ms).** 
     * @return EndTime End time for querying messages. **It is a Unix timestamp (ms).**
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time for querying messages. **It is a Unix timestamp (ms).**
     * @param EndTime End time for querying messages. **It is a Unix timestamp (ms).**
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Query identifier. For the first query, input a null string. If the query results involve pagination, use the TaskRequestId value in the previous request response as the value of this input parameter for requesting data on the next page. 
     * @return TaskRequestId Query identifier. For the first query, input a null string. If the query results involve pagination, use the TaskRequestId value in the previous request response as the value of this input parameter for requesting data on the next page.
     */
    public String getTaskRequestId() {
        return this.TaskRequestId;
    }

    /**
     * Set Query identifier. For the first query, input a null string. If the query results involve pagination, use the TaskRequestId value in the previous request response as the value of this input parameter for requesting data on the next page.
     * @param TaskRequestId Query identifier. For the first query, input a null string. If the query results involve pagination, use the TaskRequestId value in the previous request response as the value of this input parameter for requesting data on the next page.
     */
    public void setTaskRequestId(String TaskRequestId) {
        this.TaskRequestId = TaskRequestId;
    }

    /**
     * Get Starting position of the query. Default value: 0. 
     * @return Offset Starting position of the query. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting position of the query. Default value: 0.
     * @param Offset Starting position of the query. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of queried results. Default value: 20. 
     * @return Limit Maximum number of queried results. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of queried results. Default value: 20.
     * @param Limit Maximum number of queried results. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Consumer group name. It can be obtained from [ConsumeGroupItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ConsumeGroupItem) returned by the API [DescribeConsumerGroupList](https://www.tencentcloud.com/document/api/1493/101535?from_cn_redirect=1) or from the console. 
     * @return ConsumerGroup Consumer group name. It can be obtained from [ConsumeGroupItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ConsumeGroupItem) returned by the API [DescribeConsumerGroupList](https://www.tencentcloud.com/document/api/1493/101535?from_cn_redirect=1) or from the console.
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set Consumer group name. It can be obtained from [ConsumeGroupItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ConsumeGroupItem) returned by the API [DescribeConsumerGroupList](https://www.tencentcloud.com/document/api/1493/101535?from_cn_redirect=1) or from the console.
     * @param ConsumerGroup Consumer group name. It can be obtained from [ConsumeGroupItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ConsumeGroupItem) returned by the API [DescribeConsumerGroupList](https://www.tencentcloud.com/document/api/1493/101535?from_cn_redirect=1) or from the console.
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get Message ID. It can be obtained from [MessageItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MessageItem) returned by the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or from the workload logs. 
     * @return MsgId Message ID. It can be obtained from [MessageItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MessageItem) returned by the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or from the workload logs.
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set Message ID. It can be obtained from [MessageItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MessageItem) returned by the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or from the workload logs.
     * @param MsgId Message ID. It can be obtained from [MessageItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MessageItem) returned by the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or from the workload logs.
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get Message key. It can be obtained from [MessageItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MessageItem) returned by the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or from workload logs. 
     * @return MsgKey Message key. It can be obtained from [MessageItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MessageItem) returned by the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or from workload logs.
     */
    public String getMsgKey() {
        return this.MsgKey;
    }

    /**
     * Set Message key. It can be obtained from [MessageItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MessageItem) returned by the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or from workload logs.
     * @param MsgKey Message key. It can be obtained from [MessageItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MessageItem) returned by the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or from workload logs.
     */
    public void setMsgKey(String MsgKey) {
        this.MsgKey = MsgKey;
    }

    /**
     * Get Query the last N messages. The value of N cannot exceed 1024. By default, -1 indicates other query conditions. 
     * @return RecentMessageNum Query the last N messages. The value of N cannot exceed 1024. By default, -1 indicates other query conditions.
     */
    public Long getRecentMessageNum() {
        return this.RecentMessageNum;
    }

    /**
     * Set Query the last N messages. The value of N cannot exceed 1024. By default, -1 indicates other query conditions.
     * @param RecentMessageNum Query the last N messages. The value of N cannot exceed 1024. By default, -1 indicates other query conditions.
     */
    public void setRecentMessageNum(Long RecentMessageNum) {
        this.RecentMessageNum = RecentMessageNum;
    }

    /**
     * Get Whether to query dead letter messages. Default value: false. 
     * @return QueryDeadLetterMessage Whether to query dead letter messages. Default value: false.
     */
    public Boolean getQueryDeadLetterMessage() {
        return this.QueryDeadLetterMessage;
    }

    /**
     * Set Whether to query dead letter messages. Default value: false.
     * @param QueryDeadLetterMessage Whether to query dead letter messages. Default value: false.
     */
    public void setQueryDeadLetterMessage(Boolean QueryDeadLetterMessage) {
        this.QueryDeadLetterMessage = QueryDeadLetterMessage;
    }

    /**
     * Get Message tag. It can be obtained from [MessageItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MessageItem) returned by the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or from workload logs. 
     * @return Tag Message tag. It can be obtained from [MessageItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MessageItem) returned by the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or from workload logs.
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Message tag. It can be obtained from [MessageItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MessageItem) returned by the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or from workload logs.
     * @param Tag Message tag. It can be obtained from [MessageItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MessageItem) returned by the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or from workload logs.
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    public DescribeMessageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMessageListRequest(DescribeMessageListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.TaskRequestId != null) {
            this.TaskRequestId = new String(source.TaskRequestId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.MsgKey != null) {
            this.MsgKey = new String(source.MsgKey);
        }
        if (source.RecentMessageNum != null) {
            this.RecentMessageNum = new Long(source.RecentMessageNum);
        }
        if (source.QueryDeadLetterMessage != null) {
            this.QueryDeadLetterMessage = new Boolean(source.QueryDeadLetterMessage);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskRequestId", this.TaskRequestId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "MsgKey", this.MsgKey);
        this.setParamSimple(map, prefix + "RecentMessageNum", this.RecentMessageNum);
        this.setParamSimple(map, prefix + "QueryDeadLetterMessage", this.QueryDeadLetterMessage);
        this.setParamSimple(map, prefix + "Tag", this.Tag);

    }
}

