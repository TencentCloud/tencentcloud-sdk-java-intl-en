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
    * <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>(Filtering Conditions) Filter by topicName. Fuzzy query is supported.</p>
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * <p>Offset, which is 0 by default</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of returned results. Default value: 20. Value must be above 0.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Acl preset policy name</p>
    */
    @SerializedName("AclRuleName")
    @Expose
    private String AclRuleName;

    /**
    * <p>Sort by specific attributes (Currently supports PartitionNum/CreateTime). Default value is CreateTime.</p><p>If empty, default to reverse sort by CreateTime.</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>0-sequential, 1-reverse, default value is 0.</p>
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * <p>Currently supports filtering by ReplicaNum (number of replicas)</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p> 
     * @return InstanceId <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p>
     * @param InstanceId <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>(Filtering Conditions) Filter by topicName. Fuzzy query is supported.</p> 
     * @return SearchWord <p>(Filtering Conditions) Filter by topicName. Fuzzy query is supported.</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>(Filtering Conditions) Filter by topicName. Fuzzy query is supported.</p>
     * @param SearchWord <p>(Filtering Conditions) Filter by topicName. Fuzzy query is supported.</p>
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get <p>Offset, which is 0 by default</p> 
     * @return Offset <p>Offset, which is 0 by default</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset, which is 0 by default</p>
     * @param Offset <p>Offset, which is 0 by default</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of returned results. Default value: 20. Value must be above 0.</p> 
     * @return Limit <p>Number of returned results. Default value: 20. Value must be above 0.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returned results. Default value: 20. Value must be above 0.</p>
     * @param Limit <p>Number of returned results. Default value: 20. Value must be above 0.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Acl preset policy name</p> 
     * @return AclRuleName <p>Acl preset policy name</p>
     */
    public String getAclRuleName() {
        return this.AclRuleName;
    }

    /**
     * Set <p>Acl preset policy name</p>
     * @param AclRuleName <p>Acl preset policy name</p>
     */
    public void setAclRuleName(String AclRuleName) {
        this.AclRuleName = AclRuleName;
    }

    /**
     * Get <p>Sort by specific attributes (Currently supports PartitionNum/CreateTime). Default value is CreateTime.</p><p>If empty, default to reverse sort by CreateTime.</p> 
     * @return OrderBy <p>Sort by specific attributes (Currently supports PartitionNum/CreateTime). Default value is CreateTime.</p><p>If empty, default to reverse sort by CreateTime.</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>Sort by specific attributes (Currently supports PartitionNum/CreateTime). Default value is CreateTime.</p><p>If empty, default to reverse sort by CreateTime.</p>
     * @param OrderBy <p>Sort by specific attributes (Currently supports PartitionNum/CreateTime). Default value is CreateTime.</p><p>If empty, default to reverse sort by CreateTime.</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>0-sequential, 1-reverse, default value is 0.</p> 
     * @return OrderType <p>0-sequential, 1-reverse, default value is 0.</p>
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>0-sequential, 1-reverse, default value is 0.</p>
     * @param OrderType <p>0-sequential, 1-reverse, default value is 0.</p>
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>Currently supports filtering by ReplicaNum (number of replicas)</p> 
     * @return Filters <p>Currently supports filtering by ReplicaNum (number of replicas)</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Currently supports filtering by ReplicaNum (number of replicas)</p>
     * @param Filters <p>Currently supports filtering by ReplicaNum (number of replicas)</p>
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

