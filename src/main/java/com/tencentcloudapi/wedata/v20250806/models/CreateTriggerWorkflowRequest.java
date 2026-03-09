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

public class CreateTriggerWorkflowRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Workflow name.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Folder path.
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * Workflow description.
    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * Workflow owner ID.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Workflow parameter.
    */
    @SerializedName("WorkflowParams")
    @Expose
    private ParamInfo [] WorkflowParams;

    /**
    * Unified scheduling info.
    */
    @SerializedName("TriggerWorkflowSchedulerConfigurations")
    @Expose
    private WorkflowTriggerConfig [] TriggerWorkflowSchedulerConfigurations;

    /**
    * BundleId item.
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * Bundle info.
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
    * General parameters configuration.
    */
    @SerializedName("GeneralTaskParams")
    @Expose
    private WorkflowGeneralTaskParam [] GeneralTaskParams;

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
     * Get Workflow name. 
     * @return WorkflowName Workflow name.
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow name.
     * @param WorkflowName Workflow name.
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Folder path. 
     * @return ParentFolderPath Folder path.
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set Folder path.
     * @param ParentFolderPath Folder path.
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get Workflow description. 
     * @return WorkflowDesc Workflow description.
     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set Workflow description.
     * @param WorkflowDesc Workflow description.
     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
    }

    /**
     * Get Workflow owner ID. 
     * @return OwnerUin Workflow owner ID.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Workflow owner ID.
     * @param OwnerUin Workflow owner ID.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Workflow parameter. 
     * @return WorkflowParams Workflow parameter.
     */
    public ParamInfo [] getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set Workflow parameter.
     * @param WorkflowParams Workflow parameter.
     */
    public void setWorkflowParams(ParamInfo [] WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
    }

    /**
     * Get Unified scheduling info. 
     * @return TriggerWorkflowSchedulerConfigurations Unified scheduling info.
     */
    public WorkflowTriggerConfig [] getTriggerWorkflowSchedulerConfigurations() {
        return this.TriggerWorkflowSchedulerConfigurations;
    }

    /**
     * Set Unified scheduling info.
     * @param TriggerWorkflowSchedulerConfigurations Unified scheduling info.
     */
    public void setTriggerWorkflowSchedulerConfigurations(WorkflowTriggerConfig [] TriggerWorkflowSchedulerConfigurations) {
        this.TriggerWorkflowSchedulerConfigurations = TriggerWorkflowSchedulerConfigurations;
    }

    /**
     * Get BundleId item. 
     * @return BundleId BundleId item.
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set BundleId item.
     * @param BundleId BundleId item.
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get Bundle info. 
     * @return BundleInfo Bundle info.
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set Bundle info.
     * @param BundleInfo Bundle info.
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    /**
     * Get General parameters configuration. 
     * @return GeneralTaskParams General parameters configuration.
     */
    public WorkflowGeneralTaskParam [] getGeneralTaskParams() {
        return this.GeneralTaskParams;
    }

    /**
     * Set General parameters configuration.
     * @param GeneralTaskParams General parameters configuration.
     */
    public void setGeneralTaskParams(WorkflowGeneralTaskParam [] GeneralTaskParams) {
        this.GeneralTaskParams = GeneralTaskParams;
    }

    public CreateTriggerWorkflowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTriggerWorkflowRequest(CreateTriggerWorkflowRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.WorkflowDesc != null) {
            this.WorkflowDesc = new String(source.WorkflowDesc);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.WorkflowParams != null) {
            this.WorkflowParams = new ParamInfo[source.WorkflowParams.length];
            for (int i = 0; i < source.WorkflowParams.length; i++) {
                this.WorkflowParams[i] = new ParamInfo(source.WorkflowParams[i]);
            }
        }
        if (source.TriggerWorkflowSchedulerConfigurations != null) {
            this.TriggerWorkflowSchedulerConfigurations = new WorkflowTriggerConfig[source.TriggerWorkflowSchedulerConfigurations.length];
            for (int i = 0; i < source.TriggerWorkflowSchedulerConfigurations.length; i++) {
                this.TriggerWorkflowSchedulerConfigurations[i] = new WorkflowTriggerConfig(source.TriggerWorkflowSchedulerConfigurations[i]);
            }
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
        if (source.GeneralTaskParams != null) {
            this.GeneralTaskParams = new WorkflowGeneralTaskParam[source.GeneralTaskParams.length];
            for (int i = 0; i < source.GeneralTaskParams.length; i++) {
                this.GeneralTaskParams[i] = new WorkflowGeneralTaskParam(source.GeneralTaskParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamArrayObj(map, prefix + "WorkflowParams.", this.WorkflowParams);
        this.setParamArrayObj(map, prefix + "TriggerWorkflowSchedulerConfigurations.", this.TriggerWorkflowSchedulerConfigurations);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamArrayObj(map, prefix + "GeneralTaskParams.", this.GeneralTaskParams);

    }
}

