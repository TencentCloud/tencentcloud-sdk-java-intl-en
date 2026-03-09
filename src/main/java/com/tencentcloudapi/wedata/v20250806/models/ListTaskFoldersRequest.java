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

public class ListTaskFoldersRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Absolute path of the parent folder, such as /abc/de. if it is the root directory, pass /.
    */
    @SerializedName("ParentTaskFolderPath")
    @Expose
    private String ParentTaskFolderPath;

    /**
    * Workflow ID.
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
GENERAL.
TI_ONE | ti-one machine learning.
ACROSS_WORKFLOWS | cross-workflow.


    */
    @SerializedName("TaskFolderType")
    @Expose
    private String TaskFolderType;

    /**
    * Number of data pages, equal to or greater than 1. default is 1.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of data records displayed per page. minimum value is 10. maximum value is 200. default value is 10.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

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
     * Get Absolute path of the parent folder, such as /abc/de. if it is the root directory, pass /. 
     * @return ParentTaskFolderPath Absolute path of the parent folder, such as /abc/de. if it is the root directory, pass /.
     */
    public String getParentTaskFolderPath() {
        return this.ParentTaskFolderPath;
    }

    /**
     * Set Absolute path of the parent folder, such as /abc/de. if it is the root directory, pass /.
     * @param ParentTaskFolderPath Absolute path of the parent folder, such as /abc/de. if it is the root directory, pass /.
     */
    public void setParentTaskFolderPath(String ParentTaskFolderPath) {
        this.ParentTaskFolderPath = ParentTaskFolderPath;
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
     * Get Task folder type.

| task folder type parameter | task folder type interface corresponding name |.
| ---------------- | ------------------------ |
ETL | integration task.
| EMR              | EMR                      |
| DLC              | DLC                      |
| SETATS           | SETATS                   |
| TDSQL            | TDSQL                    |
| TCHOUSE          | TCHOUSE                  |
GENERAL.
TI_ONE | ti-one machine learning.
ACROSS_WORKFLOWS | cross-workflow.

 
     * @return TaskFolderType Task folder type.

| task folder type parameter | task folder type interface corresponding name |.
| ---------------- | ------------------------ |
ETL | integration task.
| EMR              | EMR                      |
| DLC              | DLC                      |
| SETATS           | SETATS                   |
| TDSQL            | TDSQL                    |
| TCHOUSE          | TCHOUSE                  |
GENERAL.
TI_ONE | ti-one machine learning.
ACROSS_WORKFLOWS | cross-workflow.


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
GENERAL.
TI_ONE | ti-one machine learning.
ACROSS_WORKFLOWS | cross-workflow.


     * @param TaskFolderType Task folder type.

| task folder type parameter | task folder type interface corresponding name |.
| ---------------- | ------------------------ |
ETL | integration task.
| EMR              | EMR                      |
| DLC              | DLC                      |
| SETATS           | SETATS                   |
| TDSQL            | TDSQL                    |
| TCHOUSE          | TCHOUSE                  |
GENERAL.
TI_ONE | ti-one machine learning.
ACROSS_WORKFLOWS | cross-workflow.


     */
    public void setTaskFolderType(String TaskFolderType) {
        this.TaskFolderType = TaskFolderType;
    }

    /**
     * Get Number of data pages, equal to or greater than 1. default is 1. 
     * @return PageNumber Number of data pages, equal to or greater than 1. default is 1.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Number of data pages, equal to or greater than 1. default is 1.
     * @param PageNumber Number of data pages, equal to or greater than 1. default is 1.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of data records displayed per page. minimum value is 10. maximum value is 200. default value is 10. 
     * @return PageSize Number of data records displayed per page. minimum value is 10. maximum value is 200. default value is 10.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of data records displayed per page. minimum value is 10. maximum value is 200. default value is 10.
     * @param PageSize Number of data records displayed per page. minimum value is 10. maximum value is 200. default value is 10.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListTaskFoldersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTaskFoldersRequest(ListTaskFoldersRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ParentTaskFolderPath != null) {
            this.ParentTaskFolderPath = new String(source.ParentTaskFolderPath);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.TaskFolderType != null) {
            this.TaskFolderType = new String(source.TaskFolderType);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ParentTaskFolderPath", this.ParentTaskFolderPath);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "TaskFolderType", this.TaskFolderType);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

