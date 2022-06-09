/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductInfo extends AbstractModel{

    /**
    * Product ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * Product name
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Product metadata
    */
    @SerializedName("ProductMetadata")
    @Expose
    private ProductMetadata ProductMetadata;

    /**
    * Product properties
    */
    @SerializedName("ProductProperties")
    @Expose
    private ProductProperties ProductProperties;

    /**
     * Get Product ID 
     * @return ProductId Product ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set Product ID
     * @param ProductId Product ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
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
     * Get Product metadata 
     * @return ProductMetadata Product metadata
     */
    public ProductMetadata getProductMetadata() {
        return this.ProductMetadata;
    }

    /**
     * Set Product metadata
     * @param ProductMetadata Product metadata
     */
    public void setProductMetadata(ProductMetadata ProductMetadata) {
        this.ProductMetadata = ProductMetadata;
    }

    /**
     * Get Product properties 
     * @return ProductProperties Product properties
     */
    public ProductProperties getProductProperties() {
        return this.ProductProperties;
    }

    /**
     * Set Product properties
     * @param ProductProperties Product properties
     */
    public void setProductProperties(ProductProperties ProductProperties) {
        this.ProductProperties = ProductProperties;
    }

    public ProductInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductInfo(ProductInfo source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProductMetadata != null) {
            this.ProductMetadata = new ProductMetadata(source.ProductMetadata);
        }
        if (source.ProductProperties != null) {
            this.ProductProperties = new ProductProperties(source.ProductProperties);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamObj(map, prefix + "ProductMetadata.", this.ProductMetadata);
        this.setParamObj(map, prefix + "ProductProperties.", this.ProductProperties);

    }
}

