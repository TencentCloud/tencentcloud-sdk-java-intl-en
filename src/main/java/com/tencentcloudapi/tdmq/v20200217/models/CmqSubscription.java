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

public class CmqSubscription extends AbstractModel {

    /**
    * Subscription name, which must be unique under the same account and same topic in a single region. the name is a string of no more than 64 characters, beginning with a letter, and the remaining part may contain letters, numbers, and hyphens (-).
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
    * Subscription ID. The subscription ID is used when monitoring data is pulled.
    */
    @SerializedName("SubscriptionId")
    @Expose
    private String SubscriptionId;

    /**
    * Subscription owner `APPID`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicOwner")
    @Expose
    private Long TopicOwner;

    /**
    * The number of messages waiting for shipping for this subscription.
    */
    @SerializedName("MsgCount")
    @Expose
    private Long MsgCount;

    /**
    * The last time the subscription attribute was modified. Returns a Unix timestamp, accurate to milliseconds.
    */
    @SerializedName("LastModifyTime")
    @Expose
    private Long LastModifyTime;

    /**
    * The time when the subscription was created. Returns a Unix timestamp, accurate to milliseconds.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Filtering policy for subscribing to and receiving messages.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BindingKey")
    @Expose
    private String [] BindingKey;

    /**
    * The endpoint that receives notifications is differentiated by protocol: For HTTP, the endpoint must start with http://, and the host can be a domain name or IP; for queue, fill in queueName.
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * Describes the filtering policy selected by users when creating subscriptions.
filterType = 1 indicates Tag filtering when users use filterTag.
filterType = 2 indicates user use bindingKey for filtering.
    */
    @SerializedName("FilterTags")
    @Expose
    private String [] FilterTags;

    /**
    * The subscription protocol, currently supports two protocols: HTTP and queue. When the HTTP protocol is used, users need to set up their own web server to accept messages. When the queue protocol is used, messages will automatically be pushed to CMQ queues, and users can pull messages concurrently.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Specifies the CMQ push server retry policy when an error occurs while pushing messages to an endpoint. valid values:.
BACKOFF_RETRY, backoff retry. retry at regular intervals, discard the message after a certain number of retries, and continue to push the next message.
(2) EXPONENTIAL_DECAY_RETRY, EXPONENTIAL DECAY RETRY. the interval between retries increases exponentially, for example starting at 1s, followed by 2s, 4s, 8s... since the Topic message period is one day, RETRY for at most one day then discard the message. default value is EXPONENTIAL_DECAY_RETRY.
    */
    @SerializedName("NotifyStrategy")
    @Expose
    private String NotifyStrategy;

    /**
    * The format of the push content. Values: (1) JSON; (2) SIMPLIFIED, i.e., raw format. If protocol is queue, the value must be SIMPLIFIED. If protocol is HTTP, both values are acceptable, with the default being JSON.
    */
    @SerializedName("NotifyContentFormat")
    @Expose
    private String NotifyContentFormat;

    /**
    * Topic Name of the Subscription
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get Subscription name, which must be unique under the same account and same topic in a single region. the name is a string of no more than 64 characters, beginning with a letter, and the remaining part may contain letters, numbers, and hyphens (-). 
     * @return SubscriptionName Subscription name, which must be unique under the same account and same topic in a single region. the name is a string of no more than 64 characters, beginning with a letter, and the remaining part may contain letters, numbers, and hyphens (-).
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set Subscription name, which must be unique under the same account and same topic in a single region. the name is a string of no more than 64 characters, beginning with a letter, and the remaining part may contain letters, numbers, and hyphens (-).
     * @param SubscriptionName Subscription name, which must be unique under the same account and same topic in a single region. the name is a string of no more than 64 characters, beginning with a letter, and the remaining part may contain letters, numbers, and hyphens (-).
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    /**
     * Get Subscription ID. The subscription ID is used when monitoring data is pulled. 
     * @return SubscriptionId Subscription ID. The subscription ID is used when monitoring data is pulled.
     */
    public String getSubscriptionId() {
        return this.SubscriptionId;
    }

    /**
     * Set Subscription ID. The subscription ID is used when monitoring data is pulled.
     * @param SubscriptionId Subscription ID. The subscription ID is used when monitoring data is pulled.
     */
    public void setSubscriptionId(String SubscriptionId) {
        this.SubscriptionId = SubscriptionId;
    }

    /**
     * Get Subscription owner `APPID`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TopicOwner Subscription owner `APPID`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTopicOwner() {
        return this.TopicOwner;
    }

    /**
     * Set Subscription owner `APPID`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TopicOwner Subscription owner `APPID`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicOwner(Long TopicOwner) {
        this.TopicOwner = TopicOwner;
    }

    /**
     * Get The number of messages waiting for shipping for this subscription. 
     * @return MsgCount The number of messages waiting for shipping for this subscription.
     */
    public Long getMsgCount() {
        return this.MsgCount;
    }

