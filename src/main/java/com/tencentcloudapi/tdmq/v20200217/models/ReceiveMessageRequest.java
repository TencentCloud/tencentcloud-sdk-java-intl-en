/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReceiveMessageRequest extends AbstractModel{

    /**
    * Name of the topic which receives the message. It is better to be the full path of the topic, such as `tenant/namespace/topic`. If it is not specified, `public/default` will be used by default.
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Subscriber name
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
    * Default value: 1000. Messages received by the consumer will first be stored in the `receiverQueueSize` queue to tune the message receiving rate.
    */
    @SerializedName("ReceiverQueueSize")
    @Expose
    private Long ReceiverQueueSize;

    /**
    * Default value: Latest. It is used to determine the position where the consumer initially receives messages. Valid values: Earliest, Latest.
    */
    @SerializedName("SubInitialPosition")
    @Expose
    private String SubInitialPosition;

    /**
     * Get Name of the topic which receives the message. It is better to be the full path of the topic, such as `tenant/namespace/topic`. If it is not specified, `public/default` will be used by default. 
     * @return Topic Name of the topic which receives the message. It is better to be the full path of the topic, such as `tenant/namespace/topic`. If it is not specified, `public/default` will be used by default.
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Name of the topic which receives the message. It is better to be the full path of the topic, such as `tenant/namespace/topic`. If it is not specified, `public/default` will be used by default.
     * @param Topic Name of the topic which receives the message. It is better to be the full path of the topic, such as `tenant/namespace/topic`. If it is not specified, `public/default` will be used by default.
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Subscriber name 
     * @return SubscriptionName Subscriber name
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set Subscriber name
     * @param SubscriptionName Subscriber name
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    /**
     * Get Default value: 1000. Messages received by the consumer will first be stored in the `receiverQueueSize` queue to tune the message receiving rate. 
     * @return ReceiverQueueSize Default value: 1000. Messages received by the consumer will first be stored in the `receiverQueueSize` queue to tune the message receiving rate.
     */
    public Long getReceiverQueueSize() {
        return this.ReceiverQueueSize;
    }

    /**
     * Set Default value: 1000. Messages received by the consumer will first be stored in the `receiverQueueSize` queue to tune the message receiving rate.
     * @param ReceiverQueueSize Default value: 1000. Messages received by the consumer will first be stored in the `receiverQueueSize` queue to tune the message receiving rate.
     */
    public void setReceiverQueueSize(Long ReceiverQueueSize) {
        this.ReceiverQueueSize = ReceiverQueueSize;
    }

    /**
     * Get Default value: Latest. It is used to determine the position where the consumer initially receives messages. Valid values: Earliest, Latest. 
     * @return SubInitialPosition Default value: Latest. It is used to determine the position where the consumer initially receives messages. Valid values: Earliest, Latest.
     */
    public String getSubInitialPosition() {
        return this.SubInitialPosition;
    }

    /**
     * Set Default value: Latest. It is used to determine the position where the consumer initially receives messages. Valid values: Earliest, Latest.
     * @param SubInitialPosition Default value: Latest. It is used to determine the position where the consumer initially receives messages. Valid values: Earliest, Latest.
     */
    public void setSubInitialPosition(String SubInitialPosition) {
        this.SubInitialPosition = SubInitialPosition;
    }

    public ReceiveMessageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReceiveMessageRequest(ReceiveMessageRequest source) {
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.SubscriptionName != null) {
            this.SubscriptionName = new String(source.SubscriptionName);
        }
        if (source.ReceiverQueueSize != null) {
            this.ReceiverQueueSize = new Long(source.ReceiverQueueSize);
        }
        if (source.SubInitialPosition != null) {
            this.SubInitialPosition = new String(source.SubInitialPosition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);
        this.setParamSimple(map, prefix + "ReceiverQueueSize", this.ReceiverQueueSize);
        this.setParamSimple(map, prefix + "SubInitialPosition", this.SubInitialPosition);

    }
}

