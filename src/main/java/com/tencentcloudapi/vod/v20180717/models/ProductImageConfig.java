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

public class ProductImageConfig extends AbstractModel {

    /**
    * Prompt for generating the image background. If this field is default, inspiration is generated automatically.
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * Prompt used to prevent the model from image generation.
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * A detailed product description helps generate images that better meet requirements.
    */
    @SerializedName("ProductDesc")
    @Expose
    private String ProductDesc;

    /**
    * Special requirements. If any, input them through this field.
    */
    @SerializedName("MoreRequirement")
    @Expose
    private String MoreRequirement;

    /**
    * Number of images expected to be generated. Default value: 1. Maximum valid value: 10.
    */
    @SerializedName("OutputImageCount")
    @Expose
    private Long OutputImageCount;

    /**
     * Get Prompt for generating the image background. If this field is default, inspiration is generated automatically. 
     * @return Prompt Prompt for generating the image background. If this field is default, inspiration is generated automatically.
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set Prompt for generating the image background. If this field is default, inspiration is generated automatically.
     * @param Prompt Prompt for generating the image background. If this field is default, inspiration is generated automatically.
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get Prompt used to prevent the model from image generation. 
     * @return NegativePrompt Prompt used to prevent the model from image generation.
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set Prompt used to prevent the model from image generation.
     * @param NegativePrompt Prompt used to prevent the model from image generation.
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get A detailed product description helps generate images that better meet requirements. 
     * @return ProductDesc A detailed product description helps generate images that better meet requirements.
     */
    public String getProductDesc() {
        return this.ProductDesc;
    }

    /**
     * Set A detailed product description helps generate images that better meet requirements.
     * @param ProductDesc A detailed product description helps generate images that better meet requirements.
     */
    public void setProductDesc(String ProductDesc) {
        this.ProductDesc = ProductDesc;
    }

    /**
     * Get Special requirements. If any, input them through this field. 
     * @return MoreRequirement Special requirements. If any, input them through this field.
     */
    public String getMoreRequirement() {
        return this.MoreRequirement;
    }

    /**
     * Set Special requirements. If any, input them through this field.
     * @param MoreRequirement Special requirements. If any, input them through this field.
     */
    public void setMoreRequirement(String MoreRequirement) {
        this.MoreRequirement = MoreRequirement;
    }

    /**
     * Get Number of images expected to be generated. Default value: 1. Maximum valid value: 10. 
     * @return OutputImageCount Number of images expected to be generated. Default value: 1. Maximum valid value: 10.
     */
    public Long getOutputImageCount() {
        return this.OutputImageCount;
    }

    /**
     * Set Number of images expected to be generated. Default value: 1. Maximum valid value: 10.
     * @param OutputImageCount Number of images expected to be generated. Default value: 1. Maximum valid value: 10.
     */
    public void setOutputImageCount(Long OutputImageCount) {
        this.OutputImageCount = OutputImageCount;
    }

    public ProductImageConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductImageConfig(ProductImageConfig source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.NegativePrompt != null) {
            this.NegativePrompt = new String(source.NegativePrompt);
        }
        if (source.ProductDesc != null) {
            this.ProductDesc = new String(source.ProductDesc);
        }
        if (source.MoreRequirement != null) {
            this.MoreRequirement = new String(source.MoreRequirement);
        }
        if (source.OutputImageCount != null) {
            this.OutputImageCount = new Long(source.OutputImageCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "ProductDesc", this.ProductDesc);
        this.setParamSimple(map, prefix + "MoreRequirement", this.MoreRequirement);
        this.setParamSimple(map, prefix + "OutputImageCount", this.OutputImageCount);

    }
}

