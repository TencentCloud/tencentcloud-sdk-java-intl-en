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

public class PublicAssetInfo extends AbstractModel {

    /**
    * <p>Tenant ID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>Cloud service provider</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>Cloud vendor name.</p>
    */
    @SerializedName("ProviderName")
    @Expose
    private String ProviderName;

    /**
    * <p>Cloud Account ID</p>
    */
    @SerializedName("CloudAccountID")
    @Expose
    private String CloudAccountID;

    /**
    * <p>Cloud account name</p>
    */
    @SerializedName("CloudAccountName")
    @Expose
    private String CloudAccountName;

    /**
    * <p>Asset ID.</p>
    */
    @SerializedName("AssetID")
    @Expose
    private String AssetID;

    /**
    * <p>Asset name</p>
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * <p>Asset type</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>Asset type name</p>
    */
    @SerializedName("AssetTypeName")
    @Expose
    private String AssetTypeName;

    /**
    * <p>Asset tag.</p>
    */
    @SerializedName("Tags")
    @Expose
    private AssetTag [] Tags;

    /**
    * <p>Public network address</p>
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>Public address type</p>
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * <p>Resolution address</p>
    */
    @SerializedName("ResolvedAddress")
    @Expose
    private String [] ResolvedAddress;

    /**
    * <p>Region.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Protection status</p>
    */
    @SerializedName("ProtectStatus")
    @Expose
    private Long ProtectStatus;

    /**
    * <p>Number of risks</p>
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * <p>Number of alarms.</p>
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
    * <p>Instance creation time</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>First sync time</p>
    */
    @SerializedName("FirstSyncTime")
    @Expose
    private String FirstSyncTime;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Total number of severe risks</p>
    */
    @SerializedName("CriticalRiskCount")
    @Expose
    private Long CriticalRiskCount;

    /**
    * <p>Total number of high risks</p>
    */
    @SerializedName("HighRiskCount")
    @Expose
    private Long HighRiskCount;

    /**
    * <p>Total number of medium risks</p>
    */
    @SerializedName("MediumRiskCount")
    @Expose
    private Long MediumRiskCount;

    /**
    * <p>Total number of low risks</p>
    */
    @SerializedName("LowRiskCount")
    @Expose
    private Long LowRiskCount;

    /**
    * <p>Unique asset ID</p>
    */
    @SerializedName("AssetRID")
    @Expose
    private String AssetRID;

    /**
    * <p>CSC tag</p>
    */
    @SerializedName("CustomTags")
    @Expose
    private CustomTag [] CustomTags;

    /**
    * <p>Asset type icon</p>
    */
    @SerializedName("AssetTypeIconURL")
    @Expose
    private String AssetTypeIconURL;

    /**
     * Get <p>Tenant ID</p> 
     * @return AppID <p>Tenant ID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>Tenant ID</p>
     * @param AppID <p>Tenant ID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>Cloud service provider</p> 
     * @return Provider <p>Cloud service provider</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>Cloud service provider</p>
     * @param Provider <p>Cloud service provider</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>Cloud vendor name.</p> 
     * @return ProviderName <p>Cloud vendor name.</p>
     */
    public String getProviderName() {
        return this.ProviderName;
    }

    /**
     * Set <p>Cloud vendor name.</p>
     * @param ProviderName <p>Cloud vendor name.</p>
     */
    public void setProviderName(String ProviderName) {
        this.ProviderName = ProviderName;
    }

    /**
     * Get <p>Cloud Account ID</p> 
     * @return CloudAccountID <p>Cloud Account ID</p>
     */
    public String getCloudAccountID() {
        return this.CloudAccountID;
    }

    /**
     * Set <p>Cloud Account ID</p>
     * @param CloudAccountID <p>Cloud Account ID</p>
     */
    public void setCloudAccountID(String CloudAccountID) {
        this.CloudAccountID = CloudAccountID;
    }

    /**
     * Get <p>Cloud account name</p> 
     * @return CloudAccountName <p>Cloud account name</p>
     */
    public String getCloudAccountName() {
        return this.CloudAccountName;
    }

    /**
     * Set <p>Cloud account name</p>
     * @param CloudAccountName <p>Cloud account name</p>
     */
    public void setCloudAccountName(String CloudAccountName) {
        this.CloudAccountName = CloudAccountName;
    }

    /**
     * Get <p>Asset ID.</p> 
     * @return AssetID <p>Asset ID.</p>
     */
    public String getAssetID() {
        return this.AssetID;
    }

