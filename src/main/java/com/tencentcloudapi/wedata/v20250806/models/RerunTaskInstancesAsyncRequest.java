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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RerunTaskInstancesAsyncRequest extends AbstractModel {

    /**
    * Project ID.

    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Instance id list. obtain from ListInstances.
    */
    @SerializedName("InstanceKeyList")
    @Expose
    private String [] InstanceKeyList;

    /**
    * Rerun type. valid values: 1 (self), 3 (child), 2 (self and child). default: 1.
    */
    @SerializedName("RerunType")
    @Expose
    private String RerunType;

    /**
    * Whether to check upstream tasks: ALL (ALL), MAKE_SCOPE (select), NONE (do not check). default is NONE.
    */
    @SerializedName("CheckParentType")
    @Expose
    private String CheckParentType;

    /**
    * Downstream Instance Scope

* WORKFLOW: Within the current workflow (default)

* PROJECT: Within the current project

* ALL: Across all projects with cross-workflow dependencies
    */
    @SerializedName("SonRangeType")
    @Expose
    private String SonRangeType;

    /**
    * Specifies whether to ignore event monitoring when rerunning.
    */
    @SerializedName("SkipEventListening")
    @Expose
    private Boolean SkipEventListening;

    /**
    * Specifies the degree of concurrency for a custom instance run. if not configured, use the existing self-dependent task.
    */
    @SerializedName("RedefineParallelNum")
    @Expose
    private Long RedefineParallelNum;

    /**
    * Custom workflow self-dependency. valid values: yes (enable), no (disable). if not configured, use the existing workflow self-dependency.
    */
    @SerializedName("RedefineSelfWorkflowDependency")
    @Expose
    private String RedefineSelfWorkflowDependency;

    /**
    * Rerun instance custom parameter.
    */
    @SerializedName("RedefineParamList")
    @Expose
    private KVMap RedefineParamList;

    /**
     * Get Project ID.
 
     * @return ProjectId Project ID.

     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.

     * @param ProjectId Project ID.

     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Instance id list. obtain from ListInstances. 
     * @return InstanceKeyList Instance id list. obtain from ListInstances.
     */
    public String [] getInstanceKeyList() {
        return this.InstanceKeyList;
    }

    /**
     * Set Instance id list. obtain from ListInstances.
     * @param InstanceKeyList Instance id list. obtain from ListInstances.
     */
    public void setInstanceKeyList(String [] InstanceKeyList) {
        this.InstanceKeyList = InstanceKeyList;
    }

    /**
     * Get Rerun type. valid values: 1 (self), 3 (child), 2 (self and child). default: 1. 
     * @return RerunType Rerun type. valid values: 1 (self), 3 (child), 2 (self and child). default: 1.
     */
    public String getRerunType() {
        return this.RerunType;
    }

    /**
     * Set Rerun type. valid values: 1 (self), 3 (child), 2 (self and child). default: 1.
     * @param RerunType Rerun type. valid values: 1 (self), 3 (child), 2 (self and child). default: 1.
     */
    public void setRerunType(String RerunType) {
        this.RerunType = RerunType;
    }

    /**
     * Get Whether to check upstream tasks: ALL (ALL), MAKE_SCOPE (select), NONE (do not check). default is NONE. 
     * @return CheckParentType Whether to check upstream tasks: ALL (ALL), MAKE_SCOPE (select), NONE (do not check). default is NONE.
     */
    public String getCheckParentType() {
        return this.CheckParentType;
    }

    /**
     * Set Whether to check upstream tasks: ALL (ALL), MAKE_SCOPE (select), NONE (do not check). default is NONE.
     * @param CheckParentType Whether to check upstream tasks: ALL (ALL), MAKE_SCOPE (select), NONE (do not check). default is NONE.
     */
    public void setCheckParentType(String CheckParentType) {
        this.CheckParentType = CheckParentType;
    }

    /**
     * Get Downstream Instance Scope

* WORKFLOW: Within the current workflow (default)

* PROJECT: Within the current project

* ALL: Across all projects with cross-workflow dependencies 
     * @return SonRangeType Downstream Instance Scope

* WORKFLOW: Within the current workflow (default)

* PROJECT: Within the current project

* ALL: Across all projects with cross-workflow dependencies
     */
    public String getSonRangeType() {
        return this.SonRangeType;
    }

    /**
     * Set Downstream Instance Scope

* WORKFLOW: Within the current workflow (default)

* PROJECT: Within the current project

* ALL: Across all projects with cross-workflow dependencies
     * @param SonRangeType Downstream Instance Scope

* WORKFLOW: Within the current workflow (default)

* PROJECT: Within the current project

* ALL: Across all projects with cross-workflow dependencies
     */
    public void setSonRangeType(String SonRangeType) {
        this.SonRangeType = SonRangeType;
    }

    /**
     * Get Specifies whether to ignore event monitoring when rerunning. 
     * @return SkipEventListening Specifies whether to ignore event monitoring when rerunning.
     */
    public Boolean getSkipEventListening() {
        return this.SkipEventListening;
    }

    /**
     * Set Specifies whether to ignore event monitoring when rerunning.
     * @param SkipEventListening Specifies whether to ignore event monitoring when rerunning.
     */
    public void setSkipEventListening(Boolean SkipEventListening) {
        this.SkipEventListening = SkipEventListening;
    }

    /**
     * Get Specifies the degree of concurrency for a custom instance run. if not configured, use the existing self-dependent task. 
     * @return RedefineParallelNum Specifies the degree of concurrency for a custom instance run. if not configured, use the existing self-dependent task.
     */
    public Long getRedefineParallelNum() {
        return this.RedefineParallelNum;
    }

    /**
     * Set Specifies the degree of concurrency for a custom instance run. if not configured, use the existing self-dependent task.
     * @param RedefineParallelNum Specifies the degree of concurrency for a custom instance run. if not configured, use the existing self-dependent task.
     */
    public void setRedefineParallelNum(Long RedefineParallelNum) {
        this.RedefineParallelNum = RedefineParallelNum;
    }

    /**
     * Get Custom workflow self-dependency. valid values: yes (enable), no (disable). if not configured, use the existing workflow self-dependency. 
     * @return RedefineSelfWorkflowDependency Custom workflow self-dependency. valid values: yes (enable), no (disable). if not configured, use the existing workflow self-dependency.
     */
    public String getRedefineSelfWorkflowDependency() {
        return this.RedefineSelfWorkflowDependency;
    }

    /**
     * Set Custom workflow self-dependency. valid values: yes (enable), no (disable). if not configured, use the existing workflow self-dependency.
     * @param RedefineSelfWorkflowDependency Custom workflow self-dependency. valid values: yes (enable), no (disable). if not configured, use the existing workflow self-dependency.
     */
    public void setRedefineSelfWorkflowDependency(String RedefineSelfWorkflowDependency) {
        this.RedefineSelfWorkflowDependency = RedefineSelfWorkflowDependency;
    }

    /**
     * Get Rerun instance custom parameter. 
     * @return RedefineParamList Rerun instance custom parameter.
     */
    public KVMap getRedefineParamList() {
        return this.RedefineParamList;
    }

    /**
     * Set Rerun instance custom parameter.
     * @param RedefineParamList Rerun instance custom parameter.
     */
    public void setRedefineParamList(KVMap RedefineParamList) {
        this.RedefineParamList = RedefineParamList;
    }

    public RerunTaskInstancesAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RerunTaskInstancesAsyncRequest(RerunTaskInstancesAsyncRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.InstanceKeyList != null) {
            this.InstanceKeyList = new String[source.InstanceKeyList.length];
            for (int i = 0; i < source.InstanceKeyList.length; i++) {
                this.InstanceKeyList[i] = new String(source.InstanceKeyList[i]);
            }
        }
        if (source.RerunType != null) {
            this.RerunType = new String(source.RerunType);
        }
        if (source.CheckParentType != null) {
            this.CheckParentType = new String(source.CheckParentType);
        }
        if (source.SonRangeType != null) {
            this.SonRangeType = new String(source.SonRangeType);
        }
        if (source.SkipEventListening != null) {
            this.SkipEventListening = new Boolean(source.SkipEventListening);
        }
        if (source.RedefineParallelNum != null) {
            this.RedefineParallelNum = new Long(source.RedefineParallelNum);
        }
        if (source.RedefineSelfWorkflowDependency != null) {
            this.RedefineSelfWorkflowDependency = new String(source.RedefineSelfWorkflowDependency);
        }
        if (source.RedefineParamList != null) {
            this.RedefineParamList = new KVMap(source.RedefineParamList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "InstanceKeyList.", this.InstanceKeyList);
        this.setParamSimple(map, prefix + "RerunType", this.RerunType);
        this.setParamSimple(map, prefix + "CheckParentType", this.CheckParentType);
        this.setParamSimple(map, prefix + "SonRangeType", this.SonRangeType);
        this.setParamSimple(map, prefix + "SkipEventListening", this.SkipEventListening);
        this.setParamSimple(map, prefix + "RedefineParallelNum", this.RedefineParallelNum);
        this.setParamSimple(map, prefix + "RedefineSelfWorkflowDependency", this.RedefineSelfWorkflowDependency);
        this.setParamObj(map, prefix + "RedefineParamList.", this.RedefineParamList);

    }
}

