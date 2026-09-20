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

public class QualityInspectConfig extends AbstractModel {

    /**
    * <p>Detection item name.</p><p>Enumeration values:</p><ul><li>LowEvaluation: No-reference video score (MOS)</li><li>AudioEvaluation: No-reference audio score (MOS)</li><li>Mosaic: Mosaic detection</li><li>CrashScreen: Screen glitch detection</li><li>Blur: Blur detection</li><li>Jitter: Jitter detection</li><li>Noise: Noise detection</li><li>QRCode: QR code detection</li><li>BarCode: BarCode detection</li><li>AppletCode: Mini program code detection</li><li>BlackWhiteEdge: Black and white edge detection</li><li>SolidColorScreen: Solid color screen detection</li><li>LowLighting: Low illumination</li><li>HighLighting: Overexposure</li><li>NoVoice: Silence detection</li><li>LowVoice: Bass detection</li><li>HighVoice: Explosion Noise detection</li><li>AudioNoise: Audio Noise detection</li><li>VideoResolutionChanged: Video resolution change</li><li>AudioSampleRateChanged: Audio sampling rate change</li><li>AudioChannelsChanged: Audio channels changed</li><li>ParameterSetsChanged: Stream parameter set information changed</li><li>DarOrSarInvalid: Abnormal video aspect ratio</li><li>TimestampFallback: DTS timestamp fallback</li><li>DtsJitter: Excessive DTS Jitter</li><li>PtsJitter: Excessive PTS Jitter</li><li>AACDurationDeviation: Unreasonable AAC frame timestamp interval</li><li>AudioDroppingFrames: Audio frame loss</li><li>VideoDroppingFrames: Video frame loss</li><li>AVTimestampInterleave: Improper audio-video interleaving</li><li>PtsLessThanDts: media stream PTS less than DTS</li><li>ReceiveFpsJitter: Excessive network received frame rate Jitter</li><li>ReceiveFpsTooSmall: Network received video frame rate too small</li><li>FpsJitter: Excessive stream frame rate Jitter calculated by PTS</li><li>StreamOpenFailed: Stream open failure</li><li>StreamEnd: Stream end</li><li>StreamParseFailed: Stream parsing failure</li><li>VideoFirstFrameNotIdr: First frame not an IDR frame</li><li>StreamNALUError: NALU Start Code Error</li><li>TsStreamNoAud: H26x stream in MPEG-TS lacks AUD NALU</li><li>AudioStreamLack: No audio stream</li><li>VideoStreamLack: No video stream</li><li>LackAudioRecover: Missing audio stream recovery</li><li>LackVideoRecover: Missing video stream recovery</li><li>VideoBitrateOutofRange: Video stream bitrate (kbps) out of range</li><li>AudioBitrateOutofRange: Audio stream bitrate (kbps) out of range</li><li>VideoDecodeFailed: Video decoding error</li><li>AudioDecodeFailed: Audio decoding error</li><li>AudioOutOfPhase: Opposite phase in dual-channel audio</li><li>VideoDuplicatedFrame: Duplicate frames in video streams</li><li>AudioDuplicatedFrame: Duplicate frames in audio streams</li><li>VideoRotation: Video rotation</li><li>TsMultiPrograms: MPEG2-TS stream has multiple programs</li><li>Mp4InvalidCodecFourcc: codec fourcc in Mp4 does not meet Apple HLS requirements</li><li>HLSBadM3u8Format: Invalid m3u8 file</li><li>HLSInvalidMasterM3u8: Invalid main m3u8 file</li><li>HLSInvalidMediaM3u8: Invalid media m3u8 file</li><li>HLSMasterM3u8Recommended: main m3u8 lacks standard Recommended parameters</li><li>HLSMediaM3u8Recommended: media m3u8 lacks standard Recommended parameters</li><li>HLSMediaM3u8DiscontinuityExist: media m3u8 contains EXT-x-DISCONTINUITY</li><li>HLSMediaSegmentsStreamNumChange: Number of streams in segments changes</li><li>HLSMediaSegmentsPTSJitterDeviation: PTS jump between slices without EXT-x-DISCONTINUITY</li><li>HLSMediaSegmentsDTSJitterDeviation: DTS jump between slices without EXT-x-DISCONTINUITY</li><li>TimecodeTrackExist: Mp4 contains tmcd track</li><li>BodyPoseCheck: Abnormal human body pose</li><li>BodyDetailCheck: Abnormal human body detail</li><li>PhysicRulesCheck: Physical rule violation</li><li>ObjectConsistencyCheck:</li></ul>Object consistency anomaly</li><li>FormatCheck: Format exception</li><li>AudioReverb: Reverberation level</li><li>AudioDiscontinuity: Audio discontinuity</li><li>AudioSpeechQuality: Speech clarity</li><li>AudioHighLoudness: Loudness distortion</li><li>AudioLoudnessJitter: Severe volume change</li><li>BackgroundMusic: Background music exists</li><li>NoBackgroundMusic: No background music</li><li>VideoAesthetic: Video aesthetic score</li><li>AudioVideoAsync: Audio and video out of sync</li><li>AudioSubtitleAsync: Audio and subtitle out of sync</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Capability configuration switch.</p><p>Enumeration values: </p><ul><li>ON: Enable.</li><li>OFF: Disable.</li></ul><p>Default value: ON</p>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>Sampling method</p><p>Enumeration values:</p><ul><li>Time: Sampling based on time interval.</li></ul>
    */
    @SerializedName("Sampling")
    @Expose
    private String Sampling;

