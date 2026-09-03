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

public class ListAIWorkbenchExecutionsRequest extends AbstractModel {

    /**
    * <p>Number of items per page</p>
    */
    @SerializedName("PerPage")
    @Expose
    private Long PerPage;

    /**
    * <p>Page number.</p>
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * <p>Filter by Agent</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>Filter by status</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Execution ID list filter</p>
    */
    @SerializedName("ExecutionIds")
    @Expose
    private String [] ExecutionIds;

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * <p>Trigger mode</p>
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>Key value</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>Whether to enable</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get <p>Number of items per page</p> 
     * @return PerPage <p>Number of items per page</p>
     */
    public Long getPerPage() {
        return this.PerPage;
    }

    /**
     * Set <p>Number of items per page</p>
     * @param PerPage <p>Number of items per page</p>
     */
    public void setPerPage(Long PerPage) {
        this.PerPage = PerPage;
    }

    /**
     * Get <p>Page number.</p> 
     * @return PageNo <p>Page number.</p>
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set <p>Page number.</p>
     * @param PageNo <p>Page number.</p>
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get <p>Filter by Agent</p> 
     * @return AgentId <p>Filter by Agent</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>Filter by Agent</p>
     * @param AgentId <p>Filter by Agent</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>Filter by status</p> 
     * @return Status <p>Filter by status</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Filter by status</p>
     * @param Status <p>Filter by status</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Execution ID list filter</p> 
     * @return ExecutionIds <p>Execution ID list filter</p>
     */
    public String [] getExecutionIds() {
        return this.ExecutionIds;
    }

    /**
     * Set <p>Execution ID list filter</p>
     * @param ExecutionIds <p>Execution ID list filter</p>
     */
    public void setExecutionIds(String [] ExecutionIds) {
        this.ExecutionIds = ExecutionIds;
    }

    /**
     * Get <p>Task ID.</p> 
     * @return TaskIds <p>Task ID.</p>
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskIds <p>Task ID.</p>
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get <p>Trigger mode</p> 
     * @return TriggerType <p>Trigger mode</p>
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>Trigger mode</p>
     * @param TriggerType <p>Trigger mode</p>
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>Key value</p> 
     * @return Keyword <p>Key value</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>Key value</p>
     * @param Keyword <p>Key value</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
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

    public ListAIWorkbenchExecutionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAIWorkbenchExecutionsRequest(ListAIWorkbenchExecutionsRequest source) {
        if (source.PerPage != null) {
            this.PerPage = new Long(source.PerPage);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ExecutionIds != null) {
            this.ExecutionIds = new String[source.ExecutionIds.length];
            for (int i = 0; i < source.ExecutionIds.length; i++) {
                this.ExecutionIds[i] = new String(source.ExecutionIds[i]);
            }
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PerPage", this.PerPage);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "ExecutionIds.", this.ExecutionIds);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

