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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrgMemberAuthAccount extends AbstractModel{

    /**
    * Organization sub-account UIN.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgSubAccountUin")
    @Expose
    private Long OrgSubAccountUin;

    /**
    * Policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Policy name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Identity ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdentityId")
    @Expose
    private Long IdentityId;

    /**
    * Identity role name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdentityRoleName")
    @Expose
    private String IdentityRoleName;

    /**
    * Identity role alias.
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
    * Update time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Sub-account name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgSubAccountName")
    @Expose
    private String OrgSubAccountName;

    /**
     * Get Organization sub-account UIN.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrgSubAccountUin Organization sub-account UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOrgSubAccountUin() {
        return this.OrgSubAccountUin;
    }

    /**
     * Set Organization sub-account UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrgSubAccountUin Organization sub-account UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgSubAccountUin(Long OrgSubAccountUin) {
        this.OrgSubAccountUin = OrgSubAccountUin;
    }

    /**
     * Get Policy ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicyId Policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicyId Policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Policy name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicyName Policy name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicyName Policy name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

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
     * Get Identity role name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdentityRoleName Identity role name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIdentityRoleName() {
        return this.IdentityRoleName;
    }

    /**
     * Set Identity role name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdentityRoleName Identity role name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIdentityRoleName(String IdentityRoleName) {
        this.IdentityRoleName = IdentityRoleName;
    }

    /**
     * Get Identity role alias.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdentityRoleAliasName Identity role alias.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIdentityRoleAliasName() {
        return this.IdentityRoleAliasName;
    }

    /**
     * Set Identity role alias.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdentityRoleAliasName Identity role alias.
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
     * Get Update time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Sub-account name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrgSubAccountName Sub-account name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOrgSubAccountName() {
        return this.OrgSubAccountName;
    }

    /**
     * Set Sub-account name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrgSubAccountName Sub-account name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgSubAccountName(String OrgSubAccountName) {
        this.OrgSubAccountName = OrgSubAccountName;
    }

    public OrgMemberAuthAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrgMemberAuthAccount(OrgMemberAuthAccount source) {
        if (source.OrgSubAccountUin != null) {
            this.OrgSubAccountUin = new Long(source.OrgSubAccountUin);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
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
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.OrgSubAccountName != null) {
            this.OrgSubAccountName = new String(source.OrgSubAccountName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrgSubAccountUin", this.OrgSubAccountUin);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);
        this.setParamSimple(map, prefix + "IdentityRoleName", this.IdentityRoleName);
        this.setParamSimple(map, prefix + "IdentityRoleAliasName", this.IdentityRoleAliasName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OrgSubAccountName", this.OrgSubAccountName);

    }
}

