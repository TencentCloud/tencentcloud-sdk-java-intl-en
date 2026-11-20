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

public class CreateVoiceConversationRequest extends AbstractModel {

    /**
    * The TRTC [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid). It must be the same SdkAppId as the conversation room.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * [Room ID](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#roomid) of the TRTC room where the conversation runs. Room IDs are numeric by default. If the room ID is a string, set RoomIdType to 1.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * Room ID type. It must match the room ID type of the conversation room. 0 is a numeric room ID, and 1 is a string room ID.
Valid values:
- 0: numeric room ID (Default)
- 1: string room ID
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * <p>Chatbot configuration.</p>
    */
    @SerializedName("AgentConfig")
    @Expose
    private VoiceConversationConfig AgentConfig;

    /**
    * Conversation pipeline mode: `Cascade` (default, three-stage pipeline) or `S2S` (end-to-end speech-to-speech model).
Valid values:
- Cascade: three-stage pipeline (default). Speech recognition, a large language model, and text-to-speech.
- S2S: end-to-end speech-to-speech model.
Default: Cascade
    */
    @SerializedName("ConversationMode")
    @Expose
    private String ConversationMode;

    /**
    * End-to-end speech-to-speech model configuration. Required only in `S2S` mode. Ignored in `Cascade` mode.
    */
    @SerializedName("S2SConfig")
    @Expose
    private VoiceConversationS2SConfig S2SConfig;

    /**
    * <p>Speech recognition configuration. <strong>Required only in <code>Cascade</code> mode</strong>; ignored in <code>S2S</code> mode.</p>
    */
    @SerializedName("STTConfig")
    @Expose
    private VoiceConversationSTTConfig STTConfig;

    /**
    * Large language model (LLM) configuration. Required only in `Cascade` mode. Ignored in `S2S` mode.
    */
    @SerializedName("LLMConfig")
    @Expose
    private VoiceConversationLLMConfig LLMConfig;

    /**
    * <p>Text to speech configuration. <strong>Required only in <code>Cascade</code> mode</strong>; ignored in <code>S2S</code> mode.</p>
    */
    @SerializedName("TTSConfig")
    @Expose
    private VoiceConversationTTSConfig TTSConfig;

    /**
    * Conversation control configuration. Not supported in `S2S` mode.
    */
    @SerializedName("DialogConfig")
    @Expose
    private VoiceConversationDialogConfig DialogConfig;

