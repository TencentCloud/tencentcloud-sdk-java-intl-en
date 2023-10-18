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

public class TasksInfo extends AbstractModel {

    /**
    * Task type. Valid values: `SQLTask` (SQL query task), `SparkSQLTask` (Spark SQL query task).
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Fault tolerance policy. `Proceed`: continues to execute subsequent tasks after the current task fails or is canceled. `Terminate`: terminates the execution of subsequent tasks after the current task fails or is canceled, and marks all subsequent tasks as canceled.
    */
    @SerializedName("FailureTolerance")
    @Expose
    private String FailureTolerance;

    /**
    * Base64-encrypted SQL statements separated by ";". Up to 50 tasks can be submitted at a time, and they will be executed strictly in sequence.
    */
    @SerializedName("SQL")
    @Expose
    private String SQL;

    /**
    * Configuration information of the task. Currently, only `SparkSQLTask` tasks are supported.
    */
    @SerializedName("Config")
    @Expose
    private KVPair [] Config;

    /**
    * User-defined parameters of the task
    */
    @SerializedName("Params")
    @Expose
    private KVPair [] Params;

    /**
     * Get Task type. Valid values: `SQLTask` (SQL query task), `SparkSQLTask` (Spark SQL query task). 
     * @return TaskType Task type. Valid values: `SQLTask` (SQL query task), `SparkSQLTask` (Spark SQL query task).
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type. Valid values: `SQLTask` (SQL query task), `SparkSQLTask` (Spark SQL query task).
     * @param TaskType Task type. Valid values: `SQLTask` (SQL query task), `SparkSQLTask` (Spark SQL query task).
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Fault tolerance policy. `Proceed`: continues to execute subsequent tasks after the current task fails or is canceled. `Terminate`: terminates the execution of subsequent tasks after the current task fails or is canceled, and marks all subsequent tasks as canceled. 
     * @return FailureTolerance Fault tolerance policy. `Proceed`: continues to execute subsequent tasks after the current task fails or is canceled. `Terminate`: terminates the execution of subsequent tasks after the current task fails or is canceled, and marks all subsequent tasks as canceled.
     */
    public String getFailureTolerance() {
        return this.FailureTolerance;
    }

    /**
     * Set Fault tolerance policy. `Proceed`: continues to execute subsequent tasks after the current task fails or is canceled. `Terminate`: terminates the execution of subsequent tasks after the current task fails or is canceled, and marks all subsequent tasks as canceled.
     * @param FailureTolerance Fault tolerance policy. `Proceed`: continues to execute subsequent tasks after the current task fails or is canceled. `Terminate`: terminates the execution of subsequent tasks after the current task fails or is canceled, and marks all subsequent tasks as canceled.
     */
    public void setFailureTolerance(String FailureTolerance) {
        this.FailureTolerance = FailureTolerance;
    }

    /**
     * Get Base64-encrypted SQL statements separated by ";". Up to 50 tasks can be submitted at a time, and they will be executed strictly in sequence. 
     * @return SQL Base64-encrypted SQL statements separated by ";". Up to 50 tasks can be submitted at a time, and they will be executed strictly in sequence.
     */
    public String getSQL() {
        return this.SQL;
    }

    /**
     * Set Base64-encrypted SQL statements separated by ";". Up to 50 tasks can be submitted at a time, and they will be executed strictly in sequence.
     * @param SQL Base64-encrypted SQL statements separated by ";". Up to 50 tasks can be submitted at a time, and they will be executed strictly in sequence.
     */
    public void setSQL(String SQL) {
        this.SQL = SQL;
    }

    /**
     * Get Configuration information of the task. Currently, only `SparkSQLTask` tasks are supported. 
     * @return Config Configuration information of the task. Currently, only `SparkSQLTask` tasks are supported.
     */
    public KVPair [] getConfig() {
        return this.Config;
    }

    /**
     * Set Configuration information of the task. Currently, only `SparkSQLTask` tasks are supported.
     * @param Config Configuration information of the task. Currently, only `SparkSQLTask` tasks are supported.
     */
    public void setConfig(KVPair [] Config) {
        this.Config = Config;
    }

    /**
     * Get User-defined parameters of the task 
     * @return Params User-defined parameters of the task
     */
    public KVPair [] getParams() {
        return this.Params;
    }

    /**
     * Set User-defined parameters of the task
     * @param Params User-defined parameters of the task
     */
    public void setParams(KVPair [] Params) {
        this.Params = Params;
    }

    public TasksInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TasksInfo(TasksInfo source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.FailureTolerance != null) {
            this.FailureTolerance = new String(source.FailureTolerance);
        }
        if (source.SQL != null) {
            this.SQL = new String(source.SQL);
        }
        if (source.Config != null) {
            this.Config = new KVPair[source.Config.length];
            for (int i = 0; i < source.Config.length; i++) {
                this.Config[i] = new KVPair(source.Config[i]);
            }
        }
        if (source.Params != null) {
            this.Params = new KVPair[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new KVPair(source.Params[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "FailureTolerance", this.FailureTolerance);
        this.setParamSimple(map, prefix + "SQL", this.SQL);
        this.setParamArrayObj(map, prefix + "Config.", this.Config);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);

    }
}

