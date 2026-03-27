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

public class SubUserInfo extends AbstractModel {

    /**
    * Primary key ID, which has no business meaning and serves solely as a unique identifier
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * sub-account Appid
    */
    @SerializedName("AppID")
    @Expose
    private String AppID;

    /**
    * sub-account UIn
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Sub-account name
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * master account Appid
    */
    @SerializedName("OwnerAppID")
    @Expose
    private String OwnerAppID;

    /**
    * master account Uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * master account name
    */
    @SerializedName("OwnerNickName")
    @Expose
    private String OwnerNickName;

    /**
    * master account's memberId information
    */
    @SerializedName("OwnerMemberID")
    @Expose
    private String OwnerMemberID;

    /**
    * Account type: 0 for Tencent Cloud account, 1 for AWS account
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * Accessible services count
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * Accessible API count
    */
    @SerializedName("InterfaceCount")
    @Expose
    private Long InterfaceCount;

    /**
    * Accessible resources count
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * Access/Behavior Logs Count
    */
    @SerializedName("LogCount")
    @Expose
    private Long LogCount;

    /**
    * Permissions configuration risk
    */
    @SerializedName("ConfigRiskCount")
    @Expose
    private Long ConfigRiskCount;

    /**
    * Dangerous behavior alarm
    */
    @SerializedName("ActionRiskCount")
    @Expose
    private Long ActionRiskCount;

    /**
    * whether to enable CloudAudit logs
    */
    @SerializedName("IsAccessCloudAudit")
    @Expose
    private Boolean IsAccessCloudAudit;

    /**
    * whether risk configuration security assessment
    */
    @SerializedName("IsAccessCheck")
    @Expose
    private Boolean IsAccessCheck;

    /**
    * whether to configure user behavior management policies
    */
    @SerializedName("IsAccessUeba")
    @Expose
    private Boolean IsAccessUeba;

    /**
     * Get Primary key ID, which has no business meaning and serves solely as a unique identifier 
     * @return ID Primary key ID, which has no business meaning and serves solely as a unique identifier
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Primary key ID, which has no business meaning and serves solely as a unique identifier
     * @param ID Primary key ID, which has no business meaning and serves solely as a unique identifier
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get sub-account Appid 
     * @return AppID sub-account Appid
     */
    public String getAppID() {
        return this.AppID;
    }

    /**
     * Set sub-account Appid
     * @param AppID sub-account Appid
     */
    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    /**
     * Get sub-account UIn 
     * @return Uin sub-account UIn
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set sub-account UIn
     * @param Uin sub-account UIn
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Sub-account name 
     * @return NickName Sub-account name
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Sub-account name
     * @param NickName Sub-account name
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get master account Appid 
     * @return OwnerAppID master account Appid
     */
    public String getOwnerAppID() {
        return this.OwnerAppID;
    }

    /**
     * Set master account Appid
     * @param OwnerAppID master account Appid
     */
    public void setOwnerAppID(String OwnerAppID) {
        this.OwnerAppID = OwnerAppID;
    }

    /**
     * Get master account Uin 
     * @return OwnerUin master account Uin
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set master account Uin
     * @param OwnerUin master account Uin
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get master account name 
     * @return OwnerNickName master account name
     */
    public String getOwnerNickName() {
        return this.OwnerNickName;
    }

    /**
     * Set master account name
     * @param OwnerNickName master account name
     */
    public void setOwnerNickName(String OwnerNickName) {
        this.OwnerNickName = OwnerNickName;
    }

    /**
     * Get master account's memberId information 
     * @return OwnerMemberID master account's memberId information
     */
    public String getOwnerMemberID() {
        return this.OwnerMemberID;
    }

