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

public class SendRocketMQMessageRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Namespace ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * Topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Message content
    */
    @SerializedName("MsgBody")
    @Expose
    private String MsgBody;

    /**
    * Message key
    */
    @SerializedName("MsgKey")
    @Expose
    private String MsgKey;

    /**
    * Message tag
    */
    @SerializedName("MsgTag")
    @Expose
    private String MsgTag;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Namespace ID 
     * @return NamespaceId Namespace ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set Namespace ID
     * @param NamespaceId Namespace ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get Topic name 
     * @return TopicName Topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name
     * @param TopicName Topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Message content 
     * @return MsgBody Message content
     */
    public String getMsgBody() {
        return this.MsgBody;
    }

    /**
     * Set Message content
     * @param MsgBody Message content
     */
    public void setMsgBody(String MsgBody) {
        this.MsgBody = MsgBody;
    }

    /**
     * Get Message key 
     * @return MsgKey Message key
     */
    public String getMsgKey() {
        return this.MsgKey;
    }

    /**
     * Set Message key
     * @param MsgKey Message key
     */
    public void setMsgKey(String MsgKey) {
        this.MsgKey = MsgKey;
    }

    /**
     * Get Message tag 
     * @return MsgTag Message tag
     */
    public String getMsgTag() {
        return this.MsgTag;
    }

    /**
     * Set Message tag
     * @param MsgTag Message tag
     */
    public void setMsgTag(String MsgTag) {
        this.MsgTag = MsgTag;
    }

    public SendRocketMQMessageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendRocketMQMessageRequest(SendRocketMQMessageRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.MsgBody != null) {
            this.MsgBody = new String(source.MsgBody);
        }
        if (source.MsgKey != null) {
            this.MsgKey = new String(source.MsgKey);
        }
        if (source.MsgTag != null) {
            this.MsgTag = new String(source.MsgTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MsgBody", this.MsgBody);
        this.setParamSimple(map, prefix + "MsgKey", this.MsgKey);
        this.setParamSimple(map, prefix + "MsgTag", this.MsgTag);

    }
}

