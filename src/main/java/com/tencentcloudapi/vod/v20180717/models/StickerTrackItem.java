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

public class StickerTrackItem extends AbstractModel {

    /**
    * Media material source of the texture segment, which can be:
<li>Media file ID for VOD;</li>
<li>Download URL of other media files.</li>
Note: When using the download URL of another media file as the material source, and access control (such as anti-hotlinking) is enabled, the URL needs to carry access control parameters (such as a hotlink protection signature).
    */
    @SerializedName("SourceMedia")
    @Expose
    private String SourceMedia;

    /**
    * Duration of the sticker, in seconds.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * Start time of the sticker on the track, in seconds.
    */
    @SerializedName("StartTime")
    @Expose
    private Float StartTime;

    /**
    * Origin position. Valid values:
<li>Center: The coordinate origin is the central position, such as the center of canvas.</li>
Default: Center.
    */
    @SerializedName("CoordinateOrigin")
    @Expose
    private String CoordinateOrigin;

    /**
    * Horizontal position of the texture origin relative to the canvas origin, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the texture XPos is at a specified percentage of the canvas width. For example, 10% means the XPos is at 10% of the canvas width.</li><li>If a string ends with px, it indicates that the texture XPos is in pixels. For example, 100px means the XPos is 100 pixels.</li>
Default value: 0px.
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * Vertical position of the texture origin from the canvas origin. Supports two formats: % and px.
<li>When a string ends with %, it means the texture YPos is at the specified percentage of the canvas height. For example, 10% means the YPos is 10% of the canvas height.</li>
<li>If a string ends with px, it means the texture YPos unit is pixel. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px.
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * Width of a sticker, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a sticker is a percentage of the canvas width. For example, `10%` means that `Width` is 10% of the canvas width.</li>
<li>If a string ends with px, it means the texture Width unit is pixel. For example, 100px means the Width is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the texture material itself will be used.</li>
<li>If Width is 0 but Height is not, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li>
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * Height of a sticker, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a sticker is a percentage of the canvas height. For example, `10%` means that `Height` is 10% of the canvas height.</li>
<li>If a string ends with px, it means the texture Height unit is pixel. For example, 100px means the Height is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the texture material itself will be used.</li>
<li>If Width is empty but Height is not empty, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li>
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * Operation performed on the texture, such as image rotation.
    */
    @SerializedName("ImageOperations")
    @Expose
    private ImageTransform [] ImageOperations;

    /**
     * Get Media material source of the texture segment, which can be:
<li>Media file ID for VOD;</li>
<li>Download URL of other media files.</li>
Note: When using the download URL of another media file as the material source, and access control (such as anti-hotlinking) is enabled, the URL needs to carry access control parameters (such as a hotlink protection signature). 
     * @return SourceMedia Media material source of the texture segment, which can be:
<li>Media file ID for VOD;</li>
<li>Download URL of other media files.</li>
Note: When using the download URL of another media file as the material source, and access control (such as anti-hotlinking) is enabled, the URL needs to carry access control parameters (such as a hotlink protection signature).
     */
    public String getSourceMedia() {
        return this.SourceMedia;
    }

    /**
     * Set Media material source of the texture segment, which can be:
<li>Media file ID for VOD;</li>
<li>Download URL of other media files.</li>
Note: When using the download URL of another media file as the material source, and access control (such as anti-hotlinking) is enabled, the URL needs to carry access control parameters (such as a hotlink protection signature).
     * @param SourceMedia Media material source of the texture segment, which can be:
<li>Media file ID for VOD;</li>
<li>Download URL of other media files.</li>
Note: When using the download URL of another media file as the material source, and access control (such as anti-hotlinking) is enabled, the URL needs to carry access control parameters (such as a hotlink protection signature).
     */
    public void setSourceMedia(String SourceMedia) {
        this.SourceMedia = SourceMedia;
    }

