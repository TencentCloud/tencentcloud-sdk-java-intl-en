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

public class CreateAssetBaselineRiskExportJobRequest extends AbstractModel {

    /**
    * <p>Unique asset identifier (UUID), used with AssetType to locate a specific asset.</p>
    */
    @SerializedName("AssetUniqueID")
    @Expose
    private String AssetUniqueID;

    /**
    * <p>Asset type. Parameter Value: HOST (host), CLUSTER (cluster).</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>appid of asset ownership</p>
    */
    @SerializedName("AssetAppID")
    @Expose
    private Long AssetAppID;

    /**
    * <p>Export task name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Universal Filter Criteria. Supported fields: ItemName (detection item name, blurry), PolicyName (baseline name, blurry), InstanceName (host name, blurry), InstanceID (instance ID, exact), IP (IP, blurry). Different Names are in an AND relationship with each other, while multiple Values under the same Name are in an OR relationship.</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get <p>Unique asset identifier (UUID), used with AssetType to locate a specific asset.</p> 
     * @return AssetUniqueID <p>Unique asset identifier (UUID), used with AssetType to locate a specific asset.</p>
     */
    public String getAssetUniqueID() {
        return this.AssetUniqueID;
    }

    /**
     * Set <p>Unique asset identifier (UUID), used with AssetType to locate a specific asset.</p>
     * @param AssetUniqueID <p>Unique asset identifier (UUID), used with AssetType to locate a specific asset.</p>
     */
    public void setAssetUniqueID(String AssetUniqueID) {
        this.AssetUniqueID = AssetUniqueID;
    }

    /**
     * Get <p>Asset type. Parameter Value: HOST (host), CLUSTER (cluster).</p> 
     * @return AssetType <p>Asset type. Parameter Value: HOST (host), CLUSTER (cluster).</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>Asset type. Parameter Value: HOST (host), CLUSTER (cluster).</p>
     * @param AssetType <p>Asset type. Parameter Value: HOST (host), CLUSTER (cluster).</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>appid of asset ownership</p> 
     * @return AssetAppID <p>appid of asset ownership</p>
     */
    public Long getAssetAppID() {
        return this.AssetAppID;
    }

    /**
     * Set <p>appid of asset ownership</p>
     * @param AssetAppID <p>appid of asset ownership</p>
     */
    public void setAssetAppID(Long AssetAppID) {
        this.AssetAppID = AssetAppID;
    }

    /**
     * Get <p>Export task name</p> 
     * @return Name <p>Export task name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Export task name</p>
     * @param Name <p>Export task name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Universal Filter Criteria. Supported fields: ItemName (detection item name, blurry), PolicyName (baseline name, blurry), InstanceName (host name, blurry), InstanceID (instance ID, exact), IP (IP, blurry). Different Names are in an AND relationship with each other, while multiple Values under the same Name are in an OR relationship.</p> 
     * @return Filters <p>Universal Filter Criteria. Supported fields: ItemName (detection item name, blurry), PolicyName (baseline name, blurry), InstanceName (host name, blurry), InstanceID (instance ID, exact), IP (IP, blurry). Different Names are in an AND relationship with each other, while multiple Values under the same Name are in an OR relationship.</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Universal Filter Criteria. Supported fields: ItemName (detection item name, blurry), PolicyName (baseline name, blurry), InstanceName (host name, blurry), InstanceID (instance ID, exact), IP (IP, blurry). Different Names are in an AND relationship with each other, while multiple Values under the same Name are in an OR relationship.</p>
     * @param Filters <p>Universal Filter Criteria. Supported fields: ItemName (detection item name, blurry), PolicyName (baseline name, blurry), InstanceName (host name, blurry), InstanceID (instance ID, exact), IP (IP, blurry). Different Names are in an AND relationship with each other, while multiple Values under the same Name are in an OR relationship.</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public CreateAssetBaselineRiskExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAssetBaselineRiskExportJobRequest(CreateAssetBaselineRiskExportJobRequest source) {
        if (source.AssetUniqueID != null) {
            this.AssetUniqueID = new String(source.AssetUniqueID);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetAppID != null) {
            this.AssetAppID = new Long(source.AssetAppID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetUniqueID", this.AssetUniqueID);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetAppID", this.AssetAppID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

