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

public class AlarmRuleDetail extends AbstractModel {

    /**
    * Failure Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed (default)
    */
    @SerializedName("Trigger")
    @Expose
    private Long Trigger;

    /**
    * Backfill/Rerun Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed
    */
    @SerializedName("DataBackfillOrRerunTrigger")
    @Expose
    private Long DataBackfillOrRerunTrigger;

    /**
    * Timeout configuration of the periodic instance.

    */
    @SerializedName("TimeOutExtInfo")
    @Expose
    private TimeOutStrategyInfo [] TimeOutExtInfo;

    /**
    * Specifies the timeout configuration details for rerunning a backfill instance.

    */
    @SerializedName("DataBackfillOrRerunTimeOutExtInfo")
    @Expose
    private TimeOutStrategyInfo [] DataBackfillOrRerunTimeOutExtInfo;

    /**
    * Specifies the detail of Alarm configuration for project fluctuation.
    */
    @SerializedName("ProjectInstanceStatisticsAlarmInfoList")
    @Expose
    private ProjectInstanceStatisticsAlarmInfo [] ProjectInstanceStatisticsAlarmInfoList;

    /**
    * Describes the Alarm configuration information for offline integration reconciliation.
    */
    @SerializedName("ReconciliationExtInfo")
    @Expose
    private ReconciliationStrategyInfo [] ReconciliationExtInfo;

    /**
    * Configure allowlist for monitored object.
    */
    @SerializedName("MonitorWhiteTasks")
    @Expose
    private MonitorWhiteTask [] MonitorWhiteTasks;

    /**
    * 3.0 Workflow completion time (period) Alarm policy.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowCompletionTimeCycleExtInfo")
    @Expose
    private TimeOutStrategyInfo [] WorkflowCompletionTimeCycleExtInfo;

    /**
    * Workflow execution triggers the Alarm condition.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowExecutionTrigger")
    @Expose
    private Long WorkflowExecutionTrigger;

    /**
    * Workflow execution failure Alarm condition.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowExecutionFailureTrigger")
    @Expose
    private Long WorkflowExecutionFailureTrigger;

    /**
    * Workflow execution successful Alarm condition.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowExecutionSuccessTrigger")
    @Expose
    private Long WorkflowExecutionSuccessTrigger;

    /**
     * Get Failure Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed (default) 
     * @return Trigger Failure Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed (default)
     */
    public Long getTrigger() {
        return this.Trigger;
    }

