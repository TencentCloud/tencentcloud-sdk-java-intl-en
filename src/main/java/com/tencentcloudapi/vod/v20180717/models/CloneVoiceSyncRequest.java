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

public class CloneVoiceSyncRequest extends AbstractModel {

    /**
    * <p>VOD application ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</p>
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * <p>Base64-encoded audio for cloning.</p>
    */
    @SerializedName("AudioData")
    @Expose
    private String AudioData;

    /**
    * <p>Cloning audio URL. Valid when AudioData is empty.</p>
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * <p>Clone file FileID. Valid when AudioData and AudioUrl are empty</p>
    */
    @SerializedName("AudioFileId")
    @Expose
    private String AudioFileId;

    /**
    * <p>Language enhancement, such as "zh" "en" "auto", default "auto"</p>
    */
    @SerializedName("LanguageBoost")
    @Expose
    private String LanguageBoost;

    /**
    * <p>Extended parameters for synchronous timbre clone. Supported fields of <code>ExtParam</code>:</p><ul>  <li><code>text</code> (string): Text for audition synthesis, up to <code>1000</code> characters. If not empty, <code>tts_model</code> must be passed simultaneously. Upon successful clone, the audition audio <code>DemoAudio</code> is returned.</li>  <li><code>model</code> (string): Clone model. Default: <code>minimax-voice-clone</code>.</li>  <li><code>tts_model</code> (string): Model used to synthesize the audition audio. Options: <code>minimax-speech-2.8-hd</code>, <code>minimax-speech-2.8-turbo</code>, <code>minimax-speech-2.6-hd</code>, <code>minimax-speech-2.6-turbo</code>, <code>minimax-speech-02-hd</code>, <code>minimax-speech-02-turbo</code>. Required if <code>text</code> is not empty.</li>  <li><code>text_lang</code> (string): Language of the audition text.</li>  <li><code>voice_profile</code> (object): Timbre profile. Optional fields:    <ul>      <li><code>name</code> (string): Timbre name.</li>      <li><code>description</code> (string): Timbre description.</li>      <li><code>gender</code> (string): Gender. Options: <code>male</code> / <code>female</code> / <code>unknown</code>.</li>      <li><code>age</code> (string): Age segment. Options: <code>child</code> / <code>teenager</code> / <code>youth</code> / <code>middle_aged</code> / <code>senior</code> / <code>unknown</code>.</li>      <li><code>languages</code> (string[]): Supported languages, for example <code>["zh", "en"]</code>.</li>      <li><code>labels</code> (string[]): Timbre tags, for example <code>["magnetic"]</code>.</li>      <li><code>scenes</code> (string[]): Application scenarios, for example <code>["commentary"]</code>.</li>    </ul>  </li></ul>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get <p>VOD application ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</p> 
     * @return SubAppId <p>VOD application ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</p>
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p>VOD application ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</p>
     * @param SubAppId <p>VOD application ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</p>
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Base64-encoded audio for cloning.</p> 
     * @return AudioData <p>Base64-encoded audio for cloning.</p>
     */
    public String getAudioData() {
        return this.AudioData;
    }

    /**
     * Set <p>Base64-encoded audio for cloning.</p>
     * @param AudioData <p>Base64-encoded audio for cloning.</p>
     */
    public void setAudioData(String AudioData) {
        this.AudioData = AudioData;
    }

    /**
     * Get <p>Cloning audio URL. Valid when AudioData is empty.</p> 
     * @return AudioUrl <p>Cloning audio URL. Valid when AudioData is empty.</p>
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set <p>Cloning audio URL. Valid when AudioData is empty.</p>
     * @param AudioUrl <p>Cloning audio URL. Valid when AudioData is empty.</p>
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get <p>Clone file FileID. Valid when AudioData and AudioUrl are empty</p> 
     * @return AudioFileId <p>Clone file FileID. Valid when AudioData and AudioUrl are empty</p>
     */
    public String getAudioFileId() {
        return this.AudioFileId;
    }

