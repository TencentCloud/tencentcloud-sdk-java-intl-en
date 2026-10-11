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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateWorkflowRequest extends AbstractModel {

    /**
    * <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>ID of the workflow to be updated. You can obtain it through ListWorkflows. Required</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>List of field names to be cleared, used to reset the specified fields to empty</p>
    */
    @SerializedName("FieldToRemoveList")
    @Expose
    private String [] FieldToRemoveList;

    /**
    * <p>After the update, only import the parts of the workflow configuration that need to be changed</p>
    */
    @SerializedName("NewSetting")
    @Expose
    private Workflow NewSetting;

    /**
     * Get <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p> 
     * @return WorkspaceId <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p>
     * @param WorkspaceId <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>ID of the workflow to be updated. You can obtain it through ListWorkflows. Required</p> 
     * @return WorkflowId <p>ID of the workflow to be updated. You can obtain it through ListWorkflows. Required</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>ID of the workflow to be updated. You can obtain it through ListWorkflows. Required</p>
     * @param WorkflowId <p>ID of the workflow to be updated. You can obtain it through ListWorkflows. Required</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>List of field names to be cleared, used to reset the specified fields to empty</p> 
     * @return FieldToRemoveList <p>List of field names to be cleared, used to reset the specified fields to empty</p>
     */
    public String [] getFieldToRemoveList() {
        return this.FieldToRemoveList;
    }

    /**
     * Set <p>List of field names to be cleared, used to reset the specified fields to empty</p>
     * @param FieldToRemoveList <p>List of field names to be cleared, used to reset the specified fields to empty</p>
     */
    public void setFieldToRemoveList(String [] FieldToRemoveList) {
        this.FieldToRemoveList = FieldToRemoveList;
    }

    /**
     * Get <p>After the update, only import the parts of the workflow configuration that need to be changed</p> 
     * @return NewSetting <p>After the update, only import the parts of the workflow configuration that need to be changed</p>
     */
    public Workflow getNewSetting() {
        return this.NewSetting;
    }

    /**
     * Set <p>After the update, only import the parts of the workflow configuration that need to be changed</p>
     * @param NewSetting <p>After the update, only import the parts of the workflow configuration that need to be changed</p>
     */
    public void setNewSetting(Workflow NewSetting) {
        this.NewSetting = NewSetting;
    }

    public UpdateWorkflowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateWorkflowRequest(UpdateWorkflowRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.FieldToRemoveList != null) {
            this.FieldToRemoveList = new String[source.FieldToRemoveList.length];
            for (int i = 0; i < source.FieldToRemoveList.length; i++) {
                this.FieldToRemoveList[i] = new String(source.FieldToRemoveList[i]);
            }
        }
        if (source.NewSetting != null) {
            this.NewSetting = new Workflow(source.NewSetting);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamArraySimple(map, prefix + "FieldToRemoveList.", this.FieldToRemoveList);
        this.setParamObj(map, prefix + "NewSetting.", this.NewSetting);

    }
}

