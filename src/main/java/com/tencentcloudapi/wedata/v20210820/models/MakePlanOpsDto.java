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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MakePlanOpsDto extends AbstractModel {

    /**
    * Supplement Plan ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * Supplement Plan Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MakeName")
    @Expose
    private String MakeName;

    /**
    * Project ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Check Parent Task Status for Supplement
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CheckParent")
    @Expose
    private Boolean CheckParent;

    /**
    * Use Original Task Self-Dependency Configuration
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SameSelfDependType")
    @Expose
    private Boolean SameSelfDependType;

    /**
    * Concurrency, effective when SameSelfDependType is false
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ParallelNum")
    @Expose
    private Long ParallelNum;

    /**
    * Modify Supplement Instance Generation Period
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SameCycle")
    @Expose
    private Boolean SameCycle;

    /**
    * Scheduling Cycle Conversion Method - Original Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SourceTaskCycle")
    @Expose
    private String SourceTaskCycle;

    /**
    * Scheduling Cycle Conversion Method - Target Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetTaskCycle")
    @Expose
    private String TargetTaskCycle;

    /**
    * Scheduling Cycle Conversion Method - Specific Time for Target Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetTaskAction")
    @Expose
    private Long TargetTaskAction;

    /**
    * Supplement Instance From Definition Parameters
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MapParamList")
    @Expose
    private StrToStrMap [] MapParamList;

    /**
    * Creator ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * Creator
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Supplementary Task ID Collection
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskIdList")
    @Expose
    private String [] TaskIdList;

    /**
    * Supplementary Plan Date Range
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MakeDatetimeList")
    @Expose
    private CreateMakeDatetimeInfo [] MakeDatetimeList;

    /**
    * Supplementary Plan Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Supplementary Designated Scheduling Resource Group (ID)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SchedulerResourceGroup")
    @Expose
    private String SchedulerResourceGroup;

    /**
    * Supplementary Scheduled Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SchedulerResourceGroupName")
    @Expose
    private String SchedulerResourceGroupName;

    /**
    * Supplementary Designated Integration Resource Group (ID)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IntegrationResourceGroup")
    @Expose
    private String IntegrationResourceGroup;

    /**
    * Supplementary Integrated Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IntegrationResourceGroupName")
    @Expose
    private String IntegrationResourceGroupName;

    /**
    * Number of Supplementary Plan Tasks
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * Percentage of Supplementary Plan Instances Completed
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CompletePercent")
    @Expose
    private Long CompletePercent;

    /**
    * Percentage of Supplementary Plan Instances Successful
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SuccessPercent")
    @Expose
    private Long SuccessPercent;

    /**
    * Check Parent Task Type for Supplementary. Value range:
<li> NONE: Do not check any </li>
<li> ALL: Check all upstream parent tasks </li>
<li> MAKE_SCOPE: Check only within the selected tasks of (the current supplementary plan) </li>
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CheckParentType")
    @Expose
    private String CheckParentType;

    /**
     * Get Supplement Plan ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PlanId Supplement Plan ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set Supplement Plan ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PlanId Supplement Plan ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get Supplement Plan Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MakeName Supplement Plan Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMakeName() {
        return this.MakeName;
    }

    /**
     * Set Supplement Plan Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MakeName Supplement Plan Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMakeName(String MakeName) {
        this.MakeName = MakeName;
    }

    /**
     * Get Project ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectId Project ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectId Project ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Check Parent Task Status for Supplement
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CheckParent Check Parent Task Status for Supplement
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getCheckParent() {
        return this.CheckParent;
    }

    /**
     * Set Check Parent Task Status for Supplement
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CheckParent Check Parent Task Status for Supplement
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCheckParent(Boolean CheckParent) {
        this.CheckParent = CheckParent;
    }

    /**
     * Get Use Original Task Self-Dependency Configuration
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SameSelfDependType Use Original Task Self-Dependency Configuration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getSameSelfDependType() {
        return this.SameSelfDependType;
    }

    /**
     * Set Use Original Task Self-Dependency Configuration
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SameSelfDependType Use Original Task Self-Dependency Configuration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSameSelfDependType(Boolean SameSelfDependType) {
        this.SameSelfDependType = SameSelfDependType;
    }

    /**
     * Get Concurrency, effective when SameSelfDependType is false
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ParallelNum Concurrency, effective when SameSelfDependType is false
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getParallelNum() {
        return this.ParallelNum;
    }

    /**
     * Set Concurrency, effective when SameSelfDependType is false
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ParallelNum Concurrency, effective when SameSelfDependType is false
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParallelNum(Long ParallelNum) {
        this.ParallelNum = ParallelNum;
    }

    /**
     * Get Modify Supplement Instance Generation Period
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SameCycle Modify Supplement Instance Generation Period
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getSameCycle() {
        return this.SameCycle;
    }

    /**
     * Set Modify Supplement Instance Generation Period
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SameCycle Modify Supplement Instance Generation Period
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSameCycle(Boolean SameCycle) {
        this.SameCycle = SameCycle;
    }

    /**
     * Get Scheduling Cycle Conversion Method - Original Cycle Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SourceTaskCycle Scheduling Cycle Conversion Method - Original Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSourceTaskCycle() {
        return this.SourceTaskCycle;
    }

    /**
     * Set Scheduling Cycle Conversion Method - Original Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SourceTaskCycle Scheduling Cycle Conversion Method - Original Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSourceTaskCycle(String SourceTaskCycle) {
        this.SourceTaskCycle = SourceTaskCycle;
    }

    /**
     * Get Scheduling Cycle Conversion Method - Target Cycle Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetTaskCycle Scheduling Cycle Conversion Method - Target Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTargetTaskCycle() {
        return this.TargetTaskCycle;
    }

    /**
     * Set Scheduling Cycle Conversion Method - Target Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetTaskCycle Scheduling Cycle Conversion Method - Target Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetTaskCycle(String TargetTaskCycle) {
        this.TargetTaskCycle = TargetTaskCycle;
    }

    /**
     * Get Scheduling Cycle Conversion Method - Specific Time for Target Cycle Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetTaskAction Scheduling Cycle Conversion Method - Specific Time for Target Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTargetTaskAction() {
        return this.TargetTaskAction;
    }

    /**
     * Set Scheduling Cycle Conversion Method - Specific Time for Target Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetTaskAction Scheduling Cycle Conversion Method - Specific Time for Target Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetTaskAction(Long TargetTaskAction) {
        this.TargetTaskAction = TargetTaskAction;
    }

    /**
     * Get Supplement Instance From Definition Parameters
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MapParamList Supplement Instance From Definition Parameters
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public StrToStrMap [] getMapParamList() {
        return this.MapParamList;
    }

    /**
     * Set Supplement Instance From Definition Parameters
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MapParamList Supplement Instance From Definition Parameters
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMapParamList(StrToStrMap [] MapParamList) {
        this.MapParamList = MapParamList;
    }

    /**
     * Get Creator ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CreatorId Creator ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set Creator ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CreatorId Creator ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    /**
     * Get Creator
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Creator Creator
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set Creator
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Creator Creator
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Creation TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Supplementary Task ID Collection
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskIdList Supplementary Task ID Collection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set Supplementary Task ID Collection
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskIdList Supplementary Task ID Collection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskIdList(String [] TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get Supplementary Plan Date Range
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MakeDatetimeList Supplementary Plan Date Range
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public CreateMakeDatetimeInfo [] getMakeDatetimeList() {
        return this.MakeDatetimeList;
    }

    /**
     * Set Supplementary Plan Date Range
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MakeDatetimeList Supplementary Plan Date Range
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMakeDatetimeList(CreateMakeDatetimeInfo [] MakeDatetimeList) {
        this.MakeDatetimeList = MakeDatetimeList;
    }

    /**
     * Get Supplementary Plan Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Remark Supplementary Plan Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Supplementary Plan Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Remark Supplementary Plan Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Supplementary Designated Scheduling Resource Group (ID)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SchedulerResourceGroup Supplementary Designated Scheduling Resource Group (ID)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSchedulerResourceGroup() {
        return this.SchedulerResourceGroup;
    }

    /**
     * Set Supplementary Designated Scheduling Resource Group (ID)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SchedulerResourceGroup Supplementary Designated Scheduling Resource Group (ID)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSchedulerResourceGroup(String SchedulerResourceGroup) {
        this.SchedulerResourceGroup = SchedulerResourceGroup;
    }

    /**
     * Get Supplementary Scheduled Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SchedulerResourceGroupName Supplementary Scheduled Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSchedulerResourceGroupName() {
        return this.SchedulerResourceGroupName;
    }

    /**
     * Set Supplementary Scheduled Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SchedulerResourceGroupName Supplementary Scheduled Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSchedulerResourceGroupName(String SchedulerResourceGroupName) {
        this.SchedulerResourceGroupName = SchedulerResourceGroupName;
    }

    /**
     * Get Supplementary Designated Integration Resource Group (ID)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IntegrationResourceGroup Supplementary Designated Integration Resource Group (ID)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getIntegrationResourceGroup() {
        return this.IntegrationResourceGroup;
    }

    /**
     * Set Supplementary Designated Integration Resource Group (ID)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IntegrationResourceGroup Supplementary Designated Integration Resource Group (ID)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIntegrationResourceGroup(String IntegrationResourceGroup) {
        this.IntegrationResourceGroup = IntegrationResourceGroup;
    }

    /**
     * Get Supplementary Integrated Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IntegrationResourceGroupName Supplementary Integrated Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getIntegrationResourceGroupName() {
        return this.IntegrationResourceGroupName;
    }

    /**
     * Set Supplementary Integrated Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IntegrationResourceGroupName Supplementary Integrated Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIntegrationResourceGroupName(String IntegrationResourceGroupName) {
        this.IntegrationResourceGroupName = IntegrationResourceGroupName;
    }

    /**
     * Get Number of Supplementary Plan Tasks
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskCount Number of Supplementary Plan Tasks
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set Number of Supplementary Plan Tasks
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskCount Number of Supplementary Plan Tasks
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get Percentage of Supplementary Plan Instances Completed
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CompletePercent Percentage of Supplementary Plan Instances Completed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCompletePercent() {
        return this.CompletePercent;
    }

    /**
     * Set Percentage of Supplementary Plan Instances Completed
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CompletePercent Percentage of Supplementary Plan Instances Completed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCompletePercent(Long CompletePercent) {
        this.CompletePercent = CompletePercent;
    }

    /**
     * Get Percentage of Supplementary Plan Instances Successful
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SuccessPercent Percentage of Supplementary Plan Instances Successful
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getSuccessPercent() {
        return this.SuccessPercent;
    }

    /**
     * Set Percentage of Supplementary Plan Instances Successful
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SuccessPercent Percentage of Supplementary Plan Instances Successful
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSuccessPercent(Long SuccessPercent) {
        this.SuccessPercent = SuccessPercent;
    }

    /**
     * Get Check Parent Task Type for Supplementary. Value range:
<li> NONE: Do not check any </li>
<li> ALL: Check all upstream parent tasks </li>
<li> MAKE_SCOPE: Check only within the selected tasks of (the current supplementary plan) </li>
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CheckParentType Check Parent Task Type for Supplementary. Value range:
<li> NONE: Do not check any </li>
<li> ALL: Check all upstream parent tasks </li>
<li> MAKE_SCOPE: Check only within the selected tasks of (the current supplementary plan) </li>
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCheckParentType() {
        return this.CheckParentType;
    }

    /**
     * Set Check Parent Task Type for Supplementary. Value range:
<li> NONE: Do not check any </li>
<li> ALL: Check all upstream parent tasks </li>
<li> MAKE_SCOPE: Check only within the selected tasks of (the current supplementary plan) </li>
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CheckParentType Check Parent Task Type for Supplementary. Value range:
<li> NONE: Do not check any </li>
<li> ALL: Check all upstream parent tasks </li>
<li> MAKE_SCOPE: Check only within the selected tasks of (the current supplementary plan) </li>
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCheckParentType(String CheckParentType) {
        this.CheckParentType = CheckParentType;
    }

    public MakePlanOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MakePlanOpsDto(MakePlanOpsDto source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.MakeName != null) {
            this.MakeName = new String(source.MakeName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CheckParent != null) {
            this.CheckParent = new Boolean(source.CheckParent);
        }
        if (source.SameSelfDependType != null) {
            this.SameSelfDependType = new Boolean(source.SameSelfDependType);
        }
        if (source.ParallelNum != null) {
            this.ParallelNum = new Long(source.ParallelNum);
        }
        if (source.SameCycle != null) {
            this.SameCycle = new Boolean(source.SameCycle);
        }
        if (source.SourceTaskCycle != null) {
            this.SourceTaskCycle = new String(source.SourceTaskCycle);
        }
        if (source.TargetTaskCycle != null) {
            this.TargetTaskCycle = new String(source.TargetTaskCycle);
        }
        if (source.TargetTaskAction != null) {
            this.TargetTaskAction = new Long(source.TargetTaskAction);
        }
        if (source.MapParamList != null) {
            this.MapParamList = new StrToStrMap[source.MapParamList.length];
            for (int i = 0; i < source.MapParamList.length; i++) {
                this.MapParamList[i] = new StrToStrMap(source.MapParamList[i]);
            }
        }
        if (source.CreatorId != null) {
            this.CreatorId = new String(source.CreatorId);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.TaskIdList != null) {
            this.TaskIdList = new String[source.TaskIdList.length];
            for (int i = 0; i < source.TaskIdList.length; i++) {
                this.TaskIdList[i] = new String(source.TaskIdList[i]);
            }
        }
        if (source.MakeDatetimeList != null) {
            this.MakeDatetimeList = new CreateMakeDatetimeInfo[source.MakeDatetimeList.length];
            for (int i = 0; i < source.MakeDatetimeList.length; i++) {
                this.MakeDatetimeList[i] = new CreateMakeDatetimeInfo(source.MakeDatetimeList[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SchedulerResourceGroup != null) {
            this.SchedulerResourceGroup = new String(source.SchedulerResourceGroup);
        }
        if (source.SchedulerResourceGroupName != null) {
            this.SchedulerResourceGroupName = new String(source.SchedulerResourceGroupName);
        }
        if (source.IntegrationResourceGroup != null) {
            this.IntegrationResourceGroup = new String(source.IntegrationResourceGroup);
        }
        if (source.IntegrationResourceGroupName != null) {
            this.IntegrationResourceGroupName = new String(source.IntegrationResourceGroupName);
        }
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.CompletePercent != null) {
            this.CompletePercent = new Long(source.CompletePercent);
        }
        if (source.SuccessPercent != null) {
            this.SuccessPercent = new Long(source.SuccessPercent);
        }
        if (source.CheckParentType != null) {
            this.CheckParentType = new String(source.CheckParentType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "MakeName", this.MakeName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CheckParent", this.CheckParent);
        this.setParamSimple(map, prefix + "SameSelfDependType", this.SameSelfDependType);
        this.setParamSimple(map, prefix + "ParallelNum", this.ParallelNum);
        this.setParamSimple(map, prefix + "SameCycle", this.SameCycle);
        this.setParamSimple(map, prefix + "SourceTaskCycle", this.SourceTaskCycle);
        this.setParamSimple(map, prefix + "TargetTaskCycle", this.TargetTaskCycle);
        this.setParamSimple(map, prefix + "TargetTaskAction", this.TargetTaskAction);
        this.setParamArrayObj(map, prefix + "MapParamList.", this.MapParamList);
        this.setParamSimple(map, prefix + "CreatorId", this.CreatorId);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "TaskIdList.", this.TaskIdList);
        this.setParamArrayObj(map, prefix + "MakeDatetimeList.", this.MakeDatetimeList);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SchedulerResourceGroup", this.SchedulerResourceGroup);
        this.setParamSimple(map, prefix + "SchedulerResourceGroupName", this.SchedulerResourceGroupName);
        this.setParamSimple(map, prefix + "IntegrationResourceGroup", this.IntegrationResourceGroup);
        this.setParamSimple(map, prefix + "IntegrationResourceGroupName", this.IntegrationResourceGroupName);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "CompletePercent", this.CompletePercent);
        this.setParamSimple(map, prefix + "SuccessPercent", this.SuccessPercent);
        this.setParamSimple(map, prefix + "CheckParentType", this.CheckParentType);

    }
}

