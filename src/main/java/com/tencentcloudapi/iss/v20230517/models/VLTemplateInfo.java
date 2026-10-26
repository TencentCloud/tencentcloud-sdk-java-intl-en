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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VLTemplateInfo extends AbstractModel {

    /**
    * <p>Template ID</p>
    */
    @SerializedName("VLTemplateId")
    @Expose
    private String VLTemplateId;

    /**
    * <p>AI model</p><p>Enumeration values:</p><ul><li>IVC-G: Default large model for view</li></ul>
    */
    @SerializedName("AIModel")
    @Expose
    private String AIModel;

    /**
    * <p>AI scenario name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>AI scenario description</p>
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * <p>Prompt content</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>Analysis mode</p><p>Enumeration values:</p><ul><li>image: Image mode</li><li>video: Video mode</li></ul>
    */
    @SerializedName("AnalysisMode")
    @Expose
    private String AnalysisMode;

    /**
    * <p>Image scenario configuration</p>
    */
    @SerializedName("ImageConfig")
    @Expose
    private ImageSceneInfo ImageConfig;

    /**
    * <p>Effective period list</p>
    */
    @SerializedName("Times")
    @Expose
    private EffectiveTime [] Times;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>Last update time</p>
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * <p>Whether associated with a visual understanding plan</p>
    */
    @SerializedName("IsUsed")
    @Expose
    private Boolean IsUsed;

    /**
    * <p>Video scene configuration</p>
    */
    @SerializedName("VideoConfig")
    @Expose
    private VideoSceneInfo VideoConfig;

    /**
     * Get <p>Template ID</p> 
     * @return VLTemplateId <p>Template ID</p>
     */
    public String getVLTemplateId() {
        return this.VLTemplateId;
    }

    /**
     * Set <p>Template ID</p>
     * @param VLTemplateId <p>Template ID</p>
     */
    public void setVLTemplateId(String VLTemplateId) {
        this.VLTemplateId = VLTemplateId;
    }

    /**
     * Get <p>AI model</p><p>Enumeration values:</p><ul><li>IVC-G: Default large model for view</li></ul> 
     * @return AIModel <p>AI model</p><p>Enumeration values:</p><ul><li>IVC-G: Default large model for view</li></ul>
     */
    public String getAIModel() {
        return this.AIModel;
    }

    /**
     * Set <p>AI model</p><p>Enumeration values:</p><ul><li>IVC-G: Default large model for view</li></ul>
     * @param AIModel <p>AI model</p><p>Enumeration values:</p><ul><li>IVC-G: Default large model for view</li></ul>
     */
    public void setAIModel(String AIModel) {
        this.AIModel = AIModel;
    }

    /**
     * Get <p>AI scenario name</p> 
     * @return Name <p>AI scenario name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>AI scenario name</p>
     * @param Name <p>AI scenario name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>AI scenario description</p> 
     * @return Describe <p>AI scenario description</p>
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set <p>AI scenario description</p>
     * @param Describe <p>AI scenario description</p>
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get <p>Prompt content</p> 
     * @return Prompt <p>Prompt content</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Prompt content</p>
     * @param Prompt <p>Prompt content</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>Analysis mode</p><p>Enumeration values:</p><ul><li>image: Image mode</li><li>video: Video mode</li></ul> 
     * @return AnalysisMode <p>Analysis mode</p><p>Enumeration values:</p><ul><li>image: Image mode</li><li>video: Video mode</li></ul>
     */
    public String getAnalysisMode() {
        return this.AnalysisMode;
    }

    /**
     * Set <p>Analysis mode</p><p>Enumeration values:</p><ul><li>image: Image mode</li><li>video: Video mode</li></ul>
     * @param AnalysisMode <p>Analysis mode</p><p>Enumeration values:</p><ul><li>image: Image mode</li><li>video: Video mode</li></ul>
     */
    public void setAnalysisMode(String AnalysisMode) {
        this.AnalysisMode = AnalysisMode;
    }

    /**
     * Get <p>Image scenario configuration</p> 
     * @return ImageConfig <p>Image scenario configuration</p>
     */
    public ImageSceneInfo getImageConfig() {
        return this.ImageConfig;
    }

    /**
     * Set <p>Image scenario configuration</p>
     * @param ImageConfig <p>Image scenario configuration</p>
     */
    public void setImageConfig(ImageSceneInfo ImageConfig) {
        this.ImageConfig = ImageConfig;
    }

    /**
     * Get <p>Effective period list</p> 
     * @return Times <p>Effective period list</p>
     */
    public EffectiveTime [] getTimes() {
        return this.Times;
    }

    /**
     * Set <p>Effective period list</p>
     * @param Times <p>Effective period list</p>
     */
    public void setTimes(EffectiveTime [] Times) {
        this.Times = Times;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreatedAt <p>Creation time.</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreatedAt <p>Creation time.</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>Last update time</p> 
     * @return UpdatedAt <p>Last update time</p>
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>Last update time</p>
     * @param UpdatedAt <p>Last update time</p>
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get <p>Whether associated with a visual understanding plan</p> 
     * @return IsUsed <p>Whether associated with a visual understanding plan</p>
     */
    public Boolean getIsUsed() {
        return this.IsUsed;
    }

    /**
     * Set <p>Whether associated with a visual understanding plan</p>
     * @param IsUsed <p>Whether associated with a visual understanding plan</p>
     */
    public void setIsUsed(Boolean IsUsed) {
        this.IsUsed = IsUsed;
    }

    /**
     * Get <p>Video scene configuration</p> 
     * @return VideoConfig <p>Video scene configuration</p>
     */
    public VideoSceneInfo getVideoConfig() {
        return this.VideoConfig;
    }

    /**
     * Set <p>Video scene configuration</p>
     * @param VideoConfig <p>Video scene configuration</p>
     */
    public void setVideoConfig(VideoSceneInfo VideoConfig) {
        this.VideoConfig = VideoConfig;
    }

    public VLTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VLTemplateInfo(VLTemplateInfo source) {
        if (source.VLTemplateId != null) {
            this.VLTemplateId = new String(source.VLTemplateId);
        }
        if (source.AIModel != null) {
            this.AIModel = new String(source.AIModel);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.AnalysisMode != null) {
            this.AnalysisMode = new String(source.AnalysisMode);
        }
        if (source.ImageConfig != null) {
            this.ImageConfig = new ImageSceneInfo(source.ImageConfig);
        }
        if (source.Times != null) {
            this.Times = new EffectiveTime[source.Times.length];
            for (int i = 0; i < source.Times.length; i++) {
                this.Times[i] = new EffectiveTime(source.Times[i]);
            }
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.IsUsed != null) {
            this.IsUsed = new Boolean(source.IsUsed);
        }
        if (source.VideoConfig != null) {
            this.VideoConfig = new VideoSceneInfo(source.VideoConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VLTemplateId", this.VLTemplateId);
        this.setParamSimple(map, prefix + "AIModel", this.AIModel);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "AnalysisMode", this.AnalysisMode);
        this.setParamObj(map, prefix + "ImageConfig.", this.ImageConfig);
        this.setParamArrayObj(map, prefix + "Times.", this.Times);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "IsUsed", this.IsUsed);
        this.setParamObj(map, prefix + "VideoConfig.", this.VideoConfig);

    }
}

