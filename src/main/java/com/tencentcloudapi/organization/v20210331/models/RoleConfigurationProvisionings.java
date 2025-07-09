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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleConfigurationProvisionings extends AbstractModel {

    /**
    * Deployed: Deployment succeeded; DeployedRequired: Redeployment required; DeployFailed: Deployment failed.
    */
    @SerializedName("DeploymentStatus")
    @Expose
    private String DeploymentStatus;

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
    * UIN of the target account of the Tencent Cloud Organization.
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * Name of the target account of the Tencent Cloud Organization.
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Type of the synchronized target account of the Tencent Cloud Organization. ManagerUin: admin account; MemberUin: member account.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
     * Get Deployed: Deployment succeeded; DeployedRequired: Redeployment required; DeployFailed: Deployment failed. 
     * @return DeploymentStatus Deployed: Deployment succeeded; DeployedRequired: Redeployment required; DeployFailed: Deployment failed.
     */
    public String getDeploymentStatus() {
        return this.DeploymentStatus;
    }

    /**
     * Set Deployed: Deployment succeeded; DeployedRequired: Redeployment required; DeployFailed: Deployment failed.
     * @param DeploymentStatus Deployed: Deployment succeeded; DeployedRequired: Redeployment required; DeployFailed: Deployment failed.
     */
    public void setDeploymentStatus(String DeploymentStatus) {
        this.DeploymentStatus = DeploymentStatus;
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
     * Get UIN of the target account of the Tencent Cloud Organization. 
     * @return TargetUin UIN of the target account of the Tencent Cloud Organization.
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set UIN of the target account of the Tencent Cloud Organization.
     * @param TargetUin UIN of the target account of the Tencent Cloud Organization.
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get Name of the target account of the Tencent Cloud Organization. 
     * @return TargetName Name of the target account of the Tencent Cloud Organization.
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set Name of the target account of the Tencent Cloud Organization.
     * @param TargetName Name of the target account of the Tencent Cloud Organization.
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time. 
     * @return UpdateTime Modification time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Modification time.
     * @param UpdateTime Modification time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Type of the synchronized target account of the Tencent Cloud Organization. ManagerUin: admin account; MemberUin: member account. 
     * @return TargetType Type of the synchronized target account of the Tencent Cloud Organization. ManagerUin: admin account; MemberUin: member account.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Type of the synchronized target account of the Tencent Cloud Organization. ManagerUin: admin account; MemberUin: member account.
     * @param TargetType Type of the synchronized target account of the Tencent Cloud Organization. ManagerUin: admin account; MemberUin: member account.
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    public RoleConfigurationProvisionings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleConfigurationProvisionings(RoleConfigurationProvisionings source) {
        if (source.DeploymentStatus != null) {
            this.DeploymentStatus = new String(source.DeploymentStatus);
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
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeploymentStatus", this.DeploymentStatus);
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);
        this.setParamSimple(map, prefix + "RoleConfigurationName", this.RoleConfigurationName);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);

    }
}

