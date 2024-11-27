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

public class DeleteRoleAssignmentRequest extends AbstractModel {

    /**
    * Space ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Permission configuration ID.
    */
    @SerializedName("RoleConfigurationId")
    @Expose
    private String RoleConfigurationId;

    /**
    * Type of the synchronized target account of the Tencent Cloud Organization. ManagerUin: admin account; MemberUin: member account.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * UIN of the target account of the Tencent Cloud Organization.
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * Identity types synchronized for CAM users. Valid values: User: indicates the synchronized identity is a user. Group: indicates the synchronized identity is a user group.
    */
    @SerializedName("PrincipalType")
    @Expose
    private String PrincipalType;

    /**
    * User synchronization ID. Valid values: When PrincipalType is Group, it is a user group ID (g-********). When PrincipalType is User, it is a user ID (u-********).
    */
    @SerializedName("PrincipalId")
    @Expose
    private String PrincipalId;

    /**
    * Whether to remove the permission configuration deployment when removing the last authorization with a certain permission configuration from a target account in TCO. Valid values: DeprovisionForLastRoleAssignmentOnAccount: Remove the permission configuration deployment. None (default): Do not remove the permission configuration deployment.
    */
    @SerializedName("DeprovisionStrategy")
    @Expose
    private String DeprovisionStrategy;

    /**
     * Get Space ID. 
     * @return ZoneId Space ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Space ID.
     * @param ZoneId Space ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
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
     * Get Identity types synchronized for CAM users. Valid values: User: indicates the synchronized identity is a user. Group: indicates the synchronized identity is a user group. 
     * @return PrincipalType Identity types synchronized for CAM users. Valid values: User: indicates the synchronized identity is a user. Group: indicates the synchronized identity is a user group.
     */
    public String getPrincipalType() {
        return this.PrincipalType;
    }

    /**
     * Set Identity types synchronized for CAM users. Valid values: User: indicates the synchronized identity is a user. Group: indicates the synchronized identity is a user group.
     * @param PrincipalType Identity types synchronized for CAM users. Valid values: User: indicates the synchronized identity is a user. Group: indicates the synchronized identity is a user group.
     */
    public void setPrincipalType(String PrincipalType) {
        this.PrincipalType = PrincipalType;
    }

    /**
     * Get User synchronization ID. Valid values: When PrincipalType is Group, it is a user group ID (g-********). When PrincipalType is User, it is a user ID (u-********). 
     * @return PrincipalId User synchronization ID. Valid values: When PrincipalType is Group, it is a user group ID (g-********). When PrincipalType is User, it is a user ID (u-********).
     */
    public String getPrincipalId() {
        return this.PrincipalId;
    }

    /**
     * Set User synchronization ID. Valid values: When PrincipalType is Group, it is a user group ID (g-********). When PrincipalType is User, it is a user ID (u-********).
     * @param PrincipalId User synchronization ID. Valid values: When PrincipalType is Group, it is a user group ID (g-********). When PrincipalType is User, it is a user ID (u-********).
     */
    public void setPrincipalId(String PrincipalId) {
        this.PrincipalId = PrincipalId;
    }

    /**
     * Get Whether to remove the permission configuration deployment when removing the last authorization with a certain permission configuration from a target account in TCO. Valid values: DeprovisionForLastRoleAssignmentOnAccount: Remove the permission configuration deployment. None (default): Do not remove the permission configuration deployment. 
     * @return DeprovisionStrategy Whether to remove the permission configuration deployment when removing the last authorization with a certain permission configuration from a target account in TCO. Valid values: DeprovisionForLastRoleAssignmentOnAccount: Remove the permission configuration deployment. None (default): Do not remove the permission configuration deployment.
     */
    public String getDeprovisionStrategy() {
        return this.DeprovisionStrategy;
    }

    /**
     * Set Whether to remove the permission configuration deployment when removing the last authorization with a certain permission configuration from a target account in TCO. Valid values: DeprovisionForLastRoleAssignmentOnAccount: Remove the permission configuration deployment. None (default): Do not remove the permission configuration deployment.
     * @param DeprovisionStrategy Whether to remove the permission configuration deployment when removing the last authorization with a certain permission configuration from a target account in TCO. Valid values: DeprovisionForLastRoleAssignmentOnAccount: Remove the permission configuration deployment. None (default): Do not remove the permission configuration deployment.
     */
    public void setDeprovisionStrategy(String DeprovisionStrategy) {
        this.DeprovisionStrategy = DeprovisionStrategy;
    }

    public DeleteRoleAssignmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRoleAssignmentRequest(DeleteRoleAssignmentRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RoleConfigurationId != null) {
            this.RoleConfigurationId = new String(source.RoleConfigurationId);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.PrincipalType != null) {
            this.PrincipalType = new String(source.PrincipalType);
        }
        if (source.PrincipalId != null) {
            this.PrincipalId = new String(source.PrincipalId);
        }
        if (source.DeprovisionStrategy != null) {
            this.DeprovisionStrategy = new String(source.DeprovisionStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "PrincipalType", this.PrincipalType);
        this.setParamSimple(map, prefix + "PrincipalId", this.PrincipalId);
        this.setParamSimple(map, prefix + "DeprovisionStrategy", this.DeprovisionStrategy);

    }
}

