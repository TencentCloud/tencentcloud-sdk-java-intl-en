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

public class VideoTemplateInfoForUpdate extends AbstractModel {

    /**
    * The video codec. Valid values:
<li>libx264: H.264</li>
<li>libx265: H.265</li>
<li>av1: AOMedia Video 1</li>
<li>H.266: H.266</li>
<font color=red>Notes:</font>
<li>The AOMedia Video 1 and H.266 codecs can only be used for MP4 files.</li>
<li> Only CRF is supported for H.266 currently.</li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Video frame rate in Hz. Value range: [0,100].
If the value is 0, the frame rate will be the same as that of the source video.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Bitrate of video stream in Kbps. Value range: 0 and [128, 35,000].
If the value is 0, the bitrate of the video will be the same as that of the source video.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Resolution adaption. Valid values:
<li>open: enabled. In this case, `Width` represents the long side of a video, while `Height` the short side;</li>
<li>close: disabled. In this case, `Width` represents the width of a video, while `Height` the height.</li>
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * The maximum video width (or long side) in pixels. Value range: 0 and [128, 8192].
<li>If both `Width` and `Height` are 0, the output resolution will be the same as that of the source video.</li>
<li>If `Width` is 0 and `Height` is not, the video width will be proportionally scaled.</li>
<li>If `Width` is not 0 and `Height` is, the video height will be proportionally scaled.</li>
<li>If neither `Width` nor `Height` is 0, the specified width and height will be used.</li>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The maximum video height (or short side) in pixels. Value range: 0 and [128, 8192].
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Fill type. "Fill" refers to the way of processing a screenshot when its aspect ratio is different from that of the source video. Valid values:
<li>stretch: stretches video image frame by frame to fill the screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>black: fills the uncovered area with black color, without changing the image's aspect ratio.</li>
<li>white: fills the uncovered area with white color, without changing the image's aspect ratio.</li>
<li>gauss: applies Gaussian blur to the uncovered area, without changing the image's aspect ratio.</li>
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
    * The video constant rate factor (CRF). Value range: 1-51. `0` means to disable this parameter.

<font color=red>Notes:</font>
<li>If this parameter is specified, CRF encoding will be used and the bitrate parameter will be ignored.</li>
<li>If `Codec` is `H.266`, this parameter is required (`28` is recommended).</li>
<li>We don’t recommend using this parameter unless you have special requirements.</li>
    */
    @SerializedName("Vcrf")
    @Expose
    private Long Vcrf;

    /**
    * I-frame interval in frames. Valid values: 0 and 1-100000.
When this parameter is set to 0 or left empty, `Gop` will be automatically set.
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * Whether to output an HDR (high dynamic range) video if the source video is HDR. Valid values:
<li>ON: If the source video is HDR, output an HDR video; if not, output an SDR (standard dynamic range) video.</li>
<li>OFF: Output an SDR video regardless of whether the source video is HDR.</li>
    */
    @SerializedName("PreserveHDRSwitch")
    @Expose
    private String PreserveHDRSwitch;

    /**
    * The codec tag. This parameter is valid only if the H.265 codec is used. Valid values:
<li>hvc1</li>
<li>hev1</li>
Default value: hvc1.
    */
    @SerializedName("CodecTag")
    @Expose
    private String CodecTag;