    /**
    * Visual understanding configuration. Not supported in `S2S` mode.
    */
    @SerializedName("VisionConfig")
    @Expose
    private VoiceConversationVisionConfig VisionConfig;

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
     * Get [Room ID](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#roomid) of the TRTC room where the conversation runs. Room IDs are numeric by default. If the room ID is a string, set RoomIdType to 1. 
     * @return RoomId [Room ID](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#roomid) of the TRTC room where the conversation runs. Room IDs are numeric by default. If the room ID is a string, set RoomIdType to 1.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set [Room ID](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#roomid) of the TRTC room where the conversation runs. Room IDs are numeric by default. If the room ID is a string, set RoomIdType to 1.
     * @param RoomId [Room ID](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#roomid) of the TRTC room where the conversation runs. Room IDs are numeric by default. If the room ID is a string, set RoomIdType to 1.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Room ID type. It must match the room ID type of the conversation room. 0 is a numeric room ID, and 1 is a string room ID.
Valid values:
- 0: numeric room ID (Default)
- 1: string room ID 
     * @return RoomIdType Room ID type. It must match the room ID type of the conversation room. 0 is a numeric room ID, and 1 is a string room ID.
Valid values:
- 0: numeric room ID (Default)
- 1: string room ID
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set Room ID type. It must match the room ID type of the conversation room. 0 is a numeric room ID, and 1 is a string room ID.
Valid values:
- 0: numeric room ID (Default)
- 1: string room ID
     * @param RoomIdType Room ID type. It must match the room ID type of the conversation room. 0 is a numeric room ID, and 1 is a string room ID.
Valid values:
- 0: numeric room ID (Default)
- 1: string room ID
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get <p>Chatbot configuration.</p> 
     * @return AgentConfig <p>Chatbot configuration.</p>
     */
    public VoiceConversationConfig getAgentConfig() {
        return this.AgentConfig;
    }

    /**
     * Set <p>Chatbot configuration.</p>
     * @param AgentConfig <p>Chatbot configuration.</p>
     */
    public void setAgentConfig(VoiceConversationConfig AgentConfig) {
        this.AgentConfig = AgentConfig;
    }

    /**
     * Get Conversation pipeline mode: `Cascade` (default, three-stage pipeline) or `S2S` (end-to-end speech-to-speech model).
Valid values:
- Cascade: three-stage pipeline (default). Speech recognition, a large language model, and text-to-speech.
- S2S: end-to-end speech-to-speech model.
Default: Cascade 
     * @return ConversationMode Conversation pipeline mode: `Cascade` (default, three-stage pipeline) or `S2S` (end-to-end speech-to-speech model).
Valid values:
- Cascade: three-stage pipeline (default). Speech recognition, a large language model, and text-to-speech.
- S2S: end-to-end speech-to-speech model.
Default: Cascade
     */
    public String getConversationMode() {
        return this.ConversationMode;
    }

    /**
     * Set Conversation pipeline mode: `Cascade` (default, three-stage pipeline) or `S2S` (end-to-end speech-to-speech model).
Valid values:
- Cascade: three-stage pipeline (default). Speech recognition, a large language model, and text-to-speech.
- S2S: end-to-end speech-to-speech model.
Default: Cascade
     * @param ConversationMode Conversation pipeline mode: `Cascade` (default, three-stage pipeline) or `S2S` (end-to-end speech-to-speech model).
Valid values:
- Cascade: three-stage pipeline (default). Speech recognition, a large language model, and text-to-speech.
- S2S: end-to-end speech-to-speech model.
Default: Cascade
     */
    public void setConversationMode(String ConversationMode) {
        this.ConversationMode = ConversationMode;
    }

    /**
     * Get End-to-end speech-to-speech model configuration. Required only in `S2S` mode. Ignored in `Cascade` mode. 
     * @return S2SConfig End-to-end speech-to-speech model configuration. Required only in `S2S` mode. Ignored in `Cascade` mode.
     */
    public VoiceConversationS2SConfig getS2SConfig() {
        return this.S2SConfig;
    }

    /**
     * Set End-to-end speech-to-speech model configuration. Required only in `S2S` mode. Ignored in `Cascade` mode.
     * @param S2SConfig End-to-end speech-to-speech model configuration. Required only in `S2S` mode. Ignored in `Cascade` mode.
     */
    public void setS2SConfig(VoiceConversationS2SConfig S2SConfig) {
        this.S2SConfig = S2SConfig;
    }

    /**
     * Get <p>Speech recognition configuration. <strong>Required only in <code>Cascade</code> mode</strong>; ignored in <code>S2S</code> mode.</p> 
     * @return STTConfig <p>Speech recognition configuration. <strong>Required only in <code>Cascade</code> mode</strong>; ignored in <code>S2S</code> mode.</p>
     */
    public VoiceConversationSTTConfig getSTTConfig() {
        return this.STTConfig;
    }

    /**
     * Set <p>Speech recognition configuration. <strong>Required only in <code>Cascade</code> mode</strong>; ignored in <code>S2S</code> mode.</p>
     * @param STTConfig <p>Speech recognition configuration. <strong>Required only in <code>Cascade</code> mode</strong>; ignored in <code>S2S</code> mode.</p>
     */
    public void setSTTConfig(VoiceConversationSTTConfig STTConfig) {
        this.STTConfig = STTConfig;
    }

    /**
     * Get Large language model (LLM) configuration. Required only in `Cascade` mode. Ignored in `S2S` mode. 
     * @return LLMConfig Large language model (LLM) configuration. Required only in `Cascade` mode. Ignored in `S2S` mode.
     */
    public VoiceConversationLLMConfig getLLMConfig() {
        return this.LLMConfig;
    }

    /**
     * Set Large language model (LLM) configuration. Required only in `Cascade` mode. Ignored in `S2S` mode.
     * @param LLMConfig Large language model (LLM) configuration. Required only in `Cascade` mode. Ignored in `S2S` mode.
     */
    public void setLLMConfig(VoiceConversationLLMConfig LLMConfig) {
        this.LLMConfig = LLMConfig;
    }

    /**
     * Get <p>Text to speech configuration. <strong>Required only in <code>Cascade</code> mode</strong>; ignored in <code>S2S</code> mode.</p> 
     * @return TTSConfig <p>Text to speech configuration. <strong>Required only in <code>Cascade</code> mode</strong>; ignored in <code>S2S</code> mode.</p>
     */
    public VoiceConversationTTSConfig getTTSConfig() {
        return this.TTSConfig;
    }

    /**
     * Set <p>Text to speech configuration. <strong>Required only in <code>Cascade</code> mode</strong>; ignored in <code>S2S</code> mode.</p>
     * @param TTSConfig <p>Text to speech configuration. <strong>Required only in <code>Cascade</code> mode</strong>; ignored in <code>S2S</code> mode.</p>
     */
    public void setTTSConfig(VoiceConversationTTSConfig TTSConfig) {
        this.TTSConfig = TTSConfig;
    }

    /**
     * Get Conversation control configuration. Not supported in `S2S` mode. 
     * @return DialogConfig Conversation control configuration. Not supported in `S2S` mode.
     */
    public VoiceConversationDialogConfig getDialogConfig() {
        return this.DialogConfig;
    }

    /**
     * Set Conversation control configuration. Not supported in `S2S` mode.
     * @param DialogConfig Conversation control configuration. Not supported in `S2S` mode.
     */
    public void setDialogConfig(VoiceConversationDialogConfig DialogConfig) {
        this.DialogConfig = DialogConfig;
    }

    /**
     * Get Visual understanding configuration. Not supported in `S2S` mode. 
     * @return VisionConfig Visual understanding configuration. Not supported in `S2S` mode.
     */
    public VoiceConversationVisionConfig getVisionConfig() {
        return this.VisionConfig;
    }

    /**
     * Set Visual understanding configuration. Not supported in `S2S` mode.
     * @param VisionConfig Visual understanding configuration. Not supported in `S2S` mode.
     */
    public void setVisionConfig(VoiceConversationVisionConfig VisionConfig) {
        this.VisionConfig = VisionConfig;
    }

    public CreateVoiceConversationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVoiceConversationRequest(CreateVoiceConversationRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.RoomIdType != null) {
            this.RoomIdType = new Long(source.RoomIdType);
        }
        if (source.AgentConfig != null) {
            this.AgentConfig = new VoiceConversationConfig(source.AgentConfig);
        }
        if (source.ConversationMode != null) {
            this.ConversationMode = new String(source.ConversationMode);
        }
        if (source.S2SConfig != null) {
            this.S2SConfig = new VoiceConversationS2SConfig(source.S2SConfig);
        }
        if (source.STTConfig != null) {
            this.STTConfig = new VoiceConversationSTTConfig(source.STTConfig);
        }
        if (source.LLMConfig != null) {
            this.LLMConfig = new VoiceConversationLLMConfig(source.LLMConfig);
        }
        if (source.TTSConfig != null) {
            this.TTSConfig = new VoiceConversationTTSConfig(source.TTSConfig);
        }
        if (source.DialogConfig != null) {
            this.DialogConfig = new VoiceConversationDialogConfig(source.DialogConfig);
        }
        if (source.VisionConfig != null) {
            this.VisionConfig = new VoiceConversationVisionConfig(source.VisionConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);
        this.setParamObj(map, prefix + "AgentConfig.", this.AgentConfig);
        this.setParamSimple(map, prefix + "ConversationMode", this.ConversationMode);
        this.setParamObj(map, prefix + "S2SConfig.", this.S2SConfig);
        this.setParamObj(map, prefix + "STTConfig.", this.STTConfig);
        this.setParamObj(map, prefix + "LLMConfig.", this.LLMConfig);
        this.setParamObj(map, prefix + "TTSConfig.", this.TTSConfig);
        this.setParamObj(map, prefix + "DialogConfig.", this.DialogConfig);
        this.setParamObj(map, prefix + "VisionConfig.", this.VisionConfig);

    }
}

