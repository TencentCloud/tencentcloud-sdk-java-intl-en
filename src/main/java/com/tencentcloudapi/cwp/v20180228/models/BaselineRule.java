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

public class BaselineRule extends AbstractModel {

    /**
    * Rule Name, up to 128 English characters in length
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Rule type [0: system|1: custom].
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * Rule Classification
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * Rule description
    */
    @SerializedName("RuleDesc")
    @Expose
    private String RuleDesc;

    /**
    * Number of Hosts
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * Adaptation Item ID List
    */
    @SerializedName("Items")
    @Expose
    private Item [] Items;

    /**
    * [0: all Pro and Ultimate Editions|1: host ID|2: IP].
    */
    @SerializedName("AssetType")
    @Expose
    private Long AssetType;

    /**
    * Host Id collection
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
     * Get Rule Name, up to 128 English characters in length 
     * @return RuleName Rule Name, up to 128 English characters in length
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule Name, up to 128 English characters in length
     * @param RuleName Rule Name, up to 128 English characters in length
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
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
     * Get Rule type [0: system|1: custom]. 
     * @return RuleType Rule type [0: system|1: custom].
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule type [0: system|1: custom].
     * @param RuleType Rule type [0: system|1: custom].
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Rule Classification 
     * @return CategoryId Rule Classification
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set Rule Classification
     * @param CategoryId Rule Classification
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get Rule description 
     * @return RuleDesc Rule description
     */
    public String getRuleDesc() {
        return this.RuleDesc;
    }

    /**
     * Set Rule description
     * @param RuleDesc Rule description
     */
    public void setRuleDesc(String RuleDesc) {
        this.RuleDesc = RuleDesc;
    }

    /**
     * Get Number of Hosts 
     * @return HostCount Number of Hosts
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Number of Hosts
     * @param HostCount Number of Hosts
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get Adaptation Item ID List 
     * @return Items Adaptation Item ID List
     */
    public Item [] getItems() {
        return this.Items;
    }

    /**
     * Set Adaptation Item ID List
     * @param Items Adaptation Item ID List
     */
    public void setItems(Item [] Items) {
        this.Items = Items;
    }

    /**
     * Get [0: all Pro and Ultimate Editions|1: host ID|2: IP]. 
     * @return AssetType [0: all Pro and Ultimate Editions|1: host ID|2: IP].
     */
    public Long getAssetType() {
        return this.AssetType;
    }

    /**
     * Set [0: all Pro and Ultimate Editions|1: host ID|2: IP].
     * @param AssetType [0: all Pro and Ultimate Editions|1: host ID|2: IP].
     */
    public void setAssetType(Long AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Host Id collection 
     * @return HostIds Host Id collection
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * Set Host Id collection
     * @param HostIds Host Id collection
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

    public BaselineRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineRule(BaselineRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.RuleDesc != null) {
            this.RuleDesc = new String(source.RuleDesc);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.Items != null) {
            this.Items = new Item[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new Item(source.Items[i]);
            }
        }
        if (source.AssetType != null) {
            this.AssetType = new Long(source.AssetType);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "RuleDesc", this.RuleDesc);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamArraySimple(map, prefix + "HostIps.", this.HostIps);

    }
}

