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

public class FunctionRule extends AbstractModel {

    /**
    * Rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Rule condition list. There is an OR relationship between items in the list.
    */
    @SerializedName("FunctionRuleConditions")
    @Expose
    private FunctionRuleCondition [] FunctionRuleConditions;

    /**
    * Function selection configuration type.
<Li>Direct: specifies the execution function directly.</li>.
<Li>Weight: selects the function based on weight ratio.</li>.
<li> region: specifies the country/region selection function based on client IP.</li>.

    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * Specifies the function ID to be executed. valid only when TriggerType is direct.
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * Specifies the name of the function executed.
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Function selection configuration based on client IP country/region.
    */
    @SerializedName("RegionMappingSelections")
    @Expose
    private FunctionRegionSelection [] RegionMappingSelections;

    /**
    * Describes the function selection configuration based on weight.
    */
    @SerializedName("WeightedSelections")
    @Expose
    private FunctionWeightedSelection [] WeightedSelections;

    /**
    * Priority of a trigger rule for a function. The larger the value, the higher the priority.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Rule description.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Rule ID. 
     * @return RuleId Rule ID.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID.
     * @param RuleId Rule ID.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule condition list. There is an OR relationship between items in the list. 
     * @return FunctionRuleConditions Rule condition list. There is an OR relationship between items in the list.
     */
    public FunctionRuleCondition [] getFunctionRuleConditions() {
        return this.FunctionRuleConditions;
    }

    /**
     * Set Rule condition list. There is an OR relationship between items in the list.
     * @param FunctionRuleConditions Rule condition list. There is an OR relationship between items in the list.
     */
    public void setFunctionRuleConditions(FunctionRuleCondition [] FunctionRuleConditions) {
        this.FunctionRuleConditions = FunctionRuleConditions;
    }

    /**
     * Get Function selection configuration type.
<Li>Direct: specifies the execution function directly.</li>.
<Li>Weight: selects the function based on weight ratio.</li>.
<li> region: specifies the country/region selection function based on client IP.</li>.
 
     * @return TriggerType Function selection configuration type.
<Li>Direct: specifies the execution function directly.</li>.
<Li>Weight: selects the function based on weight ratio.</li>.
<li> region: specifies the country/region selection function based on client IP.</li>.

     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Function selection configuration type.
<Li>Direct: specifies the execution function directly.</li>.
<Li>Weight: selects the function based on weight ratio.</li>.
<li> region: specifies the country/region selection function based on client IP.</li>.

     * @param TriggerType Function selection configuration type.
<Li>Direct: specifies the execution function directly.</li>.
<Li>Weight: selects the function based on weight ratio.</li>.
<li> region: specifies the country/region selection function based on client IP.</li>.

     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get Specifies the function ID to be executed. valid only when TriggerType is direct. 
     * @return FunctionId Specifies the function ID to be executed. valid only when TriggerType is direct.
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set Specifies the function ID to be executed. valid only when TriggerType is direct.
     * @param FunctionId Specifies the function ID to be executed. valid only when TriggerType is direct.
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get Specifies the name of the function executed. 
     * @return FunctionName Specifies the name of the function executed.
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Specifies the name of the function executed.
     * @param FunctionName Specifies the name of the function executed.
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Function selection configuration based on client IP country/region. 
     * @return RegionMappingSelections Function selection configuration based on client IP country/region.
     */
    public FunctionRegionSelection [] getRegionMappingSelections() {
        return this.RegionMappingSelections;
    }

    /**
     * Set Function selection configuration based on client IP country/region.
     * @param RegionMappingSelections Function selection configuration based on client IP country/region.
     */
    public void setRegionMappingSelections(FunctionRegionSelection [] RegionMappingSelections) {
        this.RegionMappingSelections = RegionMappingSelections;
    }

    /**
     * Get Describes the function selection configuration based on weight. 
     * @return WeightedSelections Describes the function selection configuration based on weight.
     */
    public FunctionWeightedSelection [] getWeightedSelections() {
        return this.WeightedSelections;
    }

    /**
     * Set Describes the function selection configuration based on weight.
     * @param WeightedSelections Describes the function selection configuration based on weight.
     */
    public void setWeightedSelections(FunctionWeightedSelection [] WeightedSelections) {
        this.WeightedSelections = WeightedSelections;
    }

    /**
     * Get Priority of a trigger rule for a function. The larger the value, the higher the priority. 
     * @return Priority Priority of a trigger rule for a function. The larger the value, the higher the priority.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority of a trigger rule for a function. The larger the value, the higher the priority.
     * @param Priority Priority of a trigger rule for a function. The larger the value, the higher the priority.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Rule description. 
     * @return Remark Rule description.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Rule description.
     * @param Remark Rule description.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard. 
     * @return CreateTime Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     * @param CreateTime Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard. 
     * @return UpdateTime Update time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     * @param UpdateTime Update time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public FunctionRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionRule(FunctionRule source) {
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
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
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
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "FunctionRuleConditions.", this.FunctionRuleConditions);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamArrayObj(map, prefix + "RegionMappingSelections.", this.RegionMappingSelections);
        this.setParamArrayObj(map, prefix + "WeightedSelections.", this.WeightedSelections);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

