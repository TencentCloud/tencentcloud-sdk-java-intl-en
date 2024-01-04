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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSuperPlayerConfigRequest extends AbstractModel {

    /**
    * Player configuration name, which can contain up to 64 letters, digits, underscores, and hyphens (such as test_ABC-123) and must be unique under a user.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Type of audio/video played. Valid values:
<li>AdaptiveDynamicStreaming</li>
<li>Transcode</li>
<li>Original</li>
Default value: `AdaptiveDynamicStream`
    */
    @SerializedName("AudioVideoType")
    @Expose
    private String AudioVideoType;

    /**
    * Whether to allow only adaptive bitrate streaming playback protected by DRM. Valid values:
<li>`ON`: allow only adaptive bitrate streaming playback protected by DRM</li>
<li>`OFF`: allow adaptive bitrate streaming playback not protected by DRM</li>
Default value: `OFF`
This parameter is valid when `AudioVideoType` is `AdaptiveDynamicStream`.
    */
    @SerializedName("DrmSwitch")
    @Expose
    private String DrmSwitch;

    /**
    * ID of the adaptive bitrate streaming template allowed for playback not protected by DRM.

This parameter is required if `AudioVideoType` is `AdaptiveDynamicStream` and `DrmSwitch` is `OFF`.
    */
    @SerializedName("AdaptiveDynamicStreamingDefinition")
    @Expose
    private Long AdaptiveDynamicStreamingDefinition;

    /**
    * Content of the adaptive bitrate streaming template allowed for playback protected by DRM.

This parameter is required if `AudioVideoType` is `AdaptiveDynamicStream` and `DrmSwitch` is `ON`.
    */
    @SerializedName("DrmStreamingsInfo")
    @Expose
    private DrmStreamingsInfo DrmStreamingsInfo;

    /**
    * ID of the transcoding template allowed for playback

This parameter is required if `AudioVideoType` is `Transcode`.
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
    * The player displays names for substreams of different resolutions. If left unfilled or filled in a blank array, the default configuration is used:
<li>MinEdgeLength: 240, Name: smooth;</li>
<li>MinEdgeLength: 480, Name: SD; </li>
<li>MinEdgeLength: 720, Name: HD; </li>
<li>MinEdgeLength: 1080, Name: Full HD; </li>
<li>MinEdgeLength: 1440, Name: 2K; </li>
<li>MinEdgeLength: 2160, Name: 4K; </li>
<li>MinEdgeLength: 4320, Name: 8K. </li>
    */
    @SerializedName("ResolutionNames")
    @Expose
    private ResolutionNameInfo [] ResolutionNames;

    /**
    * Domain name used for playback. If it is left empty or set to `Default`, the domain name configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Scheme used for playback. If it is left empty or set to `Default`, the scheme configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used. Other valid values:
<li>HTTP;</li>
<li>HTTPS.</li>
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * Template description. Length limit: 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get Player configuration name, which can contain up to 64 letters, digits, underscores, and hyphens (such as test_ABC-123) and must be unique under a user. 
     * @return Name Player configuration name, which can contain up to 64 letters, digits, underscores, and hyphens (such as test_ABC-123) and must be unique under a user.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Player configuration name, which can contain up to 64 letters, digits, underscores, and hyphens (such as test_ABC-123) and must be unique under a user.
     * @param Name Player configuration name, which can contain up to 64 letters, digits, underscores, and hyphens (such as test_ABC-123) and must be unique under a user.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Type of audio/video played. Valid values:
<li>AdaptiveDynamicStreaming</li>
<li>Transcode</li>
<li>Original</li>
Default value: `AdaptiveDynamicStream` 
     * @return AudioVideoType Type of audio/video played. Valid values:
<li>AdaptiveDynamicStreaming</li>
<li>Transcode</li>
<li>Original</li>
Default value: `AdaptiveDynamicStream`
     */
    public String getAudioVideoType() {
        return this.AudioVideoType;
    }

    /**
     * Set Type of audio/video played. Valid values:
<li>AdaptiveDynamicStreaming</li>
<li>Transcode</li>
<li>Original</li>
Default value: `AdaptiveDynamicStream`
     * @param AudioVideoType Type of audio/video played. Valid values:
<li>AdaptiveDynamicStreaming</li>
<li>Transcode</li>
<li>Original</li>
Default value: `AdaptiveDynamicStream`
     */
    public void setAudioVideoType(String AudioVideoType) {
        this.AudioVideoType = AudioVideoType;
    }

    /**
     * Get Whether to allow only adaptive bitrate streaming playback protected by DRM. Valid values:
<li>`ON`: allow only adaptive bitrate streaming playback protected by DRM</li>
<li>`OFF`: allow adaptive bitrate streaming playback not protected by DRM</li>
Default value: `OFF`
This parameter is valid when `AudioVideoType` is `AdaptiveDynamicStream`. 
     * @return DrmSwitch Whether to allow only adaptive bitrate streaming playback protected by DRM. Valid values:
<li>`ON`: allow only adaptive bitrate streaming playback protected by DRM</li>
<li>`OFF`: allow adaptive bitrate streaming playback not protected by DRM</li>
Default value: `OFF`
This parameter is valid when `AudioVideoType` is `AdaptiveDynamicStream`.
     */
    public String getDrmSwitch() {
        return this.DrmSwitch;
    }

    /**
     * Set Whether to allow only adaptive bitrate streaming playback protected by DRM. Valid values:
<li>`ON`: allow only adaptive bitrate streaming playback protected by DRM</li>
<li>`OFF`: allow adaptive bitrate streaming playback not protected by DRM</li>
Default value: `OFF`
This parameter is valid when `AudioVideoType` is `AdaptiveDynamicStream`.
     * @param DrmSwitch Whether to allow only adaptive bitrate streaming playback protected by DRM. Valid values:
<li>`ON`: allow only adaptive bitrate streaming playback protected by DRM</li>
<li>`OFF`: allow adaptive bitrate streaming playback not protected by DRM</li>
Default value: `OFF`
This parameter is valid when `AudioVideoType` is `AdaptiveDynamicStream`.
     */
    public void setDrmSwitch(String DrmSwitch) {
        this.DrmSwitch = DrmSwitch;
    }

    /**
     * Get ID of the adaptive bitrate streaming template allowed for playback not protected by DRM.

This parameter is required if `AudioVideoType` is `AdaptiveDynamicStream` and `DrmSwitch` is `OFF`. 
     * @return AdaptiveDynamicStreamingDefinition ID of the adaptive bitrate streaming template allowed for playback not protected by DRM.

This parameter is required if `AudioVideoType` is `AdaptiveDynamicStream` and `DrmSwitch` is `OFF`.
     */
    public Long getAdaptiveDynamicStreamingDefinition() {
        return this.AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Set ID of the adaptive bitrate streaming template allowed for playback not protected by DRM.

This parameter is required if `AudioVideoType` is `AdaptiveDynamicStream` and `DrmSwitch` is `OFF`.
     * @param AdaptiveDynamicStreamingDefinition ID of the adaptive bitrate streaming template allowed for playback not protected by DRM.

This parameter is required if `AudioVideoType` is `AdaptiveDynamicStream` and `DrmSwitch` is `OFF`.
     */
    public void setAdaptiveDynamicStreamingDefinition(Long AdaptiveDynamicStreamingDefinition) {
        this.AdaptiveDynamicStreamingDefinition = AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Get Content of the adaptive bitrate streaming template allowed for playback protected by DRM.

This parameter is required if `AudioVideoType` is `AdaptiveDynamicStream` and `DrmSwitch` is `ON`. 
     * @return DrmStreamingsInfo Content of the adaptive bitrate streaming template allowed for playback protected by DRM.

This parameter is required if `AudioVideoType` is `AdaptiveDynamicStream` and `DrmSwitch` is `ON`.
     */
    public DrmStreamingsInfo getDrmStreamingsInfo() {
        return this.DrmStreamingsInfo;
    }

    /**
     * Set Content of the adaptive bitrate streaming template allowed for playback protected by DRM.

This parameter is required if `AudioVideoType` is `AdaptiveDynamicStream` and `DrmSwitch` is `ON`.
     * @param DrmStreamingsInfo Content of the adaptive bitrate streaming template allowed for playback protected by DRM.

This parameter is required if `AudioVideoType` is `AdaptiveDynamicStream` and `DrmSwitch` is `ON`.
     */
    public void setDrmStreamingsInfo(DrmStreamingsInfo DrmStreamingsInfo) {
        this.DrmStreamingsInfo = DrmStreamingsInfo;
    }

    /**
     * Get ID of the transcoding template allowed for playback

This parameter is required if `AudioVideoType` is `Transcode`. 
     * @return TranscodeDefinition ID of the transcoding template allowed for playback

This parameter is required if `AudioVideoType` is `Transcode`.
     */
    public Long getTranscodeDefinition() {
        return this.TranscodeDefinition;
    }

    /**
     * Set ID of the transcoding template allowed for playback

This parameter is required if `AudioVideoType` is `Transcode`.
     * @param TranscodeDefinition ID of the transcoding template allowed for playback

This parameter is required if `AudioVideoType` is `Transcode`.
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
     * Get The player displays names for substreams of different resolutions. If left unfilled or filled in a blank array, the default configuration is used:
<li>MinEdgeLength: 240, Name: smooth;</li>
<li>MinEdgeLength: 480, Name: SD; </li>
<li>MinEdgeLength: 720, Name: HD; </li>
<li>MinEdgeLength: 1080, Name: Full HD; </li>
<li>MinEdgeLength: 1440, Name: 2K; </li>
<li>MinEdgeLength: 2160, Name: 4K; </li>
<li>MinEdgeLength: 4320, Name: 8K. </li> 
     * @return ResolutionNames The player displays names for substreams of different resolutions. If left unfilled or filled in a blank array, the default configuration is used:
<li>MinEdgeLength: 240, Name: smooth;</li>
<li>MinEdgeLength: 480, Name: SD; </li>
<li>MinEdgeLength: 720, Name: HD; </li>
<li>MinEdgeLength: 1080, Name: Full HD; </li>
<li>MinEdgeLength: 1440, Name: 2K; </li>
<li>MinEdgeLength: 2160, Name: 4K; </li>
<li>MinEdgeLength: 4320, Name: 8K. </li>
     */
    public ResolutionNameInfo [] getResolutionNames() {
        return this.ResolutionNames;
    }

    /**
     * Set The player displays names for substreams of different resolutions. If left unfilled or filled in a blank array, the default configuration is used:
<li>MinEdgeLength: 240, Name: smooth;</li>
<li>MinEdgeLength: 480, Name: SD; </li>
<li>MinEdgeLength: 720, Name: HD; </li>
<li>MinEdgeLength: 1080, Name: Full HD; </li>
<li>MinEdgeLength: 1440, Name: 2K; </li>
<li>MinEdgeLength: 2160, Name: 4K; </li>
<li>MinEdgeLength: 4320, Name: 8K. </li>
     * @param ResolutionNames The player displays names for substreams of different resolutions. If left unfilled or filled in a blank array, the default configuration is used:
<li>MinEdgeLength: 240, Name: smooth;</li>
<li>MinEdgeLength: 480, Name: SD; </li>
<li>MinEdgeLength: 720, Name: HD; </li>
<li>MinEdgeLength: 1080, Name: Full HD; </li>
<li>MinEdgeLength: 1440, Name: 2K; </li>
<li>MinEdgeLength: 2160, Name: 4K; </li>
<li>MinEdgeLength: 4320, Name: 8K. </li>
     */
    public void setResolutionNames(ResolutionNameInfo [] ResolutionNames) {
        this.ResolutionNames = ResolutionNames;
    }

    /**
     * Get Domain name used for playback. If it is left empty or set to `Default`, the domain name configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used. 
     * @return Domain Domain name used for playback. If it is left empty or set to `Default`, the domain name configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name used for playback. If it is left empty or set to `Default`, the domain name configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used.
     * @param Domain Domain name used for playback. If it is left empty or set to `Default`, the domain name configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Scheme used for playback. If it is left empty or set to `Default`, the scheme configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used. Other valid values:
<li>HTTP;</li>
<li>HTTPS.</li> 
     * @return Scheme Scheme used for playback. If it is left empty or set to `Default`, the scheme configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used. Other valid values:
<li>HTTP;</li>
<li>HTTPS.</li>
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set Scheme used for playback. If it is left empty or set to `Default`, the scheme configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used. Other valid values:
<li>HTTP;</li>
<li>HTTPS.</li>
     * @param Scheme Scheme used for playback. If it is left empty or set to `Default`, the scheme configured in [Default Distribution Configuration](https://intl.cloud.tencent.com/document/product/266/33373?from_cn_redirect=1) will be used. Other valid values:
<li>HTTP;</li>
<li>HTTPS.</li>
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get Template description. Length limit: 256 characters. 
     * @return Comment Template description. Length limit: 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description. Length limit: 256 characters.
     * @param Comment Template description. Length limit: 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public CreateSuperPlayerConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSuperPlayerConfigRequest(CreateSuperPlayerConfigRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
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
        if (source.ResolutionNames != null) {
            this.ResolutionNames = new ResolutionNameInfo[source.ResolutionNames.length];
            for (int i = 0; i < source.ResolutionNames.length; i++) {
                this.ResolutionNames[i] = new ResolutionNameInfo(source.ResolutionNames[i]);
            }
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
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "AudioVideoType", this.AudioVideoType);
        this.setParamSimple(map, prefix + "DrmSwitch", this.DrmSwitch);
        this.setParamSimple(map, prefix + "AdaptiveDynamicStreamingDefinition", this.AdaptiveDynamicStreamingDefinition);
        this.setParamObj(map, prefix + "DrmStreamingsInfo.", this.DrmStreamingsInfo);
        this.setParamSimple(map, prefix + "TranscodeDefinition", this.TranscodeDefinition);
        this.setParamSimple(map, prefix + "ImageSpriteDefinition", this.ImageSpriteDefinition);
        this.setParamArrayObj(map, prefix + "ResolutionNames.", this.ResolutionNames);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

