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

public class TaskBaseAttribute extends AbstractModel {

    /**
    * Task ID

    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Specifies the task type ID.

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
    * Workflow ID.

    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Task name.

    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Last save version number.

    */
    @SerializedName("TaskLatestVersionNo")
    @Expose
    private String TaskLatestVersionNo;

    /**
    * Last submit version number.

    */
    @SerializedName("TaskLatestSubmitVersionNo")
    @Expose
    private String TaskLatestSubmitVersionNo;

    /**
    * Workflow name.


    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Task Status:

* N: New
* Y: Scheduling
* F: Offline
* O: Paused
* T: Offlining (in the process of being taken offline)
* INVALID: Invalid

    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Latest submission status of the task. Specifies whether it has been submitted: true/false.
    */
    @SerializedName("Submit")
    @Expose
    private Boolean Submit;

    /**
    * Task creation time. example: 2022-02-12 11:13:41.

    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last update time. example: 2025-08-13 16:34:06.
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * Last Updated By (Name).
    */
    @SerializedName("LastUpdateUserName")
    @Expose
    private String LastUpdateUserName;

    /**
    * Last operation time.

    */
    @SerializedName("LastOpsTime")
    @Expose
    private String LastOpsTime;

    /**
    * Last operator name.
    */
    @SerializedName("LastOpsUserName")
    @Expose
    private String LastOpsUserName;

    /**
    * Task owner ID.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Task description

    */
    @SerializedName("TaskDescription")
    @Expose
    private String TaskDescription;

    /**
    * Last Updated User ID

    */
    @SerializedName("UpdateUserUin")
    @Expose
    private String UpdateUserUin;

    /**
    * Created By User ID

    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

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
     * Get Specifies the task type ID.

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
     * @return TaskTypeId Specifies the task type ID.

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
     * Set Specifies the task type ID.

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
     * @param TaskTypeId Specifies the task type ID.

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
     * Get Last save version number.
 
     * @return TaskLatestVersionNo Last save version number.

     */
    public String getTaskLatestVersionNo() {
        return this.TaskLatestVersionNo;
    }

    /**
     * Set Last save version number.

     * @param TaskLatestVersionNo Last save version number.

     */
    public void setTaskLatestVersionNo(String TaskLatestVersionNo) {
        this.TaskLatestVersionNo = TaskLatestVersionNo;
    }

    /**
     * Get Last submit version number.
 
     * @return TaskLatestSubmitVersionNo Last submit version number.

     */
    public String getTaskLatestSubmitVersionNo() {
        return this.TaskLatestSubmitVersionNo;
    }

