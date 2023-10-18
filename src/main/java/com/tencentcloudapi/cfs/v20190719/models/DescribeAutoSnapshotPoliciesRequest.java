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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAutoSnapshotPoliciesRequest extends AbstractModel {

    /**
    * Snapshot policy ID
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * Page offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Page length
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filters
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Ascending or descending order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
     * Get Snapshot policy ID 
     * @return AutoSnapshotPolicyId Snapshot policy ID
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set Snapshot policy ID
     * @param AutoSnapshotPolicyId Snapshot policy ID
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Get Page offset 
     * @return Offset Page offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page offset
     * @param Offset Page offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Page length 
     * @return Limit Page length
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page length
     * @param Limit Page length
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filters 
     * @return Filters Filters
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters
     * @param Filters Filters
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Ascending or descending order 
     * @return Order Ascending or descending order
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Ascending or descending order
     * @param Order Ascending or descending order
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field 
     * @return OrderField Sorting field
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Sorting field
     * @param OrderField Sorting field
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    public DescribeAutoSnapshotPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAutoSnapshotPoliciesRequest(DescribeAutoSnapshotPoliciesRequest source) {
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
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
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);

    }
}

