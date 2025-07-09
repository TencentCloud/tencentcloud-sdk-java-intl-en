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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunGroup extends AbstractModel {

    /**
    * Run group ID
    */
    @SerializedName("RunGroupId")
    @Expose
    private String RunGroupId;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Project name
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Application ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Application name
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Application type
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * Environment ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Environment name
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * Table ID. Null for running in singleton mode.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Run name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Run description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Run status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Run input
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * WDL running option
    */
    @SerializedName("Option")
    @Expose
    private RunOption Option;

    /**
    * Nextflow running option
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NFOption")
    @Expose
    private NFOption NFOption;

    /**
    * Total number of runs
    */
    @SerializedName("TotalRun")
    @Expose
    private Long TotalRun;

    /**
    * Number of runs in various status
    */
    @SerializedName("RunStatusCounts")
    @Expose
    private RunStatusCount [] RunStatusCounts;

    /**
    * Execution time
    */
    @SerializedName("ExecutionTime")
    @Expose
    private ExecutionTime ExecutionTime;

    /**
    * Error message
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Creator
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * Creator ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * Running result notification method
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResultNotify")
    @Expose
    private String ResultNotify;

    /**
    * Application version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationVersion")
    @Expose
    private ApplicationVersion ApplicationVersion;

    /**
     * Get Run group ID 
     * @return RunGroupId Run group ID
     */
    public String getRunGroupId() {
        return this.RunGroupId;
    }

    /**
     * Set Run group ID
     * @param RunGroupId Run group ID
     */
    public void setRunGroupId(String RunGroupId) {
        this.RunGroupId = RunGroupId;
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
     * Get Application ID 
     * @return ApplicationId Application ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID
     * @param ApplicationId Application ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Application name 
     * @return ApplicationName Application name
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name
     * @param ApplicationName Application name
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Application type 
     * @return ApplicationType Application type
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set Application type
     * @param ApplicationType Application type
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get Environment ID 
     * @return EnvironmentId Environment ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment ID
     * @param EnvironmentId Environment ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Environment name 
     * @return EnvironmentName Environment name
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set Environment name
     * @param EnvironmentName Environment name
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get Table ID. Null for running in singleton mode.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableId Table ID. Null for running in singleton mode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Table ID. Null for running in singleton mode.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableId Table ID. Null for running in singleton mode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Run name 
     * @return Name Run name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Run name
     * @param Name Run name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Run description 
     * @return Description Run description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Run description
     * @param Description Run description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Run status 
     * @return Status Run status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Run status
     * @param Status Run status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Run input 
     * @return Input Run input
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set Run input
     * @param Input Run input
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get WDL running option 
     * @return Option WDL running option
     */
    public RunOption getOption() {
        return this.Option;
    }

    /**
     * Set WDL running option
     * @param Option WDL running option
     */
    public void setOption(RunOption Option) {
        this.Option = Option;
    }

    /**
     * Get Nextflow running option
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NFOption Nextflow running option
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NFOption getNFOption() {
        return this.NFOption;
    }

    /**
     * Set Nextflow running option
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NFOption Nextflow running option
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNFOption(NFOption NFOption) {
        this.NFOption = NFOption;
    }

    /**
     * Get Total number of runs 
     * @return TotalRun Total number of runs
     */
    public Long getTotalRun() {
        return this.TotalRun;
    }

    /**
     * Set Total number of runs
     * @param TotalRun Total number of runs
     */
    public void setTotalRun(Long TotalRun) {
        this.TotalRun = TotalRun;
    }

    /**
     * Get Number of runs in various status 
     * @return RunStatusCounts Number of runs in various status
     */
    public RunStatusCount [] getRunStatusCounts() {
        return this.RunStatusCounts;
    }

    /**
     * Set Number of runs in various status
     * @param RunStatusCounts Number of runs in various status
     */
    public void setRunStatusCounts(RunStatusCount [] RunStatusCounts) {
        this.RunStatusCounts = RunStatusCounts;
    }

    /**
     * Get Execution time 
     * @return ExecutionTime Execution time
     */
    public ExecutionTime getExecutionTime() {
        return this.ExecutionTime;
    }

    /**
     * Set Execution time
     * @param ExecutionTime Execution time
     */
    public void setExecutionTime(ExecutionTime ExecutionTime) {
        this.ExecutionTime = ExecutionTime;
    }

    /**
     * Get Error message 
     * @return ErrorMessage Error message
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set Error message
     * @param ErrorMessage Error message
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Creator
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Creator Creator
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set Creator
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Creator Creator
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Creator ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatorId Creator ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set Creator ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatorId Creator ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    /**
     * Get Running result notification method
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResultNotify Running result notification method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResultNotify() {
        return this.ResultNotify;
    }

    /**
     * Set Running result notification method
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResultNotify Running result notification method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResultNotify(String ResultNotify) {
        this.ResultNotify = ResultNotify;
    }

    /**
     * Get Application version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationVersion Application version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ApplicationVersion getApplicationVersion() {
        return this.ApplicationVersion;
    }

    /**
     * Set Application version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationVersion Application version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationVersion(ApplicationVersion ApplicationVersion) {
        this.ApplicationVersion = ApplicationVersion;
    }

    public RunGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunGroup(RunGroup source) {
        if (source.RunGroupId != null) {
            this.RunGroupId = new String(source.RunGroupId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Option != null) {
            this.Option = new RunOption(source.Option);
        }
        if (source.NFOption != null) {
            this.NFOption = new NFOption(source.NFOption);
        }
        if (source.TotalRun != null) {
            this.TotalRun = new Long(source.TotalRun);
        }
        if (source.RunStatusCounts != null) {
            this.RunStatusCounts = new RunStatusCount[source.RunStatusCounts.length];
            for (int i = 0; i < source.RunStatusCounts.length; i++) {
                this.RunStatusCounts[i] = new RunStatusCount(source.RunStatusCounts[i]);
            }
        }
        if (source.ExecutionTime != null) {
            this.ExecutionTime = new ExecutionTime(source.ExecutionTime);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreatorId != null) {
            this.CreatorId = new String(source.CreatorId);
        }
        if (source.ResultNotify != null) {
            this.ResultNotify = new String(source.ResultNotify);
        }
        if (source.ApplicationVersion != null) {
            this.ApplicationVersion = new ApplicationVersion(source.ApplicationVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RunGroupId", this.RunGroupId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamObj(map, prefix + "Option.", this.Option);
        this.setParamObj(map, prefix + "NFOption.", this.NFOption);
        this.setParamSimple(map, prefix + "TotalRun", this.TotalRun);
        this.setParamArrayObj(map, prefix + "RunStatusCounts.", this.RunStatusCounts);
        this.setParamObj(map, prefix + "ExecutionTime.", this.ExecutionTime);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatorId", this.CreatorId);
        this.setParamSimple(map, prefix + "ResultNotify", this.ResultNotify);
        this.setParamObj(map, prefix + "ApplicationVersion.", this.ApplicationVersion);

    }
}

