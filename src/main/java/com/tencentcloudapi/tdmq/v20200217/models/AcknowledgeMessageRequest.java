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

public class AcknowledgeMessageRequest extends AbstractModel{

    /**
    * Unique ID used to identify the message, which can be obtained from the returned value of `receiveMessage`.
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * Topic name, which can be obtained from the returned value of `receiveMessage` and is better to be the full path of the topic, such as `tenant/namespace/topic`. If it is not specified, `public/default` will be used by default.
    */
    @SerializedName("AckTopic")
    @Expose
    private String AckTopic;

    /**
    * Subscriber name, which can be obtained from the returned value of `receiveMessage`. Make sure that it is the same as the subscriber name identified in `receiveMessage`; otherwise, the received message cannot be correctly acknowledged.
    */
    @SerializedName("SubName")
    @Expose
    private String SubName;

    /**
     * Get Unique ID used to identify the message, which can be obtained from the returned value of `receiveMessage`. 
     * @return MessageId Unique ID used to identify the message, which can be obtained from the returned value of `receiveMessage`.
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set Unique ID used to identify the message, which can be obtained from the returned value of `receiveMessage`.
     * @param MessageId Unique ID used to identify the message, which can be obtained from the returned value of `receiveMessage`.
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get Topic name, which can be obtained from the returned value of `receiveMessage` and is better to be the full path of the topic, such as `tenant/namespace/topic`. If it is not specified, `public/default` will be used by default. 
     * @return AckTopic Topic name, which can be obtained from the returned value of `receiveMessage` and is better to be the full path of the topic, such as `tenant/namespace/topic`. If it is not specified, `public/default` will be used by default.
     */
    public String getAckTopic() {
        return this.AckTopic;
    }

    /**
     * Set Topic name, which can be obtained from the returned value of `receiveMessage` and is better to be the full path of the topic, such as `tenant/namespace/topic`. If it is not specified, `public/default` will be used by default.
     * @param AckTopic Topic name, which can be obtained from the returned value of `receiveMessage` and is better to be the full path of the topic, such as `tenant/namespace/topic`. If it is not specified, `public/default` will be used by default.
     */
    public void setAckTopic(String AckTopic) {
        this.AckTopic = AckTopic;
    }

    /**
     * Get Subscriber name, which can be obtained from the returned value of `receiveMessage`. Make sure that it is the same as the subscriber name identified in `receiveMessage`; otherwise, the received message cannot be correctly acknowledged. 
     * @return SubName Subscriber name, which can be obtained from the returned value of `receiveMessage`. Make sure that it is the same as the subscriber name identified in `receiveMessage`; otherwise, the received message cannot be correctly acknowledged.
     */
    public String getSubName() {
        return this.SubName;
    }

    /**
     * Set Subscriber name, which can be obtained from the returned value of `receiveMessage`. Make sure that it is the same as the subscriber name identified in `receiveMessage`; otherwise, the received message cannot be correctly acknowledged.
     * @param SubName Subscriber name, which can be obtained from the returned value of `receiveMessage`. Make sure that it is the same as the subscriber name identified in `receiveMessage`; otherwise, the received message cannot be correctly acknowledged.
     */
    public void setSubName(String SubName) {
        this.SubName = SubName;
    }

    public AcknowledgeMessageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AcknowledgeMessageRequest(AcknowledgeMessageRequest source) {
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.AckTopic != null) {
            this.AckTopic = new String(source.AckTopic);
        }
        if (source.SubName != null) {
            this.SubName = new String(source.SubName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "AckTopic", this.AckTopic);
        this.setParamSimple(map, prefix + "SubName", this.SubName);

    }
}

