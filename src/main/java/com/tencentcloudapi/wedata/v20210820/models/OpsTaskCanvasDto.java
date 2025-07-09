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

public class OpsTaskCanvasDto extends AbstractModel {

    /**
    * Task IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Workflow nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Project nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Project IdentifierNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * Task status, 'Y', 'F', 'O', 'T', 'INVALID' respectively indicate Scheduling In Progress, Stopped, Paused, Stopping, Expired
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Task Type ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * Task Type Description, where the corresponding relationship between Task Type ID and Task Type Description is as follows
20	Universal Data Synchronization Task
21	JDBC SQL
22	Tbase
25	Data ETL
30	Python
31	PySpark
34	Hive SQL
35	Shell
36	Spark SQL
37	HDFS to HBase
38	SHELL
39	Spark
45	DATA_QUALITY
55	THIVE to MySQL
56	THIVE to PostgreSQL
66	HDFS to PostgreSQL
67	HDFS to Oracle
68	HDFS to MySQL
69	FTP to HDFS
70	HIVE SQL
72	HIVE to HDFS
75	HDFS to HIVE
81	Python SQL Script
82	Spark Scala Computation
83	Wormhole Task
84	Verify Reconciliation File
85	HDFS to THIVE
86	TDW to HDFS
87	HDFS to TDW
88	Verify Reconciliation File
91	FLINK Task
92	MapReduce
98	custom topology
99	kafkatoHDFS
100	kafkatoHbase
101	Import MYSQL to HIVE(DX)
104	MYSQL to HIVE
105	HIVE to MYSQL
106	SQL SERVER to HIVE
107	HIVE to SQL SERVER
108	ORACLE to HIVE
109	HIVE to ORACLE
111	HIVE to MYSQL (NEW)
112	HIVE to PG
113	HIVE to PHOENIX
118	MYSQL to HDFS
119	PG to HDFS
120	ORACLE to HDFS
121	Data Quality
10000	Custom Definition Business
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskTypeDesc")
    @Expose
    private String TaskTypeDesc;

    /**
    * Project IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Folder NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * Folder IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Latest Submission Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FirstSubmitTime")
    @Expose
    private String FirstSubmitTime;

    /**
    * First Execution Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FirstRunTime")
    @Expose
    private String FirstRunTime;

    /**
    * Scheduling Plan Display Description Information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ScheduleDesc")
    @Expose
    private String ScheduleDesc;

    /**
    * Owner
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * Scheduling Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * Canvas X-axis Coordinate Point
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LeftCoordinate")
    @Expose
    private Float LeftCoordinate;

    /**
    * Canvas Y-axis Coordinate Point
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TopCoordinate")
    @Expose
    private Float TopCoordinate;

    /**
    * Cross-Workflow Virtual Task Identifier; true indicates a cross-workflow task; false indicates an in-workflow task
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("VirtualFlag")
    @Expose
    private Boolean VirtualFlag;

    /**
    * Elastic Cycle Configuration
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * DelayNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * Execution Start Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * Execution End Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * Hierarchy
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Layer")
    @Expose
    private String Layer;

    /**
    * Source Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SourceServiceId")
    @Expose
    private String SourceServiceId;

    /**
    * Source Data Source Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SourceServiceType")
    @Expose
    private String SourceServiceType;

    /**
    * Target Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetServiceId")
    @Expose
    private String TargetServiceId;

    /**
    * Target Data Source Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetServiceType")
    @Expose
    private String TargetServiceType;

    /**
    * Task Alert Types
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AlarmType")
    @Expose
    private String AlarmType;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

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
     * Get Task NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskName Task NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskName Task NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Workflow IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkflowId Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param WorkflowId Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Workflow nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkflowName Workflow nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param WorkflowName Workflow nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Project nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectName Project nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectName Project nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Project IdentifierNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectIdent Project IdentifierNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectIdent() {
        return this.ProjectIdent;
    }

    /**
     * Set Project IdentifierNote: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectIdent Project IdentifierNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectIdent(String ProjectIdent) {
        this.ProjectIdent = ProjectIdent;
    }

    /**
     * Get Task status, 'Y', 'F', 'O', 'T', 'INVALID' respectively indicate Scheduling In Progress, Stopped, Paused, Stopping, Expired
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Status Task status, 'Y', 'F', 'O', 'T', 'INVALID' respectively indicate Scheduling In Progress, Stopped, Paused, Stopping, Expired
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status, 'Y', 'F', 'O', 'T', 'INVALID' respectively indicate Scheduling In Progress, Stopped, Paused, Stopping, Expired
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Status Task status, 'Y', 'F', 'O', 'T', 'INVALID' respectively indicate Scheduling In Progress, Stopped, Paused, Stopping, Expired
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Task Type ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskTypeId Task Type ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set Task Type ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskTypeId Task Type ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get Task Type Description, where the corresponding relationship between Task Type ID and Task Type Description is as follows
20	Universal Data Synchronization Task
21	JDBC SQL
22	Tbase
25	Data ETL
30	Python
31	PySpark
34	Hive SQL
35	Shell
36	Spark SQL
37	HDFS to HBase
38	SHELL
39	Spark
45	DATA_QUALITY
55	THIVE to MySQL
56	THIVE to PostgreSQL
66	HDFS to PostgreSQL
67	HDFS to Oracle
68	HDFS to MySQL
69	FTP to HDFS
70	HIVE SQL
72	HIVE to HDFS
75	HDFS to HIVE
81	Python SQL Script
82	Spark Scala Computation
83	Wormhole Task
84	Verify Reconciliation File
85	HDFS to THIVE
86	TDW to HDFS
87	HDFS to TDW
88	Verify Reconciliation File
91	FLINK Task
92	MapReduce
98	custom topology
99	kafkatoHDFS
100	kafkatoHbase
101	Import MYSQL to HIVE(DX)
104	MYSQL to HIVE
105	HIVE to MYSQL
106	SQL SERVER to HIVE
107	HIVE to SQL SERVER
108	ORACLE to HIVE
109	HIVE to ORACLE
111	HIVE to MYSQL (NEW)
112	HIVE to PG
113	HIVE to PHOENIX
118	MYSQL to HDFS
119	PG to HDFS
120	ORACLE to HDFS
121	Data Quality
10000	Custom Definition Business
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskTypeDesc Task Type Description, where the corresponding relationship between Task Type ID and Task Type Description is as follows
20	Universal Data Synchronization Task
21	JDBC SQL
22	Tbase
25	Data ETL
30	Python
31	PySpark
34	Hive SQL
35	Shell
36	Spark SQL
37	HDFS to HBase
38	SHELL
39	Spark
45	DATA_QUALITY
55	THIVE to MySQL
56	THIVE to PostgreSQL
66	HDFS to PostgreSQL
67	HDFS to Oracle
68	HDFS to MySQL
69	FTP to HDFS
70	HIVE SQL
72	HIVE to HDFS
75	HDFS to HIVE
81	Python SQL Script
82	Spark Scala Computation
83	Wormhole Task
84	Verify Reconciliation File
85	HDFS to THIVE
86	TDW to HDFS
87	HDFS to TDW
88	Verify Reconciliation File
91	FLINK Task
92	MapReduce
98	custom topology
99	kafkatoHDFS
100	kafkatoHbase
101	Import MYSQL to HIVE(DX)
104	MYSQL to HIVE
105	HIVE to MYSQL
106	SQL SERVER to HIVE
107	HIVE to SQL SERVER
108	ORACLE to HIVE
109	HIVE to ORACLE
111	HIVE to MYSQL (NEW)
112	HIVE to PG
113	HIVE to PHOENIX
118	MYSQL to HDFS
119	PG to HDFS
120	ORACLE to HDFS
121	Data Quality
10000	Custom Definition Business
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskTypeDesc() {
        return this.TaskTypeDesc;
    }

    /**
     * Set Task Type Description, where the corresponding relationship between Task Type ID and Task Type Description is as follows
20	Universal Data Synchronization Task
21	JDBC SQL
22	Tbase
25	Data ETL
30	Python
31	PySpark
34	Hive SQL
35	Shell
36	Spark SQL
37	HDFS to HBase
38	SHELL
39	Spark
45	DATA_QUALITY
55	THIVE to MySQL
56	THIVE to PostgreSQL
66	HDFS to PostgreSQL
67	HDFS to Oracle
68	HDFS to MySQL
69	FTP to HDFS
70	HIVE SQL
72	HIVE to HDFS
75	HDFS to HIVE
81	Python SQL Script
82	Spark Scala Computation
83	Wormhole Task
84	Verify Reconciliation File
85	HDFS to THIVE
86	TDW to HDFS
87	HDFS to TDW
88	Verify Reconciliation File
91	FLINK Task
92	MapReduce
98	custom topology
99	kafkatoHDFS
100	kafkatoHbase
101	Import MYSQL to HIVE(DX)
104	MYSQL to HIVE
105	HIVE to MYSQL
106	SQL SERVER to HIVE
107	HIVE to SQL SERVER
108	ORACLE to HIVE
109	HIVE to ORACLE
111	HIVE to MYSQL (NEW)
112	HIVE to PG
113	HIVE to PHOENIX
118	MYSQL to HDFS
119	PG to HDFS
120	ORACLE to HDFS
121	Data Quality
10000	Custom Definition Business
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskTypeDesc Task Type Description, where the corresponding relationship between Task Type ID and Task Type Description is as follows
20	Universal Data Synchronization Task
21	JDBC SQL
22	Tbase
25	Data ETL
30	Python
31	PySpark
34	Hive SQL
35	Shell
36	Spark SQL
37	HDFS to HBase
38	SHELL
39	Spark
45	DATA_QUALITY
55	THIVE to MySQL
56	THIVE to PostgreSQL
66	HDFS to PostgreSQL
67	HDFS to Oracle
68	HDFS to MySQL
69	FTP to HDFS
70	HIVE SQL
72	HIVE to HDFS
75	HDFS to HIVE
81	Python SQL Script
82	Spark Scala Computation
83	Wormhole Task
84	Verify Reconciliation File
85	HDFS to THIVE
86	TDW to HDFS
87	HDFS to TDW
88	Verify Reconciliation File
91	FLINK Task
92	MapReduce
98	custom topology
99	kafkatoHDFS
100	kafkatoHbase
101	Import MYSQL to HIVE(DX)
104	MYSQL to HIVE
105	HIVE to MYSQL
106	SQL SERVER to HIVE
107	HIVE to SQL SERVER
108	ORACLE to HIVE
109	HIVE to ORACLE
111	HIVE to MYSQL (NEW)
112	HIVE to PG
113	HIVE to PHOENIX
118	MYSQL to HDFS
119	PG to HDFS
120	ORACLE to HDFS
121	Data Quality
10000	Custom Definition Business
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskTypeDesc(String TaskTypeDesc) {
        this.TaskTypeDesc = TaskTypeDesc;
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
     * Get Folder NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return FolderName Folder NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set Folder NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param FolderName Folder NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get Folder IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return FolderId Folder IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param FolderId Folder IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Latest Submission Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FirstSubmitTime Latest Submission Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFirstSubmitTime() {
        return this.FirstSubmitTime;
    }

    /**
     * Set Latest Submission Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FirstSubmitTime Latest Submission Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFirstSubmitTime(String FirstSubmitTime) {
        this.FirstSubmitTime = FirstSubmitTime;
    }

    /**
     * Get First Execution Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FirstRunTime First Execution Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFirstRunTime() {
        return this.FirstRunTime;
    }

    /**
     * Set First Execution Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FirstRunTime First Execution Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFirstRunTime(String FirstRunTime) {
        this.FirstRunTime = FirstRunTime;
    }

    /**
     * Get Scheduling Plan Display Description Information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ScheduleDesc Scheduling Plan Display Description Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getScheduleDesc() {
        return this.ScheduleDesc;
    }

    /**
     * Set Scheduling Plan Display Description Information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ScheduleDesc Scheduling Plan Display Description Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setScheduleDesc(String ScheduleDesc) {
        this.ScheduleDesc = ScheduleDesc;
    }

    /**
     * Get Owner
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InCharge Owner
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set Owner
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InCharge Owner
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get Scheduling Cycle Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleUnit Scheduling Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set Scheduling Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleUnit Scheduling Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get Canvas X-axis Coordinate Point
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LeftCoordinate Canvas X-axis Coordinate Point
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getLeftCoordinate() {
        return this.LeftCoordinate;
    }

    /**
     * Set Canvas X-axis Coordinate Point
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LeftCoordinate Canvas X-axis Coordinate Point
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLeftCoordinate(Float LeftCoordinate) {
        this.LeftCoordinate = LeftCoordinate;
    }

    /**
     * Get Canvas Y-axis Coordinate Point
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TopCoordinate Canvas Y-axis Coordinate Point
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getTopCoordinate() {
        return this.TopCoordinate;
    }

    /**
     * Set Canvas Y-axis Coordinate Point
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TopCoordinate Canvas Y-axis Coordinate Point
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTopCoordinate(Float TopCoordinate) {
        this.TopCoordinate = TopCoordinate;
    }

    /**
     * Get Cross-Workflow Virtual Task Identifier; true indicates a cross-workflow task; false indicates an in-workflow task
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return VirtualFlag Cross-Workflow Virtual Task Identifier; true indicates a cross-workflow task; false indicates an in-workflow task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getVirtualFlag() {
        return this.VirtualFlag;
    }

    /**
     * Set Cross-Workflow Virtual Task Identifier; true indicates a cross-workflow task; false indicates an in-workflow task
Note: This field may return null, indicating that no valid value can be obtained.
     * @param VirtualFlag Cross-Workflow Virtual Task Identifier; true indicates a cross-workflow task; false indicates an in-workflow task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVirtualFlag(Boolean VirtualFlag) {
        this.VirtualFlag = VirtualFlag;
    }

    /**
     * Get Elastic Cycle Configuration
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskAction Elastic Cycle Configuration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set Elastic Cycle Configuration
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskAction Elastic Cycle Configuration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get DelayNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DelayTime DelayNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set DelayNote: This field may return null, indicating that no valid value can be obtained.
     * @param DelayTime DelayNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get Execution Start Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutionStartTime Execution Start Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set Execution Start Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutionStartTime Execution Start Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get Execution End Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutionEndTime Execution End Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set Execution End Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutionEndTime Execution End Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get Hierarchy
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Layer Hierarchy
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLayer() {
        return this.Layer;
    }

    /**
     * Set Hierarchy
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Layer Hierarchy
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLayer(String Layer) {
        this.Layer = Layer;
    }

    /**
     * Get Source Data Source ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SourceServiceId Source Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSourceServiceId() {
        return this.SourceServiceId;
    }

    /**
     * Set Source Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SourceServiceId Source Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSourceServiceId(String SourceServiceId) {
        this.SourceServiceId = SourceServiceId;
    }

    /**
     * Get Source Data Source Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SourceServiceType Source Data Source Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSourceServiceType() {
        return this.SourceServiceType;
    }

    /**
     * Set Source Data Source Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SourceServiceType Source Data Source Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSourceServiceType(String SourceServiceType) {
        this.SourceServiceType = SourceServiceType;
    }

    /**
     * Get Target Data Source ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetServiceId Target Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTargetServiceId() {
        return this.TargetServiceId;
    }

    /**
     * Set Target Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetServiceId Target Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetServiceId(String TargetServiceId) {
        this.TargetServiceId = TargetServiceId;
    }

    /**
     * Get Target Data Source Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetServiceType Target Data Source Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTargetServiceType() {
        return this.TargetServiceType;
    }

    /**
     * Set Target Data Source Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetServiceType Target Data Source Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetServiceType(String TargetServiceType) {
        this.TargetServiceType = TargetServiceType;
    }

    /**
     * Get Task Alert Types
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AlarmType Task Alert Types
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set Task Alert Types
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AlarmType Task Alert Types
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAlarmType(String AlarmType) {
        this.AlarmType = AlarmType;
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

    public OpsTaskCanvasDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpsTaskCanvasDto(OpsTaskCanvasDto source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ProjectIdent != null) {
            this.ProjectIdent = new String(source.ProjectIdent);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.TaskTypeDesc != null) {
            this.TaskTypeDesc = new String(source.TaskTypeDesc);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FirstSubmitTime != null) {
            this.FirstSubmitTime = new String(source.FirstSubmitTime);
        }
        if (source.FirstRunTime != null) {
            this.FirstRunTime = new String(source.FirstRunTime);
        }
        if (source.ScheduleDesc != null) {
            this.ScheduleDesc = new String(source.ScheduleDesc);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.LeftCoordinate != null) {
            this.LeftCoordinate = new Float(source.LeftCoordinate);
        }
        if (source.TopCoordinate != null) {
            this.TopCoordinate = new Float(source.TopCoordinate);
        }
        if (source.VirtualFlag != null) {
            this.VirtualFlag = new Boolean(source.VirtualFlag);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.Layer != null) {
            this.Layer = new String(source.Layer);
        }
        if (source.SourceServiceId != null) {
            this.SourceServiceId = new String(source.SourceServiceId);
        }
        if (source.SourceServiceType != null) {
            this.SourceServiceType = new String(source.SourceServiceType);
        }
        if (source.TargetServiceId != null) {
            this.TargetServiceId = new String(source.TargetServiceId);
        }
        if (source.TargetServiceType != null) {
            this.TargetServiceType = new String(source.TargetServiceType);
        }
        if (source.AlarmType != null) {
            this.AlarmType = new String(source.AlarmType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "TaskTypeDesc", this.TaskTypeDesc);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FirstSubmitTime", this.FirstSubmitTime);
        this.setParamSimple(map, prefix + "FirstRunTime", this.FirstRunTime);
        this.setParamSimple(map, prefix + "ScheduleDesc", this.ScheduleDesc);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "LeftCoordinate", this.LeftCoordinate);
        this.setParamSimple(map, prefix + "TopCoordinate", this.TopCoordinate);
        this.setParamSimple(map, prefix + "VirtualFlag", this.VirtualFlag);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "Layer", this.Layer);
        this.setParamSimple(map, prefix + "SourceServiceId", this.SourceServiceId);
        this.setParamSimple(map, prefix + "SourceServiceType", this.SourceServiceType);
        this.setParamSimple(map, prefix + "TargetServiceId", this.TargetServiceId);
        this.setParamSimple(map, prefix + "TargetServiceType", this.TargetServiceType);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

