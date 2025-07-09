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

public class UpdateAIConversationRequest extends AbstractModel {

    /**
    * Task Unique ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * If you do not fill in the form, no update will be performed. Welcome message from the robot
    */
    @SerializedName("WelcomeMessage")
    @Expose
    private String WelcomeMessage;

    /**
    * If not filled in, no update will be performed. Intelligent interruption mode, 0 means the server automatically interrupts, 1 means the server does not interrupt, and the client sends an interrupt signal to interrupt
    */
    @SerializedName("InterruptMode")
    @Expose
    private Long InterruptMode;

    /**
    * If not filled in, no update will be performed. Used when InterruptMode is 0, the unit is milliseconds, and the default is 500ms. It means that the server will interrupt when it detects a voice that lasts for InterruptSpeechDuration milliseconds.
    */
    @SerializedName("InterruptSpeechDuration")
    @Expose
    private Long InterruptSpeechDuration;

    /**
    * If not filled in, no update will be performed. For LLM configuration, see the StartAIConversation API for details.
    */
    @SerializedName("LLMConfig")
    @Expose
    private String LLMConfig;

    /**
    * If not filled in, no update will be performed. For TTS configuration, see the StartAIConversation API for details.
    */
    @SerializedName("TTSConfig")
    @Expose
    private String TTSConfig;

    /**
     * Get Task Unique ID 
     * @return TaskId Task Unique ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task Unique ID
     * @param TaskId Task Unique ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get If you do not fill in the form, no update will be performed. Welcome message from the robot 
     * @return WelcomeMessage If you do not fill in the form, no update will be performed. Welcome message from the robot
     */
    public String getWelcomeMessage() {
        return this.WelcomeMessage;
    }

    /**
     * Set If you do not fill in the form, no update will be performed. Welcome message from the robot
     * @param WelcomeMessage If you do not fill in the form, no update will be performed. Welcome message from the robot
     */
    public void setWelcomeMessage(String WelcomeMessage) {
        this.WelcomeMessage = WelcomeMessage;
    }

    /**
     * Get If not filled in, no update will be performed. Intelligent interruption mode, 0 means the server automatically interrupts, 1 means the server does not interrupt, and the client sends an interrupt signal to interrupt 
     * @return InterruptMode If not filled in, no update will be performed. Intelligent interruption mode, 0 means the server automatically interrupts, 1 means the server does not interrupt, and the client sends an interrupt signal to interrupt
     */
    public Long getInterruptMode() {
        return this.InterruptMode;
    }

    /**
     * Set If not filled in, no update will be performed. Intelligent interruption mode, 0 means the server automatically interrupts, 1 means the server does not interrupt, and the client sends an interrupt signal to interrupt
     * @param InterruptMode If not filled in, no update will be performed. Intelligent interruption mode, 0 means the server automatically interrupts, 1 means the server does not interrupt, and the client sends an interrupt signal to interrupt
     */
    public void setInterruptMode(Long InterruptMode) {
        this.InterruptMode = InterruptMode;
    }

    /**
     * Get If not filled in, no update will be performed. Used when InterruptMode is 0, the unit is milliseconds, and the default is 500ms. It means that the server will interrupt when it detects a voice that lasts for InterruptSpeechDuration milliseconds. 
     * @return InterruptSpeechDuration If not filled in, no update will be performed. Used when InterruptMode is 0, the unit is milliseconds, and the default is 500ms. It means that the server will interrupt when it detects a voice that lasts for InterruptSpeechDuration milliseconds.
     */
    public Long getInterruptSpeechDuration() {
        return this.InterruptSpeechDuration;
    }

    /**
     * Set If not filled in, no update will be performed. Used when InterruptMode is 0, the unit is milliseconds, and the default is 500ms. It means that the server will interrupt when it detects a voice that lasts for InterruptSpeechDuration milliseconds.
     * @param InterruptSpeechDuration If not filled in, no update will be performed. Used when InterruptMode is 0, the unit is milliseconds, and the default is 500ms. It means that the server will interrupt when it detects a voice that lasts for InterruptSpeechDuration milliseconds.
     */
    public void setInterruptSpeechDuration(Long InterruptSpeechDuration) {
        this.InterruptSpeechDuration = InterruptSpeechDuration;
    }

    /**
     * Get If not filled in, no update will be performed. For LLM configuration, see the StartAIConversation API for details. 
     * @return LLMConfig If not filled in, no update will be performed. For LLM configuration, see the StartAIConversation API for details.
     */
    public String getLLMConfig() {
        return this.LLMConfig;
    }

    /**
     * Set If not filled in, no update will be performed. For LLM configuration, see the StartAIConversation API for details.
     * @param LLMConfig If not filled in, no update will be performed. For LLM configuration, see the StartAIConversation API for details.
     */
    public void setLLMConfig(String LLMConfig) {
        this.LLMConfig = LLMConfig;
    }

    /**
     * Get If not filled in, no update will be performed. For TTS configuration, see the StartAIConversation API for details. 
     * @return TTSConfig If not filled in, no update will be performed. For TTS configuration, see the StartAIConversation API for details.
     */
    public String getTTSConfig() {
        return this.TTSConfig;
    }

    /**
     * Set If not filled in, no update will be performed. For TTS configuration, see the StartAIConversation API for details.
     * @param TTSConfig If not filled in, no update will be performed. For TTS configuration, see the StartAIConversation API for details.
     */
    public void setTTSConfig(String TTSConfig) {
        this.TTSConfig = TTSConfig;
    }

    public UpdateAIConversationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAIConversationRequest(UpdateAIConversationRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.WelcomeMessage != null) {
            this.WelcomeMessage = new String(source.WelcomeMessage);
        }
        if (source.InterruptMode != null) {
            this.InterruptMode = new Long(source.InterruptMode);
        }
        if (source.InterruptSpeechDuration != null) {
            this.InterruptSpeechDuration = new Long(source.InterruptSpeechDuration);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "WelcomeMessage", this.WelcomeMessage);
        this.setParamSimple(map, prefix + "InterruptMode", this.InterruptMode);
        this.setParamSimple(map, prefix + "InterruptSpeechDuration", this.InterruptSpeechDuration);
        this.setParamSimple(map, prefix + "LLMConfig", this.LLMConfig);
        this.setParamSimple(map, prefix + "TTSConfig", this.TTSConfig);

    }
}

