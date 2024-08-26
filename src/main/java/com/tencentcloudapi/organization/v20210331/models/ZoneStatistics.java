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

public class ZoneStatistics extends AbstractModel {

    /**
    * User quota.
    */
    @SerializedName("UserQuota")
    @Expose
    private Long UserQuota;

    /**
    * User group quota.
    */
    @SerializedName("GroupQuota")
    @Expose
    private Long GroupQuota;

    /**
    * Permission configuration quota.
    */
    @SerializedName("RoleConfigurationQuota")
    @Expose
    private Long RoleConfigurationQuota;

    /**
    * System policy quota bound to the permission configuration.
    */
    @SerializedName("SystemPolicyPerRoleConfigurationQuota")
    @Expose
    private Long SystemPolicyPerRoleConfigurationQuota;

    /**
    * Number of users.
    */
    @SerializedName("UserCount")
    @Expose
    private Long UserCount;

    /**
    * Number of user groups.
    */
    @SerializedName("GroupCount")
    @Expose
    private Long GroupCount;

    /**
    * Number of permission configurations.
    */
    @SerializedName("RoleConfigurationCount")
    @Expose
    private Long RoleConfigurationCount;

    /**
    * Number of synchronized users.
    */
    @SerializedName("UserProvisioningCount")
    @Expose
    private Long UserProvisioningCount;

    /**
    * Number of synchronized roles.
    */
    @SerializedName("RoleConfigurationSyncCount")
    @Expose
    private Long RoleConfigurationSyncCount;

    /**
     * Get User quota. 
     * @return UserQuota User quota.
     */
    public Long getUserQuota() {
        return this.UserQuota;
    }

    /**
     * Set User quota.
     * @param UserQuota User quota.
     */
    public void setUserQuota(Long UserQuota) {
        this.UserQuota = UserQuota;
    }

    /**
     * Get User group quota. 
     * @return GroupQuota User group quota.
     */
    public Long getGroupQuota() {
        return this.GroupQuota;
    }

    /**
     * Set User group quota.
     * @param GroupQuota User group quota.
     */
    public void setGroupQuota(Long GroupQuota) {
        this.GroupQuota = GroupQuota;
    }

    /**
     * Get Permission configuration quota. 
     * @return RoleConfigurationQuota Permission configuration quota.
     */
    public Long getRoleConfigurationQuota() {
        return this.RoleConfigurationQuota;
    }

    /**
     * Set Permission configuration quota.
     * @param RoleConfigurationQuota Permission configuration quota.
     */
    public void setRoleConfigurationQuota(Long RoleConfigurationQuota) {
        this.RoleConfigurationQuota = RoleConfigurationQuota;
    }

    /**
     * Get System policy quota bound to the permission configuration. 
     * @return SystemPolicyPerRoleConfigurationQuota System policy quota bound to the permission configuration.
     */
    public Long getSystemPolicyPerRoleConfigurationQuota() {
        return this.SystemPolicyPerRoleConfigurationQuota;
    }

    /**
     * Set System policy quota bound to the permission configuration.
     * @param SystemPolicyPerRoleConfigurationQuota System policy quota bound to the permission configuration.
     */
    public void setSystemPolicyPerRoleConfigurationQuota(Long SystemPolicyPerRoleConfigurationQuota) {
        this.SystemPolicyPerRoleConfigurationQuota = SystemPolicyPerRoleConfigurationQuota;
    }

    /**
     * Get Number of users. 
     * @return UserCount Number of users.
     */
    public Long getUserCount() {
        return this.UserCount;
    }

    /**
     * Set Number of users.
     * @param UserCount Number of users.
     */
    public void setUserCount(Long UserCount) {
        this.UserCount = UserCount;
    }

    /**
     * Get Number of user groups. 
     * @return GroupCount Number of user groups.
     */
    public Long getGroupCount() {
        return this.GroupCount;
    }

    /**
     * Set Number of user groups.
     * @param GroupCount Number of user groups.
     */
    public void setGroupCount(Long GroupCount) {
        this.GroupCount = GroupCount;
    }

    /**
     * Get Number of permission configurations. 
     * @return RoleConfigurationCount Number of permission configurations.
     */
    public Long getRoleConfigurationCount() {
        return this.RoleConfigurationCount;
    }

    /**
     * Set Number of permission configurations.
     * @param RoleConfigurationCount Number of permission configurations.
     */
    public void setRoleConfigurationCount(Long RoleConfigurationCount) {
        this.RoleConfigurationCount = RoleConfigurationCount;
    }

    /**
     * Get Number of synchronized users. 
     * @return UserProvisioningCount Number of synchronized users.
     */
    public Long getUserProvisioningCount() {
        return this.UserProvisioningCount;
    }

    /**
     * Set Number of synchronized users.
     * @param UserProvisioningCount Number of synchronized users.
     */
    public void setUserProvisioningCount(Long UserProvisioningCount) {
        this.UserProvisioningCount = UserProvisioningCount;
    }

    /**
     * Get Number of synchronized roles. 
     * @return RoleConfigurationSyncCount Number of synchronized roles.
     */
    public Long getRoleConfigurationSyncCount() {
        return this.RoleConfigurationSyncCount;
    }

    /**
     * Set Number of synchronized roles.
     * @param RoleConfigurationSyncCount Number of synchronized roles.
     */
    public void setRoleConfigurationSyncCount(Long RoleConfigurationSyncCount) {
        this.RoleConfigurationSyncCount = RoleConfigurationSyncCount;
    }

    public ZoneStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneStatistics(ZoneStatistics source) {
        if (source.UserQuota != null) {
            this.UserQuota = new Long(source.UserQuota);
        }
        if (source.GroupQuota != null) {
            this.GroupQuota = new Long(source.GroupQuota);
        }
        if (source.RoleConfigurationQuota != null) {
            this.RoleConfigurationQuota = new Long(source.RoleConfigurationQuota);
        }
        if (source.SystemPolicyPerRoleConfigurationQuota != null) {
            this.SystemPolicyPerRoleConfigurationQuota = new Long(source.SystemPolicyPerRoleConfigurationQuota);
        }
        if (source.UserCount != null) {
            this.UserCount = new Long(source.UserCount);
        }
        if (source.GroupCount != null) {
            this.GroupCount = new Long(source.GroupCount);
        }
        if (source.RoleConfigurationCount != null) {
            this.RoleConfigurationCount = new Long(source.RoleConfigurationCount);
        }
        if (source.UserProvisioningCount != null) {
            this.UserProvisioningCount = new Long(source.UserProvisioningCount);
        }
        if (source.RoleConfigurationSyncCount != null) {
            this.RoleConfigurationSyncCount = new Long(source.RoleConfigurationSyncCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserQuota", this.UserQuota);
        this.setParamSimple(map, prefix + "GroupQuota", this.GroupQuota);
        this.setParamSimple(map, prefix + "RoleConfigurationQuota", this.RoleConfigurationQuota);
        this.setParamSimple(map, prefix + "SystemPolicyPerRoleConfigurationQuota", this.SystemPolicyPerRoleConfigurationQuota);
        this.setParamSimple(map, prefix + "UserCount", this.UserCount);
        this.setParamSimple(map, prefix + "GroupCount", this.GroupCount);
        this.setParamSimple(map, prefix + "RoleConfigurationCount", this.RoleConfigurationCount);
        this.setParamSimple(map, prefix + "UserProvisioningCount", this.UserProvisioningCount);
        this.setParamSimple(map, prefix + "RoleConfigurationSyncCount", this.RoleConfigurationSyncCount);

    }
}

