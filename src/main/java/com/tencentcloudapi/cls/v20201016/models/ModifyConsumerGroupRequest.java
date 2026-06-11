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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyConsumerGroupRequest extends AbstractModel {

    /**
    * Consumer group flag to be updated.
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * Consumer heartbeat timeout (seconds).
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * List of log topics included in the updated consumer group.
    */
    @SerializedName("Topics")
    @Expose
    private String [] Topics;

    /**
    * Logset ID (the logset to which a log topic belongs).
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
     * Get Consumer group flag to be updated. 
     * @return ConsumerGroup Consumer group flag to be updated.
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set Consumer group flag to be updated.
     * @param ConsumerGroup Consumer group flag to be updated.
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get Consumer heartbeat timeout (seconds). 
     * @return Timeout Consumer heartbeat timeout (seconds).
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Consumer heartbeat timeout (seconds).
     * @param Timeout Consumer heartbeat timeout (seconds).
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get List of log topics included in the updated consumer group. 
     * @return Topics List of log topics included in the updated consumer group.
     */
    public String [] getTopics() {
        return this.Topics;
    }

    /**
     * Set List of log topics included in the updated consumer group.
     * @param Topics List of log topics included in the updated consumer group.
     */
    public void setTopics(String [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get Logset ID (the logset to which a log topic belongs). 
     * @return LogsetId Logset ID (the logset to which a log topic belongs).
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset ID (the logset to which a log topic belongs).
     * @param LogsetId Logset ID (the logset to which a log topic belongs).
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    public ModifyConsumerGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConsumerGroupRequest(ModifyConsumerGroupRequest source) {
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Topics != null) {
            this.Topics = new String[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new String(source.Topics[i]);
            }
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamArraySimple(map, prefix + "Topics.", this.Topics);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);

    }
}

