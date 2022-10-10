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

public class SendMessagesRequest extends AbstractModel{

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
    * Token used for authentication, which is optional and will be automatically obtained by the system.
    */
    @SerializedName("StringToken")
    @Expose
    private String StringToken;

    /**
    * Producer name, which is randomly generated and must be globally unique. If you set the producer name manually, the producer may fail to be created, causing message sending failure.
This parameter is used only when a specific producer is allowed to produce messages. It won’t be used in most cases.
    */
    @SerializedName("ProducerName")
    @Expose
    private String ProducerName;

    /**
    * Message sending timeout period, which is 30s by default.
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
     * Get Token used for authentication, which is optional and will be automatically obtained by the system. 
     * @return StringToken Token used for authentication, which is optional and will be automatically obtained by the system.
     */
    public String getStringToken() {
        return this.StringToken;
    }

    /**
     * Set Token used for authentication, which is optional and will be automatically obtained by the system.
     * @param StringToken Token used for authentication, which is optional and will be automatically obtained by the system.
     */
    public void setStringToken(String StringToken) {
        this.StringToken = StringToken;
    }

    /**
     * Get Producer name, which is randomly generated and must be globally unique. If you set the producer name manually, the producer may fail to be created, causing message sending failure.
This parameter is used only when a specific producer is allowed to produce messages. It won’t be used in most cases. 
     * @return ProducerName Producer name, which is randomly generated and must be globally unique. If you set the producer name manually, the producer may fail to be created, causing message sending failure.
This parameter is used only when a specific producer is allowed to produce messages. It won’t be used in most cases.
     */
    public String getProducerName() {
        return this.ProducerName;
    }

    /**
     * Set Producer name, which is randomly generated and must be globally unique. If you set the producer name manually, the producer may fail to be created, causing message sending failure.
This parameter is used only when a specific producer is allowed to produce messages. It won’t be used in most cases.
     * @param ProducerName Producer name, which is randomly generated and must be globally unique. If you set the producer name manually, the producer may fail to be created, causing message sending failure.
This parameter is used only when a specific producer is allowed to produce messages. It won’t be used in most cases.
     */
    public void setProducerName(String ProducerName) {
        this.ProducerName = ProducerName;
    }

    /**
     * Get Message sending timeout period, which is 30s by default. 
     * @return SendTimeout Message sending timeout period, which is 30s by default.
     */
    public Long getSendTimeout() {
        return this.SendTimeout;
    }

    /**
     * Set Message sending timeout period, which is 30s by default.
     * @param SendTimeout Message sending timeout period, which is 30s by default.
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

    public SendMessagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendMessagesRequest(SendMessagesRequest source) {
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

    }
}

