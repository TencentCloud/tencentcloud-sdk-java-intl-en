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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Run extends AbstractModel {

    /**
    * Run UUID
    */
    @SerializedName("RunUuid")
    @Expose
    private String RunUuid;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Application ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Run group ID
    */
    @SerializedName("RunGroupId")
    @Expose
    private String RunGroupId;

    /**
    * Environment ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * User-defined ID. Null for running in singleton mode.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserDefinedId")
    @Expose
    private String UserDefinedId;

    /**
    * Table ID. Null for running in singleton mode.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Table row UUID. Null for running in singleton mode.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableRowUuid")
    @Expose
    private String TableRowUuid;

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
    * Running option
    */
    @SerializedName("Option")
    @Expose
    private RunOption Option;

    /**
    * Execution time
    */
    @SerializedName("ExecutionTime")
    @Expose
    private ExecutionTime ExecutionTime;

    /**
    * Cache information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cache")
    @Expose
    private CacheInfo Cache;

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
     * Get Run UUID 
     * @return RunUuid Run UUID
     */
    public String getRunUuid() {
        return this.RunUuid;
    }

    /**
     * Set Run UUID
     * @param RunUuid Run UUID
     */
    public void setRunUuid(String RunUuid) {
        this.RunUuid = RunUuid;
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
     * Get User-defined ID. Null for running in singleton mode.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserDefinedId User-defined ID. Null for running in singleton mode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserDefinedId() {
        return this.UserDefinedId;
    }

    /**
     * Set User-defined ID. Null for running in singleton mode.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserDefinedId User-defined ID. Null for running in singleton mode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserDefinedId(String UserDefinedId) {
        this.UserDefinedId = UserDefinedId;
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
     * Get Table row UUID. Null for running in singleton mode.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableRowUuid Table row UUID. Null for running in singleton mode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableRowUuid() {
        return this.TableRowUuid;
    }

    /**
     * Set Table row UUID. Null for running in singleton mode.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableRowUuid Table row UUID. Null for running in singleton mode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableRowUuid(String TableRowUuid) {
        this.TableRowUuid = TableRowUuid;
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
     * Get Running option 
     * @return Option Running option
     * @deprecated
     */
    @Deprecated
    public RunOption getOption() {
        return this.Option;
    }

    /**
     * Set Running option
     * @param Option Running option
     * @deprecated
     */
    @Deprecated
    public void setOption(RunOption Option) {
        this.Option = Option;
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
     * Get Cache information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Cache Cache information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CacheInfo getCache() {
        return this.Cache;
    }

    /**
     * Set Cache information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Cache Cache information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCache(CacheInfo Cache) {
        this.Cache = Cache;
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

    public Run() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Run(Run source) {
        if (source.RunUuid != null) {
            this.RunUuid = new String(source.RunUuid);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.RunGroupId != null) {
            this.RunGroupId = new String(source.RunGroupId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.UserDefinedId != null) {
            this.UserDefinedId = new String(source.UserDefinedId);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableRowUuid != null) {
            this.TableRowUuid = new String(source.TableRowUuid);
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
        if (source.ExecutionTime != null) {
            this.ExecutionTime = new ExecutionTime(source.ExecutionTime);
        }
        if (source.Cache != null) {
            this.Cache = new CacheInfo(source.Cache);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RunUuid", this.RunUuid);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "RunGroupId", this.RunGroupId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "UserDefinedId", this.UserDefinedId);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableRowUuid", this.TableRowUuid);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamObj(map, prefix + "Option.", this.Option);
        this.setParamObj(map, prefix + "ExecutionTime.", this.ExecutionTime);
        this.setParamObj(map, prefix + "Cache.", this.Cache);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

