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

public class DiagnoseResult extends AbstractModel {

    /**
    * Diagnosed exception category. Valid values:
DecodeParamException: decoding parameter exception.
TimeStampException: timestamp exception.
FrameException: frame rate exception.
StreamStatusException: stream status exception.
StreamInfo: stream information exception.
StreamAbnormalCharacteristics: stream characteristics exception.
DecodeException: decoding exception.
HLSRequirements: HLS format exception.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Diagnosed specific exception type. Valid values:

VideoResolutionChanged: video resolution change.
AudioSampleRateChanged: audio sample rate change.
AudioChannelsChanged: audio channel quantity change.ParameterSetsChanged: stream parameter set information change.
DarOrSarInvalid: video aspect ratio exception.
TimestampFallback: DTS timestamp rollback.DtsJitter: DTS jitter too high.
PtsJitter: PTS jitter too high.
AACDurationDeviation: improper AAC frame timestamp interval.
AudioDroppingFrames: audio frame dropping.
VideoDroppingFrames: video frame dropping.
AVTimestampInterleave: improper audio-video interleaving.
PtsLessThanDts: PTS less than DTS for media streams.
ReceiveFpsJitter: significant jitter in the network receive frame rate.ReceiveFpsTooSmall: network receive video frame rate too low.FpsJitter: significant jitter in the stream frame rate calculated via PTS.StreamOpenFailed: stream open failure.
StreamEnd: stream end.
StreamParseFailed: stream parsing failure.
VideoFirstFrameNotIdr: first frame not an IDR frame.
StreamNALUError: NALU start code error.
TsStreamNoAud: no AUD NALU in the H26x stream of MPEG-TS.AudioStreamLack: no audio stream.
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
TsMultiPrograms: multiple programs in MPEG2-TS streams.Mp4InvalidCodecFourcc: codec FourCC in MP4 not meeting Apple HLS requirements.
HLSBadM3u8Format: invalid M3U8 file.
HLSInvalidMasterM3u8: invalid main M3U8 file.
HLSInvalidMediaM3u8: invalid media M3U8 file.
HLSMasterM3u8Recommended: parameters recommended by standards missing in main M3U8.
HLSMediaM3u8Recommended: parameters recommended by standards missing in media M3U8.
HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY in media M3U8.
HLSMediaSegmentsStreamNumChange: changed number of streams in segments.
HLSMediaSegmentsPTSJitterDeviation: PTS jumps between segments without EXT-X-DISCONTINUITY.
HLSMediaSegmentsDTSJitterDeviation: DTS jumps between segments without EXT-X-DISCONTINUITY.
TimecodeTrackExist: TMCD track in MP4.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("Timestamp")
    @Expose
    private Float Timestamp;

    /**
    * 
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 
    */
    @SerializedName("DateTime")
    @Expose
    private String DateTime;

