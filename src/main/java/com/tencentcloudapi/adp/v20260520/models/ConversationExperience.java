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

public class ConversationExperience extends AbstractModel {

    /**
    * <p>AI Call Configuration</p>
    */
    @SerializedName("AiCall")
    @Expose
    private AICallConfig AiCall;

    /**
    * <p>Background image configuration</p>
    */
    @SerializedName("BackgroundImage")
    @Expose
    private BackgroundImage BackgroundImage;

    /**
    * <p>Fallback response switch</p>
    */
    @SerializedName("EnableFallbackReply")
    @Expose
    private Boolean EnableFallbackReply;

    /**
    * <p>Whether to use recommended questions.</p>
    */
    @SerializedName("EnableRecommended")
    @Expose
    private Boolean EnableRecommended;

    /**
    * <p>Whether to use online search.</p>
    */
    @SerializedName("EnableWebSearch")
    @Expose
    private Boolean EnableWebSearch;

    /**
    * <p>Fallback response</p>
    */
    @SerializedName("FallbackReply")
    @Expose
    private String FallbackReply;

    /**
    * <p>Input box configuration</p>
    */
    @SerializedName("InputBoxConfig")
    @Expose
    private InputBoxConfig InputBoxConfig;

    /**
    * <p>Output method. Enumeration values: 1: streaming, 2: non-streaming</p>
    */
    @SerializedName("Method")
    @Expose
    private Long Method;

    /**
    * <p>Recommended question generation prompt mode. Enumeration value: 1: Prompt that outputs recommended questions combined with the knowledge base only</p>
    */
    @SerializedName("RecommendPromptMode")
    @Expose
    private Long RecommendPromptMode;

    /**
    * <p>A new message interrupts the ongoing message</p>
    */
    @SerializedName("EnableNewMessageInterrupt")
    @Expose
    private Boolean EnableNewMessageInterrupt;

    /**
     * Get <p>AI Call Configuration</p> 
     * @return AiCall <p>AI Call Configuration</p>
     */
    public AICallConfig getAiCall() {
        return this.AiCall;
    }

    /**
     * Set <p>AI Call Configuration</p>
     * @param AiCall <p>AI Call Configuration</p>
     */
    public void setAiCall(AICallConfig AiCall) {
        this.AiCall = AiCall;
    }

    /**
     * Get <p>Background image configuration</p> 
     * @return BackgroundImage <p>Background image configuration</p>
     */
    public BackgroundImage getBackgroundImage() {
        return this.BackgroundImage;
    }

    /**
     * Set <p>Background image configuration</p>
     * @param BackgroundImage <p>Background image configuration</p>
     */
    public void setBackgroundImage(BackgroundImage BackgroundImage) {
        this.BackgroundImage = BackgroundImage;
    }

    /**
     * Get <p>Fallback response switch</p> 
     * @return EnableFallbackReply <p>Fallback response switch</p>
     */
    public Boolean getEnableFallbackReply() {
        return this.EnableFallbackReply;
    }

    /**
     * Set <p>Fallback response switch</p>
     * @param EnableFallbackReply <p>Fallback response switch</p>
     */
    public void setEnableFallbackReply(Boolean EnableFallbackReply) {
        this.EnableFallbackReply = EnableFallbackReply;
    }

    /**
     * Get <p>Whether to use recommended questions.</p> 
     * @return EnableRecommended <p>Whether to use recommended questions.</p>
     */
    public Boolean getEnableRecommended() {
        return this.EnableRecommended;
    }

    /**
     * Set <p>Whether to use recommended questions.</p>
     * @param EnableRecommended <p>Whether to use recommended questions.</p>
     */
    public void setEnableRecommended(Boolean EnableRecommended) {
        this.EnableRecommended = EnableRecommended;
    }

    /**
     * Get <p>Whether to use online search.</p> 
     * @return EnableWebSearch <p>Whether to use online search.</p>
     */
    public Boolean getEnableWebSearch() {
        return this.EnableWebSearch;
    }

    /**
     * Set <p>Whether to use online search.</p>
     * @param EnableWebSearch <p>Whether to use online search.</p>
     */
    public void setEnableWebSearch(Boolean EnableWebSearch) {
        this.EnableWebSearch = EnableWebSearch;
    }

    /**
     * Get <p>Fallback response</p> 
     * @return FallbackReply <p>Fallback response</p>
     */
    public String getFallbackReply() {
        return this.FallbackReply;
    }

    /**
     * Set <p>Fallback response</p>
     * @param FallbackReply <p>Fallback response</p>
     */
    public void setFallbackReply(String FallbackReply) {
        this.FallbackReply = FallbackReply;
    }

