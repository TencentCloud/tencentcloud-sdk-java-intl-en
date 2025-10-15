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

public class ListOpsAlarmRulesRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Page number for pagination. defaults to 1.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of items to display per page, defaults to 20, minimum value 1, maximum value 200.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Monitoring Object Type

Task-level Monitoring - Can be configured by Task / Workflow / Project:
1 = Task (default)
2 = Workflow
3 = Project

Project-level Monitoring - Monitors overall task fluctuations within a project:
7 = Project fluctuation monitoring alarm
    */
    @SerializedName("MonitorObjectType")
    @Expose
    private Long MonitorObjectType;

    /**
    * Based on task id, queries Alarm rules.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Alarm Rule Monitoring Types:

failure: Failure alarm

overtime: Timeout alarm

success: Success alarm

backTrackingOrRerunSuccess: Alarm when backfill/rerun succeeds

backTrackingOrRerunFailure: Alarm when backfill/rerun fails

projectFailureInstanceUpwardFluctuationAlarm: Alarm when the upward fluctuation rate of failed instances for the day exceeds the threshold

projectSuccessInstanceDownwardFluctuationAlarm: Alarm when the downward fluctuation rate of successful instances for the day exceeds the threshold

reconciliationFailure: Alarm when an offline reconciliation task fails

reconciliationOvertime: Alarm when an offline reconciliation task runs overtime

reconciliationMismatch: Alarm when the number of mismatched records in reconciliation exceeds the threshold
    */
    @SerializedName("AlarmType")
    @Expose
    private String AlarmType;

    /**
    * Queries Alarm rules configured with corresponding Alarm levels.
Valid values: 1. ordinary, 2. important, 3. critical.
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * Query the alarm rules associated with the configured alarm recipients.
    */
    @SerializedName("AlarmRecipientId")
    @Expose
    private String AlarmRecipientId;

    /**
    * Queries the corresponding Alarm rule based on Alarm rule id or rule name.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Specifies the creator filter for Alarm rule creation.
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * Start time of the Alarm rule create time range, in the format of 2025-08-17 00:00:00.
    */
    @SerializedName("CreateTimeFrom")
    @Expose
    private String CreateTimeFrom;

    /**
    * End time of the Alarm rule creation time range, in the format of "2025-08-26 23:59:59".

    */
    @SerializedName("CreateTimeTo")
    @Expose
    private String CreateTimeTo;

    /**
    * Filters Alarm rules by last update time, in the format of "2025-08-26 00:00:00".

    */
    @SerializedName("UpdateTimeFrom")
    @Expose
    private String UpdateTimeFrom;

    /**
    * Filters Alarm rules by last update time in the format of "2025-08-26 23:59:59".

    */
    @SerializedName("UpdateTimeTo")
    @Expose
    private String UpdateTimeTo;

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
     * Get Page number for pagination. defaults to 1. 
     * @return PageNumber Page number for pagination. defaults to 1.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number for pagination. defaults to 1.
     * @param PageNumber Page number for pagination. defaults to 1.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of items to display per page, defaults to 20, minimum value 1, maximum value 200. 
     * @return PageSize Number of items to display per page, defaults to 20, minimum value 1, maximum value 200.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items to display per page, defaults to 20, minimum value 1, maximum value 200.
     * @param PageSize Number of items to display per page, defaults to 20, minimum value 1, maximum value 200.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Monitoring Object Type

Task-level Monitoring - Can be configured by Task / Workflow / Project:
1 = Task (default)
2 = Workflow
3 = Project

Project-level Monitoring - Monitors overall task fluctuations within a project:
7 = Project fluctuation monitoring alarm 
     * @return MonitorObjectType Monitoring Object Type

Task-level Monitoring - Can be configured by Task / Workflow / Project:
1 = Task (default)
2 = Workflow
3 = Project

