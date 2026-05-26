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

public class DescribeDiskStoragePoolRequest extends AbstractModel {

    /**
    * Number of returned results, defaults to 20 with a maximum value of 100. For further introduction about `Limit`, see relevant sections in the API [overview](/document/product/362/15633).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Specify the exclusive cluster ID list you want to query. This parameter cannot be used with Filters.

    */
    @SerializedName("CdcIds")
    @Expose
    private String [] CdcIds;

    /**
    * Filter conditions. `CdcIds` and `Filters` cannot be specified at the same time. <br><li>cdc-id - Array of String - Optional - Filter by the cluster ID. <br><li>zone - Array of String - Optional - Filter by the [availability zone](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo) where the cluster resides. <br><li>cage-id - Array of String - Optional - Filter by the ID of the cage where the cluster resides. <br><li>disk-type - Array of string - Optional - Filter by the media type of cloud disks (`CLOUD_BASIC`: HDD cloud disk | `CLOUD_PREMIUM`: Premium cloud disk. | `CLOUD_SSD`: SSD cloud disk.)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset, defaults to 0. For further introduction about `Offset`, see the relevant sections in the API [overview](/document/product/362/15633).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Number of returned results, defaults to 20 with a maximum value of 100. For further introduction about `Limit`, see relevant sections in the API [overview](/document/product/362/15633). 
     * @return Limit Number of returned results, defaults to 20 with a maximum value of 100. For further introduction about `Limit`, see relevant sections in the API [overview](/document/product/362/15633).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results, defaults to 20 with a maximum value of 100. For further introduction about `Limit`, see relevant sections in the API [overview](/document/product/362/15633).
     * @param Limit Number of returned results, defaults to 20 with a maximum value of 100. For further introduction about `Limit`, see relevant sections in the API [overview](/document/product/362/15633).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Specify the exclusive cluster ID list you want to query. This parameter cannot be used with Filters.
 
     * @return CdcIds Specify the exclusive cluster ID list you want to query. This parameter cannot be used with Filters.

     */
    public String [] getCdcIds() {
        return this.CdcIds;
    }

    /**
     * Set Specify the exclusive cluster ID list you want to query. This parameter cannot be used with Filters.

     * @param CdcIds Specify the exclusive cluster ID list you want to query. This parameter cannot be used with Filters.

     */
    public void setCdcIds(String [] CdcIds) {
        this.CdcIds = CdcIds;
    }

    /**
     * Get Filter conditions. `CdcIds` and `Filters` cannot be specified at the same time. <br><li>cdc-id - Array of String - Optional - Filter by the cluster ID. <br><li>zone - Array of String - Optional - Filter by the [availability zone](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo) where the cluster resides. <br><li>cage-id - Array of String - Optional - Filter by the ID of the cage where the cluster resides. <br><li>disk-type - Array of string - Optional - Filter by the media type of cloud disks (`CLOUD_BASIC`: HDD cloud disk | `CLOUD_PREMIUM`: Premium cloud disk. | `CLOUD_SSD`: SSD cloud disk.) 
     * @return Filters Filter conditions. `CdcIds` and `Filters` cannot be specified at the same time. <br><li>cdc-id - Array of String - Optional - Filter by the cluster ID. <br><li>zone - Array of String - Optional - Filter by the [availability zone](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo) where the cluster resides. <br><li>cage-id - Array of String - Optional - Filter by the ID of the cage where the cluster resides. <br><li>disk-type - Array of string - Optional - Filter by the media type of cloud disks (`CLOUD_BASIC`: HDD cloud disk | `CLOUD_PREMIUM`: Premium cloud disk. | `CLOUD_SSD`: SSD cloud disk.)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions. `CdcIds` and `Filters` cannot be specified at the same time. <br><li>cdc-id - Array of String - Optional - Filter by the cluster ID. <br><li>zone - Array of String - Optional - Filter by the [availability zone](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo) where the cluster resides. <br><li>cage-id - Array of String - Optional - Filter by the ID of the cage where the cluster resides. <br><li>disk-type - Array of string - Optional - Filter by the media type of cloud disks (`CLOUD_BASIC`: HDD cloud disk | `CLOUD_PREMIUM`: Premium cloud disk. | `CLOUD_SSD`: SSD cloud disk.)
     * @param Filters Filter conditions. `CdcIds` and `Filters` cannot be specified at the same time. <br><li>cdc-id - Array of String - Optional - Filter by the cluster ID. <br><li>zone - Array of String - Optional - Filter by the [availability zone](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo) where the cluster resides. <br><li>cage-id - Array of String - Optional - Filter by the ID of the cage where the cluster resides. <br><li>disk-type - Array of string - Optional - Filter by the media type of cloud disks (`CLOUD_BASIC`: HDD cloud disk | `CLOUD_PREMIUM`: Premium cloud disk. | `CLOUD_SSD`: SSD cloud disk.)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset, defaults to 0. For further introduction about `Offset`, see the relevant sections in the API [overview](/document/product/362/15633). 
     * @return Offset Offset, defaults to 0. For further introduction about `Offset`, see the relevant sections in the API [overview](/document/product/362/15633).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, defaults to 0. For further introduction about `Offset`, see the relevant sections in the API [overview](/document/product/362/15633).
     * @param Offset Offset, defaults to 0. For further introduction about `Offset`, see the relevant sections in the API [overview](/document/product/362/15633).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeDiskStoragePoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiskStoragePoolRequest(DescribeDiskStoragePoolRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.CdcIds != null) {
            this.CdcIds = new String[source.CdcIds.length];
            for (int i = 0; i < source.CdcIds.length; i++) {
                this.CdcIds[i] = new String(source.CdcIds[i]);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "CdcIds.", this.CdcIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

