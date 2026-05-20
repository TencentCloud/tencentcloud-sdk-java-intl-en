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

public class StartAIConversationRequest extends AbstractModel {

    /**
    * [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#SdkAppId) of TRTC, which is the same as the SdkAppId used by the room with transcription task enabled.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * [RoomId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#RoomId) of TRTC refers to the room number that enables the conversation task.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * Bot parameters.
    */
    @SerializedName("AgentConfig")
    @Expose
    private AgentConfig AgentConfig;

    /**
    * The unique Id passed by the caller can be used to prevent duplication of task initiation on the client side as well as query task status through this field.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Type of the TRTC room number. 0 indicates digit room number, 1 indicates string room number. by default if left blank, it is digit room number.
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * Speech recognition configuration.
    */
    @SerializedName("STTConfig")
    @Expose
    private STTConfig STTConfig;

    /**
    * Required parameter, LLM configuration. it must comply with the openai standard and be a JSON String. example: <pre> { <br> &emsp;  "LLMType": "Model type",  // String required, for example: "openai" <br> &emsp;  "Model": "your Model name", // String required, specifies the Model to be used<br>    "APIKey": "your LLM API key", // String required <br> &emsp;  "APIUrl": "https://API.xxx.com/chat/completions", // String required, the URL for LLM API access<br> &emsp;  "History": 10, // Integer optional, sets the context rounds for LLM, default value is 0, maximum value is 50<br> &emsp;  "HistoryMode": 1, // Integer optional, 1 means the content in the LLM context will synchronize with playback audio, and text corresponding to unplayed audio will not appear in the context. 0 means no synchronization, default value is 0<br> &emsp;  "Streaming": true // Boolean optional, whether to use Streaming<br> &emsp;} </pre>.
    */
    @SerializedName("LLMConfig")
    @Expose
    private String LLMConfig;

    /**
    * Required parameter, TTS configuration. it is a JSON string: TRTC TTS configuration as follows:.  
<pre> { <br> &emsp;  "TTSType": "flow",  // [required] fixed to this value.  <br> &emsp;  "VoiceId": "v-female-R2s4N9qJ", // [required] premium timbre ID/clone voice ID. selectable different timbres. refer to the following timbre list for ID library.   <br> &emsp;  "Model": "flow_01_turbo", // (required) current default TTS Model version (corresponds to Flash version).  <br> &emsp;  "Speed": 1.0,    // [option] adjust the speaking rate. value range [0.5-2.0]. default 1.0. the larger the value, the faster the speech speed. <br> &emsp;  "Volume": 1.0,   // [optional] adjust volume [0,10]. default: 1.0. a larger value indicates higher volume.   <br> &emsp;  "Pitch": 0,   // [optional] adjusts the tone [-12,12]. default value is 0. among them, 0 outputs the original voice type. <br> &emsp;  "Language": "zh" // [optional] recommend filling in. currently supports filling in chinese: zh, english: en, cantonese dialect: yue. parameter reference: (ISO 639-1). <br> &emsp;} </pre>
    */
    @SerializedName("TTSConfig")
    @Expose
    private String TTSConfig;

    /**
    * Experimental parameter, contact for background usage.
    */
    @SerializedName("ExperimentalParams")
    @Expose
    private String ExperimentalParams;

    /**
     * Get [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#SdkAppId) of TRTC, which is the same as the SdkAppId used by the room with transcription task enabled. 
     * @return SdkAppId [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#SdkAppId) of TRTC, which is the same as the SdkAppId used by the room with transcription task enabled.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#SdkAppId) of TRTC, which is the same as the SdkAppId used by the room with transcription task enabled.
     * @param SdkAppId [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#SdkAppId) of TRTC, which is the same as the SdkAppId used by the room with transcription task enabled.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get [RoomId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#RoomId) of TRTC refers to the room number that enables the conversation task. 
     * @return RoomId [RoomId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#RoomId) of TRTC refers to the room number that enables the conversation task.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set [RoomId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#RoomId) of TRTC refers to the room number that enables the conversation task.
     * @param RoomId [RoomId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#RoomId) of TRTC refers to the room number that enables the conversation task.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Bot parameters. 
     * @return AgentConfig Bot parameters.
     */
    public AgentConfig getAgentConfig() {
        return this.AgentConfig;
    }

