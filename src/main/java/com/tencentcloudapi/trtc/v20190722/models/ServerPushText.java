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

public class ServerPushText extends AbstractModel {

    /**
    * Server push broadcast text.
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
    * Broadcast the text and automatically close the dialogue task.
    */
    @SerializedName("StopAfterPlay")
    @Expose
    private Boolean StopAfterPlay;

    /**
    * Server push broadcast audio.
Format description: audio must be mono, sampling rate must be consistent with the corresponding TTS sampling rate, and coded as a Base64 string.
Input rule: when the Audio field is provided, the system will not accept user-submitted input in the Text field. the system will play the Audio content in the Audio field directly.
    */
    @SerializedName("Audio")
    @Expose
    private String Audio;

    /**
    * Defaults to 0. valid at that time only when Interrupt is false.
-0 means drop messages with Interrupt set to false during the occurrence of interaction.
-1 indicates that during the occurrence of an interaction, messages with Interrupt as false will not be dropped but cached, waiting to be processed when finished.

Note: if DropMode is 1, multiple messages can be cached. if an interruption occurs subsequently, the cache of messages will be cleared.
    */
    @SerializedName("DropMode")
    @Expose
    private Long DropMode;

    /**
    * The message priority of ServerPushText. 0 means interruptible, 1 means not interruptible. currently only support 0. if you need to input 1, submit a ticket to contact us to grant permission.
Note: after receiving a message with Priority=1, any other messages will be ignored (including messages with Priority=1) until the message processing of Priority=1 is complete. this field can be used together with the Interrupt and DropMode fields.
Example:.
-Priority=1, Interrupt=true, interrupts existing interaction and broadcasts immediately. the broadcast will not be interrupted during the process.
-Priority=1, Interrupt=false, DropMode=1. wait for the current interaction to complete before broadcasting. the broadcast will not be interrupted during the process.

    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Whether to add the text to the llm history context.
    */
    @SerializedName("AddHistory")
    @Expose
    private Boolean AddHistory;

    /**
    * If filled, it will be bound to the subtitle and sent to the terminal. note that the content must be a json string.
    */
    @SerializedName("MetaInfo")
    @Expose
    private String MetaInfo;

    /**
     * Get Server push broadcast text. 
     * @return Text Server push broadcast text.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Server push broadcast text.
     * @param Text Server push broadcast text.
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
     * Get Broadcast the text and automatically close the dialogue task. 
     * @return StopAfterPlay Broadcast the text and automatically close the dialogue task.
     */
    public Boolean getStopAfterPlay() {
        return this.StopAfterPlay;
    }

    /**
     * Set Broadcast the text and automatically close the dialogue task.
     * @param StopAfterPlay Broadcast the text and automatically close the dialogue task.
     */
    public void setStopAfterPlay(Boolean StopAfterPlay) {
        this.StopAfterPlay = StopAfterPlay;
    }

    /**
     * Get Server push broadcast audio.
Format description: audio must be mono, sampling rate must be consistent with the corresponding TTS sampling rate, and coded as a Base64 string.
Input rule: when the Audio field is provided, the system will not accept user-submitted input in the Text field. the system will play the Audio content in the Audio field directly. 
     * @return Audio Server push broadcast audio.
Format description: audio must be mono, sampling rate must be consistent with the corresponding TTS sampling rate, and coded as a Base64 string.
Input rule: when the Audio field is provided, the system will not accept user-submitted input in the Text field. the system will play the Audio content in the Audio field directly.
     */
    public String getAudio() {
        return this.Audio;
    }

    /**
     * Set Server push broadcast audio.
Format description: audio must be mono, sampling rate must be consistent with the corresponding TTS sampling rate, and coded as a Base64 string.
Input rule: when the Audio field is provided, the system will not accept user-submitted input in the Text field. the system will play the Audio content in the Audio field directly.
     * @param Audio Server push broadcast audio.
Format description: audio must be mono, sampling rate must be consistent with the corresponding TTS sampling rate, and coded as a Base64 string.
Input rule: when the Audio field is provided, the system will not accept user-submitted input in the Text field. the system will play the Audio content in the Audio field directly.
     */
    public void setAudio(String Audio) {
        this.Audio = Audio;
    }

    /**
     * Get Defaults to 0. valid at that time only when Interrupt is false.
-0 means drop messages with Interrupt set to false during the occurrence of interaction.
-1 indicates that during the occurrence of an interaction, messages with Interrupt as false will not be dropped but cached, waiting to be processed when finished.

Note: if DropMode is 1, multiple messages can be cached. if an interruption occurs subsequently, the cache of messages will be cleared. 
     * @return DropMode Defaults to 0. valid at that time only when Interrupt is false.
-0 means drop messages with Interrupt set to false during the occurrence of interaction.
-1 indicates that during the occurrence of an interaction, messages with Interrupt as false will not be dropped but cached, waiting to be processed when finished.

Note: if DropMode is 1, multiple messages can be cached. if an interruption occurs subsequently, the cache of messages will be cleared.
     */
    public Long getDropMode() {
        return this.DropMode;
    }

