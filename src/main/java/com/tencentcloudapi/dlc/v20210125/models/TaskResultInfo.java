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

public class TaskResultInfo extends AbstractModel{

    /**
    * Unique task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Name of the default selected data source when the current job is executed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * Name of the default selected database when the current job is executed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * The currently executed SQL statement. Each task contains one SQL statement.
    */
    @SerializedName("SQL")
    @Expose
    private String SQL;

    /**
    * Type of the executed task. Valid values: `DDL`, `DML`, `DQL`.
    */
    @SerializedName("SQLType")
    @Expose
    private String SQLType;

    /**
    * Current status of the task. `0`: initial; `1`: task running; `2`: task execution succeeded; `-1`: task execution failed; `-3`: task terminated manually by the user. The task execution result will be returned only if task execution succeeds.
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * Amount of the data scanned in bytes
    */
    @SerializedName("DataAmount")
    @Expose
    private Long DataAmount;

    /**
    * Task execution time in seconds
    */
    @SerializedName("UsedTime")
    @Expose
    private Long UsedTime;

    /**
    * Address of the COS bucket for storing the task result
    */
    @SerializedName("OutputPath")
    @Expose
    private String OutputPath;

    /**
    * Task creation timestamp
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Task execution information. `success` will be returned if the task succeeds; otherwise, the failure cause will be returned.
    */
    @SerializedName("OutputMessage")
    @Expose
    private String OutputMessage;

    /**
    * Number of affected rows
    */
    @SerializedName("RowAffectInfo")
    @Expose
    private String RowAffectInfo;

    /**
    * Schema information of the result
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResultSchema")
    @Expose
    private Column [] ResultSchema;

    /**
    * Result information. After it is unescaped, each element of the outer array is a data row.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResultSet")
    @Expose
    private String ResultSet;

    /**
    * Pagination information. If there is no more result data, `nextToken` will be empty.
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * Task progress (%)
    */
    @SerializedName("Percentage")
    @Expose
    private Long Percentage;

    /**
    * Task progress details
    */
    @SerializedName("ProgressDetail")
    @Expose
    private String ProgressDetail;

    /**
    * Console display format. Valid values: `table`, `text`.
    */
    @SerializedName("DisplayFormat")
    @Expose
    private String DisplayFormat;

    /**
     * Get Unique task ID 
     * @return TaskId Unique task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Unique task ID
     * @param TaskId Unique task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Name of the default selected data source when the current job is executed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatasourceConnectionName Name of the default selected data source when the current job is executed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set Name of the default selected data source when the current job is executed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatasourceConnectionName Name of the default selected data source when the current job is executed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get Name of the default selected database when the current job is executed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatabaseName Name of the default selected database when the current job is executed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Name of the default selected database when the current job is executed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatabaseName Name of the default selected database when the current job is executed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get The currently executed SQL statement. Each task contains one SQL statement. 
     * @return SQL The currently executed SQL statement. Each task contains one SQL statement.
     */
    public String getSQL() {
        return this.SQL;
    }

    /**
     * Set The currently executed SQL statement. Each task contains one SQL statement.
     * @param SQL The currently executed SQL statement. Each task contains one SQL statement.
     */
    public void setSQL(String SQL) {
        this.SQL = SQL;
    }

    /**
     * Get Type of the executed task. Valid values: `DDL`, `DML`, `DQL`. 
     * @return SQLType Type of the executed task. Valid values: `DDL`, `DML`, `DQL`.
     */
    public String getSQLType() {
        return this.SQLType;
    }

    /**
     * Set Type of the executed task. Valid values: `DDL`, `DML`, `DQL`.
     * @param SQLType Type of the executed task. Valid values: `DDL`, `DML`, `DQL`.
     */
    public void setSQLType(String SQLType) {
        this.SQLType = SQLType;
    }

    /**
     * Get Current status of the task. `0`: initial; `1`: task running; `2`: task execution succeeded; `-1`: task execution failed; `-3`: task terminated manually by the user. The task execution result will be returned only if task execution succeeds. 
     * @return State Current status of the task. `0`: initial; `1`: task running; `2`: task execution succeeded; `-1`: task execution failed; `-3`: task terminated manually by the user. The task execution result will be returned only if task execution succeeds.
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set Current status of the task. `0`: initial; `1`: task running; `2`: task execution succeeded; `-1`: task execution failed; `-3`: task terminated manually by the user. The task execution result will be returned only if task execution succeeds.
     * @param State Current status of the task. `0`: initial; `1`: task running; `2`: task execution succeeded; `-1`: task execution failed; `-3`: task terminated manually by the user. The task execution result will be returned only if task execution succeeds.
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get Amount of the data scanned in bytes 
     * @return DataAmount Amount of the data scanned in bytes
     */
    public Long getDataAmount() {
        return this.DataAmount;
    }

    /**
     * Set Amount of the data scanned in bytes
     * @param DataAmount Amount of the data scanned in bytes
     */
    public void setDataAmount(Long DataAmount) {
        this.DataAmount = DataAmount;
    }

    /**
     * Get Task execution time in seconds 
     * @return UsedTime Task execution time in seconds
     */
    public Long getUsedTime() {
        return this.UsedTime;
    }

    /**
     * Set Task execution time in seconds
     * @param UsedTime Task execution time in seconds
     */
    public void setUsedTime(Long UsedTime) {
        this.UsedTime = UsedTime;
    }

