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

public class VulVendorProduct extends AbstractModel {

    /**
    * <p>supplier</p>
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
    * <p>Product name.</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>Affected version</p>
    */
    @SerializedName("VersionRange")
    @Expose
    private String [] VersionRange;

    /**
     * Get <p>supplier</p> 
     * @return Vendor <p>supplier</p>
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set <p>supplier</p>
     * @param Vendor <p>supplier</p>
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get <p>Product name.</p> 
     * @return Product <p>Product name.</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>Product name.</p>
     * @param Product <p>Product name.</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>Affected version</p> 
     * @return VersionRange <p>Affected version</p>
     */
    public String [] getVersionRange() {
        return this.VersionRange;
    }

    /**
     * Set <p>Affected version</p>
     * @param VersionRange <p>Affected version</p>
     */
    public void setVersionRange(String [] VersionRange) {
        this.VersionRange = VersionRange;
    }

    public VulVendorProduct() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulVendorProduct(VulVendorProduct source) {
        if (source.Vendor != null) {
            this.Vendor = new String(source.Vendor);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.VersionRange != null) {
            this.VersionRange = new String[source.VersionRange.length];
            for (int i = 0; i < source.VersionRange.length; i++) {
                this.VersionRange[i] = new String(source.VersionRange[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "VersionRange.", this.VersionRange);

    }
}

