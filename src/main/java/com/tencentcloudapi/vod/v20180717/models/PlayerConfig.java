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

public class PlayerConfig extends AbstractModel {

    /**
    * Player configuration name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Player configuration type. Valid values:
<li>Preset: preset configuration;</li>
<li>Custom: custom configuration.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The type of audio/video played. Valid values:
<li>AdaptiveDynamicStreaming: Adaptive bitrate stream</li>
<li>Transcode: Transcoded stream</li>
<li>Original: The original stream</li>
    */
    @SerializedName("AudioVideoType")
    @Expose
    private String AudioVideoType;

    /**
    * Switch of DRM-protected adaptive bitstream playback:
<li>ON: enabled, indicating to play back only output adaptive bitstreams protected by DRM;</li>
<li>OFF: disabled, indicating to play back unencrypted output adaptive bitstreams.</li>
    */
    @SerializedName("DrmSwitch")
    @Expose
    private String DrmSwitch;

    /**
    * ID of the unencrypted adaptive bitrate streaming template that allows output.
    */
    @SerializedName("AdaptiveDynamicStreamingDefinition")
    @Expose
    private Long AdaptiveDynamicStreamingDefinition;

    /**
    * Content of the DRM-protected adaptive bitrate streaming template that allows output.
    */
    @SerializedName("DrmStreamingsInfo")
    @Expose
    private DrmStreamingsInfo DrmStreamingsInfo;

    /**
    * The ID of the transcoding template allowed.
    */
    @SerializedName("TranscodeDefinition")
    @Expose
    private Long TranscodeDefinition;

    /**
    * ID of the image sprite generating template that allows output.
    */
    @SerializedName("ImageSpriteDefinition")
    @Expose
    private Long ImageSpriteDefinition;

    /**
    * Display name of player for substreams with different resolutions.
    */
    @SerializedName("ResolutionNameSet")
    @Expose
    private ResolutionNameInfo [] ResolutionNameSet;

    /**
    * Creation time of player configuration in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time of player configuration in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Domain name used for playback. If its value is `Default`, the domain name configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Scheme used for playback. Valid values:
<li>Default: the scheme configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used;</li>
<li>HTTP;</li>
<li>HTTPS.</li>
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * Template description.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get Player configuration name. 
     * @return Name Player configuration name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Player configuration name.
     * @param Name Player configuration name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Player configuration type. Valid values:
<li>Preset: preset configuration;</li>
<li>Custom: custom configuration.</li> 
     * @return Type Player configuration type. Valid values:
<li>Preset: preset configuration;</li>
<li>Custom: custom configuration.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Player configuration type. Valid values:
<li>Preset: preset configuration;</li>
<li>Custom: custom configuration.</li>
     * @param Type Player configuration type. Valid values:
<li>Preset: preset configuration;</li>
<li>Custom: custom configuration.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The type of audio/video played. Valid values:
<li>AdaptiveDynamicStreaming: Adaptive bitrate stream</li>
<li>Transcode: Transcoded stream</li>
<li>Original: The original stream</li> 
     * @return AudioVideoType The type of audio/video played. Valid values:
<li>AdaptiveDynamicStreaming: Adaptive bitrate stream</li>
<li>Transcode: Transcoded stream</li>
<li>Original: The original stream</li>
     */
    public String getAudioVideoType() {
        return this.AudioVideoType;
    }

    /**
     * Set The type of audio/video played. Valid values:
<li>AdaptiveDynamicStreaming: Adaptive bitrate stream</li>
<li>Transcode: Transcoded stream</li>
<li>Original: The original stream</li>
     * @param AudioVideoType The type of audio/video played. Valid values:
<li>AdaptiveDynamicStreaming: Adaptive bitrate stream</li>
<li>Transcode: Transcoded stream</li>
<li>Original: The original stream</li>
     */
    public void setAudioVideoType(String AudioVideoType) {
        this.AudioVideoType = AudioVideoType;
    }

    /**
     * Get Switch of DRM-protected adaptive bitstream playback:
<li>ON: enabled, indicating to play back only output adaptive bitstreams protected by DRM;</li>
<li>OFF: disabled, indicating to play back unencrypted output adaptive bitstreams.</li> 
     * @return DrmSwitch Switch of DRM-protected adaptive bitstream playback:
<li>ON: enabled, indicating to play back only output adaptive bitstreams protected by DRM;</li>
<li>OFF: disabled, indicating to play back unencrypted output adaptive bitstreams.</li>
     */
    public String getDrmSwitch() {
        return this.DrmSwitch;
    }

    /**
     * Set Switch of DRM-protected adaptive bitstream playback:
<li>ON: enabled, indicating to play back only output adaptive bitstreams protected by DRM;</li>
<li>OFF: disabled, indicating to play back unencrypted output adaptive bitstreams.</li>
     * @param DrmSwitch Switch of DRM-protected adaptive bitstream playback:
<li>ON: enabled, indicating to play back only output adaptive bitstreams protected by DRM;</li>
<li>OFF: disabled, indicating to play back unencrypted output adaptive bitstreams.</li>
     */
    public void setDrmSwitch(String DrmSwitch) {
        this.DrmSwitch = DrmSwitch;
    }

