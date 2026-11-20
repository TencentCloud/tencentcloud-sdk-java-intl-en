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

public class VoiceConversationConfig extends AbstractModel {

    /**
    * [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#userid) used by the conversation service in the TRTC room. It must not match a UserId already used by another TRTC user or by the conversation service. Include the room ID in the UserId.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * [UserSig](https://www.tencentcloud.com/document/product/647/45910?from_cn_redirect=1#UserSig) for the conversation service to join the TRTC room. It is the authentication signature of this UserId and works like a login password. For how to calculate UserSig, see the linked topic.
    */
    @SerializedName("UserSig")
    @Expose
    private String UserSig;

    /**
    * <p>UserId of the anchor whose audio the conversation service subscribes to. Specify one anchor only.</p>
    */
    @SerializedName("TargetUserId")
    @Expose
    private String [] TargetUserId;

    /**
    * <p>Parameters of the bot that publishes TTS audio back to the room.</p>
    */
    @SerializedName("TTSPushRoomParams")
    @Expose
    private TranscriptionUserInfoParams TTSPushRoomParams;

    /**
    * <p>If an anchor in the conversation stays out of the TRTC room, or stays in the audience role, for longer than `MaxIdleTime`, the conversation task stops automatically. Valid range: 5 to 86400 (24 hours). Default: 30. Unit: seconds.</p>
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * Filters content returned by the LLM. Text inside the specified brackets is not played. If this parameter is not set, nothing is filtered. Valid range: 1 to 5. Example: 1. 
Not supported in S2S mode.
Valid values:
- 1: Chinese parentheses 
- 2: English parentheses
- 3: Chinese square brackets
- 4: English square brackets
- 5: English curly braces
    */
    @SerializedName("FilterBracketsContent")
    @Expose
    private Long [] FilterBracketsContent;

    /**
    * Subtitle display mode. Not supported in S2S mode.
Valid values:
- 0: Show subtitles as soon as possible.
- 1: Show subtitles sentence by sentence in real time.
    */
    @SerializedName("SubtitleMode")
    @Expose
    private Long SubtitleMode;

    /**
    * Controls how a new conversation turn starts. Default: `auto`. Not supported in S2S mode.
Valid values:

- `auto`: The backend detects the end of a sentence from the silence duration, and then calls the LLM.
    */
    @SerializedName("TurnDetectionMode")
    @Expose
    private String TurnDetectionMode;

    /**
     * Get [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#userid) used by the conversation service in the TRTC room. It must not match a UserId already used by another TRTC user or by the conversation service. Include the room ID in the UserId. 
     * @return UserId [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#userid) used by the conversation service in the TRTC room. It must not match a UserId already used by another TRTC user or by the conversation service. Include the room ID in the UserId.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#userid) used by the conversation service in the TRTC room. It must not match a UserId already used by another TRTC user or by the conversation service. Include the room ID in the UserId.
     * @param UserId [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#userid) used by the conversation service in the TRTC room. It must not match a UserId already used by another TRTC user or by the conversation service. Include the room ID in the UserId.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get [UserSig](https://www.tencentcloud.com/document/product/647/45910?from_cn_redirect=1#UserSig) for the conversation service to join the TRTC room. It is the authentication signature of this UserId and works like a login password. For how to calculate UserSig, see the linked topic. 
     * @return UserSig [UserSig](https://www.tencentcloud.com/document/product/647/45910?from_cn_redirect=1#UserSig) for the conversation service to join the TRTC room. It is the authentication signature of this UserId and works like a login password. For how to calculate UserSig, see the linked topic.
     */
    public String getUserSig() {
        return this.UserSig;
    }

    /**
     * Set [UserSig](https://www.tencentcloud.com/document/product/647/45910?from_cn_redirect=1#UserSig) for the conversation service to join the TRTC room. It is the authentication signature of this UserId and works like a login password. For how to calculate UserSig, see the linked topic.
     * @param UserSig [UserSig](https://www.tencentcloud.com/document/product/647/45910?from_cn_redirect=1#UserSig) for the conversation service to join the TRTC room. It is the authentication signature of this UserId and works like a login password. For how to calculate UserSig, see the linked topic.
     */
    public void setUserSig(String UserSig) {
        this.UserSig = UserSig;
    }

