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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatCompletionsRequest extends AbstractModel {

    /**
    * Model name.
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * Chat contextual information.
Description:
1. Length: up to 40. Arranged in array from old to new by conversation time.
2. Message.Role: system, user, assistant. Optional.
Among them, the system role is optional. If it exists, it must be at the beginning of the list. User and assistant need to alternate, starting with a user question and ending with a user question. Content cannot be empty. An example of the order of roles: [system (optional) user assistant user assistant user...].

    */
    @SerializedName("Messages")
    @Expose
    private Message [] Messages;

    /**
    * Whether it is streaming output.
    */
    @SerializedName("Stream")
    @Expose
    private Boolean Stream;

    /**
    * Controls the randomness of the generated content. a relatively high value generates more diversified output.
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * Maximum number of generated tokens.
    */
    @SerializedName("MaxTokens")
    @Expose
    private Long MaxTokens;

    /**
    * 
    */
    @SerializedName("EnableSearch")
    @Expose
    private Boolean EnableSearch;

    /**
     * Get Model name. 
     * @return Model Model name.
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set Model name.
     * @param Model Model name.
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get Chat contextual information.
Description:
1. Length: up to 40. Arranged in array from old to new by conversation time.
2. Message.Role: system, user, assistant. Optional.
Among them, the system role is optional. If it exists, it must be at the beginning of the list. User and assistant need to alternate, starting with a user question and ending with a user question. Content cannot be empty. An example of the order of roles: [system (optional) user assistant user assistant user...].
 
     * @return Messages Chat contextual information.
Description:
1. Length: up to 40. Arranged in array from old to new by conversation time.
2. Message.Role: system, user, assistant. Optional.
Among them, the system role is optional. If it exists, it must be at the beginning of the list. User and assistant need to alternate, starting with a user question and ending with a user question. Content cannot be empty. An example of the order of roles: [system (optional) user assistant user assistant user...].

     */
    public Message [] getMessages() {
        return this.Messages;
    }

    /**
     * Set Chat contextual information.
Description:
1. Length: up to 40. Arranged in array from old to new by conversation time.
2. Message.Role: system, user, assistant. Optional.
Among them, the system role is optional. If it exists, it must be at the beginning of the list. User and assistant need to alternate, starting with a user question and ending with a user question. Content cannot be empty. An example of the order of roles: [system (optional) user assistant user assistant user...].

     * @param Messages Chat contextual information.
Description:
1. Length: up to 40. Arranged in array from old to new by conversation time.
2. Message.Role: system, user, assistant. Optional.
Among them, the system role is optional. If it exists, it must be at the beginning of the list. User and assistant need to alternate, starting with a user question and ending with a user question. Content cannot be empty. An example of the order of roles: [system (optional) user assistant user assistant user...].

     */
    public void setMessages(Message [] Messages) {
        this.Messages = Messages;
    }

    /**
     * Get Whether it is streaming output. 
     * @return Stream Whether it is streaming output.
     */
    public Boolean getStream() {
        return this.Stream;
    }

    /**
     * Set Whether it is streaming output.
     * @param Stream Whether it is streaming output.
     */
    public void setStream(Boolean Stream) {
        this.Stream = Stream;
    }

    /**
     * Get Controls the randomness of the generated content. a relatively high value generates more diversified output. 
     * @return Temperature Controls the randomness of the generated content. a relatively high value generates more diversified output.
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set Controls the randomness of the generated content. a relatively high value generates more diversified output.
     * @param Temperature Controls the randomness of the generated content. a relatively high value generates more diversified output.
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get Maximum number of generated tokens. 
     * @return MaxTokens Maximum number of generated tokens.
     */
    public Long getMaxTokens() {
        return this.MaxTokens;
    }

    /**
     * Set Maximum number of generated tokens.
     * @param MaxTokens Maximum number of generated tokens.
     */
    public void setMaxTokens(Long MaxTokens) {
        this.MaxTokens = MaxTokens;
    }

    /**
     * Get  
     * @return EnableSearch 
     */
    public Boolean getEnableSearch() {
        return this.EnableSearch;
    }

    /**
     * Set 
     * @param EnableSearch 
     */
    public void setEnableSearch(Boolean EnableSearch) {
        this.EnableSearch = EnableSearch;
    }

    public ChatCompletionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatCompletionsRequest(ChatCompletionsRequest source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Messages != null) {
            this.Messages = new Message[source.Messages.length];
            for (int i = 0; i < source.Messages.length; i++) {
                this.Messages[i] = new Message(source.Messages[i]);
            }
        }
        if (source.Stream != null) {
            this.Stream = new Boolean(source.Stream);
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.MaxTokens != null) {
            this.MaxTokens = new Long(source.MaxTokens);
        }
        if (source.EnableSearch != null) {
            this.EnableSearch = new Boolean(source.EnableSearch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArrayObj(map, prefix + "Messages.", this.Messages);
        this.setParamSimple(map, prefix + "Stream", this.Stream);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "MaxTokens", this.MaxTokens);
        this.setParamSimple(map, prefix + "EnableSearch", this.EnableSearch);

    }
}

