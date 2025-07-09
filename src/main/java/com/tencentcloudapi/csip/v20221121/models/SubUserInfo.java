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
    * 
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 
    */
    @SerializedName("AppID")
    @Expose
    private String AppID;

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
    @SerializedName("OwnerAppID")
    @Expose
    private String OwnerAppID;

    /**
    * 
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 
    */
    @SerializedName("OwnerNickName")
    @Expose
    private String OwnerNickName;

    /**
    * 
    */
    @SerializedName("OwnerMemberID")
    @Expose
    private String OwnerMemberID;

    /**
    * 
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * 
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * 
    */
    @SerializedName("InterfaceCount")
    @Expose
    private Long InterfaceCount;

    /**
    * 
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * 
    */
    @SerializedName("LogCount")
    @Expose
    private Long LogCount;

    /**
    * 
    */
    @SerializedName("ConfigRiskCount")
    @Expose
    private Long ConfigRiskCount;

    /**
    * 
    */
    @SerializedName("ActionRiskCount")
    @Expose
    private Long ActionRiskCount;

    /**
    * 
    */
    @SerializedName("IsAccessCloudAudit")
    @Expose
    private Boolean IsAccessCloudAudit;

    /**
    * 
    */
    @SerializedName("IsAccessCheck")
    @Expose
    private Boolean IsAccessCheck;

    /**
    * 
    */
    @SerializedName("IsAccessUeba")
    @Expose
    private Boolean IsAccessUeba;

    /**
     * Get  
     * @return ID 
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 
     * @param ID 
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get  
     * @return AppID 
     */
    public String getAppID() {
        return this.AppID;
    }

    /**
     * Set 
     * @param AppID 
     */
    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

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
     * @return OwnerAppID 
     */
    public String getOwnerAppID() {
        return this.OwnerAppID;
    }

    /**
     * Set 
     * @param OwnerAppID 
     */
    public void setOwnerAppID(String OwnerAppID) {
        this.OwnerAppID = OwnerAppID;
    }

    /**
     * Get  
     * @return OwnerUin 
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 
     * @param OwnerUin 
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get  
     * @return OwnerNickName 
     */
    public String getOwnerNickName() {
        return this.OwnerNickName;
    }

    /**
     * Set 
     * @param OwnerNickName 
     */
    public void setOwnerNickName(String OwnerNickName) {
        this.OwnerNickName = OwnerNickName;
    }

    /**
     * Get  
     * @return OwnerMemberID 
     */
    public String getOwnerMemberID() {
        return this.OwnerMemberID;
    }

    /**
     * Set 
     * @param OwnerMemberID 
     */
    public void setOwnerMemberID(String OwnerMemberID) {
        this.OwnerMemberID = OwnerMemberID;
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
     * @return ServiceCount 
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set 
     * @param ServiceCount 
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get  
     * @return InterfaceCount 
     */
    public Long getInterfaceCount() {
        return this.InterfaceCount;
    }

    /**
     * Set 
     * @param InterfaceCount 
     */
    public void setInterfaceCount(Long InterfaceCount) {
        this.InterfaceCount = InterfaceCount;
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
     * @return LogCount 
     */
    public Long getLogCount() {
        return this.LogCount;
    }

    /**
     * Set 
     * @param LogCount 
     */
    public void setLogCount(Long LogCount) {
        this.LogCount = LogCount;
    }

    /**
     * Get  
     * @return ConfigRiskCount 
     */
    public Long getConfigRiskCount() {
        return this.ConfigRiskCount;
    }

    /**
     * Set 
     * @param ConfigRiskCount 
     */
    public void setConfigRiskCount(Long ConfigRiskCount) {
        this.ConfigRiskCount = ConfigRiskCount;
    }

    /**
     * Get  
     * @return ActionRiskCount 
     */
    public Long getActionRiskCount() {
        return this.ActionRiskCount;
    }

    /**
     * Set 
     * @param ActionRiskCount 
     */
    public void setActionRiskCount(Long ActionRiskCount) {
        this.ActionRiskCount = ActionRiskCount;
    }

    /**
     * Get  
     * @return IsAccessCloudAudit 
     */
    public Boolean getIsAccessCloudAudit() {
        return this.IsAccessCloudAudit;
    }

    /**
     * Set 
     * @param IsAccessCloudAudit 
     */
    public void setIsAccessCloudAudit(Boolean IsAccessCloudAudit) {
        this.IsAccessCloudAudit = IsAccessCloudAudit;
    }

    /**
     * Get  
     * @return IsAccessCheck 
     */
    public Boolean getIsAccessCheck() {
        return this.IsAccessCheck;
    }

    /**
     * Set 
     * @param IsAccessCheck 
     */
    public void setIsAccessCheck(Boolean IsAccessCheck) {
        this.IsAccessCheck = IsAccessCheck;
    }

    /**
     * Get  
     * @return IsAccessUeba 
     */
    public Boolean getIsAccessUeba() {
        return this.IsAccessUeba;
    }

    /**
     * Set 
     * @param IsAccessUeba 
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