    /**
     * Get ID of the unencrypted adaptive bitrate streaming template that allows output. 
     * @return AdaptiveDynamicStreamingDefinition ID of the unencrypted adaptive bitrate streaming template that allows output.
     */
    public Long getAdaptiveDynamicStreamingDefinition() {
        return this.AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Set ID of the unencrypted adaptive bitrate streaming template that allows output.
     * @param AdaptiveDynamicStreamingDefinition ID of the unencrypted adaptive bitrate streaming template that allows output.
     */
    public void setAdaptiveDynamicStreamingDefinition(Long AdaptiveDynamicStreamingDefinition) {
        this.AdaptiveDynamicStreamingDefinition = AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Get Content of the DRM-protected adaptive bitrate streaming template that allows output. 
     * @return DrmStreamingsInfo Content of the DRM-protected adaptive bitrate streaming template that allows output.
     */
    public DrmStreamingsInfo getDrmStreamingsInfo() {
        return this.DrmStreamingsInfo;
    }

    /**
     * Set Content of the DRM-protected adaptive bitrate streaming template that allows output.
     * @param DrmStreamingsInfo Content of the DRM-protected adaptive bitrate streaming template that allows output.
     */
    public void setDrmStreamingsInfo(DrmStreamingsInfo DrmStreamingsInfo) {
        this.DrmStreamingsInfo = DrmStreamingsInfo;
    }

    /**
     * Get The ID of the transcoding template allowed. 
     * @return TranscodeDefinition The ID of the transcoding template allowed.
     */
    public Long getTranscodeDefinition() {
        return this.TranscodeDefinition;
    }

    /**
     * Set The ID of the transcoding template allowed.
     * @param TranscodeDefinition The ID of the transcoding template allowed.
     */
    public void setTranscodeDefinition(Long TranscodeDefinition) {
        this.TranscodeDefinition = TranscodeDefinition;
    }

    /**
     * Get ID of the image sprite generating template that allows output. 
     * @return ImageSpriteDefinition ID of the image sprite generating template that allows output.
     */
    public Long getImageSpriteDefinition() {
        return this.ImageSpriteDefinition;
    }

    /**
     * Set ID of the image sprite generating template that allows output.
     * @param ImageSpriteDefinition ID of the image sprite generating template that allows output.
     */
    public void setImageSpriteDefinition(Long ImageSpriteDefinition) {
        this.ImageSpriteDefinition = ImageSpriteDefinition;
    }

    /**
     * Get Display name of player for substreams with different resolutions. 
     * @return ResolutionNameSet Display name of player for substreams with different resolutions.
     */
    public ResolutionNameInfo [] getResolutionNameSet() {
        return this.ResolutionNameSet;
    }

    /**
     * Set Display name of player for substreams with different resolutions.
     * @param ResolutionNameSet Display name of player for substreams with different resolutions.
     */
    public void setResolutionNameSet(ResolutionNameInfo [] ResolutionNameSet) {
        this.ResolutionNameSet = ResolutionNameSet;
    }

    /**
     * Get Creation time of player configuration in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return CreateTime Creation time of player configuration in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of player configuration in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param CreateTime Creation time of player configuration in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time of player configuration in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return UpdateTime Last modified time of player configuration in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time of player configuration in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param UpdateTime Last modified time of player configuration in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Domain name used for playback. If its value is `Default`, the domain name configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used. 
     * @return Domain Domain name used for playback. If its value is `Default`, the domain name configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name used for playback. If its value is `Default`, the domain name configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used.
     * @param Domain Domain name used for playback. If its value is `Default`, the domain name configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Scheme used for playback. Valid values:
<li>Default: the scheme configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used;</li>
<li>HTTP;</li>
<li>HTTPS.</li> 
     * @return Scheme Scheme used for playback. Valid values:
<li>Default: the scheme configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used;</li>
<li>HTTP;</li>
<li>HTTPS.</li>
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set Scheme used for playback. Valid values:
<li>Default: the scheme configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used;</li>
<li>HTTP;</li>
<li>HTTPS.</li>
     * @param Scheme Scheme used for playback. Valid values:
<li>Default: the scheme configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used;</li>
<li>HTTP;</li>
<li>HTTPS.</li>
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get Template description. 
     * @return Comment Template description.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description.
     * @param Comment Template description.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public PlayerConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlayerConfig(PlayerConfig source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AudioVideoType != null) {
            this.AudioVideoType = new String(source.AudioVideoType);
        }
        if (source.DrmSwitch != null) {
            this.DrmSwitch = new String(source.DrmSwitch);
        }
        if (source.AdaptiveDynamicStreamingDefinition != null) {
            this.AdaptiveDynamicStreamingDefinition = new Long(source.AdaptiveDynamicStreamingDefinition);
        }
        if (source.DrmStreamingsInfo != null) {
            this.DrmStreamingsInfo = new DrmStreamingsInfo(source.DrmStreamingsInfo);
        }
        if (source.TranscodeDefinition != null) {
            this.TranscodeDefinition = new Long(source.TranscodeDefinition);
        }
        if (source.ImageSpriteDefinition != null) {
            this.ImageSpriteDefinition = new Long(source.ImageSpriteDefinition);
        }
        if (source.ResolutionNameSet != null) {
            this.ResolutionNameSet = new ResolutionNameInfo[source.ResolutionNameSet.length];
            for (int i = 0; i < source.ResolutionNameSet.length; i++) {
                this.ResolutionNameSet[i] = new ResolutionNameInfo(source.ResolutionNameSet[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AudioVideoType", this.AudioVideoType);
        this.setParamSimple(map, prefix + "DrmSwitch", this.DrmSwitch);
        this.setParamSimple(map, prefix + "AdaptiveDynamicStreamingDefinition", this.AdaptiveDynamicStreamingDefinition);
        this.setParamObj(map, prefix + "DrmStreamingsInfo.", this.DrmStreamingsInfo);
        this.setParamSimple(map, prefix + "TranscodeDefinition", this.TranscodeDefinition);
        this.setParamSimple(map, prefix + "ImageSpriteDefinition", this.ImageSpriteDefinition);
        this.setParamArrayObj(map, prefix + "ResolutionNameSet.", this.ResolutionNameSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

