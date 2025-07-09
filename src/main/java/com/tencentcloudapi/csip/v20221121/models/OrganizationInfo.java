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
    * 
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * 
    */
    @SerializedName("JoinType")
    @Expose
    private String JoinType;

    /**
    * 
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * 
    */
    @SerializedName("AdminUin")
    @Expose
    private String AdminUin;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
    * 
    */
    @SerializedName("SubAccountCount")
    @Expose
    private Long SubAccountCount;

    /**
    * 
    */
    @SerializedName("AbnormalSubUserCount")
    @Expose
    private Long AbnormalSubUserCount;

    /**
    * 
    */
    @SerializedName("GroupPermission")
    @Expose
    private String [] GroupPermission;

    /**
    * 
    */
    @SerializedName("MemberPermission")
    @Expose
    private String [] MemberPermission;

    /**
    * 
    */
    @SerializedName("GroupPayMode")
    @Expose
    private Long GroupPayMode;

    /**
    * 
    */
    @SerializedName("MemberPayMode")
    @Expose
    private Long MemberPayMode;

    /**
    * 
    */
    @SerializedName("CFWProtect")
    @Expose
    private String CFWProtect;

    /**
    * 
    */
    @SerializedName("WAFProtect")
    @Expose
    private String WAFProtect;

    /**
    * 
    */
    @SerializedName("CWPProtect")
    @Expose
    private String CWPProtect;

    /**
    * 
    */
    @SerializedName("Departments")
    @Expose
    private String [] Departments;

    /**
    * 
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
    * 
    */
    @SerializedName("QuotaConsumer")
    @Expose
    private Long QuotaConsumer;

    /**
    * 
    */
    @SerializedName("EnableAdminCount")
    @Expose
    private Long EnableAdminCount;

    /**
    * 
    */
    @SerializedName("CloudCountDesc")
    @Expose
    private CloudCountDesc [] CloudCountDesc;

    /**
    * 
    */
    @SerializedName("AdminCount")
    @Expose
    private Long AdminCount;

    /**
     * Get  
     * @return NickName 
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 
     * @param NickName 
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get  
     * @return NodeName 
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 
     * @param NodeName 
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get  
     * @return Role 
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 
     * @param Role 
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get  
     * @return MemberId 
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 
     * @param MemberId 
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get  
     * @return JoinType 
     */
    public String getJoinType() {
        return this.JoinType;
    }

    /**
     * Set 
     * @param JoinType 
     */
    public void setJoinType(String JoinType) {
        this.JoinType = JoinType;
    }

    /**
     * Get  
     * @return GroupName 
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 
     * @param GroupName 
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get  
     * @return AdminName 
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set 
     * @param AdminName 
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get  
     * @return AdminUin 
     */
    public String getAdminUin() {
        return this.AdminUin;
    }

    /**
     * Set 
     * @param AdminUin 
     */
    public void setAdminUin(String AdminUin) {
        this.AdminUin = AdminUin;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return NodeCount 
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 
     * @param NodeCount 
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get  
     * @return MemberCount 
     */
    public Long getMemberCount() {
        return this.MemberCount;
    }

    /**
     * Set 
     * @param MemberCount 
     */
    public void setMemberCount(Long MemberCount) {
        this.MemberCount = MemberCount;
    }

    /**
     * Get  
     * @return SubAccountCount 
     */
    public Long getSubAccountCount() {
        return this.SubAccountCount;
    }

    /**
     * Set 
     * @param SubAccountCount 
     */
    public void setSubAccountCount(Long SubAccountCount) {
        this.SubAccountCount = SubAccountCount;
    }

    /**
     * Get  
     * @return AbnormalSubUserCount 
     */
    public Long getAbnormalSubUserCount() {
        return this.AbnormalSubUserCount;
    }

    /**
     * Set 
     * @param AbnormalSubUserCount 
     */
    public void setAbnormalSubUserCount(Long AbnormalSubUserCount) {
        this.AbnormalSubUserCount = AbnormalSubUserCount;
    }

    /**
     * Get  
     * @return GroupPermission 
     */
    public String [] getGroupPermission() {
        return this.GroupPermission;
    }

    /**
     * Set 
     * @param GroupPermission 
     */
    public void setGroupPermission(String [] GroupPermission) {
        this.GroupPermission = GroupPermission;
    }

    /**
     * Get  
     * @return MemberPermission 
     */
    public String [] getMemberPermission() {
        return this.MemberPermission;
    }

    /**
     * Set 
     * @param MemberPermission 
     */
    public void setMemberPermission(String [] MemberPermission) {
        this.MemberPermission = MemberPermission;
    }

    /**
     * Get  
     * @return GroupPayMode 
     */
    public Long getGroupPayMode() {
        return this.GroupPayMode;
    }

    /**
     * Set 
     * @param GroupPayMode 
     */
    public void setGroupPayMode(Long GroupPayMode) {
        this.GroupPayMode = GroupPayMode;
    }

    /**
     * Get  
     * @return MemberPayMode 
     */
    public Long getMemberPayMode() {
        return this.MemberPayMode;
    }

    /**
     * Set 
     * @param MemberPayMode 
     */
    public void setMemberPayMode(Long MemberPayMode) {
        this.MemberPayMode = MemberPayMode;
    }

    /**
     * Get  
     * @return CFWProtect 
     */
    public String getCFWProtect() {
        return this.CFWProtect;
    }

    /**
     * Set 
     * @param CFWProtect 
     */
    public void setCFWProtect(String CFWProtect) {
        this.CFWProtect = CFWProtect;
    }

    /**
     * Get  
     * @return WAFProtect 
     */
    public String getWAFProtect() {
        return this.WAFProtect;
    }

    /**
     * Set 
     * @param WAFProtect 
     */
    public void setWAFProtect(String WAFProtect) {
        this.WAFProtect = WAFProtect;
    }

    /**
     * Get  
     * @return CWPProtect 
     */
    public String getCWPProtect() {
        return this.CWPProtect;
    }

    /**
     * Set 
     * @param CWPProtect 
     */
    public void setCWPProtect(String CWPProtect) {
        this.CWPProtect = CWPProtect;
    }

    /**
     * Get  
     * @return Departments 
     */
    public String [] getDepartments() {
        return this.Departments;
    }

    /**
     * Set 
     * @param Departments 
     */
    public void setDepartments(String [] Departments) {
        this.Departments = Departments;
    }

    /**
     * Get  
     * @return MemberCreateTime 
     */
    public String getMemberCreateTime() {
        return this.MemberCreateTime;
    }

    /**
     * Set 
     * @param MemberCreateTime 
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
     * Get  
     * @return QuotaConsumer 
     */
    public Long getQuotaConsumer() {
        return this.QuotaConsumer;
    }

    /**
     * Set 
     * @param QuotaConsumer 
     */
    public void setQuotaConsumer(Long QuotaConsumer) {
        this.QuotaConsumer = QuotaConsumer;
    }

    /**
     * Get  
     * @return EnableAdminCount 
     */
    public Long getEnableAdminCount() {
        return this.EnableAdminCount;
    }

    /**
     * Set 
     * @param EnableAdminCount 
     */
    public void setEnableAdminCount(Long EnableAdminCount) {
        this.EnableAdminCount = EnableAdminCount;
    }

    /**
     * Get  
     * @return CloudCountDesc 
     */
    public CloudCountDesc [] getCloudCountDesc() {
        return this.CloudCountDesc;
    }

    /**
     * Set 
     * @param CloudCountDesc 
     */
    public void setCloudCountDesc(CloudCountDesc [] CloudCountDesc) {
        this.CloudCountDesc = CloudCountDesc;
    }

    /**
     * Get  
     * @return AdminCount 
     */
    public Long getAdminCount() {
        return this.AdminCount;
    }

    /**
     * Set 
     * @param AdminCount 
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

