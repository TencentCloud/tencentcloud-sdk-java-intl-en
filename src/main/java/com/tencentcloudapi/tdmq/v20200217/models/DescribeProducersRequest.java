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

public class DescribeProducersRequest extends AbstractModel{

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
    * Offset. If this parameter is left empty, 0 will be used by default.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Fuzzy match by producer name.
    */
    @SerializedName("ProducerName")
    @Expose
    private String ProducerName;

    /**
    * Pulsar cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

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
     * Get Offset. If this parameter is left empty, 0 will be used by default. 
     * @return Offset Offset. If this parameter is left empty, 0 will be used by default.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. If this parameter is left empty, 0 will be used by default.
     * @param Offset Offset. If this parameter is left empty, 0 will be used by default.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 20. 
     * @return Limit Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 20.
     * @param Limit Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Fuzzy match by producer name. 
     * @return ProducerName Fuzzy match by producer name.
     */
    public String getProducerName() {
        return this.ProducerName;
    }

    /**
     * Set Fuzzy match by producer name.
     * @param ProducerName Fuzzy match by producer name.
     */
    public void setProducerName(String ProducerName) {
        this.ProducerName = ProducerName;
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

    public DescribeProducersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProducersRequest(DescribeProducersRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ProducerName != null) {
            this.ProducerName = new String(source.ProducerName);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ProducerName", this.ProducerName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

