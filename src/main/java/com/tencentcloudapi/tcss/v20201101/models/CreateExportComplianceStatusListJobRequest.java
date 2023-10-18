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

public class CreateExportComplianceStatusListJobRequest extends AbstractModel {

    /**
    * Asset type of the information to be exported
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Export by check item or asset. Valid values: `true` (export by asset); `false` (export by check item).
    */
    @SerializedName("ExportByAsset")
    @Expose
    private Boolean ExportByAsset;

    /**
    * Valid values: `true` (export all); `false` (export based on the `IdList`).
    */
    @SerializedName("ExportAll")
    @Expose
    private Boolean ExportAll;

    /**
    * List of IDs of assets or check items to be exported, which is determined by the value of `ExportByAsset`.
    */
    @SerializedName("IdList")
    @Expose
    private Long [] IdList;

    /**
     * Get Asset type of the information to be exported 
     * @return AssetType Asset type of the information to be exported
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type of the information to be exported
     * @param AssetType Asset type of the information to be exported
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Export by check item or asset. Valid values: `true` (export by asset); `false` (export by check item). 
     * @return ExportByAsset Export by check item or asset. Valid values: `true` (export by asset); `false` (export by check item).
     */
    public Boolean getExportByAsset() {
        return this.ExportByAsset;
    }

    /**
     * Set Export by check item or asset. Valid values: `true` (export by asset); `false` (export by check item).
     * @param ExportByAsset Export by check item or asset. Valid values: `true` (export by asset); `false` (export by check item).
     */
    public void setExportByAsset(Boolean ExportByAsset) {
        this.ExportByAsset = ExportByAsset;
    }

    /**
     * Get Valid values: `true` (export all); `false` (export based on the `IdList`). 
     * @return ExportAll Valid values: `true` (export all); `false` (export based on the `IdList`).
     */
    public Boolean getExportAll() {
        return this.ExportAll;
    }

    /**
     * Set Valid values: `true` (export all); `false` (export based on the `IdList`).
     * @param ExportAll Valid values: `true` (export all); `false` (export based on the `IdList`).
     */
    public void setExportAll(Boolean ExportAll) {
        this.ExportAll = ExportAll;
    }

    /**
     * Get List of IDs of assets or check items to be exported, which is determined by the value of `ExportByAsset`. 
     * @return IdList List of IDs of assets or check items to be exported, which is determined by the value of `ExportByAsset`.
     */
    public Long [] getIdList() {
        return this.IdList;
    }

    /**
     * Set List of IDs of assets or check items to be exported, which is determined by the value of `ExportByAsset`.
     * @param IdList List of IDs of assets or check items to be exported, which is determined by the value of `ExportByAsset`.
     */
    public void setIdList(Long [] IdList) {
        this.IdList = IdList;
    }

    public CreateExportComplianceStatusListJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateExportComplianceStatusListJobRequest(CreateExportComplianceStatusListJobRequest source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.ExportByAsset != null) {
            this.ExportByAsset = new Boolean(source.ExportByAsset);
        }
        if (source.ExportAll != null) {
            this.ExportAll = new Boolean(source.ExportAll);
        }
        if (source.IdList != null) {
            this.IdList = new Long[source.IdList.length];
            for (int i = 0; i < source.IdList.length; i++) {
                this.IdList[i] = new Long(source.IdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "ExportByAsset", this.ExportByAsset);
        this.setParamSimple(map, prefix + "ExportAll", this.ExportAll);
        this.setParamArraySimple(map, prefix + "IdList.", this.IdList);

    }
}

