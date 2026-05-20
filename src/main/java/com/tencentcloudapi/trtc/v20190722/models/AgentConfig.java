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

public class AgentConfig extends AbstractModel {

    /**
    * The robot's UserId is used to enter a room and initiate a task. note that this UserId cannot be duplicated with the host or audience [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#UserId) in the current room. if multiple tasks are initiated in a room, the robot's UserId cannot be mutually duplicated. otherwise, the previous task will be interrupted. ensure the robot's UserId is unique in the room.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Signature verification corresponding to the chatbot's UserId, namely, the UserId and UserSig serve as the login password for the chatbot to enter the room. for specific calculation methods, see TRTC solution for calculating [UserSig](https://www.tencentcloud.com/document/product/647/45910?from_cn_redirect=1#UserSig).
    */
    @SerializedName("UserSig")
    @Expose
    private String UserSig;

    /**
    * UserId for robot stream pulling. after fill, the robot performs stream pulling and processes in real time.
    */
    @SerializedName("TargetUserId")
    @Expose
    private String TargetUserId;

    /**
    * Exceeding MaxIdleTime in the room with no streaming automatically shuts down the backend task. default value is 60s.
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * Robot'S greeting.
    */
    @SerializedName("WelcomeMessage")
    @Expose
    private String WelcomeMessage;

    /**
    * Intelligent interruption mode, defaults to 0. 0 means server-side automatic interruption. 1 means the server does not interrupt, and the client sends an interruption signal to perform interruption.
    */
    @SerializedName("InterruptMode")
    @Expose
    private Long InterruptMode;

    /**
    * Used when InterruptMode is 0, in milliseconds, defaults to 500ms. indicates the server will interrupt when it detects continuous voice for InterruptSpeechDuration milliseconds.
    */
    @SerializedName("InterruptSpeechDuration")
    @Expose
    private Long InterruptSpeechDuration;

    /**
    * Controls the trigger mode for a new dialogue. default is 0.
-0 means a new dialogue is automatically triggered when the server detects a complete sentence through automatic speech recognition.
-1 indicates the client determines whether to manually send a chat signaling trigger for a new dialogue upon receiving the caption message.
    */
    @SerializedName("TurnDetectionMode")
    @Expose
    private Long TurnDetectionMode;

    /**
    * Whether to filter out sentences where the user only says one word. true indicates filtering, false indicates no filtering. default value is true.
    */
    @SerializedName("FilterOneWord")
    @Expose
    private Boolean FilterOneWord;

    /**
    * Welcome message priority. valid values: 0 (default), 1 (high priority). high priority messages cannot be interrupted.
    */
    @SerializedName("WelcomeMessagePriority")
    @Expose
    private Long WelcomeMessagePriority;

    /**
    * For filtering LLM return content, do not play the content in brackets.
Chinese bracket ().
2: english parentheses.
3: chinese square brackets [].
4: english square brackets [].
5: english curly braces {}.
Empty by default, means no filtering.
    */
    @SerializedName("FilterBracketsContent")
    @Expose
    private Long FilterBracketsContent;

    /**
    * Ambient sound settings.
    */
    @SerializedName("AmbientSound")
    @Expose
    private AmbientSound AmbientSound;

    /**
    * Voiceprint configuration.
    */
    @SerializedName("VoicePrint")
    @Expose
    private VoicePrint VoicePrint;

    /**
    * Semantic sentence segmentation detection.
    */
    @SerializedName("TurnDetection")
    @Expose
    private TurnDetection TurnDetection;

    /**
    * Robot subtitle display mode.
-0 means display as soon as possible without synchronizing with audio playback. at this point, subtitles are fully delivered, and subsequent subtitles will include previous ones.
-1 indicates sentence-level real-time display, which synchronizes with audio playback. only when the current sentence's corresponding audio playback is complete will the next subtitle be delivered. at this point, subtitles are delivered incrementally, and the terminal needs to concatenate the leading and trailing subtitles to form a complete subtitle.
    */
    @SerializedName("SubtitleMode")
    @Expose
    private Long SubtitleMode;

    /**
    * Interruption word list. during AI speaking, only speak words in the list to interrupt AI speaking.
Note: interrupt words avoid triggering AI reply.
    */
    @SerializedName("InterruptWordList")
    @Expose
    private String [] InterruptWordList;

