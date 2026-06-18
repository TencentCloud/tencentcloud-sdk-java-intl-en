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

public class OrganizationUserInfo extends AbstractModel {

    /**
    * Member Account UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

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
    * Number of assets
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * Number of risks
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * Number of Attacks
    */
    @SerializedName("AttackCount")
    @Expose
    private Long AttackCount;

    /**
    * Member/Admin/; Member or Administrator
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
    * Member Account AppID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Account Joining Method: Create/Invite.
    */
    @SerializedName("JoinType")
    @Expose
    private String JoinType;

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
    * 1-Enabled; 0-Not Enabled.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Free       // Free Edition  Advanced   //Advanced Edition Enterprise //Enterprise Edition Ultimate   //Premium Edition
    */
    @SerializedName("CSIPProtect")
    @Expose
    private String CSIPProtect;

    /**
    * 1 for quota consumer.
    */
    @SerializedName("QuotaConsumer")
    @Expose
    private Long QuotaConsumer;

    /**
    * Account Type. 0 for Tencent Cloud account; 1 for AWS account.
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * 0 for default value, 1 for 10 minutes, 2 for 1 hour, 3 for 24 hours.
    */
    @SerializedName("SyncFrequency")
    @Expose
    private Long SyncFrequency;

    /**
    * Whether the multi-cloud account is expired.
    */
    @SerializedName("IsExpired")
    @Expose
    private Boolean IsExpired;

    /**
    * Multi-Cloud Account Permission List
    */
    @SerializedName("PermissionList")
    @Expose
    private String [] PermissionList;

    /**
    * 1
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * Tencent Cloud Group Account
Tencent Cloud access account
2: non-Tencent Cloud
    */
    @SerializedName("TcMemberType")
    @Expose
    private Long TcMemberType;

    /**
    * Number of sub-accounts.
    */
    @SerializedName("SubUserCount")
    @Expose
    private Long SubUserCount;

    /**
    * Joining method details
    */
    @SerializedName("JoinTypeInfo")
    @Expose
    private String JoinTypeInfo;

    /**
     * Get Member Account UIN 
     * @return Uin Member Account UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Member Account UIN
     * @param Uin Member Account UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

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
     * Get Number of assets 
     * @return AssetCount Number of assets
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set Number of assets
     * @param AssetCount Number of assets
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get Number of risks 
     * @return RiskCount Number of risks
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set Number of risks
     * @param RiskCount Number of risks
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get Number of Attacks 
     * @return AttackCount Number of Attacks
     */
    public Long getAttackCount() {
        return this.AttackCount;
    }

    /**
     * Set Number of Attacks
     * @param AttackCount Number of Attacks
     */
    public void setAttackCount(Long AttackCount) {
        this.AttackCount = AttackCount;
    }

    /**
     * Get Member/Admin/; Member or Administrator 
     * @return Role Member/Admin/; Member or Administrator
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Member/Admin/; Member or Administrator
     * @param Role Member/Admin/; Member or Administrator
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
     * Get Member Account AppID 
     * @return AppId Member Account AppID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set Member Account AppID
     * @param AppId Member Account AppID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
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
     * Get 1-Enabled; 0-Not Enabled. 
     * @return Enable 1-Enabled; 0-Not Enabled.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 1-Enabled; 0-Not Enabled.
     * @param Enable 1-Enabled; 0-Not Enabled.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Free       // Free Edition  Advanced   //Advanced Edition Enterprise //Enterprise Edition Ultimate   //Premium Edition 
     * @return CSIPProtect Free       // Free Edition  Advanced   //Advanced Edition Enterprise //Enterprise Edition Ultimate   //Premium Edition
     */
    public String getCSIPProtect() {
        return this.CSIPProtect;
    }

    /**
     * Set Free       // Free Edition  Advanced   //Advanced Edition Enterprise //Enterprise Edition Ultimate   //Premium Edition
     * @param CSIPProtect Free       // Free Edition  Advanced   //Advanced Edition Enterprise //Enterprise Edition Ultimate   //Premium Edition
     */
    public void setCSIPProtect(String CSIPProtect) {
        this.CSIPProtect = CSIPProtect;
    }

    /**
     * Get 1 for quota consumer. 
     * @return QuotaConsumer 1 for quota consumer.
     */
    public Long getQuotaConsumer() {
        return this.QuotaConsumer;
    }

    /**
     * Set 1 for quota consumer.
     * @param QuotaConsumer 1 for quota consumer.
     */
    public void setQuotaConsumer(Long QuotaConsumer) {
        this.QuotaConsumer = QuotaConsumer;
    }

    /**
     * Get Account Type. 0 for Tencent Cloud account; 1 for AWS account. 
     * @return CloudType Account Type. 0 for Tencent Cloud account; 1 for AWS account.
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set Account Type. 0 for Tencent Cloud account; 1 for AWS account.
     * @param CloudType Account Type. 0 for Tencent Cloud account; 1 for AWS account.
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get 0 for default value, 1 for 10 minutes, 2 for 1 hour, 3 for 24 hours. 
     * @return SyncFrequency 0 for default value, 1 for 10 minutes, 2 for 1 hour, 3 for 24 hours.
     */
    public Long getSyncFrequency() {
        return this.SyncFrequency;
    }

