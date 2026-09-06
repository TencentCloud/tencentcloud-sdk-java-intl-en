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

public class TextToSpeechAsyncRequest extends AbstractModel {

    /**
    * <p>Text to convert to speech.</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>Voice ID.</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>VOD application ID. For customers who activate on-demand services on or after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</p>
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * <p>Language enhancement, such as "zh" "en" "auto", default "auto"</p>
    */
    @SerializedName("LanguageBoost")
    @Expose
    private String LanguageBoost;

    /**
    * <p>Extended parameters for text-to-speech (async). Fields supported by ExtParam:</p><ul><li>model (string): Synthesis model. Options: minimax-speech-2.8-hd, minimax-speech-2.8-turbo, minimax-speech-2.6-hd, minimax-speech-2.6-turbo, minimax-speech-02-hd, minimax-speech-02-turbo. Default: minimax-speech-2.8-hd.</li><li>text_lang (string): Text language, for example zh / en. Synonymous with the input parameter LanguageBoost. If both are passed, ExtParam takes precedence.</li><li>audio_setting (object): Audio output and voice type fine-tuning parameters. Note: For the async API, speaking rate, volume, pitch, and emotion are all under audio_setting, different from the voice_setting of the synchronous API. Optional fields:<ul><li>speed (float): Speaking rate, [0.5, 2.0]. Default: 1.0.</li><li>vol (float): Volume, (0, 10]. Default: 1.0.</li><li>pitch (int): Pitch, [-12, 12]. Default: 0.</li><li>emotion (string): Emotion. Options: happy, sad, angry, fearful, disgusted, surprised, calm, fluent, whisper.</li><li>sample_rate (int): Sampling rate. Options: 8000, 16000, 22050, 24000, 32000, 44100. Default: 16000.</li><li>format (string): Audio format. Options: mp3, wav. Default: wav.</li><li>duration (float): Target duration in seconds.</li><li>cut_silence (bool): Whether to trim silent segments.</li></ul></li></ul>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
    * <p>Output parameters.</p><p>Specifies the output format, etc. The default output audio url.</p>
    */
    @SerializedName("Output")
    @Expose
    private TextToSpeechAsyncOutputOption Output;

