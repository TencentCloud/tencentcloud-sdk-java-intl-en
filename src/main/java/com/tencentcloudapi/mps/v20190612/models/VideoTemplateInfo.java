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

public class VideoTemplateInfo extends AbstractModel {

    /**
    * Encoding format for video streams. Optional values:
<li>h264: H.264 encoding.</li>
<li>h265: H.265 encoding.</li>
<li>h266: H.266 encoding.</li>
<li>av1: AOMedia Video 1 encoding</li>
<li>vp8: VP8 encoding.</li>
<li>vp9: VP9 encoding.</li>
<li>mpeg2: MPEG2 encoding.</li>
<li>dnxhd: DNxHD encoding.</li>
<li>mv-hevc: MV-HEVC encoding.</li>

Note: av1 encoding containers currently only support mp4, webm, and mkv.
Note: H.266 encoding containers currently only support mp4, hls, ts, and mov.
Note: VP8 and VP9 encoding containers currently only support webm and mkv.
Note: MPEG2 and dnxhd encoding containers currently only support mxf.
Note: The MV-HEVC codec currently only supports mp4, hls, and mov. Among them, the HLS format only supports the MP4 segmented format and requires the input source to be a panoramic video (with multiple views).
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
    * Video stream bitrate, in kbps. Value range: 0 and [128, 100000].
If the value is 0, the bitrate of the video will be the same as that of the source video.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Resolution adaptation, available values:
<li>open: turn on. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: close. At this point, Width represents the width of the video, and Height indicates the height of the video.</li>
Default value: open.
Note: In self-adaptation mode, Width cannot be less than Height.
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * Maximum value of the video stream width (or long edge) in px. Value range: 0 and [128, 4096].
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
Note: If Codec is set to MV-HEVC, the maximum value can be 7680.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Maximum height (or short side) of the video stream. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
Note: If Codec is set to MV-HEVC, the maximum value can be 7680.
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
    * Gop value unit. Value range:
frame: indicates frame
second: indicates second
Default value: frame
    */
    @SerializedName("GopUnit")
    @Expose
    private String GopUnit;

    /**
    * Filling method, when video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling modes:
<li> stretch: stretches each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li>black: Keep black, maintain video aspect ratio, edges filled with black.</li>
<li>White: Leave blank, maintain video aspect ratio, edge remainder filled with white.</li>
<li>gauss: Gaussian blur, maintain video aspect ratio, and use Gaussian blur filling for the rest of the edges.</li>
<li>smarttailor: intelligent cropping: smartly select video images to ensure proportional image cropping.</li>
Default value: black.
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
    * Control factor for constant video bitrate. Value range: [0, 51]. If not specified, it means "auto". If there are no special requirements, it is advisable not to specify this parameter.
If Mode is set to VBR and Vcrf is configured, MPS processes video in VBR mode, taking into account both Vcrf and Bitrate parameter settings to balance video quality, bitrate, transcoding efficiency, and file size.
When Mode is set to CRF, the Bitrate setting will become invalid, and encoding will be performed based on the Vcrf value.
If Mode is set to ABR or CBR, the Vcrf value does not need to be configured.
    */
    @SerializedName("Vcrf")
    @Expose
    private Long Vcrf;

    /**
    * Average segment duration. Value range: (0-10], unit: second.
If not specified, it means auto. The appropriate segment duration will be automatically selected based on video features such as GOP.
    */
    @SerializedName("HlsTime")
    @Expose
    private Long HlsTime;

    /**
    * hls fragment type. Available values:
<li>0: HLS+TS segment.</li>
<li>2:HLS+TS byte range</li>
<li>7: HLS+MP4 segment.</li>
<li>5:HLS+MP4 byte range</li>
Default value: 0
Note: This field is used for ordinary/TSC transcoding settings and does not take effect for adaptive bitrate streams. To configure the shard type for an adaptive bitrate stream, use the outer field.
    */
    @SerializedName("SegmentType")
    @Expose
    private Long SegmentType;

    /**
    * Denominator of the frame rate.
Note: The value must be greater than 0.
    */
    @SerializedName("FpsDenominator")
    @Expose
    private Long FpsDenominator;

    /**
    * 3D video splicing mode. It takes effect only for mv-hevc and 3D videos. Available values:
<li>side_by_side: left-right layout arrangement of the original video content.</li>
<li>top_bottom: top-bottom layout arrangement of the original video content.</li>
Billing will be based on the segmented resolution size to report usage and charges.
Default value: side_by_side.
    */
    @SerializedName("Stereo3dType")
    @Expose
    private String Stereo3dType;

    /**
    * Profile, suitable for different scenarios.
baseline: It only supports I/P-frames and non-interlaced scenarios, and is suitable for scenarios such as video calls and mobile videos.
Main: Mainstream Profile, provides I-frames, P-frames, and B-frames, and supports both interlaced and non-interlaced modes. It is mainly used in mainstream audio and video consumption products such as video players and streaming media transmission devices.
high: Highest encoding level. It adds 8X8 prediction to Main Profile and supports custom quantization. It is widely used in Blu-ray storage, HDTV, and other scenarios.
default: automatic filling along with the original video.    

This configuration appears only when the encoding standard is set to H264. baseline/main/high is supported. Default value: default
    */
    @SerializedName("VideoProfile")
    @Expose
    private String VideoProfile;

    /**
    * Encoder level. Default value: auto ("")
If the encoding standard is set to H264, the following options are supported: "", 1, 1.1, 1.2, 1.3, 2, 2.1, 2.2, 3, 3.1, 3.2, 4, 4.1, 4.2, 5, and 5.1.
If the encoding standard is set to H265, the following options are supported: "", 1, 2, 2.1, 3, 3.1, 4, 4.1, 5, 5.1, 5.2, 6, 6.1, 6.2, and 8.5.
    */
    @SerializedName("VideoLevel")
    @Expose
    private String VideoLevel;

    /**
    * Number of B-frames between reference frames. The default is auto, and a range of 0 - 16 is supported.
Note: Leaving it blank means using the auto option.
    */
    @SerializedName("Bframes")
    @Expose
    private Long Bframes;

