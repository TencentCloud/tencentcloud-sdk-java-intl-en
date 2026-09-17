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

public class ImageBlur extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("Radius")
    @Expose
    private Long Radius;

    /**
    * 
    */
    @SerializedName("Sigma")
    @Expose
    private Long Sigma;

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
     * @return Radius 
     */
    public Long getRadius() {
        return this.Radius;
    }

    /**
     * Set 
     * @param Radius 
     */
    public void setRadius(Long Radius) {
        this.Radius = Radius;
    }

    /**
     * Get  
     * @return Sigma 
     */
    public Long getSigma() {
        return this.Sigma;
    }

    /**
     * Set 
     * @param Sigma 
     */
    public void setSigma(Long Sigma) {
        this.Sigma = Sigma;
    }

    public ImageBlur() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageBlur(ImageBlur source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Radius != null) {
            this.Radius = new Long(source.Radius);
        }
        if (source.Sigma != null) {
            this.Sigma = new Long(source.Sigma);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Radius", this.Radius);
        this.setParamSimple(map, prefix + "Sigma", this.Sigma);

    }
}

