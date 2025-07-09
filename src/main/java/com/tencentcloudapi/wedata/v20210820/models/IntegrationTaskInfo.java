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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrationTaskInfo extends AbstractModel {

    /**
    * Task Name
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Task Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Synchronization Type 1. Solution (Whole Database Migration), 2. Single Table Synchronization
    */
    @SerializedName("SyncType")
    @Expose
    private Long SyncType;

    /**
    * 201. Real-time, 202. Offline
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Workflow ID of Task
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Task IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task Scheduling ID (oceanus or us etc. Job ID), not a mandatory field
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ScheduleTaskId")
    @Expose
    private String ScheduleTaskId;

    /**
    * InLong Task ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskGroupId")
    @Expose
    private String TaskGroupId;

    /**
    * Project IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Creator UIN
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * Operator UIN
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OperatorUin")
    @Expose
    private String OperatorUin;

    /**
    * owner uin
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Application ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 1: not started | 2: In operation | 3: Running | 4: Suspension | 5: Task Stopping | 6: Stop | 7: Execution Failure | 20: Abnormal | 21: Unknown |
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Node list
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Nodes")
    @Expose
    private IntegrationNodeInfo [] Nodes;

    /**
    * Execution Resource ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutorId")
    @Expose
    private String ExecutorId;

    /**
    * Task configuration information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Config")
    @Expose
    private RecordField [] Config;

    /**
    * Task extension configuration information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExtConfig")
    @Expose
    private RecordField [] ExtConfig;

    /**
    * Task execution context information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecuteContext")
    @Expose
    private RecordField [] ExecuteContext;

    /**
    * Node Mapping
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Mappings")
    @Expose
    private IntegrationNodeMapping [] Mappings;

    /**
    * Task configuration mode, 0: Canvas 1: Form 3: Script
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskMode")
    @Expose
    private String TaskMode;

    /**
    * Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Incharge")
    @Expose
    private String Incharge;

    /**
    * Offline new parameters
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OfflineTaskAddEntity")
    @Expose
    private OfflineTaskAddParam OfflineTaskAddEntity;

    /**
    * group name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

    /**
    * inlong manager url
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InLongManagerUrl")
    @Expose
    private String InLongManagerUrl;

    /**
    * stream id
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InLongStreamId")
    @Expose
    private String InLongStreamId;

    /**
    * version
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InLongManagerVersion")
    @Expose
    private String InLongManagerVersion;

    /**
    * inlong dataproxy url
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DataProxyUrl")
    @Expose
    private String [] DataProxyUrl;

    /**
    * Whether the task version has been submitted for operation and maintenance
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Submit")
    @Expose
    private Boolean Submit;

    /**
    * Data Source Type: MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InputDatasourceType")
    @Expose
    private String InputDatasourceType;

    /**
    * Data Source Type: MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OutputDatasourceType")
    @Expose
    private String OutputDatasourceType;

    /**
    * Number of reads
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NumRecordsIn")
    @Expose
    private Long NumRecordsIn;

    /**
    * Number of writes
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NumRecordsOut")
    @Expose
    private Long NumRecordsOut;

    /**
    * Read latency
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ReaderDelay")
    @Expose
    private Float ReaderDelay;

    /**
    * Restart Times
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NumRestarts")
    @Expose
    private Long NumRestarts;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Task Update Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Last task run time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastRunTime")
    @Expose
    private String LastRunTime;

    /**
    * Task stop time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StopTime")
    @Expose
    private String StopTime;

    /**
    * Job Submitted?
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("HasVersion")
    @Expose
    private Boolean HasVersion;

    /**
    * Is the task locked?
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Locked")
    @Expose
    private Boolean Locked;

    /**
    * Task Locked By
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Locker")
    @Expose
    private String Locker;

    /**
    * Resource Consumption
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RunningCu")
    @Expose
    private Float RunningCu;

    /**
    * Associated Alert Rules for the Task
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskAlarmRegularList")
    @Expose
    private String [] TaskAlarmRegularList;

    /**
    * Real-time task resource layering status: 0:Ongoing,1:Success,2:Failed
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SwitchResource")
    @Expose
    private Long SwitchResource;

    /**
    * Real-time task reading phase: 0:Full Full,1:Partial Full,2:Full Incremental
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ReadPhase")
    @Expose
    private Long ReadPhase;

    /**
    * Real-time Task Version Number
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceVersion")
    @Expose
    private Long InstanceVersion;

    /**
    * Offline task imported into orchestration space Task ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ArrangeSpaceTaskId")
    @Expose
    private String ArrangeSpaceTaskId;

    /**
    * Offline Task Status Differentiation 1.Not Submitted 2.Submitted 3.Exported
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OfflineTaskStatus")
    @Expose
    private Long OfflineTaskStatus;

    /**
     * Get Task Name 
     * @return TaskName Task Name
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task Name
     * @param TaskName Task Name
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Task Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Description Task Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Task Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Description Task Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Synchronization Type 1. Solution (Whole Database Migration), 2. Single Table Synchronization 
     * @return SyncType Synchronization Type 1. Solution (Whole Database Migration), 2. Single Table Synchronization
     */
    public Long getSyncType() {
        return this.SyncType;
    }

    /**
     * Set Synchronization Type 1. Solution (Whole Database Migration), 2. Single Table Synchronization
     * @param SyncType Synchronization Type 1. Solution (Whole Database Migration), 2. Single Table Synchronization
     */
    public void setSyncType(Long SyncType) {
        this.SyncType = SyncType;
    }

    /**
     * Get 201. Real-time, 202. Offline 
     * @return TaskType 201. Real-time, 202. Offline
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 201. Real-time, 202. Offline
     * @param TaskType 201. Real-time, 202. Offline
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Workflow ID of Task
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkflowId Workflow ID of Task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID of Task
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WorkflowId Workflow ID of Task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Task IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskId Task IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskId Task IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task Scheduling ID (oceanus or us etc. Job ID), not a mandatory field
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ScheduleTaskId Task Scheduling ID (oceanus or us etc. Job ID), not a mandatory field
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getScheduleTaskId() {
        return this.ScheduleTaskId;
    }

    /**
     * Set Task Scheduling ID (oceanus or us etc. Job ID), not a mandatory field
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ScheduleTaskId Task Scheduling ID (oceanus or us etc. Job ID), not a mandatory field
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setScheduleTaskId(String ScheduleTaskId) {
        this.ScheduleTaskId = ScheduleTaskId;
    }

    /**
     * Get InLong Task ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskGroupId InLong Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskGroupId() {
        return this.TaskGroupId;
    }

    /**
     * Set InLong Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskGroupId InLong Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskGroupId(String TaskGroupId) {
        this.TaskGroupId = TaskGroupId;
    }

    /**
     * Get Project IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectId Project IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectId Project IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Creator UIN
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CreatorUin Creator UIN
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set Creator UIN
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CreatorUin Creator UIN
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get Operator UIN
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OperatorUin Operator UIN
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOperatorUin() {
        return this.OperatorUin;
    }

    /**
     * Set Operator UIN
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OperatorUin Operator UIN
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOperatorUin(String OperatorUin) {
        this.OperatorUin = OperatorUin;
    }

    /**
     * Get owner uin
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerUin owner uin
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set owner uin
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerUin owner uin
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Application ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AppId Application ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set Application ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AppId Application ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 1: not started | 2: In operation | 3: Running | 4: Suspension | 5: Task Stopping | 6: Stop | 7: Execution Failure | 20: Abnormal | 21: Unknown |
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Status 1: not started | 2: In operation | 3: Running | 4: Suspension | 5: Task Stopping | 6: Stop | 7: Execution Failure | 20: Abnormal | 21: Unknown |
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1: not started | 2: In operation | 3: Running | 4: Suspension | 5: Task Stopping | 6: Stop | 7: Execution Failure | 20: Abnormal | 21: Unknown |
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Status 1: not started | 2: In operation | 3: Running | 4: Suspension | 5: Task Stopping | 6: Stop | 7: Execution Failure | 20: Abnormal | 21: Unknown |
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Node list
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Nodes Node list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public IntegrationNodeInfo [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set Node list
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Nodes Node list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNodes(IntegrationNodeInfo [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get Execution Resource ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutorId Execution Resource ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecutorId() {
        return this.ExecutorId;
    }

    /**
     * Set Execution Resource ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutorId Execution Resource ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutorId(String ExecutorId) {
        this.ExecutorId = ExecutorId;
    }

    /**
     * Get Task configuration information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Config Task configuration information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RecordField [] getConfig() {
        return this.Config;
    }

    /**
     * Set Task configuration information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Config Task configuration information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setConfig(RecordField [] Config) {
        this.Config = Config;
    }

    /**
     * Get Task extension configuration information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExtConfig Task extension configuration information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RecordField [] getExtConfig() {
        return this.ExtConfig;
    }

    /**
     * Set Task extension configuration information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExtConfig Task extension configuration information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExtConfig(RecordField [] ExtConfig) {
        this.ExtConfig = ExtConfig;
    }

    /**
     * Get Task execution context information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecuteContext Task execution context information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RecordField [] getExecuteContext() {
        return this.ExecuteContext;
    }

    /**
     * Set Task execution context information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecuteContext Task execution context information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecuteContext(RecordField [] ExecuteContext) {
        this.ExecuteContext = ExecuteContext;
    }

    /**
     * Get Node Mapping
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Mappings Node Mapping
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public IntegrationNodeMapping [] getMappings() {
        return this.Mappings;
    }

    /**
     * Set Node Mapping
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Mappings Node Mapping
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMappings(IntegrationNodeMapping [] Mappings) {
        this.Mappings = Mappings;
    }

    /**
     * Get Task configuration mode, 0: Canvas 1: Form 3: Script
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskMode Task configuration mode, 0: Canvas 1: Form 3: Script
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskMode() {
        return this.TaskMode;
    }

    /**
     * Set Task configuration mode, 0: Canvas 1: Form 3: Script
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskMode Task configuration mode, 0: Canvas 1: Form 3: Script
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskMode(String TaskMode) {
        this.TaskMode = TaskMode;
    }

    /**
     * Get Person in ChargeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Incharge Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getIncharge() {
        return this.Incharge;
    }

    /**
     * Set Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
     * @param Incharge Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIncharge(String Incharge) {
        this.Incharge = Incharge;
    }

    /**
     * Get Offline new parameters
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OfflineTaskAddEntity Offline new parameters
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public OfflineTaskAddParam getOfflineTaskAddEntity() {
        return this.OfflineTaskAddEntity;
    }

    /**
     * Set Offline new parameters
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OfflineTaskAddEntity Offline new parameters
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOfflineTaskAddEntity(OfflineTaskAddParam OfflineTaskAddEntity) {
        this.OfflineTaskAddEntity = OfflineTaskAddEntity;
    }

    /**
     * Get group name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutorGroupName group name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set group name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutorGroupName group name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    /**
     * Get inlong manager url
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InLongManagerUrl inlong manager url
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInLongManagerUrl() {
        return this.InLongManagerUrl;
    }

    /**
     * Set inlong manager url
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InLongManagerUrl inlong manager url
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInLongManagerUrl(String InLongManagerUrl) {
        this.InLongManagerUrl = InLongManagerUrl;
    }

    /**
     * Get stream id
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InLongStreamId stream id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInLongStreamId() {
        return this.InLongStreamId;
    }

    /**
     * Set stream id
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InLongStreamId stream id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInLongStreamId(String InLongStreamId) {
        this.InLongStreamId = InLongStreamId;
    }

    /**
     * Get version
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InLongManagerVersion version
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInLongManagerVersion() {
        return this.InLongManagerVersion;
    }

    /**
     * Set version
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InLongManagerVersion version
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInLongManagerVersion(String InLongManagerVersion) {
        this.InLongManagerVersion = InLongManagerVersion;
    }

    /**
     * Get inlong dataproxy url
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DataProxyUrl inlong dataproxy url
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getDataProxyUrl() {
        return this.DataProxyUrl;
    }

    /**
     * Set inlong dataproxy url
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DataProxyUrl inlong dataproxy url
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDataProxyUrl(String [] DataProxyUrl) {
        this.DataProxyUrl = DataProxyUrl;
    }

    /**
     * Get Whether the task version has been submitted for operation and maintenance
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Submit Whether the task version has been submitted for operation and maintenance
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getSubmit() {
        return this.Submit;
    }

    /**
     * Set Whether the task version has been submitted for operation and maintenance
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Submit Whether the task version has been submitted for operation and maintenance
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubmit(Boolean Submit) {
        this.Submit = Submit;
    }

    /**
     * Get Data Source Type: MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InputDatasourceType Data Source Type: MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInputDatasourceType() {
        return this.InputDatasourceType;
    }

    /**
     * Set Data Source Type: MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InputDatasourceType Data Source Type: MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInputDatasourceType(String InputDatasourceType) {
        this.InputDatasourceType = InputDatasourceType;
    }

    /**
     * Get Data Source Type: MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OutputDatasourceType Data Source Type: MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOutputDatasourceType() {
        return this.OutputDatasourceType;
    }

    /**
     * Set Data Source Type: MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OutputDatasourceType Data Source Type: MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOutputDatasourceType(String OutputDatasourceType) {
        this.OutputDatasourceType = OutputDatasourceType;
    }

    /**
     * Get Number of reads
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return NumRecordsIn Number of reads
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getNumRecordsIn() {
        return this.NumRecordsIn;
    }

    /**
     * Set Number of reads
Note: This field may return null, indicating that no valid value can be obtained.
     * @param NumRecordsIn Number of reads
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNumRecordsIn(Long NumRecordsIn) {
        this.NumRecordsIn = NumRecordsIn;
    }

    /**
     * Get Number of writes
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return NumRecordsOut Number of writes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getNumRecordsOut() {
        return this.NumRecordsOut;
    }

    /**
     * Set Number of writes
Note: This field may return null, indicating that no valid value can be obtained.
     * @param NumRecordsOut Number of writes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNumRecordsOut(Long NumRecordsOut) {
        this.NumRecordsOut = NumRecordsOut;
    }

    /**
     * Get Read latency
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ReaderDelay Read latency
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getReaderDelay() {
        return this.ReaderDelay;
    }

    /**
     * Set Read latency
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ReaderDelay Read latency
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setReaderDelay(Float ReaderDelay) {
        this.ReaderDelay = ReaderDelay;
    }

    /**
     * Get Restart Times
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return NumRestarts Restart Times
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getNumRestarts() {
        return this.NumRestarts;
    }

    /**
     * Set Restart Times
Note: This field may return null, indicating that no valid value can be obtained.
     * @param NumRestarts Restart Times
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNumRestarts(Long NumRestarts) {
        this.NumRestarts = NumRestarts;
    }

    /**
     * Get Creation TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task Update Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UpdateTime Task Update Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Task Update Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UpdateTime Task Update Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Last task run time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LastRunTime Last task run time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLastRunTime() {
        return this.LastRunTime;
    }

    /**
     * Set Last task run time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LastRunTime Last task run time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastRunTime(String LastRunTime) {
        this.LastRunTime = LastRunTime;
    }

    /**
     * Get Task stop time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StopTime Task stop time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStopTime() {
        return this.StopTime;
    }

    /**
     * Set Task stop time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StopTime Task stop time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStopTime(String StopTime) {
        this.StopTime = StopTime;
    }

    /**
     * Get Job Submitted?
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return HasVersion Job Submitted?
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getHasVersion() {
        return this.HasVersion;
    }

    /**
     * Set Job Submitted?
Note: This field may return null, indicating that no valid value can be obtained.
     * @param HasVersion Job Submitted?
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setHasVersion(Boolean HasVersion) {
        this.HasVersion = HasVersion;
    }

    /**
     * Get Is the task locked?
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Locked Is the task locked?
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getLocked() {
        return this.Locked;
    }

    /**
     * Set Is the task locked?
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Locked Is the task locked?
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLocked(Boolean Locked) {
        this.Locked = Locked;
    }

    /**
     * Get Task Locked By
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Locker Task Locked By
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLocker() {
        return this.Locker;
    }

    /**
     * Set Task Locked By
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Locker Task Locked By
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLocker(String Locker) {
        this.Locker = Locker;
    }

    /**
     * Get Resource Consumption
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RunningCu Resource Consumption
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getRunningCu() {
        return this.RunningCu;
    }

    /**
     * Set Resource Consumption
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RunningCu Resource Consumption
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRunningCu(Float RunningCu) {
        this.RunningCu = RunningCu;
    }

    /**
     * Get Associated Alert Rules for the Task
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskAlarmRegularList Associated Alert Rules for the Task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getTaskAlarmRegularList() {
        return this.TaskAlarmRegularList;
    }

    /**
     * Set Associated Alert Rules for the Task
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskAlarmRegularList Associated Alert Rules for the Task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskAlarmRegularList(String [] TaskAlarmRegularList) {
        this.TaskAlarmRegularList = TaskAlarmRegularList;
    }

    /**
     * Get Real-time task resource layering status: 0:Ongoing,1:Success,2:Failed
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SwitchResource Real-time task resource layering status: 0:Ongoing,1:Success,2:Failed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getSwitchResource() {
        return this.SwitchResource;
    }

    /**
     * Set Real-time task resource layering status: 0:Ongoing,1:Success,2:Failed
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SwitchResource Real-time task resource layering status: 0:Ongoing,1:Success,2:Failed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSwitchResource(Long SwitchResource) {
        this.SwitchResource = SwitchResource;
    }

    /**
     * Get Real-time task reading phase: 0:Full Full,1:Partial Full,2:Full Incremental
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ReadPhase Real-time task reading phase: 0:Full Full,1:Partial Full,2:Full Incremental
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getReadPhase() {
        return this.ReadPhase;
    }

    /**
     * Set Real-time task reading phase: 0:Full Full,1:Partial Full,2:Full Incremental
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ReadPhase Real-time task reading phase: 0:Full Full,1:Partial Full,2:Full Incremental
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setReadPhase(Long ReadPhase) {
        this.ReadPhase = ReadPhase;
    }

    /**
     * Get Real-time Task Version Number
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceVersion Real-time Task Version Number
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set Real-time Task Version Number
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceVersion Real-time Task Version Number
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceVersion(Long InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get Offline task imported into orchestration space Task ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ArrangeSpaceTaskId Offline task imported into orchestration space Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getArrangeSpaceTaskId() {
        return this.ArrangeSpaceTaskId;
    }

    /**
     * Set Offline task imported into orchestration space Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ArrangeSpaceTaskId Offline task imported into orchestration space Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setArrangeSpaceTaskId(String ArrangeSpaceTaskId) {
        this.ArrangeSpaceTaskId = ArrangeSpaceTaskId;
    }

    /**
     * Get Offline Task Status Differentiation 1.Not Submitted 2.Submitted 3.Exported
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OfflineTaskStatus Offline Task Status Differentiation 1.Not Submitted 2.Submitted 3.Exported
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getOfflineTaskStatus() {
        return this.OfflineTaskStatus;
    }

    /**
     * Set Offline Task Status Differentiation 1.Not Submitted 2.Submitted 3.Exported
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OfflineTaskStatus Offline Task Status Differentiation 1.Not Submitted 2.Submitted 3.Exported
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOfflineTaskStatus(Long OfflineTaskStatus) {
        this.OfflineTaskStatus = OfflineTaskStatus;
    }

    public IntegrationTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationTaskInfo(IntegrationTaskInfo source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SyncType != null) {
            this.SyncType = new Long(source.SyncType);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ScheduleTaskId != null) {
            this.ScheduleTaskId = new String(source.ScheduleTaskId);
        }
        if (source.TaskGroupId != null) {
            this.TaskGroupId = new String(source.TaskGroupId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.OperatorUin != null) {
            this.OperatorUin = new String(source.OperatorUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Nodes != null) {
            this.Nodes = new IntegrationNodeInfo[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new IntegrationNodeInfo(source.Nodes[i]);
            }
        }
        if (source.ExecutorId != null) {
            this.ExecutorId = new String(source.ExecutorId);
        }
        if (source.Config != null) {
            this.Config = new RecordField[source.Config.length];
            for (int i = 0; i < source.Config.length; i++) {
                this.Config[i] = new RecordField(source.Config[i]);
            }
        }
        if (source.ExtConfig != null) {
            this.ExtConfig = new RecordField[source.ExtConfig.length];
            for (int i = 0; i < source.ExtConfig.length; i++) {
                this.ExtConfig[i] = new RecordField(source.ExtConfig[i]);
            }
        }
        if (source.ExecuteContext != null) {
            this.ExecuteContext = new RecordField[source.ExecuteContext.length];
            for (int i = 0; i < source.ExecuteContext.length; i++) {
                this.ExecuteContext[i] = new RecordField(source.ExecuteContext[i]);
            }
        }
        if (source.Mappings != null) {
            this.Mappings = new IntegrationNodeMapping[source.Mappings.length];
            for (int i = 0; i < source.Mappings.length; i++) {
                this.Mappings[i] = new IntegrationNodeMapping(source.Mappings[i]);
            }
        }
        if (source.TaskMode != null) {
            this.TaskMode = new String(source.TaskMode);
        }
        if (source.Incharge != null) {
            this.Incharge = new String(source.Incharge);
        }
        if (source.OfflineTaskAddEntity != null) {
            this.OfflineTaskAddEntity = new OfflineTaskAddParam(source.OfflineTaskAddEntity);
        }
        if (source.ExecutorGroupName != null) {
            this.ExecutorGroupName = new String(source.ExecutorGroupName);
        }
        if (source.InLongManagerUrl != null) {
            this.InLongManagerUrl = new String(source.InLongManagerUrl);
        }
        if (source.InLongStreamId != null) {
            this.InLongStreamId = new String(source.InLongStreamId);
        }
        if (source.InLongManagerVersion != null) {
            this.InLongManagerVersion = new String(source.InLongManagerVersion);
        }
        if (source.DataProxyUrl != null) {
            this.DataProxyUrl = new String[source.DataProxyUrl.length];
            for (int i = 0; i < source.DataProxyUrl.length; i++) {
                this.DataProxyUrl[i] = new String(source.DataProxyUrl[i]);
            }
        }
        if (source.Submit != null) {
            this.Submit = new Boolean(source.Submit);
        }
        if (source.InputDatasourceType != null) {
            this.InputDatasourceType = new String(source.InputDatasourceType);
        }
        if (source.OutputDatasourceType != null) {
            this.OutputDatasourceType = new String(source.OutputDatasourceType);
        }
        if (source.NumRecordsIn != null) {
            this.NumRecordsIn = new Long(source.NumRecordsIn);
        }
        if (source.NumRecordsOut != null) {
            this.NumRecordsOut = new Long(source.NumRecordsOut);
        }
        if (source.ReaderDelay != null) {
            this.ReaderDelay = new Float(source.ReaderDelay);
        }
        if (source.NumRestarts != null) {
            this.NumRestarts = new Long(source.NumRestarts);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.LastRunTime != null) {
            this.LastRunTime = new String(source.LastRunTime);
        }
        if (source.StopTime != null) {
            this.StopTime = new String(source.StopTime);
        }
        if (source.HasVersion != null) {
            this.HasVersion = new Boolean(source.HasVersion);
        }
        if (source.Locked != null) {
            this.Locked = new Boolean(source.Locked);
        }
        if (source.Locker != null) {
            this.Locker = new String(source.Locker);
        }
        if (source.RunningCu != null) {
            this.RunningCu = new Float(source.RunningCu);
        }
        if (source.TaskAlarmRegularList != null) {
            this.TaskAlarmRegularList = new String[source.TaskAlarmRegularList.length];
            for (int i = 0; i < source.TaskAlarmRegularList.length; i++) {
                this.TaskAlarmRegularList[i] = new String(source.TaskAlarmRegularList[i]);
            }
        }
        if (source.SwitchResource != null) {
            this.SwitchResource = new Long(source.SwitchResource);
        }
        if (source.ReadPhase != null) {
            this.ReadPhase = new Long(source.ReadPhase);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new Long(source.InstanceVersion);
        }
        if (source.ArrangeSpaceTaskId != null) {
            this.ArrangeSpaceTaskId = new String(source.ArrangeSpaceTaskId);
        }
        if (source.OfflineTaskStatus != null) {
            this.OfflineTaskStatus = new Long(source.OfflineTaskStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SyncType", this.SyncType);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ScheduleTaskId", this.ScheduleTaskId);
        this.setParamSimple(map, prefix + "TaskGroupId", this.TaskGroupId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "OperatorUin", this.OperatorUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Nodes.", this.Nodes);
        this.setParamSimple(map, prefix + "ExecutorId", this.ExecutorId);
        this.setParamArrayObj(map, prefix + "Config.", this.Config);
        this.setParamArrayObj(map, prefix + "ExtConfig.", this.ExtConfig);
        this.setParamArrayObj(map, prefix + "ExecuteContext.", this.ExecuteContext);
        this.setParamArrayObj(map, prefix + "Mappings.", this.Mappings);
        this.setParamSimple(map, prefix + "TaskMode", this.TaskMode);
        this.setParamSimple(map, prefix + "Incharge", this.Incharge);
        this.setParamObj(map, prefix + "OfflineTaskAddEntity.", this.OfflineTaskAddEntity);
        this.setParamSimple(map, prefix + "ExecutorGroupName", this.ExecutorGroupName);
        this.setParamSimple(map, prefix + "InLongManagerUrl", this.InLongManagerUrl);
        this.setParamSimple(map, prefix + "InLongStreamId", this.InLongStreamId);
        this.setParamSimple(map, prefix + "InLongManagerVersion", this.InLongManagerVersion);
        this.setParamArraySimple(map, prefix + "DataProxyUrl.", this.DataProxyUrl);
        this.setParamSimple(map, prefix + "Submit", this.Submit);
        this.setParamSimple(map, prefix + "InputDatasourceType", this.InputDatasourceType);
        this.setParamSimple(map, prefix + "OutputDatasourceType", this.OutputDatasourceType);
        this.setParamSimple(map, prefix + "NumRecordsIn", this.NumRecordsIn);
        this.setParamSimple(map, prefix + "NumRecordsOut", this.NumRecordsOut);
        this.setParamSimple(map, prefix + "ReaderDelay", this.ReaderDelay);
        this.setParamSimple(map, prefix + "NumRestarts", this.NumRestarts);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LastRunTime", this.LastRunTime);
        this.setParamSimple(map, prefix + "StopTime", this.StopTime);
        this.setParamSimple(map, prefix + "HasVersion", this.HasVersion);
        this.setParamSimple(map, prefix + "Locked", this.Locked);
        this.setParamSimple(map, prefix + "Locker", this.Locker);
        this.setParamSimple(map, prefix + "RunningCu", this.RunningCu);
        this.setParamArraySimple(map, prefix + "TaskAlarmRegularList.", this.TaskAlarmRegularList);
        this.setParamSimple(map, prefix + "SwitchResource", this.SwitchResource);
        this.setParamSimple(map, prefix + "ReadPhase", this.ReadPhase);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "ArrangeSpaceTaskId", this.ArrangeSpaceTaskId);
        this.setParamSimple(map, prefix + "OfflineTaskStatus", this.OfflineTaskStatus);

    }
}

