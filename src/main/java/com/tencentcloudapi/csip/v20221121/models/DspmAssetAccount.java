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

public class DspmAssetAccount extends AbstractModel {

    /**
    * Account name.
    */
    @SerializedName("Account")
    @Expose
    private String Account;

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
    * Associated object. uin or personal id.
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * Permission information
    */
    @SerializedName("Privilege")
    @Expose
    private DspmDbAccountPrivilege Privilege;

    /**
    * Status. 0: inactive, 1: active, 2: deleted
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
    * Asset ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Whether it is a new account
    */
    @SerializedName("IsNewAccount")
    @Expose
    private Long IsNewAccount;

    /**
    * Identity type. null for non-identity accounts. 0-Undefined 2-Long-term identity 3-Temporary identity
    */
    @SerializedName("IdentifyType")
    @Expose
    private Long IdentifyType;

    /**
    * The user that the cloud account uin belongs to.
    */
    @SerializedName("OwnerUin")
    @Expose
    private DspmUinUser OwnerUin;

    /**
    * Information about the personal user it belongs to.
    */
    @SerializedName("Person")
    @Expose
    private DspmPersonUser Person;

    /**
    * Risk statistical information
    */
    @SerializedName("RiskCount")
    @Expose
    private DspmRiskCount RiskCount;

    /**
    * Preset permission.
    */
    @SerializedName("PresetPrivilege")
    @Expose
    private DspmDbAccountPrivilege PresetPrivilege;

    /**
     * Get Account name. 
     * @return Account Account name.
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set Account name.
     * @param Account Account name.
     */
    public void setAccount(String Account) {
        this.Account = Account;
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
     * Get Associated object. uin or personal id. 
     * @return Subject Associated object. uin or personal id.
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set Associated object. uin or personal id.
     * @param Subject Associated object. uin or personal id.
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
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
     * Get Status. 0: inactive, 1: active, 2: deleted 
     * @return Status Status. 0: inactive, 1: active, 2: deleted
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: inactive, 1: active, 2: deleted
     * @param Status Status. 0: inactive, 1: active, 2: deleted
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
     * Get Whether it is a new account 
     * @return IsNewAccount Whether it is a new account
     */
    public Long getIsNewAccount() {
        return this.IsNewAccount;
    }

    /**
     * Set Whether it is a new account
     * @param IsNewAccount Whether it is a new account
     */
    public void setIsNewAccount(Long IsNewAccount) {
        this.IsNewAccount = IsNewAccount;
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

    public DspmAssetAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetAccount(DspmAssetAccount source) {
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
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
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.IsNewAccount != null) {
            this.IsNewAccount = new Long(source.IsNewAccount);
        }
        if (source.IdentifyType != null) {
            this.IdentifyType = new Long(source.IdentifyType);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new DspmUinUser(source.OwnerUin);
        }
        if (source.Person != null) {
            this.Person = new DspmPersonUser(source.Person);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new DspmRiskCount(source.RiskCount);
        }
        if (source.PresetPrivilege != null) {
            this.PresetPrivilege = new DspmDbAccountPrivilege(source.PresetPrivilege);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamObj(map, prefix + "Privilege.", this.Privilege);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ValidateFrom", this.ValidateFrom);
        this.setParamSimple(map, prefix + "ValidateTo", this.ValidateTo);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "IsNewAccount", this.IsNewAccount);
        this.setParamSimple(map, prefix + "IdentifyType", this.IdentifyType);
        this.setParamObj(map, prefix + "OwnerUin.", this.OwnerUin);
        this.setParamObj(map, prefix + "Person.", this.Person);
        this.setParamObj(map, prefix + "RiskCount.", this.RiskCount);
        this.setParamObj(map, prefix + "PresetPrivilege.", this.PresetPrivilege);

    }
}

