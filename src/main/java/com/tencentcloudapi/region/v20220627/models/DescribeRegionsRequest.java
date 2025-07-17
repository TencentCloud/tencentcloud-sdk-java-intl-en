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
package com.tencentcloudapi.region.v20220627.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRegionsRequest extends AbstractModel {

    /**
    * Name of the product to be queried, such as cvm. for specific value, query the DescribeProducts api.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Not passed or 0 means no query [optional business allowlist], 1 means query [optional business allowlist]. if this parameter is set to 1, the allowlist will only be queried when no business allowlist is found.
    */
    @SerializedName("Scene")
    @Expose
    private Long Scene;

    /**
     * Get Name of the product to be queried, such as cvm. for specific value, query the DescribeProducts api. 
     * @return Product Name of the product to be queried, such as cvm. for specific value, query the DescribeProducts api.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Name of the product to be queried, such as cvm. for specific value, query the DescribeProducts api.
     * @param Product Name of the product to be queried, such as cvm. for specific value, query the DescribeProducts api.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Not passed or 0 means no query [optional business allowlist], 1 means query [optional business allowlist]. if this parameter is set to 1, the allowlist will only be queried when no business allowlist is found. 
     * @return Scene Not passed or 0 means no query [optional business allowlist], 1 means query [optional business allowlist]. if this parameter is set to 1, the allowlist will only be queried when no business allowlist is found.
     */
    public Long getScene() {
        return this.Scene;
    }

    /**
     * Set Not passed or 0 means no query [optional business allowlist], 1 means query [optional business allowlist]. if this parameter is set to 1, the allowlist will only be queried when no business allowlist is found.
     * @param Scene Not passed or 0 means no query [optional business allowlist], 1 means query [optional business allowlist]. if this parameter is set to 1, the allowlist will only be queried when no business allowlist is found.
     */
    public void setScene(Long Scene) {
        this.Scene = Scene;
    }

    public DescribeRegionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegionsRequest(DescribeRegionsRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Scene != null) {
            this.Scene = new Long(source.Scene);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Scene", this.Scene);

    }
}

