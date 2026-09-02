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

public class DspmRisk extends AbstractModel {

    /**
    * <p>Risk id</p>
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
    * <p>Risk name</p>
    */
    @SerializedName("RiskName")
    @Expose
    private String RiskName;

    /**
    * <p>Risk English name</p>
    */
    @SerializedName("RiskNameEn")
    @Expose
    private String RiskNameEn;

    /**
    * <p>Policy type</p>
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * <p>Policy category</p>
    */
    @SerializedName("StrategyCategory")
    @Expose
    private String StrategyCategory;

    /**
    * <p>Risk level.</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>Asset instance Id</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>Asset type</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>Asset name</p>
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * <p>Region.</p>
    */
    @SerializedName("AssetRegion")
    @Expose
    private String AssetRegion;

    /**
    * <p>Asset account</p>
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * <p>Host address</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>Account type</p>
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * <p>Risk detection time</p>
    */
    @SerializedName("DetectTime")
    @Expose
    private String DetectTime;

    /**
    * <p>Processing status. 0: unprocessed; 1: processed; 2: ignored</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Identity id</p>
    */
    @SerializedName("IdentifyId")
    @Expose
    private String IdentifyId;

    /**
    * <p>User belonging to cloud account uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private DspmUinUser OwnerUin;

    /**
    * <p>Belongs to individual user information</p>
    */
    @SerializedName("Person")
    @Expose
    private DspmPersonUser Person;

    /**
    * <p>Risk data.</p>
    */
    @SerializedName("RiskData")
    @Expose
    private String RiskData;

    /**
    * <p>Whether the user is an asset administrator</p>
    */
    @SerializedName("IsAssetManager")
    @Expose
    private Long IsAssetManager;

    /**
    * <p>Data start time</p>
    */
    @SerializedName("DataBeginTime")
    @Expose
    private String DataBeginTime;

    /**
    * <p>Data end time</p>
    */
    @SerializedName("DataEndTime")
    @Expose
    private String DataEndTime;

    /**
    * <p>Risk type. risk: Risk; alarm: Alarm.</p>
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * <p>app id of the asset ownership account</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Account nickname</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>uin of the account to which the asset belongs</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>Cluster type of MongoDb. For non-MongoDb assets, fixed to 0.</p><p>Enumeration values:</p><ul><li>0: replica set</li><li>1: sharding</li></ul><p>Default value: 0</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get <p>Risk id</p> 
     * @return RiskId <p>Risk id</p>
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set <p>Risk id</p>
     * @param RiskId <p>Risk id</p>
     */
    public void setRiskId(String RiskId) {
        this.RiskId = RiskId;
    }

    /**
     * Get <p>Risk name</p> 
     * @return RiskName <p>Risk name</p>
     */
    public String getRiskName() {
        return this.RiskName;
    }

    /**
     * Set <p>Risk name</p>
     * @param RiskName <p>Risk name</p>
     */
    public void setRiskName(String RiskName) {
        this.RiskName = RiskName;
    }

    /**
     * Get <p>Risk English name</p> 
     * @return RiskNameEn <p>Risk English name</p>
     */
    public String getRiskNameEn() {
        return this.RiskNameEn;
    }

    /**
     * Set <p>Risk English name</p>
     * @param RiskNameEn <p>Risk English name</p>
     */
    public void setRiskNameEn(String RiskNameEn) {
        this.RiskNameEn = RiskNameEn;
    }

    /**
     * Get <p>Policy type</p> 
     * @return StrategyType <p>Policy type</p>
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set <p>Policy type</p>
     * @param StrategyType <p>Policy type</p>
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get <p>Policy category</p> 
     * @return StrategyCategory <p>Policy category</p>
     */
    public String getStrategyCategory() {
        return this.StrategyCategory;
    }

    /**
     * Set <p>Policy category</p>
     * @param StrategyCategory <p>Policy category</p>
     */
    public void setStrategyCategory(String StrategyCategory) {
        this.StrategyCategory = StrategyCategory;
    }

