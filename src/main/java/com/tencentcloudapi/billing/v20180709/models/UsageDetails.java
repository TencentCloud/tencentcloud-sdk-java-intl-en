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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageDetails extends AbstractModel {

    /**
    * The name of the product.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 
    */
    @SerializedName("SubProductName")
    @Expose
    private String SubProductName;

    /**
     * Get The name of the product.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ProductName The name of the product.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set The name of the product.
Note: This field may return `null`, indicating that no valid value was found.
     * @param ProductName The name of the product.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get  
     * @return SubProductName 
     */
    public String getSubProductName() {
        return this.SubProductName;
    }

    /**
     * Set 
     * @param SubProductName 
     */
    public void setSubProductName(String SubProductName) {
        this.SubProductName = SubProductName;
    }

    public UsageDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageDetails(UsageDetails source) {
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.SubProductName != null) {
            this.SubProductName = new String(source.SubProductName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "SubProductName", this.SubProductName);

    }
}

