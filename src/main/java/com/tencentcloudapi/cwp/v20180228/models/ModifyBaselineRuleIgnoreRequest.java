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

public class ModifyBaselineRuleIgnoreRequest extends AbstractModel {

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Asset type [0: all Professional and Ultimate editions|1: ID | 2: IP]
    */
    @SerializedName("AssetType")
    @Expose
    private Long AssetType;

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Related item
    */
    @SerializedName("ItemIds")
    @Expose
    private Long [] ItemIds;

    /**
    * Host ID
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
    * Host IP address
    */
    @SerializedName("HostIps")
    @Expose
    private String [] HostIps;

    /**
    * Whether to select all filters
    */
    @SerializedName("SelectAll")
    @Expose
    private Long SelectAll;

    /**
    * <li>ItemName - string - Required: No - Item name</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Rule name 
     * @return RuleName Rule name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
     * @param RuleName Rule name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Asset type [0: all Professional and Ultimate editions|1: ID | 2: IP] 
     * @return AssetType Asset type [0: all Professional and Ultimate editions|1: ID | 2: IP]
     */
    public Long getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type [0: all Professional and Ultimate editions|1: ID | 2: IP]
     * @param AssetType Asset type [0: all Professional and Ultimate editions|1: ID | 2: IP]
     */
    public void setAssetType(Long AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Related item 
     * @return ItemIds Related item
     */
    public Long [] getItemIds() {
        return this.ItemIds;
    }

    /**
     * Set Related item
     * @param ItemIds Related item
     */
    public void setItemIds(Long [] ItemIds) {
        this.ItemIds = ItemIds;
    }

    /**
     * Get Host ID 
     * @return HostIds Host ID
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * Set Host ID
     * @param HostIds Host ID
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    /**
     * Get Host IP address 
     * @return HostIps Host IP address
     */
    public String [] getHostIps() {
        return this.HostIps;
    }

    /**
     * Set Host IP address
     * @param HostIps Host IP address
     */
    public void setHostIps(String [] HostIps) {
        this.HostIps = HostIps;
    }

    /**
     * Get Whether to select all filters 
     * @return SelectAll Whether to select all filters
     */
    public Long getSelectAll() {
        return this.SelectAll;
    }

    /**
     * Set Whether to select all filters
     * @param SelectAll Whether to select all filters
     */
    public void setSelectAll(Long SelectAll) {
        this.SelectAll = SelectAll;
    }

    /**
     * Get <li>ItemName - string - Required: No - Item name</li> 
     * @return Filters <li>ItemName - string - Required: No - Item name</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>ItemName - string - Required: No - Item name</li>
     * @param Filters <li>ItemName - string - Required: No - Item name</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public ModifyBaselineRuleIgnoreRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBaselineRuleIgnoreRequest(ModifyBaselineRuleIgnoreRequest source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.AssetType != null) {
            this.AssetType = new Long(source.AssetType);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.ItemIds != null) {
            this.ItemIds = new Long[source.ItemIds.length];
            for (int i = 0; i < source.ItemIds.length; i++) {
                this.ItemIds[i] = new Long(source.ItemIds[i]);
            }
        }
        if (source.HostIds != null) {
            this.HostIds = new String[source.HostIds.length];
            for (int i = 0; i < source.HostIds.length; i++) {
                this.HostIds[i] = new String(source.HostIds[i]);
            }
        }
        if (source.HostIps != null) {
            this.HostIps = new String[source.HostIps.length];
            for (int i = 0; i < source.HostIps.length; i++) {
                this.HostIps[i] = new String(source.HostIps[i]);
            }
        }
        if (source.SelectAll != null) {
            this.SelectAll = new Long(source.SelectAll);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArraySimple(map, prefix + "ItemIds.", this.ItemIds);
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamArraySimple(map, prefix + "HostIps.", this.HostIps);
        this.setParamSimple(map, prefix + "SelectAll", this.SelectAll);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

