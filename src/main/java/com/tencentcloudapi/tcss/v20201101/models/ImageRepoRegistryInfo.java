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
    * Repository ID
    */
    @SerializedName("RegistryId")
    @Expose
    private Long RegistryId;

    /**
    * Repository Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Repository type, list: harbor, tcr
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * Warehouse url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Network type, list: public
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * Region, list: default
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * warehouse version
    */
    @SerializedName("RegistryVersion")
    @Expose
    private String RegistryVersion;

    /**
    * Repository connection error message (to be deprecated). Use ConnDetectException.
    */
    @SerializedName("ConnectMsg")
    @Expose
    private String ConnectMsg;

    /**
    * Connectivity Check Method
    */
    @SerializedName("ConnDetectType")
    @Expose
    private String ConnDetectType;

    /**
    * Connectivity Check Host Count
    */
    @SerializedName("ConnDetectHostCount")
    @Expose
    private Long ConnDetectHostCount;

    /**
    * Connectivity Check Details
    */
    @SerializedName("ConnDetectDetail")
    @Expose
    private RegistryConnDetectResult [] ConnDetectDetail;

    /**
    * Instance ID in TCR Scenario
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Most Recent Time for Successful Synchronization
    */
    @SerializedName("LatestSyncTime")
    @Expose
    private String LatestSyncTime;

    /**
    * Synchronization status
    */
    @SerializedName("SyncStatus")
    @Expose
    private String SyncStatus;

    /**
    * Synchronization Failure Reason
    */
    @SerializedName("SyncFailReason")
    @Expose
    private String SyncFailReason;

    /**
    * Synchronization Failure Solution
    */
    @SerializedName("SyncSolution")
    @Expose
    private String SyncSolution;

    /**
    * Synchronization Failure Information
    */
    @SerializedName("SyncMessage")
    @Expose
    private String SyncMessage;

    /**
    * Synchronization method. 0: full synchronization; 1: incremental synchronization.	
    */
    @SerializedName("SyncMode")
    @Expose
    private Long SyncMode;

    /**
     * Get Repository ID 
     * @return RegistryId Repository ID
     */
    public Long getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Repository ID
     * @param RegistryId Repository ID
     */
    public void setRegistryId(Long RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Repository Name 
     * @return Name Repository Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Repository Name
     * @param Name Repository Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Repository type, list: harbor, tcr 
     * @return RegistryType Repository type, list: harbor, tcr
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set Repository type, list: harbor, tcr
     * @param RegistryType Repository type, list: harbor, tcr
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get Warehouse url 
     * @return Url Warehouse url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Warehouse url
     * @param Url Warehouse url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Network type, list: public 
     * @return NetType Network type, list: public
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type, list: public
     * @param NetType Network type, list: public
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get Region, list: default 
     * @return RegistryRegion Region, list: default
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set Region, list: default
     * @param RegistryRegion Region, list: default
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get warehouse version 
     * @return RegistryVersion warehouse version
     */
    public String getRegistryVersion() {
        return this.RegistryVersion;
    }

    /**
     * Set warehouse version
     * @param RegistryVersion warehouse version
     */
    public void setRegistryVersion(String RegistryVersion) {
        this.RegistryVersion = RegistryVersion;
    }

    /**
     * Get Repository connection error message (to be deprecated). Use ConnDetectException. 
     * @return ConnectMsg Repository connection error message (to be deprecated). Use ConnDetectException.
     */
    public String getConnectMsg() {
        return this.ConnectMsg;
    }

    /**
     * Set Repository connection error message (to be deprecated). Use ConnDetectException.
     * @param ConnectMsg Repository connection error message (to be deprecated). Use ConnDetectException.
     */
    public void setConnectMsg(String ConnectMsg) {
        this.ConnectMsg = ConnectMsg;
    }

    /**
     * Get Connectivity Check Method 
     * @return ConnDetectType Connectivity Check Method
     */
    public String getConnDetectType() {
        return this.ConnDetectType;
    }

    /**
     * Set Connectivity Check Method
     * @param ConnDetectType Connectivity Check Method
     */
    public void setConnDetectType(String ConnDetectType) {
        this.ConnDetectType = ConnDetectType;
    }

    /**
     * Get Connectivity Check Host Count 
     * @return ConnDetectHostCount Connectivity Check Host Count
     */
    public Long getConnDetectHostCount() {
        return this.ConnDetectHostCount;
    }

    /**
     * Set Connectivity Check Host Count
     * @param ConnDetectHostCount Connectivity Check Host Count
     */
    public void setConnDetectHostCount(Long ConnDetectHostCount) {
        this.ConnDetectHostCount = ConnDetectHostCount;
    }

    /**
     * Get Connectivity Check Details 
     * @return ConnDetectDetail Connectivity Check Details
     */
    public RegistryConnDetectResult [] getConnDetectDetail() {
        return this.ConnDetectDetail;
    }

    /**
     * Set Connectivity Check Details
     * @param ConnDetectDetail Connectivity Check Details
     */
    public void setConnDetectDetail(RegistryConnDetectResult [] ConnDetectDetail) {
        this.ConnDetectDetail = ConnDetectDetail;
    }

    /**
     * Get Instance ID in TCR Scenario 
     * @return InstanceID Instance ID in TCR Scenario
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID in TCR Scenario
     * @param InstanceID Instance ID in TCR Scenario
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Most Recent Time for Successful Synchronization 
     * @return LatestSyncTime Most Recent Time for Successful Synchronization
     */
    public String getLatestSyncTime() {
        return this.LatestSyncTime;
    }

    /**
     * Set Most Recent Time for Successful Synchronization
     * @param LatestSyncTime Most Recent Time for Successful Synchronization
     */
    public void setLatestSyncTime(String LatestSyncTime) {
        this.LatestSyncTime = LatestSyncTime;
    }

    /**
     * Get Synchronization status 
     * @return SyncStatus Synchronization status
     */
    public String getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set Synchronization status
     * @param SyncStatus Synchronization status
     */
    public void setSyncStatus(String SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    /**
     * Get Synchronization Failure Reason 
     * @return SyncFailReason Synchronization Failure Reason
     */
    public String getSyncFailReason() {
        return this.SyncFailReason;
    }

    /**
     * Set Synchronization Failure Reason
     * @param SyncFailReason Synchronization Failure Reason
     */
    public void setSyncFailReason(String SyncFailReason) {
        this.SyncFailReason = SyncFailReason;
    }

    /**
     * Get Synchronization Failure Solution 
     * @return SyncSolution Synchronization Failure Solution
     */
    public String getSyncSolution() {
        return this.SyncSolution;
    }

    /**
     * Set Synchronization Failure Solution
     * @param SyncSolution Synchronization Failure Solution
     */
    public void setSyncSolution(String SyncSolution) {
        this.SyncSolution = SyncSolution;
    }

    /**
     * Get Synchronization Failure Information 
     * @return SyncMessage Synchronization Failure Information
     */
    public String getSyncMessage() {
        return this.SyncMessage;
    }

    /**
     * Set Synchronization Failure Information
     * @param SyncMessage Synchronization Failure Information
     */
    public void setSyncMessage(String SyncMessage) {
        this.SyncMessage = SyncMessage;
    }

    /**
     * Get Synchronization method. 0: full synchronization; 1: incremental synchronization.	 
     * @return SyncMode Synchronization method. 0: full synchronization; 1: incremental synchronization.	
     */
    public Long getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set Synchronization method. 0: full synchronization; 1: incremental synchronization.	
     * @param SyncMode Synchronization method. 0: full synchronization; 1: incremental synchronization.	
     */
    public void setSyncMode(Long SyncMode) {
        this.SyncMode = SyncMode;
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
        if (source.SyncMode != null) {
            this.SyncMode = new Long(source.SyncMode);
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
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);

    }
}

