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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineItemInfo extends AbstractModel {

    /**
    * Baseline Detection Item ID
    */
    @SerializedName("ItemId")
    @Expose
    private Long ItemId;

    /**
    * Detection Item Name
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * ID of the Rule to Which the Detection Item Belongs
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Detection item description
    */
    @SerializedName("ItemDesc")
    @Expose
    private String ItemDesc;

    /**
    * Remediation Method for Inspection Items
    */
    @SerializedName("FixMethod")
    @Expose
    private String FixMethod;

    /**
    * Rule Name of Detection Item
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Risk level
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * System Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SysRuleId")
    @Expose
    private Long SysRuleId;

    /**
    * Referenced Custom Rule Information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RelatedCustomRuleInfo")
    @Expose
    private BaselineCustomRuleIdName [] RelatedCustomRuleInfo;

    /**
     * Get Baseline Detection Item ID 
     * @return ItemId Baseline Detection Item ID
     */
    public Long getItemId() {
        return this.ItemId;
    }

    /**
     * Set Baseline Detection Item ID
     * @param ItemId Baseline Detection Item ID
     */
    public void setItemId(Long ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get Detection Item Name 
     * @return ItemName Detection Item Name
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set Detection Item Name
     * @param ItemName Detection Item Name
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get ID of the Rule to Which the Detection Item Belongs
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleId ID of the Rule to Which the Detection Item Belongs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set ID of the Rule to Which the Detection Item Belongs
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleId ID of the Rule to Which the Detection Item Belongs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Detection item description 
     * @return ItemDesc Detection item description
     */
    public String getItemDesc() {
        return this.ItemDesc;
    }

    /**
     * Set Detection item description
     * @param ItemDesc Detection item description
     */
    public void setItemDesc(String ItemDesc) {
        this.ItemDesc = ItemDesc;
    }

    /**
     * Get Remediation Method for Inspection Items 
     * @return FixMethod Remediation Method for Inspection Items
     */
    public String getFixMethod() {
        return this.FixMethod;
    }

    /**
     * Set Remediation Method for Inspection Items
     * @param FixMethod Remediation Method for Inspection Items
     */
    public void setFixMethod(String FixMethod) {
        this.FixMethod = FixMethod;
    }

    /**
     * Get Rule Name of Detection Item 
     * @return RuleName Rule Name of Detection Item
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule Name of Detection Item
     * @param RuleName Rule Name of Detection Item
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Risk level 
     * @return Level Risk level
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level
     * @param Level Risk level
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get System Rule ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SysRuleId System Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSysRuleId() {
        return this.SysRuleId;
    }

    /**
     * Set System Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SysRuleId System Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSysRuleId(Long SysRuleId) {
        this.SysRuleId = SysRuleId;
    }

    /**
     * Get Referenced Custom Rule Information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RelatedCustomRuleInfo Referenced Custom Rule Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BaselineCustomRuleIdName [] getRelatedCustomRuleInfo() {
        return this.RelatedCustomRuleInfo;
    }

    /**
     * Set Referenced Custom Rule Information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RelatedCustomRuleInfo Referenced Custom Rule Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRelatedCustomRuleInfo(BaselineCustomRuleIdName [] RelatedCustomRuleInfo) {
        this.RelatedCustomRuleInfo = RelatedCustomRuleInfo;
    }

    public BaselineItemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineItemInfo(BaselineItemInfo source) {
        if (source.ItemId != null) {
            this.ItemId = new Long(source.ItemId);
        }
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.ItemDesc != null) {
            this.ItemDesc = new String(source.ItemDesc);
        }
        if (source.FixMethod != null) {
            this.FixMethod = new String(source.FixMethod);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.SysRuleId != null) {
            this.SysRuleId = new Long(source.SysRuleId);
        }
        if (source.RelatedCustomRuleInfo != null) {
            this.RelatedCustomRuleInfo = new BaselineCustomRuleIdName[source.RelatedCustomRuleInfo.length];
            for (int i = 0; i < source.RelatedCustomRuleInfo.length; i++) {
                this.RelatedCustomRuleInfo[i] = new BaselineCustomRuleIdName(source.RelatedCustomRuleInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "ItemDesc", this.ItemDesc);
        this.setParamSimple(map, prefix + "FixMethod", this.FixMethod);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "SysRuleId", this.SysRuleId);
        this.setParamArrayObj(map, prefix + "RelatedCustomRuleInfo.", this.RelatedCustomRuleInfo);

    }
}

