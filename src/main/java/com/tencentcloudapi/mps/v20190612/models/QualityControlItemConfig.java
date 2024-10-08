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

public class QualityControlItemConfig extends AbstractModel {

    /**
    * Quality inspection item name. Valid values:
<li>LowEvaluation: no-reference scoring.</li>
<li>Mosaic: mosaic detection.</li>
<li>CrashScreen: screen glitch detection.</li>
<li>VideoFreezedFrame: video freezing.</li>
<li>Blur: blur detection.</li>
<li>BlackWhiteEdge: black and white edges detection.</li>
<li>SolidColorScreen: solid color screen detection.</li>
<li>LowLighting: low light.</li>
<li>HighLighting: overexposure.</li>
<li>NoVoice: no voice detection.</li>
<li>LowVoice: low voice detection.</li>
<li>HighVoice: high voice detection.</li>
<li>Jitter: jitter detection.</li>
<li>Noise: noise detection.</li>
<li>QRCode: QR code detection.</li>
<li>BarCode: barcode detection.</li>
<li>AppletCode: mini program code detection.</li>
<li>VideoResolutionChanged: video resolution change.</li>
<li>AudioSampleRateChanged: audio sample rate change.</li>
<li>AudioChannelsChanged: audio channel quantity change.</li>
<li>ParameterSetsChanged: stream parameter set information change.</li>
<li>DarOrSarInvalid: video aspect ratio exception.</li>
<li>TimestampFallback: DTS timestamp rollback.</li>
<li>DtsJitter: DTS jitter too high.</li>
<li>PtsJitter: PTS jitter too high.</li>
<li>AACDurationDeviation: improper AAC frame timestamp interval.</li>
<li>AudioDroppingFrames: audio frame dropping.</li>
<li>VideoDroppingFrames: video frame dropping.</li>
<li>AVTimestampInterleave: improper audio-video interleaving.</li>
<li>PtsLessThanDts: PTS less than DTS for media streams.</li>
<li>ReceiveFpsJitter: significant jitter in the network receive frame rate.</li>
<li>ReceiveFpsTooSmall: network receive video frame rate too low.</li>
<li>FpsJitter: significant jitter in the stream frame rate calculated via PTS.</li>
<li>StreamOpenFailed: stream open failure.</li>
<li>StreamEnd: stream end.</li>
<li>StreamParseFailed: stream parsing failure.</li>
<li>VideoFirstFrameNotIdr: first frame not an IDR frame.</li>
<li>StreamNALUError: NALU start code error.</li>
<li>TsStreamNoAud: no AUD NALU in the H26x stream of MPEG-TS.</li>
<li>AudioStreamLack: no audio stream.</li>
<li>VideoStreamLack: no video stream.</li>
<li>LackAudioRecover: missing audio stream recovery.</li>
<li>LackVideoRecover: missing video stream recovery.</li>
<li>VideoBitrateOutofRange: video stream bitrate (kbps) out of range.</li>
<li>AudioBitrateOutofRange: audio stream bitrate (kbps) out of range.</li>
<li>VideoDecodeFailed: video decoding error.</li>
<li>AudioDecodeFailed: audio decoding error.</li>
<li>AudioOutOfPhase: opposite phase in dual-channel audio.</li>
<li>VideoDuplicatedFrame: duplicate frames in video streams.</li>
<li>AudioDuplicatedFrame: duplicate frames in audio streams.</li>
<li>VideoRotation: video rotation.</li>
<li>TsMultiPrograms: multiple programs in MPEG2-TS streams.</li>
<li>Mp4InvalidCodecFourcc: codec FourCC in MP4 not meeting Apple HLS requirements.</li>
<li>HLSBadM3u8Format: invalid M3U8 file.</li>
<li>HLSInvalidMasterM3u8: invalid main M3U8 file.</li>
<li>HLSInvalidMediaM3u8: invalid media M3U8 file.</li>
<li>HLSMasterM3u8Recommended: parameters recommended by standards missing in main M3U8.</li>
<li>HLSMediaM3u8Recommended: parameters recommended by standards missing in media M3U8.</li>
<li>HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY in media M3U8.</li>
<li>HLSMediaSegmentsStreamNumChange: changed number of streams in segments.</li>
<li>HLSMediaSegmentsPTSJitterDeviation: PTS jumps between segments without EXT-X-DISCONTINUITY.</li>
<li>HLSMediaSegmentsDTSJitterDeviation: DTS jumps between segments without EXT-X-DISCONTINUITY.</li>
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
     * Get Quality inspection item name. Valid values:
<li>LowEvaluation: no-reference scoring.</li>
<li>Mosaic: mosaic detection.</li>
<li>CrashScreen: screen glitch detection.</li>
<li>VideoFreezedFrame: video freezing.</li>
<li>Blur: blur detection.</li>
<li>BlackWhiteEdge: black and white edges detection.</li>
<li>SolidColorScreen: solid color screen detection.</li>
<li>LowLighting: low light.</li>
<li>HighLighting: overexposure.</li>
<li>NoVoice: no voice detection.</li>
<li>LowVoice: low voice detection.</li>
<li>HighVoice: high voice detection.</li>
<li>Jitter: jitter detection.</li>
<li>Noise: noise detection.</li>
<li>QRCode: QR code detection.</li>
<li>BarCode: barcode detection.</li>
<li>AppletCode: mini program code detection.</li>
<li>VideoResolutionChanged: video resolution change.</li>
<li>AudioSampleRateChanged: audio sample rate change.</li>
<li>AudioChannelsChanged: audio channel quantity change.</li>
<li>ParameterSetsChanged: stream parameter set information change.</li>
<li>DarOrSarInvalid: video aspect ratio exception.</li>
<li>TimestampFallback: DTS timestamp rollback.</li>
<li>DtsJitter: DTS jitter too high.</li>
<li>PtsJitter: PTS jitter too high.</li>
<li>AACDurationDeviation: improper AAC frame timestamp interval.</li>
<li>AudioDroppingFrames: audio frame dropping.</li>
<li>VideoDroppingFrames: video frame dropping.</li>
<li>AVTimestampInterleave: improper audio-video interleaving.</li>
<li>PtsLessThanDts: PTS less than DTS for media streams.</li>
<li>ReceiveFpsJitter: significant jitter in the network receive frame rate.</li>
<li>ReceiveFpsTooSmall: network receive video frame rate too low.</li>
<li>FpsJitter: significant jitter in the stream frame rate calculated via PTS.</li>
<li>StreamOpenFailed: stream open failure.</li>
<li>StreamEnd: stream end.</li>
<li>StreamParseFailed: stream parsing failure.</li>
<li>VideoFirstFrameNotIdr: first frame not an IDR frame.</li>
<li>StreamNALUError: NALU start code error.</li>
<li>TsStreamNoAud: no AUD NALU in the H26x stream of MPEG-TS.</li>
<li>AudioStreamLack: no audio stream.</li>
<li>VideoStreamLack: no video stream.</li>
<li>LackAudioRecover: missing audio stream recovery.</li>
<li>LackVideoRecover: missing video stream recovery.</li>
<li>VideoBitrateOutofRange: video stream bitrate (kbps) out of range.</li>
<li>AudioBitrateOutofRange: audio stream bitrate (kbps) out of range.</li>
<li>VideoDecodeFailed: video decoding error.</li>
<li>AudioDecodeFailed: audio decoding error.</li>
<li>AudioOutOfPhase: opposite phase in dual-channel audio.</li>
<li>VideoDuplicatedFrame: duplicate frames in video streams.</li>
<li>AudioDuplicatedFrame: duplicate frames in audio streams.</li>
<li>VideoRotation: video rotation.</li>
<li>TsMultiPrograms: multiple programs in MPEG2-TS streams.</li>
<li>Mp4InvalidCodecFourcc: codec FourCC in MP4 not meeting Apple HLS requirements.</li>
<li>HLSBadM3u8Format: invalid M3U8 file.</li>
<li>HLSInvalidMasterM3u8: invalid main M3U8 file.</li>
<li>HLSInvalidMediaM3u8: invalid media M3U8 file.</li>
<li>HLSMasterM3u8Recommended: parameters recommended by standards missing in main M3U8.</li>
<li>HLSMediaM3u8Recommended: parameters recommended by standards missing in media M3U8.</li>
<li>HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY in media M3U8.</li>
<li>HLSMediaSegmentsStreamNumChange: changed number of streams in segments.</li>
<li>HLSMediaSegmentsPTSJitterDeviation: PTS jumps between segments without EXT-X-DISCONTINUITY.</li>
<li>HLSMediaSegmentsDTSJitterDeviation: DTS jumps between segments without EXT-X-DISCONTINUITY.</li>
<li>TimecodeTrackExist: TMCD track in MP4.</li> 
     * @return Type Quality inspection item name. Valid values:
<li>LowEvaluation: no-reference scoring.</li>
<li>Mosaic: mosaic detection.</li>
<li>CrashScreen: screen glitch detection.</li>
<li>VideoFreezedFrame: video freezing.</li>
<li>Blur: blur detection.</li>
<li>BlackWhiteEdge: black and white edges detection.</li>
<li>SolidColorScreen: solid color screen detection.</li>
<li>LowLighting: low light.</li>
<li>HighLighting: overexposure.</li>
<li>NoVoice: no voice detection.</li>
<li>LowVoice: low voice detection.</li>
<li>HighVoice: high voice detection.</li>
<li>Jitter: jitter detection.</li>
<li>Noise: noise detection.</li>
<li>QRCode: QR code detection.</li>
<li>BarCode: barcode detection.</li>
<li>AppletCode: mini program code detection.</li>
<li>VideoResolutionChanged: video resolution change.</li>
<li>AudioSampleRateChanged: audio sample rate change.</li>
<li>AudioChannelsChanged: audio channel quantity change.</li>
<li>ParameterSetsChanged: stream parameter set information change.</li>
<li>DarOrSarInvalid: video aspect ratio exception.</li>
<li>TimestampFallback: DTS timestamp rollback.</li>
<li>DtsJitter: DTS jitter too high.</li>
<li>PtsJitter: PTS jitter too high.</li>
<li>AACDurationDeviation: improper AAC frame timestamp interval.</li>
<li>AudioDroppingFrames: audio frame dropping.</li>
<li>VideoDroppingFrames: video frame dropping.</li>
<li>AVTimestampInterleave: improper audio-video interleaving.</li>
<li>PtsLessThanDts: PTS less than DTS for media streams.</li>
<li>ReceiveFpsJitter: significant jitter in the network receive frame rate.</li>
<li>ReceiveFpsTooSmall: network receive video frame rate too low.</li>
<li>FpsJitter: significant jitter in the stream frame rate calculated via PTS.</li>
<li>StreamOpenFailed: stream open failure.</li>
<li>StreamEnd: stream end.</li>
<li>StreamParseFailed: stream parsing failure.</li>
<li>VideoFirstFrameNotIdr: first frame not an IDR frame.</li>
<li>StreamNALUError: NALU start code error.</li>
<li>TsStreamNoAud: no AUD NALU in the H26x stream of MPEG-TS.</li>
<li>AudioStreamLack: no audio stream.</li>
<li>VideoStreamLack: no video stream.</li>
<li>LackAudioRecover: missing audio stream recovery.</li>
<li>LackVideoRecover: missing video stream recovery.</li>
<li>VideoBitrateOutofRange: video stream bitrate (kbps) out of range.</li>
<li>AudioBitrateOutofRange: audio stream bitrate (kbps) out of range.</li>
<li>VideoDecodeFailed: video decoding error.</li>
<li>AudioDecodeFailed: audio decoding error.</li>
<li>AudioOutOfPhase: opposite phase in dual-channel audio.</li>
<li>VideoDuplicatedFrame: duplicate frames in video streams.</li>
<li>AudioDuplicatedFrame: duplicate frames in audio streams.</li>
<li>VideoRotation: video rotation.</li>
<li>TsMultiPrograms: multiple programs in MPEG2-TS streams.</li>
<li>Mp4InvalidCodecFourcc: codec FourCC in MP4 not meeting Apple HLS requirements.</li>
<li>HLSBadM3u8Format: invalid M3U8 file.</li>
<li>HLSInvalidMasterM3u8: invalid main M3U8 file.</li>
<li>HLSInvalidMediaM3u8: invalid media M3U8 file.</li>
<li>HLSMasterM3u8Recommended: parameters recommended by standards missing in main M3U8.</li>
<li>HLSMediaM3u8Recommended: parameters recommended by standards missing in media M3U8.</li>
<li>HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY in media M3U8.</li>
<li>HLSMediaSegmentsStreamNumChange: changed number of streams in segments.</li>
<li>HLSMediaSegmentsPTSJitterDeviation: PTS jumps between segments without EXT-X-DISCONTINUITY.</li>
<li>HLSMediaSegmentsDTSJitterDeviation: DTS jumps between segments without EXT-X-DISCONTINUITY.</li>
<li>TimecodeTrackExist: TMCD track in MP4.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Quality inspection item name. Valid values:
<li>LowEvaluation: no-reference scoring.</li>
<li>Mosaic: mosaic detection.</li>
<li>CrashScreen: screen glitch detection.</li>
<li>VideoFreezedFrame: video freezing.</li>
<li>Blur: blur detection.</li>
<li>BlackWhiteEdge: black and white edges detection.</li>
<li>SolidColorScreen: solid color screen detection.</li>
<li>LowLighting: low light.</li>
<li>HighLighting: overexposure.</li>
<li>NoVoice: no voice detection.</li>
<li>LowVoice: low voice detection.</li>
<li>HighVoice: high voice detection.</li>
<li>Jitter: jitter detection.</li>
<li>Noise: noise detection.</li>
<li>QRCode: QR code detection.</li>
<li>BarCode: barcode detection.</li>
<li>AppletCode: mini program code detection.</li>
<li>VideoResolutionChanged: video resolution change.</li>
<li>AudioSampleRateChanged: audio sample rate change.</li>
<li>AudioChannelsChanged: audio channel quantity change.</li>
<li>ParameterSetsChanged: stream parameter set information change.</li>
<li>DarOrSarInvalid: video aspect ratio exception.</li>
<li>TimestampFallback: DTS timestamp rollback.</li>
<li>DtsJitter: DTS jitter too high.</li>
<li>PtsJitter: PTS jitter too high.</li>
<li>AACDurationDeviation: improper AAC frame timestamp interval.</li>
<li>AudioDroppingFrames: audio frame dropping.</li>
<li>VideoDroppingFrames: video frame dropping.</li>
<li>AVTimestampInterleave: improper audio-video interleaving.</li>
<li>PtsLessThanDts: PTS less than DTS for media streams.</li>
<li>ReceiveFpsJitter: significant jitter in the network receive frame rate.</li>
<li>ReceiveFpsTooSmall: network receive video frame rate too low.</li>
<li>FpsJitter: significant jitter in the stream frame rate calculated via PTS.</li>
<li>StreamOpenFailed: stream open failure.</li>
<li>StreamEnd: stream end.</li>
<li>StreamParseFailed: stream parsing failure.</li>
<li>VideoFirstFrameNotIdr: first frame not an IDR frame.</li>
<li>StreamNALUError: NALU start code error.</li>
<li>TsStreamNoAud: no AUD NALU in the H26x stream of MPEG-TS.</li>
<li>AudioStreamLack: no audio stream.</li>
<li>VideoStreamLack: no video stream.</li>
<li>LackAudioRecover: missing audio stream recovery.</li>
<li>LackVideoRecover: missing video stream recovery.</li>
<li>VideoBitrateOutofRange: video stream bitrate (kbps) out of range.</li>
<li>AudioBitrateOutofRange: audio stream bitrate (kbps) out of range.</li>
<li>VideoDecodeFailed: video decoding error.</li>
<li>AudioDecodeFailed: audio decoding error.</li>
<li>AudioOutOfPhase: opposite phase in dual-channel audio.</li>
<li>VideoDuplicatedFrame: duplicate frames in video streams.</li>
<li>AudioDuplicatedFrame: duplicate frames in audio streams.</li>
<li>VideoRotation: video rotation.</li>
<li>TsMultiPrograms: multiple programs in MPEG2-TS streams.</li>
<li>Mp4InvalidCodecFourcc: codec FourCC in MP4 not meeting Apple HLS requirements.</li>
<li>HLSBadM3u8Format: invalid M3U8 file.</li>
<li>HLSInvalidMasterM3u8: invalid main M3U8 file.</li>
<li>HLSInvalidMediaM3u8: invalid media M3U8 file.</li>
<li>HLSMasterM3u8Recommended: parameters recommended by standards missing in main M3U8.</li>
<li>HLSMediaM3u8Recommended: parameters recommended by standards missing in media M3U8.</li>
<li>HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY in media M3U8.</li>
<li>HLSMediaSegmentsStreamNumChange: changed number of streams in segments.</li>
<li>HLSMediaSegmentsPTSJitterDeviation: PTS jumps between segments without EXT-X-DISCONTINUITY.</li>
<li>HLSMediaSegmentsDTSJitterDeviation: DTS jumps between segments without EXT-X-DISCONTINUITY.</li>
<li>TimecodeTrackExist: TMCD track in MP4.</li>
     * @param Type Quality inspection item name. Valid values:
<li>LowEvaluation: no-reference scoring.</li>
<li>Mosaic: mosaic detection.</li>
<li>CrashScreen: screen glitch detection.</li>
<li>VideoFreezedFrame: video freezing.</li>
<li>Blur: blur detection.</li>
<li>BlackWhiteEdge: black and white edges detection.</li>
<li>SolidColorScreen: solid color screen detection.</li>
<li>LowLighting: low light.</li>
<li>HighLighting: overexposure.</li>
<li>NoVoice: no voice detection.</li>
<li>LowVoice: low voice detection.</li>
<li>HighVoice: high voice detection.</li>
<li>Jitter: jitter detection.</li>
<li>Noise: noise detection.</li>
<li>QRCode: QR code detection.</li>
<li>BarCode: barcode detection.</li>
<li>AppletCode: mini program code detection.</li>
<li>VideoResolutionChanged: video resolution change.</li>
<li>AudioSampleRateChanged: audio sample rate change.</li>
<li>AudioChannelsChanged: audio channel quantity change.</li>
<li>ParameterSetsChanged: stream parameter set information change.</li>
<li>DarOrSarInvalid: video aspect ratio exception.</li>
<li>TimestampFallback: DTS timestamp rollback.</li>
<li>DtsJitter: DTS jitter too high.</li>
<li>PtsJitter: PTS jitter too high.</li>
<li>AACDurationDeviation: improper AAC frame timestamp interval.</li>
<li>AudioDroppingFrames: audio frame dropping.</li>
<li>VideoDroppingFrames: video frame dropping.</li>
<li>AVTimestampInterleave: improper audio-video interleaving.</li>
<li>PtsLessThanDts: PTS less than DTS for media streams.</li>
<li>ReceiveFpsJitter: significant jitter in the network receive frame rate.</li>
<li>ReceiveFpsTooSmall: network receive video frame rate too low.</li>
<li>FpsJitter: significant jitter in the stream frame rate calculated via PTS.</li>
<li>StreamOpenFailed: stream open failure.</li>
<li>StreamEnd: stream end.</li>
<li>StreamParseFailed: stream parsing failure.</li>
<li>VideoFirstFrameNotIdr: first frame not an IDR frame.</li>
<li>StreamNALUError: NALU start code error.</li>
<li>TsStreamNoAud: no AUD NALU in the H26x stream of MPEG-TS.</li>
<li>AudioStreamLack: no audio stream.</li>
<li>VideoStreamLack: no video stream.</li>
<li>LackAudioRecover: missing audio stream recovery.</li>
<li>LackVideoRecover: missing video stream recovery.</li>
<li>VideoBitrateOutofRange: video stream bitrate (kbps) out of range.</li>
<li>AudioBitrateOutofRange: audio stream bitrate (kbps) out of range.</li>
<li>VideoDecodeFailed: video decoding error.</li>
<li>AudioDecodeFailed: audio decoding error.</li>
<li>AudioOutOfPhase: opposite phase in dual-channel audio.</li>
<li>VideoDuplicatedFrame: duplicate frames in video streams.</li>
<li>AudioDuplicatedFrame: duplicate frames in audio streams.</li>
<li>VideoRotation: video rotation.</li>
<li>TsMultiPrograms: multiple programs in MPEG2-TS streams.</li>
<li>Mp4InvalidCodecFourcc: codec FourCC in MP4 not meeting Apple HLS requirements.</li>
<li>HLSBadM3u8Format: invalid M3U8 file.</li>
<li>HLSInvalidMasterM3u8: invalid main M3U8 file.</li>
<li>HLSInvalidMediaM3u8: invalid media M3U8 file.</li>
<li>HLSMasterM3u8Recommended: parameters recommended by standards missing in main M3U8.</li>
<li>HLSMediaM3u8Recommended: parameters recommended by standards missing in media M3U8.</li>
<li>HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY in media M3U8.</li>
<li>HLSMediaSegmentsStreamNumChange: changed number of streams in segments.</li>
<li>HLSMediaSegmentsPTSJitterDeviation: PTS jumps between segments without EXT-X-DISCONTINUITY.</li>
<li>HLSMediaSegmentsDTSJitterDeviation: DTS jumps between segments without EXT-X-DISCONTINUITY.</li>
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

