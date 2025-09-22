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
    * Quality inspection item name. valid values:.
<li>LowEvaluation: specifies the no-reference MOS score of the video.</li>.
<li>AudioEvaluation: specifies the no-reference MOS score of the audio.</li>.
<Li>Mosaic: mosaic detection.</li>.
<Li>CrashScreen: specifies screen glitch detection.</li>.
<Li>Blur: specifies blur detection.</li>.
<Li>Jitter: jitter detection.</li>.
<Li>Noise: noise detection.</li>.
<Li>QRCode: qr code detection.</li>.
<Li>BarCode: specifies barcode detection.</li>.
<Li>AppletCode: specifies mini program code detection.</li>.
<Li>BlackWhiteEdge: specifies black and white edge detection.</li>.
<Li>SolidColorScreen: specifies solid color screen detection.</li>.
<Li>LowLighting: specifies low light.</li>.
<Li>HighLighting: overexposure.</li>.
<Li>NoVoice: specifies silence detection.</li>.
<Li>LowVoice: specifies bass detection.</li>.
<Li>HighVoice: explosion noise detection.</li>.
<Li>AudioNoise: specifies audio noise detection.</li>.
<Li>VideoResolutionChanged: specifies the video resolution change.</li>.
<Li>AudioSampleRateChanged: specifies the audio sample rate change.</li>.
<Li>AudioChannelsChanged: indicates the audio channel quantity change.</li>.
<Li>ParameterSetsChanged: indicates the stream parameter set information has changed.</li>.
<Li>DarOrSarInvalid: indicates an abnormal video aspect ratio.</li>.
<li>TimestampFallback: specifies DTS timestamp rollback.</li>.
<li>DtsJitter: specifies excessive DTS jitter.</li>.
<li>PtsJitter: indicates excessive PTS jitter.</li>.
<Li>AACDurationDeviation: specifies an improper aac frame timestamp interval.</li>.
<Li>AudioDroppingFrames: indicates audio frame dropping.</li>.
<Li>VideoDroppingFrames: specifies video frame dropping.</li>.
<Li>AVTimestampInterleave: improper audio-video interleaving.</li>.
<Li>PtsLessThanDts: specifies that the pts of the media stream is less than the dts.</li>.
<Li>ReceiveFpsJitter: specifies excessive jitter in the network received frame rate.</li>.
<Li>ReceiveFpsTooSmall: indicates the network received video frame rate is too low.</li>.
<li>FpsJitter: specifies excessive jitter in the stream frame rate calculated via PTS.</li>.
<Li>StreamOpenFailed: indicates the stream open failure.</li>.
<Li>StreamEnd: specifies the stream end.</li>.
<Li>StreamParseFailed: specifies the stream parsing failure.</li>.
<li>VideoFirstFrameNotIdr: first frame not an IDR frame.</li>.
<Li>StreamNALUError: indicates an nalu start code error.</li>.
<li>TsStreamNoAud: specifies whether the mpegts H26x stream misses AUD NALU.</li>.
<Li>AudioStreamLack: no audio stream.</li>.
<Li>VideoStreamLack: no video stream.</li>.
<Li>LackAudioRecover: specifies missing audio stream recovery.</li>.
<Li>LackVideoRecover: missing video stream recovery.</li>.
<Li>VideoBitrateOutofRange: video stream bitrate (kbps) out of range.</li>.
<Li>AudioBitrateOutofRange: audio stream bitrate (kbps) out of range.</li>.
<Li>VideoDecodeFailed: indicates a video decoding error.</li>.
<Li>AudioDecodeFailed: audio decoding error.</li>.
<Li>AudioOutOfPhase: specifies opposite phase in dual-channel audio.</li>.
<Li>VideoDuplicatedFrame: indicates duplicate frames in video streams.</li>.
<Li>AudioDuplicatedFrame: indicates duplicate frames in audio streams.</li>.
<Li>VideoRotation: specifies video rotation.</li>.
<li>TsMultiPrograms: specifies multiple programs in MPEG2-TS streams.</li>.
<li>Mp4InvalidCodecFourcc: specifies the codec fourcc in Mp4 does not meet Apple HLS requirements.</li>.
<Li>HLSBadM3u8Format: invalid m3u8 file.</li>.
<Li>HLSInvalidMasterM3u8: invalid main m3u8 file.</li>.
<Li>HLSInvalidMediaM3u8: invalid media m3u8 file.</li>.
<Li>HLSMasterM3u8Recommended: parameters recommended by standards missing in main m3u8.</li>.
<Li>HLSMediaM3u8Recommended: parameters recommended by standards missing in media m3u8.</li>.
<li>HLSMediaM3u8DiscontinuityExist: indicates the existence of EXT-X-DISCONTINUITY in media m3u8.</li>.
<Li>HLSMediaSegmentsStreamNumChange: indicates the number of streams in segments changes.</li>.
<li>HLSMediaSegmentsPTSJitterDeviation: indicates PTS jumps between segments without EXT-X-DISCONTINUITY.</li>.
<li>HLSMediaSegmentsDTSJitterDeviation: indicates DTS jumps between segments without EXT-X-DISCONTINUITY.</li>.
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
     * Get Quality inspection item name. valid values:.
