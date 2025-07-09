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

public class DiagnoseProRequest extends AbstractModel {

    /**
    * Instance List
    */
    @SerializedName("Instances")
    @Expose
    private InstanceOpsDto [] Instances;

    /**
    * Check Parent Task Type, true: Check parent task; false: Do not check parent task
    */
    @SerializedName("CheckFather")
    @Expose
    private Boolean CheckFather;

    /**
    * Rerun Type, 1: Self; 3: Child; 2: Self and Child
    */
    @SerializedName("RerunType")
    @Expose
    private String RerunType;

    /**
    * Instance Dependency Mode, 1: Self-dependent; 2: Task-dependent; 3: Self and Parent-Child dependent
    */
    @SerializedName("DependentWay")
    @Expose
    private String DependentWay;

    /**
    * Rerun Ignore Event Listening or Not
    */
    @SerializedName("SkipEventListening")
    @Expose
    private Boolean SkipEventListening;

    /**
    * Downstream Instance Range 1: Within the workflow 2: Within the project 3: Across all workflows dependent on the project
    */
    @SerializedName("SonInstanceType")
    @Expose
    private String SonInstanceType;

    /**
    * Query Conditions (TaskId and CurRunDate need to be filled in this field for diagnosis)
    */
    @SerializedName("SearchCondition")
    @Expose
    private InstanceApiOpsRequest SearchCondition;

    /**
    * Access type
    */
    @SerializedName("OptType")
    @Expose
    private String OptType;

    /**
    * Operator Name
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
    * Operator ID
    */
    @SerializedName("OperatorId")
    @Expose
    private String OperatorId;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Project Identifier
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * Project name
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Index Page Number
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * Page size
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Total Data
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Basic Request Information
    */
    @SerializedName("RequestBaseInfo")
    @Expose
    private ProjectBaseInfoOpsRequest RequestBaseInfo;

    /**
    * Whether to Calculate Total
    */
    @SerializedName("IsCount")
    @Expose
    private Boolean IsCount;

    /**
     * Get Instance List 
     * @return Instances Instance List
     */
    public InstanceOpsDto [] getInstances() {
        return this.Instances;
    }

