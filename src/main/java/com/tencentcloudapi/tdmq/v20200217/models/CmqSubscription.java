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
    * Subscription name, which must be unique in the same topic under the same account in the same region. It can contain up to 64 letters, digits, and hyphens and must begin with a letter.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
    * Subscription ID, which will be used during monitoring data pull.
Note: this field may return null, indicating that no valid values can be obtained.
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
    * Number of messages to be delivered in the subscription.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgCount")
    @Expose
    private Long MsgCount;

    /**
    * Time when the subscription attribute is last modified. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastModifyTime")
    @Expose
    private Long LastModifyTime;

    /**
    * Subscription creation time. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
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
    * Endpoint that receives notifications, which varies by `protocol`: for HTTP, the endpoint must start with `http://`, and the `host` can be a domain or IP; for `queue`, `queueName` should be entered.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * Filtering policy selected when a subscription is created:
If `filterType` is 1, `filterTag` will be used for filtering.
If `filterType` is 2, `bindingKey` will be used for filtering.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FilterTags")
    @Expose
    private String [] FilterTags;

    /**
    * Subscription protocol. Currently, two protocols are supported: HTTP and queue. To use the HTTP protocol, you need to build your own web server to receive messages. With the queue protocol, messages are automatically pushed to a CMQ queue and you can pull them concurrently.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * CMQ push server retry policy in case an error occurs while pushing a message to the endpoint. Valid values:
(1) BACKOFF_RETRY: backoff retry, which is to retry at a fixed interval, discard the message after a certain number of retries, and continue to push the next message.
(2) EXPONENTIAL_DECAY_RETRY: exponential decay retry, which is to retry at an exponentially increasing interval, such as 1s, 2s, 4s, 8s, and so on. As a message can be retained in a topic for one day, failed messages will be discarded at most after one day of retry. Default value: EXPONENTIAL_DECAY_RETRY.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NotifyStrategy")
    @Expose
    private String NotifyStrategy;

    /**
    * Push content format. Valid values: 1. JSON; 2. SIMPLIFIED, i.e., the raw format. If `protocol` is `queue`, this value must be `SIMPLIFIED`. If `protocol` is `HTTP`, both values are acceptable, and the default value is `JSON`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NotifyContentFormat")
    @Expose
    private String NotifyContentFormat;

    /**
     * Get Subscription name, which must be unique in the same topic under the same account in the same region. It can contain up to 64 letters, digits, and hyphens and must begin with a letter.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SubscriptionName Subscription name, which must be unique in the same topic under the same account in the same region. It can contain up to 64 letters, digits, and hyphens and must begin with a letter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set Subscription name, which must be unique in the same topic under the same account in the same region. It can contain up to 64 letters, digits, and hyphens and must begin with a letter.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SubscriptionName Subscription name, which must be unique in the same topic under the same account in the same region. It can contain up to 64 letters, digits, and hyphens and must begin with a letter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    /**
     * Get Subscription ID, which will be used during monitoring data pull.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SubscriptionId Subscription ID, which will be used during monitoring data pull.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSubscriptionId() {
        return this.SubscriptionId;
    }

    /**
     * Set Subscription ID, which will be used during monitoring data pull.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SubscriptionId Subscription ID, which will be used during monitoring data pull.
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get Number of messages to be delivered in the subscription.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MsgCount Number of messages to be delivered in the subscription.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMsgCount() {
        return this.MsgCount;
    }

    /**
     * Set Number of messages to be delivered in the subscription.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MsgCount Number of messages to be delivered in the subscription.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgCount(Long MsgCount) {
        this.MsgCount = MsgCount;
    }

    /**
     * Get Time when the subscription attribute is last modified. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastModifyTime Time when the subscription attribute is last modified. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * Set Time when the subscription attribute is last modified. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastModifyTime Time when the subscription attribute is last modified. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastModifyTime(Long LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    /**
     * Get Subscription creation time. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Subscription creation time. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Subscription creation time. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Subscription creation time. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get Endpoint that receives notifications, which varies by `protocol`: for HTTP, the endpoint must start with `http://`, and the `host` can be a domain or IP; for `queue`, `queueName` should be entered.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Endpoint Endpoint that receives notifications, which varies by `protocol`: for HTTP, the endpoint must start with `http://`, and the `host` can be a domain or IP; for `queue`, `queueName` should be entered.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set Endpoint that receives notifications, which varies by `protocol`: for HTTP, the endpoint must start with `http://`, and the `host` can be a domain or IP; for `queue`, `queueName` should be entered.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Endpoint Endpoint that receives notifications, which varies by `protocol`: for HTTP, the endpoint must start with `http://`, and the `host` can be a domain or IP; for `queue`, `queueName` should be entered.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get Filtering policy selected when a subscription is created:
If `filterType` is 1, `filterTag` will be used for filtering.
If `filterType` is 2, `bindingKey` will be used for filtering.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FilterTags Filtering policy selected when a subscription is created:
If `filterType` is 1, `filterTag` will be used for filtering.
If `filterType` is 2, `bindingKey` will be used for filtering.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getFilterTags() {
        return this.FilterTags;
    }

    /**
     * Set Filtering policy selected when a subscription is created:
If `filterType` is 1, `filterTag` will be used for filtering.
If `filterType` is 2, `bindingKey` will be used for filtering.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FilterTags Filtering policy selected when a subscription is created:
If `filterType` is 1, `filterTag` will be used for filtering.
If `filterType` is 2, `bindingKey` will be used for filtering.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFilterTags(String [] FilterTags) {
        this.FilterTags = FilterTags;
    }

    /**
     * Get Subscription protocol. Currently, two protocols are supported: HTTP and queue. To use the HTTP protocol, you need to build your own web server to receive messages. With the queue protocol, messages are automatically pushed to a CMQ queue and you can pull them concurrently.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Subscription protocol. Currently, two protocols are supported: HTTP and queue. To use the HTTP protocol, you need to build your own web server to receive messages. With the queue protocol, messages are automatically pushed to a CMQ queue and you can pull them concurrently.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Subscription protocol. Currently, two protocols are supported: HTTP and queue. To use the HTTP protocol, you need to build your own web server to receive messages. With the queue protocol, messages are automatically pushed to a CMQ queue and you can pull them concurrently.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Protocol Subscription protocol. Currently, two protocols are supported: HTTP and queue. To use the HTTP protocol, you need to build your own web server to receive messages. With the queue protocol, messages are automatically pushed to a CMQ queue and you can pull them concurrently.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get CMQ push server retry policy in case an error occurs while pushing a message to the endpoint. Valid values:
(1) BACKOFF_RETRY: backoff retry, which is to retry at a fixed interval, discard the message after a certain number of retries, and continue to push the next message.
(2) EXPONENTIAL_DECAY_RETRY: exponential decay retry, which is to retry at an exponentially increasing interval, such as 1s, 2s, 4s, 8s, and so on. As a message can be retained in a topic for one day, failed messages will be discarded at most after one day of retry. Default value: EXPONENTIAL_DECAY_RETRY.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NotifyStrategy CMQ push server retry policy in case an error occurs while pushing a message to the endpoint. Valid values:
(1) BACKOFF_RETRY: backoff retry, which is to retry at a fixed interval, discard the message after a certain number of retries, and continue to push the next message.
(2) EXPONENTIAL_DECAY_RETRY: exponential decay retry, which is to retry at an exponentially increasing interval, such as 1s, 2s, 4s, 8s, and so on. As a message can be retained in a topic for one day, failed messages will be discarded at most after one day of retry. Default value: EXPONENTIAL_DECAY_RETRY.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNotifyStrategy() {
        return this.NotifyStrategy;
    }

    /**
     * Set CMQ push server retry policy in case an error occurs while pushing a message to the endpoint. Valid values:
(1) BACKOFF_RETRY: backoff retry, which is to retry at a fixed interval, discard the message after a certain number of retries, and continue to push the next message.
(2) EXPONENTIAL_DECAY_RETRY: exponential decay retry, which is to retry at an exponentially increasing interval, such as 1s, 2s, 4s, 8s, and so on. As a message can be retained in a topic for one day, failed messages will be discarded at most after one day of retry. Default value: EXPONENTIAL_DECAY_RETRY.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NotifyStrategy CMQ push server retry policy in case an error occurs while pushing a message to the endpoint. Valid values:
(1) BACKOFF_RETRY: backoff retry, which is to retry at a fixed interval, discard the message after a certain number of retries, and continue to push the next message.
(2) EXPONENTIAL_DECAY_RETRY: exponential decay retry, which is to retry at an exponentially increasing interval, such as 1s, 2s, 4s, 8s, and so on. As a message can be retained in a topic for one day, failed messages will be discarded at most after one day of retry. Default value: EXPONENTIAL_DECAY_RETRY.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNotifyStrategy(String NotifyStrategy) {
        this.NotifyStrategy = NotifyStrategy;
    }

    /**
     * Get Push content format. Valid values: 1. JSON; 2. SIMPLIFIED, i.e., the raw format. If `protocol` is `queue`, this value must be `SIMPLIFIED`. If `protocol` is `HTTP`, both values are acceptable, and the default value is `JSON`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NotifyContentFormat Push content format. Valid values: 1. JSON; 2. SIMPLIFIED, i.e., the raw format. If `protocol` is `queue`, this value must be `SIMPLIFIED`. If `protocol` is `HTTP`, both values are acceptable, and the default value is `JSON`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNotifyContentFormat() {
        return this.NotifyContentFormat;
    }

    /**
     * Set Push content format. Valid values: 1. JSON; 2. SIMPLIFIED, i.e., the raw format. If `protocol` is `queue`, this value must be `SIMPLIFIED`. If `protocol` is `HTTP`, both values are acceptable, and the default value is `JSON`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NotifyContentFormat Push content format. Valid values: 1. JSON; 2. SIMPLIFIED, i.e., the raw format. If `protocol` is `queue`, this value must be `SIMPLIFIED`. If `protocol` is `HTTP`, both values are acceptable, and the default value is `JSON`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNotifyContentFormat(String NotifyContentFormat) {
        this.NotifyContentFormat = NotifyContentFormat;
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

    }
}

