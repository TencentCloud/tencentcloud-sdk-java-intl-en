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

public class ListOpsTasksRequest extends AbstractModel {

    /**
    * Project ID.
		
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Pagination size.
    */
    @SerializedName("PageSize")
    @Expose
    private String PageSize;

    /**
    * Page number
    */
    @SerializedName("PageNumber")
    @Expose
    private String PageNumber;

    /**
    * Task type Id. 
-20: common data sync.
 - 25:ETLTaskType
 - 26:ETLTaskType
 - 30:python
 - 31:pyspark
 - 34:HiveSQLTaskType
 - 35:shell
 - 36:SparkSQLTaskType
 - 21:JDBCSQLTaskType
 - 32:DLCTaskType
 - 33:ImpalaTaskType
 - 40:CDWTaskType
 - 41:kettle
 - 46:DLCSparkTaskType
-47: TiOne machine learning.
 - 48:TrinoTaskType
 - 50:DLCPyspark39:spark
 - 92:mr
-38: shell script.
-70: hivesql script.
-1000: common custom business.
    */
    @SerializedName("TaskTypeId")
    @Expose
    private String TaskTypeId;

    /**
    * Workflow ID.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Workflow name.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Owner id.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Folder ID
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Data source ID.
    */
    @SerializedName("SourceServiceId")
    @Expose
    private String SourceServiceId;

    /**
    * Target data source id.
    */
    @SerializedName("TargetServiceId")
    @Expose
    private String TargetServiceId;

