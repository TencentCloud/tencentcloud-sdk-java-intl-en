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

public class TemplateInfo extends AbstractModel{

    /**
    * Video encoding format:
h264/h265.
    */
    @SerializedName("Vcodec")
    @Expose
    private String Vcodec;

    /**
    * Video bitrate. Value range: 100-8000 Kbps.
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * Audio codec. Valid values: aac, mp3.
    */
    @SerializedName("Acodec")
    @Expose
    private String Acodec;

    /**
    * Audio bitrate. Value range: 0-500 Kbps.
    */
    @SerializedName("AudioBitrate")
    @Expose
    private Long AudioBitrate;

    /**
    * Width. Value range: 0-3000.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Height. Value range: 0-3000.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Frame rate. Value range: 0-200 FPS.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Keyframe interval. Value range: 1-50s.
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * Rotation angle. Valid values: 0, 90, 180, 270.
    */
    @SerializedName("Rotate")
    @Expose
    private Long Rotate;

    /**
    * Encoding quality. Valid values:
baseline, main, high.
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * Whether to not exceed the original bitrate. 0: no; 1: yes.
    */
    @SerializedName("BitrateToOrig")
    @Expose
    private Long BitrateToOrig;

    /**
    * Whether to not exceed the original height. 0: no; 1: yes.
    */
    @SerializedName("HeightToOrig")
    @Expose
    private Long HeightToOrig;

    /**
    * Whether to not exceed the original frame rate. 0: no; 1: yes.
    */
    @SerializedName("FpsToOrig")
    @Expose
    private Long FpsToOrig;

    /**
    * Whether to keep the video. 0: no; 1: yes.
    */
    @SerializedName("NeedVideo")
    @Expose
    private Long NeedVideo;

    /**
    * Whether to keep the audio. 0: no; 1: yes.
    */
    @SerializedName("NeedAudio")
    @Expose
    private Long NeedAudio;

    /**
    * Template ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * Template name.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Template description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Whether it is a top speed codec template. 0: no, 1: yes. Default value: 0.
    */
    @SerializedName("AiTransCode")
    @Expose
    private Long AiTransCode;

    /**
    * `VideoBitrate` minus top speed codec bitrate. Value range: 0.1-0.5.
    */
    @SerializedName("AdaptBitratePercent")
    @Expose
    private Float AdaptBitratePercent;

    /**
     * Get Video encoding format:
h264/h265. 
     * @return Vcodec Video encoding format:
h264/h265.
     */
    public String getVcodec() {
        return this.Vcodec;
    }

    /**
     * Set Video encoding format:
h264/h265.
     * @param Vcodec Video encoding format:
h264/h265.
     */
    public void setVcodec(String Vcodec) {
        this.Vcodec = Vcodec;
    }

    /**
     * Get Video bitrate. Value range: 100-8000 Kbps. 
     * @return VideoBitrate Video bitrate. Value range: 100-8000 Kbps.
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set Video bitrate. Value range: 100-8000 Kbps.
     * @param VideoBitrate Video bitrate. Value range: 100-8000 Kbps.
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get Audio codec. Valid values: aac, mp3. 
     * @return Acodec Audio codec. Valid values: aac, mp3.
     */
    public String getAcodec() {
        return this.Acodec;
    }

    /**
     * Set Audio codec. Valid values: aac, mp3.
     * @param Acodec Audio codec. Valid values: aac, mp3.
     */
    public void setAcodec(String Acodec) {
        this.Acodec = Acodec;
    }

    /**
     * Get Audio bitrate. Value range: 0-500 Kbps. 
     * @return AudioBitrate Audio bitrate. Value range: 0-500 Kbps.
     */
    public Long getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * Set Audio bitrate. Value range: 0-500 Kbps.
     * @param AudioBitrate Audio bitrate. Value range: 0-500 Kbps.
     */
    public void setAudioBitrate(Long AudioBitrate) {
        this.AudioBitrate = AudioBitrate;
    }

    /**
     * Get Width. Value range: 0-3000. 
     * @return Width Width. Value range: 0-3000.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width. Value range: 0-3000.
     * @param Width Width. Value range: 0-3000.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Height. Value range: 0-3000. 
     * @return Height Height. Value range: 0-3000.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height. Value range: 0-3000.
     * @param Height Height. Value range: 0-3000.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Frame rate. Value range: 0-200 FPS. 
     * @return Fps Frame rate. Value range: 0-200 FPS.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Frame rate. Value range: 0-200 FPS.
     * @param Fps Frame rate. Value range: 0-200 FPS.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Keyframe interval. Value range: 1-50s. 
     * @return Gop Keyframe interval. Value range: 1-50s.
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set Keyframe interval. Value range: 1-50s.
     * @param Gop Keyframe interval. Value range: 1-50s.
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get Rotation angle. Valid values: 0, 90, 180, 270. 
     * @return Rotate Rotation angle. Valid values: 0, 90, 180, 270.
     */
    public Long getRotate() {
        return this.Rotate;
    }

