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

public class TriggerTaskBaseAttribute extends AbstractModel {

    /**
    * Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task type ID.

- 26:OfflineSynchronization
- 30:Python
- 32:DLC SQL
- 35:Shell
- 38:Shell Form Mode
- 46:DLC Spark
- 50:DLC PySpark
- 130:Branch Node
- 131:Merged Node
- 132:Notebook
- 133:SSH
- 137:For-each
- 139:DLC Spark Streaming
- 140:Run Workflow
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Task name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Last saved version no.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskLatestVersionNo")
    @Expose
    private String TaskLatestVersionNo;

    /**
    * Version no. of last submission.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskLatestSubmitVersionNo")
    @Expose
    private String TaskLatestSubmitVersionNo;

    /**
    * Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Task status:.
* N: create.
* Y: scheduling in progress.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Latest submission status of the task, whether it has been submitted: true/false.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Submit")
    @Expose
    private Boolean Submit;

    /**
    * Task creation time, for example: 2022-02-12 11:13:41.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last update time, for example: 2025-08-13 16:34:06.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * Last updated by name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastUpdateUserName")
    @Expose
    private String LastUpdateUserName;

    /**
    * Last maintenance time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastOpsTime")
    @Expose
    private String LastOpsTime;

    /**
    * Last operator name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastOpsUserName")
    @Expose
    private String LastOpsUserName;

    /**
    * Task owner ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Task description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskDescription")
    @Expose
    private String TaskDescription;

    /**
    * Latest update uid.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateUserUin")
    @Expose
    private String UpdateUserUin;

    /**
    * Create a user ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * Task folder path.

Note:.

Do not fill in the task node type in the path. for example, in a workflow named wf01, under the "common" category, if you want to create a new shell task under the tf_01 folder in this classification, just fill in /tf_01.
If the tf_01 folder does not exist, first create this folder (use the CreateTaskFolder api) for a successful operation.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskFolderPath")
    @Expose
    private String TaskFolderPath;

    /**
     * Get Task ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task type ID.

- 26:OfflineSynchronization
- 30:Python
- 32:DLC SQL
- 35:Shell
- 38:Shell Form Mode
- 46:DLC Spark
- 50:DLC PySpark
- 130:Branch Node
- 131:Merged Node
- 132:Notebook
- 133:SSH
- 137:For-each
- 139:DLC Spark Streaming
- 140:Run Workflow
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskTypeId Task type ID.

- 26:OfflineSynchronization
- 30:Python
- 32:DLC SQL
- 35:Shell
- 38:Shell Form Mode
- 46:DLC Spark
- 50:DLC PySpark
- 130:Branch Node
- 131:Merged Node
- 132:Notebook
- 133:SSH
- 137:For-each
- 139:DLC Spark Streaming
- 140:Run Workflow
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set Task type ID.

- 26:OfflineSynchronization
- 30:Python
- 32:DLC SQL
- 35:Shell
- 38:Shell Form Mode
- 46:DLC Spark
- 50:DLC PySpark
- 130:Branch Node
- 131:Merged Node
- 132:Notebook
- 133:SSH
- 137:For-each
- 139:DLC Spark Streaming
- 140:Run Workflow
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskTypeId Task type ID.

- 26:OfflineSynchronization
- 30:Python
- 32:DLC SQL
- 35:Shell
- 38:Shell Form Mode
- 46:DLC Spark
- 50:DLC PySpark
- 130:Branch Node
- 131:Merged Node
- 132:Notebook
- 133:SSH
- 137:For-each
- 139:DLC Spark Streaming
- 140:Run Workflow
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowId Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowId Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Task name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskName Task name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskName Task name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Last saved version no.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskLatestVersionNo Last saved version no.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskLatestVersionNo() {
        return this.TaskLatestVersionNo;
    }

    /**
     * Set Last saved version no.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskLatestVersionNo Last saved version no.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskLatestVersionNo(String TaskLatestVersionNo) {
        this.TaskLatestVersionNo = TaskLatestVersionNo;
    }

    /**
     * Get Version no. of last submission.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskLatestSubmitVersionNo Version no. of last submission.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskLatestSubmitVersionNo() {
        return this.TaskLatestSubmitVersionNo;
    }

    /**
     * Set Version no. of last submission.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskLatestSubmitVersionNo Version no. of last submission.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskLatestSubmitVersionNo(String TaskLatestSubmitVersionNo) {
        this.TaskLatestSubmitVersionNo = TaskLatestSubmitVersionNo;
    }

    /**
     * Get Workflow name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowName Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowName Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Task status:.
* N: create.
* Y: scheduling in progress.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Task status:.
* N: create.
* Y: scheduling in progress.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status:.
* N: create.
* Y: scheduling in progress.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Task status:.
* N: create.
* Y: scheduling in progress.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Latest submission status of the task, whether it has been submitted: true/false.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Submit Latest submission status of the task, whether it has been submitted: true/false.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSubmit() {
        return this.Submit;
    }

    /**
     * Set Latest submission status of the task, whether it has been submitted: true/false.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Submit Latest submission status of the task, whether it has been submitted: true/false.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubmit(Boolean Submit) {
        this.Submit = Submit;
    }

    /**
     * Get Task creation time, for example: 2022-02-12 11:13:41.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Task creation time, for example: 2022-02-12 11:13:41.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation time, for example: 2022-02-12 11:13:41.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Task creation time, for example: 2022-02-12 11:13:41.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last update time, for example: 2025-08-13 16:34:06.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastUpdateTime Last update time, for example: 2025-08-13 16:34:06.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set Last update time, for example: 2025-08-13 16:34:06.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastUpdateTime Last update time, for example: 2025-08-13 16:34:06.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get Last updated by name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastUpdateUserName Last updated by name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastUpdateUserName() {
        return this.LastUpdateUserName;
    }

    /**
     * Set Last updated by name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastUpdateUserName Last updated by name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastUpdateUserName(String LastUpdateUserName) {
        this.LastUpdateUserName = LastUpdateUserName;
    }

    /**
     * Get Last maintenance time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastOpsTime Last maintenance time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastOpsTime() {
        return this.LastOpsTime;
    }

    /**
     * Set Last maintenance time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastOpsTime Last maintenance time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastOpsTime(String LastOpsTime) {
        this.LastOpsTime = LastOpsTime;
    }

    /**
     * Get Last operator name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastOpsUserName Last operator name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastOpsUserName() {
        return this.LastOpsUserName;
    }

    /**
     * Set Last operator name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastOpsUserName Last operator name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastOpsUserName(String LastOpsUserName) {
        this.LastOpsUserName = LastOpsUserName;
    }

    /**
     * Get Task owner ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OwnerUin Task owner ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Task owner ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OwnerUin Task owner ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Task description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskDescription Task description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskDescription() {
        return this.TaskDescription;
    }

    /**
     * Set Task description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskDescription Task description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }

    /**
     * Get Latest update uid.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateUserUin Latest update uid.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateUserUin() {
        return this.UpdateUserUin;
    }

    /**
     * Set Latest update uid.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateUserUin Latest update uid.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateUserUin(String UpdateUserUin) {
        this.UpdateUserUin = UpdateUserUin;
    }

    /**
     * Get Create a user ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateUserUin Create a user ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set Create a user ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateUserUin Create a user ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get Task folder path.

Note:.

Do not fill in the task node type in the path. for example, in a workflow named wf01, under the "common" category, if you want to create a new shell task under the tf_01 folder in this classification, just fill in /tf_01.
If the tf_01 folder does not exist, first create this folder (use the CreateTaskFolder api) for a successful operation.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskFolderPath Task folder path.

Note:.

Do not fill in the task node type in the path. for example, in a workflow named wf01, under the "common" category, if you want to create a new shell task under the tf_01 folder in this classification, just fill in /tf_01.
If the tf_01 folder does not exist, first create this folder (use the CreateTaskFolder api) for a successful operation.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskFolderPath() {
        return this.TaskFolderPath;
    }

    /**
     * Set Task folder path.

Note:.

Do not fill in the task node type in the path. for example, in a workflow named wf01, under the "common" category, if you want to create a new shell task under the tf_01 folder in this classification, just fill in /tf_01.
If the tf_01 folder does not exist, first create this folder (use the CreateTaskFolder api) for a successful operation.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskFolderPath Task folder path.

Note:.

Do not fill in the task node type in the path. for example, in a workflow named wf01, under the "common" category, if you want to create a new shell task under the tf_01 folder in this classification, just fill in /tf_01.
If the tf_01 folder does not exist, first create this folder (use the CreateTaskFolder api) for a successful operation.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskFolderPath(String TaskFolderPath) {
        this.TaskFolderPath = TaskFolderPath;
    }

    public TriggerTaskBaseAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerTaskBaseAttribute(TriggerTaskBaseAttribute source) {
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
        if (source.TaskFolderPath != null) {
            this.TaskFolderPath = new String(source.TaskFolderPath);
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
        this.setParamSimple(map, prefix + "TaskFolderPath", this.TaskFolderPath);

    }
}

