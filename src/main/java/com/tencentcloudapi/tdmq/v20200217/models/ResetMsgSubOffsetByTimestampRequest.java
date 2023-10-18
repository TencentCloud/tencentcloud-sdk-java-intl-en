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

public class ResetMsgSubOffsetByTimestampRequest extends AbstractModel {

    /**
    * Namespace name.
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
    * Subscriber name.
    */
    @SerializedName("Subscription")
    @Expose
    private String Subscription;

    /**
    * Timestamp, accurate down to the millisecond.
    */
    @SerializedName("ToTimestamp")
    @Expose
    private Long ToTimestamp;

    /**
    * Pulsar cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get Namespace name. 
     * @return EnvironmentId Namespace name.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Namespace name.
     * @param EnvironmentId Namespace name.
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
     * Get Subscriber name. 
     * @return Subscription Subscriber name.
     */
    public String getSubscription() {
        return this.Subscription;
    }

    /**
     * Set Subscriber name.
     * @param Subscription Subscriber name.
     */
    public void setSubscription(String Subscription) {
        this.Subscription = Subscription;
    }

    /**
     * Get Timestamp, accurate down to the millisecond. 
     * @return ToTimestamp Timestamp, accurate down to the millisecond.
     */
    public Long getToTimestamp() {
        return this.ToTimestamp;
    }

    /**
     * Set Timestamp, accurate down to the millisecond.
     * @param ToTimestamp Timestamp, accurate down to the millisecond.
     */
    public void setToTimestamp(Long ToTimestamp) {
        this.ToTimestamp = ToTimestamp;
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

    public ResetMsgSubOffsetByTimestampRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetMsgSubOffsetByTimestampRequest(ResetMsgSubOffsetByTimestampRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Subscription != null) {
            this.Subscription = new String(source.Subscription);
        }
        if (source.ToTimestamp != null) {
            this.ToTimestamp = new Long(source.ToTimestamp);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Subscription", this.Subscription);
        this.setParamSimple(map, prefix + "ToTimestamp", this.ToTimestamp);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