    /**
     * Set Bot parameters.
     * @param AgentConfig Bot parameters.
     */
    public void setAgentConfig(AgentConfig AgentConfig) {
        this.AgentConfig = AgentConfig;
    }

    /**
     * Get The unique Id passed by the caller can be used to prevent duplication of task initiation on the client side as well as query task status through this field. 
     * @return SessionId The unique Id passed by the caller can be used to prevent duplication of task initiation on the client side as well as query task status through this field.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The unique Id passed by the caller can be used to prevent duplication of task initiation on the client side as well as query task status through this field.
     * @param SessionId The unique Id passed by the caller can be used to prevent duplication of task initiation on the client side as well as query task status through this field.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Type of the TRTC room number. 0 indicates digit room number, 1 indicates string room number. by default if left blank, it is digit room number. 
     * @return RoomIdType Type of the TRTC room number. 0 indicates digit room number, 1 indicates string room number. by default if left blank, it is digit room number.
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set Type of the TRTC room number. 0 indicates digit room number, 1 indicates string room number. by default if left blank, it is digit room number.
     * @param RoomIdType Type of the TRTC room number. 0 indicates digit room number, 1 indicates string room number. by default if left blank, it is digit room number.
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get Speech recognition configuration. 
     * @return STTConfig Speech recognition configuration.
     */
    public STTConfig getSTTConfig() {
        return this.STTConfig;
    }

    /**
     * Set Speech recognition configuration.
     * @param STTConfig Speech recognition configuration.
     */
    public void setSTTConfig(STTConfig STTConfig) {
        this.STTConfig = STTConfig;
    }

    /**
     * Get Required parameter, LLM configuration. it must comply with the openai standard and be a JSON String. example: <pre> { <br> &emsp;  "LLMType": "Model type",  // String required, for example: "openai" <br> &emsp;  "Model": "your Model name", // String required, specifies the Model to be used<br>    "APIKey": "your LLM API key", // String required <br> &emsp;  "APIUrl": "https://API.xxx.com/chat/completions", // String required, the URL for LLM API access<br> &emsp;  "History": 10, // Integer optional, sets the context rounds for LLM, default value is 0, maximum value is 50<br> &emsp;  "HistoryMode": 1, // Integer optional, 1 means the content in the LLM context will synchronize with playback audio, and text corresponding to unplayed audio will not appear in the context. 0 means no synchronization, default value is 0<br> &emsp;  "Streaming": true // Boolean optional, whether to use Streaming<br> &emsp;} </pre>. 
     * @return LLMConfig Required parameter, LLM configuration. it must comply with the openai standard and be a JSON String. example: <pre> { <br> &emsp;  "LLMType": "Model type",  // String required, for example: "openai" <br> &emsp;  "Model": "your Model name", // String required, specifies the Model to be used<br>    "APIKey": "your LLM API key", // String required <br> &emsp;  "APIUrl": "https://API.xxx.com/chat/completions", // String required, the URL for LLM API access<br> &emsp;  "History": 10, // Integer optional, sets the context rounds for LLM, default value is 0, maximum value is 50<br> &emsp;  "HistoryMode": 1, // Integer optional, 1 means the content in the LLM context will synchronize with playback audio, and text corresponding to unplayed audio will not appear in the context. 0 means no synchronization, default value is 0<br> &emsp;  "Streaming": true // Boolean optional, whether to use Streaming<br> &emsp;} </pre>.
     */
    public String getLLMConfig() {
        return this.LLMConfig;
    }

