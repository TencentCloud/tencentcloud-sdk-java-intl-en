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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoTemplateInfo extends AbstractModel {

    /**
    * Encoding format for video streams. Optional values: <li>H.264: Use H.264 encoding;</li><li>H.265: Use H.265 encoding.</li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Video frame rate. Value range: [0, 30]. Unit: Hz.
If the value is 0, the frame rate will be the same as that of the source video, with a maximum of 30.
Default value: 0.
    */
    @SerializedName("Fps")
    @Expose
    private Float Fps;

    /**
    * Bitrate of video stream. Value range: 0 and [128, 10000]. Unit: kbps.
If the value is 0, the bitrate is automatically selected based on the video footage and quality.
Default value: 0.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Resolution adaptation. Available values: <li>open: enable. At this point, Width represents the long side of the video, and Height represents the short side.</li><li>close: disable. At this point, Width represents the width of the video, and Height represents the height.</li>Default value: open.
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * The maximum value of the video stream width (or long side). Valid values: 0 and [128, 1920]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, the Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The maximum value of the video stream height (or short side). Valid values: 0 and [128, 1080]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Filling method, which is the processing method for transcoding when the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, is called "filling". Optional filling modes: <li>stretch: stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched".</li><li>black: keep the video aspect ratio unchanged and fill the edges with black.</li><li>white: keep the video aspect ratio unchanged and fill the edges with white.</li><li>gauss: keep the video aspect ratio unchanged and use Gaussian blur filling for the rest of the edges.</li>Default value: black.
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
     * Get Encoding format for video streams. Optional values: <li>H.264: Use H.264 encoding;</li><li>H.265: Use H.265 encoding.</li> 
     * @return Codec Encoding format for video streams. Optional values: <li>H.264: Use H.264 encoding;</li><li>H.265: Use H.265 encoding.</li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Encoding format for video streams. Optional values: <li>H.264: Use H.264 encoding;</li><li>H.265: Use H.265 encoding.</li>
     * @param Codec Encoding format for video streams. Optional values: <li>H.264: Use H.264 encoding;</li><li>H.265: Use H.265 encoding.</li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Video frame rate. Value range: [0, 30]. Unit: Hz.
If the value is 0, the frame rate will be the same as that of the source video, with a maximum of 30.
Default value: 0. 
     * @return Fps Video frame rate. Value range: [0, 30]. Unit: Hz.
If the value is 0, the frame rate will be the same as that of the source video, with a maximum of 30.
Default value: 0.
     */
    public Float getFps() {
        return this.Fps;
    }

    /**
     * Set Video frame rate. Value range: [0, 30]. Unit: Hz.
If the value is 0, the frame rate will be the same as that of the source video, with a maximum of 30.
Default value: 0.
     * @param Fps Video frame rate. Value range: [0, 30]. Unit: Hz.
If the value is 0, the frame rate will be the same as that of the source video, with a maximum of 30.
Default value: 0.
     */
    public void setFps(Float Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Bitrate of video stream. Value range: 0 and [128, 10000]. Unit: kbps.
If the value is 0, the bitrate is automatically selected based on the video footage and quality.
Default value: 0. 
     * @return Bitrate Bitrate of video stream. Value range: 0 and [128, 10000]. Unit: kbps.
If the value is 0, the bitrate is automatically selected based on the video footage and quality.
Default value: 0.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Bitrate of video stream. Value range: 0 and [128, 10000]. Unit: kbps.
If the value is 0, the bitrate is automatically selected based on the video footage and quality.
Default value: 0.
     * @param Bitrate Bitrate of video stream. Value range: 0 and [128, 10000]. Unit: kbps.
If the value is 0, the bitrate is automatically selected based on the video footage and quality.
Default value: 0.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Resolution adaptation. Available values: <li>open: enable. At this point, Width represents the long side of the video, and Height represents the short side.</li><li>close: disable. At this point, Width represents the width of the video, and Height represents the height.</li>Default value: open. 
     * @return ResolutionAdaptive Resolution adaptation. Available values: <li>open: enable. At this point, Width represents the long side of the video, and Height represents the short side.</li><li>close: disable. At this point, Width represents the width of the video, and Height represents the height.</li>Default value: open.
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set Resolution adaptation. Available values: <li>open: enable. At this point, Width represents the long side of the video, and Height represents the short side.</li><li>close: disable. At this point, Width represents the width of the video, and Height represents the height.</li>Default value: open.
     * @param ResolutionAdaptive Resolution adaptation. Available values: <li>open: enable. At this point, Width represents the long side of the video, and Height represents the short side.</li><li>close: disable. At this point, Width represents the width of the video, and Height represents the height.</li>Default value: open.
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get The maximum value of the video stream width (or long side). Valid values: 0 and [128, 1920]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, the Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0. 
     * @return Width The maximum value of the video stream width (or long side). Valid values: 0 and [128, 1920]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, the Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The maximum value of the video stream width (or long side). Valid values: 0 and [128, 1920]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, the Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0.
     * @param Width The maximum value of the video stream width (or long side). Valid values: 0 and [128, 1920]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, the Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The maximum value of the video stream height (or short side). Valid values: 0 and [128, 1080]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0. 
     * @return Height The maximum value of the video stream height (or short side). Valid values: 0 and [128, 1080]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The maximum value of the video stream height (or short side). Valid values: 0 and [128, 1080]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0.
     * @param Height The maximum value of the video stream height (or short side). Valid values: 0 and [128, 1080]. Unit: px.<li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>Default value: 0.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Filling method, which is the processing method for transcoding when the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, is called "filling". Optional filling modes: <li>stretch: stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched".</li><li>black: keep the video aspect ratio unchanged and fill the edges with black.</li><li>white: keep the video aspect ratio unchanged and fill the edges with white.</li><li>gauss: keep the video aspect ratio unchanged and use Gaussian blur filling for the rest of the edges.</li>Default value: black. 
     * @return FillType Filling method, which is the processing method for transcoding when the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, is called "filling". Optional filling modes: <li>stretch: stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched".</li><li>black: keep the video aspect ratio unchanged and fill the edges with black.</li><li>white: keep the video aspect ratio unchanged and fill the edges with white.</li><li>gauss: keep the video aspect ratio unchanged and use Gaussian blur filling for the rest of the edges.</li>Default value: black.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set Filling method, which is the processing method for transcoding when the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, is called "filling". Optional filling modes: <li>stretch: stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched".</li><li>black: keep the video aspect ratio unchanged and fill the edges with black.</li><li>white: keep the video aspect ratio unchanged and fill the edges with white.</li><li>gauss: keep the video aspect ratio unchanged and use Gaussian blur filling for the rest of the edges.</li>Default value: black.
     * @param FillType Filling method, which is the processing method for transcoding when the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, is called "filling". Optional filling modes: <li>stretch: stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched".</li><li>black: keep the video aspect ratio unchanged and fill the edges with black.</li><li>white: keep the video aspect ratio unchanged and fill the edges with white.</li><li>gauss: keep the video aspect ratio unchanged and use Gaussian blur filling for the rest of the edges.</li>Default value: black.
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    public VideoTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoTemplateInfo(VideoTemplateInfo source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Fps != null) {
            this.Fps = new Float(source.Fps);
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
        if (source.FillType != null) {
            this.FillType = new String(source.FillType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "ResolutionAdaptive", this.ResolutionAdaptive);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "FillType", this.FillType);

    }
}

