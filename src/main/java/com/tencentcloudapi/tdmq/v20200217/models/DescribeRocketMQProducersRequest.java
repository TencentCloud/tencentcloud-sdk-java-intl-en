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

public class DescribeRocketMQProducersRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Namespace
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * Topic name
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Pagination Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Query filter criteria list. supports the following filter parameters:.

-ClientId: specifies the producer client ID.
-ClientIp: specifies the producer client IP.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
     * Get Namespace 
     * @return NamespaceId Namespace
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set Namespace
     * @param NamespaceId Namespace
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get Topic name 
     * @return Topic Topic name
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Topic name
     * @param Topic Topic name
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Pagination Offset 
     * @return Offset Pagination Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination Offset
     * @param Offset Pagination Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination Limit 
     * @return Limit Pagination Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination Limit
     * @param Limit Pagination Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Query filter criteria list. supports the following filter parameters:.

-ClientId: specifies the producer client ID.
-ClientIp: specifies the producer client IP. 
     * @return Filters Query filter criteria list. supports the following filter parameters:.

-ClientId: specifies the producer client ID.
-ClientIp: specifies the producer client IP.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query filter criteria list. supports the following filter parameters:.

-ClientId: specifies the producer client ID.
-ClientIp: specifies the producer client IP.
     * @param Filters Query filter criteria list. supports the following filter parameters:.

-ClientId: specifies the producer client ID.
-ClientIp: specifies the producer client IP.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRocketMQProducersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQProducersRequest(DescribeRocketMQProducersRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

