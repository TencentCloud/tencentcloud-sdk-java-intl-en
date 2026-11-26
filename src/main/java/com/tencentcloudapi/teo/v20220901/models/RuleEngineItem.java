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

public class RuleEngineItem extends AbstractModel {

    /**
    * <p>Rule status. Valid values: <li> enable: Enable; </li><li> disable: Disabled.</li></p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Rule ID. The unique identifier of a rule. This parameter is required when calling ModifyL7AccRule.</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>Rule name. The name can contain no more than 255 characters.</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>Rule note. Multiple notes can be filled.</p>
    */
    @SerializedName("Description")
    @Expose
    private String [] Description;

    /**
    * <p>List of rule-level custom variables. CustomVariable.Name requires the use of user.rule. as a prefix. Variables are initialized sequentially in the array order. InitialValue supports referencing site-level custom variables and rule-level custom variables before the current variable. It does not support referencing the current variable itself or rule-level custom variables after it. Site-level custom variables can be queried through the DescribeZoneCustomVariables API. When Branches is empty, CustomVariable cannot be filled in, and any entry is invalid.</p>
    */
    @SerializedName("CustomVariables")
    @Expose
    private CustomVariable [] CustomVariables;

    /**
    * <p>Operation details of rule-level custom variables. You can reference site-level custom variables and rule-level custom variables defined in the current rule during operations. Site-level custom variables can be queried through the DescribeZoneCustomVariables API. This list currently only supports filling in one rule; additional entries are invalid. When Branches is empty, CustomVariableOperations is not allowed to be filled in, and any entry will be invalid.</p>
    */
    @SerializedName("CustomVariableOperations")
    @Expose
    private CustomVariableOperation [] CustomVariableOperations;

    /**
    * <p>Sub-rule branch. This list currently only supports filling in one rule. Additional rules are invalid.</p>
    */
    @SerializedName("Branches")
    @Expose
    private RuleBranch [] Branches;

    /**
    * <p>Rule priority. Output only.</p>
    */
    @SerializedName("RulePriority")
    @Expose
    private Long RulePriority;

    /**
     * Get <p>Rule status. Valid values: <li> enable: Enable; </li><li> disable: Disabled.</li></p> 
     * @return Status <p>Rule status. Valid values: <li> enable: Enable; </li><li> disable: Disabled.</li></p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Rule status. Valid values: <li> enable: Enable; </li><li> disable: Disabled.</li></p>
     * @param Status <p>Rule status. Valid values: <li> enable: Enable; </li><li> disable: Disabled.</li></p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Rule ID. The unique identifier of a rule. This parameter is required when calling ModifyL7AccRule.</p> 
     * @return RuleId <p>Rule ID. The unique identifier of a rule. This parameter is required when calling ModifyL7AccRule.</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>Rule ID. The unique identifier of a rule. This parameter is required when calling ModifyL7AccRule.</p>
     * @param RuleId <p>Rule ID. The unique identifier of a rule. This parameter is required when calling ModifyL7AccRule.</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>Rule name. The name can contain no more than 255 characters.</p> 
     * @return RuleName <p>Rule name. The name can contain no more than 255 characters.</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>Rule name. The name can contain no more than 255 characters.</p>
     * @param RuleName <p>Rule name. The name can contain no more than 255 characters.</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>Rule note. Multiple notes can be filled.</p> 
     * @return Description <p>Rule note. Multiple notes can be filled.</p>
     */
    public String [] getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Rule note. Multiple notes can be filled.</p>
     * @param Description <p>Rule note. Multiple notes can be filled.</p>
     */
    public void setDescription(String [] Description) {
        this.Description = Description;
    }

    /**
     * Get <p>List of rule-level custom variables. CustomVariable.Name requires the use of user.rule. as a prefix. Variables are initialized sequentially in the array order. InitialValue supports referencing site-level custom variables and rule-level custom variables before the current variable. It does not support referencing the current variable itself or rule-level custom variables after it. Site-level custom variables can be queried through the DescribeZoneCustomVariables API. When Branches is empty, CustomVariable cannot be filled in, and any entry is invalid.</p> 
     * @return CustomVariables <p>List of rule-level custom variables. CustomVariable.Name requires the use of user.rule. as a prefix. Variables are initialized sequentially in the array order. InitialValue supports referencing site-level custom variables and rule-level custom variables before the current variable. It does not support referencing the current variable itself or rule-level custom variables after it. Site-level custom variables can be queried through the DescribeZoneCustomVariables API. When Branches is empty, CustomVariable cannot be filled in, and any entry is invalid.</p>
     */
    public CustomVariable [] getCustomVariables() {
        return this.CustomVariables;
    }

