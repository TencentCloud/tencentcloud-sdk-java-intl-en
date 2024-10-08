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
    * Video stream encoding format. Valid values:
<li>h264: H.264 encoding.</li>
<li>h265: H.265 encoding.</li>
<li>h266: H.266 encoding.</li>
<li>av1: AOMedia Video 1 encoding.</li>
<li>vp8: VP8 encoding.</li>
<li>vp9: VP9 encoding.</li>
<li>mpeg2: MPEG2 encoding.</li>
<li>dnxhd: DNxHD encoding.</li>
<li>mv-hevc: MV-HEVC encoding.</li>
Note: A resolution within 640x480 should be specified for H.265 encoding.

Note: AV1 encoding containers only support mp4, webm, and mkv.
Note: H.266 encoding containers only support mp4, hls, ts, and mov.
Note: VP8 and VP9 encoding containers only support webm and mkv.
Note: MPEG2 and DNxHD encoding containers only support mxf.
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
    * Interval between I-frames, in frames. Value range: 0 and [1, 100000]. When it is set to 0 or not set, the system will automatically set the gop length.
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * The fill mode, which indicates how a video is resized when the video’s original aspect ratio is different from the target aspect ratio. Valid values:
<li>stretch: Stretch the image frame by frame to fill the entire screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>black: Keep the image's original aspect ratio and fill the blank space with black bars.</li>
<li>white: Keep the image’s original aspect ratio and fill the blank space with white bars.</li>
<li>gauss: Keep the image’s original aspect ratio and apply Gaussian blur to the blank space.</li>
Default value: black.
Note: Only `stretch` and `black` are supported for adaptive bitrate streaming.
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
    * The control factor of video constant bitrate. Value range: [1, 51]
If this parameter is specified, CRF (a bitrate control method) will be used for transcoding. (Video bitrate will no longer take effect.)
It is not recommended to specify this parameter if there are no special requirements.
    */
    @SerializedName("Vcrf")
    @Expose
    private Long Vcrf;

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
     * Get Video stream encoding format. Valid values:
<li>h264: H.264 encoding.</li>
<li>h265: H.265 encoding.</li>
<li>h266: H.266 encoding.</li>
<li>av1: AOMedia Video 1 encoding.</li>
<li>vp8: VP8 encoding.</li>
<li>vp9: VP9 encoding.</li>
<li>mpeg2: MPEG2 encoding.</li>
<li>dnxhd: DNxHD encoding.</li>
<li>mv-hevc: MV-HEVC encoding.</li>
Note: A resolution within 640x480 should be specified for H.265 encoding.

Note: AV1 encoding containers only support mp4, webm, and mkv.
Note: H.266 encoding containers only support mp4, hls, ts, and mov.
Note: VP8 and VP9 encoding containers only support webm and mkv.
Note: MPEG2 and DNxHD encoding containers only support mxf.
Note: MV-HEVC encoding containers only support mp4, hls, and mov. Among them, the hls format only supports mp4 segmentation format. 
     * @return Codec Video stream encoding format. Valid values:
<li>h264: H.264 encoding.</li>
<li>h265: H.265 encoding.</li>
<li>h266: H.266 encoding.</li>
<li>av1: AOMedia Video 1 encoding.</li>
<li>vp8: VP8 encoding.</li>
<li>vp9: VP9 encoding.</li>
<li>mpeg2: MPEG2 encoding.</li>
<li>dnxhd: DNxHD encoding.</li>
<li>mv-hevc: MV-HEVC encoding.</li>
Note: A resolution within 640x480 should be specified for H.265 encoding.

Note: AV1 encoding containers only support mp4, webm, and mkv.
Note: H.266 encoding containers only support mp4, hls, ts, and mov.
Note: VP8 and VP9 encoding containers only support webm and mkv.
Note: MPEG2 and DNxHD encoding containers only support mxf.
Note: MV-HEVC encoding containers only support mp4, hls, and mov. Among them, the hls format only supports mp4 segmentation format.
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Video stream encoding format. Valid values:
<li>h264: H.264 encoding.</li>
<li>h265: H.265 encoding.</li>
<li>h266: H.266 encoding.</li>
<li>av1: AOMedia Video 1 encoding.</li>
<li>vp8: VP8 encoding.</li>
<li>vp9: VP9 encoding.</li>
<li>mpeg2: MPEG2 encoding.</li>
<li>dnxhd: DNxHD encoding.</li>
<li>mv-hevc: MV-HEVC encoding.</li>
Note: A resolution within 640x480 should be specified for H.265 encoding.

Note: AV1 encoding containers only support mp4, webm, and mkv.
Note: H.266 encoding containers only support mp4, hls, ts, and mov.
Note: VP8 and VP9 encoding containers only support webm and mkv.
Note: MPEG2 and DNxHD encoding containers only support mxf.
Note: MV-HEVC encoding containers only support mp4, hls, and mov. Among them, the hls format only supports mp4 segmentation format.
     * @param Codec Video stream encoding format. Valid values:
