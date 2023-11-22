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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Canvas extends AbstractModel {

    /**
    * Background color. Valid values:
<li>Black: black background</li>
<li>White: white background</li>
Default value: Black.
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * Canvas width, that is, the width of the output video, value range: 0~3840, unit: px. 
Default value: 0, which means the video width is the same as the first video clip of the first video track.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Canvas height, that is, the height (or long side) of the output video, value range: 0~3840, unit: px. 
Default value: 0, which means the video height is consistent with the first video clip of the first video track.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get Background color. Valid values:
<li>Black: black background</li>
<li>White: white background</li>
Default value: Black. 
     * @return Color Background color. Valid values:
<li>Black: black background</li>
<li>White: white background</li>
Default value: Black.
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set Background color. Valid values:
<li>Black: black background</li>
<li>White: white background</li>
Default value: Black.
     * @param Color Background color. Valid values:
<li>Black: black background</li>
<li>White: white background</li>
Default value: Black.
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get Canvas width, that is, the width of the output video, value range: 0~3840, unit: px. 
Default value: 0, which means the video width is the same as the first video clip of the first video track. 
     * @return Width Canvas width, that is, the width of the output video, value range: 0~3840, unit: px. 
Default value: 0, which means the video width is the same as the first video clip of the first video track.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Canvas width, that is, the width of the output video, value range: 0~3840, unit: px. 
Default value: 0, which means the video width is the same as the first video clip of the first video track.
     * @param Width Canvas width, that is, the width of the output video, value range: 0~3840, unit: px. 
Default value: 0, which means the video width is the same as the first video clip of the first video track.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Canvas height, that is, the height (or long side) of the output video, value range: 0~3840, unit: px. 
Default value: 0, which means the video height is consistent with the first video clip of the first video track. 
     * @return Height Canvas height, that is, the height (or long side) of the output video, value range: 0~3840, unit: px. 
Default value: 0, which means the video height is consistent with the first video clip of the first video track.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Canvas height, that is, the height (or long side) of the output video, value range: 0~3840, unit: px. 
Default value: 0, which means the video height is consistent with the first video clip of the first video track.
     * @param Height Canvas height, that is, the height (or long side) of the output video, value range: 0~3840, unit: px. 
Default value: 0, which means the video height is consistent with the first video clip of the first video track.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public Canvas() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Canvas(Canvas source) {
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

