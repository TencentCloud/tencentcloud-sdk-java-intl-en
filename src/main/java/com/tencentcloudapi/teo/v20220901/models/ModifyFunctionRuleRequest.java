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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyFunctionRuleRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Rule ID. you can first use the DescribeFunctionRules API to get the RuleId that needs to be modified, then input the modified rule content. the original rule content will be overwritten.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Rule condition list. There is an OR relationship between different conditions of the same trigger rule. If this parameter is not input, the original configuration is maintained.
    */
    @SerializedName("FunctionRuleConditions")
    @Expose
    private FunctionRuleCondition [] FunctionRuleConditions;

    /**
    * Function selection configuration type.
<Li>Direct: specifies the execution function directly.</li>.
<Li>Weight: selects the function based on weight ratio.</li>.
<li> region: specifies the country/region selection function based on client IP.</li>.
Specifies the default value as direct when left blank.
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * Specifies the function ID to be executed. this parameter is valid only when TriggerType is direct or left empty.
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * Function selection configuration based on client IP country/region. this parameter is valid only when TriggerType is region and RegionMappingSelections is required. RegionMappingSelections must include at least one configuration with Regions set to Default.
    */
    @SerializedName("RegionMappingSelections")
    @Expose
    private FunctionRegionSelection [] RegionMappingSelections;

    /**
    * Weighted function selection configuration. this parameter is valid only when TriggerType is weight and WeightedSelections is required. the sum of all weights in WeightedSelections need to be 100.
    */
    @SerializedName("WeightedSelections")
    @Expose
    private FunctionWeightedSelection [] WeightedSelections;

    /**
    * Rule description, which can contain up to 60 characters. If this parameter is not input, the original configuration is maintained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Rule ID. you can first use the DescribeFunctionRules API to get the RuleId that needs to be modified, then input the modified rule content. the original rule content will be overwritten. 
     * @return RuleId Rule ID. you can first use the DescribeFunctionRules API to get the RuleId that needs to be modified, then input the modified rule content. the original rule content will be overwritten.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID. you can first use the DescribeFunctionRules API to get the RuleId that needs to be modified, then input the modified rule content. the original rule content will be overwritten.
     * @param RuleId Rule ID. you can first use the DescribeFunctionRules API to get the RuleId that needs to be modified, then input the modified rule content. the original rule content will be overwritten.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule condition list. There is an OR relationship between different conditions of the same trigger rule. If this parameter is not input, the original configuration is maintained. 
     * @return FunctionRuleConditions Rule condition list. There is an OR relationship between different conditions of the same trigger rule. If this parameter is not input, the original configuration is maintained.
     */
    public FunctionRuleCondition [] getFunctionRuleConditions() {
        return this.FunctionRuleConditions;
    }

    /**
     * Set Rule condition list. There is an OR relationship between different conditions of the same trigger rule. If this parameter is not input, the original configuration is maintained.
     * @param FunctionRuleConditions Rule condition list. There is an OR relationship between different conditions of the same trigger rule. If this parameter is not input, the original configuration is maintained.
     */
    public void setFunctionRuleConditions(FunctionRuleCondition [] FunctionRuleConditions) {
        this.FunctionRuleConditions = FunctionRuleConditions;
    }

    /**
     * Get Function selection configuration type.
<Li>Direct: specifies the execution function directly.</li>.
<Li>Weight: selects the function based on weight ratio.</li>.
<li> region: specifies the country/region selection function based on client IP.</li>.
Specifies the default value as direct when left blank. 
     * @return TriggerType Function selection configuration type.
<Li>Direct: specifies the execution function directly.</li>.
<Li>Weight: selects the function based on weight ratio.</li>.
<li> region: specifies the country/region selection function based on client IP.</li>.
Specifies the default value as direct when left blank.
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Function selection configuration type.
<Li>Direct: specifies the execution function directly.</li>.
<Li>Weight: selects the function based on weight ratio.</li>.
<li> region: specifies the country/region selection function based on client IP.</li>.
Specifies the default value as direct when left blank.
     * @param TriggerType Function selection configuration type.
<Li>Direct: specifies the execution function directly.</li>.
<Li>Weight: selects the function based on weight ratio.</li>.
<li> region: specifies the country/region selection function based on client IP.</li>.
Specifies the default value as direct when left blank.
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get Specifies the function ID to be executed. this parameter is valid only when TriggerType is direct or left empty. 
     * @return FunctionId Specifies the function ID to be executed. this parameter is valid only when TriggerType is direct or left empty.
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set Specifies the function ID to be executed. this parameter is valid only when TriggerType is direct or left empty.
     * @param FunctionId Specifies the function ID to be executed. this parameter is valid only when TriggerType is direct or left empty.
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get Function selection configuration based on client IP country/region. this parameter is valid only when TriggerType is region and RegionMappingSelections is required. RegionMappingSelections must include at least one configuration with Regions set to Default. 
     * @return RegionMappingSelections Function selection configuration based on client IP country/region. this parameter is valid only when TriggerType is region and RegionMappingSelections is required. RegionMappingSelections must include at least one configuration with Regions set to Default.
     */
    public FunctionRegionSelection [] getRegionMappingSelections() {
        return this.RegionMappingSelections;
    }

    /**
     * Set Function selection configuration based on client IP country/region. this parameter is valid only when TriggerType is region and RegionMappingSelections is required. RegionMappingSelections must include at least one configuration with Regions set to Default.
     * @param RegionMappingSelections Function selection configuration based on client IP country/region. this parameter is valid only when TriggerType is region and RegionMappingSelections is required. RegionMappingSelections must include at least one configuration with Regions set to Default.
     */
    public void setRegionMappingSelections(FunctionRegionSelection [] RegionMappingSelections) {
        this.RegionMappingSelections = RegionMappingSelections;
    }

    /**
     * Get Weighted function selection configuration. this parameter is valid only when TriggerType is weight and WeightedSelections is required. the sum of all weights in WeightedSelections need to be 100. 
     * @return WeightedSelections Weighted function selection configuration. this parameter is valid only when TriggerType is weight and WeightedSelections is required. the sum of all weights in WeightedSelections need to be 100.
     */
    public FunctionWeightedSelection [] getWeightedSelections() {
        return this.WeightedSelections;
    }

    /**
     * Set Weighted function selection configuration. this parameter is valid only when TriggerType is weight and WeightedSelections is required. the sum of all weights in WeightedSelections need to be 100.
     * @param WeightedSelections Weighted function selection configuration. this parameter is valid only when TriggerType is weight and WeightedSelections is required. the sum of all weights in WeightedSelections need to be 100.
     */
    public void setWeightedSelections(FunctionWeightedSelection [] WeightedSelections) {
        this.WeightedSelections = WeightedSelections;
    }

    /**
     * Get Rule description, which can contain up to 60 characters. If this parameter is not input, the original configuration is maintained. 
     * @return Remark Rule description, which can contain up to 60 characters. If this parameter is not input, the original configuration is maintained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Rule description, which can contain up to 60 characters. If this parameter is not input, the original configuration is maintained.
     * @param Remark Rule description, which can contain up to 60 characters. If this parameter is not input, the original configuration is maintained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyFunctionRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFunctionRuleRequest(ModifyFunctionRuleRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.FunctionRuleConditions != null) {
            this.FunctionRuleConditions = new FunctionRuleCondition[source.FunctionRuleConditions.length];
            for (int i = 0; i < source.FunctionRuleConditions.length; i++) {
                this.FunctionRuleConditions[i] = new FunctionRuleCondition(source.FunctionRuleConditions[i]);
            }
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.RegionMappingSelections != null) {
            this.RegionMappingSelections = new FunctionRegionSelection[source.RegionMappingSelections.length];
            for (int i = 0; i < source.RegionMappingSelections.length; i++) {
                this.RegionMappingSelections[i] = new FunctionRegionSelection(source.RegionMappingSelections[i]);
            }
        }
        if (source.WeightedSelections != null) {
            this.WeightedSelections = new FunctionWeightedSelection[source.WeightedSelections.length];
            for (int i = 0; i < source.WeightedSelections.length; i++) {
                this.WeightedSelections[i] = new FunctionWeightedSelection(source.WeightedSelections[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "FunctionRuleConditions.", this.FunctionRuleConditions);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamArrayObj(map, prefix + "RegionMappingSelections.", this.RegionMappingSelections);
        this.setParamArrayObj(map, prefix + "WeightedSelections.", this.WeightedSelections);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

