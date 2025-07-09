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

public class UserProvisioning extends AbstractModel {

    /**
    * CAM user synchronization status. Valid values:

Enabled: CAM user synchronization is enabled.
Disabled: CAM user synchronization is disabled.
    */
    @SerializedName("UserProvisioningId")
    @Expose
    private String UserProvisioningId;

    /**
    * Description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * CAM user synchronization status. Valid values:

Enabled: CAM user synchronization is enabled.
Disabled: CAM user synchronization is disabled.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Identity ID for the CAM user synchronization. Valid values:
When the PrincipalType value is Group, it is the CIC user group ID (g-********).
When the PrincipalType value is User, it is the CIC user ID (u-********).
    */
    @SerializedName("PrincipalId")
    @Expose
    private String PrincipalId;

    /**
    * Identity name for the CAM user synchronization. Valid values:When the PrincipalType value is Group, it is the CIC user group name.
When the PrincipalType value is User, it is the CIC user name.
    */
    @SerializedName("PrincipalName")
    @Expose
    private String PrincipalName;

    /**
    * Identity type for the CAM user synchronization. Valid values:

User: indicates that the identity for the CAM user synchronization is a CIC user.
Group: indicates that the identity for the CAM user synchronization is a CIC user group.
    */
    @SerializedName("PrincipalType")
    @Expose
    private String PrincipalType;

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
    * Conflict policy. It indicates the handling policy for existence of a user with the same username when CIC users are synchronized to CAM. Valid values: KeepBoth: Keep both, that is, add the _cic suffix to the CIC user's username and then try to create a CAM user with the username when CIC users are synchronized to CAM and a user with the same username already exists in CAM; TakeOver: Replace, that is, directly replace the existing CAM user with the synchronized CIC user when CIC users are synchronized to CAM and a user with the same username already exists in CAM.
    */
    @SerializedName("DuplicationStrategy")
    @Expose
    private String DuplicationStrategy;

    /**
    * Deletion policy. It indicates the handling policy for CAM users already synchronized when the CAM user synchronization is deleted. Valid values: Delete: Delete the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted; Keep: Keep the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted.
    */
    @SerializedName("DeletionStrategy")
    @Expose
    private String DeletionStrategy;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time.
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
     * Get CAM user synchronization status. Valid values:

Enabled: CAM user synchronization is enabled.
Disabled: CAM user synchronization is disabled. 
     * @return UserProvisioningId CAM user synchronization status. Valid values:

Enabled: CAM user synchronization is enabled.
Disabled: CAM user synchronization is disabled.
     */
    public String getUserProvisioningId() {
        return this.UserProvisioningId;
    }

    /**
     * Set CAM user synchronization status. Valid values:

Enabled: CAM user synchronization is enabled.
Disabled: CAM user synchronization is disabled.
     * @param UserProvisioningId CAM user synchronization status. Valid values:

Enabled: CAM user synchronization is enabled.
Disabled: CAM user synchronization is disabled.
     */
    public void setUserProvisioningId(String UserProvisioningId) {
        this.UserProvisioningId = UserProvisioningId;
    }

    /**
     * Get Description. 
     * @return Description Description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
     * @param Description Description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get CAM user synchronization status. Valid values:

Enabled: CAM user synchronization is enabled.
Disabled: CAM user synchronization is disabled. 
     * @return Status CAM user synchronization status. Valid values:

Enabled: CAM user synchronization is enabled.
Disabled: CAM user synchronization is disabled.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set CAM user synchronization status. Valid values:

Enabled: CAM user synchronization is enabled.
Disabled: CAM user synchronization is disabled.
     * @param Status CAM user synchronization status. Valid values:

Enabled: CAM user synchronization is enabled.
Disabled: CAM user synchronization is disabled.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Identity ID for the CAM user synchronization. Valid values:
When the PrincipalType value is Group, it is the CIC user group ID (g-********).
When the PrincipalType value is User, it is the CIC user ID (u-********). 
     * @return PrincipalId Identity ID for the CAM user synchronization. Valid values:
When the PrincipalType value is Group, it is the CIC user group ID (g-********).
When the PrincipalType value is User, it is the CIC user ID (u-********).
     */
    public String getPrincipalId() {
        return this.PrincipalId;
    }

    /**
     * Set Identity ID for the CAM user synchronization. Valid values:
When the PrincipalType value is Group, it is the CIC user group ID (g-********).
When the PrincipalType value is User, it is the CIC user ID (u-********).
     * @param PrincipalId Identity ID for the CAM user synchronization. Valid values:
When the PrincipalType value is Group, it is the CIC user group ID (g-********).
When the PrincipalType value is User, it is the CIC user ID (u-********).
     */
    public void setPrincipalId(String PrincipalId) {
        this.PrincipalId = PrincipalId;
    }

    /**
     * Get Identity name for the CAM user synchronization. Valid values:When the PrincipalType value is Group, it is the CIC user group name.
When the PrincipalType value is User, it is the CIC user name. 
     * @return PrincipalName Identity name for the CAM user synchronization. Valid values:When the PrincipalType value is Group, it is the CIC user group name.
When the PrincipalType value is User, it is the CIC user name.
     */
    public String getPrincipalName() {
        return this.PrincipalName;
    }

    /**
     * Set Identity name for the CAM user synchronization. Valid values:When the PrincipalType value is Group, it is the CIC user group name.
When the PrincipalType value is User, it is the CIC user name.
     * @param PrincipalName Identity name for the CAM user synchronization. Valid values:When the PrincipalType value is Group, it is the CIC user group name.
When the PrincipalType value is User, it is the CIC user name.
     */
    public void setPrincipalName(String PrincipalName) {
        this.PrincipalName = PrincipalName;
    }

