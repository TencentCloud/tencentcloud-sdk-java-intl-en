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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaticImageActivateSetting extends AbstractModel {

    /**
    * The address of the image to be inserted, starting with http or https and ending with .png .PNG .bmp .BMP .tga .TGA.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * The layer of the superimposed image, 0-7; the default value is 0, and a higher layer means it is on the top.
    */
    @SerializedName("Layer")
    @Expose
    private Long Layer;

    /**
    * Opacity, range 0-100; the default value is 100, which means completely opaque.
    */
    @SerializedName("Opacity")
    @Expose
    private Long Opacity;

    /**
    * The distance from the left edge in pixels; the default value is 0 and the maximum value is 4096.
    */
    @SerializedName("ImageX")
    @Expose
    private Long ImageX;

    /**
    * The distance from the top edge in pixels; the default value is 0 and the maximum value is 2160.
    */
    @SerializedName("ImageY")
    @Expose
    private Long ImageY;

    /**
    * The width of the image superimposed on the video frame, in pixels. The default value is empty (not set), which means using the original image size. The minimum value is 1 and the maximum value is 4096.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The height of the image superimposed on the video frame, in pixels. The default value is empty (not set), which means the original image size is used. The minimum value is 1 and the maximum value is 2160.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Overlay duration, in milliseconds, range 0-86400000; default value 0, 0 means continuous.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Fade-in duration, in milliseconds, range 0-5000; default value 0, 0 means no fade-in effect.
    */
    @SerializedName("FadeIn")
    @Expose
    private Long FadeIn;

    /**
    * Fade-out duration, in milliseconds, range 0-5000; default value 0, 0 means no fade-out effect.
    */
    @SerializedName("FadeOut")
    @Expose
    private Long FadeOut;

    /**
     * Get The address of the image to be inserted, starting with http or https and ending with .png .PNG .bmp .BMP .tga .TGA. 
     * @return ImageUrl The address of the image to be inserted, starting with http or https and ending with .png .PNG .bmp .BMP .tga .TGA.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set The address of the image to be inserted, starting with http or https and ending with .png .PNG .bmp .BMP .tga .TGA.
     * @param ImageUrl The address of the image to be inserted, starting with http or https and ending with .png .PNG .bmp .BMP .tga .TGA.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get The layer of the superimposed image, 0-7; the default value is 0, and a higher layer means it is on the top. 
     * @return Layer The layer of the superimposed image, 0-7; the default value is 0, and a higher layer means it is on the top.
     */
    public Long getLayer() {
        return this.Layer;
    }

    /**
     * Set The layer of the superimposed image, 0-7; the default value is 0, and a higher layer means it is on the top.
     * @param Layer The layer of the superimposed image, 0-7; the default value is 0, and a higher layer means it is on the top.
     */
    public void setLayer(Long Layer) {
        this.Layer = Layer;
    }

    /**
     * Get Opacity, range 0-100; the default value is 100, which means completely opaque. 
     * @return Opacity Opacity, range 0-100; the default value is 100, which means completely opaque.
     */
    public Long getOpacity() {
        return this.Opacity;
    }

    /**
     * Set Opacity, range 0-100; the default value is 100, which means completely opaque.
     * @param Opacity Opacity, range 0-100; the default value is 100, which means completely opaque.
     */
    public void setOpacity(Long Opacity) {
        this.Opacity = Opacity;
    }

    /**
     * Get The distance from the left edge in pixels; the default value is 0 and the maximum value is 4096. 
     * @return ImageX The distance from the left edge in pixels; the default value is 0 and the maximum value is 4096.
     */
    public Long getImageX() {
        return this.ImageX;
    }

    /**
     * Set The distance from the left edge in pixels; the default value is 0 and the maximum value is 4096.
     * @param ImageX The distance from the left edge in pixels; the default value is 0 and the maximum value is 4096.
     */
    public void setImageX(Long ImageX) {
        this.ImageX = ImageX;
    }

    /**
     * Get The distance from the top edge in pixels; the default value is 0 and the maximum value is 2160. 
     * @return ImageY The distance from the top edge in pixels; the default value is 0 and the maximum value is 2160.
     */
    public Long getImageY() {
        return this.ImageY;
    }

    /**
     * Set The distance from the top edge in pixels; the default value is 0 and the maximum value is 2160.
     * @param ImageY The distance from the top edge in pixels; the default value is 0 and the maximum value is 2160.
     */
    public void setImageY(Long ImageY) {
        this.ImageY = ImageY;
    }

    /**
     * Get The width of the image superimposed on the video frame, in pixels. The default value is empty (not set), which means using the original image size. The minimum value is 1 and the maximum value is 4096. 
     * @return Width The width of the image superimposed on the video frame, in pixels. The default value is empty (not set), which means using the original image size. The minimum value is 1 and the maximum value is 4096.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The width of the image superimposed on the video frame, in pixels. The default value is empty (not set), which means using the original image size. The minimum value is 1 and the maximum value is 4096.
     * @param Width The width of the image superimposed on the video frame, in pixels. The default value is empty (not set), which means using the original image size. The minimum value is 1 and the maximum value is 4096.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The height of the image superimposed on the video frame, in pixels. The default value is empty (not set), which means the original image size is used. The minimum value is 1 and the maximum value is 2160. 
     * @return Height The height of the image superimposed on the video frame, in pixels. The default value is empty (not set), which means the original image size is used. The minimum value is 1 and the maximum value is 2160.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The height of the image superimposed on the video frame, in pixels. The default value is empty (not set), which means the original image size is used. The minimum value is 1 and the maximum value is 2160.
     * @param Height The height of the image superimposed on the video frame, in pixels. The default value is empty (not set), which means the original image size is used. The minimum value is 1 and the maximum value is 2160.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Overlay duration, in milliseconds, range 0-86400000; default value 0, 0 means continuous. 
     * @return Duration Overlay duration, in milliseconds, range 0-86400000; default value 0, 0 means continuous.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Overlay duration, in milliseconds, range 0-86400000; default value 0, 0 means continuous.
     * @param Duration Overlay duration, in milliseconds, range 0-86400000; default value 0, 0 means continuous.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Fade-in duration, in milliseconds, range 0-5000; default value 0, 0 means no fade-in effect. 
     * @return FadeIn Fade-in duration, in milliseconds, range 0-5000; default value 0, 0 means no fade-in effect.
     */
    public Long getFadeIn() {
        return this.FadeIn;
    }

    /**
     * Set Fade-in duration, in milliseconds, range 0-5000; default value 0, 0 means no fade-in effect.
     * @param FadeIn Fade-in duration, in milliseconds, range 0-5000; default value 0, 0 means no fade-in effect.
     */
    public void setFadeIn(Long FadeIn) {
        this.FadeIn = FadeIn;
    }

    /**
     * Get Fade-out duration, in milliseconds, range 0-5000; default value 0, 0 means no fade-out effect. 
     * @return FadeOut Fade-out duration, in milliseconds, range 0-5000; default value 0, 0 means no fade-out effect.
     */
    public Long getFadeOut() {
        return this.FadeOut;
    }

    /**
     * Set Fade-out duration, in milliseconds, range 0-5000; default value 0, 0 means no fade-out effect.
     * @param FadeOut Fade-out duration, in milliseconds, range 0-5000; default value 0, 0 means no fade-out effect.
     */
    public void setFadeOut(Long FadeOut) {
        this.FadeOut = FadeOut;
    }

    public StaticImageActivateSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaticImageActivateSetting(StaticImageActivateSetting source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.Layer != null) {
            this.Layer = new Long(source.Layer);
        }
        if (source.Opacity != null) {
            this.Opacity = new Long(source.Opacity);
        }
        if (source.ImageX != null) {
            this.ImageX = new Long(source.ImageX);
        }
        if (source.ImageY != null) {
            this.ImageY = new Long(source.ImageY);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.FadeIn != null) {
            this.FadeIn = new Long(source.FadeIn);
        }
        if (source.FadeOut != null) {
            this.FadeOut = new Long(source.FadeOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "Layer", this.Layer);
        this.setParamSimple(map, prefix + "Opacity", this.Opacity);
        this.setParamSimple(map, prefix + "ImageX", this.ImageX);
        this.setParamSimple(map, prefix + "ImageY", this.ImageY);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "FadeIn", this.FadeIn);
        this.setParamSimple(map, prefix + "FadeOut", this.FadeOut);

    }
}

