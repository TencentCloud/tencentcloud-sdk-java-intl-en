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

public class TextToSpeechSyncRequest extends AbstractModel {

    /**
    * <p>Text for the synthesis. This is required for text to speech. The text cannot exceed 2000 bytes in length.</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>Voice Id. Fill in when synthesizing with a specified timbre. Supports system voice types and designed or cloned timbres.</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>VOD application ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</p>
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
    * <p>Output parameters.</p><p>Specifies the output format, etc. The default output is an audio URL.</p>
    */
    @SerializedName("Output")
    @Expose
    private TextToSpeechSyncOutputOption Output;

    /**
    * <p>Extended parameters for synchronous speech synthesis. Fields supported by <code>ExtParam</code>:</p><ul>  <li><code>model</code> (string): Synthesis model. Options: <code>minimax-speech-2.8-hd</code>, <code>minimax-speech-2.8-turbo</code>, <code>minimax-speech-2.6-hd</code>, <code>minimax-speech-2.6-turbo</code>, <code>minimax-speech-02-hd</code>, <code>minimax-speech-02-turbo</code>. Default: <code>minimax-speech-2.8-hd</code>.</li>  <li><code>voice_setting</code> (object): Voice fine adjustment. Optional fields:    <ul>      <li><code>speed</code> (float): Speaking rate, <code>[0.5, 2.0]</code>. Default: <code>1.0</code>.</li>      <li><code>vol</code> (float): Volume, <code>(0, 10]</code>. Default: <code>1.0</code>.</li>      <li><code>pitch</code> (int): Pitch, <code>[-12, 12]</code>. Default: <code>0</code>.</li>      <li><code>emotion</code> (string): Emotion. Options: <code>happy</code> / <code>sad</code> / <code>angry</code> / <code>fearful</code> / <code>disgusted</code> / <code>surprised</code> / <code>calm</code> / <code>fluent</code> / <code>whisper</code>.</li>    </ul>  </li>  <li><code>audio_setting</code> (object): Audio output parameters. Optional fields:    <ul>      <li><code>sample_rate</code> (int): Sampling rate. Options: <code>8000</code> / <code>16000</code> / <code>22050</code> / <code>24000</code> / <code>32000</code> / <code>44100</code>. Default: <code>16000</code>.</li>      <li><code>format</code> (string): Audio format. Options: <code>mp3</code> / <code>wav</code>. Default: <code>wav</code>.</li>      <li><code>duration</code> (float): Target duration (seconds).</li>      <li><code>cut_silence</code> (bool): Whether to trim silence segments.</li>    </ul>  </li></ul>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get <p>Text for the synthesis. This is required for text to speech. The text cannot exceed 2000 bytes in length.</p> 
     * @return Text <p>Text for the synthesis. This is required for text to speech. The text cannot exceed 2000 bytes in length.</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>Text for the synthesis. This is required for text to speech. The text cannot exceed 2000 bytes in length.</p>
     * @param Text <p>Text for the synthesis. This is required for text to speech. The text cannot exceed 2000 bytes in length.</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>Voice Id. Fill in when synthesizing with a specified timbre. Supports system voice types and designed or cloned timbres.</p> 
     * @return VoiceId <p>Voice Id. Fill in when synthesizing with a specified timbre. Supports system voice types and designed or cloned timbres.</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>Voice Id. Fill in when synthesizing with a specified timbre. Supports system voice types and designed or cloned timbres.</p>
     * @param VoiceId <p>Voice Id. Fill in when synthesizing with a specified timbre. Supports system voice types and designed or cloned timbres.</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

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
     * Get <p>Output parameters.</p><p>Specifies the output format, etc. The default output is an audio URL.</p> 
     * @return Output <p>Output parameters.</p><p>Specifies the output format, etc. The default output is an audio URL.</p>
     */
    public TextToSpeechSyncOutputOption getOutput() {
        return this.Output;
    }

    /**
     * Set <p>Output parameters.</p><p>Specifies the output format, etc. The default output is an audio URL.</p>
     * @param Output <p>Output parameters.</p><p>Specifies the output format, etc. The default output is an audio URL.</p>
     */
    public void setOutput(TextToSpeechSyncOutputOption Output) {
        this.Output = Output;
    }

