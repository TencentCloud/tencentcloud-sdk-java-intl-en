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

public class TaskResponseInfo extends AbstractModel {

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
    * The compute time in ms.
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
    * The task status. Valid values: `0` (initializing), `1` (executing), `2` (executed), `3` (writing data), `4` (queuing), `-1` (failed), and `-3` (canceled).
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
    * Note: This field may return null, indicating that no valid values can be obtained.
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
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProgressDetail")
    @Expose
    private String ProgressDetail;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InputConf")
    @Expose
    private String InputConf;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataNumber")
    @Expose
    private Long DataNumber;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CanDownload")
    @Expose
    private Boolean CanDownload;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SparkJobName")
    @Expose
    private String SparkJobName;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SparkJobId")
    @Expose
    private String SparkJobId;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SparkJobFile")
    @Expose
    private String SparkJobFile;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UiUrl")
    @Expose
    private String UiUrl;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalTime")
    @Expose
    private Long TotalTime;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CmdArgs")
    @Expose
    private String CmdArgs;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DriverSize")
    @Expose
    private String DriverSize;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutorSize")
    @Expose
    private String ExecutorSize;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutorNums")
    @Expose
    private Long ExecutorNums;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutorMaxNumbers")
    @Expose
    private Long ExecutorMaxNumbers;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CommonMetrics")
    @Expose
    private CommonMetrics CommonMetrics;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SparkMonitorMetrics")
    @Expose
    private SparkMonitorMetrics SparkMonitorMetrics;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrestoMonitorMetrics")
    @Expose
    private PrestoMonitorMetrics PrestoMonitorMetrics;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResultFormat")
    @Expose
    private String ResultFormat;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineTypeDetail")
    @Expose
    private String EngineTypeDetail;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

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
     * Get The compute time in ms. 
     * @return UsedTime The compute time in ms.
     */
    public Long getUsedTime() {
        return this.UsedTime;
    }

