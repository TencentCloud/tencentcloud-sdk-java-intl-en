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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareTaskItem extends AbstractModel {

    /**
    * Task ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Data consistency check task ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CompareTaskId")
    @Expose
    private String CompareTaskId;

    /**
    * Data consistency check task name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Data consistency check task status. Valid values: `created`, `readyRun`, `running`, `success`, `stopping`, `failed`, `canceled`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Data consistency check task configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Config")
    @Expose
    private CompareObject Config;

    /**
    * Check details of the data consistency check task
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckProcess")
    @Expose
    private ProcessProgress CheckProcess;

    /**
    * Running details of the data consistency check task
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CompareProcess")
    @Expose
    private ProcessProgress CompareProcess;

    /**
    * Comparison result. Valid values: `same`, `different`, `skipAll`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Conclusion")
    @Expose
    private String Conclusion;

    /**
    * Task creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Task start time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartedAt")
    @Expose
    private String StartedAt;

    /**
    * Comparison end time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FinishedAt")
    @Expose
    private String FinishedAt;

    /**
    * Comparison type: (`dataCheck`: Full data comparison; `sampleDataCheck`: Sampling data comparison; `rowsCount`: Row count comparison)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Configuration information of the comparison task
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Options")
    @Expose
    private CompareOptions Options;

    /**
    * Consistency check prompt message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Task ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobId Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobId Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Data consistency check task ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CompareTaskId Data consistency check task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCompareTaskId() {
        return this.CompareTaskId;
    }

    /**
     * Set Data consistency check task ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CompareTaskId Data consistency check task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompareTaskId(String CompareTaskId) {
        this.CompareTaskId = CompareTaskId;
    }

    /**
     * Get Data consistency check task name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskName Data consistency check task name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Data consistency check task name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskName Data consistency check task name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Data consistency check task status. Valid values: `created`, `readyRun`, `running`, `success`, `stopping`, `failed`, `canceled`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Data consistency check task status. Valid values: `created`, `readyRun`, `running`, `success`, `stopping`, `failed`, `canceled`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Data consistency check task status. Valid values: `created`, `readyRun`, `running`, `success`, `stopping`, `failed`, `canceled`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Data consistency check task status. Valid values: `created`, `readyRun`, `running`, `success`, `stopping`, `failed`, `canceled`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Data consistency check task configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Config Data consistency check task configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CompareObject getConfig() {
        return this.Config;
    }

    /**
     * Set Data consistency check task configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Config Data consistency check task configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConfig(CompareObject Config) {
        this.Config = Config;
    }

    /**
     * Get Check details of the data consistency check task
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckProcess Check details of the data consistency check task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ProcessProgress getCheckProcess() {
        return this.CheckProcess;
    }

    /**
     * Set Check details of the data consistency check task
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckProcess Check details of the data consistency check task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckProcess(ProcessProgress CheckProcess) {
        this.CheckProcess = CheckProcess;
    }

    /**
     * Get Running details of the data consistency check task
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CompareProcess Running details of the data consistency check task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ProcessProgress getCompareProcess() {
        return this.CompareProcess;
    }

    /**
     * Set Running details of the data consistency check task
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CompareProcess Running details of the data consistency check task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompareProcess(ProcessProgress CompareProcess) {
        this.CompareProcess = CompareProcess;
    }

    /**
     * Get Comparison result. Valid values: `same`, `different`, `skipAll`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Conclusion Comparison result. Valid values: `same`, `different`, `skipAll`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConclusion() {
        return this.Conclusion;
    }

    /**
     * Set Comparison result. Valid values: `same`, `different`, `skipAll`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Conclusion Comparison result. Valid values: `same`, `different`, `skipAll`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConclusion(String Conclusion) {
        this.Conclusion = Conclusion;
    }

    /**
     * Get Task creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedAt Task creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Task creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedAt Task creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Task start time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartedAt Task start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartedAt() {
        return this.StartedAt;
    }

    /**
     * Set Task start time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartedAt Task start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartedAt(String StartedAt) {
        this.StartedAt = StartedAt;
    }

    /**
     * Get Comparison end time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FinishedAt Comparison end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFinishedAt() {
        return this.FinishedAt;
    }

    /**
     * Set Comparison end time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FinishedAt Comparison end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFinishedAt(String FinishedAt) {
        this.FinishedAt = FinishedAt;
    }

    /**
     * Get Comparison type: (`dataCheck`: Full data comparison; `sampleDataCheck`: Sampling data comparison; `rowsCount`: Row count comparison)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Method Comparison type: (`dataCheck`: Full data comparison; `sampleDataCheck`: Sampling data comparison; `rowsCount`: Row count comparison)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Comparison type: (`dataCheck`: Full data comparison; `sampleDataCheck`: Sampling data comparison; `rowsCount`: Row count comparison)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Method Comparison type: (`dataCheck`: Full data comparison; `sampleDataCheck`: Sampling data comparison; `rowsCount`: Row count comparison)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Configuration information of the comparison task
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Options Configuration information of the comparison task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CompareOptions getOptions() {
        return this.Options;
    }

    /**
     * Set Configuration information of the comparison task
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Options Configuration information of the comparison task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOptions(CompareOptions Options) {
        this.Options = Options;
    }

    /**
     * Get Consistency check prompt message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Message Consistency check prompt message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Consistency check prompt message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Message Consistency check prompt message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public CompareTaskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareTaskItem(CompareTaskItem source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.CompareTaskId != null) {
            this.CompareTaskId = new String(source.CompareTaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Config != null) {
            this.Config = new CompareObject(source.Config);
        }
        if (source.CheckProcess != null) {
            this.CheckProcess = new ProcessProgress(source.CheckProcess);
        }
        if (source.CompareProcess != null) {
            this.CompareProcess = new ProcessProgress(source.CompareProcess);
        }
        if (source.Conclusion != null) {
            this.Conclusion = new String(source.Conclusion);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.StartedAt != null) {
            this.StartedAt = new String(source.StartedAt);
        }
        if (source.FinishedAt != null) {
            this.FinishedAt = new String(source.FinishedAt);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Options != null) {
            this.Options = new CompareOptions(source.Options);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "CompareTaskId", this.CompareTaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamObj(map, prefix + "CheckProcess.", this.CheckProcess);
        this.setParamObj(map, prefix + "CompareProcess.", this.CompareProcess);
        this.setParamSimple(map, prefix + "Conclusion", this.Conclusion);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "StartedAt", this.StartedAt);
        this.setParamSimple(map, prefix + "FinishedAt", this.FinishedAt);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamObj(map, prefix + "Options.", this.Options);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

