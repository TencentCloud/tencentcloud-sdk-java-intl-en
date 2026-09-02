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

public class AssetTypeCount extends AbstractModel {

    /**
    * <p>Associated asset type</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>Quantity.</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>Asset type display name</p>
    */
    @SerializedName("AssetTypeName")
    @Expose
    private String AssetTypeName;

    /**
    * <p>Filter field</p>
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
     * Get <p>Associated asset type</p> 
     * @return AssetType <p>Associated asset type</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>Associated asset type</p>
     * @param AssetType <p>Associated asset type</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>Quantity.</p> 
     * @return Count <p>Quantity.</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>Quantity.</p>
     * @param Count <p>Quantity.</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>Asset type display name</p> 
     * @return AssetTypeName <p>Asset type display name</p>
     */
    public String getAssetTypeName() {
        return this.AssetTypeName;
    }

    /**
     * Set <p>Asset type display name</p>
     * @param AssetTypeName <p>Asset type display name</p>
     */
    public void setAssetTypeName(String AssetTypeName) {
        this.AssetTypeName = AssetTypeName;
    }

    /**
     * Get <p>Filter field</p> 
     * @return Filter <p>Filter field</p>
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>Filter field</p>
     * @param Filter <p>Filter field</p>
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    public AssetTypeCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetTypeCount(AssetTypeCount source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.AssetTypeName != null) {
            this.AssetTypeName = new String(source.AssetTypeName);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "AssetTypeName", this.AssetTypeName);
        this.setParamSimple(map, prefix + "Filter", this.Filter);

    }
}

