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

public class CreateTriggerTaskBaseAttribute extends AbstractModel {

    /**
    * Task name.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Task type ID:.
* 26:OfflineSynchronization
* 30:Python
* 32:DLC SQL
* 35:Shell
* 38:Shell Form Mode
* 46:DLC Spark
* 50:DLC PySpark
* 130:Branch Node
* 131:Merged Node
* 132:Notebook
* 133:SSH
* 137:For-each
* 139:DLC Spark Streaming
* 140:Run Workflow
    */
    @SerializedName("TaskTypeId")
    @Expose
    private String TaskTypeId;

    /**
    * Workflow ID.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Task owner ID, defaults to the current user.
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
    * Task folder path.

Note:.
-Do not fill in the task node type in the path. for example, in a workflow named wf01, under the "common" category, if you want to create a new shell task under the tf_01 folder in this classification, just fill in /tf_01.
-If the tf_01 folder does not exist, first create this folder (use the CreateTaskFolder api) for the operation to succeed.
    */
    @SerializedName("TaskFolderPath")
    @Expose
    private String TaskFolderPath;

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
     * Get Task type ID:.
* 26:OfflineSynchronization
* 30:Python
* 32:DLC SQL
* 35:Shell
* 38:Shell Form Mode
* 46:DLC Spark
* 50:DLC PySpark
* 130:Branch Node
* 131:Merged Node
* 132:Notebook
* 133:SSH
* 137:For-each
* 139:DLC Spark Streaming
* 140:Run Workflow 
     * @return TaskTypeId Task type ID:.
* 26:OfflineSynchronization
* 30:Python
* 32:DLC SQL
* 35:Shell
* 38:Shell Form Mode
* 46:DLC Spark
* 50:DLC PySpark
* 130:Branch Node
* 131:Merged Node
* 132:Notebook
* 133:SSH
* 137:For-each
* 139:DLC Spark Streaming
* 140:Run Workflow
     */
    public String getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set Task type ID:.
* 26:OfflineSynchronization
* 30:Python
* 32:DLC SQL
* 35:Shell
* 38:Shell Form Mode
* 46:DLC Spark
* 50:DLC PySpark
* 130:Branch Node
* 131:Merged Node
* 132:Notebook
* 133:SSH
* 137:For-each
* 139:DLC Spark Streaming
* 140:Run Workflow
     * @param TaskTypeId Task type ID:.
* 26:OfflineSynchronization
* 30:Python
* 32:DLC SQL
* 35:Shell
* 38:Shell Form Mode
* 46:DLC Spark
* 50:DLC PySpark
* 130:Branch Node
* 131:Merged Node
* 132:Notebook
* 133:SSH
* 137:For-each
* 139:DLC Spark Streaming
* 140:Run Workflow
     */
    public void setTaskTypeId(String TaskTypeId) {
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
     * Get Task owner ID, defaults to the current user. 
     * @return OwnerUin Task owner ID, defaults to the current user.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Task owner ID, defaults to the current user.
     * @param OwnerUin Task owner ID, defaults to the current user.
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
     * Get Task folder path.

Note:.
-Do not fill in the task node type in the path. for example, in a workflow named wf01, under the "common" category, if you want to create a new shell task under the tf_01 folder in this classification, just fill in /tf_01.
-If the tf_01 folder does not exist, first create this folder (use the CreateTaskFolder api) for the operation to succeed. 
     * @return TaskFolderPath Task folder path.

Note:.
-Do not fill in the task node type in the path. for example, in a workflow named wf01, under the "common" category, if you want to create a new shell task under the tf_01 folder in this classification, just fill in /tf_01.
-If the tf_01 folder does not exist, first create this folder (use the CreateTaskFolder api) for the operation to succeed.
     */
    public String getTaskFolderPath() {
        return this.TaskFolderPath;
    }

    /**
     * Set Task folder path.

Note:.
-Do not fill in the task node type in the path. for example, in a workflow named wf01, under the "common" category, if you want to create a new shell task under the tf_01 folder in this classification, just fill in /tf_01.
-If the tf_01 folder does not exist, first create this folder (use the CreateTaskFolder api) for the operation to succeed.
     * @param TaskFolderPath Task folder path.

Note:.
-Do not fill in the task node type in the path. for example, in a workflow named wf01, under the "common" category, if you want to create a new shell task under the tf_01 folder in this classification, just fill in /tf_01.
-If the tf_01 folder does not exist, first create this folder (use the CreateTaskFolder api) for the operation to succeed.
     */
    public void setTaskFolderPath(String TaskFolderPath) {
        this.TaskFolderPath = TaskFolderPath;
    }

    public CreateTriggerTaskBaseAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTriggerTaskBaseAttribute(CreateTriggerTaskBaseAttribute source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new String(source.TaskTypeId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.TaskDescription != null) {
            this.TaskDescription = new String(source.TaskDescription);
        }
        if (source.TaskFolderPath != null) {
            this.TaskFolderPath = new String(source.TaskFolderPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "TaskDescription", this.TaskDescription);
        this.setParamSimple(map, prefix + "TaskFolderPath", this.TaskFolderPath);

    }
}