    /**
     * Set Failure Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed (default)
     * @param Trigger Failure Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed (default)
     */
    public void setTrigger(Long Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get Backfill/Rerun Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed 
     * @return DataBackfillOrRerunTrigger Backfill/Rerun Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed
     */
    public Long getDataBackfillOrRerunTrigger() {
        return this.DataBackfillOrRerunTrigger;
    }

    /**
     * Set Backfill/Rerun Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed
     * @param DataBackfillOrRerunTrigger Backfill/Rerun Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed
     */
    public void setDataBackfillOrRerunTrigger(Long DataBackfillOrRerunTrigger) {
        this.DataBackfillOrRerunTrigger = DataBackfillOrRerunTrigger;
    }

    /**
     * Get Timeout configuration of the periodic instance.
 
     * @return TimeOutExtInfo Timeout configuration of the periodic instance.

     */
    public TimeOutStrategyInfo [] getTimeOutExtInfo() {
        return this.TimeOutExtInfo;
    }

    /**
     * Set Timeout configuration of the periodic instance.

     * @param TimeOutExtInfo Timeout configuration of the periodic instance.

     */
    public void setTimeOutExtInfo(TimeOutStrategyInfo [] TimeOutExtInfo) {
        this.TimeOutExtInfo = TimeOutExtInfo;
    }

    /**
     * Get Specifies the timeout configuration details for rerunning a backfill instance.
 
     * @return DataBackfillOrRerunTimeOutExtInfo Specifies the timeout configuration details for rerunning a backfill instance.

     */
    public TimeOutStrategyInfo [] getDataBackfillOrRerunTimeOutExtInfo() {
        return this.DataBackfillOrRerunTimeOutExtInfo;
    }

    /**
     * Set Specifies the timeout configuration details for rerunning a backfill instance.

     * @param DataBackfillOrRerunTimeOutExtInfo Specifies the timeout configuration details for rerunning a backfill instance.

     */
    public void setDataBackfillOrRerunTimeOutExtInfo(TimeOutStrategyInfo [] DataBackfillOrRerunTimeOutExtInfo) {
        this.DataBackfillOrRerunTimeOutExtInfo = DataBackfillOrRerunTimeOutExtInfo;
    }

    /**
     * Get Specifies the detail of Alarm configuration for project fluctuation. 
     * @return ProjectInstanceStatisticsAlarmInfoList Specifies the detail of Alarm configuration for project fluctuation.
     */
    public ProjectInstanceStatisticsAlarmInfo [] getProjectInstanceStatisticsAlarmInfoList() {
        return this.ProjectInstanceStatisticsAlarmInfoList;
    }

    /**
     * Set Specifies the detail of Alarm configuration for project fluctuation.
     * @param ProjectInstanceStatisticsAlarmInfoList Specifies the detail of Alarm configuration for project fluctuation.
     */
    public void setProjectInstanceStatisticsAlarmInfoList(ProjectInstanceStatisticsAlarmInfo [] ProjectInstanceStatisticsAlarmInfoList) {
        this.ProjectInstanceStatisticsAlarmInfoList = ProjectInstanceStatisticsAlarmInfoList;
    }

    /**
     * Get Describes the Alarm configuration information for offline integration reconciliation. 
     * @return ReconciliationExtInfo Describes the Alarm configuration information for offline integration reconciliation.
     */
    public ReconciliationStrategyInfo [] getReconciliationExtInfo() {
        return this.ReconciliationExtInfo;
    }

    /**
     * Set Describes the Alarm configuration information for offline integration reconciliation.
     * @param ReconciliationExtInfo Describes the Alarm configuration information for offline integration reconciliation.
     */
    public void setReconciliationExtInfo(ReconciliationStrategyInfo [] ReconciliationExtInfo) {
        this.ReconciliationExtInfo = ReconciliationExtInfo;
    }

    /**
     * Get Configure allowlist for monitored object. 
     * @return MonitorWhiteTasks Configure allowlist for monitored object.
     */
    public MonitorWhiteTask [] getMonitorWhiteTasks() {
        return this.MonitorWhiteTasks;
    }

    /**
     * Set Configure allowlist for monitored object.
     * @param MonitorWhiteTasks Configure allowlist for monitored object.
     */
    public void setMonitorWhiteTasks(MonitorWhiteTask [] MonitorWhiteTasks) {
        this.MonitorWhiteTasks = MonitorWhiteTasks;
    }

    /**
     * Get 3.0 Workflow completion time (period) Alarm policy.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowCompletionTimeCycleExtInfo 3.0 Workflow completion time (period) Alarm policy.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TimeOutStrategyInfo [] getWorkflowCompletionTimeCycleExtInfo() {
        return this.WorkflowCompletionTimeCycleExtInfo;
    }

    /**
     * Set 3.0 Workflow completion time (period) Alarm policy.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowCompletionTimeCycleExtInfo 3.0 Workflow completion time (period) Alarm policy.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowCompletionTimeCycleExtInfo(TimeOutStrategyInfo [] WorkflowCompletionTimeCycleExtInfo) {
        this.WorkflowCompletionTimeCycleExtInfo = WorkflowCompletionTimeCycleExtInfo;
    }

    /**
     * Get Workflow execution triggers the Alarm condition.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowExecutionTrigger Workflow execution triggers the Alarm condition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWorkflowExecutionTrigger() {
        return this.WorkflowExecutionTrigger;
    }

    /**
     * Set Workflow execution triggers the Alarm condition.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowExecutionTrigger Workflow execution triggers the Alarm condition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowExecutionTrigger(Long WorkflowExecutionTrigger) {
        this.WorkflowExecutionTrigger = WorkflowExecutionTrigger;
    }

    /**
     * Get Workflow execution failure Alarm condition.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowExecutionFailureTrigger Workflow execution failure Alarm condition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWorkflowExecutionFailureTrigger() {
        return this.WorkflowExecutionFailureTrigger;
    }

    /**
     * Set Workflow execution failure Alarm condition.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowExecutionFailureTrigger Workflow execution failure Alarm condition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowExecutionFailureTrigger(Long WorkflowExecutionFailureTrigger) {
        this.WorkflowExecutionFailureTrigger = WorkflowExecutionFailureTrigger;
    }

    /**
     * Get Workflow execution successful Alarm condition.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowExecutionSuccessTrigger Workflow execution successful Alarm condition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWorkflowExecutionSuccessTrigger() {
        return this.WorkflowExecutionSuccessTrigger;
    }

    /**
     * Set Workflow execution successful Alarm condition.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowExecutionSuccessTrigger Workflow execution successful Alarm condition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowExecutionSuccessTrigger(Long WorkflowExecutionSuccessTrigger) {
        this.WorkflowExecutionSuccessTrigger = WorkflowExecutionSuccessTrigger;
    }

    public AlarmRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmRuleDetail(AlarmRuleDetail source) {
        if (source.Trigger != null) {
            this.Trigger = new Long(source.Trigger);
        }
        if (source.DataBackfillOrRerunTrigger != null) {
            this.DataBackfillOrRerunTrigger = new Long(source.DataBackfillOrRerunTrigger);
        }
        if (source.TimeOutExtInfo != null) {
            this.TimeOutExtInfo = new TimeOutStrategyInfo[source.TimeOutExtInfo.length];
            for (int i = 0; i < source.TimeOutExtInfo.length; i++) {
                this.TimeOutExtInfo[i] = new TimeOutStrategyInfo(source.TimeOutExtInfo[i]);
            }
        }
        if (source.DataBackfillOrRerunTimeOutExtInfo != null) {
            this.DataBackfillOrRerunTimeOutExtInfo = new TimeOutStrategyInfo[source.DataBackfillOrRerunTimeOutExtInfo.length];
            for (int i = 0; i < source.DataBackfillOrRerunTimeOutExtInfo.length; i++) {
                this.DataBackfillOrRerunTimeOutExtInfo[i] = new TimeOutStrategyInfo(source.DataBackfillOrRerunTimeOutExtInfo[i]);
            }
        }
        if (source.ProjectInstanceStatisticsAlarmInfoList != null) {
            this.ProjectInstanceStatisticsAlarmInfoList = new ProjectInstanceStatisticsAlarmInfo[source.ProjectInstanceStatisticsAlarmInfoList.length];
            for (int i = 0; i < source.ProjectInstanceStatisticsAlarmInfoList.length; i++) {
                this.ProjectInstanceStatisticsAlarmInfoList[i] = new ProjectInstanceStatisticsAlarmInfo(source.ProjectInstanceStatisticsAlarmInfoList[i]);
            }
        }
        if (source.ReconciliationExtInfo != null) {
            this.ReconciliationExtInfo = new ReconciliationStrategyInfo[source.ReconciliationExtInfo.length];
            for (int i = 0; i < source.ReconciliationExtInfo.length; i++) {
                this.ReconciliationExtInfo[i] = new ReconciliationStrategyInfo(source.ReconciliationExtInfo[i]);
            }
        }
        if (source.MonitorWhiteTasks != null) {
            this.MonitorWhiteTasks = new MonitorWhiteTask[source.MonitorWhiteTasks.length];
            for (int i = 0; i < source.MonitorWhiteTasks.length; i++) {
                this.MonitorWhiteTasks[i] = new MonitorWhiteTask(source.MonitorWhiteTasks[i]);
            }
        }
        if (source.WorkflowCompletionTimeCycleExtInfo != null) {
            this.WorkflowCompletionTimeCycleExtInfo = new TimeOutStrategyInfo[source.WorkflowCompletionTimeCycleExtInfo.length];
            for (int i = 0; i < source.WorkflowCompletionTimeCycleExtInfo.length; i++) {
                this.WorkflowCompletionTimeCycleExtInfo[i] = new TimeOutStrategyInfo(source.WorkflowCompletionTimeCycleExtInfo[i]);
            }
        }
        if (source.WorkflowExecutionTrigger != null) {
            this.WorkflowExecutionTrigger = new Long(source.WorkflowExecutionTrigger);
        }
        if (source.WorkflowExecutionFailureTrigger != null) {
            this.WorkflowExecutionFailureTrigger = new Long(source.WorkflowExecutionFailureTrigger);
        }
        if (source.WorkflowExecutionSuccessTrigger != null) {
            this.WorkflowExecutionSuccessTrigger = new Long(source.WorkflowExecutionSuccessTrigger);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Trigger", this.Trigger);
        this.setParamSimple(map, prefix + "DataBackfillOrRerunTrigger", this.DataBackfillOrRerunTrigger);
        this.setParamArrayObj(map, prefix + "TimeOutExtInfo.", this.TimeOutExtInfo);
        this.setParamArrayObj(map, prefix + "DataBackfillOrRerunTimeOutExtInfo.", this.DataBackfillOrRerunTimeOutExtInfo);
        this.setParamArrayObj(map, prefix + "ProjectInstanceStatisticsAlarmInfoList.", this.ProjectInstanceStatisticsAlarmInfoList);
        this.setParamArrayObj(map, prefix + "ReconciliationExtInfo.", this.ReconciliationExtInfo);
        this.setParamArrayObj(map, prefix + "MonitorWhiteTasks.", this.MonitorWhiteTasks);
        this.setParamArrayObj(map, prefix + "WorkflowCompletionTimeCycleExtInfo.", this.WorkflowCompletionTimeCycleExtInfo);
        this.setParamSimple(map, prefix + "WorkflowExecutionTrigger", this.WorkflowExecutionTrigger);
        this.setParamSimple(map, prefix + "WorkflowExecutionFailureTrigger", this.WorkflowExecutionFailureTrigger);
        this.setParamSimple(map, prefix + "WorkflowExecutionSuccessTrigger", this.WorkflowExecutionSuccessTrigger);

    }
}

