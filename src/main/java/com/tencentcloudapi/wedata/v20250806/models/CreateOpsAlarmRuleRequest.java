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

public class CreateOpsAlarmRuleRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Specifies the Alarm rule name.
    */
    @SerializedName("AlarmRuleName")
    @Expose
    private String AlarmRuleName;

    /**
    * Monitoring Object Business ID List - Pass different business IDs depending on the value of MonitorType:

1 (Task): MonitorObjectIds should contain a list of task IDs.

2 (Workflow): MonitorObjectIds should contain a list of workflow IDs (workflow IDs can be obtained using the ListWorkflows API).

3 (Project): MonitorObjectIds should contain a list of project IDs.
    */
    @SerializedName("MonitorObjectIds")
    @Expose
    private String [] MonitorObjectIds;

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
    @SerializedName("AlarmTypes")
    @Expose
    private String [] AlarmTypes;

    /**
    * Alarm recipient configuration.
    */
    @SerializedName("AlarmGroups")
    @Expose
    private AlarmGroup [] AlarmGroups;

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
    * Alarm level. 1. ordinary, 2. important, 3. critical (default: 1. ordinary).
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * Describes the Alarm rule.
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
     * Get Specifies the Alarm rule name. 
     * @return AlarmRuleName Specifies the Alarm rule name.
     */
    public String getAlarmRuleName() {
        return this.AlarmRuleName;
    }

    /**
     * Set Specifies the Alarm rule name.
     * @param AlarmRuleName Specifies the Alarm rule name.
     */
    public void setAlarmRuleName(String AlarmRuleName) {
        this.AlarmRuleName = AlarmRuleName;
    }

    /**
     * Get Monitoring Object Business ID List - Pass different business IDs depending on the value of MonitorType:

1 (Task): MonitorObjectIds should contain a list of task IDs.

2 (Workflow): MonitorObjectIds should contain a list of workflow IDs (workflow IDs can be obtained using the ListWorkflows API).

3 (Project): MonitorObjectIds should contain a list of project IDs. 
     * @return MonitorObjectIds Monitoring Object Business ID List - Pass different business IDs depending on the value of MonitorType:

1 (Task): MonitorObjectIds should contain a list of task IDs.

2 (Workflow): MonitorObjectIds should contain a list of workflow IDs (workflow IDs can be obtained using the ListWorkflows API).

3 (Project): MonitorObjectIds should contain a list of project IDs.
     */
    public String [] getMonitorObjectIds() {
        return this.MonitorObjectIds;
    }

    /**
     * Set Monitoring Object Business ID List - Pass different business IDs depending on the value of MonitorType:

1 (Task): MonitorObjectIds should contain a list of task IDs.

2 (Workflow): MonitorObjectIds should contain a list of workflow IDs (workflow IDs can be obtained using the ListWorkflows API).

3 (Project): MonitorObjectIds should contain a list of project IDs.
     * @param MonitorObjectIds Monitoring Object Business ID List - Pass different business IDs depending on the value of MonitorType:

1 (Task): MonitorObjectIds should contain a list of task IDs.

2 (Workflow): MonitorObjectIds should contain a list of workflow IDs (workflow IDs can be obtained using the ListWorkflows API).

3 (Project): MonitorObjectIds should contain a list of project IDs.
     */
    public void setMonitorObjectIds(String [] MonitorObjectIds) {
        this.MonitorObjectIds = MonitorObjectIds;
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
     * @return AlarmTypes Alarm Rule Monitoring Types:

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
    public String [] getAlarmTypes() {
        return this.AlarmTypes;
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
     * @param AlarmTypes Alarm Rule Monitoring Types:

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
    public void setAlarmTypes(String [] AlarmTypes) {
        this.AlarmTypes = AlarmTypes;
    }

    /**
     * Get Alarm recipient configuration. 
     * @return AlarmGroups Alarm recipient configuration.
     */
    public AlarmGroup [] getAlarmGroups() {
        return this.AlarmGroups;
    }

    /**
     * Set Alarm recipient configuration.
     * @param AlarmGroups Alarm recipient configuration.
     */
    public void setAlarmGroups(AlarmGroup [] AlarmGroups) {
        this.AlarmGroups = AlarmGroups;
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
     * Get Alarm level. 1. ordinary, 2. important, 3. critical (default: 1. ordinary). 
     * @return AlarmLevel Alarm level. 1. ordinary, 2. important, 3. critical (default: 1. ordinary).
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set Alarm level. 1. ordinary, 2. important, 3. critical (default: 1. ordinary).
     * @param AlarmLevel Alarm level. 1. ordinary, 2. important, 3. critical (default: 1. ordinary).
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get Describes the Alarm rule. 
     * @return Description Describes the Alarm rule.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Describes the Alarm rule.
     * @param Description Describes the Alarm rule.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateOpsAlarmRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOpsAlarmRuleRequest(CreateOpsAlarmRuleRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AlarmRuleName != null) {
            this.AlarmRuleName = new String(source.AlarmRuleName);
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
        if (source.AlarmGroups != null) {
            this.AlarmGroups = new AlarmGroup[source.AlarmGroups.length];
            for (int i = 0; i < source.AlarmGroups.length; i++) {
                this.AlarmGroups[i] = new AlarmGroup(source.AlarmGroups[i]);
            }
        }
        if (source.MonitorObjectType != null) {
            this.MonitorObjectType = new Long(source.MonitorObjectType);
        }
        if (source.AlarmRuleDetail != null) {
            this.AlarmRuleDetail = new AlarmRuleDetail(source.AlarmRuleDetail);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
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
        this.setParamSimple(map, prefix + "AlarmRuleName", this.AlarmRuleName);
        this.setParamArraySimple(map, prefix + "MonitorObjectIds.", this.MonitorObjectIds);
        this.setParamArraySimple(map, prefix + "AlarmTypes.", this.AlarmTypes);
        this.setParamArrayObj(map, prefix + "AlarmGroups.", this.AlarmGroups);
        this.setParamSimple(map, prefix + "MonitorObjectType", this.MonitorObjectType);
        this.setParamObj(map, prefix + "AlarmRuleDetail.", this.AlarmRuleDetail);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

