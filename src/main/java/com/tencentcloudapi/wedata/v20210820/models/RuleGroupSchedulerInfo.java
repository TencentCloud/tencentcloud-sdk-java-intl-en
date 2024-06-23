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

public class RuleGroupSchedulerInfo extends AbstractModel {

    /**
    * Rule Group IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 1: Unconfigured 2: Associated with production scheduling 3: Offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MonitorType")
    @Expose
    private Long MonitorType;

    /**
    * Start TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End timeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Abbreviation for cycle type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * Cycle step length
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * Cycle type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleDesc")
    @Expose
    private String CycleDesc;

    /**
    * Specified time under offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * Delay time under offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * Task ID registered to the task scheduler under offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleTaskId")
    @Expose
    private String CycleTaskId;

    /**
    * Associated task ID under associated production scheduling
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AssociateTaskIds")
    @Expose
    private String [] AssociateTaskIds;

    /**
     * Get Rule Group IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Id Rule Group IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule Group IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param Id Rule Group IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 1: Unconfigured 2: Associated with production scheduling 3: Offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MonitorType 1: Unconfigured 2: Associated with production scheduling 3: Offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 1: Unconfigured 2: Associated with production scheduling 3: Offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MonitorType 1: Unconfigured 2: Associated with production scheduling 3: Offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMonitorType(Long MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get Start TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return StartTime Start TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param StartTime Start TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End timeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return EndTime End timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End timeNote: This field may return null, indicating that no valid value can be obtained.
     * @param EndTime End timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Abbreviation for cycle type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleType Abbreviation for cycle type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Abbreviation for cycle type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleType Abbreviation for cycle type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Cycle step length
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleStep Cycle step length
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set Cycle step length
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleStep Cycle step length
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get Cycle type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleDesc Cycle type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCycleDesc() {
        return this.CycleDesc;
    }

    /**
     * Set Cycle type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleDesc Cycle type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleDesc(String CycleDesc) {
        this.CycleDesc = CycleDesc;
    }

    /**
     * Get Specified time under offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskAction Specified time under offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set Specified time under offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskAction Specified time under offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get Delay time under offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DelayTime Delay time under offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set Delay time under offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DelayTime Delay time under offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get Task ID registered to the task scheduler under offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleTaskId Task ID registered to the task scheduler under offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCycleTaskId() {
        return this.CycleTaskId;
    }

    /**
     * Set Task ID registered to the task scheduler under offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleTaskId Task ID registered to the task scheduler under offline cycle detection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleTaskId(String CycleTaskId) {
        this.CycleTaskId = CycleTaskId;
    }

    /**
     * Get Associated task ID under associated production scheduling
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AssociateTaskIds Associated task ID under associated production scheduling
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getAssociateTaskIds() {
        return this.AssociateTaskIds;
    }

    /**
     * Set Associated task ID under associated production scheduling
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AssociateTaskIds Associated task ID under associated production scheduling
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAssociateTaskIds(String [] AssociateTaskIds) {
        this.AssociateTaskIds = AssociateTaskIds;
    }

    public RuleGroupSchedulerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleGroupSchedulerInfo(RuleGroupSchedulerInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new Long(source.MonitorType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.CycleDesc != null) {
            this.CycleDesc = new String(source.CycleDesc);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.CycleTaskId != null) {
            this.CycleTaskId = new String(source.CycleTaskId);
        }
        if (source.AssociateTaskIds != null) {
            this.AssociateTaskIds = new String[source.AssociateTaskIds.length];
            for (int i = 0; i < source.AssociateTaskIds.length; i++) {
                this.AssociateTaskIds[i] = new String(source.AssociateTaskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "CycleDesc", this.CycleDesc);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "CycleTaskId", this.CycleTaskId);
        this.setParamArraySimple(map, prefix + "AssociateTaskIds.", this.AssociateTaskIds);

    }
}

