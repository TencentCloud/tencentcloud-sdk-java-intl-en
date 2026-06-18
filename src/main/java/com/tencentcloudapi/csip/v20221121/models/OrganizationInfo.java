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
    * member account name
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * Department Node Name, Account's Department
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Member/Admin/DelegatedAdmin/EntityAdmin, corresponding to Member/Administrator/Delegated Administrator/Entity Administrator
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * Member Account ID
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * Account Joining Method: Create/Invite.
    */
    @SerializedName("JoinType")
    @Expose
    private String JoinType;

    /**
    * Group Name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * administrator account name
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * Administrator UIN
    */
    @SerializedName("AdminUin")
    @Expose
    private String AdminUin;

    /**
    * Creation time.
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
    * Number of sub-accounts
    */
    @SerializedName("SubAccountCount")
    @Expose
    private Long SubAccountCount;

    /**
    * Number of abnormal sub-accounts
    */
    @SerializedName("AbnormalSubUserCount")
    @Expose
    private Long AbnormalSubUserCount;

    /**
    * Group Relationship Policy Permissions
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
    * Group Payment Mode. 0: Self-payment; 1: Proxy Payment.
    */
    @SerializedName("GroupPayMode")
    @Expose
    private Long GroupPayMode;

    /**
    * Personal Payment Mode. 0: Self-payment; 1: Proxy payment.
    */
    @SerializedName("MemberPayMode")
    @Expose
    private Long MemberPayMode;

    /**
    * Not enabled if empty. Otherwise, different strings correspond to different versions. Common for General, regardless of version.
    */
    @SerializedName("CFWProtect")
    @Expose
    private String CFWProtect;

    /**
    * Not enabled if empty. Otherwise, different strings correspond to different versions. Common for General, regardless of version.
    */
    @SerializedName("WAFProtect")
    @Expose
    private String WAFProtect;

    /**
    * Not enabled if empty. Otherwise, different strings correspond to different versions. Common for General, regardless of version.
    */
    @SerializedName("CWPProtect")
    @Expose
    private String CWPProtect;

    /**
    * Array of Collections for All Departments
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
    * 1 indicates the quota consumer.
    */
    @SerializedName("QuotaConsumer")
    @Expose
    private Long QuotaConsumer;

    /**
    * Number of activations by admin/delegated admin
    */
    @SerializedName("EnableAdminCount")
    @Expose
    private Long EnableAdminCount;

    /**
    * Account Multi-Cloud Information Statistics, in array format. Refer to the description of CloudCountDesc for details.
    */
    @SerializedName("CloudCountDesc")
    @Expose
    private CloudCountDesc [] CloudCountDesc;

    /**
    * Total number of admins/delegated admins
    */
    @SerializedName("AdminCount")
    @Expose
    private Long AdminCount;

    /**
     * Get member account name 
     * @return NickName member account name
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set member account name
     * @param NickName member account name
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get Department Node Name, Account's Department 
     * @return NodeName Department Node Name, Account's Department
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Department Node Name, Account's Department
     * @param NodeName Department Node Name, Account's Department
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Member/Admin/DelegatedAdmin/EntityAdmin, corresponding to Member/Administrator/Delegated Administrator/Entity Administrator 
     * @return Role Member/Admin/DelegatedAdmin/EntityAdmin, corresponding to Member/Administrator/Delegated Administrator/Entity Administrator
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Member/Admin/DelegatedAdmin/EntityAdmin, corresponding to Member/Administrator/Delegated Administrator/Entity Administrator
     * @param Role Member/Admin/DelegatedAdmin/EntityAdmin, corresponding to Member/Administrator/Delegated Administrator/Entity Administrator
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get Member Account ID 
     * @return MemberId Member Account ID
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Member Account ID
     * @param MemberId Member Account ID
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Account Joining Method: Create/Invite. 
     * @return JoinType Account Joining Method: Create/Invite.
     */
    public String getJoinType() {
        return this.JoinType;
    }

    /**
     * Set Account Joining Method: Create/Invite.
     * @param JoinType Account Joining Method: Create/Invite.
     */
    public void setJoinType(String JoinType) {
        this.JoinType = JoinType;
    }

    /**
     * Get Group Name 
     * @return GroupName Group Name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Group Name
     * @param GroupName Group Name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get administrator account name 
     * @return AdminName administrator account name
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set administrator account name
     * @param AdminName administrator account name
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get Administrator UIN 
     * @return AdminUin Administrator UIN
     */
    public String getAdminUin() {
        return this.AdminUin;
    }

    /**
     * Set Administrator UIN
     * @param AdminUin Administrator UIN
     */
    public void setAdminUin(String AdminUin) {
        this.AdminUin = AdminUin;
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
     * Get Number of sub-accounts 
     * @return SubAccountCount Number of sub-accounts
     */
    public Long getSubAccountCount() {
        return this.SubAccountCount;
    }

    /**
     * Set Number of sub-accounts
     * @param SubAccountCount Number of sub-accounts
     */
    public void setSubAccountCount(Long SubAccountCount) {
        this.SubAccountCount = SubAccountCount;
    }

    /**
     * Get Number of abnormal sub-accounts 
     * @return AbnormalSubUserCount Number of abnormal sub-accounts
     */
    public Long getAbnormalSubUserCount() {
        return this.AbnormalSubUserCount;
    }

    /**
     * Set Number of abnormal sub-accounts
     * @param AbnormalSubUserCount Number of abnormal sub-accounts
     */
    public void setAbnormalSubUserCount(Long AbnormalSubUserCount) {
        this.AbnormalSubUserCount = AbnormalSubUserCount;
    }

    /**
     * Get Group Relationship Policy Permissions 
     * @return GroupPermission Group Relationship Policy Permissions
     */
    public String [] getGroupPermission() {
        return this.GroupPermission;
    }

    /**
     * Set Group Relationship Policy Permissions
     * @param GroupPermission Group Relationship Policy Permissions
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
     * Get Group Payment Mode. 0: Self-payment; 1: Proxy Payment. 
     * @return GroupPayMode Group Payment Mode. 0: Self-payment; 1: Proxy Payment.
     */
    public Long getGroupPayMode() {
        return this.GroupPayMode;
    }

    /**
     * Set Group Payment Mode. 0: Self-payment; 1: Proxy Payment.
     * @param GroupPayMode Group Payment Mode. 0: Self-payment; 1: Proxy Payment.
     */
    public void setGroupPayMode(Long GroupPayMode) {
        this.GroupPayMode = GroupPayMode;
    }

    /**
     * Get Personal Payment Mode. 0: Self-payment; 1: Proxy payment. 
     * @return MemberPayMode Personal Payment Mode. 0: Self-payment; 1: Proxy payment.
     */
    public Long getMemberPayMode() {
        return this.MemberPayMode;
    }

    /**
     * Set Personal Payment Mode. 0: Self-payment; 1: Proxy payment.
     * @param MemberPayMode Personal Payment Mode. 0: Self-payment; 1: Proxy payment.
     */
    public void setMemberPayMode(Long MemberPayMode) {
        this.MemberPayMode = MemberPayMode;
    }

    /**
     * Get Not enabled if empty. Otherwise, different strings correspond to different versions. Common for General, regardless of version. 
     * @return CFWProtect Not enabled if empty. Otherwise, different strings correspond to different versions. Common for General, regardless of version.
     */
    public String getCFWProtect() {
        return this.CFWProtect;
    }

    /**
     * Set Not enabled if empty. Otherwise, different strings correspond to different versions. Common for General, regardless of version.
     * @param CFWProtect Not enabled if empty. Otherwise, different strings correspond to different versions. Common for General, regardless of version.
     */
    public void setCFWProtect(String CFWProtect) {
        this.CFWProtect = CFWProtect;
    }

    /**
     * Get Not enabled if empty. Otherwise, different strings correspond to different versions. Common for General, regardless of version. 
     * @return WAFProtect Not enabled if empty. Otherwise, different strings correspond to different versions. Common for General, regardless of version.
     */
    public String getWAFProtect() {
        return this.WAFProtect;
    }

    /**
     * Set Not enabled if empty. Otherwise, different strings correspond to different versions. Common for General, regardless of version.
     * @param WAFProtect Not enabled if empty. Otherwise, different strings correspond to different versions. Common for General, regardless of version.
     */
    public void setWAFProtect(String WAFProtect) {
        this.WAFProtect = WAFProtect;
    }

    /**
     * Get Not enabled if empty. Otherwise, different strings correspond to different versions. Common for General, regardless of version. 
     * @return CWPProtect Not enabled if empty. Otherwise, different strings correspond to different versions. Common for General, regardless of version.
     */
    public String getCWPProtect() {
        return this.CWPProtect;
    }

    /**
     * Set Not enabled if empty. Otherwise, different strings correspond to different versions. Common for General, regardless of version.
     * @param CWPProtect Not enabled if empty. Otherwise, different strings correspond to different versions. Common for General, regardless of version.
     */
    public void setCWPProtect(String CWPProtect) {
        this.CWPProtect = CWPProtect;
    }

    /**
     * Get Array of Collections for All Departments 
     * @return Departments Array of Collections for All Departments
     */
    public String [] getDepartments() {
        return this.Departments;
    }

    /**
     * Set Array of Collections for All Departments
     * @param Departments Array of Collections for All Departments
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
     * Get 1 indicates the quota consumer. 
     * @return QuotaConsumer 1 indicates the quota consumer.
     */
    public Long getQuotaConsumer() {
        return this.QuotaConsumer;
    }

    /**
     * Set 1 indicates the quota consumer.
     * @param QuotaConsumer 1 indicates the quota consumer.
     */
    public void setQuotaConsumer(Long QuotaConsumer) {
        this.QuotaConsumer = QuotaConsumer;
    }

    /**
     * Get Number of activations by admin/delegated admin 
     * @return EnableAdminCount Number of activations by admin/delegated admin
     */
    public Long getEnableAdminCount() {
        return this.EnableAdminCount;
    }

    /**
     * Set Number of activations by admin/delegated admin
     * @param EnableAdminCount Number of activations by admin/delegated admin
     */
    public void setEnableAdminCount(Long EnableAdminCount) {
        this.EnableAdminCount = EnableAdminCount;
    }

    /**
     * Get Account Multi-Cloud Information Statistics, in array format. Refer to the description of CloudCountDesc for details. 
     * @return CloudCountDesc Account Multi-Cloud Information Statistics, in array format. Refer to the description of CloudCountDesc for details.
     */
    public CloudCountDesc [] getCloudCountDesc() {
        return this.CloudCountDesc;
    }

    /**
     * Set Account Multi-Cloud Information Statistics, in array format. Refer to the description of CloudCountDesc for details.
     * @param CloudCountDesc Account Multi-Cloud Information Statistics, in array format. Refer to the description of CloudCountDesc for details.
     */
    public void setCloudCountDesc(CloudCountDesc [] CloudCountDesc) {
        this.CloudCountDesc = CloudCountDesc;
    }

    /**
     * Get Total number of admins/delegated admins 
     * @return AdminCount Total number of admins/delegated admins
     */
    public Long getAdminCount() {
        return this.AdminCount;
    }

    /**
     * Set Total number of admins/delegated admins
     * @param AdminCount Total number of admins/delegated admins
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

