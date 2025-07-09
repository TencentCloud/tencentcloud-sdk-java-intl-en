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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTaskRequest extends AbstractModel {

    /**
    * Computing task. This parameter contains the task type and related configuration information.
    */
    @SerializedName("Task")
    @Expose
    private Task Task;

    /**
    * Database name. If there is a database name in the SQL statement, the database in the SQL statement will be used first; otherwise, the database specified by this parameter will be used (note: when submitting the database creation SQL statement, passed in an empty string for this field).
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Name of the default data source
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * Data engine name. If this parameter is not specified, the task will be submitted to the default engine.
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * Standard spark execution task resourceGroupName
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
     * Get Computing task. This parameter contains the task type and related configuration information. 
     * @return Task Computing task. This parameter contains the task type and related configuration information.
     */
    public Task getTask() {
        return this.Task;
    }

    /**
     * Set Computing task. This parameter contains the task type and related configuration information.
     * @param Task Computing task. This parameter contains the task type and related configuration information.
     */
    public void setTask(Task Task) {
        this.Task = Task;
    }

    /**
     * Get Database name. If there is a database name in the SQL statement, the database in the SQL statement will be used first; otherwise, the database specified by this parameter will be used (note: when submitting the database creation SQL statement, passed in an empty string for this field). 
     * @return DatabaseName Database name. If there is a database name in the SQL statement, the database in the SQL statement will be used first; otherwise, the database specified by this parameter will be used (note: when submitting the database creation SQL statement, passed in an empty string for this field).
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database name. If there is a database name in the SQL statement, the database in the SQL statement will be used first; otherwise, the database specified by this parameter will be used (note: when submitting the database creation SQL statement, passed in an empty string for this field).
     * @param DatabaseName Database name. If there is a database name in the SQL statement, the database in the SQL statement will be used first; otherwise, the database specified by this parameter will be used (note: when submitting the database creation SQL statement, passed in an empty string for this field).
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Name of the default data source 
     * @return DatasourceConnectionName Name of the default data source
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set Name of the default data source
     * @param DatasourceConnectionName Name of the default data source
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get Data engine name. If this parameter is not specified, the task will be submitted to the default engine. 
     * @return DataEngineName Data engine name. If this parameter is not specified, the task will be submitted to the default engine.
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set Data engine name. If this parameter is not specified, the task will be submitted to the default engine.
     * @param DataEngineName Data engine name. If this parameter is not specified, the task will be submitted to the default engine.
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get Standard spark execution task resourceGroupName 
     * @return ResourceGroupName Standard spark execution task resourceGroupName
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set Standard spark execution task resourceGroupName
     * @param ResourceGroupName Standard spark execution task resourceGroupName
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    public CreateTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskRequest(CreateTaskRequest source) {
        if (source.Task != null) {
            this.Task = new Task(source.Task);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Task.", this.Task);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);

    }
}

