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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskResponseInfo extends AbstractModel{

    /**
    * Database name of the task
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Data volume of the task
    */
    @SerializedName("DataAmount")
    @Expose
    private Long DataAmount;

    /**
    * Task ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Computing time in ms
    */
    @SerializedName("UsedTime")
    @Expose
    private Long UsedTime;

    /**
    * Task output path
    */
    @SerializedName("OutputPath")
    @Expose
    private String OutputPath;

    /**
    * Task creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Task status. Valid values: `0` (initial), `1` (executing), `2` (executed successfully), `-1` (failed to execute), `-3` (canceled).
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * SQL statement type of the task, such as DDL and DML.
    */
    @SerializedName("SQLType")
    @Expose
    private String SQLType;

    /**
    * SQL statement of the task
    */
    @SerializedName("SQL")
    @Expose
    private String SQL;

    /**
    * Whether the result has expired
    */
    @SerializedName("ResultExpired")
    @Expose
    private Boolean ResultExpired;

    /**
    * Number of affected data rows
    */
    @SerializedName("RowAffectInfo")
    @Expose
    private String RowAffectInfo;

    /**
    * Dataset of task results
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataSet")
    @Expose
    private String DataSet;

    /**
    * Failure information, such as `errorMessage`. This field has been disused.
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
    * Task progress (%)
    */
    @SerializedName("Percentage")
    @Expose
    private Long Percentage;

    /**
    * Output information of task execution
    */
    @SerializedName("OutputMessage")
    @Expose
    private String OutputMessage;

    /**
    * Type of the engine executing the SQL statement
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Task progress details
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProgressDetail")
    @Expose
    private String ProgressDetail;

    /**
    * Task end time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Compute resource ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * Sub-UIN that executes the SQL statement
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * Compute resource name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * Whether the import type is local import or COS
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * Import configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InputConf")
    @Expose
    private String InputConf;

    /**
    * Number of data entries
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataNumber")
    @Expose
    private Long DataNumber;

    /**
    * Whether the data can be downloaded
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CanDownload")
    @Expose
    private Boolean CanDownload;

    /**
    * User alias
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
    * Spark application job name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SparkJobName")
    @Expose
    private String SparkJobName;

    /**
    * Spark application job ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SparkJobId")
    @Expose
    private String SparkJobId;

    /**
    * JAR file of the Spark application entry
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SparkJobFile")
    @Expose
    private String SparkJobFile;

    /**
    * Spark UI URL
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UiUrl")
    @Expose
    private String UiUrl;

    /**
     * Get Database name of the task 
     * @return DatabaseName Database name of the task
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database name of the task
     * @param DatabaseName Database name of the task
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Data volume of the task 
     * @return DataAmount Data volume of the task
     */
    public Long getDataAmount() {
        return this.DataAmount;
    }

    /**
     * Set Data volume of the task
     * @param DataAmount Data volume of the task
     */
    public void setDataAmount(Long DataAmount) {
        this.DataAmount = DataAmount;
    }

    /**
     * Get Task ID 
     * @return Id Task ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Task ID
     * @param Id Task ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Computing time in ms 
     * @return UsedTime Computing time in ms
     */
    public Long getUsedTime() {
        return this.UsedTime;
    }

    /**
     * Set Computing time in ms
     * @param UsedTime Computing time in ms
     */
    public void setUsedTime(Long UsedTime) {
        this.UsedTime = UsedTime;
    }

    /**
     * Get Task output path 
     * @return OutputPath Task output path
     */
    public String getOutputPath() {
        return this.OutputPath;
    }

    /**
     * Set Task output path
     * @param OutputPath Task output path
     */
    public void setOutputPath(String OutputPath) {
        this.OutputPath = OutputPath;
    }

    /**
     * Get Task creation time 
     * @return CreateTime Task creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation time
     * @param CreateTime Task creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task status. Valid values: `0` (initial), `1` (executing), `2` (executed successfully), `-1` (failed to execute), `-3` (canceled). 
     * @return State Task status. Valid values: `0` (initial), `1` (executing), `2` (executed successfully), `-1` (failed to execute), `-3` (canceled).
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set Task status. Valid values: `0` (initial), `1` (executing), `2` (executed successfully), `-1` (failed to execute), `-3` (canceled).
     * @param State Task status. Valid values: `0` (initial), `1` (executing), `2` (executed successfully), `-1` (failed to execute), `-3` (canceled).
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get SQL statement type of the task, such as DDL and DML. 
     * @return SQLType SQL statement type of the task, such as DDL and DML.
     */
    public String getSQLType() {
        return this.SQLType;
    }

    /**
     * Set SQL statement type of the task, such as DDL and DML.
     * @param SQLType SQL statement type of the task, such as DDL and DML.
     */
    public void setSQLType(String SQLType) {
        this.SQLType = SQLType;
    }

    /**
     * Get SQL statement of the task 
     * @return SQL SQL statement of the task
     */
    public String getSQL() {
        return this.SQL;
    }

    /**
     * Set SQL statement of the task
     * @param SQL SQL statement of the task
     */
    public void setSQL(String SQL) {
        this.SQL = SQL;
    }

    /**
     * Get Whether the result has expired 
     * @return ResultExpired Whether the result has expired
     */
    public Boolean getResultExpired() {
        return this.ResultExpired;
    }

    /**
     * Set Whether the result has expired
     * @param ResultExpired Whether the result has expired
     */
    public void setResultExpired(Boolean ResultExpired) {
        this.ResultExpired = ResultExpired;
    }

    /**
     * Get Number of affected data rows 
     * @return RowAffectInfo Number of affected data rows
     */
    public String getRowAffectInfo() {
        return this.RowAffectInfo;
    }

    /**
     * Set Number of affected data rows
     * @param RowAffectInfo Number of affected data rows
     */
    public void setRowAffectInfo(String RowAffectInfo) {
        this.RowAffectInfo = RowAffectInfo;
    }

    /**
     * Get Dataset of task results
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataSet Dataset of task results
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataSet() {
        return this.DataSet;
    }

    /**
     * Set Dataset of task results
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataSet Dataset of task results
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataSet(String DataSet) {
        this.DataSet = DataSet;
    }

    /**
     * Get Failure information, such as `errorMessage`. This field has been disused. 
     * @return Error Failure information, such as `errorMessage`. This field has been disused.
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set Failure information, such as `errorMessage`. This field has been disused.
     * @param Error Failure information, such as `errorMessage`. This field has been disused.
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    /**
     * Get Task progress (%) 
     * @return Percentage Task progress (%)
     */
    public Long getPercentage() {
        return this.Percentage;
    }

    /**
     * Set Task progress (%)
     * @param Percentage Task progress (%)
     */
    public void setPercentage(Long Percentage) {
        this.Percentage = Percentage;
    }

    /**
     * Get Output information of task execution 
     * @return OutputMessage Output information of task execution
     */
    public String getOutputMessage() {
        return this.OutputMessage;
    }

    /**
     * Set Output information of task execution
     * @param OutputMessage Output information of task execution
     */
    public void setOutputMessage(String OutputMessage) {
        this.OutputMessage = OutputMessage;
    }

    /**
     * Get Type of the engine executing the SQL statement 
     * @return TaskType Type of the engine executing the SQL statement
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Type of the engine executing the SQL statement
     * @param TaskType Type of the engine executing the SQL statement
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Task progress details
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProgressDetail Task progress details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProgressDetail() {
        return this.ProgressDetail;
    }

    /**
     * Set Task progress details
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProgressDetail Task progress details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProgressDetail(String ProgressDetail) {
        this.ProgressDetail = ProgressDetail;
    }

    /**
     * Get Task end time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Task end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Task end time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Task end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Compute resource ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataEngineId Compute resource ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set Compute resource ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataEngineId Compute resource ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get Sub-UIN that executes the SQL statement
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OperateUin Sub-UIN that executes the SQL statement
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set Sub-UIN that executes the SQL statement
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OperateUin Sub-UIN that executes the SQL statement
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get Compute resource name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataEngineName Compute resource name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set Compute resource name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataEngineName Compute resource name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get Whether the import type is local import or COS
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InputType Whether the import type is local import or COS
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set Whether the import type is local import or COS
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InputType Whether the import type is local import or COS
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get Import configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InputConf Import configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInputConf() {
        return this.InputConf;
    }

    /**
     * Set Import configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InputConf Import configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInputConf(String InputConf) {
        this.InputConf = InputConf;
    }

    /**
     * Get Number of data entries
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataNumber Number of data entries
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDataNumber() {
        return this.DataNumber;
    }

    /**
     * Set Number of data entries
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataNumber Number of data entries
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataNumber(Long DataNumber) {
        this.DataNumber = DataNumber;
    }

    /**
     * Get Whether the data can be downloaded
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CanDownload Whether the data can be downloaded
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getCanDownload() {
        return this.CanDownload;
    }

    /**
     * Set Whether the data can be downloaded
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CanDownload Whether the data can be downloaded
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCanDownload(Boolean CanDownload) {
        this.CanDownload = CanDownload;
    }

    /**
     * Get User alias
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserAlias User alias
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set User alias
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserAlias User alias
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    /**
     * Get Spark application job name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SparkJobName Spark application job name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSparkJobName() {
        return this.SparkJobName;
    }

    /**
     * Set Spark application job name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SparkJobName Spark application job name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSparkJobName(String SparkJobName) {
        this.SparkJobName = SparkJobName;
    }

    /**
     * Get Spark application job ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SparkJobId Spark application job ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSparkJobId() {
        return this.SparkJobId;
    }

    /**
     * Set Spark application job ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SparkJobId Spark application job ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSparkJobId(String SparkJobId) {
        this.SparkJobId = SparkJobId;
    }

    /**
     * Get JAR file of the Spark application entry
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SparkJobFile JAR file of the Spark application entry
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSparkJobFile() {
        return this.SparkJobFile;
    }

    /**
     * Set JAR file of the Spark application entry
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SparkJobFile JAR file of the Spark application entry
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSparkJobFile(String SparkJobFile) {
        this.SparkJobFile = SparkJobFile;
    }

    /**
     * Get Spark UI URL
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UiUrl Spark UI URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUiUrl() {
        return this.UiUrl;
    }

    /**
     * Set Spark UI URL
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UiUrl Spark UI URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUiUrl(String UiUrl) {
        this.UiUrl = UiUrl;
    }

    public TaskResponseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskResponseInfo(TaskResponseInfo source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.DataAmount != null) {
            this.DataAmount = new Long(source.DataAmount);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.UsedTime != null) {
            this.UsedTime = new Long(source.UsedTime);
        }
        if (source.OutputPath != null) {
            this.OutputPath = new String(source.OutputPath);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.SQLType != null) {
            this.SQLType = new String(source.SQLType);
        }
        if (source.SQL != null) {
            this.SQL = new String(source.SQL);
        }
        if (source.ResultExpired != null) {
            this.ResultExpired = new Boolean(source.ResultExpired);
        }
        if (source.RowAffectInfo != null) {
            this.RowAffectInfo = new String(source.RowAffectInfo);
        }
        if (source.DataSet != null) {
            this.DataSet = new String(source.DataSet);
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
        if (source.Percentage != null) {
            this.Percentage = new Long(source.Percentage);
        }
        if (source.OutputMessage != null) {
            this.OutputMessage = new String(source.OutputMessage);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.ProgressDetail != null) {
            this.ProgressDetail = new String(source.ProgressDetail);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String(source.OperateUin);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
        if (source.InputConf != null) {
            this.InputConf = new String(source.InputConf);
        }
        if (source.DataNumber != null) {
            this.DataNumber = new Long(source.DataNumber);
        }
        if (source.CanDownload != null) {
            this.CanDownload = new Boolean(source.CanDownload);
        }
        if (source.UserAlias != null) {
            this.UserAlias = new String(source.UserAlias);
        }
        if (source.SparkJobName != null) {
            this.SparkJobName = new String(source.SparkJobName);
        }
        if (source.SparkJobId != null) {
            this.SparkJobId = new String(source.SparkJobId);
        }
        if (source.SparkJobFile != null) {
            this.SparkJobFile = new String(source.SparkJobFile);
        }
        if (source.UiUrl != null) {
            this.UiUrl = new String(source.UiUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "DataAmount", this.DataAmount);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "UsedTime", this.UsedTime);
        this.setParamSimple(map, prefix + "OutputPath", this.OutputPath);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "SQLType", this.SQLType);
        this.setParamSimple(map, prefix + "SQL", this.SQL);
        this.setParamSimple(map, prefix + "ResultExpired", this.ResultExpired);
        this.setParamSimple(map, prefix + "RowAffectInfo", this.RowAffectInfo);
        this.setParamSimple(map, prefix + "DataSet", this.DataSet);
        this.setParamSimple(map, prefix + "Error", this.Error);
        this.setParamSimple(map, prefix + "Percentage", this.Percentage);
        this.setParamSimple(map, prefix + "OutputMessage", this.OutputMessage);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ProgressDetail", this.ProgressDetail);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "InputConf", this.InputConf);
        this.setParamSimple(map, prefix + "DataNumber", this.DataNumber);
        this.setParamSimple(map, prefix + "CanDownload", this.CanDownload);
        this.setParamSimple(map, prefix + "UserAlias", this.UserAlias);
        this.setParamSimple(map, prefix + "SparkJobName", this.SparkJobName);
        this.setParamSimple(map, prefix + "SparkJobId", this.SparkJobId);
        this.setParamSimple(map, prefix + "SparkJobFile", this.SparkJobFile);
        this.setParamSimple(map, prefix + "UiUrl", this.UiUrl);

    }
}

