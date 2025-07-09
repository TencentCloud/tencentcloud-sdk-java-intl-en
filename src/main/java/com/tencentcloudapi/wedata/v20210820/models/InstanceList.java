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

public class InstanceList extends AbstractModel {

    /**
    * Time Consumed
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CostTime")
    @Expose
    private String CostTime;

    /**
    * Data TimestampNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * Cycle type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * Whether to Supplement
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DoFlag")
    @Expose
    private Long DoFlag;

    /**
    * Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * LogNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastLog")
    @Expose
    private String LastLog;

    /**
    * Scheduling plan
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SchedulerDesc")
    @Expose
    private String SchedulerDesc;

    /**
    * Start startup time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Instance status EVENT_LISTENING|DEPENDENCE|BEFORE_ASPECT|ALLOCATED|LAUNCHED|KILL|SNAP_STATE_SAVING|ISSUED|RUNNING|AFTER_ASPECT|PENDING|KILLING|FINAL_STATE_SAVING|FAILED|KILL_FAILED| COMPLETED|EXPIRED|KILL_EXPIRED|DELETED
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Task IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Number of trial runs
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TryLimit")
    @Expose
    private Long TryLimit;

    /**
     * Get Time Consumed
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CostTime Time Consumed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCostTime() {
        return this.CostTime;
    }

    /**
     * Set Time Consumed
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CostTime Time Consumed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCostTime(String CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get Data TimestampNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CurRunDate Data TimestampNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set Data TimestampNote: This field may return null, indicating that no valid value can be obtained.
     * @param CurRunDate Data TimestampNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get Cycle type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleType Cycle type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Cycle type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleType Cycle type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Whether to Supplement
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DoFlag Whether to Supplement
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDoFlag() {
        return this.DoFlag;
    }

    /**
     * Set Whether to Supplement
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DoFlag Whether to Supplement
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDoFlag(Long DoFlag) {
        this.DoFlag = DoFlag;
    }

    /**
     * Get Person in ChargeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return InCharge Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
     * @param InCharge Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get LogNote: This field may return null, indicating that no valid value can be obtained. 
     * @return LastLog LogNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLastLog() {
        return this.LastLog;
    }

    /**
     * Set LogNote: This field may return null, indicating that no valid value can be obtained.
     * @param LastLog LogNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastLog(String LastLog) {
        this.LastLog = LastLog;
    }

    /**
     * Get Scheduling plan
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SchedulerDesc Scheduling plan
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSchedulerDesc() {
        return this.SchedulerDesc;
    }

    /**
     * Set Scheduling plan
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SchedulerDesc Scheduling plan
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSchedulerDesc(String SchedulerDesc) {
        this.SchedulerDesc = SchedulerDesc;
    }

    /**
     * Get Start startup time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StartTime Start startup time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start startup time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StartTime Start startup time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Instance status EVENT_LISTENING|DEPENDENCE|BEFORE_ASPECT|ALLOCATED|LAUNCHED|KILL|SNAP_STATE_SAVING|ISSUED|RUNNING|AFTER_ASPECT|PENDING|KILLING|FINAL_STATE_SAVING|FAILED|KILL_FAILED| COMPLETED|EXPIRED|KILL_EXPIRED|DELETED
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return State Instance status EVENT_LISTENING|DEPENDENCE|BEFORE_ASPECT|ALLOCATED|LAUNCHED|KILL|SNAP_STATE_SAVING|ISSUED|RUNNING|AFTER_ASPECT|PENDING|KILLING|FINAL_STATE_SAVING|FAILED|KILL_FAILED| COMPLETED|EXPIRED|KILL_EXPIRED|DELETED
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Instance status EVENT_LISTENING|DEPENDENCE|BEFORE_ASPECT|ALLOCATED|LAUNCHED|KILL|SNAP_STATE_SAVING|ISSUED|RUNNING|AFTER_ASPECT|PENDING|KILLING|FINAL_STATE_SAVING|FAILED|KILL_FAILED| COMPLETED|EXPIRED|KILL_EXPIRED|DELETED
Note: This field may return null, indicating that no valid value can be obtained.
     * @param State Instance status EVENT_LISTENING|DEPENDENCE|BEFORE_ASPECT|ALLOCATED|LAUNCHED|KILL|SNAP_STATE_SAVING|ISSUED|RUNNING|AFTER_ASPECT|PENDING|KILLING|FINAL_STATE_SAVING|FAILED|KILL_FAILED| COMPLETED|EXPIRED|KILL_EXPIRED|DELETED
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Task IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskId Task IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskId Task IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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
     * Get Number of trial runs
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TryLimit Number of trial runs
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTryLimit() {
        return this.TryLimit;
    }

    /**
     * Set Number of trial runs
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TryLimit Number of trial runs
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTryLimit(Long TryLimit) {
        this.TryLimit = TryLimit;
    }

    public InstanceList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceList(InstanceList source) {
        if (source.CostTime != null) {
            this.CostTime = new String(source.CostTime);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.DoFlag != null) {
            this.DoFlag = new Long(source.DoFlag);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.LastLog != null) {
            this.LastLog = new String(source.LastLog);
        }
        if (source.SchedulerDesc != null) {
            this.SchedulerDesc = new String(source.SchedulerDesc);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TryLimit != null) {
            this.TryLimit = new Long(source.TryLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "DoFlag", this.DoFlag);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "LastLog", this.LastLog);
        this.setParamSimple(map, prefix + "SchedulerDesc", this.SchedulerDesc);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TryLimit", this.TryLimit);

    }
}

