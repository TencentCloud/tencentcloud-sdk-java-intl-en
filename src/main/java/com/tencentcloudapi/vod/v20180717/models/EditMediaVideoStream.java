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
    * The encoding format of the video stream, optional values:
<li>libx264: H.264 encoding;</li>
<li>libx265: H.265 encoding;</li>
<li>av1: AOMedia Video 1 encoding;</li>
<li>H.266: H.266 encoding. </li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * The bit rate of the video stream, value range: 0 and [128, 35000], unit: kbps. 
When the value is 0 or left blank, it means automatically selecting the best video bit rate.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Resolution adaptive, optional values:
<li>open: open, at this time, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed, at this time , Width represents the width of the video, and Height represents the height of the video. </li>
Default value: open.
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * Resolution adaptive, optional values:
<li>open: open, at this time, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed, at this time , Width represents the width of the video, and Height represents the height of the video. </li>
Default value: open.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The maximum value of the video stream height (or short side), value range: 0 and [128, 4096], unit: px. 
<li>When Width and Height are both 0, the resolution is based on the base resolution;</li>
<li>When Width is 0 and Height is non-0, Width is scaled according to the base resolution;</li> li>
<li>When Width is non-0 and Height is 0, the Height is scaled according to the base resolution; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>
Default value: 0.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Video frame rate, value range: [0, 100], unit: Hz. 
When the value is 0, the frame rate will be automatically set for the video. 
The default value is 0.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
     * Get The encoding format of the video stream, optional values:
<li>libx264: H.264 encoding;</li>
<li>libx265: H.265 encoding;</li>
<li>av1: AOMedia Video 1 encoding;</li>
<li>H.266: H.266 encoding. </li> 
     * @return Codec The encoding format of the video stream, optional values:
<li>libx264: H.264 encoding;</li>
<li>libx265: H.265 encoding;</li>
<li>av1: AOMedia Video 1 encoding;</li>
<li>H.266: H.266 encoding. </li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set The encoding format of the video stream, optional values:
<li>libx264: H.264 encoding;</li>
<li>libx265: H.265 encoding;</li>
<li>av1: AOMedia Video 1 encoding;</li>
<li>H.266: H.266 encoding. </li>
     * @param Codec The encoding format of the video stream, optional values:
<li>libx264: H.264 encoding;</li>
<li>libx265: H.265 encoding;</li>
<li>av1: AOMedia Video 1 encoding;</li>
<li>H.266: H.266 encoding. </li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get The bit rate of the video stream, value range: 0 and [128, 35000], unit: kbps. 
When the value is 0 or left blank, it means automatically selecting the best video bit rate. 
     * @return Bitrate The bit rate of the video stream, value range: 0 and [128, 35000], unit: kbps. 
When the value is 0 or left blank, it means automatically selecting the best video bit rate.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set The bit rate of the video stream, value range: 0 and [128, 35000], unit: kbps. 
When the value is 0 or left blank, it means automatically selecting the best video bit rate.
     * @param Bitrate The bit rate of the video stream, value range: 0 and [128, 35000], unit: kbps. 
When the value is 0 or left blank, it means automatically selecting the best video bit rate.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Resolution adaptive, optional values:
<li>open: open, at this time, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed, at this time , Width represents the width of the video, and Height represents the height of the video. </li>
Default value: open. 
     * @return ResolutionAdaptive Resolution adaptive, optional values:
<li>open: open, at this time, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed, at this time , Width represents the width of the video, and Height represents the height of the video. </li>
Default value: open.
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set Resolution adaptive, optional values:
<li>open: open, at this time, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed, at this time , Width represents the width of the video, and Height represents the height of the video. </li>
Default value: open.
     * @param ResolutionAdaptive Resolution adaptive, optional values:
<li>open: open, at this time, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed, at this time , Width represents the width of the video, and Height represents the height of the video. </li>
Default value: open.
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get Resolution adaptive, optional values:
<li>open: open, at this time, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed, at this time , Width represents the width of the video, and Height represents the height of the video. </li>
Default value: open. 
     * @return Width Resolution adaptive, optional values:
<li>open: open, at this time, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed, at this time , Width represents the width of the video, and Height represents the height of the video. </li>
Default value: open.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Resolution adaptive, optional values:
<li>open: open, at this time, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed, at this time , Width represents the width of the video, and Height represents the height of the video. </li>
Default value: open.
     * @param Width Resolution adaptive, optional values:
<li>open: open, at this time, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed, at this time , Width represents the width of the video, and Height represents the height of the video. </li>
Default value: open.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The maximum value of the video stream height (or short side), value range: 0 and [128, 4096], unit: px. 
<li>When Width and Height are both 0, the resolution is based on the base resolution;</li>
<li>When Width is 0 and Height is non-0, Width is scaled according to the base resolution;</li> li>
<li>When Width is non-0 and Height is 0, the Height is scaled according to the base resolution; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>
Default value: 0. 
     * @return Height The maximum value of the video stream height (or short side), value range: 0 and [128, 4096], unit: px. 
<li>When Width and Height are both 0, the resolution is based on the base resolution;</li>
<li>When Width is 0 and Height is non-0, Width is scaled according to the base resolution;</li> li>
<li>When Width is non-0 and Height is 0, the Height is scaled according to the base resolution; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>
Default value: 0.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The maximum value of the video stream height (or short side), value range: 0 and [128, 4096], unit: px. 
<li>When Width and Height are both 0, the resolution is based on the base resolution;</li>
<li>When Width is 0 and Height is non-0, Width is scaled according to the base resolution;</li> li>
<li>When Width is non-0 and Height is 0, the Height is scaled according to the base resolution; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>
Default value: 0.
     * @param Height The maximum value of the video stream height (or short side), value range: 0 and [128, 4096], unit: px. 
<li>When Width and Height are both 0, the resolution is based on the base resolution;</li>
<li>When Width is 0 and Height is non-0, Width is scaled according to the base resolution;</li> li>
<li>When Width is non-0 and Height is 0, the Height is scaled according to the base resolution; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>
Default value: 0.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Video frame rate, value range: [0, 100], unit: Hz. 
When the value is 0, the frame rate will be automatically set for the video. 
The default value is 0. 
     * @return Fps Video frame rate, value range: [0, 100], unit: Hz. 
When the value is 0, the frame rate will be automatically set for the video. 
The default value is 0.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Video frame rate, value range: [0, 100], unit: Hz. 
When the value is 0, the frame rate will be automatically set for the video. 
The default value is 0.
     * @param Fps Video frame rate, value range: [0, 100], unit: Hz. 
When the value is 0, the frame rate will be automatically set for the video. 
The default value is 0.
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

