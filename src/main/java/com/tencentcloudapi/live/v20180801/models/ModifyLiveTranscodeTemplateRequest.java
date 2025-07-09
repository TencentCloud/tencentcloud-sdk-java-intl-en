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

public class ModifyLiveTranscodeTemplateRequest extends AbstractModel {

    /**
    * Template ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * Video codec. Valid values: h264, h265, origin (default)

origin: original codec as the output codec
    */
    @SerializedName("Vcodec")
    @Expose
    private String Vcodec;

    /**
    * Audio codec. Defaut value: aac.
Note: this parameter is unsupported now.
    */
    @SerializedName("Acodec")
    @Expose
    private String Acodec;

    /**
    * Audio bitrate. Default value: 0.
Value range: 0-500.
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
    * Video bitrate in Kbps. Value range: 100-8000.
Note: the transcoding template requires that the bitrate be unique. Therefore, the final saved bitrate may be different from the input bitrate.
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * Width in pixels. Value range: 0-3000.
It must be a multiple of 2. The original width is 0.
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
    * Height in pixels. Value range: 0-3000.
It must be a multiple of 2. The original height is 0.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Frame rate in fps. Default value: 0.
Value range: 0-60
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Keyframe interval in seconds.
Value range: 2-6
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * Rotation angle. Default value: 0.
Valid values: 0, 90, 180, 270
    */
    @SerializedName("Rotate")
    @Expose
    private Long Rotate;

    /**
    * Encoding quality:
baseline/main/high.
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
    * Bitrate compression ratio of top speed codec video.
Target bitrate of top speed code = VideoBitrate * (1-AdaptBitratePercent)

Value range: 0.0-0.5.
    */
    @SerializedName("AdaptBitratePercent")
    @Expose
    private Float AdaptBitratePercent;

    /**
    * Whether to use the short side as the video height. 0: no, 1: yes. Default value: 0.
    */
    @SerializedName("ShortEdgeAsHeight")
    @Expose
    private Long ShortEdgeAsHeight;

    /**
    * The DRM encryption type. Valid values: fairplay, normalaes, widevine.
If you do not pass this parameter or pass in an empty string, the existing configuration will be reset.
    */
    @SerializedName("DRMType")
    @Expose
    private String DRMType;

    /**
    * The tracks to encrypt. Valid values: AUDIO, SD, HD, UHD1, UHD2. You can choose only one video track (SD, HD, UHD1, or UHD2).
If you do not pass this parameter or pass in an empty string, the existing configuration will be reset.
    */
    @SerializedName("DRMTracks")
    @Expose
    private String DRMTracks;

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
     * Get Video codec. Valid values: h264, h265, origin (default)

origin: original codec as the output codec 
     * @return Vcodec Video codec. Valid values: h264, h265, origin (default)

origin: original codec as the output codec
     */
    public String getVcodec() {
        return this.Vcodec;
    }

    /**
     * Set Video codec. Valid values: h264, h265, origin (default)

origin: original codec as the output codec
     * @param Vcodec Video codec. Valid values: h264, h265, origin (default)

origin: original codec as the output codec
     */
    public void setVcodec(String Vcodec) {
        this.Vcodec = Vcodec;
    }

    /**
     * Get Audio codec. Defaut value: aac.
Note: this parameter is unsupported now. 
     * @return Acodec Audio codec. Defaut value: aac.
Note: this parameter is unsupported now.
     */
    public String getAcodec() {
        return this.Acodec;
    }

    /**
     * Set Audio codec. Defaut value: aac.
Note: this parameter is unsupported now.
     * @param Acodec Audio codec. Defaut value: aac.
Note: this parameter is unsupported now.
     */
    public void setAcodec(String Acodec) {
        this.Acodec = Acodec;
    }