    /**
     * Set Last submit version number.

     * @param TaskLatestSubmitVersionNo Last submit version number.

     */
    public void setTaskLatestSubmitVersionNo(String TaskLatestSubmitVersionNo) {
        this.TaskLatestSubmitVersionNo = TaskLatestSubmitVersionNo;
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
     * Get Task Status:

* N: New
* Y: Scheduling
* F: Offline
* O: Paused
* T: Offlining (in the process of being taken offline)
* INVALID: Invalid
 
     * @return Status Task Status:

* N: New
* Y: Scheduling
* F: Offline
* O: Paused
* T: Offlining (in the process of being taken offline)
* INVALID: Invalid

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
* INVALID: Invalid

     * @param Status Task Status:

* N: New
* Y: Scheduling
* F: Offline
* O: Paused
* T: Offlining (in the process of being taken offline)
* INVALID: Invalid

     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Latest submission status of the task. Specifies whether it has been submitted: true/false. 
     * @return Submit Latest submission status of the task. Specifies whether it has been submitted: true/false.
     */
    public Boolean getSubmit() {
        return this.Submit;
    }

    /**
     * Set Latest submission status of the task. Specifies whether it has been submitted: true/false.
     * @param Submit Latest submission status of the task. Specifies whether it has been submitted: true/false.
     */
    public void setSubmit(Boolean Submit) {
        this.Submit = Submit;
    }

    /**
     * Get Task creation time. example: 2022-02-12 11:13:41.
 
     * @return CreateTime Task creation time. example: 2022-02-12 11:13:41.

     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation time. example: 2022-02-12 11:13:41.

     * @param CreateTime Task creation time. example: 2022-02-12 11:13:41.

     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last update time. example: 2025-08-13 16:34:06. 
     * @return LastUpdateTime Last update time. example: 2025-08-13 16:34:06.
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set Last update time. example: 2025-08-13 16:34:06.
     * @param LastUpdateTime Last update time. example: 2025-08-13 16:34:06.
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get Last Updated By (Name). 
     * @return LastUpdateUserName Last Updated By (Name).
     */
    public String getLastUpdateUserName() {
        return this.LastUpdateUserName;
    }

    /**
     * Set Last Updated By (Name).
     * @param LastUpdateUserName Last Updated By (Name).
     */
    public void setLastUpdateUserName(String LastUpdateUserName) {
        this.LastUpdateUserName = LastUpdateUserName;
    }

    /**
     * Get Last operation time.
 
     * @return LastOpsTime Last operation time.

     */
    public String getLastOpsTime() {
        return this.LastOpsTime;
    }

    /**
     * Set Last operation time.

     * @param LastOpsTime Last operation time.

     */
    public void setLastOpsTime(String LastOpsTime) {
        this.LastOpsTime = LastOpsTime;
    }

    /**
     * Get Last operator name. 
     * @return LastOpsUserName Last operator name.
     */
    public String getLastOpsUserName() {
        return this.LastOpsUserName;
    }

    /**
     * Set Last operator name.
     * @param LastOpsUserName Last operator name.
     */
    public void setLastOpsUserName(String LastOpsUserName) {
        this.LastOpsUserName = LastOpsUserName;
    }

    /**
     * Get Task owner ID. 
     * @return OwnerUin Task owner ID.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Task owner ID.
     * @param OwnerUin Task owner ID.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Task description
 
     * @return TaskDescription Task description

     */
    public String getTaskDescription() {
        return this.TaskDescription;
    }

    /**
     * Set Task description

     * @param TaskDescription Task description

     */
    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }

    /**
     * Get Last Updated User ID
 
     * @return UpdateUserUin Last Updated User ID

     */
    public String getUpdateUserUin() {
        return this.UpdateUserUin;
    }

    /**
     * Set Last Updated User ID

     * @param UpdateUserUin Last Updated User ID

     */
    public void setUpdateUserUin(String UpdateUserUin) {
        this.UpdateUserUin = UpdateUserUin;
    }

    /**
     * Get Created By User ID
 
     * @return CreateUserUin Created By User ID

     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set Created By User ID

     * @param CreateUserUin Created By User ID

     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    public TaskBaseAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskBaseAttribute(TaskBaseAttribute source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskLatestVersionNo != null) {
            this.TaskLatestVersionNo = new String(source.TaskLatestVersionNo);
        }
        if (source.TaskLatestSubmitVersionNo != null) {
            this.TaskLatestSubmitVersionNo = new String(source.TaskLatestSubmitVersionNo);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Submit != null) {
            this.Submit = new Boolean(source.Submit);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
        if (source.LastUpdateUserName != null) {
            this.LastUpdateUserName = new String(source.LastUpdateUserName);
        }
        if (source.LastOpsTime != null) {
            this.LastOpsTime = new String(source.LastOpsTime);
        }
        if (source.LastOpsUserName != null) {
            this.LastOpsUserName = new String(source.LastOpsUserName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.TaskDescription != null) {
            this.TaskDescription = new String(source.TaskDescription);
        }
        if (source.UpdateUserUin != null) {
            this.UpdateUserUin = new String(source.UpdateUserUin);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskLatestVersionNo", this.TaskLatestVersionNo);
        this.setParamSimple(map, prefix + "TaskLatestSubmitVersionNo", this.TaskLatestSubmitVersionNo);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Submit", this.Submit);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "LastUpdateUserName", this.LastUpdateUserName);
        this.setParamSimple(map, prefix + "LastOpsTime", this.LastOpsTime);
        this.setParamSimple(map, prefix + "LastOpsUserName", this.LastOpsUserName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "TaskDescription", this.TaskDescription);
        this.setParamSimple(map, prefix + "UpdateUserUin", this.UpdateUserUin);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);

    }
}

