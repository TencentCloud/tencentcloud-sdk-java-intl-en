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

public class SparkJobInfo extends AbstractModel {

    /**
    * Spark job ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Spark job name
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Spark job type. Valid values: `1` (batch job), `2` (streaming job).
    */
    @SerializedName("JobType")
    @Expose
    private Long JobType;

    /**
    * Engine name
    */
    @SerializedName("DataEngine")
    @Expose
    private String DataEngine;

    /**
    * This field has been disused. Use the `Datasource` field instead.
    */
    @SerializedName("Eni")
    @Expose
    private String Eni;

    /**
    * Whether the program package is uploaded locally. Valid values: `cos`, `lakefs`.
    */
    @SerializedName("IsLocal")
    @Expose
    private String IsLocal;

    /**
    * Program package path
    */
    @SerializedName("JobFile")
    @Expose
    private String JobFile;

    /**
    * Role ID
    */
    @SerializedName("RoleArn")
    @Expose
    private Long RoleArn;

    /**
    * Main class of Spark job execution
    */
    @SerializedName("MainClass")
    @Expose
    private String MainClass;

    /**
    * Command line parameters of the Spark job separated by space
    */
    @SerializedName("CmdArgs")
    @Expose
    private String CmdArgs;

    /**
    * Native Spark configurations separated by line break
    */
    @SerializedName("JobConf")
    @Expose
    private String JobConf;

    /**
    * Whether the dependency JAR packages are uploaded locally. Valid values: `cos`, `lakefs`.
    */
    @SerializedName("IsLocalJars")
    @Expose
    private String IsLocalJars;

    /**
    * Dependency JAR packages of the Spark job separated by comma
    */
    @SerializedName("JobJars")
    @Expose
    private String JobJars;

    /**
    * Whether the dependency file is uploaded locally. Valid values: `cos`, `lakefs`.
    */
    @SerializedName("IsLocalFiles")
    @Expose
    private String IsLocalFiles;

    /**
    * Dependency files of the Spark job separated by comma
    */
    @SerializedName("JobFiles")
    @Expose
    private String JobFiles;

    /**
    * Driver resource size of the Spark job
    */
    @SerializedName("JobDriverSize")
    @Expose
    private String JobDriverSize;

    /**
    * Executor resource size of the Spark job
    */
    @SerializedName("JobExecutorSize")
    @Expose
    private String JobExecutorSize;

    /**
    * Number of Spark job executors
    */
    @SerializedName("JobExecutorNums")
    @Expose
    private Long JobExecutorNums;

    /**
    * Maximum number of retries of the Spark flow task
    */
    @SerializedName("JobMaxAttempts")
    @Expose
    private Long JobMaxAttempts;

    /**
    * Spark job creator
    */
    @SerializedName("JobCreator")
    @Expose
    private String JobCreator;

    /**
    * Spark job creation time
    */
    @SerializedName("JobCreateTime")
    @Expose
    private Long JobCreateTime;

    /**
    * Spark job update time
    */
    @SerializedName("JobUpdateTime")
    @Expose
    private Long JobUpdateTime;

    /**
    * Last task ID of the Spark job
    */
    @SerializedName("CurrentTaskId")
    @Expose
    private String CurrentTaskId;

    /**
    * Last status of the Spark job
    */
    @SerializedName("JobStatus")
    @Expose
    private Long JobStatus;

