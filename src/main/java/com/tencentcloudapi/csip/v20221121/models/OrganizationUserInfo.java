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
    * Member account Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

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
    * Asset Quantity
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * Risk Quantity
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * Attack Quantity
    */
    @SerializedName("AttackCount")
    @Expose
    private Long AttackCount;

    /**
    * Member/Admin/;Member or Administrator
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
    * Member account Appid
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * account joining method,create/invite
    */
    @SerializedName("JoinType")
    @Expose
    private String JoinType;

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
    * 1 enable, 0 not enabled
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * "Free"      
   //Free edition
   "Advanced"   //Advanced edition "Enterprise" //Enterprise edition "Ultimate"  
   //Ultimate edition
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
    * Account type: 0 for Tencent Cloud account, 1 for AWS account
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * 0 indicates the default value; 1 indicates 10 minutes; 2 indicates 1 hour; 3 indicates 24 hours
    */
    @SerializedName("SyncFrequency")
    @Expose
    private Long SyncFrequency;

    /**
    * Whether the multi-cloud account has expired
    */
    @SerializedName("IsExpired")
    @Expose
    private Boolean IsExpired;

    /**
    * Multi-cloud account permissions list
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
    * 0 Tencent Cloud group account
1 Tencent Cloud access account
2 non-Tencent Cloud
    */
    @SerializedName("TcMemberType")
    @Expose
    private Long TcMemberType;

    /**
    * Sub-account count
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
     * Get Member account Uin 
     * @return Uin Member account Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Member account Uin
     * @param Uin Member account Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

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
     * Get Asset Quantity 
     * @return AssetCount Asset Quantity
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set Asset Quantity
     * @param AssetCount Asset Quantity
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get Risk Quantity 
     * @return RiskCount Risk Quantity
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set Risk Quantity
     * @param RiskCount Risk Quantity
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get Attack Quantity 
     * @return AttackCount Attack Quantity
     */
    public Long getAttackCount() {
        return this.AttackCount;
    }

    /**
     * Set Attack Quantity
     * @param AttackCount Attack Quantity
     */
    public void setAttackCount(Long AttackCount) {
        this.AttackCount = AttackCount;
    }

    /**
     * Get Member/Admin/;Member or Administrator 
     * @return Role Member/Admin/;Member or Administrator
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Member/Admin/;Member or Administrator
     * @param Role Member/Admin/;Member or Administrator
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
     * Get Member account Appid 
     * @return AppId Member account Appid
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set Member account Appid
     * @param AppId Member account Appid
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
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
     * Get 1 enable, 0 not enabled 
     * @return Enable 1 enable, 0 not enabled
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 1 enable, 0 not enabled
     * @param Enable 1 enable, 0 not enabled
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get "Free"      
   //Free edition
   "Advanced"   //Advanced edition "Enterprise" //Enterprise edition "Ultimate"  
   //Ultimate edition 
     * @return CSIPProtect "Free"      
   //Free edition
   "Advanced"   //Advanced edition "Enterprise" //Enterprise edition "Ultimate"  
   //Ultimate edition
     */
    public String getCSIPProtect() {
        return this.CSIPProtect;
    }

    /**
     * Set "Free"      
   //Free edition
   "Advanced"   //Advanced edition "Enterprise" //Enterprise edition "Ultimate"  
   //Ultimate edition
     * @param CSIPProtect "Free"      
   //Free edition
   "Advanced"   //Advanced edition "Enterprise" //Enterprise edition "Ultimate"  
   //Ultimate edition
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
     * Get Account type: 0 for Tencent Cloud account, 1 for AWS account 
     * @return CloudType Account type: 0 for Tencent Cloud account, 1 for AWS account
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set Account type: 0 for Tencent Cloud account, 1 for AWS account
     * @param CloudType Account type: 0 for Tencent Cloud account, 1 for AWS account
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get 0 indicates the default value; 1 indicates 10 minutes; 2 indicates 1 hour; 3 indicates 24 hours 
     * @return SyncFrequency 0 indicates the default value; 1 indicates 10 minutes; 2 indicates 1 hour; 3 indicates 24 hours
     */
    public Long getSyncFrequency() {
        return this.SyncFrequency;
    }

    /**
     * Set 0 indicates the default value; 1 indicates 10 minutes; 2 indicates 1 hour; 3 indicates 24 hours
     * @param SyncFrequency 0 indicates the default value; 1 indicates 10 minutes; 2 indicates 1 hour; 3 indicates 24 hours
     */
    public void setSyncFrequency(Long SyncFrequency) {
        this.SyncFrequency = SyncFrequency;
    }

    /**
     * Get Whether the multi-cloud account has expired 
     * @return IsExpired Whether the multi-cloud account has expired
     */
    public Boolean getIsExpired() {
        return this.IsExpired;
    }

    /**
     * Set Whether the multi-cloud account has expired
     * @param IsExpired Whether the multi-cloud account has expired
     */
    public void setIsExpired(Boolean IsExpired) {
        this.IsExpired = IsExpired;
    }

    /**
     * Get Multi-cloud account permissions list 
     * @return PermissionList Multi-cloud account permissions list
     */
    public String [] getPermissionList() {
        return this.PermissionList;
    }

    /**
     * Set Multi-cloud account permissions list
     * @param PermissionList Multi-cloud account permissions list
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
     * Get 0 Tencent Cloud group account
1 Tencent Cloud access account
2 non-Tencent Cloud 
     * @return TcMemberType 0 Tencent Cloud group account
1 Tencent Cloud access account
2 non-Tencent Cloud
     */
    public Long getTcMemberType() {
        return this.TcMemberType;
    }

    /**
     * Set 0 Tencent Cloud group account
1 Tencent Cloud access account
2 non-Tencent Cloud
     * @param TcMemberType 0 Tencent Cloud group account
1 Tencent Cloud access account
2 non-Tencent Cloud
     */
    public void setTcMemberType(Long TcMemberType) {
        this.TcMemberType = TcMemberType;
    }

    /**
     * Get Sub-account count 
     * @return SubUserCount Sub-account count
     */
    public Long getSubUserCount() {
        return this.SubUserCount;
    }

    /**
     * Set Sub-account count
     * @param SubUserCount Sub-account count
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

