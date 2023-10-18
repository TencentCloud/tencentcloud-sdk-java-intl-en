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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetRocketMQConsumerOffSetRequest extends AbstractModel {

    /**
    * Cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Namespace name.
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * Consumer group name.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Topic name.
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Reset method. 0: Start from the latest offset; 1: Start from specified time point.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * The specified timestamp that has been reset, in milliseconds. This parameter only takes effect when the value of `Type` is `1`.
    */
    @SerializedName("ResetTimestamp")
    @Expose
    private Long ResetTimestamp;

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
     * Get Namespace name. 
     * @return NamespaceId Namespace name.
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set Namespace name.
     * @param NamespaceId Namespace name.
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get Consumer group name. 
     * @return GroupId Consumer group name.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Consumer group name.
     * @param GroupId Consumer group name.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Topic name. 
     * @return Topic Topic name.
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Topic name.
     * @param Topic Topic name.
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Reset method. 0: Start from the latest offset; 1: Start from specified time point. 
     * @return Type Reset method. 0: Start from the latest offset; 1: Start from specified time point.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Reset method. 0: Start from the latest offset; 1: Start from specified time point.
     * @param Type Reset method. 0: Start from the latest offset; 1: Start from specified time point.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get The specified timestamp that has been reset, in milliseconds. This parameter only takes effect when the value of `Type` is `1`. 
     * @return ResetTimestamp The specified timestamp that has been reset, in milliseconds. This parameter only takes effect when the value of `Type` is `1`.
     */
    public Long getResetTimestamp() {
        return this.ResetTimestamp;
    }

    /**
     * Set The specified timestamp that has been reset, in milliseconds. This parameter only takes effect when the value of `Type` is `1`.
     * @param ResetTimestamp The specified timestamp that has been reset, in milliseconds. This parameter only takes effect when the value of `Type` is `1`.
     */
    public void setResetTimestamp(Long ResetTimestamp) {
        this.ResetTimestamp = ResetTimestamp;
    }

    public ResetRocketMQConsumerOffSetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetRocketMQConsumerOffSetRequest(ResetRocketMQConsumerOffSetRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ResetTimestamp != null) {
            this.ResetTimestamp = new Long(source.ResetTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ResetTimestamp", this.ResetTimestamp);

    }
}

