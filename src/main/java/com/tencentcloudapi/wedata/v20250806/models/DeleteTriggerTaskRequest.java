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

public class DeleteTriggerTaskRequest extends AbstractModel {

    /**
    * Project ID.

    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task ID.
Specifies either VirtualTaskId or the other parameter.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Whether task operation notifies downstream task owners. valid values: true (notify).
false: do not notify.
Default false if not passed.
    */
    @SerializedName("OperateInform")
    @Expose
    private Boolean OperateInform;

    /**
    * This parameter does not take effect. currently, deleting an upstream task does not force failure on downstream task instances.
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
     * Get Task ID.
Specifies either VirtualTaskId or the other parameter. 
     * @return TaskId Task ID.
Specifies either VirtualTaskId or the other parameter.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
Specifies either VirtualTaskId or the other parameter.
     * @param TaskId Task ID.
Specifies either VirtualTaskId or the other parameter.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Whether task operation notifies downstream task owners. valid values: true (notify).
false: do not notify.
Default false if not passed. 
     * @return OperateInform Whether task operation notifies downstream task owners. valid values: true (notify).
false: do not notify.
Default false if not passed.
     */
    public Boolean getOperateInform() {
        return this.OperateInform;
    }

    /**
     * Set Whether task operation notifies downstream task owners. valid values: true (notify).
false: do not notify.
Default false if not passed.
     * @param OperateInform Whether task operation notifies downstream task owners. valid values: true (notify).
false: do not notify.
Default false if not passed.
     */
    public void setOperateInform(Boolean OperateInform) {
        this.OperateInform = OperateInform;
    }

    /**
     * Get This parameter does not take effect. currently, deleting an upstream task does not force failure on downstream task instances. 
     * @return DeleteMode This parameter does not take effect. currently, deleting an upstream task does not force failure on downstream task instances.
     */
    public Boolean getDeleteMode() {
        return this.DeleteMode;
    }

    /**
     * Set This parameter does not take effect. currently, deleting an upstream task does not force failure on downstream task instances.
     * @param DeleteMode This parameter does not take effect. currently, deleting an upstream task does not force failure on downstream task instances.
     */
    public void setDeleteMode(Boolean DeleteMode) {
        this.DeleteMode = DeleteMode;
    }

    public DeleteTriggerTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTriggerTaskRequest(DeleteTriggerTaskRequest source) {
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

