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

public class DescribeSnapshotsRequest extends AbstractModel {

    /**
    * List of snapshot IDs to be queried. The parameter does not support specifying both `SnapshotIds` and `Filters`.
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String [] SnapshotIds;

    /**
    * Filter criteria. parameters `SnapshotIds` and `Filters` cannot be specified at the same time.<br><ul><li>snapshot-id<ul><li>filter by cloud disk snapshot id</li><li>type: String</li><li>required: no</li></ul></li><li>snapshot-name<ul><li>filter by cloud disk snapshot name</li><li>type: String</li><li>required: no</li></ul></li><li>snapshot-state<ul><li>filter by cloud disk snapshot status</li><li>type: String</li><li>required: no</li><li>value ranges FROM:<ul><li><code>NORMAL</code>: NORMAL</li><li><code>CREATING</code>: CREATING</li><li><code>ROLLBACKING</code>: rolling back</li><li><code>COPYING_FROM_REMOTE</code>: cross geo-replication in progress</li><li><code>CHECKING_COPIED</code>: COPYING check in progress</li><li><code>TORECYCLE</code>: pending recycling</li></ul></li></ul></li><li>disk-usage<ul><li>filter by cloud disk usage purpose</li><li>type: String</li><li>required: no</li><li>value ranges FROM:<ul><li><code>SYSTEM_disk</code>: represent SYSTEM disk</li><li><code>DATA_disk</code>: represent DATA disk</li></ul></li></ul></li><li>project-id<ul><li>filter by cloud disk project id</li><li>type: String</li><li>required: no</li></ul></li><li>disk-id<ul><li>filter by cloud disk id. up to 10 values can be specified</li><li>type: String</li><li>required: no</li></ul></li><li>encrypt<ul><li>filter by whether encrypted or not</li><li>type: String</li><li>required: no</li></ul></li><li>snapshot-type<ul><li>query by snapshot ownership type</li><li>type: String</li><li>required: no</li><li>value ranges FROM:<ul><li><code>SHARED_snapshot</code>: refer to SHARED snapshot</li><li><code>PRIVATE_snapshot</code>: refer to own PRIVATE snapshot</li></ul></li></ul></li></ul>.
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
    * Field based on which the snapshot list is sorted. valid values:.
<ul>
<Li>CREATE_TIME: specifies to sort by snapshot creation time.</li>.
<Li>Sort by creation time by default.</li>.
</ul>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * Offset. Default is 0. For more information on `Offset`, please see relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Outputs the sorting order of the cloud disk list. valid values:.
<ul>
<Li>ASC: specifies ascending order.</li>.
<Li>DESC: specifies sorting in descending order.</li>.
</ul>

    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get List of snapshot IDs to be queried. The parameter does not support specifying both `SnapshotIds` and `Filters`. 
     * @return SnapshotIds List of snapshot IDs to be queried. The parameter does not support specifying both `SnapshotIds` and `Filters`.
     */
    public String [] getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * Set List of snapshot IDs to be queried. The parameter does not support specifying both `SnapshotIds` and `Filters`.
     * @param SnapshotIds List of snapshot IDs to be queried. The parameter does not support specifying both `SnapshotIds` and `Filters`.
     */
    public void setSnapshotIds(String [] SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
    }

