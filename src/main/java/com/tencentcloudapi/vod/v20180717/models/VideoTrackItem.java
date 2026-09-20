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

public class VideoTrackItem extends AbstractModel {

    /**
    * Media material source of the video clip, which can be:
<li>Media file ID for VOD;</li>
<li>Download URL of other media files.</li>
Note: When using the download URL of another media file as the material source and access control (such as hotlink protection) is enabled, the URL needs to carry access control parameters (such as a hotlink protection signature).
    */
    @SerializedName("SourceMedia")
    @Expose
    private String SourceMedia;

    /**
    * Start time of the video clip in the material file, in seconds. Default value: 0.
    */
    @SerializedName("SourceMediaStartTime")
    @Expose
    private Float SourceMediaStartTime;

    /**
    * Video segment duration, in seconds. Default value: the length of the video material itself, which means the entire material is captured. If the source file is an image, Duration must be greater than 0.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * Target duration of the video clip, in seconds.
<li>If TargetDuration is not specified or set to 0, it means the target duration is the same as Duration;</li>
<li>When TargetDuration is set to a value more than 0, the video clip will be fast-forwarded or slowed down to make the duration of the output segment equal to TargetDuration.</li>
    */
    @SerializedName("TargetDuration")
    @Expose
    private Float TargetDuration;

    /**
    * Video origin position. Valid values:
<li>Center: The coordinate origin is the central position, such as the center of the canvas.</li>
Default value: Center.
    */
    @SerializedName("CoordinateOrigin")
    @Expose
    private String CoordinateOrigin;

    /**
    * Horizontal position of the video clip origin point relative to the origin of canvas. Supports % and px formats.
<li>When the string ends with %, it means the video clip XPos is at the specified percentage of the canvas width. For example, 10% means XPos is at 10% of the canvas width.</li>
<li>If a string ends with px, it means the unit of the video clip XPos is pixel. For example, 100px means XPos is 100 pixels.</li>
Default value: 0px.
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * Vertical position of the video clip origin point relative to the canvas origin point. Supports % and px formats.
<li>If a string ends with %, it indicates that the `YPos` of a video clip is at a specified percentage of the canvas height. For example, `10%` means that `YPos` is 10% of the canvas height.</li>
<li>If a string ends with px, it means the unit of the video clip YPos is pixel. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px.
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * Width of a video clip, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a video clip is a percentage of the canvas width. For example, `10%` means that `Width` is 10% of the canvas width.</li>
<li>If a string ends with px, it means the video clip Width unit is pixel. For example, 100px means the Width is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the video footage itself will be used.</li>
<li>If Width is empty but Height is not empty, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li>
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * Height of a video clip, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a video clip is a percentage of the canvas height. For example, `10%` means that `Height` is 10% of the canvas height.</li>
</li><li>If a string ends with px, it means the video clip Height unit is pixel. For example, 100px means the Height is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the video footage itself will be used.</li>
<li>If Width is empty but Height is not empty, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li>
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * Perform operations on audio, such as muting.
    */
    @SerializedName("AudioOperations")
    @Expose
    private AudioTransform [] AudioOperations;

    /**
    * Operation performed on the image, for example, image rotation.
    */
    @SerializedName("ImageOperations")
    @Expose
    private ImageTransform [] ImageOperations;

    /**
     * Get Media material source of the video clip, which can be:
<li>Media file ID for VOD;</li>
<li>Download URL of other media files.</li>
Note: When using the download URL of another media file as the material source and access control (such as hotlink protection) is enabled, the URL needs to carry access control parameters (such as a hotlink protection signature). 
     * @return SourceMedia Media material source of the video clip, which can be:
<li>Media file ID for VOD;</li>
<li>Download URL of other media files.</li>
Note: When using the download URL of another media file as the material source and access control (such as hotlink protection) is enabled, the URL needs to carry access control parameters (such as a hotlink protection signature).
     */
    public String getSourceMedia() {
        return this.SourceMedia;
    }

