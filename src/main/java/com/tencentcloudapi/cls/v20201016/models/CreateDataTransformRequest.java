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

public class CreateDataTransformRequest extends AbstractModel {

    /**
    * Task type. 1: Specify topic; 2: Dynamic creation. For details, please refer to Creating Processing Task Document (https://intl.cloud.tencent.com/document/product/614/63940?from_cn_redirect=1).
    */
    @SerializedName("FuncType")
    @Expose
    private Long FuncType;

    /**
    * Log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
    */
    @SerializedName("SrcTopicId")
    @Expose
    private String SrcTopicId;

    /**
    * Processing task name
Name limit
-Cannot be an empty string
-Cannot contain character '|'
-Longest 128 characters
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Processing statement. When FuncType is 2, EtlContent must use [log_auto_output](https://www.tencentcloud.com/document/product/614/70733?from_cn_redirect=1#b3c58797-4825-4807-bef4-68106e25024f). 

Other reference documents

-[Create a processing task](https://www.tencentcloud.com/document/product/614/63940?from_cn_redirect=1) 
-[Function overview](https://www.tencentcloud.com/document/product/614/70395?from_cn_redirect=1)
    */
    @SerializedName("EtlContent")
    @Expose
    private String EtlContent;

    /**
    * Processing type.
1: Process preview using random data from the source log topic; 2: Process preview using user-defined test data; 3: Create real processing tasks.
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Target topic_id and alias of the processing task. This parameter is required when FuncType=1, and not required when FuncType=2.
Target topic_id. Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
Alias limitation: 1. Cannot be an empty string. 2. Cannot contain the character '|'.

    */
    @SerializedName("DstResources")
    @Expose
    private DataTransformResouceInfo [] DstResources;

    /**
    * Task status. Valid values: 1 (enabled) and 2 (disabled).
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * Test data for preview processing results
Obtain the target log topic ID through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
    */
    @SerializedName("PreviewLogStatistics")
    @Expose
    private PreviewLogStatistic [] PreviewLogStatistics;

    /**
    * When FuncType is 2, whether to discard data if the count of dynamically created logsets and log topics exceeds product specification limits, default false.

false: Create a fallback logset and log topic and write to fallback topic.
true: Discard log data.
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
    * Data processing type. Valid values: 0: standard processing task; 1: pre-processing task. A pre-processing task can process the collected logs and then write them into a log topic.
    */
    @SerializedName("DataTransformType")
    @Expose
    private Long DataTransformType;

    /**
    * Log status of failed jobs, 1: not retain (default), 2: retain.
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
    * Specify the start time of data processing, a Unix second-level timestamp.
-For any time range within the log topic lifecycle, if it exceeds the lifecycle, only process the part with data within the lifecycle.
    */
    @SerializedName("ProcessFromTimestamp")
    @Expose
    private Long ProcessFromTimestamp;

    /**
    * Specify the end time of data processing, a Unix second-level timestamp.

-Cannot specify a future time
-Leave blank to run constantly
    */
    @SerializedName("ProcessToTimestamp")
    @Expose
    private Long ProcessToTimestamp;

    /**
    * Preview a task (TaskType is 1 or 2) that is already created and used the capacity to associate with external data. This parameter is required.
Data processing task ID - Search the data processing task list basic information (https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1) to get the data processing task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Associated data source information
    */
    @SerializedName("DataTransformSqlDataSources")
    @Expose
    private DataTransformSqlDataSource [] DataTransformSqlDataSources;

    /**
    * Set environment variable
    */
    @SerializedName("EnvInfos")
    @Expose
    private EnvInfo [] EnvInfos;

    /**
     * Get Task type. 1: Specify topic; 2: Dynamic creation. For details, please refer to Creating Processing Task Document (https://intl.cloud.tencent.com/document/product/614/63940?from_cn_redirect=1). 
     * @return FuncType Task type. 1: Specify topic; 2: Dynamic creation. For details, please refer to Creating Processing Task Document (https://intl.cloud.tencent.com/document/product/614/63940?from_cn_redirect=1).
     */
    public Long getFuncType() {
        return this.FuncType;
    }

    /**
     * Set Task type. 1: Specify topic; 2: Dynamic creation. For details, please refer to Creating Processing Task Document (https://intl.cloud.tencent.com/document/product/614/63940?from_cn_redirect=1).
     * @param FuncType Task type. 1: Specify topic; 2: Dynamic creation. For details, please refer to Creating Processing Task Document (https://intl.cloud.tencent.com/document/product/614/63940?from_cn_redirect=1).
     */
    public void setFuncType(Long FuncType) {
        this.FuncType = FuncType;
    }

