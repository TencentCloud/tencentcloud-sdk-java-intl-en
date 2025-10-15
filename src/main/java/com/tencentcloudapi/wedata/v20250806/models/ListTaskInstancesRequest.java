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

public class ListTaskInstancesRequest extends AbstractModel {

    /**
    * **Project ID**. specifies the project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * **Page number. integer.**.
Used in conjunction with pageSize and cannot be less than 1. default value: 1.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Specifies the number of items to display per page. default: 10. value range: 1-100.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Task name or task ID.
Supports fuzzy search filtering. multiple values are separated by commas.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * **Time zone** timeZone, specifies the time zone of the passed in time string. default UTC+8.
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * **Instance Type**

0 - Backfill instance

1 - Cyclic (scheduled) instance

2 - Non-cyclic (non-scheduled) instance
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * **Instance Status**

WAIT_EVENT: Waiting for event

WAIT_UPSTREAM: Waiting for upstream

WAIT_RUN: Waiting to run

RUNNING: Running

SKIP_RUNNING: Skipped

FAILED_RETRY: Retrying after failure

EXPIRED: Failed

COMPLETED: Succeeded
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * Task type Id.
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * **Task Cycle Type**

ONEOFF_CYCLE: One-time

YEAR_CYCLE: Yearly

MONTH_CYCLE: Monthly

WEEK_CYCLE: Weekly

DAY_CYCLE: Daily

HOUR_CYCLE: Hourly

MINUTE_CYCLE: Minute-level

CRONTAB_CYCLE: Crontab expression-based
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * Task owner id.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Folder id
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Workflow id of the task.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * **Execution resource group Id**.
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * **Instance Scheduled Time Filter Condition** specifies the filter start time in the time format yyyy-MM-dd HH:MM:ss.
    */
    @SerializedName("ScheduleTimeFrom")
    @Expose
    private String ScheduleTimeFrom;

    /**
    * **Instance Scheduled Time Filter Condition** specifies the cutoff time in the format of yyyy-MM-dd HH:MM:ss.
    */
    @SerializedName("ScheduleTimeTo")
    @Expose
    private String ScheduleTimeTo;

    /**
    * **Instance Execution Start Time Filter Condition** specifies the start time for filtering. time format: yyyy-MM-dd HH:MM:ss.
    */
    @SerializedName("StartTimeFrom")
    @Expose
    private String StartTimeFrom;

    /**
    * **Instance Execution Start Time Filter Condition**.
Expiration time in yyyy-MM-dd HH:MM:ss format.
    */
    @SerializedName("StartTimeTo")
    @Expose
    private String StartTimeTo;

    /**
    * **Instance Last Update Time Filter Condition**.
Expiration time in yyyy-MM-dd HH:MM:ss format.
    */
    @SerializedName("LastUpdateTimeFrom")
    @Expose
    private String LastUpdateTimeFrom;

    /**
    * **Instance Last Update Time Filter Condition**.
Expiration time in yyyy-MM-dd HH:MM:ss format.
    */
    @SerializedName("LastUpdateTimeTo")
    @Expose
    private String LastUpdateTimeTo;

    /**
    * **Query Result Sorting Field**

SCHEDULE_DATE: Sort by scheduled execution time

START_TIME: Sort by actual execution start time

END_TIME: Sort by actual execution end time

COST_TIME: Sort by execution duration
    */
    @SerializedName("SortColumn")
    @Expose
    private String SortColumn;

