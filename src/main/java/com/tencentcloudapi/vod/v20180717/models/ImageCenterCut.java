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

public class ImageCenterCut extends AbstractModel {

    /**
    * The cropping type. Valid values:
<li>Circle: Cropping to circle. `Radius` specifies the radius of the output image.</li>
<li>Rectangle: Cropping to rectangle. `Width` and `Height` specify the width and height of the output image.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The width (pixels) of the output image. This parameter is valid if `Type` is `Rectangle`.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The height (pixels) of the output image. This parameter is valid if `Type` is `Rectangle`.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * The radius of the output image. This parameter is valid if `Type` is `Circle`.
    */
    @SerializedName("Radius")
    @Expose
    private Long Radius;

    /**
     * Get The cropping type. Valid values:
<li>Circle: Cropping to circle. `Radius` specifies the radius of the output image.</li>
<li>Rectangle: Cropping to rectangle. `Width` and `Height` specify the width and height of the output image.</li> 
     * @return Type The cropping type. Valid values:
<li>Circle: Cropping to circle. `Radius` specifies the radius of the output image.</li>
<li>Rectangle: Cropping to rectangle. `Width` and `Height` specify the width and height of the output image.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The cropping type. Valid values:
<li>Circle: Cropping to circle. `Radius` specifies the radius of the output image.</li>
<li>Rectangle: Cropping to rectangle. `Width` and `Height` specify the width and height of the output image.</li>
     * @param Type The cropping type. Valid values:
<li>Circle: Cropping to circle. `Radius` specifies the radius of the output image.</li>
<li>Rectangle: Cropping to rectangle. `Width` and `Height` specify the width and height of the output image.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The width (pixels) of the output image. This parameter is valid if `Type` is `Rectangle`. 
     * @return Width The width (pixels) of the output image. This parameter is valid if `Type` is `Rectangle`.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The width (pixels) of the output image. This parameter is valid if `Type` is `Rectangle`.
     * @param Width The width (pixels) of the output image. This parameter is valid if `Type` is `Rectangle`.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The height (pixels) of the output image. This parameter is valid if `Type` is `Rectangle`. 
     * @return Height The height (pixels) of the output image. This parameter is valid if `Type` is `Rectangle`.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The height (pixels) of the output image. This parameter is valid if `Type` is `Rectangle`.
     * @param Height The height (pixels) of the output image. This parameter is valid if `Type` is `Rectangle`.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get The radius of the output image. This parameter is valid if `Type` is `Circle`. 
     * @return Radius The radius of the output image. This parameter is valid if `Type` is `Circle`.
     */
    public Long getRadius() {
        return this.Radius;
    }

    /**
     * Set The radius of the output image. This parameter is valid if `Type` is `Circle`.
     * @param Radius The radius of the output image. This parameter is valid if `Type` is `Circle`.
     */
    public void setRadius(Long Radius) {
        this.Radius = Radius;
    }

    public ImageCenterCut() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageCenterCut(ImageCenterCut source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Radius != null) {
            this.Radius = new Long(source.Radius);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Radius", this.Radius);

    }
}