    /**
     * Get The robot's UserId is used to enter a room and initiate a task. note that this UserId cannot be duplicated with the host or audience [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#UserId) in the current room. if multiple tasks are initiated in a room, the robot's UserId cannot be mutually duplicated. otherwise, the previous task will be interrupted. ensure the robot's UserId is unique in the room. 
     * @return UserId The robot's UserId is used to enter a room and initiate a task. note that this UserId cannot be duplicated with the host or audience [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#UserId) in the current room. if multiple tasks are initiated in a room, the robot's UserId cannot be mutually duplicated. otherwise, the previous task will be interrupted. ensure the robot's UserId is unique in the room.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set The robot's UserId is used to enter a room and initiate a task. note that this UserId cannot be duplicated with the host or audience [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#UserId) in the current room. if multiple tasks are initiated in a room, the robot's UserId cannot be mutually duplicated. otherwise, the previous task will be interrupted. ensure the robot's UserId is unique in the room.
     * @param UserId The robot's UserId is used to enter a room and initiate a task. note that this UserId cannot be duplicated with the host or audience [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#UserId) in the current room. if multiple tasks are initiated in a room, the robot's UserId cannot be mutually duplicated. otherwise, the previous task will be interrupted. ensure the robot's UserId is unique in the room.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Signature verification corresponding to the chatbot's UserId, namely, the UserId and UserSig serve as the login password for the chatbot to enter the room. for specific calculation methods, see TRTC solution for calculating [UserSig](https://www.tencentcloud.com/document/product/647/45910?from_cn_redirect=1#UserSig). 
     * @return UserSig Signature verification corresponding to the chatbot's UserId, namely, the UserId and UserSig serve as the login password for the chatbot to enter the room. for specific calculation methods, see TRTC solution for calculating [UserSig](https://www.tencentcloud.com/document/product/647/45910?from_cn_redirect=1#UserSig).
     */
    public String getUserSig() {
        return this.UserSig;
    }

    /**
     * Set Signature verification corresponding to the chatbot's UserId, namely, the UserId and UserSig serve as the login password for the chatbot to enter the room. for specific calculation methods, see TRTC solution for calculating [UserSig](https://www.tencentcloud.com/document/product/647/45910?from_cn_redirect=1#UserSig).
     * @param UserSig Signature verification corresponding to the chatbot's UserId, namely, the UserId and UserSig serve as the login password for the chatbot to enter the room. for specific calculation methods, see TRTC solution for calculating [UserSig](https://www.tencentcloud.com/document/product/647/45910?from_cn_redirect=1#UserSig).
     */
    public void setUserSig(String UserSig) {
        this.UserSig = UserSig;
    }

    /**
     * Get UserId for robot stream pulling. after fill, the robot performs stream pulling and processes in real time. 
     * @return TargetUserId UserId for robot stream pulling. after fill, the robot performs stream pulling and processes in real time.
     */
    public String getTargetUserId() {
        return this.TargetUserId;
    }

    /**
     * Set UserId for robot stream pulling. after fill, the robot performs stream pulling and processes in real time.
     * @param TargetUserId UserId for robot stream pulling. after fill, the robot performs stream pulling and processes in real time.
     */
    public void setTargetUserId(String TargetUserId) {
        this.TargetUserId = TargetUserId;
    }

    /**
     * Get Exceeding MaxIdleTime in the room with no streaming automatically shuts down the backend task. default value is 60s. 
     * @return MaxIdleTime Exceeding MaxIdleTime in the room with no streaming automatically shuts down the backend task. default value is 60s.
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set Exceeding MaxIdleTime in the room with no streaming automatically shuts down the backend task. default value is 60s.
     * @param MaxIdleTime Exceeding MaxIdleTime in the room with no streaming automatically shuts down the backend task. default value is 60s.
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get Robot'S greeting. 
     * @return WelcomeMessage Robot'S greeting.
     */
    public String getWelcomeMessage() {
        return this.WelcomeMessage;
    }

    /**
     * Set Robot'S greeting.
     * @param WelcomeMessage Robot'S greeting.
     */
    public void setWelcomeMessage(String WelcomeMessage) {
        this.WelcomeMessage = WelcomeMessage;
    }

    /**
     * Get Intelligent interruption mode, defaults to 0. 0 means server-side automatic interruption. 1 means the server does not interrupt, and the client sends an interruption signal to perform interruption. 
     * @return InterruptMode Intelligent interruption mode, defaults to 0. 0 means server-side automatic interruption. 1 means the server does not interrupt, and the client sends an interruption signal to perform interruption.
     */
    public Long getInterruptMode() {
        return this.InterruptMode;
    }