    /**
     * Get Log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). 
     * @return SrcTopicId Log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     */
    public String getSrcTopicId() {
        return this.SrcTopicId;
    }

    /**
     * Set Log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     * @param SrcTopicId Log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     */
    public void setSrcTopicId(String SrcTopicId) {
        this.SrcTopicId = SrcTopicId;
    }

    /**
     * Get Processing task name
Name limit
-Cannot be an empty string
-Cannot contain character '|'
-Longest 128 characters 
     * @return Name Processing task name
Name limit
-Cannot be an empty string
-Cannot contain character '|'
-Longest 128 characters
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Processing task name
Name limit
-Cannot be an empty string
-Cannot contain character '|'
-Longest 128 characters
     * @param Name Processing task name
Name limit
-Cannot be an empty string
-Cannot contain character '|'
-Longest 128 characters
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Processing statement. When FuncType is 2, EtlContent must use [log_auto_output](https://www.tencentcloud.com/document/product/614/70733?from_cn_redirect=1#b3c58797-4825-4807-bef4-68106e25024f). 

Other reference documents

-[Create a processing task](https://www.tencentcloud.com/document/product/614/63940?from_cn_redirect=1) 
-[Function overview](https://www.tencentcloud.com/document/product/614/70395?from_cn_redirect=1) 
     * @return EtlContent Processing statement. When FuncType is 2, EtlContent must use [log_auto_output](https://www.tencentcloud.com/document/product/614/70733?from_cn_redirect=1#b3c58797-4825-4807-bef4-68106e25024f). 

Other reference documents

-[Create a processing task](https://www.tencentcloud.com/document/product/614/63940?from_cn_redirect=1) 
-[Function overview](https://www.tencentcloud.com/document/product/614/70395?from_cn_redirect=1)
     */
    public String getEtlContent() {
        return this.EtlContent;
    }

    /**
     * Set Processing statement. When FuncType is 2, EtlContent must use [log_auto_output](https://www.tencentcloud.com/document/product/614/70733?from_cn_redirect=1#b3c58797-4825-4807-bef4-68106e25024f). 

Other reference documents

-[Create a processing task](https://www.tencentcloud.com/document/product/614/63940?from_cn_redirect=1) 
-[Function overview](https://www.tencentcloud.com/document/product/614/70395?from_cn_redirect=1)
     * @param EtlContent Processing statement. When FuncType is 2, EtlContent must use [log_auto_output](https://www.tencentcloud.com/document/product/614/70733?from_cn_redirect=1#b3c58797-4825-4807-bef4-68106e25024f). 

Other reference documents

-[Create a processing task](https://www.tencentcloud.com/document/product/614/63940?from_cn_redirect=1) 
-[Function overview](https://www.tencentcloud.com/document/product/614/70395?from_cn_redirect=1)
     */
    public void setEtlContent(String EtlContent) {
        this.EtlContent = EtlContent;
    }

    /**
     * Get Processing type.
1: Process preview using random data from the source log topic; 2: Process preview using user-defined test data; 3: Create real processing tasks. 
     * @return TaskType Processing type.
1: Process preview using random data from the source log topic; 2: Process preview using user-defined test data; 3: Create real processing tasks.
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Processing type.
1: Process preview using random data from the source log topic; 2: Process preview using user-defined test data; 3: Create real processing tasks.
     * @param TaskType Processing type.
1: Process preview using random data from the source log topic; 2: Process preview using user-defined test data; 3: Create real processing tasks.
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Target topic_id and alias of the processing task. This parameter is required when FuncType=1, and not required when FuncType=2.
Target topic_id. Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
Alias limitation: 1. Cannot be an empty string. 2. Cannot contain the character '|'.
 
     * @return DstResources Target topic_id and alias of the processing task. This parameter is required when FuncType=1, and not required when FuncType=2.
Target topic_id. Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
Alias limitation: 1. Cannot be an empty string. 2. Cannot contain the character '|'.

     */
    public DataTransformResouceInfo [] getDstResources() {
        return this.DstResources;
    }

