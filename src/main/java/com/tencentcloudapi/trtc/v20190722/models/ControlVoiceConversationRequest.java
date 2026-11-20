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

public class ControlVoiceConversationRequest extends AbstractModel {

    /**
    * The TRTC [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid). It must be the same SdkAppId as the conversation room.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Unique ID of the conversation task. Returned when the conversation task starts successfully.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Control command.
Valid values:

- `Interrupt`: Force-interrupt the AI bot's current speech.
- `invokellm`: Inject text into the current conversation context to trigger one LLM response. Not supported in `S2S` mode.
- `invoketts`: Inject text into the current TTS so the AI bot broadcasts it. Not supported in `S2S` mode.
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * Configuration for injecting text into the LLM. Required when `Command` is `invokellm`.
    */
    @SerializedName("InvokeLLM")
    @Expose
    private VoiceConversationInvokeLLM InvokeLLM;

    /**
    * Configuration for injecting text into TTS. Required when `Command` is `invoketts`.
    */
    @SerializedName("InvokeTTS")
    @Expose
    private VoiceConversationInvokeTTS InvokeTTS;

    /**
     * Get The TRTC [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid). It must be the same SdkAppId as the conversation room. 
     * @return SdkAppId The TRTC [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid). It must be the same SdkAppId as the conversation room.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The TRTC [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid). It must be the same SdkAppId as the conversation room.
     * @param SdkAppId The TRTC [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid). It must be the same SdkAppId as the conversation room.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Unique ID of the conversation task. Returned when the conversation task starts successfully. 
     * @return TaskId Unique ID of the conversation task. Returned when the conversation task starts successfully.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Unique ID of the conversation task. Returned when the conversation task starts successfully.
     * @param TaskId Unique ID of the conversation task. Returned when the conversation task starts successfully.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Control command.
Valid values:

- `Interrupt`: Force-interrupt the AI bot's current speech.
- `invokellm`: Inject text into the current conversation context to trigger one LLM response. Not supported in `S2S` mode.
- `invoketts`: Inject text into the current TTS so the AI bot broadcasts it. Not supported in `S2S` mode. 
     * @return Command Control command.
Valid values:

- `Interrupt`: Force-interrupt the AI bot's current speech.
- `invokellm`: Inject text into the current conversation context to trigger one LLM response. Not supported in `S2S` mode.
- `invoketts`: Inject text into the current TTS so the AI bot broadcasts it. Not supported in `S2S` mode.
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set Control command.
Valid values:

- `Interrupt`: Force-interrupt the AI bot's current speech.
- `invokellm`: Inject text into the current conversation context to trigger one LLM response. Not supported in `S2S` mode.
- `invoketts`: Inject text into the current TTS so the AI bot broadcasts it. Not supported in `S2S` mode.
     * @param Command Control command.
Valid values:

- `Interrupt`: Force-interrupt the AI bot's current speech.
- `invokellm`: Inject text into the current conversation context to trigger one LLM response. Not supported in `S2S` mode.
- `invoketts`: Inject text into the current TTS so the AI bot broadcasts it. Not supported in `S2S` mode.
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get Configuration for injecting text into the LLM. Required when `Command` is `invokellm`. 
     * @return InvokeLLM Configuration for injecting text into the LLM. Required when `Command` is `invokellm`.
     */
    public VoiceConversationInvokeLLM getInvokeLLM() {
        return this.InvokeLLM;
    }

    /**
     * Set Configuration for injecting text into the LLM. Required when `Command` is `invokellm`.
     * @param InvokeLLM Configuration for injecting text into the LLM. Required when `Command` is `invokellm`.
     */
    public void setInvokeLLM(VoiceConversationInvokeLLM InvokeLLM) {
        this.InvokeLLM = InvokeLLM;
    }

    /**
     * Get Configuration for injecting text into TTS. Required when `Command` is `invoketts`. 
     * @return InvokeTTS Configuration for injecting text into TTS. Required when `Command` is `invoketts`.
     */
    public VoiceConversationInvokeTTS getInvokeTTS() {
        return this.InvokeTTS;
    }

    /**
     * Set Configuration for injecting text into TTS. Required when `Command` is `invoketts`.
     * @param InvokeTTS Configuration for injecting text into TTS. Required when `Command` is `invoketts`.
     */
    public void setInvokeTTS(VoiceConversationInvokeTTS InvokeTTS) {
        this.InvokeTTS = InvokeTTS;
    }

    public ControlVoiceConversationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlVoiceConversationRequest(ControlVoiceConversationRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.InvokeLLM != null) {
            this.InvokeLLM = new VoiceConversationInvokeLLM(source.InvokeLLM);
        }
        if (source.InvokeTTS != null) {
            this.InvokeTTS = new VoiceConversationInvokeTTS(source.InvokeTTS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamObj(map, prefix + "InvokeLLM.", this.InvokeLLM);
        this.setParamObj(map, prefix + "InvokeTTS.", this.InvokeTTS);

    }
}

