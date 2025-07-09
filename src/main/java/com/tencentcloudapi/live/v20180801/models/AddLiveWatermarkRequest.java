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

public class AddLiveWatermarkRequest extends AbstractModel {

    /**
    * Watermark image URL.
Unallowed characters in the URL:
 ;(){}$>`#"\'|
    */
    @SerializedName("PictureUrl")
    @Expose
    private String PictureUrl;

    /**
    * Watermark name.
Up to 16 bytes.
    */
    @SerializedName("WatermarkName")
    @Expose
    private String WatermarkName;

    /**
    * Display position: X-axis offset in %. Default value: 0.
    */
    @SerializedName("XPosition")
    @Expose
    private Long XPosition;

    /**
    * Display position: Y-axis offset in %. Default value: 0.
    */
    @SerializedName("YPosition")
    @Expose
    private Long YPosition;

    /**
    * Watermark width or its percentage of the live streaming video width. It is recommended to just specify either height or width as the other will be scaled proportionally to avoid distortions. The original width is used by default.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Watermark height, which is set by entering a percentage of the live stream image’s original height. You are advised to set either the height or width as the other will be scaled proportionally to avoid distortions. Default value: original height.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get Watermark image URL.
Unallowed characters in the URL:
 ;(){}$>`#"\'| 
     * @return PictureUrl Watermark image URL.
Unallowed characters in the URL:
 ;(){}$>`#"\'|
     */
    public String getPictureUrl() {
        return this.PictureUrl;
    }

    /**
     * Set Watermark image URL.
Unallowed characters in the URL:
 ;(){}$>`#"\'|
     * @param PictureUrl Watermark image URL.
Unallowed characters in the URL:
 ;(){}$>`#"\'|
     */
    public void setPictureUrl(String PictureUrl) {
        this.PictureUrl = PictureUrl;
    }

    /**
     * Get Watermark name.
Up to 16 bytes. 
     * @return WatermarkName Watermark name.
Up to 16 bytes.
     */
    public String getWatermarkName() {
        return this.WatermarkName;
    }

    /**
     * Set Watermark name.
Up to 16 bytes.
     * @param WatermarkName Watermark name.
Up to 16 bytes.
     */
    public void setWatermarkName(String WatermarkName) {
        this.WatermarkName = WatermarkName;
    }

    /**
     * Get Display position: X-axis offset in %. Default value: 0. 
     * @return XPosition Display position: X-axis offset in %. Default value: 0.
     */
    public Long getXPosition() {
        return this.XPosition;
    }

    /**
     * Set Display position: X-axis offset in %. Default value: 0.
     * @param XPosition Display position: X-axis offset in %. Default value: 0.
     */
    public void setXPosition(Long XPosition) {
        this.XPosition = XPosition;
    }

    /**
     * Get Display position: Y-axis offset in %. Default value: 0. 
     * @return YPosition Display position: Y-axis offset in %. Default value: 0.
     */
    public Long getYPosition() {
        return this.YPosition;
    }

    /**
     * Set Display position: Y-axis offset in %. Default value: 0.
     * @param YPosition Display position: Y-axis offset in %. Default value: 0.
     */
    public void setYPosition(Long YPosition) {
        this.YPosition = YPosition;
    }

    /**
     * Get Watermark width or its percentage of the live streaming video width. It is recommended to just specify either height or width as the other will be scaled proportionally to avoid distortions. The original width is used by default. 
     * @return Width Watermark width or its percentage of the live streaming video width. It is recommended to just specify either height or width as the other will be scaled proportionally to avoid distortions. The original width is used by default.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Watermark width or its percentage of the live streaming video width. It is recommended to just specify either height or width as the other will be scaled proportionally to avoid distortions. The original width is used by default.
     * @param Width Watermark width or its percentage of the live streaming video width. It is recommended to just specify either height or width as the other will be scaled proportionally to avoid distortions. The original width is used by default.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Watermark height, which is set by entering a percentage of the live stream image’s original height. You are advised to set either the height or width as the other will be scaled proportionally to avoid distortions. Default value: original height. 
     * @return Height Watermark height, which is set by entering a percentage of the live stream image’s original height. You are advised to set either the height or width as the other will be scaled proportionally to avoid distortions. Default value: original height.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Watermark height, which is set by entering a percentage of the live stream image’s original height. You are advised to set either the height or width as the other will be scaled proportionally to avoid distortions. Default value: original height.
     * @param Height Watermark height, which is set by entering a percentage of the live stream image’s original height. You are advised to set either the height or width as the other will be scaled proportionally to avoid distortions. Default value: original height.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public AddLiveWatermarkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddLiveWatermarkRequest(AddLiveWatermarkRequest source) {
        if (source.PictureUrl != null) {
            this.PictureUrl = new String(source.PictureUrl);
        }
        if (source.WatermarkName != null) {
            this.WatermarkName = new String(source.WatermarkName);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PictureUrl", this.PictureUrl);
        this.setParamSimple(map, prefix + "WatermarkName", this.WatermarkName);
        this.setParamSimple(map, prefix + "XPosition", this.XPosition);
        this.setParamSimple(map, prefix + "YPosition", this.YPosition);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

