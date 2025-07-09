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

public class QualityControlItemConfig extends AbstractModel {

    /**
    * Quality control item name. The quality control item values are as follows:
<li>LowEvaluation: No reference score.</li>
<li>Mosaic: Mosaic detection.</li>
<li>CrashScreen: Screen crash detection.</li>
<li>Blur: Blur detection.</li>
<li>BlackWhiteEdge: Black and white edge detection.</li>
<li>SolidColorScreen: Solid color screen detection.</li>
<li>LowLighting: Low lighting.</li>
<li>HighLighting: Overexposure.</li>
<li>NoVoice: Silence detection.</li>
<li>LowVoice: Low voice detection.</li>
<li>HighVoice: High voice detection.</li>
<li>Jitter: Jitter detection.</li>
<li>Noise: Noise detection.</li>
<li>QRCode: QR code detection.</li>
<li>BarCode: Barcode detection.</li>
<li>AppletCode: Applet code detection.</li>
<li>VideoResolutionChanged: The video resolution changed.</li>
<li>AudioSampleRateChanged: The audio sampling rate changed.</li>
<li>AudioChannelsChanged: The audio channel count changed.</li>
<li>ParameterSetsChanged: The stream parameter set information changed.</li>
<li>DarOrSarInvalid: Abnormal video aspect ratio.</li>
<li>TimestampFallback: DTS timestamp fallback.</li>
<li>DtsJitter: Excessive DTS jitter.</li>
<li>PtsJitter: Excessive PTS jitter.</li>
<li>AACDurationDeviation: Unreasonable AAC frame timestamp interval.</li>
<li>AudioDroppingFrames: Audio frame loss.</li>
<li>VideoDroppingFrames: Video frame loss.</li>
<li>AVTimestampInterleave: Unreasonable audio and video interleaving.</li>
<li>PtsLessThanDts: The PTS of media streams is less than DTS.</li>
<li>ReceiveFpsJitter: Excessive jitter of the frame rate received by the network.</li>
<li>ReceiveFpsTooSmall: Too low video frame rate received by the network.</li>
<li>FpsJitter: Excessive stream frame rate jitter calculated through PTS.</li>
<li>StreamOpenFailed: Stream opening failed.</li>
<li>StreamEnd: The stream ended.</li>
<li>StreamParseFailed: Stream parsing failed.</li>
<li>VideoFirstFrameNotIdr: The first frame is not an IDR frame.</li>
<li>StreamNALUError: NALU start code error.</li>
<li>TsStreamNoAud: The H26x stream of MPEGTS lacks AUD NALU.</li>
<li>AudioStreamLack: No audio stream.</li>
<li>VideoStreamLack: No video stream.</li>
<li>LackAudioRecover: Lack of audio stream recovery.</li>
<li>LackVideoRecover: Lack of video stream recovery.</li>
<li>VideoBitrateOutofRange: Out-of-range video stream bitrate (kbps).</li>
<li>AudioBitrateOutofRange: Out-of-range audio stream bitrate (kbps).</li>
<li>VideoDecodeFailed: Video decoding error.</li>
<li>AudioDecodeFailed: Audio decoding error.</li>
<li>AudioOutOfPhase: Opposite phase in Dual-channel audio.</li>
<li>VideoDuplicatedFrame: Duplicate frames in the video stream.</li>
<li>AudioDuplicatedFrame: Duplicate frames in the audio stream.</li>
<li>VideoRotation: Video image rotation.</li>
<li>TsMultiPrograms: The MPEG2-TS stream has multiple programs.</li>
<li>Mp4InvalidCodecFourcc: The codec fourcc in MP4 does not meet Apple HLS requirements.</li>
<li>HLSBadM3u8Format: Invalid m3u8 file.</li>
<li>HLSInvalidMasterM3u8: Invalid main m3u8 file.</li>
<li>HLSInvalidMediaM3u8: Invalid media m3u8 file.</li>
<li>HLSMasterM3u8Recommended: The main m3u8 file lacks parameters recommended by the standard.</li>
<li>HLSMediaM3u8Recommended: The media m3u8 file lacks parameters recommended by the standard.</li>
<li>HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY exists in the media m3u8 file.</li>
<li>HLSMediaSegmentsStreamNumChange: The number of streams in the segment has changed.</li>
<li>HLSMediaSegmentsPTSJitterDeviation: PTS jitter between segments without EXT-X-DISCONTINUITY.</li>
<li>HLSMediaSegmentsDTSJitterDeviation: DTS jitter between segments without EXT-X-DISCONTINUITY.</li>
<li>TimecodeTrackExist: TMCD track in MP4.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Capability configuration switch. Valid values:
<li>ON: enabled;</li>
<li>OFF: disabled.</li>

Default value: ON.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Sampling method, Valid value:
- Time: sampling based on time interval.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sampling")
    @Expose
    private String Sampling;

    /**
    * Sampling interval time, in ms.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * Duration of abnormality, in ms.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Threshold of a detection item. Different detection items have different thresholds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Threshold")
    @Expose
    private String Threshold;

    /**
     * Get Quality control item name. The quality control item values are as follows:
<li>LowEvaluation: No reference score.</li>
<li>Mosaic: Mosaic detection.</li>
<li>CrashScreen: Screen crash detection.</li>
<li>Blur: Blur detection.</li>
<li>BlackWhiteEdge: Black and white edge detection.</li>
<li>SolidColorScreen: Solid color screen detection.</li>
<li>LowLighting: Low lighting.</li>
<li>HighLighting: Overexposure.</li>
<li>NoVoice: Silence detection.</li>
<li>LowVoice: Low voice detection.</li>
<li>HighVoice: High voice detection.</li>
<li>Jitter: Jitter detection.</li>
<li>Noise: Noise detection.</li>
<li>QRCode: QR code detection.</li>
<li>BarCode: Barcode detection.</li>
<li>AppletCode: Applet code detection.</li>
<li>VideoResolutionChanged: The video resolution changed.</li>
<li>AudioSampleRateChanged: The audio sampling rate changed.</li>
<li>AudioChannelsChanged: The audio channel count changed.</li>
<li>ParameterSetsChanged: The stream parameter set information changed.</li>
<li>DarOrSarInvalid: Abnormal video aspect ratio.</li>
<li>TimestampFallback: DTS timestamp fallback.</li>
<li>DtsJitter: Excessive DTS jitter.</li>
<li>PtsJitter: Excessive PTS jitter.</li>
<li>AACDurationDeviation: Unreasonable AAC frame timestamp interval.</li>
<li>AudioDroppingFrames: Audio frame loss.</li>
<li>VideoDroppingFrames: Video frame loss.</li>
<li>AVTimestampInterleave: Unreasonable audio and video interleaving.</li>
<li>PtsLessThanDts: The PTS of media streams is less than DTS.</li>
<li>ReceiveFpsJitter: Excessive jitter of the frame rate received by the network.</li>
<li>ReceiveFpsTooSmall: Too low video frame rate received by the network.</li>
<li>FpsJitter: Excessive stream frame rate jitter calculated through PTS.</li>
<li>StreamOpenFailed: Stream opening failed.</li>
<li>StreamEnd: The stream ended.</li>
<li>StreamParseFailed: Stream parsing failed.</li>
<li>VideoFirstFrameNotIdr: The first frame is not an IDR frame.</li>
<li>StreamNALUError: NALU start code error.</li>
<li>TsStreamNoAud: The H26x stream of MPEGTS lacks AUD NALU.</li>
<li>AudioStreamLack: No audio stream.</li>
<li>VideoStreamLack: No video stream.</li>
<li>LackAudioRecover: Lack of audio stream recovery.</li>
<li>LackVideoRecover: Lack of video stream recovery.</li>
<li>VideoBitrateOutofRange: Out-of-range video stream bitrate (kbps).</li>
<li>AudioBitrateOutofRange: Out-of-range audio stream bitrate (kbps).</li>
<li>VideoDecodeFailed: Video decoding error.</li>
<li>AudioDecodeFailed: Audio decoding error.</li>
<li>AudioOutOfPhase: Opposite phase in Dual-channel audio.</li>
<li>VideoDuplicatedFrame: Duplicate frames in the video stream.</li>
<li>AudioDuplicatedFrame: Duplicate frames in the audio stream.</li>
<li>VideoRotation: Video image rotation.</li>
<li>TsMultiPrograms: The MPEG2-TS stream has multiple programs.</li>
<li>Mp4InvalidCodecFourcc: The codec fourcc in MP4 does not meet Apple HLS requirements.</li>
<li>HLSBadM3u8Format: Invalid m3u8 file.</li>
<li>HLSInvalidMasterM3u8: Invalid main m3u8 file.</li>
<li>HLSInvalidMediaM3u8: Invalid media m3u8 file.</li>
<li>HLSMasterM3u8Recommended: The main m3u8 file lacks parameters recommended by the standard.</li>
<li>HLSMediaM3u8Recommended: The media m3u8 file lacks parameters recommended by the standard.</li>
<li>HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY exists in the media m3u8 file.</li>
<li>HLSMediaSegmentsStreamNumChange: The number of streams in the segment has changed.</li>
<li>HLSMediaSegmentsPTSJitterDeviation: PTS jitter between segments without EXT-X-DISCONTINUITY.</li>
<li>HLSMediaSegmentsDTSJitterDeviation: DTS jitter between segments without EXT-X-DISCONTINUITY.</li>
<li>TimecodeTrackExist: TMCD track in MP4.</li> 
     * @return Type Quality control item name. The quality control item values are as follows:
<li>LowEvaluation: No reference score.</li>
<li>Mosaic: Mosaic detection.</li>
<li>CrashScreen: Screen crash detection.</li>
<li>Blur: Blur detection.</li>
<li>BlackWhiteEdge: Black and white edge detection.</li>
<li>SolidColorScreen: Solid color screen detection.</li>
<li>LowLighting: Low lighting.</li>
<li>HighLighting: Overexposure.</li>
<li>NoVoice: Silence detection.</li>
<li>LowVoice: Low voice detection.</li>
<li>HighVoice: High voice detection.</li>
<li>Jitter: Jitter detection.</li>
<li>Noise: Noise detection.</li>
<li>QRCode: QR code detection.</li>
<li>BarCode: Barcode detection.</li>
<li>AppletCode: Applet code detection.</li>
<li>VideoResolutionChanged: The video resolution changed.</li>
<li>AudioSampleRateChanged: The audio sampling rate changed.</li>
<li>AudioChannelsChanged: The audio channel count changed.</li>
<li>ParameterSetsChanged: The stream parameter set information changed.</li>
<li>DarOrSarInvalid: Abnormal video aspect ratio.</li>
<li>TimestampFallback: DTS timestamp fallback.</li>
<li>DtsJitter: Excessive DTS jitter.</li>
<li>PtsJitter: Excessive PTS jitter.</li>
<li>AACDurationDeviation: Unreasonable AAC frame timestamp interval.</li>
<li>AudioDroppingFrames: Audio frame loss.</li>
<li>VideoDroppingFrames: Video frame loss.</li>
<li>AVTimestampInterleave: Unreasonable audio and video interleaving.</li>
<li>PtsLessThanDts: The PTS of media streams is less than DTS.</li>
<li>ReceiveFpsJitter: Excessive jitter of the frame rate received by the network.</li>
<li>ReceiveFpsTooSmall: Too low video frame rate received by the network.</li>
<li>FpsJitter: Excessive stream frame rate jitter calculated through PTS.</li>
<li>StreamOpenFailed: Stream opening failed.</li>
<li>StreamEnd: The stream ended.</li>
<li>StreamParseFailed: Stream parsing failed.</li>
<li>VideoFirstFrameNotIdr: The first frame is not an IDR frame.</li>
<li>StreamNALUError: NALU start code error.</li>
<li>TsStreamNoAud: The H26x stream of MPEGTS lacks AUD NALU.</li>
<li>AudioStreamLack: No audio stream.</li>
<li>VideoStreamLack: No video stream.</li>
<li>LackAudioRecover: Lack of audio stream recovery.</li>
<li>LackVideoRecover: Lack of video stream recovery.</li>
<li>VideoBitrateOutofRange: Out-of-range video stream bitrate (kbps).</li>
<li>AudioBitrateOutofRange: Out-of-range audio stream bitrate (kbps).</li>
<li>VideoDecodeFailed: Video decoding error.</li>
<li>AudioDecodeFailed: Audio decoding error.</li>
<li>AudioOutOfPhase: Opposite phase in Dual-channel audio.</li>
<li>VideoDuplicatedFrame: Duplicate frames in the video stream.</li>
<li>AudioDuplicatedFrame: Duplicate frames in the audio stream.</li>
<li>VideoRotation: Video image rotation.</li>
<li>TsMultiPrograms: The MPEG2-TS stream has multiple programs.</li>
<li>Mp4InvalidCodecFourcc: The codec fourcc in MP4 does not meet Apple HLS requirements.</li>
<li>HLSBadM3u8Format: Invalid m3u8 file.</li>
<li>HLSInvalidMasterM3u8: Invalid main m3u8 file.</li>
<li>HLSInvalidMediaM3u8: Invalid media m3u8 file.</li>
<li>HLSMasterM3u8Recommended: The main m3u8 file lacks parameters recommended by the standard.</li>
<li>HLSMediaM3u8Recommended: The media m3u8 file lacks parameters recommended by the standard.</li>
<li>HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY exists in the media m3u8 file.</li>
<li>HLSMediaSegmentsStreamNumChange: The number of streams in the segment has changed.</li>
<li>HLSMediaSegmentsPTSJitterDeviation: PTS jitter between segments without EXT-X-DISCONTINUITY.</li>
<li>HLSMediaSegmentsDTSJitterDeviation: DTS jitter between segments without EXT-X-DISCONTINUITY.</li>
<li>TimecodeTrackExist: TMCD track in MP4.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Quality control item name. The quality control item values are as follows:
<li>LowEvaluation: No reference score.</li>
<li>Mosaic: Mosaic detection.</li>
<li>CrashScreen: Screen crash detection.</li>
<li>Blur: Blur detection.</li>
<li>BlackWhiteEdge: Black and white edge detection.</li>
<li>SolidColorScreen: Solid color screen detection.</li>
<li>LowLighting: Low lighting.</li>
<li>HighLighting: Overexposure.</li>
<li>NoVoice: Silence detection.</li>
<li>LowVoice: Low voice detection.</li>
<li>HighVoice: High voice detection.</li>
<li>Jitter: Jitter detection.</li>
<li>Noise: Noise detection.</li>
<li>QRCode: QR code detection.</li>
<li>BarCode: Barcode detection.</li>
<li>AppletCode: Applet code detection.</li>
<li>VideoResolutionChanged: The video resolution changed.</li>
<li>AudioSampleRateChanged: The audio sampling rate changed.</li>
<li>AudioChannelsChanged: The audio channel count changed.</li>
<li>ParameterSetsChanged: The stream parameter set information changed.</li>
<li>DarOrSarInvalid: Abnormal video aspect ratio.</li>
<li>TimestampFallback: DTS timestamp fallback.</li>
<li>DtsJitter: Excessive DTS jitter.</li>
<li>PtsJitter: Excessive PTS jitter.</li>
<li>AACDurationDeviation: Unreasonable AAC frame timestamp interval.</li>
<li>AudioDroppingFrames: Audio frame loss.</li>
<li>VideoDroppingFrames: Video frame loss.</li>
<li>AVTimestampInterleave: Unreasonable audio and video interleaving.</li>
<li>PtsLessThanDts: The PTS of media streams is less than DTS.</li>
<li>ReceiveFpsJitter: Excessive jitter of the frame rate received by the network.</li>
<li>ReceiveFpsTooSmall: Too low video frame rate received by the network.</li>
<li>FpsJitter: Excessive stream frame rate jitter calculated through PTS.</li>
<li>StreamOpenFailed: Stream opening failed.</li>
<li>StreamEnd: The stream ended.</li>
<li>StreamParseFailed: Stream parsing failed.</li>
<li>VideoFirstFrameNotIdr: The first frame is not an IDR frame.</li>
<li>StreamNALUError: NALU start code error.</li>
<li>TsStreamNoAud: The H26x stream of MPEGTS lacks AUD NALU.</li>
<li>AudioStreamLack: No audio stream.</li>
<li>VideoStreamLack: No video stream.</li>
<li>LackAudioRecover: Lack of audio stream recovery.</li>
<li>LackVideoRecover: Lack of video stream recovery.</li>
<li>VideoBitrateOutofRange: Out-of-range video stream bitrate (kbps).</li>
<li>AudioBitrateOutofRange: Out-of-range audio stream bitrate (kbps).</li>
<li>VideoDecodeFailed: Video decoding error.</li>
<li>AudioDecodeFailed: Audio decoding error.</li>
<li>AudioOutOfPhase: Opposite phase in Dual-channel audio.</li>
<li>VideoDuplicatedFrame: Duplicate frames in the video stream.</li>
<li>AudioDuplicatedFrame: Duplicate frames in the audio stream.</li>
<li>VideoRotation: Video image rotation.</li>
<li>TsMultiPrograms: The MPEG2-TS stream has multiple programs.</li>
<li>Mp4InvalidCodecFourcc: The codec fourcc in MP4 does not meet Apple HLS requirements.</li>
<li>HLSBadM3u8Format: Invalid m3u8 file.</li>
<li>HLSInvalidMasterM3u8: Invalid main m3u8 file.</li>
<li>HLSInvalidMediaM3u8: Invalid media m3u8 file.</li>
<li>HLSMasterM3u8Recommended: The main m3u8 file lacks parameters recommended by the standard.</li>
<li>HLSMediaM3u8Recommended: The media m3u8 file lacks parameters recommended by the standard.</li>
<li>HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY exists in the media m3u8 file.</li>
<li>HLSMediaSegmentsStreamNumChange: The number of streams in the segment has changed.</li>
<li>HLSMediaSegmentsPTSJitterDeviation: PTS jitter between segments without EXT-X-DISCONTINUITY.</li>
<li>HLSMediaSegmentsDTSJitterDeviation: DTS jitter between segments without EXT-X-DISCONTINUITY.</li>
<li>TimecodeTrackExist: TMCD track in MP4.</li>
     * @param Type Quality control item name. The quality control item values are as follows:
<li>LowEvaluation: No reference score.</li>
<li>Mosaic: Mosaic detection.</li>
<li>CrashScreen: Screen crash detection.</li>
<li>Blur: Blur detection.</li>
<li>BlackWhiteEdge: Black and white edge detection.</li>
<li>SolidColorScreen: Solid color screen detection.</li>
<li>LowLighting: Low lighting.</li>
<li>HighLighting: Overexposure.</li>
<li>NoVoice: Silence detection.</li>
<li>LowVoice: Low voice detection.</li>
<li>HighVoice: High voice detection.</li>
<li>Jitter: Jitter detection.</li>
<li>Noise: Noise detection.</li>
<li>QRCode: QR code detection.</li>
<li>BarCode: Barcode detection.</li>
<li>AppletCode: Applet code detection.</li>
<li>VideoResolutionChanged: The video resolution changed.</li>
<li>AudioSampleRateChanged: The audio sampling rate changed.</li>
<li>AudioChannelsChanged: The audio channel count changed.</li>
<li>ParameterSetsChanged: The stream parameter set information changed.</li>
<li>DarOrSarInvalid: Abnormal video aspect ratio.</li>
<li>TimestampFallback: DTS timestamp fallback.</li>
<li>DtsJitter: Excessive DTS jitter.</li>
<li>PtsJitter: Excessive PTS jitter.</li>
<li>AACDurationDeviation: Unreasonable AAC frame timestamp interval.</li>
<li>AudioDroppingFrames: Audio frame loss.</li>
<li>VideoDroppingFrames: Video frame loss.</li>
<li>AVTimestampInterleave: Unreasonable audio and video interleaving.</li>
<li>PtsLessThanDts: The PTS of media streams is less than DTS.</li>
<li>ReceiveFpsJitter: Excessive jitter of the frame rate received by the network.</li>
<li>ReceiveFpsTooSmall: Too low video frame rate received by the network.</li>
<li>FpsJitter: Excessive stream frame rate jitter calculated through PTS.</li>
<li>StreamOpenFailed: Stream opening failed.</li>
<li>StreamEnd: The stream ended.</li>
<li>StreamParseFailed: Stream parsing failed.</li>
<li>VideoFirstFrameNotIdr: The first frame is not an IDR frame.</li>
<li>StreamNALUError: NALU start code error.</li>
<li>TsStreamNoAud: The H26x stream of MPEGTS lacks AUD NALU.</li>
<li>AudioStreamLack: No audio stream.</li>
<li>VideoStreamLack: No video stream.</li>
<li>LackAudioRecover: Lack of audio stream recovery.</li>
<li>LackVideoRecover: Lack of video stream recovery.</li>
<li>VideoBitrateOutofRange: Out-of-range video stream bitrate (kbps).</li>
<li>AudioBitrateOutofRange: Out-of-range audio stream bitrate (kbps).</li>
<li>VideoDecodeFailed: Video decoding error.</li>
<li>AudioDecodeFailed: Audio decoding error.</li>
<li>AudioOutOfPhase: Opposite phase in Dual-channel audio.</li>
<li>VideoDuplicatedFrame: Duplicate frames in the video stream.</li>
<li>AudioDuplicatedFrame: Duplicate frames in the audio stream.</li>
<li>VideoRotation: Video image rotation.</li>
<li>TsMultiPrograms: The MPEG2-TS stream has multiple programs.</li>
<li>Mp4InvalidCodecFourcc: The codec fourcc in MP4 does not meet Apple HLS requirements.</li>
<li>HLSBadM3u8Format: Invalid m3u8 file.</li>
<li>HLSInvalidMasterM3u8: Invalid main m3u8 file.</li>
<li>HLSInvalidMediaM3u8: Invalid media m3u8 file.</li>
<li>HLSMasterM3u8Recommended: The main m3u8 file lacks parameters recommended by the standard.</li>
<li>HLSMediaM3u8Recommended: The media m3u8 file lacks parameters recommended by the standard.</li>
<li>HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY exists in the media m3u8 file.</li>
<li>HLSMediaSegmentsStreamNumChange: The number of streams in the segment has changed.</li>
<li>HLSMediaSegmentsPTSJitterDeviation: PTS jitter between segments without EXT-X-DISCONTINUITY.</li>
<li>HLSMediaSegmentsDTSJitterDeviation: DTS jitter between segments without EXT-X-DISCONTINUITY.</li>
<li>TimecodeTrackExist: TMCD track in MP4.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Capability configuration switch. Valid values:
<li>ON: enabled;</li>
<li>OFF: disabled.</li>

Default value: ON.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Switch Capability configuration switch. Valid values:
<li>ON: enabled;</li>
<li>OFF: disabled.</li>

Default value: ON.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Capability configuration switch. Valid values:
<li>ON: enabled;</li>
<li>OFF: disabled.</li>

Default value: ON.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Switch Capability configuration switch. Valid values:
<li>ON: enabled;</li>
<li>OFF: disabled.</li>

Default value: ON.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Sampling method, Valid value:
- Time: sampling based on time interval.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sampling Sampling method, Valid value:
- Time: sampling based on time interval.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSampling() {
        return this.Sampling;
    }

    /**
     * Set Sampling method, Valid value:
- Time: sampling based on time interval.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sampling Sampling method, Valid value:
- Time: sampling based on time interval.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSampling(String Sampling) {
        this.Sampling = Sampling;
    }

    /**
     * Get Sampling interval time, in ms.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IntervalTime Sampling interval time, in ms.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set Sampling interval time, in ms.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IntervalTime Sampling interval time, in ms.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get Duration of abnormality, in ms.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Duration Duration of abnormality, in ms.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Duration of abnormality, in ms.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Duration Duration of abnormality, in ms.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Threshold of a detection item. Different detection items have different thresholds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Threshold Threshold of a detection item. Different detection items have different thresholds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getThreshold() {
        return this.Threshold;
    }

    /**
     * Set Threshold of a detection item. Different detection items have different thresholds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Threshold Threshold of a detection item. Different detection items have different thresholds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setThreshold(String Threshold) {
        this.Threshold = Threshold;
    }

    public QualityControlItemConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityControlItemConfig(QualityControlItemConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Sampling != null) {
            this.Sampling = new String(source.Sampling);
        }
        if (source.IntervalTime != null) {
            this.IntervalTime = new Long(source.IntervalTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Threshold != null) {
            this.Threshold = new String(source.Threshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Sampling", this.Sampling);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);

    }
}

