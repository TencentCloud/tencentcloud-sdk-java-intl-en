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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageRepoRegistryInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("RegistryId")
    @Expose
    private Long RegistryId;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * 
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * 
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * 
    */
    @SerializedName("RegistryVersion")
    @Expose
    private String RegistryVersion;

    /**
    * 
    */
    @SerializedName("ConnectMsg")
    @Expose
    private String ConnectMsg;

    /**
    * 
    */
    @SerializedName("ConnDetectType")
    @Expose
    private String ConnDetectType;

    /**
    * 
    */
    @SerializedName("ConnDetectHostCount")
    @Expose
    private Long ConnDetectHostCount;

    /**
    * 
    */
    @SerializedName("ConnDetectDetail")
    @Expose
    private RegistryConnDetectResult [] ConnDetectDetail;

    /**
    * 
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 
    */
    @SerializedName("LatestSyncTime")
    @Expose
    private String LatestSyncTime;

    /**
    * 
    */
    @SerializedName("SyncStatus")
    @Expose
    private String SyncStatus;

    /**
    * 
    */
    @SerializedName("SyncFailReason")
    @Expose
    private String SyncFailReason;

    /**
    * 
    */
    @SerializedName("SyncSolution")
    @Expose
    private String SyncSolution;

    /**
    * 
    */
    @SerializedName("SyncMessage")
    @Expose
    private String SyncMessage;

    /**
     * Get  
     * @return RegistryId 
     */
    public Long getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 
     * @param RegistryId 
     */
    public void setRegistryId(Long RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return RegistryType 
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set 
     * @param RegistryType 
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get  
     * @return Url 
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 
     * @param Url 
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get  
     * @return NetType 
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set 
     * @param NetType 
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get  
     * @return RegistryRegion 
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set 
     * @param RegistryRegion 
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get  
     * @return RegistryVersion 
     */
    public String getRegistryVersion() {
        return this.RegistryVersion;
    }

    /**
     * Set 
     * @param RegistryVersion 
     */
    public void setRegistryVersion(String RegistryVersion) {
        this.RegistryVersion = RegistryVersion;
    }

    /**
     * Get  
     * @return ConnectMsg 
     */
    public String getConnectMsg() {
        return this.ConnectMsg;
    }

    /**
     * Set 
     * @param ConnectMsg 
     */
    public void setConnectMsg(String ConnectMsg) {
        this.ConnectMsg = ConnectMsg;
    }

    /**
     * Get  
     * @return ConnDetectType 
     */
    public String getConnDetectType() {
        return this.ConnDetectType;
    }

    /**
     * Set 
     * @param ConnDetectType 
     */
    public void setConnDetectType(String ConnDetectType) {
        this.ConnDetectType = ConnDetectType;
    }

    /**
     * Get  
     * @return ConnDetectHostCount 
     */
    public Long getConnDetectHostCount() {
        return this.ConnDetectHostCount;
    }

    /**
     * Set 
     * @param ConnDetectHostCount 
     */
    public void setConnDetectHostCount(Long ConnDetectHostCount) {
        this.ConnDetectHostCount = ConnDetectHostCount;
    }

    /**
     * Get  
     * @return ConnDetectDetail 
     */
    public RegistryConnDetectResult [] getConnDetectDetail() {
        return this.ConnDetectDetail;
    }

    /**
     * Set 
     * @param ConnDetectDetail 
     */
    public void setConnDetectDetail(RegistryConnDetectResult [] ConnDetectDetail) {
        this.ConnDetectDetail = ConnDetectDetail;
    }

    /**
     * Get  
     * @return InstanceID 
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 
     * @param InstanceID 
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get  
     * @return LatestSyncTime 
     */
    public String getLatestSyncTime() {
        return this.LatestSyncTime;
    }

    /**
     * Set 
     * @param LatestSyncTime 
     */
    public void setLatestSyncTime(String LatestSyncTime) {
        this.LatestSyncTime = LatestSyncTime;
    }

    /**
     * Get  
     * @return SyncStatus 
     */
    public String getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set 
     * @param SyncStatus 
     */
    public void setSyncStatus(String SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    /**
     * Get  
     * @return SyncFailReason 
     */
    public String getSyncFailReason() {
        return this.SyncFailReason;
    }

    /**
     * Set 
     * @param SyncFailReason 
     */
    public void setSyncFailReason(String SyncFailReason) {
        this.SyncFailReason = SyncFailReason;
    }

    /**
     * Get  
     * @return SyncSolution 
     */
    public String getSyncSolution() {
        return this.SyncSolution;
    }

    /**
     * Set 
     * @param SyncSolution 
     */
    public void setSyncSolution(String SyncSolution) {
        this.SyncSolution = SyncSolution;
    }

    /**
     * Get  
     * @return SyncMessage 
     */
    public String getSyncMessage() {
        return this.SyncMessage;
    }

    /**
     * Set 
     * @param SyncMessage 
     */
    public void setSyncMessage(String SyncMessage) {
        this.SyncMessage = SyncMessage;
    }

    public ImageRepoRegistryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRepoRegistryInfo(ImageRepoRegistryInfo source) {
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
        if (source.ConnectMsg != null) {
            this.ConnectMsg = new String(source.ConnectMsg);
        }
        if (source.ConnDetectType != null) {
            this.ConnDetectType = new String(source.ConnDetectType);
        }
        if (source.ConnDetectHostCount != null) {
            this.ConnDetectHostCount = new Long(source.ConnDetectHostCount);
        }
        if (source.ConnDetectDetail != null) {
            this.ConnDetectDetail = new RegistryConnDetectResult[source.ConnDetectDetail.length];
            for (int i = 0; i < source.ConnDetectDetail.length; i++) {
                this.ConnDetectDetail[i] = new RegistryConnDetectResult(source.ConnDetectDetail[i]);
            }
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.LatestSyncTime != null) {
            this.LatestSyncTime = new String(source.LatestSyncTime);
        }
        if (source.SyncStatus != null) {
            this.SyncStatus = new String(source.SyncStatus);
        }
        if (source.SyncFailReason != null) {
            this.SyncFailReason = new String(source.SyncFailReason);
        }
        if (source.SyncSolution != null) {
            this.SyncSolution = new String(source.SyncSolution);
        }
        if (source.SyncMessage != null) {
            this.SyncMessage = new String(source.SyncMessage);
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
        this.setParamSimple(map, prefix + "ConnectMsg", this.ConnectMsg);
        this.setParamSimple(map, prefix + "ConnDetectType", this.ConnDetectType);
        this.setParamSimple(map, prefix + "ConnDetectHostCount", this.ConnDetectHostCount);
        this.setParamArrayObj(map, prefix + "ConnDetectDetail.", this.ConnDetectDetail);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "LatestSyncTime", this.LatestSyncTime);
        this.setParamSimple(map, prefix + "SyncStatus", this.SyncStatus);
        this.setParamSimple(map, prefix + "SyncFailReason", this.SyncFailReason);
        this.setParamSimple(map, prefix + "SyncSolution", this.SyncSolution);
        this.setParamSimple(map, prefix + "SyncMessage", this.SyncMessage);

    }
}

