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
    * Image cropping type. Selectable values: Circle and Rectangle.
<li>Circle: Inscribed circle cropping, with the output image radius as Radius.</li>
<li>Rectangle: Rectangular crop. The output image width is Width and height is Height.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Width of the output image in pixels. Valid when Type is Rectangle.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Height of the output image. Unit: pixel. Valid when Type is Rectangle.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Radius of the output image. Unit: pixel. Valid when Type is Circle.
    */
    @SerializedName("Radius")
    @Expose
    private Long Radius;

    /**
     * Get Image cropping type. Selectable values: Circle and Rectangle.
<li>Circle: Inscribed circle cropping, with the output image radius as Radius.</li>
<li>Rectangle: Rectangular crop. The output image width is Width and height is Height.</li> 
     * @return Type Image cropping type. Selectable values: Circle and Rectangle.
<li>Circle: Inscribed circle cropping, with the output image radius as Radius.</li>
<li>Rectangle: Rectangular crop. The output image width is Width and height is Height.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Image cropping type. Selectable values: Circle and Rectangle.
<li>Circle: Inscribed circle cropping, with the output image radius as Radius.</li>
<li>Rectangle: Rectangular crop. The output image width is Width and height is Height.</li>
     * @param Type Image cropping type. Selectable values: Circle and Rectangle.
<li>Circle: Inscribed circle cropping, with the output image radius as Radius.</li>
<li>Rectangle: Rectangular crop. The output image width is Width and height is Height.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Width of the output image in pixels. Valid when Type is Rectangle. 
     * @return Width Width of the output image in pixels. Valid when Type is Rectangle.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width of the output image in pixels. Valid when Type is Rectangle.
     * @param Width Width of the output image in pixels. Valid when Type is Rectangle.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Height of the output image. Unit: pixel. Valid when Type is Rectangle. 
     * @return Height Height of the output image. Unit: pixel. Valid when Type is Rectangle.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height of the output image. Unit: pixel. Valid when Type is Rectangle.
     * @param Height Height of the output image. Unit: pixel. Valid when Type is Rectangle.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Radius of the output image. Unit: pixel. Valid when Type is Circle. 
     * @return Radius Radius of the output image. Unit: pixel. Valid when Type is Circle.
     */
    public Long getRadius() {
        return this.Radius;
    }

    /**
     * Set Radius of the output image. Unit: pixel. Valid when Type is Circle.
     * @param Radius Radius of the output image. Unit: pixel. Valid when Type is Circle.
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

