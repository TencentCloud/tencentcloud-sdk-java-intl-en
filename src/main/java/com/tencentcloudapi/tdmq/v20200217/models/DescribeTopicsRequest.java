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

public class DescribeTopicsRequest extends AbstractModel{

    /**
    * Environment (namespace) name.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Fuzzy match by topic name.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Offset, which defaults to 0 if left empty.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of results to be returned, which defaults to 10 if left empty. The maximum value is 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Topic type description:
0: Non-persistent and non-partitioned topic;
1: Non-persistent and partitioned topic;
2: Persistent and non-partitioned topic;
3: Persistent and partitioned topic.
    */
    @SerializedName("TopicType")
    @Expose
    private Long TopicType;

    /**
    * Pulsar cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * * TopicName
Query by topic name for exact search.
Type: String
Required: No
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Topic creator:
1: User
2: System
    */
    @SerializedName("TopicCreator")
    @Expose
    private Long TopicCreator;

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
     * Get Fuzzy match by topic name. 
     * @return TopicName Fuzzy match by topic name.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Fuzzy match by topic name.
     * @param TopicName Fuzzy match by topic name.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Offset, which defaults to 0 if left empty. 
     * @return Offset Offset, which defaults to 0 if left empty.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which defaults to 0 if left empty.
     * @param Offset Offset, which defaults to 0 if left empty.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of results to be returned, which defaults to 10 if left empty. The maximum value is 20. 
     * @return Limit The number of results to be returned, which defaults to 10 if left empty. The maximum value is 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of results to be returned, which defaults to 10 if left empty. The maximum value is 20.
     * @param Limit The number of results to be returned, which defaults to 10 if left empty. The maximum value is 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Topic type description:
0: Non-persistent and non-partitioned topic;
1: Non-persistent and partitioned topic;
2: Persistent and non-partitioned topic;
3: Persistent and partitioned topic. 
     * @return TopicType Topic type description:
0: Non-persistent and non-partitioned topic;
1: Non-persistent and partitioned topic;
2: Persistent and non-partitioned topic;
3: Persistent and partitioned topic.
     */
    public Long getTopicType() {
        return this.TopicType;
    }

    /**
     * Set Topic type description:
0: Non-persistent and non-partitioned topic;
1: Non-persistent and partitioned topic;
2: Persistent and non-partitioned topic;
3: Persistent and partitioned topic.
     * @param TopicType Topic type description:
0: Non-persistent and non-partitioned topic;
1: Non-persistent and partitioned topic;
2: Persistent and non-partitioned topic;
3: Persistent and partitioned topic.
     */
    public void setTopicType(Long TopicType) {
        this.TopicType = TopicType;
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
     * Get * TopicName
Query by topic name for exact search.
Type: String
Required: No 
     * @return Filters * TopicName
Query by topic name for exact search.
Type: String
Required: No
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set * TopicName
Query by topic name for exact search.
Type: String
Required: No
     * @param Filters * TopicName
Query by topic name for exact search.
Type: String
Required: No
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Topic creator:
1: User
2: System 
     * @return TopicCreator Topic creator:
1: User
2: System
     */
    public Long getTopicCreator() {
        return this.TopicCreator;
    }

    /**
     * Set Topic creator:
1: User
2: System
     * @param TopicCreator Topic creator:
1: User
2: System
     */
    public void setTopicCreator(Long TopicCreator) {
        this.TopicCreator = TopicCreator;
    }

    public DescribeTopicsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopicsRequest(DescribeTopicsRequest source) {
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
        if (source.TopicType != null) {
            this.TopicType = new Long(source.TopicType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.TopicCreator != null) {
            this.TopicCreator = new Long(source.TopicCreator);
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
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "TopicCreator", this.TopicCreator);

    }
}

