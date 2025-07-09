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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PullPushWatermarkInfo extends AbstractModel {

    /**
    * The watermark image URL.
Characters not allowed:
;(){}$>`#"'|
    */
    @SerializedName("PictureUrl")
    @Expose
    private String PictureUrl;

    /**
    * The horizontal offset (%) of the watermark. The default value is 0.
    */
    @SerializedName("XPosition")
    @Expose
    private Long XPosition;

    /**
    * The vertical offset (%) of the watermark. The default value is 0.
    */
    @SerializedName("YPosition")
    @Expose
    private Long YPosition;

    /**
    * The watermark width as a percentage of the video width. To avoid distorted images, we recommend you specify only the width or height so that the other side can be scaled proportionally. By default, the original width of the watermark image is used.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The watermark height as a percentage of the video height. To avoid distorted images, we recommend you specify only the width or height so that the other side can be scaled proportionally. By default, the original height of the watermark image is used.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * The origin. The default value is 0.
0: Top left corner
1: Top right corner
2: Bottom right corner
3: Bottom left corner
    */
    @SerializedName("Location")
    @Expose
    private Long Location;

    /**
     * Get The watermark image URL.
Characters not allowed:
;(){}$>`#"'| 
     * @return PictureUrl The watermark image URL.
Characters not allowed:
;(){}$>`#"'|
     */
    public String getPictureUrl() {
        return this.PictureUrl;
    }

    /**
     * Set The watermark image URL.
Characters not allowed:
;(){}$>`#"'|
     * @param PictureUrl The watermark image URL.
Characters not allowed:
;(){}$>`#"'|
     */
    public void setPictureUrl(String PictureUrl) {
        this.PictureUrl = PictureUrl;
    }

    /**
     * Get The horizontal offset (%) of the watermark. The default value is 0. 
     * @return XPosition The horizontal offset (%) of the watermark. The default value is 0.
     */
    public Long getXPosition() {
        return this.XPosition;
    }

    /**
     * Set The horizontal offset (%) of the watermark. The default value is 0.
     * @param XPosition The horizontal offset (%) of the watermark. The default value is 0.
     */
    public void setXPosition(Long XPosition) {
        this.XPosition = XPosition;
    }

    /**
     * Get The vertical offset (%) of the watermark. The default value is 0. 
     * @return YPosition The vertical offset (%) of the watermark. The default value is 0.
     */
    public Long getYPosition() {
        return this.YPosition;
    }

    /**
     * Set The vertical offset (%) of the watermark. The default value is 0.
     * @param YPosition The vertical offset (%) of the watermark. The default value is 0.
     */
    public void setYPosition(Long YPosition) {
        this.YPosition = YPosition;
    }

    /**
     * Get The watermark width as a percentage of the video width. To avoid distorted images, we recommend you specify only the width or height so that the other side can be scaled proportionally. By default, the original width of the watermark image is used. 
     * @return Width The watermark width as a percentage of the video width. To avoid distorted images, we recommend you specify only the width or height so that the other side can be scaled proportionally. By default, the original width of the watermark image is used.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The watermark width as a percentage of the video width. To avoid distorted images, we recommend you specify only the width or height so that the other side can be scaled proportionally. By default, the original width of the watermark image is used.
     * @param Width The watermark width as a percentage of the video width. To avoid distorted images, we recommend you specify only the width or height so that the other side can be scaled proportionally. By default, the original width of the watermark image is used.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The watermark height as a percentage of the video height. To avoid distorted images, we recommend you specify only the width or height so that the other side can be scaled proportionally. By default, the original height of the watermark image is used. 
     * @return Height The watermark height as a percentage of the video height. To avoid distorted images, we recommend you specify only the width or height so that the other side can be scaled proportionally. By default, the original height of the watermark image is used.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The watermark height as a percentage of the video height. To avoid distorted images, we recommend you specify only the width or height so that the other side can be scaled proportionally. By default, the original height of the watermark image is used.
     * @param Height The watermark height as a percentage of the video height. To avoid distorted images, we recommend you specify only the width or height so that the other side can be scaled proportionally. By default, the original height of the watermark image is used.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get The origin. The default value is 0.
0: Top left corner
1: Top right corner
2: Bottom right corner
3: Bottom left corner 
     * @return Location The origin. The default value is 0.
0: Top left corner
1: Top right corner
2: Bottom right corner
3: Bottom left corner
     */
    public Long getLocation() {
        return this.Location;
    }

    /**
     * Set The origin. The default value is 0.
0: Top left corner
1: Top right corner
2: Bottom right corner
3: Bottom left corner
     * @param Location The origin. The default value is 0.
0: Top left corner
1: Top right corner
2: Bottom right corner
3: Bottom left corner
     */
    public void setLocation(Long Location) {
        this.Location = Location;
    }

    public PullPushWatermarkInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PullPushWatermarkInfo(PullPushWatermarkInfo source) {
        if (source.PictureUrl != null) {
            this.PictureUrl = new String(source.PictureUrl);
        }
        if (source.XPosition != null) {
            this.XPosition = new Long(source.XPosition);
        }
        if (source.YPosition != null) {
            this.YPosition = new Long(source.YPosition);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Location != null) {
            this.Location = new Long(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PictureUrl", this.PictureUrl);
        this.setParamSimple(map, prefix + "XPosition", this.XPosition);
        this.setParamSimple(map, prefix + "YPosition", this.YPosition);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Location", this.Location);

    }
}

