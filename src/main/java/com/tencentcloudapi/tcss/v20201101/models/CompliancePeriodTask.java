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

public class CompliancePeriodTask extends AbstractModel {

    /**
    * Scheduled task ID
    */
    @SerializedName("PeriodTaskId")
    @Expose
    private Long PeriodTaskId;

    /**
    * Asset type
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset.
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Last trigger time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastTriggerTime")
    @Expose
    private String LastTriggerTime;

    /**
    * Total number of check items
    */
    @SerializedName("TotalPolicyItemCount")
    @Expose
    private Long TotalPolicyItemCount;

    /**
    * Cycle settings
    */
    @SerializedName("PeriodRule")
    @Expose
    private CompliancePeriodTaskRule PeriodRule;

    /**
    * List of compliance standards
    */
    @SerializedName("BenchmarkStandardSet")
    @Expose
    private ComplianceBenchmarkStandard [] BenchmarkStandardSet;

    /**
     * Get Scheduled task ID 
     * @return PeriodTaskId Scheduled task ID
     */
    public Long getPeriodTaskId() {
        return this.PeriodTaskId;
    }

    /**
     * Set Scheduled task ID
     * @param PeriodTaskId Scheduled task ID
     */
    public void setPeriodTaskId(Long PeriodTaskId) {
        this.PeriodTaskId = PeriodTaskId;
    }

    /**
     * Get Asset type
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset. 
     * @return AssetType Asset type
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset.
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset.
     * @param AssetType Asset type
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset.
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Last trigger time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastTriggerTime Last trigger time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastTriggerTime() {
        return this.LastTriggerTime;
    }

    /**
     * Set Last trigger time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastTriggerTime Last trigger time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastTriggerTime(String LastTriggerTime) {
        this.LastTriggerTime = LastTriggerTime;
    }

    /**
     * Get Total number of check items 
     * @return TotalPolicyItemCount Total number of check items
     */
    public Long getTotalPolicyItemCount() {
        return this.TotalPolicyItemCount;
    }

    /**
     * Set Total number of check items
     * @param TotalPolicyItemCount Total number of check items
     */
    public void setTotalPolicyItemCount(Long TotalPolicyItemCount) {
        this.TotalPolicyItemCount = TotalPolicyItemCount;
    }

    /**
     * Get Cycle settings 
     * @return PeriodRule Cycle settings
     */
    public CompliancePeriodTaskRule getPeriodRule() {
        return this.PeriodRule;
    }

    /**
     * Set Cycle settings
     * @param PeriodRule Cycle settings
     */
    public void setPeriodRule(CompliancePeriodTaskRule PeriodRule) {
        this.PeriodRule = PeriodRule;
    }

    /**
     * Get List of compliance standards 
     * @return BenchmarkStandardSet List of compliance standards
     */
    public ComplianceBenchmarkStandard [] getBenchmarkStandardSet() {
        return this.BenchmarkStandardSet;
    }

    /**
     * Set List of compliance standards
     * @param BenchmarkStandardSet List of compliance standards
     */
    public void setBenchmarkStandardSet(ComplianceBenchmarkStandard [] BenchmarkStandardSet) {
        this.BenchmarkStandardSet = BenchmarkStandardSet;
    }

    public CompliancePeriodTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompliancePeriodTask(CompliancePeriodTask source) {
        if (source.PeriodTaskId != null) {
            this.PeriodTaskId = new Long(source.PeriodTaskId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.LastTriggerTime != null) {
            this.LastTriggerTime = new String(source.LastTriggerTime);
        }
        if (source.TotalPolicyItemCount != null) {
            this.TotalPolicyItemCount = new Long(source.TotalPolicyItemCount);
        }
        if (source.PeriodRule != null) {
            this.PeriodRule = new CompliancePeriodTaskRule(source.PeriodRule);
        }
        if (source.BenchmarkStandardSet != null) {
            this.BenchmarkStandardSet = new ComplianceBenchmarkStandard[source.BenchmarkStandardSet.length];
            for (int i = 0; i < source.BenchmarkStandardSet.length; i++) {
                this.BenchmarkStandardSet[i] = new ComplianceBenchmarkStandard(source.BenchmarkStandardSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeriodTaskId", this.PeriodTaskId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "LastTriggerTime", this.LastTriggerTime);
        this.setParamSimple(map, prefix + "TotalPolicyItemCount", this.TotalPolicyItemCount);
        this.setParamObj(map, prefix + "PeriodRule.", this.PeriodRule);
        this.setParamArrayObj(map, prefix + "BenchmarkStandardSet.", this.BenchmarkStandardSet);

    }
}

