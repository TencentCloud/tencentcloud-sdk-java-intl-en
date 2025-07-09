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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotsRequest extends AbstractModel {

    /**
    * List of IDs of the snapshots to be queried. `SnapshotIds` and `Filters` cannot be specified at the same time.
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String [] SnapshotIds;

    /**
    * Filter. `SnapshotIds` and `Filters` cannot be specified at the same time.<br><li>snapshot-id - Array of String - Required: no - (Filter) Filter by snapshot ID, such as `snap-11112222`.<br><li>snapshot-name - Array of String - Required: no - (Filter) Filter by snapshot name.<br><li>snapshot-state - Array of String - Required: no - (Filter) Filter by snapshot status. NORMAL: normal; CREATING: creating; ROLLBACKING: rolling back.<br><li>disk-usage - Array of String - Required: no - (Filter) Filter by the type of the cloud disk from which a snapshot is created. SYSTEM_DISK: system disk; DATA_DISK: data disk.<br><li>project-id  - Array of String - Required: no - (Filter) Filter by the project ID of the cloud disk.<br><li>disk-id  - Array of String - Required: no - (Filter) Filter by the ID of the cloud disk from which a snapshot is created.<br><li>zone - Array of String - Required: no - (Filter) Filter by [AZ](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo).<br><li>encrypt - Array of String - Required: no - (Filter) Filter by whether a snapshot is created from an encrypted cloud disk. TRUE: yes; FALSE: no.
<li>snapshot-type- Array of String - Required: no - (Filter) Filter by the snapshot type specified in `snapshot-type`.
(SHARED_SNAPSHOT: shared snapshot | PRIVATE_SNAPSHOT: private snapshot.)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section of the API [Overview](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Field by which snapshots are sorted. Valid values:<br><li>CREATE_TIME: sort by snapshot creation time<br>Snapshots are sorted by creation time by default.
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * Offset. Default value: 0. For more information on `Offset`, see the relevant section of the API [Overview](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting order of cloud disks. Valid values:<br><li>ASC: ascending<br><li>DESC: descending.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get List of IDs of the snapshots to be queried. `SnapshotIds` and `Filters` cannot be specified at the same time. 
     * @return SnapshotIds List of IDs of the snapshots to be queried. `SnapshotIds` and `Filters` cannot be specified at the same time.
     */
    public String [] getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * Set List of IDs of the snapshots to be queried. `SnapshotIds` and `Filters` cannot be specified at the same time.
     * @param SnapshotIds List of IDs of the snapshots to be queried. `SnapshotIds` and `Filters` cannot be specified at the same time.
     */
    public void setSnapshotIds(String [] SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
    }

    /**
     * Get Filter. `SnapshotIds` and `Filters` cannot be specified at the same time.<br><li>snapshot-id - Array of String - Required: no - (Filter) Filter by snapshot ID, such as `snap-11112222`.<br><li>snapshot-name - Array of String - Required: no - (Filter) Filter by snapshot name.<br><li>snapshot-state - Array of String - Required: no - (Filter) Filter by snapshot status. NORMAL: normal; CREATING: creating; ROLLBACKING: rolling back.<br><li>disk-usage - Array of String - Required: no - (Filter) Filter by the type of the cloud disk from which a snapshot is created. SYSTEM_DISK: system disk; DATA_DISK: data disk.<br><li>project-id  - Array of String - Required: no - (Filter) Filter by the project ID of the cloud disk.<br><li>disk-id  - Array of String - Required: no - (Filter) Filter by the ID of the cloud disk from which a snapshot is created.<br><li>zone - Array of String - Required: no - (Filter) Filter by [AZ](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo).<br><li>encrypt - Array of String - Required: no - (Filter) Filter by whether a snapshot is created from an encrypted cloud disk. TRUE: yes; FALSE: no.
<li>snapshot-type- Array of String - Required: no - (Filter) Filter by the snapshot type specified in `snapshot-type`.
(SHARED_SNAPSHOT: shared snapshot | PRIVATE_SNAPSHOT: private snapshot.) 
     * @return Filters Filter. `SnapshotIds` and `Filters` cannot be specified at the same time.<br><li>snapshot-id - Array of String - Required: no - (Filter) Filter by snapshot ID, such as `snap-11112222`.<br><li>snapshot-name - Array of String - Required: no - (Filter) Filter by snapshot name.<br><li>snapshot-state - Array of String - Required: no - (Filter) Filter by snapshot status. NORMAL: normal; CREATING: creating; ROLLBACKING: rolling back.<br><li>disk-usage - Array of String - Required: no - (Filter) Filter by the type of the cloud disk from which a snapshot is created. SYSTEM_DISK: system disk; DATA_DISK: data disk.<br><li>project-id  - Array of String - Required: no - (Filter) Filter by the project ID of the cloud disk.<br><li>disk-id  - Array of String - Required: no - (Filter) Filter by the ID of the cloud disk from which a snapshot is created.<br><li>zone - Array of String - Required: no - (Filter) Filter by [AZ](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo).<br><li>encrypt - Array of String - Required: no - (Filter) Filter by whether a snapshot is created from an encrypted cloud disk. TRUE: yes; FALSE: no.
<li>snapshot-type- Array of String - Required: no - (Filter) Filter by the snapshot type specified in `snapshot-type`.
(SHARED_SNAPSHOT: shared snapshot | PRIVATE_SNAPSHOT: private snapshot.)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. `SnapshotIds` and `Filters` cannot be specified at the same time.<br><li>snapshot-id - Array of String - Required: no - (Filter) Filter by snapshot ID, such as `snap-11112222`.<br><li>snapshot-name - Array of String - Required: no - (Filter) Filter by snapshot name.<br><li>snapshot-state - Array of String - Required: no - (Filter) Filter by snapshot status. NORMAL: normal; CREATING: creating; ROLLBACKING: rolling back.<br><li>disk-usage - Array of String - Required: no - (Filter) Filter by the type of the cloud disk from which a snapshot is created. SYSTEM_DISK: system disk; DATA_DISK: data disk.<br><li>project-id  - Array of String - Required: no - (Filter) Filter by the project ID of the cloud disk.<br><li>disk-id  - Array of String - Required: no - (Filter) Filter by the ID of the cloud disk from which a snapshot is created.<br><li>zone - Array of String - Required: no - (Filter) Filter by [AZ](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo).<br><li>encrypt - Array of String - Required: no - (Filter) Filter by whether a snapshot is created from an encrypted cloud disk. TRUE: yes; FALSE: no.
<li>snapshot-type- Array of String - Required: no - (Filter) Filter by the snapshot type specified in `snapshot-type`.
(SHARED_SNAPSHOT: shared snapshot | PRIVATE_SNAPSHOT: private snapshot.)
     * @param Filters Filter. `SnapshotIds` and `Filters` cannot be specified at the same time.<br><li>snapshot-id - Array of String - Required: no - (Filter) Filter by snapshot ID, such as `snap-11112222`.<br><li>snapshot-name - Array of String - Required: no - (Filter) Filter by snapshot name.<br><li>snapshot-state - Array of String - Required: no - (Filter) Filter by snapshot status. NORMAL: normal; CREATING: creating; ROLLBACKING: rolling back.<br><li>disk-usage - Array of String - Required: no - (Filter) Filter by the type of the cloud disk from which a snapshot is created. SYSTEM_DISK: system disk; DATA_DISK: data disk.<br><li>project-id  - Array of String - Required: no - (Filter) Filter by the project ID of the cloud disk.<br><li>disk-id  - Array of String - Required: no - (Filter) Filter by the ID of the cloud disk from which a snapshot is created.<br><li>zone - Array of String - Required: no - (Filter) Filter by [AZ](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo).<br><li>encrypt - Array of String - Required: no - (Filter) Filter by whether a snapshot is created from an encrypted cloud disk. TRUE: yes; FALSE: no.
<li>snapshot-type- Array of String - Required: no - (Filter) Filter by the snapshot type specified in `snapshot-type`.
(SHARED_SNAPSHOT: shared snapshot | PRIVATE_SNAPSHOT: private snapshot.)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section of the API [Overview](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1). 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section of the API [Overview](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section of the API [Overview](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section of the API [Overview](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Field by which snapshots are sorted. Valid values:<br><li>CREATE_TIME: sort by snapshot creation time<br>Snapshots are sorted by creation time by default. 
     * @return OrderField Field by which snapshots are sorted. Valid values:<br><li>CREATE_TIME: sort by snapshot creation time<br>Snapshots are sorted by creation time by default.
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Field by which snapshots are sorted. Valid values:<br><li>CREATE_TIME: sort by snapshot creation time<br>Snapshots are sorted by creation time by default.
     * @param OrderField Field by which snapshots are sorted. Valid values:<br><li>CREATE_TIME: sort by snapshot creation time<br>Snapshots are sorted by creation time by default.
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get Offset. Default value: 0. For more information on `Offset`, see the relevant section of the API [Overview](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1). 
     * @return Offset Offset. Default value: 0. For more information on `Offset`, see the relevant section of the API [Overview](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0. For more information on `Offset`, see the relevant section of the API [Overview](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
     * @param Offset Offset. Default value: 0. For more information on `Offset`, see the relevant section of the API [Overview](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting order of cloud disks. Valid values:<br><li>ASC: ascending<br><li>DESC: descending. 
     * @return Order Sorting order of cloud disks. Valid values:<br><li>ASC: ascending<br><li>DESC: descending.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order of cloud disks. Valid values:<br><li>ASC: ascending<br><li>DESC: descending.
     * @param Order Sorting order of cloud disks. Valid values:<br><li>ASC: ascending<br><li>DESC: descending.
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

