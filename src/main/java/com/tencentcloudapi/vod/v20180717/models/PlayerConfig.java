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
    * <p>Player configuration name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Player configuration type. Valid values:</p><li>Preset: system predefined configuration.</li><li>Custom: user-customized configuration.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Played Audio and Video Type. Optional values:</p><li>AdaptiveDynamicStream: adaptive bitrate stream output;</li><li>Transcode: transcoding output;</li><li>Original: original audio/video.</li>
    */
    @SerializedName("AudioVideoType")
    @Expose
    private String AudioVideoType;

    /**
    * <p>Switch for playing DRM-protected adaptive bitstream:</p><li>ON: Enable, indicates only playback of protected adaptive bitrate output;</li><li>OFF: Disable, indicates playback of unencrypted adaptive bitstream output.</li>
    */
    @SerializedName("DrmSwitch")
    @Expose
    private String DrmSwitch;

    /**
    * <p>Allowed output of unencrypted adaptive bitstream template ID.</p>
    */
    @SerializedName("AdaptiveDynamicStreamingDefinition")
    @Expose
    private Long AdaptiveDynamicStreamingDefinition;

    /**
    * <p>Allowed output of DRM adaptive bitstream template content.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DrmStreamingsInfo")
    @Expose
    private DrmStreamingsInfo DrmStreamingsInfo;

    /**
    * <p>Allowed output transcoding template ID.</p>
    */
    @SerializedName("TranscodeDefinition")
    @Expose
    private Long TranscodeDefinition;

    /**
    * <p>Allowed output sprite template ID.</p>
    */
    @SerializedName("ImageSpriteDefinition")
    @Expose
    private Long ImageSpriteDefinition;

    /**
    * <p>The player displays names for substreams of different resolution.</p>
    */
    @SerializedName("ResolutionNameSet")
    @Expose
    private ResolutionNameInfo [] ResolutionNameSet;

    /**
    * <p>Player configuration creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Last player configuration modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Domain name used during playback. A value of Default indicates usage of the domain name in the <a href="https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1">default distribution configuration</a>.</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Scheme used during playback. Value ranges from:</p><li>Default: Use the scheme in the [default distribution configuration](https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1);</li><li>HTTP;</li><li>HTTPS.</li>
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * <p>Template description information.</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get <p>Player configuration name.</p> 
     * @return Name <p>Player configuration name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Player configuration name.</p>
     * @param Name <p>Player configuration name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Player configuration type. Valid values:</p><li>Preset: system predefined configuration.</li><li>Custom: user-customized configuration.</li> 
     * @return Type <p>Player configuration type. Valid values:</p><li>Preset: system predefined configuration.</li><li>Custom: user-customized configuration.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Player configuration type. Valid values:</p><li>Preset: system predefined configuration.</li><li>Custom: user-customized configuration.</li>
     * @param Type <p>Player configuration type. Valid values:</p><li>Preset: system predefined configuration.</li><li>Custom: user-customized configuration.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Played Audio and Video Type. Optional values:</p><li>AdaptiveDynamicStream: adaptive bitrate stream output;</li><li>Transcode: transcoding output;</li><li>Original: original audio/video.</li> 
     * @return AudioVideoType <p>Played Audio and Video Type. Optional values:</p><li>AdaptiveDynamicStream: adaptive bitrate stream output;</li><li>Transcode: transcoding output;</li><li>Original: original audio/video.</li>
     */
    public String getAudioVideoType() {
        return this.AudioVideoType;
    }

    /**
     * Set <p>Played Audio and Video Type. Optional values:</p><li>AdaptiveDynamicStream: adaptive bitrate stream output;</li><li>Transcode: transcoding output;</li><li>Original: original audio/video.</li>
     * @param AudioVideoType <p>Played Audio and Video Type. Optional values:</p><li>AdaptiveDynamicStream: adaptive bitrate stream output;</li><li>Transcode: transcoding output;</li><li>Original: original audio/video.</li>
     */
    public void setAudioVideoType(String AudioVideoType) {
        this.AudioVideoType = AudioVideoType;
    }

    /**
     * Get <p>Switch for playing DRM-protected adaptive bitstream:</p><li>ON: Enable, indicates only playback of protected adaptive bitrate output;</li><li>OFF: Disable, indicates playback of unencrypted adaptive bitstream output.</li> 
     * @return DrmSwitch <p>Switch for playing DRM-protected adaptive bitstream:</p><li>ON: Enable, indicates only playback of protected adaptive bitrate output;</li><li>OFF: Disable, indicates playback of unencrypted adaptive bitstream output.</li>
     */
    public String getDrmSwitch() {
        return this.DrmSwitch;
    }

    /**
     * Set <p>Switch for playing DRM-protected adaptive bitstream:</p><li>ON: Enable, indicates only playback of protected adaptive bitrate output;</li><li>OFF: Disable, indicates playback of unencrypted adaptive bitstream output.</li>
     * @param DrmSwitch <p>Switch for playing DRM-protected adaptive bitstream:</p><li>ON: Enable, indicates only playback of protected adaptive bitrate output;</li><li>OFF: Disable, indicates playback of unencrypted adaptive bitstream output.</li>
     */
    public void setDrmSwitch(String DrmSwitch) {
        this.DrmSwitch = DrmSwitch;
    }

    /**
     * Get <p>Allowed output of unencrypted adaptive bitstream template ID.</p> 
     * @return AdaptiveDynamicStreamingDefinition <p>Allowed output of unencrypted adaptive bitstream template ID.</p>
     */
    public Long getAdaptiveDynamicStreamingDefinition() {
        return this.AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Set <p>Allowed output of unencrypted adaptive bitstream template ID.</p>
     * @param AdaptiveDynamicStreamingDefinition <p>Allowed output of unencrypted adaptive bitstream template ID.</p>
     */
    public void setAdaptiveDynamicStreamingDefinition(Long AdaptiveDynamicStreamingDefinition) {
        this.AdaptiveDynamicStreamingDefinition = AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Get <p>Allowed output of DRM adaptive bitstream template content.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DrmStreamingsInfo <p>Allowed output of DRM adaptive bitstream template content.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DrmStreamingsInfo getDrmStreamingsInfo() {
        return this.DrmStreamingsInfo;
    }

    /**
     * Set <p>Allowed output of DRM adaptive bitstream template content.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DrmStreamingsInfo <p>Allowed output of DRM adaptive bitstream template content.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDrmStreamingsInfo(DrmStreamingsInfo DrmStreamingsInfo) {
        this.DrmStreamingsInfo = DrmStreamingsInfo;
    }

    /**
     * Get <p>Allowed output transcoding template ID.</p> 
     * @return TranscodeDefinition <p>Allowed output transcoding template ID.</p>
     */
    public Long getTranscodeDefinition() {
        return this.TranscodeDefinition;
    }

    /**
     * Set <p>Allowed output transcoding template ID.</p>
     * @param TranscodeDefinition <p>Allowed output transcoding template ID.</p>
     */
    public void setTranscodeDefinition(Long TranscodeDefinition) {
        this.TranscodeDefinition = TranscodeDefinition;
    }

    /**
     * Get <p>Allowed output sprite template ID.</p> 
     * @return ImageSpriteDefinition <p>Allowed output sprite template ID.</p>
     */
    public Long getImageSpriteDefinition() {
        return this.ImageSpriteDefinition;
    }

    /**
     * Set <p>Allowed output sprite template ID.</p>
     * @param ImageSpriteDefinition <p>Allowed output sprite template ID.</p>
     */
    public void setImageSpriteDefinition(Long ImageSpriteDefinition) {
        this.ImageSpriteDefinition = ImageSpriteDefinition;
    }

    /**
     * Get <p>The player displays names for substreams of different resolution.</p> 
     * @return ResolutionNameSet <p>The player displays names for substreams of different resolution.</p>
     */
    public ResolutionNameInfo [] getResolutionNameSet() {
        return this.ResolutionNameSet;
    }

    /**
     * Set <p>The player displays names for substreams of different resolution.</p>
     * @param ResolutionNameSet <p>The player displays names for substreams of different resolution.</p>
     */
    public void setResolutionNameSet(ResolutionNameInfo [] ResolutionNameSet) {
        this.ResolutionNameSet = ResolutionNameSet;
    }

    /**
     * Get <p>Player configuration creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p> 
     * @return CreateTime <p>Player configuration creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Player configuration creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     * @param CreateTime <p>Player configuration creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Last player configuration modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p> 
     * @return UpdateTime <p>Last player configuration modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Last player configuration modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     * @param UpdateTime <p>Last player configuration modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Domain name used during playback. A value of Default indicates usage of the domain name in the <a href="https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1">default distribution configuration</a>.</p> 
     * @return Domain <p>Domain name used during playback. A value of Default indicates usage of the domain name in the <a href="https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1">default distribution configuration</a>.</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Domain name used during playback. A value of Default indicates usage of the domain name in the <a href="https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1">default distribution configuration</a>.</p>
     * @param Domain <p>Domain name used during playback. A value of Default indicates usage of the domain name in the <a href="https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1">default distribution configuration</a>.</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Scheme used during playback. Value ranges from:</p><li>Default: Use the scheme in the [default distribution configuration](https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1);</li><li>HTTP;</li><li>HTTPS.</li> 
     * @return Scheme <p>Scheme used during playback. Value ranges from:</p><li>Default: Use the scheme in the [default distribution configuration](https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1);</li><li>HTTP;</li><li>HTTPS.</li>
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set <p>Scheme used during playback. Value ranges from:</p><li>Default: Use the scheme in the [default distribution configuration](https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1);</li><li>HTTP;</li><li>HTTPS.</li>
     * @param Scheme <p>Scheme used during playback. Value ranges from:</p><li>Default: Use the scheme in the [default distribution configuration](https://www.tencentcloud.com/document/product/266/33373?from_cn_redirect=1);</li><li>HTTP;</li><li>HTTPS.</li>
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get <p>Template description information.</p> 
     * @return Comment <p>Template description information.</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Template description information.</p>
     * @param Comment <p>Template description information.</p>
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