    /**
     * Get <p>Risk level.</p> 
     * @return RiskLevel <p>Risk level.</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Risk level.</p>
     * @param RiskLevel <p>Risk level.</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>Asset instance Id</p> 
     * @return AssetId <p>Asset instance Id</p>
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>Asset instance Id</p>
     * @param AssetId <p>Asset instance Id</p>
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>Asset type</p> 
     * @return AssetType <p>Asset type</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>Asset type</p>
     * @param AssetType <p>Asset type</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>Asset name</p> 
     * @return AssetName <p>Asset name</p>
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set <p>Asset name</p>
     * @param AssetName <p>Asset name</p>
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get <p>Region.</p> 
     * @return AssetRegion <p>Region.</p>
     */
    public String getAssetRegion() {
        return this.AssetRegion;
    }

    /**
     * Set <p>Region.</p>
     * @param AssetRegion <p>Region.</p>
     */
    public void setAssetRegion(String AssetRegion) {
        this.AssetRegion = AssetRegion;
    }

    /**
     * Get <p>Asset account</p> 
     * @return Account <p>Asset account</p>
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set <p>Asset account</p>
     * @param Account <p>Asset account</p>
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get <p>Host address</p> 
     * @return Host <p>Host address</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>Host address</p>
     * @param Host <p>Host address</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>Account type</p> 
     * @return AccountType <p>Account type</p>
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set <p>Account type</p>
     * @param AccountType <p>Account type</p>
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get <p>Risk detection time</p> 
     * @return DetectTime <p>Risk detection time</p>
     */
    public String getDetectTime() {
        return this.DetectTime;
    }

    /**
     * Set <p>Risk detection time</p>
     * @param DetectTime <p>Risk detection time</p>
     */
    public void setDetectTime(String DetectTime) {
        this.DetectTime = DetectTime;
    }

    /**
     * Get <p>Processing status. 0: unprocessed; 1: processed; 2: ignored</p> 
     * @return Status <p>Processing status. 0: unprocessed; 1: processed; 2: ignored</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Processing status. 0: unprocessed; 1: processed; 2: ignored</p>
     * @param Status <p>Processing status. 0: unprocessed; 1: processed; 2: ignored</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Identity id</p> 
     * @return IdentifyId <p>Identity id</p>
     */
    public String getIdentifyId() {
        return this.IdentifyId;
    }

    /**
     * Set <p>Identity id</p>
     * @param IdentifyId <p>Identity id</p>
     */
    public void setIdentifyId(String IdentifyId) {
        this.IdentifyId = IdentifyId;
    }

