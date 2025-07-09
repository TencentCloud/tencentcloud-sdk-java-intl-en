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

public class DeleteWorkflowByIdRequest extends AbstractModel {

    /**
    * Workflow ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Handling method for downstream tasks after deletion, true: all downstream tasks run normally false: all downstream tasks fail
    */
    @SerializedName("DeleteMode")
    @Expose
    private Boolean DeleteMode;

    /**
    * Notify downstream task owners after task deletion, true: notify false: do not notify
    */
    @SerializedName("EnableNotify")
    @Expose
    private Boolean EnableNotify;

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
     * Get Handling method for downstream tasks after deletion, true: all downstream tasks run normally false: all downstream tasks fail 
     * @return DeleteMode Handling method for downstream tasks after deletion, true: all downstream tasks run normally false: all downstream tasks fail
     */
    public Boolean getDeleteMode() {
        return this.DeleteMode;
    }

    /**
     * Set Handling method for downstream tasks after deletion, true: all downstream tasks run normally false: all downstream tasks fail
     * @param DeleteMode Handling method for downstream tasks after deletion, true: all downstream tasks run normally false: all downstream tasks fail
     */
    public void setDeleteMode(Boolean DeleteMode) {
        this.DeleteMode = DeleteMode;
    }

    /**
     * Get Notify downstream task owners after task deletion, true: notify false: do not notify 
     * @return EnableNotify Notify downstream task owners after task deletion, true: notify false: do not notify
     */
    public Boolean getEnableNotify() {
        return this.EnableNotify;
    }

    /**
     * Set Notify downstream task owners after task deletion, true: notify false: do not notify
     * @param EnableNotify Notify downstream task owners after task deletion, true: notify false: do not notify
     */
    public void setEnableNotify(Boolean EnableNotify) {
        this.EnableNotify = EnableNotify;
    }

    public DeleteWorkflowByIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteWorkflowByIdRequest(DeleteWorkflowByIdRequest source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeleteMode != null) {
            this.DeleteMode = new Boolean(source.DeleteMode);
        }
        if (source.EnableNotify != null) {
            this.EnableNotify = new Boolean(source.EnableNotify);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeleteMode", this.DeleteMode);
        this.setParamSimple(map, prefix + "EnableNotify", this.EnableNotify);

    }
}

