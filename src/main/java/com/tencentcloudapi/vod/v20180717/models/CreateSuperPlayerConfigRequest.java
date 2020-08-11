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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSuperPlayerConfigRequest extends AbstractModel{

    /**
    * Player configuration name, which can contain up to 64 letters, digits, underscores, and hyphens (such as test_ABC-123) and must be unique under a user.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Switch of DRM-protected adaptive bitstream playback:
<li>ON: enabled, indicating to play back only output adaptive bitstreams protected by DRM;</li>
<li>OFF: disabled, indicating to play back unencrypted output adaptive bitstreams.</li>
Default value: OFF.
    */
    @SerializedName("DrmSwitch")
    @Expose
    private String DrmSwitch;

    /**
    * ID of the unencrypted adaptive bitrate streaming template that allows output, which is required if `DrmSwitch` is `OFF`.
    */
    @SerializedName("AdaptiveDynamicStreamingDefinition")
    @Expose
    private Long AdaptiveDynamicStreamingDefinition;

    /**
    * Content of the DRM-protected adaptive bitrate streaming template that allows output, which is required if `DrmSwitch` is `ON`.
    */
    @SerializedName("DrmStreamingsInfo")
    @Expose
    private DrmStreamingsInfo DrmStreamingsInfo;

    /**
    * ID of the image sprite generating template that allows output.
    */
    @SerializedName("ImageSpriteDefinition")
    @Expose
    private Long ImageSpriteDefinition;

    /**
    * Display name of player for substreams with different resolutions. If this parameter is left empty or an empty array, the default configuration will be used:
<li>MinEdgeLength: 240, Name: LD;</li>
<li>MinEdgeLength: 480, Name: SD;</li>
<li>MinEdgeLength: 720, Name: HD;</li>
<li>MinEdgeLength: 1080, Name: FHD;</li>
<li>MinEdgeLength: 1440, Name: 2K;</li>
<li>MinEdgeLength: 2160, Name: 4K;</li>
<li>MinEdgeLength: 4320, Name: 8K.</li>
    */
    @SerializedName("ResolutionNames")
    @Expose
    private ResolutionNameInfo [] ResolutionNames;

    /**
    * Domain name used for playback. If it is left empty or set to `Default`, the domain name configured in [Default Distribution Configuration](https://cloud.tencent.com/document/product/266/33373) will be used.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Scheme used for playback. If it is left empty or set to `Default`, the scheme configured in [Default Distribution Configuration](https://cloud.tencent.com/document/product/266/33373) will be used. Other valid values:
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
    * [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

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
     * Get Switch of DRM-protected adaptive bitstream playback:
<li>ON: enabled, indicating to play back only output adaptive bitstreams protected by DRM;</li>
<li>OFF: disabled, indicating to play back unencrypted output adaptive bitstreams.</li>
Default value: OFF. 
     * @return DrmSwitch Switch of DRM-protected adaptive bitstream playback:
<li>ON: enabled, indicating to play back only output adaptive bitstreams protected by DRM;</li>
<li>OFF: disabled, indicating to play back unencrypted output adaptive bitstreams.</li>
Default value: OFF.
     */
    public String getDrmSwitch() {
        return this.DrmSwitch;
    }

    /**
     * Set Switch of DRM-protected adaptive bitstream playback:
<li>ON: enabled, indicating to play back only output adaptive bitstreams protected by DRM;</li>
<li>OFF: disabled, indicating to play back unencrypted output adaptive bitstreams.</li>
Default value: OFF.
     * @param DrmSwitch Switch of DRM-protected adaptive bitstream playback:
<li>ON: enabled, indicating to play back only output adaptive bitstreams protected by DRM;</li>
<li>OFF: disabled, indicating to play back unencrypted output adaptive bitstreams.</li>
Default value: OFF.
     */
    public void setDrmSwitch(String DrmSwitch) {
        this.DrmSwitch = DrmSwitch;
    }

    /**
     * Get ID of the unencrypted adaptive bitrate streaming template that allows output, which is required if `DrmSwitch` is `OFF`. 
     * @return AdaptiveDynamicStreamingDefinition ID of the unencrypted adaptive bitrate streaming template that allows output, which is required if `DrmSwitch` is `OFF`.
     */
    public Long getAdaptiveDynamicStreamingDefinition() {
        return this.AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Set ID of the unencrypted adaptive bitrate streaming template that allows output, which is required if `DrmSwitch` is `OFF`.
     * @param AdaptiveDynamicStreamingDefinition ID of the unencrypted adaptive bitrate streaming template that allows output, which is required if `DrmSwitch` is `OFF`.
     */
    public void setAdaptiveDynamicStreamingDefinition(Long AdaptiveDynamicStreamingDefinition) {
        this.AdaptiveDynamicStreamingDefinition = AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Get Content of the DRM-protected adaptive bitrate streaming template that allows output, which is required if `DrmSwitch` is `ON`. 
     * @return DrmStreamingsInfo Content of the DRM-protected adaptive bitrate streaming template that allows output, which is required if `DrmSwitch` is `ON`.
     */
    public DrmStreamingsInfo getDrmStreamingsInfo() {
        return this.DrmStreamingsInfo;
    }

    /**
     * Set Content of the DRM-protected adaptive bitrate streaming template that allows output, which is required if `DrmSwitch` is `ON`.
     * @param DrmStreamingsInfo Content of the DRM-protected adaptive bitrate streaming template that allows output, which is required if `DrmSwitch` is `ON`.
     */
    public void setDrmStreamingsInfo(DrmStreamingsInfo DrmStreamingsInfo) {
        this.DrmStreamingsInfo = DrmStreamingsInfo;
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
     * Get Display name of player for substreams with different resolutions. If this parameter is left empty or an empty array, the default configuration will be used:
<li>MinEdgeLength: 240, Name: LD;</li>
<li>MinEdgeLength: 480, Name: SD;</li>
<li>MinEdgeLength: 720, Name: HD;</li>
<li>MinEdgeLength: 1080, Name: FHD;</li>
<li>MinEdgeLength: 1440, Name: 2K;</li>
<li>MinEdgeLength: 2160, Name: 4K;</li>
<li>MinEdgeLength: 4320, Name: 8K.</li> 
     * @return ResolutionNames Display name of player for substreams with different resolutions. If this parameter is left empty or an empty array, the default configuration will be used:
<li>MinEdgeLength: 240, Name: LD;</li>
<li>MinEdgeLength: 480, Name: SD;</li>
<li>MinEdgeLength: 720, Name: HD;</li>
<li>MinEdgeLength: 1080, Name: FHD;</li>
<li>MinEdgeLength: 1440, Name: 2K;</li>
<li>MinEdgeLength: 2160, Name: 4K;</li>
<li>MinEdgeLength: 4320, Name: 8K.</li>
     */
    public ResolutionNameInfo [] getResolutionNames() {
        return this.ResolutionNames;
    }

    /**
     * Set Display name of player for substreams with different resolutions. If this parameter is left empty or an empty array, the default configuration will be used:
<li>MinEdgeLength: 240, Name: LD;</li>
<li>MinEdgeLength: 480, Name: SD;</li>
<li>MinEdgeLength: 720, Name: HD;</li>
<li>MinEdgeLength: 1080, Name: FHD;</li>
<li>MinEdgeLength: 1440, Name: 2K;</li>
<li>MinEdgeLength: 2160, Name: 4K;</li>
<li>MinEdgeLength: 4320, Name: 8K.</li>
     * @param ResolutionNames Display name of player for substreams with different resolutions. If this parameter is left empty or an empty array, the default configuration will be used:
<li>MinEdgeLength: 240, Name: LD;</li>
<li>MinEdgeLength: 480, Name: SD;</li>
<li>MinEdgeLength: 720, Name: HD;</li>
<li>MinEdgeLength: 1080, Name: FHD;</li>
<li>MinEdgeLength: 1440, Name: 2K;</li>
<li>MinEdgeLength: 2160, Name: 4K;</li>
<li>MinEdgeLength: 4320, Name: 8K.</li>
     */
    public void setResolutionNames(ResolutionNameInfo [] ResolutionNames) {
        this.ResolutionNames = ResolutionNames;
    }

    /**
     * Get Domain name used for playback. If it is left empty or set to `Default`, the domain name configured in [Default Distribution Configuration](https://cloud.tencent.com/document/product/266/33373) will be used. 
     * @return Domain Domain name used for playback. If it is left empty or set to `Default`, the domain name configured in [Default Distribution Configuration](https://cloud.tencent.com/document/product/266/33373) will be used.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name used for playback. If it is left empty or set to `Default`, the domain name configured in [Default Distribution Configuration](https://cloud.tencent.com/document/product/266/33373) will be used.
     * @param Domain Domain name used for playback. If it is left empty or set to `Default`, the domain name configured in [Default Distribution Configuration](https://cloud.tencent.com/document/product/266/33373) will be used.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Scheme used for playback. If it is left empty or set to `Default`, the scheme configured in [Default Distribution Configuration](https://cloud.tencent.com/document/product/266/33373) will be used. Other valid values:
<li>HTTP;</li>
<li>HTTPS.</li> 
     * @return Scheme Scheme used for playback. If it is left empty or set to `Default`, the scheme configured in [Default Distribution Configuration](https://cloud.tencent.com/document/product/266/33373) will be used. Other valid values:
<li>HTTP;</li>
<li>HTTPS.</li>
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set Scheme used for playback. If it is left empty or set to `Default`, the scheme configured in [Default Distribution Configuration](https://cloud.tencent.com/document/product/266/33373) will be used. Other valid values:
<li>HTTP;</li>
<li>HTTPS.</li>
     * @param Scheme Scheme used for playback. If it is left empty or set to `Default`, the scheme configured in [Default Distribution Configuration](https://cloud.tencent.com/document/product/266/33373) will be used. Other valid values:
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

    /**
     * Get [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty. 
     * @return SubAppId [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     * @param SubAppId [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DrmSwitch", this.DrmSwitch);
        this.setParamSimple(map, prefix + "AdaptiveDynamicStreamingDefinition", this.AdaptiveDynamicStreamingDefinition);
        this.setParamObj(map, prefix + "DrmStreamingsInfo.", this.DrmStreamingsInfo);
        this.setParamSimple(map, prefix + "ImageSpriteDefinition", this.ImageSpriteDefinition);
        this.setParamArrayObj(map, prefix + "ResolutionNames.", this.ResolutionNames);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

