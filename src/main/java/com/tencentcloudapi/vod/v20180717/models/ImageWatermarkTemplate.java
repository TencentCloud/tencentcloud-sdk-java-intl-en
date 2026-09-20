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

public class ImageWatermarkTemplate extends AbstractModel {

    /**
    * Watermark image address.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Width of a watermark, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark Width is in pixels. For example, 100px means the Width is 100 pixels.</li>
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * Height of a watermark, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark Height is in pixels; for example, 100px means the Height is 100 pixels;</li>
0px: Height is scaled proportionally to the video width based on Width.
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * Watermark repeat type. Usage scenario: the watermark is a dynamic image. Value range:
<li>once: The dynamic watermark will no longer appear after it has finished playing;</li>
<li>repeat_last_frame: Stay on the last frame after the watermark finished playing;</li>
<li>repeat: The watermark loops until the video ends.</li>
    */
    @SerializedName("RepeatType")
    @Expose
    private String RepeatType;

    /**
    * Image transparency. Value range: [0, 100].
<li>0: completely opaque.</li>
<li>100: completely transparent.</li>
    */
    @SerializedName("Transparency")
    @Expose
    private Long Transparency;

    /**
     * Get Watermark image address. 
     * @return ImageUrl Watermark image address.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set Watermark image address.
     * @param ImageUrl Watermark image address.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Width of a watermark, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark Width is in pixels. For example, 100px means the Width is 100 pixels.</li> 
     * @return Width Width of a watermark, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark Width is in pixels. For example, 100px means the Width is 100 pixels.</li>
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set Width of a watermark, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark Width is in pixels. For example, 100px means the Width is 100 pixels.</li>
     * @param Width Width of a watermark, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark Width is in pixels. For example, 100px means the Width is 100 pixels.</li>
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * Get Height of a watermark, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark Height is in pixels; for example, 100px means the Height is 100 pixels;</li>
0px: Height is scaled proportionally to the video width based on Width. 
     * @return Height Height of a watermark, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark Height is in pixels; for example, 100px means the Height is 100 pixels;</li>
0px: Height is scaled proportionally to the video width based on Width.
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set Height of a watermark, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark Height is in pixels; for example, 100px means the Height is 100 pixels;</li>
0px: Height is scaled proportionally to the video width based on Width.
     * @param Height Height of a watermark, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark Height is in pixels; for example, 100px means the Height is 100 pixels;</li>
0px: Height is scaled proportionally to the video width based on Width.
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get Watermark repeat type. Usage scenario: the watermark is a dynamic image. Value range:
<li>once: The dynamic watermark will no longer appear after it has finished playing;</li>
<li>repeat_last_frame: Stay on the last frame after the watermark finished playing;</li>
<li>repeat: The watermark loops until the video ends.</li> 
     * @return RepeatType Watermark repeat type. Usage scenario: the watermark is a dynamic image. Value range:
<li>once: The dynamic watermark will no longer appear after it has finished playing;</li>
<li>repeat_last_frame: Stay on the last frame after the watermark finished playing;</li>
<li>repeat: The watermark loops until the video ends.</li>
     */
    public String getRepeatType() {
        return this.RepeatType;
    }

    /**
     * Set Watermark repeat type. Usage scenario: the watermark is a dynamic image. Value range:
<li>once: The dynamic watermark will no longer appear after it has finished playing;</li>
<li>repeat_last_frame: Stay on the last frame after the watermark finished playing;</li>
<li>repeat: The watermark loops until the video ends.</li>
     * @param RepeatType Watermark repeat type. Usage scenario: the watermark is a dynamic image. Value range:
<li>once: The dynamic watermark will no longer appear after it has finished playing;</li>
<li>repeat_last_frame: Stay on the last frame after the watermark finished playing;</li>
<li>repeat: The watermark loops until the video ends.</li>
     */
    public void setRepeatType(String RepeatType) {
        this.RepeatType = RepeatType;
    }

    /**
     * Get Image transparency. Value range: [0, 100].
<li>0: completely opaque.</li>
<li>100: completely transparent.</li> 
     * @return Transparency Image transparency. Value range: [0, 100].
<li>0: completely opaque.</li>
<li>100: completely transparent.</li>
     */
    public Long getTransparency() {
        return this.Transparency;
    }

    /**
     * Set Image transparency. Value range: [0, 100].
<li>0: completely opaque.</li>
<li>100: completely transparent.</li>
     * @param Transparency Image transparency. Value range: [0, 100].
<li>0: completely opaque.</li>
<li>100: completely transparent.</li>
     */
    public void setTransparency(Long Transparency) {
        this.Transparency = Transparency;
    }

    public ImageWatermarkTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageWatermarkTemplate(ImageWatermarkTemplate source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.Width != null) {
            this.Width = new String(source.Width);
        }
        if (source.Height != null) {
            this.Height = new String(source.Height);
        }
        if (source.RepeatType != null) {
            this.RepeatType = new String(source.RepeatType);
        }
        if (source.Transparency != null) {
            this.Transparency = new Long(source.Transparency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "RepeatType", this.RepeatType);
        this.setParamSimple(map, prefix + "Transparency", this.Transparency);

    }
}

