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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCompliancePeriodTaskListRequest extends AbstractModel {

    /**
    * Asset type. Valid values:
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset.
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Offset. Default value: `0`.
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
     * Get Asset type. Valid values:
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset. 
     * @return AssetType Asset type. Valid values:
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset.
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type. Valid values:
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset.
     * @param AssetType Asset type. Valid values:
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset.
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Offset. Default value: `0`. 
     * @return Offset Offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: `0`.
     * @param Offset Offset. Default value: `0`.
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

    public DescribeCompliancePeriodTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCompliancePeriodTaskListRequest(DescribeCompliancePeriodTaskListRequest source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