<li>LowEvaluation: specifies the no-reference MOS score of the video.</li>.
<li>AudioEvaluation: specifies the no-reference MOS score of the audio.</li>.
<Li>Mosaic: mosaic detection.</li>.
<Li>CrashScreen: specifies screen glitch detection.</li>.
<Li>Blur: specifies blur detection.</li>.
<Li>Jitter: jitter detection.</li>.
<Li>Noise: noise detection.</li>.
<Li>QRCode: qr code detection.</li>.
<Li>BarCode: specifies barcode detection.</li>.
<Li>AppletCode: specifies mini program code detection.</li>.
<Li>BlackWhiteEdge: specifies black and white edge detection.</li>.
<Li>SolidColorScreen: specifies solid color screen detection.</li>.
<Li>LowLighting: specifies low light.</li>.
<Li>HighLighting: overexposure.</li>.
<Li>NoVoice: specifies silence detection.</li>.
<Li>LowVoice: specifies bass detection.</li>.
<Li>HighVoice: explosion noise detection.</li>.
<Li>AudioNoise: specifies audio noise detection.</li>.
<Li>VideoResolutionChanged: specifies the video resolution change.</li>.
<Li>AudioSampleRateChanged: specifies the audio sample rate change.</li>.
<Li>AudioChannelsChanged: indicates the audio channel quantity change.</li>.
<Li>ParameterSetsChanged: indicates the stream parameter set information has changed.</li>.
<Li>DarOrSarInvalid: indicates an abnormal video aspect ratio.</li>.
<li>TimestampFallback: specifies DTS timestamp rollback.</li>.
<li>DtsJitter: specifies excessive DTS jitter.</li>.
<li>PtsJitter: indicates excessive PTS jitter.</li>.
<Li>AACDurationDeviation: specifies an improper aac frame timestamp interval.</li>.
<Li>AudioDroppingFrames: indicates audio frame dropping.</li>.
<Li>VideoDroppingFrames: specifies video frame dropping.</li>.
<Li>AVTimestampInterleave: improper audio-video interleaving.</li>.
<Li>PtsLessThanDts: specifies that the pts of the media stream is less than the dts.</li>.
<Li>ReceiveFpsJitter: specifies excessive jitter in the network received frame rate.</li>.
<Li>ReceiveFpsTooSmall: indicates the network received video frame rate is too low.</li>.
<li>FpsJitter: specifies excessive jitter in the stream frame rate calculated via PTS.</li>.
<Li>StreamOpenFailed: indicates the stream open failure.</li>.
<Li>StreamEnd: specifies the stream end.</li>.
<Li>StreamParseFailed: specifies the stream parsing failure.</li>.
<li>VideoFirstFrameNotIdr: first frame not an IDR frame.</li>.
<Li>StreamNALUError: indicates an nalu start code error.</li>.
<li>TsStreamNoAud: specifies whether the mpegts H26x stream misses AUD NALU.</li>.
<Li>AudioStreamLack: no audio stream.</li>.
<Li>VideoStreamLack: no video stream.</li>.
<Li>LackAudioRecover: specifies missing audio stream recovery.</li>.
<Li>LackVideoRecover: missing video stream recovery.</li>.
<Li>VideoBitrateOutofRange: video stream bitrate (kbps) out of range.</li>.
<Li>AudioBitrateOutofRange: audio stream bitrate (kbps) out of range.</li>.
<Li>VideoDecodeFailed: indicates a video decoding error.</li>.
<Li>AudioDecodeFailed: audio decoding error.</li>.
<Li>AudioOutOfPhase: specifies opposite phase in dual-channel audio.</li>.
<Li>VideoDuplicatedFrame: indicates duplicate frames in video streams.</li>.
<Li>AudioDuplicatedFrame: indicates duplicate frames in audio streams.</li>.
<Li>VideoRotation: specifies video rotation.</li>.
<li>TsMultiPrograms: specifies multiple programs in MPEG2-TS streams.</li>.
<li>Mp4InvalidCodecFourcc: specifies the codec fourcc in Mp4 does not meet Apple HLS requirements.</li>.
<Li>HLSBadM3u8Format: invalid m3u8 file.</li>.
<Li>HLSInvalidMasterM3u8: invalid main m3u8 file.</li>.
<Li>HLSInvalidMediaM3u8: invalid media m3u8 file.</li>.
<Li>HLSMasterM3u8Recommended: parameters recommended by standards missing in main m3u8.</li>.
<Li>HLSMediaM3u8Recommended: parameters recommended by standards missing in media m3u8.</li>.
<li>HLSMediaM3u8DiscontinuityExist: indicates the existence of EXT-X-DISCONTINUITY in media m3u8.</li>.
<Li>HLSMediaSegmentsStreamNumChange: indicates the number of streams in segments changes.</li>.
<li>HLSMediaSegmentsPTSJitterDeviation: indicates PTS jumps between segments without EXT-X-DISCONTINUITY.</li>.
<li>HLSMediaSegmentsDTSJitterDeviation: indicates DTS jumps between segments without EXT-X-DISCONTINUITY.</li>.
<li>TimecodeTrackExist: TMCD track in MP4.</li> 
     * @return Type Quality inspection item name. valid values:.
