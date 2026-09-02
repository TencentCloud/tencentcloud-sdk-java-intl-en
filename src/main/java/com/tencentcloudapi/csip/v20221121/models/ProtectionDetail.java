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

public class ProtectionDetail extends AbstractModel {

    /**
    * Enablement status of each configuration item
    */
    @SerializedName("ConfigItems")
    @Expose
    private ProtectionConfigItem [] ConfigItems;

    /**
    * Number of assets to protect
    */
    @SerializedName("EligibleAssetCount")
    @Expose
    private Long EligibleAssetCount;

    /**
    * Number of protected assets
    */
    @SerializedName("ProtectedAssetCount")
    @Expose
    private Long ProtectedAssetCount;

    /**
    * Coverage percentage.
Value range: [0, 100].
    */
    @SerializedName("CoveragePercent")
    @Expose
    private Long CoveragePercent;

    /**
    * List of products about to expire
    */
    @SerializedName("ExpiringProducts")
    @Expose
    private ExpiringProduct [] ExpiringProducts;

    /**
     * Get Enablement status of each configuration item 
     * @return ConfigItems Enablement status of each configuration item
     */
    public ProtectionConfigItem [] getConfigItems() {
        return this.ConfigItems;
    }

    /**
     * Set Enablement status of each configuration item
     * @param ConfigItems Enablement status of each configuration item
     */
    public void setConfigItems(ProtectionConfigItem [] ConfigItems) {
        this.ConfigItems = ConfigItems;
    }

    /**
     * Get Number of assets to protect 
     * @return EligibleAssetCount Number of assets to protect
     */
    public Long getEligibleAssetCount() {
        return this.EligibleAssetCount;
    }

    /**
     * Set Number of assets to protect
     * @param EligibleAssetCount Number of assets to protect
     */
    public void setEligibleAssetCount(Long EligibleAssetCount) {
        this.EligibleAssetCount = EligibleAssetCount;
    }

    /**
     * Get Number of protected assets 
     * @return ProtectedAssetCount Number of protected assets
     */
    public Long getProtectedAssetCount() {
        return this.ProtectedAssetCount;
    }

    /**
     * Set Number of protected assets
     * @param ProtectedAssetCount Number of protected assets
     */
    public void setProtectedAssetCount(Long ProtectedAssetCount) {
        this.ProtectedAssetCount = ProtectedAssetCount;
    }

    /**
     * Get Coverage percentage.
Value range: [0, 100]. 
     * @return CoveragePercent Coverage percentage.
Value range: [0, 100].
     */
    public Long getCoveragePercent() {
        return this.CoveragePercent;
    }

    /**
     * Set Coverage percentage.
Value range: [0, 100].
     * @param CoveragePercent Coverage percentage.
Value range: [0, 100].
     */
    public void setCoveragePercent(Long CoveragePercent) {
        this.CoveragePercent = CoveragePercent;
    }

    /**
     * Get List of products about to expire 
     * @return ExpiringProducts List of products about to expire
     */
    public ExpiringProduct [] getExpiringProducts() {
        return this.ExpiringProducts;
    }

    /**
     * Set List of products about to expire
     * @param ExpiringProducts List of products about to expire
     */
    public void setExpiringProducts(ExpiringProduct [] ExpiringProducts) {
        this.ExpiringProducts = ExpiringProducts;
    }

    public ProtectionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectionDetail(ProtectionDetail source) {
        if (source.ConfigItems != null) {
            this.ConfigItems = new ProtectionConfigItem[source.ConfigItems.length];
            for (int i = 0; i < source.ConfigItems.length; i++) {
                this.ConfigItems[i] = new ProtectionConfigItem(source.ConfigItems[i]);
            }
        }
        if (source.EligibleAssetCount != null) {
            this.EligibleAssetCount = new Long(source.EligibleAssetCount);
        }
        if (source.ProtectedAssetCount != null) {
            this.ProtectedAssetCount = new Long(source.ProtectedAssetCount);
        }
        if (source.CoveragePercent != null) {
            this.CoveragePercent = new Long(source.CoveragePercent);
        }
        if (source.ExpiringProducts != null) {
            this.ExpiringProducts = new ExpiringProduct[source.ExpiringProducts.length];
            for (int i = 0; i < source.ExpiringProducts.length; i++) {
                this.ExpiringProducts[i] = new ExpiringProduct(source.ExpiringProducts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ConfigItems.", this.ConfigItems);
        this.setParamSimple(map, prefix + "EligibleAssetCount", this.EligibleAssetCount);
        this.setParamSimple(map, prefix + "ProtectedAssetCount", this.ProtectedAssetCount);
        this.setParamSimple(map, prefix + "CoveragePercent", this.CoveragePercent);
        this.setParamArrayObj(map, prefix + "ExpiringProducts.", this.ExpiringProducts);

    }
}

