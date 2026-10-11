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

public class VulIgnoreRule extends AbstractModel {

    /**
    * Vulnerability rule ID.
    */
    @SerializedName("VulID")
    @Expose
    private Long VulID;

    /**
    * <li>0: all hosts</li>
<li>1: Optional host</li>
    */
    @SerializedName("AssetScopeType")
    @Expose
    private Long AssetScopeType;

    /**
    * List of QUUIDs for custom-selected hosts when custom hosts are used.
    */
    @SerializedName("IncludeQuuidList")
    @Expose
    private String [] IncludeQuuidList;

    /**
    * Hosts excluded when all hosts are selected.
    */
    @SerializedName("ExcludeQuuidList")
    @Expose
    private String [] ExcludeQuuidList;

    /**
    * Reason for ignoring.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Number of configured hosts.
    */
    @SerializedName("ConfigHostCount")
    @Expose
    private Long ConfigHostCount;

    /**
    * Number of hosts actually affected.
    */
    @SerializedName("AffectedHostCount")
    @Expose
    private Long AffectedHostCount;

    /**
    * Vulnerability name.
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Ignore rule ID.
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * Latest update time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get Vulnerability rule ID. 
     * @return VulID Vulnerability rule ID.
     */
    public Long getVulID() {
        return this.VulID;
    }

    /**
     * Set Vulnerability rule ID.
     * @param VulID Vulnerability rule ID.
     */
    public void setVulID(Long VulID) {
        this.VulID = VulID;
    }

    /**
     * Get <li>0: all hosts</li>
<li>1: Optional host</li> 
     * @return AssetScopeType <li>0: all hosts</li>
<li>1: Optional host</li>
     */
    public Long getAssetScopeType() {
        return this.AssetScopeType;
    }

    /**
     * Set <li>0: all hosts</li>
<li>1: Optional host</li>
     * @param AssetScopeType <li>0: all hosts</li>
<li>1: Optional host</li>
     */
    public void setAssetScopeType(Long AssetScopeType) {
        this.AssetScopeType = AssetScopeType;
    }

    /**
     * Get List of QUUIDs for custom-selected hosts when custom hosts are used. 
     * @return IncludeQuuidList List of QUUIDs for custom-selected hosts when custom hosts are used.
     */
    public String [] getIncludeQuuidList() {
        return this.IncludeQuuidList;
    }

    /**
     * Set List of QUUIDs for custom-selected hosts when custom hosts are used.
     * @param IncludeQuuidList List of QUUIDs for custom-selected hosts when custom hosts are used.
     */
    public void setIncludeQuuidList(String [] IncludeQuuidList) {
        this.IncludeQuuidList = IncludeQuuidList;
    }

    /**
     * Get Hosts excluded when all hosts are selected. 
     * @return ExcludeQuuidList Hosts excluded when all hosts are selected.
     */
    public String [] getExcludeQuuidList() {
        return this.ExcludeQuuidList;
    }

    /**
     * Set Hosts excluded when all hosts are selected.
     * @param ExcludeQuuidList Hosts excluded when all hosts are selected.
     */
    public void setExcludeQuuidList(String [] ExcludeQuuidList) {
        this.ExcludeQuuidList = ExcludeQuuidList;
    }

    /**
     * Get Reason for ignoring. 
     * @return Remark Reason for ignoring.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Reason for ignoring.
     * @param Remark Reason for ignoring.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Number of configured hosts. 
     * @return ConfigHostCount Number of configured hosts.
     */
    public Long getConfigHostCount() {
        return this.ConfigHostCount;
    }

    /**
     * Set Number of configured hosts.
     * @param ConfigHostCount Number of configured hosts.
     */
    public void setConfigHostCount(Long ConfigHostCount) {
        this.ConfigHostCount = ConfigHostCount;
    }

    /**
     * Get Number of hosts actually affected. 
     * @return AffectedHostCount Number of hosts actually affected.
     */
    public Long getAffectedHostCount() {
        return this.AffectedHostCount;
    }

    /**
     * Set Number of hosts actually affected.
     * @param AffectedHostCount Number of hosts actually affected.
     */
    public void setAffectedHostCount(Long AffectedHostCount) {
        this.AffectedHostCount = AffectedHostCount;
    }

    /**
     * Get Vulnerability name. 
     * @return VulName Vulnerability name.
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name.
     * @param VulName Vulnerability name.
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get Ignore rule ID. 
     * @return RuleID Ignore rule ID.
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Ignore rule ID.
     * @param RuleID Ignore rule ID.
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Latest update time 
     * @return ModifyTime Latest update time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Latest update time
     * @param ModifyTime Latest update time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public VulIgnoreRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulIgnoreRule(VulIgnoreRule source) {
        if (source.VulID != null) {
            this.VulID = new Long(source.VulID);
        }
        if (source.AssetScopeType != null) {
            this.AssetScopeType = new Long(source.AssetScopeType);
        }
        if (source.IncludeQuuidList != null) {
            this.IncludeQuuidList = new String[source.IncludeQuuidList.length];
            for (int i = 0; i < source.IncludeQuuidList.length; i++) {
                this.IncludeQuuidList[i] = new String(source.IncludeQuuidList[i]);
            }
        }
        if (source.ExcludeQuuidList != null) {
            this.ExcludeQuuidList = new String[source.ExcludeQuuidList.length];
            for (int i = 0; i < source.ExcludeQuuidList.length; i++) {
                this.ExcludeQuuidList[i] = new String(source.ExcludeQuuidList[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ConfigHostCount != null) {
            this.ConfigHostCount = new Long(source.ConfigHostCount);
        }
        if (source.AffectedHostCount != null) {
            this.AffectedHostCount = new Long(source.AffectedHostCount);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulID", this.VulID);
        this.setParamSimple(map, prefix + "AssetScopeType", this.AssetScopeType);
        this.setParamArraySimple(map, prefix + "IncludeQuuidList.", this.IncludeQuuidList);
        this.setParamArraySimple(map, prefix + "ExcludeQuuidList.", this.ExcludeQuuidList);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ConfigHostCount", this.ConfigHostCount);
        this.setParamSimple(map, prefix + "AffectedHostCount", this.AffectedHostCount);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

