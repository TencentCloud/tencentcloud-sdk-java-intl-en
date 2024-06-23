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

public class RemoveWorkflowDsRequest extends AbstractModel {

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
    * Whether to delete the script
    */
    @SerializedName("DeleteScript")
    @Expose
    private String DeleteScript;

    /**
    * Notify downstream if deleted
    */
    @SerializedName("OperateIsInform")
    @Expose
    private String OperateIsInform;

    /**
    * Whether to terminate ongoing tasks
    */
    @SerializedName("DeleteMode")
    @Expose
    private String DeleteMode;

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
     * Get Whether to delete the script 
     * @return DeleteScript Whether to delete the script
     */
    public String getDeleteScript() {
        return this.DeleteScript;
    }

    /**
     * Set Whether to delete the script
     * @param DeleteScript Whether to delete the script
     */
    public void setDeleteScript(String DeleteScript) {
        this.DeleteScript = DeleteScript;
    }

    /**
     * Get Notify downstream if deleted 
     * @return OperateIsInform Notify downstream if deleted
     */
    public String getOperateIsInform() {
        return this.OperateIsInform;
    }

    /**
     * Set Notify downstream if deleted
     * @param OperateIsInform Notify downstream if deleted
     */
    public void setOperateIsInform(String OperateIsInform) {
        this.OperateIsInform = OperateIsInform;
    }

    /**
     * Get Whether to terminate ongoing tasks 
     * @return DeleteMode Whether to terminate ongoing tasks
     */
    public String getDeleteMode() {
        return this.DeleteMode;
    }

    /**
     * Set Whether to terminate ongoing tasks
     * @param DeleteMode Whether to terminate ongoing tasks
     */
    public void setDeleteMode(String DeleteMode) {
        this.DeleteMode = DeleteMode;
    }

    public RemoveWorkflowDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveWorkflowDsRequest(RemoveWorkflowDsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.DeleteScript != null) {
            this.DeleteScript = new String(source.DeleteScript);
        }
        if (source.OperateIsInform != null) {
            this.OperateIsInform = new String(source.OperateIsInform);
        }
        if (source.DeleteMode != null) {
            this.DeleteMode = new String(source.DeleteMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "DeleteScript", this.DeleteScript);
        this.setParamSimple(map, prefix + "OperateIsInform", this.OperateIsInform);
        this.setParamSimple(map, prefix + "DeleteMode", this.DeleteMode);

    }
}