    /**
     * Set Intelligent interruption mode, defaults to 0. 0 means server-side automatic interruption. 1 means the server does not interrupt, and the client sends an interruption signal to perform interruption.
     * @param InterruptMode Intelligent interruption mode, defaults to 0. 0 means server-side automatic interruption. 1 means the server does not interrupt, and the client sends an interruption signal to perform interruption.
     */
    public void setInterruptMode(Long InterruptMode) {
        this.InterruptMode = InterruptMode;
    }

    /**
     * Get Used when InterruptMode is 0, in milliseconds, defaults to 500ms. indicates the server will interrupt when it detects continuous voice for InterruptSpeechDuration milliseconds. 
     * @return InterruptSpeechDuration Used when InterruptMode is 0, in milliseconds, defaults to 500ms. indicates the server will interrupt when it detects continuous voice for InterruptSpeechDuration milliseconds.
     */
    public Long getInterruptSpeechDuration() {
        return this.InterruptSpeechDuration;
    }

    /**
     * Set Used when InterruptMode is 0, in milliseconds, defaults to 500ms. indicates the server will interrupt when it detects continuous voice for InterruptSpeechDuration milliseconds.
     * @param InterruptSpeechDuration Used when InterruptMode is 0, in milliseconds, defaults to 500ms. indicates the server will interrupt when it detects continuous voice for InterruptSpeechDuration milliseconds.
     */
    public void setInterruptSpeechDuration(Long InterruptSpeechDuration) {
        this.InterruptSpeechDuration = InterruptSpeechDuration;
    }

    /**
     * Get Controls the trigger mode for a new dialogue. default is 0.
-0 means a new dialogue is automatically triggered when the server detects a complete sentence through automatic speech recognition.
-1 indicates the client determines whether to manually send a chat signaling trigger for a new dialogue upon receiving the caption message. 
     * @return TurnDetectionMode Controls the trigger mode for a new dialogue. default is 0.
-0 means a new dialogue is automatically triggered when the server detects a complete sentence through automatic speech recognition.
-1 indicates the client determines whether to manually send a chat signaling trigger for a new dialogue upon receiving the caption message.
     */
    public Long getTurnDetectionMode() {
        return this.TurnDetectionMode;
    }

    /**
     * Set Controls the trigger mode for a new dialogue. default is 0.
-0 means a new dialogue is automatically triggered when the server detects a complete sentence through automatic speech recognition.
-1 indicates the client determines whether to manually send a chat signaling trigger for a new dialogue upon receiving the caption message.
     * @param TurnDetectionMode Controls the trigger mode for a new dialogue. default is 0.
-0 means a new dialogue is automatically triggered when the server detects a complete sentence through automatic speech recognition.
-1 indicates the client determines whether to manually send a chat signaling trigger for a new dialogue upon receiving the caption message.
     */
    public void setTurnDetectionMode(Long TurnDetectionMode) {
        this.TurnDetectionMode = TurnDetectionMode;
    }

    /**
     * Get Whether to filter out sentences where the user only says one word. true indicates filtering, false indicates no filtering. default value is true. 
     * @return FilterOneWord Whether to filter out sentences where the user only says one word. true indicates filtering, false indicates no filtering. default value is true.
     */
    public Boolean getFilterOneWord() {
        return this.FilterOneWord;
    }

    /**
     * Set Whether to filter out sentences where the user only says one word. true indicates filtering, false indicates no filtering. default value is true.
     * @param FilterOneWord Whether to filter out sentences where the user only says one word. true indicates filtering, false indicates no filtering. default value is true.
     */
    public void setFilterOneWord(Boolean FilterOneWord) {
        this.FilterOneWord = FilterOneWord;
    }

    /**
     * Get Welcome message priority. valid values: 0 (default), 1 (high priority). high priority messages cannot be interrupted. 
     * @return WelcomeMessagePriority Welcome message priority. valid values: 0 (default), 1 (high priority). high priority messages cannot be interrupted.
     */
    public Long getWelcomeMessagePriority() {
        return this.WelcomeMessagePriority;
    }

