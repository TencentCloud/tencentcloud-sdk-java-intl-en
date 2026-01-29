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

public class ExposeAssetTypeItem extends AbstractModel {

    /**
    * Cloud service provider.
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * Vendor name.
    */
    @SerializedName("ProviderName")
    @Expose
    private String ProviderName;

    /**
    * Asset type.
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Asset type name.
    */
    @SerializedName("AssetTypeName")
    @Expose
    private String AssetTypeName;

    /**
     * Get Cloud service provider. 
     * @return Provider Cloud service provider.
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set Cloud service provider.
     * @param Provider Cloud service provider.
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get Vendor name. 
     * @return ProviderName Vendor name.
     */
    public String getProviderName() {
        return this.ProviderName;
    }

    /**
     * Set Vendor name.
     * @param ProviderName Vendor name.
     */
    public void setProviderName(String ProviderName) {
        this.ProviderName = ProviderName;
    }

    /**
     * Get Asset type. 
     * @return AssetType Asset type.
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type.
     * @param AssetType Asset type.
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Asset type name. 
     * @return AssetTypeName Asset type name.
     */
    public String getAssetTypeName() {
        return this.AssetTypeName;
    }

    /**
     * Set Asset type name.
     * @param AssetTypeName Asset type name.
     */
    public void setAssetTypeName(String AssetTypeName) {
        this.AssetTypeName = AssetTypeName;
    }

    public ExposeAssetTypeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExposeAssetTypeItem(ExposeAssetTypeItem source) {
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.ProviderName != null) {
            this.ProviderName = new String(source.ProviderName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetTypeName != null) {
            this.AssetTypeName = new String(source.AssetTypeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "ProviderName", this.ProviderName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetTypeName", this.AssetTypeName);

    }
}

