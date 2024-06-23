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

public class ColumnData extends AbstractModel {

    /**
    * ColumnName1
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * ColumnName1
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EventProjectName")
    @Expose
    private String EventProjectName;

    /**
    * 1
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 1
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 1
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 1
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 1
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Task NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Project nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Project IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get ColumnName1
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EventName ColumnName1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set ColumnName1
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EventName ColumnName1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get ColumnName1
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EventProjectName ColumnName1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEventProjectName() {
        return this.EventProjectName;
    }

    /**
     * Set ColumnName1
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EventProjectName ColumnName1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEventProjectName(String EventProjectName) {
        this.EventProjectName = EventProjectName;
    }

    /**
     * Get 1
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Type 1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 1
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Type 1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 1
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CurRunDate 1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 1
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CurRunDate 1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get 1
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskId 1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 1
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskId 1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 1
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return State 1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 1
Note: This field may return null, indicating that no valid value can be obtained.
     * @param State 1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 1
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EventType 1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 1
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EventType 1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Task NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskName Task NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskName Task NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Project nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectName Project nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectName Project nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Project IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectId Project IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectId Project IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public ColumnData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnData(ColumnData source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventProjectName != null) {
            this.EventProjectName = new String(source.EventProjectName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventProjectName", this.EventProjectName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

