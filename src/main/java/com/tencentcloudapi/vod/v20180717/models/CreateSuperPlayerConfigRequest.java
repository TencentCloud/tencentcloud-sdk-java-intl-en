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

public class CreateSuperPlayerConfigRequest extends AbstractModel {

    /**
    * Player configuration name. Length limit: 64 characters. Only allowed to appear [0-9a-zA-Z] and _- characters (such as test_ABC-123). The name is unique for the same user.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Played audio and video type. Available values:
<li>AdaptiveDynamicStream: adaptive bitrate stream output;</li>
<li>Transcode: transcoding output;</li>
<li>Original: original audio/video.</li>
Default is AdaptiveDynamicStream.
    */
    @SerializedName("AudioVideoType")
    @Expose
    private String AudioVideoType;

    /**
    * Switch for playing DRM-protected adaptive bitstream.
<li>ON: Enable, indicates only playback of DRM protected adaptive bitrate output;</li>
<li>OFF: Disable, indicates playback of unencrypted adaptive bitstream output.</li>
Default value: OFF.
This parameter is valid when AudioVideoType is AdaptiveDynamicStream.
    */
    @SerializedName("DrmSwitch")
    @Expose
    private String DrmSwitch;

    /**
    * Allowed output of unencrypted adaptive bitstream template ID.

This parameter is required when AudioVideoType is AdaptiveDynamicStream and DrmSwitch is OFF.
    */
    @SerializedName("AdaptiveDynamicStreamingDefinition")
    @Expose
    private Long AdaptiveDynamicStreamingDefinition;

    /**
    * Allowed output of DRM adaptive bitstream template content.

This parameter is required when AudioVideoType is AdaptiveDynamicStream and DrmSwitch is ON.
    */
    @SerializedName("DrmStreamingsInfo")
    @Expose
    private DrmStreamingsInfo DrmStreamingsInfo;

    /**
    * Allowed output transcoding template ID.

Required when AudioVideoType is Transcode.
    */
    @SerializedName("TranscodeDefinition")
    @Expose
    private Long TranscodeDefinition;

    /**
    * Allowed output sprite template ID.
    */
    @SerializedName("ImageSpriteDefinition")
    @Expose
    private Long ImageSpriteDefinition;

    /**
    * Player's display name for substreams of different resolutions. Use default configuration if not filled or empty array.
<li>MinEdgeLength: 240, Name: smooth;</li>
<li>MinEdgeLength: 480, Name: SD;</li>
<li>MinEdgeLength: 720, Name: high-definition;</li>
<li>MinEdgeLength: 1080, Name: full HD;</li>
<li>MinEdgeLength:1440,Name:2K;</li>
<li>MinEdgeLength:2160,Name:4K;</li>
<li>MinEdgeLength:4320,Name:8K.</li>
    */
    @SerializedName("ResolutionNames")
    @Expose
    private ResolutionNameInfo [] ResolutionNames;

    /**
    * Domain name used during playback. Leave it blank or enter Default to indicate usage of the domain name in the default distribution configuration (https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1).
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Scheme used during playback. Leave it blank or enter Default to indicate usage of the scheme in the default distribution configuration (https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1). Other optional values:
<li>HTTP;</li>
<li>HTTPS.</li>
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * Template description, with a length limit of 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get Player configuration name. Length limit: 64 characters. Only allowed to appear [0-9a-zA-Z] and _- characters (such as test_ABC-123). The name is unique for the same user. 
     * @return Name Player configuration name. Length limit: 64 characters. Only allowed to appear [0-9a-zA-Z] and _- characters (such as test_ABC-123). The name is unique for the same user.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Player configuration name. Length limit: 64 characters. Only allowed to appear [0-9a-zA-Z] and _- characters (such as test_ABC-123). The name is unique for the same user.
     * @param Name Player configuration name. Length limit: 64 characters. Only allowed to appear [0-9a-zA-Z] and _- characters (such as test_ABC-123). The name is unique for the same user.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Played audio and video type. Available values:
<li>AdaptiveDynamicStream: adaptive bitrate stream output;</li>
<li>Transcode: transcoding output;</li>
<li>Original: original audio/video.</li>
Default is AdaptiveDynamicStream. 
     * @return AudioVideoType Played audio and video type. Available values:
<li>AdaptiveDynamicStream: adaptive bitrate stream output;</li>
<li>Transcode: transcoding output;</li>
<li>Original: original audio/video.</li>
Default is AdaptiveDynamicStream.
     */
    public String getAudioVideoType() {
        return this.AudioVideoType;
    }