    /**
     * Get The video codec. Valid values:
<li>libx264: H.264</li>
<li>libx265: H.265</li>
<li>av1: AOMedia Video 1</li>
<li>H.266: H.266</li>
<font color=red>Notes:</font>
<li>The AOMedia Video 1 and H.266 codecs can only be used for MP4 files.</li>
<li> Only CRF is supported for H.266 currently.</li> 
     * @return Codec The video codec. Valid values:
<li>libx264: H.264</li>
<li>libx265: H.265</li>
<li>av1: AOMedia Video 1</li>
<li>H.266: H.266</li>
<font color=red>Notes:</font>
<li>The AOMedia Video 1 and H.266 codecs can only be used for MP4 files.</li>
<li> Only CRF is supported for H.266 currently.</li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set The video codec. Valid values:
<li>libx264: H.264</li>
<li>libx265: H.265</li>
<li>av1: AOMedia Video 1</li>
<li>H.266: H.266</li>
<font color=red>Notes:</font>
<li>The AOMedia Video 1 and H.266 codecs can only be used for MP4 files.</li>
<li> Only CRF is supported for H.266 currently.</li>
     * @param Codec The video codec. Valid values:
<li>libx264: H.264</li>
<li>libx265: H.265</li>
<li>av1: AOMedia Video 1</li>
<li>H.266: H.266</li>
<font color=red>Notes:</font>
<li>The AOMedia Video 1 and H.266 codecs can only be used for MP4 files.</li>
<li> Only CRF is supported for H.266 currently.</li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Video frame rate in Hz. Value range: [0,100].
If the value is 0, the frame rate will be the same as that of the source video. 
     * @return Fps Video frame rate in Hz. Value range: [0,100].
If the value is 0, the frame rate will be the same as that of the source video.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Video frame rate in Hz. Value range: [0,100].
If the value is 0, the frame rate will be the same as that of the source video.
     * @param Fps Video frame rate in Hz. Value range: [0,100].
If the value is 0, the frame rate will be the same as that of the source video.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Bitrate of video stream in Kbps. Value range: 0 and [128, 35,000].
If the value is 0, the bitrate of the video will be the same as that of the source video. 
     * @return Bitrate Bitrate of video stream in Kbps. Value range: 0 and [128, 35,000].
If the value is 0, the bitrate of the video will be the same as that of the source video.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Bitrate of video stream in Kbps. Value range: 0 and [128, 35,000].
If the value is 0, the bitrate of the video will be the same as that of the source video.
     * @param Bitrate Bitrate of video stream in Kbps. Value range: 0 and [128, 35,000].
If the value is 0, the bitrate of the video will be the same as that of the source video.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Resolution adaption. Valid values:
<li>open: enabled. In this case, `Width` represents the long side of a video, while `Height` the short side;</li>
<li>close: disabled. In this case, `Width` represents the width of a video, while `Height` the height.</li> 
     * @return ResolutionAdaptive Resolution adaption. Valid values:
<li>open: enabled. In this case, `Width` represents the long side of a video, while `Height` the short side;</li>
<li>close: disabled. In this case, `Width` represents the width of a video, while `Height` the height.</li>
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set Resolution adaption. Valid values:
<li>open: enabled. In this case, `Width` represents the long side of a video, while `Height` the short side;</li>
<li>close: disabled. In this case, `Width` represents the width of a video, while `Height` the height.</li>
     * @param ResolutionAdaptive Resolution adaption. Valid values:
<li>open: enabled. In this case, `Width` represents the long side of a video, while `Height` the short side;</li>
<li>close: disabled. In this case, `Width` represents the width of a video, while `Height` the height.</li>
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get The maximum video width (or long side) in pixels. Value range: 0 and [128, 8192].
<li>If both `Width` and `Height` are 0, the output resolution will be the same as that of the source video.</li>
<li>If `Width` is 0 and `Height` is not, the video width will be proportionally scaled.</li>
<li>If `Width` is not 0 and `Height` is, the video height will be proportionally scaled.</li>
<li>If neither `Width` nor `Height` is 0, the specified width and height will be used.</li> 
     * @return Width The maximum video width (or long side) in pixels. Value range: 0 and [128, 8192].
<li>If both `Width` and `Height` are 0, the output resolution will be the same as that of the source video.</li>
<li>If `Width` is 0 and `Height` is not, the video width will be proportionally scaled.</li>
<li>If `Width` is not 0 and `Height` is, the video height will be proportionally scaled.</li>
<li>If neither `Width` nor `Height` is 0, the specified width and height will be used.</li>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The maximum video width (or long side) in pixels. Value range: 0 and [128, 8192].
<li>If both `Width` and `Height` are 0, the output resolution will be the same as that of the source video.</li>
<li>If `Width` is 0 and `Height` is not, the video width will be proportionally scaled.</li>
<li>If `Width` is not 0 and `Height` is, the video height will be proportionally scaled.</li>
<li>If neither `Width` nor `Height` is 0, the specified width and height will be used.</li>
     * @param Width The maximum video width (or long side) in pixels. Value range: 0 and [128, 8192].
<li>If both `Width` and `Height` are 0, the output resolution will be the same as that of the source video.</li>
<li>If `Width` is 0 and `Height` is not, the video width will be proportionally scaled.</li>
<li>If `Width` is not 0 and `Height` is, the video height will be proportionally scaled.</li>
<li>If neither `Width` nor `Height` is 0, the specified width and height will be used.</li>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The maximum video height (or short side) in pixels. Value range: 0 and [128, 8192]. 
     * @return Height The maximum video height (or short side) in pixels. Value range: 0 and [128, 8192].
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The maximum video height (or short side) in pixels. Value range: 0 and [128, 8192].
     * @param Height The maximum video height (or short side) in pixels. Value range: 0 and [128, 8192].
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Fill type. "Fill" refers to the way of processing a screenshot when its aspect ratio is different from that of the source video. Valid values:
<li>stretch: stretches video image frame by frame to fill the screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>black: fills the uncovered area with black color, without changing the image's aspect ratio.</li>
<li>white: fills the uncovered area with white color, without changing the image's aspect ratio.</li>
<li>gauss: applies Gaussian blur to the uncovered area, without changing the image's aspect ratio.</li> 
     * @return FillType Fill type. "Fill" refers to the way of processing a screenshot when its aspect ratio is different from that of the source video. Valid values:
<li>stretch: stretches video image frame by frame to fill the screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>black: fills the uncovered area with black color, without changing the image's aspect ratio.</li>
<li>white: fills the uncovered area with white color, without changing the image's aspect ratio.</li>
<li>gauss: applies Gaussian blur to the uncovered area, without changing the image's aspect ratio.</li>
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set Fill type. "Fill" refers to the way of processing a screenshot when its aspect ratio is different from that of the source video. Valid values:
<li>stretch: stretches video image frame by frame to fill the screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>black: fills the uncovered area with black color, without changing the image's aspect ratio.</li>
<li>white: fills the uncovered area with white color, without changing the image's aspect ratio.</li>
<li>gauss: applies Gaussian blur to the uncovered area, without changing the image's aspect ratio.</li>
     * @param FillType Fill type. "Fill" refers to the way of processing a screenshot when its aspect ratio is different from that of the source video. Valid values:
<li>stretch: stretches video image frame by frame to fill the screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>black: fills the uncovered area with black color, without changing the image's aspect ratio.</li>
<li>white: fills the uncovered area with white color, without changing the image's aspect ratio.</li>
<li>gauss: applies Gaussian blur to the uncovered area, without changing the image's aspect ratio.</li>
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    /**
     * Get The video constant rate factor (CRF). Value range: 1-51. `0` means to disable this parameter.

<font color=red>Notes:</font>
<li>If this parameter is specified, CRF encoding will be used and the bitrate parameter will be ignored.</li>
<li>If `Codec` is `H.266`, this parameter is required (`28` is recommended).</li>
<li>We don’t recommend using this parameter unless you have special requirements.</li> 
     * @return Vcrf The video constant rate factor (CRF). Value range: 1-51. `0` means to disable this parameter.

<font color=red>Notes:</font>
<li>If this parameter is specified, CRF encoding will be used and the bitrate parameter will be ignored.</li>
<li>If `Codec` is `H.266`, this parameter is required (`28` is recommended).</li>
<li>We don’t recommend using this parameter unless you have special requirements.</li>
     */
    public Long getVcrf() {
        return this.Vcrf;
    }