    /**
     * Set Welcome message priority. valid values: 0 (default), 1 (high priority). high priority messages cannot be interrupted.
     * @param WelcomeMessagePriority Welcome message priority. valid values: 0 (default), 1 (high priority). high priority messages cannot be interrupted.
     */
    public void setWelcomeMessagePriority(Long WelcomeMessagePriority) {
        this.WelcomeMessagePriority = WelcomeMessagePriority;
    }

    /**
     * Get For filtering LLM return content, do not play the content in brackets.
Chinese bracket ().
2: english parentheses.
3: chinese square brackets [].
4: english square brackets [].
5: english curly braces {}.
Empty by default, means no filtering. 
     * @return FilterBracketsContent For filtering LLM return content, do not play the content in brackets.
Chinese bracket ().
2: english parentheses.
3: chinese square brackets [].
4: english square brackets [].
5: english curly braces {}.
Empty by default, means no filtering.
     */
    public Long getFilterBracketsContent() {
        return this.FilterBracketsContent;
    }

    /**
     * Set For filtering LLM return content, do not play the content in brackets.
Chinese bracket ().
2: english parentheses.
3: chinese square brackets [].
4: english square brackets [].
5: english curly braces {}.
Empty by default, means no filtering.
     * @param FilterBracketsContent For filtering LLM return content, do not play the content in brackets.
Chinese bracket ().
2: english parentheses.
3: chinese square brackets [].
4: english square brackets [].
5: english curly braces {}.
Empty by default, means no filtering.
     */
    public void setFilterBracketsContent(Long FilterBracketsContent) {
        this.FilterBracketsContent = FilterBracketsContent;
    }

    /**
     * Get Ambient sound settings. 
     * @return AmbientSound Ambient sound settings.
     */
    public AmbientSound getAmbientSound() {
        return this.AmbientSound;
    }

    /**
     * Set Ambient sound settings.
     * @param AmbientSound Ambient sound settings.
     */
    public void setAmbientSound(AmbientSound AmbientSound) {
        this.AmbientSound = AmbientSound;
    }

    /**
     * Get Voiceprint configuration. 
     * @return VoicePrint Voiceprint configuration.
     */
    public VoicePrint getVoicePrint() {
        return this.VoicePrint;
    }

    /**
     * Set Voiceprint configuration.
     * @param VoicePrint Voiceprint configuration.
     */
    public void setVoicePrint(VoicePrint VoicePrint) {
        this.VoicePrint = VoicePrint;
    }

    /**
     * Get Semantic sentence segmentation detection. 
     * @return TurnDetection Semantic sentence segmentation detection.
     */
    public TurnDetection getTurnDetection() {
        return this.TurnDetection;
    }

    /**
     * Set Semantic sentence segmentation detection.
     * @param TurnDetection Semantic sentence segmentation detection.
     */
    public void setTurnDetection(TurnDetection TurnDetection) {
        this.TurnDetection = TurnDetection;
    }

    /**
     * Get Robot subtitle display mode.
-0 means display as soon as possible without synchronizing with audio playback. at this point, subtitles are fully delivered, and subsequent subtitles will include previous ones.
-1 indicates sentence-level real-time display, which synchronizes with audio playback. only when the current sentence's corresponding audio playback is complete will the next subtitle be delivered. at this point, subtitles are delivered incrementally, and the terminal needs to concatenate the leading and trailing subtitles to form a complete subtitle. 
     * @return SubtitleMode Robot subtitle display mode.
-0 means display as soon as possible without synchronizing with audio playback. at this point, subtitles are fully delivered, and subsequent subtitles will include previous ones.
-1 indicates sentence-level real-time display, which synchronizes with audio playback. only when the current sentence's corresponding audio playback is complete will the next subtitle be delivered. at this point, subtitles are delivered incrementally, and the terminal needs to concatenate the leading and trailing subtitles to form a complete subtitle.
     */
    public Long getSubtitleMode() {
        return this.SubtitleMode;
    }

