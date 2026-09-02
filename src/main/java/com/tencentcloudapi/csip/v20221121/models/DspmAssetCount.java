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

public class DspmAssetCount extends AbstractModel {

    /**
    * Number of assets
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * Number of assets with dangerous risks
    */
    @SerializedName("DangerRiskCount")
    @Expose
    private Long DangerRiskCount;

    /**
    * Number of assets with low risk
    */
    @SerializedName("LowRiskCount")
    @Expose
    private Long LowRiskCount;

    /**
    * Number of instances with pending risks
    */
    @SerializedName("RiskAssetCount")
    @Expose
    private Long RiskAssetCount;

    /**
    * Number of instances with pending alarms
    */
    @SerializedName("AlarmAssetCount")
    @Expose
    private Long AlarmAssetCount;

    /**
     * Get Number of assets 
     * @return AssetCount Number of assets
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set Number of assets
     * @param AssetCount Number of assets
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get Number of assets with dangerous risks 
     * @return DangerRiskCount Number of assets with dangerous risks
     */
    public Long getDangerRiskCount() {
        return this.DangerRiskCount;
    }

    /**
     * Set Number of assets with dangerous risks
     * @param DangerRiskCount Number of assets with dangerous risks
     */
    public void setDangerRiskCount(Long DangerRiskCount) {
        this.DangerRiskCount = DangerRiskCount;
    }

    /**
     * Get Number of assets with low risk 
     * @return LowRiskCount Number of assets with low risk
     */
    public Long getLowRiskCount() {
        return this.LowRiskCount;
    }

    /**
     * Set Number of assets with low risk
     * @param LowRiskCount Number of assets with low risk
     */
    public void setLowRiskCount(Long LowRiskCount) {
        this.LowRiskCount = LowRiskCount;
    }

    /**
     * Get Number of instances with pending risks 
     * @return RiskAssetCount Number of instances with pending risks
     */
    public Long getRiskAssetCount() {
        return this.RiskAssetCount;
    }

    /**
     * Set Number of instances with pending risks
     * @param RiskAssetCount Number of instances with pending risks
     */
    public void setRiskAssetCount(Long RiskAssetCount) {
        this.RiskAssetCount = RiskAssetCount;
    }

    /**
     * Get Number of instances with pending alarms 
     * @return AlarmAssetCount Number of instances with pending alarms
     */
    public Long getAlarmAssetCount() {
        return this.AlarmAssetCount;
    }

    /**
     * Set Number of instances with pending alarms
     * @param AlarmAssetCount Number of instances with pending alarms
     */
    public void setAlarmAssetCount(Long AlarmAssetCount) {
        this.AlarmAssetCount = AlarmAssetCount;
    }

    public DspmAssetCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetCount(DspmAssetCount source) {
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
        }
        if (source.DangerRiskCount != null) {
            this.DangerRiskCount = new Long(source.DangerRiskCount);
        }
        if (source.LowRiskCount != null) {
            this.LowRiskCount = new Long(source.LowRiskCount);
        }
        if (source.RiskAssetCount != null) {
            this.RiskAssetCount = new Long(source.RiskAssetCount);
        }
        if (source.AlarmAssetCount != null) {
            this.AlarmAssetCount = new Long(source.AlarmAssetCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "DangerRiskCount", this.DangerRiskCount);
        this.setParamSimple(map, prefix + "LowRiskCount", this.LowRiskCount);
        this.setParamSimple(map, prefix + "RiskAssetCount", this.RiskAssetCount);
        this.setParamSimple(map, prefix + "AlarmAssetCount", this.AlarmAssetCount);

    }
}

