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

public class CreateSubscriptionRequest extends AbstractModel {

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
    * Subscriber name, which can contain up to 128 characters.
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
    * Whether the creation is idempotent; if not, you cannot create subscriptions with the same name.
    */
    @SerializedName("IsIdempotent")
    @Expose
    private Boolean IsIdempotent;

    /**
    * Remarks (up to 128 characters).
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Pulsar cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Whether to automatically create a dead letter topic and a retry letter topic. true: yes (default value); false: no.
    */
    @SerializedName("AutoCreatePolicyTopic")
    @Expose
    private Boolean AutoCreatePolicyTopic;

    /**
    * Naming convention for dead letter and retry letter topics. `LEGACY` indicates to use the legacy naming convention, and `COMMUNITY` indicates to use the naming convention in the Pulsar community.
    */
    @SerializedName("PostFixPattern")
    @Expose
    private String PostFixPattern;

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
     * Get Subscriber name, which can contain up to 128 characters. 
     * @return SubscriptionName Subscriber name, which can contain up to 128 characters.
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set Subscriber name, which can contain up to 128 characters.
     * @param SubscriptionName Subscriber name, which can contain up to 128 characters.
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    /**
     * Get Whether the creation is idempotent; if not, you cannot create subscriptions with the same name. 
     * @return IsIdempotent Whether the creation is idempotent; if not, you cannot create subscriptions with the same name.
     */
    public Boolean getIsIdempotent() {
        return this.IsIdempotent;
    }

    /**
     * Set Whether the creation is idempotent; if not, you cannot create subscriptions with the same name.
     * @param IsIdempotent Whether the creation is idempotent; if not, you cannot create subscriptions with the same name.
     */
    public void setIsIdempotent(Boolean IsIdempotent) {
        this.IsIdempotent = IsIdempotent;
    }

    /**
     * Get Remarks (up to 128 characters). 
     * @return Remark Remarks (up to 128 characters).
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks (up to 128 characters).
     * @param Remark Remarks (up to 128 characters).
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Pulsar cluster ID 
     * @return ClusterId Pulsar cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Pulsar cluster ID
     * @param ClusterId Pulsar cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Whether to automatically create a dead letter topic and a retry letter topic. true: yes (default value); false: no. 
     * @return AutoCreatePolicyTopic Whether to automatically create a dead letter topic and a retry letter topic. true: yes (default value); false: no.
     */
    public Boolean getAutoCreatePolicyTopic() {
        return this.AutoCreatePolicyTopic;
    }

    /**
     * Set Whether to automatically create a dead letter topic and a retry letter topic. true: yes (default value); false: no.
     * @param AutoCreatePolicyTopic Whether to automatically create a dead letter topic and a retry letter topic. true: yes (default value); false: no.
     */
    public void setAutoCreatePolicyTopic(Boolean AutoCreatePolicyTopic) {
        this.AutoCreatePolicyTopic = AutoCreatePolicyTopic;
    }

    /**
     * Get Naming convention for dead letter and retry letter topics. `LEGACY` indicates to use the legacy naming convention, and `COMMUNITY` indicates to use the naming convention in the Pulsar community. 
     * @return PostFixPattern Naming convention for dead letter and retry letter topics. `LEGACY` indicates to use the legacy naming convention, and `COMMUNITY` indicates to use the naming convention in the Pulsar community.
     */
    public String getPostFixPattern() {
        return this.PostFixPattern;
    }

    /**
     * Set Naming convention for dead letter and retry letter topics. `LEGACY` indicates to use the legacy naming convention, and `COMMUNITY` indicates to use the naming convention in the Pulsar community.
     * @param PostFixPattern Naming convention for dead letter and retry letter topics. `LEGACY` indicates to use the legacy naming convention, and `COMMUNITY` indicates to use the naming convention in the Pulsar community.
     */
    public void setPostFixPattern(String PostFixPattern) {
        this.PostFixPattern = PostFixPattern;
    }

    public CreateSubscriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSubscriptionRequest(CreateSubscriptionRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.SubscriptionName != null) {
            this.SubscriptionName = new String(source.SubscriptionName);
        }
        if (source.IsIdempotent != null) {
            this.IsIdempotent = new Boolean(source.IsIdempotent);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AutoCreatePolicyTopic != null) {
            this.AutoCreatePolicyTopic = new Boolean(source.AutoCreatePolicyTopic);
        }
        if (source.PostFixPattern != null) {
            this.PostFixPattern = new String(source.PostFixPattern);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);
        this.setParamSimple(map, prefix + "IsIdempotent", this.IsIdempotent);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AutoCreatePolicyTopic", this.AutoCreatePolicyTopic);
        this.setParamSimple(map, prefix + "PostFixPattern", this.PostFixPattern);

    }
}

