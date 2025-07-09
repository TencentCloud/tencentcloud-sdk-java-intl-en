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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Instance ID.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Event type. Currently, the type can only be related to instance migration, resource movement, and IDC deletion. This parameter can be only set to **InstanceMigration**.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Event levels are divided into Critical, High, Medium, and Low events according to the severity and urgency.- Critical
- High
- Middle
- Low
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * Scheduled event execution date.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionDate")
    @Expose
    private String ExecutionDate;

    /**
    * Scheduled start time of event execution.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Scheduled end time of event execution.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The latest execution date of the operations event. Event execution must be completed before this date. Otherwise, the business may be affected.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LatestExecutionDate")
    @Expose
    private String LatestExecutionDate;

    /**
    * Current event status.- Waiting: The event is waiting for execution on the execution date or during the operations period.- Running: The event is being executed during the operations period.- Finished: Execution of the event operations is completed.- Canceled: Execution of the event is canceled.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Completion time of the event execution task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskEndTime")
    @Expose
    private String TaskEndTime;

    /**
    * Impact of the event.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EffectInfo")
    @Expose
    private String EffectInfo;

    /**
    * Initial scheduled execution date of the event.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InitialExecutionDate")
    @Expose
    private String InitialExecutionDate;

    /**
     * Get Event ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ID Event ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Event ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ID Event ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Instance ID.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Instance name.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Instance name.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Event type. Currently, the type can only be related to instance migration, resource movement, and IDC deletion. This parameter can be only set to **InstanceMigration**.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Event type. Currently, the type can only be related to instance migration, resource movement, and IDC deletion. This parameter can be only set to **InstanceMigration**.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Event type. Currently, the type can only be related to instance migration, resource movement, and IDC deletion. This parameter can be only set to **InstanceMigration**.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Event type. Currently, the type can only be related to instance migration, resource movement, and IDC deletion. This parameter can be only set to **InstanceMigration**.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Event levels are divided into Critical, High, Medium, and Low events according to the severity and urgency.- Critical
- High
- Middle
- Low
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Grade Event levels are divided into Critical, High, Medium, and Low events according to the severity and urgency.- Critical
- High
- Middle
- Low
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set Event levels are divided into Critical, High, Medium, and Low events according to the severity and urgency.- Critical
- High
- Middle
- Low
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Grade Event levels are divided into Critical, High, Medium, and Low events according to the severity and urgency.- Critical
- High
- Middle
- Low
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * Get Scheduled event execution date.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionDate Scheduled event execution date.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionDate() {
        return this.ExecutionDate;
    }

    /**
     * Set Scheduled event execution date.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionDate Scheduled event execution date.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionDate(String ExecutionDate) {
        this.ExecutionDate = ExecutionDate;
    }

    /**
     * Get Scheduled start time of event execution.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Scheduled start time of event execution.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Scheduled start time of event execution.Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Scheduled start time of event execution.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Scheduled end time of event execution.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Scheduled end time of event execution.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Scheduled end time of event execution.Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Scheduled end time of event execution.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The latest execution date of the operations event. Event execution must be completed before this date. Otherwise, the business may be affected.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LatestExecutionDate The latest execution date of the operations event. Event execution must be completed before this date. Otherwise, the business may be affected.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLatestExecutionDate() {
        return this.LatestExecutionDate;
    }

    /**
     * Set The latest execution date of the operations event. Event execution must be completed before this date. Otherwise, the business may be affected.Note: This field may return null, indicating that no valid values can be obtained.
     * @param LatestExecutionDate The latest execution date of the operations event. Event execution must be completed before this date. Otherwise, the business may be affected.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLatestExecutionDate(String LatestExecutionDate) {
        this.LatestExecutionDate = LatestExecutionDate;
    }

    /**
     * Get Current event status.- Waiting: The event is waiting for execution on the execution date or during the operations period.- Running: The event is being executed during the operations period.- Finished: Execution of the event operations is completed.- Canceled: Execution of the event is canceled.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Current event status.- Waiting: The event is waiting for execution on the execution date or during the operations period.- Running: The event is being executed during the operations period.- Finished: Execution of the event operations is completed.- Canceled: Execution of the event is canceled.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Current event status.- Waiting: The event is waiting for execution on the execution date or during the operations period.- Running: The event is being executed during the operations period.- Finished: Execution of the event operations is completed.- Canceled: Execution of the event is canceled.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Current event status.- Waiting: The event is waiting for execution on the execution date or during the operations period.- Running: The event is being executed during the operations period.- Finished: Execution of the event operations is completed.- Canceled: Execution of the event is canceled.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Completion time of the event execution task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskEndTime Completion time of the event execution task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskEndTime() {
        return this.TaskEndTime;
    }

    /**
     * Set Completion time of the event execution task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskEndTime Completion time of the event execution task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskEndTime(String TaskEndTime) {
        this.TaskEndTime = TaskEndTime;
    }

    /**
     * Get Impact of the event.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EffectInfo Impact of the event.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEffectInfo() {
        return this.EffectInfo;
    }

    /**
     * Set Impact of the event.Note: This field may return null, indicating that no valid values can be obtained.
     * @param EffectInfo Impact of the event.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEffectInfo(String EffectInfo) {
        this.EffectInfo = EffectInfo;
    }

    /**
     * Get Initial scheduled execution date of the event.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InitialExecutionDate Initial scheduled execution date of the event.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInitialExecutionDate() {
        return this.InitialExecutionDate;
    }

    /**
     * Set Initial scheduled execution date of the event.Note: This field may return null, indicating that no valid values can be obtained.
     * @param InitialExecutionDate Initial scheduled execution date of the event.Note: This field may return null, indicating that no valid values can be obtained.
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

