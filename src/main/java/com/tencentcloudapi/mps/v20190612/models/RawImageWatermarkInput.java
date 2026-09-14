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

public class RawImageWatermarkInput extends AbstractModel {

    /**
    * Input content of the watermark image. jpeg and png image formats are supported.
    */
    @SerializedName("ImageContent")
    @Expose
    private MediaInputInfo ImageContent;

    /**
    * Width of a watermark, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark Width is in pixels. For example, 100px means the Width is 100 pixels.</li>
Default value: 10%.
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * Height of a watermark. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark Height is in pixels. For example, 100px means the Height is 100 pixels.</li>
Default value: 0px, which means Height is scaled according to the aspect ratio of the raw watermark image.
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * Watermark repeat type. Usage scenario: the watermark is a dynamic image. Value range:
<li>once: The dynamic watermark will no longer appear after it has finished playing;</li>
<li>repeat_last_frame: Stay on the last frame after the watermark finished playing;</li>
<li>repeat: Watermark loops until the video ends (default value).</li>
    */
    @SerializedName("RepeatType")
    @Expose
    private String RepeatType;

    /**
     * Get Input content of the watermark image. jpeg and png image formats are supported. 
     * @return ImageContent Input content of the watermark image. jpeg and png image formats are supported.
     */
    public MediaInputInfo getImageContent() {
        return this.ImageContent;
    }

    /**
     * Set Input content of the watermark image. jpeg and png image formats are supported.
     * @param ImageContent Input content of the watermark image. jpeg and png image formats are supported.
     */
    public void setImageContent(MediaInputInfo ImageContent) {
        this.ImageContent = ImageContent;
    }

    /**
     * Get Width of a watermark, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark Width is in pixels. For example, 100px means the Width is 100 pixels.</li>
Default value: 10%. 
     * @return Width Width of a watermark, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark Width is in pixels. For example, 100px means the Width is 100 pixels.</li>
Default value: 10%.
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set Width of a watermark, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark Width is in pixels. For example, 100px means the Width is 100 pixels.</li>
Default value: 10%.
     * @param Width Width of a watermark, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with px, it means the watermark Width is in pixels. For example, 100px means the Width is 100 pixels.</li>
Default value: 10%.
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * Get Height of a watermark. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark Height is in pixels. For example, 100px means the Height is 100 pixels.</li>
Default value: 0px, which means Height is scaled according to the aspect ratio of the raw watermark image. 
     * @return Height Height of a watermark. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark Height is in pixels. For example, 100px means the Height is 100 pixels.</li>
Default value: 0px, which means Height is scaled according to the aspect ratio of the raw watermark image.
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set Height of a watermark. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark Height is in pixels. For example, 100px means the Height is 100 pixels.</li>
Default value: 0px, which means Height is scaled according to the aspect ratio of the raw watermark image.
     * @param Height Height of a watermark. Supports two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with px, it means the watermark Height is in pixels. For example, 100px means the Height is 100 pixels.</li>
Default value: 0px, which means Height is scaled according to the aspect ratio of the raw watermark image.
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get Watermark repeat type. Usage scenario: the watermark is a dynamic image. Value range:
<li>once: The dynamic watermark will no longer appear after it has finished playing;</li>
<li>repeat_last_frame: Stay on the last frame after the watermark finished playing;</li>
<li>repeat: Watermark loops until the video ends (default value).</li> 
     * @return RepeatType Watermark repeat type. Usage scenario: the watermark is a dynamic image. Value range:
<li>once: The dynamic watermark will no longer appear after it has finished playing;</li>
<li>repeat_last_frame: Stay on the last frame after the watermark finished playing;</li>
<li>repeat: Watermark loops until the video ends (default value).</li>
     */
    public String getRepeatType() {
        return this.RepeatType;
    }

    /**
     * Set Watermark repeat type. Usage scenario: the watermark is a dynamic image. Value range:
<li>once: The dynamic watermark will no longer appear after it has finished playing;</li>
<li>repeat_last_frame: Stay on the last frame after the watermark finished playing;</li>
<li>repeat: Watermark loops until the video ends (default value).</li>
     * @param RepeatType Watermark repeat type. Usage scenario: the watermark is a dynamic image. Value range:
<li>once: The dynamic watermark will no longer appear after it has finished playing;</li>
<li>repeat_last_frame: Stay on the last frame after the watermark finished playing;</li>
<li>repeat: Watermark loops until the video ends (default value).</li>
     */
    public void setRepeatType(String RepeatType) {
        this.RepeatType = RepeatType;
    }

    public RawImageWatermarkInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RawImageWatermarkInput(RawImageWatermarkInput source) {
        if (source.ImageContent != null) {
            this.ImageContent = new MediaInputInfo(source.ImageContent);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ImageContent.", this.ImageContent);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "RepeatType", this.RepeatType);

    }
}

