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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncDubbingRequest extends AbstractModel {

    /**
    * <p>Text for the synthesis. This is required for text to speech. The text cannot exceed 2000 characters in length.</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>Text language. This defaults to Chinese if left empty.<br>Supported languages:<br>zh    Chinese<br>en    English<br>ja    Japanese<br>de    German<br>fr    French<br>ko    Korean<br>ru    Russian<br>uk    Ukrainian<br>pt    Portuguese<br>it    Italian<br>es    Spanish<br>id    Indonesian<br>nl    Dutch<br>tr    Turkish<br>fil    Filipino<br>ms    Malay<br>el    Greek<br>fi    Finnish<br>hr    Croatian<br>sk    Slovak<br>pl    Polish<br>sv    Swedish<br>hi    Hindi<br>bg    Bulgarian<br>ro    Romanian<br>ar    Arabic<br>cs    Czech<br>da    Danish<br>ta    Tamil<br>hun    Hungarian<br>vi    Vietnamese<br>no    Norwegian<br>yue    Cantonese<br>th    Thai<br>he    Hebrew<br>ca    Catalan<br>nn    Nynorsk<br>af    Afrikaans<br>fa    Persian<br>sl    Slovenian</p>
    */
    @SerializedName("TextLang")
    @Expose
    private String TextLang;

    /**
    * <p>Voice ID. This is required for synthesis with a specific voice. System voice and voice cloning are supported.</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

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
    * <p>Cloning audio language. The default language is Chinese. <br>Supported languages are the same as those for TextLang.</p>
    */
    @SerializedName("AudioLang")
    @Expose
    private String AudioLang;

    /**
    * <p>Output parameters.</p><p>Specifies the output format, etc.</p>
    */
    @SerializedName("Output")
    @Expose
    private SyncDubbingOutputOption Output;

    /**
    * <p>Extended parameters in the format of a JSON string.</p><p>‑ synExt (Object): Speech synthesis extension parameter.<br>- duration (Float): Synthesized audio duration, in seconds. Example: 5.2.<br>- sampleRate (Integer): Synthesized audio sample rate. Default value: 16000. Supported values: [8000,16000,22050,32000,44100].<br> pitch (Integer): -Pitch. Default value: 0 (original voice output). Valid values: [-12, 12].<br>‑ cloneExt (Object): Voice cloning extension parameter.<br>    - timeRanges (Float[][]): Specifies the time ranges for audio cloning. Default value: [[0, 20]]. Example: [[5.2, 10], [45, 59.8]].</p>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get <p>Text for the synthesis. This is required for text to speech. The text cannot exceed 2000 characters in length.</p> 
     * @return Text <p>Text for the synthesis. This is required for text to speech. The text cannot exceed 2000 characters in length.</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>Text for the synthesis. This is required for text to speech. The text cannot exceed 2000 characters in length.</p>
     * @param Text <p>Text for the synthesis. This is required for text to speech. The text cannot exceed 2000 characters in length.</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>Text language. This defaults to Chinese if left empty.<br>Supported languages:<br>zh    Chinese<br>en    English<br>ja    Japanese<br>de    German<br>fr    French<br>ko    Korean<br>ru    Russian<br>uk    Ukrainian<br>pt    Portuguese<br>it    Italian<br>es    Spanish<br>id    Indonesian<br>nl    Dutch<br>tr    Turkish<br>fil    Filipino<br>ms    Malay<br>el    Greek<br>fi    Finnish<br>hr    Croatian<br>sk    Slovak<br>pl    Polish<br>sv    Swedish<br>hi    Hindi<br>bg    Bulgarian<br>ro    Romanian<br>ar    Arabic<br>cs    Czech<br>da    Danish<br>ta    Tamil<br>hun    Hungarian<br>vi    Vietnamese<br>no    Norwegian<br>yue    Cantonese<br>th    Thai<br>he    Hebrew<br>ca    Catalan<br>nn    Nynorsk<br>af    Afrikaans<br>fa    Persian<br>sl    Slovenian</p> 
     * @return TextLang <p>Text language. This defaults to Chinese if left empty.<br>Supported languages:<br>zh    Chinese<br>en    English<br>ja    Japanese<br>de    German<br>fr    French<br>ko    Korean<br>ru    Russian<br>uk    Ukrainian<br>pt    Portuguese<br>it    Italian<br>es    Spanish<br>id    Indonesian<br>nl    Dutch<br>tr    Turkish<br>fil    Filipino<br>ms    Malay<br>el    Greek<br>fi    Finnish<br>hr    Croatian<br>sk    Slovak<br>pl    Polish<br>sv    Swedish<br>hi    Hindi<br>bg    Bulgarian<br>ro    Romanian<br>ar    Arabic<br>cs    Czech<br>da    Danish<br>ta    Tamil<br>hun    Hungarian<br>vi    Vietnamese<br>no    Norwegian<br>yue    Cantonese<br>th    Thai<br>he    Hebrew<br>ca    Catalan<br>nn    Nynorsk<br>af    Afrikaans<br>fa    Persian<br>sl    Slovenian</p>
     */
    public String getTextLang() {
        return this.TextLang;
    }

    /**
     * Set <p>Text language. This defaults to Chinese if left empty.<br>Supported languages:<br>zh    Chinese<br>en    English<br>ja    Japanese<br>de    German<br>fr    French<br>ko    Korean<br>ru    Russian<br>uk    Ukrainian<br>pt    Portuguese<br>it    Italian<br>es    Spanish<br>id    Indonesian<br>nl    Dutch<br>tr    Turkish<br>fil    Filipino<br>ms    Malay<br>el    Greek<br>fi    Finnish<br>hr    Croatian<br>sk    Slovak<br>pl    Polish<br>sv    Swedish<br>hi    Hindi<br>bg    Bulgarian<br>ro    Romanian<br>ar    Arabic<br>cs    Czech<br>da    Danish<br>ta    Tamil<br>hun    Hungarian<br>vi    Vietnamese<br>no    Norwegian<br>yue    Cantonese<br>th    Thai<br>he    Hebrew<br>ca    Catalan<br>nn    Nynorsk<br>af    Afrikaans<br>fa    Persian<br>sl    Slovenian</p>
     * @param TextLang <p>Text language. This defaults to Chinese if left empty.<br>Supported languages:<br>zh    Chinese<br>en    English<br>ja    Japanese<br>de    German<br>fr    French<br>ko    Korean<br>ru    Russian<br>uk    Ukrainian<br>pt    Portuguese<br>it    Italian<br>es    Spanish<br>id    Indonesian<br>nl    Dutch<br>tr    Turkish<br>fil    Filipino<br>ms    Malay<br>el    Greek<br>fi    Finnish<br>hr    Croatian<br>sk    Slovak<br>pl    Polish<br>sv    Swedish<br>hi    Hindi<br>bg    Bulgarian<br>ro    Romanian<br>ar    Arabic<br>cs    Czech<br>da    Danish<br>ta    Tamil<br>hun    Hungarian<br>vi    Vietnamese<br>no    Norwegian<br>yue    Cantonese<br>th    Thai<br>he    Hebrew<br>ca    Catalan<br>nn    Nynorsk<br>af    Afrikaans<br>fa    Persian<br>sl    Slovenian</p>
     */
    public void setTextLang(String TextLang) {
        this.TextLang = TextLang;
    }

    /**
     * Get <p>Voice ID. This is required for synthesis with a specific voice. System voice and voice cloning are supported.</p> 
     * @return VoiceId <p>Voice ID. This is required for synthesis with a specific voice. System voice and voice cloning are supported.</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>Voice ID. This is required for synthesis with a specific voice. System voice and voice cloning are supported.</p>
     * @param VoiceId <p>Voice ID. This is required for synthesis with a specific voice. System voice and voice cloning are supported.</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
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
     * Get <p>Cloning audio language. The default language is Chinese. <br>Supported languages are the same as those for TextLang.</p> 
     * @return AudioLang <p>Cloning audio language. The default language is Chinese. <br>Supported languages are the same as those for TextLang.</p>
     */
    public String getAudioLang() {
        return this.AudioLang;
    }

    /**
     * Set <p>Cloning audio language. The default language is Chinese. <br>Supported languages are the same as those for TextLang.</p>
     * @param AudioLang <p>Cloning audio language. The default language is Chinese. <br>Supported languages are the same as those for TextLang.</p>
     */
    public void setAudioLang(String AudioLang) {
        this.AudioLang = AudioLang;
    }

    /**
     * Get <p>Output parameters.</p><p>Specifies the output format, etc.</p> 
     * @return Output <p>Output parameters.</p><p>Specifies the output format, etc.</p>
     */
    public SyncDubbingOutputOption getOutput() {
        return this.Output;
    }

    /**
     * Set <p>Output parameters.</p><p>Specifies the output format, etc.</p>
     * @param Output <p>Output parameters.</p><p>Specifies the output format, etc.</p>
     */
    public void setOutput(SyncDubbingOutputOption Output) {
        this.Output = Output;
    }

    /**
     * Get <p>Extended parameters in the format of a JSON string.</p><p>‑ synExt (Object): Speech synthesis extension parameter.<br>- duration (Float): Synthesized audio duration, in seconds. Example: 5.2.<br>- sampleRate (Integer): Synthesized audio sample rate. Default value: 16000. Supported values: [8000,16000,22050,32000,44100].<br> pitch (Integer): -Pitch. Default value: 0 (original voice output). Valid values: [-12, 12].<br>‑ cloneExt (Object): Voice cloning extension parameter.<br>    - timeRanges (Float[][]): Specifies the time ranges for audio cloning. Default value: [[0, 20]]. Example: [[5.2, 10], [45, 59.8]].</p> 
     * @return ExtParam <p>Extended parameters in the format of a JSON string.</p><p>‑ synExt (Object): Speech synthesis extension parameter.<br>- duration (Float): Synthesized audio duration, in seconds. Example: 5.2.<br>- sampleRate (Integer): Synthesized audio sample rate. Default value: 16000. Supported values: [8000,16000,22050,32000,44100].<br> pitch (Integer): -Pitch. Default value: 0 (original voice output). Valid values: [-12, 12].<br>‑ cloneExt (Object): Voice cloning extension parameter.<br>    - timeRanges (Float[][]): Specifies the time ranges for audio cloning. Default value: [[0, 20]]. Example: [[5.2, 10], [45, 59.8]].</p>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>Extended parameters in the format of a JSON string.</p><p>‑ synExt (Object): Speech synthesis extension parameter.<br>- duration (Float): Synthesized audio duration, in seconds. Example: 5.2.<br>- sampleRate (Integer): Synthesized audio sample rate. Default value: 16000. Supported values: [8000,16000,22050,32000,44100].<br> pitch (Integer): -Pitch. Default value: 0 (original voice output). Valid values: [-12, 12].<br>‑ cloneExt (Object): Voice cloning extension parameter.<br>    - timeRanges (Float[][]): Specifies the time ranges for audio cloning. Default value: [[0, 20]]. Example: [[5.2, 10], [45, 59.8]].</p>
     * @param ExtParam <p>Extended parameters in the format of a JSON string.</p><p>‑ synExt (Object): Speech synthesis extension parameter.<br>- duration (Float): Synthesized audio duration, in seconds. Example: 5.2.<br>- sampleRate (Integer): Synthesized audio sample rate. Default value: 16000. Supported values: [8000,16000,22050,32000,44100].<br> pitch (Integer): -Pitch. Default value: 0 (original voice output). Valid values: [-12, 12].<br>‑ cloneExt (Object): Voice cloning extension parameter.<br>    - timeRanges (Float[][]): Specifies the time ranges for audio cloning. Default value: [[0, 20]]. Example: [[5.2, 10], [45, 59.8]].</p>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public SyncDubbingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncDubbingRequest(SyncDubbingRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.TextLang != null) {
            this.TextLang = new String(source.TextLang);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.AudioData != null) {
            this.AudioData = new String(source.AudioData);
        }
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
        }
        if (source.AudioLang != null) {
            this.AudioLang = new String(source.AudioLang);
        }
        if (source.Output != null) {
            this.Output = new SyncDubbingOutputOption(source.Output);
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
        this.setParamSimple(map, prefix + "TextLang", this.TextLang);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "AudioData", this.AudioData);
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamSimple(map, prefix + "AudioLang", this.AudioLang);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