    /**
     * Get Address of the COS bucket for storing the task result 
     * @return OutputPath Address of the COS bucket for storing the task result
     */
    public String getOutputPath() {
        return this.OutputPath;
    }

    /**
     * Set Address of the COS bucket for storing the task result
     * @param OutputPath Address of the COS bucket for storing the task result
     */
    public void setOutputPath(String OutputPath) {
        this.OutputPath = OutputPath;
    }

    /**
     * Get Task creation timestamp 
     * @return CreateTime Task creation timestamp
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation timestamp
     * @param CreateTime Task creation timestamp
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task execution information. `success` will be returned if the task succeeds; otherwise, the failure cause will be returned. 
     * @return OutputMessage Task execution information. `success` will be returned if the task succeeds; otherwise, the failure cause will be returned.
     */
    public String getOutputMessage() {
        return this.OutputMessage;
    }

    /**
     * Set Task execution information. `success` will be returned if the task succeeds; otherwise, the failure cause will be returned.
     * @param OutputMessage Task execution information. `success` will be returned if the task succeeds; otherwise, the failure cause will be returned.
     */
    public void setOutputMessage(String OutputMessage) {
        this.OutputMessage = OutputMessage;
    }

    /**
     * Get Number of affected rows 
     * @return RowAffectInfo Number of affected rows
     */
    public String getRowAffectInfo() {
        return this.RowAffectInfo;
    }

    /**
     * Set Number of affected rows
     * @param RowAffectInfo Number of affected rows
     */
    public void setRowAffectInfo(String RowAffectInfo) {
        this.RowAffectInfo = RowAffectInfo;
    }

    /**
     * Get Schema information of the result
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResultSchema Schema information of the result
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Column [] getResultSchema() {
        return this.ResultSchema;
    }

    /**
     * Set Schema information of the result
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResultSchema Schema information of the result
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResultSchema(Column [] ResultSchema) {
        this.ResultSchema = ResultSchema;
    }

    /**
     * Get Result information. After it is unescaped, each element of the outer array is a data row.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResultSet Result information. After it is unescaped, each element of the outer array is a data row.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResultSet() {
        return this.ResultSet;
    }

    /**
     * Set Result information. After it is unescaped, each element of the outer array is a data row.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResultSet Result information. After it is unescaped, each element of the outer array is a data row.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResultSet(String ResultSet) {
        this.ResultSet = ResultSet;
    }

    /**
     * Get Pagination information. If there is no more result data, `nextToken` will be empty. 
     * @return NextToken Pagination information. If there is no more result data, `nextToken` will be empty.
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Pagination information. If there is no more result data, `nextToken` will be empty.
     * @param NextToken Pagination information. If there is no more result data, `nextToken` will be empty.
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
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
     * Get Task progress details 
     * @return ProgressDetail Task progress details
     */
    public String getProgressDetail() {
        return this.ProgressDetail;
    }

    /**
     * Set Task progress details
     * @param ProgressDetail Task progress details
     */
    public void setProgressDetail(String ProgressDetail) {
        this.ProgressDetail = ProgressDetail;
    }

    /**
     * Get Console display format. Valid values: `table`, `text`. 
     * @return DisplayFormat Console display format. Valid values: `table`, `text`.
     */
    public String getDisplayFormat() {
        return this.DisplayFormat;
    }

    /**
     * Set Console display format. Valid values: `table`, `text`.
     * @param DisplayFormat Console display format. Valid values: `table`, `text`.
     */
    public void setDisplayFormat(String DisplayFormat) {
        this.DisplayFormat = DisplayFormat;
    }

    public TaskResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskResultInfo(TaskResultInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
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
        if (source.DataAmount != null) {
            this.DataAmount = new Long(source.DataAmount);
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
        if (source.OutputMessage != null) {
            this.OutputMessage = new String(source.OutputMessage);
        }
        if (source.RowAffectInfo != null) {
            this.RowAffectInfo = new String(source.RowAffectInfo);
        }
        if (source.ResultSchema != null) {
            this.ResultSchema = new Column[source.ResultSchema.length];
            for (int i = 0; i < source.ResultSchema.length; i++) {
                this.ResultSchema[i] = new Column(source.ResultSchema[i]);
            }
        }
        if (source.ResultSet != null) {
            this.ResultSet = new String(source.ResultSet);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.Percentage != null) {
            this.Percentage = new Long(source.Percentage);
        }
        if (source.ProgressDetail != null) {
            this.ProgressDetail = new String(source.ProgressDetail);
        }
        if (source.DisplayFormat != null) {
            this.DisplayFormat = new String(source.DisplayFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SQL", this.SQL);
        this.setParamSimple(map, prefix + "SQLType", this.SQLType);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "DataAmount", this.DataAmount);
        this.setParamSimple(map, prefix + "UsedTime", this.UsedTime);
        this.setParamSimple(map, prefix + "OutputPath", this.OutputPath);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "OutputMessage", this.OutputMessage);
        this.setParamSimple(map, prefix + "RowAffectInfo", this.RowAffectInfo);
        this.setParamArrayObj(map, prefix + "ResultSchema.", this.ResultSchema);
        this.setParamSimple(map, prefix + "ResultSet", this.ResultSet);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "Percentage", this.Percentage);
        this.setParamSimple(map, prefix + "ProgressDetail", this.ProgressDetail);
        this.setParamSimple(map, prefix + "DisplayFormat", this.DisplayFormat);

    }
}

