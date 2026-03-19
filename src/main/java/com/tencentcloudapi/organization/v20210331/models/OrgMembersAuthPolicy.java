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

public class OrgMembersAuthPolicy extends AbstractModel {

    /**
    * Identity ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdentityId")
    @Expose
    private Long IdentityId;

    /**
    * Role name of an identity.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdentityRoleName")
    @Expose
    private String IdentityRoleName;

    /**
    * Role alias of an identity.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdentityRoleAliasName")
    @Expose
    private String IdentityRoleAliasName;

    /**
    * Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Member access policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Member access policy name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Member UIN.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * Member name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemberName")
    @Expose
    private String MemberName;

    /**
    * Sub-account UIN or user group ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgSubAccountUin")
    @Expose
    private Long OrgSubAccountUin;

    /**
    * Sub-account name or user group name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgSubAccountName")
    @Expose
    private String OrgSubAccountName;

    /**
    * Binding type. 1: sub-account; 2: user group.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BindType")
    @Expose
    private Long BindType;

    /**
    * Member information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Members")
    @Expose
    private MemberMainInfo [] Members;

    /**
     * Get Identity ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdentityId Identity ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIdentityId() {
        return this.IdentityId;
    }

    /**
     * Set Identity ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdentityId Identity ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIdentityId(Long IdentityId) {
        this.IdentityId = IdentityId;
    }

    /**
     * Get Role name of an identity.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdentityRoleName Role name of an identity.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIdentityRoleName() {
        return this.IdentityRoleName;
    }

    /**
     * Set Role name of an identity.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdentityRoleName Role name of an identity.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIdentityRoleName(String IdentityRoleName) {
        this.IdentityRoleName = IdentityRoleName;
    }

    /**
     * Get Role alias of an identity.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdentityRoleAliasName Role alias of an identity.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIdentityRoleAliasName() {
        return this.IdentityRoleAliasName;
    }

    /**
     * Set Role alias of an identity.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdentityRoleAliasName Role alias of an identity.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIdentityRoleAliasName(String IdentityRoleAliasName) {
        this.IdentityRoleAliasName = IdentityRoleAliasName;
    }

    /**
     * Get Creation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Member access policy ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicyId Member access policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Member access policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicyId Member access policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Member access policy name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicyName Member access policy name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Member access policy name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicyName Member access policy name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Member UIN.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemberUin Member UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set Member UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemberUin Member UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get Member name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemberName Member name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMemberName() {
        return this.MemberName;
    }

    /**
     * Set Member name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemberName Member name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    /**
     * Get Sub-account UIN or user group ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrgSubAccountUin Sub-account UIN or user group ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOrgSubAccountUin() {
        return this.OrgSubAccountUin;
    }

    /**
     * Set Sub-account UIN or user group ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrgSubAccountUin Sub-account UIN or user group ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgSubAccountUin(Long OrgSubAccountUin) {
        this.OrgSubAccountUin = OrgSubAccountUin;
    }

    /**
     * Get Sub-account name or user group name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrgSubAccountName Sub-account name or user group name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOrgSubAccountName() {
        return this.OrgSubAccountName;
    }

    /**
     * Set Sub-account name or user group name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrgSubAccountName Sub-account name or user group name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgSubAccountName(String OrgSubAccountName) {
        this.OrgSubAccountName = OrgSubAccountName;
    }

    /**
     * Get Binding type. 1: sub-account; 2: user group.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BindType Binding type. 1: sub-account; 2: user group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBindType() {
        return this.BindType;
    }

    /**
     * Set Binding type. 1: sub-account; 2: user group.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BindType Binding type. 1: sub-account; 2: user group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBindType(Long BindType) {
        this.BindType = BindType;
    }

    /**
     * Get Member information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Members Member information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MemberMainInfo [] getMembers() {
        return this.Members;
    }

    /**
     * Set Member information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Members Member information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMembers(MemberMainInfo [] Members) {
        this.Members = Members;
    }

    public OrgMembersAuthPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrgMembersAuthPolicy(OrgMembersAuthPolicy source) {
        if (source.IdentityId != null) {
            this.IdentityId = new Long(source.IdentityId);
        }
        if (source.IdentityRoleName != null) {
            this.IdentityRoleName = new String(source.IdentityRoleName);
        }
        if (source.IdentityRoleAliasName != null) {
            this.IdentityRoleAliasName = new String(source.IdentityRoleAliasName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.MemberName != null) {
            this.MemberName = new String(source.MemberName);
        }
        if (source.OrgSubAccountUin != null) {
            this.OrgSubAccountUin = new Long(source.OrgSubAccountUin);
        }
        if (source.OrgSubAccountName != null) {
            this.OrgSubAccountName = new String(source.OrgSubAccountName);
        }
        if (source.BindType != null) {
            this.BindType = new Long(source.BindType);
        }
        if (source.Members != null) {
            this.Members = new MemberMainInfo[source.Members.length];
            for (int i = 0; i < source.Members.length; i++) {
                this.Members[i] = new MemberMainInfo(source.Members[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);
        this.setParamSimple(map, prefix + "IdentityRoleName", this.IdentityRoleName);
        this.setParamSimple(map, prefix + "IdentityRoleAliasName", this.IdentityRoleAliasName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "MemberName", this.MemberName);
        this.setParamSimple(map, prefix + "OrgSubAccountUin", this.OrgSubAccountUin);
        this.setParamSimple(map, prefix + "OrgSubAccountName", this.OrgSubAccountName);
        this.setParamSimple(map, prefix + "BindType", this.BindType);
        this.setParamArrayObj(map, prefix + "Members.", this.Members);

    }
}