    /**
     * Get <p>Extended parameters for synchronous speech synthesis. Fields supported by <code>ExtParam</code>:</p><ul>  <li><code>model</code> (string): Synthesis model. Options: <code>minimax-speech-2.8-hd</code>, <code>minimax-speech-2.8-turbo</code>, <code>minimax-speech-2.6-hd</code>, <code>minimax-speech-2.6-turbo</code>, <code>minimax-speech-02-hd</code>, <code>minimax-speech-02-turbo</code>. Default: <code>minimax-speech-2.8-hd</code>.</li>  <li><code>voice_setting</code> (object): Voice fine adjustment. Optional fields:    <ul>      <li><code>speed</code> (float): Speaking rate, <code>[0.5, 2.0]</code>. Default: <code>1.0</code>.</li>      <li><code>vol</code> (float): Volume, <code>(0, 10]</code>. Default: <code>1.0</code>.</li>      <li><code>pitch</code> (int): Pitch, <code>[-12, 12]</code>. Default: <code>0</code>.</li>      <li><code>emotion</code> (string): Emotion. Options: <code>happy</code> / <code>sad</code> / <code>angry</code> / <code>fearful</code> / <code>disgusted</code> / <code>surprised</code> / <code>calm</code> / <code>fluent</code> / <code>whisper</code>.</li>    </ul>  </li>  <li><code>audio_setting</code> (object): Audio output parameters. Optional fields:    <ul>      <li><code>sample_rate</code> (int): Sampling rate. Options: <code>8000</code> / <code>16000</code> / <code>22050</code> / <code>24000</code> / <code>32000</code> / <code>44100</code>. Default: <code>16000</code>.</li>      <li><code>format</code> (string): Audio format. Options: <code>mp3</code> / <code>wav</code>. Default: <code>wav</code>.</li>      <li><code>duration</code> (float): Target duration (seconds).</li>      <li><code>cut_silence</code> (bool): Whether to trim silence segments.</li>    </ul>  </li></ul> 
     * @return ExtParam <p>Extended parameters for synchronous speech synthesis. Fields supported by <code>ExtParam</code>:</p><ul>  <li><code>model</code> (string): Synthesis model. Options: <code>minimax-speech-2.8-hd</code>, <code>minimax-speech-2.8-turbo</code>, <code>minimax-speech-2.6-hd</code>, <code>minimax-speech-2.6-turbo</code>, <code>minimax-speech-02-hd</code>, <code>minimax-speech-02-turbo</code>. Default: <code>minimax-speech-2.8-hd</code>.</li>  <li><code>voice_setting</code> (object): Voice fine adjustment. Optional fields:    <ul>      <li><code>speed</code> (float): Speaking rate, <code>[0.5, 2.0]</code>. Default: <code>1.0</code>.</li>      <li><code>vol</code> (float): Volume, <code>(0, 10]</code>. Default: <code>1.0</code>.</li>      <li><code>pitch</code> (int): Pitch, <code>[-12, 12]</code>. Default: <code>0</code>.</li>      <li><code>emotion</code> (string): Emotion. Options: <code>happy</code> / <code>sad</code> / <code>angry</code> / <code>fearful</code> / <code>disgusted</code> / <code>surprised</code> / <code>calm</code> / <code>fluent</code> / <code>whisper</code>.</li>    </ul>  </li>  <li><code>audio_setting</code> (object): Audio output parameters. Optional fields:    <ul>      <li><code>sample_rate</code> (int): Sampling rate. Options: <code>8000</code> / <code>16000</code> / <code>22050</code> / <code>24000</code> / <code>32000</code> / <code>44100</code>. Default: <code>16000</code>.</li>      <li><code>format</code> (string): Audio format. Options: <code>mp3</code> / <code>wav</code>. Default: <code>wav</code>.</li>      <li><code>duration</code> (float): Target duration (seconds).</li>      <li><code>cut_silence</code> (bool): Whether to trim silence segments.</li>    </ul>  </li></ul>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>Extended parameters for synchronous speech synthesis. Fields supported by <code>ExtParam</code>:</p><ul>  <li><code>model</code> (string): Synthesis model. Options: <code>minimax-speech-2.8-hd</code>, <code>minimax-speech-2.8-turbo</code>, <code>minimax-speech-2.6-hd</code>, <code>minimax-speech-2.6-turbo</code>, <code>minimax-speech-02-hd</code>, <code>minimax-speech-02-turbo</code>. Default: <code>minimax-speech-2.8-hd</code>.</li>  <li><code>voice_setting</code> (object): Voice fine adjustment. Optional fields:    <ul>      <li><code>speed</code> (float): Speaking rate, <code>[0.5, 2.0]</code>. Default: <code>1.0</code>.</li>      <li><code>vol</code> (float): Volume, <code>(0, 10]</code>. Default: <code>1.0</code>.</li>      <li><code>pitch</code> (int): Pitch, <code>[-12, 12]</code>. Default: <code>0</code>.</li>      <li><code>emotion</code> (string): Emotion. Options: <code>happy</code> / <code>sad</code> / <code>angry</code> / <code>fearful</code> / <code>disgusted</code> / <code>surprised</code> / <code>calm</code> / <code>fluent</code> / <code>whisper</code>.</li>    </ul>  </li>  <li><code>audio_setting</code> (object): Audio output parameters. Optional fields:    <ul>      <li><code>sample_rate</code> (int): Sampling rate. Options: <code>8000</code> / <code>16000</code> / <code>22050</code> / <code>24000</code> / <code>32000</code> / <code>44100</code>. Default: <code>16000</code>.</li>      <li><code>format</code> (string): Audio format. Options: <code>mp3</code> / <code>wav</code>. Default: <code>wav</code>.</li>      <li><code>duration</code> (float): Target duration (seconds).</li>      <li><code>cut_silence</code> (bool): Whether to trim silence segments.</li>    </ul>  </li></ul>
     * @param ExtParam <p>Extended parameters for synchronous speech synthesis. Fields supported by <code>ExtParam</code>:</p><ul>  <li><code>model</code> (string): Synthesis model. Options: <code>minimax-speech-2.8-hd</code>, <code>minimax-speech-2.8-turbo</code>, <code>minimax-speech-2.6-hd</code>, <code>minimax-speech-2.6-turbo</code>, <code>minimax-speech-02-hd</code>, <code>minimax-speech-02-turbo</code>. Default: <code>minimax-speech-2.8-hd</code>.</li>  <li><code>voice_setting</code> (object): Voice fine adjustment. Optional fields:    <ul>      <li><code>speed</code> (float): Speaking rate, <code>[0.5, 2.0]</code>. Default: <code>1.0</code>.</li>      <li><code>vol</code> (float): Volume, <code>(0, 10]</code>. Default: <code>1.0</code>.</li>      <li><code>pitch</code> (int): Pitch, <code>[-12, 12]</code>. Default: <code>0</code>.</li>      <li><code>emotion</code> (string): Emotion. Options: <code>happy</code> / <code>sad</code> / <code>angry</code> / <code>fearful</code> / <code>disgusted</code> / <code>surprised</code> / <code>calm</code> / <code>fluent</code> / <code>whisper</code>.</li>    </ul>  </li>  <li><code>audio_setting</code> (object): Audio output parameters. Optional fields:    <ul>      <li><code>sample_rate</code> (int): Sampling rate. Options: <code>8000</code> / <code>16000</code> / <code>22050</code> / <code>24000</code> / <code>32000</code> / <code>44100</code>. Default: <code>16000</code>.</li>      <li><code>format</code> (string): Audio format. Options: <code>mp3</code> / <code>wav</code>. Default: <code>wav</code>.</li>      <li><code>duration</code> (float): Target duration (seconds).</li>      <li><code>cut_silence</code> (bool): Whether to trim silence segments.</li>    </ul>  </li></ul>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public TextToSpeechSyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToSpeechSyncRequest(TextToSpeechSyncRequest source) {
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
        if (source.Output != null) {
            this.Output = new TextToSpeechSyncOutputOption(source.Output);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
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
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

