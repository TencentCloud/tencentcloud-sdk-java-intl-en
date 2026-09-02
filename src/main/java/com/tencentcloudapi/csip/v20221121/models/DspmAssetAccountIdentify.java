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

public class DspmAssetAccountIdentify extends AbstractModel {

    /**
    * Asset ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * The user that the cloud account uin belongs to.
    */
    @SerializedName("OwnerUin")
    @Expose
    private DspmUinUser OwnerUin;

    /**
    * Administrator or Not
    */
    @SerializedName("IsManager")
    @Expose
    private Long IsManager;

    /**
    * Host address
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Account type. 0-Undefined 1-Service account 2-Personal account 3-Temporary account
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * Permission information
    */
    @SerializedName("Privilege")
    @Expose
    private DspmDbAccountPrivilege Privilege;

    /**
    * Active status. 0: inactive, 1: active.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Account creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Access permission effective time.
    */
    @SerializedName("ValidateFrom")
    @Expose
    private String ValidateFrom;

    /**
    * Access privilege expiration time.
    */
    @SerializedName("ValidateTo")
    @Expose
    private String ValidateTo;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Number of visitor permission applications
    */
    @SerializedName("PersonApplyCount")
    @Expose
    private Long PersonApplyCount;

    /**
    * Asset name
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * Asset type
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Risk statistical information
    */
    @SerializedName("RiskCount")
    @Expose
    private DspmRiskCount RiskCount;

    /**
    * Identity type. null for non-identity accounts. 0-Undefined 2-Long-term identity 3-Temporary identity
    */
    @SerializedName("IdentifyType")
    @Expose
    private Long IdentifyType;

    /**
    * Information about the personal user it belongs to.
    */
    @SerializedName("Person")
    @Expose
    private DspmPersonUser Person;

    /**
    * The user that the creator account uin belongs to.
    */
    @SerializedName("CreatorUin")
    @Expose
    private DspmUinUser CreatorUin;

    /**
    * Preset permission.
    */
    @SerializedName("PresetPrivilege")
    @Expose
    private DspmDbAccountPrivilege PresetPrivilege;

    /**
    * Intranet access address. If there are multiple, separate them with ';'.
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * Identity ID
    */
    @SerializedName("IdentifyId")
    @Expose
    private String IdentifyId;