    /**
     * Set Defaults to 0. valid at that time only when Interrupt is false.
-0 means drop messages with Interrupt set to false during the occurrence of interaction.
-1 indicates that during the occurrence of an interaction, messages with Interrupt as false will not be dropped but cached, waiting to be processed when finished.

Note: if DropMode is 1, multiple messages can be cached. if an interruption occurs subsequently, the cache of messages will be cleared.
     * @param DropMode Defaults to 0. valid at that time only when Interrupt is false.
-0 means drop messages with Interrupt set to false during the occurrence of interaction.
-1 indicates that during the occurrence of an interaction, messages with Interrupt as false will not be dropped but cached, waiting to be processed when finished.

Note: if DropMode is 1, multiple messages can be cached. if an interruption occurs subsequently, the cache of messages will be cleared.
     */
    public void setDropMode(Long DropMode) {
        this.DropMode = DropMode;
    }

    /**
     * Get The message priority of ServerPushText. 0 means interruptible, 1 means not interruptible. currently only support 0. if you need to input 1, submit a ticket to contact us to grant permission.
Note: after receiving a message with Priority=1, any other messages will be ignored (including messages with Priority=1) until the message processing of Priority=1 is complete. this field can be used together with the Interrupt and DropMode fields.
Example:.
-Priority=1, Interrupt=true, interrupts existing interaction and broadcasts immediately. the broadcast will not be interrupted during the process.
-Priority=1, Interrupt=false, DropMode=1. wait for the current interaction to complete before broadcasting. the broadcast will not be interrupted during the process.
 
     * @return Priority The message priority of ServerPushText. 0 means interruptible, 1 means not interruptible. currently only support 0. if you need to input 1, submit a ticket to contact us to grant permission.
Note: after receiving a message with Priority=1, any other messages will be ignored (including messages with Priority=1) until the message processing of Priority=1 is complete. this field can be used together with the Interrupt and DropMode fields.
Example:.
-Priority=1, Interrupt=true, interrupts existing interaction and broadcasts immediately. the broadcast will not be interrupted during the process.
-Priority=1, Interrupt=false, DropMode=1. wait for the current interaction to complete before broadcasting. the broadcast will not be interrupted during the process.

     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set The message priority of ServerPushText. 0 means interruptible, 1 means not interruptible. currently only support 0. if you need to input 1, submit a ticket to contact us to grant permission.
Note: after receiving a message with Priority=1, any other messages will be ignored (including messages with Priority=1) until the message processing of Priority=1 is complete. this field can be used together with the Interrupt and DropMode fields.
Example:.
-Priority=1, Interrupt=true, interrupts existing interaction and broadcasts immediately. the broadcast will not be interrupted during the process.
-Priority=1, Interrupt=false, DropMode=1. wait for the current interaction to complete before broadcasting. the broadcast will not be interrupted during the process.

     * @param Priority The message priority of ServerPushText. 0 means interruptible, 1 means not interruptible. currently only support 0. if you need to input 1, submit a ticket to contact us to grant permission.
Note: after receiving a message with Priority=1, any other messages will be ignored (including messages with Priority=1) until the message processing of Priority=1 is complete. this field can be used together with the Interrupt and DropMode fields.
Example:.
-Priority=1, Interrupt=true, interrupts existing interaction and broadcasts immediately. the broadcast will not be interrupted during the process.
-Priority=1, Interrupt=false, DropMode=1. wait for the current interaction to complete before broadcasting. the broadcast will not be interrupted during the process.

     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Whether to add the text to the llm history context. 
     * @return AddHistory Whether to add the text to the llm history context.
     */
    public Boolean getAddHistory() {
        return this.AddHistory;
    }

    /**
     * Set Whether to add the text to the llm history context.
     * @param AddHistory Whether to add the text to the llm history context.
     */
    public void setAddHistory(Boolean AddHistory) {
        this.AddHistory = AddHistory;
    }

    /**
     * Get If filled, it will be bound to the subtitle and sent to the terminal. note that the content must be a json string. 
     * @return MetaInfo If filled, it will be bound to the subtitle and sent to the terminal. note that the content must be a json string.
     */
    public String getMetaInfo() {
        return this.MetaInfo;
    }

    /**
     * Set If filled, it will be bound to the subtitle and sent to the terminal. note that the content must be a json string.
     * @param MetaInfo If filled, it will be bound to the subtitle and sent to the terminal. note that the content must be a json string.
     */
    public void setMetaInfo(String MetaInfo) {
        this.MetaInfo = MetaInfo;
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
        if (source.MetaInfo != null) {
            this.MetaInfo = new String(source.MetaInfo);
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
        this.setParamSimple(map, prefix + "MetaInfo", this.MetaInfo);

    }
}

