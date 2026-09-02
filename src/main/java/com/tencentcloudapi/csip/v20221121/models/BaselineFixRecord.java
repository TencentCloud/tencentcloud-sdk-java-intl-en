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

public class BaselineFixRecord extends AbstractModel {

    /**
    * <p>Primary key ID of the correction record.</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Tenant AppID.</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>Basic information of the repaired detection item.</p>
    */
    @SerializedName("ItemInfo")
    @Expose
    private BaselineItem ItemInfo;

    /**
    * <p>Host asset information involved in this fix. null when no data is available.</p>
    */
    @SerializedName("HostInfo")
    @Expose
    private BaselineHostAsset HostInfo;

    /**
    * <p>Cluster asset information. The value is null if no data is available.</p>
    */
    @SerializedName("ClusterInfo")
    @Expose
    private BaselineClusterAsset ClusterInfo;

    /**
    * <p>Asset type: HOST (host), CLUSTER (container cluster).</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>Repair completion time.</p>
    */
    @SerializedName("FixTime")
    @Expose
    private String FixTime;

    /**
    * <p>The time when the risk was first detected.</p>
    */
    @SerializedName("DiscoveryTime")
    @Expose
    private String DiscoveryTime;

    /**
     * Get <p>Primary key ID of the correction record.</p> 
     * @return ID <p>Primary key ID of the correction record.</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Primary key ID of the correction record.</p>
     * @param ID <p>Primary key ID of the correction record.</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Tenant AppID.</p> 
     * @return AppID <p>Tenant AppID.</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>Tenant AppID.</p>
     * @param AppID <p>Tenant AppID.</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>Basic information of the repaired detection item.</p> 
     * @return ItemInfo <p>Basic information of the repaired detection item.</p>
     */
    public BaselineItem getItemInfo() {
        return this.ItemInfo;
    }

    /**
     * Set <p>Basic information of the repaired detection item.</p>
     * @param ItemInfo <p>Basic information of the repaired detection item.</p>
     */
    public void setItemInfo(BaselineItem ItemInfo) {
        this.ItemInfo = ItemInfo;
    }

    /**
     * Get <p>Host asset information involved in this fix. null when no data is available.</p> 
     * @return HostInfo <p>Host asset information involved in this fix. null when no data is available.</p>
     */
    public BaselineHostAsset getHostInfo() {
        return this.HostInfo;
    }

    /**
     * Set <p>Host asset information involved in this fix. null when no data is available.</p>
     * @param HostInfo <p>Host asset information involved in this fix. null when no data is available.</p>
     */
    public void setHostInfo(BaselineHostAsset HostInfo) {
        this.HostInfo = HostInfo;
    }

    /**
     * Get <p>Cluster asset information. The value is null if no data is available.</p> 
     * @return ClusterInfo <p>Cluster asset information. The value is null if no data is available.</p>
     */
    public BaselineClusterAsset getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set <p>Cluster asset information. The value is null if no data is available.</p>
     * @param ClusterInfo <p>Cluster asset information. The value is null if no data is available.</p>
     */
    public void setClusterInfo(BaselineClusterAsset ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    /**
     * Get <p>Asset type: HOST (host), CLUSTER (container cluster).</p> 
     * @return AssetType <p>Asset type: HOST (host), CLUSTER (container cluster).</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>Asset type: HOST (host), CLUSTER (container cluster).</p>
     * @param AssetType <p>Asset type: HOST (host), CLUSTER (container cluster).</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>Repair completion time.</p> 
     * @return FixTime <p>Repair completion time.</p>
     */
    public String getFixTime() {
        return this.FixTime;
    }

    /**
     * Set <p>Repair completion time.</p>
     * @param FixTime <p>Repair completion time.</p>
     */
    public void setFixTime(String FixTime) {
        this.FixTime = FixTime;
    }

    /**
     * Get <p>The time when the risk was first detected.</p> 
     * @return DiscoveryTime <p>The time when the risk was first detected.</p>
     */
    public String getDiscoveryTime() {
        return this.DiscoveryTime;
    }

    /**
     * Set <p>The time when the risk was first detected.</p>
     * @param DiscoveryTime <p>The time when the risk was first detected.</p>
     */
    public void setDiscoveryTime(String DiscoveryTime) {
        this.DiscoveryTime = DiscoveryTime;
    }

    public BaselineFixRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineFixRecord(BaselineFixRecord source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.ItemInfo != null) {
            this.ItemInfo = new BaselineItem(source.ItemInfo);
        }
        if (source.HostInfo != null) {
            this.HostInfo = new BaselineHostAsset(source.HostInfo);
        }
        if (source.ClusterInfo != null) {
            this.ClusterInfo = new BaselineClusterAsset(source.ClusterInfo);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.FixTime != null) {
            this.FixTime = new String(source.FixTime);
        }
        if (source.DiscoveryTime != null) {
            this.DiscoveryTime = new String(source.DiscoveryTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamObj(map, prefix + "ItemInfo.", this.ItemInfo);
        this.setParamObj(map, prefix + "HostInfo.", this.HostInfo);
        this.setParamObj(map, prefix + "ClusterInfo.", this.ClusterInfo);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "FixTime", this.FixTime);
        this.setParamSimple(map, prefix + "DiscoveryTime", this.DiscoveryTime);

    }
}

