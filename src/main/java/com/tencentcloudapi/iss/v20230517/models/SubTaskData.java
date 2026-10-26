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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubTaskData extends AbstractModel {

    /**
    * Subtask ID
    */
    @SerializedName("SubTaskId")
    @Expose
    private String SubTaskId;

    /**
    * Task status. 1: NEW, 2: RUNNING, 3: COMPLETED, 4: FAILED
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Cause of the task failure.
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * Task progress
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * Operation type.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Operation type Chinese description
    */
    @SerializedName("ActionZhDesc")
    @Expose
    private String ActionZhDesc;

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Task start time
    */
    @SerializedName("StartedAt")
    @Expose
    private String StartedAt;

    /**
    * Task creation time
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Task update time
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * Task running time in milliseconds
    */
    @SerializedName("Runtime")
    @Expose
    private Long Runtime;

    /**
    * Device ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Device name.
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Channel ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Channel name
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
     * Get Subtask ID 
     * @return SubTaskId Subtask ID
     */
    public String getSubTaskId() {
        return this.SubTaskId;
    }

    /**
     * Set Subtask ID
     * @param SubTaskId Subtask ID
     */
    public void setSubTaskId(String SubTaskId) {
        this.SubTaskId = SubTaskId;
    }

    /**
     * Get Task status. 1: NEW, 2: RUNNING, 3: COMPLETED, 4: FAILED 
     * @return Status Task status. 1: NEW, 2: RUNNING, 3: COMPLETED, 4: FAILED
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. 1: NEW, 2: RUNNING, 3: COMPLETED, 4: FAILED
     * @param Status Task status. 1: NEW, 2: RUNNING, 3: COMPLETED, 4: FAILED
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Cause of the task failure. 
     * @return FailReason Cause of the task failure.
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set Cause of the task failure.
     * @param FailReason Cause of the task failure.
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get Task progress 
     * @return Progress Task progress
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress
     * @param Progress Task progress
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Operation type. 
     * @return Action Operation type.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Operation type.
     * @param Action Operation type.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Operation type Chinese description 
     * @return ActionZhDesc Operation type Chinese description
     */
    public String getActionZhDesc() {
        return this.ActionZhDesc;
    }

    /**
     * Set Operation type Chinese description
     * @param ActionZhDesc Operation type Chinese description
     */
    public void setActionZhDesc(String ActionZhDesc) {
        this.ActionZhDesc = ActionZhDesc;
    }

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Task start time 
     * @return StartedAt Task start time
     */
    public String getStartedAt() {
        return this.StartedAt;
    }

    /**
     * Set Task start time
     * @param StartedAt Task start time
     */
    public void setStartedAt(String StartedAt) {
        this.StartedAt = StartedAt;
    }

    /**
     * Get Task creation time 
     * @return CreatedAt Task creation time
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Task creation time
     * @param CreatedAt Task creation time
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Task update time 
     * @return UpdatedAt Task update time
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Task update time
     * @param UpdatedAt Task update time
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get Task running time in milliseconds 
     * @return Runtime Task running time in milliseconds
     */
    public Long getRuntime() {
        return this.Runtime;
    }

    /**
     * Set Task running time in milliseconds
     * @param Runtime Task running time in milliseconds
     */
    public void setRuntime(Long Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get Device ID 
     * @return DeviceId Device ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device ID
     * @param DeviceId Device ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Device name. 
     * @return DeviceName Device name.
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Device name.
     * @param DeviceName Device name.
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Channel ID 
     * @return ChannelId Channel ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel ID
     * @param ChannelId Channel ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Channel name 
     * @return ChannelName Channel name
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set Channel name
     * @param ChannelName Channel name
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    public SubTaskData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubTaskData(SubTaskData source) {
        if (source.SubTaskId != null) {
            this.SubTaskId = new String(source.SubTaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.ActionZhDesc != null) {
            this.ActionZhDesc = new String(source.ActionZhDesc);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.StartedAt != null) {
            this.StartedAt = new String(source.StartedAt);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.Runtime != null) {
            this.Runtime = new Long(source.Runtime);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubTaskId", this.SubTaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ActionZhDesc", this.ActionZhDesc);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "StartedAt", this.StartedAt);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);

    }
}