Project-level Monitoring - Monitors overall task fluctuations within a project:
7 = Project fluctuation monitoring alarm
     */
    public Long getMonitorObjectType() {
        return this.MonitorObjectType;
    }

    /**
     * Set Monitoring Object Type

Task-level Monitoring - Can be configured by Task / Workflow / Project:
1 = Task (default)
2 = Workflow
3 = Project

Project-level Monitoring - Monitors overall task fluctuations within a project:
7 = Project fluctuation monitoring alarm
     * @param MonitorObjectType Monitoring Object Type

Task-level Monitoring - Can be configured by Task / Workflow / Project:
1 = Task (default)
2 = Workflow
3 = Project

Project-level Monitoring - Monitors overall task fluctuations within a project:
7 = Project fluctuation monitoring alarm
     */
    public void setMonitorObjectType(Long MonitorObjectType) {
        this.MonitorObjectType = MonitorObjectType;
    }

    /**
     * Get Based on task id, queries Alarm rules. 
     * @return TaskId Based on task id, queries Alarm rules.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Based on task id, queries Alarm rules.
     * @param TaskId Based on task id, queries Alarm rules.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Alarm Rule Monitoring Types:

failure: Failure alarm

overtime: Timeout alarm

success: Success alarm

backTrackingOrRerunSuccess: Alarm when backfill/rerun succeeds

backTrackingOrRerunFailure: Alarm when backfill/rerun fails

projectFailureInstanceUpwardFluctuationAlarm: Alarm when the upward fluctuation rate of failed instances for the day exceeds the threshold

projectSuccessInstanceDownwardFluctuationAlarm: Alarm when the downward fluctuation rate of successful instances for the day exceeds the threshold

reconciliationFailure: Alarm when an offline reconciliation task fails

reconciliationOvertime: Alarm when an offline reconciliation task runs overtime

reconciliationMismatch: Alarm when the number of mismatched records in reconciliation exceeds the threshold 
     * @return AlarmType Alarm Rule Monitoring Types:

failure: Failure alarm

overtime: Timeout alarm

success: Success alarm

backTrackingOrRerunSuccess: Alarm when backfill/rerun succeeds

backTrackingOrRerunFailure: Alarm when backfill/rerun fails

projectFailureInstanceUpwardFluctuationAlarm: Alarm when the upward fluctuation rate of failed instances for the day exceeds the threshold

projectSuccessInstanceDownwardFluctuationAlarm: Alarm when the downward fluctuation rate of successful instances for the day exceeds the threshold

reconciliationFailure: Alarm when an offline reconciliation task fails

reconciliationOvertime: Alarm when an offline reconciliation task runs overtime

reconciliationMismatch: Alarm when the number of mismatched records in reconciliation exceeds the threshold
     */
    public String getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set Alarm Rule Monitoring Types:

failure: Failure alarm

overtime: Timeout alarm

success: Success alarm

backTrackingOrRerunSuccess: Alarm when backfill/rerun succeeds

backTrackingOrRerunFailure: Alarm when backfill/rerun fails

projectFailureInstanceUpwardFluctuationAlarm: Alarm when the upward fluctuation rate of failed instances for the day exceeds the threshold

projectSuccessInstanceDownwardFluctuationAlarm: Alarm when the downward fluctuation rate of successful instances for the day exceeds the threshold

reconciliationFailure: Alarm when an offline reconciliation task fails

reconciliationOvertime: Alarm when an offline reconciliation task runs overtime

reconciliationMismatch: Alarm when the number of mismatched records in reconciliation exceeds the threshold
     * @param AlarmType Alarm Rule Monitoring Types:

failure: Failure alarm

overtime: Timeout alarm

success: Success alarm

backTrackingOrRerunSuccess: Alarm when backfill/rerun succeeds

backTrackingOrRerunFailure: Alarm when backfill/rerun fails

projectFailureInstanceUpwardFluctuationAlarm: Alarm when the upward fluctuation rate of failed instances for the day exceeds the threshold

projectSuccessInstanceDownwardFluctuationAlarm: Alarm when the downward fluctuation rate of successful instances for the day exceeds the threshold

reconciliationFailure: Alarm when an offline reconciliation task fails

reconciliationOvertime: Alarm when an offline reconciliation task runs overtime

