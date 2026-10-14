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

public class ContainerDiagnoseResultItem extends AbstractModel {

    /**
    * Diagnosed exception category. Valid values:
DecodeParamException: decoding parameter exception
TimeStampException: timestamp exception.
FrameException: frame rate exception.
StreamStatusException: stream status exception.
StreamInfo: stream information exception.
StreamAbnormalCharacteristics: stream characteristics exception.
DecodeException: decoding exception.
HLSRequirements: HLS format exception
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Diagnosed specific exception type. Valid values:

VideoResolutionChanged: video resolution change.
AudioSampleRateChanged: audio sample rate change.
AudioChannelsChanged: audio channels changed
ParameterSetsChanged: stream parameter set information change.
DarOrSarInvalid: video aspect ratio exception.
TimestampFallback: DTS timestamp fallback
DtsJitter: DTS jitter too high.
PtsJitter: PTS jitter too high.
AACDurationDeviation: improper AAC frame timestamp interval.
AudioDroppingFrames: Audio frame dropping
VideoDroppingFrames: video frame dropping.
AVTimestampInterleave: improper audio-video interleaving.
PtsLessThanDts: The pts of the media stream is less than dts.
ReceiveFpsJitter: excessive network received frame rate jitter
ReceiveFpsTooSmall: network received video frame rate too small.
FpsJitter: Excessive stream frame rate jitter calculated by PTS.
StreamOpenFailed: stream open failure.
StreamEnd: stream end.
StreamParseFailed: stream parsing failure.
VideoFirstFrameNotIdr: first frame not an IDR frame.
StreamNALUError: NALU Start Code Error
TsStreamNoAud: The H26x stream of MPEG-TS misses AUD NALU.
AudioStreamLack: no audio stream.
VideoStreamLack: no video stream.
LackAudioRecover: missing audio stream recovery.
LackVideoRecover: missing video stream recovery.
VideoBitrateOutofRange: video stream bitrate (kbps) out of range.
AudioBitrateOutofRange: audio stream bitrate (kbps) out of range.
VideoDecodeFailed: video decoding error.
AudioDecodeFailed: audio decoding error.
AudioOutOfPhase: opposite phase in dual-channel audio.
VideoDuplicatedFrame: duplicate frames in video streams.
AudioDuplicatedFrame: duplicate frames in audio streams.
VideoRotation: video rotation.
TsMultiPrograms: MPEG2-TS stream has multiple programs
Mp4InvalidCodecFourcc: The codec fourcc in MP4 does not meet Apple HLS requirements.
HLSBadM3u8Format: invalid M3U8 file.
HLSInvalidMasterM3u8: invalid main M3U8 file.
HLSInvalidMediaM3u8: invalid media M3U8 file.
HLSMasterM3u8Recommended: parameters recommended by standards missing in main M3U8.
HLSMediaM3u8Recommended: parameters recommended by standards missing in media M3U8.
HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY in media M3U8.
HLSMediaSegmentsStreamNumChange: changed number of streams in segments.
HLSMediaSegmentsPTSJitterDeviation: PTS jumps between slices without EXT-X-DISCONTINUITY.
HLSMediaSegmentsDTSJitterDeviation: DTS jumps between segments with no EXT-X-DISCONTINUITY
TimecodeTrackExist: MP4 has a tmcd track
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Diagnosed exception level. Valid values:
Fatal: affecting subsequent playback and parsing.
Error: may affect playback.
Warning: potential risk, which may not necessarily affect playback.
Notice: Important stream information
Info: general stream information.
    */
    @SerializedName("SeverityLevel")
    @Expose
    private String SeverityLevel;

    /**
    * Timestamp of warning, format such as "2022-12-25T13:14:16Z"
    */
    @SerializedName("DateTimeSet")
    @Expose
    private String [] DateTimeSet;

    /**
    * Timestamp.
    */
    @SerializedName("TimestampSet")
    @Expose
    private Float [] TimestampSet;