    /**
     * Set master account's memberId information
     * @param OwnerMemberID master account's memberId information
     */
    public void setOwnerMemberID(String OwnerMemberID) {
        this.OwnerMemberID = OwnerMemberID;
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
     * Get Accessible services count 
     * @return ServiceCount Accessible services count
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set Accessible services count
     * @param ServiceCount Accessible services count
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get Accessible API count 
     * @return InterfaceCount Accessible API count
     */
    public Long getInterfaceCount() {
        return this.InterfaceCount;
    }

    /**
     * Set Accessible API count
     * @param InterfaceCount Accessible API count
     */
    public void setInterfaceCount(Long InterfaceCount) {
        this.InterfaceCount = InterfaceCount;
    }

    /**
     * Get Accessible resources count 
     * @return AssetCount Accessible resources count
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set Accessible resources count
     * @param AssetCount Accessible resources count
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get Access/Behavior Logs Count 
     * @return LogCount Access/Behavior Logs Count
     */
    public Long getLogCount() {
        return this.LogCount;
    }

    /**
     * Set Access/Behavior Logs Count
     * @param LogCount Access/Behavior Logs Count
     */
    public void setLogCount(Long LogCount) {
        this.LogCount = LogCount;
    }

    /**
     * Get Permissions configuration risk 
     * @return ConfigRiskCount Permissions configuration risk
     */
    public Long getConfigRiskCount() {
        return this.ConfigRiskCount;
    }

    /**
     * Set Permissions configuration risk
     * @param ConfigRiskCount Permissions configuration risk
     */
    public void setConfigRiskCount(Long ConfigRiskCount) {
        this.ConfigRiskCount = ConfigRiskCount;
    }

    /**
     * Get Dangerous behavior alarm 
     * @return ActionRiskCount Dangerous behavior alarm
     */
    public Long getActionRiskCount() {
        return this.ActionRiskCount;
    }

    /**
     * Set Dangerous behavior alarm
     * @param ActionRiskCount Dangerous behavior alarm
     */
    public void setActionRiskCount(Long ActionRiskCount) {
        this.ActionRiskCount = ActionRiskCount;
    }

    /**
     * Get whether to enable CloudAudit logs 
     * @return IsAccessCloudAudit whether to enable CloudAudit logs
     */
    public Boolean getIsAccessCloudAudit() {
        return this.IsAccessCloudAudit;
    }

    /**
     * Set whether to enable CloudAudit logs
     * @param IsAccessCloudAudit whether to enable CloudAudit logs
     */
    public void setIsAccessCloudAudit(Boolean IsAccessCloudAudit) {
        this.IsAccessCloudAudit = IsAccessCloudAudit;
    }

    /**
     * Get whether risk configuration security assessment 
     * @return IsAccessCheck whether risk configuration security assessment
     */
    public Boolean getIsAccessCheck() {
        return this.IsAccessCheck;
    }

    /**
     * Set whether risk configuration security assessment
     * @param IsAccessCheck whether risk configuration security assessment
     */
    public void setIsAccessCheck(Boolean IsAccessCheck) {
        this.IsAccessCheck = IsAccessCheck;
    }

    /**
     * Get whether to configure user behavior management policies 
     * @return IsAccessUeba whether to configure user behavior management policies
     */
    public Boolean getIsAccessUeba() {
        return this.IsAccessUeba;
    }

    /**
     * Set whether to configure user behavior management policies
     * @param IsAccessUeba whether to configure user behavior management policies
     */
    public void setIsAccessUeba(Boolean IsAccessUeba) {
        this.IsAccessUeba = IsAccessUeba;
    }

    public SubUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubUserInfo(SubUserInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.AppID != null) {
            this.AppID = new String(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.OwnerAppID != null) {
            this.OwnerAppID = new String(source.OwnerAppID);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OwnerNickName != null) {
            this.OwnerNickName = new String(source.OwnerNickName);
        }
        if (source.OwnerMemberID != null) {
            this.OwnerMemberID = new String(source.OwnerMemberID);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.InterfaceCount != null) {
            this.InterfaceCount = new Long(source.InterfaceCount);
        }
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
        }
        if (source.LogCount != null) {
            this.LogCount = new Long(source.LogCount);
        }
        if (source.ConfigRiskCount != null) {
            this.ConfigRiskCount = new Long(source.ConfigRiskCount);
        }
        if (source.ActionRiskCount != null) {
            this.ActionRiskCount = new Long(source.ActionRiskCount);
        }
        if (source.IsAccessCloudAudit != null) {
            this.IsAccessCloudAudit = new Boolean(source.IsAccessCloudAudit);
        }
        if (source.IsAccessCheck != null) {
            this.IsAccessCheck = new Boolean(source.IsAccessCheck);
        }
        if (source.IsAccessUeba != null) {
            this.IsAccessUeba = new Boolean(source.IsAccessUeba);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "OwnerAppID", this.OwnerAppID);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OwnerNickName", this.OwnerNickName);
        this.setParamSimple(map, prefix + "OwnerMemberID", this.OwnerMemberID);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "InterfaceCount", this.InterfaceCount);
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "LogCount", this.LogCount);
        this.setParamSimple(map, prefix + "ConfigRiskCount", this.ConfigRiskCount);
        this.setParamSimple(map, prefix + "ActionRiskCount", this.ActionRiskCount);
        this.setParamSimple(map, prefix + "IsAccessCloudAudit", this.IsAccessCloudAudit);
        this.setParamSimple(map, prefix + "IsAccessCheck", this.IsAccessCheck);
        this.setParamSimple(map, prefix + "IsAccessUeba", this.IsAccessUeba);

    }
}

