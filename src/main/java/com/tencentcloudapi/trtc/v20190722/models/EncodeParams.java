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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EncodeParams extends AbstractModel{

    /**
    * Output audio sample rate (Hz) for On-Cloud MixTranscoding. Valid values: 48000, 44100, 32000, 24000, 16000, 8000
    */
    @SerializedName("AudioSampleRate")
    @Expose
    private Long AudioSampleRate;

    /**
    * Output audio bitrate (Kbps) for On-Cloud MixTranscoding. Value range: 8-500
    */
    @SerializedName("AudioBitrate")
    @Expose
    private Long AudioBitrate;

    /**
    * Number of sound channels of output stream for On-Cloud MixTranscoding. Valid values: 1, 2. 1 represents mono-channel, and 2 represents dual-channel.
    */
    @SerializedName("AudioChannels")
    @Expose
    private Long AudioChannels;

    /**
    * Output stream width in pixels for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [0, 1920].
    */
    @SerializedName("VideoWidth")
    @Expose
    private Long VideoWidth;

    /**
    * Output stream height in pixels for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [0, 1080].
    */
    @SerializedName("VideoHeight")
    @Expose
    private Long VideoHeight;

    /**
    * Output bitrate (Kbps) for On-Cloud MixTranscoding, which is required for audio-video output. Value range: 1-10000
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * Output stream frame rate for On-Cloud MixTranscoding in FPS. This parameter is required for audio/video outputs. Value range: [1, 60].
    */
    @SerializedName("VideoFramerate")
    @Expose
    private Long VideoFramerate;

    /**
    * Output stream GOP in seconds for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [1, 5].
    */
    @SerializedName("VideoGop")
    @Expose
    private Long VideoGop;

    /**
    * Output background color for On-Cloud MixTranscoding. Valid values: decimal integers. Commonly used colors include:
Red: 0xff0000, whose decimal number is 16724736
Yellow: 0xffff00, whose decimal number is 16776960
Green: 0x33cc00, whose decimal number is 3394560
Blue: 0x0066ff, whose decimal number is 26367
Black: 0x000000, whose decimal number is 0
White: 0xFFFFFF, whose decimal number is 16777215
Grey: 0x999999, whose decimal number is 10066329
    */
    @SerializedName("BackgroundColor")
    @Expose
    private Long BackgroundColor;

    /**
    * Output stream background image for stream mix. Its value is the ID of image uploaded through the TRTC Console.
    */
    @SerializedName("BackgroundImageId")
    @Expose
    private Long BackgroundImageId;

    /**
    * Output audio codec for On-Cloud MixTranscoding. Valid values: 0, 1, 2. 0 (default): LC-AAC; 1: HE-AAC; 2: HE-AACv2. If this parameter is set to 2 (HE-AACv2), On-Cloud MixTranscoding can produce only dual-channel streams. If it is set to 1 (HE-AAC) or 2 (HE-AACv2), the valid values for the audio sample rate of output streams are 48000, 44100, 32000, 24000, and 16000.
    */
    @SerializedName("AudioCodec")
    @Expose
    private Long AudioCodec;

    /**
     * Get Output audio sample rate (Hz) for On-Cloud MixTranscoding. Valid values: 48000, 44100, 32000, 24000, 16000, 8000 
     * @return AudioSampleRate Output audio sample rate (Hz) for On-Cloud MixTranscoding. Valid values: 48000, 44100, 32000, 24000, 16000, 8000
     */
    public Long getAudioSampleRate() {
        return this.AudioSampleRate;
    }

    /**
     * Set Output audio sample rate (Hz) for On-Cloud MixTranscoding. Valid values: 48000, 44100, 32000, 24000, 16000, 8000
     * @param AudioSampleRate Output audio sample rate (Hz) for On-Cloud MixTranscoding. Valid values: 48000, 44100, 32000, 24000, 16000, 8000
     */
    public void setAudioSampleRate(Long AudioSampleRate) {
        this.AudioSampleRate = AudioSampleRate;
    }

    /**
     * Get Output audio bitrate (Kbps) for On-Cloud MixTranscoding. Value range: 8-500 
     * @return AudioBitrate Output audio bitrate (Kbps) for On-Cloud MixTranscoding. Value range: 8-500
     */
    public Long getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * Set Output audio bitrate (Kbps) for On-Cloud MixTranscoding. Value range: 8-500
     * @param AudioBitrate Output audio bitrate (Kbps) for On-Cloud MixTranscoding. Value range: 8-500
     */
    public void setAudioBitrate(Long AudioBitrate) {
        this.AudioBitrate = AudioBitrate;
    }

    /**
     * Get Number of sound channels of output stream for On-Cloud MixTranscoding. Valid values: 1, 2. 1 represents mono-channel, and 2 represents dual-channel. 
     * @return AudioChannels Number of sound channels of output stream for On-Cloud MixTranscoding. Valid values: 1, 2. 1 represents mono-channel, and 2 represents dual-channel.
     */
    public Long getAudioChannels() {
        return this.AudioChannels;
    }

    /**
     * Set Number of sound channels of output stream for On-Cloud MixTranscoding. Valid values: 1, 2. 1 represents mono-channel, and 2 represents dual-channel.
     * @param AudioChannels Number of sound channels of output stream for On-Cloud MixTranscoding. Valid values: 1, 2. 1 represents mono-channel, and 2 represents dual-channel.
     */
    public void setAudioChannels(Long AudioChannels) {
        this.AudioChannels = AudioChannels;
    }

    /**
     * Get Output stream width in pixels for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [0, 1920]. 
     * @return VideoWidth Output stream width in pixels for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [0, 1920].
     */
    public Long getVideoWidth() {
        return this.VideoWidth;
    }

    /**
     * Set Output stream width in pixels for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [0, 1920].
     * @param VideoWidth Output stream width in pixels for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [0, 1920].
     */
    public void setVideoWidth(Long VideoWidth) {
        this.VideoWidth = VideoWidth;
    }

    /**
     * Get Output stream height in pixels for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [0, 1080]. 
     * @return VideoHeight Output stream height in pixels for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [0, 1080].
     */
    public Long getVideoHeight() {
        return this.VideoHeight;
    }

    /**
     * Set Output stream height in pixels for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [0, 1080].
     * @param VideoHeight Output stream height in pixels for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [0, 1080].
     */
    public void setVideoHeight(Long VideoHeight) {
        this.VideoHeight = VideoHeight;
    }

    /**
     * Get Output bitrate (Kbps) for On-Cloud MixTranscoding, which is required for audio-video output. Value range: 1-10000 
     * @return VideoBitrate Output bitrate (Kbps) for On-Cloud MixTranscoding, which is required for audio-video output. Value range: 1-10000
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set Output bitrate (Kbps) for On-Cloud MixTranscoding, which is required for audio-video output. Value range: 1-10000
     * @param VideoBitrate Output bitrate (Kbps) for On-Cloud MixTranscoding, which is required for audio-video output. Value range: 1-10000
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get Output stream frame rate for On-Cloud MixTranscoding in FPS. This parameter is required for audio/video outputs. Value range: [1, 60]. 
     * @return VideoFramerate Output stream frame rate for On-Cloud MixTranscoding in FPS. This parameter is required for audio/video outputs. Value range: [1, 60].
     */
    public Long getVideoFramerate() {
        return this.VideoFramerate;
    }

    /**
     * Set Output stream frame rate for On-Cloud MixTranscoding in FPS. This parameter is required for audio/video outputs. Value range: [1, 60].
     * @param VideoFramerate Output stream frame rate for On-Cloud MixTranscoding in FPS. This parameter is required for audio/video outputs. Value range: [1, 60].
     */
    public void setVideoFramerate(Long VideoFramerate) {
        this.VideoFramerate = VideoFramerate;
    }

    /**
     * Get Output stream GOP in seconds for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [1, 5]. 
     * @return VideoGop Output stream GOP in seconds for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [1, 5].
     */
    public Long getVideoGop() {
        return this.VideoGop;
    }

    /**
     * Set Output stream GOP in seconds for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [1, 5].
     * @param VideoGop Output stream GOP in seconds for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [1, 5].
     */
    public void setVideoGop(Long VideoGop) {
        this.VideoGop = VideoGop;
    }

    /**
     * Get Output background color for On-Cloud MixTranscoding. Valid values: decimal integers. Commonly used colors include:
Red: 0xff0000, whose decimal number is 16724736
Yellow: 0xffff00, whose decimal number is 16776960
Green: 0x33cc00, whose decimal number is 3394560
Blue: 0x0066ff, whose decimal number is 26367
Black: 0x000000, whose decimal number is 0
White: 0xFFFFFF, whose decimal number is 16777215
Grey: 0x999999, whose decimal number is 10066329 
     * @return BackgroundColor Output background color for On-Cloud MixTranscoding. Valid values: decimal integers. Commonly used colors include:
Red: 0xff0000, whose decimal number is 16724736
Yellow: 0xffff00, whose decimal number is 16776960
Green: 0x33cc00, whose decimal number is 3394560
Blue: 0x0066ff, whose decimal number is 26367
Black: 0x000000, whose decimal number is 0
White: 0xFFFFFF, whose decimal number is 16777215
Grey: 0x999999, whose decimal number is 10066329
     */
    public Long getBackgroundColor() {
        return this.BackgroundColor;
    }

    /**
     * Set Output background color for On-Cloud MixTranscoding. Valid values: decimal integers. Commonly used colors include:
Red: 0xff0000, whose decimal number is 16724736
Yellow: 0xffff00, whose decimal number is 16776960
Green: 0x33cc00, whose decimal number is 3394560
Blue: 0x0066ff, whose decimal number is 26367
Black: 0x000000, whose decimal number is 0
White: 0xFFFFFF, whose decimal number is 16777215
Grey: 0x999999, whose decimal number is 10066329
     * @param BackgroundColor Output background color for On-Cloud MixTranscoding. Valid values: decimal integers. Commonly used colors include:
Red: 0xff0000, whose decimal number is 16724736
Yellow: 0xffff00, whose decimal number is 16776960
Green: 0x33cc00, whose decimal number is 3394560
Blue: 0x0066ff, whose decimal number is 26367
Black: 0x000000, whose decimal number is 0
White: 0xFFFFFF, whose decimal number is 16777215
Grey: 0x999999, whose decimal number is 10066329
     */
    public void setBackgroundColor(Long BackgroundColor) {
        this.BackgroundColor = BackgroundColor;
    }

    /**
     * Get Output stream background image for stream mix. Its value is the ID of image uploaded through the TRTC Console. 
     * @return BackgroundImageId Output stream background image for stream mix. Its value is the ID of image uploaded through the TRTC Console.
     */
    public Long getBackgroundImageId() {
        return this.BackgroundImageId;
    }

    /**
     * Set Output stream background image for stream mix. Its value is the ID of image uploaded through the TRTC Console.
     * @param BackgroundImageId Output stream background image for stream mix. Its value is the ID of image uploaded through the TRTC Console.
     */
    public void setBackgroundImageId(Long BackgroundImageId) {
        this.BackgroundImageId = BackgroundImageId;
    }

    /**
     * Get Output audio codec for On-Cloud MixTranscoding. Valid values: 0, 1, 2. 0 (default): LC-AAC; 1: HE-AAC; 2: HE-AACv2. If this parameter is set to 2 (HE-AACv2), On-Cloud MixTranscoding can produce only dual-channel streams. If it is set to 1 (HE-AAC) or 2 (HE-AACv2), the valid values for the audio sample rate of output streams are 48000, 44100, 32000, 24000, and 16000. 
     * @return AudioCodec Output audio codec for On-Cloud MixTranscoding. Valid values: 0, 1, 2. 0 (default): LC-AAC; 1: HE-AAC; 2: HE-AACv2. If this parameter is set to 2 (HE-AACv2), On-Cloud MixTranscoding can produce only dual-channel streams. If it is set to 1 (HE-AAC) or 2 (HE-AACv2), the valid values for the audio sample rate of output streams are 48000, 44100, 32000, 24000, and 16000.
     */
    public Long getAudioCodec() {
        return this.AudioCodec;
    }

    /**
     * Set Output audio codec for On-Cloud MixTranscoding. Valid values: 0, 1, 2. 0 (default): LC-AAC; 1: HE-AAC; 2: HE-AACv2. If this parameter is set to 2 (HE-AACv2), On-Cloud MixTranscoding can produce only dual-channel streams. If it is set to 1 (HE-AAC) or 2 (HE-AACv2), the valid values for the audio sample rate of output streams are 48000, 44100, 32000, 24000, and 16000.
     * @param AudioCodec Output audio codec for On-Cloud MixTranscoding. Valid values: 0, 1, 2. 0 (default): LC-AAC; 1: HE-AAC; 2: HE-AACv2. If this parameter is set to 2 (HE-AACv2), On-Cloud MixTranscoding can produce only dual-channel streams. If it is set to 1 (HE-AAC) or 2 (HE-AACv2), the valid values for the audio sample rate of output streams are 48000, 44100, 32000, 24000, and 16000.
     */
    public void setAudioCodec(Long AudioCodec) {
        this.AudioCodec = AudioCodec;
    }

    public EncodeParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EncodeParams(EncodeParams source) {
        if (source.AudioSampleRate != null) {
            this.AudioSampleRate = new Long(source.AudioSampleRate);
        }
        if (source.AudioBitrate != null) {
            this.AudioBitrate = new Long(source.AudioBitrate);
        }
        if (source.AudioChannels != null) {
            this.AudioChannels = new Long(source.AudioChannels);
        }
        if (source.VideoWidth != null) {
            this.VideoWidth = new Long(source.VideoWidth);
        }
        if (source.VideoHeight != null) {
            this.VideoHeight = new Long(source.VideoHeight);
        }
        if (source.VideoBitrate != null) {
            this.VideoBitrate = new Long(source.VideoBitrate);
        }
        if (source.VideoFramerate != null) {
            this.VideoFramerate = new Long(source.VideoFramerate);
        }
        if (source.VideoGop != null) {
            this.VideoGop = new Long(source.VideoGop);
        }
        if (source.BackgroundColor != null) {
            this.BackgroundColor = new Long(source.BackgroundColor);
        }
        if (source.BackgroundImageId != null) {
            this.BackgroundImageId = new Long(source.BackgroundImageId);
        }
        if (source.AudioCodec != null) {
            this.AudioCodec = new Long(source.AudioCodec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AudioSampleRate", this.AudioSampleRate);
        this.setParamSimple(map, prefix + "AudioBitrate", this.AudioBitrate);
        this.setParamSimple(map, prefix + "AudioChannels", this.AudioChannels);
        this.setParamSimple(map, prefix + "VideoWidth", this.VideoWidth);
        this.setParamSimple(map, prefix + "VideoHeight", this.VideoHeight);
        this.setParamSimple(map, prefix + "VideoBitrate", this.VideoBitrate);
        this.setParamSimple(map, prefix + "VideoFramerate", this.VideoFramerate);
        this.setParamSimple(map, prefix + "VideoGop", this.VideoGop);
        this.setParamSimple(map, prefix + "BackgroundColor", this.BackgroundColor);
        this.setParamSimple(map, prefix + "BackgroundImageId", this.BackgroundImageId);
        this.setParamSimple(map, prefix + "AudioCodec", this.AudioCodec);

    }
}

