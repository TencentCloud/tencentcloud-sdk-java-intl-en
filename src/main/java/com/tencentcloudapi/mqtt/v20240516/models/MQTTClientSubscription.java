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

public class MQTTClientSubscription extends AbstractModel {

    /**
    * Subscribed topic.
    */
    @SerializedName("TopicFilter")
    @Expose
    private String TopicFilter;

    /**
    * Service quality grade.
Up to once.
At least once.
Exactly once.
    */
    @SerializedName("Qos")
    @Expose
    private Long Qos;

    /**
    * Indicates the heaped messages.
    */
    @SerializedName("Lag")
    @Expose
    private Long Lag;

    /**
    * Unconfirmed delivery count.
    */
    @SerializedName("Inflight")
    @Expose
    private Long Inflight;

    /**
    * Describes the user attribute.
    */
    @SerializedName("UserProperties")
    @Expose
    private SubscriptionUserProperty [] UserProperties;

    /**
     * Get Subscribed topic. 
     * @return TopicFilter Subscribed topic.
     */
    public String getTopicFilter() {
        return this.TopicFilter;
    }

    /**
     * Set Subscribed topic.
     * @param TopicFilter Subscribed topic.
     */
    public void setTopicFilter(String TopicFilter) {
        this.TopicFilter = TopicFilter;
    }

    /**
     * Get Service quality grade.
Up to once.
At least once.
Exactly once. 
     * @return Qos Service quality grade.
Up to once.
At least once.
Exactly once.
     */
    public Long getQos() {
        return this.Qos;
    }

    /**
     * Set Service quality grade.
Up to once.
At least once.
Exactly once.
     * @param Qos Service quality grade.
Up to once.
At least once.
Exactly once.
     */
    public void setQos(Long Qos) {
        this.Qos = Qos;
    }

    /**
     * Get Indicates the heaped messages. 
     * @return Lag Indicates the heaped messages.
     */
    public Long getLag() {
        return this.Lag;
    }

    /**
     * Set Indicates the heaped messages.
     * @param Lag Indicates the heaped messages.
     */
    public void setLag(Long Lag) {
        this.Lag = Lag;
    }

    /**
     * Get Unconfirmed delivery count. 
     * @return Inflight Unconfirmed delivery count.
     */
    public Long getInflight() {
        return this.Inflight;
    }

    /**
     * Set Unconfirmed delivery count.
     * @param Inflight Unconfirmed delivery count.
     */
    public void setInflight(Long Inflight) {
        this.Inflight = Inflight;
    }

    /**
     * Get Describes the user attribute. 
     * @return UserProperties Describes the user attribute.
     */
    public SubscriptionUserProperty [] getUserProperties() {
        return this.UserProperties;
    }

    /**
     * Set Describes the user attribute.
     * @param UserProperties Describes the user attribute.
     */
    public void setUserProperties(SubscriptionUserProperty [] UserProperties) {
        this.UserProperties = UserProperties;
    }

    public MQTTClientSubscription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MQTTClientSubscription(MQTTClientSubscription source) {
        if (source.TopicFilter != null) {
            this.TopicFilter = new String(source.TopicFilter);
        }
        if (source.Qos != null) {
            this.Qos = new Long(source.Qos);
        }
        if (source.Lag != null) {
            this.Lag = new Long(source.Lag);
        }
        if (source.Inflight != null) {
            this.Inflight = new Long(source.Inflight);
        }
        if (source.UserProperties != null) {
            this.UserProperties = new SubscriptionUserProperty[source.UserProperties.length];
            for (int i = 0; i < source.UserProperties.length; i++) {
                this.UserProperties[i] = new SubscriptionUserProperty(source.UserProperties[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicFilter", this.TopicFilter);
        this.setParamSimple(map, prefix + "Qos", this.Qos);
        this.setParamSimple(map, prefix + "Lag", this.Lag);
        this.setParamSimple(map, prefix + "Inflight", this.Inflight);
        this.setParamArrayObj(map, prefix + "UserProperties.", this.UserProperties);

    }
}