    /**
     * Get Audio bitrate. Default value: 0.
Value range: 0-500. 
     * @return AudioBitrate Audio bitrate. Default value: 0.
Value range: 0-500.
     */
    public Long getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * Set Audio bitrate. Default value: 0.
Value range: 0-500.
     * @param AudioBitrate Audio bitrate. Default value: 0.
Value range: 0-500.
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
     * Get Video bitrate in Kbps. Value range: 100-8000.
Note: the transcoding template requires that the bitrate be unique. Therefore, the final saved bitrate may be different from the input bitrate. 
     * @return VideoBitrate Video bitrate in Kbps. Value range: 100-8000.
Note: the transcoding template requires that the bitrate be unique. Therefore, the final saved bitrate may be different from the input bitrate.
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set Video bitrate in Kbps. Value range: 100-8000.
Note: the transcoding template requires that the bitrate be unique. Therefore, the final saved bitrate may be different from the input bitrate.
     * @param VideoBitrate Video bitrate in Kbps. Value range: 100-8000.
Note: the transcoding template requires that the bitrate be unique. Therefore, the final saved bitrate may be different from the input bitrate.
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get Width in pixels. Value range: 0-3000.
It must be a multiple of 2. The original width is 0. 
     * @return Width Width in pixels. Value range: 0-3000.
It must be a multiple of 2. The original width is 0.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width in pixels. Value range: 0-3000.
It must be a multiple of 2. The original width is 0.
     * @param Width Width in pixels. Value range: 0-3000.
It must be a multiple of 2. The original width is 0.
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
     * Get Height in pixels. Value range: 0-3000.
It must be a multiple of 2. The original height is 0. 
     * @return Height Height in pixels. Value range: 0-3000.
It must be a multiple of 2. The original height is 0.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height in pixels. Value range: 0-3000.
It must be a multiple of 2. The original height is 0.
     * @param Height Height in pixels. Value range: 0-3000.
It must be a multiple of 2. The original height is 0.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Frame rate in fps. Default value: 0.
Value range: 0-60 
     * @return Fps Frame rate in fps. Default value: 0.
Value range: 0-60
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Frame rate in fps. Default value: 0.
Value range: 0-60
     * @param Fps Frame rate in fps. Default value: 0.
Value range: 0-60
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Keyframe interval in seconds.
Value range: 2-6 
     * @return Gop Keyframe interval in seconds.
Value range: 2-6
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set Keyframe interval in seconds.
Value range: 2-6
     * @param Gop Keyframe interval in seconds.
Value range: 2-6
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get Rotation angle. Default value: 0.
Valid values: 0, 90, 180, 270 
     * @return Rotate Rotation angle. Default value: 0.
Valid values: 0, 90, 180, 270
     */
    public Long getRotate() {
        return this.Rotate;
    }

    /**
     * Set Rotation angle. Default value: 0.
Valid values: 0, 90, 180, 270
     * @param Rotate Rotation angle. Default value: 0.
Valid values: 0, 90, 180, 270
     */
    public void setRotate(Long Rotate) {
        this.Rotate = Rotate;
    }

    /**
     * Get Encoding quality:
baseline/main/high. 
     * @return Profile Encoding quality:
baseline/main/high.
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set Encoding quality:
baseline/main/high.
     * @param Profile Encoding quality:
baseline/main/high.
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
     * Get Bitrate compression ratio of top speed codec video.
Target bitrate of top speed code = VideoBitrate * (1-AdaptBitratePercent)

Value range: 0.0-0.5. 
     * @return AdaptBitratePercent Bitrate compression ratio of top speed codec video.
Target bitrate of top speed code = VideoBitrate * (1-AdaptBitratePercent)

Value range: 0.0-0.5.
     */
    public Float getAdaptBitratePercent() {
        return this.AdaptBitratePercent;
    }

    /**
     * Set Bitrate compression ratio of top speed codec video.
Target bitrate of top speed code = VideoBitrate * (1-AdaptBitratePercent)

Value range: 0.0-0.5.
     * @param AdaptBitratePercent Bitrate compression ratio of top speed codec video.
Target bitrate of top speed code = VideoBitrate * (1-AdaptBitratePercent)

Value range: 0.0-0.5.
     */
    public void setAdaptBitratePercent(Float AdaptBitratePercent) {
        this.AdaptBitratePercent = AdaptBitratePercent;
    }

