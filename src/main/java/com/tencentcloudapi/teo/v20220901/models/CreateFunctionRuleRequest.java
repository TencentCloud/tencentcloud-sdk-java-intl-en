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

public class CreateFunctionRuleRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Rule condition list. There is an OR relationship between different conditions of the same trigger rule.
    */
    @SerializedName("FunctionRuleConditions")
    @Expose
    private FunctionRuleCondition [] FunctionRuleConditions;

    /**
    * Function selection configuration type.
<li> direct: directly specify the execution function;</li>
<li> weight: Select a function based on the weight ratio;</li>
<li> region: country/region selection function based on client IP.</li>
Default value: direct.
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * ID of the function to execute. This parameter is valid only when TriggerType is direct or not specified.
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * Function selection configuration based on client IP country/region. This parameter is valid only when TriggerType is region, and RegionMappingSelections is required. RegionMappingSelections must include at least one configuration with Regions set to Default.
    */
    @SerializedName("RegionMappingSelections")
    @Expose
    private FunctionRegionSelection [] RegionMappingSelections;

    /**
    * Weight-based function selection configuration. This parameter is valid only when TriggerType is weight, and WeightedSelections is required. The sum of all weights in WeightedSelections needs to be 100.
    */
    @SerializedName("WeightedSelections")
    @Expose
    private FunctionWeightedSelection [] WeightedSelections;

    /**
    * Rule description, which can contain up to 60 characters.
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
     * Get Rule condition list. There is an OR relationship between different conditions of the same trigger rule. 
     * @return FunctionRuleConditions Rule condition list. There is an OR relationship between different conditions of the same trigger rule.
     */
    public FunctionRuleCondition [] getFunctionRuleConditions() {
        return this.FunctionRuleConditions;
    }

    /**
     * Set Rule condition list. There is an OR relationship between different conditions of the same trigger rule.
     * @param FunctionRuleConditions Rule condition list. There is an OR relationship between different conditions of the same trigger rule.
     */
    public void setFunctionRuleConditions(FunctionRuleCondition [] FunctionRuleConditions) {
        this.FunctionRuleConditions = FunctionRuleConditions;
    }

    /**
     * Get Function selection configuration type.
<li> direct: directly specify the execution function;</li>
<li> weight: Select a function based on the weight ratio;</li>
<li> region: country/region selection function based on client IP.</li>
Default value: direct. 
     * @return TriggerType Function selection configuration type.
<li> direct: directly specify the execution function;</li>
<li> weight: Select a function based on the weight ratio;</li>
<li> region: country/region selection function based on client IP.</li>
Default value: direct.
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Function selection configuration type.
<li> direct: directly specify the execution function;</li>
<li> weight: Select a function based on the weight ratio;</li>
<li> region: country/region selection function based on client IP.</li>
Default value: direct.
     * @param TriggerType Function selection configuration type.
<li> direct: directly specify the execution function;</li>
<li> weight: Select a function based on the weight ratio;</li>
<li> region: country/region selection function based on client IP.</li>
Default value: direct.
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get ID of the function to execute. This parameter is valid only when TriggerType is direct or not specified. 
     * @return FunctionId ID of the function to execute. This parameter is valid only when TriggerType is direct or not specified.
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set ID of the function to execute. This parameter is valid only when TriggerType is direct or not specified.
     * @param FunctionId ID of the function to execute. This parameter is valid only when TriggerType is direct or not specified.
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get Function selection configuration based on client IP country/region. This parameter is valid only when TriggerType is region, and RegionMappingSelections is required. RegionMappingSelections must include at least one configuration with Regions set to Default. 
     * @return RegionMappingSelections Function selection configuration based on client IP country/region. This parameter is valid only when TriggerType is region, and RegionMappingSelections is required. RegionMappingSelections must include at least one configuration with Regions set to Default.
     */
    public FunctionRegionSelection [] getRegionMappingSelections() {
        return this.RegionMappingSelections;
    }

    /**
     * Set Function selection configuration based on client IP country/region. This parameter is valid only when TriggerType is region, and RegionMappingSelections is required. RegionMappingSelections must include at least one configuration with Regions set to Default.
     * @param RegionMappingSelections Function selection configuration based on client IP country/region. This parameter is valid only when TriggerType is region, and RegionMappingSelections is required. RegionMappingSelections must include at least one configuration with Regions set to Default.
     */
    public void setRegionMappingSelections(FunctionRegionSelection [] RegionMappingSelections) {
        this.RegionMappingSelections = RegionMappingSelections;
    }

    /**
     * Get Weight-based function selection configuration. This parameter is valid only when TriggerType is weight, and WeightedSelections is required. The sum of all weights in WeightedSelections needs to be 100. 
     * @return WeightedSelections Weight-based function selection configuration. This parameter is valid only when TriggerType is weight, and WeightedSelections is required. The sum of all weights in WeightedSelections needs to be 100.
     */
    public FunctionWeightedSelection [] getWeightedSelections() {
        return this.WeightedSelections;
    }

    /**
     * Set Weight-based function selection configuration. This parameter is valid only when TriggerType is weight, and WeightedSelections is required. The sum of all weights in WeightedSelections needs to be 100.
     * @param WeightedSelections Weight-based function selection configuration. This parameter is valid only when TriggerType is weight, and WeightedSelections is required. The sum of all weights in WeightedSelections needs to be 100.
     */
    public void setWeightedSelections(FunctionWeightedSelection [] WeightedSelections) {
        this.WeightedSelections = WeightedSelections;
    }

    /**
     * Get Rule description, which can contain up to 60 characters. 
     * @return Remark Rule description, which can contain up to 60 characters.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Rule description, which can contain up to 60 characters.
     * @param Remark Rule description, which can contain up to 60 characters.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateFunctionRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFunctionRuleRequest(CreateFunctionRuleRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
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
        this.setParamArrayObj(map, prefix + "FunctionRuleConditions.", this.FunctionRuleConditions);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamArrayObj(map, prefix + "RegionMappingSelections.", this.RegionMappingSelections);
        this.setParamArrayObj(map, prefix + "WeightedSelections.", this.WeightedSelections);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

