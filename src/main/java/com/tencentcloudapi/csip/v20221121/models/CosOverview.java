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

public class CosOverview extends AbstractModel {

    /**
    * <p>Total number of assets</p>
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * <p>Number of assets that need to be processed immediately</p>
    */
    @SerializedName("AlarmAssetCount")
    @Expose
    private Long AlarmAssetCount;

    /**
    * <p>Number of assets to be hardened</p>
    */
    @SerializedName("RiskAssetCount")
    @Expose
    private Long RiskAssetCount;

    /**
    * <p>Total number of alarms</p>
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
    * <p>Total number of new alarms on the day</p>
    */
    @SerializedName("IncrementAlarmCount")
    @Expose
    private Long IncrementAlarmCount;

    /**
    * <p>Total number of risks</p>
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * <p>Total number of new alarms on the day</p>
    */
    @SerializedName("IncrementRiskCount")
    @Expose
    private Long IncrementRiskCount;

    /**
    * <p>Risk top details</p>
    */
    @SerializedName("RiskTop")
    @Expose
    private CosRiskInfo [] RiskTop;

    /**
    * <p>top alarm risks</p>
    */
    @SerializedName("AlarmTop")
    @Expose
    private CosRiskInfo [] AlarmTop;

    /**
    * <p>Number of high-level sensitive files</p>
    */
    @SerializedName("HighLevelSensitiveFileCount")
    @Expose
    private Long HighLevelSensitiveFileCount;

    /**
     * Get <p>Total number of assets</p> 
     * @return AssetCount <p>Total number of assets</p>
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set <p>Total number of assets</p>
     * @param AssetCount <p>Total number of assets</p>
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get <p>Number of assets that need to be processed immediately</p> 
     * @return AlarmAssetCount <p>Number of assets that need to be processed immediately</p>
     */
    public Long getAlarmAssetCount() {
        return this.AlarmAssetCount;
    }

    /**
     * Set <p>Number of assets that need to be processed immediately</p>
     * @param AlarmAssetCount <p>Number of assets that need to be processed immediately</p>
     */
    public void setAlarmAssetCount(Long AlarmAssetCount) {
        this.AlarmAssetCount = AlarmAssetCount;
    }

    /**
     * Get <p>Number of assets to be hardened</p> 
     * @return RiskAssetCount <p>Number of assets to be hardened</p>
     */
    public Long getRiskAssetCount() {
        return this.RiskAssetCount;
    }

    /**
     * Set <p>Number of assets to be hardened</p>
     * @param RiskAssetCount <p>Number of assets to be hardened</p>
     */
    public void setRiskAssetCount(Long RiskAssetCount) {
        this.RiskAssetCount = RiskAssetCount;
    }

    /**
     * Get <p>Total number of alarms</p> 
     * @return AlarmCount <p>Total number of alarms</p>
     */
    public Long getAlarmCount() {
        return this.AlarmCount;
    }

    /**
     * Set <p>Total number of alarms</p>
     * @param AlarmCount <p>Total number of alarms</p>
     */
    public void setAlarmCount(Long AlarmCount) {
        this.AlarmCount = AlarmCount;
    }

    /**
     * Get <p>Total number of new alarms on the day</p> 
     * @return IncrementAlarmCount <p>Total number of new alarms on the day</p>
     */
    public Long getIncrementAlarmCount() {
        return this.IncrementAlarmCount;
    }

    /**
     * Set <p>Total number of new alarms on the day</p>
     * @param IncrementAlarmCount <p>Total number of new alarms on the day</p>
     */
    public void setIncrementAlarmCount(Long IncrementAlarmCount) {
        this.IncrementAlarmCount = IncrementAlarmCount;
    }

    /**
     * Get <p>Total number of risks</p> 
     * @return RiskCount <p>Total number of risks</p>
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>Total number of risks</p>
     * @param RiskCount <p>Total number of risks</p>
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get <p>Total number of new alarms on the day</p> 
     * @return IncrementRiskCount <p>Total number of new alarms on the day</p>
     */
    public Long getIncrementRiskCount() {
        return this.IncrementRiskCount;
    }

