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

public class ImageRegistryInfo extends AbstractModel {

    /**
    * <p>Repository id</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private Long RegistryId;

    /**
    * <p>Repository name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Repository type</p>
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * <p>Warehouse url</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>Network connection type</p>
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * <p>Repository region</p>
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * <p>Warehouse version</p>
    */
    @SerializedName("RegistryVersion")
    @Expose
    private String RegistryVersion;

    /**
    * <p>Repository instance id.</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>Last sync time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("LatestSyncTime")
    @Expose
    private String LatestSyncTime;

    /**
    * <p>Solution to synchronization failure</p>
    */
    @SerializedName("SyncSolution")
    @Expose
    private String SyncSolution;

    /**
    * <p>Synchronization method</p>
    */
    @SerializedName("SyncMode")
    @Expose
    private Long SyncMode;

    /**
    * <p>Connection check description</p>
    */
    @SerializedName("ConnDetectDetail")
    @Expose
    private RegistryConnDetectResult [] ConnDetectDetail;

    /**
    * <p>Connection type</p>
    */
    @SerializedName("ConnDetectType")
    @Expose
    private String ConnDetectType;

    /**
    * <p>Account name of the repository</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>appid of the account associated with the repository</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>Account uin associated with the repository</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>Synchronization status</p><p>Enumeration values:</p><ul><li>doing: Syncing</li><li>success: Synchronization successful</li><li>failed: Synchronization failed</li></ul>
    */
    @SerializedName("SyncStatus")
    @Expose
    private String SyncStatus;

    /**
    * <p>Reason for synchronization failure.</p>
    */
    @SerializedName("SyncFailReason")
    @Expose
    private String SyncFailReason;

