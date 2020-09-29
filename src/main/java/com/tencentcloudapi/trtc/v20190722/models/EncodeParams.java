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
    * Output stream audio sample rate for stream mix in Hz. Valid values: 48000, 44100, 32000, 24000, 16000, 12000, 8000.
    */
    @SerializedName("AudioSampleRate")
    @Expose
    private Long AudioSampleRate;

    /**
    * Output stream audio bitrate in Kbps for On-Cloud MixTranscoding. Value range: [8, 500].
    */
    @SerializedName("AudioBitrate")
    @Expose
    private Long AudioBitrate;

    /**
    * Number of output stream audio sound channels for On-Cloud MixTranscoding. Value range: [1, 2].
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
    * Output stream bitrate in Kbps for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [1, 10000].
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * Output stream frame rate for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [6, 12, 15, 24, 30, 48, 60]. If the frame rate lies outside the valid value range, it will be automatically modified to a value within the range.
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
    * Output stream background color for On-Cloud MixTranscoding.
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
     * Get Output stream audio sample rate for stream mix in Hz. Valid values: 48000, 44100, 32000, 24000, 16000, 12000, 8000. 
     * @return AudioSampleRate Output stream audio sample rate for stream mix in Hz. Valid values: 48000, 44100, 32000, 24000, 16000, 12000, 8000.
     */
    public Long getAudioSampleRate() {
        return this.AudioSampleRate;
    }

    /**
     * Set Output stream audio sample rate for stream mix in Hz. Valid values: 48000, 44100, 32000, 24000, 16000, 12000, 8000.
     * @param AudioSampleRate Output stream audio sample rate for stream mix in Hz. Valid values: 48000, 44100, 32000, 24000, 16000, 12000, 8000.
     */
    public void setAudioSampleRate(Long AudioSampleRate) {
        this.AudioSampleRate = AudioSampleRate;
    }

    /**
     * Get Output stream audio bitrate in Kbps for On-Cloud MixTranscoding. Value range: [8, 500]. 
     * @return AudioBitrate Output stream audio bitrate in Kbps for On-Cloud MixTranscoding. Value range: [8, 500].
     */
    public Long getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * Set Output stream audio bitrate in Kbps for On-Cloud MixTranscoding. Value range: [8, 500].
     * @param AudioBitrate Output stream audio bitrate in Kbps for On-Cloud MixTranscoding. Value range: [8, 500].
     */
    public void setAudioBitrate(Long AudioBitrate) {
        this.AudioBitrate = AudioBitrate;
    }

    /**
     * Get Number of output stream audio sound channels for On-Cloud MixTranscoding. Value range: [1, 2]. 
     * @return AudioChannels Number of output stream audio sound channels for On-Cloud MixTranscoding. Value range: [1, 2].
     */
    public Long getAudioChannels() {
        return this.AudioChannels;
    }

    /**
     * Set Number of output stream audio sound channels for On-Cloud MixTranscoding. Value range: [1, 2].
     * @param AudioChannels Number of output stream audio sound channels for On-Cloud MixTranscoding. Value range: [1, 2].
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
     * Get Output stream bitrate in Kbps for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [1, 10000]. 
     * @return VideoBitrate Output stream bitrate in Kbps for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [1, 10000].
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set Output stream bitrate in Kbps for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [1, 10000].
     * @param VideoBitrate Output stream bitrate in Kbps for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [1, 10000].
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get Output stream frame rate for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [6, 12, 15, 24, 30, 48, 60]. If the frame rate lies outside the valid value range, it will be automatically modified to a value within the range. 
     * @return VideoFramerate Output stream frame rate for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [6, 12, 15, 24, 30, 48, 60]. If the frame rate lies outside the valid value range, it will be automatically modified to a value within the range.
     */
    public Long getVideoFramerate() {
        return this.VideoFramerate;
    }

    /**
     * Set Output stream frame rate for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [6, 12, 15, 24, 30, 48, 60]. If the frame rate lies outside the valid value range, it will be automatically modified to a value within the range.
     * @param VideoFramerate Output stream frame rate for On-Cloud MixTranscoding, which is required for audio/video output. Value range: [6, 12, 15, 24, 30, 48, 60]. If the frame rate lies outside the valid value range, it will be automatically modified to a value within the range.
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
     * Get Output stream background color for On-Cloud MixTranscoding. 
     * @return BackgroundColor Output stream background color for On-Cloud MixTranscoding.
     */
    public Long getBackgroundColor() {
        return this.BackgroundColor;
    }

    /**
     * Set Output stream background color for On-Cloud MixTranscoding.
     * @param BackgroundColor Output stream background color for On-Cloud MixTranscoding.
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

    }
}

