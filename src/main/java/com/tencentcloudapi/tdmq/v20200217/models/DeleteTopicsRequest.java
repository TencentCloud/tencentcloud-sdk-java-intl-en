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

public class DeleteTopicsRequest extends AbstractModel{

    /**
    * Topic set. Up to 20 topics can be deleted at a time.
    */
    @SerializedName("TopicSets")
    @Expose
    private TopicRecord [] TopicSets;

    /**
    * Pulsar cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Environment (namespace) name.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Whether to forcibly delete a topic. Default value: `false`.
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get Topic set. Up to 20 topics can be deleted at a time. 
     * @return TopicSets Topic set. Up to 20 topics can be deleted at a time.
     */
    public TopicRecord [] getTopicSets() {
        return this.TopicSets;
    }

    /**
     * Set Topic set. Up to 20 topics can be deleted at a time.
     * @param TopicSets Topic set. Up to 20 topics can be deleted at a time.
     */
    public void setTopicSets(TopicRecord [] TopicSets) {
        this.TopicSets = TopicSets;
    }

    /**
     * Get Pulsar cluster ID. 
     * @return ClusterId Pulsar cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Pulsar cluster ID.
     * @param ClusterId Pulsar cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

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
     * Get Whether to forcibly delete a topic. Default value: `false`. 
     * @return Force Whether to forcibly delete a topic. Default value: `false`.
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set Whether to forcibly delete a topic. Default value: `false`.
     * @param Force Whether to forcibly delete a topic. Default value: `false`.
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    public DeleteTopicsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTopicsRequest(DeleteTopicsRequest source) {
        if (source.TopicSets != null) {
            this.TopicSets = new TopicRecord[source.TopicSets.length];
            for (int i = 0; i < source.TopicSets.length; i++) {
                this.TopicSets[i] = new TopicRecord(source.TopicSets[i]);
            }
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TopicSets.", this.TopicSets);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

