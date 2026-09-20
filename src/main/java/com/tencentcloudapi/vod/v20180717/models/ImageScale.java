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

public class ImageScale extends AbstractModel {

    /**
    * Operation type of image scaling. Optional modes:
<li>WidthFirst: specify the image width as Width, and the height will be proportionally scaled.</li>
<li>HeightFirst: assign the image height as Height, and proportionally scale the width.</li>
<li>LongEdgeFirst: Specify the long side of the image as LongEdge, and proportionally scale the short side.</li>
<li>ShortEdgeFirst: Specify the short edge of the image as ShortEdge, with long edge proportional scaling.</li>
<li>Force: ignore the aspect ratio of the original image, specify the image width as Width and height as Height, and forcefully scale the image, which may cause deformation of the target image.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Height of the output image in pixels. This field is valid when Type is HeightFirst or Force.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Width of the output image. Unit: pixel. This field is valid when Type is WidthFirst or Force.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Long side length of the output image. Unit: pixel. This field is valid when Type is LongEdgeFirst.
    */
    @SerializedName("LongEdge")
    @Expose
    private Long LongEdge;

    /**
    * Short side length of the output image in pixels. This field is valid when Type is ShortEdgeFirst.
    */
    @SerializedName("ShortEdge")
    @Expose
    private Long ShortEdge;

    /**
     * Get Operation type of image scaling. Optional modes:
<li>WidthFirst: specify the image width as Width, and the height will be proportionally scaled.</li>
<li>HeightFirst: assign the image height as Height, and proportionally scale the width.</li>
<li>LongEdgeFirst: Specify the long side of the image as LongEdge, and proportionally scale the short side.</li>
<li>ShortEdgeFirst: Specify the short edge of the image as ShortEdge, with long edge proportional scaling.</li>
<li>Force: ignore the aspect ratio of the original image, specify the image width as Width and height as Height, and forcefully scale the image, which may cause deformation of the target image.</li> 
     * @return Type Operation type of image scaling. Optional modes:
<li>WidthFirst: specify the image width as Width, and the height will be proportionally scaled.</li>
<li>HeightFirst: assign the image height as Height, and proportionally scale the width.</li>
<li>LongEdgeFirst: Specify the long side of the image as LongEdge, and proportionally scale the short side.</li>
<li>ShortEdgeFirst: Specify the short edge of the image as ShortEdge, with long edge proportional scaling.</li>
<li>Force: ignore the aspect ratio of the original image, specify the image width as Width and height as Height, and forcefully scale the image, which may cause deformation of the target image.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Operation type of image scaling. Optional modes:
<li>WidthFirst: specify the image width as Width, and the height will be proportionally scaled.</li>
<li>HeightFirst: assign the image height as Height, and proportionally scale the width.</li>
<li>LongEdgeFirst: Specify the long side of the image as LongEdge, and proportionally scale the short side.</li>
<li>ShortEdgeFirst: Specify the short edge of the image as ShortEdge, with long edge proportional scaling.</li>
<li>Force: ignore the aspect ratio of the original image, specify the image width as Width and height as Height, and forcefully scale the image, which may cause deformation of the target image.</li>
     * @param Type Operation type of image scaling. Optional modes:
<li>WidthFirst: specify the image width as Width, and the height will be proportionally scaled.</li>
<li>HeightFirst: assign the image height as Height, and proportionally scale the width.</li>
<li>LongEdgeFirst: Specify the long side of the image as LongEdge, and proportionally scale the short side.</li>
<li>ShortEdgeFirst: Specify the short edge of the image as ShortEdge, with long edge proportional scaling.</li>
<li>Force: ignore the aspect ratio of the original image, specify the image width as Width and height as Height, and forcefully scale the image, which may cause deformation of the target image.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Height of the output image in pixels. This field is valid when Type is HeightFirst or Force. 
     * @return Height Height of the output image in pixels. This field is valid when Type is HeightFirst or Force.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height of the output image in pixels. This field is valid when Type is HeightFirst or Force.
     * @param Height Height of the output image in pixels. This field is valid when Type is HeightFirst or Force.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Width of the output image. Unit: pixel. This field is valid when Type is WidthFirst or Force. 
     * @return Width Width of the output image. Unit: pixel. This field is valid when Type is WidthFirst or Force.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width of the output image. Unit: pixel. This field is valid when Type is WidthFirst or Force.
     * @param Width Width of the output image. Unit: pixel. This field is valid when Type is WidthFirst or Force.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Long side length of the output image. Unit: pixel. This field is valid when Type is LongEdgeFirst. 
     * @return LongEdge Long side length of the output image. Unit: pixel. This field is valid when Type is LongEdgeFirst.
     */
    public Long getLongEdge() {
        return this.LongEdge;
    }

    /**
     * Set Long side length of the output image. Unit: pixel. This field is valid when Type is LongEdgeFirst.
     * @param LongEdge Long side length of the output image. Unit: pixel. This field is valid when Type is LongEdgeFirst.
     */
    public void setLongEdge(Long LongEdge) {
        this.LongEdge = LongEdge;
    }

    /**
     * Get Short side length of the output image in pixels. This field is valid when Type is ShortEdgeFirst. 
     * @return ShortEdge Short side length of the output image in pixels. This field is valid when Type is ShortEdgeFirst.
     */
    public Long getShortEdge() {
        return this.ShortEdge;
    }

    /**
     * Set Short side length of the output image in pixels. This field is valid when Type is ShortEdgeFirst.
     * @param ShortEdge Short side length of the output image in pixels. This field is valid when Type is ShortEdgeFirst.
     */
    public void setShortEdge(Long ShortEdge) {
        this.ShortEdge = ShortEdge;
    }

    public ImageScale() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageScale(ImageScale source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.LongEdge != null) {
            this.LongEdge = new Long(source.LongEdge);
        }
        if (source.ShortEdge != null) {
            this.ShortEdge = new Long(source.ShortEdge);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "LongEdge", this.LongEdge);
        this.setParamSimple(map, prefix + "ShortEdge", this.ShortEdge);

    }
}

