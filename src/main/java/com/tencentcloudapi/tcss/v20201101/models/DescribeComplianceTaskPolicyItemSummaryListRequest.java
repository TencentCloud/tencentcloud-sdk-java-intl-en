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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComplianceTaskPolicyItemSummaryListRequest extends AbstractModel {

    /**
    * Asset type, which indicates to only query check items related to the specified asset type.

`ASSET_CONTAINER`: Container.

`ASSET_IMAGE`: Image.

`ASSET_HOST`: Server.

`ASSET_K8S`: K8s asset.
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Initial offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned. Default value: `10`. Maximum value: `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter
Name - String
Name. Valid values: `ItemType`, `StandardId`, `RiskLevel`.
`ClusterName` is also available for K8s assets.
    */
    @SerializedName("Filters")
    @Expose
    private ComplianceFilters [] Filters;

    /**
     * Get Asset type, which indicates to only query check items related to the specified asset type.

`ASSET_CONTAINER`: Container.

`ASSET_IMAGE`: Image.

`ASSET_HOST`: Server.

`ASSET_K8S`: K8s asset. 
     * @return AssetType Asset type, which indicates to only query check items related to the specified asset type.

`ASSET_CONTAINER`: Container.

`ASSET_IMAGE`: Image.

`ASSET_HOST`: Server.

`ASSET_K8S`: K8s asset.
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type, which indicates to only query check items related to the specified asset type.

`ASSET_CONTAINER`: Container.

`ASSET_IMAGE`: Image.

`ASSET_HOST`: Server.

`ASSET_K8S`: K8s asset.
     * @param AssetType Asset type, which indicates to only query check items related to the specified asset type.

`ASSET_CONTAINER`: Container.

`ASSET_IMAGE`: Image.

`ASSET_HOST`: Server.

`ASSET_K8S`: K8s asset.
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Initial offset. Default value: `0`. 
     * @return Offset Initial offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Initial offset. Default value: `0`.
     * @param Offset Initial offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be returned. Default value: `10`. Maximum value: `100`. 
     * @return Limit Number of results to be returned. Default value: `10`. Maximum value: `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Default value: `10`. Maximum value: `100`.
     * @param Limit Number of results to be returned. Default value: `10`. Maximum value: `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter
Name - String
Name. Valid values: `ItemType`, `StandardId`, `RiskLevel`.
`ClusterName` is also available for K8s assets. 
     * @return Filters Filter
Name - String
Name. Valid values: `ItemType`, `StandardId`, `RiskLevel`.
`ClusterName` is also available for K8s assets.
     */
    public ComplianceFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
Name - String
Name. Valid values: `ItemType`, `StandardId`, `RiskLevel`.
`ClusterName` is also available for K8s assets.
     * @param Filters Filter
Name - String
Name. Valid values: `ItemType`, `StandardId`, `RiskLevel`.
`ClusterName` is also available for K8s assets.
     */
    public void setFilters(ComplianceFilters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeComplianceTaskPolicyItemSummaryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComplianceTaskPolicyItemSummaryListRequest(DescribeComplianceTaskPolicyItemSummaryListRequest source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new ComplianceFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ComplianceFilters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

