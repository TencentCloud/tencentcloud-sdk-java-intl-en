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

public class CFGRiskStatisticsItem extends AbstractModel {

    /**
    * <p>Total number of risks</p>
    */
    @SerializedName("TotalRiskCount")
    @Expose
    private Long TotalRiskCount;

    /**
    * <p>Number of newly-added risks in the past 7 days</p>
    */
    @SerializedName("RiskAddCount")
    @Expose
    private Long RiskAddCount;

    /**
    * <p>All cloud resource configuration risk items to be fixed</p>
    */
    @SerializedName("CheckViewCount")
    @Expose
    private Long CheckViewCount;

    /**
    * <p>High priority risk to be fixed</p>
    */
    @SerializedName("HighPriorityRiskCount")
    @Expose
    private Long HighPriorityRiskCount;

    /**
    * <p>Newly-added pending repair items in the last 7 days</p>
    */
    @SerializedName("CheckViewAddCount")
    @Expose
    private Long CheckViewAddCount;

    /**
    * <p>All cloud resource configuration risk items to be fixed, with high priority first</p>
    */
    @SerializedName("HighPriorityCheckViewCount")
    @Expose
    private Long HighPriorityCheckViewCount;

    /**
    * <p>Display quantity from the asset perspective</p>
    */
    @SerializedName("AssetViewCount")
    @Expose
    private Long AssetViewCount;

    /**
    * <p>Number of newly-added assets to be fixed in the last 7 days</p>
    */
    @SerializedName("AssetViewAddCount")
    @Expose
    private Long AssetViewAddCount;

    /**
    * <p>Display quantity from asset perspective, number of high-priority fixes</p>
    */
    @SerializedName("HighPriorityAssetViewCount")
    @Expose
    private Long HighPriorityAssetViewCount;

    /**
     * Get <p>Total number of risks</p> 
     * @return TotalRiskCount <p>Total number of risks</p>
     */
    public Long getTotalRiskCount() {
        return this.TotalRiskCount;
    }

    /**
     * Set <p>Total number of risks</p>
     * @param TotalRiskCount <p>Total number of risks</p>
     */
    public void setTotalRiskCount(Long TotalRiskCount) {
        this.TotalRiskCount = TotalRiskCount;
    }

    /**
     * Get <p>Number of newly-added risks in the past 7 days</p> 
     * @return RiskAddCount <p>Number of newly-added risks in the past 7 days</p>
     */
    public Long getRiskAddCount() {
        return this.RiskAddCount;
    }

    /**
     * Set <p>Number of newly-added risks in the past 7 days</p>
     * @param RiskAddCount <p>Number of newly-added risks in the past 7 days</p>
     */
    public void setRiskAddCount(Long RiskAddCount) {
        this.RiskAddCount = RiskAddCount;
    }

    /**
     * Get <p>All cloud resource configuration risk items to be fixed</p> 
     * @return CheckViewCount <p>All cloud resource configuration risk items to be fixed</p>
     */
    public Long getCheckViewCount() {
        return this.CheckViewCount;
    }

    /**
     * Set <p>All cloud resource configuration risk items to be fixed</p>
     * @param CheckViewCount <p>All cloud resource configuration risk items to be fixed</p>
     */
    public void setCheckViewCount(Long CheckViewCount) {
        this.CheckViewCount = CheckViewCount;
    }

    /**
     * Get <p>High priority risk to be fixed</p> 
     * @return HighPriorityRiskCount <p>High priority risk to be fixed</p>
     */
    public Long getHighPriorityRiskCount() {
        return this.HighPriorityRiskCount;
    }

    /**
     * Set <p>High priority risk to be fixed</p>
     * @param HighPriorityRiskCount <p>High priority risk to be fixed</p>
     */
    public void setHighPriorityRiskCount(Long HighPriorityRiskCount) {
        this.HighPriorityRiskCount = HighPriorityRiskCount;
    }

    /**
     * Get <p>Newly-added pending repair items in the last 7 days</p> 
     * @return CheckViewAddCount <p>Newly-added pending repair items in the last 7 days</p>
     */
    public Long getCheckViewAddCount() {
        return this.CheckViewAddCount;
    }

    /**
     * Set <p>Newly-added pending repair items in the last 7 days</p>
     * @param CheckViewAddCount <p>Newly-added pending repair items in the last 7 days</p>
     */
    public void setCheckViewAddCount(Long CheckViewAddCount) {
        this.CheckViewAddCount = CheckViewAddCount;
    }