    /**
    * Bitrate control mode. Available values:
VBR (Variable Bit Rate): adjust the output bitrate based on the complexity of the video image to ensure higher image quality. It is suitable for storage scenarios and applications with high image quality requirements.
ABR (Average Bit Rate): Try to keep the average bitrate of the output video stable as much as possible, but allow short-term bitrate fluctuation. It is suitable for scenarios where the overall bitrate needs to be minimized while maintaining a certain image quality.
CBR (Constant Bit Rate): maintains a constant output bitrate during video encoding, regardless of image complexity changes. It is suitable for scenarios with strict network bandwidth requirements, such as live streaming.
VCRF (Constant Rate Factor): A constant quality factor. It controls video quality by setting a quality factor to achieve constant quality encoding of videos. The bitrate is automatically adjusted based on content complexity, making it suitable for scenarios where maintaining a certain quality is desired.
VBR is selected by default.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Display aspect ratio. Optional values: [1:1, 2:1, default]
Default value: default
    */
    @SerializedName("Sar")
    @Expose
    private String Sar;

    /**
    * Adaptive I-frame decision. When it is enabled, Media Processing Service will automatically identify transition points between different scenarios in the video (usually they are visually distinct frames, such as those of switching from one shot to another) and adaptively insert keyframes (I-frames) at these points to improve the random accessibility and encoding efficiency of the video. Available values:
0: Disable adaptive I-frame decision 
1: Enable the adaptive I-frame decision
Default value: 0
    */
    @SerializedName("NoScenecut")
    @Expose
    private Long NoScenecut;

    /**
    * Bit: 8/10 is supported. Default value: 8
    */
    @SerializedName("BitDepth")
    @Expose
    private Long BitDepth;

    /**
    * Preserve original timestamp. Optional values:
0: Disabled
1: Indicates open
Default value: Disabled
    */
    @SerializedName("RawPts")
    @Expose
    private Long RawPts;

    /**
    * Proportional compression bitrate. When enabled, the output video's bitrate is adjusted according to the proportion. After the compression ratio is entered, the system automatically calculates the target output bitrate based on the source video bitrate. Compression ratio range: 0-100
Leaving this value blank means it is not enabled by default.
    */
    @SerializedName("Compress")
    @Expose
    private Long Compress;

    /**
    * Segment duration at startup
    */
    @SerializedName("SegmentSpecificInfo")
    @Expose
    private SegmentSpecificInfo SegmentSpecificInfo;

    /**
    * Whether to enable scenario-based settings for the template 
0: disable 
1: enable 
Default value: 0	
Note: The values of the SceneType and CompressType fields are effective only when the value of this field is 1.
    */
    @SerializedName("ScenarioBased")
    @Expose
    private Long ScenarioBased;

    /**
    * Video scenario. Optional values: 
normal: General transcoding scenario: General transcoding and compression scenario.
pgc: PGC HD TV shows and movies: At the time of compression, focus is placed on the viewing experience of TV shows and movies and ROI encoding is performed according to their characteristics, while high-quality contents of videos and audio are retained. 
materials_video: HD materials: Scenario involving material resources, where requirements for image quality are extremely high and there are many transparent images, with almost no visual loss during compression. 
ugc: UGC content: It is suitable for a wide range of UGC/short video scenarios, with an optimized encoding bitrate for short video characteristics, improved image quality, and enhanced business QOS/QOE metrics. 
e-commerce_video: Fashion show/e-commerce: During compression, emphasis is placed on detail clarity and ROI enhancement, with a particular focus on maintaining the image quality of the face region. 
educational_video: Education: At the time of compression, emphasis is placed on the clarity and readability of text and images to help students better understand the content, ensuring that the teaching content is clearly conveyed. 
Default value: normal.
Note: To use this value, the value of ScenarioBased must be 1. Otherwise, this value does not take effect.
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * Transcoding policy. Optional values: 
ultra_compress: Extreme compression: Compared to standard compression, this policy can maximize bitrate compression while ensuring a certain level of image quality, thus greatly saving bandwidth and storage costs. 
standard_compress: Comprehensively optimal: The compression ratio and image quality are balanced, and files are compressed as much as possible without a noticeable reduction in subjective image quality. Only audio and video TSC transcoding fees are charged for this policy. 
high_compress: Bitrate priority: Priority is given to reducing file size, which may result in certain image quality loss. Only audio and video TSC transcoding fees are charged for this policy. 
low_compress: Image quality priority: Priority is given to ensuring image quality, and the size of compressed files may be relatively large. Only audio and video TSC transcoding fees are charged for this policy. 
Default value: standard_compress. 
Note: The ultra_compress policy is not recommended for use if you need to watch videos on TV. The billing standard for the ultra_compress policy is TSC transcoding + audio/video enhancement-artifacts removal.
Note: To use this value, the value of ScenarioBased must be 1. Otherwise, this value does not take effect.
    */
    @SerializedName("CompressType")
    @Expose
    private String CompressType;

