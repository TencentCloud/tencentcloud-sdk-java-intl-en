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

public class SubscriptionTopic extends AbstractModel {

    /**
    * Environment (namespace) name.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Topic name.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Subscription name.
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
     * Get Environment (namespace) name. 
     * @return EnvironmentId Environment (namespace) name.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment (namespace) name.
     * @param EnvironmentId Environment (namespace) name.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Topic name. 
     * @return TopicName Topic name.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name.
     * @param TopicName Topic name.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Subscription name. 
     * @return SubscriptionName Subscription name.
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set Subscription name.
     * @param SubscriptionName Subscription name.
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    public SubscriptionTopic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscriptionTopic(SubscriptionTopic source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.SubscriptionName != null) {
            this.SubscriptionName = new String(source.SubscriptionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);

    }
}

