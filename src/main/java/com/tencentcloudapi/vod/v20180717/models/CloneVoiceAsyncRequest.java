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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneVoiceAsyncRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 
    */
    @SerializedName("AudioData")
    @Expose
    private String AudioData;

    /**
    * 
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * 
    */
    @SerializedName("AudioFileId")
    @Expose
    private String AudioFileId;

    /**
    * 
    */
    @SerializedName("LanguageBoost")
    @Expose
    private String LanguageBoost;

    /**
    * <p>Voice clone expansion parameters. Fields supported by <code>ExtParam</code>:</p><ul>  <li><code>text</code> (string): Audition synthesis text, up to <code>1000</code> characters. When not empty, <code>tts_model</code> must be passed simultaneously. After the clone is successful, the audition audio <code>DemoAudio</code> is returned.</li>  <li><code>model</code> (string): Clone model. Default: <code>minimax-voice-clone</code>.</li>  <li><code>tts_model</code> (string): Model used to synthesize the audition audio. Options: <code>minimax-speech-2.8-hd</code>, <code>minimax-speech-2.8-turbo</code>, <code>minimax-speech-2.6-hd</code>, <code>minimax-speech-2.6-turbo</code>, <code>minimax-speech-02-hd</code>, <code>minimax-speech-02-turbo</code>. Required when <code>text</code> is not empty.</li>  <li><code>text_lang</code> (string): Language of the audition text.</li>  <li><code>voice_profile</code> (object): Voice profile. Optional fields:    <ul>      <li><code>name</code> (string): Timbre name.</li>      <li><code>description</code> (string): Timbre description.</li>      <li><code>gender</code> (string): Gender. Options: <code>male</code> / <code>female</code> / <code>unknown</code>.</li>      <li><code>age</code> (string): Age segment. Options: <code>child</code> / <code>teenager</code> / <code>youth</code> / <code>middle_aged</code> / <code>senior</code> / <code>unknown</code>.</li>      <li><code>languages</code> (string[]): Supported languages, such as <code>["zh", "en"]</code>.</li>      <li><code>labels</code> (string[]): Timbre tags, such as <code>["magnetic"]</code>.</li>      <li><code>scenes</code> (string[]): Application scenarios, such as <code>["commentate"]</code>.</li>    </ul>  </li></ul>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
    * 
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get  
     * @return SubAppId 
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return AudioData 
     */
    public String getAudioData() {
        return this.AudioData;
    }

    /**
     * Set 
     * @param AudioData 
     */
    public void setAudioData(String AudioData) {
        this.AudioData = AudioData;
    }

    /**
     * Get  
     * @return AudioUrl 
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set 
     * @param AudioUrl 
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get  
     * @return AudioFileId 
     */
    public String getAudioFileId() {
        return this.AudioFileId;
    }

    /**
     * Set 
     * @param AudioFileId 
     */
    public void setAudioFileId(String AudioFileId) {
        this.AudioFileId = AudioFileId;
    }

    /**
     * Get  
     * @return LanguageBoost 
     */
    public String getLanguageBoost() {
        return this.LanguageBoost;
    }

    /**
     * Set 
     * @param LanguageBoost 
     */
    public void setLanguageBoost(String LanguageBoost) {
        this.LanguageBoost = LanguageBoost;
    }

    /**
     * Get <p>Voice clone expansion parameters. Fields supported by <code>ExtParam</code>:</p><ul>  <li><code>text</code> (string): Audition synthesis text, up to <code>1000</code> characters. When not empty, <code>tts_model</code> must be passed simultaneously. After the clone is successful, the audition audio <code>DemoAudio</code> is returned.</li>  <li><code>model</code> (string): Clone model. Default: <code>minimax-voice-clone</code>.</li>  <li><code>tts_model</code> (string): Model used to synthesize the audition audio. Options: <code>minimax-speech-2.8-hd</code>, <code>minimax-speech-2.8-turbo</code>, <code>minimax-speech-2.6-hd</code>, <code>minimax-speech-2.6-turbo</code>, <code>minimax-speech-02-hd</code>, <code>minimax-speech-02-turbo</code>. Required when <code>text</code> is not empty.</li>  <li><code>text_lang</code> (string): Language of the audition text.</li>  <li><code>voice_profile</code> (object): Voice profile. Optional fields:    <ul>      <li><code>name</code> (string): Timbre name.</li>      <li><code>description</code> (string): Timbre description.</li>      <li><code>gender</code> (string): Gender. Options: <code>male</code> / <code>female</code> / <code>unknown</code>.</li>      <li><code>age</code> (string): Age segment. Options: <code>child</code> / <code>teenager</code> / <code>youth</code> / <code>middle_aged</code> / <code>senior</code> / <code>unknown</code>.</li>      <li><code>languages</code> (string[]): Supported languages, such as <code>["zh", "en"]</code>.</li>      <li><code>labels</code> (string[]): Timbre tags, such as <code>["magnetic"]</code>.</li>      <li><code>scenes</code> (string[]): Application scenarios, such as <code>["commentate"]</code>.</li>    </ul>  </li></ul> 
     * @return ExtParam <p>Voice clone expansion parameters. Fields supported by <code>ExtParam</code>:</p><ul>  <li><code>text</code> (string): Audition synthesis text, up to <code>1000</code> characters. When not empty, <code>tts_model</code> must be passed simultaneously. After the clone is successful, the audition audio <code>DemoAudio</code> is returned.</li>  <li><code>model</code> (string): Clone model. Default: <code>minimax-voice-clone</code>.</li>  <li><code>tts_model</code> (string): Model used to synthesize the audition audio. Options: <code>minimax-speech-2.8-hd</code>, <code>minimax-speech-2.8-turbo</code>, <code>minimax-speech-2.6-hd</code>, <code>minimax-speech-2.6-turbo</code>, <code>minimax-speech-02-hd</code>, <code>minimax-speech-02-turbo</code>. Required when <code>text</code> is not empty.</li>  <li><code>text_lang</code> (string): Language of the audition text.</li>  <li><code>voice_profile</code> (object): Voice profile. Optional fields:    <ul>      <li><code>name</code> (string): Timbre name.</li>      <li><code>description</code> (string): Timbre description.</li>      <li><code>gender</code> (string): Gender. Options: <code>male</code> / <code>female</code> / <code>unknown</code>.</li>      <li><code>age</code> (string): Age segment. Options: <code>child</code> / <code>teenager</code> / <code>youth</code> / <code>middle_aged</code> / <code>senior</code> / <code>unknown</code>.</li>      <li><code>languages</code> (string[]): Supported languages, such as <code>["zh", "en"]</code>.</li>      <li><code>labels</code> (string[]): Timbre tags, such as <code>["magnetic"]</code>.</li>      <li><code>scenes</code> (string[]): Application scenarios, such as <code>["commentate"]</code>.</li>    </ul>  </li></ul>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>Voice clone expansion parameters. Fields supported by <code>ExtParam</code>:</p><ul>  <li><code>text</code> (string): Audition synthesis text, up to <code>1000</code> characters. When not empty, <code>tts_model</code> must be passed simultaneously. After the clone is successful, the audition audio <code>DemoAudio</code> is returned.</li>  <li><code>model</code> (string): Clone model. Default: <code>minimax-voice-clone</code>.</li>  <li><code>tts_model</code> (string): Model used to synthesize the audition audio. Options: <code>minimax-speech-2.8-hd</code>, <code>minimax-speech-2.8-turbo</code>, <code>minimax-speech-2.6-hd</code>, <code>minimax-speech-2.6-turbo</code>, <code>minimax-speech-02-hd</code>, <code>minimax-speech-02-turbo</code>. Required when <code>text</code> is not empty.</li>  <li><code>text_lang</code> (string): Language of the audition text.</li>  <li><code>voice_profile</code> (object): Voice profile. Optional fields:    <ul>      <li><code>name</code> (string): Timbre name.</li>      <li><code>description</code> (string): Timbre description.</li>      <li><code>gender</code> (string): Gender. Options: <code>male</code> / <code>female</code> / <code>unknown</code>.</li>      <li><code>age</code> (string): Age segment. Options: <code>child</code> / <code>teenager</code> / <code>youth</code> / <code>middle_aged</code> / <code>senior</code> / <code>unknown</code>.</li>      <li><code>languages</code> (string[]): Supported languages, such as <code>["zh", "en"]</code>.</li>      <li><code>labels</code> (string[]): Timbre tags, such as <code>["magnetic"]</code>.</li>      <li><code>scenes</code> (string[]): Application scenarios, such as <code>["commentate"]</code>.</li>    </ul>  </li></ul>
     * @param ExtParam <p>Voice clone expansion parameters. Fields supported by <code>ExtParam</code>:</p><ul>  <li><code>text</code> (string): Audition synthesis text, up to <code>1000</code> characters. When not empty, <code>tts_model</code> must be passed simultaneously. After the clone is successful, the audition audio <code>DemoAudio</code> is returned.</li>  <li><code>model</code> (string): Clone model. Default: <code>minimax-voice-clone</code>.</li>  <li><code>tts_model</code> (string): Model used to synthesize the audition audio. Options: <code>minimax-speech-2.8-hd</code>, <code>minimax-speech-2.8-turbo</code>, <code>minimax-speech-2.6-hd</code>, <code>minimax-speech-2.6-turbo</code>, <code>minimax-speech-02-hd</code>, <code>minimax-speech-02-turbo</code>. Required when <code>text</code> is not empty.</li>  <li><code>text_lang</code> (string): Language of the audition text.</li>  <li><code>voice_profile</code> (object): Voice profile. Optional fields:    <ul>      <li><code>name</code> (string): Timbre name.</li>      <li><code>description</code> (string): Timbre description.</li>      <li><code>gender</code> (string): Gender. Options: <code>male</code> / <code>female</code> / <code>unknown</code>.</li>      <li><code>age</code> (string): Age segment. Options: <code>child</code> / <code>teenager</code> / <code>youth</code> / <code>middle_aged</code> / <code>senior</code> / <code>unknown</code>.</li>      <li><code>languages</code> (string[]): Supported languages, such as <code>["zh", "en"]</code>.</li>      <li><code>labels</code> (string[]): Timbre tags, such as <code>["magnetic"]</code>.</li>      <li><code>scenes</code> (string[]): Application scenarios, such as <code>["commentate"]</code>.</li>    </ul>  </li></ul>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    /**
     * Get  
     * @return SessionContext 
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 
     * @param SessionContext 
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get  
     * @return SessionId 
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 
     * @param SessionId 
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public CloneVoiceAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneVoiceAsyncRequest(CloneVoiceAsyncRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.AudioData != null) {
            this.AudioData = new String(source.AudioData);
        }
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
        }
        if (source.AudioFileId != null) {
            this.AudioFileId = new String(source.AudioFileId);
        }
        if (source.LanguageBoost != null) {
            this.LanguageBoost = new String(source.LanguageBoost);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "AudioData", this.AudioData);
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamSimple(map, prefix + "AudioFileId", this.AudioFileId);
        this.setParamSimple(map, prefix + "LanguageBoost", this.LanguageBoost);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