    /**
     * Get Encoding format for video streams. Optional values:
<li>h264: H.264 encoding.</li>
<li>h265: H.265 encoding.</li>
<li>h266: H.266 encoding.</li>
<li>av1: AOMedia Video 1 encoding</li>
<li>vp8: VP8 encoding.</li>
<li>vp9: VP9 encoding.</li>
<li>mpeg2: MPEG2 encoding.</li>
<li>dnxhd: DNxHD encoding.</li>
<li>mv-hevc: MV-HEVC encoding.</li>

Note: av1 encoding containers currently only support mp4, webm, and mkv.
Note: H.266 encoding containers currently only support mp4, hls, ts, and mov.
Note: VP8 and VP9 encoding containers currently only support webm and mkv.
Note: MPEG2 and dnxhd encoding containers currently only support mxf.
Note: The MV-HEVC codec currently only supports mp4, hls, and mov. Among them, the HLS format only supports the MP4 segmented format and requires the input source to be a panoramic video (with multiple views). 
     * @return Codec Encoding format for video streams. Optional values:
<li>h264: H.264 encoding.</li>
<li>h265: H.265 encoding.</li>
<li>h266: H.266 encoding.</li>
<li>av1: AOMedia Video 1 encoding</li>
<li>vp8: VP8 encoding.</li>
<li>vp9: VP9 encoding.</li>
<li>mpeg2: MPEG2 encoding.</li>
<li>dnxhd: DNxHD encoding.</li>
<li>mv-hevc: MV-HEVC encoding.</li>

Note: av1 encoding containers currently only support mp4, webm, and mkv.
Note: H.266 encoding containers currently only support mp4, hls, ts, and mov.
Note: VP8 and VP9 encoding containers currently only support webm and mkv.
Note: MPEG2 and dnxhd encoding containers currently only support mxf.
Note: The MV-HEVC codec currently only supports mp4, hls, and mov. Among them, the HLS format only supports the MP4 segmented format and requires the input source to be a panoramic video (with multiple views).
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Encoding format for video streams. Optional values:
<li>h264: H.264 encoding.</li>
<li>h265: H.265 encoding.</li>
<li>h266: H.266 encoding.</li>
<li>av1: AOMedia Video 1 encoding</li>
<li>vp8: VP8 encoding.</li>
<li>vp9: VP9 encoding.</li>
<li>mpeg2: MPEG2 encoding.</li>
<li>dnxhd: DNxHD encoding.</li>
<li>mv-hevc: MV-HEVC encoding.</li>

Note: av1 encoding containers currently only support mp4, webm, and mkv.
Note: H.266 encoding containers currently only support mp4, hls, ts, and mov.
Note: VP8 and VP9 encoding containers currently only support webm and mkv.
Note: MPEG2 and dnxhd encoding containers currently only support mxf.
Note: The MV-HEVC codec currently only supports mp4, hls, and mov. Among them, the HLS format only supports the MP4 segmented format and requires the input source to be a panoramic video (with multiple views).
     * @param Codec Encoding format for video streams. Optional values:
<li>h264: H.264 encoding.</li>
<li>h265: H.265 encoding.</li>
<li>h266: H.266 encoding.</li>
<li>av1: AOMedia Video 1 encoding</li>
<li>vp8: VP8 encoding.</li>
<li>vp9: VP9 encoding.</li>
<li>mpeg2: MPEG2 encoding.</li>
<li>dnxhd: DNxHD encoding.</li>
<li>mv-hevc: MV-HEVC encoding.</li>

Note: av1 encoding containers currently only support mp4, webm, and mkv.
Note: H.266 encoding containers currently only support mp4, hls, ts, and mov.
Note: VP8 and VP9 encoding containers currently only support webm and mkv.
Note: MPEG2 and dnxhd encoding containers currently only support mxf.
Note: The MV-HEVC codec currently only supports mp4, hls, and mov. Among them, the HLS format only supports the MP4 segmented format and requires the input source to be a panoramic video (with multiple views).
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
     * Get Video stream bitrate, in kbps. Value range: 0 and [128, 100000].
If the value is 0, the bitrate of the video will be the same as that of the source video. 
     * @return Bitrate Video stream bitrate, in kbps. Value range: 0 and [128, 100000].
If the value is 0, the bitrate of the video will be the same as that of the source video.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Video stream bitrate, in kbps. Value range: 0 and [128, 100000].
If the value is 0, the bitrate of the video will be the same as that of the source video.
     * @param Bitrate Video stream bitrate, in kbps. Value range: 0 and [128, 100000].
If the value is 0, the bitrate of the video will be the same as that of the source video.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Resolution adaptation, available values:
<li>open: turn on. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: close. At this point, Width represents the width of the video, and Height indicates the height of the video.</li>
Default value: open.
Note: In self-adaptation mode, Width cannot be less than Height. 
     * @return ResolutionAdaptive Resolution adaptation, available values:
<li>open: turn on. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: close. At this point, Width represents the width of the video, and Height indicates the height of the video.</li>
Default value: open.
Note: In self-adaptation mode, Width cannot be less than Height.
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set Resolution adaptation, available values:
<li>open: turn on. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: close. At this point, Width represents the width of the video, and Height indicates the height of the video.</li>
Default value: open.
Note: In self-adaptation mode, Width cannot be less than Height.
     * @param ResolutionAdaptive Resolution adaptation, available values:
<li>open: turn on. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: close. At this point, Width represents the width of the video, and Height indicates the height of the video.</li>
Default value: open.
Note: In self-adaptation mode, Width cannot be less than Height.
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get Maximum value of the video stream width (or long edge) in px. Value range: 0 and [128, 4096].
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
Note: If Codec is set to MV-HEVC, the maximum value can be 7680. 
     * @return Width Maximum value of the video stream width (or long edge) in px. Value range: 0 and [128, 4096].
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
Note: If Codec is set to MV-HEVC, the maximum value can be 7680.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Maximum value of the video stream width (or long edge) in px. Value range: 0 and [128, 4096].
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
Note: If Codec is set to MV-HEVC, the maximum value can be 7680.
     * @param Width Maximum value of the video stream width (or long edge) in px. Value range: 0 and [128, 4096].
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
Note: If Codec is set to MV-HEVC, the maximum value can be 7680.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Maximum height (or short side) of the video stream. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
Note: If Codec is set to MV-HEVC, the maximum value can be 7680. 
     * @return Height Maximum height (or short side) of the video stream. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
Note: If Codec is set to MV-HEVC, the maximum value can be 7680.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Maximum height (or short side) of the video stream. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
Note: If Codec is set to MV-HEVC, the maximum value can be 7680.
     * @param Height Maximum height (or short side) of the video stream. Value range: 0 and [128, 4096]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>
Default value: 0.
Note: If Codec is set to MV-HEVC, the maximum value can be 7680.
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
     * Get Gop value unit. Value range:
frame: indicates frame
second: indicates second
Default value: frame 
     * @return GopUnit Gop value unit. Value range:
frame: indicates frame
second: indicates second
Default value: frame
     */
    public String getGopUnit() {
        return this.GopUnit;
    }

    /**
     * Set Gop value unit. Value range:
frame: indicates frame
second: indicates second
Default value: frame
     * @param GopUnit Gop value unit. Value range:
frame: indicates frame
second: indicates second
Default value: frame
     */
    public void setGopUnit(String GopUnit) {
        this.GopUnit = GopUnit;
    }

