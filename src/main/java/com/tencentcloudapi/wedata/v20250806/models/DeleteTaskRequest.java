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

public class DeleteTaskRequest extends AbstractModel {

    /**
    * Project ID.

    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Either Task ID or VirtualTaskId must be provided (optional, choose one).
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Whether to send a notification to downstream task owners when performing task operations.
true: Send notification
false: Do not send notification
default: false.
    */
    @SerializedName("OperateInform")
    @Expose
    private Boolean OperateInform;

    /**
    * Task Deletion Mode.
true: Do not force downstream task instances to fail
false: Force downstream task instances to fail
default: false 

    */
    @SerializedName("DeleteMode")
    @Expose
    private Boolean DeleteMode;

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
     * Get Either Task ID or VirtualTaskId must be provided (optional, choose one). 
     * @return TaskId Either Task ID or VirtualTaskId must be provided (optional, choose one).
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Either Task ID or VirtualTaskId must be provided (optional, choose one).
     * @param TaskId Either Task ID or VirtualTaskId must be provided (optional, choose one).
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Whether to send a notification to downstream task owners when performing task operations.
true: Send notification
false: Do not send notification
default: false. 
     * @return OperateInform Whether to send a notification to downstream task owners when performing task operations.
true: Send notification
false: Do not send notification
default: false.
     */
    public Boolean getOperateInform() {
        return this.OperateInform;
    }

    /**
     * Set Whether to send a notification to downstream task owners when performing task operations.
true: Send notification
false: Do not send notification
default: false.
     * @param OperateInform Whether to send a notification to downstream task owners when performing task operations.
true: Send notification
false: Do not send notification
default: false.
     */
    public void setOperateInform(Boolean OperateInform) {
        this.OperateInform = OperateInform;
    }

    /**
     * Get Task Deletion Mode.
true: Do not force downstream task instances to fail
false: Force downstream task instances to fail
default: false 
 
     * @return DeleteMode Task Deletion Mode.
true: Do not force downstream task instances to fail
false: Force downstream task instances to fail
default: false 

     */
    public Boolean getDeleteMode() {
        return this.DeleteMode;
    }

    /**
     * Set Task Deletion Mode.
true: Do not force downstream task instances to fail
false: Force downstream task instances to fail
default: false 

     * @param DeleteMode Task Deletion Mode.
true: Do not force downstream task instances to fail
false: Force downstream task instances to fail
default: false 

     */
    public void setDeleteMode(Boolean DeleteMode) {
        this.DeleteMode = DeleteMode;
    }

    public DeleteTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTaskRequest(DeleteTaskRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.OperateInform != null) {
            this.OperateInform = new Boolean(source.OperateInform);
        }
        if (source.DeleteMode != null) {
            this.DeleteMode = new Boolean(source.DeleteMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "OperateInform", this.OperateInform);
        this.setParamSimple(map, prefix + "DeleteMode", this.DeleteMode);

    }
}