    /**
     * Set Robot subtitle display mode.
-0 means display as soon as possible without synchronizing with audio playback. at this point, subtitles are fully delivered, and subsequent subtitles will include previous ones.
-1 indicates sentence-level real-time display, which synchronizes with audio playback. only when the current sentence's corresponding audio playback is complete will the next subtitle be delivered. at this point, subtitles are delivered incrementally, and the terminal needs to concatenate the leading and trailing subtitles to form a complete subtitle.
     * @param SubtitleMode Robot subtitle display mode.
-0 means display as soon as possible without synchronizing with audio playback. at this point, subtitles are fully delivered, and subsequent subtitles will include previous ones.
-1 indicates sentence-level real-time display, which synchronizes with audio playback. only when the current sentence's corresponding audio playback is complete will the next subtitle be delivered. at this point, subtitles are delivered incrementally, and the terminal needs to concatenate the leading and trailing subtitles to form a complete subtitle.
     */
    public void setSubtitleMode(Long SubtitleMode) {
        this.SubtitleMode = SubtitleMode;
    }

    /**
     * Get Interruption word list. during AI speaking, only speak words in the list to interrupt AI speaking.
Note: interrupt words avoid triggering AI reply. 
     * @return InterruptWordList Interruption word list. during AI speaking, only speak words in the list to interrupt AI speaking.
Note: interrupt words avoid triggering AI reply.
     */
    public String [] getInterruptWordList() {
        return this.InterruptWordList;
    }

    /**
     * Set Interruption word list. during AI speaking, only speak words in the list to interrupt AI speaking.
Note: interrupt words avoid triggering AI reply.
     * @param InterruptWordList Interruption word list. during AI speaking, only speak words in the list to interrupt AI speaking.
Note: interrupt words avoid triggering AI reply.
     */
    public void setInterruptWordList(String [] InterruptWordList) {
        this.InterruptWordList = InterruptWordList;
    }

    public AgentConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentConfig(AgentConfig source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserSig != null) {
            this.UserSig = new String(source.UserSig);
        }
        if (source.TargetUserId != null) {
            this.TargetUserId = new String(source.TargetUserId);
        }
        if (source.MaxIdleTime != null) {
            this.MaxIdleTime = new Long(source.MaxIdleTime);
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
        if (source.TurnDetectionMode != null) {
            this.TurnDetectionMode = new Long(source.TurnDetectionMode);
        }
        if (source.FilterOneWord != null) {
            this.FilterOneWord = new Boolean(source.FilterOneWord);
        }
        if (source.WelcomeMessagePriority != null) {
            this.WelcomeMessagePriority = new Long(source.WelcomeMessagePriority);
        }
        if (source.FilterBracketsContent != null) {
            this.FilterBracketsContent = new Long(source.FilterBracketsContent);
        }
        if (source.AmbientSound != null) {
            this.AmbientSound = new AmbientSound(source.AmbientSound);
        }
        if (source.VoicePrint != null) {
            this.VoicePrint = new VoicePrint(source.VoicePrint);
        }
        if (source.TurnDetection != null) {
            this.TurnDetection = new TurnDetection(source.TurnDetection);
        }
        if (source.SubtitleMode != null) {
            this.SubtitleMode = new Long(source.SubtitleMode);
        }
        if (source.InterruptWordList != null) {
            this.InterruptWordList = new String[source.InterruptWordList.length];
            for (int i = 0; i < source.InterruptWordList.length; i++) {
                this.InterruptWordList[i] = new String(source.InterruptWordList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserSig", this.UserSig);
        this.setParamSimple(map, prefix + "TargetUserId", this.TargetUserId);
        this.setParamSimple(map, prefix + "MaxIdleTime", this.MaxIdleTime);
        this.setParamSimple(map, prefix + "WelcomeMessage", this.WelcomeMessage);
        this.setParamSimple(map, prefix + "InterruptMode", this.InterruptMode);
        this.setParamSimple(map, prefix + "InterruptSpeechDuration", this.InterruptSpeechDuration);
        this.setParamSimple(map, prefix + "TurnDetectionMode", this.TurnDetectionMode);
        this.setParamSimple(map, prefix + "FilterOneWord", this.FilterOneWord);
        this.setParamSimple(map, prefix + "WelcomeMessagePriority", this.WelcomeMessagePriority);
        this.setParamSimple(map, prefix + "FilterBracketsContent", this.FilterBracketsContent);
        this.setParamObj(map, prefix + "AmbientSound.", this.AmbientSound);
        this.setParamObj(map, prefix + "VoicePrint.", this.VoicePrint);
        this.setParamObj(map, prefix + "TurnDetection.", this.TurnDetection);
        this.setParamSimple(map, prefix + "SubtitleMode", this.SubtitleMode);
        this.setParamArraySimple(map, prefix + "InterruptWordList.", this.InterruptWordList);

    }
}

