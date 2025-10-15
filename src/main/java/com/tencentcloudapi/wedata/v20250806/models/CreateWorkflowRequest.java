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

public class CreateWorkflowRequest extends AbstractModel {

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
    * Specifies the folder path.
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * Workflow type. value examples: cycle for periodic workflow; manual for manual workflow. default input: cycle.
    */
    @SerializedName("WorkflowType")
    @Expose
    private String WorkflowType;

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
    * Specifies unified scheduling info.
    */
    @SerializedName("WorkflowSchedulerConfiguration")
    @Expose
    private WorkflowSchedulerConfigurationInfo WorkflowSchedulerConfiguration;

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
     * Get Specifies the folder path. 
     * @return ParentFolderPath Specifies the folder path.
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set Specifies the folder path.
     * @param ParentFolderPath Specifies the folder path.
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get Workflow type. value examples: cycle for periodic workflow; manual for manual workflow. default input: cycle. 
     * @return WorkflowType Workflow type. value examples: cycle for periodic workflow; manual for manual workflow. default input: cycle.
     */
    public String getWorkflowType() {
        return this.WorkflowType;
    }

    /**
     * Set Workflow type. value examples: cycle for periodic workflow; manual for manual workflow. default input: cycle.
     * @param WorkflowType Workflow type. value examples: cycle for periodic workflow; manual for manual workflow. default input: cycle.
     */
    public void setWorkflowType(String WorkflowType) {
        this.WorkflowType = WorkflowType;
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
     * Get Specifies unified scheduling info. 
     * @return WorkflowSchedulerConfiguration Specifies unified scheduling info.
     */
    public WorkflowSchedulerConfigurationInfo getWorkflowSchedulerConfiguration() {
        return this.WorkflowSchedulerConfiguration;
    }

    /**
     * Set Specifies unified scheduling info.
     * @param WorkflowSchedulerConfiguration Specifies unified scheduling info.
     */
    public void setWorkflowSchedulerConfiguration(WorkflowSchedulerConfigurationInfo WorkflowSchedulerConfiguration) {
        this.WorkflowSchedulerConfiguration = WorkflowSchedulerConfiguration;
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

    public CreateWorkflowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWorkflowRequest(CreateWorkflowRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.WorkflowType != null) {
            this.WorkflowType = new String(source.WorkflowType);
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
        if (source.WorkflowSchedulerConfiguration != null) {
            this.WorkflowSchedulerConfiguration = new WorkflowSchedulerConfigurationInfo(source.WorkflowSchedulerConfiguration);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamSimple(map, prefix + "WorkflowType", this.WorkflowType);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamArrayObj(map, prefix + "WorkflowParams.", this.WorkflowParams);
        this.setParamObj(map, prefix + "WorkflowSchedulerConfiguration.", this.WorkflowSchedulerConfiguration);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);

    }
}