    /**
     * Set The video constant rate factor (CRF). Value range: 1-51. `0` means to disable this parameter.

<font color=red>Notes:</font>
<li>If this parameter is specified, CRF encoding will be used and the bitrate parameter will be ignored.</li>
<li>If `Codec` is `H.266`, this parameter is required (`28` is recommended).</li>
<li>We don’t recommend using this parameter unless you have special requirements.</li>
     * @param Vcrf The video constant rate factor (CRF). Value range: 1-51. `0` means to disable this parameter.

<font color=red>Notes:</font>
<li>If this parameter is specified, CRF encoding will be used and the bitrate parameter will be ignored.</li>
<li>If `Codec` is `H.266`, this parameter is required (`28` is recommended).</li>
<li>We don’t recommend using this parameter unless you have special requirements.</li>
     */
    public void setVcrf(Long Vcrf) {
        this.Vcrf = Vcrf;
    }

    /**
     * Get I-frame interval in frames. Valid values: 0 and 1-100000.
When this parameter is set to 0 or left empty, `Gop` will be automatically set. 
     * @return Gop I-frame interval in frames. Valid values: 0 and 1-100000.
When this parameter is set to 0 or left empty, `Gop` will be automatically set.
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set I-frame interval in frames. Valid values: 0 and 1-100000.
When this parameter is set to 0 or left empty, `Gop` will be automatically set.
     * @param Gop I-frame interval in frames. Valid values: 0 and 1-100000.
When this parameter is set to 0 or left empty, `Gop` will be automatically set.
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get Whether to output an HDR (high dynamic range) video if the source video is HDR. Valid values:
<li>ON: If the source video is HDR, output an HDR video; if not, output an SDR (standard dynamic range) video.</li>
<li>OFF: Output an SDR video regardless of whether the source video is HDR.</li> 
     * @return PreserveHDRSwitch Whether to output an HDR (high dynamic range) video if the source video is HDR. Valid values:
<li>ON: If the source video is HDR, output an HDR video; if not, output an SDR (standard dynamic range) video.</li>
<li>OFF: Output an SDR video regardless of whether the source video is HDR.</li>
     */
    public String getPreserveHDRSwitch() {
        return this.PreserveHDRSwitch;
    }