    /**
     * Get Diagnosed exception category. Valid values:
DecodeParamException: decoding parameter exception
TimeStampException: timestamp exception.
FrameException: frame rate exception.
StreamStatusException: stream status exception.
StreamInfo: stream information exception.
StreamAbnormalCharacteristics: stream characteristics exception.
DecodeException: decoding exception.
HLSRequirements: HLS format exception 
     * @return Category Diagnosed exception category. Valid values:
DecodeParamException: decoding parameter exception
TimeStampException: timestamp exception.
FrameException: frame rate exception.
StreamStatusException: stream status exception.
StreamInfo: stream information exception.
StreamAbnormalCharacteristics: stream characteristics exception.
DecodeException: decoding exception.
HLSRequirements: HLS format exception
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Diagnosed exception category. Valid values:
DecodeParamException: decoding parameter exception
TimeStampException: timestamp exception.
FrameException: frame rate exception.
StreamStatusException: stream status exception.
StreamInfo: stream information exception.
StreamAbnormalCharacteristics: stream characteristics exception.
DecodeException: decoding exception.
HLSRequirements: HLS format exception
     * @param Category Diagnosed exception category. Valid values:
DecodeParamException: decoding parameter exception
TimeStampException: timestamp exception.
FrameException: frame rate exception.
StreamStatusException: stream status exception.
StreamInfo: stream information exception.
StreamAbnormalCharacteristics: stream characteristics exception.
DecodeException: decoding exception.
HLSRequirements: HLS format exception
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Diagnosed specific exception type. Valid values:

VideoResolutionChanged: video resolution change.
AudioSampleRateChanged: audio sample rate change.
AudioChannelsChanged: audio channels changed
ParameterSetsChanged: stream parameter set information change.
DarOrSarInvalid: video aspect ratio exception.
TimestampFallback: DTS timestamp fallback
DtsJitter: DTS jitter too high.
PtsJitter: PTS jitter too high.
AACDurationDeviation: improper AAC frame timestamp interval.
AudioDroppingFrames: Audio frame dropping
VideoDroppingFrames: video frame dropping.
AVTimestampInterleave: improper audio-video interleaving.
PtsLessThanDts: The pts of the media stream is less than dts.
ReceiveFpsJitter: excessive network received frame rate jitter
ReceiveFpsTooSmall: network received video frame rate too small.
FpsJitter: Excessive stream frame rate jitter calculated by PTS.
StreamOpenFailed: stream open failure.
StreamEnd: stream end.
StreamParseFailed: stream parsing failure.
VideoFirstFrameNotIdr: first frame not an IDR frame.
StreamNALUError: NALU Start Code Error
TsStreamNoAud: The H26x stream of MPEG-TS misses AUD NALU.
AudioStreamLack: no audio stream.
VideoStreamLack: no video stream.
LackAudioRecover: missing audio stream recovery.
LackVideoRecover: missing video stream recovery.
VideoBitrateOutofRange: video stream bitrate (kbps) out of range.
AudioBitrateOutofRange: audio stream bitrate (kbps) out of range.
VideoDecodeFailed: video decoding error.
AudioDecodeFailed: audio decoding error.
AudioOutOfPhase: opposite phase in dual-channel audio.
VideoDuplicatedFrame: duplicate frames in video streams.
AudioDuplicatedFrame: duplicate frames in audio streams.
VideoRotation: video rotation.
TsMultiPrograms: MPEG2-TS stream has multiple programs
Mp4InvalidCodecFourcc: The codec fourcc in MP4 does not meet Apple HLS requirements.
HLSBadM3u8Format: invalid M3U8 file.
HLSInvalidMasterM3u8: invalid main M3U8 file.
HLSInvalidMediaM3u8: invalid media M3U8 file.
HLSMasterM3u8Recommended: parameters recommended by standards missing in main M3U8.
HLSMediaM3u8Recommended: parameters recommended by standards missing in media M3U8.
HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY in media M3U8.
HLSMediaSegmentsStreamNumChange: changed number of streams in segments.
HLSMediaSegmentsPTSJitterDeviation: PTS jumps between slices without EXT-X-DISCONTINUITY.
HLSMediaSegmentsDTSJitterDeviation: DTS jumps between segments with no EXT-X-DISCONTINUITY
TimecodeTrackExist: MP4 has a tmcd track 
     * @return Type Diagnosed specific exception type. Valid values:

VideoResolutionChanged: video resolution change.
AudioSampleRateChanged: audio sample rate change.
AudioChannelsChanged: audio channels changed
ParameterSetsChanged: stream parameter set information change.
DarOrSarInvalid: video aspect ratio exception.
TimestampFallback: DTS timestamp fallback
DtsJitter: DTS jitter too high.
PtsJitter: PTS jitter too high.
AACDurationDeviation: improper AAC frame timestamp interval.
AudioDroppingFrames: Audio frame dropping
VideoDroppingFrames: video frame dropping.
AVTimestampInterleave: improper audio-video interleaving.
PtsLessThanDts: The pts of the media stream is less than dts.
ReceiveFpsJitter: excessive network received frame rate jitter
ReceiveFpsTooSmall: network received video frame rate too small.
FpsJitter: Excessive stream frame rate jitter calculated by PTS.
StreamOpenFailed: stream open failure.
StreamEnd: stream end.
StreamParseFailed: stream parsing failure.
VideoFirstFrameNotIdr: first frame not an IDR frame.
StreamNALUError: NALU Start Code Error
TsStreamNoAud: The H26x stream of MPEG-TS misses AUD NALU.
AudioStreamLack: no audio stream.
VideoStreamLack: no video stream.
LackAudioRecover: missing audio stream recovery.
LackVideoRecover: missing video stream recovery.
VideoBitrateOutofRange: video stream bitrate (kbps) out of range.
AudioBitrateOutofRange: audio stream bitrate (kbps) out of range.
VideoDecodeFailed: video decoding error.
AudioDecodeFailed: audio decoding error.
AudioOutOfPhase: opposite phase in dual-channel audio.
VideoDuplicatedFrame: duplicate frames in video streams.
AudioDuplicatedFrame: duplicate frames in audio streams.
VideoRotation: video rotation.
TsMultiPrograms: MPEG2-TS stream has multiple programs
Mp4InvalidCodecFourcc: The codec fourcc in MP4 does not meet Apple HLS requirements.
HLSBadM3u8Format: invalid M3U8 file.
HLSInvalidMasterM3u8: invalid main M3U8 file.
HLSInvalidMediaM3u8: invalid media M3U8 file.
HLSMasterM3u8Recommended: parameters recommended by standards missing in main M3U8.
HLSMediaM3u8Recommended: parameters recommended by standards missing in media M3U8.
HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY in media M3U8.
HLSMediaSegmentsStreamNumChange: changed number of streams in segments.
HLSMediaSegmentsPTSJitterDeviation: PTS jumps between slices without EXT-X-DISCONTINUITY.
HLSMediaSegmentsDTSJitterDeviation: DTS jumps between segments with no EXT-X-DISCONTINUITY
TimecodeTrackExist: MP4 has a tmcd track
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Diagnosed specific exception type. Valid values:

VideoResolutionChanged: video resolution change.
AudioSampleRateChanged: audio sample rate change.
AudioChannelsChanged: audio channels changed
ParameterSetsChanged: stream parameter set information change.
DarOrSarInvalid: video aspect ratio exception.
TimestampFallback: DTS timestamp fallback
DtsJitter: DTS jitter too high.
PtsJitter: PTS jitter too high.
AACDurationDeviation: improper AAC frame timestamp interval.
AudioDroppingFrames: Audio frame dropping
VideoDroppingFrames: video frame dropping.
AVTimestampInterleave: improper audio-video interleaving.
PtsLessThanDts: The pts of the media stream is less than dts.
ReceiveFpsJitter: excessive network received frame rate jitter
ReceiveFpsTooSmall: network received video frame rate too small.
FpsJitter: Excessive stream frame rate jitter calculated by PTS.
StreamOpenFailed: stream open failure.
StreamEnd: stream end.
StreamParseFailed: stream parsing failure.
VideoFirstFrameNotIdr: first frame not an IDR frame.
StreamNALUError: NALU Start Code Error
TsStreamNoAud: The H26x stream of MPEG-TS misses AUD NALU.
AudioStreamLack: no audio stream.
VideoStreamLack: no video stream.
LackAudioRecover: missing audio stream recovery.
LackVideoRecover: missing video stream recovery.
VideoBitrateOutofRange: video stream bitrate (kbps) out of range.
AudioBitrateOutofRange: audio stream bitrate (kbps) out of range.
VideoDecodeFailed: video decoding error.
AudioDecodeFailed: audio decoding error.
AudioOutOfPhase: opposite phase in dual-channel audio.
VideoDuplicatedFrame: duplicate frames in video streams.
AudioDuplicatedFrame: duplicate frames in audio streams.
VideoRotation: video rotation.
TsMultiPrograms: MPEG2-TS stream has multiple programs
Mp4InvalidCodecFourcc: The codec fourcc in MP4 does not meet Apple HLS requirements.
HLSBadM3u8Format: invalid M3U8 file.
HLSInvalidMasterM3u8: invalid main M3U8 file.
HLSInvalidMediaM3u8: invalid media M3U8 file.
HLSMasterM3u8Recommended: parameters recommended by standards missing in main M3U8.
HLSMediaM3u8Recommended: parameters recommended by standards missing in media M3U8.
HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY in media M3U8.
HLSMediaSegmentsStreamNumChange: changed number of streams in segments.
HLSMediaSegmentsPTSJitterDeviation: PTS jumps between slices without EXT-X-DISCONTINUITY.
HLSMediaSegmentsDTSJitterDeviation: DTS jumps between segments with no EXT-X-DISCONTINUITY
TimecodeTrackExist: MP4 has a tmcd track
     * @param Type Diagnosed specific exception type. Valid values:

VideoResolutionChanged: video resolution change.
AudioSampleRateChanged: audio sample rate change.
AudioChannelsChanged: audio channels changed
ParameterSetsChanged: stream parameter set information change.
DarOrSarInvalid: video aspect ratio exception.
TimestampFallback: DTS timestamp fallback
DtsJitter: DTS jitter too high.
PtsJitter: PTS jitter too high.
AACDurationDeviation: improper AAC frame timestamp interval.
AudioDroppingFrames: Audio frame dropping
VideoDroppingFrames: video frame dropping.
AVTimestampInterleave: improper audio-video interleaving.
PtsLessThanDts: The pts of the media stream is less than dts.
ReceiveFpsJitter: excessive network received frame rate jitter
ReceiveFpsTooSmall: network received video frame rate too small.
FpsJitter: Excessive stream frame rate jitter calculated by PTS.
StreamOpenFailed: stream open failure.
StreamEnd: stream end.
StreamParseFailed: stream parsing failure.
VideoFirstFrameNotIdr: first frame not an IDR frame.
StreamNALUError: NALU Start Code Error
TsStreamNoAud: The H26x stream of MPEG-TS misses AUD NALU.
AudioStreamLack: no audio stream.
VideoStreamLack: no video stream.
LackAudioRecover: missing audio stream recovery.
LackVideoRecover: missing video stream recovery.
VideoBitrateOutofRange: video stream bitrate (kbps) out of range.
AudioBitrateOutofRange: audio stream bitrate (kbps) out of range.
VideoDecodeFailed: video decoding error.
AudioDecodeFailed: audio decoding error.
AudioOutOfPhase: opposite phase in dual-channel audio.
VideoDuplicatedFrame: duplicate frames in video streams.
AudioDuplicatedFrame: duplicate frames in audio streams.
VideoRotation: video rotation.
TsMultiPrograms: MPEG2-TS stream has multiple programs
Mp4InvalidCodecFourcc: The codec fourcc in MP4 does not meet Apple HLS requirements.
HLSBadM3u8Format: invalid M3U8 file.
HLSInvalidMasterM3u8: invalid main M3U8 file.
HLSInvalidMediaM3u8: invalid media M3U8 file.
HLSMasterM3u8Recommended: parameters recommended by standards missing in main M3U8.
HLSMediaM3u8Recommended: parameters recommended by standards missing in media M3U8.
HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY in media M3U8.
HLSMediaSegmentsStreamNumChange: changed number of streams in segments.
HLSMediaSegmentsPTSJitterDeviation: PTS jumps between slices without EXT-X-DISCONTINUITY.
HLSMediaSegmentsDTSJitterDeviation: DTS jumps between segments with no EXT-X-DISCONTINUITY
TimecodeTrackExist: MP4 has a tmcd track
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Diagnosed exception level. Valid values:
Fatal: affecting subsequent playback and parsing.
Error: may affect playback.
Warning: potential risk, which may not necessarily affect playback.
Notice: Important stream information
Info: general stream information. 
     * @return SeverityLevel Diagnosed exception level. Valid values:
Fatal: affecting subsequent playback and parsing.
Error: may affect playback.
Warning: potential risk, which may not necessarily affect playback.
Notice: Important stream information
Info: general stream information.
     */
    public String getSeverityLevel() {
        return this.SeverityLevel;
    }

