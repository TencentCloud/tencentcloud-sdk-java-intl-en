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

public class WatermarkConfigureData extends AbstractModel {

    /**
    * Whether to enable watermark. Valid values:
<li>ON: Enable watermark;</li>
<li>OFF: Turn off watermark.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Watermark Url.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Width of a watermark.
<li>If a string ends with %, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * Height of the watermark.
<li>If a string ends with %, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * Horizontal position of the watermark origin relative to the origin of coordinates of the video image. A string ending with % means the watermark XPos is a specified percentage of the video width. For example, 10% means XPos is 10% of the video width.
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * Vertical position of the watermark origin relative to the origin of coordinates of the video image. When the string ends with %, the watermark YPos is the specified percentage of the video height. For example, 10% means YPos is 10% of the video height.
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
     * Get Whether to enable watermark. Valid values:
<li>ON: Enable watermark;</li>
<li>OFF: Turn off watermark.</li> 
     * @return Switch Whether to enable watermark. Valid values:
<li>ON: Enable watermark;</li>
<li>OFF: Turn off watermark.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable watermark. Valid values:
<li>ON: Enable watermark;</li>
<li>OFF: Turn off watermark.</li>
     * @param Switch Whether to enable watermark. Valid values:
<li>ON: Enable watermark;</li>
<li>OFF: Turn off watermark.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Watermark Url. 
     * @return Url Watermark Url.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Watermark Url.
     * @param Url Watermark Url.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Width of a watermark.
<li>If a string ends with %, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li> 
     * @return Width Width of a watermark.
<li>If a string ends with %, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set Width of a watermark.
<li>If a string ends with %, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
     * @param Width Width of a watermark.
<li>If a string ends with %, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * Get Height of the watermark.
<li>If a string ends with %, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li> 
     * @return Height Height of the watermark.
<li>If a string ends with %, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set Height of the watermark.
<li>If a string ends with %, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
     * @param Height Height of the watermark.
<li>If a string ends with %, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get Horizontal position of the watermark origin relative to the origin of coordinates of the video image. A string ending with % means the watermark XPos is a specified percentage of the video width. For example, 10% means XPos is 10% of the video width. 
     * @return XPos Horizontal position of the watermark origin relative to the origin of coordinates of the video image. A string ending with % means the watermark XPos is a specified percentage of the video width. For example, 10% means XPos is 10% of the video width.
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set Horizontal position of the watermark origin relative to the origin of coordinates of the video image. A string ending with % means the watermark XPos is a specified percentage of the video width. For example, 10% means XPos is 10% of the video width.
     * @param XPos Horizontal position of the watermark origin relative to the origin of coordinates of the video image. A string ending with % means the watermark XPos is a specified percentage of the video width. For example, 10% means XPos is 10% of the video width.
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get Vertical position of the watermark origin relative to the origin of coordinates of the video image. When the string ends with %, the watermark YPos is the specified percentage of the video height. For example, 10% means YPos is 10% of the video height. 
     * @return YPos Vertical position of the watermark origin relative to the origin of coordinates of the video image. When the string ends with %, the watermark YPos is the specified percentage of the video height. For example, 10% means YPos is 10% of the video height.
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set Vertical position of the watermark origin relative to the origin of coordinates of the video image. When the string ends with %, the watermark YPos is the specified percentage of the video height. For example, 10% means YPos is 10% of the video height.
     * @param YPos Vertical position of the watermark origin relative to the origin of coordinates of the video image. When the string ends with %, the watermark YPos is the specified percentage of the video height. For example, 10% means YPos is 10% of the video height.
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    public WatermarkConfigureData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WatermarkConfigureData(WatermarkConfigureData source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Width != null) {
            this.Width = new String(source.Width);
        }
        if (source.Height != null) {
            this.Height = new String(source.Height);
        }
        if (source.XPos != null) {
            this.XPos = new String(source.XPos);
        }
        if (source.YPos != null) {
            this.YPos = new String(source.YPos);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);

    }
}