    /**
     * Get Identity type for the CAM user synchronization. Valid values:

User: indicates that the identity for the CAM user synchronization is a CIC user.
Group: indicates that the identity for the CAM user synchronization is a CIC user group. 
     * @return PrincipalType Identity type for the CAM user synchronization. Valid values:

User: indicates that the identity for the CAM user synchronization is a CIC user.
Group: indicates that the identity for the CAM user synchronization is a CIC user group.
     */
    public String getPrincipalType() {
        return this.PrincipalType;
    }

    /**
     * Set Identity type for the CAM user synchronization. Valid values:

User: indicates that the identity for the CAM user synchronization is a CIC user.
Group: indicates that the identity for the CAM user synchronization is a CIC user group.
     * @param PrincipalType Identity type for the CAM user synchronization. Valid values:

User: indicates that the identity for the CAM user synchronization is a CIC user.
Group: indicates that the identity for the CAM user synchronization is a CIC user group.
     */
    public void setPrincipalType(String PrincipalType) {
        this.PrincipalType = PrincipalType;
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
     * Get Conflict policy. It indicates the handling policy for existence of a user with the same username when CIC users are synchronized to CAM. Valid values: KeepBoth: Keep both, that is, add the _cic suffix to the CIC user's username and then try to create a CAM user with the username when CIC users are synchronized to CAM and a user with the same username already exists in CAM; TakeOver: Replace, that is, directly replace the existing CAM user with the synchronized CIC user when CIC users are synchronized to CAM and a user with the same username already exists in CAM. 
     * @return DuplicationStrategy Conflict policy. It indicates the handling policy for existence of a user with the same username when CIC users are synchronized to CAM. Valid values: KeepBoth: Keep both, that is, add the _cic suffix to the CIC user's username and then try to create a CAM user with the username when CIC users are synchronized to CAM and a user with the same username already exists in CAM; TakeOver: Replace, that is, directly replace the existing CAM user with the synchronized CIC user when CIC users are synchronized to CAM and a user with the same username already exists in CAM.
     */
    public String getDuplicationStrategy() {
        return this.DuplicationStrategy;
    }

    /**
     * Set Conflict policy. It indicates the handling policy for existence of a user with the same username when CIC users are synchronized to CAM. Valid values: KeepBoth: Keep both, that is, add the _cic suffix to the CIC user's username and then try to create a CAM user with the username when CIC users are synchronized to CAM and a user with the same username already exists in CAM; TakeOver: Replace, that is, directly replace the existing CAM user with the synchronized CIC user when CIC users are synchronized to CAM and a user with the same username already exists in CAM.
     * @param DuplicationStrategy Conflict policy. It indicates the handling policy for existence of a user with the same username when CIC users are synchronized to CAM. Valid values: KeepBoth: Keep both, that is, add the _cic suffix to the CIC user's username and then try to create a CAM user with the username when CIC users are synchronized to CAM and a user with the same username already exists in CAM; TakeOver: Replace, that is, directly replace the existing CAM user with the synchronized CIC user when CIC users are synchronized to CAM and a user with the same username already exists in CAM.
     */
    public void setDuplicationStrategy(String DuplicationStrategy) {
        this.DuplicationStrategy = DuplicationStrategy;
    }

    /**
     * Get Deletion policy. It indicates the handling policy for CAM users already synchronized when the CAM user synchronization is deleted. Valid values: Delete: Delete the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted; Keep: Keep the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted. 
     * @return DeletionStrategy Deletion policy. It indicates the handling policy for CAM users already synchronized when the CAM user synchronization is deleted. Valid values: Delete: Delete the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted; Keep: Keep the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted.
     */
    public String getDeletionStrategy() {
        return this.DeletionStrategy;
    }

    /**
     * Set Deletion policy. It indicates the handling policy for CAM users already synchronized when the CAM user synchronization is deleted. Valid values: Delete: Delete the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted; Keep: Keep the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted.
     * @param DeletionStrategy Deletion policy. It indicates the handling policy for CAM users already synchronized when the CAM user synchronization is deleted. Valid values: Delete: Delete the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted; Keep: Keep the CAM users already synchronized from CIC to CAM when the CAM user synchronization is deleted.
     */
    public void setDeletionStrategy(String DeletionStrategy) {
        this.DeletionStrategy = DeletionStrategy;
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
     * Get Update time. 
     * @return UpdateTime Update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
     * @param UpdateTime Update time.
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

    public UserProvisioning() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserProvisioning(UserProvisioning source) {
        if (source.UserProvisioningId != null) {
            this.UserProvisioningId = new String(source.UserProvisioningId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PrincipalId != null) {
            this.PrincipalId = new String(source.PrincipalId);
        }
        if (source.PrincipalName != null) {
            this.PrincipalName = new String(source.PrincipalName);
        }
        if (source.PrincipalType != null) {
            this.PrincipalType = new String(source.PrincipalType);
        }
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.DuplicationStrategy != null) {
            this.DuplicationStrategy = new String(source.DuplicationStrategy);
        }
        if (source.DeletionStrategy != null) {
            this.DeletionStrategy = new String(source.DeletionStrategy);
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
        this.setParamSimple(map, prefix + "UserProvisioningId", this.UserProvisioningId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PrincipalId", this.PrincipalId);
        this.setParamSimple(map, prefix + "PrincipalName", this.PrincipalName);
        this.setParamSimple(map, prefix + "PrincipalType", this.PrincipalType);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "DuplicationStrategy", this.DuplicationStrategy);
        this.setParamSimple(map, prefix + "DeletionStrategy", this.DeletionStrategy);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);

    }
}

