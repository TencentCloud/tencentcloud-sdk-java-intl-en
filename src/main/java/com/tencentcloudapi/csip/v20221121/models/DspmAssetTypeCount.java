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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmAssetTypeCount extends AbstractModel {

    /**
    * Asset type
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Number of activations enabled for asset security analysis
    */
    @SerializedName("OpenCount")
    @Expose
    private Long OpenCount;

    /**
    * Number of activations being enabled for asset security analysis
    */
    @SerializedName("OpeningCount")
    @Expose
    private Long OpeningCount;

    /**
    * Number of assets whose security analysis is being disabled
    */
    @SerializedName("ClosingCount")
    @Expose
    private Long ClosingCount;

    /**
    * Number of activations not enabled for asset security analysis
    */
    @SerializedName("CloseCount")
    @Expose
    private Long CloseCount;

    /**
     * Get Asset type 
     * @return AssetType Asset type
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
     * @param AssetType Asset type
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Number of activations enabled for asset security analysis 
     * @return OpenCount Number of activations enabled for asset security analysis
     */
    public Long getOpenCount() {
        return this.OpenCount;
    }

    /**
     * Set Number of activations enabled for asset security analysis
     * @param OpenCount Number of activations enabled for asset security analysis
     */
    public void setOpenCount(Long OpenCount) {
        this.OpenCount = OpenCount;
    }

    /**
     * Get Number of activations being enabled for asset security analysis 
     * @return OpeningCount Number of activations being enabled for asset security analysis
     */
    public Long getOpeningCount() {
        return this.OpeningCount;
    }

    /**
     * Set Number of activations being enabled for asset security analysis
     * @param OpeningCount Number of activations being enabled for asset security analysis
     */
    public void setOpeningCount(Long OpeningCount) {
        this.OpeningCount = OpeningCount;
    }

    /**
     * Get Number of assets whose security analysis is being disabled 
     * @return ClosingCount Number of assets whose security analysis is being disabled
     */
    public Long getClosingCount() {
        return this.ClosingCount;
    }

    /**
     * Set Number of assets whose security analysis is being disabled
     * @param ClosingCount Number of assets whose security analysis is being disabled
     */
    public void setClosingCount(Long ClosingCount) {
        this.ClosingCount = ClosingCount;
    }

    /**
     * Get Number of activations not enabled for asset security analysis 
     * @return CloseCount Number of activations not enabled for asset security analysis
     */
    public Long getCloseCount() {
        return this.CloseCount;
    }

    /**
     * Set Number of activations not enabled for asset security analysis
     * @param CloseCount Number of activations not enabled for asset security analysis
     */
    public void setCloseCount(Long CloseCount) {
        this.CloseCount = CloseCount;
    }

    public DspmAssetTypeCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetTypeCount(DspmAssetTypeCount source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.OpenCount != null) {
            this.OpenCount = new Long(source.OpenCount);
        }
        if (source.OpeningCount != null) {
            this.OpeningCount = new Long(source.OpeningCount);
        }
        if (source.ClosingCount != null) {
            this.ClosingCount = new Long(source.ClosingCount);
        }
        if (source.CloseCount != null) {
            this.CloseCount = new Long(source.CloseCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "OpenCount", this.OpenCount);
        this.setParamSimple(map, prefix + "OpeningCount", this.OpeningCount);
        this.setParamSimple(map, prefix + "ClosingCount", this.ClosingCount);
        this.setParamSimple(map, prefix + "CloseCount", this.CloseCount);

    }
}