    /**
     * Set The compute time in ms.
     * @param UsedTime The compute time in ms.
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
     * Get The task status. Valid values: `0` (initializing), `1` (executing), `2` (executed), `3` (writing data), `4` (queuing), `-1` (failed), and `-3` (canceled). 
     * @return State The task status. Valid values: `0` (initializing), `1` (executing), `2` (executed), `3` (writing data), `4` (queuing), `-1` (failed), and `-3` (canceled).
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set The task status. Valid values: `0` (initializing), `1` (executing), `2` (executed), `3` (writing data), `4` (queuing), `-1` (failed), and `-3` (canceled).
     * @param State The task status. Valid values: `0` (initializing), `1` (executing), `2` (executed), `3` (writing data), `4` (queuing), `-1` (failed), and `-3` (canceled).
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
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataSet Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataSet() {
        return this.DataSet;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataSet Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProgressDetail Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProgressDetail() {
        return this.ProgressDetail;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProgressDetail Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProgressDetail(String ProgressDetail) {
        this.ProgressDetail = ProgressDetail;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataEngineId Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataEngineId Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OperateUin Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param OperateUin Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataEngineName Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataEngineName Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InputType Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param InputType Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InputConf Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInputConf() {
        return this.InputConf;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param InputConf Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInputConf(String InputConf) {
        this.InputConf = InputConf;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataNumber Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDataNumber() {
        return this.DataNumber;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataNumber Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataNumber(Long DataNumber) {
        this.DataNumber = DataNumber;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CanDownload Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getCanDownload() {
        return this.CanDownload;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param CanDownload Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCanDownload(Boolean CanDownload) {
        this.CanDownload = CanDownload;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserAlias Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserAlias Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SparkJobName Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSparkJobName() {
        return this.SparkJobName;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param SparkJobName Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSparkJobName(String SparkJobName) {
        this.SparkJobName = SparkJobName;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SparkJobId Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSparkJobId() {
        return this.SparkJobId;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param SparkJobId Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSparkJobId(String SparkJobId) {
        this.SparkJobId = SparkJobId;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SparkJobFile Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSparkJobFile() {
        return this.SparkJobFile;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param SparkJobFile Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSparkJobFile(String SparkJobFile) {
        this.SparkJobFile = SparkJobFile;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UiUrl Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUiUrl() {
        return this.UiUrl;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param UiUrl Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUiUrl(String UiUrl) {
        this.UiUrl = UiUrl;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalTime Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalTime() {
        return this.TotalTime;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalTime Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalTime(Long TotalTime) {
        this.TotalTime = TotalTime;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CmdArgs Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCmdArgs() {
        return this.CmdArgs;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param CmdArgs Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCmdArgs(String CmdArgs) {
        this.CmdArgs = CmdArgs;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageVersion Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageVersion Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DriverSize Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDriverSize() {
        return this.DriverSize;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param DriverSize Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDriverSize(String DriverSize) {
        this.DriverSize = DriverSize;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutorSize Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutorSize() {
        return this.ExecutorSize;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutorSize Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutorSize(String ExecutorSize) {
        this.ExecutorSize = ExecutorSize;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutorNums Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getExecutorNums() {
        return this.ExecutorNums;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutorNums Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutorNums(Long ExecutorNums) {
        this.ExecutorNums = ExecutorNums;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutorMaxNumbers Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getExecutorMaxNumbers() {
        return this.ExecutorMaxNumbers;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutorMaxNumbers Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutorMaxNumbers(Long ExecutorMaxNumbers) {
        this.ExecutorMaxNumbers = ExecutorMaxNumbers;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CommonMetrics Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CommonMetrics getCommonMetrics() {
        return this.CommonMetrics;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param CommonMetrics Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCommonMetrics(CommonMetrics CommonMetrics) {
        this.CommonMetrics = CommonMetrics;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SparkMonitorMetrics Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SparkMonitorMetrics getSparkMonitorMetrics() {
        return this.SparkMonitorMetrics;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param SparkMonitorMetrics Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSparkMonitorMetrics(SparkMonitorMetrics SparkMonitorMetrics) {
        this.SparkMonitorMetrics = SparkMonitorMetrics;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrestoMonitorMetrics Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrestoMonitorMetrics getPrestoMonitorMetrics() {
        return this.PrestoMonitorMetrics;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrestoMonitorMetrics Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrestoMonitorMetrics(PrestoMonitorMetrics PrestoMonitorMetrics) {
        this.PrestoMonitorMetrics = PrestoMonitorMetrics;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResultFormat Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResultFormat() {
        return this.ResultFormat;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResultFormat Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResultFormat(String ResultFormat) {
        this.ResultFormat = ResultFormat;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineTypeDetail Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEngineTypeDetail() {
        return this.EngineTypeDetail;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineTypeDetail Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineTypeDetail(String EngineTypeDetail) {
        this.EngineTypeDetail = EngineTypeDetail;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceGroupName Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceGroupName Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
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
        if (source.TotalTime != null) {
            this.TotalTime = new Long(source.TotalTime);
        }
        if (source.CmdArgs != null) {
            this.CmdArgs = new String(source.CmdArgs);
        }
        if (source.ImageVersion != null) {
            this.ImageVersion = new String(source.ImageVersion);
        }
        if (source.DriverSize != null) {
            this.DriverSize = new String(source.DriverSize);
        }
        if (source.ExecutorSize != null) {
            this.ExecutorSize = new String(source.ExecutorSize);
        }
        if (source.ExecutorNums != null) {
            this.ExecutorNums = new Long(source.ExecutorNums);
        }
        if (source.ExecutorMaxNumbers != null) {
            this.ExecutorMaxNumbers = new Long(source.ExecutorMaxNumbers);
        }
        if (source.CommonMetrics != null) {
            this.CommonMetrics = new CommonMetrics(source.CommonMetrics);
        }
        if (source.SparkMonitorMetrics != null) {
            this.SparkMonitorMetrics = new SparkMonitorMetrics(source.SparkMonitorMetrics);
        }
        if (source.PrestoMonitorMetrics != null) {
            this.PrestoMonitorMetrics = new PrestoMonitorMetrics(source.PrestoMonitorMetrics);
        }
        if (source.ResultFormat != null) {
            this.ResultFormat = new String(source.ResultFormat);
        }
        if (source.EngineTypeDetail != null) {
            this.EngineTypeDetail = new String(source.EngineTypeDetail);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
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
        this.setParamSimple(map, prefix + "TotalTime", this.TotalTime);
        this.setParamSimple(map, prefix + "CmdArgs", this.CmdArgs);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "DriverSize", this.DriverSize);
        this.setParamSimple(map, prefix + "ExecutorSize", this.ExecutorSize);
        this.setParamSimple(map, prefix + "ExecutorNums", this.ExecutorNums);
        this.setParamSimple(map, prefix + "ExecutorMaxNumbers", this.ExecutorMaxNumbers);
        this.setParamObj(map, prefix + "CommonMetrics.", this.CommonMetrics);
        this.setParamObj(map, prefix + "SparkMonitorMetrics.", this.SparkMonitorMetrics);
        this.setParamObj(map, prefix + "PrestoMonitorMetrics.", this.PrestoMonitorMetrics);
        this.setParamSimple(map, prefix + "ResultFormat", this.ResultFormat);
        this.setParamSimple(map, prefix + "EngineTypeDetail", this.EngineTypeDetail);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);

    }
}