    /**
     * Get Filter criteria. parameters `SnapshotIds` and `Filters` cannot be specified at the same time.<br><ul><li>snapshot-id<ul><li>filter by cloud disk snapshot id</li><li>type: String</li><li>required: no</li></ul></li><li>snapshot-name<ul><li>filter by cloud disk snapshot name</li><li>type: String</li><li>required: no</li></ul></li><li>snapshot-state<ul><li>filter by cloud disk snapshot status</li><li>type: String</li><li>required: no</li><li>value ranges FROM:<ul><li><code>NORMAL</code>: NORMAL</li><li><code>CREATING</code>: CREATING</li><li><code>ROLLBACKING</code>: rolling back</li><li><code>COPYING_FROM_REMOTE</code>: cross geo-replication in progress</li><li><code>CHECKING_COPIED</code>: COPYING check in progress</li><li><code>TORECYCLE</code>: pending recycling</li></ul></li></ul></li><li>disk-usage<ul><li>filter by cloud disk usage purpose</li><li>type: String</li><li>required: no</li><li>value ranges FROM:<ul><li><code>SYSTEM_disk</code>: represent SYSTEM disk</li><li><code>DATA_disk</code>: represent DATA disk</li></ul></li></ul></li><li>project-id<ul><li>filter by cloud disk project id</li><li>type: String</li><li>required: no</li></ul></li><li>disk-id<ul><li>filter by cloud disk id. up to 10 values can be specified</li><li>type: String</li><li>required: no</li></ul></li><li>encrypt<ul><li>filter by whether encrypted or not</li><li>type: String</li><li>required: no</li></ul></li><li>snapshot-type<ul><li>query by snapshot ownership type</li><li>type: String</li><li>required: no</li><li>value ranges FROM:<ul><li><code>SHARED_snapshot</code>: refer to SHARED snapshot</li><li><code>PRIVATE_snapshot</code>: refer to own PRIVATE snapshot</li></ul></li></ul></li></ul>. 
     * @return Filters Filter criteria. parameters `SnapshotIds` and `Filters` cannot be specified at the same time.<br><ul><li>snapshot-id<ul><li>filter by cloud disk snapshot id</li><li>type: String</li><li>required: no</li></ul></li><li>snapshot-name<ul><li>filter by cloud disk snapshot name</li><li>type: String</li><li>required: no</li></ul></li><li>snapshot-state<ul><li>filter by cloud disk snapshot status</li><li>type: String</li><li>required: no</li><li>value ranges FROM:<ul><li><code>NORMAL</code>: NORMAL</li><li><code>CREATING</code>: CREATING</li><li><code>ROLLBACKING</code>: rolling back</li><li><code>COPYING_FROM_REMOTE</code>: cross geo-replication in progress</li><li><code>CHECKING_COPIED</code>: COPYING check in progress</li><li><code>TORECYCLE</code>: pending recycling</li></ul></li></ul></li><li>disk-usage<ul><li>filter by cloud disk usage purpose</li><li>type: String</li><li>required: no</li><li>value ranges FROM:<ul><li><code>SYSTEM_disk</code>: represent SYSTEM disk</li><li><code>DATA_disk</code>: represent DATA disk</li></ul></li></ul></li><li>project-id<ul><li>filter by cloud disk project id</li><li>type: String</li><li>required: no</li></ul></li><li>disk-id<ul><li>filter by cloud disk id. up to 10 values can be specified</li><li>type: String</li><li>required: no</li></ul></li><li>encrypt<ul><li>filter by whether encrypted or not</li><li>type: String</li><li>required: no</li></ul></li><li>snapshot-type<ul><li>query by snapshot ownership type</li><li>type: String</li><li>required: no</li><li>value ranges FROM:<ul><li><code>SHARED_snapshot</code>: refer to SHARED snapshot</li><li><code>PRIVATE_snapshot</code>: refer to own PRIVATE snapshot</li></ul></li></ul></li></ul>.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. parameters `SnapshotIds` and `Filters` cannot be specified at the same time.<br><ul><li>snapshot-id<ul><li>filter by cloud disk snapshot id</li><li>type: String</li><li>required: no</li></ul></li><li>snapshot-name<ul><li>filter by cloud disk snapshot name</li><li>type: String</li><li>required: no</li></ul></li><li>snapshot-state<ul><li>filter by cloud disk snapshot status</li><li>type: String</li><li>required: no</li><li>value ranges FROM:<ul><li><code>NORMAL</code>: NORMAL</li><li><code>CREATING</code>: CREATING</li><li><code>ROLLBACKING</code>: rolling back</li><li><code>COPYING_FROM_REMOTE</code>: cross geo-replication in progress</li><li><code>CHECKING_COPIED</code>: COPYING check in progress</li><li><code>TORECYCLE</code>: pending recycling</li></ul></li></ul></li><li>disk-usage<ul><li>filter by cloud disk usage purpose</li><li>type: String</li><li>required: no</li><li>value ranges FROM:<ul><li><code>SYSTEM_disk</code>: represent SYSTEM disk</li><li><code>DATA_disk</code>: represent DATA disk</li></ul></li></ul></li><li>project-id<ul><li>filter by cloud disk project id</li><li>type: String</li><li>required: no</li></ul></li><li>disk-id<ul><li>filter by cloud disk id. up to 10 values can be specified</li><li>type: String</li><li>required: no</li></ul></li><li>encrypt<ul><li>filter by whether encrypted or not</li><li>type: String</li><li>required: no</li></ul></li><li>snapshot-type<ul><li>query by snapshot ownership type</li><li>type: String</li><li>required: no</li><li>value ranges FROM:<ul><li><code>SHARED_snapshot</code>: refer to SHARED snapshot</li><li><code>PRIVATE_snapshot</code>: refer to own PRIVATE snapshot</li></ul></li></ul></li></ul>.
     * @param Filters Filter criteria. parameters `SnapshotIds` and `Filters` cannot be specified at the same time.<br><ul><li>snapshot-id<ul><li>filter by cloud disk snapshot id</li><li>type: String</li><li>required: no</li></ul></li><li>snapshot-name<ul><li>filter by cloud disk snapshot name</li><li>type: String</li><li>required: no</li></ul></li><li>snapshot-state<ul><li>filter by cloud disk snapshot status</li><li>type: String</li><li>required: no</li><li>value ranges FROM:<ul><li><code>NORMAL</code>: NORMAL</li><li><code>CREATING</code>: CREATING</li><li><code>ROLLBACKING</code>: rolling back</li><li><code>COPYING_FROM_REMOTE</code>: cross geo-replication in progress</li><li><code>CHECKING_COPIED</code>: COPYING check in progress</li><li><code>TORECYCLE</code>: pending recycling</li></ul></li></ul></li><li>disk-usage<ul><li>filter by cloud disk usage purpose</li><li>type: String</li><li>required: no</li><li>value ranges FROM:<ul><li><code>SYSTEM_disk</code>: represent SYSTEM disk</li><li><code>DATA_disk</code>: represent DATA disk</li></ul></li></ul></li><li>project-id<ul><li>filter by cloud disk project id</li><li>type: String</li><li>required: no</li></ul></li><li>disk-id<ul><li>filter by cloud disk id. up to 10 values can be specified</li><li>type: String</li><li>required: no</li></ul></li><li>encrypt<ul><li>filter by whether encrypted or not</li><li>type: String</li><li>required: no</li></ul></li><li>snapshot-type<ul><li>query by snapshot ownership type</li><li>type: String</li><li>required: no</li><li>value ranges FROM:<ul><li><code>SHARED_snapshot</code>: refer to SHARED snapshot</li><li><code>PRIVATE_snapshot</code>: refer to own PRIVATE snapshot</li></ul></li></ul></li></ul>.
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
     * Get Field based on which the snapshot list is sorted. valid values:.
<ul>
<Li>CREATE_TIME: specifies to sort by snapshot creation time.</li>.
<Li>Sort by creation time by default.</li>.
</ul> 
     * @return OrderField Field based on which the snapshot list is sorted. valid values:.
<ul>
<Li>CREATE_TIME: specifies to sort by snapshot creation time.</li>.
<Li>Sort by creation time by default.</li>.
</ul>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Field based on which the snapshot list is sorted. valid values:.
<ul>
<Li>CREATE_TIME: specifies to sort by snapshot creation time.</li>.
<Li>Sort by creation time by default.</li>.
</ul>
     * @param OrderField Field based on which the snapshot list is sorted. valid values:.
<ul>
<Li>CREATE_TIME: specifies to sort by snapshot creation time.</li>.
<Li>Sort by creation time by default.</li>.
</ul>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
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
     * Get Outputs the sorting order of the cloud disk list. valid values:.
<ul>
<Li>ASC: specifies ascending order.</li>.
<Li>DESC: specifies sorting in descending order.</li>.
</ul>
 
     * @return Order Outputs the sorting order of the cloud disk list. valid values:.
<ul>
<Li>ASC: specifies ascending order.</li>.
<Li>DESC: specifies sorting in descending order.</li>.
</ul>

     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Outputs the sorting order of the cloud disk list. valid values:.
<ul>
<Li>ASC: specifies ascending order.</li>.
<Li>DESC: specifies sorting in descending order.</li>.
</ul>

     * @param Order Outputs the sorting order of the cloud disk list. valid values:.
<ul>
<Li>ASC: specifies ascending order.</li>.
<Li>DESC: specifies sorting in descending order.</li>.
</ul>

     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeSnapshotsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotsRequest(DescribeSnapshotsRequest source) {
        if (source.SnapshotIds != null) {
            this.SnapshotIds = new String[source.SnapshotIds.length];
            for (int i = 0; i < source.SnapshotIds.length; i++) {
                this.SnapshotIds[i] = new String(source.SnapshotIds[i]);
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
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SnapshotIds.", this.SnapshotIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

