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
    * The scaling type. Valid values:
<li>`WidthFirst`: Specify the width and proportionally scale the height.</li>
<li>`HeightFirst`: Specify the height and proportionally scale the width.</li>
<li>`LongEdgeFirst`: Specify the long side (`LongEdge`) and proportionally scale the short side.</li>
<li>`ShortEdgeFirst`: Specify the short side (`ShortEdge`) and proportionally scale the long side.</li>
<li>Force: Specify both the height and width. The output image may be distorted.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The image height (pixels). This parameter is valid only if `Type` is `HeightFirst` or `Force`.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * The image width (pixels). This parameter is valid only if `Type` is `WidthFirst` or `Force`.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The long side of the output image (pixels). This parameter is valid only if `Type` is `LongEdgeFirst`.
    */
    @SerializedName("LongEdge")
    @Expose
    private Long LongEdge;

    /**
    * The short side of the output image (pixels). This parameter is valid only if `Type` is `ShortEdgeFirst`.
    */
    @SerializedName("ShortEdge")
    @Expose
    private Long ShortEdge;

    /**
     * Get The scaling type. Valid values:
<li>`WidthFirst`: Specify the width and proportionally scale the height.</li>
<li>`HeightFirst`: Specify the height and proportionally scale the width.</li>
<li>`LongEdgeFirst`: Specify the long side (`LongEdge`) and proportionally scale the short side.</li>
<li>`ShortEdgeFirst`: Specify the short side (`ShortEdge`) and proportionally scale the long side.</li>
<li>Force: Specify both the height and width. The output image may be distorted.</li> 
     * @return Type The scaling type. Valid values:
<li>`WidthFirst`: Specify the width and proportionally scale the height.</li>
<li>`HeightFirst`: Specify the height and proportionally scale the width.</li>
<li>`LongEdgeFirst`: Specify the long side (`LongEdge`) and proportionally scale the short side.</li>
<li>`ShortEdgeFirst`: Specify the short side (`ShortEdge`) and proportionally scale the long side.</li>
<li>Force: Specify both the height and width. The output image may be distorted.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The scaling type. Valid values:
<li>`WidthFirst`: Specify the width and proportionally scale the height.</li>
<li>`HeightFirst`: Specify the height and proportionally scale the width.</li>
<li>`LongEdgeFirst`: Specify the long side (`LongEdge`) and proportionally scale the short side.</li>
<li>`ShortEdgeFirst`: Specify the short side (`ShortEdge`) and proportionally scale the long side.</li>
<li>Force: Specify both the height and width. The output image may be distorted.</li>
     * @param Type The scaling type. Valid values:
<li>`WidthFirst`: Specify the width and proportionally scale the height.</li>
<li>`HeightFirst`: Specify the height and proportionally scale the width.</li>
<li>`LongEdgeFirst`: Specify the long side (`LongEdge`) and proportionally scale the short side.</li>
<li>`ShortEdgeFirst`: Specify the short side (`ShortEdge`) and proportionally scale the long side.</li>
<li>Force: Specify both the height and width. The output image may be distorted.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The image height (pixels). This parameter is valid only if `Type` is `HeightFirst` or `Force`. 
     * @return Height The image height (pixels). This parameter is valid only if `Type` is `HeightFirst` or `Force`.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The image height (pixels). This parameter is valid only if `Type` is `HeightFirst` or `Force`.
     * @param Height The image height (pixels). This parameter is valid only if `Type` is `HeightFirst` or `Force`.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get The image width (pixels). This parameter is valid only if `Type` is `WidthFirst` or `Force`. 
     * @return Width The image width (pixels). This parameter is valid only if `Type` is `WidthFirst` or `Force`.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The image width (pixels). This parameter is valid only if `Type` is `WidthFirst` or `Force`.
     * @param Width The image width (pixels). This parameter is valid only if `Type` is `WidthFirst` or `Force`.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The long side of the output image (pixels). This parameter is valid only if `Type` is `LongEdgeFirst`. 
     * @return LongEdge The long side of the output image (pixels). This parameter is valid only if `Type` is `LongEdgeFirst`.
     */
    public Long getLongEdge() {
        return this.LongEdge;
    }

    /**
     * Set The long side of the output image (pixels). This parameter is valid only if `Type` is `LongEdgeFirst`.
     * @param LongEdge The long side of the output image (pixels). This parameter is valid only if `Type` is `LongEdgeFirst`.
     */
    public void setLongEdge(Long LongEdge) {
        this.LongEdge = LongEdge;
    }

    /**
     * Get The short side of the output image (pixels). This parameter is valid only if `Type` is `ShortEdgeFirst`. 
     * @return ShortEdge The short side of the output image (pixels). This parameter is valid only if `Type` is `ShortEdgeFirst`.
     */
    public Long getShortEdge() {
        return this.ShortEdge;
    }

    /**
     * Set The short side of the output image (pixels). This parameter is valid only if `Type` is `ShortEdgeFirst`.
     * @param ShortEdge The short side of the output image (pixels). This parameter is valid only if `Type` is `ShortEdgeFirst`.
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