    /**
    * app id of the account associated with the asset
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Account nickname
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * Asset account uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
     * Get Asset ID 
     * @return AssetId Asset ID
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset ID
     * @param AssetId Asset ID
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get The user that the cloud account uin belongs to. 
     * @return OwnerUin The user that the cloud account uin belongs to.
     */
    public DspmUinUser getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set The user that the cloud account uin belongs to.
     * @param OwnerUin The user that the cloud account uin belongs to.
     */
    public void setOwnerUin(DspmUinUser OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Administrator or Not 
     * @return IsManager Administrator or Not
     */
    public Long getIsManager() {
        return this.IsManager;
    }

    /**
     * Set Administrator or Not
     * @param IsManager Administrator or Not
     */
    public void setIsManager(Long IsManager) {
        this.IsManager = IsManager;
    }

    /**
     * Get Host address 
     * @return Host Host address
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host address
     * @param Host Host address
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Account type. 0-Undefined 1-Service account 2-Personal account 3-Temporary account 
     * @return AccountType Account type. 0-Undefined 1-Service account 2-Personal account 3-Temporary account
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set Account type. 0-Undefined 1-Service account 2-Personal account 3-Temporary account
     * @param AccountType Account type. 0-Undefined 1-Service account 2-Personal account 3-Temporary account
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get Permission information 
     * @return Privilege Permission information
     */
    public DspmDbAccountPrivilege getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set Permission information
     * @param Privilege Permission information
     */
    public void setPrivilege(DspmDbAccountPrivilege Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get Active status. 0: inactive, 1: active. 
     * @return Status Active status. 0: inactive, 1: active.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Active status. 0: inactive, 1: active.
     * @param Status Active status. 0: inactive, 1: active.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Account creation time. 
     * @return CreateTime Account creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Account creation time.
     * @param CreateTime Account creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Access permission effective time. 
     * @return ValidateFrom Access permission effective time.
     */
    public String getValidateFrom() {
        return this.ValidateFrom;
    }

    /**
     * Set Access permission effective time.
     * @param ValidateFrom Access permission effective time.
     */
    public void setValidateFrom(String ValidateFrom) {
        this.ValidateFrom = ValidateFrom;
    }

    /**
     * Get Access privilege expiration time. 
     * @return ValidateTo Access privilege expiration time.
     */
    public String getValidateTo() {
        return this.ValidateTo;
    }

    /**
     * Set Access privilege expiration time.
     * @param ValidateTo Access privilege expiration time.
     */
    public void setValidateTo(String ValidateTo) {
        this.ValidateTo = ValidateTo;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Number of visitor permission applications 
     * @return PersonApplyCount Number of visitor permission applications
     */
    public Long getPersonApplyCount() {
        return this.PersonApplyCount;
    }

    /**
     * Set Number of visitor permission applications
     * @param PersonApplyCount Number of visitor permission applications
     */
    public void setPersonApplyCount(Long PersonApplyCount) {
        this.PersonApplyCount = PersonApplyCount;
    }

    /**
     * Get Asset name 
     * @return AssetName Asset name
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set Asset name
     * @param AssetName Asset name
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get Asset type 
     * @return AssetType Asset type
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
     * @param AssetType Asset type
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Risk statistical information 
     * @return RiskCount Risk statistical information
     */
    public DspmRiskCount getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set Risk statistical information
     * @param RiskCount Risk statistical information
     */
    public void setRiskCount(DspmRiskCount RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get Identity type. null for non-identity accounts. 0-Undefined 2-Long-term identity 3-Temporary identity 
     * @return IdentifyType Identity type. null for non-identity accounts. 0-Undefined 2-Long-term identity 3-Temporary identity
     */
    public Long getIdentifyType() {
        return this.IdentifyType;
    }

    /**
     * Set Identity type. null for non-identity accounts. 0-Undefined 2-Long-term identity 3-Temporary identity
     * @param IdentifyType Identity type. null for non-identity accounts. 0-Undefined 2-Long-term identity 3-Temporary identity
     */
    public void setIdentifyType(Long IdentifyType) {
        this.IdentifyType = IdentifyType;
    }

    /**
     * Get Information about the personal user it belongs to. 
     * @return Person Information about the personal user it belongs to.
     */
    public DspmPersonUser getPerson() {
        return this.Person;
    }

    /**
     * Set Information about the personal user it belongs to.
     * @param Person Information about the personal user it belongs to.
     */
    public void setPerson(DspmPersonUser Person) {
        this.Person = Person;
    }

    /**
     * Get The user that the creator account uin belongs to. 
     * @return CreatorUin The user that the creator account uin belongs to.
     */
    public DspmUinUser getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set The user that the creator account uin belongs to.
     * @param CreatorUin The user that the creator account uin belongs to.
     */
    public void setCreatorUin(DspmUinUser CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get Preset permission. 
     * @return PresetPrivilege Preset permission.
     */
    public DspmDbAccountPrivilege getPresetPrivilege() {
        return this.PresetPrivilege;
    }

    /**
     * Set Preset permission.
     * @param PresetPrivilege Preset permission.
     */
    public void setPresetPrivilege(DspmDbAccountPrivilege PresetPrivilege) {
        this.PresetPrivilege = PresetPrivilege;
    }

    /**
     * Get Intranet access address. If there are multiple, separate them with ';'. 
     * @return PrivateIp Intranet access address. If there are multiple, separate them with ';'.
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Intranet access address. If there are multiple, separate them with ';'.
     * @param PrivateIp Intranet access address. If there are multiple, separate them with ';'.
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get Identity ID 
     * @return IdentifyId Identity ID
     */
    public String getIdentifyId() {
        return this.IdentifyId;
    }

    /**
     * Set Identity ID
     * @param IdentifyId Identity ID
     */
    public void setIdentifyId(String IdentifyId) {
        this.IdentifyId = IdentifyId;
    }

    /**
     * Get app id of the account associated with the asset 
     * @return AppId app id of the account associated with the asset
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set app id of the account associated with the asset
     * @param AppId app id of the account associated with the asset
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Account nickname 
     * @return NickName Account nickname
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Account nickname
     * @param NickName Account nickname
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get Asset account uin 
     * @return Uin Asset account uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Asset account uin
     * @param Uin Asset account uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    public DspmAssetAccountIdentify() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetAccountIdentify(DspmAssetAccountIdentify source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new DspmUinUser(source.OwnerUin);
        }
        if (source.IsManager != null) {
            this.IsManager = new Long(source.IsManager);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.Privilege != null) {
            this.Privilege = new DspmDbAccountPrivilege(source.Privilege);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ValidateFrom != null) {
            this.ValidateFrom = new String(source.ValidateFrom);
        }
        if (source.ValidateTo != null) {
            this.ValidateTo = new String(source.ValidateTo);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PersonApplyCount != null) {
            this.PersonApplyCount = new Long(source.PersonApplyCount);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new DspmRiskCount(source.RiskCount);
        }
        if (source.IdentifyType != null) {
            this.IdentifyType = new Long(source.IdentifyType);
        }
        if (source.Person != null) {
            this.Person = new DspmPersonUser(source.Person);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new DspmUinUser(source.CreatorUin);
        }
        if (source.PresetPrivilege != null) {
            this.PresetPrivilege = new DspmDbAccountPrivilege(source.PresetPrivilege);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.IdentifyId != null) {
            this.IdentifyId = new String(source.IdentifyId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamObj(map, prefix + "OwnerUin.", this.OwnerUin);
        this.setParamSimple(map, prefix + "IsManager", this.IsManager);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamObj(map, prefix + "Privilege.", this.Privilege);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ValidateFrom", this.ValidateFrom);
        this.setParamSimple(map, prefix + "ValidateTo", this.ValidateTo);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PersonApplyCount", this.PersonApplyCount);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamObj(map, prefix + "RiskCount.", this.RiskCount);
        this.setParamSimple(map, prefix + "IdentifyType", this.IdentifyType);
        this.setParamObj(map, prefix + "Person.", this.Person);
        this.setParamObj(map, prefix + "CreatorUin.", this.CreatorUin);
        this.setParamObj(map, prefix + "PresetPrivilege.", this.PresetPrivilege);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "IdentifyId", this.IdentifyId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

