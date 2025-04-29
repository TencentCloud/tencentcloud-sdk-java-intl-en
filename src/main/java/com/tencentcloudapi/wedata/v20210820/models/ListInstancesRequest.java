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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListInstancesRequest extends AbstractModel {

    /**
    * **Project ID**.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Filter criteria for instance planned scheduling time.
Specifies the start time for filtering. the time format is yyyy-MM-dd HH:MM:ss.
    */
    @SerializedName("ScheduleTimeFrom")
    @Expose
    private String ScheduleTimeFrom;

    /**
    * Filter criteria for instance planned scheduling time.
Filter expiration time. the time format is yyyy-MM-dd HH:MM:ss.
    */
    @SerializedName("ScheduleTimeTo")
    @Expose
    private String ScheduleTimeTo;

    /**
    * Page number, integer.
Use in conjunction with pageSize and cannot be less than 1. the default value is 1.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of items per page, integer.
Use in conjunction with pageNumber and should not exceed 200. default value: 10.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Sorting field for query results.

-SCHEDULE_DATE indicates sorting based on the planned scheduling time.
-START_TIME indicates sorting by the instance's start execution time.
-END_TIME indicates sorting based on the instance execution end time.
-COST_TIME indicates sorting based on instance execution duration.
    */
    @SerializedName("SortColumn")
    @Expose
    private String SortColumn;

    /**
    * Instance sorting order.

- ASC 
- DESC
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * Instance type.

-0 indicates Replenished Instance.
-1 indicates Periodic Instance.
-2 indicates Non-Periodic instance.
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Instance execution status.
Support filtering multiple items with an "or" relationship between conditions.

-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22] indicate running.
-[21] indicates skipping running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
    */
    @SerializedName("InstanceStateList")
    @Expose
    private Long [] InstanceStateList;

    /**
    * **Task type Id** specifies the identifier for the task type.

-Supports filtering multiple items with an or relationship between conditions.
-You can use the DescribeAllTaskType API to obtain all task types supported by the project.
    */
    @SerializedName("TaskTypeIdList")
    @Expose
    private Long [] TaskTypeIdList;

    /**
    * Task cycle type.
Supports filtering multiple conditions with an or relationship between them.
* O: ONEOFF_CYCLE
* Y: YEAR_CYCLE
* M: MONTH_CYCLE
* W: WEEK_CYCLE
* D: DAY_CYCLE
* H: HOUR_CYCLE
* I: MINUTE_CYCLE
* C: CRONTAB_CYCLE
    */
    @SerializedName("TaskCycleList")
    @Expose
    private String [] TaskCycleList;

    /**
    * Task name or task ID.
Supports fuzzy search filtering. multiple items are separated by english commas.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Task owner.
Support filtering multiple items with an or relationship between conditions.
    */
    @SerializedName("InChargeList")
    @Expose
    private String [] InChargeList;

    /**
    * File to which the task belongs.
Supports filtering multiple conditions with an or relationship between them.
The FindAllFolder API can be used to obtain the folder list under a project.
    */
    @SerializedName("TaskFolderIdList")
    @Expose
    private String [] TaskFolderIdList;

    /**
    * **Associated workflow of the task**.
Supports filtering multiple conditions with an or relationship between them.
The workflow list under a project can be obtained through the DescribeOpsWorkflows api.
    */
    @SerializedName("WorkflowIdList")
    @Expose
    private String [] WorkflowIdList;

    /**
    * Execution resource group Id.
Supports filtering multiple conditions with an or relationship between them.
The scheduling resource group list under the project can be obtained through the DescribeNormalSchedulerExecutorGroups api.
The DescribeNormalIntegrationExecutorGroups API can be used to obtain the list of all integration resource groups under a project.
    */
    @SerializedName("ExecutorGroupIdList")
    @Expose
    private String [] ExecutorGroupIdList;

    /**
    * Instance execution start time filter criteria.
Specifies the start time for filtering. the time format is yyyy-MM-dd HH:MM:ss.
    */
    @SerializedName("StartTimeFrom")
    @Expose
    private String StartTimeFrom;

    /**
    * Instance execution start time filter criteria.
Filter expiration time. the time format is yyyy-MM-dd HH:MM:ss.
    */
    @SerializedName("StartTimeTo")
    @Expose
    private String StartTimeTo;

    /**
    * Time zone.
Time zone. specifies the time zone. the default value is UTC+8.
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
     * Get **Project ID**. 
     * @return ProjectId **Project ID**.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set **Project ID**.
     * @param ProjectId **Project ID**.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Filter criteria for instance planned scheduling time.
Specifies the start time for filtering. the time format is yyyy-MM-dd HH:MM:ss. 
     * @return ScheduleTimeFrom Filter criteria for instance planned scheduling time.
Specifies the start time for filtering. the time format is yyyy-MM-dd HH:MM:ss.
     */
    public String getScheduleTimeFrom() {
        return this.ScheduleTimeFrom;
    }

    /**
     * Set Filter criteria for instance planned scheduling time.
Specifies the start time for filtering. the time format is yyyy-MM-dd HH:MM:ss.
     * @param ScheduleTimeFrom Filter criteria for instance planned scheduling time.
Specifies the start time for filtering. the time format is yyyy-MM-dd HH:MM:ss.
     */
    public void setScheduleTimeFrom(String ScheduleTimeFrom) {
        this.ScheduleTimeFrom = ScheduleTimeFrom;
    }

    /**
     * Get Filter criteria for instance planned scheduling time.
Filter expiration time. the time format is yyyy-MM-dd HH:MM:ss. 
     * @return ScheduleTimeTo Filter criteria for instance planned scheduling time.
Filter expiration time. the time format is yyyy-MM-dd HH:MM:ss.
     */
    public String getScheduleTimeTo() {
        return this.ScheduleTimeTo;
    }

    /**
     * Set Filter criteria for instance planned scheduling time.
Filter expiration time. the time format is yyyy-MM-dd HH:MM:ss.
     * @param ScheduleTimeTo Filter criteria for instance planned scheduling time.
Filter expiration time. the time format is yyyy-MM-dd HH:MM:ss.
     */
    public void setScheduleTimeTo(String ScheduleTimeTo) {
        this.ScheduleTimeTo = ScheduleTimeTo;
    }

    /**
     * Get Page number, integer.
Use in conjunction with pageSize and cannot be less than 1. the default value is 1. 
     * @return PageNumber Page number, integer.
Use in conjunction with pageSize and cannot be less than 1. the default value is 1.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number, integer.
Use in conjunction with pageSize and cannot be less than 1. the default value is 1.
     * @param PageNumber Page number, integer.
Use in conjunction with pageSize and cannot be less than 1. the default value is 1.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of items per page, integer.
Use in conjunction with pageNumber and should not exceed 200. default value: 10. 
     * @return PageSize Number of items per page, integer.
Use in conjunction with pageNumber and should not exceed 200. default value: 10.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items per page, integer.
Use in conjunction with pageNumber and should not exceed 200. default value: 10.
     * @param PageSize Number of items per page, integer.
Use in conjunction with pageNumber and should not exceed 200. default value: 10.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Sorting field for query results.

-SCHEDULE_DATE indicates sorting based on the planned scheduling time.
-START_TIME indicates sorting by the instance's start execution time.
-END_TIME indicates sorting based on the instance execution end time.
-COST_TIME indicates sorting based on instance execution duration. 
     * @return SortColumn Sorting field for query results.

-SCHEDULE_DATE indicates sorting based on the planned scheduling time.
-START_TIME indicates sorting by the instance's start execution time.
-END_TIME indicates sorting based on the instance execution end time.
-COST_TIME indicates sorting based on instance execution duration.
     */
    public String getSortColumn() {
        return this.SortColumn;
    }

    /**
     * Set Sorting field for query results.

-SCHEDULE_DATE indicates sorting based on the planned scheduling time.
-START_TIME indicates sorting by the instance's start execution time.
-END_TIME indicates sorting based on the instance execution end time.
-COST_TIME indicates sorting based on instance execution duration.
     * @param SortColumn Sorting field for query results.

-SCHEDULE_DATE indicates sorting based on the planned scheduling time.
-START_TIME indicates sorting by the instance's start execution time.
-END_TIME indicates sorting based on the instance execution end time.
-COST_TIME indicates sorting based on instance execution duration.
     */
    public void setSortColumn(String SortColumn) {
        this.SortColumn = SortColumn;
    }

    /**
     * Get Instance sorting order.

- ASC 
- DESC 
     * @return SortType Instance sorting order.

- ASC 
- DESC
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set Instance sorting order.

- ASC 
- DESC
     * @param SortType Instance sorting order.

- ASC 
- DESC
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get Instance type.

-0 indicates Replenished Instance.
-1 indicates Periodic Instance.
-2 indicates Non-Periodic instance. 
     * @return InstanceType Instance type.

-0 indicates Replenished Instance.
-1 indicates Periodic Instance.
-2 indicates Non-Periodic instance.
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type.

-0 indicates Replenished Instance.
-1 indicates Periodic Instance.
-2 indicates Non-Periodic instance.
     * @param InstanceType Instance type.

-0 indicates Replenished Instance.
-1 indicates Periodic Instance.
-2 indicates Non-Periodic instance.
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance execution status.
Support filtering multiple items with an "or" relationship between conditions.

-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22] indicate running.
-[21] indicates skipping running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success. 
     * @return InstanceStateList Instance execution status.
Support filtering multiple items with an "or" relationship between conditions.

-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22] indicate running.
-[21] indicates skipping running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
     */
    public Long [] getInstanceStateList() {
        return this.InstanceStateList;
    }

    /**
     * Set Instance execution status.
Support filtering multiple items with an "or" relationship between conditions.

-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22] indicate running.
-[21] indicates skipping running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
     * @param InstanceStateList Instance execution status.
Support filtering multiple items with an "or" relationship between conditions.

-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22] indicate running.
-[21] indicates skipping running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
     */
    public void setInstanceStateList(Long [] InstanceStateList) {
        this.InstanceStateList = InstanceStateList;
    }

    /**
     * Get **Task type Id** specifies the identifier for the task type.

-Supports filtering multiple items with an or relationship between conditions.
-You can use the DescribeAllTaskType API to obtain all task types supported by the project. 
     * @return TaskTypeIdList **Task type Id** specifies the identifier for the task type.

-Supports filtering multiple items with an or relationship between conditions.
-You can use the DescribeAllTaskType API to obtain all task types supported by the project.
     */
    public Long [] getTaskTypeIdList() {
        return this.TaskTypeIdList;
    }

    /**
     * Set **Task type Id** specifies the identifier for the task type.

-Supports filtering multiple items with an or relationship between conditions.
-You can use the DescribeAllTaskType API to obtain all task types supported by the project.
     * @param TaskTypeIdList **Task type Id** specifies the identifier for the task type.

-Supports filtering multiple items with an or relationship between conditions.
-You can use the DescribeAllTaskType API to obtain all task types supported by the project.
     */
    public void setTaskTypeIdList(Long [] TaskTypeIdList) {
        this.TaskTypeIdList = TaskTypeIdList;
    }

    /**
     * Get Task cycle type.
Supports filtering multiple conditions with an or relationship between them.
* O: ONEOFF_CYCLE
* Y: YEAR_CYCLE
* M: MONTH_CYCLE
* W: WEEK_CYCLE
* D: DAY_CYCLE
* H: HOUR_CYCLE
* I: MINUTE_CYCLE
* C: CRONTAB_CYCLE 
     * @return TaskCycleList Task cycle type.
Supports filtering multiple conditions with an or relationship between them.
* O: ONEOFF_CYCLE
* Y: YEAR_CYCLE
* M: MONTH_CYCLE
* W: WEEK_CYCLE
* D: DAY_CYCLE
* H: HOUR_CYCLE
* I: MINUTE_CYCLE
* C: CRONTAB_CYCLE
     */
    public String [] getTaskCycleList() {
        return this.TaskCycleList;
    }

    /**
     * Set Task cycle type.
Supports filtering multiple conditions with an or relationship between them.
* O: ONEOFF_CYCLE
* Y: YEAR_CYCLE
* M: MONTH_CYCLE
* W: WEEK_CYCLE
* D: DAY_CYCLE
* H: HOUR_CYCLE
* I: MINUTE_CYCLE
* C: CRONTAB_CYCLE
     * @param TaskCycleList Task cycle type.
Supports filtering multiple conditions with an or relationship between them.
* O: ONEOFF_CYCLE
* Y: YEAR_CYCLE
* M: MONTH_CYCLE
* W: WEEK_CYCLE
* D: DAY_CYCLE
* H: HOUR_CYCLE
* I: MINUTE_CYCLE
* C: CRONTAB_CYCLE
     */
    public void setTaskCycleList(String [] TaskCycleList) {
        this.TaskCycleList = TaskCycleList;
    }

    /**
     * Get Task name or task ID.
Supports fuzzy search filtering. multiple items are separated by english commas. 
     * @return Keyword Task name or task ID.
Supports fuzzy search filtering. multiple items are separated by english commas.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Task name or task ID.
Supports fuzzy search filtering. multiple items are separated by english commas.
     * @param Keyword Task name or task ID.
Supports fuzzy search filtering. multiple items are separated by english commas.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Task owner.
Support filtering multiple items with an or relationship between conditions. 
     * @return InChargeList Task owner.
Support filtering multiple items with an or relationship between conditions.
     */
    public String [] getInChargeList() {
        return this.InChargeList;
    }

    /**
     * Set Task owner.
Support filtering multiple items with an or relationship between conditions.
     * @param InChargeList Task owner.
Support filtering multiple items with an or relationship between conditions.
     */
    public void setInChargeList(String [] InChargeList) {
        this.InChargeList = InChargeList;
    }

    /**
     * Get File to which the task belongs.
Supports filtering multiple conditions with an or relationship between them.
The FindAllFolder API can be used to obtain the folder list under a project. 
     * @return TaskFolderIdList File to which the task belongs.
Supports filtering multiple conditions with an or relationship between them.
The FindAllFolder API can be used to obtain the folder list under a project.
     */
    public String [] getTaskFolderIdList() {
        return this.TaskFolderIdList;
    }

    /**
     * Set File to which the task belongs.
Supports filtering multiple conditions with an or relationship between them.
The FindAllFolder API can be used to obtain the folder list under a project.
     * @param TaskFolderIdList File to which the task belongs.
Supports filtering multiple conditions with an or relationship between them.
The FindAllFolder API can be used to obtain the folder list under a project.
     */
    public void setTaskFolderIdList(String [] TaskFolderIdList) {
        this.TaskFolderIdList = TaskFolderIdList;
    }

    /**
     * Get **Associated workflow of the task**.
Supports filtering multiple conditions with an or relationship between them.
The workflow list under a project can be obtained through the DescribeOpsWorkflows api. 
     * @return WorkflowIdList **Associated workflow of the task**.
Supports filtering multiple conditions with an or relationship between them.
The workflow list under a project can be obtained through the DescribeOpsWorkflows api.
     */
    public String [] getWorkflowIdList() {
        return this.WorkflowIdList;
    }

    /**
     * Set **Associated workflow of the task**.
Supports filtering multiple conditions with an or relationship between them.
The workflow list under a project can be obtained through the DescribeOpsWorkflows api.
     * @param WorkflowIdList **Associated workflow of the task**.
Supports filtering multiple conditions with an or relationship between them.
The workflow list under a project can be obtained through the DescribeOpsWorkflows api.
     */
    public void setWorkflowIdList(String [] WorkflowIdList) {
        this.WorkflowIdList = WorkflowIdList;
    }

    /**
     * Get Execution resource group Id.
Supports filtering multiple conditions with an or relationship between them.
The scheduling resource group list under the project can be obtained through the DescribeNormalSchedulerExecutorGroups api.
The DescribeNormalIntegrationExecutorGroups API can be used to obtain the list of all integration resource groups under a project. 
     * @return ExecutorGroupIdList Execution resource group Id.
Supports filtering multiple conditions with an or relationship between them.
The scheduling resource group list under the project can be obtained through the DescribeNormalSchedulerExecutorGroups api.
The DescribeNormalIntegrationExecutorGroups API can be used to obtain the list of all integration resource groups under a project.
     */
    public String [] getExecutorGroupIdList() {
        return this.ExecutorGroupIdList;
    }

    /**
     * Set Execution resource group Id.
Supports filtering multiple conditions with an or relationship between them.
The scheduling resource group list under the project can be obtained through the DescribeNormalSchedulerExecutorGroups api.
The DescribeNormalIntegrationExecutorGroups API can be used to obtain the list of all integration resource groups under a project.
     * @param ExecutorGroupIdList Execution resource group Id.
Supports filtering multiple conditions with an or relationship between them.
The scheduling resource group list under the project can be obtained through the DescribeNormalSchedulerExecutorGroups api.
The DescribeNormalIntegrationExecutorGroups API can be used to obtain the list of all integration resource groups under a project.
     */
    public void setExecutorGroupIdList(String [] ExecutorGroupIdList) {
        this.ExecutorGroupIdList = ExecutorGroupIdList;
    }

    /**
     * Get Instance execution start time filter criteria.
Specifies the start time for filtering. the time format is yyyy-MM-dd HH:MM:ss. 
     * @return StartTimeFrom Instance execution start time filter criteria.
Specifies the start time for filtering. the time format is yyyy-MM-dd HH:MM:ss.
     */
    public String getStartTimeFrom() {
        return this.StartTimeFrom;
    }

    /**
     * Set Instance execution start time filter criteria.
Specifies the start time for filtering. the time format is yyyy-MM-dd HH:MM:ss.
     * @param StartTimeFrom Instance execution start time filter criteria.
Specifies the start time for filtering. the time format is yyyy-MM-dd HH:MM:ss.
     */
    public void setStartTimeFrom(String StartTimeFrom) {
        this.StartTimeFrom = StartTimeFrom;
    }

    /**
     * Get Instance execution start time filter criteria.
Filter expiration time. the time format is yyyy-MM-dd HH:MM:ss. 
     * @return StartTimeTo Instance execution start time filter criteria.
Filter expiration time. the time format is yyyy-MM-dd HH:MM:ss.
     */
    public String getStartTimeTo() {
        return this.StartTimeTo;
    }

    /**
     * Set Instance execution start time filter criteria.
Filter expiration time. the time format is yyyy-MM-dd HH:MM:ss.
     * @param StartTimeTo Instance execution start time filter criteria.
Filter expiration time. the time format is yyyy-MM-dd HH:MM:ss.
     */
    public void setStartTimeTo(String StartTimeTo) {
        this.StartTimeTo = StartTimeTo;
    }

    /**
     * Get Time zone.
Time zone. specifies the time zone. the default value is UTC+8. 
     * @return ScheduleTimeZone Time zone.
Time zone. specifies the time zone. the default value is UTC+8.
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set Time zone.
Time zone. specifies the time zone. the default value is UTC+8.
     * @param ScheduleTimeZone Time zone.
Time zone. specifies the time zone. the default value is UTC+8.
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    public ListInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListInstancesRequest(ListInstancesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScheduleTimeFrom != null) {
            this.ScheduleTimeFrom = new String(source.ScheduleTimeFrom);
        }
        if (source.ScheduleTimeTo != null) {
            this.ScheduleTimeTo = new String(source.ScheduleTimeTo);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.SortColumn != null) {
            this.SortColumn = new String(source.SortColumn);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.InstanceStateList != null) {
            this.InstanceStateList = new Long[source.InstanceStateList.length];
            for (int i = 0; i < source.InstanceStateList.length; i++) {
                this.InstanceStateList[i] = new Long(source.InstanceStateList[i]);
            }
        }
        if (source.TaskTypeIdList != null) {
            this.TaskTypeIdList = new Long[source.TaskTypeIdList.length];
            for (int i = 0; i < source.TaskTypeIdList.length; i++) {
                this.TaskTypeIdList[i] = new Long(source.TaskTypeIdList[i]);
            }
        }
        if (source.TaskCycleList != null) {
            this.TaskCycleList = new String[source.TaskCycleList.length];
            for (int i = 0; i < source.TaskCycleList.length; i++) {
                this.TaskCycleList[i] = new String(source.TaskCycleList[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.InChargeList != null) {
            this.InChargeList = new String[source.InChargeList.length];
            for (int i = 0; i < source.InChargeList.length; i++) {
                this.InChargeList[i] = new String(source.InChargeList[i]);
            }
        }
        if (source.TaskFolderIdList != null) {
            this.TaskFolderIdList = new String[source.TaskFolderIdList.length];
            for (int i = 0; i < source.TaskFolderIdList.length; i++) {
                this.TaskFolderIdList[i] = new String(source.TaskFolderIdList[i]);
            }
        }
        if (source.WorkflowIdList != null) {
            this.WorkflowIdList = new String[source.WorkflowIdList.length];
            for (int i = 0; i < source.WorkflowIdList.length; i++) {
                this.WorkflowIdList[i] = new String(source.WorkflowIdList[i]);
            }
        }
        if (source.ExecutorGroupIdList != null) {
            this.ExecutorGroupIdList = new String[source.ExecutorGroupIdList.length];
            for (int i = 0; i < source.ExecutorGroupIdList.length; i++) {
                this.ExecutorGroupIdList[i] = new String(source.ExecutorGroupIdList[i]);
            }
        }
        if (source.StartTimeFrom != null) {
            this.StartTimeFrom = new String(source.StartTimeFrom);
        }
        if (source.StartTimeTo != null) {
            this.StartTimeTo = new String(source.StartTimeTo);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScheduleTimeFrom", this.ScheduleTimeFrom);
        this.setParamSimple(map, prefix + "ScheduleTimeTo", this.ScheduleTimeTo);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SortColumn", this.SortColumn);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArraySimple(map, prefix + "InstanceStateList.", this.InstanceStateList);
        this.setParamArraySimple(map, prefix + "TaskTypeIdList.", this.TaskTypeIdList);
        this.setParamArraySimple(map, prefix + "TaskCycleList.", this.TaskCycleList);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "InChargeList.", this.InChargeList);
        this.setParamArraySimple(map, prefix + "TaskFolderIdList.", this.TaskFolderIdList);
        this.setParamArraySimple(map, prefix + "WorkflowIdList.", this.WorkflowIdList);
        this.setParamArraySimple(map, prefix + "ExecutorGroupIdList.", this.ExecutorGroupIdList);
        this.setParamSimple(map, prefix + "StartTimeFrom", this.StartTimeFrom);
        this.setParamSimple(map, prefix + "StartTimeTo", this.StartTimeTo);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);

    }
}

