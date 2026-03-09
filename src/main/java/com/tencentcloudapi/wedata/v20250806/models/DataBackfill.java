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

public class DataBackfill extends AbstractModel {

    /**
    * Project ID.

    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Data supplement plan id.
    */
    @SerializedName("DataBackfillPlanId")
    @Expose
    private String DataBackfillPlanId;

    /**
    * Data supplement plan name.
    */
    @SerializedName("DataBackfillPlanName")
    @Expose
    private String DataBackfillPlanName;

    /**
    * Supplementary task collection.
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * Backfill task data configuration list.
    */
    @SerializedName("DataBackfillRangeList")
    @Expose
    private DataBackfillRange [] DataBackfillRangeList;

    /**
    * Check parent task type. valid values: NONE (do not check ALL), ALL (check ALL upstream parent tasks), MAKE_SCOPE (check only in the selected tasks of the present replenishment plan).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckParentType")
    @Expose
    private String CheckParentType;

    /**
    * Specifies whether to ignore event dependency during backfill.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SkipEventListening")
    @Expose
    private Boolean SkipEventListening;

    /**
    * Custom instance run degree of concurrency. return null or do not return indicates task original self-dependent.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RedefineParallelNum")
    @Expose
    private Long RedefineParallelNum;

    /**
    * Custom workflow self-dependency, yes or no. if not configured, use the existing workflow self-dependency.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RedefineSelfWorkflowDependency")
    @Expose
    private String RedefineSelfWorkflowDependency;

    /**
    * Scheduling resource group id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SchedulerResourceGroupId")
    @Expose
    private String SchedulerResourceGroupId;

    /**
    * Integration resource group id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IntegrationResourceGroupId")
    @Expose
    private String IntegrationResourceGroupId;

    /**
    * Backfill custom generation cycle.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RedefineCycleType")
    @Expose
    private String RedefineCycleType;

    /**
    * Custom parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RedefineParamList")
    @Expose
    private KVPair [] RedefineParamList;

    /**
    * Execution start time of the backfill task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Backfill task execution end time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Create a user id.
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * Percentage of supplementary plan instances completed.
    */
    @SerializedName("CompletePercent")
    @Expose
    private Long CompletePercent;

    /**
    * Percentage of supplementary plan instances successful.
    */
    @SerializedName("SuccessPercent")
    @Expose
    private Long SuccessPercent;

    /**
    * Backfill follows the instance data time sequence and must meet two conditions to take effect: 1. must be tasks in the same cycle 2. execute based on dependencies, or execute based on configured execution ORDER without dependency impact  available values: - NORMAL: leave unset - ORDER: sequence - REVERSE: descending ORDER  if not set, the default is NORMAL.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataTimeOrder")
    @Expose
    private String DataTimeOrder;

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
     * Get Data supplement plan id. 
     * @return DataBackfillPlanId Data supplement plan id.
     */
    public String getDataBackfillPlanId() {
        return this.DataBackfillPlanId;
    }

    /**
     * Set Data supplement plan id.
     * @param DataBackfillPlanId Data supplement plan id.
     */
    public void setDataBackfillPlanId(String DataBackfillPlanId) {
        this.DataBackfillPlanId = DataBackfillPlanId;
    }

    /**
     * Get Data supplement plan name. 
     * @return DataBackfillPlanName Data supplement plan name.
     */
    public String getDataBackfillPlanName() {
        return this.DataBackfillPlanName;
    }

    /**
     * Set Data supplement plan name.
     * @param DataBackfillPlanName Data supplement plan name.
     */
    public void setDataBackfillPlanName(String DataBackfillPlanName) {
        this.DataBackfillPlanName = DataBackfillPlanName;
    }

    /**
     * Get Supplementary task collection. 
     * @return TaskIds Supplementary task collection.
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set Supplementary task collection.
     * @param TaskIds Supplementary task collection.
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get Backfill task data configuration list. 
     * @return DataBackfillRangeList Backfill task data configuration list.
     */
    public DataBackfillRange [] getDataBackfillRangeList() {
        return this.DataBackfillRangeList;
    }

    /**
     * Set Backfill task data configuration list.
     * @param DataBackfillRangeList Backfill task data configuration list.
     */
    public void setDataBackfillRangeList(DataBackfillRange [] DataBackfillRangeList) {
        this.DataBackfillRangeList = DataBackfillRangeList;
    }

