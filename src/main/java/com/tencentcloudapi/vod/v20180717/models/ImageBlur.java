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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageBlur extends AbstractModel{

    /**
    * The blur type. Valid values:
<li>`Gaussian`</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The radius of the blur. Value range: 1-50. This parameter is valid if `Type` is `Gaussian`.
    */
    @SerializedName("Radius")
    @Expose
    private Long Radius;

    /**
    * The standard deviation of the Gaussian distribution, which must be greater than 0. This parameter is valid if `Type` is `Gaussian`.
    */
    @SerializedName("Sigma")
    @Expose
    private Long Sigma;

    /**
     * Get The blur type. Valid values:
<li>`Gaussian`</li> 
     * @return Type The blur type. Valid values:
<li>`Gaussian`</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The blur type. Valid values:
<li>`Gaussian`</li>
     * @param Type The blur type. Valid values:
<li>`Gaussian`</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The radius of the blur. Value range: 1-50. This parameter is valid if `Type` is `Gaussian`. 
     * @return Radius The radius of the blur. Value range: 1-50. This parameter is valid if `Type` is `Gaussian`.
     */
    public Long getRadius() {
        return this.Radius;
    }

    /**
     * Set The radius of the blur. Value range: 1-50. This parameter is valid if `Type` is `Gaussian`.
     * @param Radius The radius of the blur. Value range: 1-50. This parameter is valid if `Type` is `Gaussian`.
     */
    public void setRadius(Long Radius) {
        this.Radius = Radius;
    }

    /**
     * Get The standard deviation of the Gaussian distribution, which must be greater than 0. This parameter is valid if `Type` is `Gaussian`. 
     * @return Sigma The standard deviation of the Gaussian distribution, which must be greater than 0. This parameter is valid if `Type` is `Gaussian`.
     */
    public Long getSigma() {
        return this.Sigma;
    }

    /**
     * Set The standard deviation of the Gaussian distribution, which must be greater than 0. This parameter is valid if `Type` is `Gaussian`.
     * @param Sigma The standard deviation of the Gaussian distribution, which must be greater than 0. This parameter is valid if `Type` is `Gaussian`.
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