    /**
    * <p>Sampling interval time</p><p>Measurement unit: ms.</p>
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * <p>Duration of abnormality.</p><p>Measurement unit: millisecond.</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>Threshold of a detection item. Different detection items have different thresholds.</p>
    */
    @SerializedName("Threshold")
    @Expose
    private String Threshold;

    /**
     * Get <p>Detection item name.</p><p>Enumeration values:</p><ul><li>LowEvaluation: No-reference video score (MOS)</li><li>AudioEvaluation: No-reference audio score (MOS)</li><li>Mosaic: Mosaic detection</li><li>CrashScreen: Screen glitch detection</li><li>Blur: Blur detection</li><li>Jitter: Jitter detection</li><li>Noise: Noise detection</li><li>QRCode: QR code detection</li><li>BarCode: BarCode detection</li><li>AppletCode: Mini program code detection</li><li>BlackWhiteEdge: Black and white edge detection</li><li>SolidColorScreen: Solid color screen detection</li><li>LowLighting: Low illumination</li><li>HighLighting: Overexposure</li><li>NoVoice: Silence detection</li><li>LowVoice: Bass detection</li><li>HighVoice: Explosion Noise detection</li><li>AudioNoise: Audio Noise detection</li><li>VideoResolutionChanged: Video resolution change</li><li>AudioSampleRateChanged: Audio sampling rate change</li><li>AudioChannelsChanged: Audio channels changed</li><li>ParameterSetsChanged: Stream parameter set information changed</li><li>DarOrSarInvalid: Abnormal video aspect ratio</li><li>TimestampFallback: DTS timestamp fallback</li><li>DtsJitter: Excessive DTS Jitter</li><li>PtsJitter: Excessive PTS Jitter</li><li>AACDurationDeviation: Unreasonable AAC frame timestamp interval</li><li>AudioDroppingFrames: Audio frame loss</li><li>VideoDroppingFrames: Video frame loss</li><li>AVTimestampInterleave: Improper audio-video interleaving</li><li>PtsLessThanDts: media stream PTS less than DTS</li><li>ReceiveFpsJitter: Excessive network received frame rate Jitter</li><li>ReceiveFpsTooSmall: Network received video frame rate too small</li><li>FpsJitter: Excessive stream frame rate Jitter calculated by PTS</li><li>StreamOpenFailed: Stream open failure</li><li>StreamEnd: Stream end</li><li>StreamParseFailed: Stream parsing failure</li><li>VideoFirstFrameNotIdr: First frame not an IDR frame</li><li>StreamNALUError: NALU Start Code Error</li><li>TsStreamNoAud: H26x stream in MPEG-TS lacks AUD NALU</li><li>AudioStreamLack: No audio stream</li><li>VideoStreamLack: No video stream</li><li>LackAudioRecover: Missing audio stream recovery</li><li>LackVideoRecover: Missing video stream recovery</li><li>VideoBitrateOutofRange: Video stream bitrate (kbps) out of range</li><li>AudioBitrateOutofRange: Audio stream bitrate (kbps) out of range</li><li>VideoDecodeFailed: Video decoding error</li><li>AudioDecodeFailed: Audio decoding error</li><li>AudioOutOfPhase: Opposite phase in dual-channel audio</li><li>VideoDuplicatedFrame: Duplicate frames in video streams</li><li>AudioDuplicatedFrame: Duplicate frames in audio streams</li><li>VideoRotation: Video rotation</li><li>TsMultiPrograms: MPEG2-TS stream has multiple programs</li><li>Mp4InvalidCodecFourcc: codec fourcc in Mp4 does not meet Apple HLS requirements</li><li>HLSBadM3u8Format: Invalid m3u8 file</li><li>HLSInvalidMasterM3u8: Invalid main m3u8 file</li><li>HLSInvalidMediaM3u8: Invalid media m3u8 file</li><li>HLSMasterM3u8Recommended: main m3u8 lacks standard Recommended parameters</li><li>HLSMediaM3u8Recommended: media m3u8 lacks standard Recommended parameters</li><li>HLSMediaM3u8DiscontinuityExist: media m3u8 contains EXT-x-DISCONTINUITY</li><li>HLSMediaSegmentsStreamNumChange: Number of streams in segments changes</li><li>HLSMediaSegmentsPTSJitterDeviation: PTS jump between slices without EXT-x-DISCONTINUITY</li><li>HLSMediaSegmentsDTSJitterDeviation: DTS jump between slices without EXT-x-DISCONTINUITY</li><li>TimecodeTrackExist: Mp4 contains tmcd track</li><li>BodyPoseCheck: Abnormal human body pose</li><li>BodyDetailCheck: Abnormal human body detail</li><li>PhysicRulesCheck: Physical rule violation</li><li>ObjectConsistencyCheck:</li></ul>Object consistency anomaly</li><li>FormatCheck: Format exception</li><li>AudioReverb: Reverberation level</li><li>AudioDiscontinuity: Audio discontinuity</li><li>AudioSpeechQuality: Speech clarity</li><li>AudioHighLoudness: Loudness distortion</li><li>AudioLoudnessJitter: Severe volume change</li><li>BackgroundMusic: Background music exists</li><li>NoBackgroundMusic: No background music</li><li>VideoAesthetic: Video aesthetic score</li><li>AudioVideoAsync: Audio and video out of sync</li><li>AudioSubtitleAsync: Audio and subtitle out of sync</li></ul> 
     * @return Type <p>Detection item name.</p><p>Enumeration values:</p><ul><li>LowEvaluation: No-reference video score (MOS)</li><li>AudioEvaluation: No-reference audio score (MOS)</li><li>Mosaic: Mosaic detection</li><li>CrashScreen: Screen glitch detection</li><li>Blur: Blur detection</li><li>Jitter: Jitter detection</li><li>Noise: Noise detection</li><li>QRCode: QR code detection</li><li>BarCode: BarCode detection</li><li>AppletCode: Mini program code detection</li><li>BlackWhiteEdge: Black and white edge detection</li><li>SolidColorScreen: Solid color screen detection</li><li>LowLighting: Low illumination</li><li>HighLighting: Overexposure</li><li>NoVoice: Silence detection</li><li>LowVoice: Bass detection</li><li>HighVoice: Explosion Noise detection</li><li>AudioNoise: Audio Noise detection</li><li>VideoResolutionChanged: Video resolution change</li><li>AudioSampleRateChanged: Audio sampling rate change</li><li>AudioChannelsChanged: Audio channels changed</li><li>ParameterSetsChanged: Stream parameter set information changed</li><li>DarOrSarInvalid: Abnormal video aspect ratio</li><li>TimestampFallback: DTS timestamp fallback</li><li>DtsJitter: Excessive DTS Jitter</li><li>PtsJitter: Excessive PTS Jitter</li><li>AACDurationDeviation: Unreasonable AAC frame timestamp interval</li><li>AudioDroppingFrames: Audio frame loss</li><li>VideoDroppingFrames: Video frame loss</li><li>AVTimestampInterleave: Improper audio-video interleaving</li><li>PtsLessThanDts: media stream PTS less than DTS</li><li>ReceiveFpsJitter: Excessive network received frame rate Jitter</li><li>ReceiveFpsTooSmall: Network received video frame rate too small</li><li>FpsJitter: Excessive stream frame rate Jitter calculated by PTS</li><li>StreamOpenFailed: Stream open failure</li><li>StreamEnd: Stream end</li><li>StreamParseFailed: Stream parsing failure</li><li>VideoFirstFrameNotIdr: First frame not an IDR frame</li><li>StreamNALUError: NALU Start Code Error</li><li>TsStreamNoAud: H26x stream in MPEG-TS lacks AUD NALU</li><li>AudioStreamLack: No audio stream</li><li>VideoStreamLack: No video stream</li><li>LackAudioRecover: Missing audio stream recovery</li><li>LackVideoRecover: Missing video stream recovery</li><li>VideoBitrateOutofRange: Video stream bitrate (kbps) out of range</li><li>AudioBitrateOutofRange: Audio stream bitrate (kbps) out of range</li><li>VideoDecodeFailed: Video decoding error</li><li>AudioDecodeFailed: Audio decoding error</li><li>AudioOutOfPhase: Opposite phase in dual-channel audio</li><li>VideoDuplicatedFrame: Duplicate frames in video streams</li><li>AudioDuplicatedFrame: Duplicate frames in audio streams</li><li>VideoRotation: Video rotation</li><li>TsMultiPrograms: MPEG2-TS stream has multiple programs</li><li>Mp4InvalidCodecFourcc: codec fourcc in Mp4 does not meet Apple HLS requirements</li><li>HLSBadM3u8Format: Invalid m3u8 file</li><li>HLSInvalidMasterM3u8: Invalid main m3u8 file</li><li>HLSInvalidMediaM3u8: Invalid media m3u8 file</li><li>HLSMasterM3u8Recommended: main m3u8 lacks standard Recommended parameters</li><li>HLSMediaM3u8Recommended: media m3u8 lacks standard Recommended parameters</li><li>HLSMediaM3u8DiscontinuityExist: media m3u8 contains EXT-x-DISCONTINUITY</li><li>HLSMediaSegmentsStreamNumChange: Number of streams in segments changes</li><li>HLSMediaSegmentsPTSJitterDeviation: PTS jump between slices without EXT-x-DISCONTINUITY</li><li>HLSMediaSegmentsDTSJitterDeviation: DTS jump between slices without EXT-x-DISCONTINUITY</li><li>TimecodeTrackExist: Mp4 contains tmcd track</li><li>BodyPoseCheck: Abnormal human body pose</li><li>BodyDetailCheck: Abnormal human body detail</li><li>PhysicRulesCheck: Physical rule violation</li><li>ObjectConsistencyCheck:</li></ul>Object consistency anomaly</li><li>FormatCheck: Format exception</li><li>AudioReverb: Reverberation level</li><li>AudioDiscontinuity: Audio discontinuity</li><li>AudioSpeechQuality: Speech clarity</li><li>AudioHighLoudness: Loudness distortion</li><li>AudioLoudnessJitter: Severe volume change</li><li>BackgroundMusic: Background music exists</li><li>NoBackgroundMusic: No background music</li><li>VideoAesthetic: Video aesthetic score</li><li>AudioVideoAsync: Audio and video out of sync</li><li>AudioSubtitleAsync: Audio and subtitle out of sync</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Detection item name.</p><p>Enumeration values:</p><ul><li>LowEvaluation: No-reference video score (MOS)</li><li>AudioEvaluation: No-reference audio score (MOS)</li><li>Mosaic: Mosaic detection</li><li>CrashScreen: Screen glitch detection</li><li>Blur: Blur detection</li><li>Jitter: Jitter detection</li><li>Noise: Noise detection</li><li>QRCode: QR code detection</li><li>BarCode: BarCode detection</li><li>AppletCode: Mini program code detection</li><li>BlackWhiteEdge: Black and white edge detection</li><li>SolidColorScreen: Solid color screen detection</li><li>LowLighting: Low illumination</li><li>HighLighting: Overexposure</li><li>NoVoice: Silence detection</li><li>LowVoice: Bass detection</li><li>HighVoice: Explosion Noise detection</li><li>AudioNoise: Audio Noise detection</li><li>VideoResolutionChanged: Video resolution change</li><li>AudioSampleRateChanged: Audio sampling rate change</li><li>AudioChannelsChanged: Audio channels changed</li><li>ParameterSetsChanged: Stream parameter set information changed</li><li>DarOrSarInvalid: Abnormal video aspect ratio</li><li>TimestampFallback: DTS timestamp fallback</li><li>DtsJitter: Excessive DTS Jitter</li><li>PtsJitter: Excessive PTS Jitter</li><li>AACDurationDeviation: Unreasonable AAC frame timestamp interval</li><li>AudioDroppingFrames: Audio frame loss</li><li>VideoDroppingFrames: Video frame loss</li><li>AVTimestampInterleave: Improper audio-video interleaving</li><li>PtsLessThanDts: media stream PTS less than DTS</li><li>ReceiveFpsJitter: Excessive network received frame rate Jitter</li><li>ReceiveFpsTooSmall: Network received video frame rate too small</li><li>FpsJitter: Excessive stream frame rate Jitter calculated by PTS</li><li>StreamOpenFailed: Stream open failure</li><li>StreamEnd: Stream end</li><li>StreamParseFailed: Stream parsing failure</li><li>VideoFirstFrameNotIdr: First frame not an IDR frame</li><li>StreamNALUError: NALU Start Code Error</li><li>TsStreamNoAud: H26x stream in MPEG-TS lacks AUD NALU</li><li>AudioStreamLack: No audio stream</li><li>VideoStreamLack: No video stream</li><li>LackAudioRecover: Missing audio stream recovery</li><li>LackVideoRecover: Missing video stream recovery</li><li>VideoBitrateOutofRange: Video stream bitrate (kbps) out of range</li><li>AudioBitrateOutofRange: Audio stream bitrate (kbps) out of range</li><li>VideoDecodeFailed: Video decoding error</li><li>AudioDecodeFailed: Audio decoding error</li><li>AudioOutOfPhase: Opposite phase in dual-channel audio</li><li>VideoDuplicatedFrame: Duplicate frames in video streams</li><li>AudioDuplicatedFrame: Duplicate frames in audio streams</li><li>VideoRotation: Video rotation</li><li>TsMultiPrograms: MPEG2-TS stream has multiple programs</li><li>Mp4InvalidCodecFourcc: codec fourcc in Mp4 does not meet Apple HLS requirements</li><li>HLSBadM3u8Format: Invalid m3u8 file</li><li>HLSInvalidMasterM3u8: Invalid main m3u8 file</li><li>HLSInvalidMediaM3u8: Invalid media m3u8 file</li><li>HLSMasterM3u8Recommended: main m3u8 lacks standard Recommended parameters</li><li>HLSMediaM3u8Recommended: media m3u8 lacks standard Recommended parameters</li><li>HLSMediaM3u8DiscontinuityExist: media m3u8 contains EXT-x-DISCONTINUITY</li><li>HLSMediaSegmentsStreamNumChange: Number of streams in segments changes</li><li>HLSMediaSegmentsPTSJitterDeviation: PTS jump between slices without EXT-x-DISCONTINUITY</li><li>HLSMediaSegmentsDTSJitterDeviation: DTS jump between slices without EXT-x-DISCONTINUITY</li><li>TimecodeTrackExist: Mp4 contains tmcd track</li><li>BodyPoseCheck: Abnormal human body pose</li><li>BodyDetailCheck: Abnormal human body detail</li><li>PhysicRulesCheck: Physical rule violation</li><li>ObjectConsistencyCheck:</li></ul>Object consistency anomaly</li><li>FormatCheck: Format exception</li><li>AudioReverb: Reverberation level</li><li>AudioDiscontinuity: Audio discontinuity</li><li>AudioSpeechQuality: Speech clarity</li><li>AudioHighLoudness: Loudness distortion</li><li>AudioLoudnessJitter: Severe volume change</li><li>BackgroundMusic: Background music exists</li><li>NoBackgroundMusic: No background music</li><li>VideoAesthetic: Video aesthetic score</li><li>AudioVideoAsync: Audio and video out of sync</li><li>AudioSubtitleAsync: Audio and subtitle out of sync</li></ul>
     * @param Type <p>Detection item name.</p><p>Enumeration values:</p><ul><li>LowEvaluation: No-reference video score (MOS)</li><li>AudioEvaluation: No-reference audio score (MOS)</li><li>Mosaic: Mosaic detection</li><li>CrashScreen: Screen glitch detection</li><li>Blur: Blur detection</li><li>Jitter: Jitter detection</li><li>Noise: Noise detection</li><li>QRCode: QR code detection</li><li>BarCode: BarCode detection</li><li>AppletCode: Mini program code detection</li><li>BlackWhiteEdge: Black and white edge detection</li><li>SolidColorScreen: Solid color screen detection</li><li>LowLighting: Low illumination</li><li>HighLighting: Overexposure</li><li>NoVoice: Silence detection</li><li>LowVoice: Bass detection</li><li>HighVoice: Explosion Noise detection</li><li>AudioNoise: Audio Noise detection</li><li>VideoResolutionChanged: Video resolution change</li><li>AudioSampleRateChanged: Audio sampling rate change</li><li>AudioChannelsChanged: Audio channels changed</li><li>ParameterSetsChanged: Stream parameter set information changed</li><li>DarOrSarInvalid: Abnormal video aspect ratio</li><li>TimestampFallback: DTS timestamp fallback</li><li>DtsJitter: Excessive DTS Jitter</li><li>PtsJitter: Excessive PTS Jitter</li><li>AACDurationDeviation: Unreasonable AAC frame timestamp interval</li><li>AudioDroppingFrames: Audio frame loss</li><li>VideoDroppingFrames: Video frame loss</li><li>AVTimestampInterleave: Improper audio-video interleaving</li><li>PtsLessThanDts: media stream PTS less than DTS</li><li>ReceiveFpsJitter: Excessive network received frame rate Jitter</li><li>ReceiveFpsTooSmall: Network received video frame rate too small</li><li>FpsJitter: Excessive stream frame rate Jitter calculated by PTS</li><li>StreamOpenFailed: Stream open failure</li><li>StreamEnd: Stream end</li><li>StreamParseFailed: Stream parsing failure</li><li>VideoFirstFrameNotIdr: First frame not an IDR frame</li><li>StreamNALUError: NALU Start Code Error</li><li>TsStreamNoAud: H26x stream in MPEG-TS lacks AUD NALU</li><li>AudioStreamLack: No audio stream</li><li>VideoStreamLack: No video stream</li><li>LackAudioRecover: Missing audio stream recovery</li><li>LackVideoRecover: Missing video stream recovery</li><li>VideoBitrateOutofRange: Video stream bitrate (kbps) out of range</li><li>AudioBitrateOutofRange: Audio stream bitrate (kbps) out of range</li><li>VideoDecodeFailed: Video decoding error</li><li>AudioDecodeFailed: Audio decoding error</li><li>AudioOutOfPhase: Opposite phase in dual-channel audio</li><li>VideoDuplicatedFrame: Duplicate frames in video streams</li><li>AudioDuplicatedFrame: Duplicate frames in audio streams</li><li>VideoRotation: Video rotation</li><li>TsMultiPrograms: MPEG2-TS stream has multiple programs</li><li>Mp4InvalidCodecFourcc: codec fourcc in Mp4 does not meet Apple HLS requirements</li><li>HLSBadM3u8Format: Invalid m3u8 file</li><li>HLSInvalidMasterM3u8: Invalid main m3u8 file</li><li>HLSInvalidMediaM3u8: Invalid media m3u8 file</li><li>HLSMasterM3u8Recommended: main m3u8 lacks standard Recommended parameters</li><li>HLSMediaM3u8Recommended: media m3u8 lacks standard Recommended parameters</li><li>HLSMediaM3u8DiscontinuityExist: media m3u8 contains EXT-x-DISCONTINUITY</li><li>HLSMediaSegmentsStreamNumChange: Number of streams in segments changes</li><li>HLSMediaSegmentsPTSJitterDeviation: PTS jump between slices without EXT-x-DISCONTINUITY</li><li>HLSMediaSegmentsDTSJitterDeviation: DTS jump between slices without EXT-x-DISCONTINUITY</li><li>TimecodeTrackExist: Mp4 contains tmcd track</li><li>BodyPoseCheck: Abnormal human body pose</li><li>BodyDetailCheck: Abnormal human body detail</li><li>PhysicRulesCheck: Physical rule violation</li><li>ObjectConsistencyCheck:</li></ul>Object consistency anomaly</li><li>FormatCheck: Format exception</li><li>AudioReverb: Reverberation level</li><li>AudioDiscontinuity: Audio discontinuity</li><li>AudioSpeechQuality: Speech clarity</li><li>AudioHighLoudness: Loudness distortion</li><li>AudioLoudnessJitter: Severe volume change</li><li>BackgroundMusic: Background music exists</li><li>NoBackgroundMusic: No background music</li><li>VideoAesthetic: Video aesthetic score</li><li>AudioVideoAsync: Audio and video out of sync</li><li>AudioSubtitleAsync: Audio and subtitle out of sync</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Capability configuration switch.</p><p>Enumeration values: </p><ul><li>ON: Enable.</li><li>OFF: Disable.</li></ul><p>Default value: ON</p> 
     * @return Switch <p>Capability configuration switch.</p><p>Enumeration values: </p><ul><li>ON: Enable.</li><li>OFF: Disable.</li></ul><p>Default value: ON</p>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>Capability configuration switch.</p><p>Enumeration values: </p><ul><li>ON: Enable.</li><li>OFF: Disable.</li></ul><p>Default value: ON</p>
     * @param Switch <p>Capability configuration switch.</p><p>Enumeration values: </p><ul><li>ON: Enable.</li><li>OFF: Disable.</li></ul><p>Default value: ON</p>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>Sampling method</p><p>Enumeration values:</p><ul><li>Time: Sampling based on time interval.</li></ul> 
     * @return Sampling <p>Sampling method</p><p>Enumeration values:</p><ul><li>Time: Sampling based on time interval.</li></ul>
     */
    public String getSampling() {
        return this.Sampling;
    }

