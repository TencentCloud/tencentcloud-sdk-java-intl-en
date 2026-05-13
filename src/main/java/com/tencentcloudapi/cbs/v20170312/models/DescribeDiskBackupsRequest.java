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

public class DescribeDiskBackupsRequest extends AbstractModel {

    /**
    * List of IDs of the backup points to be queried. `DiskBackupIds` and `Filters` cannot be specified at the same time.
    */
    @SerializedName("DiskBackupIds")
    @Expose
    private String [] DiskBackupIds;

    /**
    * Filter criteria. parameters must not be specified simultaneously for DiskBackupIds and Filters. filter conditions:<br><li>disk-backup-id - Array of String - required: no - (filter condition) Filters by backup point id. backup point id format: dbp-11112222.</li><br><li>disk-id - Array of String - required: no - (filter condition) Filters by cloud disk id where the backup point was created. cloud disk id format: disk-srftydert.</li><br><li>disk-usage - Array of String - required: no - (filter condition) Filters by cloud disk type (SYSTEM_disk: represents SYSTEM disk | DATA_disk: represents DATA disk).</li>.
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
    * Specifies the sorting order of the CBS backup point list. default: ASC. valid values: <br><li>ASC: ascending order</li><br><li>DESC: descending order.</li>.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Field on which the list of cloud disk backup points is sorted. valid values: <br><li>CREATE_TIME: sort by creation TIME of the cloud disk backup point</li><br>sort by creation TIME by default.
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
     * Get Filter criteria. parameters must not be specified simultaneously for DiskBackupIds and Filters. filter conditions:<br><li>disk-backup-id - Array of String - required: no - (filter condition) Filters by backup point id. backup point id format: dbp-11112222.</li><br><li>disk-id - Array of String - required: no - (filter condition) Filters by cloud disk id where the backup point was created. cloud disk id format: disk-srftydert.</li><br><li>disk-usage - Array of String - required: no - (filter condition) Filters by cloud disk type (SYSTEM_disk: represents SYSTEM disk | DATA_disk: represents DATA disk).</li>. 
     * @return Filters Filter criteria. parameters must not be specified simultaneously for DiskBackupIds and Filters. filter conditions:<br><li>disk-backup-id - Array of String - required: no - (filter condition) Filters by backup point id. backup point id format: dbp-11112222.</li><br><li>disk-id - Array of String - required: no - (filter condition) Filters by cloud disk id where the backup point was created. cloud disk id format: disk-srftydert.</li><br><li>disk-usage - Array of String - required: no - (filter condition) Filters by cloud disk type (SYSTEM_disk: represents SYSTEM disk | DATA_disk: represents DATA disk).</li>.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. parameters must not be specified simultaneously for DiskBackupIds and Filters. filter conditions:<br><li>disk-backup-id - Array of String - required: no - (filter condition) Filters by backup point id. backup point id format: dbp-11112222.</li><br><li>disk-id - Array of String - required: no - (filter condition) Filters by cloud disk id where the backup point was created. cloud disk id format: disk-srftydert.</li><br><li>disk-usage - Array of String - required: no - (filter condition) Filters by cloud disk type (SYSTEM_disk: represents SYSTEM disk | DATA_disk: represents DATA disk).</li>.
     * @param Filters Filter criteria. parameters must not be specified simultaneously for DiskBackupIds and Filters. filter conditions:<br><li>disk-backup-id - Array of String - required: no - (filter condition) Filters by backup point id. backup point id format: dbp-11112222.</li><br><li>disk-id - Array of String - required: no - (filter condition) Filters by cloud disk id where the backup point was created. cloud disk id format: disk-srftydert.</li><br><li>disk-usage - Array of String - required: no - (filter condition) Filters by cloud disk type (SYSTEM_disk: represents SYSTEM disk | DATA_disk: represents DATA disk).</li>.
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
     * Get Specifies the sorting order of the CBS backup point list. default: ASC. valid values: <br><li>ASC: ascending order</li><br><li>DESC: descending order.</li>. 
     * @return Order Specifies the sorting order of the CBS backup point list. default: ASC. valid values: <br><li>ASC: ascending order</li><br><li>DESC: descending order.</li>.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Specifies the sorting order of the CBS backup point list. default: ASC. valid values: <br><li>ASC: ascending order</li><br><li>DESC: descending order.</li>.
     * @param Order Specifies the sorting order of the CBS backup point list. default: ASC. valid values: <br><li>ASC: ascending order</li><br><li>DESC: descending order.</li>.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Field on which the list of cloud disk backup points is sorted. valid values: <br><li>CREATE_TIME: sort by creation TIME of the cloud disk backup point</li><br>sort by creation TIME by default. 
     * @return OrderField Field on which the list of cloud disk backup points is sorted. valid values: <br><li>CREATE_TIME: sort by creation TIME of the cloud disk backup point</li><br>sort by creation TIME by default.
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Field on which the list of cloud disk backup points is sorted. valid values: <br><li>CREATE_TIME: sort by creation TIME of the cloud disk backup point</li><br>sort by creation TIME by default.
     * @param OrderField Field on which the list of cloud disk backup points is sorted. valid values: <br><li>CREATE_TIME: sort by creation TIME of the cloud disk backup point</li><br>sort by creation TIME by default.
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