    /**
    * Executor Group ID
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * Task Cycle Type:

* ONEOFF_CYCLE: One-time

* YEAR_CYCLE: Yearly

* MONTH_CYCLE: Monthly

* WEEK_CYCLE: Weekly

* DAY_CYCLE: Daily

* HOUR_CYCLE: Hourly

* MINUTE_CYCLE: Minute-level

* CRONTAB_CYCLE: Crontab expression-based
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * Task Status

-Y: Running

-F: Stopped

-O: Frozen

-T: Stopping

-INVALID: Invalid
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Time zone. defaults to UTC+8.
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get Project ID.
		 
     * @return ProjectId Project ID.
		
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
		
     * @param ProjectId Project ID.
		
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Pagination size. 
     * @return PageSize Pagination size.
     */
    public String getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Pagination size.
     * @param PageSize Pagination size.
     */
    public void setPageSize(String PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Page number 
     * @return PageNumber Page number
     */
    public String getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number
     * @param PageNumber Page number
     */
    public void setPageNumber(String PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Task type Id. 
-20: common data sync.
 - 25:ETLTaskType
 - 26:ETLTaskType
 - 30:python
 - 31:pyspark
 - 34:HiveSQLTaskType
 - 35:shell
 - 36:SparkSQLTaskType
 - 21:JDBCSQLTaskType
 - 32:DLCTaskType
 - 33:ImpalaTaskType
 - 40:CDWTaskType
 - 41:kettle
 - 46:DLCSparkTaskType
-47: TiOne machine learning.
 - 48:TrinoTaskType
 - 50:DLCPyspark39:spark
 - 92:mr
-38: shell script.
-70: hivesql script.
-1000: common custom business. 
     * @return TaskTypeId Task type Id. 
-20: common data sync.
 - 25:ETLTaskType
 - 26:ETLTaskType
 - 30:python
 - 31:pyspark
 - 34:HiveSQLTaskType
 - 35:shell
 - 36:SparkSQLTaskType
 - 21:JDBCSQLTaskType
 - 32:DLCTaskType
 - 33:ImpalaTaskType
 - 40:CDWTaskType
 - 41:kettle
 - 46:DLCSparkTaskType
-47: TiOne machine learning.
 - 48:TrinoTaskType
 - 50:DLCPyspark39:spark
 - 92:mr
-38: shell script.
-70: hivesql script.
-1000: common custom business.
     */
    public String getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set Task type Id. 
-20: common data sync.
 - 25:ETLTaskType
 - 26:ETLTaskType
 - 30:python
 - 31:pyspark
 - 34:HiveSQLTaskType
 - 35:shell
 - 36:SparkSQLTaskType
 - 21:JDBCSQLTaskType
 - 32:DLCTaskType
 - 33:ImpalaTaskType
 - 40:CDWTaskType
 - 41:kettle
 - 46:DLCSparkTaskType
-47: TiOne machine learning.
 - 48:TrinoTaskType
 - 50:DLCPyspark39:spark
 - 92:mr
-38: shell script.
-70: hivesql script.
-1000: common custom business.
     * @param TaskTypeId Task type Id. 
-20: common data sync.
 - 25:ETLTaskType
 - 26:ETLTaskType
 - 30:python
 - 31:pyspark
 - 34:HiveSQLTaskType
 - 35:shell
 - 36:SparkSQLTaskType
 - 21:JDBCSQLTaskType
 - 32:DLCTaskType
 - 33:ImpalaTaskType
 - 40:CDWTaskType
 - 41:kettle
 - 46:DLCSparkTaskType
-47: TiOne machine learning.
 - 48:TrinoTaskType
 - 50:DLCPyspark39:spark
 - 92:mr
-38: shell script.
-70: hivesql script.
-1000: common custom business.
     */
    public void setTaskTypeId(String TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get Workflow ID. 
     * @return WorkflowId Workflow ID.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID.
     * @param WorkflowId Workflow ID.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Workflow name. 
     * @return WorkflowName Workflow name.
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow name.
     * @param WorkflowName Workflow name.
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Owner id. 
     * @return OwnerUin Owner id.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Owner id.
     * @param OwnerUin Owner id.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Folder ID 
     * @return FolderId Folder ID
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder ID
     * @param FolderId Folder ID
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Data source ID. 
     * @return SourceServiceId Data source ID.
     */
    public String getSourceServiceId() {
        return this.SourceServiceId;
    }

    /**
     * Set Data source ID.
     * @param SourceServiceId Data source ID.
     */
    public void setSourceServiceId(String SourceServiceId) {
        this.SourceServiceId = SourceServiceId;
    }

    /**
     * Get Target data source id. 
     * @return TargetServiceId Target data source id.
     */
    public String getTargetServiceId() {
        return this.TargetServiceId;
    }

    /**
     * Set Target data source id.
     * @param TargetServiceId Target data source id.
     */
    public void setTargetServiceId(String TargetServiceId) {
        this.TargetServiceId = TargetServiceId;
    }

    /**
     * Get Executor Group ID 
     * @return ExecutorGroupId Executor Group ID
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set Executor Group ID
     * @param ExecutorGroupId Executor Group ID
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get Task Cycle Type:

* ONEOFF_CYCLE: One-time

* YEAR_CYCLE: Yearly

* MONTH_CYCLE: Monthly

* WEEK_CYCLE: Weekly

* DAY_CYCLE: Daily

* HOUR_CYCLE: Hourly

* MINUTE_CYCLE: Minute-level

* CRONTAB_CYCLE: Crontab expression-based 
     * @return CycleType Task Cycle Type:

* ONEOFF_CYCLE: One-time

* YEAR_CYCLE: Yearly

* MONTH_CYCLE: Monthly

* WEEK_CYCLE: Weekly

* DAY_CYCLE: Daily

* HOUR_CYCLE: Hourly

* MINUTE_CYCLE: Minute-level

* CRONTAB_CYCLE: Crontab expression-based
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Task Cycle Type:

* ONEOFF_CYCLE: One-time

* YEAR_CYCLE: Yearly

* MONTH_CYCLE: Monthly

* WEEK_CYCLE: Weekly

* DAY_CYCLE: Daily

* HOUR_CYCLE: Hourly

* MINUTE_CYCLE: Minute-level

* CRONTAB_CYCLE: Crontab expression-based
     * @param CycleType Task Cycle Type:

* ONEOFF_CYCLE: One-time

* YEAR_CYCLE: Yearly

* MONTH_CYCLE: Monthly

* WEEK_CYCLE: Weekly

* DAY_CYCLE: Daily

* HOUR_CYCLE: Hourly

* MINUTE_CYCLE: Minute-level

* CRONTAB_CYCLE: Crontab expression-based
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Task Status

-Y: Running

-F: Stopped

-O: Frozen

-T: Stopping

-INVALID: Invalid 
     * @return Status Task Status

-Y: Running

-F: Stopped

-O: Frozen

-T: Stopping

-INVALID: Invalid
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task Status

-Y: Running

-F: Stopped

-O: Frozen

-T: Stopping

-INVALID: Invalid
     * @param Status Task Status

-Y: Running

-F: Stopped

-O: Frozen

-T: Stopping

-INVALID: Invalid
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Time zone. defaults to UTC+8. 
     * @return TimeZone Time zone. defaults to UTC+8.
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set Time zone. defaults to UTC+8.
     * @param TimeZone Time zone. defaults to UTC+8.
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public ListOpsTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListOpsTasksRequest(ListOpsTasksRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageSize != null) {
            this.PageSize = new String(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new String(source.PageNumber);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new String(source.TaskTypeId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.SourceServiceId != null) {
            this.SourceServiceId = new String(source.SourceServiceId);
        }
        if (source.TargetServiceId != null) {
            this.TargetServiceId = new String(source.TargetServiceId);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "SourceServiceId", this.SourceServiceId);
        this.setParamSimple(map, prefix + "TargetServiceId", this.TargetServiceId);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

