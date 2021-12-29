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
    * Topic type description:
0: general message;
1: globally sequential message;
2: partitionally sequential message;
3: retry letter queue;
4: dead letter queue;
5: transaction message.
    */
    @SerializedName("TopicType")
    @Expose
    private Long TopicType;

    /**
    * Pulsar cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * * TopicName
Query by topic name for exact search.
Type: String
Required: no
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
     * Get Topic type description:
0: general message;
1: globally sequential message;
2: partitionally sequential message;
3: retry letter queue;
4: dead letter queue;
5: transaction message. 
     * @return TopicType Topic type description:
0: general message;
1: globally sequential message;
2: partitionally sequential message;
3: retry letter queue;
4: dead letter queue;
5: transaction message.
     */
    public Long getTopicType() {
        return this.TopicType;
    }

    /**
     * Set Topic type description:
0: general message;
1: globally sequential message;
2: partitionally sequential message;
3: retry letter queue;
4: dead letter queue;
5: transaction message.
     * @param TopicType Topic type description:
0: general message;
1: globally sequential message;
2: partitionally sequential message;
3: retry letter queue;
4: dead letter queue;
5: transaction message.
     */
    public void setTopicType(Long TopicType) {
        this.TopicType = TopicType;
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
     * Get * TopicName
Query by topic name for exact search.
Type: String
Required: no 
     * @return Filters * TopicName
Query by topic name for exact search.
Type: String
Required: no
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set * TopicName
Query by topic name for exact search.
Type: String
Required: no
     * @param Filters * TopicName
Query by topic name for exact search.
Type: String
Required: no
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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

    }
}

