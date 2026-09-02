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

public class AssetDetailItem extends AbstractModel {

    /**
    * <p>Tenant ID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

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
    * <p>Asset type</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>Cloud API return tag</p>
    */
    @SerializedName("Tags")
    @Expose
    private AssetTag [] Tags;

    /**
    * <p>Security group ID collection</p>
    */
    @SerializedName("SecurityGroupIDs")
    @Expose
    private String [] SecurityGroupIDs;

    /**
    * <p>Public IP address</p>
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * <p>Private IP address.</p>
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * <p>Public network domain</p>
    */
    @SerializedName("PublicDomain")
    @Expose
    private String PublicDomain;

    /**
    * <p>Private domain</p>
    */
    @SerializedName("PrivateDomain")
    @Expose
    private String PrivateDomain;

    /**
    * <p>Total number of risks</p>
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * <p>Total number of alarms</p>
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
    * <p>Asset name</p>
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * <p>Cloud security center tag</p>
    */
    @SerializedName("CustomTags")
    @Expose
    private CustomTag [] CustomTags;

    /**
    * <p>Cloud service provider</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>Asset type name</p>
    */
    @SerializedName("AssetTypeName")
    @Expose
    private String AssetTypeName;

    /**
    * <p>Asset type icon</p>
    */
    @SerializedName("AssetTypeIconURL")
    @Expose
    private String AssetTypeIconURL;

    /**
    * <p>Asset unique identifier</p>
    */
    @SerializedName("AssetRID")
    @Expose
    private String AssetRID;

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
     * Get <p>Cloud API return tag</p> 
     * @return Tags <p>Cloud API return tag</p>
     */
    public AssetTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Cloud API return tag</p>
     * @param Tags <p>Cloud API return tag</p>
     */
    public void setTags(AssetTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Security group ID collection</p> 
     * @return SecurityGroupIDs <p>Security group ID collection</p>
     */
    public String [] getSecurityGroupIDs() {
        return this.SecurityGroupIDs;
    }

    /**
     * Set <p>Security group ID collection</p>
     * @param SecurityGroupIDs <p>Security group ID collection</p>
     */
    public void setSecurityGroupIDs(String [] SecurityGroupIDs) {
        this.SecurityGroupIDs = SecurityGroupIDs;
    }

    /**
     * Get <p>Public IP address</p> 
     * @return PublicIP <p>Public IP address</p>
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set <p>Public IP address</p>
     * @param PublicIP <p>Public IP address</p>
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get <p>Private IP address.</p> 
     * @return PrivateIP <p>Private IP address.</p>
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set <p>Private IP address.</p>
     * @param PrivateIP <p>Private IP address.</p>
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get <p>Public network domain</p> 
     * @return PublicDomain <p>Public network domain</p>
     */
    public String getPublicDomain() {
        return this.PublicDomain;
    }

    /**
     * Set <p>Public network domain</p>
     * @param PublicDomain <p>Public network domain</p>
     */
    public void setPublicDomain(String PublicDomain) {
        this.PublicDomain = PublicDomain;
    }

    /**
     * Get <p>Private domain</p> 
     * @return PrivateDomain <p>Private domain</p>
     */
    public String getPrivateDomain() {
        return this.PrivateDomain;
    }

    /**
     * Set <p>Private domain</p>
     * @param PrivateDomain <p>Private domain</p>
     */
    public void setPrivateDomain(String PrivateDomain) {
        this.PrivateDomain = PrivateDomain;
    }

    /**
     * Get <p>Total number of risks</p> 
     * @return RiskCount <p>Total number of risks</p>
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>Total number of risks</p>
     * @param RiskCount <p>Total number of risks</p>
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get <p>Total number of alarms</p> 
     * @return AlarmCount <p>Total number of alarms</p>
     */
    public Long getAlarmCount() {
        return this.AlarmCount;
    }

    /**
     * Set <p>Total number of alarms</p>
     * @param AlarmCount <p>Total number of alarms</p>
     */
    public void setAlarmCount(Long AlarmCount) {
        this.AlarmCount = AlarmCount;
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
     * Get <p>Cloud security center tag</p> 
     * @return CustomTags <p>Cloud security center tag</p>
     */
    public CustomTag [] getCustomTags() {
        return this.CustomTags;
    }

    /**
     * Set <p>Cloud security center tag</p>
     * @param CustomTags <p>Cloud security center tag</p>
     */
    public void setCustomTags(CustomTag [] CustomTags) {
        this.CustomTags = CustomTags;
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

    /**
     * Get <p>Asset unique identifier</p> 
     * @return AssetRID <p>Asset unique identifier</p>
     */
    public String getAssetRID() {
        return this.AssetRID;
    }

    /**
     * Set <p>Asset unique identifier</p>
     * @param AssetRID <p>Asset unique identifier</p>
     */
    public void setAssetRID(String AssetRID) {
        this.AssetRID = AssetRID;
    }

    public AssetDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetDetailItem(AssetDetailItem source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.CloudAccountName != null) {
            this.CloudAccountName = new String(source.CloudAccountName);
        }
        if (source.AssetID != null) {
            this.AssetID = new String(source.AssetID);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Tags != null) {
            this.Tags = new AssetTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new AssetTag(source.Tags[i]);
            }
        }
        if (source.SecurityGroupIDs != null) {
            this.SecurityGroupIDs = new String[source.SecurityGroupIDs.length];
            for (int i = 0; i < source.SecurityGroupIDs.length; i++) {
                this.SecurityGroupIDs[i] = new String(source.SecurityGroupIDs[i]);
            }
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.PrivateIP != null) {
            this.PrivateIP = new String(source.PrivateIP);
        }
        if (source.PublicDomain != null) {
            this.PublicDomain = new String(source.PublicDomain);
        }
        if (source.PrivateDomain != null) {
            this.PrivateDomain = new String(source.PrivateDomain);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.AlarmCount != null) {
            this.AlarmCount = new Long(source.AlarmCount);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.CustomTags != null) {
            this.CustomTags = new CustomTag[source.CustomTags.length];
            for (int i = 0; i < source.CustomTags.length; i++) {
                this.CustomTags[i] = new CustomTag(source.CustomTags[i]);
            }
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.AssetTypeName != null) {
            this.AssetTypeName = new String(source.AssetTypeName);
        }
        if (source.AssetTypeIconURL != null) {
            this.AssetTypeIconURL = new String(source.AssetTypeIconURL);
        }
        if (source.AssetRID != null) {
            this.AssetRID = new String(source.AssetRID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "CloudAccountName", this.CloudAccountName);
        this.setParamSimple(map, prefix + "AssetID", this.AssetID);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "SecurityGroupIDs.", this.SecurityGroupIDs);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "PrivateIP", this.PrivateIP);
        this.setParamSimple(map, prefix + "PublicDomain", this.PublicDomain);
        this.setParamSimple(map, prefix + "PrivateDomain", this.PrivateDomain);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamArrayObj(map, prefix + "CustomTags.", this.CustomTags);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "AssetTypeName", this.AssetTypeName);
        this.setParamSimple(map, prefix + "AssetTypeIconURL", this.AssetTypeIconURL);
        this.setParamSimple(map, prefix + "AssetRID", this.AssetRID);

    }
}

