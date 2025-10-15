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

public class UpdateOpsAlarmRuleRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Specifies the unique id of the Alarm rule, obtained through the GetAlarmRule/ListAlarmRule api.
    */
    @SerializedName("AlarmRuleId")
    @Expose
    private String AlarmRuleId;

    /**
    * Specifies the new rule name of the Alarm rule.
    */
    @SerializedName("AlarmRuleName")
    @Expose
    private String AlarmRuleName;

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
    * Pass different business IDs based on the MonitorType setting:

1 (Task): MonitorObjectIds should be a list of task IDs.

2 (Workflow): MonitorObjectIds should be a list of workflow IDs (workflow IDs can be obtained via the ListWorkflows API).

3 (Project): MonitorObjectIds should be a list of project IDs.
    */
    @SerializedName("MonitorObjectIds")
    @Expose
    private String [] MonitorObjectIds;

    /**
    * Alarm Rule Monitoring Types

failure: Failure alarm

overtime: Timeout alarm

success: Success alarm

backTrackingOrRerunSuccess: Alarm when backfill/rerun succeeds

backTrackingOrRerunFailure: Alarm when backfill/rerun fails

projectFailureInstanceUpwardFluctuationAlarm: Alarm when the upward fluctuation rate of failed instances for the day exceeds the threshold

projectFailureInstanceUpwardVolatilityAlarm: Alarm when the upward fluctuation count of failed instances for the day exceeds the threshold

projectSuccessInstanceDownwardFluctuationAlarm: Alarm when the downward fluctuation rate of successful instances for the day exceeds the threshold

projectSuccessInstanceDownwardVolatilityAlarm: Alarm when the downward fluctuation count of successful instances for the day exceeds the threshold

projectFailureInstanceCountAlarm: Alarm when the number of failed instances for the day exceeds the threshold

projectFailureInstanceProportionAlarm: Alarm when the proportion of failed instances for the day exceeds the threshold

reconciliationFailure: Alarm when offline reconciliation task fails

reconciliationOvertime: Alarm when offline reconciliation task runs overtime

reconciliationMismatch: Alarm when the number of mismatched records in reconciliation exceeds the threshold
    */
    @SerializedName("AlarmTypes")
    @Expose
    private String [] AlarmTypes;

    /**
    * Alarm Rule Configuration Information

Success Alarms - No configuration required;

Failure Alarms - Can be configured to trigger on the first failure or on all retry failures;

Timeout Alarms - Require configuration of the timeout type and timeout threshold;

Project Fluctuation Alarms - Require configuration of the fluctuation rate and the debounce cycle.
    */
    @SerializedName("AlarmRuleDetail")
    @Expose
    private AlarmRuleDetail AlarmRuleDetail;

    /**
    * Enable status of the Alarm rule. valid values: 0 (disabled), 1 (enabled).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Alarm level. 1. ordinary, 2. important, 3. critical.
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * Describes the Alarm recipient configuration message.
    */
    @SerializedName("AlarmGroups")
    @Expose
    private AlarmGroup [] AlarmGroups;

    /**
    * Alarm description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
     * Get Specifies the unique id of the Alarm rule, obtained through the GetAlarmRule/ListAlarmRule api. 
     * @return AlarmRuleId Specifies the unique id of the Alarm rule, obtained through the GetAlarmRule/ListAlarmRule api.
     */
    public String getAlarmRuleId() {
        return this.AlarmRuleId;
    }

    /**
     * Set Specifies the unique id of the Alarm rule, obtained through the GetAlarmRule/ListAlarmRule api.
     * @param AlarmRuleId Specifies the unique id of the Alarm rule, obtained through the GetAlarmRule/ListAlarmRule api.
     */
    public void setAlarmRuleId(String AlarmRuleId) {
        this.AlarmRuleId = AlarmRuleId;
    }

    /**
     * Get Specifies the new rule name of the Alarm rule. 
     * @return AlarmRuleName Specifies the new rule name of the Alarm rule.
     */
    public String getAlarmRuleName() {
        return this.AlarmRuleName;
    }

    /**
     * Set Specifies the new rule name of the Alarm rule.
     * @param AlarmRuleName Specifies the new rule name of the Alarm rule.
     */
    public void setAlarmRuleName(String AlarmRuleName) {
        this.AlarmRuleName = AlarmRuleName;
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
     * Get Pass different business IDs based on the MonitorType setting:

1 (Task): MonitorObjectIds should be a list of task IDs.

2 (Workflow): MonitorObjectIds should be a list of workflow IDs (workflow IDs can be obtained via the ListWorkflows API).

3 (Project): MonitorObjectIds should be a list of project IDs. 
     * @return MonitorObjectIds Pass different business IDs based on the MonitorType setting:

1 (Task): MonitorObjectIds should be a list of task IDs.

2 (Workflow): MonitorObjectIds should be a list of workflow IDs (workflow IDs can be obtained via the ListWorkflows API).

3 (Project): MonitorObjectIds should be a list of project IDs.
     */
    public String [] getMonitorObjectIds() {
        return this.MonitorObjectIds;
    }

    /**
     * Set Pass different business IDs based on the MonitorType setting:

1 (Task): MonitorObjectIds should be a list of task IDs.

2 (Workflow): MonitorObjectIds should be a list of workflow IDs (workflow IDs can be obtained via the ListWorkflows API).

3 (Project): MonitorObjectIds should be a list of project IDs.
     * @param MonitorObjectIds Pass different business IDs based on the MonitorType setting:

1 (Task): MonitorObjectIds should be a list of task IDs.

2 (Workflow): MonitorObjectIds should be a list of workflow IDs (workflow IDs can be obtained via the ListWorkflows API).

3 (Project): MonitorObjectIds should be a list of project IDs.
     */
    public void setMonitorObjectIds(String [] MonitorObjectIds) {
        this.MonitorObjectIds = MonitorObjectIds;
    }

    /**
     * Get Alarm Rule Monitoring Types

failure: Failure alarm

overtime: Timeout alarm

success: Success alarm

backTrackingOrRerunSuccess: Alarm when backfill/rerun succeeds

backTrackingOrRerunFailure: Alarm when backfill/rerun fails

projectFailureInstanceUpwardFluctuationAlarm: Alarm when the upward fluctuation rate of failed instances for the day exceeds the threshold

projectFailureInstanceUpwardVolatilityAlarm: Alarm when the upward fluctuation count of failed instances for the day exceeds the threshold

projectSuccessInstanceDownwardFluctuationAlarm: Alarm when the downward fluctuation rate of successful instances for the day exceeds the threshold

projectSuccessInstanceDownwardVolatilityAlarm: Alarm when the downward fluctuation count of successful instances for the day exceeds the threshold

projectFailureInstanceCountAlarm: Alarm when the number of failed instances for the day exceeds the threshold

projectFailureInstanceProportionAlarm: Alarm when the proportion of failed instances for the day exceeds the threshold

reconciliationFailure: Alarm when offline reconciliation task fails

reconciliationOvertime: Alarm when offline reconciliation task runs overtime

reconciliationMismatch: Alarm when the number of mismatched records in reconciliation exceeds the threshold 
     * @return AlarmTypes Alarm Rule Monitoring Types

failure: Failure alarm

overtime: Timeout alarm

success: Success alarm

backTrackingOrRerunSuccess: Alarm when backfill/rerun succeeds

backTrackingOrRerunFailure: Alarm when backfill/rerun fails

projectFailureInstanceUpwardFluctuationAlarm: Alarm when the upward fluctuation rate of failed instances for the day exceeds the threshold

projectFailureInstanceUpwardVolatilityAlarm: Alarm when the upward fluctuation count of failed instances for the day exceeds the threshold

projectSuccessInstanceDownwardFluctuationAlarm: Alarm when the downward fluctuation rate of successful instances for the day exceeds the threshold

projectSuccessInstanceDownwardVolatilityAlarm: Alarm when the downward fluctuation count of successful instances for the day exceeds the threshold

projectFailureInstanceCountAlarm: Alarm when the number of failed instances for the day exceeds the threshold

projectFailureInstanceProportionAlarm: Alarm when the proportion of failed instances for the day exceeds the threshold

reconciliationFailure: Alarm when offline reconciliation task fails

reconciliationOvertime: Alarm when offline reconciliation task runs overtime

reconciliationMismatch: Alarm when the number of mismatched records in reconciliation exceeds the threshold
     */
    public String [] getAlarmTypes() {
        return this.AlarmTypes;
    }

    /**
     * Set Alarm Rule Monitoring Types

failure: Failure alarm

overtime: Timeout alarm

success: Success alarm

backTrackingOrRerunSuccess: Alarm when backfill/rerun succeeds

backTrackingOrRerunFailure: Alarm when backfill/rerun fails

projectFailureInstanceUpwardFluctuationAlarm: Alarm when the upward fluctuation rate of failed instances for the day exceeds the threshold

projectFailureInstanceUpwardVolatilityAlarm: Alarm when the upward fluctuation count of failed instances for the day exceeds the threshold

projectSuccessInstanceDownwardFluctuationAlarm: Alarm when the downward fluctuation rate of successful instances for the day exceeds the threshold

projectSuccessInstanceDownwardVolatilityAlarm: Alarm when the downward fluctuation count of successful instances for the day exceeds the threshold

projectFailureInstanceCountAlarm: Alarm when the number of failed instances for the day exceeds the threshold

projectFailureInstanceProportionAlarm: Alarm when the proportion of failed instances for the day exceeds the threshold

reconciliationFailure: Alarm when offline reconciliation task fails

reconciliationOvertime: Alarm when offline reconciliation task runs overtime

reconciliationMismatch: Alarm when the number of mismatched records in reconciliation exceeds the threshold
     * @param AlarmTypes Alarm Rule Monitoring Types

failure: Failure alarm

overtime: Timeout alarm

success: Success alarm

backTrackingOrRerunSuccess: Alarm when backfill/rerun succeeds

backTrackingOrRerunFailure: Alarm when backfill/rerun fails

projectFailureInstanceUpwardFluctuationAlarm: Alarm when the upward fluctuation rate of failed instances for the day exceeds the threshold

projectFailureInstanceUpwardVolatilityAlarm: Alarm when the upward fluctuation count of failed instances for the day exceeds the threshold

projectSuccessInstanceDownwardFluctuationAlarm: Alarm when the downward fluctuation rate of successful instances for the day exceeds the threshold

projectSuccessInstanceDownwardVolatilityAlarm: Alarm when the downward fluctuation count of successful instances for the day exceeds the threshold

projectFailureInstanceCountAlarm: Alarm when the number of failed instances for the day exceeds the threshold

projectFailureInstanceProportionAlarm: Alarm when the proportion of failed instances for the day exceeds the threshold

reconciliationFailure: Alarm when offline reconciliation task fails

reconciliationOvertime: Alarm when offline reconciliation task runs overtime

reconciliationMismatch: Alarm when the number of mismatched records in reconciliation exceeds the threshold
     */
    public void setAlarmTypes(String [] AlarmTypes) {
        this.AlarmTypes = AlarmTypes;
    }

    /**
     * Get Alarm Rule Configuration Information

Success Alarms - No configuration required;

Failure Alarms - Can be configured to trigger on the first failure or on all retry failures;

Timeout Alarms - Require configuration of the timeout type and timeout threshold;

Project Fluctuation Alarms - Require configuration of the fluctuation rate and the debounce cycle. 
     * @return AlarmRuleDetail Alarm Rule Configuration Information

Success Alarms - No configuration required;

Failure Alarms - Can be configured to trigger on the first failure or on all retry failures;

Timeout Alarms - Require configuration of the timeout type and timeout threshold;

Project Fluctuation Alarms - Require configuration of the fluctuation rate and the debounce cycle.
     */
    public AlarmRuleDetail getAlarmRuleDetail() {
        return this.AlarmRuleDetail;
    }

    /**
     * Set Alarm Rule Configuration Information

Success Alarms - No configuration required;

Failure Alarms - Can be configured to trigger on the first failure or on all retry failures;

Timeout Alarms - Require configuration of the timeout type and timeout threshold;

Project Fluctuation Alarms - Require configuration of the fluctuation rate and the debounce cycle.
     * @param AlarmRuleDetail Alarm Rule Configuration Information

Success Alarms - No configuration required;

Failure Alarms - Can be configured to trigger on the first failure or on all retry failures;

Timeout Alarms - Require configuration of the timeout type and timeout threshold;

Project Fluctuation Alarms - Require configuration of the fluctuation rate and the debounce cycle.
     */
    public void setAlarmRuleDetail(AlarmRuleDetail AlarmRuleDetail) {
        this.AlarmRuleDetail = AlarmRuleDetail;
    }

    /**
     * Get Enable status of the Alarm rule. valid values: 0 (disabled), 1 (enabled). 
     * @return Status Enable status of the Alarm rule. valid values: 0 (disabled), 1 (enabled).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Enable status of the Alarm rule. valid values: 0 (disabled), 1 (enabled).
     * @param Status Enable status of the Alarm rule. valid values: 0 (disabled), 1 (enabled).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Alarm level. 1. ordinary, 2. important, 3. critical. 
     * @return AlarmLevel Alarm level. 1. ordinary, 2. important, 3. critical.
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set Alarm level. 1. ordinary, 2. important, 3. critical.
     * @param AlarmLevel Alarm level. 1. ordinary, 2. important, 3. critical.
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get Describes the Alarm recipient configuration message. 
     * @return AlarmGroups Describes the Alarm recipient configuration message.
     */
    public AlarmGroup [] getAlarmGroups() {
        return this.AlarmGroups;
    }

    /**
     * Set Describes the Alarm recipient configuration message.
     * @param AlarmGroups Describes the Alarm recipient configuration message.
     */
    public void setAlarmGroups(AlarmGroup [] AlarmGroups) {
        this.AlarmGroups = AlarmGroups;
    }

    /**
     * Get Alarm description. 
     * @return Description Alarm description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Alarm description.
     * @param Description Alarm description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public UpdateOpsAlarmRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateOpsAlarmRuleRequest(UpdateOpsAlarmRuleRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AlarmRuleId != null) {
            this.AlarmRuleId = new String(source.AlarmRuleId);
        }
        if (source.AlarmRuleName != null) {
            this.AlarmRuleName = new String(source.AlarmRuleName);
        }
        if (source.MonitorObjectType != null) {
            this.MonitorObjectType = new Long(source.MonitorObjectType);
        }
        if (source.MonitorObjectIds != null) {
            this.MonitorObjectIds = new String[source.MonitorObjectIds.length];
            for (int i = 0; i < source.MonitorObjectIds.length; i++) {
                this.MonitorObjectIds[i] = new String(source.MonitorObjectIds[i]);
            }
        }
        if (source.AlarmTypes != null) {
            this.AlarmTypes = new String[source.AlarmTypes.length];
            for (int i = 0; i < source.AlarmTypes.length; i++) {
                this.AlarmTypes[i] = new String(source.AlarmTypes[i]);
            }
        }
        if (source.AlarmRuleDetail != null) {
            this.AlarmRuleDetail = new AlarmRuleDetail(source.AlarmRuleDetail);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmGroups != null) {
            this.AlarmGroups = new AlarmGroup[source.AlarmGroups.length];
            for (int i = 0; i < source.AlarmGroups.length; i++) {
                this.AlarmGroups[i] = new AlarmGroup(source.AlarmGroups[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AlarmRuleId", this.AlarmRuleId);
        this.setParamSimple(map, prefix + "AlarmRuleName", this.AlarmRuleName);
        this.setParamSimple(map, prefix + "MonitorObjectType", this.MonitorObjectType);
        this.setParamArraySimple(map, prefix + "MonitorObjectIds.", this.MonitorObjectIds);
        this.setParamArraySimple(map, prefix + "AlarmTypes.", this.AlarmTypes);
        this.setParamObj(map, prefix + "AlarmRuleDetail.", this.AlarmRuleDetail);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamArrayObj(map, prefix + "AlarmGroups.", this.AlarmGroups);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