    /**
     * Get <p>Input box configuration</p> 
     * @return InputBoxConfig <p>Input box configuration</p>
     */
    public InputBoxConfig getInputBoxConfig() {
        return this.InputBoxConfig;
    }

    /**
     * Set <p>Input box configuration</p>
     * @param InputBoxConfig <p>Input box configuration</p>
     */
    public void setInputBoxConfig(InputBoxConfig InputBoxConfig) {
        this.InputBoxConfig = InputBoxConfig;
    }

    /**
     * Get <p>Output method. Enumeration values: 1: streaming, 2: non-streaming</p> 
     * @return Method <p>Output method. Enumeration values: 1: streaming, 2: non-streaming</p>
     */
    public Long getMethod() {
        return this.Method;
    }

    /**
     * Set <p>Output method. Enumeration values: 1: streaming, 2: non-streaming</p>
     * @param Method <p>Output method. Enumeration values: 1: streaming, 2: non-streaming</p>
     */
    public void setMethod(Long Method) {
        this.Method = Method;
    }

    /**
     * Get <p>Recommended question generation prompt mode. Enumeration value: 1: Prompt that outputs recommended questions combined with the knowledge base only</p> 
     * @return RecommendPromptMode <p>Recommended question generation prompt mode. Enumeration value: 1: Prompt that outputs recommended questions combined with the knowledge base only</p>
     */
    public Long getRecommendPromptMode() {
        return this.RecommendPromptMode;
    }

    /**
     * Set <p>Recommended question generation prompt mode. Enumeration value: 1: Prompt that outputs recommended questions combined with the knowledge base only</p>
     * @param RecommendPromptMode <p>Recommended question generation prompt mode. Enumeration value: 1: Prompt that outputs recommended questions combined with the knowledge base only</p>
     */
    public void setRecommendPromptMode(Long RecommendPromptMode) {
        this.RecommendPromptMode = RecommendPromptMode;
    }

    /**
     * Get <p>A new message interrupts the ongoing message</p> 
     * @return EnableNewMessageInterrupt <p>A new message interrupts the ongoing message</p>
     */
    public Boolean getEnableNewMessageInterrupt() {
        return this.EnableNewMessageInterrupt;
    }

    /**
     * Set <p>A new message interrupts the ongoing message</p>
     * @param EnableNewMessageInterrupt <p>A new message interrupts the ongoing message</p>
     */
    public void setEnableNewMessageInterrupt(Boolean EnableNewMessageInterrupt) {
        this.EnableNewMessageInterrupt = EnableNewMessageInterrupt;
    }

    public ConversationExperience() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationExperience(ConversationExperience source) {
        if (source.AiCall != null) {
            this.AiCall = new AICallConfig(source.AiCall);
        }
        if (source.BackgroundImage != null) {
            this.BackgroundImage = new BackgroundImage(source.BackgroundImage);
        }
        if (source.EnableFallbackReply != null) {
            this.EnableFallbackReply = new Boolean(source.EnableFallbackReply);
        }
        if (source.EnableRecommended != null) {
            this.EnableRecommended = new Boolean(source.EnableRecommended);
        }
        if (source.EnableWebSearch != null) {
            this.EnableWebSearch = new Boolean(source.EnableWebSearch);
        }
        if (source.FallbackReply != null) {
            this.FallbackReply = new String(source.FallbackReply);
        }
        if (source.InputBoxConfig != null) {
            this.InputBoxConfig = new InputBoxConfig(source.InputBoxConfig);
        }
        if (source.Method != null) {
            this.Method = new Long(source.Method);
        }
        if (source.RecommendPromptMode != null) {
            this.RecommendPromptMode = new Long(source.RecommendPromptMode);
        }
        if (source.EnableNewMessageInterrupt != null) {
            this.EnableNewMessageInterrupt = new Boolean(source.EnableNewMessageInterrupt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AiCall.", this.AiCall);
        this.setParamObj(map, prefix + "BackgroundImage.", this.BackgroundImage);
        this.setParamSimple(map, prefix + "EnableFallbackReply", this.EnableFallbackReply);
        this.setParamSimple(map, prefix + "EnableRecommended", this.EnableRecommended);
        this.setParamSimple(map, prefix + "EnableWebSearch", this.EnableWebSearch);
        this.setParamSimple(map, prefix + "FallbackReply", this.FallbackReply);
        this.setParamObj(map, prefix + "InputBoxConfig.", this.InputBoxConfig);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "RecommendPromptMode", this.RecommendPromptMode);
        this.setParamSimple(map, prefix + "EnableNewMessageInterrupt", this.EnableNewMessageInterrupt);

    }
}

