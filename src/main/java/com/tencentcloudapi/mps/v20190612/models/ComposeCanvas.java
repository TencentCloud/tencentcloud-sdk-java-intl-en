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

public class ComposeCanvas extends AbstractModel {

    /**
    * The RGB value of the background color. The format is #RRGGBB, such as `#F0F0F0`. 
Default value: `#000000` (black).
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * The canvas width (px), which is the width of the output video. Value range: 0–3840.  
The default value is `0`, which means that the canvas is as wide as the first video.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The canvas height (px), which is the height of the output video. Value range: 0–3840.  
The default value is `0`, which means that the canvas is as high as the first video.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get The RGB value of the background color. The format is #RRGGBB, such as `#F0F0F0`. 
Default value: `#000000` (black). 
     * @return Color The RGB value of the background color. The format is #RRGGBB, such as `#F0F0F0`. 
Default value: `#000000` (black).
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set The RGB value of the background color. The format is #RRGGBB, such as `#F0F0F0`. 
Default value: `#000000` (black).
     * @param Color The RGB value of the background color. The format is #RRGGBB, such as `#F0F0F0`. 
Default value: `#000000` (black).
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get The canvas width (px), which is the width of the output video. Value range: 0–3840.  
The default value is `0`, which means that the canvas is as wide as the first video. 
     * @return Width The canvas width (px), which is the width of the output video. Value range: 0–3840.  
The default value is `0`, which means that the canvas is as wide as the first video.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The canvas width (px), which is the width of the output video. Value range: 0–3840.  
The default value is `0`, which means that the canvas is as wide as the first video.
     * @param Width The canvas width (px), which is the width of the output video. Value range: 0–3840.  
The default value is `0`, which means that the canvas is as wide as the first video.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The canvas height (px), which is the height of the output video. Value range: 0–3840.  
The default value is `0`, which means that the canvas is as high as the first video. 
     * @return Height The canvas height (px), which is the height of the output video. Value range: 0–3840.  
The default value is `0`, which means that the canvas is as high as the first video.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The canvas height (px), which is the height of the output video. Value range: 0–3840.  
The default value is `0`, which means that the canvas is as high as the first video.
     * @param Height The canvas height (px), which is the height of the output video. Value range: 0–3840.  
The default value is `0`, which means that the canvas is as high as the first video.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public ComposeCanvas() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeCanvas(ComposeCanvas source) {
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