    /**
     * Set Played audio and video type. Available values:
<li>AdaptiveDynamicStream: adaptive bitrate stream output;</li>
<li>Transcode: transcoding output;</li>
<li>Original: original audio/video.</li>
Default is AdaptiveDynamicStream.
     * @param AudioVideoType Played audio and video type. Available values:
<li>AdaptiveDynamicStream: adaptive bitrate stream output;</li>
<li>Transcode: transcoding output;</li>
<li>Original: original audio/video.</li>
Default is AdaptiveDynamicStream.
     */
    public void setAudioVideoType(String AudioVideoType) {
        this.AudioVideoType = AudioVideoType;
    }

    /**
     * Get Switch for playing DRM-protected adaptive bitstream.
<li>ON: Enable, indicates only playback of DRM protected adaptive bitrate output;</li>
<li>OFF: Disable, indicates playback of unencrypted adaptive bitstream output.</li>
Default value: OFF.
This parameter is valid when AudioVideoType is AdaptiveDynamicStream. 
     * @return DrmSwitch Switch for playing DRM-protected adaptive bitstream.
<li>ON: Enable, indicates only playback of DRM protected adaptive bitrate output;</li>
<li>OFF: Disable, indicates playback of unencrypted adaptive bitstream output.</li>
Default value: OFF.
This parameter is valid when AudioVideoType is AdaptiveDynamicStream.
     */
    public String getDrmSwitch() {
        return this.DrmSwitch;
    }

    /**
     * Set Switch for playing DRM-protected adaptive bitstream.
<li>ON: Enable, indicates only playback of DRM protected adaptive bitrate output;</li>
<li>OFF: Disable, indicates playback of unencrypted adaptive bitstream output.</li>
Default value: OFF.
This parameter is valid when AudioVideoType is AdaptiveDynamicStream.
     * @param DrmSwitch Switch for playing DRM-protected adaptive bitstream.
<li>ON: Enable, indicates only playback of DRM protected adaptive bitrate output;</li>
<li>OFF: Disable, indicates playback of unencrypted adaptive bitstream output.</li>
Default value: OFF.
This parameter is valid when AudioVideoType is AdaptiveDynamicStream.
     */
    public void setDrmSwitch(String DrmSwitch) {
        this.DrmSwitch = DrmSwitch;
    }

