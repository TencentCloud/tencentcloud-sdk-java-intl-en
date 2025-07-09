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

public class CheckAlarmRegularNameExistRequest extends AbstractModel {

    /**
    * Project name
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Rule name
    */
    @SerializedName("AlarmRegularName")
    @Expose
    private String AlarmRegularName;

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Primary key ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Task type: 201.Real-time, 202.Offline
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Monitored Object Type (1: All Tasks, 2: Assigned Task, 3: Designated Responsible Person, 4: Specified Resource Group)
    */
    @SerializedName("MonitorType")
    @Expose
    private Long MonitorType;

    /**
     * Get Project name 
     * @return ProjectId Project name
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project name
     * @param ProjectId Project name
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Rule name 
     * @return AlarmRegularName Rule name
     */
    public String getAlarmRegularName() {
        return this.AlarmRegularName;
    }

    /**
     * Set Rule name
     * @param AlarmRegularName Rule name
     */
    public void setAlarmRegularName(String AlarmRegularName) {
        this.AlarmRegularName = AlarmRegularName;
    }

    /**
     * Get Task ID 
     * @return TaskId Task ID
     * @deprecated
     */
    @Deprecated
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     * @deprecated
     */
    @Deprecated
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Primary key ID 
     * @return Id Primary key ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Primary key ID
     * @param Id Primary key ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Task type: 201.Real-time, 202.Offline 
     * @return TaskType Task type: 201.Real-time, 202.Offline
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type: 201.Real-time, 202.Offline
     * @param TaskType Task type: 201.Real-time, 202.Offline
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Monitored Object Type (1: All Tasks, 2: Assigned Task, 3: Designated Responsible Person, 4: Specified Resource Group) 
     * @return MonitorType Monitored Object Type (1: All Tasks, 2: Assigned Task, 3: Designated Responsible Person, 4: Specified Resource Group)
     */
    public Long getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set Monitored Object Type (1: All Tasks, 2: Assigned Task, 3: Designated Responsible Person, 4: Specified Resource Group)
     * @param MonitorType Monitored Object Type (1: All Tasks, 2: Assigned Task, 3: Designated Responsible Person, 4: Specified Resource Group)
     */
    public void setMonitorType(Long MonitorType) {
        this.MonitorType = MonitorType;
    }

    public CheckAlarmRegularNameExistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckAlarmRegularNameExistRequest(CheckAlarmRegularNameExistRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AlarmRegularName != null) {
            this.AlarmRegularName = new String(source.AlarmRegularName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new Long(source.MonitorType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AlarmRegularName", this.AlarmRegularName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);

    }
}