    /**
     * Set <p>Sampling method</p><p>Enumeration values:</p><ul><li>Time: Sampling based on time interval.</li></ul>
     * @param Sampling <p>Sampling method</p><p>Enumeration values:</p><ul><li>Time: Sampling based on time interval.</li></ul>
     */
    public void setSampling(String Sampling) {
        this.Sampling = Sampling;
    }

    /**
     * Get <p>Sampling interval time</p><p>Measurement unit: ms.</p> 
     * @return IntervalTime <p>Sampling interval time</p><p>Measurement unit: ms.</p>
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set <p>Sampling interval time</p><p>Measurement unit: ms.</p>
     * @param IntervalTime <p>Sampling interval time</p><p>Measurement unit: ms.</p>
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get <p>Duration of abnormality.</p><p>Measurement unit: millisecond.</p> 
     * @return Duration <p>Duration of abnormality.</p><p>Measurement unit: millisecond.</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>Duration of abnormality.</p><p>Measurement unit: millisecond.</p>
     * @param Duration <p>Duration of abnormality.</p><p>Measurement unit: millisecond.</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>Threshold of a detection item. Different detection items have different thresholds.</p> 
     * @return Threshold <p>Threshold of a detection item. Different detection items have different thresholds.</p>
     */
    public String getThreshold() {
        return this.Threshold;
    }

    /**
     * Set <p>Threshold of a detection item. Different detection items have different thresholds.</p>
     * @param Threshold <p>Threshold of a detection item. Different detection items have different thresholds.</p>
     */
    public void setThreshold(String Threshold) {
        this.Threshold = Threshold;
    }

    public QualityInspectConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectConfig(QualityInspectConfig source) {
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