    /**
     * Get <p>User belonging to cloud account uin</p> 
     * @return OwnerUin <p>User belonging to cloud account uin</p>
     */
    public DspmUinUser getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>User belonging to cloud account uin</p>
     * @param OwnerUin <p>User belonging to cloud account uin</p>
     */
    public void setOwnerUin(DspmUinUser OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>Belongs to individual user information</p> 
     * @return Person <p>Belongs to individual user information</p>
     */
    public DspmPersonUser getPerson() {
        return this.Person;
    }

    /**
     * Set <p>Belongs to individual user information</p>
     * @param Person <p>Belongs to individual user information</p>
     */
    public void setPerson(DspmPersonUser Person) {
        this.Person = Person;
    }

    /**
     * Get <p>Risk data.</p> 
     * @return RiskData <p>Risk data.</p>
     */
    public String getRiskData() {
        return this.RiskData;
    }

    /**
     * Set <p>Risk data.</p>
     * @param RiskData <p>Risk data.</p>
     */
    public void setRiskData(String RiskData) {
        this.RiskData = RiskData;
    }

    /**
     * Get <p>Whether the user is an asset administrator</p> 
     * @return IsAssetManager <p>Whether the user is an asset administrator</p>
     */
    public Long getIsAssetManager() {
        return this.IsAssetManager;
    }

    /**
     * Set <p>Whether the user is an asset administrator</p>
     * @param IsAssetManager <p>Whether the user is an asset administrator</p>
     */
    public void setIsAssetManager(Long IsAssetManager) {
        this.IsAssetManager = IsAssetManager;
    }

    /**
     * Get <p>Data start time</p> 
     * @return DataBeginTime <p>Data start time</p>
     */
    public String getDataBeginTime() {
        return this.DataBeginTime;
    }

    /**
     * Set <p>Data start time</p>
     * @param DataBeginTime <p>Data start time</p>
     */
    public void setDataBeginTime(String DataBeginTime) {
        this.DataBeginTime = DataBeginTime;
    }

    /**
     * Get <p>Data end time</p> 
     * @return DataEndTime <p>Data end time</p>
     */
    public String getDataEndTime() {
        return this.DataEndTime;
    }

    /**
     * Set <p>Data end time</p>
     * @param DataEndTime <p>Data end time</p>
     */
    public void setDataEndTime(String DataEndTime) {
        this.DataEndTime = DataEndTime;
    }

    /**
     * Get <p>Risk type. risk: Risk; alarm: Alarm.</p> 
     * @return RiskType <p>Risk type. risk: Risk; alarm: Alarm.</p>
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set <p>Risk type. risk: Risk; alarm: Alarm.</p>
     * @param RiskType <p>Risk type. risk: Risk; alarm: Alarm.</p>
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get <p>app id of the asset ownership account</p> 
     * @return AppId <p>app id of the asset ownership account</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>app id of the asset ownership account</p>
     * @param AppId <p>app id of the asset ownership account</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Account nickname</p> 
     * @return NickName <p>Account nickname</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>Account nickname</p>
     * @param NickName <p>Account nickname</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>uin of the account to which the asset belongs</p> 
     * @return Uin <p>uin of the account to which the asset belongs</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>uin of the account to which the asset belongs</p>
     * @param Uin <p>uin of the account to which the asset belongs</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>Cluster type of MongoDb. For non-MongoDb assets, fixed to 0.</p><p>Enumeration values:</p><ul><li>0: replica set</li><li>1: sharding</li></ul><p>Default value: 0</p> 
     * @return ClusterType <p>Cluster type of MongoDb. For non-MongoDb assets, fixed to 0.</p><p>Enumeration values:</p><ul><li>0: replica set</li><li>1: sharding</li></ul><p>Default value: 0</p>
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>Cluster type of MongoDb. For non-MongoDb assets, fixed to 0.</p><p>Enumeration values:</p><ul><li>0: replica set</li><li>1: sharding</li></ul><p>Default value: 0</p>
     * @param ClusterType <p>Cluster type of MongoDb. For non-MongoDb assets, fixed to 0.</p><p>Enumeration values:</p><ul><li>0: replica set</li><li>1: sharding</li></ul><p>Default value: 0</p>
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Cluster name.</p> 
     * @return ClusterName <p>Cluster name.</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name.</p>
     * @param ClusterName <p>Cluster name.</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    public DspmRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmRisk(DspmRisk source) {
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
        }
        if (source.RiskName != null) {
            this.RiskName = new String(source.RiskName);
        }
        if (source.RiskNameEn != null) {
            this.RiskNameEn = new String(source.RiskNameEn);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.StrategyCategory != null) {
            this.StrategyCategory = new String(source.StrategyCategory);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetRegion != null) {
            this.AssetRegion = new String(source.AssetRegion);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.DetectTime != null) {
            this.DetectTime = new String(source.DetectTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IdentifyId != null) {
            this.IdentifyId = new String(source.IdentifyId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new DspmUinUser(source.OwnerUin);
        }
        if (source.Person != null) {
            this.Person = new DspmPersonUser(source.Person);
        }
        if (source.RiskData != null) {
            this.RiskData = new String(source.RiskData);
        }
        if (source.IsAssetManager != null) {
            this.IsAssetManager = new Long(source.IsAssetManager);
        }
        if (source.DataBeginTime != null) {
            this.DataBeginTime = new String(source.DataBeginTime);
        }
        if (source.DataEndTime != null) {
            this.DataEndTime = new String(source.DataEndTime);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
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
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "RiskName", this.RiskName);
        this.setParamSimple(map, prefix + "RiskNameEn", this.RiskNameEn);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "StrategyCategory", this.StrategyCategory);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetRegion", this.AssetRegion);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "DetectTime", this.DetectTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IdentifyId", this.IdentifyId);
        this.setParamObj(map, prefix + "OwnerUin.", this.OwnerUin);
        this.setParamObj(map, prefix + "Person.", this.Person);
        this.setParamSimple(map, prefix + "RiskData", this.RiskData);
        this.setParamSimple(map, prefix + "IsAssetManager", this.IsAssetManager);
        this.setParamSimple(map, prefix + "DataBeginTime", this.DataBeginTime);
        this.setParamSimple(map, prefix + "DataEndTime", this.DataEndTime);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

