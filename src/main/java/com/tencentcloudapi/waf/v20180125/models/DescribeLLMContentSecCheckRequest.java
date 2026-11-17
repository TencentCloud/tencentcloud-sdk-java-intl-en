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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLLMContentSecCheckRequest extends AbstractModel {

    /**
    * <p>Service id. Pass the service id corresponding to the protection policy to use. The model will detect all rules under this service id.</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>Traffic type, indicating inbound or outbound traffic. 1: inbound, 2: outbound. Both inbound and outbound are required.</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Instance id. Required.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Content to review</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>id of the question-answer conversation</p>
    */
    @SerializedName("ChatId")
    @Expose
    private String ChatId;

    /**
    * <p>id that identifies the user, used for rate limiting. If not specified, rate limiting will not take effect.</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>token usage. If not specified, the default token calculation method will be used to calculate model consumption, because this value is added in the outbound direction, that is, Type=2.</p>
    */
    @SerializedName("TokenUsage")
    @Expose
    private Long TokenUsage;

    /**
    * <p>Base64-encoded image data. The maximum body size is 10 MB.</p>
    */
    @SerializedName("ImageEncode")
    @Expose
    private String ImageEncode;

    /**
    * <p>Tool name in the tool_call scenario</p>
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
    * <p>Tool parameters in the tool_call scenario</p>
    */
    @SerializedName("ToolArgs")
    @Expose
    private String ToolArgs;

    /**
    * <p>id of the multi-turn conversation</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Request content for intent detection</p>
    */
    @SerializedName("IntentContent")
    @Expose
    private IntentContent IntentContent;

    /**
    * <p>Client source IP address, used for allowlist matching and other scenarios. Supports IPv4 and IPv6 formats.</p>
    */
    @SerializedName("ClientIP")
    @Expose
    private String ClientIP;

    /**
    * Multi-turn historical user input, arranged from oldest to newest, used only for prompt injection detection
Input parameter limits: Up to 10 entries. If exceeded, only the latest 10 entries are retained. The combined length of History + Content cannot exceed 6K characters. If exceeded, the earliest History entries are discarded first.
    */
    @SerializedName("History")
    @Expose
    private String [] History;

    /**
    * List of URLs to be detected, used for malicious URL detection
Input parameter limits: Up to 50 URLs. A single URL cannot exceed 2048 characters. If exceeded, it will be truncated.
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
     * Get <p>Service id. Pass the service id corresponding to the protection policy to use. The model will detect all rules under this service id.</p> 
     * @return ServiceId <p>Service id. Pass the service id corresponding to the protection policy to use. The model will detect all rules under this service id.</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>Service id. Pass the service id corresponding to the protection policy to use. The model will detect all rules under this service id.</p>
     * @param ServiceId <p>Service id. Pass the service id corresponding to the protection policy to use. The model will detect all rules under this service id.</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>Traffic type, indicating inbound or outbound traffic. 1: inbound, 2: outbound. Both inbound and outbound are required.</p> 
     * @return Type <p>Traffic type, indicating inbound or outbound traffic. 1: inbound, 2: outbound. Both inbound and outbound are required.</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Traffic type, indicating inbound or outbound traffic. 1: inbound, 2: outbound. Both inbound and outbound are required.</p>
     * @param Type <p>Traffic type, indicating inbound or outbound traffic. 1: inbound, 2: outbound. Both inbound and outbound are required.</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Instance id. Required.</p> 
     * @return InstanceId <p>Instance id. Required.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance id. Required.</p>
     * @param InstanceId <p>Instance id. Required.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Content to review</p> 
     * @return Content <p>Content to review</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>Content to review</p>
     * @param Content <p>Content to review</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>id of the question-answer conversation</p> 
     * @return ChatId <p>id of the question-answer conversation</p>
     */
    public String getChatId() {
        return this.ChatId;
    }

    /**
     * Set <p>id of the question-answer conversation</p>
     * @param ChatId <p>id of the question-answer conversation</p>
     */
    public void setChatId(String ChatId) {
        this.ChatId = ChatId;
    }

    /**
     * Get <p>id that identifies the user, used for rate limiting. If not specified, rate limiting will not take effect.</p> 
     * @return UserId <p>id that identifies the user, used for rate limiting. If not specified, rate limiting will not take effect.</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>id that identifies the user, used for rate limiting. If not specified, rate limiting will not take effect.</p>
     * @param UserId <p>id that identifies the user, used for rate limiting. If not specified, rate limiting will not take effect.</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>token usage. If not specified, the default token calculation method will be used to calculate model consumption, because this value is added in the outbound direction, that is, Type=2.</p> 
     * @return TokenUsage <p>token usage. If not specified, the default token calculation method will be used to calculate model consumption, because this value is added in the outbound direction, that is, Type=2.</p>
     */
    public Long getTokenUsage() {
        return this.TokenUsage;
    }

    /**
     * Set <p>token usage. If not specified, the default token calculation method will be used to calculate model consumption, because this value is added in the outbound direction, that is, Type=2.</p>
     * @param TokenUsage <p>token usage. If not specified, the default token calculation method will be used to calculate model consumption, because this value is added in the outbound direction, that is, Type=2.</p>
     */
    public void setTokenUsage(Long TokenUsage) {
        this.TokenUsage = TokenUsage;
    }

    /**
     * Get <p>Base64-encoded image data. The maximum body size is 10 MB.</p> 
     * @return ImageEncode <p>Base64-encoded image data. The maximum body size is 10 MB.</p>
     */
    public String getImageEncode() {
        return this.ImageEncode;
    }

    /**
     * Set <p>Base64-encoded image data. The maximum body size is 10 MB.</p>
     * @param ImageEncode <p>Base64-encoded image data. The maximum body size is 10 MB.</p>
     */
    public void setImageEncode(String ImageEncode) {
        this.ImageEncode = ImageEncode;
    }

    /**
     * Get <p>Tool name in the tool_call scenario</p> 
     * @return ToolName <p>Tool name in the tool_call scenario</p>
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set <p>Tool name in the tool_call scenario</p>
     * @param ToolName <p>Tool name in the tool_call scenario</p>
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    /**
     * Get <p>Tool parameters in the tool_call scenario</p> 
     * @return ToolArgs <p>Tool parameters in the tool_call scenario</p>
     */
    public String getToolArgs() {
        return this.ToolArgs;
    }

    /**
     * Set <p>Tool parameters in the tool_call scenario</p>
     * @param ToolArgs <p>Tool parameters in the tool_call scenario</p>
     */
    public void setToolArgs(String ToolArgs) {
        this.ToolArgs = ToolArgs;
    }

    /**
     * Get <p>id of the multi-turn conversation</p> 
     * @return SessionId <p>id of the multi-turn conversation</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>id of the multi-turn conversation</p>
     * @param SessionId <p>id of the multi-turn conversation</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Request content for intent detection</p> 
     * @return IntentContent <p>Request content for intent detection</p>
     */
    public IntentContent getIntentContent() {
        return this.IntentContent;
    }

    /**
     * Set <p>Request content for intent detection</p>
     * @param IntentContent <p>Request content for intent detection</p>
     */
    public void setIntentContent(IntentContent IntentContent) {
        this.IntentContent = IntentContent;
    }

    /**
     * Get <p>Client source IP address, used for allowlist matching and other scenarios. Supports IPv4 and IPv6 formats.</p> 
     * @return ClientIP <p>Client source IP address, used for allowlist matching and other scenarios. Supports IPv4 and IPv6 formats.</p>
     */
    public String getClientIP() {
        return this.ClientIP;
    }

    /**
     * Set <p>Client source IP address, used for allowlist matching and other scenarios. Supports IPv4 and IPv6 formats.</p>
     * @param ClientIP <p>Client source IP address, used for allowlist matching and other scenarios. Supports IPv4 and IPv6 formats.</p>
     */
    public void setClientIP(String ClientIP) {
        this.ClientIP = ClientIP;
    }

    /**
     * Get Multi-turn historical user input, arranged from oldest to newest, used only for prompt injection detection
Input parameter limits: Up to 10 entries. If exceeded, only the latest 10 entries are retained. The combined length of History + Content cannot exceed 6K characters. If exceeded, the earliest History entries are discarded first. 
     * @return History Multi-turn historical user input, arranged from oldest to newest, used only for prompt injection detection
Input parameter limits: Up to 10 entries. If exceeded, only the latest 10 entries are retained. The combined length of History + Content cannot exceed 6K characters. If exceeded, the earliest History entries are discarded first.
     */
    public String [] getHistory() {
        return this.History;
    }

    /**
     * Set Multi-turn historical user input, arranged from oldest to newest, used only for prompt injection detection
Input parameter limits: Up to 10 entries. If exceeded, only the latest 10 entries are retained. The combined length of History + Content cannot exceed 6K characters. If exceeded, the earliest History entries are discarded first.
     * @param History Multi-turn historical user input, arranged from oldest to newest, used only for prompt injection detection
Input parameter limits: Up to 10 entries. If exceeded, only the latest 10 entries are retained. The combined length of History + Content cannot exceed 6K characters. If exceeded, the earliest History entries are discarded first.
     */
    public void setHistory(String [] History) {
        this.History = History;
    }

    /**
     * Get List of URLs to be detected, used for malicious URL detection
Input parameter limits: Up to 50 URLs. A single URL cannot exceed 2048 characters. If exceeded, it will be truncated. 
     * @return Urls List of URLs to be detected, used for malicious URL detection
Input parameter limits: Up to 50 URLs. A single URL cannot exceed 2048 characters. If exceeded, it will be truncated.
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set List of URLs to be detected, used for malicious URL detection
Input parameter limits: Up to 50 URLs. A single URL cannot exceed 2048 characters. If exceeded, it will be truncated.
     * @param Urls List of URLs to be detected, used for malicious URL detection
Input parameter limits: Up to 50 URLs. A single URL cannot exceed 2048 characters. If exceeded, it will be truncated.
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    public DescribeLLMContentSecCheckRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLLMContentSecCheckRequest(DescribeLLMContentSecCheckRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ChatId != null) {
            this.ChatId = new String(source.ChatId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.TokenUsage != null) {
            this.TokenUsage = new Long(source.TokenUsage);
        }
        if (source.ImageEncode != null) {
            this.ImageEncode = new String(source.ImageEncode);
        }
        if (source.ToolName != null) {
            this.ToolName = new String(source.ToolName);
        }
        if (source.ToolArgs != null) {
            this.ToolArgs = new String(source.ToolArgs);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.IntentContent != null) {
            this.IntentContent = new IntentContent(source.IntentContent);
        }
        if (source.ClientIP != null) {
            this.ClientIP = new String(source.ClientIP);
        }
        if (source.History != null) {
            this.History = new String[source.History.length];
            for (int i = 0; i < source.History.length; i++) {
                this.History[i] = new String(source.History[i]);
            }
        }
        if (source.Urls != null) {
            this.Urls = new String[source.Urls.length];
            for (int i = 0; i < source.Urls.length; i++) {
                this.Urls[i] = new String(source.Urls[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ChatId", this.ChatId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "TokenUsage", this.TokenUsage);
        this.setParamSimple(map, prefix + "ImageEncode", this.ImageEncode);
        this.setParamSimple(map, prefix + "ToolName", this.ToolName);
        this.setParamSimple(map, prefix + "ToolArgs", this.ToolArgs);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamObj(map, prefix + "IntentContent.", this.IntentContent);
        this.setParamSimple(map, prefix + "ClientIP", this.ClientIP);
        this.setParamArraySimple(map, prefix + "History.", this.History);
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);

    }
}

