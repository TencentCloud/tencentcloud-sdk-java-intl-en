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

public class VoiceConversationDialogConfig extends AbstractModel {

    /**
    * Interrupt mode. Default: 0.
Valid values:
- 0: Automatic. When STT returns text, it interrupts TTS playback. Use this mode with InterruptSpeechDuration.
- 1: Manual. The bot is interrupted only by the Interrupt command from the server or client API.
- 2: Keyword.
    */
    @SerializedName("InterruptMode")
    @Expose
    private Long InterruptMode;

    /**
    * Minimum duration of user speech that triggers an automatic interrupt. Default: 200. Unit: ms.
    */
    @SerializedName("InterruptSpeechDuration")
    @Expose
    private Long InterruptSpeechDuration;

    /**
    * Preset keywords that interrupt the bot. Use them when the user must explicitly indicate the intent to interrupt. You can set up to 128 keywords. Applies only when `InterruptMode` is 2.
    */
    @SerializedName("InterruptKeywords")
    @Expose
    private String [] InterruptKeywords;

    /**
    * How long the user is silent before the bot asks a follow-up question. Valid range: 0 to 300. 0 turns this off. Default: 0. Unit: seconds.


    */
    @SerializedName("SilenceFollowUp")
    @Expose
    private Long SilenceFollowUp;

    /**
    * <p>Text of the proactive follow-up question.</p>
    */
    @SerializedName("SilenceFollowUpText")
    @Expose
    private String SilenceFollowUpText;

    /**
    * Welcome message the bot broadcasts when an anchor enters the room for the first time. It is broadcast again when the anchor leaves the room and enters again.
    */
    @SerializedName("WelcomeMessage")
    @Expose
    private String WelcomeMessage;

    /**
     * Get Interrupt mode. Default: 0.
Valid values:
- 0: Automatic. When STT returns text, it interrupts TTS playback. Use this mode with InterruptSpeechDuration.
- 1: Manual. The bot is interrupted only by the Interrupt command from the server or client API.
- 2: Keyword. 
     * @return InterruptMode Interrupt mode. Default: 0.
Valid values:
- 0: Automatic. When STT returns text, it interrupts TTS playback. Use this mode with InterruptSpeechDuration.
- 1: Manual. The bot is interrupted only by the Interrupt command from the server or client API.
- 2: Keyword.
     */
    public Long getInterruptMode() {
        return this.InterruptMode;
    }

    /**
     * Set Interrupt mode. Default: 0.
Valid values:
- 0: Automatic. When STT returns text, it interrupts TTS playback. Use this mode with InterruptSpeechDuration.
- 1: Manual. The bot is interrupted only by the Interrupt command from the server or client API.
- 2: Keyword.
     * @param InterruptMode Interrupt mode. Default: 0.
Valid values:
- 0: Automatic. When STT returns text, it interrupts TTS playback. Use this mode with InterruptSpeechDuration.
- 1: Manual. The bot is interrupted only by the Interrupt command from the server or client API.
- 2: Keyword.
     */
    public void setInterruptMode(Long InterruptMode) {
        this.InterruptMode = InterruptMode;
    }

    /**
     * Get Minimum duration of user speech that triggers an automatic interrupt. Default: 200. Unit: ms. 
     * @return InterruptSpeechDuration Minimum duration of user speech that triggers an automatic interrupt. Default: 200. Unit: ms.
     */
    public Long getInterruptSpeechDuration() {
        return this.InterruptSpeechDuration;
    }

    /**
     * Set Minimum duration of user speech that triggers an automatic interrupt. Default: 200. Unit: ms.
     * @param InterruptSpeechDuration Minimum duration of user speech that triggers an automatic interrupt. Default: 200. Unit: ms.
     */
    public void setInterruptSpeechDuration(Long InterruptSpeechDuration) {
        this.InterruptSpeechDuration = InterruptSpeechDuration;
    }

    /**
     * Get Preset keywords that interrupt the bot. Use them when the user must explicitly indicate the intent to interrupt. You can set up to 128 keywords. Applies only when `InterruptMode` is 2. 
     * @return InterruptKeywords Preset keywords that interrupt the bot. Use them when the user must explicitly indicate the intent to interrupt. You can set up to 128 keywords. Applies only when `InterruptMode` is 2.
     */
    public String [] getInterruptKeywords() {
        return this.InterruptKeywords;
    }