    /**
     * Set <p>Asset ID.</p>
     * @param AssetID <p>Asset ID.</p>
     */
    public void setAssetID(String AssetID) {
        this.AssetID = AssetID;
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
     * Get <p>Asset type name</p> 
     * @return AssetTypeName <p>Asset type name</p>
     */
    public String getAssetTypeName() {
        return this.AssetTypeName;
    }

    /**
     * Set <p>Asset type name</p>
     * @param AssetTypeName <p>Asset type name</p>
     */
    public void setAssetTypeName(String AssetTypeName) {
        this.AssetTypeName = AssetTypeName;
    }

    /**
     * Get <p>Asset tag.</p> 
     * @return Tags <p>Asset tag.</p>
     */
    public AssetTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Asset tag.</p>
     * @param Tags <p>Asset tag.</p>
     */
    public void setTags(AssetTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Public network address</p> 
     * @return Address <p>Public network address</p>
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>Public network address</p>
     * @param Address <p>Public network address</p>
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>Public address type</p> 
     * @return AddressType <p>Public address type</p>
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set <p>Public address type</p>
     * @param AddressType <p>Public address type</p>
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get <p>Resolution address</p> 
     * @return ResolvedAddress <p>Resolution address</p>
     */
    public String [] getResolvedAddress() {
        return this.ResolvedAddress;
    }

    /**
     * Set <p>Resolution address</p>
     * @param ResolvedAddress <p>Resolution address</p>
     */
    public void setResolvedAddress(String [] ResolvedAddress) {
        this.ResolvedAddress = ResolvedAddress;
    }

    /**
     * Get <p>Region.</p> 
     * @return Region <p>Region.</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region.</p>
     * @param Region <p>Region.</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Protection status</p> 
     * @return ProtectStatus <p>Protection status</p>
     */
    public Long getProtectStatus() {
        return this.ProtectStatus;
    }

    /**
     * Set <p>Protection status</p>
     * @param ProtectStatus <p>Protection status</p>
     */
    public void setProtectStatus(Long ProtectStatus) {
        this.ProtectStatus = ProtectStatus;
    }

    /**
     * Get <p>Number of risks</p> 
     * @return RiskCount <p>Number of risks</p>
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>Number of risks</p>
     * @param RiskCount <p>Number of risks</p>
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get <p>Number of alarms.</p> 
     * @return AlarmCount <p>Number of alarms.</p>
     */
    public Long getAlarmCount() {
        return this.AlarmCount;
    }

    /**
     * Set <p>Number of alarms.</p>
     * @param AlarmCount <p>Number of alarms.</p>
     */
    public void setAlarmCount(Long AlarmCount) {
        this.AlarmCount = AlarmCount;
    }

    /**
     * Get <p>Instance creation time</p> 
     * @return CreatedAt <p>Instance creation time</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>Instance creation time</p>
     * @param CreatedAt <p>Instance creation time</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>First sync time</p> 
     * @return FirstSyncTime <p>First sync time</p>
     */
    public String getFirstSyncTime() {
        return this.FirstSyncTime;
    }

    /**
     * Set <p>First sync time</p>
     * @param FirstSyncTime <p>First sync time</p>
     */
    public void setFirstSyncTime(String FirstSyncTime) {
        this.FirstSyncTime = FirstSyncTime;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Total number of severe risks</p> 
     * @return CriticalRiskCount <p>Total number of severe risks</p>
     */
    public Long getCriticalRiskCount() {
        return this.CriticalRiskCount;
    }

    /**
     * Set <p>Total number of severe risks</p>
     * @param CriticalRiskCount <p>Total number of severe risks</p>
     */
    public void setCriticalRiskCount(Long CriticalRiskCount) {
        this.CriticalRiskCount = CriticalRiskCount;
    }

    /**
     * Get <p>Total number of high risks</p> 
     * @return HighRiskCount <p>Total number of high risks</p>
     */
    public Long getHighRiskCount() {
        return this.HighRiskCount;
    }

    /**
     * Set <p>Total number of high risks</p>
     * @param HighRiskCount <p>Total number of high risks</p>
     */
    public void setHighRiskCount(Long HighRiskCount) {
        this.HighRiskCount = HighRiskCount;
    }

    /**
     * Get <p>Total number of medium risks</p> 
     * @return MediumRiskCount <p>Total number of medium risks</p>
     */
    public Long getMediumRiskCount() {
        return this.MediumRiskCount;
    }

    /**
     * Set <p>Total number of medium risks</p>
     * @param MediumRiskCount <p>Total number of medium risks</p>
     */
    public void setMediumRiskCount(Long MediumRiskCount) {
        this.MediumRiskCount = MediumRiskCount;
    }

    /**
     * Get <p>Total number of low risks</p> 
     * @return LowRiskCount <p>Total number of low risks</p>
     */
    public Long getLowRiskCount() {
        return this.LowRiskCount;
    }

    /**
     * Set <p>Total number of low risks</p>
     * @param LowRiskCount <p>Total number of low risks</p>
     */
    public void setLowRiskCount(Long LowRiskCount) {
        this.LowRiskCount = LowRiskCount;
    }

    /**
     * Get <p>Unique asset ID</p> 
     * @return AssetRID <p>Unique asset ID</p>
     */
    public String getAssetRID() {
        return this.AssetRID;
    }

    /**
     * Set <p>Unique asset ID</p>
     * @param AssetRID <p>Unique asset ID</p>
     */
    public void setAssetRID(String AssetRID) {
        this.AssetRID = AssetRID;
    }

    /**
     * Get <p>CSC tag</p> 
     * @return CustomTags <p>CSC tag</p>
     */
    public CustomTag [] getCustomTags() {
        return this.CustomTags;
    }

    /**
     * Set <p>CSC tag</p>
     * @param CustomTags <p>CSC tag</p>
     */
    public void setCustomTags(CustomTag [] CustomTags) {
        this.CustomTags = CustomTags;
    }

    /**
     * Get <p>Asset type icon</p> 
     * @return AssetTypeIconURL <p>Asset type icon</p>
     */
    public String getAssetTypeIconURL() {
        return this.AssetTypeIconURL;
    }

    /**
     * Set <p>Asset type icon</p>
     * @param AssetTypeIconURL <p>Asset type icon</p>
     */
    public void setAssetTypeIconURL(String AssetTypeIconURL) {
        this.AssetTypeIconURL = AssetTypeIconURL;
    }

    public PublicAssetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublicAssetInfo(PublicAssetInfo source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.ProviderName != null) {
            this.ProviderName = new String(source.ProviderName);
        }
        if (source.CloudAccountID != null) {
            this.CloudAccountID = new String(source.CloudAccountID);
        }
        if (source.CloudAccountName != null) {
            this.CloudAccountName = new String(source.CloudAccountName);
        }
        if (source.AssetID != null) {
            this.AssetID = new String(source.AssetID);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetTypeName != null) {
            this.AssetTypeName = new String(source.AssetTypeName);
        }
        if (source.Tags != null) {
            this.Tags = new AssetTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new AssetTag(source.Tags[i]);
            }
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.AddressType != null) {
            this.AddressType = new String(source.AddressType);
        }
        if (source.ResolvedAddress != null) {
            this.ResolvedAddress = new String[source.ResolvedAddress.length];
            for (int i = 0; i < source.ResolvedAddress.length; i++) {
                this.ResolvedAddress[i] = new String(source.ResolvedAddress[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ProtectStatus != null) {
            this.ProtectStatus = new Long(source.ProtectStatus);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.AlarmCount != null) {
            this.AlarmCount = new Long(source.AlarmCount);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.FirstSyncTime != null) {
            this.FirstSyncTime = new String(source.FirstSyncTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CriticalRiskCount != null) {
            this.CriticalRiskCount = new Long(source.CriticalRiskCount);
        }
        if (source.HighRiskCount != null) {
            this.HighRiskCount = new Long(source.HighRiskCount);
        }
        if (source.MediumRiskCount != null) {
            this.MediumRiskCount = new Long(source.MediumRiskCount);
        }
        if (source.LowRiskCount != null) {
            this.LowRiskCount = new Long(source.LowRiskCount);
        }
        if (source.AssetRID != null) {
            this.AssetRID = new String(source.AssetRID);
        }
        if (source.CustomTags != null) {
            this.CustomTags = new CustomTag[source.CustomTags.length];
            for (int i = 0; i < source.CustomTags.length; i++) {
                this.CustomTags[i] = new CustomTag(source.CustomTags[i]);
            }
        }
        if (source.AssetTypeIconURL != null) {
            this.AssetTypeIconURL = new String(source.AssetTypeIconURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "ProviderName", this.ProviderName);
        this.setParamSimple(map, prefix + "CloudAccountID", this.CloudAccountID);
        this.setParamSimple(map, prefix + "CloudAccountName", this.CloudAccountName);
        this.setParamSimple(map, prefix + "AssetID", this.AssetID);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetTypeName", this.AssetTypeName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamArraySimple(map, prefix + "ResolvedAddress.", this.ResolvedAddress);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ProtectStatus", this.ProtectStatus);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "FirstSyncTime", this.FirstSyncTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CriticalRiskCount", this.CriticalRiskCount);
        this.setParamSimple(map, prefix + "HighRiskCount", this.HighRiskCount);
        this.setParamSimple(map, prefix + "MediumRiskCount", this.MediumRiskCount);
        this.setParamSimple(map, prefix + "LowRiskCount", this.LowRiskCount);
        this.setParamSimple(map, prefix + "AssetRID", this.AssetRID);
        this.setParamArrayObj(map, prefix + "CustomTags.", this.CustomTags);
        this.setParamSimple(map, prefix + "AssetTypeIconURL", this.AssetTypeIconURL);

    }
}

