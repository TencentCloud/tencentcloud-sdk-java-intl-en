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

public class ImageOperation extends AbstractModel {

    /**
    * Image processing type. Optional types:
<li>Scale: Image thumbnail processing;</li>
<li>CenterCut: image cropping;</li>
<li>Blur: fuzzily process an image.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Image thumbnail processing. This parameter is valid only when Type is Scale.
    */
    @SerializedName("Scale")
    @Expose
    private ImageScale Scale;

    /**
    * Image crop processing. Valid only when Type is CenterCut.
    */
    @SerializedName("CenterCut")
    @Expose
    private ImageCenterCut CenterCut;

    /**
    * Blur the image. This parameter is valid only when Type is Blur.
    */
    @SerializedName("Blur")
    @Expose
    private ImageBlur Blur;

    /**
     * Get Image processing type. Optional types:
<li>Scale: Image thumbnail processing;</li>
<li>CenterCut: image cropping;</li>
<li>Blur: fuzzily process an image.</li> 
     * @return Type Image processing type. Optional types:
<li>Scale: Image thumbnail processing;</li>
<li>CenterCut: image cropping;</li>
<li>Blur: fuzzily process an image.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Image processing type. Optional types:
<li>Scale: Image thumbnail processing;</li>
<li>CenterCut: image cropping;</li>
<li>Blur: fuzzily process an image.</li>
     * @param Type Image processing type. Optional types:
<li>Scale: Image thumbnail processing;</li>
<li>CenterCut: image cropping;</li>
<li>Blur: fuzzily process an image.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Image thumbnail processing. This parameter is valid only when Type is Scale. 
     * @return Scale Image thumbnail processing. This parameter is valid only when Type is Scale.
     */
    public ImageScale getScale() {
        return this.Scale;
    }

    /**
     * Set Image thumbnail processing. This parameter is valid only when Type is Scale.
     * @param Scale Image thumbnail processing. This parameter is valid only when Type is Scale.
     */
    public void setScale(ImageScale Scale) {
        this.Scale = Scale;
    }

    /**
     * Get Image crop processing. Valid only when Type is CenterCut. 
     * @return CenterCut Image crop processing. Valid only when Type is CenterCut.
     */
    public ImageCenterCut getCenterCut() {
        return this.CenterCut;
    }

    /**
     * Set Image crop processing. Valid only when Type is CenterCut.
     * @param CenterCut Image crop processing. Valid only when Type is CenterCut.
     */
    public void setCenterCut(ImageCenterCut CenterCut) {
        this.CenterCut = CenterCut;
    }

    /**
     * Get Blur the image. This parameter is valid only when Type is Blur. 
     * @return Blur Blur the image. This parameter is valid only when Type is Blur.
     */
    public ImageBlur getBlur() {
        return this.Blur;
    }

    /**
     * Set Blur the image. This parameter is valid only when Type is Blur.
     * @param Blur Blur the image. This parameter is valid only when Type is Blur.
     */
    public void setBlur(ImageBlur Blur) {
        this.Blur = Blur;
    }

    public ImageOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageOperation(ImageOperation source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Scale != null) {
            this.Scale = new ImageScale(source.Scale);
        }
        if (source.CenterCut != null) {
            this.CenterCut = new ImageCenterCut(source.CenterCut);
        }
        if (source.Blur != null) {
            this.Blur = new ImageBlur(source.Blur);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Scale.", this.Scale);
        this.setParamObj(map, prefix + "CenterCut.", this.CenterCut);
        this.setParamObj(map, prefix + "Blur.", this.Blur);

    }
}

