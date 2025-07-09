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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateInfo extends AbstractModel {

    /**
    * Codec: h264/h265/origin. Default value: h264.

origin: keep the original codec.
    */
    @SerializedName("Vcodec")
    @Expose
    private String Vcodec;

    /**
    * Video bitrate. Value range: 0–8,000 Kbps.
If the value is 0, the original bitrate will be retained.
Note: transcoding templates require a unique bitrate. The final saved bitrate may differ from the input bitrate.
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * Audio codec: aac. Default value: aac.
Note: This parameter will not take effect for now and will be supported soon.
    */
    @SerializedName("Acodec")
    @Expose
    private String Acodec;

    /**
    * Audio bitrate. Value range: 0–500 Kbps.
0 by default.
    */
    @SerializedName("AudioBitrate")
    @Expose
    private Long AudioBitrate;

    /**
    * Width. Default value: 0.
Value range: [0-3,000].
The value must be a multiple of 2. The original width is 0.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Height. Default value: 0.
Value range: [0-3,000].
The value must be a multiple of 2. The original width is 0.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Frame rate. Default value: 0.
Range: 0-60 Fps.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Keyframe interval, unit: second.
Original interval by default
Range: 2-6
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * Rotation angle. Default value: 0.
Value range: 0, 90, 180, 270
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
    * Whether to use the original bitrate when the set bitrate is larger than the original bitrate.
0: no, 1: yes
Default value: 0.
    */
    @SerializedName("BitrateToOrig")
    @Expose
    private Long BitrateToOrig;

    /**
    * Whether to use the original height when the set height is higher than the original height.
0: no, 1: yes
Default value: 0.
    */
    @SerializedName("HeightToOrig")
    @Expose
    private Long HeightToOrig;

    /**
    * Whether to use the original frame rate when the set frame rate is larger than the original frame rate.
0: no, 1: yes
Default value: 0.
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
    * Bitrate compression ratio of top speed code video.
Target bitrate of top speed code = VideoBitrate * (1-AdaptBitratePercent)

Value range: 0.0-0.5.
    */
    @SerializedName("AdaptBitratePercent")
    @Expose
    private Float AdaptBitratePercent;

    /**
    * Whether to take the shorter side as height. 0: no, 1: yes. Default value: 0.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("ShortEdgeAsHeight")
    @Expose
    private Long ShortEdgeAsHeight;

    /**
    * The DRM encryption type. Valid values: fairplay, normalaes, widevine.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DRMType")
    @Expose
    private String DRMType;

    /**
    * The tracks to encrypt. Valid values: AUDIO, SD, HD, UHD1, UHD2. Separate multiple tracks with “|”. You can choose only one video track (SD, HD, UHD1, or UHD2).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DRMTracks")
    @Expose
    private String DRMTracks;

    /**
     * Get Codec: h264/h265/origin. Default value: h264.

origin: keep the original codec. 
     * @return Vcodec Codec: h264/h265/origin. Default value: h264.

origin: keep the original codec.
     */
    public String getVcodec() {
        return this.Vcodec;
    }

    /**
     * Set Codec: h264/h265/origin. Default value: h264.

origin: keep the original codec.
     * @param Vcodec Codec: h264/h265/origin. Default value: h264.

origin: keep the original codec.
     */
    public void setVcodec(String Vcodec) {
        this.Vcodec = Vcodec;
    }

    /**
     * Get Video bitrate. Value range: 0–8,000 Kbps.
If the value is 0, the original bitrate will be retained.
Note: transcoding templates require a unique bitrate. The final saved bitrate may differ from the input bitrate. 
     * @return VideoBitrate Video bitrate. Value range: 0–8,000 Kbps.
If the value is 0, the original bitrate will be retained.
Note: transcoding templates require a unique bitrate. The final saved bitrate may differ from the input bitrate.
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set Video bitrate. Value range: 0–8,000 Kbps.
If the value is 0, the original bitrate will be retained.
Note: transcoding templates require a unique bitrate. The final saved bitrate may differ from the input bitrate.
     * @param VideoBitrate Video bitrate. Value range: 0–8,000 Kbps.
If the value is 0, the original bitrate will be retained.
Note: transcoding templates require a unique bitrate. The final saved bitrate may differ from the input bitrate.
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get Audio codec: aac. Default value: aac.
Note: This parameter will not take effect for now and will be supported soon. 
     * @return Acodec Audio codec: aac. Default value: aac.
Note: This parameter will not take effect for now and will be supported soon.
     */
    public String getAcodec() {
        return this.Acodec;
    }

    /**
     * Set Audio codec: aac. Default value: aac.
Note: This parameter will not take effect for now and will be supported soon.
     * @param Acodec Audio codec: aac. Default value: aac.
Note: This parameter will not take effect for now and will be supported soon.
     */
    public void setAcodec(String Acodec) {
        this.Acodec = Acodec;
    }

    /**
     * Get Audio bitrate. Value range: 0–500 Kbps.
0 by default. 
     * @return AudioBitrate Audio bitrate. Value range: 0–500 Kbps.
0 by default.
     */
    public Long getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * Set Audio bitrate. Value range: 0–500 Kbps.
0 by default.
     * @param AudioBitrate Audio bitrate. Value range: 0–500 Kbps.
0 by default.
     */
    public void setAudioBitrate(Long AudioBitrate) {
        this.AudioBitrate = AudioBitrate;
    }

    /**
     * Get Width. Default value: 0.
Value range: [0-3,000].
The value must be a multiple of 2. The original width is 0. 
     * @return Width Width. Default value: 0.
Value range: [0-3,000].
The value must be a multiple of 2. The original width is 0.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width. Default value: 0.
Value range: [0-3,000].
The value must be a multiple of 2. The original width is 0.
     * @param Width Width. Default value: 0.
Value range: [0-3,000].
The value must be a multiple of 2. The original width is 0.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Height. Default value: 0.
Value range: [0-3,000].
The value must be a multiple of 2. The original width is 0. 
     * @return Height Height. Default value: 0.
Value range: [0-3,000].
The value must be a multiple of 2. The original width is 0.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height. Default value: 0.
Value range: [0-3,000].
The value must be a multiple of 2. The original width is 0.
     * @param Height Height. Default value: 0.
Value range: [0-3,000].
The value must be a multiple of 2. The original width is 0.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Frame rate. Default value: 0.
Range: 0-60 Fps. 
     * @return Fps Frame rate. Default value: 0.
Range: 0-60 Fps.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Frame rate. Default value: 0.
Range: 0-60 Fps.
     * @param Fps Frame rate. Default value: 0.
Range: 0-60 Fps.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Keyframe interval, unit: second.
Original interval by default
Range: 2-6 
     * @return Gop Keyframe interval, unit: second.
Original interval by default
Range: 2-6
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set Keyframe interval, unit: second.
Original interval by default
Range: 2-6
     * @param Gop Keyframe interval, unit: second.
Original interval by default
Range: 2-6
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get Rotation angle. Default value: 0.
Value range: 0, 90, 180, 270 
     * @return Rotate Rotation angle. Default value: 0.
Value range: 0, 90, 180, 270
     */
    public Long getRotate() {
        return this.Rotate;
    }

    /**
     * Set Rotation angle. Default value: 0.
Value range: 0, 90, 180, 270
     * @param Rotate Rotation angle. Default value: 0.
Value range: 0, 90, 180, 270
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
     * Get Whether to use the original bitrate when the set bitrate is larger than the original bitrate.
0: no, 1: yes
Default value: 0. 
     * @return BitrateToOrig Whether to use the original bitrate when the set bitrate is larger than the original bitrate.
0: no, 1: yes
Default value: 0.
     */
    public Long getBitrateToOrig() {
        return this.BitrateToOrig;
    }

    /**
     * Set Whether to use the original bitrate when the set bitrate is larger than the original bitrate.
0: no, 1: yes
Default value: 0.
     * @param BitrateToOrig Whether to use the original bitrate when the set bitrate is larger than the original bitrate.
0: no, 1: yes
Default value: 0.
     */
    public void setBitrateToOrig(Long BitrateToOrig) {
        this.BitrateToOrig = BitrateToOrig;
    }

    /**
     * Get Whether to use the original height when the set height is higher than the original height.
0: no, 1: yes
Default value: 0. 
     * @return HeightToOrig Whether to use the original height when the set height is higher than the original height.
0: no, 1: yes
Default value: 0.
     */
    public Long getHeightToOrig() {
        return this.HeightToOrig;
    }

    /**
     * Set Whether to use the original height when the set height is higher than the original height.
0: no, 1: yes
Default value: 0.
     * @param HeightToOrig Whether to use the original height when the set height is higher than the original height.
0: no, 1: yes
Default value: 0.
     */
    public void setHeightToOrig(Long HeightToOrig) {
        this.HeightToOrig = HeightToOrig;
    }

    /**
     * Get Whether to use the original frame rate when the set frame rate is larger than the original frame rate.
0: no, 1: yes
Default value: 0. 
     * @return FpsToOrig Whether to use the original frame rate when the set frame rate is larger than the original frame rate.
0: no, 1: yes
Default value: 0.
     */
    public Long getFpsToOrig() {
        return this.FpsToOrig;
    }

    /**
     * Set Whether to use the original frame rate when the set frame rate is larger than the original frame rate.
0: no, 1: yes
Default value: 0.
     * @param FpsToOrig Whether to use the original frame rate when the set frame rate is larger than the original frame rate.
0: no, 1: yes
Default value: 0.
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
     * Get Bitrate compression ratio of top speed code video.
Target bitrate of top speed code = VideoBitrate * (1-AdaptBitratePercent)

Value range: 0.0-0.5. 
     * @return AdaptBitratePercent Bitrate compression ratio of top speed code video.
Target bitrate of top speed code = VideoBitrate * (1-AdaptBitratePercent)

Value range: 0.0-0.5.
     */
    public Float getAdaptBitratePercent() {
        return this.AdaptBitratePercent;
    }

    /**
     * Set Bitrate compression ratio of top speed code video.
Target bitrate of top speed code = VideoBitrate * (1-AdaptBitratePercent)

Value range: 0.0-0.5.
     * @param AdaptBitratePercent Bitrate compression ratio of top speed code video.
Target bitrate of top speed code = VideoBitrate * (1-AdaptBitratePercent)

Value range: 0.0-0.5.
     */
    public void setAdaptBitratePercent(Float AdaptBitratePercent) {
        this.AdaptBitratePercent = AdaptBitratePercent;
    }

    /**
     * Get Whether to take the shorter side as height. 0: no, 1: yes. Default value: 0.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return ShortEdgeAsHeight Whether to take the shorter side as height. 0: no, 1: yes. Default value: 0.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getShortEdgeAsHeight() {
        return this.ShortEdgeAsHeight;
    }

    /**
     * Set Whether to take the shorter side as height. 0: no, 1: yes. Default value: 0.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param ShortEdgeAsHeight Whether to take the shorter side as height. 0: no, 1: yes. Default value: 0.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setShortEdgeAsHeight(Long ShortEdgeAsHeight) {
        this.ShortEdgeAsHeight = ShortEdgeAsHeight;
    }

    /**
     * Get The DRM encryption type. Valid values: fairplay, normalaes, widevine.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DRMType The DRM encryption type. Valid values: fairplay, normalaes, widevine.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDRMType() {
        return this.DRMType;
    }

    /**
     * Set The DRM encryption type. Valid values: fairplay, normalaes, widevine.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DRMType The DRM encryption type. Valid values: fairplay, normalaes, widevine.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDRMType(String DRMType) {
        this.DRMType = DRMType;
    }

    /**
     * Get The tracks to encrypt. Valid values: AUDIO, SD, HD, UHD1, UHD2. Separate multiple tracks with “|”. You can choose only one video track (SD, HD, UHD1, or UHD2).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DRMTracks The tracks to encrypt. Valid values: AUDIO, SD, HD, UHD1, UHD2. Separate multiple tracks with “|”. You can choose only one video track (SD, HD, UHD1, or UHD2).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDRMTracks() {
        return this.DRMTracks;
    }

    /**
     * Set The tracks to encrypt. Valid values: AUDIO, SD, HD, UHD1, UHD2. Separate multiple tracks with “|”. You can choose only one video track (SD, HD, UHD1, or UHD2).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DRMTracks The tracks to encrypt. Valid values: AUDIO, SD, HD, UHD1, UHD2. Separate multiple tracks with “|”. You can choose only one video track (SD, HD, UHD1, or UHD2).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDRMTracks(String DRMTracks) {
        this.DRMTracks = DRMTracks;
    }

    public TemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateInfo(TemplateInfo source) {
        if (source.Vcodec != null) {
            this.Vcodec = new String(source.Vcodec);
        }
        if (source.VideoBitrate != null) {
            this.VideoBitrate = new Long(source.VideoBitrate);
        }
        if (source.Acodec != null) {
            this.Acodec = new String(source.Acodec);
        }
        if (source.AudioBitrate != null) {
            this.AudioBitrate = new Long(source.AudioBitrate);
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
        if (source.Gop != null) {
            this.Gop = new Long(source.Gop);
        }
        if (source.Rotate != null) {
            this.Rotate = new Long(source.Rotate);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
        if (source.BitrateToOrig != null) {
            this.BitrateToOrig = new Long(source.BitrateToOrig);
        }
        if (source.HeightToOrig != null) {
            this.HeightToOrig = new Long(source.HeightToOrig);
        }
        if (source.FpsToOrig != null) {
            this.FpsToOrig = new Long(source.FpsToOrig);
        }
        if (source.NeedVideo != null) {
            this.NeedVideo = new Long(source.NeedVideo);
        }
        if (source.NeedAudio != null) {
            this.NeedAudio = new Long(source.NeedAudio);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AiTransCode != null) {
            this.AiTransCode = new Long(source.AiTransCode);
        }
        if (source.AdaptBitratePercent != null) {
            this.AdaptBitratePercent = new Float(source.AdaptBitratePercent);
        }
        if (source.ShortEdgeAsHeight != null) {
            this.ShortEdgeAsHeight = new Long(source.ShortEdgeAsHeight);
        }
        if (source.DRMType != null) {
            this.DRMType = new String(source.DRMType);
        }
        if (source.DRMTracks != null) {
            this.DRMTracks = new String(source.DRMTracks);
        }
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
        this.setParamSimple(map, prefix + "ShortEdgeAsHeight", this.ShortEdgeAsHeight);
        this.setParamSimple(map, prefix + "DRMType", this.DRMType);
        this.setParamSimple(map, prefix + "DRMTracks", this.DRMTracks);

    }
}

