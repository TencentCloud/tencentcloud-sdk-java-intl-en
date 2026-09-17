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
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("AiTryOnConfig")
    @Expose
    private AiTryOnConfig AiTryOnConfig;

    /**
    * 
    */
    @SerializedName("ChangeClothesConfig")
    @Expose
    private ChangeClothesConfig ChangeClothesConfig;

    /**
    * 
    */
    @SerializedName("ProductImageConfig")
    @Expose
    private ProductImageConfig ProductImageConfig;

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return AiTryOnConfig 
     */
    public AiTryOnConfig getAiTryOnConfig() {
        return this.AiTryOnConfig;
    }

    /**
     * Set 
     * @param AiTryOnConfig 
     */
    public void setAiTryOnConfig(AiTryOnConfig AiTryOnConfig) {
        this.AiTryOnConfig = AiTryOnConfig;
    }

    /**
     * Get  
     * @return ChangeClothesConfig 
     */
    public ChangeClothesConfig getChangeClothesConfig() {
        return this.ChangeClothesConfig;
    }

    /**
     * Set 
     * @param ChangeClothesConfig 
     */
    public void setChangeClothesConfig(ChangeClothesConfig ChangeClothesConfig) {
        this.ChangeClothesConfig = ChangeClothesConfig;
    }

    /**
     * Get  
     * @return ProductImageConfig 
     */
    public ProductImageConfig getProductImageConfig() {
        return this.ProductImageConfig;
    }

    /**
     * Set 
     * @param ProductImageConfig 
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

