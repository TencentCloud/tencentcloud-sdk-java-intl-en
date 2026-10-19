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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigResource extends AbstractModel {

    /**
    * product
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Product name
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Resource type.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Resource type name
    */
    @SerializedName("ResourceTypeName")
    @Expose
    private String ResourceTypeName;

    /**
     * Get product 
     * @return Product product
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set product
     * @param Product product
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Product name 
     * @return ProductName Product name
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product name
     * @param ProductName Product name
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Resource type. 
     * @return ResourceType Resource type.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type.
     * @param ResourceType Resource type.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Resource type name 
     * @return ResourceTypeName Resource type name
     */
    public String getResourceTypeName() {
        return this.ResourceTypeName;
    }

    /**
     * Set Resource type name
     * @param ResourceTypeName Resource type name
     */
    public void setResourceTypeName(String ResourceTypeName) {
        this.ResourceTypeName = ResourceTypeName;
    }

    public ConfigResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigResource(ConfigResource source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceTypeName != null) {
            this.ResourceTypeName = new String(source.ResourceTypeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceTypeName", this.ResourceTypeName);

    }
}

