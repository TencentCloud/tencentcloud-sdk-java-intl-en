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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcVideoSceneInfo extends AbstractModel {

    /**
    * AI video scenario type. Optional values:
-product_showcase: Show the product in 360 degrees.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Product display parameter
    */
    @SerializedName("ProductShowcaseConfig")
    @Expose
    private ProductShowcaseConfig ProductShowcaseConfig;

    /**
     * Get AI video scenario type. Optional values:
-product_showcase: Show the product in 360 degrees. 
     * @return Type AI video scenario type. Optional values:
-product_showcase: Show the product in 360 degrees.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set AI video scenario type. Optional values:
-product_showcase: Show the product in 360 degrees.
     * @param Type AI video scenario type. Optional values:
-product_showcase: Show the product in 360 degrees.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Product display parameter 
     * @return ProductShowcaseConfig Product display parameter
     */
    public ProductShowcaseConfig getProductShowcaseConfig() {
        return this.ProductShowcaseConfig;
    }

    /**
     * Set Product display parameter
     * @param ProductShowcaseConfig Product display parameter
     */
    public void setProductShowcaseConfig(ProductShowcaseConfig ProductShowcaseConfig) {
        this.ProductShowcaseConfig = ProductShowcaseConfig;
    }

    public AigcVideoSceneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoSceneInfo(AigcVideoSceneInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ProductShowcaseConfig != null) {
            this.ProductShowcaseConfig = new ProductShowcaseConfig(source.ProductShowcaseConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "ProductShowcaseConfig.", this.ProductShowcaseConfig);

    }
}

