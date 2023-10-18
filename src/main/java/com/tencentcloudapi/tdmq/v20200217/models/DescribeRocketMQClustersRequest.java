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

public class DescribeRocketMQClustersRequest extends AbstractModel {

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
    * Search by cluster ID.
    */
    @SerializedName("IdKeyword")
    @Expose
    private String IdKeyword;

    /**
    * Search by cluster name.
    */
    @SerializedName("NameKeyword")
    @Expose
    private String NameKeyword;

    /**
    * Filter by cluster ID.
    */
    @SerializedName("ClusterIdList")
    @Expose
    private String [] ClusterIdList;

    /**
    * For filtering by tag, this parameter must be set to `true`.
    */
    @SerializedName("IsTagFilter")
    @Expose
    private Boolean IsTagFilter;

    /**
    * Filter. Currently, you can filter only by tag.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
     * Get Search by cluster ID. 
     * @return IdKeyword Search by cluster ID.
     */
    public String getIdKeyword() {
        return this.IdKeyword;
    }

    /**
     * Set Search by cluster ID.
     * @param IdKeyword Search by cluster ID.
     */
    public void setIdKeyword(String IdKeyword) {
        this.IdKeyword = IdKeyword;
    }

    /**
     * Get Search by cluster name. 
     * @return NameKeyword Search by cluster name.
     */
    public String getNameKeyword() {
        return this.NameKeyword;
    }

    /**
     * Set Search by cluster name.
     * @param NameKeyword Search by cluster name.
     */
    public void setNameKeyword(String NameKeyword) {
        this.NameKeyword = NameKeyword;
    }

    /**
     * Get Filter by cluster ID. 
     * @return ClusterIdList Filter by cluster ID.
     */
    public String [] getClusterIdList() {
        return this.ClusterIdList;
    }

    /**
     * Set Filter by cluster ID.
     * @param ClusterIdList Filter by cluster ID.
     */
    public void setClusterIdList(String [] ClusterIdList) {
        this.ClusterIdList = ClusterIdList;
    }

    /**
     * Get For filtering by tag, this parameter must be set to `true`. 
     * @return IsTagFilter For filtering by tag, this parameter must be set to `true`.
     */
    public Boolean getIsTagFilter() {
        return this.IsTagFilter;
    }

    /**
     * Set For filtering by tag, this parameter must be set to `true`.
     * @param IsTagFilter For filtering by tag, this parameter must be set to `true`.
     */
    public void setIsTagFilter(Boolean IsTagFilter) {
        this.IsTagFilter = IsTagFilter;
    }

    /**
     * Get Filter. Currently, you can filter only by tag. 
     * @return Filters Filter. Currently, you can filter only by tag.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. Currently, you can filter only by tag.
     * @param Filters Filter. Currently, you can filter only by tag.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRocketMQClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQClustersRequest(DescribeRocketMQClustersRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.IdKeyword != null) {
            this.IdKeyword = new String(source.IdKeyword);
        }
        if (source.NameKeyword != null) {
            this.NameKeyword = new String(source.NameKeyword);
        }
        if (source.ClusterIdList != null) {
            this.ClusterIdList = new String[source.ClusterIdList.length];
            for (int i = 0; i < source.ClusterIdList.length; i++) {
                this.ClusterIdList[i] = new String(source.ClusterIdList[i]);
            }
        }
        if (source.IsTagFilter != null) {
            this.IsTagFilter = new Boolean(source.IsTagFilter);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "IdKeyword", this.IdKeyword);
        this.setParamSimple(map, prefix + "NameKeyword", this.NameKeyword);
        this.setParamArraySimple(map, prefix + "ClusterIdList.", this.ClusterIdList);
        this.setParamSimple(map, prefix + "IsTagFilter", this.IsTagFilter);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

