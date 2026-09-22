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

public class EditMediaVideoStream extends AbstractModel {

    /**
    * Encoding format for video streams. Optional values:
<li>libx264: H.264 encoding;</li>
<li>libx265: H.265 encoding;</li>
<li>av1: AOMedia Video 1 encoding;</li>
<li>H.266: H.266 encoding.</li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Bitrate of video stream. Value range: 0 and [128, 100000]. Unit: kbps.
When the value is 0 or not specified, VOD automatically sets the bitrate.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Resolution adaptation. Available values:
<li>open: enabled. At this point, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed. At this point, Width represents the video width, and Height indicates the video height.</li>
Default value: open.
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * Maximum value of the video stream width (or long edge) in px. Value range: 0 and [128, 4096].
<li>If both Width and Height are 0, the base resolution is used.</li>
<li>If Width is 0 but Height is not 0, the width will be scaled based on the benchmark resolution ratio.</li>
<li>If Width is not 0 but Height is 0, the height will be scaled based on the benchmark resolution ratio.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Maximum height (or short side) of the video stream. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the base resolution is used.</li>
<li>If Width is 0 but Height is not 0, the width will be scaled based on the benchmark resolution ratio.</li>
<li>If Width is not 0 but Height is 0, the height will be scaled based on the benchmark resolution ratio.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Video frame rate. Value range: [0, 100]. Unit: Hz.
When the value is 0, the frame rate is automatically set for the video.
Default value: 0.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
     * Get Encoding format for video streams. Optional values:
<li>libx264: H.264 encoding;</li>
<li>libx265: H.265 encoding;</li>
<li>av1: AOMedia Video 1 encoding;</li>
<li>H.266: H.266 encoding.</li> 
     * @return Codec Encoding format for video streams. Optional values:
<li>libx264: H.264 encoding;</li>
<li>libx265: H.265 encoding;</li>
<li>av1: AOMedia Video 1 encoding;</li>
<li>H.266: H.266 encoding.</li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Encoding format for video streams. Optional values:
<li>libx264: H.264 encoding;</li>
<li>libx265: H.265 encoding;</li>
<li>av1: AOMedia Video 1 encoding;</li>
<li>H.266: H.266 encoding.</li>
     * @param Codec Encoding format for video streams. Optional values:
<li>libx264: H.264 encoding;</li>
<li>libx265: H.265 encoding;</li>
<li>av1: AOMedia Video 1 encoding;</li>
<li>H.266: H.266 encoding.</li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Bitrate of video stream. Value range: 0 and [128, 100000]. Unit: kbps.
When the value is 0 or not specified, VOD automatically sets the bitrate. 
     * @return Bitrate Bitrate of video stream. Value range: 0 and [128, 100000]. Unit: kbps.
When the value is 0 or not specified, VOD automatically sets the bitrate.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Bitrate of video stream. Value range: 0 and [128, 100000]. Unit: kbps.
When the value is 0 or not specified, VOD automatically sets the bitrate.
     * @param Bitrate Bitrate of video stream. Value range: 0 and [128, 100000]. Unit: kbps.
When the value is 0 or not specified, VOD automatically sets the bitrate.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Resolution adaptation. Available values:
<li>open: enabled. At this point, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed. At this point, Width represents the video width, and Height indicates the video height.</li>
Default value: open. 
     * @return ResolutionAdaptive Resolution adaptation. Available values:
<li>open: enabled. At this point, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed. At this point, Width represents the video width, and Height indicates the video height.</li>
Default value: open.
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set Resolution adaptation. Available values:
<li>open: enabled. At this point, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed. At this point, Width represents the video width, and Height indicates the video height.</li>
Default value: open.
     * @param ResolutionAdaptive Resolution adaptation. Available values:
<li>open: enabled. At this point, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed. At this point, Width represents the video width, and Height indicates the video height.</li>
Default value: open.
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get Maximum value of the video stream width (or long edge) in px. Value range: 0 and [128, 4096].
<li>If both Width and Height are 0, the base resolution is used.</li>
<li>If Width is 0 but Height is not 0, the width will be scaled based on the benchmark resolution ratio.</li>
<li>If Width is not 0 but Height is 0, the height will be scaled based on the benchmark resolution ratio.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0. 
     * @return Width Maximum value of the video stream width (or long edge) in px. Value range: 0 and [128, 4096].
<li>If both Width and Height are 0, the base resolution is used.</li>
<li>If Width is 0 but Height is not 0, the width will be scaled based on the benchmark resolution ratio.</li>
<li>If Width is not 0 but Height is 0, the height will be scaled based on the benchmark resolution ratio.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Maximum value of the video stream width (or long edge) in px. Value range: 0 and [128, 4096].
<li>If both Width and Height are 0, the base resolution is used.</li>
<li>If Width is 0 but Height is not 0, the width will be scaled based on the benchmark resolution ratio.</li>
<li>If Width is not 0 but Height is 0, the height will be scaled based on the benchmark resolution ratio.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
     * @param Width Maximum value of the video stream width (or long edge) in px. Value range: 0 and [128, 4096].
<li>If both Width and Height are 0, the base resolution is used.</li>
<li>If Width is 0 but Height is not 0, the width will be scaled based on the benchmark resolution ratio.</li>
<li>If Width is not 0 but Height is 0, the height will be scaled based on the benchmark resolution ratio.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Maximum height (or short side) of the video stream. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the base resolution is used.</li>
<li>If Width is 0 but Height is not 0, the width will be scaled based on the benchmark resolution ratio.</li>
<li>If Width is not 0 but Height is 0, the height will be scaled based on the benchmark resolution ratio.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0. 
     * @return Height Maximum height (or short side) of the video stream. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the base resolution is used.</li>
<li>If Width is 0 but Height is not 0, the width will be scaled based on the benchmark resolution ratio.</li>
<li>If Width is not 0 but Height is 0, the height will be scaled based on the benchmark resolution ratio.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Maximum height (or short side) of the video stream. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the base resolution is used.</li>
<li>If Width is 0 but Height is not 0, the width will be scaled based on the benchmark resolution ratio.</li>
<li>If Width is not 0 but Height is 0, the height will be scaled based on the benchmark resolution ratio.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
     * @param Height Maximum height (or short side) of the video stream. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the base resolution is used.</li>
<li>If Width is 0 but Height is not 0, the width will be scaled based on the benchmark resolution ratio.</li>
<li>If Width is not 0 but Height is 0, the height will be scaled based on the benchmark resolution ratio.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Video frame rate. Value range: [0, 100]. Unit: Hz.
When the value is 0, the frame rate is automatically set for the video.
Default value: 0. 
     * @return Fps Video frame rate. Value range: [0, 100]. Unit: Hz.
When the value is 0, the frame rate is automatically set for the video.
Default value: 0.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Video frame rate. Value range: [0, 100]. Unit: Hz.
When the value is 0, the frame rate is automatically set for the video.
Default value: 0.
     * @param Fps Video frame rate. Value range: [0, 100]. Unit: Hz.
When the value is 0, the frame rate is automatically set for the video.
Default value: 0.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    public EditMediaVideoStream() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditMediaVideoStream(EditMediaVideoStream source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.ResolutionAdaptive != null) {
            this.ResolutionAdaptive = new String(source.ResolutionAdaptive);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "ResolutionAdaptive", this.ResolutionAdaptive);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);

    }
}

