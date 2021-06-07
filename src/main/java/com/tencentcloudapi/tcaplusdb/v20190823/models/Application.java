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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Application extends AbstractModel{

    /**
    * Application ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Application type
    */
    @SerializedName("ApplicationType")
    @Expose
    private Long ApplicationType;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Table group name
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("TableGroupName")
    @Expose
    private String TableGroupName;

    /**
    * Table name
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Applicant
    */
    @SerializedName("Applicant")
    @Expose
    private String Applicant;

    /**
    * The creation time of the application
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Status. Valid values: `-1` (canceled), `0` (pending approval), `1` (application approved and task submitted), `2` (rejected)
    */
    @SerializedName("ApplicationStatus")
    @Expose
    private Long ApplicationStatus;

    /**
    * Table group ID
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * ID of the submitted task (if the application is not approved, this parameter is `0`)
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Globally unique table ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("TableInstanceId")
    @Expose
    private String TableInstanceId;

    /**
    * Update time
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Approver
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecuteUser")
    @Expose
    private String ExecuteUser;

    /**
    * Execution status
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecuteStatus")
    @Expose
    private String ExecuteStatus;

    /**
    * Whether the application can be approved by the API caller
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("CanCensor")
    @Expose
    private Boolean CanCensor;

    /**
    * Whether the application can be canceled by the API caller
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("CanWithdrawal")
    @Expose
    private Boolean CanWithdrawal;

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
     * Get Application type 
     * @return ApplicationType Application type
     */
    public Long getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set Application type
     * @param ApplicationType Application type
     */
    public void setApplicationType(Long ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cluster name 
     * @return ClusterName Cluster name
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name
     * @param ClusterName Cluster name
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Table group name
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return TableGroupName Table group name
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getTableGroupName() {
        return this.TableGroupName;
    }

    /**
     * Set Table group name
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param TableGroupName Table group name
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setTableGroupName(String TableGroupName) {
        this.TableGroupName = TableGroupName;
    }

    /**
     * Get Table name 
     * @return TableName Table name
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name
     * @param TableName Table name
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Applicant 
     * @return Applicant Applicant
     */
    public String getApplicant() {
        return this.Applicant;
    }

    /**
     * Set Applicant
     * @param Applicant Applicant
     */
    public void setApplicant(String Applicant) {
        this.Applicant = Applicant;
    }

    /**
     * Get The creation time of the application 
     * @return CreatedTime The creation time of the application
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set The creation time of the application
     * @param CreatedTime The creation time of the application
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Status. Valid values: `-1` (canceled), `0` (pending approval), `1` (application approved and task submitted), `2` (rejected) 
     * @return ApplicationStatus Status. Valid values: `-1` (canceled), `0` (pending approval), `1` (application approved and task submitted), `2` (rejected)
     */
    public Long getApplicationStatus() {
        return this.ApplicationStatus;
    }

    /**
     * Set Status. Valid values: `-1` (canceled), `0` (pending approval), `1` (application approved and task submitted), `2` (rejected)
     * @param ApplicationStatus Status. Valid values: `-1` (canceled), `0` (pending approval), `1` (application approved and task submitted), `2` (rejected)
     */
    public void setApplicationStatus(Long ApplicationStatus) {
        this.ApplicationStatus = ApplicationStatus;
    }

    /**
     * Get Table group ID 
     * @return TableGroupId Table group ID
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set Table group ID
     * @param TableGroupId Table group ID
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get ID of the submitted task (if the application is not approved, this parameter is `0`) 
     * @return TaskId ID of the submitted task (if the application is not approved, this parameter is `0`)
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set ID of the submitted task (if the application is not approved, this parameter is `0`)
     * @param TaskId ID of the submitted task (if the application is not approved, this parameter is `0`)
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Globally unique table ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return TableInstanceId Globally unique table ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getTableInstanceId() {
        return this.TableInstanceId;
    }

    /**
     * Set Globally unique table ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param TableInstanceId Globally unique table ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setTableInstanceId(String TableInstanceId) {
        this.TableInstanceId = TableInstanceId;
    }

    /**
     * Get Update time
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param UpdateTime Update time
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Approver
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return ExecuteUser Approver
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getExecuteUser() {
        return this.ExecuteUser;
    }

    /**
     * Set Approver
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param ExecuteUser Approver
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setExecuteUser(String ExecuteUser) {
        this.ExecuteUser = ExecuteUser;
    }

    /**
     * Get Execution status
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return ExecuteStatus Execution status
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getExecuteStatus() {
        return this.ExecuteStatus;
    }

    /**
     * Set Execution status
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param ExecuteStatus Execution status
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setExecuteStatus(String ExecuteStatus) {
        this.ExecuteStatus = ExecuteStatus;
    }

    /**
     * Get Whether the application can be approved by the API caller
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return CanCensor Whether the application can be approved by the API caller
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Boolean getCanCensor() {
        return this.CanCensor;
    }

    /**
     * Set Whether the application can be approved by the API caller
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param CanCensor Whether the application can be approved by the API caller
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setCanCensor(Boolean CanCensor) {
        this.CanCensor = CanCensor;
    }

    /**
     * Get Whether the application can be canceled by the API caller
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return CanWithdrawal Whether the application can be canceled by the API caller
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Boolean getCanWithdrawal() {
        return this.CanWithdrawal;
    }

    /**
     * Set Whether the application can be canceled by the API caller
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param CanWithdrawal Whether the application can be canceled by the API caller
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setCanWithdrawal(Boolean CanWithdrawal) {
        this.CanWithdrawal = CanWithdrawal;
    }

    public Application() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Application(Application source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new Long(source.ApplicationType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.TableGroupName != null) {
            this.TableGroupName = new String(source.TableGroupName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Applicant != null) {
            this.Applicant = new String(source.Applicant);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ApplicationStatus != null) {
            this.ApplicationStatus = new Long(source.ApplicationStatus);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TableInstanceId != null) {
            this.TableInstanceId = new String(source.TableInstanceId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ExecuteUser != null) {
            this.ExecuteUser = new String(source.ExecuteUser);
        }
        if (source.ExecuteStatus != null) {
            this.ExecuteStatus = new String(source.ExecuteStatus);
        }
        if (source.CanCensor != null) {
            this.CanCensor = new Boolean(source.CanCensor);
        }
        if (source.CanWithdrawal != null) {
            this.CanWithdrawal = new Boolean(source.CanWithdrawal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "TableGroupName", this.TableGroupName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "Applicant", this.Applicant);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ApplicationStatus", this.ApplicationStatus);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TableInstanceId", this.TableInstanceId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ExecuteUser", this.ExecuteUser);
        this.setParamSimple(map, prefix + "ExecuteStatus", this.ExecuteStatus);
        this.setParamSimple(map, prefix + "CanCensor", this.CanCensor);
        this.setParamSimple(map, prefix + "CanWithdrawal", this.CanWithdrawal);

    }
}

