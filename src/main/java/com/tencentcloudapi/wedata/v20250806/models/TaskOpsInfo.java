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

public class TaskOpsInfo extends AbstractModel {

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
    * Owner id

    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

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
    * Folder ID
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Folder name.
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

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
    * Specifies the name of the updater.
    */
    @SerializedName("UpdateUserUin")
    @Expose
    private String UpdateUserUin;

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
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * Task type description.
-Universal data synchronization.
 - ETLTaskType
 - ETLTaskType
 - python
 - pyspark
 - HiveSQLTaskType
 - shell
 - SparkSQLTaskType
 - JDBCSQLTaskType
 - DLCTaskType
 - ImpalaTaskType
 - CDWTaskType
 - kettle
 - DLCSparkTaskType
-TiOne machine learning.
 - TrinoTaskType
 - DLCPyspark
 - spark
 - mr
-Specifies the shell script.
-hivesql script.
-Specifies common custom business.

    */
    @SerializedName("TaskTypeDesc")
    @Expose
    private String TaskTypeDesc;

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
    * Resource group ID

    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * Scheduling description.

    */
    @SerializedName("ScheduleDesc")
    @Expose
    private String ScheduleDesc;

    /**
    * Resource group name.
    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

    /**
    * Latest scheduling submission time.

    */
    @SerializedName("LastSchedulerCommitTime")
    @Expose
    private String LastSchedulerCommitTime;

    /**
    * First execution time.

    */
    @SerializedName("FirstRunTime")
    @Expose
    private String FirstRunTime;

    /**
    * Most recent submission time.
    */
    @SerializedName("FirstSubmitTime")
    @Expose
    private String FirstSubmitTime;

    /**
    * Creation time.


    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Latest update time.

    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

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
     * Get Owner id
 
     * @return OwnerUin Owner id

     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Owner id

     * @param OwnerUin Owner id

     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
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
     * Get Specifies the name of the updater. 
     * @return UpdateUserUin Specifies the name of the updater.
     */
    public String getUpdateUserUin() {
        return this.UpdateUserUin;
    }

