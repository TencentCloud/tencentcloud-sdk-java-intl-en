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

public class AddEditImageAutoAuthorizedRuleRequest extends AbstractModel {

    /**
    * Scope. Valid values: `MANUAL` (specified servers); `ALL` (all images).
    */
    @SerializedName("RangeType")
    @Expose
    private String RangeType;

    /**
    * Maximum number of image licenses per day. `0`: Unlimited.
    */
    @SerializedName("MaxDailyCount")
    @Expose
    private Long MaxDailyCount;

    /**
    * Whether the rule takes effect. Valid values: `0` (no); `1` (yes).
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * IDs of specified servers. This parameter is required when the scope is `MANUAL` and `HostIdFilters` is empty.
    */
    @SerializedName("HostIdSet")
    @Expose
    private String [] HostIdSet;

    /**
    * Rule ID, which is required during editing.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Filter. This parameter is required when the scope is `MANUAL` and `HostIdSet` is empty.
    */
    @SerializedName("HostIdFilters")
    @Expose
    private AssetFilters [] HostIdFilters;

    /**
    * Specified server IDs to be excluded
    */
    @SerializedName("ExcludeHostIdSet")
    @Expose
    private String [] ExcludeHostIdSet;

    /**
     * Get Scope. Valid values: `MANUAL` (specified servers); `ALL` (all images). 
     * @return RangeType Scope. Valid values: `MANUAL` (specified servers); `ALL` (all images).
     */
    public String getRangeType() {
        return this.RangeType;
    }

    /**
     * Set Scope. Valid values: `MANUAL` (specified servers); `ALL` (all images).
     * @param RangeType Scope. Valid values: `MANUAL` (specified servers); `ALL` (all images).
     */
    public void setRangeType(String RangeType) {
        this.RangeType = RangeType;
    }

    /**
     * Get Maximum number of image licenses per day. `0`: Unlimited. 
     * @return MaxDailyCount Maximum number of image licenses per day. `0`: Unlimited.
     */
    public Long getMaxDailyCount() {
        return this.MaxDailyCount;
    }

    /**
     * Set Maximum number of image licenses per day. `0`: Unlimited.
     * @param MaxDailyCount Maximum number of image licenses per day. `0`: Unlimited.
     */
    public void setMaxDailyCount(Long MaxDailyCount) {
        this.MaxDailyCount = MaxDailyCount;
    }

    /**
     * Get Whether the rule takes effect. Valid values: `0` (no); `1` (yes). 
     * @return IsEnabled Whether the rule takes effect. Valid values: `0` (no); `1` (yes).
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set Whether the rule takes effect. Valid values: `0` (no); `1` (yes).
     * @param IsEnabled Whether the rule takes effect. Valid values: `0` (no); `1` (yes).
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get IDs of specified servers. This parameter is required when the scope is `MANUAL` and `HostIdFilters` is empty. 
     * @return HostIdSet IDs of specified servers. This parameter is required when the scope is `MANUAL` and `HostIdFilters` is empty.
     */
    public String [] getHostIdSet() {
        return this.HostIdSet;
    }

    /**
     * Set IDs of specified servers. This parameter is required when the scope is `MANUAL` and `HostIdFilters` is empty.
     * @param HostIdSet IDs of specified servers. This parameter is required when the scope is `MANUAL` and `HostIdFilters` is empty.
     */
    public void setHostIdSet(String [] HostIdSet) {
        this.HostIdSet = HostIdSet;
    }

    /**
     * Get Rule ID, which is required during editing. 
     * @return RuleId Rule ID, which is required during editing.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID, which is required during editing.
     * @param RuleId Rule ID, which is required during editing.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Filter. This parameter is required when the scope is `MANUAL` and `HostIdSet` is empty. 
     * @return HostIdFilters Filter. This parameter is required when the scope is `MANUAL` and `HostIdSet` is empty.
     */
    public AssetFilters [] getHostIdFilters() {
        return this.HostIdFilters;
    }

    /**
     * Set Filter. This parameter is required when the scope is `MANUAL` and `HostIdSet` is empty.
     * @param HostIdFilters Filter. This parameter is required when the scope is `MANUAL` and `HostIdSet` is empty.
     */
    public void setHostIdFilters(AssetFilters [] HostIdFilters) {
        this.HostIdFilters = HostIdFilters;
    }

    /**
     * Get Specified server IDs to be excluded 
     * @return ExcludeHostIdSet Specified server IDs to be excluded
     */
    public String [] getExcludeHostIdSet() {
        return this.ExcludeHostIdSet;
    }

    /**
     * Set Specified server IDs to be excluded
     * @param ExcludeHostIdSet Specified server IDs to be excluded
     */
    public void setExcludeHostIdSet(String [] ExcludeHostIdSet) {
        this.ExcludeHostIdSet = ExcludeHostIdSet;
    }

    public AddEditImageAutoAuthorizedRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddEditImageAutoAuthorizedRuleRequest(AddEditImageAutoAuthorizedRuleRequest source) {
        if (source.RangeType != null) {
            this.RangeType = new String(source.RangeType);
        }
        if (source.MaxDailyCount != null) {
            this.MaxDailyCount = new Long(source.MaxDailyCount);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.HostIdSet != null) {
            this.HostIdSet = new String[source.HostIdSet.length];
            for (int i = 0; i < source.HostIdSet.length; i++) {
                this.HostIdSet[i] = new String(source.HostIdSet[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.HostIdFilters != null) {
            this.HostIdFilters = new AssetFilters[source.HostIdFilters.length];
            for (int i = 0; i < source.HostIdFilters.length; i++) {
                this.HostIdFilters[i] = new AssetFilters(source.HostIdFilters[i]);
            }
        }
        if (source.ExcludeHostIdSet != null) {
            this.ExcludeHostIdSet = new String[source.ExcludeHostIdSet.length];
            for (int i = 0; i < source.ExcludeHostIdSet.length; i++) {
                this.ExcludeHostIdSet[i] = new String(source.ExcludeHostIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RangeType", this.RangeType);
        this.setParamSimple(map, prefix + "MaxDailyCount", this.MaxDailyCount);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamArraySimple(map, prefix + "HostIdSet.", this.HostIdSet);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "HostIdFilters.", this.HostIdFilters);
        this.setParamArraySimple(map, prefix + "ExcludeHostIdSet.", this.ExcludeHostIdSet);

    }
}