    /**
     * Set Rotation angle. Valid values: 0, 90, 180, 270.
     * @param Rotate Rotation angle. Valid values: 0, 90, 180, 270.
     */
    public void setRotate(Long Rotate) {
        this.Rotate = Rotate;
    }

    /**
     * Get Encoding quality. Valid values:
baseline, main, high. 
     * @return Profile Encoding quality. Valid values:
baseline, main, high.
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set Encoding quality. Valid values:
baseline, main, high.
     * @param Profile Encoding quality. Valid values:
baseline, main, high.
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Get Whether to not exceed the original bitrate. 0: no; 1: yes. 
     * @return BitrateToOrig Whether to not exceed the original bitrate. 0: no; 1: yes.
     */
    public Long getBitrateToOrig() {
        return this.BitrateToOrig;
    }

    /**
     * Set Whether to not exceed the original bitrate. 0: no; 1: yes.
     * @param BitrateToOrig Whether to not exceed the original bitrate. 0: no; 1: yes.
     */
    public void setBitrateToOrig(Long BitrateToOrig) {
        this.BitrateToOrig = BitrateToOrig;
    }

    /**
     * Get Whether to not exceed the original height. 0: no; 1: yes. 
     * @return HeightToOrig Whether to not exceed the original height. 0: no; 1: yes.
     */
    public Long getHeightToOrig() {
        return this.HeightToOrig;
    }

    /**
     * Set Whether to not exceed the original height. 0: no; 1: yes.
     * @param HeightToOrig Whether to not exceed the original height. 0: no; 1: yes.
     */
    public void setHeightToOrig(Long HeightToOrig) {
        this.HeightToOrig = HeightToOrig;
    }

    /**
     * Get Whether to not exceed the original frame rate. 0: no; 1: yes. 
     * @return FpsToOrig Whether to not exceed the original frame rate. 0: no; 1: yes.
     */
    public Long getFpsToOrig() {
        return this.FpsToOrig;
    }

    /**
     * Set Whether to not exceed the original frame rate. 0: no; 1: yes.
     * @param FpsToOrig Whether to not exceed the original frame rate. 0: no; 1: yes.
     */
    public void setFpsToOrig(Long FpsToOrig) {
        this.FpsToOrig = FpsToOrig;
    }

    /**
     * Get Whether to keep the video. 0: no; 1: yes. 
     * @return NeedVideo Whether to keep the video. 0: no; 1: yes.
     */
    public Long getNeedVideo() {
        return this.NeedVideo;
    }

    /**
     * Set Whether to keep the video. 0: no; 1: yes.
     * @param NeedVideo Whether to keep the video. 0: no; 1: yes.
     */
    public void setNeedVideo(Long NeedVideo) {
        this.NeedVideo = NeedVideo;
    }

    /**
     * Get Whether to keep the audio. 0: no; 1: yes. 
     * @return NeedAudio Whether to keep the audio. 0: no; 1: yes.
     */
    public Long getNeedAudio() {
        return this.NeedAudio;
    }

    /**
     * Set Whether to keep the audio. 0: no; 1: yes.
     * @param NeedAudio Whether to keep the audio. 0: no; 1: yes.
     */
    public void setNeedAudio(Long NeedAudio) {
        this.NeedAudio = NeedAudio;
    }

    /**
     * Get Template ID. 
     * @return TemplateId Template ID.
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID.
     * @param TemplateId Template ID.
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Template name. 
     * @return TemplateName Template name.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name.
     * @param TemplateName Template name.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
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
     * Get `VideoBitrate` minus top speed codec bitrate. Value range: 0.1-0.5. 
     * @return AdaptBitratePercent `VideoBitrate` minus top speed codec bitrate. Value range: 0.1-0.5.
     */
    public Float getAdaptBitratePercent() {
        return this.AdaptBitratePercent;
    }

    /**
     * Set `VideoBitrate` minus top speed codec bitrate. Value range: 0.1-0.5.
     * @param AdaptBitratePercent `VideoBitrate` minus top speed codec bitrate. Value range: 0.1-0.5.
     */
    public void setAdaptBitratePercent(Float AdaptBitratePercent) {
        this.AdaptBitratePercent = AdaptBitratePercent;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vcodec", this.Vcodec);
        this.setParamSimple(map, prefix + "VideoBitrate", this.VideoBitrate);
        this.setParamSimple(map, prefix + "Acodec", this.Acodec);
        this.setParamSimple(map, prefix + "AudioBitrate", this.AudioBitrate);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Gop", this.Gop);
        this.setParamSimple(map, prefix + "Rotate", this.Rotate);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "BitrateToOrig", this.BitrateToOrig);
        this.setParamSimple(map, prefix + "HeightToOrig", this.HeightToOrig);
        this.setParamSimple(map, prefix + "FpsToOrig", this.FpsToOrig);
        this.setParamSimple(map, prefix + "NeedVideo", this.NeedVideo);
        this.setParamSimple(map, prefix + "NeedAudio", this.NeedAudio);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AiTransCode", this.AiTransCode);
        this.setParamSimple(map, prefix + "AdaptBitratePercent", this.AdaptBitratePercent);

    }
}