    /**
     * Set Required parameter, LLM configuration. it must comply with the openai standard and be a JSON String. example: <pre> { <br> &emsp;  "LLMType": "Model type",  // String required, for example: "openai" <br> &emsp;  "Model": "your Model name", // String required, specifies the Model to be used<br>    "APIKey": "your LLM API key", // String required <br> &emsp;  "APIUrl": "https://API.xxx.com/chat/completions", // String required, the URL for LLM API access<br> &emsp;  "History": 10, // Integer optional, sets the context rounds for LLM, default value is 0, maximum value is 50<br> &emsp;  "HistoryMode": 1, // Integer optional, 1 means the content in the LLM context will synchronize with playback audio, and text corresponding to unplayed audio will not appear in the context. 0 means no synchronization, default value is 0<br> &emsp;  "Streaming": true // Boolean optional, whether to use Streaming<br> &emsp;} </pre>.
     * @param LLMConfig Required parameter, LLM configuration. it must comply with the openai standard and be a JSON String. example: <pre> { <br> &emsp;  "LLMType": "Model type",  // String required, for example: "openai" <br> &emsp;  "Model": "your Model name", // String required, specifies the Model to be used<br>    "APIKey": "your LLM API key", // String required <br> &emsp;  "APIUrl": "https://API.xxx.com/chat/completions", // String required, the URL for LLM API access<br> &emsp;  "History": 10, // Integer optional, sets the context rounds for LLM, default value is 0, maximum value is 50<br> &emsp;  "HistoryMode": 1, // Integer optional, 1 means the content in the LLM context will synchronize with playback audio, and text corresponding to unplayed audio will not appear in the context. 0 means no synchronization, default value is 0<br> &emsp;  "Streaming": true // Boolean optional, whether to use Streaming<br> &emsp;} </pre>.
     */
    public void setLLMConfig(String LLMConfig) {
        this.LLMConfig = LLMConfig;
    }

    /**
     * Get Required parameter, TTS configuration. it is a JSON string: TRTC TTS configuration as follows:.  
<pre> { <br> &emsp;  "TTSType": "flow",  // [required] fixed to this value.  <br> &emsp;  "VoiceId": "v-female-R2s4N9qJ", // [required] premium timbre ID/clone voice ID. selectable different timbres. refer to the following timbre list for ID library.   <br> &emsp;  "Model": "flow_01_turbo", // (required) current default TTS Model version (corresponds to Flash version).  <br> &emsp;  "Speed": 1.0,    // [option] adjust the speaking rate. value range [0.5-2.0]. default 1.0. the larger the value, the faster the speech speed. <br> &emsp;  "Volume": 1.0,   // [optional] adjust volume [0,10]. default: 1.0. a larger value indicates higher volume.   <br> &emsp;  "Pitch": 0,   // [optional] adjusts the tone [-12,12]. default value is 0. among them, 0 outputs the original voice type. <br> &emsp;  "Language": "zh" // [optional] recommend filling in. currently supports filling in chinese: zh, english: en, cantonese dialect: yue. parameter reference: (ISO 639-1). <br> &emsp;} </pre> 
     * @return TTSConfig Required parameter, TTS configuration. it is a JSON string: TRTC TTS configuration as follows:.  
<pre> { <br> &emsp;  "TTSType": "flow",  // [required] fixed to this value.  <br> &emsp;  "VoiceId": "v-female-R2s4N9qJ", // [required] premium timbre ID/clone voice ID. selectable different timbres. refer to the following timbre list for ID library.   <br> &emsp;  "Model": "flow_01_turbo", // (required) current default TTS Model version (corresponds to Flash version).  <br> &emsp;  "Speed": 1.0,    // [option] adjust the speaking rate. value range [0.5-2.0]. default 1.0. the larger the value, the faster the speech speed. <br> &emsp;  "Volume": 1.0,   // [optional] adjust volume [0,10]. default: 1.0. a larger value indicates higher volume.   <br> &emsp;  "Pitch": 0,   // [optional] adjusts the tone [-12,12]. default value is 0. among them, 0 outputs the original voice type. <br> &emsp;  "Language": "zh" // [optional] recommend filling in. currently supports filling in chinese: zh, english: en, cantonese dialect: yue. parameter reference: (ISO 639-1). <br> &emsp;} </pre>
     */
    public String getTTSConfig() {
        return this.TTSConfig;
    }