    /**
     * Get Whether to use the short side as the video height. 0: no, 1: yes. Default value: 0. 
     * @return ShortEdgeAsHeight Whether to use the short side as the video height. 0: no, 1: yes. Default value: 0.
     */
    public Long getShortEdgeAsHeight() {
        return this.ShortEdgeAsHeight;
    }

    /**
     * Set Whether to use the short side as the video height. 0: no, 1: yes. Default value: 0.
     * @param ShortEdgeAsHeight Whether to use the short side as the video height. 0: no, 1: yes. Default value: 0.
     */
    public void setShortEdgeAsHeight(Long ShortEdgeAsHeight) {
        this.ShortEdgeAsHeight = ShortEdgeAsHeight;
    }

    /**
     * Get The DRM encryption type. Valid values: fairplay, normalaes, widevine.
If you do not pass this parameter or pass in an empty string, the existing configuration will be reset. 
     * @return DRMType The DRM encryption type. Valid values: fairplay, normalaes, widevine.
If you do not pass this parameter or pass in an empty string, the existing configuration will be reset.
     */
    public String getDRMType() {
        return this.DRMType;
    }

    /**
     * Set The DRM encryption type. Valid values: fairplay, normalaes, widevine.
If you do not pass this parameter or pass in an empty string, the existing configuration will be reset.
     * @param DRMType The DRM encryption type. Valid values: fairplay, normalaes, widevine.
If you do not pass this parameter or pass in an empty string, the existing configuration will be reset.
     */
    public void setDRMType(String DRMType) {
        this.DRMType = DRMType;
    }

    /**
     * Get The tracks to encrypt. Valid values: AUDIO, SD, HD, UHD1, UHD2. You can choose only one video track (SD, HD, UHD1, or UHD2).
If you do not pass this parameter or pass in an empty string, the existing configuration will be reset. 
     * @return DRMTracks The tracks to encrypt. Valid values: AUDIO, SD, HD, UHD1, UHD2. You can choose only one video track (SD, HD, UHD1, or UHD2).
If you do not pass this parameter or pass in an empty string, the existing configuration will be reset.
     */
    public String getDRMTracks() {
        return this.DRMTracks;
    }

    /**
     * Set The tracks to encrypt. Valid values: AUDIO, SD, HD, UHD1, UHD2. You can choose only one video track (SD, HD, UHD1, or UHD2).
If you do not pass this parameter or pass in an empty string, the existing configuration will be reset.
     * @param DRMTracks The tracks to encrypt. Valid values: AUDIO, SD, HD, UHD1, UHD2. You can choose only one video track (SD, HD, UHD1, or UHD2).
If you do not pass this parameter or pass in an empty string, the existing configuration will be reset.
     */
    public void setDRMTracks(String DRMTracks) {
        this.DRMTracks = DRMTracks;
    }

    public ModifyLiveTranscodeTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveTranscodeTemplateRequest(ModifyLiveTranscodeTemplateRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.Vcodec != null) {
            this.Vcodec = new String(source.Vcodec);
        }
        if (source.Acodec != null) {
            this.Acodec = new String(source.Acodec);
        }
        if (source.AudioBitrate != null) {
            this.AudioBitrate = new Long(source.AudioBitrate);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.VideoBitrate != null) {
            this.VideoBitrate = new Long(source.VideoBitrate);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.NeedVideo != null) {
            this.NeedVideo = new Long(source.NeedVideo);
        }
        if (source.NeedAudio != null) {
            this.NeedAudio = new Long(source.NeedAudio);
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
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Vcodec", this.Vcodec);
        this.setParamSimple(map, prefix + "Acodec", this.Acodec);
        this.setParamSimple(map, prefix + "AudioBitrate", this.AudioBitrate);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VideoBitrate", this.VideoBitrate);
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
        this.setParamSimple(map, prefix + "AdaptBitratePercent", this.AdaptBitratePercent);
        this.setParamSimple(map, prefix + "ShortEdgeAsHeight", this.ShortEdgeAsHeight);
        this.setParamSimple(map, prefix + "DRMType", this.DRMType);
        this.setParamSimple(map, prefix + "DRMTracks", this.DRMTracks);

    }
}

