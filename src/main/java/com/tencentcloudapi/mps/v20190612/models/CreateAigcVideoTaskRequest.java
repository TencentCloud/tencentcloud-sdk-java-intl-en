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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAigcVideoTaskRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * 
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * 
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * 
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private Boolean EnhancePrompt;

    /**
    * 
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 
    */
    @SerializedName("LastImageUrl")
    @Expose
    private String LastImageUrl;

    /**
    * 
    */
    @SerializedName("ImageInfos")
    @Expose
    private AigcVideoReferenceImageInfo [] ImageInfos;

    /**
    * 
    */
    @SerializedName("VideoInfos")
    @Expose
    private AigcVideoReferenceVideoInfo [] VideoInfos;

    /**
    * 
    */
    @SerializedName("AudioInfos")
    @Expose
    private AigcVideoReferenceAudioInfo [] AudioInfos;

    /**
    * <p>Entity information.</p>
    */
    @SerializedName("SubjectInfos")
    @Expose
    private AigcVideoReferenceSubjectInfo [] SubjectInfos;

    /**
    * 
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 
    */
    @SerializedName("ExtraParameters")
    @Expose
    private AigcVideoExtraParam ExtraParameters;

    /**
    * 
    */
    @SerializedName("StoreCosParam")
    @Expose
    private AigcStoreCosParam StoreCosParam;

    /**
    * 
    */
    @SerializedName("AdditionalParameters")
    @Expose
    private String AdditionalParameters;

    /**
    * 
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get  
     * @return ModelName 
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 
     * @param ModelName 
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get  
     * @return ModelVersion 
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 
     * @param ModelVersion 
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get  
     * @return SceneType 
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set 
     * @param SceneType 
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get  
     * @return Prompt 
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 
     * @param Prompt 
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get  
     * @return NegativePrompt 
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set 
     * @param NegativePrompt 
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get  
     * @return EnhancePrompt 
     */
    public Boolean getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set 
     * @param EnhancePrompt 
     */
    public void setEnhancePrompt(Boolean EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get  
     * @return ImageUrl 
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 
     * @param ImageUrl 
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get  
     * @return LastImageUrl 
     */
    public String getLastImageUrl() {
        return this.LastImageUrl;
    }

    /**
     * Set 
     * @param LastImageUrl 
     */
    public void setLastImageUrl(String LastImageUrl) {
        this.LastImageUrl = LastImageUrl;
    }

    /**
     * Get  
     * @return ImageInfos 
     */
    public AigcVideoReferenceImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set 
     * @param ImageInfos 
     */
    public void setImageInfos(AigcVideoReferenceImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    /**
     * Get  
     * @return VideoInfos 
     */
    public AigcVideoReferenceVideoInfo [] getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set 
     * @param VideoInfos 
     */
    public void setVideoInfos(AigcVideoReferenceVideoInfo [] VideoInfos) {
        this.VideoInfos = VideoInfos;
    }

    /**
     * Get  
     * @return AudioInfos 
     */
    public AigcVideoReferenceAudioInfo [] getAudioInfos() {
        return this.AudioInfos;
    }

    /**
     * Set 
     * @param AudioInfos 
     */
    public void setAudioInfos(AigcVideoReferenceAudioInfo [] AudioInfos) {
        this.AudioInfos = AudioInfos;
    }

    /**
     * Get <p>Entity information.</p> 
     * @return SubjectInfos <p>Entity information.</p>
     */
    public AigcVideoReferenceSubjectInfo [] getSubjectInfos() {
        return this.SubjectInfos;
    }

    /**
     * Set <p>Entity information.</p>
     * @param SubjectInfos <p>Entity information.</p>
     */
    public void setSubjectInfos(AigcVideoReferenceSubjectInfo [] SubjectInfos) {
        this.SubjectInfos = SubjectInfos;
    }

    /**
     * Get  
     * @return Duration 
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 
     * @param Duration 
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get  
     * @return ExtraParameters 
     */
    public AigcVideoExtraParam getExtraParameters() {
        return this.ExtraParameters;
    }

    /**
     * Set 
     * @param ExtraParameters 
     */
    public void setExtraParameters(AigcVideoExtraParam ExtraParameters) {
        this.ExtraParameters = ExtraParameters;
    }

    /**
     * Get  
     * @return StoreCosParam 
     */
    public AigcStoreCosParam getStoreCosParam() {
        return this.StoreCosParam;
    }

    /**
     * Set 
     * @param StoreCosParam 
     */
    public void setStoreCosParam(AigcStoreCosParam StoreCosParam) {
        this.StoreCosParam = StoreCosParam;
    }

    /**
     * Get  
     * @return AdditionalParameters 
     */
    public String getAdditionalParameters() {
        return this.AdditionalParameters;
    }

    /**
     * Set 
     * @param AdditionalParameters 
     */
    public void setAdditionalParameters(String AdditionalParameters) {
        this.AdditionalParameters = AdditionalParameters;
    }

    /**
     * Get  
     * @return Operator 
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 
     * @param Operator 
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public CreateAigcVideoTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcVideoTaskRequest(CreateAigcVideoTaskRequest source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.NegativePrompt != null) {
            this.NegativePrompt = new String(source.NegativePrompt);
        }
        if (source.EnhancePrompt != null) {
            this.EnhancePrompt = new Boolean(source.EnhancePrompt);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.LastImageUrl != null) {
            this.LastImageUrl = new String(source.LastImageUrl);
        }
        if (source.ImageInfos != null) {
            this.ImageInfos = new AigcVideoReferenceImageInfo[source.ImageInfos.length];
            for (int i = 0; i < source.ImageInfos.length; i++) {
                this.ImageInfos[i] = new AigcVideoReferenceImageInfo(source.ImageInfos[i]);
            }
        }
        if (source.VideoInfos != null) {
            this.VideoInfos = new AigcVideoReferenceVideoInfo[source.VideoInfos.length];
            for (int i = 0; i < source.VideoInfos.length; i++) {
                this.VideoInfos[i] = new AigcVideoReferenceVideoInfo(source.VideoInfos[i]);
            }
        }
        if (source.AudioInfos != null) {
            this.AudioInfos = new AigcVideoReferenceAudioInfo[source.AudioInfos.length];
            for (int i = 0; i < source.AudioInfos.length; i++) {
                this.AudioInfos[i] = new AigcVideoReferenceAudioInfo(source.AudioInfos[i]);
            }
        }
        if (source.SubjectInfos != null) {
            this.SubjectInfos = new AigcVideoReferenceSubjectInfo[source.SubjectInfos.length];
            for (int i = 0; i < source.SubjectInfos.length; i++) {
                this.SubjectInfos[i] = new AigcVideoReferenceSubjectInfo(source.SubjectInfos[i]);
            }
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ExtraParameters != null) {
            this.ExtraParameters = new AigcVideoExtraParam(source.ExtraParameters);
        }
        if (source.StoreCosParam != null) {
            this.StoreCosParam = new AigcStoreCosParam(source.StoreCosParam);
        }
        if (source.AdditionalParameters != null) {
            this.AdditionalParameters = new String(source.AdditionalParameters);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "EnhancePrompt", this.EnhancePrompt);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "LastImageUrl", this.LastImageUrl);
        this.setParamArrayObj(map, prefix + "ImageInfos.", this.ImageInfos);
        this.setParamArrayObj(map, prefix + "VideoInfos.", this.VideoInfos);
        this.setParamArrayObj(map, prefix + "AudioInfos.", this.AudioInfos);
        this.setParamArrayObj(map, prefix + "SubjectInfos.", this.SubjectInfos);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamObj(map, prefix + "ExtraParameters.", this.ExtraParameters);
        this.setParamObj(map, prefix + "StoreCosParam.", this.StoreCosParam);
        this.setParamSimple(map, prefix + "AdditionalParameters", this.AdditionalParameters);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