reconciliationMismatch: Alarm when the number of mismatched records in reconciliation exceeds the threshold
     */
    public void setAlarmType(String AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get Queries Alarm rules configured with corresponding Alarm levels.
Valid values: 1. ordinary, 2. important, 3. critical. 
     * @return AlarmLevel Queries Alarm rules configured with corresponding Alarm levels.
Valid values: 1. ordinary, 2. important, 3. critical.
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set Queries Alarm rules configured with corresponding Alarm levels.
Valid values: 1. ordinary, 2. important, 3. critical.
     * @param AlarmLevel Queries Alarm rules configured with corresponding Alarm levels.
Valid values: 1. ordinary, 2. important, 3. critical.
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get Query the alarm rules associated with the configured alarm recipients. 
     * @return AlarmRecipientId Query the alarm rules associated with the configured alarm recipients.
     */
    public String getAlarmRecipientId() {
        return this.AlarmRecipientId;
    }

    /**
     * Set Query the alarm rules associated with the configured alarm recipients.
     * @param AlarmRecipientId Query the alarm rules associated with the configured alarm recipients.
     */
    public void setAlarmRecipientId(String AlarmRecipientId) {
        this.AlarmRecipientId = AlarmRecipientId;
    }

    /**
     * Get Queries the corresponding Alarm rule based on Alarm rule id or rule name. 
     * @return Keyword Queries the corresponding Alarm rule based on Alarm rule id or rule name.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Queries the corresponding Alarm rule based on Alarm rule id or rule name.
     * @param Keyword Queries the corresponding Alarm rule based on Alarm rule id or rule name.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Specifies the creator filter for Alarm rule creation. 
     * @return CreateUserUin Specifies the creator filter for Alarm rule creation.
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set Specifies the creator filter for Alarm rule creation.
     * @param CreateUserUin Specifies the creator filter for Alarm rule creation.
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get Start time of the Alarm rule create time range, in the format of 2025-08-17 00:00:00. 
     * @return CreateTimeFrom Start time of the Alarm rule create time range, in the format of 2025-08-17 00:00:00.
     */
    public String getCreateTimeFrom() {
        return this.CreateTimeFrom;
    }

    /**
     * Set Start time of the Alarm rule create time range, in the format of 2025-08-17 00:00:00.
     * @param CreateTimeFrom Start time of the Alarm rule create time range, in the format of 2025-08-17 00:00:00.
     */
    public void setCreateTimeFrom(String CreateTimeFrom) {
        this.CreateTimeFrom = CreateTimeFrom;
    }

    /**
     * Get End time of the Alarm rule creation time range, in the format of "2025-08-26 23:59:59".
 
     * @return CreateTimeTo End time of the Alarm rule creation time range, in the format of "2025-08-26 23:59:59".

     */
    public String getCreateTimeTo() {
        return this.CreateTimeTo;
    }

    /**
     * Set End time of the Alarm rule creation time range, in the format of "2025-08-26 23:59:59".

     * @param CreateTimeTo End time of the Alarm rule creation time range, in the format of "2025-08-26 23:59:59".

     */
    public void setCreateTimeTo(String CreateTimeTo) {
        this.CreateTimeTo = CreateTimeTo;
    }

    /**
     * Get Filters Alarm rules by last update time, in the format of "2025-08-26 00:00:00".
 
     * @return UpdateTimeFrom Filters Alarm rules by last update time, in the format of "2025-08-26 00:00:00".

     */
    public String getUpdateTimeFrom() {
        return this.UpdateTimeFrom;
    }

    /**
     * Set Filters Alarm rules by last update time, in the format of "2025-08-26 00:00:00".

     * @param UpdateTimeFrom Filters Alarm rules by last update time, in the format of "2025-08-26 00:00:00".

     */
    public void setUpdateTimeFrom(String UpdateTimeFrom) {
        this.UpdateTimeFrom = UpdateTimeFrom;
    }

    /**
     * Get Filters Alarm rules by last update time in the format of "2025-08-26 23:59:59".
 
     * @return UpdateTimeTo Filters Alarm rules by last update time in the format of "2025-08-26 23:59:59".

     */
    public String getUpdateTimeTo() {
        return this.UpdateTimeTo;
    }

    /**
     * Set Filters Alarm rules by last update time in the format of "2025-08-26 23:59:59".

     * @param UpdateTimeTo Filters Alarm rules by last update time in the format of "2025-08-26 23:59:59".

     */
    public void setUpdateTimeTo(String UpdateTimeTo) {
        this.UpdateTimeTo = UpdateTimeTo;
    }

    public ListOpsAlarmRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListOpsAlarmRulesRequest(ListOpsAlarmRulesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.MonitorObjectType != null) {
            this.MonitorObjectType = new Long(source.MonitorObjectType);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.AlarmType != null) {
            this.AlarmType = new String(source.AlarmType);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmRecipientId != null) {
            this.AlarmRecipientId = new String(source.AlarmRecipientId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.CreateTimeFrom != null) {
            this.CreateTimeFrom = new String(source.CreateTimeFrom);
        }
        if (source.CreateTimeTo != null) {
            this.CreateTimeTo = new String(source.CreateTimeTo);
        }
        if (source.UpdateTimeFrom != null) {
            this.UpdateTimeFrom = new String(source.UpdateTimeFrom);
        }
        if (source.UpdateTimeTo != null) {
            this.UpdateTimeTo = new String(source.UpdateTimeTo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "MonitorObjectType", this.MonitorObjectType);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "AlarmRecipientId", this.AlarmRecipientId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "CreateTimeFrom", this.CreateTimeFrom);
        this.setParamSimple(map, prefix + "CreateTimeTo", this.CreateTimeTo);
        this.setParamSimple(map, prefix + "UpdateTimeFrom", this.UpdateTimeFrom);
        this.setParamSimple(map, prefix + "UpdateTimeTo", this.UpdateTimeTo);

    }
}