    /**
     * Set Required parameter, TTS configuration. it is a JSON string: TRTC TTS configuration as follows:.  
<pre> { <br> &emsp;  "TTSType": "flow",  // [required] fixed to this value.  <br> &emsp;  "VoiceId": "v-female-R2s4N9qJ", // [required] premium timbre ID/clone voice ID. selectable different timbres. refer to the following timbre list for ID library.   <br> &emsp;  "Model": "flow_01_turbo", // (required) current default TTS Model version (corresponds to Flash version).  <br> &emsp;  "Speed": 1.0,    // [option] adjust the speaking rate. value range [0.5-2.0]. default 1.0. the larger the value, the faster the speech speed. <br> &emsp;  "Volume": 1.0,   // [optional] adjust volume [0,10]. default: 1.0. a larger value indicates higher volume.   <br> &emsp;  "Pitch": 0,   // [optional] adjusts the tone [-12,12]. default value is 0. among them, 0 outputs the original voice type. <br> &emsp;  "Language": "zh" // [optional] recommend filling in. currently supports filling in chinese: zh, english: en, cantonese dialect: yue. parameter reference: (ISO 639-1). <br> &emsp;} </pre>
     * @param TTSConfig Required parameter, TTS configuration. it is a JSON string: TRTC TTS configuration as follows:.  
<pre> { <br> &emsp;  "TTSType": "flow",  // [required] fixed to this value.  <br> &emsp;  "VoiceId": "v-female-R2s4N9qJ", // [required] premium timbre ID/clone voice ID. selectable different timbres. refer to the following timbre list for ID library.   <br> &emsp;  "Model": "flow_01_turbo", // (required) current default TTS Model version (corresponds to Flash version).  <br> &emsp;  "Speed": 1.0,    // [option] adjust the speaking rate. value range [0.5-2.0]. default 1.0. the larger the value, the faster the speech speed. <br> &emsp;  "Volume": 1.0,   // [optional] adjust volume [0,10]. default: 1.0. a larger value indicates higher volume.   <br> &emsp;  "Pitch": 0,   // [optional] adjusts the tone [-12,12]. default value is 0. among them, 0 outputs the original voice type. <br> &emsp;  "Language": "zh" // [optional] recommend filling in. currently supports filling in chinese: zh, english: en, cantonese dialect: yue. parameter reference: (ISO 639-1). <br> &emsp;} </pre>
     */
    public void setTTSConfig(String TTSConfig) {
        this.TTSConfig = TTSConfig;
    }

    /**
     * Get Experimental parameter, contact for background usage. 
     * @return ExperimentalParams Experimental parameter, contact for background usage.
     */
    public String getExperimentalParams() {
        return this.ExperimentalParams;
    }

    /**
     * Set Experimental parameter, contact for background usage.
     * @param ExperimentalParams Experimental parameter, contact for background usage.
     */
    public void setExperimentalParams(String ExperimentalParams) {
        this.ExperimentalParams = ExperimentalParams;
    }

    public StartAIConversationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartAIConversationRequest(StartAIConversationRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.AgentConfig != null) {
            this.AgentConfig = new AgentConfig(source.AgentConfig);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.RoomIdType != null) {
            this.RoomIdType = new Long(source.RoomIdType);
        }
        if (source.STTConfig != null) {
            this.STTConfig = new STTConfig(source.STTConfig);
        }
        if (source.LLMConfig != null) {
            this.LLMConfig = new String(source.LLMConfig);
        }
        if (source.TTSConfig != null) {
            this.TTSConfig = new String(source.TTSConfig);
        }
        if (source.ExperimentalParams != null) {
            this.ExperimentalParams = new String(source.ExperimentalParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamObj(map, prefix + "AgentConfig.", this.AgentConfig);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);
        this.setParamObj(map, prefix + "STTConfig.", this.STTConfig);
        this.setParamSimple(map, prefix + "LLMConfig", this.LLMConfig);
        this.setParamSimple(map, prefix + "TTSConfig", this.TTSConfig);
        this.setParamSimple(map, prefix + "ExperimentalParams", this.ExperimentalParams);

    }
}