    /**
    * <p>Identifies the source context. This is used to pass user request information. The value of this field will be returned in callbacks and task flow status change callbacks. The maximum length is 1000 characters.</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>Identification Code for Task Deduplication. If a request with the same identification code has been sent within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, it indicates no deduplication.</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get <p>Text to convert to speech.</p> 
     * @return Text <p>Text to convert to speech.</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>Text to convert to speech.</p>
     * @param Text <p>Text to convert to speech.</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>Voice ID.</p> 
     * @return VoiceId <p>Voice ID.</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>Voice ID.</p>
     * @param VoiceId <p>Voice ID.</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>VOD application ID. For customers who activate on-demand services on or after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</p> 
     * @return SubAppId <p>VOD application ID. For customers who activate on-demand services on or after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</p>
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p>VOD application ID. For customers who activate on-demand services on or after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</p>
     * @param SubAppId <p>VOD application ID. For customers who activate on-demand services on or after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</p>
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
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
     * Get <p>Extended parameters for text-to-speech (async). Fields supported by ExtParam:</p><ul><li>model (string): Synthesis model. Options: minimax-speech-2.8-hd, minimax-speech-2.8-turbo, minimax-speech-2.6-hd, minimax-speech-2.6-turbo, minimax-speech-02-hd, minimax-speech-02-turbo. Default: minimax-speech-2.8-hd.</li><li>text_lang (string): Text language, for example zh / en. Synonymous with the input parameter LanguageBoost. If both are passed, ExtParam takes precedence.</li><li>audio_setting (object): Audio output and voice type fine-tuning parameters. Note: For the async API, speaking rate, volume, pitch, and emotion are all under audio_setting, different from the voice_setting of the synchronous API. Optional fields:<ul><li>speed (float): Speaking rate, [0.5, 2.0]. Default: 1.0.</li><li>vol (float): Volume, (0, 10]. Default: 1.0.</li><li>pitch (int): Pitch, [-12, 12]. Default: 0.</li><li>emotion (string): Emotion. Options: happy, sad, angry, fearful, disgusted, surprised, calm, fluent, whisper.</li><li>sample_rate (int): Sampling rate. Options: 8000, 16000, 22050, 24000, 32000, 44100. Default: 16000.</li><li>format (string): Audio format. Options: mp3, wav. Default: wav.</li><li>duration (float): Target duration in seconds.</li><li>cut_silence (bool): Whether to trim silent segments.</li></ul></li></ul> 
     * @return ExtParam <p>Extended parameters for text-to-speech (async). Fields supported by ExtParam:</p><ul><li>model (string): Synthesis model. Options: minimax-speech-2.8-hd, minimax-speech-2.8-turbo, minimax-speech-2.6-hd, minimax-speech-2.6-turbo, minimax-speech-02-hd, minimax-speech-02-turbo. Default: minimax-speech-2.8-hd.</li><li>text_lang (string): Text language, for example zh / en. Synonymous with the input parameter LanguageBoost. If both are passed, ExtParam takes precedence.</li><li>audio_setting (object): Audio output and voice type fine-tuning parameters. Note: For the async API, speaking rate, volume, pitch, and emotion are all under audio_setting, different from the voice_setting of the synchronous API. Optional fields:<ul><li>speed (float): Speaking rate, [0.5, 2.0]. Default: 1.0.</li><li>vol (float): Volume, (0, 10]. Default: 1.0.</li><li>pitch (int): Pitch, [-12, 12]. Default: 0.</li><li>emotion (string): Emotion. Options: happy, sad, angry, fearful, disgusted, surprised, calm, fluent, whisper.</li><li>sample_rate (int): Sampling rate. Options: 8000, 16000, 22050, 24000, 32000, 44100. Default: 16000.</li><li>format (string): Audio format. Options: mp3, wav. Default: wav.</li><li>duration (float): Target duration in seconds.</li><li>cut_silence (bool): Whether to trim silent segments.</li></ul></li></ul>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>Extended parameters for text-to-speech (async). Fields supported by ExtParam:</p><ul><li>model (string): Synthesis model. Options: minimax-speech-2.8-hd, minimax-speech-2.8-turbo, minimax-speech-2.6-hd, minimax-speech-2.6-turbo, minimax-speech-02-hd, minimax-speech-02-turbo. Default: minimax-speech-2.8-hd.</li><li>text_lang (string): Text language, for example zh / en. Synonymous with the input parameter LanguageBoost. If both are passed, ExtParam takes precedence.</li><li>audio_setting (object): Audio output and voice type fine-tuning parameters. Note: For the async API, speaking rate, volume, pitch, and emotion are all under audio_setting, different from the voice_setting of the synchronous API. Optional fields:<ul><li>speed (float): Speaking rate, [0.5, 2.0]. Default: 1.0.</li><li>vol (float): Volume, (0, 10]. Default: 1.0.</li><li>pitch (int): Pitch, [-12, 12]. Default: 0.</li><li>emotion (string): Emotion. Options: happy, sad, angry, fearful, disgusted, surprised, calm, fluent, whisper.</li><li>sample_rate (int): Sampling rate. Options: 8000, 16000, 22050, 24000, 32000, 44100. Default: 16000.</li><li>format (string): Audio format. Options: mp3, wav. Default: wav.</li><li>duration (float): Target duration in seconds.</li><li>cut_silence (bool): Whether to trim silent segments.</li></ul></li></ul>
     * @param ExtParam <p>Extended parameters for text-to-speech (async). Fields supported by ExtParam:</p><ul><li>model (string): Synthesis model. Options: minimax-speech-2.8-hd, minimax-speech-2.8-turbo, minimax-speech-2.6-hd, minimax-speech-2.6-turbo, minimax-speech-02-hd, minimax-speech-02-turbo. Default: minimax-speech-2.8-hd.</li><li>text_lang (string): Text language, for example zh / en. Synonymous with the input parameter LanguageBoost. If both are passed, ExtParam takes precedence.</li><li>audio_setting (object): Audio output and voice type fine-tuning parameters. Note: For the async API, speaking rate, volume, pitch, and emotion are all under audio_setting, different from the voice_setting of the synchronous API. Optional fields:<ul><li>speed (float): Speaking rate, [0.5, 2.0]. Default: 1.0.</li><li>vol (float): Volume, (0, 10]. Default: 1.0.</li><li>pitch (int): Pitch, [-12, 12]. Default: 0.</li><li>emotion (string): Emotion. Options: happy, sad, angry, fearful, disgusted, surprised, calm, fluent, whisper.</li><li>sample_rate (int): Sampling rate. Options: 8000, 16000, 22050, 24000, 32000, 44100. Default: 16000.</li><li>format (string): Audio format. Options: mp3, wav. Default: wav.</li><li>duration (float): Target duration in seconds.</li><li>cut_silence (bool): Whether to trim silent segments.</li></ul></li></ul>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    /**
     * Get <p>Output parameters.</p><p>Specifies the output format, etc. The default output audio url.</p> 
     * @return Output <p>Output parameters.</p><p>Specifies the output format, etc. The default output audio url.</p>
     */
    public TextToSpeechAsyncOutputOption getOutput() {
        return this.Output;
    }

    /**
     * Set <p>Output parameters.</p><p>Specifies the output format, etc. The default output audio url.</p>
     * @param Output <p>Output parameters.</p><p>Specifies the output format, etc. The default output audio url.</p>
     */
    public void setOutput(TextToSpeechAsyncOutputOption Output) {
        this.Output = Output;
    }

    /**
     * Get <p>Identifies the source context. This is used to pass user request information. The value of this field will be returned in callbacks and task flow status change callbacks. The maximum length is 1000 characters.</p> 
     * @return SessionContext <p>Identifies the source context. This is used to pass user request information. The value of this field will be returned in callbacks and task flow status change callbacks. The maximum length is 1000 characters.</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>Identifies the source context. This is used to pass user request information. The value of this field will be returned in callbacks and task flow status change callbacks. The maximum length is 1000 characters.</p>
     * @param SessionContext <p>Identifies the source context. This is used to pass user request information. The value of this field will be returned in callbacks and task flow status change callbacks. The maximum length is 1000 characters.</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>Identification Code for Task Deduplication. If a request with the same identification code has been sent within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, it indicates no deduplication.</p> 
     * @return SessionId <p>Identification Code for Task Deduplication. If a request with the same identification code has been sent within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, it indicates no deduplication.</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Identification Code for Task Deduplication. If a request with the same identification code has been sent within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, it indicates no deduplication.</p>
     * @param SessionId <p>Identification Code for Task Deduplication. If a request with the same identification code has been sent within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, it indicates no deduplication.</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public TextToSpeechAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToSpeechAsyncRequest(TextToSpeechAsyncRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.LanguageBoost != null) {
            this.LanguageBoost = new String(source.LanguageBoost);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
        if (source.Output != null) {
            this.Output = new TextToSpeechAsyncOutputOption(source.Output);
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
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "LanguageBoost", this.LanguageBoost);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