    /**
    * Spark streaming job statistics
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StreamingStat")
    @Expose
    private StreamingStatistics StreamingStat;

    /**
    * Data source name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * PySpark: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsLocalPythonFiles")
    @Expose
    private String IsLocalPythonFiles;

    /**
    * Note: This returned value has been disused.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppPythonFiles")
    @Expose
    private String AppPythonFiles;

    /**
    * Archives: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsLocalArchives")
    @Expose
    private String IsLocalArchives;

    /**
    * Archives: Dependency resources
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobArchives")
    @Expose
    private String JobArchives;

    /**
    * The Spark image version.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SparkImage")
    @Expose
    private String SparkImage;

    /**
    * PySpark: Python dependency, which can be in .py, .zip, or .egg format. Multiple files should be separated by comma.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobPythonFiles")
    @Expose
    private String JobPythonFiles;

    /**
    * Number of tasks running or ready to run under the current job
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskNum")
    @Expose
    private Long TaskNum;

    /**
    * Engine status. -100 (default value): unknown; -2-11: normal.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataEngineStatus")
    @Expose
    private Long DataEngineStatus;

    /**
    * The specified executor count (max), which defaults to 1. This parameter applies if the "Dynamic" mode is selected. If the "Dynamic" mode is not selected, the executor count is equal to `JobExecutorNums`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobExecutorMaxNumbers")
    @Expose
    private Long JobExecutorMaxNumbers;

    /**
    * The image version.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SparkImageVersion")
    @Expose
    private String SparkImageVersion;

    /**
    * The ID of the associated Data Lake Compute query script.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * `spark_emr_livy` indicates to create an EMR cluster.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataEngineClusterType")
    @Expose
    private String DataEngineClusterType;

    /**
    * `Spark 3.2-EMR` indicates to use the Spark 3.2 image.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataEngineImageVersion")
    @Expose
    private String DataEngineImageVersion;

    /**
    * Whether the task resource configuration is inherited from the cluster template. Valid values: `0` (default): No; `1`: Yes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsInherit")
    @Expose
    private Long IsInherit;

    /**
    * Whether the task runs with the session SQLs. Valid values: `false` for no and `true` for yes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsSessionStarted")
    @Expose
    private Boolean IsSessionStarted;

    /**
    * 
    */
    @SerializedName("EngineTypeDetail")
    @Expose
    private String EngineTypeDetail;

    /**
     * Get Spark job ID 
     * @return JobId Spark job ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Spark job ID
     * @param JobId Spark job ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Spark job name 
     * @return JobName Spark job name
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Spark job name
     * @param JobName Spark job name
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Spark job type. Valid values: `1` (batch job), `2` (streaming job). 
     * @return JobType Spark job type. Valid values: `1` (batch job), `2` (streaming job).
     */
    public Long getJobType() {
        return this.JobType;
    }

    /**
     * Set Spark job type. Valid values: `1` (batch job), `2` (streaming job).
     * @param JobType Spark job type. Valid values: `1` (batch job), `2` (streaming job).
     */
    public void setJobType(Long JobType) {
        this.JobType = JobType;
    }

    /**
     * Get Engine name 
     * @return DataEngine Engine name
     */
    public String getDataEngine() {
        return this.DataEngine;
    }

    /**
     * Set Engine name
     * @param DataEngine Engine name
     */
    public void setDataEngine(String DataEngine) {
        this.DataEngine = DataEngine;
    }

    /**
     * Get This field has been disused. Use the `Datasource` field instead. 
     * @return Eni This field has been disused. Use the `Datasource` field instead.
     */
    public String getEni() {
        return this.Eni;
    }

    /**
     * Set This field has been disused. Use the `Datasource` field instead.
     * @param Eni This field has been disused. Use the `Datasource` field instead.
     */
    public void setEni(String Eni) {
        this.Eni = Eni;
    }

    /**
     * Get Whether the program package is uploaded locally. Valid values: `cos`, `lakefs`. 
     * @return IsLocal Whether the program package is uploaded locally. Valid values: `cos`, `lakefs`.
     */
    public String getIsLocal() {
        return this.IsLocal;
    }

    /**
     * Set Whether the program package is uploaded locally. Valid values: `cos`, `lakefs`.
     * @param IsLocal Whether the program package is uploaded locally. Valid values: `cos`, `lakefs`.
     */
    public void setIsLocal(String IsLocal) {
        this.IsLocal = IsLocal;
    }

    /**
     * Get Program package path 
     * @return JobFile Program package path
     */
    public String getJobFile() {
        return this.JobFile;
    }

    /**
     * Set Program package path
     * @param JobFile Program package path
     */
    public void setJobFile(String JobFile) {
        this.JobFile = JobFile;
    }

