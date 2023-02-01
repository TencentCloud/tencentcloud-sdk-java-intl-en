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

public class DescribeRocketMQGroupsRequest extends AbstractModel{

    /**
    * Cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Namespace.
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The max number of returned results.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Topic name, which can be used to query all subscription groups under the topic
    */
    @SerializedName("FilterTopic")
    @Expose
    private String FilterTopic;

    /**
    * Consumer group query by consumer group name. Fuzzy query is supported
    */
    @SerializedName("FilterGroup")
    @Expose
    private String FilterGroup;

    /**
    * Sort by specified field. Valid values: `tps`, `accumulative`.
    */
    @SerializedName("SortedBy")
    @Expose
    private String SortedBy;

    /**
    * Sort in ascending or descending order. Valid values: `asc`, `desc`.
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * Subscription group name. After it is specified, the information of only this subscription group will be returned.
    */
    @SerializedName("FilterOneGroup")
    @Expose
    private String FilterOneGroup;

    /**
    * Group type
    */
    @SerializedName("Types")
    @Expose
    private String [] Types;

    /**
     * Get Cluster ID. 
     * @return ClusterId Cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
     * @param ClusterId Cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Namespace. 
     * @return NamespaceId Namespace.
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set Namespace.
     * @param NamespaceId Namespace.
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The max number of returned results. 
     * @return Limit The max number of returned results.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The max number of returned results.
     * @param Limit The max number of returned results.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Topic name, which can be used to query all subscription groups under the topic 
     * @return FilterTopic Topic name, which can be used to query all subscription groups under the topic
     */
    public String getFilterTopic() {
        return this.FilterTopic;
    }

    /**
     * Set Topic name, which can be used to query all subscription groups under the topic
     * @param FilterTopic Topic name, which can be used to query all subscription groups under the topic
     */
    public void setFilterTopic(String FilterTopic) {
        this.FilterTopic = FilterTopic;
    }

    /**
     * Get Consumer group query by consumer group name. Fuzzy query is supported 
     * @return FilterGroup Consumer group query by consumer group name. Fuzzy query is supported
     */
    public String getFilterGroup() {
        return this.FilterGroup;
    }

    /**
     * Set Consumer group query by consumer group name. Fuzzy query is supported
     * @param FilterGroup Consumer group query by consumer group name. Fuzzy query is supported
     */
    public void setFilterGroup(String FilterGroup) {
        this.FilterGroup = FilterGroup;
    }

    /**
     * Get Sort by specified field. Valid values: `tps`, `accumulative`. 
     * @return SortedBy Sort by specified field. Valid values: `tps`, `accumulative`.
     */
    public String getSortedBy() {
        return this.SortedBy;
    }

    /**
     * Set Sort by specified field. Valid values: `tps`, `accumulative`.
     * @param SortedBy Sort by specified field. Valid values: `tps`, `accumulative`.
     */
    public void setSortedBy(String SortedBy) {
        this.SortedBy = SortedBy;
    }

    /**
     * Get Sort in ascending or descending order. Valid values: `asc`, `desc`. 
     * @return SortOrder Sort in ascending or descending order. Valid values: `asc`, `desc`.
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set Sort in ascending or descending order. Valid values: `asc`, `desc`.
     * @param SortOrder Sort in ascending or descending order. Valid values: `asc`, `desc`.
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get Subscription group name. After it is specified, the information of only this subscription group will be returned. 
     * @return FilterOneGroup Subscription group name. After it is specified, the information of only this subscription group will be returned.
     */
    public String getFilterOneGroup() {
        return this.FilterOneGroup;
    }

    /**
     * Set Subscription group name. After it is specified, the information of only this subscription group will be returned.
     * @param FilterOneGroup Subscription group name. After it is specified, the information of only this subscription group will be returned.
     */
    public void setFilterOneGroup(String FilterOneGroup) {
        this.FilterOneGroup = FilterOneGroup;
    }

    /**
     * Get Group type 
     * @return Types Group type
     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set Group type
     * @param Types Group type
     */
    public void setTypes(String [] Types) {
        this.Types = Types;
    }

    public DescribeRocketMQGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQGroupsRequest(DescribeRocketMQGroupsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FilterTopic != null) {
            this.FilterTopic = new String(source.FilterTopic);
        }
        if (source.FilterGroup != null) {
            this.FilterGroup = new String(source.FilterGroup);
        }
        if (source.SortedBy != null) {
            this.SortedBy = new String(source.SortedBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
        if (source.FilterOneGroup != null) {
            this.FilterOneGroup = new String(source.FilterOneGroup);
        }
        if (source.Types != null) {
            this.Types = new String[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new String(source.Types[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FilterTopic", this.FilterTopic);
        this.setParamSimple(map, prefix + "FilterGroup", this.FilterGroup);
        this.setParamSimple(map, prefix + "SortedBy", this.SortedBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamSimple(map, prefix + "FilterOneGroup", this.FilterOneGroup);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);

    }
}

