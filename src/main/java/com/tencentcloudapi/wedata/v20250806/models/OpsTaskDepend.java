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

public class OpsTaskDepend extends AbstractModel {

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
    * Project name.


    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Task Status

-N: New

-Y: Scheduling

-F: Offline

-O: Paused

-T: Offlining

-INVALID: Invalid
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Task type Id.
* 21:JDBC SQL
* 23:TDSQL-PostgreSQL
* 26:OfflineSynchronization
* 30:Python
* 31:PySpark
* 33:Impala
* 34:Hive SQL
* 35:Shell
* 36:Spark SQL
* 38:Shell Form Mode
* 39:Spark
* 40:TCHouse-P
* 41:Kettle
* 42:Tchouse-X
* 43:TCHouse-X SQL
* 46:DLC Spark
* 47:TiOne
* 48:Trino
* 50:DLC PySpark
* 92:MapReduce
* 130:Branch Node
* 131:Merged Node
* 132:Notebook
* 133:SSH
* 134:StarRocks
* 137:For-each
* 138:Setats SQL
Note: This field may return null, indicating that no valid values can be obtained.
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
-130: specifies the branch.
-131: specifies the merge.
-132: specifies the Notebook explore.
-133: specifies the SSH node.
 - 134 :  StarRocks
 - 137 :  For-each
-10000: common custom business.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskTypeDesc")
    @Expose
    private String TaskTypeDesc;

    /**
    * Folder name.

    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * Folder ID

    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Latest submission time.

    */
    @SerializedName("FirstSubmitTime")
    @Expose
    private String FirstSubmitTime;

    /**
    * First running time


    */
    @SerializedName("FirstRunTime")
    @Expose
    private String FirstRunTime;

    /**
    * Describes the scheduling plan display description information.

    */
    @SerializedName("ScheduleDesc")
    @Expose
    private String ScheduleDesc;

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
    * Specifies the person in charge.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Execution start time. format: HH:mm, for example 00:00.

    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * Execution end time. format: HH:mm, for example 23:59.

    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

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
     * Get Project name.

 
     * @return ProjectName Project name.


     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name.


     * @param ProjectName Project name.


     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Task Status

-N: New

-Y: Scheduling

-F: Offline

-O: Paused

-T: Offlining

-INVALID: Invalid 
     * @return Status Task Status

-N: New

-Y: Scheduling

-F: Offline

-O: Paused

-T: Offlining

-INVALID: Invalid
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task Status

-N: New

-Y: Scheduling

-F: Offline

-O: Paused

-T: Offlining

-INVALID: Invalid
     * @param Status Task Status

-N: New

-Y: Scheduling

-F: Offline

-O: Paused

-T: Offlining

-INVALID: Invalid
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Task type Id.
* 21:JDBC SQL
* 23:TDSQL-PostgreSQL
* 26:OfflineSynchronization
* 30:Python
* 31:PySpark
* 33:Impala
* 34:Hive SQL
* 35:Shell
* 36:Spark SQL
* 38:Shell Form Mode
* 39:Spark
* 40:TCHouse-P
* 41:Kettle
* 42:Tchouse-X
* 43:TCHouse-X SQL
* 46:DLC Spark
* 47:TiOne
* 48:Trino
* 50:DLC PySpark
* 92:MapReduce
* 130:Branch Node
* 131:Merged Node
* 132:Notebook
* 133:SSH
* 134:StarRocks
* 137:For-each
* 138:Setats SQL
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskTypeId Task type Id.
* 21:JDBC SQL
* 23:TDSQL-PostgreSQL
* 26:OfflineSynchronization
* 30:Python
* 31:PySpark
* 33:Impala
* 34:Hive SQL
* 35:Shell
* 36:Spark SQL
* 38:Shell Form Mode
* 39:Spark
* 40:TCHouse-P
* 41:Kettle
* 42:Tchouse-X
* 43:TCHouse-X SQL
* 46:DLC Spark
* 47:TiOne
* 48:Trino
* 50:DLC PySpark
* 92:MapReduce
* 130:Branch Node
* 131:Merged Node
* 132:Notebook
* 133:SSH
* 134:StarRocks
* 137:For-each
* 138:Setats SQL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set Task type Id.
* 21:JDBC SQL
* 23:TDSQL-PostgreSQL
* 26:OfflineSynchronization
* 30:Python
* 31:PySpark
* 33:Impala
* 34:Hive SQL
* 35:Shell
* 36:Spark SQL
* 38:Shell Form Mode
* 39:Spark
* 40:TCHouse-P
* 41:Kettle
* 42:Tchouse-X
* 43:TCHouse-X SQL
* 46:DLC Spark
* 47:TiOne
* 48:Trino
* 50:DLC PySpark
* 92:MapReduce
* 130:Branch Node
* 131:Merged Node
* 132:Notebook
* 133:SSH
* 134:StarRocks
* 137:For-each
* 138:Setats SQL
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskTypeId Task type Id.
* 21:JDBC SQL
* 23:TDSQL-PostgreSQL
* 26:OfflineSynchronization
* 30:Python
* 31:PySpark
* 33:Impala
* 34:Hive SQL
* 35:Shell
* 36:Spark SQL
* 38:Shell Form Mode
* 39:Spark
* 40:TCHouse-P
* 41:Kettle
* 42:Tchouse-X
* 43:TCHouse-X SQL
* 46:DLC Spark
* 47:TiOne
* 48:Trino
* 50:DLC PySpark
* 92:MapReduce
* 130:Branch Node
* 131:Merged Node
* 132:Notebook
* 133:SSH
* 134:StarRocks
* 137:For-each
* 138:Setats SQL
Note: This field may return null, indicating that no valid values can be obtained.
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
-130: specifies the branch.
-131: specifies the merge.
-132: specifies the Notebook explore.
-133: specifies the SSH node.
 - 134 :  StarRocks
 - 137 :  For-each
-10000: common custom business.
Note: This field may return null, indicating that no valid values can be obtained. 
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
-130: specifies the branch.
-131: specifies the merge.
-132: specifies the Notebook explore.
-133: specifies the SSH node.
 - 134 :  StarRocks
 - 137 :  For-each
-10000: common custom business.
Note: This field may return null, indicating that no valid values can be obtained.
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
-130: specifies the branch.
-131: specifies the merge.
-132: specifies the Notebook explore.
-133: specifies the SSH node.
 - 134 :  StarRocks
 - 137 :  For-each
-10000: common custom business.
Note: This field may return null, indicating that no valid values can be obtained.
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
-130: specifies the branch.
-131: specifies the merge.
-132: specifies the Notebook explore.
-133: specifies the SSH node.
 - 134 :  StarRocks
 - 137 :  For-each
-10000: common custom business.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskTypeDesc(String TaskTypeDesc) {
        this.TaskTypeDesc = TaskTypeDesc;
    }

