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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceConversationLLMConfig extends AbstractModel {

    /**
    * <p>LLM API type, for example, openai (OpenAI-compatible API).</p>
    */
    @SerializedName("LLMType")
    @Expose
    private String LLMType;

    /**
    * <p>Model name, for example, gpt-4o-mini</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>OpenAI-compatible endpoint.</p>
    */
    @SerializedName("APIUrl")
    @Expose
    private String APIUrl;

    /**
    * Provider API key.
    */
    @SerializedName("APIKey")
    @Expose
    private String APIKey;

    /**
    * <p>System prompt.</p>
    */
    @SerializedName("SystemPrompt")
    @Expose
    private String SystemPrompt;

    /**
    * <p>Text used to generate TTS audio when the LLM call fails.</p>
    */
    @SerializedName("FailureMessage")
    @Expose
    private String FailureMessage;

    /**
    * <p>Maximum number of tokens in a single response. 0 means no limit. Default: 0. If the model outputs more tokens than MaxTokens, the response is truncated.</p>
    */
    @SerializedName("MaxTokens")
    @Expose
    private Long MaxTokens;

    /**
    * <p>Whether to enable thinking mode. Availability depends on the model provider. Enabling thinking mode consumes output tokens.</p>
    */
    @SerializedName("ThinkingMode")
    @Expose
    private Boolean ThinkingMode;

    /**
    * <p>Number of conversation turns cached for the LLM. Valid range: 0 to 50. Recommended range: 10 to 30. The total number of tokens in this context must not exceed the LLM context limit.</p>
    */
    @SerializedName("MaxHistory")
    @Expose
    private Long MaxHistory;

    /**
    * <p>Maximum rounds of MCP tool calls, ranging from 0 to 50. Default: 10.</p>
    */
    @SerializedName("MaxToolRound")
    @Expose
    private Long MaxToolRound;

    /**
    * Timeout for a single request, in milliseconds. Valid range: 1000 to 60000. Default: 10000.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>Sampling temperature, ranging from 0.0 to 2.0. Default: 1.0.</p>
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * <p>Top p nucleus sampling. Valid range: 0.0 to 1.0. Default: 1.0.</p>
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
    * <p>MCP Server parameters.</p>
    */
    @SerializedName("McpServer")
    @Expose
    private VoiceConversationMcpServer McpServer;

    /**
    * <p>Custom HTTP request headers.</p>
    */
    @SerializedName("CustomHeaders")
    @Expose
    private KeyValueItem [] CustomHeaders;

    /**
    * Provider-specific parameters, such as DeepSeek's reasoning_effort and Hunyuan's enable_enhancement.
    */
    @SerializedName("CustomFields")
    @Expose
    private KeyValueItem [] CustomFields;

    /**
    * <p>Initial conversation history. Each item uses this format: `{"Role": "user"/"assistant"/"system", "Content": "xxx"}`.</p>
    */
    @SerializedName("HistoryMessages")
    @Expose
    private VoiceConversationHistoryMessage [] HistoryMessages;

    /**
     * Get <p>LLM API type, for example, openai (OpenAI-compatible API).</p> 
     * @return LLMType <p>LLM API type, for example, openai (OpenAI-compatible API).</p>
     */
    public String getLLMType() {
        return this.LLMType;
    }

    /**
     * Set <p>LLM API type, for example, openai (OpenAI-compatible API).</p>
     * @param LLMType <p>LLM API type, for example, openai (OpenAI-compatible API).</p>
     */
    public void setLLMType(String LLMType) {
        this.LLMType = LLMType;
    }

    /**
     * Get <p>Model name, for example, gpt-4o-mini</p> 
     * @return Model <p>Model name, for example, gpt-4o-mini</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>Model name, for example, gpt-4o-mini</p>
     * @param Model <p>Model name, for example, gpt-4o-mini</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>OpenAI-compatible endpoint.</p> 
     * @return APIUrl <p>OpenAI-compatible endpoint.</p>
     */
    public String getAPIUrl() {
        return this.APIUrl;
    }

    /**
     * Set <p>OpenAI-compatible endpoint.</p>
     * @param APIUrl <p>OpenAI-compatible endpoint.</p>
     */
    public void setAPIUrl(String APIUrl) {
        this.APIUrl = APIUrl;
    }

    /**
     * Get Provider API key. 
     * @return APIKey Provider API key.
     */
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * Set Provider API key.
     * @param APIKey Provider API key.
     */
    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    /**
     * Get <p>System prompt.</p> 
     * @return SystemPrompt <p>System prompt.</p>
     */
    public String getSystemPrompt() {
        return this.SystemPrompt;
    }

    /**
     * Set <p>System prompt.</p>
     * @param SystemPrompt <p>System prompt.</p>
     */
    public void setSystemPrompt(String SystemPrompt) {
        this.SystemPrompt = SystemPrompt;
    }

    /**
     * Get <p>Text used to generate TTS audio when the LLM call fails.</p> 
     * @return FailureMessage <p>Text used to generate TTS audio when the LLM call fails.</p>
     */
    public String getFailureMessage() {
        return this.FailureMessage;
    }

    /**
     * Set <p>Text used to generate TTS audio when the LLM call fails.</p>
     * @param FailureMessage <p>Text used to generate TTS audio when the LLM call fails.</p>
     */
    public void setFailureMessage(String FailureMessage) {
        this.FailureMessage = FailureMessage;
    }

    /**
     * Get <p>Maximum number of tokens in a single response. 0 means no limit. Default: 0. If the model outputs more tokens than MaxTokens, the response is truncated.</p> 
     * @return MaxTokens <p>Maximum number of tokens in a single response. 0 means no limit. Default: 0. If the model outputs more tokens than MaxTokens, the response is truncated.</p>
     */
    public Long getMaxTokens() {
        return this.MaxTokens;
    }

    /**
     * Set <p>Maximum number of tokens in a single response. 0 means no limit. Default: 0. If the model outputs more tokens than MaxTokens, the response is truncated.</p>
     * @param MaxTokens <p>Maximum number of tokens in a single response. 0 means no limit. Default: 0. If the model outputs more tokens than MaxTokens, the response is truncated.</p>
     */
    public void setMaxTokens(Long MaxTokens) {
        this.MaxTokens = MaxTokens;
    }

    /**
     * Get <p>Whether to enable thinking mode. Availability depends on the model provider. Enabling thinking mode consumes output tokens.</p> 
     * @return ThinkingMode <p>Whether to enable thinking mode. Availability depends on the model provider. Enabling thinking mode consumes output tokens.</p>
     */
    public Boolean getThinkingMode() {
        return this.ThinkingMode;
    }

    /**
     * Set <p>Whether to enable thinking mode. Availability depends on the model provider. Enabling thinking mode consumes output tokens.</p>
     * @param ThinkingMode <p>Whether to enable thinking mode. Availability depends on the model provider. Enabling thinking mode consumes output tokens.</p>
     */
    public void setThinkingMode(Boolean ThinkingMode) {
        this.ThinkingMode = ThinkingMode;
    }

    /**
     * Get <p>Number of conversation turns cached for the LLM. Valid range: 0 to 50. Recommended range: 10 to 30. The total number of tokens in this context must not exceed the LLM context limit.</p> 
     * @return MaxHistory <p>Number of conversation turns cached for the LLM. Valid range: 0 to 50. Recommended range: 10 to 30. The total number of tokens in this context must not exceed the LLM context limit.</p>
     */
    public Long getMaxHistory() {
        return this.MaxHistory;
    }

    /**
     * Set <p>Number of conversation turns cached for the LLM. Valid range: 0 to 50. Recommended range: 10 to 30. The total number of tokens in this context must not exceed the LLM context limit.</p>
     * @param MaxHistory <p>Number of conversation turns cached for the LLM. Valid range: 0 to 50. Recommended range: 10 to 30. The total number of tokens in this context must not exceed the LLM context limit.</p>
     */
    public void setMaxHistory(Long MaxHistory) {
        this.MaxHistory = MaxHistory;
    }

    /**
     * Get <p>Maximum rounds of MCP tool calls, ranging from 0 to 50. Default: 10.</p> 
     * @return MaxToolRound <p>Maximum rounds of MCP tool calls, ranging from 0 to 50. Default: 10.</p>
     */
    public Long getMaxToolRound() {
        return this.MaxToolRound;
    }

    /**
     * Set <p>Maximum rounds of MCP tool calls, ranging from 0 to 50. Default: 10.</p>
     * @param MaxToolRound <p>Maximum rounds of MCP tool calls, ranging from 0 to 50. Default: 10.</p>
     */
    public void setMaxToolRound(Long MaxToolRound) {
        this.MaxToolRound = MaxToolRound;
    }

    /**
     * Get Timeout for a single request, in milliseconds. Valid range: 1000 to 60000. Default: 10000. 
     * @return Timeout Timeout for a single request, in milliseconds. Valid range: 1000 to 60000. Default: 10000.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Timeout for a single request, in milliseconds. Valid range: 1000 to 60000. Default: 10000.
     * @param Timeout Timeout for a single request, in milliseconds. Valid range: 1000 to 60000. Default: 10000.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>Sampling temperature, ranging from 0.0 to 2.0. Default: 1.0.</p> 
     * @return Temperature <p>Sampling temperature, ranging from 0.0 to 2.0. Default: 1.0.</p>
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set <p>Sampling temperature, ranging from 0.0 to 2.0. Default: 1.0.</p>
     * @param Temperature <p>Sampling temperature, ranging from 0.0 to 2.0. Default: 1.0.</p>
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get <p>Top p nucleus sampling. Valid range: 0.0 to 1.0. Default: 1.0.</p> 
     * @return TopP <p>Top p nucleus sampling. Valid range: 0.0 to 1.0. Default: 1.0.</p>
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set <p>Top p nucleus sampling. Valid range: 0.0 to 1.0. Default: 1.0.</p>
     * @param TopP <p>Top p nucleus sampling. Valid range: 0.0 to 1.0. Default: 1.0.</p>
     */
    public void setTopP(Float TopP) {
        this.TopP = TopP;
    }

    /**
     * Get <p>MCP Server parameters.</p> 
     * @return McpServer <p>MCP Server parameters.</p>
     */
    public VoiceConversationMcpServer getMcpServer() {
        return this.McpServer;
    }

    /**
     * Set <p>MCP Server parameters.</p>
     * @param McpServer <p>MCP Server parameters.</p>
     */
    public void setMcpServer(VoiceConversationMcpServer McpServer) {
        this.McpServer = McpServer;
    }

    /**
     * Get <p>Custom HTTP request headers.</p> 
     * @return CustomHeaders <p>Custom HTTP request headers.</p>
     */
    public KeyValueItem [] getCustomHeaders() {
        return this.CustomHeaders;
    }

    /**
     * Set <p>Custom HTTP request headers.</p>
     * @param CustomHeaders <p>Custom HTTP request headers.</p>
     */
    public void setCustomHeaders(KeyValueItem [] CustomHeaders) {
        this.CustomHeaders = CustomHeaders;
    }

    /**
     * Get Provider-specific parameters, such as DeepSeek's reasoning_effort and Hunyuan's enable_enhancement. 
     * @return CustomFields Provider-specific parameters, such as DeepSeek's reasoning_effort and Hunyuan's enable_enhancement.
     */
    public KeyValueItem [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set Provider-specific parameters, such as DeepSeek's reasoning_effort and Hunyuan's enable_enhancement.
     * @param CustomFields Provider-specific parameters, such as DeepSeek's reasoning_effort and Hunyuan's enable_enhancement.
     */
    public void setCustomFields(KeyValueItem [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    /**
     * Get <p>Initial conversation history. Each item uses this format: `{"Role": "user"/"assistant"/"system", "Content": "xxx"}`.</p> 
     * @return HistoryMessages <p>Initial conversation history. Each item uses this format: `{"Role": "user"/"assistant"/"system", "Content": "xxx"}`.</p>
     */
    public VoiceConversationHistoryMessage [] getHistoryMessages() {
        return this.HistoryMessages;
    }

    /**
     * Set <p>Initial conversation history. Each item uses this format: `{"Role": "user"/"assistant"/"system", "Content": "xxx"}`.</p>
     * @param HistoryMessages <p>Initial conversation history. Each item uses this format: `{"Role": "user"/"assistant"/"system", "Content": "xxx"}`.</p>
     */
    public void setHistoryMessages(VoiceConversationHistoryMessage [] HistoryMessages) {
        this.HistoryMessages = HistoryMessages;
    }

    public VoiceConversationLLMConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConversationLLMConfig(VoiceConversationLLMConfig source) {
        if (source.LLMType != null) {
            this.LLMType = new String(source.LLMType);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.APIUrl != null) {
            this.APIUrl = new String(source.APIUrl);
        }
        if (source.APIKey != null) {
            this.APIKey = new String(source.APIKey);
        }
        if (source.SystemPrompt != null) {
            this.SystemPrompt = new String(source.SystemPrompt);
        }
        if (source.FailureMessage != null) {
            this.FailureMessage = new String(source.FailureMessage);
        }
        if (source.MaxTokens != null) {
            this.MaxTokens = new Long(source.MaxTokens);
        }
        if (source.ThinkingMode != null) {
            this.ThinkingMode = new Boolean(source.ThinkingMode);
        }
        if (source.MaxHistory != null) {
            this.MaxHistory = new Long(source.MaxHistory);
        }
        if (source.MaxToolRound != null) {
            this.MaxToolRound = new Long(source.MaxToolRound);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.TopP != null) {
            this.TopP = new Float(source.TopP);
        }
        if (source.McpServer != null) {
            this.McpServer = new VoiceConversationMcpServer(source.McpServer);
        }
        if (source.CustomHeaders != null) {
            this.CustomHeaders = new KeyValueItem[source.CustomHeaders.length];
            for (int i = 0; i < source.CustomHeaders.length; i++) {
                this.CustomHeaders[i] = new KeyValueItem(source.CustomHeaders[i]);
            }
        }
        if (source.CustomFields != null) {
            this.CustomFields = new KeyValueItem[source.CustomFields.length];
            for (int i = 0; i < source.CustomFields.length; i++) {
                this.CustomFields[i] = new KeyValueItem(source.CustomFields[i]);
            }
        }
        if (source.HistoryMessages != null) {
            this.HistoryMessages = new VoiceConversationHistoryMessage[source.HistoryMessages.length];
            for (int i = 0; i < source.HistoryMessages.length; i++) {
                this.HistoryMessages[i] = new VoiceConversationHistoryMessage(source.HistoryMessages[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LLMType", this.LLMType);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "APIUrl", this.APIUrl);
        this.setParamSimple(map, prefix + "APIKey", this.APIKey);
        this.setParamSimple(map, prefix + "SystemPrompt", this.SystemPrompt);
        this.setParamSimple(map, prefix + "FailureMessage", this.FailureMessage);
        this.setParamSimple(map, prefix + "MaxTokens", this.MaxTokens);
        this.setParamSimple(map, prefix + "ThinkingMode", this.ThinkingMode);
        this.setParamSimple(map, prefix + "MaxHistory", this.MaxHistory);
        this.setParamSimple(map, prefix + "MaxToolRound", this.MaxToolRound);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "TopP", this.TopP);
        this.setParamObj(map, prefix + "McpServer.", this.McpServer);
        this.setParamArrayObj(map, prefix + "CustomHeaders.", this.CustomHeaders);
        this.setParamArrayObj(map, prefix + "CustomFields.", this.CustomFields);
        this.setParamArrayObj(map, prefix + "HistoryMessages.", this.HistoryMessages);

    }
}