    /**
     * Set Target topic_id and alias of the processing task. This parameter is required when FuncType=1, and not required when FuncType=2.
Target topic_id. Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
Alias limitation: 1. Cannot be an empty string. 2. Cannot contain the character '|'.

     * @param DstResources Target topic_id and alias of the processing task. This parameter is required when FuncType=1, and not required when FuncType=2.
Target topic_id. Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
Alias limitation: 1. Cannot be an empty string. 2. Cannot contain the character '|'.

     */
    public void setDstResources(DataTransformResouceInfo [] DstResources) {
        this.DstResources = DstResources;
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
     * Get Test data for preview processing results
Obtain the target log topic ID through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). 
     * @return PreviewLogStatistics Test data for preview processing results
Obtain the target log topic ID through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     */
    public PreviewLogStatistic [] getPreviewLogStatistics() {
        return this.PreviewLogStatistics;
    }

    /**
     * Set Test data for preview processing results
Obtain the target log topic ID through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     * @param PreviewLogStatistics Test data for preview processing results
Obtain the target log topic ID through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     */
    public void setPreviewLogStatistics(PreviewLogStatistic [] PreviewLogStatistics) {
        this.PreviewLogStatistics = PreviewLogStatistics;
    }

    /**
     * Get When FuncType is 2, whether to discard data if the count of dynamically created logsets and log topics exceeds product specification limits, default false.

false: Create a fallback logset and log topic and write to fallback topic.
true: Discard log data. 
     * @return BackupGiveUpData When FuncType is 2, whether to discard data if the count of dynamically created logsets and log topics exceeds product specification limits, default false.

false: Create a fallback logset and log topic and write to fallback topic.
true: Discard log data.
     */
    public Boolean getBackupGiveUpData() {
        return this.BackupGiveUpData;
    }

    /**
     * Set When FuncType is 2, whether to discard data if the count of dynamically created logsets and log topics exceeds product specification limits, default false.

false: Create a fallback logset and log topic and write to fallback topic.
true: Discard log data.
     * @param BackupGiveUpData When FuncType is 2, whether to discard data if the count of dynamically created logsets and log topics exceeds product specification limits, default false.

false: Create a fallback logset and log topic and write to fallback topic.
true: Discard log data.
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
     * Get Data processing type. Valid values: 0: standard processing task; 1: pre-processing task. A pre-processing task can process the collected logs and then write them into a log topic. 
     * @return DataTransformType Data processing type. Valid values: 0: standard processing task; 1: pre-processing task. A pre-processing task can process the collected logs and then write them into a log topic.
     */
    public Long getDataTransformType() {
        return this.DataTransformType;
    }

    /**
     * Set Data processing type. Valid values: 0: standard processing task; 1: pre-processing task. A pre-processing task can process the collected logs and then write them into a log topic.
     * @param DataTransformType Data processing type. Valid values: 0: standard processing task; 1: pre-processing task. A pre-processing task can process the collected logs and then write them into a log topic.
     */
    public void setDataTransformType(Long DataTransformType) {
        this.DataTransformType = DataTransformType;
    }

    /**
     * Get Log status of failed jobs, 1: not retain (default), 2: retain. 
     * @return KeepFailureLog Log status of failed jobs, 1: not retain (default), 2: retain.
     */
    public Long getKeepFailureLog() {
        return this.KeepFailureLog;
    }

    /**
     * Set Log status of failed jobs, 1: not retain (default), 2: retain.
     * @param KeepFailureLog Log status of failed jobs, 1: not retain (default), 2: retain.
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
     * Get Specify the start time of data processing, a Unix second-level timestamp.
-For any time range within the log topic lifecycle, if it exceeds the lifecycle, only process the part with data within the lifecycle. 
     * @return ProcessFromTimestamp Specify the start time of data processing, a Unix second-level timestamp.
-For any time range within the log topic lifecycle, if it exceeds the lifecycle, only process the part with data within the lifecycle.
     */
    public Long getProcessFromTimestamp() {
        return this.ProcessFromTimestamp;
    }

    /**
     * Set Specify the start time of data processing, a Unix second-level timestamp.
-For any time range within the log topic lifecycle, if it exceeds the lifecycle, only process the part with data within the lifecycle.
     * @param ProcessFromTimestamp Specify the start time of data processing, a Unix second-level timestamp.
-For any time range within the log topic lifecycle, if it exceeds the lifecycle, only process the part with data within the lifecycle.
     */
    public void setProcessFromTimestamp(Long ProcessFromTimestamp) {
        this.ProcessFromTimestamp = ProcessFromTimestamp;
    }

    /**
     * Get Specify the end time of data processing, a Unix second-level timestamp.

-Cannot specify a future time
-Leave blank to run constantly 
     * @return ProcessToTimestamp Specify the end time of data processing, a Unix second-level timestamp.

-Cannot specify a future time
-Leave blank to run constantly
     */
    public Long getProcessToTimestamp() {
        return this.ProcessToTimestamp;
    }

