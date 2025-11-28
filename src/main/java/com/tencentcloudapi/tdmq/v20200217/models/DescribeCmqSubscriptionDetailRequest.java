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

public class DescribeCmqSubscriptionDetailRequest extends AbstractModel {

    /**
    * Topic name, which must be unique under the same account in a single region. The name is a string of no more than 64 characters, starting with a letter, and the remaining part may include letters, numbers, and hyphens (-).
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Starting position of the list of topics to be returned on the current page in case of paginated return. If a value is entered, `limit` is required. If this parameter is left empty, 0 will be used by default
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of topics to be returned per page in case of paginated return. If this parameter is not passed in, 20 will be used by default. Maximum value: 50.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Fuzzy search by `SubscriptionName`
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
    * Queue name. Endpoint of bound subscription
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Query type. valid values: (1) topic; (2) queue.
Default value is topic. if queryType is topic, query subscriptions under the topic. if queryType is queue, query subscriptions bound to the queue.
    */
    @SerializedName("QueryType")
    @Expose
    private String QueryType;

    /**
     * Get Topic name, which must be unique under the same account in a single region. The name is a string of no more than 64 characters, starting with a letter, and the remaining part may include letters, numbers, and hyphens (-). 
     * @return TopicName Topic name, which must be unique under the same account in a single region. The name is a string of no more than 64 characters, starting with a letter, and the remaining part may include letters, numbers, and hyphens (-).
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name, which must be unique under the same account in a single region. The name is a string of no more than 64 characters, starting with a letter, and the remaining part may include letters, numbers, and hyphens (-).
     * @param TopicName Topic name, which must be unique under the same account in a single region. The name is a string of no more than 64 characters, starting with a letter, and the remaining part may include letters, numbers, and hyphens (-).
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Starting position of the list of topics to be returned on the current page in case of paginated return. If a value is entered, `limit` is required. If this parameter is left empty, 0 will be used by default 
     * @return Offset Starting position of the list of topics to be returned on the current page in case of paginated return. If a value is entered, `limit` is required. If this parameter is left empty, 0 will be used by default
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting position of the list of topics to be returned on the current page in case of paginated return. If a value is entered, `limit` is required. If this parameter is left empty, 0 will be used by default
     * @param Offset Starting position of the list of topics to be returned on the current page in case of paginated return. If a value is entered, `limit` is required. If this parameter is left empty, 0 will be used by default
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of topics to be returned per page in case of paginated return. If this parameter is not passed in, 20 will be used by default. Maximum value: 50. 
     * @return Limit Number of topics to be returned per page in case of paginated return. If this parameter is not passed in, 20 will be used by default. Maximum value: 50.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of topics to be returned per page in case of paginated return. If this parameter is not passed in, 20 will be used by default. Maximum value: 50.
     * @param Limit Number of topics to be returned per page in case of paginated return. If this parameter is not passed in, 20 will be used by default. Maximum value: 50.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Fuzzy search by `SubscriptionName` 
     * @return SubscriptionName Fuzzy search by `SubscriptionName`
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set Fuzzy search by `SubscriptionName`
     * @param SubscriptionName Fuzzy search by `SubscriptionName`
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    /**
     * Get Queue name. Endpoint of bound subscription 
     * @return QueueName Queue name. Endpoint of bound subscription
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set Queue name. Endpoint of bound subscription
     * @param QueueName Queue name. Endpoint of bound subscription
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get Query type. valid values: (1) topic; (2) queue.
Default value is topic. if queryType is topic, query subscriptions under the topic. if queryType is queue, query subscriptions bound to the queue. 
     * @return QueryType Query type. valid values: (1) topic; (2) queue.
Default value is topic. if queryType is topic, query subscriptions under the topic. if queryType is queue, query subscriptions bound to the queue.
     */
    public String getQueryType() {
        return this.QueryType;
    }

    /**
     * Set Query type. valid values: (1) topic; (2) queue.
Default value is topic. if queryType is topic, query subscriptions under the topic. if queryType is queue, query subscriptions bound to the queue.
     * @param QueryType Query type. valid values: (1) topic; (2) queue.
Default value is topic. if queryType is topic, query subscriptions under the topic. if queryType is queue, query subscriptions bound to the queue.
     */
    public void setQueryType(String QueryType) {
        this.QueryType = QueryType;
    }

    public DescribeCmqSubscriptionDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCmqSubscriptionDetailRequest(DescribeCmqSubscriptionDetailRequest source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SubscriptionName != null) {
            this.SubscriptionName = new String(source.SubscriptionName);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.QueryType != null) {
            this.QueryType = new String(source.QueryType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);

    }
}

