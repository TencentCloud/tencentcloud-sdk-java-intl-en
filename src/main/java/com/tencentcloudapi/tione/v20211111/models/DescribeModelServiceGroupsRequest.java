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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelServiceGroupsRequest extends AbstractModel {

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. The default value is 20, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The sorting order of the output list. Valid values: ASC (ascending order) and DESC (descending order).
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Field to sort by. Valid values: CreateTime and UpdateTime.
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * Pagination parameters. Supported filterable field names include:["ClusterId", "ServiceId", "ServiceGroupName", "ServiceGroupId","Status","CreatedBy","ModelVersionId"]
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Tag filtering parameters.
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * Service classification.
    */
    @SerializedName("ServiceCategory")
    @Expose
    private String ServiceCategory;

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. The default value is 20, and the maximum value is 100. 
     * @return Limit Number of returned results. The default value is 20, and the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. The default value is 20, and the maximum value is 100.
     * @param Limit Number of returned results. The default value is 20, and the maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The sorting order of the output list. Valid values: ASC (ascending order) and DESC (descending order). 
     * @return Order The sorting order of the output list. Valid values: ASC (ascending order) and DESC (descending order).
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set The sorting order of the output list. Valid values: ASC (ascending order) and DESC (descending order).
     * @param Order The sorting order of the output list. Valid values: ASC (ascending order) and DESC (descending order).
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Field to sort by. Valid values: CreateTime and UpdateTime. 
     * @return OrderField Field to sort by. Valid values: CreateTime and UpdateTime.
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Field to sort by. Valid values: CreateTime and UpdateTime.
     * @param OrderField Field to sort by. Valid values: CreateTime and UpdateTime.
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get Pagination parameters. Supported filterable field names include:["ClusterId", "ServiceId", "ServiceGroupName", "ServiceGroupId","Status","CreatedBy","ModelVersionId"] 
     * @return Filters Pagination parameters. Supported filterable field names include:["ClusterId", "ServiceId", "ServiceGroupName", "ServiceGroupId","Status","CreatedBy","ModelVersionId"]
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Pagination parameters. Supported filterable field names include:["ClusterId", "ServiceId", "ServiceGroupName", "ServiceGroupId","Status","CreatedBy","ModelVersionId"]
     * @param Filters Pagination parameters. Supported filterable field names include:["ClusterId", "ServiceId", "ServiceGroupName", "ServiceGroupId","Status","CreatedBy","ModelVersionId"]
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Tag filtering parameters. 
     * @return TagFilters Tag filtering parameters.
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set Tag filtering parameters.
     * @param TagFilters Tag filtering parameters.
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get Service classification. 
     * @return ServiceCategory Service classification.
     */
    public String getServiceCategory() {
        return this.ServiceCategory;
    }

    /**
     * Set Service classification.
     * @param ServiceCategory Service classification.
     */
    public void setServiceCategory(String ServiceCategory) {
        this.ServiceCategory = ServiceCategory;
    }

    public DescribeModelServiceGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelServiceGroupsRequest(DescribeModelServiceGroupsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
        if (source.ServiceCategory != null) {
            this.ServiceCategory = new String(source.ServiceCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "ServiceCategory", this.ServiceCategory);

    }
}