    /**
     * Set The number of messages waiting for shipping for this subscription.
     * @param MsgCount The number of messages waiting for shipping for this subscription.
     */
    public void setMsgCount(Long MsgCount) {
        this.MsgCount = MsgCount;
    }

    /**
     * Get The last time the subscription attribute was modified. Returns a Unix timestamp, accurate to milliseconds. 
     * @return LastModifyTime The last time the subscription attribute was modified. Returns a Unix timestamp, accurate to milliseconds.
     */
    public Long getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * Set The last time the subscription attribute was modified. Returns a Unix timestamp, accurate to milliseconds.
     * @param LastModifyTime The last time the subscription attribute was modified. Returns a Unix timestamp, accurate to milliseconds.
     */
    public void setLastModifyTime(Long LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    /**
     * Get The time when the subscription was created. Returns a Unix timestamp, accurate to milliseconds. 
     * @return CreateTime The time when the subscription was created. Returns a Unix timestamp, accurate to milliseconds.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The time when the subscription was created. Returns a Unix timestamp, accurate to milliseconds.
     * @param CreateTime The time when the subscription was created. Returns a Unix timestamp, accurate to milliseconds.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Filtering policy for subscribing to and receiving messages.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BindingKey Filtering policy for subscribing to and receiving messages.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBindingKey() {
        return this.BindingKey;
    }

    /**
     * Set Filtering policy for subscribing to and receiving messages.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BindingKey Filtering policy for subscribing to and receiving messages.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBindingKey(String [] BindingKey) {
        this.BindingKey = BindingKey;
    }

    /**
     * Get The endpoint that receives notifications is differentiated by protocol: For HTTP, the endpoint must start with http://, and the host can be a domain name or IP; for queue, fill in queueName. 
     * @return Endpoint The endpoint that receives notifications is differentiated by protocol: For HTTP, the endpoint must start with http://, and the host can be a domain name or IP; for queue, fill in queueName.
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set The endpoint that receives notifications is differentiated by protocol: For HTTP, the endpoint must start with http://, and the host can be a domain name or IP; for queue, fill in queueName.
     * @param Endpoint The endpoint that receives notifications is differentiated by protocol: For HTTP, the endpoint must start with http://, and the host can be a domain name or IP; for queue, fill in queueName.
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get Describes the filtering policy selected by users when creating subscriptions.
filterType = 1 indicates Tag filtering when users use filterTag.
filterType = 2 indicates user use bindingKey for filtering. 
     * @return FilterTags Describes the filtering policy selected by users when creating subscriptions.
filterType = 1 indicates Tag filtering when users use filterTag.
filterType = 2 indicates user use bindingKey for filtering.
     */
    public String [] getFilterTags() {
        return this.FilterTags;
    }

    /**
     * Set Describes the filtering policy selected by users when creating subscriptions.
filterType = 1 indicates Tag filtering when users use filterTag.
filterType = 2 indicates user use bindingKey for filtering.
     * @param FilterTags Describes the filtering policy selected by users when creating subscriptions.
filterType = 1 indicates Tag filtering when users use filterTag.
filterType = 2 indicates user use bindingKey for filtering.
     */
    public void setFilterTags(String [] FilterTags) {
        this.FilterTags = FilterTags;
    }

    /**
     * Get The subscription protocol, currently supports two protocols: HTTP and queue. When the HTTP protocol is used, users need to set up their own web server to accept messages. When the queue protocol is used, messages will automatically be pushed to CMQ queues, and users can pull messages concurrently. 
     * @return Protocol The subscription protocol, currently supports two protocols: HTTP and queue. When the HTTP protocol is used, users need to set up their own web server to accept messages. When the queue protocol is used, messages will automatically be pushed to CMQ queues, and users can pull messages concurrently.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The subscription protocol, currently supports two protocols: HTTP and queue. When the HTTP protocol is used, users need to set up their own web server to accept messages. When the queue protocol is used, messages will automatically be pushed to CMQ queues, and users can pull messages concurrently.
     * @param Protocol The subscription protocol, currently supports two protocols: HTTP and queue. When the HTTP protocol is used, users need to set up their own web server to accept messages. When the queue protocol is used, messages will automatically be pushed to CMQ queues, and users can pull messages concurrently.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Specifies the CMQ push server retry policy when an error occurs while pushing messages to an endpoint. valid values:.
BACKOFF_RETRY, backoff retry. retry at regular intervals, discard the message after a certain number of retries, and continue to push the next message.
(2) EXPONENTIAL_DECAY_RETRY, EXPONENTIAL DECAY RETRY. the interval between retries increases exponentially, for example starting at 1s, followed by 2s, 4s, 8s... since the Topic message period is one day, RETRY for at most one day then discard the message. default value is EXPONENTIAL_DECAY_RETRY. 
     * @return NotifyStrategy Specifies the CMQ push server retry policy when an error occurs while pushing messages to an endpoint. valid values:.
BACKOFF_RETRY, backoff retry. retry at regular intervals, discard the message after a certain number of retries, and continue to push the next message.
(2) EXPONENTIAL_DECAY_RETRY, EXPONENTIAL DECAY RETRY. the interval between retries increases exponentially, for example starting at 1s, followed by 2s, 4s, 8s... since the Topic message period is one day, RETRY for at most one day then discard the message. default value is EXPONENTIAL_DECAY_RETRY.
     */
    public String getNotifyStrategy() {
        return this.NotifyStrategy;
    }

    /**
     * Set Specifies the CMQ push server retry policy when an error occurs while pushing messages to an endpoint. valid values:.
BACKOFF_RETRY, backoff retry. retry at regular intervals, discard the message after a certain number of retries, and continue to push the next message.
(2) EXPONENTIAL_DECAY_RETRY, EXPONENTIAL DECAY RETRY. the interval between retries increases exponentially, for example starting at 1s, followed by 2s, 4s, 8s... since the Topic message period is one day, RETRY for at most one day then discard the message. default value is EXPONENTIAL_DECAY_RETRY.
     * @param NotifyStrategy Specifies the CMQ push server retry policy when an error occurs while pushing messages to an endpoint. valid values:.
BACKOFF_RETRY, backoff retry. retry at regular intervals, discard the message after a certain number of retries, and continue to push the next message.
(2) EXPONENTIAL_DECAY_RETRY, EXPONENTIAL DECAY RETRY. the interval between retries increases exponentially, for example starting at 1s, followed by 2s, 4s, 8s... since the Topic message period is one day, RETRY for at most one day then discard the message. default value is EXPONENTIAL_DECAY_RETRY.
     */
    public void setNotifyStrategy(String NotifyStrategy) {
        this.NotifyStrategy = NotifyStrategy;
    }

    /**
     * Get The format of the push content. Values: (1) JSON; (2) SIMPLIFIED, i.e., raw format. If protocol is queue, the value must be SIMPLIFIED. If protocol is HTTP, both values are acceptable, with the default being JSON. 
     * @return NotifyContentFormat The format of the push content. Values: (1) JSON; (2) SIMPLIFIED, i.e., raw format. If protocol is queue, the value must be SIMPLIFIED. If protocol is HTTP, both values are acceptable, with the default being JSON.
     */
    public String getNotifyContentFormat() {
        return this.NotifyContentFormat;
    }

    /**
     * Set The format of the push content. Values: (1) JSON; (2) SIMPLIFIED, i.e., raw format. If protocol is queue, the value must be SIMPLIFIED. If protocol is HTTP, both values are acceptable, with the default being JSON.
     * @param NotifyContentFormat The format of the push content. Values: (1) JSON; (2) SIMPLIFIED, i.e., raw format. If protocol is queue, the value must be SIMPLIFIED. If protocol is HTTP, both values are acceptable, with the default being JSON.
     */
    public void setNotifyContentFormat(String NotifyContentFormat) {
        this.NotifyContentFormat = NotifyContentFormat;
    }

    /**
     * Get Topic Name of the Subscription 
     * @return TopicName Topic Name of the Subscription
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic Name of the Subscription
     * @param TopicName Topic Name of the Subscription
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public CmqSubscription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CmqSubscription(CmqSubscription source) {
        if (source.SubscriptionName != null) {
            this.SubscriptionName = new String(source.SubscriptionName);
        }
        if (source.SubscriptionId != null) {
            this.SubscriptionId = new String(source.SubscriptionId);
        }
        if (source.TopicOwner != null) {
            this.TopicOwner = new Long(source.TopicOwner);
        }
        if (source.MsgCount != null) {
            this.MsgCount = new Long(source.MsgCount);
        }
        if (source.LastModifyTime != null) {
            this.LastModifyTime = new Long(source.LastModifyTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.BindingKey != null) {
            this.BindingKey = new String[source.BindingKey.length];
            for (int i = 0; i < source.BindingKey.length; i++) {
                this.BindingKey[i] = new String(source.BindingKey[i]);
            }
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.FilterTags != null) {
            this.FilterTags = new String[source.FilterTags.length];
            for (int i = 0; i < source.FilterTags.length; i++) {
                this.FilterTags[i] = new String(source.FilterTags[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.NotifyStrategy != null) {
            this.NotifyStrategy = new String(source.NotifyStrategy);
        }
        if (source.NotifyContentFormat != null) {
            this.NotifyContentFormat = new String(source.NotifyContentFormat);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);
        this.setParamSimple(map, prefix + "SubscriptionId", this.SubscriptionId);
        this.setParamSimple(map, prefix + "TopicOwner", this.TopicOwner);
        this.setParamSimple(map, prefix + "MsgCount", this.MsgCount);
        this.setParamSimple(map, prefix + "LastModifyTime", this.LastModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "BindingKey.", this.BindingKey);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamArraySimple(map, prefix + "FilterTags.", this.FilterTags);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "NotifyStrategy", this.NotifyStrategy);
        this.setParamSimple(map, prefix + "NotifyContentFormat", this.NotifyContentFormat);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