    /**
     * Set Media material source of the video clip, which can be:
<li>Media file ID for VOD;</li>
<li>Download URL of other media files.</li>
Note: When using the download URL of another media file as the material source and access control (such as hotlink protection) is enabled, the URL needs to carry access control parameters (such as a hotlink protection signature).
     * @param SourceMedia Media material source of the video clip, which can be:
<li>Media file ID for VOD;</li>
<li>Download URL of other media files.</li>
Note: When using the download URL of another media file as the material source and access control (such as hotlink protection) is enabled, the URL needs to carry access control parameters (such as a hotlink protection signature).
     */
    public void setSourceMedia(String SourceMedia) {
        this.SourceMedia = SourceMedia;
    }

    /**
     * Get Start time of the video clip in the material file, in seconds. Default value: 0. 
     * @return SourceMediaStartTime Start time of the video clip in the material file, in seconds. Default value: 0.
     */
    public Float getSourceMediaStartTime() {
        return this.SourceMediaStartTime;
    }

    /**
     * Set Start time of the video clip in the material file, in seconds. Default value: 0.
     * @param SourceMediaStartTime Start time of the video clip in the material file, in seconds. Default value: 0.
     */
    public void setSourceMediaStartTime(Float SourceMediaStartTime) {
        this.SourceMediaStartTime = SourceMediaStartTime;
    }

    /**
     * Get Video segment duration, in seconds. Default value: the length of the video material itself, which means the entire material is captured. If the source file is an image, Duration must be greater than 0. 
     * @return Duration Video segment duration, in seconds. Default value: the length of the video material itself, which means the entire material is captured. If the source file is an image, Duration must be greater than 0.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Video segment duration, in seconds. Default value: the length of the video material itself, which means the entire material is captured. If the source file is an image, Duration must be greater than 0.
     * @param Duration Video segment duration, in seconds. Default value: the length of the video material itself, which means the entire material is captured. If the source file is an image, Duration must be greater than 0.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Target duration of the video clip, in seconds.
<li>If TargetDuration is not specified or set to 0, it means the target duration is the same as Duration;</li>
<li>When TargetDuration is set to a value more than 0, the video clip will be fast-forwarded or slowed down to make the duration of the output segment equal to TargetDuration.</li> 
     * @return TargetDuration Target duration of the video clip, in seconds.
<li>If TargetDuration is not specified or set to 0, it means the target duration is the same as Duration;</li>
<li>When TargetDuration is set to a value more than 0, the video clip will be fast-forwarded or slowed down to make the duration of the output segment equal to TargetDuration.</li>
     */
    public Float getTargetDuration() {
        return this.TargetDuration;
    }

    /**
     * Set Target duration of the video clip, in seconds.
<li>If TargetDuration is not specified or set to 0, it means the target duration is the same as Duration;</li>
<li>When TargetDuration is set to a value more than 0, the video clip will be fast-forwarded or slowed down to make the duration of the output segment equal to TargetDuration.</li>
     * @param TargetDuration Target duration of the video clip, in seconds.
<li>If TargetDuration is not specified or set to 0, it means the target duration is the same as Duration;</li>
<li>When TargetDuration is set to a value more than 0, the video clip will be fast-forwarded or slowed down to make the duration of the output segment equal to TargetDuration.</li>
     */
    public void setTargetDuration(Float TargetDuration) {
        this.TargetDuration = TargetDuration;
    }

    /**
     * Get Video origin position. Valid values:
<li>Center: The coordinate origin is the central position, such as the center of the canvas.</li>
Default value: Center. 
     * @return CoordinateOrigin Video origin position. Valid values:
<li>Center: The coordinate origin is the central position, such as the center of the canvas.</li>
Default value: Center.
     */
    public String getCoordinateOrigin() {
        return this.CoordinateOrigin;
    }

    /**
     * Set Video origin position. Valid values:
<li>Center: The coordinate origin is the central position, such as the center of the canvas.</li>
Default value: Center.
     * @param CoordinateOrigin Video origin position. Valid values:
<li>Center: The coordinate origin is the central position, such as the center of the canvas.</li>
Default value: Center.
     */
    public void setCoordinateOrigin(String CoordinateOrigin) {
        this.CoordinateOrigin = CoordinateOrigin;
    }