    /**
     * Set Preset keywords that interrupt the bot. Use them when the user must explicitly indicate the intent to interrupt. You can set up to 128 keywords. Applies only when `InterruptMode` is 2.
     * @param InterruptKeywords Preset keywords that interrupt the bot. Use them when the user must explicitly indicate the intent to interrupt. You can set up to 128 keywords. Applies only when `InterruptMode` is 2.
     */
    public void setInterruptKeywords(String [] InterruptKeywords) {
        this.InterruptKeywords = InterruptKeywords;
    }

    /**
     * Get How long the user is silent before the bot asks a follow-up question. Valid range: 0 to 300. 0 turns this off. Default: 0. Unit: seconds.

 
     * @return SilenceFollowUp How long the user is silent before the bot asks a follow-up question. Valid range: 0 to 300. 0 turns this off. Default: 0. Unit: seconds.


     */
    public Long getSilenceFollowUp() {
        return this.SilenceFollowUp;
    }

    /**
     * Set How long the user is silent before the bot asks a follow-up question. Valid range: 0 to 300. 0 turns this off. Default: 0. Unit: seconds.


     * @param SilenceFollowUp How long the user is silent before the bot asks a follow-up question. Valid range: 0 to 300. 0 turns this off. Default: 0. Unit: seconds.


     */
    public void setSilenceFollowUp(Long SilenceFollowUp) {
        this.SilenceFollowUp = SilenceFollowUp;
    }

    /**
     * Get <p>Text of the proactive follow-up question.</p> 
     * @return SilenceFollowUpText <p>Text of the proactive follow-up question.</p>
     */
    public String getSilenceFollowUpText() {
        return this.SilenceFollowUpText;
    }

    /**
     * Set <p>Text of the proactive follow-up question.</p>
     * @param SilenceFollowUpText <p>Text of the proactive follow-up question.</p>
     */
    public void setSilenceFollowUpText(String SilenceFollowUpText) {
        this.SilenceFollowUpText = SilenceFollowUpText;
    }

    /**
     * Get Welcome message the bot broadcasts when an anchor enters the room for the first time. It is broadcast again when the anchor leaves the room and enters again. 
     * @return WelcomeMessage Welcome message the bot broadcasts when an anchor enters the room for the first time. It is broadcast again when the anchor leaves the room and enters again.
     */
    public String getWelcomeMessage() {
        return this.WelcomeMessage;
    }

    /**
     * Set Welcome message the bot broadcasts when an anchor enters the room for the first time. It is broadcast again when the anchor leaves the room and enters again.
     * @param WelcomeMessage Welcome message the bot broadcasts when an anchor enters the room for the first time. It is broadcast again when the anchor leaves the room and enters again.
     */
    public void setWelcomeMessage(String WelcomeMessage) {
        this.WelcomeMessage = WelcomeMessage;
    }

    public VoiceConversationDialogConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConversationDialogConfig(VoiceConversationDialogConfig source) {
        if (source.InterruptMode != null) {
            this.InterruptMode = new Long(source.InterruptMode);
        }
        if (source.InterruptSpeechDuration != null) {
            this.InterruptSpeechDuration = new Long(source.InterruptSpeechDuration);
        }
        if (source.InterruptKeywords != null) {
            this.InterruptKeywords = new String[source.InterruptKeywords.length];
            for (int i = 0; i < source.InterruptKeywords.length; i++) {
                this.InterruptKeywords[i] = new String(source.InterruptKeywords[i]);
            }
        }
        if (source.SilenceFollowUp != null) {
            this.SilenceFollowUp = new Long(source.SilenceFollowUp);
        }
        if (source.SilenceFollowUpText != null) {
            this.SilenceFollowUpText = new String(source.SilenceFollowUpText);
        }
        if (source.WelcomeMessage != null) {
            this.WelcomeMessage = new String(source.WelcomeMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InterruptMode", this.InterruptMode);
        this.setParamSimple(map, prefix + "InterruptSpeechDuration", this.InterruptSpeechDuration);
        this.setParamArraySimple(map, prefix + "InterruptKeywords.", this.InterruptKeywords);
        this.setParamSimple(map, prefix + "SilenceFollowUp", this.SilenceFollowUp);
        this.setParamSimple(map, prefix + "SilenceFollowUpText", this.SilenceFollowUpText);
        this.setParamSimple(map, prefix + "WelcomeMessage", this.WelcomeMessage);

    }
}

