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

public class RuntimeInstanceCntTop extends AbstractModel {

    /**
    * Task IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 1
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * Task Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * Instance StatusNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Time Consumption
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RunTime")
    @Expose
    private Long RunTime;

    /**
    * Instance Running TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CurRunTime")
    @Expose
    private String CurRunTime;

    /**
    * Waiting for Scheduling Duration
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WaitScheduleTime")
    @Expose
    private Long WaitScheduleTime;

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
     * Get 1
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskName 1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 1
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskName 1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
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
     * Get Task Cycle Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleUnit Task Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set Task Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleUnit Task Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get Instance StatusNote: This field may return null, indicating that no valid value can be obtained. 
     * @return State Instance StatusNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Instance StatusNote: This field may return null, indicating that no valid value can be obtained.
     * @param State Instance StatusNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Time Consumption
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RunTime Time Consumption
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRunTime() {
        return this.RunTime;
    }

    /**
     * Set Time Consumption
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RunTime Time Consumption
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRunTime(Long RunTime) {
        this.RunTime = RunTime;
    }

    /**
     * Get Instance Running TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CurRunTime Instance Running TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCurRunTime() {
        return this.CurRunTime;
    }

    /**
     * Set Instance Running TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CurRunTime Instance Running TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCurRunTime(String CurRunTime) {
        this.CurRunTime = CurRunTime;
    }

    /**
     * Get Waiting for Scheduling Duration
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WaitScheduleTime Waiting for Scheduling Duration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getWaitScheduleTime() {
        return this.WaitScheduleTime;
    }

    /**
     * Set Waiting for Scheduling Duration
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WaitScheduleTime Waiting for Scheduling Duration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWaitScheduleTime(Long WaitScheduleTime) {
        this.WaitScheduleTime = WaitScheduleTime;
    }

    public RuntimeInstanceCntTop() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuntimeInstanceCntTop(RuntimeInstanceCntTop source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.RunTime != null) {
            this.RunTime = new Long(source.RunTime);
        }
        if (source.CurRunTime != null) {
            this.CurRunTime = new String(source.CurRunTime);
        }
        if (source.WaitScheduleTime != null) {
            this.WaitScheduleTime = new Long(source.WaitScheduleTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "RunTime", this.RunTime);
        this.setParamSimple(map, prefix + "CurRunTime", this.CurRunTime);
        this.setParamSimple(map, prefix + "WaitScheduleTime", this.WaitScheduleTime);

    }
}

