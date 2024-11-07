/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class VideoTemplateInfo extends AbstractModel {

    /**
    * Encoding format for video streams. Optional values:
<li>h264: H.264 encoding</li>
<li>h265: H.265 encoding</li>
<li>h266: H.266 encoding</li>
<li>av1: AOMedia Video 1 encoding</li>
<li>vp8: VP8 encoding</li>
<li>vp9: VP9 encoding</li>
<li>mpeg2: MPEG2 encoding</li>
<li>dnxhd: DNxHD encoding</li>
<li>mv-hevc: MV-HEVC encoding</li>

Note: AV1 encoding containers currently only support mp4, webm, and mkv.
Note: H.266 encoding containers currently only support mp4, hls, ts, and mov.
Note: VP8 and VP9 encoding containers currently only support webm and mkv.
Note: MPEG2 and DNxHD encoding containers currently only support mxf.
Note: MV-HEVC encoding containers only support mp4, hls, and mov. Among them, the hls format only supports mp4 segmentation format.
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Video frame rate. Value range:
When FpsDenominator is empty, the range is [0, 120], in Hz.
When FpsDenominator is not empty, the Fps/FpsDenominator range is [0, 120].
If the value is 0, the frame rate will be the same as that of the source video.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Bitrate of a video stream, in kbps. Value range: 0 and [128, 100000].If the value is 0, the bitrate of the video will be the same as that of the source video.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Resolution adaption. Valid values:
<li>open: Enabled. When resolution adaption is enabled, `Width` indicates the long side of a video, while `Height` indicates the short side.</li>
<li>close: Disabled. When resolution adaption is disabled, `Width` indicates the width of a video, while `Height` indicates the height.</li>
Default value: open.
Note: When resolution adaption is enabled, `Width` cannot be smaller than `Height`.
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * Maximum value of the width (or long side) of a video stream in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Maximum value of the height (or short side) of a video stream in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Interval between I-frames (keyframes), which can be customized in frames or seconds. GOP value range: 0 and [1, 100000].
If this parameter is 0 or left blank, the system will automatically set the GOP length.
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * GOP value unit. Optional values:
frame: indicates frame
second: indicates second
Default value: frame
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("GopUnit")
    @Expose
    private String GopUnit;

    /**
    * Filling mode. When the configured aspect ratio parameter for video streams differs from the aspect ratio of the original video, the processing method for transcoding is "filling". Optional filling modes:
<li>stretch: Each frame is stretched to fill the entire screen, which may cause the transcoded video to be "flattened" or "stretched".</li>
<li>black: The aspect ratio of the video is kept unchanged, and the rest of the edges is filled with black.</li>
<li>white: The aspect ratio of the video is kept unchanged, and the rest of the edges is filled with white.</li>
<li>gauss: The aspect ratio of the video is kept unchanged, and the rest of the edges is filled with a Gaussian blur.</li>

<li>smarttailor: Video images are smartly selected to ensure proportional image cropping.</li>
Default value: black.
Note: Only stretch and black are supported for adaptive bitrate streaming.
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
    * Control factor for constant video bitrate. Value range: [0, 51].
If this parameter is specified, the bitrate control mode for the CRF will be used for transcoding (the video bitrate will no longer take effect).
It is recommended not to specify this parameter if there are no special requirements.

Note:
If Mode is set to ABR, the Vcrf value does not need to be configured.
If Mode is set to CBR, the Vcrf value does not need to be configured.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Vcrf")
    @Expose
    private Long Vcrf;

    /**
    * Average segment duration. Value range: (0-10], unit: second
Default value: 10
Note: It can be used only in the container format of hls.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("HlsTime")
    @Expose
    private Long HlsTime;

    /**
    * HLS segment type. Valid values:
<li>0: HLS+TS segment.</li>
<li>2: HLS+TS byte range.</li>
<li>7: HLS+MP4 segment.</li>
<li>5: HLS+MP4 byte range.</li>
Default value: 0

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SegmentType")
    @Expose
    private Long SegmentType;

    /**
    * Denominator of the frame rate.
Note: The value must be greater than 0.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FpsDenominator")
    @Expose
    private Long FpsDenominator;

    /**
    * 3D video splicing mode, which is only valid for MV-HEVC 3D videos. Valid values:
<li>side_by_side: side-by-side view.</li>
<li>top_bottom: top-bottom view.</li>
Default value: side_by_side.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Stereo3dType")
    @Expose
    private String Stereo3dType;

    /**
    * Profile, suitable for different scenarios.
baseline: It only supports I/P-frames and non-interlaced scenarios, and is suitable for scenarios such as video calls and mobile videos.
main: It offers I-frames, P-frames, and B-frames, and supports both interlaced and non-interlaced modes. It is mainly used in mainstream audio and video consumption products such as video players and streaming media transmission devices.
high: the highest encoding level, with 8x8 prediction added to the main profile and support for custom quantification. It is widely used in scenarios such as Blu-ray storage and HDTV.
default: automatic filling along with the original video.    

This configuration appears only when the encoding standard is set to H264. baseline/main/high is supported. Default value: default
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("VideoProfile")
    @Expose
    private String VideoProfile;

    /**
    * Encoder level. Default value: auto ("")
If the encoding standard is set to H264, the following options are supported: "", 1, 1.1, 1.2, 1.3, 2, 2.1, 2.2, 3, 3.1, 3.2, 4, 4.1, 4.2, 5, and 5.1.
If the encoding standard is set to H265, the following options are supported: "", 1, 2, 2.1, 3, 3.1, 4, 4.1, 5, 5.1, 5.2, 6, 6.1, 6.2, and 8.5.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("VideoLevel")
    @Expose
    private String VideoLevel;

    /**
    * Number of B-frames between reference frames. The default is auto, and a range of 0 - 16 is supported.
Note: Leaving it blank means using the auto option.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Bframes")
    @Expose
    private Long Bframes;

    /**
    * Bitrate control mode. Optional values:
VBR: variable bitrate. The output bitrate is adjusted based on the complexity of the video image, ensuring higher image quality. This mode is suitable for storage scenarios as well as applications with high image quality requirements.
ABR: average bitrate. The average bitrate of the output video is kept stable to the greatest extent, but short-term bitrate fluctuations are allowed. This mode is suitable for scenarios where it is necessary to minimize the overall bitrate while a certain quality is maintained.
CBR: constant bitrate. The output bitrate remains constant during the video encoding process, regardless of changes in image complexity. This mode is suitable for scenarios with strict network bandwidth requirements, such as live streaming.
VCRF: constant rate factor. The video quality is controlled by setting a quality factor, achieving constant quality encoding of videos. The bitrate is automatically adjusted based on the complexity of the content. This mode is suitable for scenarios where maintaining a certain quality is desired.
VBR is selected by default.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Display aspect ratio. Optional values: [1:1, 2:1, default]
Default value: default
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Sar")
    @Expose
    private String Sar;

    /**
    * Adaptive I-frame decision. When it is enabled, Media Processing Service will automatically identify transition points between different scenarios in the video (usually they are visually distinct frames, such as those of switching from one shot to another) and adaptively insert keyframes (I-frames) at these points to improve the random accessibility and encoding efficiency of the video. Optional values:
0: Disable the adaptive I-frame decision 
1: Enable the adaptive I-frame decision
Default value: 0

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NoScenecut")
    @Expose
    private Long NoScenecut;

    /**
    * Bit: 8/10 is supported. Default value: 8
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BitDepth")
    @Expose
    private Long BitDepth;

    /**
    * Preservation of original timestamp. Optional values:
0: Disabled
1: Enabled
Default value: Disabled
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RawPts")
    @Expose
    private Long RawPts;

    /**
    * Proportional compression bitrate. When it is enabled, the bitrate of the output video will be adjusted according to the proportion. After the compression ratio is entered, the system will automatically calculate the target output bitrate based on the source video bitrate. Compression ratio range: 0-100
Leaving this value blank means it is not enabled by default.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Compress")
    @Expose
    private Long Compress;

    /**
    * Special segment configuration
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SegmentSpecificInfo")
    @Expose
    private SegmentSpecificInfo SegmentSpecificInfo;

    /**
     * Get Encoding format for video streams. Optional values:
<li>h264: H.264 encoding</li>
<li>h265: H.265 encoding</li>
<li>h266: H.266 encoding</li>
<li>av1: AOMedia Video 1 encoding</li>
<li>vp8: VP8 encoding</li>
<li>vp9: VP9 encoding</li>
<li>mpeg2: MPEG2 encoding</li>
<li>dnxhd: DNxHD encoding</li>
<li>mv-hevc: MV-HEVC encoding</li>

Note: AV1 encoding containers currently only support mp4, webm, and mkv.
Note: H.266 encoding containers currently only support mp4, hls, ts, and mov.
Note: VP8 and VP9 encoding containers currently only support webm and mkv.
Note: MPEG2 and DNxHD encoding containers currently only support mxf.
Note: MV-HEVC encoding containers only support mp4, hls, and mov. Among them, the hls format only supports mp4 segmentation format. 
     * @return Codec Encoding format for video streams. Optional values:
<li>h264: H.264 encoding</li>
<li>h265: H.265 encoding</li>
<li>h266: H.266 encoding</li>
<li>av1: AOMedia Video 1 encoding</li>
<li>vp8: VP8 encoding</li>
<li>vp9: VP9 encoding</li>
<li>mpeg2: MPEG2 encoding</li>
<li>dnxhd: DNxHD encoding</li>
<li>mv-hevc: MV-HEVC encoding</li>

Note: AV1 encoding containers currently only support mp4, webm, and mkv.
Note: H.266 encoding containers currently only support mp4, hls, ts, and mov.
Note: VP8 and VP9 encoding containers currently only support webm and mkv.
Note: MPEG2 and DNxHD encoding containers currently only support mxf.
Note: MV-HEVC encoding containers only support mp4, hls, and mov. Among them, the hls format only supports mp4 segmentation format.
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Encoding format for video streams. Optional values:
<li>h264: H.264 encoding</li>
<li>h265: H.265 encoding</li>
<li>h266: H.266 encoding</li>
<li>av1: AOMedia Video 1 encoding</li>
<li>vp8: VP8 encoding</li>
<li>vp9: VP9 encoding</li>
<li>mpeg2: MPEG2 encoding</li>
<li>dnxhd: DNxHD encoding</li>
<li>mv-hevc: MV-HEVC encoding</li>

Note: AV1 encoding containers currently only support mp4, webm, and mkv.
Note: H.266 encoding containers currently only support mp4, hls, ts, and mov.
Note: VP8 and VP9 encoding containers currently only support webm and mkv.
Note: MPEG2 and DNxHD encoding containers currently only support mxf.
Note: MV-HEVC encoding containers only support mp4, hls, and mov. Among them, the hls format only supports mp4 segmentation format.
     * @param Codec Encoding format for video streams. Optional values:
<li>h264: H.264 encoding</li>
<li>h265: H.265 encoding</li>
<li>h266: H.266 encoding</li>
<li>av1: AOMedia Video 1 encoding</li>
<li>vp8: VP8 encoding</li>
<li>vp9: VP9 encoding</li>
<li>mpeg2: MPEG2 encoding</li>
<li>dnxhd: DNxHD encoding</li>
<li>mv-hevc: MV-HEVC encoding</li>

Note: AV1 encoding containers currently only support mp4, webm, and mkv.
Note: H.266 encoding containers currently only support mp4, hls, ts, and mov.
Note: VP8 and VP9 encoding containers currently only support webm and mkv.
Note: MPEG2 and DNxHD encoding containers currently only support mxf.
Note: MV-HEVC encoding containers only support mp4, hls, and mov. Among them, the hls format only supports mp4 segmentation format.
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Video frame rate. Value range:
When FpsDenominator is empty, the range is [0, 120], in Hz.
When FpsDenominator is not empty, the Fps/FpsDenominator range is [0, 120].
If the value is 0, the frame rate will be the same as that of the source video. 
     * @return Fps Video frame rate. Value range:
When FpsDenominator is empty, the range is [0, 120], in Hz.
When FpsDenominator is not empty, the Fps/FpsDenominator range is [0, 120].
If the value is 0, the frame rate will be the same as that of the source video.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Video frame rate. Value range:
When FpsDenominator is empty, the range is [0, 120], in Hz.
When FpsDenominator is not empty, the Fps/FpsDenominator range is [0, 120].
If the value is 0, the frame rate will be the same as that of the source video.
     * @param Fps Video frame rate. Value range:
When FpsDenominator is empty, the range is [0, 120], in Hz.
When FpsDenominator is not empty, the Fps/FpsDenominator range is [0, 120].
If the value is 0, the frame rate will be the same as that of the source video.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Bitrate of a video stream, in kbps. Value range: 0 and [128, 100000].If the value is 0, the bitrate of the video will be the same as that of the source video. 
     * @return Bitrate Bitrate of a video stream, in kbps. Value range: 0 and [128, 100000].If the value is 0, the bitrate of the video will be the same as that of the source video.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Bitrate of a video stream, in kbps. Value range: 0 and [128, 100000].If the value is 0, the bitrate of the video will be the same as that of the source video.
     * @param Bitrate Bitrate of a video stream, in kbps. Value range: 0 and [128, 100000].If the value is 0, the bitrate of the video will be the same as that of the source video.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Resolution adaption. Valid values:
<li>open: Enabled. When resolution adaption is enabled, `Width` indicates the long side of a video, while `Height` indicates the short side.</li>
<li>close: Disabled. When resolution adaption is disabled, `Width` indicates the width of a video, while `Height` indicates the height.</li>
Default value: open.
Note: When resolution adaption is enabled, `Width` cannot be smaller than `Height`. 
     * @return ResolutionAdaptive Resolution adaption. Valid values:
<li>open: Enabled. When resolution adaption is enabled, `Width` indicates the long side of a video, while `Height` indicates the short side.</li>
<li>close: Disabled. When resolution adaption is disabled, `Width` indicates the width of a video, while `Height` indicates the height.</li>
Default value: open.
Note: When resolution adaption is enabled, `Width` cannot be smaller than `Height`.
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set Resolution adaption. Valid values:
<li>open: Enabled. When resolution adaption is enabled, `Width` indicates the long side of a video, while `Height` indicates the short side.</li>
<li>close: Disabled. When resolution adaption is disabled, `Width` indicates the width of a video, while `Height` indicates the height.</li>
Default value: open.
Note: When resolution adaption is enabled, `Width` cannot be smaller than `Height`.
     * @param ResolutionAdaptive Resolution adaption. Valid values:
<li>open: Enabled. When resolution adaption is enabled, `Width` indicates the long side of a video, while `Height` indicates the short side.</li>
<li>close: Disabled. When resolution adaption is disabled, `Width` indicates the width of a video, while `Height` indicates the height.</li>
Default value: open.
Note: When resolution adaption is enabled, `Width` cannot be smaller than `Height`.
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get Maximum value of the width (or long side) of a video stream in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0. 
     * @return Width Maximum value of the width (or long side) of a video stream in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Maximum value of the width (or long side) of a video stream in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0.
     * @param Width Maximum value of the width (or long side) of a video stream in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Maximum value of the height (or short side) of a video stream in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0. 
     * @return Height Maximum value of the height (or short side) of a video stream in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Maximum value of the height (or short side) of a video stream in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0.
     * @param Height Maximum value of the height (or short side) of a video stream in px. Value range: 0 and [128, 4,096].
<li>If both `Width` and `Height` are 0, the resolution will be the same as that of the source video;</li>
<li>If `Width` is 0, but `Height` is not 0, `Width` will be proportionally scaled;</li>
<li>If `Width` is not 0, but `Height` is 0, `Height` will be proportionally scaled;</li>
<li>If both `Width` and `Height` are not 0, the custom resolution will be used.</li>
Default value: 0.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Interval between I-frames (keyframes), which can be customized in frames or seconds. GOP value range: 0 and [1, 100000].
If this parameter is 0 or left blank, the system will automatically set the GOP length. 
     * @return Gop Interval between I-frames (keyframes), which can be customized in frames or seconds. GOP value range: 0 and [1, 100000].
If this parameter is 0 or left blank, the system will automatically set the GOP length.
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set Interval between I-frames (keyframes), which can be customized in frames or seconds. GOP value range: 0 and [1, 100000].
If this parameter is 0 or left blank, the system will automatically set the GOP length.
     * @param Gop Interval between I-frames (keyframes), which can be customized in frames or seconds. GOP value range: 0 and [1, 100000].
If this parameter is 0 or left blank, the system will automatically set the GOP length.
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get GOP value unit. Optional values:
frame: indicates frame
second: indicates second
Default value: frame
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return GopUnit GOP value unit. Optional values:
frame: indicates frame
second: indicates second
Default value: frame
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getGopUnit() {
        return this.GopUnit;
    }

    /**
     * Set GOP value unit. Optional values:
frame: indicates frame
second: indicates second
Default value: frame
Note: This field may return null, indicating that no valid value can be obtained.
     * @param GopUnit GOP value unit. Optional values:
frame: indicates frame
second: indicates second
Default value: frame
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setGopUnit(String GopUnit) {
        this.GopUnit = GopUnit;
    }

    /**
     * Get Filling mode. When the configured aspect ratio parameter for video streams differs from the aspect ratio of the original video, the processing method for transcoding is "filling". Optional filling modes:
<li>stretch: Each frame is stretched to fill the entire screen, which may cause the transcoded video to be "flattened" or "stretched".</li>
<li>black: The aspect ratio of the video is kept unchanged, and the rest of the edges is filled with black.</li>
<li>white: The aspect ratio of the video is kept unchanged, and the rest of the edges is filled with white.</li>
<li>gauss: The aspect ratio of the video is kept unchanged, and the rest of the edges is filled with a Gaussian blur.</li>

<li>smarttailor: Video images are smartly selected to ensure proportional image cropping.</li>
Default value: black.
Note: Only stretch and black are supported for adaptive bitrate streaming. 
     * @return FillType Filling mode. When the configured aspect ratio parameter for video streams differs from the aspect ratio of the original video, the processing method for transcoding is "filling". Optional filling modes:
<li>stretch: Each frame is stretched to fill the entire screen, which may cause the transcoded video to be "flattened" or "stretched".</li>
<li>black: The aspect ratio of the video is kept unchanged, and the rest of the edges is filled with black.</li>
<li>white: The aspect ratio of the video is kept unchanged, and the rest of the edges is filled with white.</li>
<li>gauss: The aspect ratio of the video is kept unchanged, and the rest of the edges is filled with a Gaussian blur.</li>

<li>smarttailor: Video images are smartly selected to ensure proportional image cropping.</li>
Default value: black.
Note: Only stretch and black are supported for adaptive bitrate streaming.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set Filling mode. When the configured aspect ratio parameter for video streams differs from the aspect ratio of the original video, the processing method for transcoding is "filling". Optional filling modes:
<li>stretch: Each frame is stretched to fill the entire screen, which may cause the transcoded video to be "flattened" or "stretched".</li>
<li>black: The aspect ratio of the video is kept unchanged, and the rest of the edges is filled with black.</li>
<li>white: The aspect ratio of the video is kept unchanged, and the rest of the edges is filled with white.</li>
<li>gauss: The aspect ratio of the video is kept unchanged, and the rest of the edges is filled with a Gaussian blur.</li>

<li>smarttailor: Video images are smartly selected to ensure proportional image cropping.</li>
Default value: black.
Note: Only stretch and black are supported for adaptive bitrate streaming.
     * @param FillType Filling mode. When the configured aspect ratio parameter for video streams differs from the aspect ratio of the original video, the processing method for transcoding is "filling". Optional filling modes:
<li>stretch: Each frame is stretched to fill the entire screen, which may cause the transcoded video to be "flattened" or "stretched".</li>
<li>black: The aspect ratio of the video is kept unchanged, and the rest of the edges is filled with black.</li>
<li>white: The aspect ratio of the video is kept unchanged, and the rest of the edges is filled with white.</li>
<li>gauss: The aspect ratio of the video is kept unchanged, and the rest of the edges is filled with a Gaussian blur.</li>

<li>smarttailor: Video images are smartly selected to ensure proportional image cropping.</li>
Default value: black.
Note: Only stretch and black are supported for adaptive bitrate streaming.
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    /**
     * Get Control factor for constant video bitrate. Value range: [0, 51].
If this parameter is specified, the bitrate control mode for the CRF will be used for transcoding (the video bitrate will no longer take effect).
It is recommended not to specify this parameter if there are no special requirements.

Note:
If Mode is set to ABR, the Vcrf value does not need to be configured.
If Mode is set to CBR, the Vcrf value does not need to be configured.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Vcrf Control factor for constant video bitrate. Value range: [0, 51].
If this parameter is specified, the bitrate control mode for the CRF will be used for transcoding (the video bitrate will no longer take effect).
It is recommended not to specify this parameter if there are no special requirements.

Note:
If Mode is set to ABR, the Vcrf value does not need to be configured.
If Mode is set to CBR, the Vcrf value does not need to be configured.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getVcrf() {
        return this.Vcrf;
    }

    /**
     * Set Control factor for constant video bitrate. Value range: [0, 51].
If this parameter is specified, the bitrate control mode for the CRF will be used for transcoding (the video bitrate will no longer take effect).
It is recommended not to specify this parameter if there are no special requirements.

Note:
If Mode is set to ABR, the Vcrf value does not need to be configured.
If Mode is set to CBR, the Vcrf value does not need to be configured.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Vcrf Control factor for constant video bitrate. Value range: [0, 51].
If this parameter is specified, the bitrate control mode for the CRF will be used for transcoding (the video bitrate will no longer take effect).
It is recommended not to specify this parameter if there are no special requirements.

Note:
If Mode is set to ABR, the Vcrf value does not need to be configured.
If Mode is set to CBR, the Vcrf value does not need to be configured.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVcrf(Long Vcrf) {
        this.Vcrf = Vcrf;
    }

    /**
     * Get Average segment duration. Value range: (0-10], unit: second
Default value: 10
Note: It can be used only in the container format of hls.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return HlsTime Average segment duration. Value range: (0-10], unit: second
Default value: 10
Note: It can be used only in the container format of hls.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getHlsTime() {
        return this.HlsTime;
    }

    /**
     * Set Average segment duration. Value range: (0-10], unit: second
Default value: 10
Note: It can be used only in the container format of hls.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param HlsTime Average segment duration. Value range: (0-10], unit: second
Default value: 10
Note: It can be used only in the container format of hls.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setHlsTime(Long HlsTime) {
        this.HlsTime = HlsTime;
    }

    /**
     * Get HLS segment type. Valid values:
<li>0: HLS+TS segment.</li>
<li>2: HLS+TS byte range.</li>
<li>7: HLS+MP4 segment.</li>
<li>5: HLS+MP4 byte range.</li>
Default value: 0

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SegmentType HLS segment type. Valid values:
<li>0: HLS+TS segment.</li>
<li>2: HLS+TS byte range.</li>
<li>7: HLS+MP4 segment.</li>
<li>5: HLS+MP4 byte range.</li>
Default value: 0

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set HLS segment type. Valid values:
<li>0: HLS+TS segment.</li>
<li>2: HLS+TS byte range.</li>
<li>7: HLS+MP4 segment.</li>
<li>5: HLS+MP4 byte range.</li>
Default value: 0

Note: This field may return null, indicating that no valid values can be obtained.
     * @param SegmentType HLS segment type. Valid values:
<li>0: HLS+TS segment.</li>
<li>2: HLS+TS byte range.</li>
<li>7: HLS+MP4 segment.</li>
<li>5: HLS+MP4 byte range.</li>
Default value: 0

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSegmentType(Long SegmentType) {
        this.SegmentType = SegmentType;
    }

    /**
     * Get Denominator of the frame rate.
Note: The value must be greater than 0.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FpsDenominator Denominator of the frame rate.
Note: The value must be greater than 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFpsDenominator() {
        return this.FpsDenominator;
    }

    /**
     * Set Denominator of the frame rate.
Note: The value must be greater than 0.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FpsDenominator Denominator of the frame rate.
Note: The value must be greater than 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFpsDenominator(Long FpsDenominator) {
        this.FpsDenominator = FpsDenominator;
    }

    /**
     * Get 3D video splicing mode, which is only valid for MV-HEVC 3D videos. Valid values:
<li>side_by_side: side-by-side view.</li>
<li>top_bottom: top-bottom view.</li>
Default value: side_by_side.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Stereo3dType 3D video splicing mode, which is only valid for MV-HEVC 3D videos. Valid values:
<li>side_by_side: side-by-side view.</li>
<li>top_bottom: top-bottom view.</li>
Default value: side_by_side.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStereo3dType() {
        return this.Stereo3dType;
    }

    /**
     * Set 3D video splicing mode, which is only valid for MV-HEVC 3D videos. Valid values:
<li>side_by_side: side-by-side view.</li>
<li>top_bottom: top-bottom view.</li>
Default value: side_by_side.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Stereo3dType 3D video splicing mode, which is only valid for MV-HEVC 3D videos. Valid values:
<li>side_by_side: side-by-side view.</li>
<li>top_bottom: top-bottom view.</li>
Default value: side_by_side.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStereo3dType(String Stereo3dType) {
        this.Stereo3dType = Stereo3dType;
    }

    /**
     * Get Profile, suitable for different scenarios.
baseline: It only supports I/P-frames and non-interlaced scenarios, and is suitable for scenarios such as video calls and mobile videos.
main: It offers I-frames, P-frames, and B-frames, and supports both interlaced and non-interlaced modes. It is mainly used in mainstream audio and video consumption products such as video players and streaming media transmission devices.
high: the highest encoding level, with 8x8 prediction added to the main profile and support for custom quantification. It is widely used in scenarios such as Blu-ray storage and HDTV.
default: automatic filling along with the original video.    

This configuration appears only when the encoding standard is set to H264. baseline/main/high is supported. Default value: default
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return VideoProfile Profile, suitable for different scenarios.
baseline: It only supports I/P-frames and non-interlaced scenarios, and is suitable for scenarios such as video calls and mobile videos.
main: It offers I-frames, P-frames, and B-frames, and supports both interlaced and non-interlaced modes. It is mainly used in mainstream audio and video consumption products such as video players and streaming media transmission devices.
high: the highest encoding level, with 8x8 prediction added to the main profile and support for custom quantification. It is widely used in scenarios such as Blu-ray storage and HDTV.
default: automatic filling along with the original video.    

This configuration appears only when the encoding standard is set to H264. baseline/main/high is supported. Default value: default
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getVideoProfile() {
        return this.VideoProfile;
    }

    /**
     * Set Profile, suitable for different scenarios.
baseline: It only supports I/P-frames and non-interlaced scenarios, and is suitable for scenarios such as video calls and mobile videos.
main: It offers I-frames, P-frames, and B-frames, and supports both interlaced and non-interlaced modes. It is mainly used in mainstream audio and video consumption products such as video players and streaming media transmission devices.
high: the highest encoding level, with 8x8 prediction added to the main profile and support for custom quantification. It is widely used in scenarios such as Blu-ray storage and HDTV.
default: automatic filling along with the original video.    

This configuration appears only when the encoding standard is set to H264. baseline/main/high is supported. Default value: default
Note: This field may return null, indicating that no valid value can be obtained.
     * @param VideoProfile Profile, suitable for different scenarios.
baseline: It only supports I/P-frames and non-interlaced scenarios, and is suitable for scenarios such as video calls and mobile videos.
main: It offers I-frames, P-frames, and B-frames, and supports both interlaced and non-interlaced modes. It is mainly used in mainstream audio and video consumption products such as video players and streaming media transmission devices.
high: the highest encoding level, with 8x8 prediction added to the main profile and support for custom quantification. It is widely used in scenarios such as Blu-ray storage and HDTV.
default: automatic filling along with the original video.    

This configuration appears only when the encoding standard is set to H264. baseline/main/high is supported. Default value: default
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVideoProfile(String VideoProfile) {
        this.VideoProfile = VideoProfile;
    }

    /**
     * Get Encoder level. Default value: auto ("")
If the encoding standard is set to H264, the following options are supported: "", 1, 1.1, 1.2, 1.3, 2, 2.1, 2.2, 3, 3.1, 3.2, 4, 4.1, 4.2, 5, and 5.1.
If the encoding standard is set to H265, the following options are supported: "", 1, 2, 2.1, 3, 3.1, 4, 4.1, 5, 5.1, 5.2, 6, 6.1, 6.2, and 8.5.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return VideoLevel Encoder level. Default value: auto ("")
If the encoding standard is set to H264, the following options are supported: "", 1, 1.1, 1.2, 1.3, 2, 2.1, 2.2, 3, 3.1, 3.2, 4, 4.1, 4.2, 5, and 5.1.
If the encoding standard is set to H265, the following options are supported: "", 1, 2, 2.1, 3, 3.1, 4, 4.1, 5, 5.1, 5.2, 6, 6.1, 6.2, and 8.5.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getVideoLevel() {
        return this.VideoLevel;
    }

    /**
     * Set Encoder level. Default value: auto ("")
If the encoding standard is set to H264, the following options are supported: "", 1, 1.1, 1.2, 1.3, 2, 2.1, 2.2, 3, 3.1, 3.2, 4, 4.1, 4.2, 5, and 5.1.
If the encoding standard is set to H265, the following options are supported: "", 1, 2, 2.1, 3, 3.1, 4, 4.1, 5, 5.1, 5.2, 6, 6.1, 6.2, and 8.5.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param VideoLevel Encoder level. Default value: auto ("")
If the encoding standard is set to H264, the following options are supported: "", 1, 1.1, 1.2, 1.3, 2, 2.1, 2.2, 3, 3.1, 3.2, 4, 4.1, 4.2, 5, and 5.1.
If the encoding standard is set to H265, the following options are supported: "", 1, 2, 2.1, 3, 3.1, 4, 4.1, 5, 5.1, 5.2, 6, 6.1, 6.2, and 8.5.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVideoLevel(String VideoLevel) {
        this.VideoLevel = VideoLevel;
    }

    /**
     * Get Number of B-frames between reference frames. The default is auto, and a range of 0 - 16 is supported.
Note: Leaving it blank means using the auto option.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Bframes Number of B-frames between reference frames. The default is auto, and a range of 0 - 16 is supported.
Note: Leaving it blank means using the auto option.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getBframes() {
        return this.Bframes;
    }

    /**
     * Set Number of B-frames between reference frames. The default is auto, and a range of 0 - 16 is supported.
Note: Leaving it blank means using the auto option.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Bframes Number of B-frames between reference frames. The default is auto, and a range of 0 - 16 is supported.
Note: Leaving it blank means using the auto option.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBframes(Long Bframes) {
        this.Bframes = Bframes;
    }

    /**
     * Get Bitrate control mode. Optional values:
VBR: variable bitrate. The output bitrate is adjusted based on the complexity of the video image, ensuring higher image quality. This mode is suitable for storage scenarios as well as applications with high image quality requirements.
ABR: average bitrate. The average bitrate of the output video is kept stable to the greatest extent, but short-term bitrate fluctuations are allowed. This mode is suitable for scenarios where it is necessary to minimize the overall bitrate while a certain quality is maintained.
CBR: constant bitrate. The output bitrate remains constant during the video encoding process, regardless of changes in image complexity. This mode is suitable for scenarios with strict network bandwidth requirements, such as live streaming.
VCRF: constant rate factor. The video quality is controlled by setting a quality factor, achieving constant quality encoding of videos. The bitrate is automatically adjusted based on the complexity of the content. This mode is suitable for scenarios where maintaining a certain quality is desired.
VBR is selected by default.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Mode Bitrate control mode. Optional values:
VBR: variable bitrate. The output bitrate is adjusted based on the complexity of the video image, ensuring higher image quality. This mode is suitable for storage scenarios as well as applications with high image quality requirements.
ABR: average bitrate. The average bitrate of the output video is kept stable to the greatest extent, but short-term bitrate fluctuations are allowed. This mode is suitable for scenarios where it is necessary to minimize the overall bitrate while a certain quality is maintained.
CBR: constant bitrate. The output bitrate remains constant during the video encoding process, regardless of changes in image complexity. This mode is suitable for scenarios with strict network bandwidth requirements, such as live streaming.
VCRF: constant rate factor. The video quality is controlled by setting a quality factor, achieving constant quality encoding of videos. The bitrate is automatically adjusted based on the complexity of the content. This mode is suitable for scenarios where maintaining a certain quality is desired.
VBR is selected by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Bitrate control mode. Optional values:
VBR: variable bitrate. The output bitrate is adjusted based on the complexity of the video image, ensuring higher image quality. This mode is suitable for storage scenarios as well as applications with high image quality requirements.
ABR: average bitrate. The average bitrate of the output video is kept stable to the greatest extent, but short-term bitrate fluctuations are allowed. This mode is suitable for scenarios where it is necessary to minimize the overall bitrate while a certain quality is maintained.
CBR: constant bitrate. The output bitrate remains constant during the video encoding process, regardless of changes in image complexity. This mode is suitable for scenarios with strict network bandwidth requirements, such as live streaming.
VCRF: constant rate factor. The video quality is controlled by setting a quality factor, achieving constant quality encoding of videos. The bitrate is automatically adjusted based on the complexity of the content. This mode is suitable for scenarios where maintaining a certain quality is desired.
VBR is selected by default.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Mode Bitrate control mode. Optional values:
VBR: variable bitrate. The output bitrate is adjusted based on the complexity of the video image, ensuring higher image quality. This mode is suitable for storage scenarios as well as applications with high image quality requirements.
ABR: average bitrate. The average bitrate of the output video is kept stable to the greatest extent, but short-term bitrate fluctuations are allowed. This mode is suitable for scenarios where it is necessary to minimize the overall bitrate while a certain quality is maintained.
CBR: constant bitrate. The output bitrate remains constant during the video encoding process, regardless of changes in image complexity. This mode is suitable for scenarios with strict network bandwidth requirements, such as live streaming.
VCRF: constant rate factor. The video quality is controlled by setting a quality factor, achieving constant quality encoding of videos. The bitrate is automatically adjusted based on the complexity of the content. This mode is suitable for scenarios where maintaining a certain quality is desired.
VBR is selected by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Display aspect ratio. Optional values: [1:1, 2:1, default]
Default value: default
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Sar Display aspect ratio. Optional values: [1:1, 2:1, default]
Default value: default
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSar() {
        return this.Sar;
    }

    /**
     * Set Display aspect ratio. Optional values: [1:1, 2:1, default]
Default value: default
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Sar Display aspect ratio. Optional values: [1:1, 2:1, default]
Default value: default
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSar(String Sar) {
        this.Sar = Sar;
    }

    /**
     * Get Adaptive I-frame decision. When it is enabled, Media Processing Service will automatically identify transition points between different scenarios in the video (usually they are visually distinct frames, such as those of switching from one shot to another) and adaptively insert keyframes (I-frames) at these points to improve the random accessibility and encoding efficiency of the video. Optional values:
0: Disable the adaptive I-frame decision 
1: Enable the adaptive I-frame decision
Default value: 0

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return NoScenecut Adaptive I-frame decision. When it is enabled, Media Processing Service will automatically identify transition points between different scenarios in the video (usually they are visually distinct frames, such as those of switching from one shot to another) and adaptively insert keyframes (I-frames) at these points to improve the random accessibility and encoding efficiency of the video. Optional values:
0: Disable the adaptive I-frame decision 
1: Enable the adaptive I-frame decision
Default value: 0

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getNoScenecut() {
        return this.NoScenecut;
    }

    /**
     * Set Adaptive I-frame decision. When it is enabled, Media Processing Service will automatically identify transition points between different scenarios in the video (usually they are visually distinct frames, such as those of switching from one shot to another) and adaptively insert keyframes (I-frames) at these points to improve the random accessibility and encoding efficiency of the video. Optional values:
0: Disable the adaptive I-frame decision 
1: Enable the adaptive I-frame decision
Default value: 0

Note: This field may return null, indicating that no valid value can be obtained.
     * @param NoScenecut Adaptive I-frame decision. When it is enabled, Media Processing Service will automatically identify transition points between different scenarios in the video (usually they are visually distinct frames, such as those of switching from one shot to another) and adaptively insert keyframes (I-frames) at these points to improve the random accessibility and encoding efficiency of the video. Optional values:
0: Disable the adaptive I-frame decision 
1: Enable the adaptive I-frame decision
Default value: 0

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNoScenecut(Long NoScenecut) {
        this.NoScenecut = NoScenecut;
    }

    /**
     * Get Bit: 8/10 is supported. Default value: 8
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BitDepth Bit: 8/10 is supported. Default value: 8
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getBitDepth() {
        return this.BitDepth;
    }

    /**
     * Set Bit: 8/10 is supported. Default value: 8
Note: This field may return null, indicating that no valid value can be obtained.
     * @param BitDepth Bit: 8/10 is supported. Default value: 8
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBitDepth(Long BitDepth) {
        this.BitDepth = BitDepth;
    }

    /**
     * Get Preservation of original timestamp. Optional values:
0: Disabled
1: Enabled
Default value: Disabled
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RawPts Preservation of original timestamp. Optional values:
0: Disabled
1: Enabled
Default value: Disabled
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRawPts() {
        return this.RawPts;
    }

    /**
     * Set Preservation of original timestamp. Optional values:
0: Disabled
1: Enabled
Default value: Disabled
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RawPts Preservation of original timestamp. Optional values:
0: Disabled
1: Enabled
Default value: Disabled
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRawPts(Long RawPts) {
        this.RawPts = RawPts;
    }

    /**
     * Get Proportional compression bitrate. When it is enabled, the bitrate of the output video will be adjusted according to the proportion. After the compression ratio is entered, the system will automatically calculate the target output bitrate based on the source video bitrate. Compression ratio range: 0-100
Leaving this value blank means it is not enabled by default.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Compress Proportional compression bitrate. When it is enabled, the bitrate of the output video will be adjusted according to the proportion. After the compression ratio is entered, the system will automatically calculate the target output bitrate based on the source video bitrate. Compression ratio range: 0-100
Leaving this value blank means it is not enabled by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCompress() {
        return this.Compress;
    }

    /**
     * Set Proportional compression bitrate. When it is enabled, the bitrate of the output video will be adjusted according to the proportion. After the compression ratio is entered, the system will automatically calculate the target output bitrate based on the source video bitrate. Compression ratio range: 0-100
Leaving this value blank means it is not enabled by default.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Compress Proportional compression bitrate. When it is enabled, the bitrate of the output video will be adjusted according to the proportion. After the compression ratio is entered, the system will automatically calculate the target output bitrate based on the source video bitrate. Compression ratio range: 0-100
Leaving this value blank means it is not enabled by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCompress(Long Compress) {
        this.Compress = Compress;
    }

    /**
     * Get Special segment configuration
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SegmentSpecificInfo Special segment configuration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SegmentSpecificInfo getSegmentSpecificInfo() {
        return this.SegmentSpecificInfo;
    }

    /**
     * Set Special segment configuration
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SegmentSpecificInfo Special segment configuration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSegmentSpecificInfo(SegmentSpecificInfo SegmentSpecificInfo) {
        this.SegmentSpecificInfo = SegmentSpecificInfo;
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
        if (source.Gop != null) {
            this.Gop = new Long(source.Gop);
        }
        if (source.GopUnit != null) {
            this.GopUnit = new String(source.GopUnit);
        }
        if (source.FillType != null) {
            this.FillType = new String(source.FillType);
        }
        if (source.Vcrf != null) {
            this.Vcrf = new Long(source.Vcrf);
        }
        if (source.HlsTime != null) {
            this.HlsTime = new Long(source.HlsTime);
        }
        if (source.SegmentType != null) {
            this.SegmentType = new Long(source.SegmentType);
        }
        if (source.FpsDenominator != null) {
            this.FpsDenominator = new Long(source.FpsDenominator);
        }
        if (source.Stereo3dType != null) {
            this.Stereo3dType = new String(source.Stereo3dType);
        }
        if (source.VideoProfile != null) {
            this.VideoProfile = new String(source.VideoProfile);
        }
        if (source.VideoLevel != null) {
            this.VideoLevel = new String(source.VideoLevel);
        }
        if (source.Bframes != null) {
            this.Bframes = new Long(source.Bframes);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Sar != null) {
            this.Sar = new String(source.Sar);
        }
        if (source.NoScenecut != null) {
            this.NoScenecut = new Long(source.NoScenecut);
        }
        if (source.BitDepth != null) {
            this.BitDepth = new Long(source.BitDepth);
        }
        if (source.RawPts != null) {
            this.RawPts = new Long(source.RawPts);
        }
        if (source.Compress != null) {
            this.Compress = new Long(source.Compress);
        }
        if (source.SegmentSpecificInfo != null) {
            this.SegmentSpecificInfo = new SegmentSpecificInfo(source.SegmentSpecificInfo);
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
        this.setParamSimple(map, prefix + "Gop", this.Gop);
        this.setParamSimple(map, prefix + "GopUnit", this.GopUnit);
        this.setParamSimple(map, prefix + "FillType", this.FillType);
        this.setParamSimple(map, prefix + "Vcrf", this.Vcrf);
        this.setParamSimple(map, prefix + "HlsTime", this.HlsTime);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);
        this.setParamSimple(map, prefix + "FpsDenominator", this.FpsDenominator);
        this.setParamSimple(map, prefix + "Stereo3dType", this.Stereo3dType);
        this.setParamSimple(map, prefix + "VideoProfile", this.VideoProfile);
        this.setParamSimple(map, prefix + "VideoLevel", this.VideoLevel);
        this.setParamSimple(map, prefix + "Bframes", this.Bframes);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Sar", this.Sar);
        this.setParamSimple(map, prefix + "NoScenecut", this.NoScenecut);
        this.setParamSimple(map, prefix + "BitDepth", this.BitDepth);
        this.setParamSimple(map, prefix + "RawPts", this.RawPts);
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamObj(map, prefix + "SegmentSpecificInfo.", this.SegmentSpecificInfo);

    }
}

