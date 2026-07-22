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
    * <p>AI image generation scenario type, available values:</p><ul><li><code>ai_try_on</code>: AI dress up.</li><li><code>product_image</code>: AI product image.</li><li><code>outpainting</code>: AI outpainting.</li></ul><p>The following <code>Type</code> are abandoned and no longer updated subsequently:</p><ul><li><code>change_clothes</code></li><li><code>change_clothes_under</code></li><li><code>change_clothes_top_wear</code></li><li><code>change_clothes_bottom_wear</code></li><li><code>change_clothes_full_wear</code></li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Required when Type is ai_try_on. Represents AI dress up config.</p>
    */
    @SerializedName("AiTryOnConfig")
    @Expose
    private AiTryOnConfig AiTryOnConfig;

    /**
    * <p><strong>Abandoned, please use AiTryOnConfig.</strong> When Type is one of the following column types, this item is required and represents AI try-on image generation configuration parameters:</p><ul><li>change_clothes</li><li>change_clothes_under</li></ul>
    */
    @SerializedName("ChangeClothesConfig")
    @Expose
    private ChangeClothesConfig ChangeClothesConfig;

    /**
    * <p>Required when Type is product_image. It represents the AI product image config.</p>
    */
    @SerializedName("ProductImageConfig")
    @Expose
    private ProductImageConfig ProductImageConfig;

    /**
     * Get <p>AI image generation scenario type, available values:</p><ul><li><code>ai_try_on</code>: AI dress up.</li><li><code>product_image</code>: AI product image.</li><li><code>outpainting</code>: AI outpainting.</li></ul><p>The following <code>Type</code> are abandoned and no longer updated subsequently:</p><ul><li><code>change_clothes</code></li><li><code>change_clothes_under</code></li><li><code>change_clothes_top_wear</code></li><li><code>change_clothes_bottom_wear</code></li><li><code>change_clothes_full_wear</code></li></ul> 
     * @return Type <p>AI image generation scenario type, available values:</p><ul><li><code>ai_try_on</code>: AI dress up.</li><li><code>product_image</code>: AI product image.</li><li><code>outpainting</code>: AI outpainting.</li></ul><p>The following <code>Type</code> are abandoned and no longer updated subsequently:</p><ul><li><code>change_clothes</code></li><li><code>change_clothes_under</code></li><li><code>change_clothes_top_wear</code></li><li><code>change_clothes_bottom_wear</code></li><li><code>change_clothes_full_wear</code></li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>AI image generation scenario type, available values:</p><ul><li><code>ai_try_on</code>: AI dress up.</li><li><code>product_image</code>: AI product image.</li><li><code>outpainting</code>: AI outpainting.</li></ul><p>The following <code>Type</code> are abandoned and no longer updated subsequently:</p><ul><li><code>change_clothes</code></li><li><code>change_clothes_under</code></li><li><code>change_clothes_top_wear</code></li><li><code>change_clothes_bottom_wear</code></li><li><code>change_clothes_full_wear</code></li></ul>
     * @param Type <p>AI image generation scenario type, available values:</p><ul><li><code>ai_try_on</code>: AI dress up.</li><li><code>product_image</code>: AI product image.</li><li><code>outpainting</code>: AI outpainting.</li></ul><p>The following <code>Type</code> are abandoned and no longer updated subsequently:</p><ul><li><code>change_clothes</code></li><li><code>change_clothes_under</code></li><li><code>change_clothes_top_wear</code></li><li><code>change_clothes_bottom_wear</code></li><li><code>change_clothes_full_wear</code></li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Required when Type is ai_try_on. Represents AI dress up config.</p> 
     * @return AiTryOnConfig <p>Required when Type is ai_try_on. Represents AI dress up config.</p>
     */
    public AiTryOnConfig getAiTryOnConfig() {
        return this.AiTryOnConfig;
    }

    /**
     * Set <p>Required when Type is ai_try_on. Represents AI dress up config.</p>
     * @param AiTryOnConfig <p>Required when Type is ai_try_on. Represents AI dress up config.</p>
     */
    public void setAiTryOnConfig(AiTryOnConfig AiTryOnConfig) {
        this.AiTryOnConfig = AiTryOnConfig;
    }

    /**
     * Get <p><strong>Abandoned, please use AiTryOnConfig.</strong> When Type is one of the following column types, this item is required and represents AI try-on image generation configuration parameters:</p><ul><li>change_clothes</li><li>change_clothes_under</li></ul> 
     * @return ChangeClothesConfig <p><strong>Abandoned, please use AiTryOnConfig.</strong> When Type is one of the following column types, this item is required and represents AI try-on image generation configuration parameters:</p><ul><li>change_clothes</li><li>change_clothes_under</li></ul>
     */
    public ChangeClothesConfig getChangeClothesConfig() {
        return this.ChangeClothesConfig;
    }

    /**
     * Set <p><strong>Abandoned, please use AiTryOnConfig.</strong> When Type is one of the following column types, this item is required and represents AI try-on image generation configuration parameters:</p><ul><li>change_clothes</li><li>change_clothes_under</li></ul>
     * @param ChangeClothesConfig <p><strong>Abandoned, please use AiTryOnConfig.</strong> When Type is one of the following column types, this item is required and represents AI try-on image generation configuration parameters:</p><ul><li>change_clothes</li><li>change_clothes_under</li></ul>
     */
    public void setChangeClothesConfig(ChangeClothesConfig ChangeClothesConfig) {
        this.ChangeClothesConfig = ChangeClothesConfig;
    }

    /**
     * Get <p>Required when Type is product_image. It represents the AI product image config.</p> 
     * @return ProductImageConfig <p>Required when Type is product_image. It represents the AI product image config.</p>
     */
    public ProductImageConfig getProductImageConfig() {
        return this.ProductImageConfig;
    }

    /**
     * Set <p>Required when Type is product_image. It represents the AI product image config.</p>
     * @param ProductImageConfig <p>Required when Type is product_image. It represents the AI product image config.</p>
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
        if (source.AiTryOnConfig != null) {
            this.AiTryOnConfig = new AiTryOnConfig(source.AiTryOnConfig);
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
        this.setParamObj(map, prefix + "AiTryOnConfig.", this.AiTryOnConfig);
        this.setParamObj(map, prefix + "ChangeClothesConfig.", this.ChangeClothesConfig);
        this.setParamObj(map, prefix + "ProductImageConfig.", this.ProductImageConfig);

    }
}