    /**
     * Get Filling method, when video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling modes:
<li> stretch: stretches each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li>black: Keep black, maintain video aspect ratio, edges filled with black.</li>
<li>White: Leave blank, maintain video aspect ratio, edge remainder filled with white.</li>
<li>gauss: Gaussian blur, maintain video aspect ratio, and use Gaussian blur filling for the rest of the edges.</li>
<li>smarttailor: intelligent cropping: smartly select video images to ensure proportional image cropping.</li>
Default value: black. 
     * @return FillType Filling method, when video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling modes:
<li> stretch: stretches each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li>black: Keep black, maintain video aspect ratio, edges filled with black.</li>
<li>White: Leave blank, maintain video aspect ratio, edge remainder filled with white.</li>
<li>gauss: Gaussian blur, maintain video aspect ratio, and use Gaussian blur filling for the rest of the edges.</li>
<li>smarttailor: intelligent cropping: smartly select video images to ensure proportional image cropping.</li>
Default value: black.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set Filling method, when video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling modes:
<li> stretch: stretches each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li>black: Keep black, maintain video aspect ratio, edges filled with black.</li>
<li>White: Leave blank, maintain video aspect ratio, edge remainder filled with white.</li>
<li>gauss: Gaussian blur, maintain video aspect ratio, and use Gaussian blur filling for the rest of the edges.</li>
<li>smarttailor: intelligent cropping: smartly select video images to ensure proportional image cropping.</li>
Default value: black.
     * @param FillType Filling method, when video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling modes:
<li> stretch: stretches each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li>black: Keep black, maintain video aspect ratio, edges filled with black.</li>
<li>White: Leave blank, maintain video aspect ratio, edge remainder filled with white.</li>
<li>gauss: Gaussian blur, maintain video aspect ratio, and use Gaussian blur filling for the rest of the edges.</li>
<li>smarttailor: intelligent cropping: smartly select video images to ensure proportional image cropping.</li>
Default value: black.
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    /**
     * Get Control factor for constant video bitrate. Value range: [0, 51]. If not specified, it means "auto". If there are no special requirements, it is advisable not to specify this parameter.
If Mode is set to VBR and Vcrf is configured, MPS processes video in VBR mode, taking into account both Vcrf and Bitrate parameter settings to balance video quality, bitrate, transcoding efficiency, and file size.
When Mode is set to CRF, the Bitrate setting will become invalid, and encoding will be performed based on the Vcrf value.
If Mode is set to ABR or CBR, the Vcrf value does not need to be configured. 
     * @return Vcrf Control factor for constant video bitrate. Value range: [0, 51]. If not specified, it means "auto". If there are no special requirements, it is advisable not to specify this parameter.
If Mode is set to VBR and Vcrf is configured, MPS processes video in VBR mode, taking into account both Vcrf and Bitrate parameter settings to balance video quality, bitrate, transcoding efficiency, and file size.
When Mode is set to CRF, the Bitrate setting will become invalid, and encoding will be performed based on the Vcrf value.
If Mode is set to ABR or CBR, the Vcrf value does not need to be configured.
     */
    public Long getVcrf() {
        return this.Vcrf;
    }

    /**
     * Set Control factor for constant video bitrate. Value range: [0, 51]. If not specified, it means "auto". If there are no special requirements, it is advisable not to specify this parameter.
If Mode is set to VBR and Vcrf is configured, MPS processes video in VBR mode, taking into account both Vcrf and Bitrate parameter settings to balance video quality, bitrate, transcoding efficiency, and file size.
When Mode is set to CRF, the Bitrate setting will become invalid, and encoding will be performed based on the Vcrf value.
If Mode is set to ABR or CBR, the Vcrf value does not need to be configured.
     * @param Vcrf Control factor for constant video bitrate. Value range: [0, 51]. If not specified, it means "auto". If there are no special requirements, it is advisable not to specify this parameter.
If Mode is set to VBR and Vcrf is configured, MPS processes video in VBR mode, taking into account both Vcrf and Bitrate parameter settings to balance video quality, bitrate, transcoding efficiency, and file size.
When Mode is set to CRF, the Bitrate setting will become invalid, and encoding will be performed based on the Vcrf value.
If Mode is set to ABR or CBR, the Vcrf value does not need to be configured.
     */
    public void setVcrf(Long Vcrf) {
        this.Vcrf = Vcrf;
    }

    /**
     * Get Average segment duration. Value range: (0-10], unit: second.
If not specified, it means auto. The appropriate segment duration will be automatically selected based on video features such as GOP. 
     * @return HlsTime Average segment duration. Value range: (0-10], unit: second.
If not specified, it means auto. The appropriate segment duration will be automatically selected based on video features such as GOP.
     */
    public Long getHlsTime() {
        return this.HlsTime;
    }

    /**
     * Set Average segment duration. Value range: (0-10], unit: second.
If not specified, it means auto. The appropriate segment duration will be automatically selected based on video features such as GOP.
     * @param HlsTime Average segment duration. Value range: (0-10], unit: second.
If not specified, it means auto. The appropriate segment duration will be automatically selected based on video features such as GOP.
     */
    public void setHlsTime(Long HlsTime) {
        this.HlsTime = HlsTime;
    }

    /**
     * Get hls fragment type. Available values:
<li>0: HLS+TS segment.</li>
<li>2:HLS+TS byte range</li>
<li>7: HLS+MP4 segment.</li>
<li>5:HLS+MP4 byte range</li>
Default value: 0
Note: This field is used for ordinary/TSC transcoding settings and does not take effect for adaptive bitrate streams. To configure the shard type for an adaptive bitrate stream, use the outer field. 
     * @return SegmentType hls fragment type. Available values:
<li>0: HLS+TS segment.</li>
<li>2:HLS+TS byte range</li>
<li>7: HLS+MP4 segment.</li>
<li>5:HLS+MP4 byte range</li>
Default value: 0
Note: This field is used for ordinary/TSC transcoding settings and does not take effect for adaptive bitrate streams. To configure the shard type for an adaptive bitrate stream, use the outer field.
     */
    public Long getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set hls fragment type. Available values:
<li>0: HLS+TS segment.</li>
<li>2:HLS+TS byte range</li>
<li>7: HLS+MP4 segment.</li>
<li>5:HLS+MP4 byte range</li>
Default value: 0
Note: This field is used for ordinary/TSC transcoding settings and does not take effect for adaptive bitrate streams. To configure the shard type for an adaptive bitrate stream, use the outer field.
     * @param SegmentType hls fragment type. Available values:
<li>0: HLS+TS segment.</li>
<li>2:HLS+TS byte range</li>
<li>7: HLS+MP4 segment.</li>
<li>5:HLS+MP4 byte range</li>
Default value: 0
Note: This field is used for ordinary/TSC transcoding settings and does not take effect for adaptive bitrate streams. To configure the shard type for an adaptive bitrate stream, use the outer field.
     */
    public void setSegmentType(Long SegmentType) {
        this.SegmentType = SegmentType;
    }

    /**
     * Get Denominator of the frame rate.
Note: The value must be greater than 0. 
     * @return FpsDenominator Denominator of the frame rate.
Note: The value must be greater than 0.
     */
    public Long getFpsDenominator() {
        return this.FpsDenominator;
    }

    /**
     * Set Denominator of the frame rate.
Note: The value must be greater than 0.
     * @param FpsDenominator Denominator of the frame rate.
Note: The value must be greater than 0.
     */
    public void setFpsDenominator(Long FpsDenominator) {
        this.FpsDenominator = FpsDenominator;
    }

