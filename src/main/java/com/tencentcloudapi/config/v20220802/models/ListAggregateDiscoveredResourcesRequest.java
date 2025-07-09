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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAggregateDiscoveredResourcesRequest extends AbstractModel {

    /**
    * Items per Page
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * Account group ID
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * resourceName: Resource name; resourceId: Resource ID; resourceType: Resource type
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <Tag>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Next page token.
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * Sorting method asc, desc
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
     * Get Items per Page 
     * @return MaxResults Items per Page
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set Items per Page
     * @param MaxResults Items per Page
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get Account group ID 
     * @return AccountGroupId Account group ID
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set Account group ID
     * @param AccountGroupId Account group ID
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get resourceName: Resource name; resourceId: Resource ID; resourceType: Resource type 
     * @return Filters resourceName: Resource name; resourceId: Resource ID; resourceType: Resource type
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set resourceName: Resource name; resourceId: Resource ID; resourceType: Resource type
     * @param Filters resourceName: Resource name; resourceId: Resource ID; resourceType: Resource type
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <Tag> 
     * @return Tags <Tag>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <Tag>
     * @param Tags <Tag>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Next page token. 
     * @return NextToken Next page token.
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Next page token.
     * @param NextToken Next page token.
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get Sorting method asc, desc 
     * @return OrderType Sorting method asc, desc
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set Sorting method asc, desc
     * @param OrderType Sorting method asc, desc
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public ListAggregateDiscoveredResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAggregateDiscoveredResourcesRequest(ListAggregateDiscoveredResourcesRequest source) {
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