<li>h264: H.264 encoding.</li>
<li>h265: H.265 encoding.</li>
<li>h266: H.266 encoding.</li>
<li>av1: AOMedia Video 1 encoding.</li>
<li>vp8: VP8 encoding.</li>
<li>vp9: VP9 encoding.</li>
<li>mpeg2: MPEG2 encoding.</li>
<li>dnxhd: DNxHD encoding.</li>
<li>mv-hevc: MV-HEVC encoding.</li>
Note: A resolution within 640x480 should be specified for H.265 encoding.

Note: AV1 encoding containers only support mp4, webm, and mkv.
Note: H.266 encoding containers only support mp4, hls, ts, and mov.
Note: VP8 and VP9 encoding containers only support webm and mkv.
Note: MPEG2 and DNxHD encoding containers only support mxf.
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
     * Get Interval between I-frames, in frames. Value range: 0 and [1, 100000]. When it is set to 0 or not set, the system will automatically set the gop length. 
     * @return Gop Interval between I-frames, in frames. Value range: 0 and [1, 100000]. When it is set to 0 or not set, the system will automatically set the gop length.
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set Interval between I-frames, in frames. Value range: 0 and [1, 100000]. When it is set to 0 or not set, the system will automatically set the gop length.
     * @param Gop Interval between I-frames, in frames. Value range: 0 and [1, 100000]. When it is set to 0 or not set, the system will automatically set the gop length.
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get The fill mode, which indicates how a video is resized when the video’s original aspect ratio is different from the target aspect ratio. Valid values:
<li>stretch: Stretch the image frame by frame to fill the entire screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>black: Keep the image's original aspect ratio and fill the blank space with black bars.</li>
<li>white: Keep the image’s original aspect ratio and fill the blank space with white bars.</li>
<li>gauss: Keep the image’s original aspect ratio and apply Gaussian blur to the blank space.</li>
Default value: black.
Note: Only `stretch` and `black` are supported for adaptive bitrate streaming. 
     * @return FillType The fill mode, which indicates how a video is resized when the video’s original aspect ratio is different from the target aspect ratio. Valid values:
<li>stretch: Stretch the image frame by frame to fill the entire screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>black: Keep the image's original aspect ratio and fill the blank space with black bars.</li>
<li>white: Keep the image’s original aspect ratio and fill the blank space with white bars.</li>
<li>gauss: Keep the image’s original aspect ratio and apply Gaussian blur to the blank space.</li>
Default value: black.
Note: Only `stretch` and `black` are supported for adaptive bitrate streaming.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set The fill mode, which indicates how a video is resized when the video’s original aspect ratio is different from the target aspect ratio. Valid values:
<li>stretch: Stretch the image frame by frame to fill the entire screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>black: Keep the image's original aspect ratio and fill the blank space with black bars.</li>
<li>white: Keep the image’s original aspect ratio and fill the blank space with white bars.</li>
<li>gauss: Keep the image’s original aspect ratio and apply Gaussian blur to the blank space.</li>
Default value: black.
Note: Only `stretch` and `black` are supported for adaptive bitrate streaming.
     * @param FillType The fill mode, which indicates how a video is resized when the video’s original aspect ratio is different from the target aspect ratio. Valid values:
<li>stretch: Stretch the image frame by frame to fill the entire screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>black: Keep the image's original aspect ratio and fill the blank space with black bars.</li>
<li>white: Keep the image’s original aspect ratio and fill the blank space with white bars.</li>
<li>gauss: Keep the image’s original aspect ratio and apply Gaussian blur to the blank space.</li>
Default value: black.
Note: Only `stretch` and `black` are supported for adaptive bitrate streaming.
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    /**
     * Get The control factor of video constant bitrate. Value range: [1, 51]
If this parameter is specified, CRF (a bitrate control method) will be used for transcoding. (Video bitrate will no longer take effect.)
It is not recommended to specify this parameter if there are no special requirements. 
     * @return Vcrf The control factor of video constant bitrate. Value range: [1, 51]
If this parameter is specified, CRF (a bitrate control method) will be used for transcoding. (Video bitrate will no longer take effect.)
It is not recommended to specify this parameter if there are no special requirements.
     */
    public Long getVcrf() {
        return this.Vcrf;
    }

    /**
     * Set The control factor of video constant bitrate. Value range: [1, 51]
If this parameter is specified, CRF (a bitrate control method) will be used for transcoding. (Video bitrate will no longer take effect.)
It is not recommended to specify this parameter if there are no special requirements.
     * @param Vcrf The control factor of video constant bitrate. Value range: [1, 51]
If this parameter is specified, CRF (a bitrate control method) will be used for transcoding. (Video bitrate will no longer take effect.)
It is not recommended to specify this parameter if there are no special requirements.
     */
    public void setVcrf(Long Vcrf) {
        this.Vcrf = Vcrf;
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
        if (source.FillType != null) {
            this.FillType = new String(source.FillType);
        }
        if (source.Vcrf != null) {
            this.Vcrf = new Long(source.Vcrf);
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
        this.setParamSimple(map, prefix + "FillType", this.FillType);
        this.setParamSimple(map, prefix + "Vcrf", this.Vcrf);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);
        this.setParamSimple(map, prefix + "FpsDenominator", this.FpsDenominator);
        this.setParamSimple(map, prefix + "Stereo3dType", this.Stereo3dType);

    }
}