    /**
     * Get 3D video splicing mode. It takes effect only for mv-hevc and 3D videos. Available values:
<li>side_by_side: left-right layout arrangement of the original video content.</li>
<li>top_bottom: top-bottom layout arrangement of the original video content.</li>
Billing will be based on the segmented resolution size to report usage and charges.
Default value: side_by_side. 
     * @return Stereo3dType 3D video splicing mode. It takes effect only for mv-hevc and 3D videos. Available values:
<li>side_by_side: left-right layout arrangement of the original video content.</li>
<li>top_bottom: top-bottom layout arrangement of the original video content.</li>
Billing will be based on the segmented resolution size to report usage and charges.
Default value: side_by_side.
     */
    public String getStereo3dType() {
        return this.Stereo3dType;
    }

    /**
     * Set 3D video splicing mode. It takes effect only for mv-hevc and 3D videos. Available values:
<li>side_by_side: left-right layout arrangement of the original video content.</li>
<li>top_bottom: top-bottom layout arrangement of the original video content.</li>
Billing will be based on the segmented resolution size to report usage and charges.
Default value: side_by_side.
     * @param Stereo3dType 3D video splicing mode. It takes effect only for mv-hevc and 3D videos. Available values:
<li>side_by_side: left-right layout arrangement of the original video content.</li>
<li>top_bottom: top-bottom layout arrangement of the original video content.</li>
Billing will be based on the segmented resolution size to report usage and charges.
Default value: side_by_side.
     */
    public void setStereo3dType(String Stereo3dType) {
        this.Stereo3dType = Stereo3dType;
    }

    /**
     * Get Profile, suitable for different scenarios.
baseline: It only supports I/P-frames and non-interlaced scenarios, and is suitable for scenarios such as video calls and mobile videos.
Main: Mainstream Profile, provides I-frames, P-frames, and B-frames, and supports both interlaced and non-interlaced modes. It is mainly used in mainstream audio and video consumption products such as video players and streaming media transmission devices.
high: Highest encoding level. It adds 8X8 prediction to Main Profile and supports custom quantization. It is widely used in Blu-ray storage, HDTV, and other scenarios.
default: automatic filling along with the original video.    

This configuration appears only when the encoding standard is set to H264. baseline/main/high is supported. Default value: default 
     * @return VideoProfile Profile, suitable for different scenarios.
baseline: It only supports I/P-frames and non-interlaced scenarios, and is suitable for scenarios such as video calls and mobile videos.
Main: Mainstream Profile, provides I-frames, P-frames, and B-frames, and supports both interlaced and non-interlaced modes. It is mainly used in mainstream audio and video consumption products such as video players and streaming media transmission devices.
high: Highest encoding level. It adds 8X8 prediction to Main Profile and supports custom quantization. It is widely used in Blu-ray storage, HDTV, and other scenarios.
default: automatic filling along with the original video.    

This configuration appears only when the encoding standard is set to H264. baseline/main/high is supported. Default value: default
     */
    public String getVideoProfile() {
        return this.VideoProfile;
    }

    /**
     * Set Profile, suitable for different scenarios.
baseline: It only supports I/P-frames and non-interlaced scenarios, and is suitable for scenarios such as video calls and mobile videos.
Main: Mainstream Profile, provides I-frames, P-frames, and B-frames, and supports both interlaced and non-interlaced modes. It is mainly used in mainstream audio and video consumption products such as video players and streaming media transmission devices.
high: Highest encoding level. It adds 8X8 prediction to Main Profile and supports custom quantization. It is widely used in Blu-ray storage, HDTV, and other scenarios.
default: automatic filling along with the original video.    

This configuration appears only when the encoding standard is set to H264. baseline/main/high is supported. Default value: default
     * @param VideoProfile Profile, suitable for different scenarios.
baseline: It only supports I/P-frames and non-interlaced scenarios, and is suitable for scenarios such as video calls and mobile videos.
Main: Mainstream Profile, provides I-frames, P-frames, and B-frames, and supports both interlaced and non-interlaced modes. It is mainly used in mainstream audio and video consumption products such as video players and streaming media transmission devices.
high: Highest encoding level. It adds 8X8 prediction to Main Profile and supports custom quantization. It is widely used in Blu-ray storage, HDTV, and other scenarios.
default: automatic filling along with the original video.    

This configuration appears only when the encoding standard is set to H264. baseline/main/high is supported. Default value: default
     */
    public void setVideoProfile(String VideoProfile) {
        this.VideoProfile = VideoProfile;
    }

    /**
     * Get Encoder level. Default value: auto ("")
If the encoding standard is set to H264, the following options are supported: "", 1, 1.1, 1.2, 1.3, 2, 2.1, 2.2, 3, 3.1, 3.2, 4, 4.1, 4.2, 5, and 5.1.
If the encoding standard is set to H265, the following options are supported: "", 1, 2, 2.1, 3, 3.1, 4, 4.1, 5, 5.1, 5.2, 6, 6.1, 6.2, and 8.5. 
     * @return VideoLevel Encoder level. Default value: auto ("")
If the encoding standard is set to H264, the following options are supported: "", 1, 1.1, 1.2, 1.3, 2, 2.1, 2.2, 3, 3.1, 3.2, 4, 4.1, 4.2, 5, and 5.1.
If the encoding standard is set to H265, the following options are supported: "", 1, 2, 2.1, 3, 3.1, 4, 4.1, 5, 5.1, 5.2, 6, 6.1, 6.2, and 8.5.
     */
    public String getVideoLevel() {
        return this.VideoLevel;
    }

    /**
     * Set Encoder level. Default value: auto ("")
If the encoding standard is set to H264, the following options are supported: "", 1, 1.1, 1.2, 1.3, 2, 2.1, 2.2, 3, 3.1, 3.2, 4, 4.1, 4.2, 5, and 5.1.
If the encoding standard is set to H265, the following options are supported: "", 1, 2, 2.1, 3, 3.1, 4, 4.1, 5, 5.1, 5.2, 6, 6.1, 6.2, and 8.5.
     * @param VideoLevel Encoder level. Default value: auto ("")
If the encoding standard is set to H264, the following options are supported: "", 1, 1.1, 1.2, 1.3, 2, 2.1, 2.2, 3, 3.1, 3.2, 4, 4.1, 4.2, 5, and 5.1.
If the encoding standard is set to H265, the following options are supported: "", 1, 2, 2.1, 3, 3.1, 4, 4.1, 5, 5.1, 5.2, 6, 6.1, 6.2, and 8.5.
     */
    public void setVideoLevel(String VideoLevel) {
        this.VideoLevel = VideoLevel;
    }

