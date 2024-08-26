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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInfo extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Permission configuration ID.
    */
    @SerializedName("RoleConfigurationId")
    @Expose
    private String RoleConfigurationId;

    /**
    * Permission configuration name.
    */
    @SerializedName("RoleConfigurationName")
    @Expose
    private String RoleConfigurationName;

    /**
    * UIN of the authorized target member account.
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * Type of the synchronized target account. ManagerUin: admin account; MemberUin: member account.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * Identity ID for the user authorization. If the identity type is CIC user, it is the user ID; if the identity type is user group, it is the user group ID.
    */
    @SerializedName("PrincipalId")
    @Expose
    private String PrincipalId;

    /**
    * Identity type for the user authorization. User: CIC user; Group: CIC user group.
    */
    @SerializedName("PrincipalType")
    @Expose
    private String PrincipalType;

    /**
    * Task type.
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * InProgress: The task is being executed; Success: The task execution succeeded; Failed: The task execution failed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Cause of the failure.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Permission configuration ID. 
     * @return RoleConfigurationId Permission configuration ID.
     */
    public String getRoleConfigurationId() {
        return this.RoleConfigurationId;
    }

    /**
     * Set Permission configuration ID.
     * @param RoleConfigurationId Permission configuration ID.
     */
    public void setRoleConfigurationId(String RoleConfigurationId) {
        this.RoleConfigurationId = RoleConfigurationId;
    }

    /**
     * Get Permission configuration name. 
     * @return RoleConfigurationName Permission configuration name.
     */
    public String getRoleConfigurationName() {
        return this.RoleConfigurationName;
    }

    /**
     * Set Permission configuration name.
     * @param RoleConfigurationName Permission configuration name.
     */
    public void setRoleConfigurationName(String RoleConfigurationName) {
        this.RoleConfigurationName = RoleConfigurationName;
    }

    /**
     * Get UIN of the authorized target member account. 
     * @return TargetUin UIN of the authorized target member account.
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set UIN of the authorized target member account.
     * @param TargetUin UIN of the authorized target member account.
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get Type of the synchronized target account. ManagerUin: admin account; MemberUin: member account. 
     * @return TargetType Type of the synchronized target account. ManagerUin: admin account; MemberUin: member account.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Type of the synchronized target account. ManagerUin: admin account; MemberUin: member account.
     * @param TargetType Type of the synchronized target account. ManagerUin: admin account; MemberUin: member account.
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Identity ID for the user authorization. If the identity type is CIC user, it is the user ID; if the identity type is user group, it is the user group ID. 
     * @return PrincipalId Identity ID for the user authorization. If the identity type is CIC user, it is the user ID; if the identity type is user group, it is the user group ID.
     */
    public String getPrincipalId() {
        return this.PrincipalId;
    }

    /**
     * Set Identity ID for the user authorization. If the identity type is CIC user, it is the user ID; if the identity type is user group, it is the user group ID.
     * @param PrincipalId Identity ID for the user authorization. If the identity type is CIC user, it is the user ID; if the identity type is user group, it is the user group ID.
     */
    public void setPrincipalId(String PrincipalId) {
        this.PrincipalId = PrincipalId;
    }

    /**
     * Get Identity type for the user authorization. User: CIC user; Group: CIC user group. 
     * @return PrincipalType Identity type for the user authorization. User: CIC user; Group: CIC user group.
     */
    public String getPrincipalType() {
        return this.PrincipalType;
    }

    /**
     * Set Identity type for the user authorization. User: CIC user; Group: CIC user group.
     * @param PrincipalType Identity type for the user authorization. User: CIC user; Group: CIC user group.
     */
    public void setPrincipalType(String PrincipalType) {
        this.PrincipalType = PrincipalType;
    }

    /**
     * Get Task type. 
     * @return TaskType Task type.
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type.
     * @param TaskType Task type.
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get InProgress: The task is being executed; Success: The task execution succeeded; Failed: The task execution failed. 
     * @return Status InProgress: The task is being executed; Success: The task execution succeeded; Failed: The task execution failed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set InProgress: The task is being executed; Success: The task execution succeeded; Failed: The task execution failed.
     * @param Status InProgress: The task is being executed; Success: The task execution succeeded; Failed: The task execution failed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Cause of the failure.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FailureReason Cause of the failure.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set Cause of the failure.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FailureReason Cause of the failure.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
    }

    public TaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfo(TaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RoleConfigurationId != null) {
            this.RoleConfigurationId = new String(source.RoleConfigurationId);
        }
        if (source.RoleConfigurationName != null) {
            this.RoleConfigurationName = new String(source.RoleConfigurationName);
        }
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.PrincipalId != null) {
            this.PrincipalId = new String(source.PrincipalId);
        }
        if (source.PrincipalType != null) {
            this.PrincipalType = new String(source.PrincipalType);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);
        this.setParamSimple(map, prefix + "RoleConfigurationName", this.RoleConfigurationName);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "PrincipalId", this.PrincipalId);
        this.setParamSimple(map, prefix + "PrincipalType", this.PrincipalType);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);

    }
}

