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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * Total number of baseline detection items
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
    * Number of Hosts
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * Scan cycle
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanCycle")
    @Expose
    private Long ScanCycle;

    /**
    * Scan time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanAt")
    @Expose
    private String ScanAt;

    /**
    * Available or not?
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enabled")
    @Expose
    private Long Enabled;

    /**
    * Pass rate
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PassRate")
    @Expose
    private Long PassRate;

    /**
    * Baseline ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CategoryIds")
    @Expose
    private String CategoryIds;

    /**
    * Whether a default policy
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
     * Get Policy name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StrategyName Policy name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set Policy name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StrategyName Policy name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get Policy ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StrategyId Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StrategyId Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get Total number of baseline detection items
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleCount Total number of baseline detection items
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set Total number of baseline detection items
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleCount Total number of baseline detection items
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    /**
     * Get Number of Hosts
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostCount Number of Hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Number of Hosts
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostCount Number of Hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get Scan cycle
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanCycle Scan cycle
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScanCycle() {
        return this.ScanCycle;
    }

    /**
     * Set Scan cycle
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanCycle Scan cycle
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanCycle(Long ScanCycle) {
        this.ScanCycle = ScanCycle;
    }

    /**
     * Get Scan time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanAt Scan time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScanAt() {
        return this.ScanAt;
    }

    /**
     * Set Scan time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanAt Scan time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanAt(String ScanAt) {
        this.ScanAt = ScanAt;
    }

    /**
     * Get Available or not?
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Enabled Available or not?
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Available or not?
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Enabled Available or not?
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnabled(Long Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Pass rate
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PassRate Pass rate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPassRate() {
        return this.PassRate;
    }

    /**
     * Set Pass rate
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PassRate Pass rate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPassRate(Long PassRate) {
        this.PassRate = PassRate;
    }

    /**
     * Get Baseline ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CategoryIds Baseline ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCategoryIds() {
        return this.CategoryIds;
    }

    /**
     * Set Baseline ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CategoryIds Baseline ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCategoryIds(String CategoryIds) {
        this.CategoryIds = CategoryIds;
    }

    /**
     * Get Whether a default policy
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsDefault Whether a default policy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether a default policy
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsDefault Whether a default policy
Note: This field may return null, indicating that no valid values can be obtained.
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

