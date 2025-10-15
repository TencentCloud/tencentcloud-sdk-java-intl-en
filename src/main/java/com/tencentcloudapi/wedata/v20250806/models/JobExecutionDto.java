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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobExecutionDto extends AbstractModel {

    /**
    * Job ID of the data exploration.

    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Query job ID.

    */
    @SerializedName("JobExecutionId")
    @Expose
    private String JobExecutionId;

    /**
    * Specifies the subquery name.

    */
    @SerializedName("JobExecutionName")
    @Expose
    private String JobExecutionName;

    /**
    * Specifies the subquery sql content.

    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * Subquery status.

    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Creation time.

    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Execution phase.

    */
    @SerializedName("ExecuteStageInfo")
    @Expose
    private String ExecuteStageInfo;

    /**
    * Log path

    */
    @SerializedName("LogFilePath")
    @Expose
    private String LogFilePath;

    /**
    * Result path for download.

    */
    @SerializedName("ResultFilePath")
    @Expose
    private String ResultFilePath;

    /**
    * Preview result path.

    */
    @SerializedName("ResultPreviewFilePath")
    @Expose
    private String ResultPreviewFilePath;

    /**
    * Total number of lines in the task execution result.

    */
    @SerializedName("ResultTotalCount")
    @Expose
    private Long ResultTotalCount;

    /**
    * Update time.

    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * End time.


    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Duration. specifies the time taken.

    */
    @SerializedName("TimeCost")
    @Expose
    private Long TimeCost;

    /**
    * SQL content in the context.

    */
    @SerializedName("ContextScriptContent")
    @Expose
    private String [] ContextScriptContent;

    /**
    * Specifies the preview row count for task execution results.

    */
    @SerializedName("ResultPreviewCount")
    @Expose
    private Long ResultPreviewCount;

    /**
    * Specifies the number of affected rows in task execution.

    */
    @SerializedName("ResultEffectCount")
    @Expose
    private Long ResultEffectCount;

    /**
    * Whether the full result is being collected: default false. true indicates the full result is being collected, for the frontend to determine whether to continue to poll.

    */
    @SerializedName("CollectingTotalResult")
    @Expose
    private Boolean CollectingTotalResult;

    /**
    * Specifies whether to truncate the script content.

    */
    @SerializedName("ScriptContentTruncate")
    @Expose
    private Boolean ScriptContentTruncate;

    /**
     * Get Job ID of the data exploration.
 
     * @return JobId Job ID of the data exploration.

     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Job ID of the data exploration.

     * @param JobId Job ID of the data exploration.

     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Query job ID.
 
     * @return JobExecutionId Query job ID.

     */
    public String getJobExecutionId() {
        return this.JobExecutionId;
    }

    /**
     * Set Query job ID.

     * @param JobExecutionId Query job ID.

     */
    public void setJobExecutionId(String JobExecutionId) {
        this.JobExecutionId = JobExecutionId;
    }

    /**
     * Get Specifies the subquery name.
 
     * @return JobExecutionName Specifies the subquery name.

     */
    public String getJobExecutionName() {
        return this.JobExecutionName;
    }

    /**
     * Set Specifies the subquery name.

     * @param JobExecutionName Specifies the subquery name.

     */
    public void setJobExecutionName(String JobExecutionName) {
        this.JobExecutionName = JobExecutionName;
    }

    /**
     * Get Specifies the subquery sql content.
 
     * @return ScriptContent Specifies the subquery sql content.

     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set Specifies the subquery sql content.

     * @param ScriptContent Specifies the subquery sql content.

     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get Subquery status.
 
     * @return Status Subquery status.

     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Subquery status.

     * @param Status Subquery status.

     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time.
 
     * @return CreateTime Creation time.

     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.

     * @param CreateTime Creation time.

     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Execution phase.
 
     * @return ExecuteStageInfo Execution phase.

     */
    public String getExecuteStageInfo() {
        return this.ExecuteStageInfo;
    }

    /**
     * Set Execution phase.

     * @param ExecuteStageInfo Execution phase.

     */
    public void setExecuteStageInfo(String ExecuteStageInfo) {
        this.ExecuteStageInfo = ExecuteStageInfo;
    }

    /**
     * Get Log path
 
     * @return LogFilePath Log path

     */
    public String getLogFilePath() {
        return this.LogFilePath;
    }

    /**
     * Set Log path

     * @param LogFilePath Log path

     */
    public void setLogFilePath(String LogFilePath) {
        this.LogFilePath = LogFilePath;
    }

    /**
     * Get Result path for download.
 
     * @return ResultFilePath Result path for download.

     */
    public String getResultFilePath() {
        return this.ResultFilePath;
    }

    /**
     * Set Result path for download.

     * @param ResultFilePath Result path for download.

     */
    public void setResultFilePath(String ResultFilePath) {
        this.ResultFilePath = ResultFilePath;
    }

    /**
     * Get Preview result path.
 
     * @return ResultPreviewFilePath Preview result path.

     */
    public String getResultPreviewFilePath() {
        return this.ResultPreviewFilePath;
    }

    /**
     * Set Preview result path.

     * @param ResultPreviewFilePath Preview result path.

     */
    public void setResultPreviewFilePath(String ResultPreviewFilePath) {
        this.ResultPreviewFilePath = ResultPreviewFilePath;
    }

    /**
     * Get Total number of lines in the task execution result.
 
     * @return ResultTotalCount Total number of lines in the task execution result.

     */
    public Long getResultTotalCount() {
        return this.ResultTotalCount;
    }

    /**
     * Set Total number of lines in the task execution result.

     * @param ResultTotalCount Total number of lines in the task execution result.

     */
    public void setResultTotalCount(Long ResultTotalCount) {
        this.ResultTotalCount = ResultTotalCount;
    }

    /**
     * Get Update time.
 
     * @return UpdateTime Update time.

     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.

     * @param UpdateTime Update time.

     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get End time.

 
     * @return EndTime End time.


     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.


     * @param EndTime End time.


     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Duration. specifies the time taken.
 
     * @return TimeCost Duration. specifies the time taken.

     */
    public Long getTimeCost() {
        return this.TimeCost;
    }

    /**
     * Set Duration. specifies the time taken.

     * @param TimeCost Duration. specifies the time taken.

     */
    public void setTimeCost(Long TimeCost) {
        this.TimeCost = TimeCost;
    }

    /**
     * Get SQL content in the context.
 
     * @return ContextScriptContent SQL content in the context.

     */
    public String [] getContextScriptContent() {
        return this.ContextScriptContent;
    }

    /**
     * Set SQL content in the context.

     * @param ContextScriptContent SQL content in the context.

     */
    public void setContextScriptContent(String [] ContextScriptContent) {
        this.ContextScriptContent = ContextScriptContent;
    }

    /**
     * Get Specifies the preview row count for task execution results.
 
     * @return ResultPreviewCount Specifies the preview row count for task execution results.

     */
    public Long getResultPreviewCount() {
        return this.ResultPreviewCount;
    }

    /**
     * Set Specifies the preview row count for task execution results.

     * @param ResultPreviewCount Specifies the preview row count for task execution results.

     */
    public void setResultPreviewCount(Long ResultPreviewCount) {
        this.ResultPreviewCount = ResultPreviewCount;
    }

    /**
     * Get Specifies the number of affected rows in task execution.
 
     * @return ResultEffectCount Specifies the number of affected rows in task execution.

     */
    public Long getResultEffectCount() {
        return this.ResultEffectCount;
    }

    /**
     * Set Specifies the number of affected rows in task execution.

     * @param ResultEffectCount Specifies the number of affected rows in task execution.

     */
    public void setResultEffectCount(Long ResultEffectCount) {
        this.ResultEffectCount = ResultEffectCount;
    }

    /**
     * Get Whether the full result is being collected: default false. true indicates the full result is being collected, for the frontend to determine whether to continue to poll.
 
     * @return CollectingTotalResult Whether the full result is being collected: default false. true indicates the full result is being collected, for the frontend to determine whether to continue to poll.

     */
    public Boolean getCollectingTotalResult() {
        return this.CollectingTotalResult;
    }

    /**
     * Set Whether the full result is being collected: default false. true indicates the full result is being collected, for the frontend to determine whether to continue to poll.

     * @param CollectingTotalResult Whether the full result is being collected: default false. true indicates the full result is being collected, for the frontend to determine whether to continue to poll.

     */
    public void setCollectingTotalResult(Boolean CollectingTotalResult) {
        this.CollectingTotalResult = CollectingTotalResult;
    }

    /**
     * Get Specifies whether to truncate the script content.
 
     * @return ScriptContentTruncate Specifies whether to truncate the script content.

     */
    public Boolean getScriptContentTruncate() {
        return this.ScriptContentTruncate;
    }

    /**
     * Set Specifies whether to truncate the script content.

     * @param ScriptContentTruncate Specifies whether to truncate the script content.

     */
    public void setScriptContentTruncate(Boolean ScriptContentTruncate) {
        this.ScriptContentTruncate = ScriptContentTruncate;
    }

    public JobExecutionDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobExecutionDto(JobExecutionDto source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobExecutionId != null) {
            this.JobExecutionId = new String(source.JobExecutionId);
        }
        if (source.JobExecutionName != null) {
            this.JobExecutionName = new String(source.JobExecutionName);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExecuteStageInfo != null) {
            this.ExecuteStageInfo = new String(source.ExecuteStageInfo);
        }
        if (source.LogFilePath != null) {
            this.LogFilePath = new String(source.LogFilePath);
        }
        if (source.ResultFilePath != null) {
            this.ResultFilePath = new String(source.ResultFilePath);
        }
        if (source.ResultPreviewFilePath != null) {
            this.ResultPreviewFilePath = new String(source.ResultPreviewFilePath);
        }
        if (source.ResultTotalCount != null) {
            this.ResultTotalCount = new Long(source.ResultTotalCount);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TimeCost != null) {
            this.TimeCost = new Long(source.TimeCost);
        }
        if (source.ContextScriptContent != null) {
            this.ContextScriptContent = new String[source.ContextScriptContent.length];
            for (int i = 0; i < source.ContextScriptContent.length; i++) {
                this.ContextScriptContent[i] = new String(source.ContextScriptContent[i]);
            }
        }
        if (source.ResultPreviewCount != null) {
            this.ResultPreviewCount = new Long(source.ResultPreviewCount);
        }
        if (source.ResultEffectCount != null) {
            this.ResultEffectCount = new Long(source.ResultEffectCount);
        }
        if (source.CollectingTotalResult != null) {
            this.CollectingTotalResult = new Boolean(source.CollectingTotalResult);
        }
        if (source.ScriptContentTruncate != null) {
            this.ScriptContentTruncate = new Boolean(source.ScriptContentTruncate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobExecutionId", this.JobExecutionId);
        this.setParamSimple(map, prefix + "JobExecutionName", this.JobExecutionName);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExecuteStageInfo", this.ExecuteStageInfo);
        this.setParamSimple(map, prefix + "LogFilePath", this.LogFilePath);
        this.setParamSimple(map, prefix + "ResultFilePath", this.ResultFilePath);
        this.setParamSimple(map, prefix + "ResultPreviewFilePath", this.ResultPreviewFilePath);
        this.setParamSimple(map, prefix + "ResultTotalCount", this.ResultTotalCount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TimeCost", this.TimeCost);
        this.setParamArraySimple(map, prefix + "ContextScriptContent.", this.ContextScriptContent);
        this.setParamSimple(map, prefix + "ResultPreviewCount", this.ResultPreviewCount);
        this.setParamSimple(map, prefix + "ResultEffectCount", this.ResultEffectCount);
        this.setParamSimple(map, prefix + "CollectingTotalResult", this.CollectingTotalResult);
        this.setParamSimple(map, prefix + "ScriptContentTruncate", this.ScriptContentTruncate);

    }
}