    /**
     * Set <p>List of rule-level custom variables. CustomVariable.Name requires the use of user.rule. as a prefix. Variables are initialized sequentially in the array order. InitialValue supports referencing site-level custom variables and rule-level custom variables before the current variable. It does not support referencing the current variable itself or rule-level custom variables after it. Site-level custom variables can be queried through the DescribeZoneCustomVariables API. When Branches is empty, CustomVariable cannot be filled in, and any entry is invalid.</p>
     * @param CustomVariables <p>List of rule-level custom variables. CustomVariable.Name requires the use of user.rule. as a prefix. Variables are initialized sequentially in the array order. InitialValue supports referencing site-level custom variables and rule-level custom variables before the current variable. It does not support referencing the current variable itself or rule-level custom variables after it. Site-level custom variables can be queried through the DescribeZoneCustomVariables API. When Branches is empty, CustomVariable cannot be filled in, and any entry is invalid.</p>
     */
    public void setCustomVariables(CustomVariable [] CustomVariables) {
        this.CustomVariables = CustomVariables;
    }

    /**
     * Get <p>Operation details of rule-level custom variables. You can reference site-level custom variables and rule-level custom variables defined in the current rule during operations. Site-level custom variables can be queried through the DescribeZoneCustomVariables API. This list currently only supports filling in one rule; additional entries are invalid. When Branches is empty, CustomVariableOperations is not allowed to be filled in, and any entry will be invalid.</p> 
     * @return CustomVariableOperations <p>Operation details of rule-level custom variables. You can reference site-level custom variables and rule-level custom variables defined in the current rule during operations. Site-level custom variables can be queried through the DescribeZoneCustomVariables API. This list currently only supports filling in one rule; additional entries are invalid. When Branches is empty, CustomVariableOperations is not allowed to be filled in, and any entry will be invalid.</p>
     */
    public CustomVariableOperation [] getCustomVariableOperations() {
        return this.CustomVariableOperations;
    }

    /**
     * Set <p>Operation details of rule-level custom variables. You can reference site-level custom variables and rule-level custom variables defined in the current rule during operations. Site-level custom variables can be queried through the DescribeZoneCustomVariables API. This list currently only supports filling in one rule; additional entries are invalid. When Branches is empty, CustomVariableOperations is not allowed to be filled in, and any entry will be invalid.</p>
     * @param CustomVariableOperations <p>Operation details of rule-level custom variables. You can reference site-level custom variables and rule-level custom variables defined in the current rule during operations. Site-level custom variables can be queried through the DescribeZoneCustomVariables API. This list currently only supports filling in one rule; additional entries are invalid. When Branches is empty, CustomVariableOperations is not allowed to be filled in, and any entry will be invalid.</p>
     */
    public void setCustomVariableOperations(CustomVariableOperation [] CustomVariableOperations) {
        this.CustomVariableOperations = CustomVariableOperations;
    }

    /**
     * Get <p>Sub-rule branch. This list currently only supports filling in one rule. Additional rules are invalid.</p> 
     * @return Branches <p>Sub-rule branch. This list currently only supports filling in one rule. Additional rules are invalid.</p>
     */
    public RuleBranch [] getBranches() {
        return this.Branches;
    }

    /**
     * Set <p>Sub-rule branch. This list currently only supports filling in one rule. Additional rules are invalid.</p>
     * @param Branches <p>Sub-rule branch. This list currently only supports filling in one rule. Additional rules are invalid.</p>
     */
    public void setBranches(RuleBranch [] Branches) {
        this.Branches = Branches;
    }

    /**
     * Get <p>Rule priority. Output only.</p> 
     * @return RulePriority <p>Rule priority. Output only.</p>
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set <p>Rule priority. Output only.</p>
     * @param RulePriority <p>Rule priority. Output only.</p>
     */
    public void setRulePriority(Long RulePriority) {
        this.RulePriority = RulePriority;
    }

    public RuleEngineItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleEngineItem(RuleEngineItem source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Description != null) {
            this.Description = new String[source.Description.length];
            for (int i = 0; i < source.Description.length; i++) {
                this.Description[i] = new String(source.Description[i]);
            }
        }
        if (source.CustomVariables != null) {
            this.CustomVariables = new CustomVariable[source.CustomVariables.length];
            for (int i = 0; i < source.CustomVariables.length; i++) {
                this.CustomVariables[i] = new CustomVariable(source.CustomVariables[i]);
            }
        }
        if (source.CustomVariableOperations != null) {
            this.CustomVariableOperations = new CustomVariableOperation[source.CustomVariableOperations.length];
            for (int i = 0; i < source.CustomVariableOperations.length; i++) {
                this.CustomVariableOperations[i] = new CustomVariableOperation(source.CustomVariableOperations[i]);
            }
        }
        if (source.Branches != null) {
            this.Branches = new RuleBranch[source.Branches.length];
            for (int i = 0; i < source.Branches.length; i++) {
                this.Branches[i] = new RuleBranch(source.Branches[i]);
            }
        }
        if (source.RulePriority != null) {
            this.RulePriority = new Long(source.RulePriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArraySimple(map, prefix + "Description.", this.Description);
        this.setParamArrayObj(map, prefix + "CustomVariables.", this.CustomVariables);
        this.setParamArrayObj(map, prefix + "CustomVariableOperations.", this.CustomVariableOperations);
        this.setParamArrayObj(map, prefix + "Branches.", this.Branches);
        this.setParamSimple(map, prefix + "RulePriority", this.RulePriority);

    }
}