    /**
     * Get Folder name.
 
     * @return FolderName Folder name.

     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set Folder name.

     * @param FolderName Folder name.

     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
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
     * Get Latest submission time.
 
     * @return FirstSubmitTime Latest submission time.

     */
    public String getFirstSubmitTime() {
        return this.FirstSubmitTime;
    }

    /**
     * Set Latest submission time.

     * @param FirstSubmitTime Latest submission time.

     */
    public void setFirstSubmitTime(String FirstSubmitTime) {
        this.FirstSubmitTime = FirstSubmitTime;
    }

    /**
     * Get First running time

 
     * @return FirstRunTime First running time


     */
    public String getFirstRunTime() {
        return this.FirstRunTime;
    }

    /**
     * Set First running time


     * @param FirstRunTime First running time


     */
    public void setFirstRunTime(String FirstRunTime) {
        this.FirstRunTime = FirstRunTime;
    }

    /**
     * Get Describes the scheduling plan display description information.
 
     * @return ScheduleDesc Describes the scheduling plan display description information.

     */
    public String getScheduleDesc() {
        return this.ScheduleDesc;
    }

    /**
     * Set Describes the scheduling plan display description information.

     * @param ScheduleDesc Describes the scheduling plan display description information.

     */
    public void setScheduleDesc(String ScheduleDesc) {
        this.ScheduleDesc = ScheduleDesc;
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
     * Get Specifies the person in charge. 
     * @return OwnerUin Specifies the person in charge.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Specifies the person in charge.
     * @param OwnerUin Specifies the person in charge.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Execution start time. format: HH:mm, for example 00:00.
 
     * @return ExecutionStartTime Execution start time. format: HH:mm, for example 00:00.

     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set Execution start time. format: HH:mm, for example 00:00.

     * @param ExecutionStartTime Execution start time. format: HH:mm, for example 00:00.

     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get Execution end time. format: HH:mm, for example 23:59.
 
     * @return ExecutionEndTime Execution end time. format: HH:mm, for example 23:59.

     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set Execution end time. format: HH:mm, for example 23:59.

     * @param ExecutionEndTime Execution end time. format: HH:mm, for example 23:59.

     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    public OpsTaskDepend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpsTaskDepend(OpsTaskDepend source) {
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
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
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
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FirstSubmitTime != null) {
            this.FirstSubmitTime = new String(source.FirstSubmitTime);
        }
        if (source.FirstRunTime != null) {
            this.FirstRunTime = new String(source.FirstRunTime);
        }
        if (source.ScheduleDesc != null) {
            this.ScheduleDesc = new String(source.ScheduleDesc);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
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
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "TaskTypeDesc", this.TaskTypeDesc);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FirstSubmitTime", this.FirstSubmitTime);
        this.setParamSimple(map, prefix + "FirstRunTime", this.FirstRunTime);
        this.setParamSimple(map, prefix + "ScheduleDesc", this.ScheduleDesc);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);

    }
}

