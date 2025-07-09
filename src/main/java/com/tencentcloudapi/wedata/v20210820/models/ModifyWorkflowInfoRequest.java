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

public class ModifyWorkflowInfoRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Workflow ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Person in Charge
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
    * Workflow name
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Parent Folder ID
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Workflow User Group ID If multiple, separated by semicolons: a;b;c
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * Workflow User Group Name If multiple, separated by semicolons: a;b;c
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
    * Used to configure optimized parameters (Thread, Memory, CPU Core Count, etc.), applicable only to Spark SQL Node. Separate multiple parameters with English semicolons.
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
     * Get Person in Charge 
     * @return Owner Person in Charge
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Person in Charge
     * @param Owner Person in Charge
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
     * Get Workflow name 
     * @return WorkflowName Workflow name
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow name
     * @param WorkflowName Workflow name
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Parent Folder ID 
     * @return FolderId Parent Folder ID
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Parent Folder ID
     * @param FolderId Parent Folder ID
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Workflow User Group ID If multiple, separated by semicolons: a;b;c 
     * @return UserGroupId Workflow User Group ID If multiple, separated by semicolons: a;b;c
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set Workflow User Group ID If multiple, separated by semicolons: a;b;c
     * @param UserGroupId Workflow User Group ID If multiple, separated by semicolons: a;b;c
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get Workflow User Group Name If multiple, separated by semicolons: a;b;c 
     * @return UserGroupName Workflow User Group Name If multiple, separated by semicolons: a;b;c
     */
    public String getUserGroupName() {
        return this.UserGroupName;
    }

    /**
     * Set Workflow User Group Name If multiple, separated by semicolons: a;b;c
     * @param UserGroupName Workflow User Group Name If multiple, separated by semicolons: a;b;c
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
     * Get Used to configure optimized parameters (Thread, Memory, CPU Core Count, etc.), applicable only to Spark SQL Node. Separate multiple parameters with English semicolons. 
     * @return GeneralTaskParams Used to configure optimized parameters (Thread, Memory, CPU Core Count, etc.), applicable only to Spark SQL Node. Separate multiple parameters with English semicolons.
     */
    public GeneralTaskParam [] getGeneralTaskParams() {
        return this.GeneralTaskParams;
    }

    /**
     * Set Used to configure optimized parameters (Thread, Memory, CPU Core Count, etc.), applicable only to Spark SQL Node. Separate multiple parameters with English semicolons.
     * @param GeneralTaskParams Used to configure optimized parameters (Thread, Memory, CPU Core Count, etc.), applicable only to Spark SQL Node. Separate multiple parameters with English semicolons.
     */
    public void setGeneralTaskParams(GeneralTaskParam [] GeneralTaskParams) {
        this.GeneralTaskParams = GeneralTaskParams;
    }

    public ModifyWorkflowInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWorkflowInfoRequest(ModifyWorkflowInfoRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
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

