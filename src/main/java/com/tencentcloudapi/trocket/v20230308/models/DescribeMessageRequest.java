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

public class DescribeMessageRequest extends AbstractModel {

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
    * Message ID. It can be obtained from the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or workload logs.
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

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
    * Whether the message is dead letter message. Default value: false.
    */
    @SerializedName("QueryDeadLetterMessage")
    @Expose
    private Boolean QueryDeadLetterMessage;

    /**
    * Whether the message is delayed. Default value: false.
    */
    @SerializedName("QueryDelayMessage")
    @Expose
    private Boolean QueryDelayMessage;

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
     * Get Message ID. It can be obtained from the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or workload logs. 
     * @return MsgId Message ID. It can be obtained from the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or workload logs.
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set Message ID. It can be obtained from the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or workload logs.
     * @param MsgId Message ID. It can be obtained from the API [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1) or workload logs.
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
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
     * Get Whether the message is dead letter message. Default value: false. 
     * @return QueryDeadLetterMessage Whether the message is dead letter message. Default value: false.
     */
    public Boolean getQueryDeadLetterMessage() {
        return this.QueryDeadLetterMessage;
    }

    /**
     * Set Whether the message is dead letter message. Default value: false.
     * @param QueryDeadLetterMessage Whether the message is dead letter message. Default value: false.
     */
    public void setQueryDeadLetterMessage(Boolean QueryDeadLetterMessage) {
        this.QueryDeadLetterMessage = QueryDeadLetterMessage;
    }

    /**
     * Get Whether the message is delayed. Default value: false. 
     * @return QueryDelayMessage Whether the message is delayed. Default value: false.
     */
    public Boolean getQueryDelayMessage() {
        return this.QueryDelayMessage;
    }

    /**
     * Set Whether the message is delayed. Default value: false.
     * @param QueryDelayMessage Whether the message is delayed. Default value: false.
     */
    public void setQueryDelayMessage(Boolean QueryDelayMessage) {
        this.QueryDelayMessage = QueryDelayMessage;
    }

    public DescribeMessageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMessageRequest(DescribeMessageRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.QueryDeadLetterMessage != null) {
            this.QueryDeadLetterMessage = new Boolean(source.QueryDeadLetterMessage);
        }
        if (source.QueryDelayMessage != null) {
            this.QueryDelayMessage = new Boolean(source.QueryDelayMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "QueryDeadLetterMessage", this.QueryDeadLetterMessage);
        this.setParamSimple(map, prefix + "QueryDelayMessage", this.QueryDelayMessage);

    }
}

