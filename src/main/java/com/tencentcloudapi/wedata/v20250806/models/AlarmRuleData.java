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

public class AlarmRuleData extends AbstractModel {

    /**
    * Alarm Rule ID
    */
    @SerializedName("AlarmRuleId")
    @Expose
    private String AlarmRuleId;

    /**
    * Specifies the Alarm rule name.
    */
    @SerializedName("AlarmRuleName")
    @Expose
    private String AlarmRuleName;

    /**
    * Describes the Alarm rule.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
    * Pass different business IDs depending on the value of MonitorType:

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
    * Whether the Alarm rule is enabled.
Valid values: 0 (disabled), 1 (enabled).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
    * Alarm level. 1. ordinary, 2. important, 3. critical.
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * Specifies the id of the Alarm rule creator.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * The Alarm rule bound to the bundle client. it is normal if empty, otherwise it corresponds to the rule bound to the bundle client.
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * bundleId is not empty. it indicates the bound client name.

    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
    * Describes the Alarm recipient configuration list.
    */
    @SerializedName("AlarmGroups")
    @Expose
    private AlarmGroup [] AlarmGroups;

    /**
     * Get Alarm Rule ID 
     * @return AlarmRuleId Alarm Rule ID
     */
    public String getAlarmRuleId() {
        return this.AlarmRuleId;
    }

    /**
     * Set Alarm Rule ID
     * @param AlarmRuleId Alarm Rule ID
     */
    public void setAlarmRuleId(String AlarmRuleId) {
        this.AlarmRuleId = AlarmRuleId;
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
     * Get Pass different business IDs depending on the value of MonitorType:

1 (Task): MonitorObjectIds should contain a list of task IDs.

2 (Workflow): MonitorObjectIds should contain a list of workflow IDs (workflow IDs can be obtained using the ListWorkflows API).

3 (Project): MonitorObjectIds should contain a list of project IDs. 
     * @return MonitorObjectIds Pass different business IDs depending on the value of MonitorType:

1 (Task): MonitorObjectIds should contain a list of task IDs.

2 (Workflow): MonitorObjectIds should contain a list of workflow IDs (workflow IDs can be obtained using the ListWorkflows API).

3 (Project): MonitorObjectIds should contain a list of project IDs.
     */
    public String [] getMonitorObjectIds() {
        return this.MonitorObjectIds;
    }

    /**
     * Set Pass different business IDs depending on the value of MonitorType:

1 (Task): MonitorObjectIds should contain a list of task IDs.

2 (Workflow): MonitorObjectIds should contain a list of workflow IDs (workflow IDs can be obtained using the ListWorkflows API).

3 (Project): MonitorObjectIds should contain a list of project IDs.
     * @param MonitorObjectIds Pass different business IDs depending on the value of MonitorType:

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
     * Get Whether the Alarm rule is enabled.
Valid values: 0 (disabled), 1 (enabled). 
     * @return Status Whether the Alarm rule is enabled.
Valid values: 0 (disabled), 1 (enabled).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Whether the Alarm rule is enabled.
Valid values: 0 (disabled), 1 (enabled).
     * @param Status Whether the Alarm rule is enabled.
Valid values: 0 (disabled), 1 (enabled).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get Specifies the id of the Alarm rule creator. 
     * @return OwnerUin Specifies the id of the Alarm rule creator.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Specifies the id of the Alarm rule creator.
     * @param OwnerUin Specifies the id of the Alarm rule creator.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get The Alarm rule bound to the bundle client. it is normal if empty, otherwise it corresponds to the rule bound to the bundle client. 
     * @return BundleId The Alarm rule bound to the bundle client. it is normal if empty, otherwise it corresponds to the rule bound to the bundle client.
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set The Alarm rule bound to the bundle client. it is normal if empty, otherwise it corresponds to the rule bound to the bundle client.
     * @param BundleId The Alarm rule bound to the bundle client. it is normal if empty, otherwise it corresponds to the rule bound to the bundle client.
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get bundleId is not empty. it indicates the bound client name.
 
     * @return BundleInfo bundleId is not empty. it indicates the bound client name.

     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set bundleId is not empty. it indicates the bound client name.

     * @param BundleInfo bundleId is not empty. it indicates the bound client name.

     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    /**
     * Get Describes the Alarm recipient configuration list. 
     * @return AlarmGroups Describes the Alarm recipient configuration list.
     */
    public AlarmGroup [] getAlarmGroups() {
        return this.AlarmGroups;
    }

    /**
     * Set Describes the Alarm recipient configuration list.
     * @param AlarmGroups Describes the Alarm recipient configuration list.
     */
    public void setAlarmGroups(AlarmGroup [] AlarmGroups) {
        this.AlarmGroups = AlarmGroups;
    }

    public AlarmRuleData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmRuleData(AlarmRuleData source) {
        if (source.AlarmRuleId != null) {
            this.AlarmRuleId = new String(source.AlarmRuleId);
        }
        if (source.AlarmRuleName != null) {
            this.AlarmRuleName = new String(source.AlarmRuleName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AlarmRuleDetail != null) {
            this.AlarmRuleDetail = new AlarmRuleDetail(source.AlarmRuleDetail);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
        if (source.AlarmGroups != null) {
            this.AlarmGroups = new AlarmGroup[source.AlarmGroups.length];
            for (int i = 0; i < source.AlarmGroups.length; i++) {
                this.AlarmGroups[i] = new AlarmGroup(source.AlarmGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmRuleId", this.AlarmRuleId);
        this.setParamSimple(map, prefix + "AlarmRuleName", this.AlarmRuleName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MonitorObjectType", this.MonitorObjectType);
        this.setParamArraySimple(map, prefix + "MonitorObjectIds.", this.MonitorObjectIds);
        this.setParamArraySimple(map, prefix + "AlarmTypes.", this.AlarmTypes);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "AlarmRuleDetail.", this.AlarmRuleDetail);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamArrayObj(map, prefix + "AlarmGroups.", this.AlarmGroups);

    }
}

