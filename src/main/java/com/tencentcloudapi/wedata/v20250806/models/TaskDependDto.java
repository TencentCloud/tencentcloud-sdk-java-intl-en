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

public class TaskDependDto extends AbstractModel {

    /**
    * Task ID

    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task name.

    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Workflow id.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Workflow name.

    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Project ID.

    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task Status:

* N: New

* Y: Scheduling

* F: Offline

* O: Paused

* T: Offlining (in the process of being taken offline)

I* NVALID: Invalid
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Task type id.
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * Task type description.
-20 : universal data synchronization.
 - 25 :  ETLTaskType
 - 26 :  ETLTaskType
 - 30 :  python
 - 31 :  pyspark
 - 34 :  hivesql
 - 35 :  shell
 - 36 :  sparksql
 - 21 :  jdbcsql
 - 32 :  dlc
 - 33 :  ImpalaTaskType
 - 40 :  CDWTaskType
 - 41 :  kettle
 - 42 :  TCHouse-X
 - 43 :  TCHouse-X SQL
 - 46 :  dlcsparkTaskType
 - 47 :  TiOneMachineLearningTaskType
 - 48 :  Trino
 - 50 :  DLCPyspark
 - 23 :  TencentDistributedSQL
 - 39 :  spark
 - 92 :  MRTaskType
 - 38 :  ShellScript
 - 70 :  HiveSQLScrip
-130: branch.
-131: merge.
-132: Notebook 
-133: SSH node.
 - 134 :  StarRocks
 - 137 :  For-each
-10000 : custom business common.
    */
    @SerializedName("TaskTypeDesc")
    @Expose
    private String TaskTypeDesc;

    /**
    * Specifies scheduling plan display description information.

    */
    @SerializedName("ScheduleDesc")
    @Expose
    private String ScheduleDesc;

    /**
    * Task start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task end time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Delay time.
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * Cycle Type, Default: D
Supported types:
* O: One-time

* Y: Yearly

* M: Monthly

* W: Weekly

* D: Daily

* H: Hourly

* I: Minute

* C: Crontab expression type
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * Owner ID
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Elastic cycle configuration.
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * Initialization strategy for scheduling.
    */
    @SerializedName("InitStrategy")
    @Expose
    private String InitStrategy;

    /**
    * crontab expression.
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
     * Get Task ID
 
     * @return TaskId Task ID

     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID

     * @param TaskId Task ID

     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task name.
 
     * @return TaskName Task name.

     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name.

     * @param TaskName Task name.

     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Workflow id. 
     * @return WorkflowId Workflow id.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow id.
     * @param WorkflowId Workflow id.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
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

    /**
     * Get Project ID.
 
     * @return ProjectId Project ID.

     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.

     * @param ProjectId Project ID.

     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Task Status:

* N: New

* Y: Scheduling

* F: Offline

* O: Paused

* T: Offlining (in the process of being taken offline)

I* NVALID: Invalid 
     * @return Status Task Status:

* N: New

* Y: Scheduling

* F: Offline

* O: Paused

* T: Offlining (in the process of being taken offline)

I* NVALID: Invalid
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task Status:

* N: New

* Y: Scheduling

* F: Offline

* O: Paused

* T: Offlining (in the process of being taken offline)

I* NVALID: Invalid
     * @param Status Task Status:

* N: New

* Y: Scheduling

* F: Offline

* O: Paused

* T: Offlining (in the process of being taken offline)

I* NVALID: Invalid
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Task type id. 
     * @return TaskTypeId Task type id.
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set Task type id.
     * @param TaskTypeId Task type id.
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get Task type description.
-20 : universal data synchronization.
 - 25 :  ETLTaskType
 - 26 :  ETLTaskType
 - 30 :  python
 - 31 :  pyspark
 - 34 :  hivesql
 - 35 :  shell
 - 36 :  sparksql
 - 21 :  jdbcsql
 - 32 :  dlc
 - 33 :  ImpalaTaskType
 - 40 :  CDWTaskType
 - 41 :  kettle
 - 42 :  TCHouse-X
 - 43 :  TCHouse-X SQL
 - 46 :  dlcsparkTaskType
 - 47 :  TiOneMachineLearningTaskType
 - 48 :  Trino
 - 50 :  DLCPyspark
 - 23 :  TencentDistributedSQL
 - 39 :  spark
 - 92 :  MRTaskType
 - 38 :  ShellScript
 - 70 :  HiveSQLScrip
-130: branch.
-131: merge.
-132: Notebook 
-133: SSH node.
 - 134 :  StarRocks
 - 137 :  For-each
-10000 : custom business common. 
     * @return TaskTypeDesc Task type description.
-20 : universal data synchronization.
 - 25 :  ETLTaskType
 - 26 :  ETLTaskType
 - 30 :  python
 - 31 :  pyspark
 - 34 :  hivesql
 - 35 :  shell
 - 36 :  sparksql
 - 21 :  jdbcsql
 - 32 :  dlc
 - 33 :  ImpalaTaskType
 - 40 :  CDWTaskType
 - 41 :  kettle
 - 42 :  TCHouse-X
 - 43 :  TCHouse-X SQL
 - 46 :  dlcsparkTaskType
 - 47 :  TiOneMachineLearningTaskType
 - 48 :  Trino
 - 50 :  DLCPyspark
 - 23 :  TencentDistributedSQL
 - 39 :  spark
 - 92 :  MRTaskType
 - 38 :  ShellScript
 - 70 :  HiveSQLScrip
-130: branch.
-131: merge.
-132: Notebook 
-133: SSH node.
 - 134 :  StarRocks
 - 137 :  For-each
-10000 : custom business common.
     */
    public String getTaskTypeDesc() {
        return this.TaskTypeDesc;
    }

