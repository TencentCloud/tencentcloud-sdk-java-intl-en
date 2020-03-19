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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLiveTranscodeTemplateRequest extends AbstractModel{

    /**
    * Template name, such as 900 900p. This can be only a combination of letters and digits.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Video bitrate. Value range: 100–8,000.
Note: The bitrate must be a multiple of 100.
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * Video encoding format. Valid values: h264, h265. Default value: h264.
    */
    @SerializedName("Vcodec")
    @Expose
    private String Vcodec;

    /**
    * Audio encoding in ACC format. Default value: original audio format.
Note: This parameter will take effect later.
    */
    @SerializedName("Acodec")
    @Expose
    private String Acodec;

    /**
    * Audio bitrate. Value range: 0–500. Default value: 0.
    */
    @SerializedName("AudioBitrate")
    @Expose
    private Long AudioBitrate;

    /**
    * Template description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Width. Default value: 0.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Whether to keep the video. 0: no; 1: yes. Default value: 1.
    */
    @SerializedName("NeedVideo")
    @Expose
    private Long NeedVideo;

    /**
    * Whether to keep the audio. 0: no; 1: yes. Default value: 1.
    */
    @SerializedName("NeedAudio")
    @Expose
    private Long NeedAudio;

    /**
    * Height. Default value: 0.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Frame rate. Default value: 0.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Keyframe interval in seconds. Original interval by default
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * Whether to rotate. 0: no; 1: yes. Default value: 0.
    */
    @SerializedName("Rotate")
    @Expose
    private Long Rotate;

    /**
    * Encoding quality:
baseline/main/high. Default value: baseline.
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * Whether to not exceed the original bitrate. 0: no; 1: yes. Default value: 0.
    */
    @SerializedName("BitrateToOrig")
    @Expose
    private Long BitrateToOrig;

    /**
    * Whether to not exceed the original height. 0: no; 1: yes. Default value: 0.
    */
    @SerializedName("HeightToOrig")
    @Expose
    private Long HeightToOrig;

    /**
    * Whether to not exceed the original frame rate. 0: no; 1: yes. Default value: 0.
    */
    @SerializedName("FpsToOrig")
    @Expose
    private Long FpsToOrig;

    /**
    * Whether it is a top speed codec template. 0: no, 1: yes. Default value: 0.
    */
    @SerializedName("AiTransCode")
    @Expose
    private Long AiTransCode;

    /**
    * `VideoBitrate` minus top speed codec bitrate. Value range: 0.1–0.5.
    */
    @SerializedName("AdaptBitratePercent")
    @Expose
    private Float AdaptBitratePercent;

    /**
     * Get Template name, such as 900 900p. This can be only a combination of letters and digits. 
     * @return TemplateName Template name, such as 900 900p. This can be only a combination of letters and digits.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name, such as 900 900p. This can be only a combination of letters and digits.
     * @param TemplateName Template name, such as 900 900p. This can be only a combination of letters and digits.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Video bitrate. Value range: 100–8,000.
Note: The bitrate must be a multiple of 100. 
     * @return VideoBitrate Video bitrate. Value range: 100–8,000.
Note: The bitrate must be a multiple of 100.
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set Video bitrate. Value range: 100–8,000.
Note: The bitrate must be a multiple of 100.
     * @param VideoBitrate Video bitrate. Value range: 100–8,000.
Note: The bitrate must be a multiple of 100.
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get Video encoding format. Valid values: h264, h265. Default value: h264. 
     * @return Vcodec Video encoding format. Valid values: h264, h265. Default value: h264.
     */
    public String getVcodec() {
        return this.Vcodec;
    }

    /**
     * Set Video encoding format. Valid values: h264, h265. Default value: h264.
     * @param Vcodec Video encoding format. Valid values: h264, h265. Default value: h264.
     */
    public void setVcodec(String Vcodec) {
        this.Vcodec = Vcodec;
    }

    /**
     * Get Audio encoding in ACC format. Default value: original audio format.
Note: This parameter will take effect later. 
     * @return Acodec Audio encoding in ACC format. Default value: original audio format.
Note: This parameter will take effect later.
     */
    public String getAcodec() {
        return this.Acodec;
    }

    /**
     * Set Audio encoding in ACC format. Default value: original audio format.
Note: This parameter will take effect later.
     * @param Acodec Audio encoding in ACC format. Default value: original audio format.
Note: This parameter will take effect later.
     */
    public void setAcodec(String Acodec) {
        this.Acodec = Acodec;
    }

    /**
     * Get Audio bitrate. Value range: 0–500. Default value: 0. 
     * @return AudioBitrate Audio bitrate. Value range: 0–500. Default value: 0.
     */
    public Long getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * Set Audio bitrate. Value range: 0–500. Default value: 0.
     * @param AudioBitrate Audio bitrate. Value range: 0–500. Default value: 0.
     */
    public void setAudioBitrate(Long AudioBitrate) {
        this.AudioBitrate = AudioBitrate;
    }

    /**
     * Get Template description. 
     * @return Description Template description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Template description.
     * @param Description Template description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Width. Default value: 0. 
     * @return Width Width. Default value: 0.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width. Default value: 0.
     * @param Width Width. Default value: 0.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Whether to keep the video. 0: no; 1: yes. Default value: 1. 
     * @return NeedVideo Whether to keep the video. 0: no; 1: yes. Default value: 1.
     */
    public Long getNeedVideo() {
        return this.NeedVideo;
    }

    /**
     * Set Whether to keep the video. 0: no; 1: yes. Default value: 1.
     * @param NeedVideo Whether to keep the video. 0: no; 1: yes. Default value: 1.
     */
    public void setNeedVideo(Long NeedVideo) {
        this.NeedVideo = NeedVideo;
    }

    /**
     * Get Whether to keep the audio. 0: no; 1: yes. Default value: 1. 
     * @return NeedAudio Whether to keep the audio. 0: no; 1: yes. Default value: 1.
     */
    public Long getNeedAudio() {
        return this.NeedAudio;
    }

    /**
     * Set Whether to keep the audio. 0: no; 1: yes. Default value: 1.
     * @param NeedAudio Whether to keep the audio. 0: no; 1: yes. Default value: 1.
     */
    public void setNeedAudio(Long NeedAudio) {
        this.NeedAudio = NeedAudio;
    }

    /**
     * Get Height. Default value: 0. 
     * @return Height Height. Default value: 0.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height. Default value: 0.
     * @param Height Height. Default value: 0.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Frame rate. Default value: 0. 
     * @return Fps Frame rate. Default value: 0.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Frame rate. Default value: 0.
     * @param Fps Frame rate. Default value: 0.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Keyframe interval in seconds. Original interval by default 
     * @return Gop Keyframe interval in seconds. Original interval by default
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set Keyframe interval in seconds. Original interval by default
     * @param Gop Keyframe interval in seconds. Original interval by default
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get Whether to rotate. 0: no; 1: yes. Default value: 0. 
     * @return Rotate Whether to rotate. 0: no; 1: yes. Default value: 0.
     */
    public Long getRotate() {
        return this.Rotate;
    }

    /**
     * Set Whether to rotate. 0: no; 1: yes. Default value: 0.
     * @param Rotate Whether to rotate. 0: no; 1: yes. Default value: 0.
     */
    public void setRotate(Long Rotate) {
        this.Rotate = Rotate;
    }

    /**
     * Get Encoding quality:
baseline/main/high. Default value: baseline. 
     * @return Profile Encoding quality:
baseline/main/high. Default value: baseline.
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set Encoding quality:
baseline/main/high. Default value: baseline.
     * @param Profile Encoding quality:
baseline/main/high. Default value: baseline.
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Get Whether to not exceed the original bitrate. 0: no; 1: yes. Default value: 0. 
     * @return BitrateToOrig Whether to not exceed the original bitrate. 0: no; 1: yes. Default value: 0.
     */
    public Long getBitrateToOrig() {
        return this.BitrateToOrig;
    }

    /**
     * Set Whether to not exceed the original bitrate. 0: no; 1: yes. Default value: 0.
     * @param BitrateToOrig Whether to not exceed the original bitrate. 0: no; 1: yes. Default value: 0.
     */
    public void setBitrateToOrig(Long BitrateToOrig) {
        this.BitrateToOrig = BitrateToOrig;
    }

    /**
     * Get Whether to not exceed the original height. 0: no; 1: yes. Default value: 0. 
     * @return HeightToOrig Whether to not exceed the original height. 0: no; 1: yes. Default value: 0.
     */
    public Long getHeightToOrig() {
        return this.HeightToOrig;
    }

    /**
     * Set Whether to not exceed the original height. 0: no; 1: yes. Default value: 0.
     * @param HeightToOrig Whether to not exceed the original height. 0: no; 1: yes. Default value: 0.
     */
    public void setHeightToOrig(Long HeightToOrig) {
        this.HeightToOrig = HeightToOrig;
    }

    /**
     * Get Whether to not exceed the original frame rate. 0: no; 1: yes. Default value: 0. 
     * @return FpsToOrig Whether to not exceed the original frame rate. 0: no; 1: yes. Default value: 0.
     */
    public Long getFpsToOrig() {
        return this.FpsToOrig;
    }

    /**
     * Set Whether to not exceed the original frame rate. 0: no; 1: yes. Default value: 0.
     * @param FpsToOrig Whether to not exceed the original frame rate. 0: no; 1: yes. Default value: 0.
     */
    public void setFpsToOrig(Long FpsToOrig) {
        this.FpsToOrig = FpsToOrig;
    }

    /**
     * Get Whether it is a top speed codec template. 0: no, 1: yes. Default value: 0. 
     * @return AiTransCode Whether it is a top speed codec template. 0: no, 1: yes. Default value: 0.
     */
    public Long getAiTransCode() {
        return this.AiTransCode;
    }

    /**
     * Set Whether it is a top speed codec template. 0: no, 1: yes. Default value: 0.
     * @param AiTransCode Whether it is a top speed codec template. 0: no, 1: yes. Default value: 0.
     */
    public void setAiTransCode(Long AiTransCode) {
        this.AiTransCode = AiTransCode;
    }

    /**
     * Get `VideoBitrate` minus top speed codec bitrate. Value range: 0.1–0.5. 
     * @return AdaptBitratePercent `VideoBitrate` minus top speed codec bitrate. Value range: 0.1–0.5.
     */
    public Float getAdaptBitratePercent() {
        return this.AdaptBitratePercent;
    }

    /**
     * Set `VideoBitrate` minus top speed codec bitrate. Value range: 0.1–0.5.
     * @param AdaptBitratePercent `VideoBitrate` minus top speed codec bitrate. Value range: 0.1–0.5.
     */
    public void setAdaptBitratePercent(Float AdaptBitratePercent) {
        this.AdaptBitratePercent = AdaptBitratePercent;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "VideoBitrate", this.VideoBitrate);
        this.setParamSimple(map, prefix + "Vcodec", this.Vcodec);
        this.setParamSimple(map, prefix + "Acodec", this.Acodec);
        this.setParamSimple(map, prefix + "AudioBitrate", this.AudioBitrate);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "NeedVideo", this.NeedVideo);
        this.setParamSimple(map, prefix + "NeedAudio", this.NeedAudio);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Gop", this.Gop);
        this.setParamSimple(map, prefix + "Rotate", this.Rotate);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "BitrateToOrig", this.BitrateToOrig);
        this.setParamSimple(map, prefix + "HeightToOrig", this.HeightToOrig);
        this.setParamSimple(map, prefix + "FpsToOrig", this.FpsToOrig);
        this.setParamSimple(map, prefix + "AiTransCode", this.AiTransCode);
        this.setParamSimple(map, prefix + "AdaptBitratePercent", this.AdaptBitratePercent);

    }
}