<li>LowEvaluation: specifies the no-reference MOS score of the video.</li>.
<li>AudioEvaluation: specifies the no-reference MOS score of the audio.</li>.
<Li>Mosaic: mosaic detection.</li>.
<Li>CrashScreen: specifies screen glitch detection.</li>.
<Li>Blur: specifies blur detection.</li>.
<Li>Jitter: jitter detection.</li>.
<Li>Noise: noise detection.</li>.
<Li>QRCode: qr code detection.</li>.
<Li>BarCode: specifies barcode detection.</li>.
<Li>AppletCode: specifies mini program code detection.</li>.
<Li>BlackWhiteEdge: specifies black and white edge detection.</li>.
<Li>SolidColorScreen: specifies solid color screen detection.</li>.
<Li>LowLighting: specifies low light.</li>.
<Li>HighLighting: overexposure.</li>.
<Li>NoVoice: specifies silence detection.</li>.
<Li>LowVoice: specifies bass detection.</li>.
<Li>HighVoice: explosion noise detection.</li>.
<Li>AudioNoise: specifies audio noise detection.</li>.
<Li>VideoResolutionChanged: specifies the video resolution change.</li>.
<Li>AudioSampleRateChanged: specifies the audio sample rate change.</li>.
<Li>AudioChannelsChanged: indicates the audio channel quantity change.</li>.
<Li>ParameterSetsChanged: indicates the stream parameter set information has changed.</li>.
<Li>DarOrSarInvalid: indicates an abnormal video aspect ratio.</li>.
<li>TimestampFallback: specifies DTS timestamp rollback.</li>.
<li>DtsJitter: specifies excessive DTS jitter.</li>.
<li>PtsJitter: indicates excessive PTS jitter.</li>.
<Li>AACDurationDeviation: specifies an improper aac frame timestamp interval.</li>.
<Li>AudioDroppingFrames: indicates audio frame dropping.</li>.
<Li>VideoDroppingFrames: specifies video frame dropping.</li>.
<Li>AVTimestampInterleave: improper audio-video interleaving.</li>.
<Li>PtsLessThanDts: specifies that the pts of the media stream is less than the dts.</li>.
<Li>ReceiveFpsJitter: specifies excessive jitter in the network received frame rate.</li>.
<Li>ReceiveFpsTooSmall: indicates the network received video frame rate is too low.</li>.
<li>FpsJitter: specifies excessive jitter in the stream frame rate calculated via PTS.</li>.
<Li>StreamOpenFailed: indicates the stream open failure.</li>.
<Li>StreamEnd: specifies the stream end.</li>.
<Li>StreamParseFailed: specifies the stream parsing failure.</li>.
<li>VideoFirstFrameNotIdr: first frame not an IDR frame.</li>.
<Li>StreamNALUError: indicates an nalu start code error.</li>.
<li>TsStreamNoAud: specifies whether the mpegts H26x stream misses AUD NALU.</li>.
<Li>AudioStreamLack: no audio stream.</li>.
<Li>VideoStreamLack: no video stream.</li>.
<Li>LackAudioRecover: specifies missing audio stream recovery.</li>.
<Li>LackVideoRecover: missing video stream recovery.</li>.
<Li>VideoBitrateOutofRange: video stream bitrate (kbps) out of range.</li>.
<Li>AudioBitrateOutofRange: audio stream bitrate (kbps) out of range.</li>.
<Li>VideoDecodeFailed: indicates a video decoding error.</li>.
<Li>AudioDecodeFailed: audio decoding error.</li>.
<Li>AudioOutOfPhase: specifies opposite phase in dual-channel audio.</li>.
<Li>VideoDuplicatedFrame: indicates duplicate frames in video streams.</li>.
<Li>AudioDuplicatedFrame: indicates duplicate frames in audio streams.</li>.
<Li>VideoRotation: specifies video rotation.</li>.
<li>TsMultiPrograms: specifies multiple programs in MPEG2-TS streams.</li>.
<li>Mp4InvalidCodecFourcc: specifies the codec fourcc in Mp4 does not meet Apple HLS requirements.</li>.
<Li>HLSBadM3u8Format: invalid m3u8 file.</li>.
<Li>HLSInvalidMasterM3u8: invalid main m3u8 file.</li>.
<Li>HLSInvalidMediaM3u8: invalid media m3u8 file.</li>.
<Li>HLSMasterM3u8Recommended: parameters recommended by standards missing in main m3u8.</li>.
<Li>HLSMediaM3u8Recommended: parameters recommended by standards missing in media m3u8.</li>.
<li>HLSMediaM3u8DiscontinuityExist: indicates the existence of EXT-X-DISCONTINUITY in media m3u8.</li>.
<Li>HLSMediaSegmentsStreamNumChange: indicates the number of streams in segments changes.</li>.
<li>HLSMediaSegmentsPTSJitterDeviation: indicates PTS jumps between segments without EXT-X-DISCONTINUITY.</li>.
<li>HLSMediaSegmentsDTSJitterDeviation: indicates DTS jumps between segments without EXT-X-DISCONTINUITY.</li>.
<li>TimecodeTrackExist: TMCD track in MP4.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Quality inspection item name. valid values:.
<li>LowEvaluation: specifies the no-reference MOS score of the video.</li>.
<li>AudioEvaluation: specifies the no-reference MOS score of the audio.</li>.
<Li>Mosaic: mosaic detection.</li>.
<Li>CrashScreen: specifies screen glitch detection.</li>.
<Li>Blur: specifies blur detection.</li>.
<Li>Jitter: jitter detection.</li>.
<Li>Noise: noise detection.</li>.
<Li>QRCode: qr code detection.</li>.
<Li>BarCode: specifies barcode detection.</li>.
<Li>AppletCode: specifies mini program code detection.</li>.
<Li>BlackWhiteEdge: specifies black and white edge detection.</li>.
<Li>SolidColorScreen: specifies solid color screen detection.</li>.
<Li>LowLighting: specifies low light.</li>.
<Li>HighLighting: overexposure.</li>.
<Li>NoVoice: specifies silence detection.</li>.
<Li>LowVoice: specifies bass detection.</li>.
<Li>HighVoice: explosion noise detection.</li>.
<Li>AudioNoise: specifies audio noise detection.</li>.
<Li>VideoResolutionChanged: specifies the video resolution change.</li>.
<Li>AudioSampleRateChanged: specifies the audio sample rate change.</li>.
<Li>AudioChannelsChanged: indicates the audio channel quantity change.</li>.
<Li>ParameterSetsChanged: indicates the stream parameter set information has changed.</li>.
<Li>DarOrSarInvalid: indicates an abnormal video aspect ratio.</li>.
<li>TimestampFallback: specifies DTS timestamp rollback.</li>.
<li>DtsJitter: specifies excessive DTS jitter.</li>.
<li>PtsJitter: indicates excessive PTS jitter.</li>.
<Li>AACDurationDeviation: specifies an improper aac frame timestamp interval.</li>.
<Li>AudioDroppingFrames: indicates audio frame dropping.</li>.
<Li>VideoDroppingFrames: specifies video frame dropping.</li>.
<Li>AVTimestampInterleave: improper audio-video interleaving.</li>.
<Li>PtsLessThanDts: specifies that the pts of the media stream is less than the dts.</li>.
<Li>ReceiveFpsJitter: specifies excessive jitter in the network received frame rate.</li>.
<Li>ReceiveFpsTooSmall: indicates the network received video frame rate is too low.</li>.
<li>FpsJitter: specifies excessive jitter in the stream frame rate calculated via PTS.</li>.
<Li>StreamOpenFailed: indicates the stream open failure.</li>.
<Li>StreamEnd: specifies the stream end.</li>.
<Li>StreamParseFailed: specifies the stream parsing failure.</li>.
<li>VideoFirstFrameNotIdr: first frame not an IDR frame.</li>.
<Li>StreamNALUError: indicates an nalu start code error.</li>.
<li>TsStreamNoAud: specifies whether the mpegts H26x stream misses AUD NALU.</li>.
<Li>AudioStreamLack: no audio stream.</li>.
<Li>VideoStreamLack: no video stream.</li>.
<Li>LackAudioRecover: specifies missing audio stream recovery.</li>.
<Li>LackVideoRecover: missing video stream recovery.</li>.
<Li>VideoBitrateOutofRange: video stream bitrate (kbps) out of range.</li>.
<Li>AudioBitrateOutofRange: audio stream bitrate (kbps) out of range.</li>.
<Li>VideoDecodeFailed: indicates a video decoding error.</li>.
<Li>AudioDecodeFailed: audio decoding error.</li>.
<Li>AudioOutOfPhase: specifies opposite phase in dual-channel audio.</li>.
<Li>VideoDuplicatedFrame: indicates duplicate frames in video streams.</li>.
<Li>AudioDuplicatedFrame: indicates duplicate frames in audio streams.</li>.
<Li>VideoRotation: specifies video rotation.</li>.
<li>TsMultiPrograms: specifies multiple programs in MPEG2-TS streams.</li>.
<li>Mp4InvalidCodecFourcc: specifies the codec fourcc in Mp4 does not meet Apple HLS requirements.</li>.
<Li>HLSBadM3u8Format: invalid m3u8 file.</li>.
<Li>HLSInvalidMasterM3u8: invalid main m3u8 file.</li>.
<Li>HLSInvalidMediaM3u8: invalid media m3u8 file.</li>.
<Li>HLSMasterM3u8Recommended: parameters recommended by standards missing in main m3u8.</li>.
<Li>HLSMediaM3u8Recommended: parameters recommended by standards missing in media m3u8.</li>.
<li>HLSMediaM3u8DiscontinuityExist: indicates the existence of EXT-X-DISCONTINUITY in media m3u8.</li>.
<Li>HLSMediaSegmentsStreamNumChange: indicates the number of streams in segments changes.</li>.
<li>HLSMediaSegmentsPTSJitterDeviation: indicates PTS jumps between segments without EXT-X-DISCONTINUITY.</li>.
<li>HLSMediaSegmentsDTSJitterDeviation: indicates DTS jumps between segments without EXT-X-DISCONTINUITY.</li>.
<li>TimecodeTrackExist: TMCD track in MP4.</li>
     * @param Type Quality inspection item name. valid values:.
