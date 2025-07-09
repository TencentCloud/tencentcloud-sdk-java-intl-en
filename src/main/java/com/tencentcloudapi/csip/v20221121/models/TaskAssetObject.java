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
    * Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 	Asset category
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Asset sub-category
Note: This field may return·null, indicating that no valid values can be obtained.
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
    * Region
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * The ID specific for an asset synched from another cloud platform
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Arn")
    @Expose
    private String Arn;

    /**
     * Get Asset name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetName Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetName Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 	Asset category
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return InstanceType 	Asset category
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 	Asset category
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param InstanceType 	Asset category
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Asset sub-category
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetType Asset sub-category
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset sub-category
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetType Asset sub-category
Note: This field may return·null, indicating that no valid values can be obtained.
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
     * Get Region
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Region Region
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Region Region
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get The ID specific for an asset synched from another cloud platform
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Arn The ID specific for an asset synched from another cloud platform
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getArn() {
        return this.Arn;
    }

    /**
     * Set The ID specific for an asset synched from another cloud platform
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Arn The ID specific for an asset synched from another cloud platform
Note: This field may return·null, indicating that no valid values can be obtained.
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

