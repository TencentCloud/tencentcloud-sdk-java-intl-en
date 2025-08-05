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
    * Encoding format for video streams. valid values: <li>H.264: use H.264 encoding;</li><li>H.265: use H.265 encoding.</li>.
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Video frame rate. value ranges from 0 to 30. measurement unit: Hz.
If the value is 0, the frame rate will be the same as that of the source video, with a maximum not exceeding 30.
Default value: 0.
    */
    @SerializedName("Fps")
    @Expose
    private Float Fps;

    /**
    * Specifies the bitrate of video stream. valid values: 0 and [128, 10000]. measurement unit: kbps.
Value is 0, means automatically select video bitrate based on video image and quality.
Default value: 0.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Resolution adaptation. available values: <li>open: enable. at this point, Width represents the long side of the video and Height represents the short side.</li><li>close: disable. at this point, Width represents the Width of the video and Height represents the Height.</li>default value: open.
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * The maximum value of the video stream Width (or long side). valid values: 0 and [128, 1920]. unit: px. <li>when Width and Height are both 0, the resolution is from the same source;</li> <li>when Width is 0 and Height is non-0, Width is scaled proportionally;</li> <li>when Width is non-0 and Height is 0, Height is scaled proportionally;</li> <li>when both Width and Height are non-0, the resolution is specified by the user.</li> default value: 0.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The maximum value of the video stream Height (or short side). valid values: 0 and [128, 1080]. unit: px. <li>when Width and Height are both 0, the resolution is from the same source;</li> <li>when Width is 0 and Height is non-0, Width is scaled proportionally;</li> <li>when Width is non-0 and Height is 0, the Height is scaled proportionally;</li> <li>when both Width and Height are non-0, the resolution is specified by the user.</li> default value: 0.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Filling method. specifies the processing method for transcoding when video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video. valid values: <li>stretch: stretch each frame to fill the entire screen, possibly causing the transcoded video to be squashed or stretched.</li><li>black: maintain video aspect ratio with edges filled with black.</li><li>white: maintain video aspect ratio with edges filled with white.</li><li>gauss: maintain video aspect ratio with gaussian blur filling for the rest of the edges.</li> default value: black.
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
     * Get Encoding format for video streams. valid values: <li>H.264: use H.264 encoding;</li><li>H.265: use H.265 encoding.</li>. 
     * @return Codec Encoding format for video streams. valid values: <li>H.264: use H.264 encoding;</li><li>H.265: use H.265 encoding.</li>.
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Encoding format for video streams. valid values: <li>H.264: use H.264 encoding;</li><li>H.265: use H.265 encoding.</li>.
     * @param Codec Encoding format for video streams. valid values: <li>H.264: use H.264 encoding;</li><li>H.265: use H.265 encoding.</li>.
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Video frame rate. value ranges from 0 to 30. measurement unit: Hz.
If the value is 0, the frame rate will be the same as that of the source video, with a maximum not exceeding 30.
Default value: 0. 
     * @return Fps Video frame rate. value ranges from 0 to 30. measurement unit: Hz.
If the value is 0, the frame rate will be the same as that of the source video, with a maximum not exceeding 30.
Default value: 0.
     */
    public Float getFps() {
        return this.Fps;
    }

    /**
     * Set Video frame rate. value ranges from 0 to 30. measurement unit: Hz.
If the value is 0, the frame rate will be the same as that of the source video, with a maximum not exceeding 30.
Default value: 0.
     * @param Fps Video frame rate. value ranges from 0 to 30. measurement unit: Hz.
If the value is 0, the frame rate will be the same as that of the source video, with a maximum not exceeding 30.
Default value: 0.
     */
    public void setFps(Float Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Specifies the bitrate of video stream. valid values: 0 and [128, 10000]. measurement unit: kbps.
Value is 0, means automatically select video bitrate based on video image and quality.
Default value: 0. 
     * @return Bitrate Specifies the bitrate of video stream. valid values: 0 and [128, 10000]. measurement unit: kbps.
Value is 0, means automatically select video bitrate based on video image and quality.
Default value: 0.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Specifies the bitrate of video stream. valid values: 0 and [128, 10000]. measurement unit: kbps.
Value is 0, means automatically select video bitrate based on video image and quality.
Default value: 0.
     * @param Bitrate Specifies the bitrate of video stream. valid values: 0 and [128, 10000]. measurement unit: kbps.
Value is 0, means automatically select video bitrate based on video image and quality.
Default value: 0.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Resolution adaptation. available values: <li>open: enable. at this point, Width represents the long side of the video and Height represents the short side.</li><li>close: disable. at this point, Width represents the Width of the video and Height represents the Height.</li>default value: open. 
     * @return ResolutionAdaptive Resolution adaptation. available values: <li>open: enable. at this point, Width represents the long side of the video and Height represents the short side.</li><li>close: disable. at this point, Width represents the Width of the video and Height represents the Height.</li>default value: open.
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set Resolution adaptation. available values: <li>open: enable. at this point, Width represents the long side of the video and Height represents the short side.</li><li>close: disable. at this point, Width represents the Width of the video and Height represents the Height.</li>default value: open.
     * @param ResolutionAdaptive Resolution adaptation. available values: <li>open: enable. at this point, Width represents the long side of the video and Height represents the short side.</li><li>close: disable. at this point, Width represents the Width of the video and Height represents the Height.</li>default value: open.
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get The maximum value of the video stream Width (or long side). valid values: 0 and [128, 1920]. unit: px. <li>when Width and Height are both 0, the resolution is from the same source;</li> <li>when Width is 0 and Height is non-0, Width is scaled proportionally;</li> <li>when Width is non-0 and Height is 0, Height is scaled proportionally;</li> <li>when both Width and Height are non-0, the resolution is specified by the user.</li> default value: 0. 
     * @return Width The maximum value of the video stream Width (or long side). valid values: 0 and [128, 1920]. unit: px. <li>when Width and Height are both 0, the resolution is from the same source;</li> <li>when Width is 0 and Height is non-0, Width is scaled proportionally;</li> <li>when Width is non-0 and Height is 0, Height is scaled proportionally;</li> <li>when both Width and Height are non-0, the resolution is specified by the user.</li> default value: 0.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The maximum value of the video stream Width (or long side). valid values: 0 and [128, 1920]. unit: px. <li>when Width and Height are both 0, the resolution is from the same source;</li> <li>when Width is 0 and Height is non-0, Width is scaled proportionally;</li> <li>when Width is non-0 and Height is 0, Height is scaled proportionally;</li> <li>when both Width and Height are non-0, the resolution is specified by the user.</li> default value: 0.
     * @param Width The maximum value of the video stream Width (or long side). valid values: 0 and [128, 1920]. unit: px. <li>when Width and Height are both 0, the resolution is from the same source;</li> <li>when Width is 0 and Height is non-0, Width is scaled proportionally;</li> <li>when Width is non-0 and Height is 0, Height is scaled proportionally;</li> <li>when both Width and Height are non-0, the resolution is specified by the user.</li> default value: 0.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The maximum value of the video stream Height (or short side). valid values: 0 and [128, 1080]. unit: px. <li>when Width and Height are both 0, the resolution is from the same source;</li> <li>when Width is 0 and Height is non-0, Width is scaled proportionally;</li> <li>when Width is non-0 and Height is 0, the Height is scaled proportionally;</li> <li>when both Width and Height are non-0, the resolution is specified by the user.</li> default value: 0. 
     * @return Height The maximum value of the video stream Height (or short side). valid values: 0 and [128, 1080]. unit: px. <li>when Width and Height are both 0, the resolution is from the same source;</li> <li>when Width is 0 and Height is non-0, Width is scaled proportionally;</li> <li>when Width is non-0 and Height is 0, the Height is scaled proportionally;</li> <li>when both Width and Height are non-0, the resolution is specified by the user.</li> default value: 0.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The maximum value of the video stream Height (or short side). valid values: 0 and [128, 1080]. unit: px. <li>when Width and Height are both 0, the resolution is from the same source;</li> <li>when Width is 0 and Height is non-0, Width is scaled proportionally;</li> <li>when Width is non-0 and Height is 0, the Height is scaled proportionally;</li> <li>when both Width and Height are non-0, the resolution is specified by the user.</li> default value: 0.
     * @param Height The maximum value of the video stream Height (or short side). valid values: 0 and [128, 1080]. unit: px. <li>when Width and Height are both 0, the resolution is from the same source;</li> <li>when Width is 0 and Height is non-0, Width is scaled proportionally;</li> <li>when Width is non-0 and Height is 0, the Height is scaled proportionally;</li> <li>when both Width and Height are non-0, the resolution is specified by the user.</li> default value: 0.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Filling method. specifies the processing method for transcoding when video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video. valid values: <li>stretch: stretch each frame to fill the entire screen, possibly causing the transcoded video to be squashed or stretched.</li><li>black: maintain video aspect ratio with edges filled with black.</li><li>white: maintain video aspect ratio with edges filled with white.</li><li>gauss: maintain video aspect ratio with gaussian blur filling for the rest of the edges.</li> default value: black. 
     * @return FillType Filling method. specifies the processing method for transcoding when video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video. valid values: <li>stretch: stretch each frame to fill the entire screen, possibly causing the transcoded video to be squashed or stretched.</li><li>black: maintain video aspect ratio with edges filled with black.</li><li>white: maintain video aspect ratio with edges filled with white.</li><li>gauss: maintain video aspect ratio with gaussian blur filling for the rest of the edges.</li> default value: black.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set Filling method. specifies the processing method for transcoding when video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video. valid values: <li>stretch: stretch each frame to fill the entire screen, possibly causing the transcoded video to be squashed or stretched.</li><li>black: maintain video aspect ratio with edges filled with black.</li><li>white: maintain video aspect ratio with edges filled with white.</li><li>gauss: maintain video aspect ratio with gaussian blur filling for the rest of the edges.</li> default value: black.
     * @param FillType Filling method. specifies the processing method for transcoding when video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video. valid values: <li>stretch: stretch each frame to fill the entire screen, possibly causing the transcoded video to be squashed or stretched.</li><li>black: maintain video aspect ratio with edges filled with black.</li><li>white: maintain video aspect ratio with edges filled with white.</li><li>gauss: maintain video aspect ratio with gaussian blur filling for the rest of the edges.</li> default value: black.
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

