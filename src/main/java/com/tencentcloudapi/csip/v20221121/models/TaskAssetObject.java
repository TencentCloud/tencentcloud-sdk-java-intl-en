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

public class TaskAssetObject extends AbstractModel {

    /**
    * Asset name.
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * Asset type.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Asset category.
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * IP, domain name, asset ID, database ID, and more
    */
    @SerializedName("Asset")
    @Expose
    private String Asset;

    /**
    * Region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Unique ID of Multi-Cloud Assets
    */
    @SerializedName("Arn")
    @Expose
    private String Arn;

    /**
     * Get Asset name. 
     * @return AssetName Asset name.
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set Asset name.
     * @param AssetName Asset name.
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get Asset type. 
     * @return InstanceType Asset type.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Asset type.
     * @param InstanceType Asset type.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Asset category. 
     * @return AssetType Asset category.
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset category.
     * @param AssetType Asset category.
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get IP, domain name, asset ID, database ID, and more 
     * @return Asset IP, domain name, asset ID, database ID, and more
     */
    public String getAsset() {
        return this.Asset;
    }

    /**
     * Set IP, domain name, asset ID, database ID, and more
     * @param Asset IP, domain name, asset ID, database ID, and more
     */
    public void setAsset(String Asset) {
        this.Asset = Asset;
    }

    /**
     * Get Region. 
     * @return Region Region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
     * @param Region Region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Unique ID of Multi-Cloud Assets 
     * @return Arn Unique ID of Multi-Cloud Assets
     */
    public String getArn() {
        return this.Arn;
    }

    /**
     * Set Unique ID of Multi-Cloud Assets
     * @param Arn Unique ID of Multi-Cloud Assets
     */
    public void setArn(String Arn) {
        this.Arn = Arn;
    }

    public TaskAssetObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskAssetObject(TaskAssetObject source) {
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Asset != null) {
            this.Asset = new String(source.Asset);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Arn != null) {
            this.Arn = new String(source.Arn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Asset", this.Asset);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Arn", this.Arn);

    }
}

