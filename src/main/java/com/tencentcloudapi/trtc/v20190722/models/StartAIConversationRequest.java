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
    * TRTC's [SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid) is the same as the SdkAppId used by the room that starts the conversation task.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * TRTC's [RoomId](https://cloud.tencent.com/document/product/647/46351#roomid), which indicates the room number where the conversation task is started.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * Robot parameters
    */
    @SerializedName("AgentConfig")
    @Expose
    private AgentConfig AgentConfig;

    /**
    * The unique ID passed in by the caller can be used by the client to prevent repeated task initiation and to query the task status through this field.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * The type of TRTC room number. 0 represents a numeric room number, and 1 represents a string room number. If not filled in, the default is a numeric room number.
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
    * LLM configuration. It must comply with the openai specification and be a JSON string. The example is as follows: <pre> { <br> &emsp; "LLMType": "Large model type", // String required, such as: "openai" <br> &emsp; "Model": "Your model name", // String required, specify the model to be used<br> "APIKey": "Your LLM API key", // String required <br> &emsp; "APIUrl": "https://api.xxx.com/chat/completions", // String required, URL for LLM API access<br> &emsp; "Streaming": true // Boolean optional, specify whether to use streaming<br> &emsp;} </pre>
    */
    @SerializedName("LLMConfig")
    @Expose
    private String LLMConfig;

    /**
    * TTS configuration, which is a JSON string. The Tencent Cloud TTS example is as follows: <pre>{ <br> &emsp; "AppId": your application ID, // Integer Required<br> &emsp; "TTSType": "TTS type", // String TTS type, fixed to "tencent"<br> &emsp; "SecretId": "Your key ID", // String Required<br> &emsp; "SecretKey": "Your keyKey", // String Required<br> &emsp; "VoiceType": 101001, // Integer Required, voice ID, including standard voice and premium voice. Premium voice has higher fidelity and different price from standard voice. For details, please refer to <a href="https://cloud.tencent.com/document/product/1073/34112">Overview of Speech Synthesis Billing</a>. For a complete list of timbre IDs, see <a href="https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823">List of speech synthesis timbre IDs</a>. <br> &emsp; "Speed": 1.25, // Integer Optional, speaking speed, range: [-2, 6], corresponding to different speaking speeds: -2: 0.6 times -1: 0.8 times 0: 1.0 times (default) 1: 1.2 times 2: 1.5 times 6: 2.5 times If a more detailed speaking speed is required, 2 decimal places can be retained, such as 0.5/1.25/2.81, etc. For the conversion between parameter value and actual speech speed, please refer to <a href="https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz">Speed Conversion</a><br> &emsp; "Volume": 5, // Integer Optional, volume size, range: [0, 10], corresponding to 11 levels of volume, the default value is 0, representing normal volume. <br> &emsp; "PrimaryLanguage": "zh-CN" // String Optional, primary language<br> &emsp;}</pre>
    */
    @SerializedName("TTSConfig")
    @Expose
    private String TTSConfig;

    /**
     * Get TRTC's [SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid) is the same as the SdkAppId used by the room that starts the conversation task. 
     * @return SdkAppId TRTC's [SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid) is the same as the SdkAppId used by the room that starts the conversation task.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC's [SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid) is the same as the SdkAppId used by the room that starts the conversation task.
     * @param SdkAppId TRTC's [SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid) is the same as the SdkAppId used by the room that starts the conversation task.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get TRTC's [RoomId](https://cloud.tencent.com/document/product/647/46351#roomid), which indicates the room number where the conversation task is started. 
     * @return RoomId TRTC's [RoomId](https://cloud.tencent.com/document/product/647/46351#roomid), which indicates the room number where the conversation task is started.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set TRTC's [RoomId](https://cloud.tencent.com/document/product/647/46351#roomid), which indicates the room number where the conversation task is started.
     * @param RoomId TRTC's [RoomId](https://cloud.tencent.com/document/product/647/46351#roomid), which indicates the room number where the conversation task is started.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Robot parameters 
     * @return AgentConfig Robot parameters
     */
    public AgentConfig getAgentConfig() {
        return this.AgentConfig;
    }

    /**
     * Set Robot parameters
     * @param AgentConfig Robot parameters
     */
    public void setAgentConfig(AgentConfig AgentConfig) {
        this.AgentConfig = AgentConfig;
    }

    /**
     * Get The unique ID passed in by the caller can be used by the client to prevent repeated task initiation and to query the task status through this field. 
     * @return SessionId The unique ID passed in by the caller can be used by the client to prevent repeated task initiation and to query the task status through this field.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The unique ID passed in by the caller can be used by the client to prevent repeated task initiation and to query the task status through this field.
     * @param SessionId The unique ID passed in by the caller can be used by the client to prevent repeated task initiation and to query the task status through this field.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get The type of TRTC room number. 0 represents a numeric room number, and 1 represents a string room number. If not filled in, the default is a numeric room number. 
     * @return RoomIdType The type of TRTC room number. 0 represents a numeric room number, and 1 represents a string room number. If not filled in, the default is a numeric room number.
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set The type of TRTC room number. 0 represents a numeric room number, and 1 represents a string room number. If not filled in, the default is a numeric room number.
     * @param RoomIdType The type of TRTC room number. 0 represents a numeric room number, and 1 represents a string room number. If not filled in, the default is a numeric room number.
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
     * Get LLM configuration. It must comply with the openai specification and be a JSON string. The example is as follows: <pre> { <br> &emsp; "LLMType": "Large model type", // String required, such as: "openai" <br> &emsp; "Model": "Your model name", // String required, specify the model to be used<br> "APIKey": "Your LLM API key", // String required <br> &emsp; "APIUrl": "https://api.xxx.com/chat/completions", // String required, URL for LLM API access<br> &emsp; "Streaming": true // Boolean optional, specify whether to use streaming<br> &emsp;} </pre> 
     * @return LLMConfig LLM configuration. It must comply with the openai specification and be a JSON string. The example is as follows: <pre> { <br> &emsp; "LLMType": "Large model type", // String required, such as: "openai" <br> &emsp; "Model": "Your model name", // String required, specify the model to be used<br> "APIKey": "Your LLM API key", // String required <br> &emsp; "APIUrl": "https://api.xxx.com/chat/completions", // String required, URL for LLM API access<br> &emsp; "Streaming": true // Boolean optional, specify whether to use streaming<br> &emsp;} </pre>
     */
    public String getLLMConfig() {
        return this.LLMConfig;
    }

    /**
     * Set LLM configuration. It must comply with the openai specification and be a JSON string. The example is as follows: <pre> { <br> &emsp; "LLMType": "Large model type", // String required, such as: "openai" <br> &emsp; "Model": "Your model name", // String required, specify the model to be used<br> "APIKey": "Your LLM API key", // String required <br> &emsp; "APIUrl": "https://api.xxx.com/chat/completions", // String required, URL for LLM API access<br> &emsp; "Streaming": true // Boolean optional, specify whether to use streaming<br> &emsp;} </pre>
     * @param LLMConfig LLM configuration. It must comply with the openai specification and be a JSON string. The example is as follows: <pre> { <br> &emsp; "LLMType": "Large model type", // String required, such as: "openai" <br> &emsp; "Model": "Your model name", // String required, specify the model to be used<br> "APIKey": "Your LLM API key", // String required <br> &emsp; "APIUrl": "https://api.xxx.com/chat/completions", // String required, URL for LLM API access<br> &emsp; "Streaming": true // Boolean optional, specify whether to use streaming<br> &emsp;} </pre>
     */
    public void setLLMConfig(String LLMConfig) {
        this.LLMConfig = LLMConfig;
    }

    /**
     * Get TTS configuration, which is a JSON string. The Tencent Cloud TTS example is as follows: <pre>{ <br> &emsp; "AppId": your application ID, // Integer Required<br> &emsp; "TTSType": "TTS type", // String TTS type, fixed to "tencent"<br> &emsp; "SecretId": "Your key ID", // String Required<br> &emsp; "SecretKey": "Your keyKey", // String Required<br> &emsp; "VoiceType": 101001, // Integer Required, voice ID, including standard voice and premium voice. Premium voice has higher fidelity and different price from standard voice. For details, please refer to <a href="https://cloud.tencent.com/document/product/1073/34112">Overview of Speech Synthesis Billing</a>. For a complete list of timbre IDs, see <a href="https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823">List of speech synthesis timbre IDs</a>. <br> &emsp; "Speed": 1.25, // Integer Optional, speaking speed, range: [-2, 6], corresponding to different speaking speeds: -2: 0.6 times -1: 0.8 times 0: 1.0 times (default) 1: 1.2 times 2: 1.5 times 6: 2.5 times If a more detailed speaking speed is required, 2 decimal places can be retained, such as 0.5/1.25/2.81, etc. For the conversion between parameter value and actual speech speed, please refer to <a href="https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz">Speed Conversion</a><br> &emsp; "Volume": 5, // Integer Optional, volume size, range: [0, 10], corresponding to 11 levels of volume, the default value is 0, representing normal volume. <br> &emsp; "PrimaryLanguage": "zh-CN" // String Optional, primary language<br> &emsp;}</pre> 
     * @return TTSConfig TTS configuration, which is a JSON string. The Tencent Cloud TTS example is as follows: <pre>{ <br> &emsp; "AppId": your application ID, // Integer Required<br> &emsp; "TTSType": "TTS type", // String TTS type, fixed to "tencent"<br> &emsp; "SecretId": "Your key ID", // String Required<br> &emsp; "SecretKey": "Your keyKey", // String Required<br> &emsp; "VoiceType": 101001, // Integer Required, voice ID, including standard voice and premium voice. Premium voice has higher fidelity and different price from standard voice. For details, please refer to <a href="https://cloud.tencent.com/document/product/1073/34112">Overview of Speech Synthesis Billing</a>. For a complete list of timbre IDs, see <a href="https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823">List of speech synthesis timbre IDs</a>. <br> &emsp; "Speed": 1.25, // Integer Optional, speaking speed, range: [-2, 6], corresponding to different speaking speeds: -2: 0.6 times -1: 0.8 times 0: 1.0 times (default) 1: 1.2 times 2: 1.5 times 6: 2.5 times If a more detailed speaking speed is required, 2 decimal places can be retained, such as 0.5/1.25/2.81, etc. For the conversion between parameter value and actual speech speed, please refer to <a href="https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz">Speed Conversion</a><br> &emsp; "Volume": 5, // Integer Optional, volume size, range: [0, 10], corresponding to 11 levels of volume, the default value is 0, representing normal volume. <br> &emsp; "PrimaryLanguage": "zh-CN" // String Optional, primary language<br> &emsp;}</pre>
     */
    public String getTTSConfig() {
        return this.TTSConfig;
    }

    /**
     * Set TTS configuration, which is a JSON string. The Tencent Cloud TTS example is as follows: <pre>{ <br> &emsp; "AppId": your application ID, // Integer Required<br> &emsp; "TTSType": "TTS type", // String TTS type, fixed to "tencent"<br> &emsp; "SecretId": "Your key ID", // String Required<br> &emsp; "SecretKey": "Your keyKey", // String Required<br> &emsp; "VoiceType": 101001, // Integer Required, voice ID, including standard voice and premium voice. Premium voice has higher fidelity and different price from standard voice. For details, please refer to <a href="https://cloud.tencent.com/document/product/1073/34112">Overview of Speech Synthesis Billing</a>. For a complete list of timbre IDs, see <a href="https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823">List of speech synthesis timbre IDs</a>. <br> &emsp; "Speed": 1.25, // Integer Optional, speaking speed, range: [-2, 6], corresponding to different speaking speeds: -2: 0.6 times -1: 0.8 times 0: 1.0 times (default) 1: 1.2 times 2: 1.5 times 6: 2.5 times If a more detailed speaking speed is required, 2 decimal places can be retained, such as 0.5/1.25/2.81, etc. For the conversion between parameter value and actual speech speed, please refer to <a href="https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz">Speed Conversion</a><br> &emsp; "Volume": 5, // Integer Optional, volume size, range: [0, 10], corresponding to 11 levels of volume, the default value is 0, representing normal volume. <br> &emsp; "PrimaryLanguage": "zh-CN" // String Optional, primary language<br> &emsp;}</pre>
     * @param TTSConfig TTS configuration, which is a JSON string. The Tencent Cloud TTS example is as follows: <pre>{ <br> &emsp; "AppId": your application ID, // Integer Required<br> &emsp; "TTSType": "TTS type", // String TTS type, fixed to "tencent"<br> &emsp; "SecretId": "Your key ID", // String Required<br> &emsp; "SecretKey": "Your keyKey", // String Required<br> &emsp; "VoiceType": 101001, // Integer Required, voice ID, including standard voice and premium voice. Premium voice has higher fidelity and different price from standard voice. For details, please refer to <a href="https://cloud.tencent.com/document/product/1073/34112">Overview of Speech Synthesis Billing</a>. For a complete list of timbre IDs, see <a href="https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823">List of speech synthesis timbre IDs</a>. <br> &emsp; "Speed": 1.25, // Integer Optional, speaking speed, range: [-2, 6], corresponding to different speaking speeds: -2: 0.6 times -1: 0.8 times 0: 1.0 times (default) 1: 1.2 times 2: 1.5 times 6: 2.5 times If a more detailed speaking speed is required, 2 decimal places can be retained, such as 0.5/1.25/2.81, etc. For the conversion between parameter value and actual speech speed, please refer to <a href="https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz">Speed Conversion</a><br> &emsp; "Volume": 5, // Integer Optional, volume size, range: [0, 10], corresponding to 11 levels of volume, the default value is 0, representing normal volume. <br> &emsp; "PrimaryLanguage": "zh-CN" // String Optional, primary language<br> &emsp;}</pre>
     */
    public void setTTSConfig(String TTSConfig) {
        this.TTSConfig = TTSConfig;
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

    }
}

