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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrganizationInfo extends AbstractModel {

    /**
    * Member account name
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * Department node name, department of account
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Member/Admin/DelegatedAdmin/EntityAdmin; Member/Admin/DelegatedAdmin/EntityAdmin
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * Member account id
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * account joining method,create/invite
    */
    @SerializedName("JoinType")
    @Expose
    private String JoinType;

    /**
    * Group name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Admin account name
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * Admin Uin
    */
    @SerializedName("AdminUin")
    @Expose
    private String AdminUin;

    /**
    * Creation Time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Number of departments
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Number of members
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
    * Sub-account count
    */
    @SerializedName("SubAccountCount")
    @Expose
    private Long SubAccountCount;

    /**
    * Abnormal sub-account quantity
    */
    @SerializedName("AbnormalSubUserCount")
    @Expose
    private Long AbnormalSubUserCount;

    /**
    * Organization Relationship Policy Permissions
    */
    @SerializedName("GroupPermission")
    @Expose
    private String [] GroupPermission;

    /**
    * Membership Policy Permissions
    */
    @SerializedName("MemberPermission")
    @Expose
    private String [] MemberPermission;

    /**
    * Organization Billing Mode; 0/Self-paid, 1/Proxy-paid
    */
    @SerializedName("GroupPayMode")
    @Expose
    private Long GroupPayMode;

    /**
    * Personal Billing Mode; 0/Self-paid, 1/Proxy-paid
    */
    @SerializedName("MemberPayMode")
    @Expose
    private Long MemberPayMode;

    /**
    * If empty, it is not enabled; otherwise, different strings correspond to different versions, with 'common' being general and not version-specific.
    */
    @SerializedName("CFWProtect")
    @Expose
    private String CFWProtect;

    /**
    * If empty, it is not enabled; otherwise, different strings correspond to different versions, with 'common' being general and not version-specific.
    */
    @SerializedName("WAFProtect")
    @Expose
    private String WAFProtect;

    /**
    * If empty, it is not enabled; otherwise, different strings correspond to different versions, with 'common' being general and not version-specific.
    */
    @SerializedName("CWPProtect")
    @Expose
    private String CWPProtect;

    /**
    * Array of all departments
    */
    @SerializedName("Departments")
    @Expose
    private String [] Departments;

    /**
    * Member Creation Time
    */
    @SerializedName("MemberCreateTime")
    @Expose
    private String MemberCreateTime;

    /**
    * Advanced/Enterprise/Ultimate 
    */
    @SerializedName("CSIPProtect")
    @Expose
    private String CSIPProtect;

    /**
    * 1 indicates the quota consumer
    */
    @SerializedName("QuotaConsumer")
    @Expose
    private Long QuotaConsumer;

    /**
    * Number of enabled Admin/Delegated Admin accounts
    */
    @SerializedName("EnableAdminCount")
    @Expose
    private Long EnableAdminCount;

    /**
    * Multi-cloud account statistics in array format. Refer to the CloudCountDesc description for details.
    */
    @SerializedName("CloudCountDesc")
    @Expose
    private CloudCountDesc [] CloudCountDesc;

    /**
    * Total Number of Admin/Delegated Admin Accounts
    */
    @SerializedName("AdminCount")
    @Expose
    private Long AdminCount;

    /**
     * Get Member account name 
     * @return NickName Member account name
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Member account name
     * @param NickName Member account name
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get Department node name, department of account 
     * @return NodeName Department node name, department of account
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Department node name, department of account
     * @param NodeName Department node name, department of account
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Member/Admin/DelegatedAdmin/EntityAdmin; Member/Admin/DelegatedAdmin/EntityAdmin 
     * @return Role Member/Admin/DelegatedAdmin/EntityAdmin; Member/Admin/DelegatedAdmin/EntityAdmin
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Member/Admin/DelegatedAdmin/EntityAdmin; Member/Admin/DelegatedAdmin/EntityAdmin
     * @param Role Member/Admin/DelegatedAdmin/EntityAdmin; Member/Admin/DelegatedAdmin/EntityAdmin
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get Member account id 
     * @return MemberId Member account id
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Member account id
     * @param MemberId Member account id
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get account joining method,create/invite 
     * @return JoinType account joining method,create/invite
     */
    public String getJoinType() {
        return this.JoinType;
    }

    /**
     * Set account joining method,create/invite
     * @param JoinType account joining method,create/invite
     */
    public void setJoinType(String JoinType) {
        this.JoinType = JoinType;
    }

    /**
     * Get Group name 
     * @return GroupName Group name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Group name
     * @param GroupName Group name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Admin account name 
     * @return AdminName Admin account name
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set Admin account name
     * @param AdminName Admin account name
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get Admin Uin 
     * @return AdminUin Admin Uin
     */
    public String getAdminUin() {
        return this.AdminUin;
    }

    /**
     * Set Admin Uin
     * @param AdminUin Admin Uin
     */
    public void setAdminUin(String AdminUin) {
        this.AdminUin = AdminUin;
    }

    /**
     * Get Creation Time 
     * @return CreateTime Creation Time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation Time
     * @param CreateTime Creation Time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Number of departments 
     * @return NodeCount Number of departments
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of departments
     * @param NodeCount Number of departments
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Number of members 
     * @return MemberCount Number of members
     */
    public Long getMemberCount() {
        return this.MemberCount;
    }

    /**
     * Set Number of members
     * @param MemberCount Number of members
     */
    public void setMemberCount(Long MemberCount) {
        this.MemberCount = MemberCount;
    }

    /**
     * Get Sub-account count 
     * @return SubAccountCount Sub-account count
     */
    public Long getSubAccountCount() {
        return this.SubAccountCount;
    }

    /**
     * Set Sub-account count
     * @param SubAccountCount Sub-account count
     */
    public void setSubAccountCount(Long SubAccountCount) {
        this.SubAccountCount = SubAccountCount;
    }

    /**
     * Get Abnormal sub-account quantity 
     * @return AbnormalSubUserCount Abnormal sub-account quantity
     */
    public Long getAbnormalSubUserCount() {
        return this.AbnormalSubUserCount;
    }

    /**
     * Set Abnormal sub-account quantity
     * @param AbnormalSubUserCount Abnormal sub-account quantity
     */
    public void setAbnormalSubUserCount(Long AbnormalSubUserCount) {
        this.AbnormalSubUserCount = AbnormalSubUserCount;
    }

    /**
     * Get Organization Relationship Policy Permissions 
     * @return GroupPermission Organization Relationship Policy Permissions
     */
    public String [] getGroupPermission() {
        return this.GroupPermission;
    }

    /**
     * Set Organization Relationship Policy Permissions
     * @param GroupPermission Organization Relationship Policy Permissions
     */
    public void setGroupPermission(String [] GroupPermission) {
        this.GroupPermission = GroupPermission;
    }

    /**
     * Get Membership Policy Permissions 
     * @return MemberPermission Membership Policy Permissions
     */
    public String [] getMemberPermission() {
        return this.MemberPermission;
    }

    /**
     * Set Membership Policy Permissions
     * @param MemberPermission Membership Policy Permissions
     */
    public void setMemberPermission(String [] MemberPermission) {
        this.MemberPermission = MemberPermission;
    }

    /**
     * Get Organization Billing Mode; 0/Self-paid, 1/Proxy-paid 
     * @return GroupPayMode Organization Billing Mode; 0/Self-paid, 1/Proxy-paid
     */
    public Long getGroupPayMode() {
        return this.GroupPayMode;
    }

    /**
     * Set Organization Billing Mode; 0/Self-paid, 1/Proxy-paid
     * @param GroupPayMode Organization Billing Mode; 0/Self-paid, 1/Proxy-paid
     */
    public void setGroupPayMode(Long GroupPayMode) {
        this.GroupPayMode = GroupPayMode;
    }

    /**
     * Get Personal Billing Mode; 0/Self-paid, 1/Proxy-paid 
     * @return MemberPayMode Personal Billing Mode; 0/Self-paid, 1/Proxy-paid
     */
    public Long getMemberPayMode() {
        return this.MemberPayMode;
    }

    /**
     * Set Personal Billing Mode; 0/Self-paid, 1/Proxy-paid
     * @param MemberPayMode Personal Billing Mode; 0/Self-paid, 1/Proxy-paid
     */
    public void setMemberPayMode(Long MemberPayMode) {
        this.MemberPayMode = MemberPayMode;
    }

    /**
     * Get If empty, it is not enabled; otherwise, different strings correspond to different versions, with 'common' being general and not version-specific. 
     * @return CFWProtect If empty, it is not enabled; otherwise, different strings correspond to different versions, with 'common' being general and not version-specific.
     */
    public String getCFWProtect() {
        return this.CFWProtect;
    }

    /**
     * Set If empty, it is not enabled; otherwise, different strings correspond to different versions, with 'common' being general and not version-specific.
     * @param CFWProtect If empty, it is not enabled; otherwise, different strings correspond to different versions, with 'common' being general and not version-specific.
     */
    public void setCFWProtect(String CFWProtect) {
        this.CFWProtect = CFWProtect;
    }

    /**
     * Get If empty, it is not enabled; otherwise, different strings correspond to different versions, with 'common' being general and not version-specific. 
     * @return WAFProtect If empty, it is not enabled; otherwise, different strings correspond to different versions, with 'common' being general and not version-specific.
     */
    public String getWAFProtect() {
        return this.WAFProtect;
    }

    /**
     * Set If empty, it is not enabled; otherwise, different strings correspond to different versions, with 'common' being general and not version-specific.
     * @param WAFProtect If empty, it is not enabled; otherwise, different strings correspond to different versions, with 'common' being general and not version-specific.
     */
    public void setWAFProtect(String WAFProtect) {
        this.WAFProtect = WAFProtect;
    }

    /**
     * Get If empty, it is not enabled; otherwise, different strings correspond to different versions, with 'common' being general and not version-specific. 
     * @return CWPProtect If empty, it is not enabled; otherwise, different strings correspond to different versions, with 'common' being general and not version-specific.
     */
    public String getCWPProtect() {
        return this.CWPProtect;
    }

    /**
     * Set If empty, it is not enabled; otherwise, different strings correspond to different versions, with 'common' being general and not version-specific.
     * @param CWPProtect If empty, it is not enabled; otherwise, different strings correspond to different versions, with 'common' being general and not version-specific.
     */
    public void setCWPProtect(String CWPProtect) {
        this.CWPProtect = CWPProtect;
    }

    /**
     * Get Array of all departments 
     * @return Departments Array of all departments
     */
    public String [] getDepartments() {
        return this.Departments;
    }

    /**
     * Set Array of all departments
     * @param Departments Array of all departments
     */
    public void setDepartments(String [] Departments) {
        this.Departments = Departments;
    }

    /**
     * Get Member Creation Time 
     * @return MemberCreateTime Member Creation Time
     */
    public String getMemberCreateTime() {
        return this.MemberCreateTime;
    }

    /**
     * Set Member Creation Time
     * @param MemberCreateTime Member Creation Time
     */
    public void setMemberCreateTime(String MemberCreateTime) {
        this.MemberCreateTime = MemberCreateTime;
    }

    /**
     * Get Advanced/Enterprise/Ultimate  
     * @return CSIPProtect Advanced/Enterprise/Ultimate 
     */
    public String getCSIPProtect() {
        return this.CSIPProtect;
    }

    /**
     * Set Advanced/Enterprise/Ultimate 
     * @param CSIPProtect Advanced/Enterprise/Ultimate 
     */
    public void setCSIPProtect(String CSIPProtect) {
        this.CSIPProtect = CSIPProtect;
    }

    /**
     * Get 1 indicates the quota consumer 
     * @return QuotaConsumer 1 indicates the quota consumer
     */
    public Long getQuotaConsumer() {
        return this.QuotaConsumer;
    }

    /**
     * Set 1 indicates the quota consumer
     * @param QuotaConsumer 1 indicates the quota consumer
     */
    public void setQuotaConsumer(Long QuotaConsumer) {
        this.QuotaConsumer = QuotaConsumer;
    }

    /**
     * Get Number of enabled Admin/Delegated Admin accounts 
     * @return EnableAdminCount Number of enabled Admin/Delegated Admin accounts
     */
    public Long getEnableAdminCount() {
        return this.EnableAdminCount;
    }

    /**
     * Set Number of enabled Admin/Delegated Admin accounts
     * @param EnableAdminCount Number of enabled Admin/Delegated Admin accounts
     */
    public void setEnableAdminCount(Long EnableAdminCount) {
        this.EnableAdminCount = EnableAdminCount;
    }

    /**
     * Get Multi-cloud account statistics in array format. Refer to the CloudCountDesc description for details. 
     * @return CloudCountDesc Multi-cloud account statistics in array format. Refer to the CloudCountDesc description for details.
     */
    public CloudCountDesc [] getCloudCountDesc() {
        return this.CloudCountDesc;
    }

    /**
     * Set Multi-cloud account statistics in array format. Refer to the CloudCountDesc description for details.
     * @param CloudCountDesc Multi-cloud account statistics in array format. Refer to the CloudCountDesc description for details.
     */
    public void setCloudCountDesc(CloudCountDesc [] CloudCountDesc) {
        this.CloudCountDesc = CloudCountDesc;
    }

    /**
     * Get Total Number of Admin/Delegated Admin Accounts 
     * @return AdminCount Total Number of Admin/Delegated Admin Accounts
     */
    public Long getAdminCount() {
        return this.AdminCount;
    }

    /**
     * Set Total Number of Admin/Delegated Admin Accounts
     * @param AdminCount Total Number of Admin/Delegated Admin Accounts
     */
    public void setAdminCount(Long AdminCount) {
        this.AdminCount = AdminCount;
    }

    public OrganizationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrganizationInfo(OrganizationInfo source) {
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
        if (source.JoinType != null) {
            this.JoinType = new String(source.JoinType);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.AdminName != null) {
            this.AdminName = new String(source.AdminName);
        }
        if (source.AdminUin != null) {
            this.AdminUin = new String(source.AdminUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.MemberCount != null) {
            this.MemberCount = new Long(source.MemberCount);
        }
        if (source.SubAccountCount != null) {
            this.SubAccountCount = new Long(source.SubAccountCount);
        }
        if (source.AbnormalSubUserCount != null) {
            this.AbnormalSubUserCount = new Long(source.AbnormalSubUserCount);
        }
        if (source.GroupPermission != null) {
            this.GroupPermission = new String[source.GroupPermission.length];
            for (int i = 0; i < source.GroupPermission.length; i++) {
                this.GroupPermission[i] = new String(source.GroupPermission[i]);
            }
        }
        if (source.MemberPermission != null) {
            this.MemberPermission = new String[source.MemberPermission.length];
            for (int i = 0; i < source.MemberPermission.length; i++) {
                this.MemberPermission[i] = new String(source.MemberPermission[i]);
            }
        }
        if (source.GroupPayMode != null) {
            this.GroupPayMode = new Long(source.GroupPayMode);
        }
        if (source.MemberPayMode != null) {
            this.MemberPayMode = new Long(source.MemberPayMode);
        }
        if (source.CFWProtect != null) {
            this.CFWProtect = new String(source.CFWProtect);
        }
        if (source.WAFProtect != null) {
            this.WAFProtect = new String(source.WAFProtect);
        }
        if (source.CWPProtect != null) {
            this.CWPProtect = new String(source.CWPProtect);
        }
        if (source.Departments != null) {
            this.Departments = new String[source.Departments.length];
            for (int i = 0; i < source.Departments.length; i++) {
                this.Departments[i] = new String(source.Departments[i]);
            }
        }
        if (source.MemberCreateTime != null) {
            this.MemberCreateTime = new String(source.MemberCreateTime);
        }
        if (source.CSIPProtect != null) {
            this.CSIPProtect = new String(source.CSIPProtect);
        }
        if (source.QuotaConsumer != null) {
            this.QuotaConsumer = new Long(source.QuotaConsumer);
        }
        if (source.EnableAdminCount != null) {
            this.EnableAdminCount = new Long(source.EnableAdminCount);
        }
        if (source.CloudCountDesc != null) {
            this.CloudCountDesc = new CloudCountDesc[source.CloudCountDesc.length];
            for (int i = 0; i < source.CloudCountDesc.length; i++) {
                this.CloudCountDesc[i] = new CloudCountDesc(source.CloudCountDesc[i]);
            }
        }
        if (source.AdminCount != null) {
            this.AdminCount = new Long(source.AdminCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "JoinType", this.JoinType);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "AdminName", this.AdminName);
        this.setParamSimple(map, prefix + "AdminUin", this.AdminUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "MemberCount", this.MemberCount);
        this.setParamSimple(map, prefix + "SubAccountCount", this.SubAccountCount);
        this.setParamSimple(map, prefix + "AbnormalSubUserCount", this.AbnormalSubUserCount);
        this.setParamArraySimple(map, prefix + "GroupPermission.", this.GroupPermission);
        this.setParamArraySimple(map, prefix + "MemberPermission.", this.MemberPermission);
        this.setParamSimple(map, prefix + "GroupPayMode", this.GroupPayMode);
        this.setParamSimple(map, prefix + "MemberPayMode", this.MemberPayMode);
        this.setParamSimple(map, prefix + "CFWProtect", this.CFWProtect);
        this.setParamSimple(map, prefix + "WAFProtect", this.WAFProtect);
        this.setParamSimple(map, prefix + "CWPProtect", this.CWPProtect);
        this.setParamArraySimple(map, prefix + "Departments.", this.Departments);
        this.setParamSimple(map, prefix + "MemberCreateTime", this.MemberCreateTime);
        this.setParamSimple(map, prefix + "CSIPProtect", this.CSIPProtect);
        this.setParamSimple(map, prefix + "QuotaConsumer", this.QuotaConsumer);
        this.setParamSimple(map, prefix + "EnableAdminCount", this.EnableAdminCount);
        this.setParamArrayObj(map, prefix + "CloudCountDesc.", this.CloudCountDesc);
        this.setParamSimple(map, prefix + "AdminCount", this.AdminCount);

    }
}

