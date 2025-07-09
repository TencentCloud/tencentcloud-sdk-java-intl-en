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

public class SendBatchMessagesRequest extends AbstractModel {

    /**
    * Name of the topic to which to send the message. It is better to be the full path of the topic, such as `tenant/namespace/topic`. If it is not specified, `public/default` will be used by default.
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Content of the message to be sent
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * String-Type token, which is optional and will be automatically obtained by the system.
    */
    @SerializedName("StringToken")
    @Expose
    private String StringToken;

    /**
    * Producer name, which must be globally unique. If it is not configured, the system will automatically generate one.
    */
    @SerializedName("ProducerName")
    @Expose
    private String ProducerName;

    /**
    * Message sending timeout period in seconds. Default value: 30s
    */
    @SerializedName("SendTimeout")
    @Expose
    private Long SendTimeout;

    /**
    * Maximum number of produced messages which can be cached in the memory. Default value: 1000
    */
    @SerializedName("MaxPendingMessages")
    @Expose
    private Long MaxPendingMessages;

    /**
    * Maximum number of messages in each batch. Default value: 1000 messages/batch
    */
    @SerializedName("BatchingMaxMessages")
    @Expose
    private Long BatchingMaxMessages;

    /**
    * Maximum wait time for each batch, after which the batch will be sent no matter whether the specified number or size of messages in the batch is reached. Default value: 10 ms
    */
    @SerializedName("BatchingMaxPublishDelay")
    @Expose
    private Long BatchingMaxPublishDelay;

    /**
    * Maximum allowed size of messages in each batch. Default value: 128 KB
    */
    @SerializedName("BatchingMaxBytes")
    @Expose
    private Long BatchingMaxBytes;

    /**
     * Get Name of the topic to which to send the message. It is better to be the full path of the topic, such as `tenant/namespace/topic`. If it is not specified, `public/default` will be used by default. 
     * @return Topic Name of the topic to which to send the message. It is better to be the full path of the topic, such as `tenant/namespace/topic`. If it is not specified, `public/default` will be used by default.
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Name of the topic to which to send the message. It is better to be the full path of the topic, such as `tenant/namespace/topic`. If it is not specified, `public/default` will be used by default.
     * @param Topic Name of the topic to which to send the message. It is better to be the full path of the topic, such as `tenant/namespace/topic`. If it is not specified, `public/default` will be used by default.
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Content of the message to be sent 
     * @return Payload Content of the message to be sent
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set Content of the message to be sent
     * @param Payload Content of the message to be sent
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get String-Type token, which is optional and will be automatically obtained by the system. 
     * @return StringToken String-Type token, which is optional and will be automatically obtained by the system.
     */
    public String getStringToken() {
        return this.StringToken;
    }

    /**
     * Set String-Type token, which is optional and will be automatically obtained by the system.
     * @param StringToken String-Type token, which is optional and will be automatically obtained by the system.
     */
    public void setStringToken(String StringToken) {
        this.StringToken = StringToken;
    }

    /**
     * Get Producer name, which must be globally unique. If it is not configured, the system will automatically generate one. 
     * @return ProducerName Producer name, which must be globally unique. If it is not configured, the system will automatically generate one.
     */
    public String getProducerName() {
        return this.ProducerName;
    }

    /**
     * Set Producer name, which must be globally unique. If it is not configured, the system will automatically generate one.
     * @param ProducerName Producer name, which must be globally unique. If it is not configured, the system will automatically generate one.
     */
    public void setProducerName(String ProducerName) {
        this.ProducerName = ProducerName;
    }

    /**
     * Get Message sending timeout period in seconds. Default value: 30s 
     * @return SendTimeout Message sending timeout period in seconds. Default value: 30s
     */
    public Long getSendTimeout() {
        return this.SendTimeout;
    }

    /**
     * Set Message sending timeout period in seconds. Default value: 30s
     * @param SendTimeout Message sending timeout period in seconds. Default value: 30s
     */
    public void setSendTimeout(Long SendTimeout) {
        this.SendTimeout = SendTimeout;
    }

    /**
     * Get Maximum number of produced messages which can be cached in the memory. Default value: 1000 
     * @return MaxPendingMessages Maximum number of produced messages which can be cached in the memory. Default value: 1000
     */
    public Long getMaxPendingMessages() {
        return this.MaxPendingMessages;
    }

