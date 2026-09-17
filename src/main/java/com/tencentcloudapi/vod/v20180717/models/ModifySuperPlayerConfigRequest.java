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

public class ModifySuperPlayerConfigRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("AudioVideoType")
    @Expose
    private String AudioVideoType;

    /**
    * 
    */
    @SerializedName("DrmSwitch")
    @Expose
    private String DrmSwitch;

    /**
    * 
    */
    @SerializedName("AdaptiveDynamicStreamingDefinition")
    @Expose
    private Long AdaptiveDynamicStreamingDefinition;

    /**
    * 
    */
    @SerializedName("DrmStreamingsInfo")
    @Expose
    private DrmStreamingsInfoForUpdate DrmStreamingsInfo;

    /**
    * 
    */
    @SerializedName("TranscodeDefinition")
    @Expose
    private Long TranscodeDefinition;

    /**
    * 
    */
    @SerializedName("ImageSpriteDefinition")
    @Expose
    private Long ImageSpriteDefinition;

    /**
    * 
    */
    @SerializedName("ResolutionNames")
    @Expose
    private ResolutionNameInfo [] ResolutionNames;

    /**
    * 
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * 
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return AudioVideoType 
     */
    public String getAudioVideoType() {
        return this.AudioVideoType;
    }

    /**
     * Set 
     * @param AudioVideoType 
     */
    public void setAudioVideoType(String AudioVideoType) {
        this.AudioVideoType = AudioVideoType;
    }

    /**
     * Get  
     * @return DrmSwitch 
     */
    public String getDrmSwitch() {
        return this.DrmSwitch;
    }

    /**
     * Set 
     * @param DrmSwitch 
     */
    public void setDrmSwitch(String DrmSwitch) {
        this.DrmSwitch = DrmSwitch;
    }

    /**
     * Get  
     * @return AdaptiveDynamicStreamingDefinition 
     */
    public Long getAdaptiveDynamicStreamingDefinition() {
        return this.AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Set 
     * @param AdaptiveDynamicStreamingDefinition 
     */
    public void setAdaptiveDynamicStreamingDefinition(Long AdaptiveDynamicStreamingDefinition) {
        this.AdaptiveDynamicStreamingDefinition = AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Get  
     * @return DrmStreamingsInfo 
     */
    public DrmStreamingsInfoForUpdate getDrmStreamingsInfo() {
        return this.DrmStreamingsInfo;
    }

    /**
     * Set 
     * @param DrmStreamingsInfo 
     */
    public void setDrmStreamingsInfo(DrmStreamingsInfoForUpdate DrmStreamingsInfo) {
        this.DrmStreamingsInfo = DrmStreamingsInfo;
    }

    /**
     * Get  
     * @return TranscodeDefinition 
     */
    public Long getTranscodeDefinition() {
        return this.TranscodeDefinition;
    }

    /**
     * Set 
     * @param TranscodeDefinition 
     */
    public void setTranscodeDefinition(Long TranscodeDefinition) {
        this.TranscodeDefinition = TranscodeDefinition;
    }

    /**
     * Get  
     * @return ImageSpriteDefinition 
     */
    public Long getImageSpriteDefinition() {
        return this.ImageSpriteDefinition;
    }

    /**
     * Set 
     * @param ImageSpriteDefinition 
     */
    public void setImageSpriteDefinition(Long ImageSpriteDefinition) {
        this.ImageSpriteDefinition = ImageSpriteDefinition;
    }

    /**
     * Get  
     * @return ResolutionNames 
     */
    public ResolutionNameInfo [] getResolutionNames() {
        return this.ResolutionNames;
    }

    /**
     * Set 
     * @param ResolutionNames 
     */
    public void setResolutionNames(ResolutionNameInfo [] ResolutionNames) {
        this.ResolutionNames = ResolutionNames;
    }

    /**
     * Get  
     * @return Domain 
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 
     * @param Domain 
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get  
     * @return Scheme 
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set 
     * @param Scheme 
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get  
     * @return Comment 
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 
     * @param Comment 
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public ModifySuperPlayerConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySuperPlayerConfigRequest(ModifySuperPlayerConfigRequest source) {
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
            this.DrmStreamingsInfo = new DrmStreamingsInfoForUpdate(source.DrmStreamingsInfo);
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

