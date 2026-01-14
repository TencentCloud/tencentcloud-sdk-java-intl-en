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

public class AigcImageSceneInfo extends AbstractModel {

    /**
    * AI image generation scenario type. valid values:
-change_clothes: AI clothing change.
-product_image: AI-generated product image.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Valid when Type is change_clothes. this item is required and indicates the AI clothes-changing image generation config.
    */
    @SerializedName("ChangeClothesConfig")
    @Expose
    private ChangeClothesConfig ChangeClothesConfig;

    /**
    * Valid when Type is product_image. indicates the AI-generated product image config.
    */
    @SerializedName("ProductImageConfig")
    @Expose
    private ProductImageConfig ProductImageConfig;

    /**
     * Get AI image generation scenario type. valid values:
-change_clothes: AI clothing change.
-product_image: AI-generated product image. 
     * @return Type AI image generation scenario type. valid values:
-change_clothes: AI clothing change.
-product_image: AI-generated product image.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set AI image generation scenario type. valid values:
-change_clothes: AI clothing change.
-product_image: AI-generated product image.
     * @param Type AI image generation scenario type. valid values:
-change_clothes: AI clothing change.
-product_image: AI-generated product image.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Valid when Type is change_clothes. this item is required and indicates the AI clothes-changing image generation config. 
     * @return ChangeClothesConfig Valid when Type is change_clothes. this item is required and indicates the AI clothes-changing image generation config.
     */
    public ChangeClothesConfig getChangeClothesConfig() {
        return this.ChangeClothesConfig;
    }

    /**
     * Set Valid when Type is change_clothes. this item is required and indicates the AI clothes-changing image generation config.
     * @param ChangeClothesConfig Valid when Type is change_clothes. this item is required and indicates the AI clothes-changing image generation config.
     */
    public void setChangeClothesConfig(ChangeClothesConfig ChangeClothesConfig) {
        this.ChangeClothesConfig = ChangeClothesConfig;
    }

    /**
     * Get Valid when Type is product_image. indicates the AI-generated product image config. 
     * @return ProductImageConfig Valid when Type is product_image. indicates the AI-generated product image config.
     */
    public ProductImageConfig getProductImageConfig() {
        return this.ProductImageConfig;
    }

    /**
     * Set Valid when Type is product_image. indicates the AI-generated product image config.
     * @param ProductImageConfig Valid when Type is product_image. indicates the AI-generated product image config.
     */
    public void setProductImageConfig(ProductImageConfig ProductImageConfig) {
        this.ProductImageConfig = ProductImageConfig;
    }

    public AigcImageSceneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcImageSceneInfo(AigcImageSceneInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ChangeClothesConfig != null) {
            this.ChangeClothesConfig = new ChangeClothesConfig(source.ChangeClothesConfig);
        }
        if (source.ProductImageConfig != null) {
            this.ProductImageConfig = new ProductImageConfig(source.ProductImageConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "ChangeClothesConfig.", this.ChangeClothesConfig);
        this.setParamObj(map, prefix + "ProductImageConfig.", this.ProductImageConfig);

    }
}