    /**
     * Get Duration of the sticker, in seconds. 
     * @return Duration Duration of the sticker, in seconds.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Duration of the sticker, in seconds.
     * @param Duration Duration of the sticker, in seconds.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Start time of the sticker on the track, in seconds. 
     * @return StartTime Start time of the sticker on the track, in seconds.
     */
    public Float getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the sticker on the track, in seconds.
     * @param StartTime Start time of the sticker on the track, in seconds.
     */
    public void setStartTime(Float StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Origin position. Valid values:
<li>Center: The coordinate origin is the central position, such as the center of canvas.</li>
Default: Center. 
     * @return CoordinateOrigin Origin position. Valid values:
<li>Center: The coordinate origin is the central position, such as the center of canvas.</li>
Default: Center.
     */
    public String getCoordinateOrigin() {
        return this.CoordinateOrigin;
    }

    /**
     * Set Origin position. Valid values:
<li>Center: The coordinate origin is the central position, such as the center of canvas.</li>
Default: Center.
     * @param CoordinateOrigin Origin position. Valid values:
<li>Center: The coordinate origin is the central position, such as the center of canvas.</li>
Default: Center.
     */
    public void setCoordinateOrigin(String CoordinateOrigin) {
        this.CoordinateOrigin = CoordinateOrigin;
    }

    /**
     * Get Horizontal position of the texture origin relative to the canvas origin, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the texture XPos is at a specified percentage of the canvas width. For example, 10% means the XPos is at 10% of the canvas width.</li><li>If a string ends with px, it indicates that the texture XPos is in pixels. For example, 100px means the XPos is 100 pixels.</li>
Default value: 0px. 
     * @return XPos Horizontal position of the texture origin relative to the canvas origin, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the texture XPos is at a specified percentage of the canvas width. For example, 10% means the XPos is at 10% of the canvas width.</li><li>If a string ends with px, it indicates that the texture XPos is in pixels. For example, 100px means the XPos is 100 pixels.</li>
Default value: 0px.
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set Horizontal position of the texture origin relative to the canvas origin, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the texture XPos is at a specified percentage of the canvas width. For example, 10% means the XPos is at 10% of the canvas width.</li><li>If a string ends with px, it indicates that the texture XPos is in pixels. For example, 100px means the XPos is 100 pixels.</li>
Default value: 0px.
     * @param XPos Horizontal position of the texture origin relative to the canvas origin, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the texture XPos is at a specified percentage of the canvas width. For example, 10% means the XPos is at 10% of the canvas width.</li><li>If a string ends with px, it indicates that the texture XPos is in pixels. For example, 100px means the XPos is 100 pixels.</li>
Default value: 0px.
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get Vertical position of the texture origin from the canvas origin. Supports two formats: % and px.
<li>When a string ends with %, it means the texture YPos is at the specified percentage of the canvas height. For example, 10% means the YPos is 10% of the canvas height.</li>
<li>If a string ends with px, it means the texture YPos unit is pixel. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px. 
     * @return YPos Vertical position of the texture origin from the canvas origin. Supports two formats: % and px.
<li>When a string ends with %, it means the texture YPos is at the specified percentage of the canvas height. For example, 10% means the YPos is 10% of the canvas height.</li>
<li>If a string ends with px, it means the texture YPos unit is pixel. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px.
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set Vertical position of the texture origin from the canvas origin. Supports two formats: % and px.
<li>When a string ends with %, it means the texture YPos is at the specified percentage of the canvas height. For example, 10% means the YPos is 10% of the canvas height.</li>
<li>If a string ends with px, it means the texture YPos unit is pixel. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px.
     * @param YPos Vertical position of the texture origin from the canvas origin. Supports two formats: % and px.
<li>When a string ends with %, it means the texture YPos is at the specified percentage of the canvas height. For example, 10% means the YPos is 10% of the canvas height.</li>
<li>If a string ends with px, it means the texture YPos unit is pixel. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px.
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get Width of a sticker, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a sticker is a percentage of the canvas width. For example, `10%` means that `Width` is 10% of the canvas width.</li>
<li>If a string ends with px, it means the texture Width unit is pixel. For example, 100px means the Width is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the texture material itself will be used.</li>
<li>If Width is 0 but Height is not, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li> 
     * @return Width Width of a sticker, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a sticker is a percentage of the canvas width. For example, `10%` means that `Width` is 10% of the canvas width.</li>
<li>If a string ends with px, it means the texture Width unit is pixel. For example, 100px means the Width is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the texture material itself will be used.</li>
<li>If Width is 0 but Height is not, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li>
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set Width of a sticker, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a sticker is a percentage of the canvas width. For example, `10%` means that `Width` is 10% of the canvas width.</li>
<li>If a string ends with px, it means the texture Width unit is pixel. For example, 100px means the Width is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the texture material itself will be used.</li>
<li>If Width is 0 but Height is not, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li>
     * @param Width Width of a sticker, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a sticker is a percentage of the canvas width. For example, `10%` means that `Width` is 10% of the canvas width.</li>
<li>If a string ends with px, it means the texture Width unit is pixel. For example, 100px means the Width is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the texture material itself will be used.</li>
<li>If Width is 0 but Height is not, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li>
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * Get Height of a sticker, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a sticker is a percentage of the canvas height. For example, `10%` means that `Height` is 10% of the canvas height.</li>
<li>If a string ends with px, it means the texture Height unit is pixel. For example, 100px means the Height is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the texture material itself will be used.</li>
<li>If Width is empty but Height is not empty, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li> 
     * @return Height Height of a sticker, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a sticker is a percentage of the canvas height. For example, `10%` means that `Height` is 10% of the canvas height.</li>
<li>If a string ends with px, it means the texture Height unit is pixel. For example, 100px means the Height is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the texture material itself will be used.</li>
<li>If Width is empty but Height is not empty, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li>
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set Height of a sticker, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a sticker is a percentage of the canvas height. For example, `10%` means that `Height` is 10% of the canvas height.</li>
<li>If a string ends with px, it means the texture Height unit is pixel. For example, 100px means the Height is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the texture material itself will be used.</li>
<li>If Width is empty but Height is not empty, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li>
     * @param Height Height of a sticker, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a sticker is a percentage of the canvas height. For example, `10%` means that `Height` is 10% of the canvas height.</li>
<li>If a string ends with px, it means the texture Height unit is pixel. For example, 100px means the Height is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the texture material itself will be used.</li>
<li>If Width is empty but Height is not empty, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li>
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get Operation performed on the texture, such as image rotation. 
     * @return ImageOperations Operation performed on the texture, such as image rotation.
     */
    public ImageTransform [] getImageOperations() {
        return this.ImageOperations;
    }

    /**
     * Set Operation performed on the texture, such as image rotation.
     * @param ImageOperations Operation performed on the texture, such as image rotation.
     */
    public void setImageOperations(ImageTransform [] ImageOperations) {
        this.ImageOperations = ImageOperations;
    }

    public StickerTrackItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StickerTrackItem(StickerTrackItem source) {
        if (source.SourceMedia != null) {
            this.SourceMedia = new String(source.SourceMedia);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.StartTime != null) {
            this.StartTime = new Float(source.StartTime);
        }
        if (source.CoordinateOrigin != null) {
            this.CoordinateOrigin = new String(source.CoordinateOrigin);
        }
        if (source.XPos != null) {
            this.XPos = new String(source.XPos);
        }
        if (source.YPos != null) {
            this.YPos = new String(source.YPos);
        }
        if (source.Width != null) {
            this.Width = new String(source.Width);
        }
        if (source.Height != null) {
            this.Height = new String(source.Height);
        }
        if (source.ImageOperations != null) {
            this.ImageOperations = new ImageTransform[source.ImageOperations.length];
            for (int i = 0; i < source.ImageOperations.length; i++) {
                this.ImageOperations[i] = new ImageTransform(source.ImageOperations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceMedia", this.SourceMedia);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "CoordinateOrigin", this.CoordinateOrigin);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamArrayObj(map, prefix + "ImageOperations.", this.ImageOperations);

    }
}

