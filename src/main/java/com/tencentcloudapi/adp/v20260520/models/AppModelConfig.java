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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppModelConfig extends AbstractModel {

    /**
    * AI one-click optimization model
    */
    @SerializedName("AiOptimizeModel")
    @Expose
    private AIOptimizeModel AiOptimizeModel;

    /**
    * Real-time file parsing model
    */
    @SerializedName("FileParseModel")
    @Expose
    private FileParseModel FileParseModel;

    /**
    * Generate model configuration
    */
    @SerializedName("GenerateModel")
    @Expose
    private GenerateModel GenerateModel;

    /**
    * Multimodal QA model
    */
    @SerializedName("MultiModalQaModel")
    @Expose
    private MultiModalQAModel MultiModalQaModel;

    /**
    * Multimodal understanding model
    */
    @SerializedName("MultiModalUnderstandingModel")
    @Expose
    private MultiModalUnderstandingModel MultiModalUnderstandingModel;

    /**
    * Prompt rewrite model
    */
    @SerializedName("PromptRewriteModel")
    @Expose
    private PromptRewriteModel PromptRewriteModel;

    /**
    * Thinking model configuration
    */
    @SerializedName("ThinkModel")
    @Expose
    private ThinkModel ThinkModel;

    /**
     * Get AI one-click optimization model 
     * @return AiOptimizeModel AI one-click optimization model
     */
    public AIOptimizeModel getAiOptimizeModel() {
        return this.AiOptimizeModel;
    }

    /**
     * Set AI one-click optimization model
     * @param AiOptimizeModel AI one-click optimization model
     */
    public void setAiOptimizeModel(AIOptimizeModel AiOptimizeModel) {
        this.AiOptimizeModel = AiOptimizeModel;
    }

    /**
     * Get Real-time file parsing model 
     * @return FileParseModel Real-time file parsing model
     */
    public FileParseModel getFileParseModel() {
        return this.FileParseModel;
    }

    /**
     * Set Real-time file parsing model
     * @param FileParseModel Real-time file parsing model
     */
    public void setFileParseModel(FileParseModel FileParseModel) {
        this.FileParseModel = FileParseModel;
    }

    /**
     * Get Generate model configuration 
     * @return GenerateModel Generate model configuration
     */
    public GenerateModel getGenerateModel() {
        return this.GenerateModel;
    }

    /**
     * Set Generate model configuration
     * @param GenerateModel Generate model configuration
     */
    public void setGenerateModel(GenerateModel GenerateModel) {
        this.GenerateModel = GenerateModel;
    }

    /**
     * Get Multimodal QA model 
     * @return MultiModalQaModel Multimodal QA model
     */
    public MultiModalQAModel getMultiModalQaModel() {
        return this.MultiModalQaModel;
    }

    /**
     * Set Multimodal QA model
     * @param MultiModalQaModel Multimodal QA model
     */
    public void setMultiModalQaModel(MultiModalQAModel MultiModalQaModel) {
        this.MultiModalQaModel = MultiModalQaModel;
    }

    /**
     * Get Multimodal understanding model 
     * @return MultiModalUnderstandingModel Multimodal understanding model
     */
    public MultiModalUnderstandingModel getMultiModalUnderstandingModel() {
        return this.MultiModalUnderstandingModel;
    }

    /**
     * Set Multimodal understanding model
     * @param MultiModalUnderstandingModel Multimodal understanding model
     */
    public void setMultiModalUnderstandingModel(MultiModalUnderstandingModel MultiModalUnderstandingModel) {
        this.MultiModalUnderstandingModel = MultiModalUnderstandingModel;
    }

    /**
     * Get Prompt rewrite model 
     * @return PromptRewriteModel Prompt rewrite model
     */
    public PromptRewriteModel getPromptRewriteModel() {
        return this.PromptRewriteModel;
    }

    /**
     * Set Prompt rewrite model
     * @param PromptRewriteModel Prompt rewrite model
     */
    public void setPromptRewriteModel(PromptRewriteModel PromptRewriteModel) {
        this.PromptRewriteModel = PromptRewriteModel;
    }

    /**
     * Get Thinking model configuration 
     * @return ThinkModel Thinking model configuration
     */
    public ThinkModel getThinkModel() {
        return this.ThinkModel;
    }

    /**
     * Set Thinking model configuration
     * @param ThinkModel Thinking model configuration
     */
    public void setThinkModel(ThinkModel ThinkModel) {
        this.ThinkModel = ThinkModel;
    }

    public AppModelConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppModelConfig(AppModelConfig source) {
        if (source.AiOptimizeModel != null) {
            this.AiOptimizeModel = new AIOptimizeModel(source.AiOptimizeModel);
        }
        if (source.FileParseModel != null) {
            this.FileParseModel = new FileParseModel(source.FileParseModel);
        }
        if (source.GenerateModel != null) {
            this.GenerateModel = new GenerateModel(source.GenerateModel);
        }
        if (source.MultiModalQaModel != null) {
            this.MultiModalQaModel = new MultiModalQAModel(source.MultiModalQaModel);
        }
        if (source.MultiModalUnderstandingModel != null) {
            this.MultiModalUnderstandingModel = new MultiModalUnderstandingModel(source.MultiModalUnderstandingModel);
        }
        if (source.PromptRewriteModel != null) {
            this.PromptRewriteModel = new PromptRewriteModel(source.PromptRewriteModel);
        }
        if (source.ThinkModel != null) {
            this.ThinkModel = new ThinkModel(source.ThinkModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AiOptimizeModel.", this.AiOptimizeModel);
        this.setParamObj(map, prefix + "FileParseModel.", this.FileParseModel);
        this.setParamObj(map, prefix + "GenerateModel.", this.GenerateModel);
        this.setParamObj(map, prefix + "MultiModalQaModel.", this.MultiModalQaModel);
        this.setParamObj(map, prefix + "MultiModalUnderstandingModel.", this.MultiModalUnderstandingModel);
        this.setParamObj(map, prefix + "PromptRewriteModel.", this.PromptRewriteModel);
        this.setParamObj(map, prefix + "ThinkModel.", this.ThinkModel);

    }
}

