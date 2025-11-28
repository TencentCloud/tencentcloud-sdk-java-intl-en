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

public class ExportRocketMQMessageDetailRequest extends AbstractModel {

    /**
    * Cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Application namespace.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Topic name.
If it is a dead letter message, isDlqMsg=true.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Message ID
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * Whether to Includes Message Body
    */
    @SerializedName("IncludeMsgBody")
    @Expose
    private Boolean IncludeMsgBody;

    /**
    * Whether It a Dead Letter Message
    */
    @SerializedName("DeadLetterMsg")
    @Expose
    private Boolean DeadLetterMsg;

    /**
     * Get Cluster ID. 
     * @return ClusterId Cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
     * @param ClusterId Cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Application namespace. 
     * @return EnvironmentId Application namespace.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Application namespace.
     * @param EnvironmentId Application namespace.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Topic name.
If it is a dead letter message, isDlqMsg=true. 
     * @return TopicName Topic name.
If it is a dead letter message, isDlqMsg=true.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name.
If it is a dead letter message, isDlqMsg=true.
     * @param TopicName Topic name.
If it is a dead letter message, isDlqMsg=true.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Message ID 
     * @return MsgId Message ID
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set Message ID
     * @param MsgId Message ID
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get Whether to Includes Message Body 
     * @return IncludeMsgBody Whether to Includes Message Body
     */
    public Boolean getIncludeMsgBody() {
        return this.IncludeMsgBody;
    }

    /**
     * Set Whether to Includes Message Body
     * @param IncludeMsgBody Whether to Includes Message Body
     */
    public void setIncludeMsgBody(Boolean IncludeMsgBody) {
        this.IncludeMsgBody = IncludeMsgBody;
    }

    /**
     * Get Whether It a Dead Letter Message 
     * @return DeadLetterMsg Whether It a Dead Letter Message
     */
    public Boolean getDeadLetterMsg() {
        return this.DeadLetterMsg;
    }

    /**
     * Set Whether It a Dead Letter Message
     * @param DeadLetterMsg Whether It a Dead Letter Message
     */
    public void setDeadLetterMsg(Boolean DeadLetterMsg) {
        this.DeadLetterMsg = DeadLetterMsg;
    }

    public ExportRocketMQMessageDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportRocketMQMessageDetailRequest(ExportRocketMQMessageDetailRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.IncludeMsgBody != null) {
            this.IncludeMsgBody = new Boolean(source.IncludeMsgBody);
        }
        if (source.DeadLetterMsg != null) {
            this.DeadLetterMsg = new Boolean(source.DeadLetterMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "IncludeMsgBody", this.IncludeMsgBody);
        this.setParamSimple(map, prefix + "DeadLetterMsg", this.DeadLetterMsg);

    }
}