    /**
    * Diagnosed exception level. Valid values:
Fatal: affecting subsequent playback and parsing.
Error: may affect playback.
Warning: potential risk, which may not necessarily affect playback.
Notice: important stream information.
Info: general stream information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SeverityLevel")
    @Expose
    private String SeverityLevel;

    /**
     * Get Diagnosed exception category. Valid values:
DecodeParamException: decoding parameter exception.
TimeStampException: timestamp exception.
FrameException: frame rate exception.
StreamStatusException: stream status exception.
StreamInfo: stream information exception.
StreamAbnormalCharacteristics: stream characteristics exception.
DecodeException: decoding exception.
HLSRequirements: HLS format exception.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Category Diagnosed exception category. Valid values:
DecodeParamException: decoding parameter exception.
TimeStampException: timestamp exception.
FrameException: frame rate exception.
StreamStatusException: stream status exception.
StreamInfo: stream information exception.
StreamAbnormalCharacteristics: stream characteristics exception.
DecodeException: decoding exception.
HLSRequirements: HLS format exception.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Diagnosed exception category. Valid values:
DecodeParamException: decoding parameter exception.
TimeStampException: timestamp exception.
FrameException: frame rate exception.
StreamStatusException: stream status exception.
StreamInfo: stream information exception.
StreamAbnormalCharacteristics: stream characteristics exception.
DecodeException: decoding exception.
HLSRequirements: HLS format exception.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Category Diagnosed exception category. Valid values:
DecodeParamException: decoding parameter exception.
TimeStampException: timestamp exception.
FrameException: frame rate exception.
StreamStatusException: stream status exception.
StreamInfo: stream information exception.
StreamAbnormalCharacteristics: stream characteristics exception.
DecodeException: decoding exception.
HLSRequirements: HLS format exception.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Diagnosed specific exception type. Valid values:

VideoResolutionChanged: video resolution change.
AudioSampleRateChanged: audio sample rate change.
AudioChannelsChanged: audio channel quantity change.ParameterSetsChanged: stream parameter set information change.
DarOrSarInvalid: video aspect ratio exception.
TimestampFallback: DTS timestamp rollback.DtsJitter: DTS jitter too high.
PtsJitter: PTS jitter too high.
AACDurationDeviation: improper AAC frame timestamp interval.
AudioDroppingFrames: audio frame dropping.
VideoDroppingFrames: video frame dropping.
AVTimestampInterleave: improper audio-video interleaving.
PtsLessThanDts: PTS less than DTS for media streams.
ReceiveFpsJitter: significant jitter in the network receive frame rate.ReceiveFpsTooSmall: network receive video frame rate too low.FpsJitter: significant jitter in the stream frame rate calculated via PTS.StreamOpenFailed: stream open failure.
StreamEnd: stream end.
StreamParseFailed: stream parsing failure.
VideoFirstFrameNotIdr: first frame not an IDR frame.
StreamNALUError: NALU start code error.
TsStreamNoAud: no AUD NALU in the H26x stream of MPEG-TS.AudioStreamLack: no audio stream.
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
TsMultiPrograms: multiple programs in MPEG2-TS streams.Mp4InvalidCodecFourcc: codec FourCC in MP4 not meeting Apple HLS requirements.
HLSBadM3u8Format: invalid M3U8 file.
HLSInvalidMasterM3u8: invalid main M3U8 file.
HLSInvalidMediaM3u8: invalid media M3U8 file.
HLSMasterM3u8Recommended: parameters recommended by standards missing in main M3U8.
HLSMediaM3u8Recommended: parameters recommended by standards missing in media M3U8.
HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY in media M3U8.
HLSMediaSegmentsStreamNumChange: changed number of streams in segments.
HLSMediaSegmentsPTSJitterDeviation: PTS jumps between segments without EXT-X-DISCONTINUITY.
HLSMediaSegmentsDTSJitterDeviation: DTS jumps between segments without EXT-X-DISCONTINUITY.
TimecodeTrackExist: TMCD track in MP4.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Diagnosed specific exception type. Valid values:

VideoResolutionChanged: video resolution change.
AudioSampleRateChanged: audio sample rate change.
AudioChannelsChanged: audio channel quantity change.ParameterSetsChanged: stream parameter set information change.
DarOrSarInvalid: video aspect ratio exception.
TimestampFallback: DTS timestamp rollback.DtsJitter: DTS jitter too high.
PtsJitter: PTS jitter too high.
AACDurationDeviation: improper AAC frame timestamp interval.
AudioDroppingFrames: audio frame dropping.
VideoDroppingFrames: video frame dropping.
AVTimestampInterleave: improper audio-video interleaving.
PtsLessThanDts: PTS less than DTS for media streams.
ReceiveFpsJitter: significant jitter in the network receive frame rate.ReceiveFpsTooSmall: network receive video frame rate too low.FpsJitter: significant jitter in the stream frame rate calculated via PTS.StreamOpenFailed: stream open failure.
StreamEnd: stream end.
StreamParseFailed: stream parsing failure.
VideoFirstFrameNotIdr: first frame not an IDR frame.
StreamNALUError: NALU start code error.
TsStreamNoAud: no AUD NALU in the H26x stream of MPEG-TS.AudioStreamLack: no audio stream.
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
TsMultiPrograms: multiple programs in MPEG2-TS streams.Mp4InvalidCodecFourcc: codec FourCC in MP4 not meeting Apple HLS requirements.
HLSBadM3u8Format: invalid M3U8 file.
HLSInvalidMasterM3u8: invalid main M3U8 file.
HLSInvalidMediaM3u8: invalid media M3U8 file.
HLSMasterM3u8Recommended: parameters recommended by standards missing in main M3U8.
HLSMediaM3u8Recommended: parameters recommended by standards missing in media M3U8.
HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY in media M3U8.
HLSMediaSegmentsStreamNumChange: changed number of streams in segments.
HLSMediaSegmentsPTSJitterDeviation: PTS jumps between segments without EXT-X-DISCONTINUITY.
HLSMediaSegmentsDTSJitterDeviation: DTS jumps between segments without EXT-X-DISCONTINUITY.
TimecodeTrackExist: TMCD track in MP4.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Diagnosed specific exception type. Valid values:

VideoResolutionChanged: video resolution change.
AudioSampleRateChanged: audio sample rate change.
AudioChannelsChanged: audio channel quantity change.ParameterSetsChanged: stream parameter set information change.
DarOrSarInvalid: video aspect ratio exception.
TimestampFallback: DTS timestamp rollback.DtsJitter: DTS jitter too high.
PtsJitter: PTS jitter too high.
AACDurationDeviation: improper AAC frame timestamp interval.
AudioDroppingFrames: audio frame dropping.
VideoDroppingFrames: video frame dropping.
AVTimestampInterleave: improper audio-video interleaving.
PtsLessThanDts: PTS less than DTS for media streams.
ReceiveFpsJitter: significant jitter in the network receive frame rate.ReceiveFpsTooSmall: network receive video frame rate too low.FpsJitter: significant jitter in the stream frame rate calculated via PTS.StreamOpenFailed: stream open failure.
StreamEnd: stream end.
StreamParseFailed: stream parsing failure.
VideoFirstFrameNotIdr: first frame not an IDR frame.
StreamNALUError: NALU start code error.
TsStreamNoAud: no AUD NALU in the H26x stream of MPEG-TS.AudioStreamLack: no audio stream.
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
TsMultiPrograms: multiple programs in MPEG2-TS streams.Mp4InvalidCodecFourcc: codec FourCC in MP4 not meeting Apple HLS requirements.
HLSBadM3u8Format: invalid M3U8 file.
HLSInvalidMasterM3u8: invalid main M3U8 file.
HLSInvalidMediaM3u8: invalid media M3U8 file.
HLSMasterM3u8Recommended: parameters recommended by standards missing in main M3U8.
HLSMediaM3u8Recommended: parameters recommended by standards missing in media M3U8.
HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY in media M3U8.
HLSMediaSegmentsStreamNumChange: changed number of streams in segments.
HLSMediaSegmentsPTSJitterDeviation: PTS jumps between segments without EXT-X-DISCONTINUITY.
HLSMediaSegmentsDTSJitterDeviation: DTS jumps between segments without EXT-X-DISCONTINUITY.
TimecodeTrackExist: TMCD track in MP4.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Diagnosed specific exception type. Valid values:

VideoResolutionChanged: video resolution change.
AudioSampleRateChanged: audio sample rate change.
AudioChannelsChanged: audio channel quantity change.ParameterSetsChanged: stream parameter set information change.
DarOrSarInvalid: video aspect ratio exception.
TimestampFallback: DTS timestamp rollback.DtsJitter: DTS jitter too high.
PtsJitter: PTS jitter too high.
AACDurationDeviation: improper AAC frame timestamp interval.
AudioDroppingFrames: audio frame dropping.
VideoDroppingFrames: video frame dropping.
AVTimestampInterleave: improper audio-video interleaving.
PtsLessThanDts: PTS less than DTS for media streams.
ReceiveFpsJitter: significant jitter in the network receive frame rate.ReceiveFpsTooSmall: network receive video frame rate too low.FpsJitter: significant jitter in the stream frame rate calculated via PTS.StreamOpenFailed: stream open failure.
StreamEnd: stream end.
StreamParseFailed: stream parsing failure.
VideoFirstFrameNotIdr: first frame not an IDR frame.
StreamNALUError: NALU start code error.
TsStreamNoAud: no AUD NALU in the H26x stream of MPEG-TS.AudioStreamLack: no audio stream.
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
TsMultiPrograms: multiple programs in MPEG2-TS streams.Mp4InvalidCodecFourcc: codec FourCC in MP4 not meeting Apple HLS requirements.
HLSBadM3u8Format: invalid M3U8 file.
HLSInvalidMasterM3u8: invalid main M3U8 file.
HLSInvalidMediaM3u8: invalid media M3U8 file.
HLSMasterM3u8Recommended: parameters recommended by standards missing in main M3U8.
HLSMediaM3u8Recommended: parameters recommended by standards missing in media M3U8.
HLSMediaM3u8DiscontinuityExist: EXT-X-DISCONTINUITY in media M3U8.
HLSMediaSegmentsStreamNumChange: changed number of streams in segments.
HLSMediaSegmentsPTSJitterDeviation: PTS jumps between segments without EXT-X-DISCONTINUITY.
HLSMediaSegmentsDTSJitterDeviation: DTS jumps between segments without EXT-X-DISCONTINUITY.
TimecodeTrackExist: TMCD track in MP4.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return Timestamp 
     */
    public Float getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 
     * @param Timestamp 
     */
    public void setTimestamp(Float Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get  
     * @return Description 
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get  
     * @return DateTime 
     */
    public String getDateTime() {
        return this.DateTime;
    }

    /**
     * Set 
     * @param DateTime 
     */
    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

    /**
     * Get Diagnosed exception level. Valid values:
Fatal: affecting subsequent playback and parsing.
Error: may affect playback.
Warning: potential risk, which may not necessarily affect playback.
Notice: important stream information.
Info: general stream information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SeverityLevel Diagnosed exception level. Valid values:
Fatal: affecting subsequent playback and parsing.
Error: may affect playback.
Warning: potential risk, which may not necessarily affect playback.
Notice: important stream information.
Info: general stream information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSeverityLevel() {
        return this.SeverityLevel;
    }

    /**
     * Set Diagnosed exception level. Valid values:
Fatal: affecting subsequent playback and parsing.
Error: may affect playback.
Warning: potential risk, which may not necessarily affect playback.
Notice: important stream information.
Info: general stream information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SeverityLevel Diagnosed exception level. Valid values:
Fatal: affecting subsequent playback and parsing.
Error: may affect playback.
Warning: potential risk, which may not necessarily affect playback.
Notice: important stream information.
Info: general stream information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSeverityLevel(String SeverityLevel) {
        this.SeverityLevel = SeverityLevel;
    }

    public DiagnoseResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiagnoseResult(DiagnoseResult source) {
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Float(source.Timestamp);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DateTime != null) {
            this.DateTime = new String(source.DateTime);
        }
        if (source.SeverityLevel != null) {
            this.SeverityLevel = new String(source.SeverityLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DateTime", this.DateTime);
        this.setParamSimple(map, prefix + "SeverityLevel", this.SeverityLevel);

    }
}