    /**
     * Get Horizontal position of the video clip origin point relative to the origin of canvas. Supports % and px formats.
<li>When the string ends with %, it means the video clip XPos is at the specified percentage of the canvas width. For example, 10% means XPos is at 10% of the canvas width.</li>
<li>If a string ends with px, it means the unit of the video clip XPos is pixel. For example, 100px means XPos is 100 pixels.</li>
Default value: 0px. 
     * @return XPos Horizontal position of the video clip origin point relative to the origin of canvas. Supports % and px formats.
<li>When the string ends with %, it means the video clip XPos is at the specified percentage of the canvas width. For example, 10% means XPos is at 10% of the canvas width.</li>
<li>If a string ends with px, it means the unit of the video clip XPos is pixel. For example, 100px means XPos is 100 pixels.</li>
Default value: 0px.
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set Horizontal position of the video clip origin point relative to the origin of canvas. Supports % and px formats.
<li>When the string ends with %, it means the video clip XPos is at the specified percentage of the canvas width. For example, 10% means XPos is at 10% of the canvas width.</li>
<li>If a string ends with px, it means the unit of the video clip XPos is pixel. For example, 100px means XPos is 100 pixels.</li>
Default value: 0px.
     * @param XPos Horizontal position of the video clip origin point relative to the origin of canvas. Supports % and px formats.
<li>When the string ends with %, it means the video clip XPos is at the specified percentage of the canvas width. For example, 10% means XPos is at 10% of the canvas width.</li>
<li>If a string ends with px, it means the unit of the video clip XPos is pixel. For example, 100px means XPos is 100 pixels.</li>
Default value: 0px.
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get Vertical position of the video clip origin point relative to the canvas origin point. Supports % and px formats.
<li>If a string ends with %, it indicates that the `YPos` of a video clip is at a specified percentage of the canvas height. For example, `10%` means that `YPos` is 10% of the canvas height.</li>
<li>If a string ends with px, it means the unit of the video clip YPos is pixel. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px. 
     * @return YPos Vertical position of the video clip origin point relative to the canvas origin point. Supports % and px formats.
<li>If a string ends with %, it indicates that the `YPos` of a video clip is at a specified percentage of the canvas height. For example, `10%` means that `YPos` is 10% of the canvas height.</li>
<li>If a string ends with px, it means the unit of the video clip YPos is pixel. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px.
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set Vertical position of the video clip origin point relative to the canvas origin point. Supports % and px formats.
<li>If a string ends with %, it indicates that the `YPos` of a video clip is at a specified percentage of the canvas height. For example, `10%` means that `YPos` is 10% of the canvas height.</li>
<li>If a string ends with px, it means the unit of the video clip YPos is pixel. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px.
     * @param YPos Vertical position of the video clip origin point relative to the canvas origin point. Supports % and px formats.
<li>If a string ends with %, it indicates that the `YPos` of a video clip is at a specified percentage of the canvas height. For example, `10%` means that `YPos` is 10% of the canvas height.</li>
<li>If a string ends with px, it means the unit of the video clip YPos is pixel. For example, 100px means YPos is 100 pixels.</li>
Default value: 0px.
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get Width of a video clip, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a video clip is a percentage of the canvas width. For example, `10%` means that `Width` is 10% of the canvas width.</li>
<li>If a string ends with px, it means the video clip Width unit is pixel. For example, 100px means the Width is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the video footage itself will be used.</li>
<li>If Width is empty but Height is not empty, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li> 
     * @return Width Width of a video clip, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a video clip is a percentage of the canvas width. For example, `10%` means that `Width` is 10% of the canvas width.</li>
<li>If a string ends with px, it means the video clip Width unit is pixel. For example, 100px means the Width is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the video footage itself will be used.</li>
<li>If Width is empty but Height is not empty, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li>
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set Width of a video clip, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a video clip is a percentage of the canvas width. For example, `10%` means that `Width` is 10% of the canvas width.</li>
<li>If a string ends with px, it means the video clip Width unit is pixel. For example, 100px means the Width is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the video footage itself will be used.</li>
<li>If Width is empty but Height is not empty, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li>
     * @param Width Width of a video clip, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Width` of a video clip is a percentage of the canvas width. For example, `10%` means that `Width` is 10% of the canvas width.</li>
<li>If a string ends with px, it means the video clip Width unit is pixel. For example, 100px means the Width is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the video footage itself will be used.</li>
<li>If Width is empty but Height is not empty, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li>
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * Get Height of a video clip, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a video clip is a percentage of the canvas height. For example, `10%` means that `Height` is 10% of the canvas height.</li>
</li><li>If a string ends with px, it means the video clip Height unit is pixel. For example, 100px means the Height is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the video footage itself will be used.</li>
<li>If Width is empty but Height is not empty, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li> 
     * @return Height Height of a video clip, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a video clip is a percentage of the canvas height. For example, `10%` means that `Height` is 10% of the canvas height.</li>
</li><li>If a string ends with px, it means the video clip Height unit is pixel. For example, 100px means the Height is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the video footage itself will be used.</li>
<li>If Width is empty but Height is not empty, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li>
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set Height of a video clip, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a video clip is a percentage of the canvas height. For example, `10%` means that `Height` is 10% of the canvas height.</li>
</li><li>If a string ends with px, it means the video clip Height unit is pixel. For example, 100px means the Height is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the video footage itself will be used.</li>
<li>If Width is empty but Height is not empty, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li>
     * @param Height Height of a video clip, supporting two formats: % and px.
<li>If a string ends with %, it indicates that the `Height` of a video clip is a percentage of the canvas height. For example, `10%` means that `Height` is 10% of the canvas height.</li>
</li><li>If a string ends with px, it means the video clip Height unit is pixel. For example, 100px means the Height is 100 pixels.</li>
<li>If both Width and Height are empty, the width and height of the video footage itself will be used.</li>
<li>If Width is empty but Height is not empty, the width will be proportionally scaled.</li>
<li>If Width is not empty but Height is empty, the height will be proportionally scaled.</li>
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get Perform operations on audio, such as muting. 
     * @return AudioOperations Perform operations on audio, such as muting.
     */
    public AudioTransform [] getAudioOperations() {
        return this.AudioOperations;
    }

