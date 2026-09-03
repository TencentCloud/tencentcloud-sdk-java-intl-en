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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAIWorkbenchTaskRequest extends AbstractModel {

    /**
    * <p>Task Name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Task description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Associated Agent ID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>Prompt Template</p>
    */
    @SerializedName("PromptTemplate")
    @Expose
    private String PromptTemplate;

    /**
    * <p>Output format: markdown / json</p>
    */
    @SerializedName("OutputFormat")
    @Expose
    private String OutputFormat;

    /**
    * <p>Trigger type: manual / cron / webhook</p>
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>Cron expression</p>
    */
    @SerializedName("CronExpr")
    @Expose
    private String CronExpr;

    /**
    * <p>Cron time zone</p>
    */
    @SerializedName("CronTimezone")
    @Expose
    private String CronTimezone;

    /**
    * <p>Associated resource map ID</p>
    */
    @SerializedName("ResourceMapId")
    @Expose
    private String ResourceMapId;

    /**
    * <p>Skill ID list</p>
    */
    @SerializedName("SkillIds")
    @Expose
    private String [] SkillIds;

    /**
    * <p>MCP endpoint ID list</p>
    */
    @SerializedName("McpEndpointIds")
    @Expose
    private String [] McpEndpointIds;

    /**
    * <p>Timeout (seconds)</p>
    */
    @SerializedName("TimeoutSec")
    @Expose
    private Long TimeoutSec;

    /**
    * <p>Retry count</p>
    */
    @SerializedName("RetryCount")
    @Expose
    private Long RetryCount;

    /**
    * <p>Whether to enable</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get <p>Task Name</p> 
     * @return Name <p>Task Name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Task Name</p>
     * @param Name <p>Task Name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Task description</p> 
     * @return Description <p>Task description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Task description</p>
     * @param Description <p>Task description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Associated Agent ID</p> 
     * @return AgentId <p>Associated Agent ID</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>Associated Agent ID</p>
     * @param AgentId <p>Associated Agent ID</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>Prompt Template</p> 
     * @return PromptTemplate <p>Prompt Template</p>
     */
    public String getPromptTemplate() {
        return this.PromptTemplate;
    }

    /**
     * Set <p>Prompt Template</p>
     * @param PromptTemplate <p>Prompt Template</p>
     */
    public void setPromptTemplate(String PromptTemplate) {
        this.PromptTemplate = PromptTemplate;
    }

    /**
     * Get <p>Output format: markdown / json</p> 
     * @return OutputFormat <p>Output format: markdown / json</p>
     */
    public String getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set <p>Output format: markdown / json</p>
     * @param OutputFormat <p>Output format: markdown / json</p>
     */
    public void setOutputFormat(String OutputFormat) {
        this.OutputFormat = OutputFormat;
    }

    /**
     * Get <p>Trigger type: manual / cron / webhook</p> 
     * @return TriggerType <p>Trigger type: manual / cron / webhook</p>
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>Trigger type: manual / cron / webhook</p>
     * @param TriggerType <p>Trigger type: manual / cron / webhook</p>
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>Cron expression</p> 
     * @return CronExpr <p>Cron expression</p>
     */
    public String getCronExpr() {
        return this.CronExpr;
    }

    /**
     * Set <p>Cron expression</p>
     * @param CronExpr <p>Cron expression</p>
     */
    public void setCronExpr(String CronExpr) {
        this.CronExpr = CronExpr;
    }

    /**
     * Get <p>Cron time zone</p> 
     * @return CronTimezone <p>Cron time zone</p>
     */
    public String getCronTimezone() {
        return this.CronTimezone;
    }

    /**
     * Set <p>Cron time zone</p>
     * @param CronTimezone <p>Cron time zone</p>
     */
    public void setCronTimezone(String CronTimezone) {
        this.CronTimezone = CronTimezone;
    }

    /**
     * Get <p>Associated resource map ID</p> 
     * @return ResourceMapId <p>Associated resource map ID</p>
     */
    public String getResourceMapId() {
        return this.ResourceMapId;
    }

    /**
     * Set <p>Associated resource map ID</p>
     * @param ResourceMapId <p>Associated resource map ID</p>
     */
    public void setResourceMapId(String ResourceMapId) {
        this.ResourceMapId = ResourceMapId;
    }

    /**
     * Get <p>Skill ID list</p> 
     * @return SkillIds <p>Skill ID list</p>
     */
    public String [] getSkillIds() {
        return this.SkillIds;
    }

    /**
     * Set <p>Skill ID list</p>
     * @param SkillIds <p>Skill ID list</p>
     */
    public void setSkillIds(String [] SkillIds) {
        this.SkillIds = SkillIds;
    }

    /**
     * Get <p>MCP endpoint ID list</p> 
     * @return McpEndpointIds <p>MCP endpoint ID list</p>
     */
    public String [] getMcpEndpointIds() {
        return this.McpEndpointIds;
    }

    /**
     * Set <p>MCP endpoint ID list</p>
     * @param McpEndpointIds <p>MCP endpoint ID list</p>
     */
    public void setMcpEndpointIds(String [] McpEndpointIds) {
        this.McpEndpointIds = McpEndpointIds;
    }

    /**
     * Get <p>Timeout (seconds)</p> 
     * @return TimeoutSec <p>Timeout (seconds)</p>
     */
    public Long getTimeoutSec() {
        return this.TimeoutSec;
    }

    /**
     * Set <p>Timeout (seconds)</p>
     * @param TimeoutSec <p>Timeout (seconds)</p>
     */
    public void setTimeoutSec(Long TimeoutSec) {
        this.TimeoutSec = TimeoutSec;
    }

    /**
     * Get <p>Retry count</p> 
     * @return RetryCount <p>Retry count</p>
     */
    public Long getRetryCount() {
        return this.RetryCount;
    }

    /**
     * Set <p>Retry count</p>
     * @param RetryCount <p>Retry count</p>
     */
    public void setRetryCount(Long RetryCount) {
        this.RetryCount = RetryCount;
    }

    /**
     * Get <p>Whether to enable</p> 
     * @return Enabled <p>Whether to enable</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Whether to enable</p>
     * @param Enabled <p>Whether to enable</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public CreateAIWorkbenchTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAIWorkbenchTaskRequest(CreateAIWorkbenchTaskRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.PromptTemplate != null) {
            this.PromptTemplate = new String(source.PromptTemplate);
        }
        if (source.OutputFormat != null) {
            this.OutputFormat = new String(source.OutputFormat);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.CronExpr != null) {
            this.CronExpr = new String(source.CronExpr);
        }
        if (source.CronTimezone != null) {
            this.CronTimezone = new String(source.CronTimezone);
        }
        if (source.ResourceMapId != null) {
            this.ResourceMapId = new String(source.ResourceMapId);
        }
        if (source.SkillIds != null) {
            this.SkillIds = new String[source.SkillIds.length];
            for (int i = 0; i < source.SkillIds.length; i++) {
                this.SkillIds[i] = new String(source.SkillIds[i]);
            }
        }
        if (source.McpEndpointIds != null) {
            this.McpEndpointIds = new String[source.McpEndpointIds.length];
            for (int i = 0; i < source.McpEndpointIds.length; i++) {
                this.McpEndpointIds[i] = new String(source.McpEndpointIds[i]);
            }
        }
        if (source.TimeoutSec != null) {
            this.TimeoutSec = new Long(source.TimeoutSec);
        }
        if (source.RetryCount != null) {
            this.RetryCount = new Long(source.RetryCount);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "PromptTemplate", this.PromptTemplate);
        this.setParamSimple(map, prefix + "OutputFormat", this.OutputFormat);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "CronExpr", this.CronExpr);
        this.setParamSimple(map, prefix + "CronTimezone", this.CronTimezone);
        this.setParamSimple(map, prefix + "ResourceMapId", this.ResourceMapId);
        this.setParamArraySimple(map, prefix + "SkillIds.", this.SkillIds);
        this.setParamArraySimple(map, prefix + "McpEndpointIds.", this.McpEndpointIds);
        this.setParamSimple(map, prefix + "TimeoutSec", this.TimeoutSec);
        this.setParamSimple(map, prefix + "RetryCount", this.RetryCount);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

