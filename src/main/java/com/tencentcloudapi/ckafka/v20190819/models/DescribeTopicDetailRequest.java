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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopicDetailRequest extends AbstractModel {

    /**
    * The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1) api.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * (Filter) filter by `topicName`. Fuzzy search is supported
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * Offset. If this parameter is left empty, 0 will be used by default
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. default: 20. value must be above 0.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Name of the preset ACL rule.
    */
    @SerializedName("AclRuleName")
    @Expose
    private String AclRuleName;

    /**
    * Sorts based on specific attributes (currently supports PartitionNum/CreateTime). default value: CreateTime.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 0 - sequential, 1 - reverse order. default value: 0.
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * Currently supports ReplicaNum (number of replicas) filter criteria.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1) api. 
     * @return InstanceId The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1) api.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1) api.
     * @param InstanceId The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1) api.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get (Filter) filter by `topicName`. Fuzzy search is supported 
     * @return SearchWord (Filter) filter by `topicName`. Fuzzy search is supported
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set (Filter) filter by `topicName`. Fuzzy search is supported
     * @param SearchWord (Filter) filter by `topicName`. Fuzzy search is supported
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get Offset. If this parameter is left empty, 0 will be used by default 
     * @return Offset Offset. If this parameter is left empty, 0 will be used by default
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. If this parameter is left empty, 0 will be used by default
     * @param Offset Offset. If this parameter is left empty, 0 will be used by default
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. default: 20. value must be above 0. 
     * @return Limit Number of returned results. default: 20. value must be above 0.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. default: 20. value must be above 0.
     * @param Limit Number of returned results. default: 20. value must be above 0.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Name of the preset ACL rule. 
     * @return AclRuleName Name of the preset ACL rule.
     */
    public String getAclRuleName() {
        return this.AclRuleName;
    }

    /**
     * Set Name of the preset ACL rule.
     * @param AclRuleName Name of the preset ACL rule.
     */
    public void setAclRuleName(String AclRuleName) {
        this.AclRuleName = AclRuleName;
    }

    /**
     * Get Sorts based on specific attributes (currently supports PartitionNum/CreateTime). default value: CreateTime. 
     * @return OrderBy Sorts based on specific attributes (currently supports PartitionNum/CreateTime). default value: CreateTime.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorts based on specific attributes (currently supports PartitionNum/CreateTime). default value: CreateTime.
     * @param OrderBy Sorts based on specific attributes (currently supports PartitionNum/CreateTime). default value: CreateTime.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 0 - sequential, 1 - reverse order. default value: 0. 
     * @return OrderType 0 - sequential, 1 - reverse order. default value: 0.
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 0 - sequential, 1 - reverse order. default value: 0.
     * @param OrderType 0 - sequential, 1 - reverse order. default value: 0.
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get Currently supports ReplicaNum (number of replicas) filter criteria. 
     * @return Filters Currently supports ReplicaNum (number of replicas) filter criteria.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Currently supports ReplicaNum (number of replicas) filter criteria.
     * @param Filters Currently supports ReplicaNum (number of replicas) filter criteria.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeTopicDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopicDetailRequest(DescribeTopicDetailRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.AclRuleName != null) {
            this.AclRuleName = new String(source.AclRuleName);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "AclRuleName", this.AclRuleName);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