    /**
     * Get Number of B-frames between reference frames. The default is auto, and a range of 0 - 16 is supported.
Note: Leaving it blank means using the auto option. 
     * @return Bframes Number of B-frames between reference frames. The default is auto, and a range of 0 - 16 is supported.
Note: Leaving it blank means using the auto option.
     */
    public Long getBframes() {
        return this.Bframes;
    }

    /**
     * Set Number of B-frames between reference frames. The default is auto, and a range of 0 - 16 is supported.
Note: Leaving it blank means using the auto option.
     * @param Bframes Number of B-frames between reference frames. The default is auto, and a range of 0 - 16 is supported.
Note: Leaving it blank means using the auto option.
     */
    public void setBframes(Long Bframes) {
        this.Bframes = Bframes;
    }

    /**
     * Get Bitrate control mode. Available values:
VBR (Variable Bit Rate): adjust the output bitrate based on the complexity of the video image to ensure higher image quality. It is suitable for storage scenarios and applications with high image quality requirements.
ABR (Average Bit Rate): Try to keep the average bitrate of the output video stable as much as possible, but allow short-term bitrate fluctuation. It is suitable for scenarios where the overall bitrate needs to be minimized while maintaining a certain image quality.
CBR (Constant Bit Rate): maintains a constant output bitrate during video encoding, regardless of image complexity changes. It is suitable for scenarios with strict network bandwidth requirements, such as live streaming.
VCRF (Constant Rate Factor): A constant quality factor. It controls video quality by setting a quality factor to achieve constant quality encoding of videos. The bitrate is automatically adjusted based on content complexity, making it suitable for scenarios where maintaining a certain quality is desired.
VBR is selected by default. 
     * @return Mode Bitrate control mode. Available values:
VBR (Variable Bit Rate): adjust the output bitrate based on the complexity of the video image to ensure higher image quality. It is suitable for storage scenarios and applications with high image quality requirements.
ABR (Average Bit Rate): Try to keep the average bitrate of the output video stable as much as possible, but allow short-term bitrate fluctuation. It is suitable for scenarios where the overall bitrate needs to be minimized while maintaining a certain image quality.
CBR (Constant Bit Rate): maintains a constant output bitrate during video encoding, regardless of image complexity changes. It is suitable for scenarios with strict network bandwidth requirements, such as live streaming.
VCRF (Constant Rate Factor): A constant quality factor. It controls video quality by setting a quality factor to achieve constant quality encoding of videos. The bitrate is automatically adjusted based on content complexity, making it suitable for scenarios where maintaining a certain quality is desired.
VBR is selected by default.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Bitrate control mode. Available values:
VBR (Variable Bit Rate): adjust the output bitrate based on the complexity of the video image to ensure higher image quality. It is suitable for storage scenarios and applications with high image quality requirements.
ABR (Average Bit Rate): Try to keep the average bitrate of the output video stable as much as possible, but allow short-term bitrate fluctuation. It is suitable for scenarios where the overall bitrate needs to be minimized while maintaining a certain image quality.
CBR (Constant Bit Rate): maintains a constant output bitrate during video encoding, regardless of image complexity changes. It is suitable for scenarios with strict network bandwidth requirements, such as live streaming.
VCRF (Constant Rate Factor): A constant quality factor. It controls video quality by setting a quality factor to achieve constant quality encoding of videos. The bitrate is automatically adjusted based on content complexity, making it suitable for scenarios where maintaining a certain quality is desired.
VBR is selected by default.
     * @param Mode Bitrate control mode. Available values:
VBR (Variable Bit Rate): adjust the output bitrate based on the complexity of the video image to ensure higher image quality. It is suitable for storage scenarios and applications with high image quality requirements.
ABR (Average Bit Rate): Try to keep the average bitrate of the output video stable as much as possible, but allow short-term bitrate fluctuation. It is suitable for scenarios where the overall bitrate needs to be minimized while maintaining a certain image quality.
CBR (Constant Bit Rate): maintains a constant output bitrate during video encoding, regardless of image complexity changes. It is suitable for scenarios with strict network bandwidth requirements, such as live streaming.
VCRF (Constant Rate Factor): A constant quality factor. It controls video quality by setting a quality factor to achieve constant quality encoding of videos. The bitrate is automatically adjusted based on content complexity, making it suitable for scenarios where maintaining a certain quality is desired.
VBR is selected by default.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Display aspect ratio. Optional values: [1:1, 2:1, default]
Default value: default 
     * @return Sar Display aspect ratio. Optional values: [1:1, 2:1, default]
Default value: default
     */
    public String getSar() {
        return this.Sar;
    }

    /**
     * Set Display aspect ratio. Optional values: [1:1, 2:1, default]
Default value: default
     * @param Sar Display aspect ratio. Optional values: [1:1, 2:1, default]
Default value: default
     */
    public void setSar(String Sar) {
        this.Sar = Sar;
    }

    /**
     * Get Adaptive I-frame decision. When it is enabled, Media Processing Service will automatically identify transition points between different scenarios in the video (usually they are visually distinct frames, such as those of switching from one shot to another) and adaptively insert keyframes (I-frames) at these points to improve the random accessibility and encoding efficiency of the video. Available values:
0: Disable adaptive I-frame decision 
1: Enable the adaptive I-frame decision
Default value: 0 
     * @return NoScenecut Adaptive I-frame decision. When it is enabled, Media Processing Service will automatically identify transition points between different scenarios in the video (usually they are visually distinct frames, such as those of switching from one shot to another) and adaptively insert keyframes (I-frames) at these points to improve the random accessibility and encoding efficiency of the video. Available values:
0: Disable adaptive I-frame decision 
1: Enable the adaptive I-frame decision
Default value: 0
     */
    public Long getNoScenecut() {
        return this.NoScenecut;
    }

    /**
     * Set Adaptive I-frame decision. When it is enabled, Media Processing Service will automatically identify transition points between different scenarios in the video (usually they are visually distinct frames, such as those of switching from one shot to another) and adaptively insert keyframes (I-frames) at these points to improve the random accessibility and encoding efficiency of the video. Available values:
0: Disable adaptive I-frame decision 
1: Enable the adaptive I-frame decision
Default value: 0
     * @param NoScenecut Adaptive I-frame decision. When it is enabled, Media Processing Service will automatically identify transition points between different scenarios in the video (usually they are visually distinct frames, such as those of switching from one shot to another) and adaptively insert keyframes (I-frames) at these points to improve the random accessibility and encoding efficiency of the video. Available values:
0: Disable adaptive I-frame decision 
1: Enable the adaptive I-frame decision
Default value: 0
     */
    public void setNoScenecut(Long NoScenecut) {
        this.NoScenecut = NoScenecut;
    }

