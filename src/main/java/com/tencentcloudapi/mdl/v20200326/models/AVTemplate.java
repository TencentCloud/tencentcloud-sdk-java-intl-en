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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AVTemplate extends AbstractModel {

    /**
    * Name of an audio/video transcoding template, which can contain 1-20 case-sensitive letters and digits
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether video is needed. `0`: not needed; `1`: needed
    */
    @SerializedName("NeedVideo")
    @Expose
    private Long NeedVideo;

    /**
    * Video codec. Valid values: `H264`, `H265`. If this parameter is left empty, the original video codec will be used.
    */
    @SerializedName("Vcodec")
    @Expose
    private String Vcodec;

    /**
    * Video width. Value range: (0, 4096]. The value must be an integer multiple of 2. If this parameter is left empty, the original video width will be used.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Video height. Value range: (0, 4096]. The value must be an integer multiple of 2. If this parameter is left empty, the original video height will be used.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Video frame rate. Value range: [1, 240]. If this parameter is left empty, the original frame rate will be used.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Whether to enable top speed codec transcoding. Valid values: `CLOSE` (disable), `OPEN` (enable). Default value: `CLOSE`
    */
    @SerializedName("TopSpeed")
    @Expose
    private String TopSpeed;

    /**
    * Compression ratio for top speed codec transcoding. Value range: [0, 50]. The lower the compression ratio, the higher the image quality.
    */
    @SerializedName("BitrateCompressionRatio")
    @Expose
    private Long BitrateCompressionRatio;

    /**
    * Whether audio is needed. `0`: not needed; `1`: needed
    */
    @SerializedName("NeedAudio")
    @Expose
    private Long NeedAudio;

    /**
    * Audio encoding format, only `AAC` and `PASSTHROUGH` are available, with `AAC` as the default.
    */
    @SerializedName("Acodec")
    @Expose
    private String Acodec;

    /**
    * Audio bitrate. If this parameter is left empty, the original bitrate will be used.
Valid values: `6000`, `7000`, `8000`, `10000`, `12000`, `14000`, `16000`, `20000`, `24000`, `28000`, `32000`, `40000`, `48000`, `56000`, `64000`, `80000`, `96000`, `112000`, `128000`, `160000`, `192000`, `224000`, `256000`, `288000`, `320000`, `384000`, `448000`, `512000`, `576000`, `640000`, `768000`, `896000`, `1024000`
    */
    @SerializedName("AudioBitrate")
    @Expose
    private Long AudioBitrate;

    /**
    * Video bitrate. Value range: [50000, 40000000]. The value must be an integer multiple of 1000. If this parameter is left empty, the original bitrate will be used.
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * Bitrate control mode. Valid values: `CBR`, `ABR` (default), `VBR`.
    */
    @SerializedName("RateControlMode")
    @Expose
    private String RateControlMode;

    /**
    * Watermark ID
    */
    @SerializedName("WatermarkId")
    @Expose
    private String WatermarkId;

    /**
    * Whether to convert audio to text. `0` (default): No; `1`: Yes.
    */
    @SerializedName("SmartSubtitles")
    @Expose
    private Long SmartSubtitles;

    /**
    * The subtitle settings. Currently, the following subtitles are supported:
`eng2eng`: English speech to English text.
`eng2chs`: English speech to Chinese text. 
`eng2chseng`: English speech to English and Chinese text. 
`chs2chs`: Chinese speech to Chinese text.   
`chs2eng`: Chinese speech to English text. 
`chs2chseng`: Chinese speech to Chinese and English text.
    */
    @SerializedName("SubtitleConfiguration")
    @Expose
    private String SubtitleConfiguration;

    /**
    * Whether to enable the face blur function, 1 is on, 0 is off, and the default is 0.
    */
    @SerializedName("FaceBlurringEnabled")
    @Expose
    private Long FaceBlurringEnabled;

    /**
    * Only AttachedInputs.AudioSelectors.Name can be selected. The following types need to be filled in: 'RTP_PUSH', 'SRT_PUSH', 'UDP_PUSH', 'RTP-FEC_PUSH'.
    */
    @SerializedName("AudioSelectorName")
    @Expose
    private String AudioSelectorName;

    /**
    * Audio transcoding special configuration information.
    */
    @SerializedName("AudioNormalization")
    @Expose
    private AudioNormalizationSettings AudioNormalization;

    /**
    * Audio sampling rate, unit HZ.
    */
    @SerializedName("AudioSampleRate")
    @Expose
    private Long AudioSampleRate;

    /**
    * This field indicates how to specify the output video frame rate. If FOLLOW_SOURCE is selected, the output video frame rate will be set equal to the input video frame rate of the first input. If SPECIFIED_FRACTION is selected, the output video frame rate is determined by the fraction (frame rate numerator and frame rate denominator). If SPECIFIED_HZ is selected, the frame rate of the output video is determined by the HZ you enter.
    */
    @SerializedName("FrameRateType")
    @Expose
    private String FrameRateType;

    /**
    * Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate numerator setting.
    */
    @SerializedName("FrameRateNumerator")
    @Expose
    private Long FrameRateNumerator;

    /**
    * Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate denominator setting.
    */
    @SerializedName("FrameRateDenominator")
    @Expose
    private Long FrameRateDenominator;

    /**
    * The number of B frames can be selected from 1 to 3.
    */
    @SerializedName("BFramesNum")
    @Expose
    private Long BFramesNum;

    /**
    * The number of reference frames can be selected from 1 to 16.
    */
    @SerializedName("RefFramesNum")
    @Expose
    private Long RefFramesNum;

    /**
    * Additional video bitrate configuration.
    */
    @SerializedName("AdditionalRateSettings")
    @Expose
    private AdditionalRateSetting AdditionalRateSettings;

    /**
    * Video encoding configuration.
    */
    @SerializedName("VideoCodecDetails")
    @Expose
    private VideoCodecDetail VideoCodecDetails;

    /**
    * Audio encoding configuration.
    */
    @SerializedName("AudioCodecDetails")
    @Expose
    private AudioCodecDetail AudioCodecDetails;

    /**
    * Whether to enable multiple audio tracks 0: Not required 1: Required Default value 0.
    */
    @SerializedName("MultiAudioTrackEnabled")
    @Expose
    private Long MultiAudioTrackEnabled;

    /**
    * Quantity limit 0-20 Valid when MultiAudioTrackEnabled is turned on.
    */
    @SerializedName("AudioTracks")
    @Expose
    private AudioTrackInfo [] AudioTracks;

    /**
    * Do you want to enable video enhancement? 1: Enable 0: Do not enable.
    */
    @SerializedName("VideoEnhanceEnabled")
    @Expose
    private Long VideoEnhanceEnabled;

    /**
    * Video enhancement configuration array.
    */
    @SerializedName("VideoEnhanceSettings")
    @Expose
    private VideoEnhanceSetting [] VideoEnhanceSettings;

    /**
    * Key frame interval, 300-10000, optional.
    */
    @SerializedName("GopSize")
    @Expose
    private Long GopSize;

    /**
    * Keyframe units, only support MILLISECONDS (milliseconds).
    */
    @SerializedName("GopSizeUnits")
    @Expose
    private String GopSizeUnits;

    /**
    * Color space setting.
    */
    @SerializedName("ColorSpaceSettings")
    @Expose
    private ColorSpaceSetting ColorSpaceSettings;

    /**
    * Traceability watermark.
    */
    @SerializedName("ForensicWatermarkIds")
    @Expose
    private String [] ForensicWatermarkIds;

    /**
     * Get Name of an audio/video transcoding template, which can contain 1-20 case-sensitive letters and digits 
     * @return Name Name of an audio/video transcoding template, which can contain 1-20 case-sensitive letters and digits
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of an audio/video transcoding template, which can contain 1-20 case-sensitive letters and digits
     * @param Name Name of an audio/video transcoding template, which can contain 1-20 case-sensitive letters and digits
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Whether video is needed. `0`: not needed; `1`: needed 
     * @return NeedVideo Whether video is needed. `0`: not needed; `1`: needed
     */
    public Long getNeedVideo() {
        return this.NeedVideo;
    }

    /**
     * Set Whether video is needed. `0`: not needed; `1`: needed
     * @param NeedVideo Whether video is needed. `0`: not needed; `1`: needed
     */
    public void setNeedVideo(Long NeedVideo) {
        this.NeedVideo = NeedVideo;
    }

    /**
     * Get Video codec. Valid values: `H264`, `H265`. If this parameter is left empty, the original video codec will be used. 
     * @return Vcodec Video codec. Valid values: `H264`, `H265`. If this parameter is left empty, the original video codec will be used.
     */
    public String getVcodec() {
        return this.Vcodec;
    }

    /**
     * Set Video codec. Valid values: `H264`, `H265`. If this parameter is left empty, the original video codec will be used.
     * @param Vcodec Video codec. Valid values: `H264`, `H265`. If this parameter is left empty, the original video codec will be used.
     */
    public void setVcodec(String Vcodec) {
        this.Vcodec = Vcodec;
    }

    /**
     * Get Video width. Value range: (0, 4096]. The value must be an integer multiple of 2. If this parameter is left empty, the original video width will be used. 
     * @return Width Video width. Value range: (0, 4096]. The value must be an integer multiple of 2. If this parameter is left empty, the original video width will be used.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Video width. Value range: (0, 4096]. The value must be an integer multiple of 2. If this parameter is left empty, the original video width will be used.
     * @param Width Video width. Value range: (0, 4096]. The value must be an integer multiple of 2. If this parameter is left empty, the original video width will be used.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Video height. Value range: (0, 4096]. The value must be an integer multiple of 2. If this parameter is left empty, the original video height will be used. 
     * @return Height Video height. Value range: (0, 4096]. The value must be an integer multiple of 2. If this parameter is left empty, the original video height will be used.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Video height. Value range: (0, 4096]. The value must be an integer multiple of 2. If this parameter is left empty, the original video height will be used.
     * @param Height Video height. Value range: (0, 4096]. The value must be an integer multiple of 2. If this parameter is left empty, the original video height will be used.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Video frame rate. Value range: [1, 240]. If this parameter is left empty, the original frame rate will be used. 
     * @return Fps Video frame rate. Value range: [1, 240]. If this parameter is left empty, the original frame rate will be used.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Video frame rate. Value range: [1, 240]. If this parameter is left empty, the original frame rate will be used.
     * @param Fps Video frame rate. Value range: [1, 240]. If this parameter is left empty, the original frame rate will be used.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Whether to enable top speed codec transcoding. Valid values: `CLOSE` (disable), `OPEN` (enable). Default value: `CLOSE` 
     * @return TopSpeed Whether to enable top speed codec transcoding. Valid values: `CLOSE` (disable), `OPEN` (enable). Default value: `CLOSE`
     */
    public String getTopSpeed() {
        return this.TopSpeed;
    }

    /**
     * Set Whether to enable top speed codec transcoding. Valid values: `CLOSE` (disable), `OPEN` (enable). Default value: `CLOSE`
     * @param TopSpeed Whether to enable top speed codec transcoding. Valid values: `CLOSE` (disable), `OPEN` (enable). Default value: `CLOSE`
     */
    public void setTopSpeed(String TopSpeed) {
        this.TopSpeed = TopSpeed;
    }

    /**
     * Get Compression ratio for top speed codec transcoding. Value range: [0, 50]. The lower the compression ratio, the higher the image quality. 
     * @return BitrateCompressionRatio Compression ratio for top speed codec transcoding. Value range: [0, 50]. The lower the compression ratio, the higher the image quality.
     */
    public Long getBitrateCompressionRatio() {
        return this.BitrateCompressionRatio;
    }

    /**
     * Set Compression ratio for top speed codec transcoding. Value range: [0, 50]. The lower the compression ratio, the higher the image quality.
     * @param BitrateCompressionRatio Compression ratio for top speed codec transcoding. Value range: [0, 50]. The lower the compression ratio, the higher the image quality.
     */
    public void setBitrateCompressionRatio(Long BitrateCompressionRatio) {
        this.BitrateCompressionRatio = BitrateCompressionRatio;
    }

    /**
     * Get Whether audio is needed. `0`: not needed; `1`: needed 
     * @return NeedAudio Whether audio is needed. `0`: not needed; `1`: needed
     */
    public Long getNeedAudio() {
        return this.NeedAudio;
    }

    /**
     * Set Whether audio is needed. `0`: not needed; `1`: needed
     * @param NeedAudio Whether audio is needed. `0`: not needed; `1`: needed
     */
    public void setNeedAudio(Long NeedAudio) {
        this.NeedAudio = NeedAudio;
    }

    /**
     * Get Audio encoding format, only `AAC` and `PASSTHROUGH` are available, with `AAC` as the default. 
     * @return Acodec Audio encoding format, only `AAC` and `PASSTHROUGH` are available, with `AAC` as the default.
     */
    public String getAcodec() {
        return this.Acodec;
    }

    /**
     * Set Audio encoding format, only `AAC` and `PASSTHROUGH` are available, with `AAC` as the default.
     * @param Acodec Audio encoding format, only `AAC` and `PASSTHROUGH` are available, with `AAC` as the default.
     */
    public void setAcodec(String Acodec) {
        this.Acodec = Acodec;
    }

    /**
     * Get Audio bitrate. If this parameter is left empty, the original bitrate will be used.
Valid values: `6000`, `7000`, `8000`, `10000`, `12000`, `14000`, `16000`, `20000`, `24000`, `28000`, `32000`, `40000`, `48000`, `56000`, `64000`, `80000`, `96000`, `112000`, `128000`, `160000`, `192000`, `224000`, `256000`, `288000`, `320000`, `384000`, `448000`, `512000`, `576000`, `640000`, `768000`, `896000`, `1024000` 
     * @return AudioBitrate Audio bitrate. If this parameter is left empty, the original bitrate will be used.
Valid values: `6000`, `7000`, `8000`, `10000`, `12000`, `14000`, `16000`, `20000`, `24000`, `28000`, `32000`, `40000`, `48000`, `56000`, `64000`, `80000`, `96000`, `112000`, `128000`, `160000`, `192000`, `224000`, `256000`, `288000`, `320000`, `384000`, `448000`, `512000`, `576000`, `640000`, `768000`, `896000`, `1024000`
     */
    public Long getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * Set Audio bitrate. If this parameter is left empty, the original bitrate will be used.
Valid values: `6000`, `7000`, `8000`, `10000`, `12000`, `14000`, `16000`, `20000`, `24000`, `28000`, `32000`, `40000`, `48000`, `56000`, `64000`, `80000`, `96000`, `112000`, `128000`, `160000`, `192000`, `224000`, `256000`, `288000`, `320000`, `384000`, `448000`, `512000`, `576000`, `640000`, `768000`, `896000`, `1024000`
     * @param AudioBitrate Audio bitrate. If this parameter is left empty, the original bitrate will be used.
Valid values: `6000`, `7000`, `8000`, `10000`, `12000`, `14000`, `16000`, `20000`, `24000`, `28000`, `32000`, `40000`, `48000`, `56000`, `64000`, `80000`, `96000`, `112000`, `128000`, `160000`, `192000`, `224000`, `256000`, `288000`, `320000`, `384000`, `448000`, `512000`, `576000`, `640000`, `768000`, `896000`, `1024000`
     */
    public void setAudioBitrate(Long AudioBitrate) {
        this.AudioBitrate = AudioBitrate;
    }

    /**
     * Get Video bitrate. Value range: [50000, 40000000]. The value must be an integer multiple of 1000. If this parameter is left empty, the original bitrate will be used. 
     * @return VideoBitrate Video bitrate. Value range: [50000, 40000000]. The value must be an integer multiple of 1000. If this parameter is left empty, the original bitrate will be used.
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set Video bitrate. Value range: [50000, 40000000]. The value must be an integer multiple of 1000. If this parameter is left empty, the original bitrate will be used.
     * @param VideoBitrate Video bitrate. Value range: [50000, 40000000]. The value must be an integer multiple of 1000. If this parameter is left empty, the original bitrate will be used.
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get Bitrate control mode. Valid values: `CBR`, `ABR` (default), `VBR`. 
     * @return RateControlMode Bitrate control mode. Valid values: `CBR`, `ABR` (default), `VBR`.
     */
    public String getRateControlMode() {
        return this.RateControlMode;
    }

    /**
     * Set Bitrate control mode. Valid values: `CBR`, `ABR` (default), `VBR`.
     * @param RateControlMode Bitrate control mode. Valid values: `CBR`, `ABR` (default), `VBR`.
     */
    public void setRateControlMode(String RateControlMode) {
        this.RateControlMode = RateControlMode;
    }

    /**
     * Get Watermark ID 
     * @return WatermarkId Watermark ID
     */
    public String getWatermarkId() {
        return this.WatermarkId;
    }

    /**
     * Set Watermark ID
     * @param WatermarkId Watermark ID
     */
    public void setWatermarkId(String WatermarkId) {
        this.WatermarkId = WatermarkId;
    }

    /**
     * Get Whether to convert audio to text. `0` (default): No; `1`: Yes. 
     * @return SmartSubtitles Whether to convert audio to text. `0` (default): No; `1`: Yes.
     */
    public Long getSmartSubtitles() {
        return this.SmartSubtitles;
    }

    /**
     * Set Whether to convert audio to text. `0` (default): No; `1`: Yes.
     * @param SmartSubtitles Whether to convert audio to text. `0` (default): No; `1`: Yes.
     */
    public void setSmartSubtitles(Long SmartSubtitles) {
        this.SmartSubtitles = SmartSubtitles;
    }

    /**
     * Get The subtitle settings. Currently, the following subtitles are supported:
`eng2eng`: English speech to English text.
`eng2chs`: English speech to Chinese text. 
`eng2chseng`: English speech to English and Chinese text. 
`chs2chs`: Chinese speech to Chinese text.   
`chs2eng`: Chinese speech to English text. 
`chs2chseng`: Chinese speech to Chinese and English text. 
     * @return SubtitleConfiguration The subtitle settings. Currently, the following subtitles are supported:
`eng2eng`: English speech to English text.
`eng2chs`: English speech to Chinese text. 
`eng2chseng`: English speech to English and Chinese text. 
`chs2chs`: Chinese speech to Chinese text.   
`chs2eng`: Chinese speech to English text. 
`chs2chseng`: Chinese speech to Chinese and English text.
     */
    public String getSubtitleConfiguration() {
        return this.SubtitleConfiguration;
    }

    /**
     * Set The subtitle settings. Currently, the following subtitles are supported:
`eng2eng`: English speech to English text.
`eng2chs`: English speech to Chinese text. 
`eng2chseng`: English speech to English and Chinese text. 
`chs2chs`: Chinese speech to Chinese text.   
`chs2eng`: Chinese speech to English text. 
`chs2chseng`: Chinese speech to Chinese and English text.
     * @param SubtitleConfiguration The subtitle settings. Currently, the following subtitles are supported:
`eng2eng`: English speech to English text.
`eng2chs`: English speech to Chinese text. 
`eng2chseng`: English speech to English and Chinese text. 
`chs2chs`: Chinese speech to Chinese text.   
`chs2eng`: Chinese speech to English text. 
`chs2chseng`: Chinese speech to Chinese and English text.
     */
    public void setSubtitleConfiguration(String SubtitleConfiguration) {
        this.SubtitleConfiguration = SubtitleConfiguration;
    }

    /**
     * Get Whether to enable the face blur function, 1 is on, 0 is off, and the default is 0. 
     * @return FaceBlurringEnabled Whether to enable the face blur function, 1 is on, 0 is off, and the default is 0.
     */
    public Long getFaceBlurringEnabled() {
        return this.FaceBlurringEnabled;
    }

    /**
     * Set Whether to enable the face blur function, 1 is on, 0 is off, and the default is 0.
     * @param FaceBlurringEnabled Whether to enable the face blur function, 1 is on, 0 is off, and the default is 0.
     */
    public void setFaceBlurringEnabled(Long FaceBlurringEnabled) {
        this.FaceBlurringEnabled = FaceBlurringEnabled;
    }

    /**
     * Get Only AttachedInputs.AudioSelectors.Name can be selected. The following types need to be filled in: 'RTP_PUSH', 'SRT_PUSH', 'UDP_PUSH', 'RTP-FEC_PUSH'. 
     * @return AudioSelectorName Only AttachedInputs.AudioSelectors.Name can be selected. The following types need to be filled in: 'RTP_PUSH', 'SRT_PUSH', 'UDP_PUSH', 'RTP-FEC_PUSH'.
     */
    public String getAudioSelectorName() {
        return this.AudioSelectorName;
    }

    /**
     * Set Only AttachedInputs.AudioSelectors.Name can be selected. The following types need to be filled in: 'RTP_PUSH', 'SRT_PUSH', 'UDP_PUSH', 'RTP-FEC_PUSH'.
     * @param AudioSelectorName Only AttachedInputs.AudioSelectors.Name can be selected. The following types need to be filled in: 'RTP_PUSH', 'SRT_PUSH', 'UDP_PUSH', 'RTP-FEC_PUSH'.
     */
    public void setAudioSelectorName(String AudioSelectorName) {
        this.AudioSelectorName = AudioSelectorName;
    }

    /**
     * Get Audio transcoding special configuration information. 
     * @return AudioNormalization Audio transcoding special configuration information.
     */
    public AudioNormalizationSettings getAudioNormalization() {
        return this.AudioNormalization;
    }

    /**
     * Set Audio transcoding special configuration information.
     * @param AudioNormalization Audio transcoding special configuration information.
     */
    public void setAudioNormalization(AudioNormalizationSettings AudioNormalization) {
        this.AudioNormalization = AudioNormalization;
    }

    /**
     * Get Audio sampling rate, unit HZ. 
     * @return AudioSampleRate Audio sampling rate, unit HZ.
     */
    public Long getAudioSampleRate() {
        return this.AudioSampleRate;
    }

    /**
     * Set Audio sampling rate, unit HZ.
     * @param AudioSampleRate Audio sampling rate, unit HZ.
     */
    public void setAudioSampleRate(Long AudioSampleRate) {
        this.AudioSampleRate = AudioSampleRate;
    }

    /**
     * Get This field indicates how to specify the output video frame rate. If FOLLOW_SOURCE is selected, the output video frame rate will be set equal to the input video frame rate of the first input. If SPECIFIED_FRACTION is selected, the output video frame rate is determined by the fraction (frame rate numerator and frame rate denominator). If SPECIFIED_HZ is selected, the frame rate of the output video is determined by the HZ you enter. 
     * @return FrameRateType This field indicates how to specify the output video frame rate. If FOLLOW_SOURCE is selected, the output video frame rate will be set equal to the input video frame rate of the first input. If SPECIFIED_FRACTION is selected, the output video frame rate is determined by the fraction (frame rate numerator and frame rate denominator). If SPECIFIED_HZ is selected, the frame rate of the output video is determined by the HZ you enter.
     */
    public String getFrameRateType() {
        return this.FrameRateType;
    }

    /**
     * Set This field indicates how to specify the output video frame rate. If FOLLOW_SOURCE is selected, the output video frame rate will be set equal to the input video frame rate of the first input. If SPECIFIED_FRACTION is selected, the output video frame rate is determined by the fraction (frame rate numerator and frame rate denominator). If SPECIFIED_HZ is selected, the frame rate of the output video is determined by the HZ you enter.
     * @param FrameRateType This field indicates how to specify the output video frame rate. If FOLLOW_SOURCE is selected, the output video frame rate will be set equal to the input video frame rate of the first input. If SPECIFIED_FRACTION is selected, the output video frame rate is determined by the fraction (frame rate numerator and frame rate denominator). If SPECIFIED_HZ is selected, the frame rate of the output video is determined by the HZ you enter.
     */
    public void setFrameRateType(String FrameRateType) {
        this.FrameRateType = FrameRateType;
    }

    /**
     * Get Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate numerator setting. 
     * @return FrameRateNumerator Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate numerator setting.
     */
    public Long getFrameRateNumerator() {
        return this.FrameRateNumerator;
    }

    /**
     * Set Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate numerator setting.
     * @param FrameRateNumerator Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate numerator setting.
     */
    public void setFrameRateNumerator(Long FrameRateNumerator) {
        this.FrameRateNumerator = FrameRateNumerator;
    }

    /**
     * Get Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate denominator setting. 
     * @return FrameRateDenominator Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate denominator setting.
     */
    public Long getFrameRateDenominator() {
        return this.FrameRateDenominator;
    }

    /**
     * Set Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate denominator setting.
     * @param FrameRateDenominator Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate denominator setting.
     */
    public void setFrameRateDenominator(Long FrameRateDenominator) {
        this.FrameRateDenominator = FrameRateDenominator;
    }

    /**
     * Get The number of B frames can be selected from 1 to 3. 
     * @return BFramesNum The number of B frames can be selected from 1 to 3.
     */
    public Long getBFramesNum() {
        return this.BFramesNum;
    }

    /**
     * Set The number of B frames can be selected from 1 to 3.
     * @param BFramesNum The number of B frames can be selected from 1 to 3.
     */
    public void setBFramesNum(Long BFramesNum) {
        this.BFramesNum = BFramesNum;
    }

    /**
     * Get The number of reference frames can be selected from 1 to 16. 
     * @return RefFramesNum The number of reference frames can be selected from 1 to 16.
     */
    public Long getRefFramesNum() {
        return this.RefFramesNum;
    }

    /**
     * Set The number of reference frames can be selected from 1 to 16.
     * @param RefFramesNum The number of reference frames can be selected from 1 to 16.
     */
    public void setRefFramesNum(Long RefFramesNum) {
        this.RefFramesNum = RefFramesNum;
    }

    /**
     * Get Additional video bitrate configuration. 
     * @return AdditionalRateSettings Additional video bitrate configuration.
     */
    public AdditionalRateSetting getAdditionalRateSettings() {
        return this.AdditionalRateSettings;
    }

    /**
     * Set Additional video bitrate configuration.
     * @param AdditionalRateSettings Additional video bitrate configuration.
     */
    public void setAdditionalRateSettings(AdditionalRateSetting AdditionalRateSettings) {
        this.AdditionalRateSettings = AdditionalRateSettings;
    }

    /**
     * Get Video encoding configuration. 
     * @return VideoCodecDetails Video encoding configuration.
     */
    public VideoCodecDetail getVideoCodecDetails() {
        return this.VideoCodecDetails;
    }

    /**
     * Set Video encoding configuration.
     * @param VideoCodecDetails Video encoding configuration.
     */
    public void setVideoCodecDetails(VideoCodecDetail VideoCodecDetails) {
        this.VideoCodecDetails = VideoCodecDetails;
    }

    /**
     * Get Audio encoding configuration. 
     * @return AudioCodecDetails Audio encoding configuration.
     */
    public AudioCodecDetail getAudioCodecDetails() {
        return this.AudioCodecDetails;
    }

    /**
     * Set Audio encoding configuration.
     * @param AudioCodecDetails Audio encoding configuration.
     */
    public void setAudioCodecDetails(AudioCodecDetail AudioCodecDetails) {
        this.AudioCodecDetails = AudioCodecDetails;
    }

    /**
     * Get Whether to enable multiple audio tracks 0: Not required 1: Required Default value 0. 
     * @return MultiAudioTrackEnabled Whether to enable multiple audio tracks 0: Not required 1: Required Default value 0.
     */
    public Long getMultiAudioTrackEnabled() {
        return this.MultiAudioTrackEnabled;
    }

    /**
     * Set Whether to enable multiple audio tracks 0: Not required 1: Required Default value 0.
     * @param MultiAudioTrackEnabled Whether to enable multiple audio tracks 0: Not required 1: Required Default value 0.
     */
    public void setMultiAudioTrackEnabled(Long MultiAudioTrackEnabled) {
        this.MultiAudioTrackEnabled = MultiAudioTrackEnabled;
    }

    /**
     * Get Quantity limit 0-20 Valid when MultiAudioTrackEnabled is turned on. 
     * @return AudioTracks Quantity limit 0-20 Valid when MultiAudioTrackEnabled is turned on.
     */
    public AudioTrackInfo [] getAudioTracks() {
        return this.AudioTracks;
    }

    /**
     * Set Quantity limit 0-20 Valid when MultiAudioTrackEnabled is turned on.
     * @param AudioTracks Quantity limit 0-20 Valid when MultiAudioTrackEnabled is turned on.
     */
    public void setAudioTracks(AudioTrackInfo [] AudioTracks) {
        this.AudioTracks = AudioTracks;
    }

    /**
     * Get Do you want to enable video enhancement? 1: Enable 0: Do not enable. 
     * @return VideoEnhanceEnabled Do you want to enable video enhancement? 1: Enable 0: Do not enable.
     */
    public Long getVideoEnhanceEnabled() {
        return this.VideoEnhanceEnabled;
    }

    /**
     * Set Do you want to enable video enhancement? 1: Enable 0: Do not enable.
     * @param VideoEnhanceEnabled Do you want to enable video enhancement? 1: Enable 0: Do not enable.
     */
    public void setVideoEnhanceEnabled(Long VideoEnhanceEnabled) {
        this.VideoEnhanceEnabled = VideoEnhanceEnabled;
    }

    /**
     * Get Video enhancement configuration array. 
     * @return VideoEnhanceSettings Video enhancement configuration array.
     */
    public VideoEnhanceSetting [] getVideoEnhanceSettings() {
        return this.VideoEnhanceSettings;
    }

    /**
     * Set Video enhancement configuration array.
     * @param VideoEnhanceSettings Video enhancement configuration array.
     */
    public void setVideoEnhanceSettings(VideoEnhanceSetting [] VideoEnhanceSettings) {
        this.VideoEnhanceSettings = VideoEnhanceSettings;
    }

    /**
     * Get Key frame interval, 300-10000, optional. 
     * @return GopSize Key frame interval, 300-10000, optional.
     */
    public Long getGopSize() {
        return this.GopSize;
    }

    /**
     * Set Key frame interval, 300-10000, optional.
     * @param GopSize Key frame interval, 300-10000, optional.
     */
    public void setGopSize(Long GopSize) {
        this.GopSize = GopSize;
    }

    /**
     * Get Keyframe units, only support MILLISECONDS (milliseconds). 
     * @return GopSizeUnits Keyframe units, only support MILLISECONDS (milliseconds).
     */
    public String getGopSizeUnits() {
        return this.GopSizeUnits;
    }

    /**
     * Set Keyframe units, only support MILLISECONDS (milliseconds).
     * @param GopSizeUnits Keyframe units, only support MILLISECONDS (milliseconds).
     */
    public void setGopSizeUnits(String GopSizeUnits) {
        this.GopSizeUnits = GopSizeUnits;
    }

    /**
     * Get Color space setting. 
     * @return ColorSpaceSettings Color space setting.
     */
    public ColorSpaceSetting getColorSpaceSettings() {
        return this.ColorSpaceSettings;
    }

    /**
     * Set Color space setting.
     * @param ColorSpaceSettings Color space setting.
     */
    public void setColorSpaceSettings(ColorSpaceSetting ColorSpaceSettings) {
        this.ColorSpaceSettings = ColorSpaceSettings;
    }

    /**
     * Get Traceability watermark. 
     * @return ForensicWatermarkIds Traceability watermark.
     */
    public String [] getForensicWatermarkIds() {
        return this.ForensicWatermarkIds;
    }

    /**
     * Set Traceability watermark.
     * @param ForensicWatermarkIds Traceability watermark.
     */
    public void setForensicWatermarkIds(String [] ForensicWatermarkIds) {
        this.ForensicWatermarkIds = ForensicWatermarkIds;
    }

    public AVTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AVTemplate(AVTemplate source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NeedVideo != null) {
            this.NeedVideo = new Long(source.NeedVideo);
        }
        if (source.Vcodec != null) {
            this.Vcodec = new String(source.Vcodec);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.TopSpeed != null) {
            this.TopSpeed = new String(source.TopSpeed);
        }
        if (source.BitrateCompressionRatio != null) {
            this.BitrateCompressionRatio = new Long(source.BitrateCompressionRatio);
        }
        if (source.NeedAudio != null) {
            this.NeedAudio = new Long(source.NeedAudio);
        }
        if (source.Acodec != null) {
            this.Acodec = new String(source.Acodec);
        }
        if (source.AudioBitrate != null) {
            this.AudioBitrate = new Long(source.AudioBitrate);
        }
        if (source.VideoBitrate != null) {
            this.VideoBitrate = new Long(source.VideoBitrate);
        }
        if (source.RateControlMode != null) {
            this.RateControlMode = new String(source.RateControlMode);
        }
        if (source.WatermarkId != null) {
            this.WatermarkId = new String(source.WatermarkId);
        }
        if (source.SmartSubtitles != null) {
            this.SmartSubtitles = new Long(source.SmartSubtitles);
        }
        if (source.SubtitleConfiguration != null) {
            this.SubtitleConfiguration = new String(source.SubtitleConfiguration);
        }
        if (source.FaceBlurringEnabled != null) {
            this.FaceBlurringEnabled = new Long(source.FaceBlurringEnabled);
        }
        if (source.AudioSelectorName != null) {
            this.AudioSelectorName = new String(source.AudioSelectorName);
        }
        if (source.AudioNormalization != null) {
            this.AudioNormalization = new AudioNormalizationSettings(source.AudioNormalization);
        }
        if (source.AudioSampleRate != null) {
            this.AudioSampleRate = new Long(source.AudioSampleRate);
        }
        if (source.FrameRateType != null) {
            this.FrameRateType = new String(source.FrameRateType);
        }
        if (source.FrameRateNumerator != null) {
            this.FrameRateNumerator = new Long(source.FrameRateNumerator);
        }
        if (source.FrameRateDenominator != null) {
            this.FrameRateDenominator = new Long(source.FrameRateDenominator);
        }
        if (source.BFramesNum != null) {
            this.BFramesNum = new Long(source.BFramesNum);
        }
        if (source.RefFramesNum != null) {
            this.RefFramesNum = new Long(source.RefFramesNum);
        }
        if (source.AdditionalRateSettings != null) {
            this.AdditionalRateSettings = new AdditionalRateSetting(source.AdditionalRateSettings);
        }
        if (source.VideoCodecDetails != null) {
            this.VideoCodecDetails = new VideoCodecDetail(source.VideoCodecDetails);
        }
        if (source.AudioCodecDetails != null) {
            this.AudioCodecDetails = new AudioCodecDetail(source.AudioCodecDetails);
        }
        if (source.MultiAudioTrackEnabled != null) {
            this.MultiAudioTrackEnabled = new Long(source.MultiAudioTrackEnabled);
        }
        if (source.AudioTracks != null) {
            this.AudioTracks = new AudioTrackInfo[source.AudioTracks.length];
            for (int i = 0; i < source.AudioTracks.length; i++) {
                this.AudioTracks[i] = new AudioTrackInfo(source.AudioTracks[i]);
            }
        }
        if (source.VideoEnhanceEnabled != null) {
            this.VideoEnhanceEnabled = new Long(source.VideoEnhanceEnabled);
        }
        if (source.VideoEnhanceSettings != null) {
            this.VideoEnhanceSettings = new VideoEnhanceSetting[source.VideoEnhanceSettings.length];
            for (int i = 0; i < source.VideoEnhanceSettings.length; i++) {
                this.VideoEnhanceSettings[i] = new VideoEnhanceSetting(source.VideoEnhanceSettings[i]);
            }
        }
        if (source.GopSize != null) {
            this.GopSize = new Long(source.GopSize);
        }
        if (source.GopSizeUnits != null) {
            this.GopSizeUnits = new String(source.GopSizeUnits);
        }
        if (source.ColorSpaceSettings != null) {
            this.ColorSpaceSettings = new ColorSpaceSetting(source.ColorSpaceSettings);
        }
        if (source.ForensicWatermarkIds != null) {
            this.ForensicWatermarkIds = new String[source.ForensicWatermarkIds.length];
            for (int i = 0; i < source.ForensicWatermarkIds.length; i++) {
                this.ForensicWatermarkIds[i] = new String(source.ForensicWatermarkIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NeedVideo", this.NeedVideo);
        this.setParamSimple(map, prefix + "Vcodec", this.Vcodec);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "TopSpeed", this.TopSpeed);
        this.setParamSimple(map, prefix + "BitrateCompressionRatio", this.BitrateCompressionRatio);
        this.setParamSimple(map, prefix + "NeedAudio", this.NeedAudio);
        this.setParamSimple(map, prefix + "Acodec", this.Acodec);
        this.setParamSimple(map, prefix + "AudioBitrate", this.AudioBitrate);
        this.setParamSimple(map, prefix + "VideoBitrate", this.VideoBitrate);
        this.setParamSimple(map, prefix + "RateControlMode", this.RateControlMode);
        this.setParamSimple(map, prefix + "WatermarkId", this.WatermarkId);
        this.setParamSimple(map, prefix + "SmartSubtitles", this.SmartSubtitles);
        this.setParamSimple(map, prefix + "SubtitleConfiguration", this.SubtitleConfiguration);
        this.setParamSimple(map, prefix + "FaceBlurringEnabled", this.FaceBlurringEnabled);
        this.setParamSimple(map, prefix + "AudioSelectorName", this.AudioSelectorName);
        this.setParamObj(map, prefix + "AudioNormalization.", this.AudioNormalization);
        this.setParamSimple(map, prefix + "AudioSampleRate", this.AudioSampleRate);
        this.setParamSimple(map, prefix + "FrameRateType", this.FrameRateType);
        this.setParamSimple(map, prefix + "FrameRateNumerator", this.FrameRateNumerator);
        this.setParamSimple(map, prefix + "FrameRateDenominator", this.FrameRateDenominator);
        this.setParamSimple(map, prefix + "BFramesNum", this.BFramesNum);
        this.setParamSimple(map, prefix + "RefFramesNum", this.RefFramesNum);
        this.setParamObj(map, prefix + "AdditionalRateSettings.", this.AdditionalRateSettings);
        this.setParamObj(map, prefix + "VideoCodecDetails.", this.VideoCodecDetails);
        this.setParamObj(map, prefix + "AudioCodecDetails.", this.AudioCodecDetails);
        this.setParamSimple(map, prefix + "MultiAudioTrackEnabled", this.MultiAudioTrackEnabled);
        this.setParamArrayObj(map, prefix + "AudioTracks.", this.AudioTracks);
        this.setParamSimple(map, prefix + "VideoEnhanceEnabled", this.VideoEnhanceEnabled);
        this.setParamArrayObj(map, prefix + "VideoEnhanceSettings.", this.VideoEnhanceSettings);
        this.setParamSimple(map, prefix + "GopSize", this.GopSize);
        this.setParamSimple(map, prefix + "GopSizeUnits", this.GopSizeUnits);
        this.setParamObj(map, prefix + "ColorSpaceSettings.", this.ColorSpaceSettings);
        this.setParamArraySimple(map, prefix + "ForensicWatermarkIds.", this.ForensicWatermarkIds);

    }
}