    /**
     * Get <p>UserId of the anchor whose audio the conversation service subscribes to. Specify one anchor only.</p> 
     * @return TargetUserId <p>UserId of the anchor whose audio the conversation service subscribes to. Specify one anchor only.</p>
     */
    public String [] getTargetUserId() {
        return this.TargetUserId;
    }

    /**
     * Set <p>UserId of the anchor whose audio the conversation service subscribes to. Specify one anchor only.</p>
     * @param TargetUserId <p>UserId of the anchor whose audio the conversation service subscribes to. Specify one anchor only.</p>
     */
    public void setTargetUserId(String [] TargetUserId) {
        this.TargetUserId = TargetUserId;
    }

    /**
     * Get <p>Parameters of the bot that publishes TTS audio back to the room.</p> 
     * @return TTSPushRoomParams <p>Parameters of the bot that publishes TTS audio back to the room.</p>
     */
    public TranscriptionUserInfoParams getTTSPushRoomParams() {
        return this.TTSPushRoomParams;
    }

    /**
     * Set <p>Parameters of the bot that publishes TTS audio back to the room.</p>
     * @param TTSPushRoomParams <p>Parameters of the bot that publishes TTS audio back to the room.</p>
     */
    public void setTTSPushRoomParams(TranscriptionUserInfoParams TTSPushRoomParams) {
        this.TTSPushRoomParams = TTSPushRoomParams;
    }

    /**
     * Get <p>If an anchor in the conversation stays out of the TRTC room, or stays in the audience role, for longer than `MaxIdleTime`, the conversation task stops automatically. Valid range: 5 to 86400 (24 hours). Default: 30. Unit: seconds.</p> 
     * @return MaxIdleTime <p>If an anchor in the conversation stays out of the TRTC room, or stays in the audience role, for longer than `MaxIdleTime`, the conversation task stops automatically. Valid range: 5 to 86400 (24 hours). Default: 30. Unit: seconds.</p>
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set <p>If an anchor in the conversation stays out of the TRTC room, or stays in the audience role, for longer than `MaxIdleTime`, the conversation task stops automatically. Valid range: 5 to 86400 (24 hours). Default: 30. Unit: seconds.</p>
     * @param MaxIdleTime <p>If an anchor in the conversation stays out of the TRTC room, or stays in the audience role, for longer than `MaxIdleTime`, the conversation task stops automatically. Valid range: 5 to 86400 (24 hours). Default: 30. Unit: seconds.</p>
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get Filters content returned by the LLM. Text inside the specified brackets is not played. If this parameter is not set, nothing is filtered. Valid range: 1 to 5. Example: 1. 
Not supported in S2S mode.
Valid values:
- 1: Chinese parentheses 
- 2: English parentheses
- 3: Chinese square brackets
- 4: English square brackets
- 5: English curly braces 
     * @return FilterBracketsContent Filters content returned by the LLM. Text inside the specified brackets is not played. If this parameter is not set, nothing is filtered. Valid range: 1 to 5. Example: 1. 
Not supported in S2S mode.
Valid values:
- 1: Chinese parentheses 
- 2: English parentheses
- 3: Chinese square brackets
- 4: English square brackets
- 5: English curly braces
     */
    public Long [] getFilterBracketsContent() {
        return this.FilterBracketsContent;
    }

    /**
     * Set Filters content returned by the LLM. Text inside the specified brackets is not played. If this parameter is not set, nothing is filtered. Valid range: 1 to 5. Example: 1. 
Not supported in S2S mode.
Valid values:
- 1: Chinese parentheses 
- 2: English parentheses
- 3: Chinese square brackets
- 4: English square brackets
- 5: English curly braces
     * @param FilterBracketsContent Filters content returned by the LLM. Text inside the specified brackets is not played. If this parameter is not set, nothing is filtered. Valid range: 1 to 5. Example: 1. 
Not supported in S2S mode.
Valid values:
- 1: Chinese parentheses 
- 2: English parentheses
- 3: Chinese square brackets
- 4: English square brackets
- 5: English curly braces
     */
    public void setFilterBracketsContent(Long [] FilterBracketsContent) {
        this.FilterBracketsContent = FilterBracketsContent;
    }

