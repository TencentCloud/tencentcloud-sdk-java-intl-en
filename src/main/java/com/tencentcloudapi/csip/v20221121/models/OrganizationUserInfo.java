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
    * 
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

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
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * 
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * 
    */
    @SerializedName("AttackCount")
    @Expose
    private Long AttackCount;

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
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 
    */
    @SerializedName("JoinType")
    @Expose
    private String JoinType;

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
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 
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
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * 
    */
    @SerializedName("SyncFrequency")
    @Expose
    private Long SyncFrequency;

    /**
    * 
    */
    @SerializedName("IsExpired")
    @Expose
    private Boolean IsExpired;

    /**
    * 
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
    * 
    */
    @SerializedName("TcMemberType")
    @Expose
    private Long TcMemberType;

    /**
    * 
    */
    @SerializedName("SubUserCount")
    @Expose
    private Long SubUserCount;

    /**
    * 
    */
    @SerializedName("JoinTypeInfo")
    @Expose
    private String JoinTypeInfo;

    /**
     * Get  
     * @return Uin 
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 
     * @param Uin 
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

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
     * @return AssetCount 
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set 
     * @param AssetCount 
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get  
     * @return RiskCount 
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 
     * @param RiskCount 
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get  
     * @return AttackCount 
     */
    public Long getAttackCount() {
        return this.AttackCount;
    }

    /**
     * Set 
     * @param AttackCount 
     */
    public void setAttackCount(Long AttackCount) {
        this.AttackCount = AttackCount;
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
     * @return AppId 
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 
     * @param AppId 
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
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
     * @return Enable 
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 
     * @param Enable 
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get  
     * @return CSIPProtect 
     */
    public String getCSIPProtect() {
        return this.CSIPProtect;
    }

    /**
     * Set 
     * @param CSIPProtect 
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
     * @return CloudType 
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set 
     * @param CloudType 
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get  
     * @return SyncFrequency 
     */
    public Long getSyncFrequency() {
        return this.SyncFrequency;
    }

    /**
     * Set 
     * @param SyncFrequency 
     */
    public void setSyncFrequency(Long SyncFrequency) {
        this.SyncFrequency = SyncFrequency;
    }

    /**
     * Get  
     * @return IsExpired 
     */
    public Boolean getIsExpired() {
        return this.IsExpired;
    }

    /**
     * Set 
     * @param IsExpired 
     */
    public void setIsExpired(Boolean IsExpired) {
        this.IsExpired = IsExpired;
    }

    /**
     * Get  
     * @return PermissionList 
     */
    public String [] getPermissionList() {
        return this.PermissionList;
    }

    /**
     * Set 
     * @param PermissionList 
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
     * Get  
     * @return TcMemberType 
     */
    public Long getTcMemberType() {
        return this.TcMemberType;
    }

    /**
     * Set 
     * @param TcMemberType 
     */
    public void setTcMemberType(Long TcMemberType) {
        this.TcMemberType = TcMemberType;
    }

    /**
     * Get  
     * @return SubUserCount 
     */
    public Long getSubUserCount() {
        return this.SubUserCount;
    }

    /**
     * Set 
     * @param SubUserCount 
     */
    public void setSubUserCount(Long SubUserCount) {
        this.SubUserCount = SubUserCount;
    }

    /**
     * Get  
     * @return JoinTypeInfo 
     */
    public String getJoinTypeInfo() {
        return this.JoinTypeInfo;
    }

    /**
     * Set 
     * @param JoinTypeInfo 
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

