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

public class DeleteTaskDsRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Delete script?
true: delete
false: do not delete
Default false if not passed
    */
    @SerializedName("DeleteScript")
    @Expose
    private Boolean DeleteScript;

    /**
    * Task operation: Notify downstream task owners?
true: notify
false: do not notify
Default false if not passed
    */
    @SerializedName("OperateInform")
    @Expose
    private Boolean OperateInform;

    /**
    * Task IDChoose either VirtualTaskId or
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Virtual task id
Either TaskId or this field is optional

    */
    @SerializedName("VirtualTaskId")
    @Expose
    private String VirtualTaskId;

    /**
    * Virtual task flag
true: It is a virtual task
false: It is not a virtual task
Default false if not passed
    */
    @SerializedName("VirtualFlag")
    @Expose
    private Boolean VirtualFlag;

    /**
    * Task deletion method
true: Do not force fail downstream task instances
false: Force fail downstream task instances
If not specified, the default is false

    */
    @SerializedName("DeleteMode")
    @Expose
    private Boolean DeleteMode;

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
     * Get Delete script?
true: delete
false: do not delete
Default false if not passed 
     * @return DeleteScript Delete script?
true: delete
false: do not delete
Default false if not passed
     */
    public Boolean getDeleteScript() {
        return this.DeleteScript;
    }

    /**
     * Set Delete script?
true: delete
false: do not delete
Default false if not passed
     * @param DeleteScript Delete script?
true: delete
false: do not delete
Default false if not passed
     */
    public void setDeleteScript(Boolean DeleteScript) {
        this.DeleteScript = DeleteScript;
    }

    /**
     * Get Task operation: Notify downstream task owners?
true: notify
false: do not notify
Default false if not passed 
     * @return OperateInform Task operation: Notify downstream task owners?
true: notify
false: do not notify
Default false if not passed
     */
    public Boolean getOperateInform() {
        return this.OperateInform;
    }

    /**
     * Set Task operation: Notify downstream task owners?
true: notify
false: do not notify
Default false if not passed
     * @param OperateInform Task operation: Notify downstream task owners?
true: notify
false: do not notify
Default false if not passed
     */
    public void setOperateInform(Boolean OperateInform) {
        this.OperateInform = OperateInform;
    }

    /**
     * Get Task IDChoose either VirtualTaskId or 
     * @return TaskId Task IDChoose either VirtualTaskId or
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task IDChoose either VirtualTaskId or
     * @param TaskId Task IDChoose either VirtualTaskId or
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Virtual task id
Either TaskId or this field is optional
 
     * @return VirtualTaskId Virtual task id
Either TaskId or this field is optional

     */
    public String getVirtualTaskId() {
        return this.VirtualTaskId;
    }

    /**
     * Set Virtual task id
Either TaskId or this field is optional

     * @param VirtualTaskId Virtual task id
Either TaskId or this field is optional

     */
    public void setVirtualTaskId(String VirtualTaskId) {
        this.VirtualTaskId = VirtualTaskId;
    }

    /**
     * Get Virtual task flag
true: It is a virtual task
false: It is not a virtual task
Default false if not passed 
     * @return VirtualFlag Virtual task flag
true: It is a virtual task
false: It is not a virtual task
Default false if not passed
     */
    public Boolean getVirtualFlag() {
        return this.VirtualFlag;
    }

    /**
     * Set Virtual task flag
true: It is a virtual task
false: It is not a virtual task
Default false if not passed
     * @param VirtualFlag Virtual task flag
true: It is a virtual task
false: It is not a virtual task
Default false if not passed
     */
    public void setVirtualFlag(Boolean VirtualFlag) {
        this.VirtualFlag = VirtualFlag;
    }

    /**
     * Get Task deletion method
true: Do not force fail downstream task instances
false: Force fail downstream task instances
If not specified, the default is false
 
     * @return DeleteMode Task deletion method
true: Do not force fail downstream task instances
false: Force fail downstream task instances
If not specified, the default is false

     */
    public Boolean getDeleteMode() {
        return this.DeleteMode;
    }

    /**
     * Set Task deletion method
true: Do not force fail downstream task instances
false: Force fail downstream task instances
If not specified, the default is false

     * @param DeleteMode Task deletion method
true: Do not force fail downstream task instances
false: Force fail downstream task instances
If not specified, the default is false

     */
    public void setDeleteMode(Boolean DeleteMode) {
        this.DeleteMode = DeleteMode;
    }

    public DeleteTaskDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTaskDsRequest(DeleteTaskDsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeleteScript != null) {
            this.DeleteScript = new Boolean(source.DeleteScript);
        }
        if (source.OperateInform != null) {
            this.OperateInform = new Boolean(source.OperateInform);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.VirtualTaskId != null) {
            this.VirtualTaskId = new String(source.VirtualTaskId);
        }
        if (source.VirtualFlag != null) {
            this.VirtualFlag = new Boolean(source.VirtualFlag);
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
        this.setParamSimple(map, prefix + "DeleteScript", this.DeleteScript);
        this.setParamSimple(map, prefix + "OperateInform", this.OperateInform);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "VirtualTaskId", this.VirtualTaskId);
        this.setParamSimple(map, prefix + "VirtualFlag", this.VirtualFlag);
        this.setParamSimple(map, prefix + "DeleteMode", this.DeleteMode);

    }
}

