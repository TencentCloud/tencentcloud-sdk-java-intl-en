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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProductRequest extends AbstractModel {

    /**
    * Product name, which cannot be same as that of an existing product. Naming rule: [a-zA-Z0-9:_-]{1,32}.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Product properties
    */
    @SerializedName("ProductProperties")
    @Expose
    private ProductProperties ProductProperties;

    /**
    * Skey, which is required to create a CLAA product.
    */
    @SerializedName("Skey")
    @Expose
    private String Skey;

    /**
     * Get Product name, which cannot be same as that of an existing product. Naming rule: [a-zA-Z0-9:_-]{1,32}. 
     * @return ProductName Product name, which cannot be same as that of an existing product. Naming rule: [a-zA-Z0-9:_-]{1,32}.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product name, which cannot be same as that of an existing product. Naming rule: [a-zA-Z0-9:_-]{1,32}.
     * @param ProductName Product name, which cannot be same as that of an existing product. Naming rule: [a-zA-Z0-9:_-]{1,32}.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
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

    /**
     * Get Skey, which is required to create a CLAA product. 
     * @return Skey Skey, which is required to create a CLAA product.
     */
    public String getSkey() {
        return this.Skey;
    }

    /**
     * Set Skey, which is required to create a CLAA product.
     * @param Skey Skey, which is required to create a CLAA product.
     */
    public void setSkey(String Skey) {
        this.Skey = Skey;
    }

    public CreateProductRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProductRequest(CreateProductRequest source) {
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProductProperties != null) {
            this.ProductProperties = new ProductProperties(source.ProductProperties);
        }
        if (source.Skey != null) {
            this.Skey = new String(source.Skey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamObj(map, prefix + "ProductProperties.", this.ProductProperties);
        this.setParamSimple(map, prefix + "Skey", this.Skey);

    }
}