    /**
     * Get <p>All cloud resource configuration risk items to be fixed, with high priority first</p> 
     * @return HighPriorityCheckViewCount <p>All cloud resource configuration risk items to be fixed, with high priority first</p>
     */
    public Long getHighPriorityCheckViewCount() {
        return this.HighPriorityCheckViewCount;
    }

    /**
     * Set <p>All cloud resource configuration risk items to be fixed, with high priority first</p>
     * @param HighPriorityCheckViewCount <p>All cloud resource configuration risk items to be fixed, with high priority first</p>
     */
    public void setHighPriorityCheckViewCount(Long HighPriorityCheckViewCount) {
        this.HighPriorityCheckViewCount = HighPriorityCheckViewCount;
    }

    /**
     * Get <p>Display quantity from the asset perspective</p> 
     * @return AssetViewCount <p>Display quantity from the asset perspective</p>
     */
    public Long getAssetViewCount() {
        return this.AssetViewCount;
    }

    /**
     * Set <p>Display quantity from the asset perspective</p>
     * @param AssetViewCount <p>Display quantity from the asset perspective</p>
     */
    public void setAssetViewCount(Long AssetViewCount) {
        this.AssetViewCount = AssetViewCount;
    }

    /**
     * Get <p>Number of newly-added assets to be fixed in the last 7 days</p> 
     * @return AssetViewAddCount <p>Number of newly-added assets to be fixed in the last 7 days</p>
     */
    public Long getAssetViewAddCount() {
        return this.AssetViewAddCount;
    }

    /**
     * Set <p>Number of newly-added assets to be fixed in the last 7 days</p>
     * @param AssetViewAddCount <p>Number of newly-added assets to be fixed in the last 7 days</p>
     */
    public void setAssetViewAddCount(Long AssetViewAddCount) {
        this.AssetViewAddCount = AssetViewAddCount;
    }

    /**
     * Get <p>Display quantity from asset perspective, number of high-priority fixes</p> 
     * @return HighPriorityAssetViewCount <p>Display quantity from asset perspective, number of high-priority fixes</p>
     */
    public Long getHighPriorityAssetViewCount() {
        return this.HighPriorityAssetViewCount;
    }

    /**
     * Set <p>Display quantity from asset perspective, number of high-priority fixes</p>
     * @param HighPriorityAssetViewCount <p>Display quantity from asset perspective, number of high-priority fixes</p>
     */
    public void setHighPriorityAssetViewCount(Long HighPriorityAssetViewCount) {
        this.HighPriorityAssetViewCount = HighPriorityAssetViewCount;
    }

    public CFGRiskStatisticsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CFGRiskStatisticsItem(CFGRiskStatisticsItem source) {
        if (source.TotalRiskCount != null) {
            this.TotalRiskCount = new Long(source.TotalRiskCount);
        }
        if (source.RiskAddCount != null) {
            this.RiskAddCount = new Long(source.RiskAddCount);
        }
        if (source.CheckViewCount != null) {
            this.CheckViewCount = new Long(source.CheckViewCount);
        }
        if (source.HighPriorityRiskCount != null) {
            this.HighPriorityRiskCount = new Long(source.HighPriorityRiskCount);
        }
        if (source.CheckViewAddCount != null) {
            this.CheckViewAddCount = new Long(source.CheckViewAddCount);
        }
        if (source.HighPriorityCheckViewCount != null) {
            this.HighPriorityCheckViewCount = new Long(source.HighPriorityCheckViewCount);
        }
        if (source.AssetViewCount != null) {
            this.AssetViewCount = new Long(source.AssetViewCount);
        }
        if (source.AssetViewAddCount != null) {
            this.AssetViewAddCount = new Long(source.AssetViewAddCount);
        }
        if (source.HighPriorityAssetViewCount != null) {
            this.HighPriorityAssetViewCount = new Long(source.HighPriorityAssetViewCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalRiskCount", this.TotalRiskCount);
        this.setParamSimple(map, prefix + "RiskAddCount", this.RiskAddCount);
        this.setParamSimple(map, prefix + "CheckViewCount", this.CheckViewCount);
        this.setParamSimple(map, prefix + "HighPriorityRiskCount", this.HighPriorityRiskCount);
        this.setParamSimple(map, prefix + "CheckViewAddCount", this.CheckViewAddCount);
        this.setParamSimple(map, prefix + "HighPriorityCheckViewCount", this.HighPriorityCheckViewCount);
        this.setParamSimple(map, prefix + "AssetViewCount", this.AssetViewCount);
        this.setParamSimple(map, prefix + "AssetViewAddCount", this.AssetViewAddCount);
        this.setParamSimple(map, prefix + "HighPriorityAssetViewCount", this.HighPriorityAssetViewCount);

    }
}