    /**
     * Get Bit: 8/10 is supported. Default value: 8 
     * @return BitDepth Bit: 8/10 is supported. Default value: 8
     */
    public Long getBitDepth() {
        return this.BitDepth;
    }

    /**
     * Set Bit: 8/10 is supported. Default value: 8
     * @param BitDepth Bit: 8/10 is supported. Default value: 8
     */
    public void setBitDepth(Long BitDepth) {
        this.BitDepth = BitDepth;
    }

    /**
     * Get Preserve original timestamp. Optional values:
0: Disabled
1: Indicates open
Default value: Disabled 
     * @return RawPts Preserve original timestamp. Optional values:
0: Disabled
1: Indicates open
Default value: Disabled
     */
    public Long getRawPts() {
        return this.RawPts;
    }

    /**
     * Set Preserve original timestamp. Optional values:
0: Disabled
1: Indicates open
Default value: Disabled
     * @param RawPts Preserve original timestamp. Optional values:
0: Disabled
1: Indicates open
Default value: Disabled
     */
    public void setRawPts(Long RawPts) {
        this.RawPts = RawPts;
    }

    /**
     * Get Proportional compression bitrate. When enabled, the output video's bitrate is adjusted according to the proportion. After the compression ratio is entered, the system automatically calculates the target output bitrate based on the source video bitrate. Compression ratio range: 0-100
Leaving this value blank means it is not enabled by default. 
     * @return Compress Proportional compression bitrate. When enabled, the output video's bitrate is adjusted according to the proportion. After the compression ratio is entered, the system automatically calculates the target output bitrate based on the source video bitrate. Compression ratio range: 0-100
Leaving this value blank means it is not enabled by default.
     */
    public Long getCompress() {
        return this.Compress;
    }

    /**
     * Set Proportional compression bitrate. When enabled, the output video's bitrate is adjusted according to the proportion. After the compression ratio is entered, the system automatically calculates the target output bitrate based on the source video bitrate. Compression ratio range: 0-100
Leaving this value blank means it is not enabled by default.
     * @param Compress Proportional compression bitrate. When enabled, the output video's bitrate is adjusted according to the proportion. After the compression ratio is entered, the system automatically calculates the target output bitrate based on the source video bitrate. Compression ratio range: 0-100
Leaving this value blank means it is not enabled by default.
     */
    public void setCompress(Long Compress) {
        this.Compress = Compress;
    }

    /**
     * Get Segment duration at startup 
     * @return SegmentSpecificInfo Segment duration at startup
     */
    public SegmentSpecificInfo getSegmentSpecificInfo() {
        return this.SegmentSpecificInfo;
    }

    /**
     * Set Segment duration at startup
     * @param SegmentSpecificInfo Segment duration at startup
     */
    public void setSegmentSpecificInfo(SegmentSpecificInfo SegmentSpecificInfo) {
        this.SegmentSpecificInfo = SegmentSpecificInfo;
    }

    /**
     * Get Whether to enable scenario-based settings for the template 
0: disable 
1: enable 
Default value: 0	
Note: The values of the SceneType and CompressType fields are effective only when the value of this field is 1. 
     * @return ScenarioBased Whether to enable scenario-based settings for the template 
0: disable 
1: enable 
Default value: 0	
Note: The values of the SceneType and CompressType fields are effective only when the value of this field is 1.
     */
    public Long getScenarioBased() {
        return this.ScenarioBased;
    }

    /**
     * Set Whether to enable scenario-based settings for the template 
0: disable 
1: enable 
Default value: 0	
Note: The values of the SceneType and CompressType fields are effective only when the value of this field is 1.
     * @param ScenarioBased Whether to enable scenario-based settings for the template 
0: disable 
1: enable 
Default value: 0	
Note: The values of the SceneType and CompressType fields are effective only when the value of this field is 1.
     */
    public void setScenarioBased(Long ScenarioBased) {
        this.ScenarioBased = ScenarioBased;
    }