    /**
     * Set <p>Total number of new alarms on the day</p>
     * @param IncrementRiskCount <p>Total number of new alarms on the day</p>
     */
    public void setIncrementRiskCount(Long IncrementRiskCount) {
        this.IncrementRiskCount = IncrementRiskCount;
    }

    /**
     * Get <p>Risk top details</p> 
     * @return RiskTop <p>Risk top details</p>
     */
    public CosRiskInfo [] getRiskTop() {
        return this.RiskTop;
    }

    /**
     * Set <p>Risk top details</p>
     * @param RiskTop <p>Risk top details</p>
     */
    public void setRiskTop(CosRiskInfo [] RiskTop) {
        this.RiskTop = RiskTop;
    }

    /**
     * Get <p>top alarm risks</p> 
     * @return AlarmTop <p>top alarm risks</p>
     */
    public CosRiskInfo [] getAlarmTop() {
        return this.AlarmTop;
    }

    /**
     * Set <p>top alarm risks</p>
     * @param AlarmTop <p>top alarm risks</p>
     */
    public void setAlarmTop(CosRiskInfo [] AlarmTop) {
        this.AlarmTop = AlarmTop;
    }

    /**
     * Get <p>Number of high-level sensitive files</p> 
     * @return HighLevelSensitiveFileCount <p>Number of high-level sensitive files</p>
     */
    public Long getHighLevelSensitiveFileCount() {
        return this.HighLevelSensitiveFileCount;
    }

    /**
     * Set <p>Number of high-level sensitive files</p>
     * @param HighLevelSensitiveFileCount <p>Number of high-level sensitive files</p>
     */
    public void setHighLevelSensitiveFileCount(Long HighLevelSensitiveFileCount) {
        this.HighLevelSensitiveFileCount = HighLevelSensitiveFileCount;
    }

    public CosOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosOverview(CosOverview source) {
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
        }
        if (source.AlarmAssetCount != null) {
            this.AlarmAssetCount = new Long(source.AlarmAssetCount);
        }
        if (source.RiskAssetCount != null) {
            this.RiskAssetCount = new Long(source.RiskAssetCount);
        }
        if (source.AlarmCount != null) {
            this.AlarmCount = new Long(source.AlarmCount);
        }
        if (source.IncrementAlarmCount != null) {
            this.IncrementAlarmCount = new Long(source.IncrementAlarmCount);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.IncrementRiskCount != null) {
            this.IncrementRiskCount = new Long(source.IncrementRiskCount);
        }
        if (source.RiskTop != null) {
            this.RiskTop = new CosRiskInfo[source.RiskTop.length];
            for (int i = 0; i < source.RiskTop.length; i++) {
                this.RiskTop[i] = new CosRiskInfo(source.RiskTop[i]);
            }
        }
        if (source.AlarmTop != null) {
            this.AlarmTop = new CosRiskInfo[source.AlarmTop.length];
            for (int i = 0; i < source.AlarmTop.length; i++) {
                this.AlarmTop[i] = new CosRiskInfo(source.AlarmTop[i]);
            }
        }
        if (source.HighLevelSensitiveFileCount != null) {
            this.HighLevelSensitiveFileCount = new Long(source.HighLevelSensitiveFileCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "AlarmAssetCount", this.AlarmAssetCount);
        this.setParamSimple(map, prefix + "RiskAssetCount", this.RiskAssetCount);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);
        this.setParamSimple(map, prefix + "IncrementAlarmCount", this.IncrementAlarmCount);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "IncrementRiskCount", this.IncrementRiskCount);
        this.setParamArrayObj(map, prefix + "RiskTop.", this.RiskTop);
        this.setParamArrayObj(map, prefix + "AlarmTop.", this.AlarmTop);
        this.setParamSimple(map, prefix + "HighLevelSensitiveFileCount", this.HighLevelSensitiveFileCount);

    }
}