    /**
     * Set Task type description.
-20 : universal data synchronization.
 - 25 :  ETLTaskType
 - 26 :  ETLTaskType
 - 30 :  python
 - 31 :  pyspark
 - 34 :  hivesql
 - 35 :  shell
 - 36 :  sparksql
 - 21 :  jdbcsql
 - 32 :  dlc
 - 33 :  ImpalaTaskType
 - 40 :  CDWTaskType
 - 41 :  kettle
 - 42 :  TCHouse-X
 - 43 :  TCHouse-X SQL
 - 46 :  dlcsparkTaskType
 - 47 :  TiOneMachineLearningTaskType
 - 48 :  Trino
 - 50 :  DLCPyspark
 - 23 :  TencentDistributedSQL
 - 39 :  spark
 - 92 :  MRTaskType
 - 38 :  ShellScript
 - 70 :  HiveSQLScrip
-130: branch.
-131: merge.
-132: Notebook 
-133: SSH node.
 - 134 :  StarRocks
 - 137 :  For-each
-10000 : custom business common.
     * @param TaskTypeDesc Task type description.
-20 : universal data synchronization.
 - 25 :  ETLTaskType
 - 26 :  ETLTaskType
 - 30 :  python
 - 31 :  pyspark
 - 34 :  hivesql
 - 35 :  shell
 - 36 :  sparksql
 - 21 :  jdbcsql
 - 32 :  dlc
 - 33 :  ImpalaTaskType
 - 40 :  CDWTaskType
 - 41 :  kettle
 - 42 :  TCHouse-X
 - 43 :  TCHouse-X SQL
 - 46 :  dlcsparkTaskType
 - 47 :  TiOneMachineLearningTaskType
 - 48 :  Trino
 - 50 :  DLCPyspark
 - 23 :  TencentDistributedSQL
 - 39 :  spark
 - 92 :  MRTaskType
 - 38 :  ShellScript
 - 70 :  HiveSQLScrip
-130: branch.
-131: merge.
-132: Notebook 
-133: SSH node.
 - 134 :  StarRocks
 - 137 :  For-each
-10000 : custom business common.
     */
    public void setTaskTypeDesc(String TaskTypeDesc) {
        this.TaskTypeDesc = TaskTypeDesc;
    }

    /**
     * Get Specifies scheduling plan display description information.
 
     * @return ScheduleDesc Specifies scheduling plan display description information.

     */
    public String getScheduleDesc() {
        return this.ScheduleDesc;
    }

    /**
     * Set Specifies scheduling plan display description information.

     * @param ScheduleDesc Specifies scheduling plan display description information.

     */
    public void setScheduleDesc(String ScheduleDesc) {
        this.ScheduleDesc = ScheduleDesc;
    }

    /**
     * Get Task start time. 
     * @return StartTime Task start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time.
     * @param StartTime Task start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task end time. 
     * @return EndTime Task end time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time.
     * @param EndTime Task end time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Delay time. 
     * @return DelayTime Delay time.
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set Delay time.
     * @param DelayTime Delay time.
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get Cycle Type, Default: D
Supported types:
* O: One-time

* Y: Yearly

* M: Monthly

* W: Weekly

* D: Daily

* H: Hourly

* I: Minute

* C: Crontab expression type 
     * @return CycleType Cycle Type, Default: D
Supported types:
* O: One-time

* Y: Yearly

* M: Monthly

* W: Weekly

* D: Daily

* H: Hourly

* I: Minute

* C: Crontab expression type
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Cycle Type, Default: D
Supported types:
* O: One-time

* Y: Yearly

* M: Monthly

* W: Weekly

* D: Daily

* H: Hourly

* I: Minute

* C: Crontab expression type
     * @param CycleType Cycle Type, Default: D
Supported types:
* O: One-time

* Y: Yearly

* M: Monthly

* W: Weekly

* D: Daily

* H: Hourly

* I: Minute

* C: Crontab expression type
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Owner ID 
     * @return OwnerUin Owner ID
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Owner ID
     * @param OwnerUin Owner ID
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Elastic cycle configuration. 
     * @return TaskAction Elastic cycle configuration.
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set Elastic cycle configuration.
     * @param TaskAction Elastic cycle configuration.
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get Initialization strategy for scheduling. 
     * @return InitStrategy Initialization strategy for scheduling.
     */
    public String getInitStrategy() {
        return this.InitStrategy;
    }

    /**
     * Set Initialization strategy for scheduling.
     * @param InitStrategy Initialization strategy for scheduling.
     */
    public void setInitStrategy(String InitStrategy) {
        this.InitStrategy = InitStrategy;
    }

    /**
     * Get crontab expression. 
     * @return CrontabExpression crontab expression.
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set crontab expression.
     * @param CrontabExpression crontab expression.
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    public TaskDependDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskDependDto(TaskDependDto source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.TaskTypeDesc != null) {
            this.TaskTypeDesc = new String(source.TaskTypeDesc);
        }
        if (source.ScheduleDesc != null) {
            this.ScheduleDesc = new String(source.ScheduleDesc);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.InitStrategy != null) {
            this.InitStrategy = new String(source.InitStrategy);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "TaskTypeDesc", this.TaskTypeDesc);
        this.setParamSimple(map, prefix + "ScheduleDesc", this.ScheduleDesc);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "InitStrategy", this.InitStrategy);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);

    }
}

