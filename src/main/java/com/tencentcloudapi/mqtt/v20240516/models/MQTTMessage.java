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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MQTTMessage extends AbstractModel {

    /**
    * Message ID
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * Client Id of the message sender.
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * Message service quality grade.
    */
    @SerializedName("Qos")
    @Expose
    private String Qos;

    /**
    * Message storage time on the server. millisecond-level timestamp.
    */
    @SerializedName("StoreTimestamp")
    @Expose
    private Long StoreTimestamp;

    /**
    * Specifies the source topic.
    */
    @SerializedName("OriginTopic")
    @Expose
    private String OriginTopic;

    /**
     * Get Message ID 
     * @return MessageId Message ID
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set Message ID
     * @param MessageId Message ID
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get Client Id of the message sender. 
     * @return ClientId Client Id of the message sender.
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set Client Id of the message sender.
     * @param ClientId Client Id of the message sender.
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get Message service quality grade. 
     * @return Qos Message service quality grade.
     */
    public String getQos() {
        return this.Qos;
    }

    /**
     * Set Message service quality grade.
     * @param Qos Message service quality grade.
     */
    public void setQos(String Qos) {
        this.Qos = Qos;
    }

    /**
     * Get Message storage time on the server. millisecond-level timestamp. 
     * @return StoreTimestamp Message storage time on the server. millisecond-level timestamp.
     */
    public Long getStoreTimestamp() {
        return this.StoreTimestamp;
    }

    /**
     * Set Message storage time on the server. millisecond-level timestamp.
     * @param StoreTimestamp Message storage time on the server. millisecond-level timestamp.
     */
    public void setStoreTimestamp(Long StoreTimestamp) {
        this.StoreTimestamp = StoreTimestamp;
    }

    /**
     * Get Specifies the source topic. 
     * @return OriginTopic Specifies the source topic.
     */
    public String getOriginTopic() {
        return this.OriginTopic;
    }

    /**
     * Set Specifies the source topic.
     * @param OriginTopic Specifies the source topic.
     */
    public void setOriginTopic(String OriginTopic) {
        this.OriginTopic = OriginTopic;
    }

    public MQTTMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MQTTMessage(MQTTMessage source) {
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.Qos != null) {
            this.Qos = new String(source.Qos);
        }
        if (source.StoreTimestamp != null) {
            this.StoreTimestamp = new Long(source.StoreTimestamp);
        }
        if (source.OriginTopic != null) {
            this.OriginTopic = new String(source.OriginTopic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "Qos", this.Qos);
        this.setParamSimple(map, prefix + "StoreTimestamp", this.StoreTimestamp);
        this.setParamSimple(map, prefix + "OriginTopic", this.OriginTopic);

    }
}

