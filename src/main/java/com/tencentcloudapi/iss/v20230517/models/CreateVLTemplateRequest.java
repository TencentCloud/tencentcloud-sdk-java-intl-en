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

public class CreateVLTemplateRequest extends AbstractModel {

    /**
    * <p>AI model</p><p>Enumeration values:</p><ul><li>ivc-vl-1.0: View large model</li></ul>
    */
    @SerializedName("AIModel")
    @Expose
    private String AIModel;

    /**
    * <p>Template name. Supports only Chinese, English, digits, _, and -, with a maximum length of 32 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Prompt content, maximum 2MB</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>Analysis mode</p><p>Enumeration values:</p><ul><li>image: image mode</li><li>video: video mode</li></ul>
    */
    @SerializedName("AnalysisMode")
    @Expose
    private String AnalysisMode;

    /**
    * <p>List of effective periods, up to 100 entries</p>
    */
    @SerializedName("Times")
    @Expose
    private EffectiveTime [] Times;

    /**
    * <p>Template description. Maximum length: 256 characters.</p>
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * <p>Image scenario configuration (required when AnalysisMode=image)</p>
    */
    @SerializedName("ImageConfig")
    @Expose
    private ImageSceneInfo ImageConfig;

    /**
     * Get <p>AI model</p><p>Enumeration values:</p><ul><li>ivc-vl-1.0: View large model</li></ul> 
     * @return AIModel <p>AI model</p><p>Enumeration values:</p><ul><li>ivc-vl-1.0: View large model</li></ul>
     */
    public String getAIModel() {
        return this.AIModel;
    }

    /**
     * Set <p>AI model</p><p>Enumeration values:</p><ul><li>ivc-vl-1.0: View large model</li></ul>
     * @param AIModel <p>AI model</p><p>Enumeration values:</p><ul><li>ivc-vl-1.0: View large model</li></ul>
     */
    public void setAIModel(String AIModel) {
        this.AIModel = AIModel;
    }

    /**
     * Get <p>Template name. Supports only Chinese, English, digits, _, and -, with a maximum length of 32 characters.</p> 
     * @return Name <p>Template name. Supports only Chinese, English, digits, _, and -, with a maximum length of 32 characters.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Template name. Supports only Chinese, English, digits, _, and -, with a maximum length of 32 characters.</p>
     * @param Name <p>Template name. Supports only Chinese, English, digits, _, and -, with a maximum length of 32 characters.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Prompt content, maximum 2MB</p> 
     * @return Prompt <p>Prompt content, maximum 2MB</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Prompt content, maximum 2MB</p>
     * @param Prompt <p>Prompt content, maximum 2MB</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>Analysis mode</p><p>Enumeration values:</p><ul><li>image: image mode</li><li>video: video mode</li></ul> 
     * @return AnalysisMode <p>Analysis mode</p><p>Enumeration values:</p><ul><li>image: image mode</li><li>video: video mode</li></ul>
     */
    public String getAnalysisMode() {
        return this.AnalysisMode;
    }

    /**
     * Set <p>Analysis mode</p><p>Enumeration values:</p><ul><li>image: image mode</li><li>video: video mode</li></ul>
     * @param AnalysisMode <p>Analysis mode</p><p>Enumeration values:</p><ul><li>image: image mode</li><li>video: video mode</li></ul>
     */
    public void setAnalysisMode(String AnalysisMode) {
        this.AnalysisMode = AnalysisMode;
    }

    /**
     * Get <p>List of effective periods, up to 100 entries</p> 
     * @return Times <p>List of effective periods, up to 100 entries</p>
     */
    public EffectiveTime [] getTimes() {
        return this.Times;
    }

    /**
     * Set <p>List of effective periods, up to 100 entries</p>
     * @param Times <p>List of effective periods, up to 100 entries</p>
     */
    public void setTimes(EffectiveTime [] Times) {
        this.Times = Times;
    }

    /**
     * Get <p>Template description. Maximum length: 256 characters.</p> 
     * @return Describe <p>Template description. Maximum length: 256 characters.</p>
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set <p>Template description. Maximum length: 256 characters.</p>
     * @param Describe <p>Template description. Maximum length: 256 characters.</p>
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get <p>Image scenario configuration (required when AnalysisMode=image)</p> 
     * @return ImageConfig <p>Image scenario configuration (required when AnalysisMode=image)</p>
     */
    public ImageSceneInfo getImageConfig() {
        return this.ImageConfig;
    }

    /**
     * Set <p>Image scenario configuration (required when AnalysisMode=image)</p>
     * @param ImageConfig <p>Image scenario configuration (required when AnalysisMode=image)</p>
     */
    public void setImageConfig(ImageSceneInfo ImageConfig) {
        this.ImageConfig = ImageConfig;
    }

    public CreateVLTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVLTemplateRequest(CreateVLTemplateRequest source) {
        if (source.AIModel != null) {
            this.AIModel = new String(source.AIModel);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.AnalysisMode != null) {
            this.AnalysisMode = new String(source.AnalysisMode);
        }
        if (source.Times != null) {
            this.Times = new EffectiveTime[source.Times.length];
            for (int i = 0; i < source.Times.length; i++) {
                this.Times[i] = new EffectiveTime(source.Times[i]);
            }
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.ImageConfig != null) {
            this.ImageConfig = new ImageSceneInfo(source.ImageConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AIModel", this.AIModel);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "AnalysisMode", this.AnalysisMode);
        this.setParamArrayObj(map, prefix + "Times.", this.Times);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamObj(map, prefix + "ImageConfig.", this.ImageConfig);

    }
}

