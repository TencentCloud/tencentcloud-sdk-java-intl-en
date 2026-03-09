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

public class TaskFolderDetail extends AbstractModel {

    /**
    * Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Folder ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskFolderId")
    @Expose
    private String TaskFolderId;

    /**
    * Absolute path of the folder.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskFolderPath")
    @Expose
    private String TaskFolderPath;

    /**
    * Creator ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * Parent folder absolute path.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParentTaskFolderPath")
    @Expose
    private String ParentTaskFolderPath;

    /**
    * Folder name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskFolderName")
    @Expose
    private String TaskFolderName;

    /**
    * Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Task folder type.

| task folder type parameter | task folder type interface corresponding name |.
| ---------------- | ------------------------ |
ETL | integration task.
| EMR              | EMR                      |
| DLC              | DLC                      |
| SETATS           | SETATS                   |
| TDSQL            | TDSQL                    |
| TCHOUSE          | TCHOUSE                  |
COMMON.
TI_ONE | ti-one machine learning.
ACROSS_WORKFLOWS | cross-workflow.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskFolderType")
    @Expose
    private String TaskFolderType;

    /**
     * Get Project ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Folder ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskFolderId Folder ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskFolderId() {
        return this.TaskFolderId;
    }

    /**
     * Set Folder ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskFolderId Folder ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskFolderId(String TaskFolderId) {
        this.TaskFolderId = TaskFolderId;
    }

    /**
     * Get Absolute path of the folder.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskFolderPath Absolute path of the folder.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskFolderPath() {
        return this.TaskFolderPath;
    }

    /**
     * Set Absolute path of the folder.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskFolderPath Absolute path of the folder.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskFolderPath(String TaskFolderPath) {
        this.TaskFolderPath = TaskFolderPath;
    }

    /**
     * Get Creator ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateUserUin Creator ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set Creator ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateUserUin Creator ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get Parent folder absolute path.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParentTaskFolderPath Parent folder absolute path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParentTaskFolderPath() {
        return this.ParentTaskFolderPath;
    }

    /**
     * Set Parent folder absolute path.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParentTaskFolderPath Parent folder absolute path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParentTaskFolderPath(String ParentTaskFolderPath) {
        this.ParentTaskFolderPath = ParentTaskFolderPath;
    }

    /**
     * Get Folder name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskFolderName Folder name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskFolderName() {
        return this.TaskFolderName;
    }

    /**
     * Set Folder name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskFolderName Folder name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskFolderName(String TaskFolderName) {
        this.TaskFolderName = TaskFolderName;
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
     * Get Task folder type.

| task folder type parameter | task folder type interface corresponding name |.
| ---------------- | ------------------------ |
ETL | integration task.
| EMR              | EMR                      |
| DLC              | DLC                      |
| SETATS           | SETATS                   |
| TDSQL            | TDSQL                    |
| TCHOUSE          | TCHOUSE                  |
COMMON.
TI_ONE | ti-one machine learning.
ACROSS_WORKFLOWS | cross-workflow.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskFolderType Task folder type.

| task folder type parameter | task folder type interface corresponding name |.
| ---------------- | ------------------------ |
ETL | integration task.
| EMR              | EMR                      |
| DLC              | DLC                      |
| SETATS           | SETATS                   |
| TDSQL            | TDSQL                    |
| TCHOUSE          | TCHOUSE                  |
COMMON.
TI_ONE | ti-one machine learning.
ACROSS_WORKFLOWS | cross-workflow.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskFolderType() {
        return this.TaskFolderType;
    }

    /**
     * Set Task folder type.

| task folder type parameter | task folder type interface corresponding name |.
| ---------------- | ------------------------ |
ETL | integration task.
| EMR              | EMR                      |
| DLC              | DLC                      |
| SETATS           | SETATS                   |
| TDSQL            | TDSQL                    |
| TCHOUSE          | TCHOUSE                  |
COMMON.
TI_ONE | ti-one machine learning.
ACROSS_WORKFLOWS | cross-workflow.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskFolderType Task folder type.

| task folder type parameter | task folder type interface corresponding name |.
| ---------------- | ------------------------ |
ETL | integration task.
| EMR              | EMR                      |
| DLC              | DLC                      |
| SETATS           | SETATS                   |
| TDSQL            | TDSQL                    |
| TCHOUSE          | TCHOUSE                  |
COMMON.
TI_ONE | ti-one machine learning.
ACROSS_WORKFLOWS | cross-workflow.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskFolderType(String TaskFolderType) {
        this.TaskFolderType = TaskFolderType;
    }

    public TaskFolderDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskFolderDetail(TaskFolderDetail source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskFolderId != null) {
            this.TaskFolderId = new String(source.TaskFolderId);
        }
        if (source.TaskFolderPath != null) {
            this.TaskFolderPath = new String(source.TaskFolderPath);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.ParentTaskFolderPath != null) {
            this.ParentTaskFolderPath = new String(source.ParentTaskFolderPath);
        }
        if (source.TaskFolderName != null) {
            this.TaskFolderName = new String(source.TaskFolderName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.TaskFolderType != null) {
            this.TaskFolderType = new String(source.TaskFolderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskFolderId", this.TaskFolderId);
        this.setParamSimple(map, prefix + "TaskFolderPath", this.TaskFolderPath);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "ParentTaskFolderPath", this.ParentTaskFolderPath);
        this.setParamSimple(map, prefix + "TaskFolderName", this.TaskFolderName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "TaskFolderType", this.TaskFolderType);

    }
}