    /**
     * Set Diagnosed exception level. Valid values:
Fatal: affecting subsequent playback and parsing.
Error: may affect playback.
Warning: potential risk, which may not necessarily affect playback.
Notice: Important stream information
Info: general stream information.
     * @param SeverityLevel Diagnosed exception level. Valid values:
Fatal: affecting subsequent playback and parsing.
Error: may affect playback.
Warning: potential risk, which may not necessarily affect playback.
Notice: Important stream information
Info: general stream information.
     */
    public void setSeverityLevel(String SeverityLevel) {
        this.SeverityLevel = SeverityLevel;
    }

    /**
     * Get Timestamp of warning, format such as "2022-12-25T13:14:16Z" 
     * @return DateTimeSet Timestamp of warning, format such as "2022-12-25T13:14:16Z"
     */
    public String [] getDateTimeSet() {
        return this.DateTimeSet;
    }

    /**
     * Set Timestamp of warning, format such as "2022-12-25T13:14:16Z"
     * @param DateTimeSet Timestamp of warning, format such as "2022-12-25T13:14:16Z"
     */
    public void setDateTimeSet(String [] DateTimeSet) {
        this.DateTimeSet = DateTimeSet;
    }

    /**
     * Get Timestamp. 
     * @return TimestampSet Timestamp.
     */
    public Float [] getTimestampSet() {
        return this.TimestampSet;
    }

    /**
     * Set Timestamp.
     * @param TimestampSet Timestamp.
     */
    public void setTimestampSet(Float [] TimestampSet) {
        this.TimestampSet = TimestampSet;
    }

    public ContainerDiagnoseResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerDiagnoseResultItem(ContainerDiagnoseResultItem source) {
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SeverityLevel != null) {
            this.SeverityLevel = new String(source.SeverityLevel);
        }
        if (source.DateTimeSet != null) {
            this.DateTimeSet = new String[source.DateTimeSet.length];
            for (int i = 0; i < source.DateTimeSet.length; i++) {
                this.DateTimeSet[i] = new String(source.DateTimeSet[i]);
            }
        }
        if (source.TimestampSet != null) {
            this.TimestampSet = new Float[source.TimestampSet.length];
            for (int i = 0; i < source.TimestampSet.length; i++) {
                this.TimestampSet[i] = new Float(source.TimestampSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SeverityLevel", this.SeverityLevel);
        this.setParamArraySimple(map, prefix + "DateTimeSet.", this.DateTimeSet);
        this.setParamArraySimple(map, prefix + "TimestampSet.", this.TimestampSet);

    }
}