    /**
     * Get Check parent task type. valid values: NONE (do not check ALL), ALL (check ALL upstream parent tasks), MAKE_SCOPE (check only in the selected tasks of the present replenishment plan).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckParentType Check parent task type. valid values: NONE (do not check ALL), ALL (check ALL upstream parent tasks), MAKE_SCOPE (check only in the selected tasks of the present replenishment plan).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCheckParentType() {
        return this.CheckParentType;
    }

    /**
     * Set Check parent task type. valid values: NONE (do not check ALL), ALL (check ALL upstream parent tasks), MAKE_SCOPE (check only in the selected tasks of the present replenishment plan).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckParentType Check parent task type. valid values: NONE (do not check ALL), ALL (check ALL upstream parent tasks), MAKE_SCOPE (check only in the selected tasks of the present replenishment plan).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckParentType(String CheckParentType) {
        this.CheckParentType = CheckParentType;
    }

    /**
     * Get Specifies whether to ignore event dependency during backfill.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SkipEventListening Specifies whether to ignore event dependency during backfill.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSkipEventListening() {
        return this.SkipEventListening;
    }

    /**
     * Set Specifies whether to ignore event dependency during backfill.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SkipEventListening Specifies whether to ignore event dependency during backfill.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSkipEventListening(Boolean SkipEventListening) {
        this.SkipEventListening = SkipEventListening;
    }

    /**
     * Get Custom instance run degree of concurrency. return null or do not return indicates task original self-dependent.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RedefineParallelNum Custom instance run degree of concurrency. return null or do not return indicates task original self-dependent.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRedefineParallelNum() {
        return this.RedefineParallelNum;
    }

    /**
     * Set Custom instance run degree of concurrency. return null or do not return indicates task original self-dependent.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RedefineParallelNum Custom instance run degree of concurrency. return null or do not return indicates task original self-dependent.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRedefineParallelNum(Long RedefineParallelNum) {
        this.RedefineParallelNum = RedefineParallelNum;
    }

    /**
     * Get Custom workflow self-dependency, yes or no. if not configured, use the existing workflow self-dependency.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RedefineSelfWorkflowDependency Custom workflow self-dependency, yes or no. if not configured, use the existing workflow self-dependency.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRedefineSelfWorkflowDependency() {
        return this.RedefineSelfWorkflowDependency;
    }

    /**
     * Set Custom workflow self-dependency, yes or no. if not configured, use the existing workflow self-dependency.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RedefineSelfWorkflowDependency Custom workflow self-dependency, yes or no. if not configured, use the existing workflow self-dependency.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRedefineSelfWorkflowDependency(String RedefineSelfWorkflowDependency) {
        this.RedefineSelfWorkflowDependency = RedefineSelfWorkflowDependency;
    }

    /**
     * Get Scheduling resource group id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SchedulerResourceGroupId Scheduling resource group id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSchedulerResourceGroupId() {
        return this.SchedulerResourceGroupId;
    }

    /**
     * Set Scheduling resource group id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SchedulerResourceGroupId Scheduling resource group id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSchedulerResourceGroupId(String SchedulerResourceGroupId) {
        this.SchedulerResourceGroupId = SchedulerResourceGroupId;
    }

    /**
     * Get Integration resource group id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IntegrationResourceGroupId Integration resource group id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIntegrationResourceGroupId() {
        return this.IntegrationResourceGroupId;
    }

    /**
     * Set Integration resource group id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IntegrationResourceGroupId Integration resource group id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIntegrationResourceGroupId(String IntegrationResourceGroupId) {
        this.IntegrationResourceGroupId = IntegrationResourceGroupId;
    }

    /**
     * Get Backfill custom generation cycle.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RedefineCycleType Backfill custom generation cycle.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRedefineCycleType() {
        return this.RedefineCycleType;
    }

    /**
     * Set Backfill custom generation cycle.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RedefineCycleType Backfill custom generation cycle.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRedefineCycleType(String RedefineCycleType) {
        this.RedefineCycleType = RedefineCycleType;
    }

    /**
     * Get Custom parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RedefineParamList Custom parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public KVPair [] getRedefineParamList() {
        return this.RedefineParamList;
    }

    /**
     * Set Custom parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RedefineParamList Custom parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRedefineParamList(KVPair [] RedefineParamList) {
        this.RedefineParamList = RedefineParamList;
    }

    /**
     * Get Execution start time of the backfill task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Execution start time of the backfill task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Execution start time of the backfill task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Execution start time of the backfill task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Backfill task execution end time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Backfill task execution end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Backfill task execution end time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Backfill task execution end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Create a user id. 
     * @return CreateUserUin Create a user id.
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set Create a user id.
     * @param CreateUserUin Create a user id.
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get Percentage of supplementary plan instances completed. 
     * @return CompletePercent Percentage of supplementary plan instances completed.
     */
    public Long getCompletePercent() {
        return this.CompletePercent;
    }

    /**
     * Set Percentage of supplementary plan instances completed.
     * @param CompletePercent Percentage of supplementary plan instances completed.
     */
    public void setCompletePercent(Long CompletePercent) {
        this.CompletePercent = CompletePercent;
    }

    /**
     * Get Percentage of supplementary plan instances successful. 
     * @return SuccessPercent Percentage of supplementary plan instances successful.
     */
    public Long getSuccessPercent() {
        return this.SuccessPercent;
    }

    /**
     * Set Percentage of supplementary plan instances successful.
     * @param SuccessPercent Percentage of supplementary plan instances successful.
     */
    public void setSuccessPercent(Long SuccessPercent) {
        this.SuccessPercent = SuccessPercent;
    }

