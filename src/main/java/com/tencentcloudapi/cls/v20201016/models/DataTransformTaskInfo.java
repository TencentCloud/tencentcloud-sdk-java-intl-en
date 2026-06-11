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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataTransformTaskInfo extends AbstractModel {

    /**
    * Data processing task name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Data processing task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task status. Valid values: 1 (enabled) and 2 (disabled).
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * Processing task type, 1: DSL (processing task using custom language), 2: SQL (processing task using SQL)
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Source log topic
    */
    @SerializedName("SrcTopicId")
    @Expose
    private String SrcTopicId;

    /**
    * Current task status. Valid values: 1 (preparing), 2 (in progress), 3 (being stopped), and 4 (stopped).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time.
Time format: yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modification time
Time format: yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Last enabled time. Modify this time if the cluster needs to be rebuilt.
Time format: yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("LastEnableTime")
    @Expose
    private String LastEnableTime;

    /**
    * Log topic name
    */
    @SerializedName("SrcTopicName")
    @Expose
    private String SrcTopicName;

    /**
    * Logset ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Target topic ID and alias of the data processing task
    */
    @SerializedName("DstResources")
    @Expose
    private DataTransformResouceInfo [] DstResources;

    /**
    * Processing logic function.
    */
    @SerializedName("EtlContent")
    @Expose
    private String EtlContent;

    /**
    * Fallback Topic ID
    */
    @SerializedName("BackupTopicID")
    @Expose
    private String BackupTopicID;

    /**
    * Whether to discard log data after the limit is exceeded
    */
    @SerializedName("BackupGiveUpData")
    @Expose
    private Boolean BackupGiveUpData;

    /**
    * Whether to enable service log shipping. Valid values: 1: disable; 2: enable.
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * Number of the target log topics of a task.
    */
    @SerializedName("TaskDstCount")
    @Expose
    private Long TaskDstCount;

    /**
    * Data processing type. Valid values: 0: standard processing task; 1: pre-processing task.
    */
    @SerializedName("DataTransformType")
    @Expose
    private Long DataTransformType;

    /**
    * Whether to keep the failure log status. Valid values: 1: no; 2: yes.
    */
    @SerializedName("KeepFailureLog")
    @Expose
    private Long KeepFailureLog;

    /**
    * Field name of a failed log.
    */
    @SerializedName("FailureLogKey")
    @Expose
    private String FailureLogKey;

    /**
    * Specify the start time of data processing (a second-level timestamp).
-For any time range within the log topic lifecycle, if it exceeds the lifecycle, only process the part with data within the lifecycle.
    */
    @SerializedName("ProcessFromTimestamp")
    @Expose
    private Long ProcessFromTimestamp;

    /**
    * Specify the end time of data processing, a Unix second-level timestamp.
1. Cannot specify a future time
2. If left blank, it means that the task will run constantly.
    */
    @SerializedName("ProcessToTimestamp")
    @Expose
    private Long ProcessToTimestamp;

    /**
    * sql data source information
    */
    @SerializedName("DataTransformSqlDataSources")
    @Expose
    private DataTransformSqlDataSource [] DataTransformSqlDataSources;

    /**
    * Environment variable.
    */
    @SerializedName("EnvInfos")
    @Expose
    private EnvInfo [] EnvInfos;

    /**
     * Get Data processing task name 
     * @return Name Data processing task name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Data processing task name
     * @param Name Data processing task name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Data processing task ID 
     * @return TaskId Data processing task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Data processing task ID
     * @param TaskId Data processing task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task status. Valid values: 1 (enabled) and 2 (disabled). 
     * @return EnableFlag Task status. Valid values: 1 (enabled) and 2 (disabled).
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set Task status. Valid values: 1 (enabled) and 2 (disabled).
     * @param EnableFlag Task status. Valid values: 1 (enabled) and 2 (disabled).
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get Processing task type, 1: DSL (processing task using custom language), 2: SQL (processing task using SQL) 
     * @return Type Processing task type, 1: DSL (processing task using custom language), 2: SQL (processing task using SQL)
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Processing task type, 1: DSL (processing task using custom language), 2: SQL (processing task using SQL)
     * @param Type Processing task type, 1: DSL (processing task using custom language), 2: SQL (processing task using SQL)
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Source log topic 
     * @return SrcTopicId Source log topic
     */
    public String getSrcTopicId() {
        return this.SrcTopicId;
    }

    /**
     * Set Source log topic
     * @param SrcTopicId Source log topic
     */
    public void setSrcTopicId(String SrcTopicId) {
        this.SrcTopicId = SrcTopicId;
    }

    /**
     * Get Current task status. Valid values: 1 (preparing), 2 (in progress), 3 (being stopped), and 4 (stopped). 
     * @return Status Current task status. Valid values: 1 (preparing), 2 (in progress), 3 (being stopped), and 4 (stopped).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Current task status. Valid values: 1 (preparing), 2 (in progress), 3 (being stopped), and 4 (stopped).
     * @param Status Current task status. Valid values: 1 (preparing), 2 (in progress), 3 (being stopped), and 4 (stopped).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time.
Time format: yyyy-MM-dd HH:mm:ss 
     * @return CreateTime Creation time.
Time format: yyyy-MM-dd HH:mm:ss
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
Time format: yyyy-MM-dd HH:mm:ss
     * @param CreateTime Creation time.
Time format: yyyy-MM-dd HH:mm:ss
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modification time
Time format: yyyy-MM-dd HH:mm:ss 
     * @return UpdateTime Last modification time
Time format: yyyy-MM-dd HH:mm:ss
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modification time
Time format: yyyy-MM-dd HH:mm:ss
     * @param UpdateTime Last modification time
Time format: yyyy-MM-dd HH:mm:ss
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Last enabled time. Modify this time if the cluster needs to be rebuilt.
Time format: yyyy-MM-dd HH:mm:ss 
     * @return LastEnableTime Last enabled time. Modify this time if the cluster needs to be rebuilt.
Time format: yyyy-MM-dd HH:mm:ss
     */
    public String getLastEnableTime() {
        return this.LastEnableTime;
    }

    /**
     * Set Last enabled time. Modify this time if the cluster needs to be rebuilt.
Time format: yyyy-MM-dd HH:mm:ss
     * @param LastEnableTime Last enabled time. Modify this time if the cluster needs to be rebuilt.
Time format: yyyy-MM-dd HH:mm:ss
     */
    public void setLastEnableTime(String LastEnableTime) {
        this.LastEnableTime = LastEnableTime;
    }

    /**
     * Get Log topic name 
     * @return SrcTopicName Log topic name
     */
    public String getSrcTopicName() {
        return this.SrcTopicName;
    }

    /**
     * Set Log topic name
     * @param SrcTopicName Log topic name
     */
    public void setSrcTopicName(String SrcTopicName) {
        this.SrcTopicName = SrcTopicName;
    }

    /**
     * Get Logset ID 
     * @return LogsetId Logset ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset ID
     * @param LogsetId Logset ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Target topic ID and alias of the data processing task 
     * @return DstResources Target topic ID and alias of the data processing task
     */
    public DataTransformResouceInfo [] getDstResources() {
        return this.DstResources;
    }

    /**
     * Set Target topic ID and alias of the data processing task
     * @param DstResources Target topic ID and alias of the data processing task
     */
    public void setDstResources(DataTransformResouceInfo [] DstResources) {
        this.DstResources = DstResources;
    }

    /**
     * Get Processing logic function. 
     * @return EtlContent Processing logic function.
     */
    public String getEtlContent() {
        return this.EtlContent;
    }

    /**
     * Set Processing logic function.
     * @param EtlContent Processing logic function.
     */
    public void setEtlContent(String EtlContent) {
        this.EtlContent = EtlContent;
    }

    /**
     * Get Fallback Topic ID 
     * @return BackupTopicID Fallback Topic ID
     */
    public String getBackupTopicID() {
        return this.BackupTopicID;
    }

    /**
     * Set Fallback Topic ID
     * @param BackupTopicID Fallback Topic ID
     */
    public void setBackupTopicID(String BackupTopicID) {
        this.BackupTopicID = BackupTopicID;
    }

    /**
     * Get Whether to discard log data after the limit is exceeded 
     * @return BackupGiveUpData Whether to discard log data after the limit is exceeded
     */
    public Boolean getBackupGiveUpData() {
        return this.BackupGiveUpData;
    }

    /**
     * Set Whether to discard log data after the limit is exceeded
     * @param BackupGiveUpData Whether to discard log data after the limit is exceeded
     */
    public void setBackupGiveUpData(Boolean BackupGiveUpData) {
        this.BackupGiveUpData = BackupGiveUpData;
    }

    /**
     * Get Whether to enable service log shipping. Valid values: 1: disable; 2: enable. 
     * @return HasServicesLog Whether to enable service log shipping. Valid values: 1: disable; 2: enable.
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set Whether to enable service log shipping. Valid values: 1: disable; 2: enable.
     * @param HasServicesLog Whether to enable service log shipping. Valid values: 1: disable; 2: enable.
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get Number of the target log topics of a task. 
     * @return TaskDstCount Number of the target log topics of a task.
     */
    public Long getTaskDstCount() {
        return this.TaskDstCount;
    }

    /**
     * Set Number of the target log topics of a task.
     * @param TaskDstCount Number of the target log topics of a task.
     */
    public void setTaskDstCount(Long TaskDstCount) {
        this.TaskDstCount = TaskDstCount;
    }

    /**
     * Get Data processing type. Valid values: 0: standard processing task; 1: pre-processing task. 
     * @return DataTransformType Data processing type. Valid values: 0: standard processing task; 1: pre-processing task.
     */
    public Long getDataTransformType() {
        return this.DataTransformType;
    }

    /**
     * Set Data processing type. Valid values: 0: standard processing task; 1: pre-processing task.
     * @param DataTransformType Data processing type. Valid values: 0: standard processing task; 1: pre-processing task.
     */
    public void setDataTransformType(Long DataTransformType) {
        this.DataTransformType = DataTransformType;
    }

    /**
     * Get Whether to keep the failure log status. Valid values: 1: no; 2: yes. 
     * @return KeepFailureLog Whether to keep the failure log status. Valid values: 1: no; 2: yes.
     */
    public Long getKeepFailureLog() {
        return this.KeepFailureLog;
    }

    /**
     * Set Whether to keep the failure log status. Valid values: 1: no; 2: yes.
     * @param KeepFailureLog Whether to keep the failure log status. Valid values: 1: no; 2: yes.
     */
    public void setKeepFailureLog(Long KeepFailureLog) {
        this.KeepFailureLog = KeepFailureLog;
    }

    /**
     * Get Field name of a failed log. 
     * @return FailureLogKey Field name of a failed log.
     */
    public String getFailureLogKey() {
        return this.FailureLogKey;
    }

    /**
     * Set Field name of a failed log.
     * @param FailureLogKey Field name of a failed log.
     */
    public void setFailureLogKey(String FailureLogKey) {
        this.FailureLogKey = FailureLogKey;
    }

    /**
     * Get Specify the start time of data processing (a second-level timestamp).
-For any time range within the log topic lifecycle, if it exceeds the lifecycle, only process the part with data within the lifecycle. 
     * @return ProcessFromTimestamp Specify the start time of data processing (a second-level timestamp).
-For any time range within the log topic lifecycle, if it exceeds the lifecycle, only process the part with data within the lifecycle.
     */
    public Long getProcessFromTimestamp() {
        return this.ProcessFromTimestamp;
    }

    /**
     * Set Specify the start time of data processing (a second-level timestamp).
-For any time range within the log topic lifecycle, if it exceeds the lifecycle, only process the part with data within the lifecycle.
     * @param ProcessFromTimestamp Specify the start time of data processing (a second-level timestamp).
-For any time range within the log topic lifecycle, if it exceeds the lifecycle, only process the part with data within the lifecycle.
     */
    public void setProcessFromTimestamp(Long ProcessFromTimestamp) {
        this.ProcessFromTimestamp = ProcessFromTimestamp;
    }

    /**
     * Get Specify the end time of data processing, a Unix second-level timestamp.
1. Cannot specify a future time
2. If left blank, it means that the task will run constantly. 
     * @return ProcessToTimestamp Specify the end time of data processing, a Unix second-level timestamp.
1. Cannot specify a future time
2. If left blank, it means that the task will run constantly.
     */
    public Long getProcessToTimestamp() {
        return this.ProcessToTimestamp;
    }

    /**
     * Set Specify the end time of data processing, a Unix second-level timestamp.
1. Cannot specify a future time
2. If left blank, it means that the task will run constantly.
     * @param ProcessToTimestamp Specify the end time of data processing, a Unix second-level timestamp.
1. Cannot specify a future time
2. If left blank, it means that the task will run constantly.
     */
    public void setProcessToTimestamp(Long ProcessToTimestamp) {
        this.ProcessToTimestamp = ProcessToTimestamp;
    }

    /**
     * Get sql data source information 
     * @return DataTransformSqlDataSources sql data source information
     */
    public DataTransformSqlDataSource [] getDataTransformSqlDataSources() {
        return this.DataTransformSqlDataSources;
    }

    /**
     * Set sql data source information
     * @param DataTransformSqlDataSources sql data source information
     */
    public void setDataTransformSqlDataSources(DataTransformSqlDataSource [] DataTransformSqlDataSources) {
        this.DataTransformSqlDataSources = DataTransformSqlDataSources;
    }

    /**
     * Get Environment variable. 
     * @return EnvInfos Environment variable.
     */
    public EnvInfo [] getEnvInfos() {
        return this.EnvInfos;
    }

    /**
     * Set Environment variable.
     * @param EnvInfos Environment variable.
     */
    public void setEnvInfos(EnvInfo [] EnvInfos) {
        this.EnvInfos = EnvInfos;
    }

    public DataTransformTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataTransformTaskInfo(DataTransformTaskInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.EnableFlag != null) {
            this.EnableFlag = new Long(source.EnableFlag);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SrcTopicId != null) {
            this.SrcTopicId = new String(source.SrcTopicId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.LastEnableTime != null) {
            this.LastEnableTime = new String(source.LastEnableTime);
        }
        if (source.SrcTopicName != null) {
            this.SrcTopicName = new String(source.SrcTopicName);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.DstResources != null) {
            this.DstResources = new DataTransformResouceInfo[source.DstResources.length];
            for (int i = 0; i < source.DstResources.length; i++) {
                this.DstResources[i] = new DataTransformResouceInfo(source.DstResources[i]);
            }
        }
        if (source.EtlContent != null) {
            this.EtlContent = new String(source.EtlContent);
        }
        if (source.BackupTopicID != null) {
            this.BackupTopicID = new String(source.BackupTopicID);
        }
        if (source.BackupGiveUpData != null) {
            this.BackupGiveUpData = new Boolean(source.BackupGiveUpData);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
        if (source.TaskDstCount != null) {
            this.TaskDstCount = new Long(source.TaskDstCount);
        }
        if (source.DataTransformType != null) {
            this.DataTransformType = new Long(source.DataTransformType);
        }
        if (source.KeepFailureLog != null) {
            this.KeepFailureLog = new Long(source.KeepFailureLog);
        }
        if (source.FailureLogKey != null) {
            this.FailureLogKey = new String(source.FailureLogKey);
        }
        if (source.ProcessFromTimestamp != null) {
            this.ProcessFromTimestamp = new Long(source.ProcessFromTimestamp);
        }
        if (source.ProcessToTimestamp != null) {
            this.ProcessToTimestamp = new Long(source.ProcessToTimestamp);
        }
        if (source.DataTransformSqlDataSources != null) {
            this.DataTransformSqlDataSources = new DataTransformSqlDataSource[source.DataTransformSqlDataSources.length];
            for (int i = 0; i < source.DataTransformSqlDataSources.length; i++) {
                this.DataTransformSqlDataSources[i] = new DataTransformSqlDataSource(source.DataTransformSqlDataSources[i]);
            }
        }
        if (source.EnvInfos != null) {
            this.EnvInfos = new EnvInfo[source.EnvInfos.length];
            for (int i = 0; i < source.EnvInfos.length; i++) {
                this.EnvInfos[i] = new EnvInfo(source.EnvInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SrcTopicId", this.SrcTopicId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LastEnableTime", this.LastEnableTime);
        this.setParamSimple(map, prefix + "SrcTopicName", this.SrcTopicName);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamArrayObj(map, prefix + "DstResources.", this.DstResources);
        this.setParamSimple(map, prefix + "EtlContent", this.EtlContent);
        this.setParamSimple(map, prefix + "BackupTopicID", this.BackupTopicID);
        this.setParamSimple(map, prefix + "BackupGiveUpData", this.BackupGiveUpData);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "TaskDstCount", this.TaskDstCount);
        this.setParamSimple(map, prefix + "DataTransformType", this.DataTransformType);
        this.setParamSimple(map, prefix + "KeepFailureLog", this.KeepFailureLog);
        this.setParamSimple(map, prefix + "FailureLogKey", this.FailureLogKey);
        this.setParamSimple(map, prefix + "ProcessFromTimestamp", this.ProcessFromTimestamp);
        this.setParamSimple(map, prefix + "ProcessToTimestamp", this.ProcessToTimestamp);
        this.setParamArrayObj(map, prefix + "DataTransformSqlDataSources.", this.DataTransformSqlDataSources);
        this.setParamArrayObj(map, prefix + "EnvInfos.", this.EnvInfos);

    }
}