<li>LowEvaluation: specifies the no-reference MOS score of the video.</li>.
<li>AudioEvaluation: specifies the no-reference MOS score of the audio.</li>.
<Li>Mosaic: mosaic detection.</li>.
<Li>CrashScreen: specifies screen glitch detection.</li>.
<Li>Blur: specifies blur detection.</li>.
<Li>Jitter: jitter detection.</li>.
<Li>Noise: noise detection.</li>.
<Li>QRCode: qr code detection.</li>.
<Li>BarCode: specifies barcode detection.</li>.
<Li>AppletCode: specifies mini program code detection.</li>.
<Li>BlackWhiteEdge: specifies black and white edge detection.</li>.
<Li>SolidColorScreen: specifies solid color screen detection.</li>.
<Li>LowLighting: specifies low light.</li>.
<Li>HighLighting: overexposure.</li>.
<Li>NoVoice: specifies silence detection.</li>.
<Li>LowVoice: specifies bass detection.</li>.
<Li>HighVoice: explosion noise detection.</li>.
<Li>AudioNoise: specifies audio noise detection.</li>.
<Li>VideoResolutionChanged: specifies the video resolution change.</li>.
<Li>AudioSampleRateChanged: specifies the audio sample rate change.</li>.
<Li>AudioChannelsChanged: indicates the audio channel quantity change.</li>.
<Li>ParameterSetsChanged: indicates the stream parameter set information has changed.</li>.
<Li>DarOrSarInvalid: indicates an abnormal video aspect ratio.</li>.
<li>TimestampFallback: specifies DTS timestamp rollback.</li>.
<li>DtsJitter: specifies excessive DTS jitter.</li>.
<li>PtsJitter: indicates excessive PTS jitter.</li>.
<Li>AACDurationDeviation: specifies an improper aac frame timestamp interval.</li>.
<Li>AudioDroppingFrames: indicates audio frame dropping.</li>.
<Li>VideoDroppingFrames: specifies video frame dropping.</li>.
<Li>AVTimestampInterleave: improper audio-video interleaving.</li>.
<Li>PtsLessThanDts: specifies that the pts of the media stream is less than the dts.</li>.
<Li>ReceiveFpsJitter: specifies excessive jitter in the network received frame rate.</li>.
<Li>ReceiveFpsTooSmall: indicates the network received video frame rate is too low.</li>.
<li>FpsJitter: specifies excessive jitter in the stream frame rate calculated via PTS.</li>.
<Li>StreamOpenFailed: indicates the stream open failure.</li>.
<Li>StreamEnd: specifies the stream end.</li>.
<Li>StreamParseFailed: specifies the stream parsing failure.</li>.
<li>VideoFirstFrameNotIdr: first frame not an IDR frame.</li>.
<Li>StreamNALUError: indicates an nalu start code error.</li>.
<li>TsStreamNoAud: specifies whether the mpegts H26x stream misses AUD NALU.</li>.
<Li>AudioStreamLack: no audio stream.</li>.
<Li>VideoStreamLack: no video stream.</li>.
<Li>LackAudioRecover: specifies missing audio stream recovery.</li>.
<Li>LackVideoRecover: missing video stream recovery.</li>.
<Li>VideoBitrateOutofRange: video stream bitrate (kbps) out of range.</li>.
<Li>AudioBitrateOutofRange: audio stream bitrate (kbps) out of range.</li>.
<Li>VideoDecodeFailed: indicates a video decoding error.</li>.
<Li>AudioDecodeFailed: audio decoding error.</li>.
<Li>AudioOutOfPhase: specifies opposite phase in dual-channel audio.</li>.
<Li>VideoDuplicatedFrame: indicates duplicate frames in video streams.</li>.
<Li>AudioDuplicatedFrame: indicates duplicate frames in audio streams.</li>.
<Li>VideoRotation: specifies video rotation.</li>.
<li>TsMultiPrograms: specifies multiple programs in MPEG2-TS streams.</li>.
<li>Mp4InvalidCodecFourcc: specifies the codec fourcc in Mp4 does not meet Apple HLS requirements.</li>.
<Li>HLSBadM3u8Format: invalid m3u8 file.</li>.
<Li>HLSInvalidMasterM3u8: invalid main m3u8 file.</li>.
<Li>HLSInvalidMediaM3u8: invalid media m3u8 file.</li>.
<Li>HLSMasterM3u8Recommended: parameters recommended by standards missing in main m3u8.</li>.
<Li>HLSMediaM3u8Recommended: parameters recommended by standards missing in media m3u8.</li>.
<li>HLSMediaM3u8DiscontinuityExist: indicates the existence of EXT-X-DISCONTINUITY in media m3u8.</li>.
<Li>HLSMediaSegmentsStreamNumChange: indicates the number of streams in segments changes.</li>.
<li>HLSMediaSegmentsPTSJitterDeviation: indicates PTS jumps between segments without EXT-X-DISCONTINUITY.</li>.
<li>HLSMediaSegmentsDTSJitterDeviation: indicates DTS jumps between segments without EXT-X-DISCONTINUITY.</li>.
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

