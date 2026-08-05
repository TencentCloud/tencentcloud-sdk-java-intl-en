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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneViralRequest extends AbstractModel {

    /**
    * <p>Viral video Url</p>
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * <p>Product information</p>
    */
    @SerializedName("Product")
    @Expose
    private CloneViralProduct Product;

    /**
    * <p>AIGC video-related parameters</p>
    */
    @SerializedName("AIGCParam")
    @Expose
    private CloneViralAIGC AIGCParam;

    /**
    * <p>Content/style-related parameters</p>
    */
    @SerializedName("ContentParam")
    @Expose
    private CloneViralContent ContentParam;

    /**
    * <p>Model appearance</p>
    */
    @SerializedName("Persona")
    @Expose
    private CloneViralPersona Persona;

    /**
     * Get <p>Viral video Url</p> 
     * @return VideoUrl <p>Viral video Url</p>
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set <p>Viral video Url</p>
     * @param VideoUrl <p>Viral video Url</p>
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get <p>Product information</p> 
     * @return Product <p>Product information</p>
     */
    public CloneViralProduct getProduct() {
        return this.Product;
    }

    /**
     * Set <p>Product information</p>
     * @param Product <p>Product information</p>
     */
    public void setProduct(CloneViralProduct Product) {
        this.Product = Product;
    }

    /**
     * Get <p>AIGC video-related parameters</p> 
     * @return AIGCParam <p>AIGC video-related parameters</p>
     */
    public CloneViralAIGC getAIGCParam() {
        return this.AIGCParam;
    }

    /**
     * Set <p>AIGC video-related parameters</p>
     * @param AIGCParam <p>AIGC video-related parameters</p>
     */
    public void setAIGCParam(CloneViralAIGC AIGCParam) {
        this.AIGCParam = AIGCParam;
    }

    /**
     * Get <p>Content/style-related parameters</p> 
     * @return ContentParam <p>Content/style-related parameters</p>
     */
    public CloneViralContent getContentParam() {
        return this.ContentParam;
    }

    /**
     * Set <p>Content/style-related parameters</p>
     * @param ContentParam <p>Content/style-related parameters</p>
     */
    public void setContentParam(CloneViralContent ContentParam) {
        this.ContentParam = ContentParam;
    }

    /**
     * Get <p>Model appearance</p> 
     * @return Persona <p>Model appearance</p>
     */
    public CloneViralPersona getPersona() {
        return this.Persona;
    }

    /**
     * Set <p>Model appearance</p>
     * @param Persona <p>Model appearance</p>
     */
    public void setPersona(CloneViralPersona Persona) {
        this.Persona = Persona;
    }

    public CloneViralRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneViralRequest(CloneViralRequest source) {
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.Product != null) {
            this.Product = new CloneViralProduct(source.Product);
        }
        if (source.AIGCParam != null) {
            this.AIGCParam = new CloneViralAIGC(source.AIGCParam);
        }
        if (source.ContentParam != null) {
            this.ContentParam = new CloneViralContent(source.ContentParam);
        }
        if (source.Persona != null) {
            this.Persona = new CloneViralPersona(source.Persona);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamObj(map, prefix + "Product.", this.Product);
        this.setParamObj(map, prefix + "AIGCParam.", this.AIGCParam);
        this.setParamObj(map, prefix + "ContentParam.", this.ContentParam);
        this.setParamObj(map, prefix + "Persona.", this.Persona);

    }
}