    /**
    * **Instance Sorting Order**

- ASC 
- DESC
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
     * Get **Project ID**. specifies the project ID. 
     * @return ProjectId **Project ID**. specifies the project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set **Project ID**. specifies the project ID.
     * @param ProjectId **Project ID**. specifies the project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get **Page number. integer.**.
Used in conjunction with pageSize and cannot be less than 1. default value: 1. 
     * @return PageNumber **Page number. integer.**.
Used in conjunction with pageSize and cannot be less than 1. default value: 1.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set **Page number. integer.**.
Used in conjunction with pageSize and cannot be less than 1. default value: 1.
     * @param PageNumber **Page number. integer.**.
Used in conjunction with pageSize and cannot be less than 1. default value: 1.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Specifies the number of items to display per page. default: 10. value range: 1-100. 
     * @return PageSize Specifies the number of items to display per page. default: 10. value range: 1-100.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Specifies the number of items to display per page. default: 10. value range: 1-100.
     * @param PageSize Specifies the number of items to display per page. default: 10. value range: 1-100.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Task name or task ID.
Supports fuzzy search filtering. multiple values are separated by commas. 
     * @return Keyword Task name or task ID.
Supports fuzzy search filtering. multiple values are separated by commas.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Task name or task ID.
Supports fuzzy search filtering. multiple values are separated by commas.
     * @param Keyword Task name or task ID.
Supports fuzzy search filtering. multiple values are separated by commas.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get **Time zone** timeZone, specifies the time zone of the passed in time string. default UTC+8. 
     * @return TimeZone **Time zone** timeZone, specifies the time zone of the passed in time string. default UTC+8.
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set **Time zone** timeZone, specifies the time zone of the passed in time string. default UTC+8.
     * @param TimeZone **Time zone** timeZone, specifies the time zone of the passed in time string. default UTC+8.
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get **Instance Type**

0 - Backfill instance

1 - Cyclic (scheduled) instance

2 - Non-cyclic (non-scheduled) instance 
     * @return InstanceType **Instance Type**

0 - Backfill instance

1 - Cyclic (scheduled) instance

2 - Non-cyclic (non-scheduled) instance
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set **Instance Type**

0 - Backfill instance

1 - Cyclic (scheduled) instance

2 - Non-cyclic (non-scheduled) instance
     * @param InstanceType **Instance Type**

0 - Backfill instance

1 - Cyclic (scheduled) instance

2 - Non-cyclic (non-scheduled) instance
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get **Instance Status**

WAIT_EVENT: Waiting for event

WAIT_UPSTREAM: Waiting for upstream

WAIT_RUN: Waiting to run

RUNNING: Running

SKIP_RUNNING: Skipped

FAILED_RETRY: Retrying after failure

EXPIRED: Failed

COMPLETED: Succeeded 
     * @return InstanceState **Instance Status**

WAIT_EVENT: Waiting for event

WAIT_UPSTREAM: Waiting for upstream

WAIT_RUN: Waiting to run

RUNNING: Running

SKIP_RUNNING: Skipped

FAILED_RETRY: Retrying after failure

EXPIRED: Failed

COMPLETED: Succeeded
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set **Instance Status**

WAIT_EVENT: Waiting for event

WAIT_UPSTREAM: Waiting for upstream

WAIT_RUN: Waiting to run

RUNNING: Running

SKIP_RUNNING: Skipped

FAILED_RETRY: Retrying after failure

EXPIRED: Failed

COMPLETED: Succeeded
     * @param InstanceState **Instance Status**

WAIT_EVENT: Waiting for event

WAIT_UPSTREAM: Waiting for upstream

WAIT_RUN: Waiting to run

RUNNING: Running

SKIP_RUNNING: Skipped

FAILED_RETRY: Retrying after failure

EXPIRED: Failed

COMPLETED: Succeeded
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get Task type Id. 
     * @return TaskTypeId Task type Id.
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set Task type Id.
     * @param TaskTypeId Task type Id.
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get **Task Cycle Type**

ONEOFF_CYCLE: One-time

YEAR_CYCLE: Yearly

MONTH_CYCLE: Monthly

WEEK_CYCLE: Weekly

DAY_CYCLE: Daily

HOUR_CYCLE: Hourly

MINUTE_CYCLE: Minute-level

CRONTAB_CYCLE: Crontab expression-based 
     * @return CycleType **Task Cycle Type**

ONEOFF_CYCLE: One-time

YEAR_CYCLE: Yearly

MONTH_CYCLE: Monthly

WEEK_CYCLE: Weekly

DAY_CYCLE: Daily

HOUR_CYCLE: Hourly

MINUTE_CYCLE: Minute-level

CRONTAB_CYCLE: Crontab expression-based
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set **Task Cycle Type**

ONEOFF_CYCLE: One-time

YEAR_CYCLE: Yearly

MONTH_CYCLE: Monthly

WEEK_CYCLE: Weekly

DAY_CYCLE: Daily

HOUR_CYCLE: Hourly

MINUTE_CYCLE: Minute-level

CRONTAB_CYCLE: Crontab expression-based
     * @param CycleType **Task Cycle Type**

ONEOFF_CYCLE: One-time

YEAR_CYCLE: Yearly

MONTH_CYCLE: Monthly

WEEK_CYCLE: Weekly

DAY_CYCLE: Daily

HOUR_CYCLE: Hourly

MINUTE_CYCLE: Minute-level

CRONTAB_CYCLE: Crontab expression-based
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Task owner id. 
     * @return OwnerUin Task owner id.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Task owner id.
     * @param OwnerUin Task owner id.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Folder id 
     * @return FolderId Folder id
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder id
     * @param FolderId Folder id
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Workflow id of the task. 
     * @return WorkflowId Workflow id of the task.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow id of the task.
     * @param WorkflowId Workflow id of the task.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get **Execution resource group Id**. 
     * @return ExecutorGroupId **Execution resource group Id**.
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set **Execution resource group Id**.
     * @param ExecutorGroupId **Execution resource group Id**.
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get **Instance Scheduled Time Filter Condition** specifies the filter start time in the time format yyyy-MM-dd HH:MM:ss. 
     * @return ScheduleTimeFrom **Instance Scheduled Time Filter Condition** specifies the filter start time in the time format yyyy-MM-dd HH:MM:ss.
     */
    public String getScheduleTimeFrom() {
        return this.ScheduleTimeFrom;
    }

