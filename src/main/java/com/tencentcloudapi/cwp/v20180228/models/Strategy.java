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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Strategy extends AbstractModel {

    /**
    * Policy name
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * Policy ID
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * Total number of baseline detection items
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
    * Number of hosts
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * Scan cycle
    */
    @SerializedName("ScanCycle")
    @Expose
    private Long ScanCycle;

    /**
    * Scan time
    */
    @SerializedName("ScanAt")
    @Expose
    private String ScanAt;

    /**
    * Available or not?
    */
    @SerializedName("Enabled")
    @Expose
    private Long Enabled;

    /**
    * pass rate
    */
    @SerializedName("PassRate")
    @Expose
    private Long PassRate;

    /**
    * Baseline ID
    */
    @SerializedName("CategoryIds")
    @Expose
    private String CategoryIds;

    /**
    * Whether a default policy
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
     * Get Policy name 
     * @return StrategyName Policy name
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set Policy name
     * @param StrategyName Policy name
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get Policy ID 
     * @return StrategyId Policy ID
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Policy ID
     * @param StrategyId Policy ID
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get Total number of baseline detection items 
     * @return RuleCount Total number of baseline detection items
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set Total number of baseline detection items
     * @param RuleCount Total number of baseline detection items
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    /**
     * Get Number of hosts 
     * @return HostCount Number of hosts
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Number of hosts
     * @param HostCount Number of hosts
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get Scan cycle 
     * @return ScanCycle Scan cycle
     */
    public Long getScanCycle() {
        return this.ScanCycle;
    }

    /**
     * Set Scan cycle
     * @param ScanCycle Scan cycle
     */
    public void setScanCycle(Long ScanCycle) {
        this.ScanCycle = ScanCycle;
    }

    /**
     * Get Scan time 
     * @return ScanAt Scan time
     */
    public String getScanAt() {
        return this.ScanAt;
    }

    /**
     * Set Scan time
     * @param ScanAt Scan time
     */
    public void setScanAt(String ScanAt) {
        this.ScanAt = ScanAt;
    }

    /**
     * Get Available or not? 
     * @return Enabled Available or not?
     */
    public Long getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Available or not?
     * @param Enabled Available or not?
     */
    public void setEnabled(Long Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get pass rate 
     * @return PassRate pass rate
     */
    public Long getPassRate() {
        return this.PassRate;
    }

    /**
     * Set pass rate
     * @param PassRate pass rate
     */
    public void setPassRate(Long PassRate) {
        this.PassRate = PassRate;
    }

    /**
     * Get Baseline ID 
     * @return CategoryIds Baseline ID
     */
    public String getCategoryIds() {
        return this.CategoryIds;
    }

    /**
     * Set Baseline ID
     * @param CategoryIds Baseline ID
     */
    public void setCategoryIds(String CategoryIds) {
        this.CategoryIds = CategoryIds;
    }

    /**
     * Get Whether a default policy 
     * @return IsDefault Whether a default policy
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether a default policy
     * @param IsDefault Whether a default policy
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    public Strategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Strategy(Strategy source) {
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.RuleCount != null) {
            this.RuleCount = new Long(source.RuleCount);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.ScanCycle != null) {
            this.ScanCycle = new Long(source.ScanCycle);
        }
        if (source.ScanAt != null) {
            this.ScanAt = new String(source.ScanAt);
        }
        if (source.Enabled != null) {
            this.Enabled = new Long(source.Enabled);
        }
        if (source.PassRate != null) {
            this.PassRate = new Long(source.PassRate);
        }
        if (source.CategoryIds != null) {
            this.CategoryIds = new String(source.CategoryIds);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "RuleCount", this.RuleCount);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "ScanCycle", this.ScanCycle);
        this.setParamSimple(map, prefix + "ScanAt", this.ScanAt);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "PassRate", this.PassRate);
        this.setParamSimple(map, prefix + "CategoryIds", this.CategoryIds);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