    /**
     * Set Instance List
     * @param Instances Instance List
     */
    public void setInstances(InstanceOpsDto [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get Check Parent Task Type, true: Check parent task; false: Do not check parent task 
     * @return CheckFather Check Parent Task Type, true: Check parent task; false: Do not check parent task
     */
    public Boolean getCheckFather() {
        return this.CheckFather;
    }

    /**
     * Set Check Parent Task Type, true: Check parent task; false: Do not check parent task
     * @param CheckFather Check Parent Task Type, true: Check parent task; false: Do not check parent task
     */
    public void setCheckFather(Boolean CheckFather) {
        this.CheckFather = CheckFather;
    }

    /**
     * Get Rerun Type, 1: Self; 3: Child; 2: Self and Child 
     * @return RerunType Rerun Type, 1: Self; 3: Child; 2: Self and Child
     */
    public String getRerunType() {
        return this.RerunType;
    }

    /**
     * Set Rerun Type, 1: Self; 3: Child; 2: Self and Child
     * @param RerunType Rerun Type, 1: Self; 3: Child; 2: Self and Child
     */
    public void setRerunType(String RerunType) {
        this.RerunType = RerunType;
    }

    /**
     * Get Instance Dependency Mode, 1: Self-dependent; 2: Task-dependent; 3: Self and Parent-Child dependent 
     * @return DependentWay Instance Dependency Mode, 1: Self-dependent; 2: Task-dependent; 3: Self and Parent-Child dependent
     */
    public String getDependentWay() {
        return this.DependentWay;
    }

    /**
     * Set Instance Dependency Mode, 1: Self-dependent; 2: Task-dependent; 3: Self and Parent-Child dependent
     * @param DependentWay Instance Dependency Mode, 1: Self-dependent; 2: Task-dependent; 3: Self and Parent-Child dependent
     */
    public void setDependentWay(String DependentWay) {
        this.DependentWay = DependentWay;
    }

    /**
     * Get Rerun Ignore Event Listening or Not 
     * @return SkipEventListening Rerun Ignore Event Listening or Not
     */
    public Boolean getSkipEventListening() {
        return this.SkipEventListening;
    }

    /**
     * Set Rerun Ignore Event Listening or Not
     * @param SkipEventListening Rerun Ignore Event Listening or Not
     */
    public void setSkipEventListening(Boolean SkipEventListening) {
        this.SkipEventListening = SkipEventListening;
    }

    /**
     * Get Downstream Instance Range 1: Within the workflow 2: Within the project 3: Across all workflows dependent on the project 
     * @return SonInstanceType Downstream Instance Range 1: Within the workflow 2: Within the project 3: Across all workflows dependent on the project
     */
    public String getSonInstanceType() {
        return this.SonInstanceType;
    }

    /**
     * Set Downstream Instance Range 1: Within the workflow 2: Within the project 3: Across all workflows dependent on the project
     * @param SonInstanceType Downstream Instance Range 1: Within the workflow 2: Within the project 3: Across all workflows dependent on the project
     */
    public void setSonInstanceType(String SonInstanceType) {
        this.SonInstanceType = SonInstanceType;
    }

    /**
     * Get Query Conditions (TaskId and CurRunDate need to be filled in this field for diagnosis) 
     * @return SearchCondition Query Conditions (TaskId and CurRunDate need to be filled in this field for diagnosis)
     */
    public InstanceApiOpsRequest getSearchCondition() {
        return this.SearchCondition;
    }

    /**
     * Set Query Conditions (TaskId and CurRunDate need to be filled in this field for diagnosis)
     * @param SearchCondition Query Conditions (TaskId and CurRunDate need to be filled in this field for diagnosis)
     */
    public void setSearchCondition(InstanceApiOpsRequest SearchCondition) {
        this.SearchCondition = SearchCondition;
    }

    /**
     * Get Access type 
     * @return OptType Access type
     */
    public String getOptType() {
        return this.OptType;
    }

    /**
     * Set Access type
     * @param OptType Access type
     */
    public void setOptType(String OptType) {
        this.OptType = OptType;
    }

    /**
     * Get Operator Name 
     * @return OperatorName Operator Name
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set Operator Name
     * @param OperatorName Operator Name
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    /**
     * Get Operator ID 
     * @return OperatorId Operator ID
     */
    public String getOperatorId() {
        return this.OperatorId;
    }

    /**
     * Set Operator ID
     * @param OperatorId Operator ID
     */
    public void setOperatorId(String OperatorId) {
        this.OperatorId = OperatorId;
    }

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
     * Get Index Page Number 
     * @return PageIndex Index Page Number
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set Index Page Number
     * @param PageIndex Index Page Number
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get Page size 
     * @return PageSize Page size
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size
     * @param PageSize Page size
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Total Data 
     * @return Count Total Data
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Total Data
     * @param Count Total Data
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Basic Request Information 
     * @return RequestBaseInfo Basic Request Information
     */
    public ProjectBaseInfoOpsRequest getRequestBaseInfo() {
        return this.RequestBaseInfo;
    }

    /**
     * Set Basic Request Information
     * @param RequestBaseInfo Basic Request Information
     */
    public void setRequestBaseInfo(ProjectBaseInfoOpsRequest RequestBaseInfo) {
        this.RequestBaseInfo = RequestBaseInfo;
    }

    /**
     * Get Whether to Calculate Total 
     * @return IsCount Whether to Calculate Total
     */
    public Boolean getIsCount() {
        return this.IsCount;
    }

    /**
     * Set Whether to Calculate Total
     * @param IsCount Whether to Calculate Total
     */
    public void setIsCount(Boolean IsCount) {
        this.IsCount = IsCount;
    }

    public DiagnoseProRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiagnoseProRequest(DiagnoseProRequest source) {
        if (source.Instances != null) {
            this.Instances = new InstanceOpsDto[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new InstanceOpsDto(source.Instances[i]);
            }
        }
        if (source.CheckFather != null) {
            this.CheckFather = new Boolean(source.CheckFather);
        }
        if (source.RerunType != null) {
            this.RerunType = new String(source.RerunType);
        }
        if (source.DependentWay != null) {
            this.DependentWay = new String(source.DependentWay);
        }
        if (source.SkipEventListening != null) {
            this.SkipEventListening = new Boolean(source.SkipEventListening);
        }
        if (source.SonInstanceType != null) {
            this.SonInstanceType = new String(source.SonInstanceType);
        }
        if (source.SearchCondition != null) {
            this.SearchCondition = new InstanceApiOpsRequest(source.SearchCondition);
        }
        if (source.OptType != null) {
            this.OptType = new String(source.OptType);
        }
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
        }
        if (source.OperatorId != null) {
            this.OperatorId = new String(source.OperatorId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectIdent != null) {
            this.ProjectIdent = new String(source.ProjectIdent);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.RequestBaseInfo != null) {
            this.RequestBaseInfo = new ProjectBaseInfoOpsRequest(source.RequestBaseInfo);
        }
        if (source.IsCount != null) {
            this.IsCount = new Boolean(source.IsCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamSimple(map, prefix + "CheckFather", this.CheckFather);
        this.setParamSimple(map, prefix + "RerunType", this.RerunType);
        this.setParamSimple(map, prefix + "DependentWay", this.DependentWay);
        this.setParamSimple(map, prefix + "SkipEventListening", this.SkipEventListening);
        this.setParamSimple(map, prefix + "SonInstanceType", this.SonInstanceType);
        this.setParamObj(map, prefix + "SearchCondition.", this.SearchCondition);
        this.setParamSimple(map, prefix + "OptType", this.OptType);
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);
        this.setParamSimple(map, prefix + "OperatorId", this.OperatorId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamObj(map, prefix + "RequestBaseInfo.", this.RequestBaseInfo);
        this.setParamSimple(map, prefix + "IsCount", this.IsCount);

    }
}

