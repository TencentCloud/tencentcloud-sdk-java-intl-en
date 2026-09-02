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

public class AssetTypeStatisticsInfo extends AbstractModel {

    /**
    * <p>Asset type count</p>
    */
    @SerializedName("AssetTypeCount")
    @Expose
    private Long AssetTypeCount;

    /**
    * <p>Number of asset types with existing risks</p>
    */
    @SerializedName("RiskAssetTypeCount")
    @Expose
    private Long RiskAssetTypeCount;

    /**
     * Get <p>Asset type count</p> 
     * @return AssetTypeCount <p>Asset type count</p>
     */
    public Long getAssetTypeCount() {
        return this.AssetTypeCount;
    }

    /**
     * Set <p>Asset type count</p>
     * @param AssetTypeCount <p>Asset type count</p>
     */
    public void setAssetTypeCount(Long AssetTypeCount) {
        this.AssetTypeCount = AssetTypeCount;
    }

    /**
     * Get <p>Number of asset types with existing risks</p> 
     * @return RiskAssetTypeCount <p>Number of asset types with existing risks</p>
     */
    public Long getRiskAssetTypeCount() {
        return this.RiskAssetTypeCount;
    }

    /**
     * Set <p>Number of asset types with existing risks</p>
     * @param RiskAssetTypeCount <p>Number of asset types with existing risks</p>
     */
    public void setRiskAssetTypeCount(Long RiskAssetTypeCount) {
        this.RiskAssetTypeCount = RiskAssetTypeCount;
    }

    public AssetTypeStatisticsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetTypeStatisticsInfo(AssetTypeStatisticsInfo source) {
        if (source.AssetTypeCount != null) {
            this.AssetTypeCount = new Long(source.AssetTypeCount);
        }
        if (source.RiskAssetTypeCount != null) {
            this.RiskAssetTypeCount = new Long(source.RiskAssetTypeCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetTypeCount", this.AssetTypeCount);
        this.setParamSimple(map, prefix + "RiskAssetTypeCount", this.RiskAssetTypeCount);

    }
}

