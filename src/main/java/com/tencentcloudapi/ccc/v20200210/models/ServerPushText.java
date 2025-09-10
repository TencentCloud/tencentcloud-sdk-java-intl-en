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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerPushText extends AbstractModel {

    /**
    * Specifies the server push broadcast text.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Whether to allow the text to interrupt the robot's speaking.
    */
    @SerializedName("Interrupt")
    @Expose
    private Boolean Interrupt;

    /**
    * Specifies whether to automatically close the dialogue task after broadcasting the text.
    */
    @SerializedName("StopAfterPlay")
    @Expose
    private Boolean StopAfterPlay;

    /**
    * Specifies the server push broadcast audio.
Format description: audio must be mono, sampling rate should be consistent with the corresponding TTS, and coded as a Base64 string.
Input rules: when the Audio field is provided, the system will not accept input in the Text field. the system will play the Audio content in the Audio field directly.
    */
    @SerializedName("Audio")
    @Expose
    private String Audio;

    /**
    * Defaults to 0. valid only when Interrupt is false.
-0 indicates that messages with Interrupt set to false will be dropped when there is an interaction.
-Indicates that when there is an interaction in progress, messages with Interrupt set to false will not be dropped but cached and processed after the current interaction is completed.

Note: when DropMode is 1, the cache allows multiple messages. if an interruption occurs subsequently, cached messages will be cleared.
    */
    @SerializedName("DropMode")
    @Expose
    private Long DropMode;

    /**
    * Message priority of ServerPushText. 0 means interruptible. 1 means not interruptible.
Note: after receiving a message with Priority=1, any other messages will be ignored (including messages with Priority=1) until the message processing of Priority=1 is complete. this field can be used together with the Interrupt and DropMode fields.
Example.
-Priority=1, Interrupt=true. specifies to Interrupt existing interaction and broadcast immediately. the broadcast will not be interrupted during the process.
-Priority=1, Interrupt=false, DropMode=1. waits for the current interaction to complete before broadcasting. the broadcast will not be interrupted during the process.

    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Specifies whether the text is added to the llm history context.
    */
    @SerializedName("AddHistory")
    @Expose
    private Boolean AddHistory;

    /**
     * Get Specifies the server push broadcast text. 
     * @return Text Specifies the server push broadcast text.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Specifies the server push broadcast text.
     * @param Text Specifies the server push broadcast text.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Whether to allow the text to interrupt the robot's speaking. 
     * @return Interrupt Whether to allow the text to interrupt the robot's speaking.
     */
    public Boolean getInterrupt() {
        return this.Interrupt;
    }

    /**
     * Set Whether to allow the text to interrupt the robot's speaking.
     * @param Interrupt Whether to allow the text to interrupt the robot's speaking.
     */
    public void setInterrupt(Boolean Interrupt) {
        this.Interrupt = Interrupt;
    }

    /**
     * Get Specifies whether to automatically close the dialogue task after broadcasting the text. 
     * @return StopAfterPlay Specifies whether to automatically close the dialogue task after broadcasting the text.
     */
    public Boolean getStopAfterPlay() {
        return this.StopAfterPlay;
    }

    /**
     * Set Specifies whether to automatically close the dialogue task after broadcasting the text.
     * @param StopAfterPlay Specifies whether to automatically close the dialogue task after broadcasting the text.
     */
    public void setStopAfterPlay(Boolean StopAfterPlay) {
        this.StopAfterPlay = StopAfterPlay;
    }

    /**
     * Get Specifies the server push broadcast audio.
Format description: audio must be mono, sampling rate should be consistent with the corresponding TTS, and coded as a Base64 string.
Input rules: when the Audio field is provided, the system will not accept input in the Text field. the system will play the Audio content in the Audio field directly. 
     * @return Audio Specifies the server push broadcast audio.
Format description: audio must be mono, sampling rate should be consistent with the corresponding TTS, and coded as a Base64 string.
Input rules: when the Audio field is provided, the system will not accept input in the Text field. the system will play the Audio content in the Audio field directly.
     */
    public String getAudio() {
        return this.Audio;
    }

    /**
     * Set Specifies the server push broadcast audio.
Format description: audio must be mono, sampling rate should be consistent with the corresponding TTS, and coded as a Base64 string.
Input rules: when the Audio field is provided, the system will not accept input in the Text field. the system will play the Audio content in the Audio field directly.
     * @param Audio Specifies the server push broadcast audio.
Format description: audio must be mono, sampling rate should be consistent with the corresponding TTS, and coded as a Base64 string.
Input rules: when the Audio field is provided, the system will not accept input in the Text field. the system will play the Audio content in the Audio field directly.
     */
    public void setAudio(String Audio) {
        this.Audio = Audio;
    }

    /**
     * Get Defaults to 0. valid only when Interrupt is false.
-0 indicates that messages with Interrupt set to false will be dropped when there is an interaction.
-Indicates that when there is an interaction in progress, messages with Interrupt set to false will not be dropped but cached and processed after the current interaction is completed.

Note: when DropMode is 1, the cache allows multiple messages. if an interruption occurs subsequently, cached messages will be cleared. 
     * @return DropMode Defaults to 0. valid only when Interrupt is false.
-0 indicates that messages with Interrupt set to false will be dropped when there is an interaction.
-Indicates that when there is an interaction in progress, messages with Interrupt set to false will not be dropped but cached and processed after the current interaction is completed.

Note: when DropMode is 1, the cache allows multiple messages. if an interruption occurs subsequently, cached messages will be cleared.
     */
    public Long getDropMode() {
        return this.DropMode;
    }

    /**
     * Set Defaults to 0. valid only when Interrupt is false.
-0 indicates that messages with Interrupt set to false will be dropped when there is an interaction.
-Indicates that when there is an interaction in progress, messages with Interrupt set to false will not be dropped but cached and processed after the current interaction is completed.

Note: when DropMode is 1, the cache allows multiple messages. if an interruption occurs subsequently, cached messages will be cleared.
     * @param DropMode Defaults to 0. valid only when Interrupt is false.
-0 indicates that messages with Interrupt set to false will be dropped when there is an interaction.
-Indicates that when there is an interaction in progress, messages with Interrupt set to false will not be dropped but cached and processed after the current interaction is completed.

Note: when DropMode is 1, the cache allows multiple messages. if an interruption occurs subsequently, cached messages will be cleared.
     */
    public void setDropMode(Long DropMode) {
        this.DropMode = DropMode;
    }

    /**
     * Get Message priority of ServerPushText. 0 means interruptible. 1 means not interruptible.
Note: after receiving a message with Priority=1, any other messages will be ignored (including messages with Priority=1) until the message processing of Priority=1 is complete. this field can be used together with the Interrupt and DropMode fields.
Example.
-Priority=1, Interrupt=true. specifies to Interrupt existing interaction and broadcast immediately. the broadcast will not be interrupted during the process.
-Priority=1, Interrupt=false, DropMode=1. waits for the current interaction to complete before broadcasting. the broadcast will not be interrupted during the process.
 
     * @return Priority Message priority of ServerPushText. 0 means interruptible. 1 means not interruptible.
Note: after receiving a message with Priority=1, any other messages will be ignored (including messages with Priority=1) until the message processing of Priority=1 is complete. this field can be used together with the Interrupt and DropMode fields.
Example.
-Priority=1, Interrupt=true. specifies to Interrupt existing interaction and broadcast immediately. the broadcast will not be interrupted during the process.
-Priority=1, Interrupt=false, DropMode=1. waits for the current interaction to complete before broadcasting. the broadcast will not be interrupted during the process.

     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Message priority of ServerPushText. 0 means interruptible. 1 means not interruptible.
Note: after receiving a message with Priority=1, any other messages will be ignored (including messages with Priority=1) until the message processing of Priority=1 is complete. this field can be used together with the Interrupt and DropMode fields.
Example.
-Priority=1, Interrupt=true. specifies to Interrupt existing interaction and broadcast immediately. the broadcast will not be interrupted during the process.
-Priority=1, Interrupt=false, DropMode=1. waits for the current interaction to complete before broadcasting. the broadcast will not be interrupted during the process.

     * @param Priority Message priority of ServerPushText. 0 means interruptible. 1 means not interruptible.
Note: after receiving a message with Priority=1, any other messages will be ignored (including messages with Priority=1) until the message processing of Priority=1 is complete. this field can be used together with the Interrupt and DropMode fields.
Example.
-Priority=1, Interrupt=true. specifies to Interrupt existing interaction and broadcast immediately. the broadcast will not be interrupted during the process.
-Priority=1, Interrupt=false, DropMode=1. waits for the current interaction to complete before broadcasting. the broadcast will not be interrupted during the process.

     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Specifies whether the text is added to the llm history context. 
     * @return AddHistory Specifies whether the text is added to the llm history context.
     */
    public Boolean getAddHistory() {
        return this.AddHistory;
    }

    /**
     * Set Specifies whether the text is added to the llm history context.
     * @param AddHistory Specifies whether the text is added to the llm history context.
     */
    public void setAddHistory(Boolean AddHistory) {
        this.AddHistory = AddHistory;
    }

    public ServerPushText() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerPushText(ServerPushText source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Interrupt != null) {
            this.Interrupt = new Boolean(source.Interrupt);
        }
        if (source.StopAfterPlay != null) {
            this.StopAfterPlay = new Boolean(source.StopAfterPlay);
        }
        if (source.Audio != null) {
            this.Audio = new String(source.Audio);
        }
        if (source.DropMode != null) {
            this.DropMode = new Long(source.DropMode);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.AddHistory != null) {
            this.AddHistory = new Boolean(source.AddHistory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Interrupt", this.Interrupt);
        this.setParamSimple(map, prefix + "StopAfterPlay", this.StopAfterPlay);
        this.setParamSimple(map, prefix + "Audio", this.Audio);
        this.setParamSimple(map, prefix + "DropMode", this.DropMode);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "AddHistory", this.AddHistory);

    }
}

