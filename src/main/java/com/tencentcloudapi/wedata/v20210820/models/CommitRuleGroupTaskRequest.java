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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommitRuleGroupTaskRequest extends AbstractModel {

    /**
    * Rule Group ID
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * Trigger Type 1. Manual Trigger 2. In-process Scheduling Trigger 3. Periodic Scheduling Trigger
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * Rule Configuration List
    */
    @SerializedName("ExecRuleConfig")
    @Expose
    private RuleConfig [] ExecRuleConfig;

    /**
    * Execution configuration
    */
    @SerializedName("ExecConfig")
    @Expose
    private RuleExecConfig ExecConfig;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * The execution engine that this rule runs. If this parameter is not passed, the default execution engine under this data source will be requested.
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
     * Get Rule Group ID 
     * @return RuleGroupId Rule Group ID
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set Rule Group ID
     * @param RuleGroupId Rule Group ID
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get Trigger Type 1. Manual Trigger 2. In-process Scheduling Trigger 3. Periodic Scheduling Trigger 
     * @return TriggerType Trigger Type 1. Manual Trigger 2. In-process Scheduling Trigger 3. Periodic Scheduling Trigger
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Trigger Type 1. Manual Trigger 2. In-process Scheduling Trigger 3. Periodic Scheduling Trigger
     * @param TriggerType Trigger Type 1. Manual Trigger 2. In-process Scheduling Trigger 3. Periodic Scheduling Trigger
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get Rule Configuration List 
     * @return ExecRuleConfig Rule Configuration List
     */
    public RuleConfig [] getExecRuleConfig() {
        return this.ExecRuleConfig;
    }

    /**
     * Set Rule Configuration List
     * @param ExecRuleConfig Rule Configuration List
     */
    public void setExecRuleConfig(RuleConfig [] ExecRuleConfig) {
        this.ExecRuleConfig = ExecRuleConfig;
    }

    /**
     * Get Execution configuration 
     * @return ExecConfig Execution configuration
     */
    public RuleExecConfig getExecConfig() {
        return this.ExecConfig;
    }

    /**
     * Set Execution configuration
     * @param ExecConfig Execution configuration
     */
    public void setExecConfig(RuleExecConfig ExecConfig) {
        this.ExecConfig = ExecConfig;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get The execution engine that this rule runs. If this parameter is not passed, the default execution engine under this data source will be requested. 
     * @return EngineType The execution engine that this rule runs. If this parameter is not passed, the default execution engine under this data source will be requested.
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set The execution engine that this rule runs. If this parameter is not passed, the default execution engine under this data source will be requested.
     * @param EngineType The execution engine that this rule runs. If this parameter is not passed, the default execution engine under this data source will be requested.
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    public CommitRuleGroupTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommitRuleGroupTaskRequest(CommitRuleGroupTaskRequest source) {
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
        if (source.ExecRuleConfig != null) {
            this.ExecRuleConfig = new RuleConfig[source.ExecRuleConfig.length];
            for (int i = 0; i < source.ExecRuleConfig.length; i++) {
                this.ExecRuleConfig[i] = new RuleConfig(source.ExecRuleConfig[i]);
            }
        }
        if (source.ExecConfig != null) {
            this.ExecConfig = new RuleExecConfig(source.ExecConfig);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamArrayObj(map, prefix + "ExecRuleConfig.", this.ExecRuleConfig);
        this.setParamObj(map, prefix + "ExecConfig.", this.ExecConfig);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);

    }
}

