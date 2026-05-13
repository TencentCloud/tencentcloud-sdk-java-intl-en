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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAutoSnapshotPoliciesRequest extends AbstractModel {

    /**
    * List of scheduled snapshot policy IDs to be queried. The parameter does not support specifying both `SnapshotIds` and `Filters`.
    */
    @SerializedName("AutoSnapshotPolicyIds")
    @Expose
    private String [] AutoSnapshotPolicyIds;

    /**
    * Filter criteria. AutoSnapshotPolicyIds and Filters cannot be specified at the same time.
<li>auto-snapshot-policy-id - Array of String - required: no - (filter condition) filter by regular snapshot policy id. regular snapshot policy id such as: `asp-3stvwfxx`.</li>.
<li>AutoSnapshotPolicyState - Array of String - required: no - (filter condition) filters by the status of the regular snapshot policy. regular snapshot policy ID format: `asp-3stvwfxx`. (NORMAL: NORMAL | ISOLATED: ISOLATED).</li>.
<li>AutoSnapshotPolicyName - Array of String - required: no - (filter condition) filters by the name of the regular snapshot policy.</li>.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of results to be returned. Default is 20. Maximum is 100. For more information on `Limit`, please see relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default is 0. For more information on `Offset`, please see relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Specifies the output order of the regular snapshot list. valid values: <br><li>ASC: ascending order<br></li><li>DESC: descending order.</li>.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * The sorting filter applied to the scheduled snapshot list. Value range: <Sort by creation time of scheduled snapshot. By default, this is sorted by creation time.
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
     * Get List of scheduled snapshot policy IDs to be queried. The parameter does not support specifying both `SnapshotIds` and `Filters`. 
     * @return AutoSnapshotPolicyIds List of scheduled snapshot policy IDs to be queried. The parameter does not support specifying both `SnapshotIds` and `Filters`.
     */
    public String [] getAutoSnapshotPolicyIds() {
        return this.AutoSnapshotPolicyIds;
    }

    /**
     * Set List of scheduled snapshot policy IDs to be queried. The parameter does not support specifying both `SnapshotIds` and `Filters`.
     * @param AutoSnapshotPolicyIds List of scheduled snapshot policy IDs to be queried. The parameter does not support specifying both `SnapshotIds` and `Filters`.
     */
    public void setAutoSnapshotPolicyIds(String [] AutoSnapshotPolicyIds) {
        this.AutoSnapshotPolicyIds = AutoSnapshotPolicyIds;
    }

    /**
     * Get Filter criteria. AutoSnapshotPolicyIds and Filters cannot be specified at the same time.
<li>auto-snapshot-policy-id - Array of String - required: no - (filter condition) filter by regular snapshot policy id. regular snapshot policy id such as: `asp-3stvwfxx`.</li>.
<li>AutoSnapshotPolicyState - Array of String - required: no - (filter condition) filters by the status of the regular snapshot policy. regular snapshot policy ID format: `asp-3stvwfxx`. (NORMAL: NORMAL | ISOLATED: ISOLATED).</li>.
<li>AutoSnapshotPolicyName - Array of String - required: no - (filter condition) filters by the name of the regular snapshot policy.</li>. 
     * @return Filters Filter criteria. AutoSnapshotPolicyIds and Filters cannot be specified at the same time.
<li>auto-snapshot-policy-id - Array of String - required: no - (filter condition) filter by regular snapshot policy id. regular snapshot policy id such as: `asp-3stvwfxx`.</li>.
<li>AutoSnapshotPolicyState - Array of String - required: no - (filter condition) filters by the status of the regular snapshot policy. regular snapshot policy ID format: `asp-3stvwfxx`. (NORMAL: NORMAL | ISOLATED: ISOLATED).</li>.
<li>AutoSnapshotPolicyName - Array of String - required: no - (filter condition) filters by the name of the regular snapshot policy.</li>.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. AutoSnapshotPolicyIds and Filters cannot be specified at the same time.
<li>auto-snapshot-policy-id - Array of String - required: no - (filter condition) filter by regular snapshot policy id. regular snapshot policy id such as: `asp-3stvwfxx`.</li>.
<li>AutoSnapshotPolicyState - Array of String - required: no - (filter condition) filters by the status of the regular snapshot policy. regular snapshot policy ID format: `asp-3stvwfxx`. (NORMAL: NORMAL | ISOLATED: ISOLATED).</li>.
<li>AutoSnapshotPolicyName - Array of String - required: no - (filter condition) filters by the name of the regular snapshot policy.</li>.
     * @param Filters Filter criteria. AutoSnapshotPolicyIds and Filters cannot be specified at the same time.
<li>auto-snapshot-policy-id - Array of String - required: no - (filter condition) filter by regular snapshot policy id. regular snapshot policy id such as: `asp-3stvwfxx`.</li>.
<li>AutoSnapshotPolicyState - Array of String - required: no - (filter condition) filters by the status of the regular snapshot policy. regular snapshot policy ID format: `asp-3stvwfxx`. (NORMAL: NORMAL | ISOLATED: ISOLATED).</li>.
<li>AutoSnapshotPolicyName - Array of String - required: no - (filter condition) filters by the name of the regular snapshot policy.</li>.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of results to be returned. Default is 20. Maximum is 100. For more information on `Limit`, please see relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1). 
     * @return Limit Number of results to be returned. Default is 20. Maximum is 100. For more information on `Limit`, please see relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Default is 20. Maximum is 100. For more information on `Limit`, please see relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
     * @param Limit Number of results to be returned. Default is 20. Maximum is 100. For more information on `Limit`, please see relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default is 0. For more information on `Offset`, please see relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1). 
     * @return Offset Offset. Default is 0. For more information on `Offset`, please see relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default is 0. For more information on `Offset`, please see relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
     * @param Offset Offset. Default is 0. For more information on `Offset`, please see relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Specifies the output order of the regular snapshot list. valid values: <br><li>ASC: ascending order<br></li><li>DESC: descending order.</li>. 
     * @return Order Specifies the output order of the regular snapshot list. valid values: <br><li>ASC: ascending order<br></li><li>DESC: descending order.</li>.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Specifies the output order of the regular snapshot list. valid values: <br><li>ASC: ascending order<br></li><li>DESC: descending order.</li>.
     * @param Order Specifies the output order of the regular snapshot list. valid values: <br><li>ASC: ascending order<br></li><li>DESC: descending order.</li>.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get The sorting filter applied to the scheduled snapshot list. Value range: <Sort by creation time of scheduled snapshot. By default, this is sorted by creation time. 
     * @return OrderField The sorting filter applied to the scheduled snapshot list. Value range: <Sort by creation time of scheduled snapshot. By default, this is sorted by creation time.
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set The sorting filter applied to the scheduled snapshot list. Value range: <Sort by creation time of scheduled snapshot. By default, this is sorted by creation time.
     * @param OrderField The sorting filter applied to the scheduled snapshot list. Value range: <Sort by creation time of scheduled snapshot. By default, this is sorted by creation time.
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
        if (source.AutoSnapshotPolicyIds != null) {
            this.AutoSnapshotPolicyIds = new String[source.AutoSnapshotPolicyIds.length];
            for (int i = 0; i < source.AutoSnapshotPolicyIds.length; i++) {
                this.AutoSnapshotPolicyIds[i] = new String(source.AutoSnapshotPolicyIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamArraySimple(map, prefix + "AutoSnapshotPolicyIds.", this.AutoSnapshotPolicyIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);

    }
}