    /**
     * Set Whether to output an HDR (high dynamic range) video if the source video is HDR. Valid values:
<li>ON: If the source video is HDR, output an HDR video; if not, output an SDR (standard dynamic range) video.</li>
<li>OFF: Output an SDR video regardless of whether the source video is HDR.</li>
     * @param PreserveHDRSwitch Whether to output an HDR (high dynamic range) video if the source video is HDR. Valid values:
<li>ON: If the source video is HDR, output an HDR video; if not, output an SDR (standard dynamic range) video.</li>
<li>OFF: Output an SDR video regardless of whether the source video is HDR.</li>
     */
    public void setPreserveHDRSwitch(String PreserveHDRSwitch) {
        this.PreserveHDRSwitch = PreserveHDRSwitch;
    }

    /**
     * Get The codec tag. This parameter is valid only if the H.265 codec is used. Valid values:
<li>hvc1</li>
<li>hev1</li>
Default value: hvc1. 
     * @return CodecTag The codec tag. This parameter is valid only if the H.265 codec is used. Valid values:
<li>hvc1</li>
<li>hev1</li>
Default value: hvc1.
     */
    public String getCodecTag() {
        return this.CodecTag;
    }

    /**
     * Set The codec tag. This parameter is valid only if the H.265 codec is used. Valid values:
<li>hvc1</li>
<li>hev1</li>
Default value: hvc1.
     * @param CodecTag The codec tag. This parameter is valid only if the H.265 codec is used. Valid values:
<li>hvc1</li>
<li>hev1</li>
Default value: hvc1.
     */
    public void setCodecTag(String CodecTag) {
        this.CodecTag = CodecTag;
    }

    public VideoTemplateInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoTemplateInfoForUpdate(VideoTemplateInfoForUpdate source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
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
        if (source.Vcrf != null) {
            this.Vcrf = new Long(source.Vcrf);
        }
        if (source.Gop != null) {
            this.Gop = new Long(source.Gop);
        }
        if (source.PreserveHDRSwitch != null) {
            this.PreserveHDRSwitch = new String(source.PreserveHDRSwitch);
        }
        if (source.CodecTag != null) {
            this.CodecTag = new String(source.CodecTag);
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
        this.setParamSimple(map, prefix + "Vcrf", this.Vcrf);
        this.setParamSimple(map, prefix + "Gop", this.Gop);
        this.setParamSimple(map, prefix + "PreserveHDRSwitch", this.PreserveHDRSwitch);
        this.setParamSimple(map, prefix + "CodecTag", this.CodecTag);

    }
}

