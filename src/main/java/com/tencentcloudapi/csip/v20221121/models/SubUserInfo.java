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
    * <p>Primary key ID, with no business significance, only serves as a unique key.</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Sub-account Appid</p>
    */
    @SerializedName("AppID")
    @Expose
    private String AppID;

    /**
    * <p>Sub-account UIn</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>Sub-account name</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>Root Account Appid</p>
    */
    @SerializedName("OwnerAppID")
    @Expose
    private String OwnerAppID;

    /**
    * <p>Root account Uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>Root account name</p>
    */
    @SerializedName("OwnerNickName")
    @Expose
    private String OwnerNickName;

    /**
    * <p>Member ID information belonging to main account</p>
    */
    @SerializedName("OwnerMemberID")
    @Expose
    private String OwnerMemberID;

    /**
    * <p>Account type. 0 indicates a Tencent Cloud account, and 1 indicates an AWS account.</p>
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * <p>Number of accessible services</p>
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * <p>Number of accessible APIs</p>
    */
    @SerializedName("InterfaceCount")
    @Expose
    private Long InterfaceCount;

    /**
    * <p>Number of accessible resources</p>
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * <p>Number of access/behavior logs</p>
    */
    @SerializedName("LogCount")
    @Expose
    private Long LogCount;

    /**
    * <p>Permission configuration risk</p>
    */
    @SerializedName("ConfigRiskCount")
    @Expose
    private Long ConfigRiskCount;

    /**
    * <p>Dangerous behavior alarm</p>
    */
    @SerializedName("ActionRiskCount")
    @Expose
    private Long ActionRiskCount;

    /**
    * <p>Whether to access operation audit log</p>
    */
    @SerializedName("IsAccessCloudAudit")
    @Expose
    private Boolean IsAccessCloudAudit;

    /**
    * <p>Security check for configuration risk required or not</p>
    */
    @SerializedName("IsAccessCheck")
    @Expose
    private Boolean IsAccessCheck;

    /**
    * <p>Whether configure user behavior management policy</p>
    */
    @SerializedName("IsAccessUeba")
    @Expose
    private Boolean IsAccessUeba;

    /**
    * <p>Creation time (Unix timestamp).</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get <p>Primary key ID, with no business significance, only serves as a unique key.</p> 
     * @return ID <p>Primary key ID, with no business significance, only serves as a unique key.</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Primary key ID, with no business significance, only serves as a unique key.</p>
     * @param ID <p>Primary key ID, with no business significance, only serves as a unique key.</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Sub-account Appid</p> 
     * @return AppID <p>Sub-account Appid</p>
     */
    public String getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>Sub-account Appid</p>
     * @param AppID <p>Sub-account Appid</p>
     */
    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>Sub-account UIn</p> 
     * @return Uin <p>Sub-account UIn</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>Sub-account UIn</p>
     * @param Uin <p>Sub-account UIn</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>Sub-account name</p> 
     * @return NickName <p>Sub-account name</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>Sub-account name</p>
     * @param NickName <p>Sub-account name</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>Root Account Appid</p> 
     * @return OwnerAppID <p>Root Account Appid</p>
     */
    public String getOwnerAppID() {
        return this.OwnerAppID;
    }

    /**
     * Set <p>Root Account Appid</p>
     * @param OwnerAppID <p>Root Account Appid</p>
     */
    public void setOwnerAppID(String OwnerAppID) {
        this.OwnerAppID = OwnerAppID;
    }

    /**
     * Get <p>Root account Uin</p> 
     * @return OwnerUin <p>Root account Uin</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>Root account Uin</p>
     * @param OwnerUin <p>Root account Uin</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>Root account name</p> 
     * @return OwnerNickName <p>Root account name</p>
     */
    public String getOwnerNickName() {
        return this.OwnerNickName;
    }

    /**
     * Set <p>Root account name</p>
     * @param OwnerNickName <p>Root account name</p>
     */
    public void setOwnerNickName(String OwnerNickName) {
        this.OwnerNickName = OwnerNickName;
    }

    /**
     * Get <p>Member ID information belonging to main account</p> 
     * @return OwnerMemberID <p>Member ID information belonging to main account</p>
     */
    public String getOwnerMemberID() {
        return this.OwnerMemberID;
    }

    /**
     * Set <p>Member ID information belonging to main account</p>
     * @param OwnerMemberID <p>Member ID information belonging to main account</p>
     */
    public void setOwnerMemberID(String OwnerMemberID) {
        this.OwnerMemberID = OwnerMemberID;
    }

    /**
     * Get <p>Account type. 0 indicates a Tencent Cloud account, and 1 indicates an AWS account.</p> 
     * @return CloudType <p>Account type. 0 indicates a Tencent Cloud account, and 1 indicates an AWS account.</p>
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set <p>Account type. 0 indicates a Tencent Cloud account, and 1 indicates an AWS account.</p>
     * @param CloudType <p>Account type. 0 indicates a Tencent Cloud account, and 1 indicates an AWS account.</p>
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get <p>Number of accessible services</p> 
     * @return ServiceCount <p>Number of accessible services</p>
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set <p>Number of accessible services</p>
     * @param ServiceCount <p>Number of accessible services</p>
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get <p>Number of accessible APIs</p> 
     * @return InterfaceCount <p>Number of accessible APIs</p>
     */
    public Long getInterfaceCount() {
        return this.InterfaceCount;
    }

    /**
     * Set <p>Number of accessible APIs</p>
     * @param InterfaceCount <p>Number of accessible APIs</p>
     */
    public void setInterfaceCount(Long InterfaceCount) {
        this.InterfaceCount = InterfaceCount;
    }

    /**
     * Get <p>Number of accessible resources</p> 
     * @return AssetCount <p>Number of accessible resources</p>
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set <p>Number of accessible resources</p>
     * @param AssetCount <p>Number of accessible resources</p>
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get <p>Number of access/behavior logs</p> 
     * @return LogCount <p>Number of access/behavior logs</p>
     */
    public Long getLogCount() {
        return this.LogCount;
    }

    /**
     * Set <p>Number of access/behavior logs</p>
     * @param LogCount <p>Number of access/behavior logs</p>
     */
    public void setLogCount(Long LogCount) {
        this.LogCount = LogCount;
    }

    /**
     * Get <p>Permission configuration risk</p> 
     * @return ConfigRiskCount <p>Permission configuration risk</p>
     */
    public Long getConfigRiskCount() {
        return this.ConfigRiskCount;
    }

    /**
     * Set <p>Permission configuration risk</p>
     * @param ConfigRiskCount <p>Permission configuration risk</p>
     */
    public void setConfigRiskCount(Long ConfigRiskCount) {
        this.ConfigRiskCount = ConfigRiskCount;
    }

    /**
     * Get <p>Dangerous behavior alarm</p> 
     * @return ActionRiskCount <p>Dangerous behavior alarm</p>
     */
    public Long getActionRiskCount() {
        return this.ActionRiskCount;
    }

    /**
     * Set <p>Dangerous behavior alarm</p>
     * @param ActionRiskCount <p>Dangerous behavior alarm</p>
     */
    public void setActionRiskCount(Long ActionRiskCount) {
        this.ActionRiskCount = ActionRiskCount;
    }

    /**
     * Get <p>Whether to access operation audit log</p> 
     * @return IsAccessCloudAudit <p>Whether to access operation audit log</p>
     */
    public Boolean getIsAccessCloudAudit() {
        return this.IsAccessCloudAudit;
    }

    /**
     * Set <p>Whether to access operation audit log</p>
     * @param IsAccessCloudAudit <p>Whether to access operation audit log</p>
     */
    public void setIsAccessCloudAudit(Boolean IsAccessCloudAudit) {
        this.IsAccessCloudAudit = IsAccessCloudAudit;
    }

    /**
     * Get <p>Security check for configuration risk required or not</p> 
     * @return IsAccessCheck <p>Security check for configuration risk required or not</p>
     */
    public Boolean getIsAccessCheck() {
        return this.IsAccessCheck;
    }

    /**
     * Set <p>Security check for configuration risk required or not</p>
     * @param IsAccessCheck <p>Security check for configuration risk required or not</p>
     */
    public void setIsAccessCheck(Boolean IsAccessCheck) {
        this.IsAccessCheck = IsAccessCheck;
    }

    /**
     * Get <p>Whether configure user behavior management policy</p> 
     * @return IsAccessUeba <p>Whether configure user behavior management policy</p>
     */
    public Boolean getIsAccessUeba() {
        return this.IsAccessUeba;
    }

    /**
     * Set <p>Whether configure user behavior management policy</p>
     * @param IsAccessUeba <p>Whether configure user behavior management policy</p>
     */
    public void setIsAccessUeba(Boolean IsAccessUeba) {
        this.IsAccessUeba = IsAccessUeba;
    }

    /**
     * Get <p>Creation time (Unix timestamp).</p> 
     * @return CreateTime <p>Creation time (Unix timestamp).</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time (Unix timestamp).</p>
     * @param CreateTime <p>Creation time (Unix timestamp).</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
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
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