    /**
     * Set Specify the end time of data processing, a Unix second-level timestamp.

-Cannot specify a future time
-Leave blank to run constantly
     * @param ProcessToTimestamp Specify the end time of data processing, a Unix second-level timestamp.

-Cannot specify a future time
-Leave blank to run constantly
     */
    public void setProcessToTimestamp(Long ProcessToTimestamp) {
        this.ProcessToTimestamp = ProcessToTimestamp;
    }

    /**
     * Get Preview a task (TaskType is 1 or 2) that is already created and used the capacity to associate with external data. This parameter is required.
Data processing task ID - Search the data processing task list basic information (https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1) to get the data processing task ID. 
     * @return TaskId Preview a task (TaskType is 1 or 2) that is already created and used the capacity to associate with external data. This parameter is required.
Data processing task ID - Search the data processing task list basic information (https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1) to get the data processing task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Preview a task (TaskType is 1 or 2) that is already created and used the capacity to associate with external data. This parameter is required.
Data processing task ID - Search the data processing task list basic information (https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1) to get the data processing task ID.
     * @param TaskId Preview a task (TaskType is 1 or 2) that is already created and used the capacity to associate with external data. This parameter is required.
Data processing task ID - Search the data processing task list basic information (https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1) to get the data processing task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Associated data source information 
     * @return DataTransformSqlDataSources Associated data source information
     */
    public DataTransformSqlDataSource [] getDataTransformSqlDataSources() {
        return this.DataTransformSqlDataSources;
    }

    /**
     * Set Associated data source information
     * @param DataTransformSqlDataSources Associated data source information
     */
    public void setDataTransformSqlDataSources(DataTransformSqlDataSource [] DataTransformSqlDataSources) {
        this.DataTransformSqlDataSources = DataTransformSqlDataSources;
    }

    /**
     * Get Set environment variable 
     * @return EnvInfos Set environment variable
     */
    public EnvInfo [] getEnvInfos() {
        return this.EnvInfos;
    }

    /**
     * Set Set environment variable
     * @param EnvInfos Set environment variable
     */
    public void setEnvInfos(EnvInfo [] EnvInfos) {
        this.EnvInfos = EnvInfos;
    }

    public CreateDataTransformRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataTransformRequest(CreateDataTransformRequest source) {
        if (source.FuncType != null) {
            this.FuncType = new Long(source.FuncType);
        }
        if (source.SrcTopicId != null) {
            this.SrcTopicId = new String(source.SrcTopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EtlContent != null) {
            this.EtlContent = new String(source.EtlContent);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.DstResources != null) {
            this.DstResources = new DataTransformResouceInfo[source.DstResources.length];
            for (int i = 0; i < source.DstResources.length; i++) {
                this.DstResources[i] = new DataTransformResouceInfo(source.DstResources[i]);
            }
        }
        if (source.EnableFlag != null) {
            this.EnableFlag = new Long(source.EnableFlag);
        }
        if (source.PreviewLogStatistics != null) {
            this.PreviewLogStatistics = new PreviewLogStatistic[source.PreviewLogStatistics.length];
            for (int i = 0; i < source.PreviewLogStatistics.length; i++) {
                this.PreviewLogStatistics[i] = new PreviewLogStatistic(source.PreviewLogStatistics[i]);
            }
        }
        if (source.BackupGiveUpData != null) {
            this.BackupGiveUpData = new Boolean(source.BackupGiveUpData);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
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
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
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
        this.setParamSimple(map, prefix + "FuncType", this.FuncType);
        this.setParamSimple(map, prefix + "SrcTopicId", this.SrcTopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EtlContent", this.EtlContent);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArrayObj(map, prefix + "DstResources.", this.DstResources);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamArrayObj(map, prefix + "PreviewLogStatistics.", this.PreviewLogStatistics);
        this.setParamSimple(map, prefix + "BackupGiveUpData", this.BackupGiveUpData);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "DataTransformType", this.DataTransformType);
        this.setParamSimple(map, prefix + "KeepFailureLog", this.KeepFailureLog);
        this.setParamSimple(map, prefix + "FailureLogKey", this.FailureLogKey);
        this.setParamSimple(map, prefix + "ProcessFromTimestamp", this.ProcessFromTimestamp);
        this.setParamSimple(map, prefix + "ProcessToTimestamp", this.ProcessToTimestamp);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "DataTransformSqlDataSources.", this.DataTransformSqlDataSources);
        this.setParamArrayObj(map, prefix + "EnvInfos.", this.EnvInfos);

    }
}