    /**
     * Get Role ID 
     * @return RoleArn Role ID
     */
    public Long getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set Role ID
     * @param RoleArn Role ID
     */
    public void setRoleArn(Long RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get Main class of Spark job execution 
     * @return MainClass Main class of Spark job execution
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set Main class of Spark job execution
     * @param MainClass Main class of Spark job execution
     */
    public void setMainClass(String MainClass) {
        this.MainClass = MainClass;
    }

    /**
     * Get Command line parameters of the Spark job separated by space 
     * @return CmdArgs Command line parameters of the Spark job separated by space
     */
    public String getCmdArgs() {
        return this.CmdArgs;
    }

    /**
     * Set Command line parameters of the Spark job separated by space
     * @param CmdArgs Command line parameters of the Spark job separated by space
     */
    public void setCmdArgs(String CmdArgs) {
        this.CmdArgs = CmdArgs;
    }

    /**
     * Get Native Spark configurations separated by line break 
     * @return JobConf Native Spark configurations separated by line break
     */
    public String getJobConf() {
        return this.JobConf;
    }

    /**
     * Set Native Spark configurations separated by line break
     * @param JobConf Native Spark configurations separated by line break
     */
    public void setJobConf(String JobConf) {
        this.JobConf = JobConf;
    }

    /**
     * Get Whether the dependency JAR packages are uploaded locally. Valid values: `cos`, `lakefs`. 
     * @return IsLocalJars Whether the dependency JAR packages are uploaded locally. Valid values: `cos`, `lakefs`.
     */
    public String getIsLocalJars() {
        return this.IsLocalJars;
    }

    /**
     * Set Whether the dependency JAR packages are uploaded locally. Valid values: `cos`, `lakefs`.
     * @param IsLocalJars Whether the dependency JAR packages are uploaded locally. Valid values: `cos`, `lakefs`.
     */
    public void setIsLocalJars(String IsLocalJars) {
        this.IsLocalJars = IsLocalJars;
    }

    /**
     * Get Dependency JAR packages of the Spark job separated by comma 
     * @return JobJars Dependency JAR packages of the Spark job separated by comma
     */
    public String getJobJars() {
        return this.JobJars;
    }

    /**
     * Set Dependency JAR packages of the Spark job separated by comma
     * @param JobJars Dependency JAR packages of the Spark job separated by comma
     */
    public void setJobJars(String JobJars) {
        this.JobJars = JobJars;
    }

    /**
     * Get Whether the dependency file is uploaded locally. Valid values: `cos`, `lakefs`. 
     * @return IsLocalFiles Whether the dependency file is uploaded locally. Valid values: `cos`, `lakefs`.
     */
    public String getIsLocalFiles() {
        return this.IsLocalFiles;
    }

    /**
     * Set Whether the dependency file is uploaded locally. Valid values: `cos`, `lakefs`.
     * @param IsLocalFiles Whether the dependency file is uploaded locally. Valid values: `cos`, `lakefs`.
     */
    public void setIsLocalFiles(String IsLocalFiles) {
        this.IsLocalFiles = IsLocalFiles;
    }

    /**
     * Get Dependency files of the Spark job separated by comma 
     * @return JobFiles Dependency files of the Spark job separated by comma
     */
    public String getJobFiles() {
        return this.JobFiles;
    }

    /**
     * Set Dependency files of the Spark job separated by comma
     * @param JobFiles Dependency files of the Spark job separated by comma
     */
    public void setJobFiles(String JobFiles) {
        this.JobFiles = JobFiles;
    }

    /**
     * Get Driver resource size of the Spark job 
     * @return JobDriverSize Driver resource size of the Spark job
     */
    public String getJobDriverSize() {
        return this.JobDriverSize;
    }

    /**
     * Set Driver resource size of the Spark job
     * @param JobDriverSize Driver resource size of the Spark job
     */
    public void setJobDriverSize(String JobDriverSize) {
        this.JobDriverSize = JobDriverSize;
    }

    /**
     * Get Executor resource size of the Spark job 
     * @return JobExecutorSize Executor resource size of the Spark job
     */
    public String getJobExecutorSize() {
        return this.JobExecutorSize;
    }

    /**
     * Set Executor resource size of the Spark job
     * @param JobExecutorSize Executor resource size of the Spark job
     */
    public void setJobExecutorSize(String JobExecutorSize) {
        this.JobExecutorSize = JobExecutorSize;
    }

    /**
     * Get Number of Spark job executors 
     * @return JobExecutorNums Number of Spark job executors
     */
    public Long getJobExecutorNums() {
        return this.JobExecutorNums;
    }

    /**
     * Set Number of Spark job executors
     * @param JobExecutorNums Number of Spark job executors
     */
    public void setJobExecutorNums(Long JobExecutorNums) {
        this.JobExecutorNums = JobExecutorNums;
    }

    /**
     * Get Maximum number of retries of the Spark flow task 
     * @return JobMaxAttempts Maximum number of retries of the Spark flow task
     */
    public Long getJobMaxAttempts() {
        return this.JobMaxAttempts;
    }

    /**
     * Set Maximum number of retries of the Spark flow task
     * @param JobMaxAttempts Maximum number of retries of the Spark flow task
     */
    public void setJobMaxAttempts(Long JobMaxAttempts) {
        this.JobMaxAttempts = JobMaxAttempts;
    }

    /**
     * Get Spark job creator 
     * @return JobCreator Spark job creator
     */
    public String getJobCreator() {
        return this.JobCreator;
    }

    /**
     * Set Spark job creator
     * @param JobCreator Spark job creator
     */
    public void setJobCreator(String JobCreator) {
        this.JobCreator = JobCreator;
    }

    /**
     * Get Spark job creation time 
     * @return JobCreateTime Spark job creation time
     */
    public Long getJobCreateTime() {
        return this.JobCreateTime;
    }

    /**
     * Set Spark job creation time
     * @param JobCreateTime Spark job creation time
     */
    public void setJobCreateTime(Long JobCreateTime) {
        this.JobCreateTime = JobCreateTime;
    }

    /**
     * Get Spark job update time 
     * @return JobUpdateTime Spark job update time
     */
    public Long getJobUpdateTime() {
        return this.JobUpdateTime;
    }

    /**
     * Set Spark job update time
     * @param JobUpdateTime Spark job update time
     */
    public void setJobUpdateTime(Long JobUpdateTime) {
        this.JobUpdateTime = JobUpdateTime;
    }

    /**
     * Get Last task ID of the Spark job 
     * @return CurrentTaskId Last task ID of the Spark job
     */
    public String getCurrentTaskId() {
        return this.CurrentTaskId;
    }

    /**
     * Set Last task ID of the Spark job
     * @param CurrentTaskId Last task ID of the Spark job
     */
    public void setCurrentTaskId(String CurrentTaskId) {
        this.CurrentTaskId = CurrentTaskId;
    }

    /**
     * Get Last status of the Spark job 
     * @return JobStatus Last status of the Spark job
     */
    public Long getJobStatus() {
        return this.JobStatus;
    }

    /**
     * Set Last status of the Spark job
     * @param JobStatus Last status of the Spark job
     */
    public void setJobStatus(Long JobStatus) {
        this.JobStatus = JobStatus;
    }

    /**
     * Get Spark streaming job statistics
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StreamingStat Spark streaming job statistics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public StreamingStatistics getStreamingStat() {
        return this.StreamingStat;
    }

    /**
     * Set Spark streaming job statistics
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StreamingStat Spark streaming job statistics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStreamingStat(StreamingStatistics StreamingStat) {
        this.StreamingStat = StreamingStat;
    }

    /**
     * Get Data source name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataSource Data source name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set Data source name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataSource Data source name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get PySpark: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsLocalPythonFiles PySpark: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIsLocalPythonFiles() {
        return this.IsLocalPythonFiles;
    }

    /**
     * Set PySpark: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsLocalPythonFiles PySpark: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsLocalPythonFiles(String IsLocalPythonFiles) {
        this.IsLocalPythonFiles = IsLocalPythonFiles;
    }

    /**
     * Get Note: This returned value has been disused.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppPythonFiles Note: This returned value has been disused.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppPythonFiles() {
        return this.AppPythonFiles;
    }

    /**
     * Set Note: This returned value has been disused.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppPythonFiles Note: This returned value has been disused.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppPythonFiles(String AppPythonFiles) {
        this.AppPythonFiles = AppPythonFiles;
    }

    /**
     * Get Archives: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsLocalArchives Archives: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIsLocalArchives() {
        return this.IsLocalArchives;
    }

    /**
     * Set Archives: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsLocalArchives Archives: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsLocalArchives(String IsLocalArchives) {
        this.IsLocalArchives = IsLocalArchives;
    }

    /**
     * Get Archives: Dependency resources
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobArchives Archives: Dependency resources
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJobArchives() {
        return this.JobArchives;
    }

    /**
     * Set Archives: Dependency resources
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobArchives Archives: Dependency resources
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobArchives(String JobArchives) {
        this.JobArchives = JobArchives;
    }

    /**
     * Get The Spark image version.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SparkImage The Spark image version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSparkImage() {
        return this.SparkImage;
    }

    /**
     * Set The Spark image version.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SparkImage The Spark image version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSparkImage(String SparkImage) {
        this.SparkImage = SparkImage;
    }

    /**
     * Get PySpark: Python dependency, which can be in .py, .zip, or .egg format. Multiple files should be separated by comma.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobPythonFiles PySpark: Python dependency, which can be in .py, .zip, or .egg format. Multiple files should be separated by comma.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJobPythonFiles() {
        return this.JobPythonFiles;
    }

    /**
     * Set PySpark: Python dependency, which can be in .py, .zip, or .egg format. Multiple files should be separated by comma.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobPythonFiles PySpark: Python dependency, which can be in .py, .zip, or .egg format. Multiple files should be separated by comma.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobPythonFiles(String JobPythonFiles) {
        this.JobPythonFiles = JobPythonFiles;
    }

    /**
     * Get Number of tasks running or ready to run under the current job
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskNum Number of tasks running or ready to run under the current job
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskNum() {
        return this.TaskNum;
    }

    /**
     * Set Number of tasks running or ready to run under the current job
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskNum Number of tasks running or ready to run under the current job
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskNum(Long TaskNum) {
        this.TaskNum = TaskNum;
    }

    /**
     * Get Engine status. -100 (default value): unknown; -2-11: normal.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataEngineStatus Engine status. -100 (default value): unknown; -2-11: normal.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDataEngineStatus() {
        return this.DataEngineStatus;
    }

    /**
     * Set Engine status. -100 (default value): unknown; -2-11: normal.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataEngineStatus Engine status. -100 (default value): unknown; -2-11: normal.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataEngineStatus(Long DataEngineStatus) {
        this.DataEngineStatus = DataEngineStatus;
    }

    /**
     * Get The specified executor count (max), which defaults to 1. This parameter applies if the "Dynamic" mode is selected. If the "Dynamic" mode is not selected, the executor count is equal to `JobExecutorNums`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobExecutorMaxNumbers The specified executor count (max), which defaults to 1. This parameter applies if the "Dynamic" mode is selected. If the "Dynamic" mode is not selected, the executor count is equal to `JobExecutorNums`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getJobExecutorMaxNumbers() {
        return this.JobExecutorMaxNumbers;
    }

    /**
     * Set The specified executor count (max), which defaults to 1. This parameter applies if the "Dynamic" mode is selected. If the "Dynamic" mode is not selected, the executor count is equal to `JobExecutorNums`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobExecutorMaxNumbers The specified executor count (max), which defaults to 1. This parameter applies if the "Dynamic" mode is selected. If the "Dynamic" mode is not selected, the executor count is equal to `JobExecutorNums`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobExecutorMaxNumbers(Long JobExecutorMaxNumbers) {
        this.JobExecutorMaxNumbers = JobExecutorMaxNumbers;
    }

    /**
     * Get The image version.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SparkImageVersion The image version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSparkImageVersion() {
        return this.SparkImageVersion;
    }

    /**
     * Set The image version.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SparkImageVersion The image version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSparkImageVersion(String SparkImageVersion) {
        this.SparkImageVersion = SparkImageVersion;
    }

    /**
     * Get The ID of the associated Data Lake Compute query script.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SessionId The ID of the associated Data Lake Compute query script.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The ID of the associated Data Lake Compute query script.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SessionId The ID of the associated Data Lake Compute query script.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get `spark_emr_livy` indicates to create an EMR cluster.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataEngineClusterType `spark_emr_livy` indicates to create an EMR cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataEngineClusterType() {
        return this.DataEngineClusterType;
    }

    /**
     * Set `spark_emr_livy` indicates to create an EMR cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataEngineClusterType `spark_emr_livy` indicates to create an EMR cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataEngineClusterType(String DataEngineClusterType) {
        this.DataEngineClusterType = DataEngineClusterType;
    }

    /**
     * Get `Spark 3.2-EMR` indicates to use the Spark 3.2 image.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataEngineImageVersion `Spark 3.2-EMR` indicates to use the Spark 3.2 image.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataEngineImageVersion() {
        return this.DataEngineImageVersion;
    }

    /**
     * Set `Spark 3.2-EMR` indicates to use the Spark 3.2 image.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataEngineImageVersion `Spark 3.2-EMR` indicates to use the Spark 3.2 image.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataEngineImageVersion(String DataEngineImageVersion) {
        this.DataEngineImageVersion = DataEngineImageVersion;
    }

    /**
     * Get Whether the task resource configuration is inherited from the cluster template. Valid values: `0` (default): No; `1`: Yes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsInherit Whether the task resource configuration is inherited from the cluster template. Valid values: `0` (default): No; `1`: Yes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsInherit() {
        return this.IsInherit;
    }

    /**
     * Set Whether the task resource configuration is inherited from the cluster template. Valid values: `0` (default): No; `1`: Yes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsInherit Whether the task resource configuration is inherited from the cluster template. Valid values: `0` (default): No; `1`: Yes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsInherit(Long IsInherit) {
        this.IsInherit = IsInherit;
    }

    /**
     * Get Whether the task runs with the session SQLs. Valid values: `false` for no and `true` for yes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsSessionStarted Whether the task runs with the session SQLs. Valid values: `false` for no and `true` for yes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsSessionStarted() {
        return this.IsSessionStarted;
    }

    /**
     * Set Whether the task runs with the session SQLs. Valid values: `false` for no and `true` for yes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsSessionStarted Whether the task runs with the session SQLs. Valid values: `false` for no and `true` for yes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsSessionStarted(Boolean IsSessionStarted) {
        this.IsSessionStarted = IsSessionStarted;
    }

    /**
     * Get  
     * @return EngineTypeDetail 
     */
    public String getEngineTypeDetail() {
        return this.EngineTypeDetail;
    }

    /**
     * Set 
     * @param EngineTypeDetail 
     */
    public void setEngineTypeDetail(String EngineTypeDetail) {
        this.EngineTypeDetail = EngineTypeDetail;
    }

    public SparkJobInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparkJobInfo(SparkJobInfo source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.JobType != null) {
            this.JobType = new Long(source.JobType);
        }
        if (source.DataEngine != null) {
            this.DataEngine = new String(source.DataEngine);
        }
        if (source.Eni != null) {
            this.Eni = new String(source.Eni);
        }
        if (source.IsLocal != null) {
            this.IsLocal = new String(source.IsLocal);
        }
        if (source.JobFile != null) {
            this.JobFile = new String(source.JobFile);
        }
        if (source.RoleArn != null) {
            this.RoleArn = new Long(source.RoleArn);
        }
        if (source.MainClass != null) {
            this.MainClass = new String(source.MainClass);
        }
        if (source.CmdArgs != null) {
            this.CmdArgs = new String(source.CmdArgs);
        }
        if (source.JobConf != null) {
            this.JobConf = new String(source.JobConf);
        }
        if (source.IsLocalJars != null) {
            this.IsLocalJars = new String(source.IsLocalJars);
        }
        if (source.JobJars != null) {
            this.JobJars = new String(source.JobJars);
        }
        if (source.IsLocalFiles != null) {
            this.IsLocalFiles = new String(source.IsLocalFiles);
        }
        if (source.JobFiles != null) {
            this.JobFiles = new String(source.JobFiles);
        }
        if (source.JobDriverSize != null) {
            this.JobDriverSize = new String(source.JobDriverSize);
        }
        if (source.JobExecutorSize != null) {
            this.JobExecutorSize = new String(source.JobExecutorSize);
        }
        if (source.JobExecutorNums != null) {
            this.JobExecutorNums = new Long(source.JobExecutorNums);
        }
        if (source.JobMaxAttempts != null) {
            this.JobMaxAttempts = new Long(source.JobMaxAttempts);
        }
        if (source.JobCreator != null) {
            this.JobCreator = new String(source.JobCreator);
        }
        if (source.JobCreateTime != null) {
            this.JobCreateTime = new Long(source.JobCreateTime);
        }
        if (source.JobUpdateTime != null) {
            this.JobUpdateTime = new Long(source.JobUpdateTime);
        }
        if (source.CurrentTaskId != null) {
            this.CurrentTaskId = new String(source.CurrentTaskId);
        }
        if (source.JobStatus != null) {
            this.JobStatus = new Long(source.JobStatus);
        }
        if (source.StreamingStat != null) {
            this.StreamingStat = new StreamingStatistics(source.StreamingStat);
        }
        if (source.DataSource != null) {
            this.DataSource = new String(source.DataSource);
        }
        if (source.IsLocalPythonFiles != null) {
            this.IsLocalPythonFiles = new String(source.IsLocalPythonFiles);
        }
        if (source.AppPythonFiles != null) {
            this.AppPythonFiles = new String(source.AppPythonFiles);
        }
        if (source.IsLocalArchives != null) {
            this.IsLocalArchives = new String(source.IsLocalArchives);
        }
        if (source.JobArchives != null) {
            this.JobArchives = new String(source.JobArchives);
        }
        if (source.SparkImage != null) {
            this.SparkImage = new String(source.SparkImage);
        }
        if (source.JobPythonFiles != null) {
            this.JobPythonFiles = new String(source.JobPythonFiles);
        }
        if (source.TaskNum != null) {
            this.TaskNum = new Long(source.TaskNum);
        }
        if (source.DataEngineStatus != null) {
            this.DataEngineStatus = new Long(source.DataEngineStatus);
        }
        if (source.JobExecutorMaxNumbers != null) {
            this.JobExecutorMaxNumbers = new Long(source.JobExecutorMaxNumbers);
        }
        if (source.SparkImageVersion != null) {
            this.SparkImageVersion = new String(source.SparkImageVersion);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.DataEngineClusterType != null) {
            this.DataEngineClusterType = new String(source.DataEngineClusterType);
        }
        if (source.DataEngineImageVersion != null) {
            this.DataEngineImageVersion = new String(source.DataEngineImageVersion);
        }
        if (source.IsInherit != null) {
            this.IsInherit = new Long(source.IsInherit);
        }
        if (source.IsSessionStarted != null) {
            this.IsSessionStarted = new Boolean(source.IsSessionStarted);
        }
        if (source.EngineTypeDetail != null) {
            this.EngineTypeDetail = new String(source.EngineTypeDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "DataEngine", this.DataEngine);
        this.setParamSimple(map, prefix + "Eni", this.Eni);
        this.setParamSimple(map, prefix + "IsLocal", this.IsLocal);
        this.setParamSimple(map, prefix + "JobFile", this.JobFile);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "MainClass", this.MainClass);
        this.setParamSimple(map, prefix + "CmdArgs", this.CmdArgs);
        this.setParamSimple(map, prefix + "JobConf", this.JobConf);
        this.setParamSimple(map, prefix + "IsLocalJars", this.IsLocalJars);
        this.setParamSimple(map, prefix + "JobJars", this.JobJars);
        this.setParamSimple(map, prefix + "IsLocalFiles", this.IsLocalFiles);
        this.setParamSimple(map, prefix + "JobFiles", this.JobFiles);
        this.setParamSimple(map, prefix + "JobDriverSize", this.JobDriverSize);
        this.setParamSimple(map, prefix + "JobExecutorSize", this.JobExecutorSize);
        this.setParamSimple(map, prefix + "JobExecutorNums", this.JobExecutorNums);
        this.setParamSimple(map, prefix + "JobMaxAttempts", this.JobMaxAttempts);
        this.setParamSimple(map, prefix + "JobCreator", this.JobCreator);
        this.setParamSimple(map, prefix + "JobCreateTime", this.JobCreateTime);
        this.setParamSimple(map, prefix + "JobUpdateTime", this.JobUpdateTime);
        this.setParamSimple(map, prefix + "CurrentTaskId", this.CurrentTaskId);
        this.setParamSimple(map, prefix + "JobStatus", this.JobStatus);
        this.setParamObj(map, prefix + "StreamingStat.", this.StreamingStat);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamSimple(map, prefix + "IsLocalPythonFiles", this.IsLocalPythonFiles);
        this.setParamSimple(map, prefix + "AppPythonFiles", this.AppPythonFiles);
        this.setParamSimple(map, prefix + "IsLocalArchives", this.IsLocalArchives);
        this.setParamSimple(map, prefix + "JobArchives", this.JobArchives);
        this.setParamSimple(map, prefix + "SparkImage", this.SparkImage);
        this.setParamSimple(map, prefix + "JobPythonFiles", this.JobPythonFiles);
        this.setParamSimple(map, prefix + "TaskNum", this.TaskNum);
        this.setParamSimple(map, prefix + "DataEngineStatus", this.DataEngineStatus);
        this.setParamSimple(map, prefix + "JobExecutorMaxNumbers", this.JobExecutorMaxNumbers);
        this.setParamSimple(map, prefix + "SparkImageVersion", this.SparkImageVersion);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "DataEngineClusterType", this.DataEngineClusterType);
        this.setParamSimple(map, prefix + "DataEngineImageVersion", this.DataEngineImageVersion);
        this.setParamSimple(map, prefix + "IsInherit", this.IsInherit);
        this.setParamSimple(map, prefix + "IsSessionStarted", this.IsSessionStarted);
        this.setParamSimple(map, prefix + "EngineTypeDetail", this.EngineTypeDetail);

    }
}

