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
    * Operation type for blurry images. Optional modes:
<li>Gaussian: Gaussian blur.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Blur radius. Value range: 1–50. This field is valid when Type is Gaussian.
    */
    @SerializedName("Radius")
    @Expose
    private Long Radius;

    /**
    * Standard deviation of the normal distribution. Must be greater than 0. This field is valid when Type is Gaussian.
    */
    @SerializedName("Sigma")
    @Expose
    private Long Sigma;

    /**
     * Get Operation type for blurry images. Optional modes:
<li>Gaussian: Gaussian blur.</li> 
     * @return Type Operation type for blurry images. Optional modes:
<li>Gaussian: Gaussian blur.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Operation type for blurry images. Optional modes:
<li>Gaussian: Gaussian blur.</li>
     * @param Type Operation type for blurry images. Optional modes:
<li>Gaussian: Gaussian blur.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Blur radius. Value range: 1–50. This field is valid when Type is Gaussian. 
     * @return Radius Blur radius. Value range: 1–50. This field is valid when Type is Gaussian.
     */
    public Long getRadius() {
        return this.Radius;
    }

    /**
     * Set Blur radius. Value range: 1–50. This field is valid when Type is Gaussian.
     * @param Radius Blur radius. Value range: 1–50. This field is valid when Type is Gaussian.
     */
    public void setRadius(Long Radius) {
        this.Radius = Radius;
    }

    /**
     * Get Standard deviation of the normal distribution. Must be greater than 0. This field is valid when Type is Gaussian. 
     * @return Sigma Standard deviation of the normal distribution. Must be greater than 0. This field is valid when Type is Gaussian.
     */
    public Long getSigma() {
        return this.Sigma;
    }

    /**
     * Set Standard deviation of the normal distribution. Must be greater than 0. This field is valid when Type is Gaussian.
     * @param Sigma Standard deviation of the normal distribution. Must be greater than 0. This field is valid when Type is Gaussian.
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

