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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupSummariesRequest extends AbstractModel {

    /**
    * TencentDB product type to be queried. Currently, only `mysql` is supported.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Paginated query offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum entries returned per page, which ranges from 1 to 100. Default value: `20`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting criterion. Valid values: `BackupVolume` (backup capacity), `DataBackupVolume` (data backup capacity), `BinlogBackupVolume` (log backup capacity), `AutoBackupVolume` (automatic backup capacity), `ManualBackupVolume` (manual backup capacity). Default value: `BackupVolume`.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting order. Valid values: `ASC` (ascending), `DESC` (descending). Default value: `ASC`.
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get TencentDB product type to be queried. Currently, only `mysql` is supported. 
     * @return Product TencentDB product type to be queried. Currently, only `mysql` is supported.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set TencentDB product type to be queried. Currently, only `mysql` is supported.
     * @param Product TencentDB product type to be queried. Currently, only `mysql` is supported.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Paginated query offset. Default value: `0`. 
     * @return Offset Paginated query offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paginated query offset. Default value: `0`.
     * @param Offset Paginated query offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum entries returned per page, which ranges from 1 to 100. Default value: `20`. 
     * @return Limit Maximum entries returned per page, which ranges from 1 to 100. Default value: `20`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum entries returned per page, which ranges from 1 to 100. Default value: `20`.
     * @param Limit Maximum entries returned per page, which ranges from 1 to 100. Default value: `20`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting criterion. Valid values: `BackupVolume` (backup capacity), `DataBackupVolume` (data backup capacity), `BinlogBackupVolume` (log backup capacity), `AutoBackupVolume` (automatic backup capacity), `ManualBackupVolume` (manual backup capacity). Default value: `BackupVolume`. 
     * @return OrderBy Sorting criterion. Valid values: `BackupVolume` (backup capacity), `DataBackupVolume` (data backup capacity), `BinlogBackupVolume` (log backup capacity), `AutoBackupVolume` (automatic backup capacity), `ManualBackupVolume` (manual backup capacity). Default value: `BackupVolume`.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting criterion. Valid values: `BackupVolume` (backup capacity), `DataBackupVolume` (data backup capacity), `BinlogBackupVolume` (log backup capacity), `AutoBackupVolume` (automatic backup capacity), `ManualBackupVolume` (manual backup capacity). Default value: `BackupVolume`.
     * @param OrderBy Sorting criterion. Valid values: `BackupVolume` (backup capacity), `DataBackupVolume` (data backup capacity), `BinlogBackupVolume` (log backup capacity), `AutoBackupVolume` (automatic backup capacity), `ManualBackupVolume` (manual backup capacity). Default value: `BackupVolume`.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting order. Valid values: `ASC` (ascending), `DESC` (descending). Default value: `ASC`. 
     * @return OrderDirection Sorting order. Valid values: `ASC` (ascending), `DESC` (descending). Default value: `ASC`.
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set Sorting order. Valid values: `ASC` (ascending), `DESC` (descending). Default value: `ASC`.
     * @param OrderDirection Sorting order. Valid values: `ASC` (ascending), `DESC` (descending). Default value: `ASC`.
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    public DescribeBackupSummariesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupSummariesRequest(DescribeBackupSummariesRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