    /**
     * Set **Instance Scheduled Time Filter Condition** specifies the filter start time in the time format yyyy-MM-dd HH:MM:ss.
     * @param ScheduleTimeFrom **Instance Scheduled Time Filter Condition** specifies the filter start time in the time format yyyy-MM-dd HH:MM:ss.
     */
    public void setScheduleTimeFrom(String ScheduleTimeFrom) {
        this.ScheduleTimeFrom = ScheduleTimeFrom;
    }

    /**
     * Get **Instance Scheduled Time Filter Condition** specifies the cutoff time in the format of yyyy-MM-dd HH:MM:ss. 
     * @return ScheduleTimeTo **Instance Scheduled Time Filter Condition** specifies the cutoff time in the format of yyyy-MM-dd HH:MM:ss.
     */
    public String getScheduleTimeTo() {
        return this.ScheduleTimeTo;
    }

    /**
     * Set **Instance Scheduled Time Filter Condition** specifies the cutoff time in the format of yyyy-MM-dd HH:MM:ss.
     * @param ScheduleTimeTo **Instance Scheduled Time Filter Condition** specifies the cutoff time in the format of yyyy-MM-dd HH:MM:ss.
     */
    public void setScheduleTimeTo(String ScheduleTimeTo) {
        this.ScheduleTimeTo = ScheduleTimeTo;
    }

    /**
     * Get **Instance Execution Start Time Filter Condition** specifies the start time for filtering. time format: yyyy-MM-dd HH:MM:ss. 
     * @return StartTimeFrom **Instance Execution Start Time Filter Condition** specifies the start time for filtering. time format: yyyy-MM-dd HH:MM:ss.
     */
    public String getStartTimeFrom() {
        return this.StartTimeFrom;
    }

    /**
     * Set **Instance Execution Start Time Filter Condition** specifies the start time for filtering. time format: yyyy-MM-dd HH:MM:ss.
     * @param StartTimeFrom **Instance Execution Start Time Filter Condition** specifies the start time for filtering. time format: yyyy-MM-dd HH:MM:ss.
     */
    public void setStartTimeFrom(String StartTimeFrom) {
        this.StartTimeFrom = StartTimeFrom;
    }

    /**
     * Get **Instance Execution Start Time Filter Condition**.
Expiration time in yyyy-MM-dd HH:MM:ss format. 
     * @return StartTimeTo **Instance Execution Start Time Filter Condition**.
Expiration time in yyyy-MM-dd HH:MM:ss format.
     */
    public String getStartTimeTo() {
        return this.StartTimeTo;
    }

    /**
     * Set **Instance Execution Start Time Filter Condition**.
Expiration time in yyyy-MM-dd HH:MM:ss format.
     * @param StartTimeTo **Instance Execution Start Time Filter Condition**.
Expiration time in yyyy-MM-dd HH:MM:ss format.
     */
    public void setStartTimeTo(String StartTimeTo) {
        this.StartTimeTo = StartTimeTo;
    }

    /**
     * Get **Instance Last Update Time Filter Condition**.
Expiration time in yyyy-MM-dd HH:MM:ss format. 
     * @return LastUpdateTimeFrom **Instance Last Update Time Filter Condition**.
Expiration time in yyyy-MM-dd HH:MM:ss format.
     */
    public String getLastUpdateTimeFrom() {
        return this.LastUpdateTimeFrom;
    }

