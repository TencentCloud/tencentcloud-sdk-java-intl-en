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

public class DspmAssetAccessTopologyItem extends AbstractModel {

    /**
    * Asset ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Asset type
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Asset name
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * Asset account
    */
    @SerializedName("AssetAccount")
    @Expose
    private String AssetAccount;

    /**
    * Host address
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Account type.
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * Asset address
    */
    @SerializedName("AssetIp")
    @Expose
    private String AssetIp;

    /**
    * Origin ip address
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * Origin ip type
    */
    @SerializedName("SourceIpType")
    @Expose
    private String SourceIpType;

    /**
    * Access frequency (times/day)
    */
    @SerializedName("AccessFrequency")
    @Expose
    private DspmFrequency AccessFrequency;

    /**
    * SQL execution frequency. Queries/hr.
    */
    @SerializedName("ExecSQLFrequency")
    @Expose
    private DspmFrequency ExecSQLFrequency;

    /**
    * Access start time.
    */
    @SerializedName("AccessBeginTime")
    @Expose
    private String AccessBeginTime;

    /**
    * Access end time
    */
    @SerializedName("AccessEndTime")
    @Expose
    private String AccessEndTime;

    /**
    * Number of account risks
    */
    @SerializedName("AccountRisk")
    @Expose
    private Long AccountRisk;

    /**
    * Number of asset risks
    */
    @SerializedName("AssetRisk")
    @Expose
    private Long AssetRisk;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Identity type. null for non-identity accounts. 0: Undefined; 2: Long-term identity; 3: Temporary identity
    */
    @SerializedName("IdentifyType")
    @Expose
    private Long IdentifyType;

    /**
    * uin of the user belonging to the cloud account.
    */
    @SerializedName("OwnerUin")
    @Expose
    private DspmUinUser OwnerUin;

    /**
    * User information to which it belongs.
    */
    @SerializedName("Person")
    @Expose
    private DspmPersonUser Person;

    /**
    * Alarm count of the account
    */
    @SerializedName("AccountAlarm")
    @Expose
    private Long AccountAlarm;

    /**
    * Number of asset alarms
    */
    @SerializedName("AssetAlarm")
    @Expose
    private Long AssetAlarm;

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
     * Get Asset account 
     * @return AssetAccount Asset account
     */
    public String getAssetAccount() {
        return this.AssetAccount;
    }

