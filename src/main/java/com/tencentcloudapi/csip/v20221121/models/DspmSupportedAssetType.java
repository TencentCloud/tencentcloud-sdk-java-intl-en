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

public class DspmSupportedAssetType extends AbstractModel {

    /**
    * <p>Product name (used for querying)</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>Region list.</p>
    */
    @SerializedName("Regions")
    @Expose
    private RegionConfig [] Regions;

    /**
    * <p>Product name-for display</p>
    */
    @SerializedName("ProductDisplayName")
    @Expose
    private String ProductDisplayName;

    /**
    * <p>Product group name</p>
    */
    @SerializedName("ProductGroup")
    @Expose
    private String ProductGroup;

    /**
    * <p>Total number of asset instances for a given asset type</p>
    */
    @SerializedName("AssetTotal")
    @Expose
    private Long AssetTotal;

    /**
     * Get <p>Product name (used for querying)</p> 
     * @return Product <p>Product name (used for querying)</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>Product name (used for querying)</p>
     * @param Product <p>Product name (used for querying)</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>Region list.</p> 
     * @return Regions <p>Region list.</p>
     */
    public RegionConfig [] getRegions() {
        return this.Regions;
    }

    /**
     * Set <p>Region list.</p>
     * @param Regions <p>Region list.</p>
     */
    public void setRegions(RegionConfig [] Regions) {
        this.Regions = Regions;
    }

    /**
     * Get <p>Product name-for display</p> 
     * @return ProductDisplayName <p>Product name-for display</p>
     */
    public String getProductDisplayName() {
        return this.ProductDisplayName;
    }

    /**
     * Set <p>Product name-for display</p>
     * @param ProductDisplayName <p>Product name-for display</p>
     */
    public void setProductDisplayName(String ProductDisplayName) {
        this.ProductDisplayName = ProductDisplayName;
    }

    /**
     * Get <p>Product group name</p> 
     * @return ProductGroup <p>Product group name</p>
     */
    public String getProductGroup() {
        return this.ProductGroup;
    }

    /**
     * Set <p>Product group name</p>
     * @param ProductGroup <p>Product group name</p>
     */
    public void setProductGroup(String ProductGroup) {
        this.ProductGroup = ProductGroup;
    }

    /**
     * Get <p>Total number of asset instances for a given asset type</p> 
     * @return AssetTotal <p>Total number of asset instances for a given asset type</p>
     */
    public Long getAssetTotal() {
        return this.AssetTotal;
    }

    /**
     * Set <p>Total number of asset instances for a given asset type</p>
     * @param AssetTotal <p>Total number of asset instances for a given asset type</p>
     */
    public void setAssetTotal(Long AssetTotal) {
        this.AssetTotal = AssetTotal;
    }

    public DspmSupportedAssetType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmSupportedAssetType(DspmSupportedAssetType source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Regions != null) {
            this.Regions = new RegionConfig[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new RegionConfig(source.Regions[i]);
            }
        }
        if (source.ProductDisplayName != null) {
            this.ProductDisplayName = new String(source.ProductDisplayName);
        }
        if (source.ProductGroup != null) {
            this.ProductGroup = new String(source.ProductGroup);
        }
        if (source.AssetTotal != null) {
            this.AssetTotal = new Long(source.AssetTotal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArrayObj(map, prefix + "Regions.", this.Regions);
        this.setParamSimple(map, prefix + "ProductDisplayName", this.ProductDisplayName);
        this.setParamSimple(map, prefix + "ProductGroup", this.ProductGroup);
        this.setParamSimple(map, prefix + "AssetTotal", this.AssetTotal);

    }
}