    /**
     * Set **Instance Last Update Time Filter Condition**.
Expiration time in yyyy-MM-dd HH:MM:ss format.
     * @param LastUpdateTimeFrom **Instance Last Update Time Filter Condition**.
Expiration time in yyyy-MM-dd HH:MM:ss format.
     */
    public void setLastUpdateTimeFrom(String LastUpdateTimeFrom) {
        this.LastUpdateTimeFrom = LastUpdateTimeFrom;
    }

    /**
     * Get **Instance Last Update Time Filter Condition**.
Expiration time in yyyy-MM-dd HH:MM:ss format. 
     * @return LastUpdateTimeTo **Instance Last Update Time Filter Condition**.
Expiration time in yyyy-MM-dd HH:MM:ss format.
     */
    public String getLastUpdateTimeTo() {
        return this.LastUpdateTimeTo;
    }

    /**
     * Set **Instance Last Update Time Filter Condition**.
Expiration time in yyyy-MM-dd HH:MM:ss format.
     * @param LastUpdateTimeTo **Instance Last Update Time Filter Condition**.
Expiration time in yyyy-MM-dd HH:MM:ss format.
     */
    public void setLastUpdateTimeTo(String LastUpdateTimeTo) {
        this.LastUpdateTimeTo = LastUpdateTimeTo;
    }

    /**
     * Get **Query Result Sorting Field**

SCHEDULE_DATE: Sort by scheduled execution time

START_TIME: Sort by actual execution start time

END_TIME: Sort by actual execution end time

COST_TIME: Sort by execution duration 
     * @return SortColumn **Query Result Sorting Field**

SCHEDULE_DATE: Sort by scheduled execution time

START_TIME: Sort by actual execution start time

END_TIME: Sort by actual execution end time

COST_TIME: Sort by execution duration
     */
    public String getSortColumn() {
        return this.SortColumn;
    }

    /**
     * Set **Query Result Sorting Field**

SCHEDULE_DATE: Sort by scheduled execution time

START_TIME: Sort by actual execution start time

END_TIME: Sort by actual execution end time

COST_TIME: Sort by execution duration
     * @param SortColumn **Query Result Sorting Field**

SCHEDULE_DATE: Sort by scheduled execution time

START_TIME: Sort by actual execution start time

END_TIME: Sort by actual execution end time

COST_TIME: Sort by execution duration
     */
    public void setSortColumn(String SortColumn) {
        this.SortColumn = SortColumn;
    }

    /**
     * Get **Instance Sorting Order**

- ASC 
- DESC 
     * @return SortType **Instance Sorting Order**

- ASC 
- DESC
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set **Instance Sorting Order**

- ASC 
- DESC
     * @param SortType **Instance Sorting Order**

- ASC 
- DESC
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    public ListTaskInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTaskInstancesRequest(ListTaskInstancesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.ScheduleTimeFrom != null) {
            this.ScheduleTimeFrom = new String(source.ScheduleTimeFrom);
        }
        if (source.ScheduleTimeTo != null) {
            this.ScheduleTimeTo = new String(source.ScheduleTimeTo);
        }
        if (source.StartTimeFrom != null) {
            this.StartTimeFrom = new String(source.StartTimeFrom);
        }
        if (source.StartTimeTo != null) {
            this.StartTimeTo = new String(source.StartTimeTo);
        }
        if (source.LastUpdateTimeFrom != null) {
            this.LastUpdateTimeFrom = new String(source.LastUpdateTimeFrom);
        }
        if (source.LastUpdateTimeTo != null) {
            this.LastUpdateTimeTo = new String(source.LastUpdateTimeTo);
        }
        if (source.SortColumn != null) {
            this.SortColumn = new String(source.SortColumn);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "ScheduleTimeFrom", this.ScheduleTimeFrom);
        this.setParamSimple(map, prefix + "ScheduleTimeTo", this.ScheduleTimeTo);
        this.setParamSimple(map, prefix + "StartTimeFrom", this.StartTimeFrom);
        this.setParamSimple(map, prefix + "StartTimeTo", this.StartTimeTo);
        this.setParamSimple(map, prefix + "LastUpdateTimeFrom", this.LastUpdateTimeFrom);
        this.setParamSimple(map, prefix + "LastUpdateTimeTo", this.LastUpdateTimeTo);
        this.setParamSimple(map, prefix + "SortColumn", this.SortColumn);
        this.setParamSimple(map, prefix + "SortType", this.SortType);

    }
}

