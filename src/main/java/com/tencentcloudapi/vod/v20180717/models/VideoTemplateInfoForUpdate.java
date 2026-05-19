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
    * <p>Video stream encoding format. Available values:</p><li>libx264: H.264 encoding;</li><li>libx265: H.265 encoding;</li><li>av1: AOMedia Video 1 encoding;</li><li>H.266: H.266 encoding.</li><font color="red">Note:</font><li>av1 and H.266 encoding containers currently only support mp4;</li><li>H.266 currently only supports fixed CRF bitrate control method.</li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * <p>Video frame rate. Value ranges from 0 to 100. Unit: Hz.<br>When the value is 0, it means the frame rate is consistent with the original video.</p>
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * <p>Bitrate of video stream. Value ranges from 0 to [128, 100000]. Unit: kbps.<br>When the value is 0, it means VOD automatically sets the bitrate.</p>
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * <p>Resolution adaptation, available values:</p><li>open: Enable. At this point, Width represents the long side of the video, and Height indicates the short side.</li><li>close: Disable. At this point, Width represents the width of the video, and Height indicates the height.</li>
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * <p>The maximum value of the video stream width (or long side). Valid values: 0 and [128, 8192]. Unit: px.</p><li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, the Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>Maximum value of the video stream height (or short side). Value ranges from 0 to [128, 8192]. Measurement unit: px.</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>Filling method. When video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "filling". Optional filling mode:</p><li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched".</li><li>black: Maintain video aspect ratio with edges filled with black.</li><li>white: Maintain video aspect ratio with edge remainder filled with white.</li><li>gauss: Maintain video aspect ratio with Gaussian blur filling for the rest of the edges.</li>
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
    * <p>Control factor for constant video bitrate. Value range: [1, 51]. Enter 0 to indicate that it is disabled.</p><p><font color="red">Note:</font></p><li>If you specify this parameter, the bitrate control mode for CRF will be used to transcode (video bitrate will no longer take effect).</li><li>When the encoding format of the specified video stream is H.266, this field is required. The recommended value is 28.</li><li>If there are no special requirements, it is not recommended to specify this parameter.</li>
    */
    @SerializedName("Vcrf")
    @Expose
    private Long Vcrf;

    /**
    * <p>Interval between I-frames, in frames. Value range: 0 and [1, 100000].<br>When it is set to 0 or not set, the system will automatically set the gop length.</p>
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * <p>Whether the transcoding output remains HDR when the original video is HDR (High Dynamic Range). Value ranges from:</p><li>ON: If the raw file is HDR, the transcoding output remains HDR; otherwise, the output is SDR (Standard Dynamic Range).</li><li>OFF: Regardless of whether the raw file is HDR or SDR, the transcoding output is SDR.</li>
    */
    @SerializedName("PreserveHDRSwitch")
    @Expose
    private String PreserveHDRSwitch;

    /**
    * <p>Encoding tag, valid only when the video stream encoding format is H.265. Value range:</p><li>hvc1 means hvc1 tag;</li><li>hev1 means hev1 tag.</li>Default value: hvc1.
    */
    @SerializedName("CodecTag")
    @Expose
    private String CodecTag;

    /**
    * <p>Gop value unit.</p><p>Enumeration value:</p><ul><li>frame: Represents the number of frames.</li><li>second: Represents seconds.</li></ul><p>Default value: frame</p>
    */
    @SerializedName("GopUnit")
    @Expose
    private String GopUnit;

    /**
    * <p>Bitrate control mode.</p><p>Enumeration value:</p><ul><li>VBR: Variable Bit Rate, dynamic bitrate (VBR), adjusts the output bitrate based on the complexity of the video image to ensure higher image quality, suitable for storage scenarios and applications with high image quality requirements.</li><li>ABR: Average Bit Rate, average bitrate, maintains a stable average bitrate of the output video as much as possible but allows short-term bitrate fluctuation, suitable for scenarios where minimizing overall bitrate is needed while maintaining a certain image quality.</li><li>CBR: Constant Bit Rate, constant bitrate, maintains a constant output bitrate regardless of image complexity changes, suitable for scenarios with strict network bandwidth requirements, such as live streaming.</li><li>VCRF: Constant Rate Factor, constant quality factor, controls video quality by setting a quality factor to achieve constant quality encoding of videos, with bitrate adjustment based on content complexity, suitable for scenarios where maintaining a certain quality is desired.</li></ul><p>Default value: VBR</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>Maximum number of consecutive B-frames, set to auto by default. -1 means change to automatic value.</p><p>Value ranges from -1 to 16.</p>
    */
    @SerializedName("Bframes")
    @Expose
    private Long Bframes;

    /**
    * <p>Average segment duration. 0 or blank means auto, which automatically chooses appropriate segment duration based on video features such as GOP.</p><p>Value ranges from 0 to 10.</p><p>Measurement unit: seconds.</p><p>Supports only transcoding templates, not currently supported for adaptive bitrate templates.</p>
    */
    @SerializedName("HlsTime")
    @Expose
    private Long HlsTime;

    /**
    * <p>A predefined group of encoding tools or features allowed by the video encoding standard, suitable for different scenarios.</p><p>Enumeration values:</p><ul><li>baseline: Supports only I/p frames and non-interlaced scenarios, suitable for video calls and mobile video.</li><li>main: Mainstream Profile, provides I, p, and B frames, and supports both interlaced and non-interlaced modes. Primarily used in mainstream audio and video consumption products such as video players and streaming media transmission devices.</li><li>high: Highest encoding level, adds 8X8 prediction to the main Profile and supports custom quantification. Widely used in Blu-ray storage and HDTV scenarios.</li><li>default: Automatic filling along with the original video.</li></ul><p>default value: default</p><p>This configuration item is valid only when Codec is libx264.</p>
    */
    @SerializedName("VideoProfile")
    @Expose
    private String VideoProfile;

    /**
     * Get <p>Video stream encoding format. Available values:</p><li>libx264: H.264 encoding;</li><li>libx265: H.265 encoding;</li><li>av1: AOMedia Video 1 encoding;</li><li>H.266: H.266 encoding.</li><font color="red">Note:</font><li>av1 and H.266 encoding containers currently only support mp4;</li><li>H.266 currently only supports fixed CRF bitrate control method.</li> 
     * @return Codec <p>Video stream encoding format. Available values:</p><li>libx264: H.264 encoding;</li><li>libx265: H.265 encoding;</li><li>av1: AOMedia Video 1 encoding;</li><li>H.266: H.266 encoding.</li><font color="red">Note:</font><li>av1 and H.266 encoding containers currently only support mp4;</li><li>H.266 currently only supports fixed CRF bitrate control method.</li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set <p>Video stream encoding format. Available values:</p><li>libx264: H.264 encoding;</li><li>libx265: H.265 encoding;</li><li>av1: AOMedia Video 1 encoding;</li><li>H.266: H.266 encoding.</li><font color="red">Note:</font><li>av1 and H.266 encoding containers currently only support mp4;</li><li>H.266 currently only supports fixed CRF bitrate control method.</li>
     * @param Codec <p>Video stream encoding format. Available values:</p><li>libx264: H.264 encoding;</li><li>libx265: H.265 encoding;</li><li>av1: AOMedia Video 1 encoding;</li><li>H.266: H.266 encoding.</li><font color="red">Note:</font><li>av1 and H.266 encoding containers currently only support mp4;</li><li>H.266 currently only supports fixed CRF bitrate control method.</li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get <p>Video frame rate. Value ranges from 0 to 100. Unit: Hz.<br>When the value is 0, it means the frame rate is consistent with the original video.</p> 
     * @return Fps <p>Video frame rate. Value ranges from 0 to 100. Unit: Hz.<br>When the value is 0, it means the frame rate is consistent with the original video.</p>
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set <p>Video frame rate. Value ranges from 0 to 100. Unit: Hz.<br>When the value is 0, it means the frame rate is consistent with the original video.</p>
     * @param Fps <p>Video frame rate. Value ranges from 0 to 100. Unit: Hz.<br>When the value is 0, it means the frame rate is consistent with the original video.</p>
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get <p>Bitrate of video stream. Value ranges from 0 to [128, 100000]. Unit: kbps.<br>When the value is 0, it means VOD automatically sets the bitrate.</p> 
     * @return Bitrate <p>Bitrate of video stream. Value ranges from 0 to [128, 100000]. Unit: kbps.<br>When the value is 0, it means VOD automatically sets the bitrate.</p>
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set <p>Bitrate of video stream. Value ranges from 0 to [128, 100000]. Unit: kbps.<br>When the value is 0, it means VOD automatically sets the bitrate.</p>
     * @param Bitrate <p>Bitrate of video stream. Value ranges from 0 to [128, 100000]. Unit: kbps.<br>When the value is 0, it means VOD automatically sets the bitrate.</p>
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get <p>Resolution adaptation, available values:</p><li>open: Enable. At this point, Width represents the long side of the video, and Height indicates the short side.</li><li>close: Disable. At this point, Width represents the width of the video, and Height indicates the height.</li> 
     * @return ResolutionAdaptive <p>Resolution adaptation, available values:</p><li>open: Enable. At this point, Width represents the long side of the video, and Height indicates the short side.</li><li>close: Disable. At this point, Width represents the width of the video, and Height indicates the height.</li>
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set <p>Resolution adaptation, available values:</p><li>open: Enable. At this point, Width represents the long side of the video, and Height indicates the short side.</li><li>close: Disable. At this point, Width represents the width of the video, and Height indicates the height.</li>
     * @param ResolutionAdaptive <p>Resolution adaptation, available values:</p><li>open: Enable. At this point, Width represents the long side of the video, and Height indicates the short side.</li><li>close: Disable. At this point, Width represents the width of the video, and Height indicates the height.</li>
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get <p>The maximum value of the video stream width (or long side). Valid values: 0 and [128, 8192]. Unit: px.</p><li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, the Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li> 
     * @return Width <p>The maximum value of the video stream width (or long side). Valid values: 0 and [128, 8192]. Unit: px.</p><li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, the Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>The maximum value of the video stream width (or long side). Valid values: 0 and [128, 8192]. Unit: px.</p><li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, the Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>
     * @param Width <p>The maximum value of the video stream width (or long side). Valid values: 0 and [128, 8192]. Unit: px.</p><li>When Width and Height are both 0, the resolution is from the same source;</li><li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li><li>When Width is non-0 and Height is 0, the Height is scaled proportionally;</li><li>When both Width and Height are non-0, the resolution is specified by the user.</li>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>Maximum value of the video stream height (or short side). Value ranges from 0 to [128, 8192]. Measurement unit: px.</p> 
     * @return Height <p>Maximum value of the video stream height (or short side). Value ranges from 0 to [128, 8192]. Measurement unit: px.</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>Maximum value of the video stream height (or short side). Value ranges from 0 to [128, 8192]. Measurement unit: px.</p>
     * @param Height <p>Maximum value of the video stream height (or short side). Value ranges from 0 to [128, 8192]. Measurement unit: px.</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>Filling method. When video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "filling". Optional filling mode:</p><li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched".</li><li>black: Maintain video aspect ratio with edges filled with black.</li><li>white: Maintain video aspect ratio with edge remainder filled with white.</li><li>gauss: Maintain video aspect ratio with Gaussian blur filling for the rest of the edges.</li> 
     * @return FillType <p>Filling method. When video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "filling". Optional filling mode:</p><li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched".</li><li>black: Maintain video aspect ratio with edges filled with black.</li><li>white: Maintain video aspect ratio with edge remainder filled with white.</li><li>gauss: Maintain video aspect ratio with Gaussian blur filling for the rest of the edges.</li>
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set <p>Filling method. When video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "filling". Optional filling mode:</p><li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched".</li><li>black: Maintain video aspect ratio with edges filled with black.</li><li>white: Maintain video aspect ratio with edge remainder filled with white.</li><li>gauss: Maintain video aspect ratio with Gaussian blur filling for the rest of the edges.</li>
     * @param FillType <p>Filling method. When video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "filling". Optional filling mode:</p><li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched".</li><li>black: Maintain video aspect ratio with edges filled with black.</li><li>white: Maintain video aspect ratio with edge remainder filled with white.</li><li>gauss: Maintain video aspect ratio with Gaussian blur filling for the rest of the edges.</li>
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    /**
     * Get <p>Control factor for constant video bitrate. Value range: [1, 51]. Enter 0 to indicate that it is disabled.</p><p><font color="red">Note:</font></p><li>If you specify this parameter, the bitrate control mode for CRF will be used to transcode (video bitrate will no longer take effect).</li><li>When the encoding format of the specified video stream is H.266, this field is required. The recommended value is 28.</li><li>If there are no special requirements, it is not recommended to specify this parameter.</li> 
     * @return Vcrf <p>Control factor for constant video bitrate. Value range: [1, 51]. Enter 0 to indicate that it is disabled.</p><p><font color="red">Note:</font></p><li>If you specify this parameter, the bitrate control mode for CRF will be used to transcode (video bitrate will no longer take effect).</li><li>When the encoding format of the specified video stream is H.266, this field is required. The recommended value is 28.</li><li>If there are no special requirements, it is not recommended to specify this parameter.</li>
     */
    public Long getVcrf() {
        return this.Vcrf;
    }

    /**
     * Set <p>Control factor for constant video bitrate. Value range: [1, 51]. Enter 0 to indicate that it is disabled.</p><p><font color="red">Note:</font></p><li>If you specify this parameter, the bitrate control mode for CRF will be used to transcode (video bitrate will no longer take effect).</li><li>When the encoding format of the specified video stream is H.266, this field is required. The recommended value is 28.</li><li>If there are no special requirements, it is not recommended to specify this parameter.</li>
     * @param Vcrf <p>Control factor for constant video bitrate. Value range: [1, 51]. Enter 0 to indicate that it is disabled.</p><p><font color="red">Note:</font></p><li>If you specify this parameter, the bitrate control mode for CRF will be used to transcode (video bitrate will no longer take effect).</li><li>When the encoding format of the specified video stream is H.266, this field is required. The recommended value is 28.</li><li>If there are no special requirements, it is not recommended to specify this parameter.</li>
     */
    public void setVcrf(Long Vcrf) {
        this.Vcrf = Vcrf;
    }

    /**
     * Get <p>Interval between I-frames, in frames. Value range: 0 and [1, 100000].<br>When it is set to 0 or not set, the system will automatically set the gop length.</p> 
     * @return Gop <p>Interval between I-frames, in frames. Value range: 0 and [1, 100000].<br>When it is set to 0 or not set, the system will automatically set the gop length.</p>
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set <p>Interval between I-frames, in frames. Value range: 0 and [1, 100000].<br>When it is set to 0 or not set, the system will automatically set the gop length.</p>
     * @param Gop <p>Interval between I-frames, in frames. Value range: 0 and [1, 100000].<br>When it is set to 0 or not set, the system will automatically set the gop length.</p>
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get <p>Whether the transcoding output remains HDR when the original video is HDR (High Dynamic Range). Value ranges from:</p><li>ON: If the raw file is HDR, the transcoding output remains HDR; otherwise, the output is SDR (Standard Dynamic Range).</li><li>OFF: Regardless of whether the raw file is HDR or SDR, the transcoding output is SDR.</li> 
     * @return PreserveHDRSwitch <p>Whether the transcoding output remains HDR when the original video is HDR (High Dynamic Range). Value ranges from:</p><li>ON: If the raw file is HDR, the transcoding output remains HDR; otherwise, the output is SDR (Standard Dynamic Range).</li><li>OFF: Regardless of whether the raw file is HDR or SDR, the transcoding output is SDR.</li>
     */
    public String getPreserveHDRSwitch() {
        return this.PreserveHDRSwitch;
    }

    /**
     * Set <p>Whether the transcoding output remains HDR when the original video is HDR (High Dynamic Range). Value ranges from:</p><li>ON: If the raw file is HDR, the transcoding output remains HDR; otherwise, the output is SDR (Standard Dynamic Range).</li><li>OFF: Regardless of whether the raw file is HDR or SDR, the transcoding output is SDR.</li>
     * @param PreserveHDRSwitch <p>Whether the transcoding output remains HDR when the original video is HDR (High Dynamic Range). Value ranges from:</p><li>ON: If the raw file is HDR, the transcoding output remains HDR; otherwise, the output is SDR (Standard Dynamic Range).</li><li>OFF: Regardless of whether the raw file is HDR or SDR, the transcoding output is SDR.</li>
     */
    public void setPreserveHDRSwitch(String PreserveHDRSwitch) {
        this.PreserveHDRSwitch = PreserveHDRSwitch;
    }

    /**
     * Get <p>Encoding tag, valid only when the video stream encoding format is H.265. Value range:</p><li>hvc1 means hvc1 tag;</li><li>hev1 means hev1 tag.</li>Default value: hvc1. 
     * @return CodecTag <p>Encoding tag, valid only when the video stream encoding format is H.265. Value range:</p><li>hvc1 means hvc1 tag;</li><li>hev1 means hev1 tag.</li>Default value: hvc1.
     */
    public String getCodecTag() {
        return this.CodecTag;
    }

    /**
     * Set <p>Encoding tag, valid only when the video stream encoding format is H.265. Value range:</p><li>hvc1 means hvc1 tag;</li><li>hev1 means hev1 tag.</li>Default value: hvc1.
     * @param CodecTag <p>Encoding tag, valid only when the video stream encoding format is H.265. Value range:</p><li>hvc1 means hvc1 tag;</li><li>hev1 means hev1 tag.</li>Default value: hvc1.
     */
    public void setCodecTag(String CodecTag) {
        this.CodecTag = CodecTag;
    }

    /**
     * Get <p>Gop value unit.</p><p>Enumeration value:</p><ul><li>frame: Represents the number of frames.</li><li>second: Represents seconds.</li></ul><p>Default value: frame</p> 
     * @return GopUnit <p>Gop value unit.</p><p>Enumeration value:</p><ul><li>frame: Represents the number of frames.</li><li>second: Represents seconds.</li></ul><p>Default value: frame</p>
     */
    public String getGopUnit() {
        return this.GopUnit;
    }

    /**
     * Set <p>Gop value unit.</p><p>Enumeration value:</p><ul><li>frame: Represents the number of frames.</li><li>second: Represents seconds.</li></ul><p>Default value: frame</p>
     * @param GopUnit <p>Gop value unit.</p><p>Enumeration value:</p><ul><li>frame: Represents the number of frames.</li><li>second: Represents seconds.</li></ul><p>Default value: frame</p>
     */
    public void setGopUnit(String GopUnit) {
        this.GopUnit = GopUnit;
    }

    /**
     * Get <p>Bitrate control mode.</p><p>Enumeration value:</p><ul><li>VBR: Variable Bit Rate, dynamic bitrate (VBR), adjusts the output bitrate based on the complexity of the video image to ensure higher image quality, suitable for storage scenarios and applications with high image quality requirements.</li><li>ABR: Average Bit Rate, average bitrate, maintains a stable average bitrate of the output video as much as possible but allows short-term bitrate fluctuation, suitable for scenarios where minimizing overall bitrate is needed while maintaining a certain image quality.</li><li>CBR: Constant Bit Rate, constant bitrate, maintains a constant output bitrate regardless of image complexity changes, suitable for scenarios with strict network bandwidth requirements, such as live streaming.</li><li>VCRF: Constant Rate Factor, constant quality factor, controls video quality by setting a quality factor to achieve constant quality encoding of videos, with bitrate adjustment based on content complexity, suitable for scenarios where maintaining a certain quality is desired.</li></ul><p>Default value: VBR</p> 
     * @return Mode <p>Bitrate control mode.</p><p>Enumeration value:</p><ul><li>VBR: Variable Bit Rate, dynamic bitrate (VBR), adjusts the output bitrate based on the complexity of the video image to ensure higher image quality, suitable for storage scenarios and applications with high image quality requirements.</li><li>ABR: Average Bit Rate, average bitrate, maintains a stable average bitrate of the output video as much as possible but allows short-term bitrate fluctuation, suitable for scenarios where minimizing overall bitrate is needed while maintaining a certain image quality.</li><li>CBR: Constant Bit Rate, constant bitrate, maintains a constant output bitrate regardless of image complexity changes, suitable for scenarios with strict network bandwidth requirements, such as live streaming.</li><li>VCRF: Constant Rate Factor, constant quality factor, controls video quality by setting a quality factor to achieve constant quality encoding of videos, with bitrate adjustment based on content complexity, suitable for scenarios where maintaining a certain quality is desired.</li></ul><p>Default value: VBR</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>Bitrate control mode.</p><p>Enumeration value:</p><ul><li>VBR: Variable Bit Rate, dynamic bitrate (VBR), adjusts the output bitrate based on the complexity of the video image to ensure higher image quality, suitable for storage scenarios and applications with high image quality requirements.</li><li>ABR: Average Bit Rate, average bitrate, maintains a stable average bitrate of the output video as much as possible but allows short-term bitrate fluctuation, suitable for scenarios where minimizing overall bitrate is needed while maintaining a certain image quality.</li><li>CBR: Constant Bit Rate, constant bitrate, maintains a constant output bitrate regardless of image complexity changes, suitable for scenarios with strict network bandwidth requirements, such as live streaming.</li><li>VCRF: Constant Rate Factor, constant quality factor, controls video quality by setting a quality factor to achieve constant quality encoding of videos, with bitrate adjustment based on content complexity, suitable for scenarios where maintaining a certain quality is desired.</li></ul><p>Default value: VBR</p>
     * @param Mode <p>Bitrate control mode.</p><p>Enumeration value:</p><ul><li>VBR: Variable Bit Rate, dynamic bitrate (VBR), adjusts the output bitrate based on the complexity of the video image to ensure higher image quality, suitable for storage scenarios and applications with high image quality requirements.</li><li>ABR: Average Bit Rate, average bitrate, maintains a stable average bitrate of the output video as much as possible but allows short-term bitrate fluctuation, suitable for scenarios where minimizing overall bitrate is needed while maintaining a certain image quality.</li><li>CBR: Constant Bit Rate, constant bitrate, maintains a constant output bitrate regardless of image complexity changes, suitable for scenarios with strict network bandwidth requirements, such as live streaming.</li><li>VCRF: Constant Rate Factor, constant quality factor, controls video quality by setting a quality factor to achieve constant quality encoding of videos, with bitrate adjustment based on content complexity, suitable for scenarios where maintaining a certain quality is desired.</li></ul><p>Default value: VBR</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>Maximum number of consecutive B-frames, set to auto by default. -1 means change to automatic value.</p><p>Value ranges from -1 to 16.</p> 
     * @return Bframes <p>Maximum number of consecutive B-frames, set to auto by default. -1 means change to automatic value.</p><p>Value ranges from -1 to 16.</p>
     */
    public Long getBframes() {
        return this.Bframes;
    }

    /**
     * Set <p>Maximum number of consecutive B-frames, set to auto by default. -1 means change to automatic value.</p><p>Value ranges from -1 to 16.</p>
     * @param Bframes <p>Maximum number of consecutive B-frames, set to auto by default. -1 means change to automatic value.</p><p>Value ranges from -1 to 16.</p>
     */
    public void setBframes(Long Bframes) {
        this.Bframes = Bframes;
    }

    /**
     * Get <p>Average segment duration. 0 or blank means auto, which automatically chooses appropriate segment duration based on video features such as GOP.</p><p>Value ranges from 0 to 10.</p><p>Measurement unit: seconds.</p><p>Supports only transcoding templates, not currently supported for adaptive bitrate templates.</p> 
     * @return HlsTime <p>Average segment duration. 0 or blank means auto, which automatically chooses appropriate segment duration based on video features such as GOP.</p><p>Value ranges from 0 to 10.</p><p>Measurement unit: seconds.</p><p>Supports only transcoding templates, not currently supported for adaptive bitrate templates.</p>
     */
    public Long getHlsTime() {
        return this.HlsTime;
    }

    /**
     * Set <p>Average segment duration. 0 or blank means auto, which automatically chooses appropriate segment duration based on video features such as GOP.</p><p>Value ranges from 0 to 10.</p><p>Measurement unit: seconds.</p><p>Supports only transcoding templates, not currently supported for adaptive bitrate templates.</p>
     * @param HlsTime <p>Average segment duration. 0 or blank means auto, which automatically chooses appropriate segment duration based on video features such as GOP.</p><p>Value ranges from 0 to 10.</p><p>Measurement unit: seconds.</p><p>Supports only transcoding templates, not currently supported for adaptive bitrate templates.</p>
     */
    public void setHlsTime(Long HlsTime) {
        this.HlsTime = HlsTime;
    }

    /**
     * Get <p>A predefined group of encoding tools or features allowed by the video encoding standard, suitable for different scenarios.</p><p>Enumeration values:</p><ul><li>baseline: Supports only I/p frames and non-interlaced scenarios, suitable for video calls and mobile video.</li><li>main: Mainstream Profile, provides I, p, and B frames, and supports both interlaced and non-interlaced modes. Primarily used in mainstream audio and video consumption products such as video players and streaming media transmission devices.</li><li>high: Highest encoding level, adds 8X8 prediction to the main Profile and supports custom quantification. Widely used in Blu-ray storage and HDTV scenarios.</li><li>default: Automatic filling along with the original video.</li></ul><p>default value: default</p><p>This configuration item is valid only when Codec is libx264.</p> 
     * @return VideoProfile <p>A predefined group of encoding tools or features allowed by the video encoding standard, suitable for different scenarios.</p><p>Enumeration values:</p><ul><li>baseline: Supports only I/p frames and non-interlaced scenarios, suitable for video calls and mobile video.</li><li>main: Mainstream Profile, provides I, p, and B frames, and supports both interlaced and non-interlaced modes. Primarily used in mainstream audio and video consumption products such as video players and streaming media transmission devices.</li><li>high: Highest encoding level, adds 8X8 prediction to the main Profile and supports custom quantification. Widely used in Blu-ray storage and HDTV scenarios.</li><li>default: Automatic filling along with the original video.</li></ul><p>default value: default</p><p>This configuration item is valid only when Codec is libx264.</p>
     */
    public String getVideoProfile() {
        return this.VideoProfile;
    }

    /**
     * Set <p>A predefined group of encoding tools or features allowed by the video encoding standard, suitable for different scenarios.</p><p>Enumeration values:</p><ul><li>baseline: Supports only I/p frames and non-interlaced scenarios, suitable for video calls and mobile video.</li><li>main: Mainstream Profile, provides I, p, and B frames, and supports both interlaced and non-interlaced modes. Primarily used in mainstream audio and video consumption products such as video players and streaming media transmission devices.</li><li>high: Highest encoding level, adds 8X8 prediction to the main Profile and supports custom quantification. Widely used in Blu-ray storage and HDTV scenarios.</li><li>default: Automatic filling along with the original video.</li></ul><p>default value: default</p><p>This configuration item is valid only when Codec is libx264.</p>
     * @param VideoProfile <p>A predefined group of encoding tools or features allowed by the video encoding standard, suitable for different scenarios.</p><p>Enumeration values:</p><ul><li>baseline: Supports only I/p frames and non-interlaced scenarios, suitable for video calls and mobile video.</li><li>main: Mainstream Profile, provides I, p, and B frames, and supports both interlaced and non-interlaced modes. Primarily used in mainstream audio and video consumption products such as video players and streaming media transmission devices.</li><li>high: Highest encoding level, adds 8X8 prediction to the main Profile and supports custom quantification. Widely used in Blu-ray storage and HDTV scenarios.</li><li>default: Automatic filling along with the original video.</li></ul><p>default value: default</p><p>This configuration item is valid only when Codec is libx264.</p>
     */
    public void setVideoProfile(String VideoProfile) {
        this.VideoProfile = VideoProfile;
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
        if (source.GopUnit != null) {
            this.GopUnit = new String(source.GopUnit);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Bframes != null) {
            this.Bframes = new Long(source.Bframes);
        }
        if (source.HlsTime != null) {
            this.HlsTime = new Long(source.HlsTime);
        }
        if (source.VideoProfile != null) {
            this.VideoProfile = new String(source.VideoProfile);
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
        this.setParamSimple(map, prefix + "GopUnit", this.GopUnit);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Bframes", this.Bframes);
        this.setParamSimple(map, prefix + "HlsTime", this.HlsTime);
        this.setParamSimple(map, prefix + "VideoProfile", this.VideoProfile);

    }
}