    /**
    * <p>Region information.</p>
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * <p>Mirror warehouse username</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get <p>Repository id</p> 
     * @return RegistryId <p>Repository id</p>
     */
    public Long getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>Repository id</p>
     * @param RegistryId <p>Repository id</p>
     */
    public void setRegistryId(Long RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>Repository name.</p> 
     * @return Name <p>Repository name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Repository name.</p>
     * @param Name <p>Repository name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Repository type</p> 
     * @return RegistryType <p>Repository type</p>
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set <p>Repository type</p>
     * @param RegistryType <p>Repository type</p>
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get <p>Warehouse url</p> 
     * @return Url <p>Warehouse url</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Warehouse url</p>
     * @param Url <p>Warehouse url</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>Network connection type</p> 
     * @return NetType <p>Network connection type</p>
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>Network connection type</p>
     * @param NetType <p>Network connection type</p>
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>Repository region</p> 
     * @return RegistryRegion <p>Repository region</p>
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set <p>Repository region</p>
     * @param RegistryRegion <p>Repository region</p>
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get <p>Warehouse version</p> 
     * @return RegistryVersion <p>Warehouse version</p>
     */
    public String getRegistryVersion() {
        return this.RegistryVersion;
    }

    /**
     * Set <p>Warehouse version</p>
     * @param RegistryVersion <p>Warehouse version</p>
     */
    public void setRegistryVersion(String RegistryVersion) {
        this.RegistryVersion = RegistryVersion;
    }

    /**
     * Get <p>Repository instance id.</p> 
     * @return InstanceID <p>Repository instance id.</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>Repository instance id.</p>
     * @param InstanceID <p>Repository instance id.</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>Last sync time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return LatestSyncTime <p>Last sync time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getLatestSyncTime() {
        return this.LatestSyncTime;
    }

    /**
     * Set <p>Last sync time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param LatestSyncTime <p>Last sync time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setLatestSyncTime(String LatestSyncTime) {
        this.LatestSyncTime = LatestSyncTime;
    }

    /**
     * Get <p>Solution to synchronization failure</p> 
     * @return SyncSolution <p>Solution to synchronization failure</p>
     */
    public String getSyncSolution() {
        return this.SyncSolution;
    }

    /**
     * Set <p>Solution to synchronization failure</p>
     * @param SyncSolution <p>Solution to synchronization failure</p>
     */
    public void setSyncSolution(String SyncSolution) {
        this.SyncSolution = SyncSolution;
    }

    /**
     * Get <p>Synchronization method</p> 
     * @return SyncMode <p>Synchronization method</p>
     */
    public Long getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set <p>Synchronization method</p>
     * @param SyncMode <p>Synchronization method</p>
     */
    public void setSyncMode(Long SyncMode) {
        this.SyncMode = SyncMode;
    }

    /**
     * Get <p>Connection check description</p> 
     * @return ConnDetectDetail <p>Connection check description</p>
     */
    public RegistryConnDetectResult [] getConnDetectDetail() {
        return this.ConnDetectDetail;
    }

    /**
     * Set <p>Connection check description</p>
     * @param ConnDetectDetail <p>Connection check description</p>
     */
    public void setConnDetectDetail(RegistryConnDetectResult [] ConnDetectDetail) {
        this.ConnDetectDetail = ConnDetectDetail;
    }

    /**
     * Get <p>Connection type</p> 
     * @return ConnDetectType <p>Connection type</p>
     */
    public String getConnDetectType() {
        return this.ConnDetectType;
    }

    /**
     * Set <p>Connection type</p>
     * @param ConnDetectType <p>Connection type</p>
     */
    public void setConnDetectType(String ConnDetectType) {
        this.ConnDetectType = ConnDetectType;
    }

    /**
     * Get <p>Account name of the repository</p> 
     * @return OwnerAccountName <p>Account name of the repository</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>Account name of the repository</p>
     * @param OwnerAccountName <p>Account name of the repository</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>appid of the account associated with the repository</p> 
     * @return OwnerAppId <p>appid of the account associated with the repository</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>appid of the account associated with the repository</p>
     * @param OwnerAppId <p>appid of the account associated with the repository</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>Account uin associated with the repository</p> 
     * @return OwnerUin <p>Account uin associated with the repository</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>Account uin associated with the repository</p>
     * @param OwnerUin <p>Account uin associated with the repository</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>Synchronization status</p><p>Enumeration values:</p><ul><li>doing: Syncing</li><li>success: Synchronization successful</li><li>failed: Synchronization failed</li></ul> 
     * @return SyncStatus <p>Synchronization status</p><p>Enumeration values:</p><ul><li>doing: Syncing</li><li>success: Synchronization successful</li><li>failed: Synchronization failed</li></ul>
     */
    public String getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set <p>Synchronization status</p><p>Enumeration values:</p><ul><li>doing: Syncing</li><li>success: Synchronization successful</li><li>failed: Synchronization failed</li></ul>
     * @param SyncStatus <p>Synchronization status</p><p>Enumeration values:</p><ul><li>doing: Syncing</li><li>success: Synchronization successful</li><li>failed: Synchronization failed</li></ul>
     */
    public void setSyncStatus(String SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    /**
     * Get <p>Reason for synchronization failure.</p> 
     * @return SyncFailReason <p>Reason for synchronization failure.</p>
     */
    public String getSyncFailReason() {
        return this.SyncFailReason;
    }

    /**
     * Set <p>Reason for synchronization failure.</p>
     * @param SyncFailReason <p>Reason for synchronization failure.</p>
     */
    public void setSyncFailReason(String SyncFailReason) {
        this.SyncFailReason = SyncFailReason;
    }

    /**
     * Get <p>Region information.</p> 
     * @return RegionInfo <p>Region information.</p>
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set <p>Region information.</p>
     * @param RegionInfo <p>Region information.</p>
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get <p>Mirror warehouse username</p> 
     * @return UserName <p>Mirror warehouse username</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Mirror warehouse username</p>
     * @param UserName <p>Mirror warehouse username</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public ImageRegistryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRegistryInfo(ImageRegistryInfo source) {
        if (source.RegistryId != null) {
            this.RegistryId = new Long(source.RegistryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String(source.RegistryRegion);
        }
        if (source.RegistryVersion != null) {
            this.RegistryVersion = new String(source.RegistryVersion);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.LatestSyncTime != null) {
            this.LatestSyncTime = new String(source.LatestSyncTime);
        }
        if (source.SyncSolution != null) {
            this.SyncSolution = new String(source.SyncSolution);
        }
        if (source.SyncMode != null) {
            this.SyncMode = new Long(source.SyncMode);
        }
        if (source.ConnDetectDetail != null) {
            this.ConnDetectDetail = new RegistryConnDetectResult[source.ConnDetectDetail.length];
            for (int i = 0; i < source.ConnDetectDetail.length; i++) {
                this.ConnDetectDetail[i] = new RegistryConnDetectResult(source.ConnDetectDetail[i]);
            }
        }
        if (source.ConnDetectType != null) {
            this.ConnDetectType = new String(source.ConnDetectType);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.SyncStatus != null) {
            this.SyncStatus = new String(source.SyncStatus);
        }
        if (source.SyncFailReason != null) {
            this.SyncFailReason = new String(source.SyncFailReason);
        }
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "RegistryVersion", this.RegistryVersion);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "LatestSyncTime", this.LatestSyncTime);
        this.setParamSimple(map, prefix + "SyncSolution", this.SyncSolution);
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);
        this.setParamArrayObj(map, prefix + "ConnDetectDetail.", this.ConnDetectDetail);
        this.setParamSimple(map, prefix + "ConnDetectType", this.ConnDetectType);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "SyncStatus", this.SyncStatus);
        this.setParamSimple(map, prefix + "SyncFailReason", this.SyncFailReason);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

