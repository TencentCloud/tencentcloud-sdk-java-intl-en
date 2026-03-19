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

public class OrgMemberAuthIdentity extends AbstractModel {

    /**
    * Identity ID.
    */
    @SerializedName("IdentityId")
    @Expose
    private Long IdentityId;

    /**
    * Role name of an identity.
    */
    @SerializedName("IdentityRoleName")
    @Expose
    private String IdentityRoleName;

    /**
    * Role alias of an identity.
    */
    @SerializedName("IdentityRoleAliasName")
    @Expose
    private String IdentityRoleAliasName;

    /**
    * Identity description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Time of initial configuration success.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Time of the last successful configuration.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Identity type. Valid values: 1: preset identity; 2: custom identity.
    */
    @SerializedName("IdentityType")
    @Expose
    private Long IdentityType;

    /**
    * Configuration status. Valid values: 1: configuration completed; 2: reconfiguration required.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Member UIN.
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * Member name.
    */
    @SerializedName("MemberName")
    @Expose
    private String MemberName;

    /**
     * Get Identity ID. 
     * @return IdentityId Identity ID.
     */
    public Long getIdentityId() {
        return this.IdentityId;
    }

    /**
     * Set Identity ID.
     * @param IdentityId Identity ID.
     */
    public void setIdentityId(Long IdentityId) {
        this.IdentityId = IdentityId;
    }

    /**
     * Get Role name of an identity. 
     * @return IdentityRoleName Role name of an identity.
     */
    public String getIdentityRoleName() {
        return this.IdentityRoleName;
    }

    /**
     * Set Role name of an identity.
     * @param IdentityRoleName Role name of an identity.
     */
    public void setIdentityRoleName(String IdentityRoleName) {
        this.IdentityRoleName = IdentityRoleName;
    }

    /**
     * Get Role alias of an identity. 
     * @return IdentityRoleAliasName Role alias of an identity.
     */
    public String getIdentityRoleAliasName() {
        return this.IdentityRoleAliasName;
    }

    /**
     * Set Role alias of an identity.
     * @param IdentityRoleAliasName Role alias of an identity.
     */
    public void setIdentityRoleAliasName(String IdentityRoleAliasName) {
        this.IdentityRoleAliasName = IdentityRoleAliasName;
    }

    /**
     * Get Identity description. 
     * @return Description Identity description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Identity description.
     * @param Description Identity description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Time of initial configuration success. 
     * @return CreateTime Time of initial configuration success.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Time of initial configuration success.
     * @param CreateTime Time of initial configuration success.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Time of the last successful configuration. 
     * @return UpdateTime Time of the last successful configuration.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Time of the last successful configuration.
     * @param UpdateTime Time of the last successful configuration.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Identity type. Valid values: 1: preset identity; 2: custom identity. 
     * @return IdentityType Identity type. Valid values: 1: preset identity; 2: custom identity.
     */
    public Long getIdentityType() {
        return this.IdentityType;
    }

    /**
     * Set Identity type. Valid values: 1: preset identity; 2: custom identity.
     * @param IdentityType Identity type. Valid values: 1: preset identity; 2: custom identity.
     */
    public void setIdentityType(Long IdentityType) {
        this.IdentityType = IdentityType;
    }

    /**
     * Get Configuration status. Valid values: 1: configuration completed; 2: reconfiguration required. 
     * @return Status Configuration status. Valid values: 1: configuration completed; 2: reconfiguration required.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Configuration status. Valid values: 1: configuration completed; 2: reconfiguration required.
     * @param Status Configuration status. Valid values: 1: configuration completed; 2: reconfiguration required.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Member UIN. 
     * @return MemberUin Member UIN.
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set Member UIN.
     * @param MemberUin Member UIN.
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get Member name. 
     * @return MemberName Member name.
     */
    public String getMemberName() {
        return this.MemberName;
    }

    /**
     * Set Member name.
     * @param MemberName Member name.
     */
    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    public OrgMemberAuthIdentity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrgMemberAuthIdentity(OrgMemberAuthIdentity source) {
        if (source.IdentityId != null) {
            this.IdentityId = new Long(source.IdentityId);
        }
        if (source.IdentityRoleName != null) {
            this.IdentityRoleName = new String(source.IdentityRoleName);
        }
        if (source.IdentityRoleAliasName != null) {
            this.IdentityRoleAliasName = new String(source.IdentityRoleAliasName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IdentityType != null) {
            this.IdentityType = new Long(source.IdentityType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.MemberName != null) {
            this.MemberName = new String(source.MemberName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);
        this.setParamSimple(map, prefix + "IdentityRoleName", this.IdentityRoleName);
        this.setParamSimple(map, prefix + "IdentityRoleAliasName", this.IdentityRoleAliasName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IdentityType", this.IdentityType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "MemberName", this.MemberName);

    }
}