    /**
     * Set 0 for default value, 1 for 10 minutes, 2 for 1 hour, 3 for 24 hours.
     * @param SyncFrequency 0 for default value, 1 for 10 minutes, 2 for 1 hour, 3 for 24 hours.
     */
    public void setSyncFrequency(Long SyncFrequency) {
        this.SyncFrequency = SyncFrequency;
    }

    /**
     * Get Whether the multi-cloud account is expired. 
     * @return IsExpired Whether the multi-cloud account is expired.
     */
    public Boolean getIsExpired() {
        return this.IsExpired;
    }

    /**
     * Set Whether the multi-cloud account is expired.
     * @param IsExpired Whether the multi-cloud account is expired.
     */
    public void setIsExpired(Boolean IsExpired) {
        this.IsExpired = IsExpired;
    }

    /**
     * Get Multi-Cloud Account Permission List 
     * @return PermissionList Multi-Cloud Account Permission List
     */
    public String [] getPermissionList() {
        return this.PermissionList;
    }

    /**
     * Set Multi-Cloud Account Permission List
     * @param PermissionList Multi-Cloud Account Permission List
     */
    public void setPermissionList(String [] PermissionList) {
        this.PermissionList = PermissionList;
    }

    /**
     * Get 1 
     * @return AuthType 1
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 1
     * @param AuthType 1
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get Tencent Cloud Group Account
Tencent Cloud access account
2: non-Tencent Cloud 
     * @return TcMemberType Tencent Cloud Group Account
Tencent Cloud access account
2: non-Tencent Cloud
     */
    public Long getTcMemberType() {
        return this.TcMemberType;
    }

    /**
     * Set Tencent Cloud Group Account
Tencent Cloud access account
2: non-Tencent Cloud
     * @param TcMemberType Tencent Cloud Group Account
Tencent Cloud access account
2: non-Tencent Cloud
     */
    public void setTcMemberType(Long TcMemberType) {
        this.TcMemberType = TcMemberType;
    }

    /**
     * Get Number of sub-accounts. 
     * @return SubUserCount Number of sub-accounts.
     */
    public Long getSubUserCount() {
        return this.SubUserCount;
    }

    /**
     * Set Number of sub-accounts.
     * @param SubUserCount Number of sub-accounts.
     */
    public void setSubUserCount(Long SubUserCount) {
        this.SubUserCount = SubUserCount;
    }

    /**
     * Get Joining method details 
     * @return JoinTypeInfo Joining method details
     */
    public String getJoinTypeInfo() {
        return this.JoinTypeInfo;
    }

    /**
     * Set Joining method details
     * @param JoinTypeInfo Joining method details
     */
    public void setJoinTypeInfo(String JoinTypeInfo) {
        this.JoinTypeInfo = JoinTypeInfo;
    }

    public OrganizationUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrganizationUserInfo(OrganizationUserInfo source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.AttackCount != null) {
            this.AttackCount = new Long(source.AttackCount);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.JoinType != null) {
            this.JoinType = new String(source.JoinType);
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
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.CSIPProtect != null) {
            this.CSIPProtect = new String(source.CSIPProtect);
        }
        if (source.QuotaConsumer != null) {
            this.QuotaConsumer = new Long(source.QuotaConsumer);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
        if (source.SyncFrequency != null) {
            this.SyncFrequency = new Long(source.SyncFrequency);
        }
        if (source.IsExpired != null) {
            this.IsExpired = new Boolean(source.IsExpired);
        }
        if (source.PermissionList != null) {
            this.PermissionList = new String[source.PermissionList.length];
            for (int i = 0; i < source.PermissionList.length; i++) {
                this.PermissionList[i] = new String(source.PermissionList[i]);
            }
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.TcMemberType != null) {
            this.TcMemberType = new Long(source.TcMemberType);
        }
        if (source.SubUserCount != null) {
            this.SubUserCount = new Long(source.SubUserCount);
        }
        if (source.JoinTypeInfo != null) {
            this.JoinTypeInfo = new String(source.JoinTypeInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "AttackCount", this.AttackCount);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "JoinType", this.JoinType);
        this.setParamSimple(map, prefix + "CFWProtect", this.CFWProtect);
        this.setParamSimple(map, prefix + "WAFProtect", this.WAFProtect);
        this.setParamSimple(map, prefix + "CWPProtect", this.CWPProtect);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "CSIPProtect", this.CSIPProtect);
        this.setParamSimple(map, prefix + "QuotaConsumer", this.QuotaConsumer);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "SyncFrequency", this.SyncFrequency);
        this.setParamSimple(map, prefix + "IsExpired", this.IsExpired);
        this.setParamArraySimple(map, prefix + "PermissionList.", this.PermissionList);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "TcMemberType", this.TcMemberType);
        this.setParamSimple(map, prefix + "SubUserCount", this.SubUserCount);
        this.setParamSimple(map, prefix + "JoinTypeInfo", this.JoinTypeInfo);

    }
}