    /**
     * Get Allowed output of unencrypted adaptive bitstream template ID.

This parameter is required when AudioVideoType is AdaptiveDynamicStream and DrmSwitch is OFF. 
     * @return AdaptiveDynamicStreamingDefinition Allowed output of unencrypted adaptive bitstream template ID.

This parameter is required when AudioVideoType is AdaptiveDynamicStream and DrmSwitch is OFF.
     */
    public Long getAdaptiveDynamicStreamingDefinition() {
        return this.AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Set Allowed output of unencrypted adaptive bitstream template ID.

This parameter is required when AudioVideoType is AdaptiveDynamicStream and DrmSwitch is OFF.
     * @param AdaptiveDynamicStreamingDefinition Allowed output of unencrypted adaptive bitstream template ID.

This parameter is required when AudioVideoType is AdaptiveDynamicStream and DrmSwitch is OFF.
     */
    public void setAdaptiveDynamicStreamingDefinition(Long AdaptiveDynamicStreamingDefinition) {
        this.AdaptiveDynamicStreamingDefinition = AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Get Allowed output of DRM adaptive bitstream template content.

This parameter is required when AudioVideoType is AdaptiveDynamicStream and DrmSwitch is ON. 
     * @return DrmStreamingsInfo Allowed output of DRM adaptive bitstream template content.

This parameter is required when AudioVideoType is AdaptiveDynamicStream and DrmSwitch is ON.
     */
    public DrmStreamingsInfo getDrmStreamingsInfo() {
        return this.DrmStreamingsInfo;
    }

    /**
     * Set Allowed output of DRM adaptive bitstream template content.

This parameter is required when AudioVideoType is AdaptiveDynamicStream and DrmSwitch is ON.
     * @param DrmStreamingsInfo Allowed output of DRM adaptive bitstream template content.

This parameter is required when AudioVideoType is AdaptiveDynamicStream and DrmSwitch is ON.
     */
    public void setDrmStreamingsInfo(DrmStreamingsInfo DrmStreamingsInfo) {
        this.DrmStreamingsInfo = DrmStreamingsInfo;
    }

    /**
     * Get Allowed output transcoding template ID.

Required when AudioVideoType is Transcode. 
     * @return TranscodeDefinition Allowed output transcoding template ID.

Required when AudioVideoType is Transcode.
     */
    public Long getTranscodeDefinition() {
        return this.TranscodeDefinition;
    }

    /**
     * Set Allowed output transcoding template ID.

Required when AudioVideoType is Transcode.
     * @param TranscodeDefinition Allowed output transcoding template ID.

Required when AudioVideoType is Transcode.
     */
    public void setTranscodeDefinition(Long TranscodeDefinition) {
        this.TranscodeDefinition = TranscodeDefinition;
    }

    /**
     * Get Allowed output sprite template ID. 
     * @return ImageSpriteDefinition Allowed output sprite template ID.
     */
    public Long getImageSpriteDefinition() {
        return this.ImageSpriteDefinition;
    }

    /**
     * Set Allowed output sprite template ID.
     * @param ImageSpriteDefinition Allowed output sprite template ID.
     */
    public void setImageSpriteDefinition(Long ImageSpriteDefinition) {
        this.ImageSpriteDefinition = ImageSpriteDefinition;
    }

    /**
     * Get Player's display name for substreams of different resolutions. Use default configuration if not filled or empty array.
<li>MinEdgeLength: 240, Name: smooth;</li>
<li>MinEdgeLength: 480, Name: SD;</li>
<li>MinEdgeLength: 720, Name: high-definition;</li>
<li>MinEdgeLength: 1080, Name: full HD;</li>
<li>MinEdgeLength:1440,Name:2K;</li>
<li>MinEdgeLength:2160,Name:4K;</li>
<li>MinEdgeLength:4320,Name:8K.</li> 
     * @return ResolutionNames Player's display name for substreams of different resolutions. Use default configuration if not filled or empty array.
<li>MinEdgeLength: 240, Name: smooth;</li>
<li>MinEdgeLength: 480, Name: SD;</li>
<li>MinEdgeLength: 720, Name: high-definition;</li>
<li>MinEdgeLength: 1080, Name: full HD;</li>
<li>MinEdgeLength:1440,Name:2K;</li>
<li>MinEdgeLength:2160,Name:4K;</li>
<li>MinEdgeLength:4320,Name:8K.</li>
     */
    public ResolutionNameInfo [] getResolutionNames() {
        return this.ResolutionNames;
    }

    /**
     * Set Player's display name for substreams of different resolutions. Use default configuration if not filled or empty array.
<li>MinEdgeLength: 240, Name: smooth;</li>
<li>MinEdgeLength: 480, Name: SD;</li>
<li>MinEdgeLength: 720, Name: high-definition;</li>
<li>MinEdgeLength: 1080, Name: full HD;</li>
<li>MinEdgeLength:1440,Name:2K;</li>
<li>MinEdgeLength:2160,Name:4K;</li>
<li>MinEdgeLength:4320,Name:8K.</li>
     * @param ResolutionNames Player's display name for substreams of different resolutions. Use default configuration if not filled or empty array.
<li>MinEdgeLength: 240, Name: smooth;</li>
<li>MinEdgeLength: 480, Name: SD;</li>
<li>MinEdgeLength: 720, Name: high-definition;</li>
<li>MinEdgeLength: 1080, Name: full HD;</li>
<li>MinEdgeLength:1440,Name:2K;</li>
<li>MinEdgeLength:2160,Name:4K;</li>
<li>MinEdgeLength:4320,Name:8K.</li>
     */
    public void setResolutionNames(ResolutionNameInfo [] ResolutionNames) {
        this.ResolutionNames = ResolutionNames;
    }

    /**
     * Get Domain name used during playback. Leave it blank or enter Default to indicate usage of the domain name in the default distribution configuration (https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1). 
     * @return Domain Domain name used during playback. Leave it blank or enter Default to indicate usage of the domain name in the default distribution configuration (https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1).
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name used during playback. Leave it blank or enter Default to indicate usage of the domain name in the default distribution configuration (https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1).
     * @param Domain Domain name used during playback. Leave it blank or enter Default to indicate usage of the domain name in the default distribution configuration (https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1).
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Scheme used during playback. Leave it blank or enter Default to indicate usage of the scheme in the default distribution configuration (https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1). Other optional values:
<li>HTTP;</li>
<li>HTTPS.</li> 
     * @return Scheme Scheme used during playback. Leave it blank or enter Default to indicate usage of the scheme in the default distribution configuration (https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1). Other optional values:
<li>HTTP;</li>
<li>HTTPS.</li>
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set Scheme used during playback. Leave it blank or enter Default to indicate usage of the scheme in the default distribution configuration (https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1). Other optional values:
<li>HTTP;</li>
<li>HTTPS.</li>
     * @param Scheme Scheme used during playback. Leave it blank or enter Default to indicate usage of the scheme in the default distribution configuration (https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1). Other optional values:
<li>HTTP;</li>
<li>HTTPS.</li>
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get Template description, with a length limit of 256 characters. 
     * @return Comment Template description, with a length limit of 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description, with a length limit of 256 characters.
     * @param Comment Template description, with a length limit of 256 characters.
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

