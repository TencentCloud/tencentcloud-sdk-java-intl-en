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

public class TextToSpeechRequest extends AbstractModel {

    /**
    * Text to be converted to speech. length range: [1, 255].
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Audio configuration for text-to-speech.
    */
    @SerializedName("Voice")
    @Expose
    private Voice Voice;

    /**
    * Specifies the SdkAppId of TRTC.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Specifies the output audio format for text-to-speech.
    */
    @SerializedName("AudioFormat")
    @Expose
    private AudioFormat AudioFormat;

    /**
    * API key for TTS.
    */
    @SerializedName("APIKey")
    @Expose
    private String APIKey;

    /**
    * TTS model, current fixed value: flow_01_turbo.
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * Language to be synthesised (ISO 639-1). supports zh (chinese), en (english), yue (cantonese), ja (japanese), and ko (korean). defaults to auto-identification.
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * 
    */
    @SerializedName("PronunciationDict")
    @Expose
    private PronunciationDict [] PronunciationDict;

    /**
    * 
    */
    @SerializedName("AlignmentMode")
    @Expose
    private Long AlignmentMode;

    /**
     * Get Text to be converted to speech. length range: [1, 255]. 
     * @return Text Text to be converted to speech. length range: [1, 255].
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Text to be converted to speech. length range: [1, 255].
     * @param Text Text to be converted to speech. length range: [1, 255].
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Audio configuration for text-to-speech. 
     * @return Voice Audio configuration for text-to-speech.
     */
    public Voice getVoice() {
        return this.Voice;
    }

    /**
     * Set Audio configuration for text-to-speech.
     * @param Voice Audio configuration for text-to-speech.
     */
    public void setVoice(Voice Voice) {
        this.Voice = Voice;
    }

    /**
     * Get Specifies the SdkAppId of TRTC. 
     * @return SdkAppId Specifies the SdkAppId of TRTC.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Specifies the SdkAppId of TRTC.
     * @param SdkAppId Specifies the SdkAppId of TRTC.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Specifies the output audio format for text-to-speech. 
     * @return AudioFormat Specifies the output audio format for text-to-speech.
     */
    public AudioFormat getAudioFormat() {
        return this.AudioFormat;
    }

    /**
     * Set Specifies the output audio format for text-to-speech.
     * @param AudioFormat Specifies the output audio format for text-to-speech.
     */
    public void setAudioFormat(AudioFormat AudioFormat) {
        this.AudioFormat = AudioFormat;
    }

    /**
     * Get API key for TTS. 
     * @return APIKey API key for TTS.
     * @deprecated
     */
    @Deprecated
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * Set API key for TTS.
     * @param APIKey API key for TTS.
     * @deprecated
     */
    @Deprecated
    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    /**
     * Get TTS model, current fixed value: flow_01_turbo. 
     * @return Model TTS model, current fixed value: flow_01_turbo.
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set TTS model, current fixed value: flow_01_turbo.
     * @param Model TTS model, current fixed value: flow_01_turbo.
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get Language to be synthesised (ISO 639-1). supports zh (chinese), en (english), yue (cantonese), ja (japanese), and ko (korean). defaults to auto-identification. 
     * @return Language Language to be synthesised (ISO 639-1). supports zh (chinese), en (english), yue (cantonese), ja (japanese), and ko (korean). defaults to auto-identification.
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set Language to be synthesised (ISO 639-1). supports zh (chinese), en (english), yue (cantonese), ja (japanese), and ko (korean). defaults to auto-identification.
     * @param Language Language to be synthesised (ISO 639-1). supports zh (chinese), en (english), yue (cantonese), ja (japanese), and ko (korean). defaults to auto-identification.
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get  
     * @return PronunciationDict 
     */
    public PronunciationDict [] getPronunciationDict() {
        return this.PronunciationDict;
    }

    /**
     * Set 
     * @param PronunciationDict 
     */
    public void setPronunciationDict(PronunciationDict [] PronunciationDict) {
        this.PronunciationDict = PronunciationDict;
    }

    /**
     * Get  
     * @return AlignmentMode 
     */
    public Long getAlignmentMode() {
        return this.AlignmentMode;
    }

    /**
     * Set 
     * @param AlignmentMode 
     */
    public void setAlignmentMode(Long AlignmentMode) {
        this.AlignmentMode = AlignmentMode;
    }

    public TextToSpeechRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToSpeechRequest(TextToSpeechRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Voice != null) {
            this.Voice = new Voice(source.Voice);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.AudioFormat != null) {
            this.AudioFormat = new AudioFormat(source.AudioFormat);
        }
        if (source.APIKey != null) {
            this.APIKey = new String(source.APIKey);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.PronunciationDict != null) {
            this.PronunciationDict = new PronunciationDict[source.PronunciationDict.length];
            for (int i = 0; i < source.PronunciationDict.length; i++) {
                this.PronunciationDict[i] = new PronunciationDict(source.PronunciationDict[i]);
            }
        }
        if (source.AlignmentMode != null) {
            this.AlignmentMode = new Long(source.AlignmentMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamObj(map, prefix + "Voice.", this.Voice);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamObj(map, prefix + "AudioFormat.", this.AudioFormat);
        this.setParamSimple(map, prefix + "APIKey", this.APIKey);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamArrayObj(map, prefix + "PronunciationDict.", this.PronunciationDict);
        this.setParamSimple(map, prefix + "AlignmentMode", this.AlignmentMode);

    }
}