    /**
     * Set <p>Clone file FileID. Valid when AudioData and AudioUrl are empty</p>
     * @param AudioFileId <p>Clone file FileID. Valid when AudioData and AudioUrl are empty</p>
     */
    public void setAudioFileId(String AudioFileId) {
        this.AudioFileId = AudioFileId;
    }

    /**
     * Get <p>Language enhancement, such as "zh" "en" "auto", default "auto"</p> 
     * @return LanguageBoost <p>Language enhancement, such as "zh" "en" "auto", default "auto"</p>
     */
    public String getLanguageBoost() {
        return this.LanguageBoost;
    }

    /**
     * Set <p>Language enhancement, such as "zh" "en" "auto", default "auto"</p>
     * @param LanguageBoost <p>Language enhancement, such as "zh" "en" "auto", default "auto"</p>
     */
    public void setLanguageBoost(String LanguageBoost) {
        this.LanguageBoost = LanguageBoost;
    }

    /**
     * Get <p>Extended parameters for synchronous timbre clone. Supported fields of <code>ExtParam</code>:</p><ul>  <li><code>text</code> (string): Text for audition synthesis, up to <code>1000</code> characters. If not empty, <code>tts_model</code> must be passed simultaneously. Upon successful clone, the audition audio <code>DemoAudio</code> is returned.</li>  <li><code>model</code> (string): Clone model. Default: <code>minimax-voice-clone</code>.</li>  <li><code>tts_model</code> (string): Model used to synthesize the audition audio. Options: <code>minimax-speech-2.8-hd</code>, <code>minimax-speech-2.8-turbo</code>, <code>minimax-speech-2.6-hd</code>, <code>minimax-speech-2.6-turbo</code>, <code>minimax-speech-02-hd</code>, <code>minimax-speech-02-turbo</code>. Required if <code>text</code> is not empty.</li>  <li><code>text_lang</code> (string): Language of the audition text.</li>  <li><code>voice_profile</code> (object): Timbre profile. Optional fields:    <ul>      <li><code>name</code> (string): Timbre name.</li>      <li><code>description</code> (string): Timbre description.</li>      <li><code>gender</code> (string): Gender. Options: <code>male</code> / <code>female</code> / <code>unknown</code>.</li>      <li><code>age</code> (string): Age segment. Options: <code>child</code> / <code>teenager</code> / <code>youth</code> / <code>middle_aged</code> / <code>senior</code> / <code>unknown</code>.</li>      <li><code>languages</code> (string[]): Supported languages, for example <code>["zh", "en"]</code>.</li>      <li><code>labels</code> (string[]): Timbre tags, for example <code>["magnetic"]</code>.</li>      <li><code>scenes</code> (string[]): Application scenarios, for example <code>["commentary"]</code>.</li>    </ul>  </li></ul> 
     * @return ExtParam <p>Extended parameters for synchronous timbre clone. Supported fields of <code>ExtParam</code>:</p><ul>  <li><code>text</code> (string): Text for audition synthesis, up to <code>1000</code> characters. If not empty, <code>tts_model</code> must be passed simultaneously. Upon successful clone, the audition audio <code>DemoAudio</code> is returned.</li>  <li><code>model</code> (string): Clone model. Default: <code>minimax-voice-clone</code>.</li>  <li><code>tts_model</code> (string): Model used to synthesize the audition audio. Options: <code>minimax-speech-2.8-hd</code>, <code>minimax-speech-2.8-turbo</code>, <code>minimax-speech-2.6-hd</code>, <code>minimax-speech-2.6-turbo</code>, <code>minimax-speech-02-hd</code>, <code>minimax-speech-02-turbo</code>. Required if <code>text</code> is not empty.</li>  <li><code>text_lang</code> (string): Language of the audition text.</li>  <li><code>voice_profile</code> (object): Timbre profile. Optional fields:    <ul>      <li><code>name</code> (string): Timbre name.</li>      <li><code>description</code> (string): Timbre description.</li>      <li><code>gender</code> (string): Gender. Options: <code>male</code> / <code>female</code> / <code>unknown</code>.</li>      <li><code>age</code> (string): Age segment. Options: <code>child</code> / <code>teenager</code> / <code>youth</code> / <code>middle_aged</code> / <code>senior</code> / <code>unknown</code>.</li>      <li><code>languages</code> (string[]): Supported languages, for example <code>["zh", "en"]</code>.</li>      <li><code>labels</code> (string[]): Timbre tags, for example <code>["magnetic"]</code>.</li>      <li><code>scenes</code> (string[]): Application scenarios, for example <code>["commentary"]</code>.</li>    </ul>  </li></ul>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>Extended parameters for synchronous timbre clone. Supported fields of <code>ExtParam</code>:</p><ul>  <li><code>text</code> (string): Text for audition synthesis, up to <code>1000</code> characters. If not empty, <code>tts_model</code> must be passed simultaneously. Upon successful clone, the audition audio <code>DemoAudio</code> is returned.</li>  <li><code>model</code> (string): Clone model. Default: <code>minimax-voice-clone</code>.</li>  <li><code>tts_model</code> (string): Model used to synthesize the audition audio. Options: <code>minimax-speech-2.8-hd</code>, <code>minimax-speech-2.8-turbo</code>, <code>minimax-speech-2.6-hd</code>, <code>minimax-speech-2.6-turbo</code>, <code>minimax-speech-02-hd</code>, <code>minimax-speech-02-turbo</code>. Required if <code>text</code> is not empty.</li>  <li><code>text_lang</code> (string): Language of the audition text.</li>  <li><code>voice_profile</code> (object): Timbre profile. Optional fields:    <ul>      <li><code>name</code> (string): Timbre name.</li>      <li><code>description</code> (string): Timbre description.</li>      <li><code>gender</code> (string): Gender. Options: <code>male</code> / <code>female</code> / <code>unknown</code>.</li>      <li><code>age</code> (string): Age segment. Options: <code>child</code> / <code>teenager</code> / <code>youth</code> / <code>middle_aged</code> / <code>senior</code> / <code>unknown</code>.</li>      <li><code>languages</code> (string[]): Supported languages, for example <code>["zh", "en"]</code>.</li>      <li><code>labels</code> (string[]): Timbre tags, for example <code>["magnetic"]</code>.</li>      <li><code>scenes</code> (string[]): Application scenarios, for example <code>["commentary"]</code>.</li>    </ul>  </li></ul>
     * @param ExtParam <p>Extended parameters for synchronous timbre clone. Supported fields of <code>ExtParam</code>:</p><ul>  <li><code>text</code> (string): Text for audition synthesis, up to <code>1000</code> characters. If not empty, <code>tts_model</code> must be passed simultaneously. Upon successful clone, the audition audio <code>DemoAudio</code> is returned.</li>  <li><code>model</code> (string): Clone model. Default: <code>minimax-voice-clone</code>.</li>  <li><code>tts_model</code> (string): Model used to synthesize the audition audio. Options: <code>minimax-speech-2.8-hd</code>, <code>minimax-speech-2.8-turbo</code>, <code>minimax-speech-2.6-hd</code>, <code>minimax-speech-2.6-turbo</code>, <code>minimax-speech-02-hd</code>, <code>minimax-speech-02-turbo</code>. Required if <code>text</code> is not empty.</li>  <li><code>text_lang</code> (string): Language of the audition text.</li>  <li><code>voice_profile</code> (object): Timbre profile. Optional fields:    <ul>      <li><code>name</code> (string): Timbre name.</li>      <li><code>description</code> (string): Timbre description.</li>      <li><code>gender</code> (string): Gender. Options: <code>male</code> / <code>female</code> / <code>unknown</code>.</li>      <li><code>age</code> (string): Age segment. Options: <code>child</code> / <code>teenager</code> / <code>youth</code> / <code>middle_aged</code> / <code>senior</code> / <code>unknown</code>.</li>      <li><code>languages</code> (string[]): Supported languages, for example <code>["zh", "en"]</code>.</li>      <li><code>labels</code> (string[]): Timbre tags, for example <code>["magnetic"]</code>.</li>      <li><code>scenes</code> (string[]): Application scenarios, for example <code>["commentary"]</code>.</li>    </ul>  </li></ul>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public CloneVoiceSyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneVoiceSyncRequest(CloneVoiceSyncRequest source) {
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

    }
}

