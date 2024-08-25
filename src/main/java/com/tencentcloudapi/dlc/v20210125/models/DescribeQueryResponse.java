/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class DescribeQueryResponse extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The SQL being executed currently. A task contains one SQL.
    */
    @SerializedName("SQL")
    @Expose
    private String SQL;

    /**
    * The currently executed task types are divided into DDL, DML, and DQL.
    */
    @SerializedName("SQLType")
    @Expose
    private String SQLType;

    /**
    * The current status of the task is 0: initializing; 1: running; 2: executed; 3: writing data; 4: queuing; -1: task execution failed; -3: manually terminated. The task execution result is returned only when the task is successfully executed.
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * Default data set of query results
    */
    @SerializedName("DataSet")
    @Expose
    private String DataSet;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get The SQL being executed currently. A task contains one SQL. 
     * @return SQL The SQL being executed currently. A task contains one SQL.
     */
    public String getSQL() {
        return this.SQL;
    }

    /**
     * Set The SQL being executed currently. A task contains one SQL.
     * @param SQL The SQL being executed currently. A task contains one SQL.
     */
    public void setSQL(String SQL) {
        this.SQL = SQL;
    }

    /**
     * Get The currently executed task types are divided into DDL, DML, and DQL. 
     * @return SQLType The currently executed task types are divided into DDL, DML, and DQL.
     */
    public String getSQLType() {
        return this.SQLType;
    }

    /**
     * Set The currently executed task types are divided into DDL, DML, and DQL.
     * @param SQLType The currently executed task types are divided into DDL, DML, and DQL.
     */
    public void setSQLType(String SQLType) {
        this.SQLType = SQLType;
    }

    /**
     * Get The current status of the task is 0: initializing; 1: running; 2: executed; 3: writing data; 4: queuing; -1: task execution failed; -3: manually terminated. The task execution result is returned only when the task is successfully executed. 
     * @return State The current status of the task is 0: initializing; 1: running; 2: executed; 3: writing data; 4: queuing; -1: task execution failed; -3: manually terminated. The task execution result is returned only when the task is successfully executed.
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set The current status of the task is 0: initializing; 1: running; 2: executed; 3: writing data; 4: queuing; -1: task execution failed; -3: manually terminated. The task execution result is returned only when the task is successfully executed.
     * @param State The current status of the task is 0: initializing; 1: running; 2: executed; 3: writing data; 4: queuing; -1: task execution failed; -3: manually terminated. The task execution result is returned only when the task is successfully executed.
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get Default data set of query results 
     * @return DataSet Default data set of query results
     */
    public String getDataSet() {
        return this.DataSet;
    }

    /**
     * Set Default data set of query results
     * @param DataSet Default data set of query results
     */
    public void setDataSet(String DataSet) {
        this.DataSet = DataSet;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeQueryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQueryResponse(DescribeQueryResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SQL != null) {
            this.SQL = new String(source.SQL);
        }
        if (source.SQLType != null) {
            this.SQLType = new String(source.SQLType);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.DataSet != null) {
            this.DataSet = new String(source.DataSet);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SQL", this.SQL);
        this.setParamSimple(map, prefix + "SQLType", this.SQLType);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "DataSet", this.DataSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
