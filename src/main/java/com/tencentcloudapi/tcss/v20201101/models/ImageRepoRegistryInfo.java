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
    * Repository id
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
    * Repository Type, list: harbor, tcr
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * Repository url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Network Type, list: public
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
    * Repository Version
    */
    @SerializedName("RegistryVersion")
    @Expose
    private String RegistryVersion;

    /**
    * Repository connection error message (to be deprecated, use ConnDetectException instead)
    */
    @SerializedName("ConnectMsg")
    @Expose
    private String ConnectMsg;

    /**
    * Connectivity Detection Method
    */
    @SerializedName("ConnDetectType")
    @Expose
    private String ConnDetectType;

    /**
    * Connectivity Detection Host Count
    */
    @SerializedName("ConnDetectHostCount")
    @Expose
    private Long ConnDetectHostCount;

    /**
    * Connectivity Detection Details
    */
    @SerializedName("ConnDetectDetail")
    @Expose
    private RegistryConnDetectResult [] ConnDetectDetail;

    /**
    * instance_id in tcr
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Latest Successful Synchronization Time
    */
    @SerializedName("LatestSyncTime")
    @Expose
    private String LatestSyncTime;

    /**
    * Synchronization Status
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
    * Synchronization Failure Message
    */
    @SerializedName("SyncMessage")
    @Expose
    private String SyncMessage;

    /**
     * Get Repository id 
     * @return RegistryId Repository id
     */
    public Long getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Repository id
     * @param RegistryId Repository id
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
     * Get Repository Type, list: harbor, tcr 
     * @return RegistryType Repository Type, list: harbor, tcr
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set Repository Type, list: harbor, tcr
     * @param RegistryType Repository Type, list: harbor, tcr
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get Repository url 
     * @return Url Repository url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Repository url
     * @param Url Repository url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Network Type, list: public 
     * @return NetType Network Type, list: public
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set Network Type, list: public
     * @param NetType Network Type, list: public
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
     * Get Repository Version 
     * @return RegistryVersion Repository Version
     */
    public String getRegistryVersion() {
        return this.RegistryVersion;
    }

    /**
     * Set Repository Version
     * @param RegistryVersion Repository Version
     */
    public void setRegistryVersion(String RegistryVersion) {
        this.RegistryVersion = RegistryVersion;
    }

    /**
     * Get Repository connection error message (to be deprecated, use ConnDetectException instead) 
     * @return ConnectMsg Repository connection error message (to be deprecated, use ConnDetectException instead)
     */
    public String getConnectMsg() {
        return this.ConnectMsg;
    }

    /**
     * Set Repository connection error message (to be deprecated, use ConnDetectException instead)
     * @param ConnectMsg Repository connection error message (to be deprecated, use ConnDetectException instead)
     */
    public void setConnectMsg(String ConnectMsg) {
        this.ConnectMsg = ConnectMsg;
    }

    /**
     * Get Connectivity Detection Method 
     * @return ConnDetectType Connectivity Detection Method
     */
    public String getConnDetectType() {
        return this.ConnDetectType;
    }

    /**
     * Set Connectivity Detection Method
     * @param ConnDetectType Connectivity Detection Method
     */
    public void setConnDetectType(String ConnDetectType) {
        this.ConnDetectType = ConnDetectType;
    }

    /**
     * Get Connectivity Detection Host Count 
     * @return ConnDetectHostCount Connectivity Detection Host Count
     */
    public Long getConnDetectHostCount() {
        return this.ConnDetectHostCount;
    }

    /**
     * Set Connectivity Detection Host Count
     * @param ConnDetectHostCount Connectivity Detection Host Count
     */
    public void setConnDetectHostCount(Long ConnDetectHostCount) {
        this.ConnDetectHostCount = ConnDetectHostCount;
    }

    /**
     * Get Connectivity Detection Details 
     * @return ConnDetectDetail Connectivity Detection Details
     */
    public RegistryConnDetectResult [] getConnDetectDetail() {
        return this.ConnDetectDetail;
    }

    /**
     * Set Connectivity Detection Details
     * @param ConnDetectDetail Connectivity Detection Details
     */
    public void setConnDetectDetail(RegistryConnDetectResult [] ConnDetectDetail) {
        this.ConnDetectDetail = ConnDetectDetail;
    }

    /**
     * Get instance_id in tcr 
     * @return InstanceID instance_id in tcr
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set instance_id in tcr
     * @param InstanceID instance_id in tcr
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Latest Successful Synchronization Time 
     * @return LatestSyncTime Latest Successful Synchronization Time
     */
    public String getLatestSyncTime() {
        return this.LatestSyncTime;
    }

    /**
     * Set Latest Successful Synchronization Time
     * @param LatestSyncTime Latest Successful Synchronization Time
     */
    public void setLatestSyncTime(String LatestSyncTime) {
        this.LatestSyncTime = LatestSyncTime;
    }

    /**
     * Get Synchronization Status 
     * @return SyncStatus Synchronization Status
     */
    public String getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set Synchronization Status
     * @param SyncStatus Synchronization Status
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
     * Get Synchronization Failure Message 
     * @return SyncMessage Synchronization Failure Message
     */
    public String getSyncMessage() {
        return this.SyncMessage;
    }

    /**
     * Set Synchronization Failure Message
     * @param SyncMessage Synchronization Failure Message
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

