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

public class OpsWorkflowDetail extends AbstractModel {

    /**
    * Workflow ID.

    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Workflow description.

    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * Specifies the workflow type.
-cycle.
-manual.
    */
    @SerializedName("WorkflowType")
    @Expose
    private String WorkflowType;

    /**
    * Creation time.

    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Creator

    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * Modification time.

    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Delayed execution time. unit: minute.

    */
    @SerializedName("StartupTime")
    @Expose
    private Long StartupTime;

    /**
    * Effective date. specifies the start date.

    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Configure end date end date.

    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Task Cycle Type

* ONEOFF_CYCLE: One-time

* YEAR_CYCLE: Yearly

* MONTH_CYCLE: Monthly

* WEEK_CYCLE: Weekly

* DAY_CYCLE: Daily

* HOUR_CYCLE: Hourly

* MINUTE_CYCLE: Minute-level

* CRONTAB_CYCLE: Crontab expression-based
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * Folder ID


    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Task instance initialization strategy.
-T_PLUS_1 (t+1): initializes with a one-day delay.
-T_PLUS_0 (t+0): initialize on the day.
-T_MINUS_1 (t-1): initialize one day in advance.

    */
    @SerializedName("InstanceInitStrategy")
    @Expose
    private String InstanceInitStrategy;

    /**
    * Specifies the scheduling plan interpretation.

    */
    @SerializedName("SchedulerDesc")
    @Expose
    private String SchedulerDesc;

    /**
    * First submission time of workflow.

    */
    @SerializedName("FirstSubmitTime")
    @Expose
    private String FirstSubmitTime;

    /**
    * Latest submission time of workflow.

    */
    @SerializedName("LatestSubmitTime")
    @Expose
    private String LatestSubmitTime;

    /**
    * Workflow Status

* ALL_RUNNING: All running (all workflows are in scheduling state)

* ALL_FREEZED: All paused

* ALL_STOPPTED: All stopped

* PART_RUNNING: Partially running (some workflows are running, others not)

* ALL_NO_RUNNING: All not scheduled

* ALL_INVALID: All invalid
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Person in charge. multiple values are separated by a ";" separator.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Workflow name.

    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
     * Get Workflow ID.
 
     * @return WorkflowId Workflow ID.

     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID.

     * @param WorkflowId Workflow ID.

     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Workflow description.
 
     * @return WorkflowDesc Workflow description.

     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set Workflow description.

     * @param WorkflowDesc Workflow description.

     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
    }

    /**
     * Get Specifies the workflow type.
-cycle.
-manual. 
     * @return WorkflowType Specifies the workflow type.
-cycle.
-manual.
     */
    public String getWorkflowType() {
        return this.WorkflowType;
    }

    /**
     * Set Specifies the workflow type.
-cycle.
-manual.
     * @param WorkflowType Specifies the workflow type.
-cycle.
-manual.
     */
    public void setWorkflowType(String WorkflowType) {
        this.WorkflowType = WorkflowType;
    }