    /**
     * Get Backfill follows the instance data time sequence and must meet two conditions to take effect: 1. must be tasks in the same cycle 2. execute based on dependencies, or execute based on configured execution ORDER without dependency impact  available values: - NORMAL: leave unset - ORDER: sequence - REVERSE: descending ORDER  if not set, the default is NORMAL.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataTimeOrder Backfill follows the instance data time sequence and must meet two conditions to take effect: 1. must be tasks in the same cycle 2. execute based on dependencies, or execute based on configured execution ORDER without dependency impact  available values: - NORMAL: leave unset - ORDER: sequence - REVERSE: descending ORDER  if not set, the default is NORMAL.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataTimeOrder() {
        return this.DataTimeOrder;
    }

    /**
     * Set Backfill follows the instance data time sequence and must meet two conditions to take effect: 1. must be tasks in the same cycle 2. execute based on dependencies, or execute based on configured execution ORDER without dependency impact  available values: - NORMAL: leave unset - ORDER: sequence - REVERSE: descending ORDER  if not set, the default is NORMAL.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataTimeOrder Backfill follows the instance data time sequence and must meet two conditions to take effect: 1. must be tasks in the same cycle 2. execute based on dependencies, or execute based on configured execution ORDER without dependency impact  available values: - NORMAL: leave unset - ORDER: sequence - REVERSE: descending ORDER  if not set, the default is NORMAL.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataTimeOrder(String DataTimeOrder) {
        this.DataTimeOrder = DataTimeOrder;
    }

    public DataBackfill() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataBackfill(DataBackfill source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DataBackfillPlanId != null) {
            this.DataBackfillPlanId = new String(source.DataBackfillPlanId);
        }
        if (source.DataBackfillPlanName != null) {
            this.DataBackfillPlanName = new String(source.DataBackfillPlanName);
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.DataBackfillRangeList != null) {
            this.DataBackfillRangeList = new DataBackfillRange[source.DataBackfillRangeList.length];
            for (int i = 0; i < source.DataBackfillRangeList.length; i++) {
                this.DataBackfillRangeList[i] = new DataBackfillRange(source.DataBackfillRangeList[i]);
            }
        }
        if (source.CheckParentType != null) {
            this.CheckParentType = new String(source.CheckParentType);
        }
        if (source.SkipEventListening != null) {
            this.SkipEventListening = new Boolean(source.SkipEventListening);
        }
        if (source.RedefineParallelNum != null) {
            this.RedefineParallelNum = new Long(source.RedefineParallelNum);
        }
        if (source.RedefineSelfWorkflowDependency != null) {
            this.RedefineSelfWorkflowDependency = new String(source.RedefineSelfWorkflowDependency);
        }
        if (source.SchedulerResourceGroupId != null) {
            this.SchedulerResourceGroupId = new String(source.SchedulerResourceGroupId);
        }
        if (source.IntegrationResourceGroupId != null) {
            this.IntegrationResourceGroupId = new String(source.IntegrationResourceGroupId);
        }
        if (source.RedefineCycleType != null) {
            this.RedefineCycleType = new String(source.RedefineCycleType);
        }
        if (source.RedefineParamList != null) {
            this.RedefineParamList = new KVPair[source.RedefineParamList.length];
            for (int i = 0; i < source.RedefineParamList.length; i++) {
                this.RedefineParamList[i] = new KVPair(source.RedefineParamList[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.CompletePercent != null) {
            this.CompletePercent = new Long(source.CompletePercent);
        }
        if (source.SuccessPercent != null) {
            this.SuccessPercent = new Long(source.SuccessPercent);
        }
        if (source.DataTimeOrder != null) {
            this.DataTimeOrder = new String(source.DataTimeOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DataBackfillPlanId", this.DataBackfillPlanId);
        this.setParamSimple(map, prefix + "DataBackfillPlanName", this.DataBackfillPlanName);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamArrayObj(map, prefix + "DataBackfillRangeList.", this.DataBackfillRangeList);
        this.setParamSimple(map, prefix + "CheckParentType", this.CheckParentType);
        this.setParamSimple(map, prefix + "SkipEventListening", this.SkipEventListening);
        this.setParamSimple(map, prefix + "RedefineParallelNum", this.RedefineParallelNum);
        this.setParamSimple(map, prefix + "RedefineSelfWorkflowDependency", this.RedefineSelfWorkflowDependency);
        this.setParamSimple(map, prefix + "SchedulerResourceGroupId", this.SchedulerResourceGroupId);
        this.setParamSimple(map, prefix + "IntegrationResourceGroupId", this.IntegrationResourceGroupId);
        this.setParamSimple(map, prefix + "RedefineCycleType", this.RedefineCycleType);
        this.setParamArrayObj(map, prefix + "RedefineParamList.", this.RedefineParamList);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "CompletePercent", this.CompletePercent);
        this.setParamSimple(map, prefix + "SuccessPercent", this.SuccessPercent);
        this.setParamSimple(map, prefix + "DataTimeOrder", this.DataTimeOrder);

    }
}