    /**
     * Set Asset account
     * @param AssetAccount Asset account
     */
    public void setAssetAccount(String AssetAccount) {
        this.AssetAccount = AssetAccount;
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
     * Get Account type. 
     * @return AccountType Account type.
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set Account type.
     * @param AccountType Account type.
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get Asset address 
     * @return AssetIp Asset address
     */
    public String getAssetIp() {
        return this.AssetIp;
    }

    /**
     * Set Asset address
     * @param AssetIp Asset address
     */
    public void setAssetIp(String AssetIp) {
        this.AssetIp = AssetIp;
    }

    /**
     * Get Origin ip address 
     * @return SourceIp Origin ip address
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set Origin ip address
     * @param SourceIp Origin ip address
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get Origin ip type 
     * @return SourceIpType Origin ip type
     */
    public String getSourceIpType() {
        return this.SourceIpType;
    }

    /**
     * Set Origin ip type
     * @param SourceIpType Origin ip type
     */
    public void setSourceIpType(String SourceIpType) {
        this.SourceIpType = SourceIpType;
    }

    /**
     * Get Access frequency (times/day) 
     * @return AccessFrequency Access frequency (times/day)
     */
    public DspmFrequency getAccessFrequency() {
        return this.AccessFrequency;
    }

    /**
     * Set Access frequency (times/day)
     * @param AccessFrequency Access frequency (times/day)
     */
    public void setAccessFrequency(DspmFrequency AccessFrequency) {
        this.AccessFrequency = AccessFrequency;
    }

    /**
     * Get SQL execution frequency. Queries/hr. 
     * @return ExecSQLFrequency SQL execution frequency. Queries/hr.
     */
    public DspmFrequency getExecSQLFrequency() {
        return this.ExecSQLFrequency;
    }

    /**
     * Set SQL execution frequency. Queries/hr.
     * @param ExecSQLFrequency SQL execution frequency. Queries/hr.
     */
    public void setExecSQLFrequency(DspmFrequency ExecSQLFrequency) {
        this.ExecSQLFrequency = ExecSQLFrequency;
    }

    /**
     * Get Access start time. 
     * @return AccessBeginTime Access start time.
     */
    public String getAccessBeginTime() {
        return this.AccessBeginTime;
    }

    /**
     * Set Access start time.
     * @param AccessBeginTime Access start time.
     */
    public void setAccessBeginTime(String AccessBeginTime) {
        this.AccessBeginTime = AccessBeginTime;
    }

    /**
     * Get Access end time 
     * @return AccessEndTime Access end time
     */
    public String getAccessEndTime() {
        return this.AccessEndTime;
    }

    /**
     * Set Access end time
     * @param AccessEndTime Access end time
     */
    public void setAccessEndTime(String AccessEndTime) {
        this.AccessEndTime = AccessEndTime;
    }

    /**
     * Get Number of account risks 
     * @return AccountRisk Number of account risks
     */
    public Long getAccountRisk() {
        return this.AccountRisk;
    }

    /**
     * Set Number of account risks
     * @param AccountRisk Number of account risks
     */
    public void setAccountRisk(Long AccountRisk) {
        this.AccountRisk = AccountRisk;
    }

    /**
     * Get Number of asset risks 
     * @return AssetRisk Number of asset risks
     */
    public Long getAssetRisk() {
        return this.AssetRisk;
    }

    /**
     * Set Number of asset risks
     * @param AssetRisk Number of asset risks
     */
    public void setAssetRisk(Long AssetRisk) {
        this.AssetRisk = AssetRisk;
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
     * Get Identity type. null for non-identity accounts. 0: Undefined; 2: Long-term identity; 3: Temporary identity 
     * @return IdentifyType Identity type. null for non-identity accounts. 0: Undefined; 2: Long-term identity; 3: Temporary identity
     */
    public Long getIdentifyType() {
        return this.IdentifyType;
    }

    /**
     * Set Identity type. null for non-identity accounts. 0: Undefined; 2: Long-term identity; 3: Temporary identity
     * @param IdentifyType Identity type. null for non-identity accounts. 0: Undefined; 2: Long-term identity; 3: Temporary identity
     */
    public void setIdentifyType(Long IdentifyType) {
        this.IdentifyType = IdentifyType;
    }

    /**
     * Get uin of the user belonging to the cloud account. 
     * @return OwnerUin uin of the user belonging to the cloud account.
     */
    public DspmUinUser getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set uin of the user belonging to the cloud account.
     * @param OwnerUin uin of the user belonging to the cloud account.
     */
    public void setOwnerUin(DspmUinUser OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get User information to which it belongs. 
     * @return Person User information to which it belongs.
     */
    public DspmPersonUser getPerson() {
        return this.Person;
    }

    /**
     * Set User information to which it belongs.
     * @param Person User information to which it belongs.
     */
    public void setPerson(DspmPersonUser Person) {
        this.Person = Person;
    }

    /**
     * Get Alarm count of the account 
     * @return AccountAlarm Alarm count of the account
     */
    public Long getAccountAlarm() {
        return this.AccountAlarm;
    }

    /**
     * Set Alarm count of the account
     * @param AccountAlarm Alarm count of the account
     */
    public void setAccountAlarm(Long AccountAlarm) {
        this.AccountAlarm = AccountAlarm;
    }

    /**
     * Get Number of asset alarms 
     * @return AssetAlarm Number of asset alarms
     */
    public Long getAssetAlarm() {
        return this.AssetAlarm;
    }

    /**
     * Set Number of asset alarms
     * @param AssetAlarm Number of asset alarms
     */
    public void setAssetAlarm(Long AssetAlarm) {
        this.AssetAlarm = AssetAlarm;
    }

    public DspmAssetAccessTopologyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetAccessTopologyItem(DspmAssetAccessTopologyItem source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetAccount != null) {
            this.AssetAccount = new String(source.AssetAccount);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.AssetIp != null) {
            this.AssetIp = new String(source.AssetIp);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.SourceIpType != null) {
            this.SourceIpType = new String(source.SourceIpType);
        }
        if (source.AccessFrequency != null) {
            this.AccessFrequency = new DspmFrequency(source.AccessFrequency);
        }
        if (source.ExecSQLFrequency != null) {
            this.ExecSQLFrequency = new DspmFrequency(source.ExecSQLFrequency);
        }
        if (source.AccessBeginTime != null) {
            this.AccessBeginTime = new String(source.AccessBeginTime);
        }
        if (source.AccessEndTime != null) {
            this.AccessEndTime = new String(source.AccessEndTime);
        }
        if (source.AccountRisk != null) {
            this.AccountRisk = new Long(source.AccountRisk);
        }
        if (source.AssetRisk != null) {
            this.AssetRisk = new Long(source.AssetRisk);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
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
        if (source.AccountAlarm != null) {
            this.AccountAlarm = new Long(source.AccountAlarm);
        }
        if (source.AssetAlarm != null) {
            this.AssetAlarm = new Long(source.AssetAlarm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetAccount", this.AssetAccount);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "AssetIp", this.AssetIp);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "SourceIpType", this.SourceIpType);
        this.setParamObj(map, prefix + "AccessFrequency.", this.AccessFrequency);
        this.setParamObj(map, prefix + "ExecSQLFrequency.", this.ExecSQLFrequency);
        this.setParamSimple(map, prefix + "AccessBeginTime", this.AccessBeginTime);
        this.setParamSimple(map, prefix + "AccessEndTime", this.AccessEndTime);
        this.setParamSimple(map, prefix + "AccountRisk", this.AccountRisk);
        this.setParamSimple(map, prefix + "AssetRisk", this.AssetRisk);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "IdentifyType", this.IdentifyType);
        this.setParamObj(map, prefix + "OwnerUin.", this.OwnerUin);
        this.setParamObj(map, prefix + "Person.", this.Person);
        this.setParamSimple(map, prefix + "AccountAlarm", this.AccountAlarm);
        this.setParamSimple(map, prefix + "AssetAlarm", this.AssetAlarm);

    }
}