    /**
     * Set Specifies the name of the updater.
     * @param UpdateUserUin Specifies the name of the updater.
     */
    public void setUpdateUserUin(String UpdateUserUin) {
        this.UpdateUserUin = UpdateUserUin;
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
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get Task type description.
-Universal data synchronization.
 - ETLTaskType
 - ETLTaskType
 - python
 - pyspark
 - HiveSQLTaskType
 - shell
 - SparkSQLTaskType
 - JDBCSQLTaskType
 - DLCTaskType
 - ImpalaTaskType
 - CDWTaskType
 - kettle
 - DLCSparkTaskType
-TiOne machine learning.
 - TrinoTaskType
 - DLCPyspark
 - spark
 - mr
-Specifies the shell script.
-hivesql script.
-Specifies common custom business.
 
     * @return TaskTypeDesc Task type description.
-Universal data synchronization.
 - ETLTaskType
 - ETLTaskType
 - python
 - pyspark
 - HiveSQLTaskType
 - shell
 - SparkSQLTaskType
 - JDBCSQLTaskType
 - DLCTaskType
 - ImpalaTaskType
 - CDWTaskType
 - kettle
 - DLCSparkTaskType
-TiOne machine learning.
 - TrinoTaskType
 - DLCPyspark
 - spark
 - mr
-Specifies the shell script.
-hivesql script.
-Specifies common custom business.

     */
    public String getTaskTypeDesc() {
        return this.TaskTypeDesc;
    }

    /**
     * Set Task type description.
-Universal data synchronization.
 - ETLTaskType
 - ETLTaskType
 - python
 - pyspark
 - HiveSQLTaskType
 - shell
 - SparkSQLTaskType
 - JDBCSQLTaskType
 - DLCTaskType
 - ImpalaTaskType
 - CDWTaskType
 - kettle
 - DLCSparkTaskType
-TiOne machine learning.
 - TrinoTaskType
 - DLCPyspark
 - spark
 - mr
-Specifies the shell script.
-hivesql script.
-Specifies common custom business.

     * @param TaskTypeDesc Task type description.
-Universal data synchronization.
 - ETLTaskType
 - ETLTaskType
 - python
 - pyspark
 - HiveSQLTaskType
 - shell
 - SparkSQLTaskType
 - JDBCSQLTaskType
 - DLCTaskType
 - ImpalaTaskType
 - CDWTaskType
 - kettle
 - DLCSparkTaskType
-TiOne machine learning.
 - TrinoTaskType
 - DLCPyspark
 - spark
 - mr
-Specifies the shell script.
-hivesql script.
-Specifies common custom business.

     */
    public void setTaskTypeDesc(String TaskTypeDesc) {
        this.TaskTypeDesc = TaskTypeDesc;
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
     * Get Resource group ID
 
     * @return ExecutorGroupId Resource group ID

     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set Resource group ID

     * @param ExecutorGroupId Resource group ID

     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get Scheduling description.
 
     * @return ScheduleDesc Scheduling description.

     */
    public String getScheduleDesc() {
        return this.ScheduleDesc;
    }

    /**
     * Set Scheduling description.

     * @param ScheduleDesc Scheduling description.

     */
    public void setScheduleDesc(String ScheduleDesc) {
        this.ScheduleDesc = ScheduleDesc;
    }

    /**
     * Get Resource group name. 
     * @return ExecutorGroupName Resource group name.
     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set Resource group name.
     * @param ExecutorGroupName Resource group name.
     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    /**
     * Get Latest scheduling submission time.
 
     * @return LastSchedulerCommitTime Latest scheduling submission time.

     */
    public String getLastSchedulerCommitTime() {
        return this.LastSchedulerCommitTime;
    }

    /**
     * Set Latest scheduling submission time.

     * @param LastSchedulerCommitTime Latest scheduling submission time.

     */
    public void setLastSchedulerCommitTime(String LastSchedulerCommitTime) {
        this.LastSchedulerCommitTime = LastSchedulerCommitTime;
    }

    /**
     * Get First execution time.
 
     * @return FirstRunTime First execution time.

     */
    public String getFirstRunTime() {
        return this.FirstRunTime;
    }

    /**
     * Set First execution time.

     * @param FirstRunTime First execution time.

     */
    public void setFirstRunTime(String FirstRunTime) {
        this.FirstRunTime = FirstRunTime;
    }

    /**
     * Get Most recent submission time. 
     * @return FirstSubmitTime Most recent submission time.
     */
    public String getFirstSubmitTime() {
        return this.FirstSubmitTime;
    }

    /**
     * Set Most recent submission time.
     * @param FirstSubmitTime Most recent submission time.
     */
    public void setFirstSubmitTime(String FirstSubmitTime) {
        this.FirstSubmitTime = FirstSubmitTime;
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
     * Get Latest update time.
 
     * @return LastUpdateTime Latest update time.

     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set Latest update time.

     * @param LastUpdateTime Latest update time.

     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    public TaskOpsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskOpsInfo(TaskOpsInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
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
        if (source.UpdateUserUin != null) {
            this.UpdateUserUin = new String(source.UpdateUserUin);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.TaskTypeDesc != null) {
            this.TaskTypeDesc = new String(source.TaskTypeDesc);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.ScheduleDesc != null) {
            this.ScheduleDesc = new String(source.ScheduleDesc);
        }
        if (source.ExecutorGroupName != null) {
            this.ExecutorGroupName = new String(source.ExecutorGroupName);
        }
        if (source.LastSchedulerCommitTime != null) {
            this.LastSchedulerCommitTime = new String(source.LastSchedulerCommitTime);
        }
        if (source.FirstRunTime != null) {
            this.FirstRunTime = new String(source.FirstRunTime);
        }
        if (source.FirstSubmitTime != null) {
            this.FirstSubmitTime = new String(source.FirstSubmitTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "UpdateUserUin", this.UpdateUserUin);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "TaskTypeDesc", this.TaskTypeDesc);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "ScheduleDesc", this.ScheduleDesc);
        this.setParamSimple(map, prefix + "ExecutorGroupName", this.ExecutorGroupName);
        this.setParamSimple(map, prefix + "LastSchedulerCommitTime", this.LastSchedulerCommitTime);
        this.setParamSimple(map, prefix + "FirstRunTime", this.FirstRunTime);
        this.setParamSimple(map, prefix + "FirstSubmitTime", this.FirstSubmitTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);

    }
}

