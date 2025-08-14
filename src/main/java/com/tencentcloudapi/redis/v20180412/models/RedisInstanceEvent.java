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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisInstanceEvent extends AbstractModel {

    /**
    * Event ID.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Event type. Currently, the type can only be related to instance migration, resource movement, and IDC deletion. This parameter can be set only to **InstanceMigration**.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Event level. The levels are divided into critical, important, medium, and general based on severity and urgency.
 - Critical: critical.
 - High: important.
 - Middle: medium.
 - Low.
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * Scheduled event execution date.
    */
    @SerializedName("ExecutionDate")
    @Expose
    private String ExecutionDate;

    /**
    * Start date of scheduled event execution.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End date of scheduled event execution.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Latest execution date of the Ops event. The event should be completed before this date. Otherwise, the business may be affected.
    */
    @SerializedName("LatestExecutionDate")
    @Expose
    private String LatestExecutionDate;

    /**
    * Current event status.
 - Waiting: event not reached the execution date or not within the maintenance window.
 - Running: event within the maintenance window and under maintenance execution.
 - Finished: event with maintenance completed.
- Canceled: Execution of the event is canceled.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Completion time of the event execution task.
    */
    @SerializedName("TaskEndTime")
    @Expose
    private String TaskEndTime;

    /**
    * Event impact information.
    */
    @SerializedName("EffectInfo")
    @Expose
    private String EffectInfo;

    /**
    * Initial scheduled event execution date.
    */
    @SerializedName("InitialExecutionDate")
    @Expose
    private String InitialExecutionDate;

    /**
     * Get Event ID. 
     * @return ID Event ID.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Event ID.
     * @param ID Event ID.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Event type. Currently, the type can only be related to instance migration, resource movement, and IDC deletion. This parameter can be set only to **InstanceMigration**. 
     * @return Type Event type. Currently, the type can only be related to instance migration, resource movement, and IDC deletion. This parameter can be set only to **InstanceMigration**.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Event type. Currently, the type can only be related to instance migration, resource movement, and IDC deletion. This parameter can be set only to **InstanceMigration**.
     * @param Type Event type. Currently, the type can only be related to instance migration, resource movement, and IDC deletion. This parameter can be set only to **InstanceMigration**.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Event level. The levels are divided into critical, important, medium, and general based on severity and urgency.
 - Critical: critical.
 - High: important.
 - Middle: medium.
 - Low. 
     * @return Grade Event level. The levels are divided into critical, important, medium, and general based on severity and urgency.
 - Critical: critical.
 - High: important.
 - Middle: medium.
 - Low.
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set Event level. The levels are divided into critical, important, medium, and general based on severity and urgency.
 - Critical: critical.
 - High: important.
 - Middle: medium.
 - Low.
     * @param Grade Event level. The levels are divided into critical, important, medium, and general based on severity and urgency.
 - Critical: critical.
 - High: important.
 - Middle: medium.
 - Low.
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * Get Scheduled event execution date. 
     * @return ExecutionDate Scheduled event execution date.
     */
    public String getExecutionDate() {
        return this.ExecutionDate;
    }

    /**
     * Set Scheduled event execution date.
     * @param ExecutionDate Scheduled event execution date.
     */
    public void setExecutionDate(String ExecutionDate) {
        this.ExecutionDate = ExecutionDate;
    }

    /**
     * Get Start date of scheduled event execution. 
     * @return StartTime Start date of scheduled event execution.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start date of scheduled event execution.
     * @param StartTime Start date of scheduled event execution.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End date of scheduled event execution. 
     * @return EndTime End date of scheduled event execution.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End date of scheduled event execution.
     * @param EndTime End date of scheduled event execution.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Latest execution date of the Ops event. The event should be completed before this date. Otherwise, the business may be affected. 
     * @return LatestExecutionDate Latest execution date of the Ops event. The event should be completed before this date. Otherwise, the business may be affected.
     */
    public String getLatestExecutionDate() {
        return this.LatestExecutionDate;
    }

    /**
     * Set Latest execution date of the Ops event. The event should be completed before this date. Otherwise, the business may be affected.
     * @param LatestExecutionDate Latest execution date of the Ops event. The event should be completed before this date. Otherwise, the business may be affected.
     */
    public void setLatestExecutionDate(String LatestExecutionDate) {
        this.LatestExecutionDate = LatestExecutionDate;
    }

    /**
     * Get Current event status.
 - Waiting: event not reached the execution date or not within the maintenance window.
 - Running: event within the maintenance window and under maintenance execution.
 - Finished: event with maintenance completed.
- Canceled: Execution of the event is canceled. 
     * @return Status Current event status.
 - Waiting: event not reached the execution date or not within the maintenance window.
 - Running: event within the maintenance window and under maintenance execution.
 - Finished: event with maintenance completed.
- Canceled: Execution of the event is canceled.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Current event status.
 - Waiting: event not reached the execution date or not within the maintenance window.
 - Running: event within the maintenance window and under maintenance execution.
 - Finished: event with maintenance completed.
- Canceled: Execution of the event is canceled.
     * @param Status Current event status.
 - Waiting: event not reached the execution date or not within the maintenance window.
 - Running: event within the maintenance window and under maintenance execution.
 - Finished: event with maintenance completed.
- Canceled: Execution of the event is canceled.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Completion time of the event execution task. 
     * @return TaskEndTime Completion time of the event execution task.
     */
    public String getTaskEndTime() {
        return this.TaskEndTime;
    }

    /**
     * Set Completion time of the event execution task.
     * @param TaskEndTime Completion time of the event execution task.
     */
    public void setTaskEndTime(String TaskEndTime) {
        this.TaskEndTime = TaskEndTime;
    }

    /**
     * Get Event impact information. 
     * @return EffectInfo Event impact information.
     */
    public String getEffectInfo() {
        return this.EffectInfo;
    }

    /**
     * Set Event impact information.
     * @param EffectInfo Event impact information.
     */
    public void setEffectInfo(String EffectInfo) {
        this.EffectInfo = EffectInfo;
    }

    /**
     * Get Initial scheduled event execution date. 
     * @return InitialExecutionDate Initial scheduled event execution date.
     */
    public String getInitialExecutionDate() {
        return this.InitialExecutionDate;
    }

    /**
     * Set Initial scheduled event execution date.
     * @param InitialExecutionDate Initial scheduled event execution date.
     */
    public void setInitialExecutionDate(String InitialExecutionDate) {
        this.InitialExecutionDate = InitialExecutionDate;
    }

    public RedisInstanceEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisInstanceEvent(RedisInstanceEvent source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Grade != null) {
            this.Grade = new String(source.Grade);
        }
        if (source.ExecutionDate != null) {
            this.ExecutionDate = new String(source.ExecutionDate);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LatestExecutionDate != null) {
            this.LatestExecutionDate = new String(source.LatestExecutionDate);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskEndTime != null) {
            this.TaskEndTime = new String(source.TaskEndTime);
        }
        if (source.EffectInfo != null) {
            this.EffectInfo = new String(source.EffectInfo);
        }
        if (source.InitialExecutionDate != null) {
            this.InitialExecutionDate = new String(source.InitialExecutionDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Grade", this.Grade);
        this.setParamSimple(map, prefix + "ExecutionDate", this.ExecutionDate);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LatestExecutionDate", this.LatestExecutionDate);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskEndTime", this.TaskEndTime);
        this.setParamSimple(map, prefix + "EffectInfo", this.EffectInfo);
        this.setParamSimple(map, prefix + "InitialExecutionDate", this.InitialExecutionDate);

    }
}