    /**
     * Get Video scenario. Optional values: 
normal: General transcoding scenario: General transcoding and compression scenario.
pgc: PGC HD TV shows and movies: At the time of compression, focus is placed on the viewing experience of TV shows and movies and ROI encoding is performed according to their characteristics, while high-quality contents of videos and audio are retained. 
materials_video: HD materials: Scenario involving material resources, where requirements for image quality are extremely high and there are many transparent images, with almost no visual loss during compression. 
ugc: UGC content: It is suitable for a wide range of UGC/short video scenarios, with an optimized encoding bitrate for short video characteristics, improved image quality, and enhanced business QOS/QOE metrics. 
e-commerce_video: Fashion show/e-commerce: During compression, emphasis is placed on detail clarity and ROI enhancement, with a particular focus on maintaining the image quality of the face region. 
educational_video: Education: At the time of compression, emphasis is placed on the clarity and readability of text and images to help students better understand the content, ensuring that the teaching content is clearly conveyed. 
Default value: normal.
Note: To use this value, the value of ScenarioBased must be 1. Otherwise, this value does not take effect. 
     * @return SceneType Video scenario. Optional values: 
normal: General transcoding scenario: General transcoding and compression scenario.
pgc: PGC HD TV shows and movies: At the time of compression, focus is placed on the viewing experience of TV shows and movies and ROI encoding is performed according to their characteristics, while high-quality contents of videos and audio are retained. 
materials_video: HD materials: Scenario involving material resources, where requirements for image quality are extremely high and there are many transparent images, with almost no visual loss during compression. 
ugc: UGC content: It is suitable for a wide range of UGC/short video scenarios, with an optimized encoding bitrate for short video characteristics, improved image quality, and enhanced business QOS/QOE metrics. 
e-commerce_video: Fashion show/e-commerce: During compression, emphasis is placed on detail clarity and ROI enhancement, with a particular focus on maintaining the image quality of the face region. 
educational_video: Education: At the time of compression, emphasis is placed on the clarity and readability of text and images to help students better understand the content, ensuring that the teaching content is clearly conveyed. 
Default value: normal.
Note: To use this value, the value of ScenarioBased must be 1. Otherwise, this value does not take effect.
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set Video scenario. Optional values: 
normal: General transcoding scenario: General transcoding and compression scenario.
pgc: PGC HD TV shows and movies: At the time of compression, focus is placed on the viewing experience of TV shows and movies and ROI encoding is performed according to their characteristics, while high-quality contents of videos and audio are retained. 
materials_video: HD materials: Scenario involving material resources, where requirements for image quality are extremely high and there are many transparent images, with almost no visual loss during compression. 
ugc: UGC content: It is suitable for a wide range of UGC/short video scenarios, with an optimized encoding bitrate for short video characteristics, improved image quality, and enhanced business QOS/QOE metrics. 
e-commerce_video: Fashion show/e-commerce: During compression, emphasis is placed on detail clarity and ROI enhancement, with a particular focus on maintaining the image quality of the face region. 
educational_video: Education: At the time of compression, emphasis is placed on the clarity and readability of text and images to help students better understand the content, ensuring that the teaching content is clearly conveyed. 
Default value: normal.
Note: To use this value, the value of ScenarioBased must be 1. Otherwise, this value does not take effect.
     * @param SceneType Video scenario. Optional values: 
normal: General transcoding scenario: General transcoding and compression scenario.
pgc: PGC HD TV shows and movies: At the time of compression, focus is placed on the viewing experience of TV shows and movies and ROI encoding is performed according to their characteristics, while high-quality contents of videos and audio are retained. 
materials_video: HD materials: Scenario involving material resources, where requirements for image quality are extremely high and there are many transparent images, with almost no visual loss during compression. 
ugc: UGC content: It is suitable for a wide range of UGC/short video scenarios, with an optimized encoding bitrate for short video characteristics, improved image quality, and enhanced business QOS/QOE metrics. 
e-commerce_video: Fashion show/e-commerce: During compression, emphasis is placed on detail clarity and ROI enhancement, with a particular focus on maintaining the image quality of the face region. 
educational_video: Education: At the time of compression, emphasis is placed on the clarity and readability of text and images to help students better understand the content, ensuring that the teaching content is clearly conveyed. 
Default value: normal.
Note: To use this value, the value of ScenarioBased must be 1. Otherwise, this value does not take effect.
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get Transcoding policy. Optional values: 
ultra_compress: Extreme compression: Compared to standard compression, this policy can maximize bitrate compression while ensuring a certain level of image quality, thus greatly saving bandwidth and storage costs. 
standard_compress: Comprehensively optimal: The compression ratio and image quality are balanced, and files are compressed as much as possible without a noticeable reduction in subjective image quality. Only audio and video TSC transcoding fees are charged for this policy. 
high_compress: Bitrate priority: Priority is given to reducing file size, which may result in certain image quality loss. Only audio and video TSC transcoding fees are charged for this policy. 
low_compress: Image quality priority: Priority is given to ensuring image quality, and the size of compressed files may be relatively large. Only audio and video TSC transcoding fees are charged for this policy. 
Default value: standard_compress. 
Note: The ultra_compress policy is not recommended for use if you need to watch videos on TV. The billing standard for the ultra_compress policy is TSC transcoding + audio/video enhancement-artifacts removal.
Note: To use this value, the value of ScenarioBased must be 1. Otherwise, this value does not take effect. 
     * @return CompressType Transcoding policy. Optional values: 
ultra_compress: Extreme compression: Compared to standard compression, this policy can maximize bitrate compression while ensuring a certain level of image quality, thus greatly saving bandwidth and storage costs. 
standard_compress: Comprehensively optimal: The compression ratio and image quality are balanced, and files are compressed as much as possible without a noticeable reduction in subjective image quality. Only audio and video TSC transcoding fees are charged for this policy. 
high_compress: Bitrate priority: Priority is given to reducing file size, which may result in certain image quality loss. Only audio and video TSC transcoding fees are charged for this policy. 
low_compress: Image quality priority: Priority is given to ensuring image quality, and the size of compressed files may be relatively large. Only audio and video TSC transcoding fees are charged for this policy. 
Default value: standard_compress. 
Note: The ultra_compress policy is not recommended for use if you need to watch videos on TV. The billing standard for the ultra_compress policy is TSC transcoding + audio/video enhancement-artifacts removal.
Note: To use this value, the value of ScenarioBased must be 1. Otherwise, this value does not take effect.
     */
    public String getCompressType() {
        return this.CompressType;
    }

    /**
     * Set Transcoding policy. Optional values: 
ultra_compress: Extreme compression: Compared to standard compression, this policy can maximize bitrate compression while ensuring a certain level of image quality, thus greatly saving bandwidth and storage costs. 
standard_compress: Comprehensively optimal: The compression ratio and image quality are balanced, and files are compressed as much as possible without a noticeable reduction in subjective image quality. Only audio and video TSC transcoding fees are charged for this policy. 
high_compress: Bitrate priority: Priority is given to reducing file size, which may result in certain image quality loss. Only audio and video TSC transcoding fees are charged for this policy. 
low_compress: Image quality priority: Priority is given to ensuring image quality, and the size of compressed files may be relatively large. Only audio and video TSC transcoding fees are charged for this policy. 
Default value: standard_compress. 
Note: The ultra_compress policy is not recommended for use if you need to watch videos on TV. The billing standard for the ultra_compress policy is TSC transcoding + audio/video enhancement-artifacts removal.
Note: To use this value, the value of ScenarioBased must be 1. Otherwise, this value does not take effect.
     * @param CompressType Transcoding policy. Optional values: 
ultra_compress: Extreme compression: Compared to standard compression, this policy can maximize bitrate compression while ensuring a certain level of image quality, thus greatly saving bandwidth and storage costs. 
standard_compress: Comprehensively optimal: The compression ratio and image quality are balanced, and files are compressed as much as possible without a noticeable reduction in subjective image quality. Only audio and video TSC transcoding fees are charged for this policy. 
high_compress: Bitrate priority: Priority is given to reducing file size, which may result in certain image quality loss. Only audio and video TSC transcoding fees are charged for this policy. 
low_compress: Image quality priority: Priority is given to ensuring image quality, and the size of compressed files may be relatively large. Only audio and video TSC transcoding fees are charged for this policy. 
Default value: standard_compress. 
Note: The ultra_compress policy is not recommended for use if you need to watch videos on TV. The billing standard for the ultra_compress policy is TSC transcoding + audio/video enhancement-artifacts removal.
Note: To use this value, the value of ScenarioBased must be 1. Otherwise, this value does not take effect.
     */
    public void setCompressType(String CompressType) {
        this.CompressType = CompressType;
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
        if (source.ScenarioBased != null) {
            this.ScenarioBased = new Long(source.ScenarioBased);
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.CompressType != null) {
            this.CompressType = new String(source.CompressType);
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
        this.setParamSimple(map, prefix + "ScenarioBased", this.ScenarioBased);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "CompressType", this.CompressType);

    }
}

