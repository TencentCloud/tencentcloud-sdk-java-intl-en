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

public class CreateOpsMakePlanRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Supplemental Plan Name
    */
    @SerializedName("MakeName")
    @Expose
    private String MakeName;

    /**
    * Supplementary Task Collection
    */
    @SerializedName("TaskIdList")
    @Expose
    private String [] TaskIdList;

    /**
    * Supplementary Plan Date Range
    */
    @SerializedName("MakeDatetimeList")
    @Expose
    private CreateMakeDatetimeInfo [] MakeDatetimeList;

    /**
    * Project Identifier
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * Check Parent Task Status for Supplement, default is not to check. Not recommended for use, will be deprecated, recommend using CheckParentType.
    */
    @SerializedName("CheckParent")
    @Expose
    private Boolean CheckParent;

    /**
    * Check Parent Task Type for Supplementary. Value range:
<li> NONE: Do not check any </li>
<li> ALL: Check all upstream parent tasks </li>
<li> MAKE_SCOPE: Check only within the selected tasks of (the current supplementary plan) </li>
    */
    @SerializedName("CheckParentType")
    @Expose
    private String CheckParentType;

    /**
    * Project name
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Deprecated. Task Self-Dependency Type: parallel, serial (unordered parallel), orderly (ordered serial)
    */
    @SerializedName("SelfDependence")
    @Expose
    private String SelfDependence;

    /**
    * Parallelism
    */
    @SerializedName("ParallelNum")
    @Expose
    private Long ParallelNum;

    /**
    * Is the generation cycle of the supplementary instance the same as the original cycle, default is true
    */
    @SerializedName("SameCycle")
    @Expose
    private Boolean SameCycle;

    /**
    * Supplementary Instance Target Cycle Type
    */
    @SerializedName("TargetTaskCycle")
    @Expose
    private String TargetTaskCycle;

    /**
    * Specified Time for Supplementary Instance Target Cycle Type
    */
    @SerializedName("TargetTaskAction")
    @Expose
    private Long TargetTaskAction;

    /**
    * Custom Parameters for Supplement Instance
    */
    @SerializedName("MapParamList")
    @Expose
    private StrToStrMap [] MapParamList;

    /**
    * Creator ID
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * Creator
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * Supplementary Plan Description
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Use Original Self-Dependency Configuration of Task, default is true
    */
    @SerializedName("SameSelfDependType")
    @Expose
    private Boolean SameSelfDependType;

    /**
    * Supplementary Instance Original Cycle Type
    */
    @SerializedName("SourceTaskCycle")
    @Expose
    private String SourceTaskCycle;

    /**
    * If no specified scheduling resource group (ID) is provided, the original task scheduling execution resource group will be used
    */
    @SerializedName("SchedulerResourceGroup")
    @Expose
    private String SchedulerResourceGroup;

    /**
    * If no specified integration resource group (ID) is provided, the original task integration execution resource group will be used
    */
    @SerializedName("IntegrationResourceGroup")
    @Expose
    private String IntegrationResourceGroup;

    /**
    * If no specified scheduling resource group name is provided, the original task scheduling execution resource group will be used
    */
    @SerializedName("SchedulerResourceGroupName")
    @Expose
    private String SchedulerResourceGroupName;

    /**
    * If no specified integration resource group name is provided, the original task integration execution resource group will be used
    */
    @SerializedName("IntegrationResourceGroupName")
    @Expose
    private String IntegrationResourceGroupName;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Supplemental Plan Name 
     * @return MakeName Supplemental Plan Name
     */
    public String getMakeName() {
        return this.MakeName;
    }

    /**
     * Set Supplemental Plan Name
     * @param MakeName Supplemental Plan Name
     */
    public void setMakeName(String MakeName) {
        this.MakeName = MakeName;
    }

    /**
     * Get Supplementary Task Collection 
     * @return TaskIdList Supplementary Task Collection
     */
    public String [] getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set Supplementary Task Collection
     * @param TaskIdList Supplementary Task Collection
     */
    public void setTaskIdList(String [] TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get Supplementary Plan Date Range 
     * @return MakeDatetimeList Supplementary Plan Date Range
     */
    public CreateMakeDatetimeInfo [] getMakeDatetimeList() {
        return this.MakeDatetimeList;
    }

    /**
     * Set Supplementary Plan Date Range
     * @param MakeDatetimeList Supplementary Plan Date Range
     */
    public void setMakeDatetimeList(CreateMakeDatetimeInfo [] MakeDatetimeList) {
        this.MakeDatetimeList = MakeDatetimeList;
    }

    /**
     * Get Project Identifier 
     * @return ProjectIdent Project Identifier
     */
    public String getProjectIdent() {
        return this.ProjectIdent;
    }

    /**
     * Set Project Identifier
     * @param ProjectIdent Project Identifier
     */
    public void setProjectIdent(String ProjectIdent) {
        this.ProjectIdent = ProjectIdent;
    }

    /**
     * Get Check Parent Task Status for Supplement, default is not to check. Not recommended for use, will be deprecated, recommend using CheckParentType. 
     * @return CheckParent Check Parent Task Status for Supplement, default is not to check. Not recommended for use, will be deprecated, recommend using CheckParentType.
     */
    public Boolean getCheckParent() {
        return this.CheckParent;
    }

    /**
     * Set Check Parent Task Status for Supplement, default is not to check. Not recommended for use, will be deprecated, recommend using CheckParentType.
     * @param CheckParent Check Parent Task Status for Supplement, default is not to check. Not recommended for use, will be deprecated, recommend using CheckParentType.
     */
    public void setCheckParent(Boolean CheckParent) {
        this.CheckParent = CheckParent;
    }

    /**
     * Get Check Parent Task Type for Supplementary. Value range:
<li> NONE: Do not check any </li>
<li> ALL: Check all upstream parent tasks </li>
<li> MAKE_SCOPE: Check only within the selected tasks of (the current supplementary plan) </li> 
     * @return CheckParentType Check Parent Task Type for Supplementary. Value range:
<li> NONE: Do not check any </li>
<li> ALL: Check all upstream parent tasks </li>
<li> MAKE_SCOPE: Check only within the selected tasks of (the current supplementary plan) </li>
     */
    public String getCheckParentType() {
        return this.CheckParentType;
    }

    /**
     * Set Check Parent Task Type for Supplementary. Value range:
<li> NONE: Do not check any </li>
<li> ALL: Check all upstream parent tasks </li>
<li> MAKE_SCOPE: Check only within the selected tasks of (the current supplementary plan) </li>
     * @param CheckParentType Check Parent Task Type for Supplementary. Value range:
<li> NONE: Do not check any </li>
<li> ALL: Check all upstream parent tasks </li>
<li> MAKE_SCOPE: Check only within the selected tasks of (the current supplementary plan) </li>
     */
    public void setCheckParentType(String CheckParentType) {
        this.CheckParentType = CheckParentType;
    }

    /**
     * Get Project name 
     * @return ProjectName Project name
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name
     * @param ProjectName Project name
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Deprecated. Task Self-Dependency Type: parallel, serial (unordered parallel), orderly (ordered serial) 
     * @return SelfDependence Deprecated. Task Self-Dependency Type: parallel, serial (unordered parallel), orderly (ordered serial)
     */
    public String getSelfDependence() {
        return this.SelfDependence;
    }

    /**
     * Set Deprecated. Task Self-Dependency Type: parallel, serial (unordered parallel), orderly (ordered serial)
     * @param SelfDependence Deprecated. Task Self-Dependency Type: parallel, serial (unordered parallel), orderly (ordered serial)
     */
    public void setSelfDependence(String SelfDependence) {
        this.SelfDependence = SelfDependence;
    }

    /**
     * Get Parallelism 
     * @return ParallelNum Parallelism
     */
    public Long getParallelNum() {
        return this.ParallelNum;
    }

    /**
     * Set Parallelism
     * @param ParallelNum Parallelism
     */
    public void setParallelNum(Long ParallelNum) {
        this.ParallelNum = ParallelNum;
    }

    /**
     * Get Is the generation cycle of the supplementary instance the same as the original cycle, default is true 
     * @return SameCycle Is the generation cycle of the supplementary instance the same as the original cycle, default is true
     */
    public Boolean getSameCycle() {
        return this.SameCycle;
    }

    /**
     * Set Is the generation cycle of the supplementary instance the same as the original cycle, default is true
     * @param SameCycle Is the generation cycle of the supplementary instance the same as the original cycle, default is true
     */
    public void setSameCycle(Boolean SameCycle) {
        this.SameCycle = SameCycle;
    }

    /**
     * Get Supplementary Instance Target Cycle Type 
     * @return TargetTaskCycle Supplementary Instance Target Cycle Type
     */
    public String getTargetTaskCycle() {
        return this.TargetTaskCycle;
    }

    /**
     * Set Supplementary Instance Target Cycle Type
     * @param TargetTaskCycle Supplementary Instance Target Cycle Type
     */
    public void setTargetTaskCycle(String TargetTaskCycle) {
        this.TargetTaskCycle = TargetTaskCycle;
    }

    /**
     * Get Specified Time for Supplementary Instance Target Cycle Type 
     * @return TargetTaskAction Specified Time for Supplementary Instance Target Cycle Type
     */
    public Long getTargetTaskAction() {
        return this.TargetTaskAction;
    }

    /**
     * Set Specified Time for Supplementary Instance Target Cycle Type
     * @param TargetTaskAction Specified Time for Supplementary Instance Target Cycle Type
     */
    public void setTargetTaskAction(Long TargetTaskAction) {
        this.TargetTaskAction = TargetTaskAction;
    }

    /**
     * Get Custom Parameters for Supplement Instance 
     * @return MapParamList Custom Parameters for Supplement Instance
     */
    public StrToStrMap [] getMapParamList() {
        return this.MapParamList;
    }

    /**
     * Set Custom Parameters for Supplement Instance
     * @param MapParamList Custom Parameters for Supplement Instance
     */
    public void setMapParamList(StrToStrMap [] MapParamList) {
        this.MapParamList = MapParamList;
    }

    /**
     * Get Creator ID 
     * @return CreatorId Creator ID
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set Creator ID
     * @param CreatorId Creator ID
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    /**
     * Get Creator 
     * @return Creator Creator
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set Creator
     * @param Creator Creator
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Supplementary Plan Description 
     * @return Remark Supplementary Plan Description
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Supplementary Plan Description
     * @param Remark Supplementary Plan Description
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Use Original Self-Dependency Configuration of Task, default is true 
     * @return SameSelfDependType Use Original Self-Dependency Configuration of Task, default is true
     */
    public Boolean getSameSelfDependType() {
        return this.SameSelfDependType;
    }

    /**
     * Set Use Original Self-Dependency Configuration of Task, default is true
     * @param SameSelfDependType Use Original Self-Dependency Configuration of Task, default is true
     */
    public void setSameSelfDependType(Boolean SameSelfDependType) {
        this.SameSelfDependType = SameSelfDependType;
    }

    /**
     * Get Supplementary Instance Original Cycle Type 
     * @return SourceTaskCycle Supplementary Instance Original Cycle Type
     */
    public String getSourceTaskCycle() {
        return this.SourceTaskCycle;
    }

    /**
     * Set Supplementary Instance Original Cycle Type
     * @param SourceTaskCycle Supplementary Instance Original Cycle Type
     */
    public void setSourceTaskCycle(String SourceTaskCycle) {
        this.SourceTaskCycle = SourceTaskCycle;
    }

    /**
     * Get If no specified scheduling resource group (ID) is provided, the original task scheduling execution resource group will be used 
     * @return SchedulerResourceGroup If no specified scheduling resource group (ID) is provided, the original task scheduling execution resource group will be used
     */
    public String getSchedulerResourceGroup() {
        return this.SchedulerResourceGroup;
    }

    /**
     * Set If no specified scheduling resource group (ID) is provided, the original task scheduling execution resource group will be used
     * @param SchedulerResourceGroup If no specified scheduling resource group (ID) is provided, the original task scheduling execution resource group will be used
     */
    public void setSchedulerResourceGroup(String SchedulerResourceGroup) {
        this.SchedulerResourceGroup = SchedulerResourceGroup;
    }

    /**
     * Get If no specified integration resource group (ID) is provided, the original task integration execution resource group will be used 
     * @return IntegrationResourceGroup If no specified integration resource group (ID) is provided, the original task integration execution resource group will be used
     */
    public String getIntegrationResourceGroup() {
        return this.IntegrationResourceGroup;
    }

    /**
     * Set If no specified integration resource group (ID) is provided, the original task integration execution resource group will be used
     * @param IntegrationResourceGroup If no specified integration resource group (ID) is provided, the original task integration execution resource group will be used
     */
    public void setIntegrationResourceGroup(String IntegrationResourceGroup) {
        this.IntegrationResourceGroup = IntegrationResourceGroup;
    }

    /**
     * Get If no specified scheduling resource group name is provided, the original task scheduling execution resource group will be used 
     * @return SchedulerResourceGroupName If no specified scheduling resource group name is provided, the original task scheduling execution resource group will be used
     */
    public String getSchedulerResourceGroupName() {
        return this.SchedulerResourceGroupName;
    }

    /**
     * Set If no specified scheduling resource group name is provided, the original task scheduling execution resource group will be used
     * @param SchedulerResourceGroupName If no specified scheduling resource group name is provided, the original task scheduling execution resource group will be used
     */
    public void setSchedulerResourceGroupName(String SchedulerResourceGroupName) {
        this.SchedulerResourceGroupName = SchedulerResourceGroupName;
    }

    /**
     * Get If no specified integration resource group name is provided, the original task integration execution resource group will be used 
     * @return IntegrationResourceGroupName If no specified integration resource group name is provided, the original task integration execution resource group will be used
     */
    public String getIntegrationResourceGroupName() {
        return this.IntegrationResourceGroupName;
    }

    /**
     * Set If no specified integration resource group name is provided, the original task integration execution resource group will be used
     * @param IntegrationResourceGroupName If no specified integration resource group name is provided, the original task integration execution resource group will be used
     */
    public void setIntegrationResourceGroupName(String IntegrationResourceGroupName) {
        this.IntegrationResourceGroupName = IntegrationResourceGroupName;
    }

    public CreateOpsMakePlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOpsMakePlanRequest(CreateOpsMakePlanRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.MakeName != null) {
            this.MakeName = new String(source.MakeName);
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
        if (source.ProjectIdent != null) {
            this.ProjectIdent = new String(source.ProjectIdent);
        }
        if (source.CheckParent != null) {
            this.CheckParent = new Boolean(source.CheckParent);
        }
        if (source.CheckParentType != null) {
            this.CheckParentType = new String(source.CheckParentType);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.SelfDependence != null) {
            this.SelfDependence = new String(source.SelfDependence);
        }
        if (source.ParallelNum != null) {
            this.ParallelNum = new Long(source.ParallelNum);
        }
        if (source.SameCycle != null) {
            this.SameCycle = new Boolean(source.SameCycle);
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
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SameSelfDependType != null) {
            this.SameSelfDependType = new Boolean(source.SameSelfDependType);
        }
        if (source.SourceTaskCycle != null) {
            this.SourceTaskCycle = new String(source.SourceTaskCycle);
        }
        if (source.SchedulerResourceGroup != null) {
            this.SchedulerResourceGroup = new String(source.SchedulerResourceGroup);
        }
        if (source.IntegrationResourceGroup != null) {
            this.IntegrationResourceGroup = new String(source.IntegrationResourceGroup);
        }
        if (source.SchedulerResourceGroupName != null) {
            this.SchedulerResourceGroupName = new String(source.SchedulerResourceGroupName);
        }
        if (source.IntegrationResourceGroupName != null) {
            this.IntegrationResourceGroupName = new String(source.IntegrationResourceGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "MakeName", this.MakeName);
        this.setParamArraySimple(map, prefix + "TaskIdList.", this.TaskIdList);
        this.setParamArrayObj(map, prefix + "MakeDatetimeList.", this.MakeDatetimeList);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "CheckParent", this.CheckParent);
        this.setParamSimple(map, prefix + "CheckParentType", this.CheckParentType);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "SelfDependence", this.SelfDependence);
        this.setParamSimple(map, prefix + "ParallelNum", this.ParallelNum);
        this.setParamSimple(map, prefix + "SameCycle", this.SameCycle);
        this.setParamSimple(map, prefix + "TargetTaskCycle", this.TargetTaskCycle);
        this.setParamSimple(map, prefix + "TargetTaskAction", this.TargetTaskAction);
        this.setParamArrayObj(map, prefix + "MapParamList.", this.MapParamList);
        this.setParamSimple(map, prefix + "CreatorId", this.CreatorId);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SameSelfDependType", this.SameSelfDependType);
        this.setParamSimple(map, prefix + "SourceTaskCycle", this.SourceTaskCycle);
        this.setParamSimple(map, prefix + "SchedulerResourceGroup", this.SchedulerResourceGroup);
        this.setParamSimple(map, prefix + "IntegrationResourceGroup", this.IntegrationResourceGroup);
        this.setParamSimple(map, prefix + "SchedulerResourceGroupName", this.SchedulerResourceGroupName);
        this.setParamSimple(map, prefix + "IntegrationResourceGroupName", this.IntegrationResourceGroupName);

    }
}