    /**
     * Get Creation time.
 
     * @return CreateTime Creation time.

     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.

     * @param CreateTime Creation time.

     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Creator
 
     * @return CreateUserUin Creator

     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set Creator

     * @param CreateUserUin Creator

     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get Modification time.
 
     * @return UpdateTime Modification time.

     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Modification time.

     * @param UpdateTime Modification time.

     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Delayed execution time. unit: minute.
 
     * @return StartupTime Delayed execution time. unit: minute.

     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set Delayed execution time. unit: minute.

     * @param StartupTime Delayed execution time. unit: minute.

     */
    public void setStartupTime(Long StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get Effective date. specifies the start date.
 
     * @return StartTime Effective date. specifies the start date.

     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Effective date. specifies the start date.

     * @param StartTime Effective date. specifies the start date.

     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Configure end date end date.
 
     * @return EndTime Configure end date end date.

     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Configure end date end date.

     * @param EndTime Configure end date end date.

     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Task Cycle Type

* ONEOFF_CYCLE: One-time

* YEAR_CYCLE: Yearly

* MONTH_CYCLE: Monthly

* WEEK_CYCLE: Weekly

* DAY_CYCLE: Daily

* HOUR_CYCLE: Hourly

* MINUTE_CYCLE: Minute-level

* CRONTAB_CYCLE: Crontab expression-based 
     * @return CycleType Task Cycle Type

* ONEOFF_CYCLE: One-time

* YEAR_CYCLE: Yearly

* MONTH_CYCLE: Monthly

* WEEK_CYCLE: Weekly

* DAY_CYCLE: Daily

* HOUR_CYCLE: Hourly

* MINUTE_CYCLE: Minute-level

* CRONTAB_CYCLE: Crontab expression-based
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Task Cycle Type

* ONEOFF_CYCLE: One-time

* YEAR_CYCLE: Yearly

* MONTH_CYCLE: Monthly

* WEEK_CYCLE: Weekly

* DAY_CYCLE: Daily

* HOUR_CYCLE: Hourly

* MINUTE_CYCLE: Minute-level

* CRONTAB_CYCLE: Crontab expression-based
     * @param CycleType Task Cycle Type

* ONEOFF_CYCLE: One-time

* YEAR_CYCLE: Yearly

* MONTH_CYCLE: Monthly

* WEEK_CYCLE: Weekly

* DAY_CYCLE: Daily

* HOUR_CYCLE: Hourly

* MINUTE_CYCLE: Minute-level

* CRONTAB_CYCLE: Crontab expression-based
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Folder ID

 
     * @return FolderId Folder ID


     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder ID


     * @param FolderId Folder ID


     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Task instance initialization strategy.
-T_PLUS_1 (t+1): initializes with a one-day delay.
-T_PLUS_0 (t+0): initialize on the day.
-T_MINUS_1 (t-1): initialize one day in advance.
 
     * @return InstanceInitStrategy Task instance initialization strategy.
-T_PLUS_1 (t+1): initializes with a one-day delay.
-T_PLUS_0 (t+0): initialize on the day.
-T_MINUS_1 (t-1): initialize one day in advance.

     */
    public String getInstanceInitStrategy() {
        return this.InstanceInitStrategy;
    }

    /**
     * Set Task instance initialization strategy.
-T_PLUS_1 (t+1): initializes with a one-day delay.
-T_PLUS_0 (t+0): initialize on the day.
-T_MINUS_1 (t-1): initialize one day in advance.

     * @param InstanceInitStrategy Task instance initialization strategy.
-T_PLUS_1 (t+1): initializes with a one-day delay.
-T_PLUS_0 (t+0): initialize on the day.
-T_MINUS_1 (t-1): initialize one day in advance.

     */
    public void setInstanceInitStrategy(String InstanceInitStrategy) {
        this.InstanceInitStrategy = InstanceInitStrategy;
    }

    /**
     * Get Specifies the scheduling plan interpretation.
 
     * @return SchedulerDesc Specifies the scheduling plan interpretation.

     */
    public String getSchedulerDesc() {
        return this.SchedulerDesc;
    }

    /**
     * Set Specifies the scheduling plan interpretation.

     * @param SchedulerDesc Specifies the scheduling plan interpretation.

     */
    public void setSchedulerDesc(String SchedulerDesc) {
        this.SchedulerDesc = SchedulerDesc;
    }

    /**
     * Get First submission time of workflow.
 
     * @return FirstSubmitTime First submission time of workflow.

     */
    public String getFirstSubmitTime() {
        return this.FirstSubmitTime;
    }

    /**
     * Set First submission time of workflow.

     * @param FirstSubmitTime First submission time of workflow.

     */
    public void setFirstSubmitTime(String FirstSubmitTime) {
        this.FirstSubmitTime = FirstSubmitTime;
    }

    /**
     * Get Latest submission time of workflow.
 
     * @return LatestSubmitTime Latest submission time of workflow.

     */
    public String getLatestSubmitTime() {
        return this.LatestSubmitTime;
    }

    /**
     * Set Latest submission time of workflow.

     * @param LatestSubmitTime Latest submission time of workflow.

     */
    public void setLatestSubmitTime(String LatestSubmitTime) {
        this.LatestSubmitTime = LatestSubmitTime;
    }

    /**
     * Get Workflow Status

* ALL_RUNNING: All running (all workflows are in scheduling state)

* ALL_FREEZED: All paused

* ALL_STOPPTED: All stopped

* PART_RUNNING: Partially running (some workflows are running, others not)

* ALL_NO_RUNNING: All not scheduled

* ALL_INVALID: All invalid 
     * @return Status Workflow Status

* ALL_RUNNING: All running (all workflows are in scheduling state)

* ALL_FREEZED: All paused

* ALL_STOPPTED: All stopped

* PART_RUNNING: Partially running (some workflows are running, others not)

* ALL_NO_RUNNING: All not scheduled

* ALL_INVALID: All invalid
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Workflow Status

* ALL_RUNNING: All running (all workflows are in scheduling state)

* ALL_FREEZED: All paused

* ALL_STOPPTED: All stopped

* PART_RUNNING: Partially running (some workflows are running, others not)

* ALL_NO_RUNNING: All not scheduled

* ALL_INVALID: All invalid
     * @param Status Workflow Status

* ALL_RUNNING: All running (all workflows are in scheduling state)

* ALL_FREEZED: All paused

* ALL_STOPPTED: All stopped

* PART_RUNNING: Partially running (some workflows are running, others not)

* ALL_NO_RUNNING: All not scheduled

* ALL_INVALID: All invalid
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Person in charge. multiple values are separated by a ";" separator. 
     * @return OwnerUin Person in charge. multiple values are separated by a ";" separator.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Person in charge. multiple values are separated by a ";" separator.
     * @param OwnerUin Person in charge. multiple values are separated by a ";" separator.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Workflow name.
 
     * @return WorkflowName Workflow name.

     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow name.

     * @param WorkflowName Workflow name.

     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    public OpsWorkflowDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpsWorkflowDetail(OpsWorkflowDetail source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowDesc != null) {
            this.WorkflowDesc = new String(source.WorkflowDesc);
        }
        if (source.WorkflowType != null) {
            this.WorkflowType = new String(source.WorkflowType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.StartupTime != null) {
            this.StartupTime = new Long(source.StartupTime);
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
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.InstanceInitStrategy != null) {
            this.InstanceInitStrategy = new String(source.InstanceInitStrategy);
        }
        if (source.SchedulerDesc != null) {
            this.SchedulerDesc = new String(source.SchedulerDesc);
        }
        if (source.FirstSubmitTime != null) {
            this.FirstSubmitTime = new String(source.FirstSubmitTime);
        }
        if (source.LatestSubmitTime != null) {
            this.LatestSubmitTime = new String(source.LatestSubmitTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "WorkflowType", this.WorkflowType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "StartupTime", this.StartupTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "InstanceInitStrategy", this.InstanceInitStrategy);
        this.setParamSimple(map, prefix + "SchedulerDesc", this.SchedulerDesc);
        this.setParamSimple(map, prefix + "FirstSubmitTime", this.FirstSubmitTime);
        this.setParamSimple(map, prefix + "LatestSubmitTime", this.LatestSubmitTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);

    }
}