    /**
     * Get Subtitle display mode. Not supported in S2S mode.
Valid values:
- 0: Show subtitles as soon as possible.
- 1: Show subtitles sentence by sentence in real time. 
     * @return SubtitleMode Subtitle display mode. Not supported in S2S mode.
Valid values:
- 0: Show subtitles as soon as possible.
- 1: Show subtitles sentence by sentence in real time.
     */
    public Long getSubtitleMode() {
        return this.SubtitleMode;
    }

    /**
     * Set Subtitle display mode. Not supported in S2S mode.
Valid values:
- 0: Show subtitles as soon as possible.
- 1: Show subtitles sentence by sentence in real time.
     * @param SubtitleMode Subtitle display mode. Not supported in S2S mode.
Valid values:
- 0: Show subtitles as soon as possible.
- 1: Show subtitles sentence by sentence in real time.
     */
    public void setSubtitleMode(Long SubtitleMode) {
        this.SubtitleMode = SubtitleMode;
    }

    /**
     * Get Controls how a new conversation turn starts. Default: `auto`. Not supported in S2S mode.
Valid values:

- `auto`: The backend detects the end of a sentence from the silence duration, and then calls the LLM. 
     * @return TurnDetectionMode Controls how a new conversation turn starts. Default: `auto`. Not supported in S2S mode.
Valid values:

- `auto`: The backend detects the end of a sentence from the silence duration, and then calls the LLM.
     */
    public String getTurnDetectionMode() {
        return this.TurnDetectionMode;
    }

    /**
     * Set Controls how a new conversation turn starts. Default: `auto`. Not supported in S2S mode.
Valid values:

- `auto`: The backend detects the end of a sentence from the silence duration, and then calls the LLM.
     * @param TurnDetectionMode Controls how a new conversation turn starts. Default: `auto`. Not supported in S2S mode.
Valid values:

- `auto`: The backend detects the end of a sentence from the silence duration, and then calls the LLM.
     */
    public void setTurnDetectionMode(String TurnDetectionMode) {
        this.TurnDetectionMode = TurnDetectionMode;
    }

    public VoiceConversationConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConversationConfig(VoiceConversationConfig source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserSig != null) {
            this.UserSig = new String(source.UserSig);
        }
        if (source.TargetUserId != null) {
            this.TargetUserId = new String[source.TargetUserId.length];
            for (int i = 0; i < source.TargetUserId.length; i++) {
                this.TargetUserId[i] = new String(source.TargetUserId[i]);
            }
        }
        if (source.TTSPushRoomParams != null) {
            this.TTSPushRoomParams = new TranscriptionUserInfoParams(source.TTSPushRoomParams);
        }
        if (source.MaxIdleTime != null) {
            this.MaxIdleTime = new Long(source.MaxIdleTime);
        }
        if (source.FilterBracketsContent != null) {
            this.FilterBracketsContent = new Long[source.FilterBracketsContent.length];
            for (int i = 0; i < source.FilterBracketsContent.length; i++) {
                this.FilterBracketsContent[i] = new Long(source.FilterBracketsContent[i]);
            }
        }
        if (source.SubtitleMode != null) {
            this.SubtitleMode = new Long(source.SubtitleMode);
        }
        if (source.TurnDetectionMode != null) {
            this.TurnDetectionMode = new String(source.TurnDetectionMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserSig", this.UserSig);
        this.setParamArraySimple(map, prefix + "TargetUserId.", this.TargetUserId);
        this.setParamObj(map, prefix + "TTSPushRoomParams.", this.TTSPushRoomParams);
        this.setParamSimple(map, prefix + "MaxIdleTime", this.MaxIdleTime);
        this.setParamArraySimple(map, prefix + "FilterBracketsContent.", this.FilterBracketsContent);
        this.setParamSimple(map, prefix + "SubtitleMode", this.SubtitleMode);
        this.setParamSimple(map, prefix + "TurnDetectionMode", this.TurnDetectionMode);

    }
}

