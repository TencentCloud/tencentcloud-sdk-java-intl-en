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

public class DspmSecurityAnalyseStatusCount extends AbstractModel {

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
    * Asset security analysis status statistics grouped by asset type
    */
    @SerializedName("AssetTypeCountSet")
    @Expose
    private DspmAssetTypeCount [] AssetTypeCountSet;

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

    /**
     * Get Asset security analysis status statistics grouped by asset type 
     * @return AssetTypeCountSet Asset security analysis status statistics grouped by asset type
     */
    public DspmAssetTypeCount [] getAssetTypeCountSet() {
        return this.AssetTypeCountSet;
    }

    /**
     * Set Asset security analysis status statistics grouped by asset type
     * @param AssetTypeCountSet Asset security analysis status statistics grouped by asset type
     */
    public void setAssetTypeCountSet(DspmAssetTypeCount [] AssetTypeCountSet) {
        this.AssetTypeCountSet = AssetTypeCountSet;
    }

    public DspmSecurityAnalyseStatusCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmSecurityAnalyseStatusCount(DspmSecurityAnalyseStatusCount source) {
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
        if (source.AssetTypeCountSet != null) {
            this.AssetTypeCountSet = new DspmAssetTypeCount[source.AssetTypeCountSet.length];
            for (int i = 0; i < source.AssetTypeCountSet.length; i++) {
                this.AssetTypeCountSet[i] = new DspmAssetTypeCount(source.AssetTypeCountSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenCount", this.OpenCount);
        this.setParamSimple(map, prefix + "OpeningCount", this.OpeningCount);
        this.setParamSimple(map, prefix + "ClosingCount", this.ClosingCount);
        this.setParamSimple(map, prefix + "CloseCount", this.CloseCount);
        this.setParamArrayObj(map, prefix + "AssetTypeCountSet.", this.AssetTypeCountSet);

    }
}

