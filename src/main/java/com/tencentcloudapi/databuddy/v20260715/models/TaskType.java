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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskType extends AbstractModel {

    /**
    * <p>Task type: SQL: for executing SQL queries and data processing operations; DATA_INTEGRATION: for offline data access operations; NOTEBOOK: used to run Notebook scripts; RUN_WORKFLOW: for executing nested workflows; PYTHON: used to run Python scripts; RAY_JOB: used to run Ray jobs; DATA_QUALITY: for data quality monitoring; IF_ELSE: for conditional branch judgment; FOR_EACH: for loop traversal execution;</p>
    */
    @SerializedName("TaskTypeName")
    @Expose
    private String TaskTypeName;

    /**
    * <p>Notebook type extended information</p>
    */
    @SerializedName("Notebook")
    @Expose
    private TaskTypeNotebookExt Notebook;

    /**
    * <p>List of task extended attributes. For details, see the description of TaskType.TaskPropertyList.</p>
    */
    @SerializedName("TaskTypePropertyList")
    @Expose
    private TaskTypeProperty [] TaskTypePropertyList;

    /**
    * <p>Runtime attribute list. For specific values, fill in reference to the TaskType.RuntimePropertyList description</p>
    */
    @SerializedName("RuntimePropertyList")
    @Expose
    private TaskTypeProperty [] RuntimePropertyList;

    /**
     * Get <p>Task type: SQL: for executing SQL queries and data processing operations; DATA_INTEGRATION: for offline data access operations; NOTEBOOK: used to run Notebook scripts; RUN_WORKFLOW: for executing nested workflows; PYTHON: used to run Python scripts; RAY_JOB: used to run Ray jobs; DATA_QUALITY: for data quality monitoring; IF_ELSE: for conditional branch judgment; FOR_EACH: for loop traversal execution;</p> 
     * @return TaskTypeName <p>Task type: SQL: for executing SQL queries and data processing operations; DATA_INTEGRATION: for offline data access operations; NOTEBOOK: used to run Notebook scripts; RUN_WORKFLOW: for executing nested workflows; PYTHON: used to run Python scripts; RAY_JOB: used to run Ray jobs; DATA_QUALITY: for data quality monitoring; IF_ELSE: for conditional branch judgment; FOR_EACH: for loop traversal execution;</p>
     */
    public String getTaskTypeName() {
        return this.TaskTypeName;
    }

    /**
     * Set <p>Task type: SQL: for executing SQL queries and data processing operations; DATA_INTEGRATION: for offline data access operations; NOTEBOOK: used to run Notebook scripts; RUN_WORKFLOW: for executing nested workflows; PYTHON: used to run Python scripts; RAY_JOB: used to run Ray jobs; DATA_QUALITY: for data quality monitoring; IF_ELSE: for conditional branch judgment; FOR_EACH: for loop traversal execution;</p>
     * @param TaskTypeName <p>Task type: SQL: for executing SQL queries and data processing operations; DATA_INTEGRATION: for offline data access operations; NOTEBOOK: used to run Notebook scripts; RUN_WORKFLOW: for executing nested workflows; PYTHON: used to run Python scripts; RAY_JOB: used to run Ray jobs; DATA_QUALITY: for data quality monitoring; IF_ELSE: for conditional branch judgment; FOR_EACH: for loop traversal execution;</p>
     */
    public void setTaskTypeName(String TaskTypeName) {
        this.TaskTypeName = TaskTypeName;
    }

    /**
     * Get <p>Notebook type extended information</p> 
     * @return Notebook <p>Notebook type extended information</p>
     * @deprecated
     */
    @Deprecated
    public TaskTypeNotebookExt getNotebook() {
        return this.Notebook;
    }

    /**
     * Set <p>Notebook type extended information</p>
     * @param Notebook <p>Notebook type extended information</p>
     * @deprecated
     */
    @Deprecated
    public void setNotebook(TaskTypeNotebookExt Notebook) {
        this.Notebook = Notebook;
    }

    /**
     * Get <p>List of task extended attributes. For details, see the description of TaskType.TaskPropertyList.</p> 
     * @return TaskTypePropertyList <p>List of task extended attributes. For details, see the description of TaskType.TaskPropertyList.</p>
     */
    public TaskTypeProperty [] getTaskTypePropertyList() {
        return this.TaskTypePropertyList;
    }

    /**
     * Set <p>List of task extended attributes. For details, see the description of TaskType.TaskPropertyList.</p>
     * @param TaskTypePropertyList <p>List of task extended attributes. For details, see the description of TaskType.TaskPropertyList.</p>
     */
    public void setTaskTypePropertyList(TaskTypeProperty [] TaskTypePropertyList) {
        this.TaskTypePropertyList = TaskTypePropertyList;
    }

    /**
     * Get <p>Runtime attribute list. For specific values, fill in reference to the TaskType.RuntimePropertyList description</p> 
     * @return RuntimePropertyList <p>Runtime attribute list. For specific values, fill in reference to the TaskType.RuntimePropertyList description</p>
     */
    public TaskTypeProperty [] getRuntimePropertyList() {
        return this.RuntimePropertyList;
    }

    /**
     * Set <p>Runtime attribute list. For specific values, fill in reference to the TaskType.RuntimePropertyList description</p>
     * @param RuntimePropertyList <p>Runtime attribute list. For specific values, fill in reference to the TaskType.RuntimePropertyList description</p>
     */
    public void setRuntimePropertyList(TaskTypeProperty [] RuntimePropertyList) {
        this.RuntimePropertyList = RuntimePropertyList;
    }

    public TaskType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskType(TaskType source) {
        if (source.TaskTypeName != null) {
            this.TaskTypeName = new String(source.TaskTypeName);
        }
        if (source.Notebook != null) {
            this.Notebook = new TaskTypeNotebookExt(source.Notebook);
        }
        if (source.TaskTypePropertyList != null) {
            this.TaskTypePropertyList = new TaskTypeProperty[source.TaskTypePropertyList.length];
            for (int i = 0; i < source.TaskTypePropertyList.length; i++) {
                this.TaskTypePropertyList[i] = new TaskTypeProperty(source.TaskTypePropertyList[i]);
            }
        }
        if (source.RuntimePropertyList != null) {
            this.RuntimePropertyList = new TaskTypeProperty[source.RuntimePropertyList.length];
            for (int i = 0; i < source.RuntimePropertyList.length; i++) {
                this.RuntimePropertyList[i] = new TaskTypeProperty(source.RuntimePropertyList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskTypeName", this.TaskTypeName);
        this.setParamObj(map, prefix + "Notebook.", this.Notebook);
        this.setParamArrayObj(map, prefix + "TaskTypePropertyList.", this.TaskTypePropertyList);
        this.setParamArrayObj(map, prefix + "RuntimePropertyList.", this.RuntimePropertyList);

    }
}

