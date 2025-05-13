/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class UpdateWorkflowInfoRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Operator Name
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
    * Workflow ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Responsible Person
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Responsible Person ID
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
    * Remarks
    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * Workflow Name
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Folder ID
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Workflow user group id. if there are multiple, separate them with a semicolon: a;b;c
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * Workflow user group name if there are multiple, separate with semicolons: a;b;c
    */
    @SerializedName("UserGroupName")
    @Expose
    private String UserGroupName;

    /**
    * Workflow Parameter List
    */
    @SerializedName("WorkflowParams")
    @Expose
    private ParamInfo [] WorkflowParams;

    /**
    * Specifies configuration optimization parameters (such as threads, memory, and number of CPU cores), which apply to Spark SQL nodes. separate multiple parameters with semicolons.
    */
    @SerializedName("GeneralTaskParams")
    @Expose
    private GeneralTaskParam [] GeneralTaskParams;

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
     * Get Operator Name 
     * @return OperatorName Operator Name
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set Operator Name
     * @param OperatorName Operator Name
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    /**
     * Get Workflow ID 
     * @return WorkflowId Workflow ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID
     * @param WorkflowId Workflow ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Responsible Person 
     * @return Owner Responsible Person
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Responsible Person
     * @param Owner Responsible Person
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Responsible Person ID 
     * @return OwnerId Responsible Person ID
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set Responsible Person ID
     * @param OwnerId Responsible Person ID
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    /**
     * Get Remarks 
     * @return WorkflowDesc Remarks
     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set Remarks
     * @param WorkflowDesc Remarks
     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
    }

    /**
     * Get Workflow Name 
     * @return WorkflowName Workflow Name
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow Name
     * @param WorkflowName Workflow Name
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Folder ID 
     * @return FolderId Folder ID
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder ID
     * @param FolderId Folder ID
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Workflow user group id. if there are multiple, separate them with a semicolon: a;b;c 
     * @return UserGroupId Workflow user group id. if there are multiple, separate them with a semicolon: a;b;c
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set Workflow user group id. if there are multiple, separate them with a semicolon: a;b;c
     * @param UserGroupId Workflow user group id. if there are multiple, separate them with a semicolon: a;b;c
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get Workflow user group name if there are multiple, separate with semicolons: a;b;c 
     * @return UserGroupName Workflow user group name if there are multiple, separate with semicolons: a;b;c
     */
    public String getUserGroupName() {
        return this.UserGroupName;
    }

    /**
     * Set Workflow user group name if there are multiple, separate with semicolons: a;b;c
     * @param UserGroupName Workflow user group name if there are multiple, separate with semicolons: a;b;c
     */
    public void setUserGroupName(String UserGroupName) {
        this.UserGroupName = UserGroupName;
    }

    /**
     * Get Workflow Parameter List 
     * @return WorkflowParams Workflow Parameter List
     */
    public ParamInfo [] getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set Workflow Parameter List
     * @param WorkflowParams Workflow Parameter List
     */
    public void setWorkflowParams(ParamInfo [] WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
    }

    /**
     * Get Specifies configuration optimization parameters (such as threads, memory, and number of CPU cores), which apply to Spark SQL nodes. separate multiple parameters with semicolons. 
     * @return GeneralTaskParams Specifies configuration optimization parameters (such as threads, memory, and number of CPU cores), which apply to Spark SQL nodes. separate multiple parameters with semicolons.
     */
    public GeneralTaskParam [] getGeneralTaskParams() {
        return this.GeneralTaskParams;
    }

    /**
     * Set Specifies configuration optimization parameters (such as threads, memory, and number of CPU cores), which apply to Spark SQL nodes. separate multiple parameters with semicolons.
     * @param GeneralTaskParams Specifies configuration optimization parameters (such as threads, memory, and number of CPU cores), which apply to Spark SQL nodes. separate multiple parameters with semicolons.
     */
    public void setGeneralTaskParams(GeneralTaskParam [] GeneralTaskParams) {
        this.GeneralTaskParams = GeneralTaskParams;
    }

    public UpdateWorkflowInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateWorkflowInfoRequest(UpdateWorkflowInfoRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
        if (source.WorkflowDesc != null) {
            this.WorkflowDesc = new String(source.WorkflowDesc);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
        if (source.UserGroupName != null) {
            this.UserGroupName = new String(source.UserGroupName);
        }
        if (source.WorkflowParams != null) {
            this.WorkflowParams = new ParamInfo[source.WorkflowParams.length];
            for (int i = 0; i < source.WorkflowParams.length; i++) {
                this.WorkflowParams[i] = new ParamInfo(source.WorkflowParams[i]);
            }
        }
        if (source.GeneralTaskParams != null) {
            this.GeneralTaskParams = new GeneralTaskParam[source.GeneralTaskParams.length];
            for (int i = 0; i < source.GeneralTaskParams.length; i++) {
                this.GeneralTaskParams[i] = new GeneralTaskParam(source.GeneralTaskParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamSimple(map, prefix + "UserGroupName", this.UserGroupName);
        this.setParamArrayObj(map, prefix + "WorkflowParams.", this.WorkflowParams);
        this.setParamArrayObj(map, prefix + "GeneralTaskParams.", this.GeneralTaskParams);

    }
}

