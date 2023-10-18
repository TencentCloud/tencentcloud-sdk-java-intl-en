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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiskBackupsRequest extends AbstractModel {

    /**
    * List of IDs of the backup points to be queried. `DiskBackupIds` and `Filters` cannot be specified at the same time.
    */
    @SerializedName("DiskBackupIds")
    @Expose
    private String [] DiskBackupIds;

    /**
    * Filter. `DiskBackupIds` and `Filters` cannot be specified at the same time. Valid values: <br><li>disk-backup-id - Array of String - Required: No - (Filter) Filter by backup point ID in the format of `dbp-11112222`.
<br><li>disk-id - Array of String - Required: No - (Filter) Filter by ID of the cloud disk for which backup points are created.
<br><li>disk-usage - Array of String - Required: No - (Filter) Filter by type of the cloud disk for which backup points are created. (SYSTEM_DISK: System disk | DATA_DISK: Data disk)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default value: 0. For more information on `Offset`, see the relevant section of the API [Overview](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section of the API [Overview](https://intl.cloud.tencent.com/document/product/362/15633?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting order of cloud disk backup points. Valid values:<br><li>ASC: Ascending<br><li>DESC: Descending
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * The field by which cloud disk backup points are sorted. Valid values:<br><li>CREATE_TIME: Sort by creation time<br>Backup points are sorted by creation time by default.
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
     * Get List of IDs of the backup points to be queried. `DiskBackupIds` and `Filters` cannot be specified at the same time. 
     * @return DiskBackupIds List of IDs of the backup points to be queried. `DiskBackupIds` and `Filters` cannot be specified at the same time.
     */
    public String [] getDiskBackupIds() {
        return this.DiskBackupIds;
    }

    /**
     * Set List of IDs of the backup points to be queried. `DiskBackupIds` and `Filters` cannot be specified at the same time.
     * @param DiskBackupIds List of IDs of the backup points to be queried. `DiskBackupIds` and `Filters` cannot be specified at the same time.
     */
    public void setDiskBackupIds(String [] DiskBackupIds) {
        this.DiskBackupIds = DiskBackupIds;
    }

    /**
     * Get Filter. `DiskBackupIds` and `Filters` cannot be specified at the same time. Valid values: <br><li>disk-backup-id - Array of String - Required: No - (Filter) Filter by backup point ID in the format of `dbp-11112222`.
<br><li>disk-id - Array of String - Required: No - (Filter) Filter by ID of the cloud disk for which backup points are created.
<br><li>disk-usage - Array of String - Required: No - (Filter) Filter by type of the cloud disk for which backup points are created. (SYSTEM_DISK: System disk | DATA_DISK: Data disk) 
     * @return Filters Filter. `DiskBackupIds` and `Filters` cannot be specified at the same time. Valid values: <br><li>disk-backup-id - Array of String - Required: No - (Filter) Filter by backup point ID in the format of `dbp-11112222`.
<br><li>disk-id - Array of String - Required: No - (Filter) Filter by ID of the cloud disk for which backup points are created.
<br><li>disk-usage - Array of String - Required: No - (Filter) Filter by type of the cloud disk for which backup points are created. (SYSTEM_DISK: System disk | DATA_DISK: Data disk)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. `DiskBackupIds` and `Filters` cannot be specified at the same time. Valid values: <br><li>disk-backup-id - Array of String - Required: No - (Filter) Filter by backup point ID in the format of `dbp-11112222`.
<br><li>disk-id - Array of String - Required: No - (Filter) Filter by ID of the cloud disk for which backup points are created.
<br><li>disk-usage - Array of String - Required: No - (Filter) Filter by type of the cloud disk for which backup points are created. (SYSTEM_DISK: System disk | DATA_DISK: Data disk)
     * @param Filters Filter. `DiskBackupIds` and `Filters` cannot be specified at the same time. Valid values: <br><li>disk-backup-id - Array of String - Required: No - (Filter) Filter by backup point ID in the format of `dbp-11112222`.
<br><li>disk-id - Array of String - Required: No - (Filter) Filter by ID of the cloud disk for which backup points are created.
<br><li>disk-usage - Array of String - Required: No - (Filter) Filter by type of the cloud disk for which backup points are created. (SYSTEM_DISK: System disk | DATA_DISK: Data disk)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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
     * Get Sorting order of cloud disk backup points. Valid values:<br><li>ASC: Ascending<br><li>DESC: Descending 
     * @return Order Sorting order of cloud disk backup points. Valid values:<br><li>ASC: Ascending<br><li>DESC: Descending
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order of cloud disk backup points. Valid values:<br><li>ASC: Ascending<br><li>DESC: Descending
     * @param Order Sorting order of cloud disk backup points. Valid values:<br><li>ASC: Ascending<br><li>DESC: Descending
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get The field by which cloud disk backup points are sorted. Valid values:<br><li>CREATE_TIME: Sort by creation time<br>Backup points are sorted by creation time by default. 
     * @return OrderField The field by which cloud disk backup points are sorted. Valid values:<br><li>CREATE_TIME: Sort by creation time<br>Backup points are sorted by creation time by default.
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set The field by which cloud disk backup points are sorted. Valid values:<br><li>CREATE_TIME: Sort by creation time<br>Backup points are sorted by creation time by default.
     * @param OrderField The field by which cloud disk backup points are sorted. Valid values:<br><li>CREATE_TIME: Sort by creation time<br>Backup points are sorted by creation time by default.
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    public DescribeDiskBackupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiskBackupsRequest(DescribeDiskBackupsRequest source) {
        if (source.DiskBackupIds != null) {
            this.DiskBackupIds = new String[source.DiskBackupIds.length];
            for (int i = 0; i < source.DiskBackupIds.length; i++) {
                this.DiskBackupIds[i] = new String(source.DiskBackupIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskBackupIds.", this.DiskBackupIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);

    }
}