    /**
     * Set Maximum number of produced messages which can be cached in the memory. Default value: 1000
     * @param MaxPendingMessages Maximum number of produced messages which can be cached in the memory. Default value: 1000
     */
    public void setMaxPendingMessages(Long MaxPendingMessages) {
        this.MaxPendingMessages = MaxPendingMessages;
    }

    /**
     * Get Maximum number of messages in each batch. Default value: 1000 messages/batch 
     * @return BatchingMaxMessages Maximum number of messages in each batch. Default value: 1000 messages/batch
     */
    public Long getBatchingMaxMessages() {
        return this.BatchingMaxMessages;
    }

    /**
     * Set Maximum number of messages in each batch. Default value: 1000 messages/batch
     * @param BatchingMaxMessages Maximum number of messages in each batch. Default value: 1000 messages/batch
     */
    public void setBatchingMaxMessages(Long BatchingMaxMessages) {
        this.BatchingMaxMessages = BatchingMaxMessages;
    }

    /**
     * Get Maximum wait time for each batch, after which the batch will be sent no matter whether the specified number or size of messages in the batch is reached. Default value: 10 ms 
     * @return BatchingMaxPublishDelay Maximum wait time for each batch, after which the batch will be sent no matter whether the specified number or size of messages in the batch is reached. Default value: 10 ms
     */
    public Long getBatchingMaxPublishDelay() {
        return this.BatchingMaxPublishDelay;
    }

    /**
     * Set Maximum wait time for each batch, after which the batch will be sent no matter whether the specified number or size of messages in the batch is reached. Default value: 10 ms
     * @param BatchingMaxPublishDelay Maximum wait time for each batch, after which the batch will be sent no matter whether the specified number or size of messages in the batch is reached. Default value: 10 ms
     */
    public void setBatchingMaxPublishDelay(Long BatchingMaxPublishDelay) {
        this.BatchingMaxPublishDelay = BatchingMaxPublishDelay;
    }

    /**
     * Get Maximum allowed size of messages in each batch. Default value: 128 KB 
     * @return BatchingMaxBytes Maximum allowed size of messages in each batch. Default value: 128 KB
     */
    public Long getBatchingMaxBytes() {
        return this.BatchingMaxBytes;
    }

    /**
     * Set Maximum allowed size of messages in each batch. Default value: 128 KB
     * @param BatchingMaxBytes Maximum allowed size of messages in each batch. Default value: 128 KB
     */
    public void setBatchingMaxBytes(Long BatchingMaxBytes) {
        this.BatchingMaxBytes = BatchingMaxBytes;
    }

    public SendBatchMessagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendBatchMessagesRequest(SendBatchMessagesRequest source) {
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.StringToken != null) {
            this.StringToken = new String(source.StringToken);
        }
        if (source.ProducerName != null) {
            this.ProducerName = new String(source.ProducerName);
        }
        if (source.SendTimeout != null) {
            this.SendTimeout = new Long(source.SendTimeout);
        }
        if (source.MaxPendingMessages != null) {
            this.MaxPendingMessages = new Long(source.MaxPendingMessages);
        }
        if (source.BatchingMaxMessages != null) {
            this.BatchingMaxMessages = new Long(source.BatchingMaxMessages);
        }
        if (source.BatchingMaxPublishDelay != null) {
            this.BatchingMaxPublishDelay = new Long(source.BatchingMaxPublishDelay);
        }
        if (source.BatchingMaxBytes != null) {
            this.BatchingMaxBytes = new Long(source.BatchingMaxBytes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "StringToken", this.StringToken);
        this.setParamSimple(map, prefix + "ProducerName", this.ProducerName);
        this.setParamSimple(map, prefix + "SendTimeout", this.SendTimeout);
        this.setParamSimple(map, prefix + "MaxPendingMessages", this.MaxPendingMessages);
        this.setParamSimple(map, prefix + "BatchingMaxMessages", this.BatchingMaxMessages);
        this.setParamSimple(map, prefix + "BatchingMaxPublishDelay", this.BatchingMaxPublishDelay);
        this.setParamSimple(map, prefix + "BatchingMaxBytes", this.BatchingMaxBytes);

    }
}

