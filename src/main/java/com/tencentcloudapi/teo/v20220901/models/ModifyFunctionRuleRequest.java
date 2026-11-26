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
    * <p>Zone ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Rule ID. You can first use the DescribeFunctionRules API to get the RuleId of the rule that needs to be modified, then import the modified rule content. The original rule content will be overwritten.</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>Rule condition list. There is an OR relationship between different conditions of the same trigger rule. If not specified, the original configuration is maintained.</p>
    */
    @SerializedName("FunctionRuleConditions")
    @Expose
    private FunctionRuleCondition [] FunctionRuleConditions;

    /**
    * <p>Function selection configuration type:</p><li> direct: directly specify the execution function;</li><li> weight: select a function based on weight ratio;</li><li> region: select a function based on the client IP country/region.</li>Defaults to direct if not specified.
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>Specify the function ID to be executed. This parameter is valid only when TriggerType is direct or left empty.</p>
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * <p>Function selection configuration based on client IP country/region. This parameter is valid only when TriggerType is region, and RegionMappingSelections is required. RegionMappingSelections must contain one configuration with Regions as Default, and requires at least one other specific Region.</p>
    */
    @SerializedName("RegionMappingSelections")
    @Expose
    private FunctionRegionSelection [] RegionMappingSelections;

    /**
    * <p>Weight-based function selection configuration. This parameter is valid only when TriggerType is weight and WeightedSelections is required. The sum of all weights in WeightedSelections need to be 100.</p>
    */
    @SerializedName("WeightedSelections")
    @Expose
    private FunctionWeightedSelection [] WeightedSelections;

    /**
    * <p>Rule description, which can contain up to 60 characters. If this parameter is not input, the original configuration is maintained.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get <p>Zone ID.</p> 
     * @return ZoneId <p>Zone ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Zone ID.</p>
     * @param ZoneId <p>Zone ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Rule ID. You can first use the DescribeFunctionRules API to get the RuleId of the rule that needs to be modified, then import the modified rule content. The original rule content will be overwritten.</p> 
     * @return RuleId <p>Rule ID. You can first use the DescribeFunctionRules API to get the RuleId of the rule that needs to be modified, then import the modified rule content. The original rule content will be overwritten.</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>Rule ID. You can first use the DescribeFunctionRules API to get the RuleId of the rule that needs to be modified, then import the modified rule content. The original rule content will be overwritten.</p>
     * @param RuleId <p>Rule ID. You can first use the DescribeFunctionRules API to get the RuleId of the rule that needs to be modified, then import the modified rule content. The original rule content will be overwritten.</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>Rule condition list. There is an OR relationship between different conditions of the same trigger rule. If not specified, the original configuration is maintained.</p> 
     * @return FunctionRuleConditions <p>Rule condition list. There is an OR relationship between different conditions of the same trigger rule. If not specified, the original configuration is maintained.</p>
     */
    public FunctionRuleCondition [] getFunctionRuleConditions() {
        return this.FunctionRuleConditions;
    }

    /**
     * Set <p>Rule condition list. There is an OR relationship between different conditions of the same trigger rule. If not specified, the original configuration is maintained.</p>
     * @param FunctionRuleConditions <p>Rule condition list. There is an OR relationship between different conditions of the same trigger rule. If not specified, the original configuration is maintained.</p>
     */
    public void setFunctionRuleConditions(FunctionRuleCondition [] FunctionRuleConditions) {
        this.FunctionRuleConditions = FunctionRuleConditions;
    }

    /**
     * Get <p>Function selection configuration type:</p><li> direct: directly specify the execution function;</li><li> weight: select a function based on weight ratio;</li><li> region: select a function based on the client IP country/region.</li>Defaults to direct if not specified. 
     * @return TriggerType <p>Function selection configuration type:</p><li> direct: directly specify the execution function;</li><li> weight: select a function based on weight ratio;</li><li> region: select a function based on the client IP country/region.</li>Defaults to direct if not specified.
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>Function selection configuration type:</p><li> direct: directly specify the execution function;</li><li> weight: select a function based on weight ratio;</li><li> region: select a function based on the client IP country/region.</li>Defaults to direct if not specified.
     * @param TriggerType <p>Function selection configuration type:</p><li> direct: directly specify the execution function;</li><li> weight: select a function based on weight ratio;</li><li> region: select a function based on the client IP country/region.</li>Defaults to direct if not specified.
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>Specify the function ID to be executed. This parameter is valid only when TriggerType is direct or left empty.</p> 
     * @return FunctionId <p>Specify the function ID to be executed. This parameter is valid only when TriggerType is direct or left empty.</p>
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set <p>Specify the function ID to be executed. This parameter is valid only when TriggerType is direct or left empty.</p>
     * @param FunctionId <p>Specify the function ID to be executed. This parameter is valid only when TriggerType is direct or left empty.</p>
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get <p>Function selection configuration based on client IP country/region. This parameter is valid only when TriggerType is region, and RegionMappingSelections is required. RegionMappingSelections must contain one configuration with Regions as Default, and requires at least one other specific Region.</p> 
     * @return RegionMappingSelections <p>Function selection configuration based on client IP country/region. This parameter is valid only when TriggerType is region, and RegionMappingSelections is required. RegionMappingSelections must contain one configuration with Regions as Default, and requires at least one other specific Region.</p>
     */
    public FunctionRegionSelection [] getRegionMappingSelections() {
        return this.RegionMappingSelections;
    }

    /**
     * Set <p>Function selection configuration based on client IP country/region. This parameter is valid only when TriggerType is region, and RegionMappingSelections is required. RegionMappingSelections must contain one configuration with Regions as Default, and requires at least one other specific Region.</p>
     * @param RegionMappingSelections <p>Function selection configuration based on client IP country/region. This parameter is valid only when TriggerType is region, and RegionMappingSelections is required. RegionMappingSelections must contain one configuration with Regions as Default, and requires at least one other specific Region.</p>
     */
    public void setRegionMappingSelections(FunctionRegionSelection [] RegionMappingSelections) {
        this.RegionMappingSelections = RegionMappingSelections;
    }

    /**
     * Get <p>Weight-based function selection configuration. This parameter is valid only when TriggerType is weight and WeightedSelections is required. The sum of all weights in WeightedSelections need to be 100.</p> 
     * @return WeightedSelections <p>Weight-based function selection configuration. This parameter is valid only when TriggerType is weight and WeightedSelections is required. The sum of all weights in WeightedSelections need to be 100.</p>
     */
    public FunctionWeightedSelection [] getWeightedSelections() {
        return this.WeightedSelections;
    }

    /**
     * Set <p>Weight-based function selection configuration. This parameter is valid only when TriggerType is weight and WeightedSelections is required. The sum of all weights in WeightedSelections need to be 100.</p>
     * @param WeightedSelections <p>Weight-based function selection configuration. This parameter is valid only when TriggerType is weight and WeightedSelections is required. The sum of all weights in WeightedSelections need to be 100.</p>
     */
    public void setWeightedSelections(FunctionWeightedSelection [] WeightedSelections) {
        this.WeightedSelections = WeightedSelections;
    }

    /**
     * Get <p>Rule description, which can contain up to 60 characters. If this parameter is not input, the original configuration is maintained.</p> 
     * @return Remark <p>Rule description, which can contain up to 60 characters. If this parameter is not input, the original configuration is maintained.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Rule description, which can contain up to 60 characters. If this parameter is not input, the original configuration is maintained.</p>
     * @param Remark <p>Rule description, which can contain up to 60 characters. If this parameter is not input, the original configuration is maintained.</p>
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