    /**
     * Set Perform operations on audio, such as muting.
     * @param AudioOperations Perform operations on audio, such as muting.
     */
    public void setAudioOperations(AudioTransform [] AudioOperations) {
        this.AudioOperations = AudioOperations;
    }

    /**
     * Get Operation performed on the image, for example, image rotation. 
     * @return ImageOperations Operation performed on the image, for example, image rotation.
     */
    public ImageTransform [] getImageOperations() {
        return this.ImageOperations;
    }

    /**
     * Set Operation performed on the image, for example, image rotation.
     * @param ImageOperations Operation performed on the image, for example, image rotation.
     */
    public void setImageOperations(ImageTransform [] ImageOperations) {
        this.ImageOperations = ImageOperations;
    }

    public VideoTrackItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoTrackItem(VideoTrackItem source) {
        if (source.SourceMedia != null) {
            this.SourceMedia = new String(source.SourceMedia);
        }
        if (source.SourceMediaStartTime != null) {
            this.SourceMediaStartTime = new Float(source.SourceMediaStartTime);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.TargetDuration != null) {
            this.TargetDuration = new Float(source.TargetDuration);
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
        if (source.AudioOperations != null) {
            this.AudioOperations = new AudioTransform[source.AudioOperations.length];
            for (int i = 0; i < source.AudioOperations.length; i++) {
                this.AudioOperations[i] = new AudioTransform(source.AudioOperations[i]);
            }
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
        this.setParamSimple(map, prefix + "SourceMediaStartTime", this.SourceMediaStartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "TargetDuration", this.TargetDuration);
        this.setParamSimple(map, prefix + "CoordinateOrigin", this.CoordinateOrigin);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamArrayObj(map, prefix + "AudioOperations.", this.AudioOperations);
        this.setParamArrayObj(map, prefix + "ImageOperations.", this.ImageOperations);

    }
}

